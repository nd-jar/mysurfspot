package jar.n.mysurfspot.bot.handler

import jar.n.mysurfspot.forecast.model.ForecastClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class MessageHandlerImpl(
        private val forecastClient: ForecastClient
) : MessageHandler {
    private val log = LoggerFactory.getLogger(javaClass)
    override fun handle(message: String?): String {
        when (message) {
            Message.START.value -> return getStartMessage()
            Message.FORECAST.value -> return getForecastMessage()
        }
        return getDefaultMessage()
    }

    private fun getDefaultMessage(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun getForecastMessage(): String {
        val campId = 922
        val campName = "Mirissa"
        val forecast = forecastClient.forecast(campId);

        log.debug("Received forecast from api: ", forecast);
        val absMinBreakingHeight = forecast[0].swell.absMinBreakingHeight;
        val absMaxBreakingHeight = forecast[0].swell.absMaxBreakingHeight;


        return "Waves: $absMinBreakingHeight-$absMaxBreakingHeight! Good time for surf in $campName"
    }

    private fun getStartMessage(): String {
        return "hi"
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}