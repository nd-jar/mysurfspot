package jar.n.mysurfspot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.PropertySource
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@EnableFeignClients
@SpringBootApplication
@PropertySource("file:src/main/resources/application.properties")
class MysurfspotApplication

fun main(args: Array<String>) {
    runApplication<MysurfspotApplication>(*args)
}
