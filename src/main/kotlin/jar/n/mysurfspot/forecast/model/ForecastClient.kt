package jar.n.mysurfspot.forecast.model

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient("forecastClient", url = "\${forecast.api.url}")
interface ForecastClient {

    @GetMapping("/forecast/?spot_id={spotId}")
    fun forecast(@PathVariable spotId: Int): List<Forecast>
}