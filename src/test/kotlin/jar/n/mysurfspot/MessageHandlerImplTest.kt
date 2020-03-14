package jar.n.mysurfspot

import jar.n.mysurfspot.bot.handler.MessageHandler
import jar.n.mysurfspot.bot.handler.MessageHandlerImpl
import jar.n.mysurfspot.forecast.model.ForecastClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.test.context.TestPropertySource

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("file:src/main/resources/application.properties")
class MessageHandlerImplTest(@Autowired
                             private val handler: MessageHandler) {

    @Test
    fun contextLoads() {
    }

    @Test
    fun handleStart() {
        val response = handler.handle("/start")
        assertThat(response).isEqualTo("hi")
    }

    @Test
    fun handleForecast() {
        val response = handler.handle("/forecast")
        assertThat(response).isNotNull()
    }

    @Configuration
    @EnableAutoConfiguration
    @EnableFeignClients
    @ComponentScan(basePackageClasses = [ForecastClient::class, MessageHandlerImpl::class])
    class TestConfig {}
}


