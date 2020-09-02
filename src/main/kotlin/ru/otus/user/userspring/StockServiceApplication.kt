package ru.otus.user.userspring

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.concurrent.ThreadLocalRandom

@RestController
class RestController(val person :Person) {

  @GetMapping(path=["/get/{integerParam}"])
  fun get(@PathVariable integerParam: Int): Person {
    person.age = integerParam
    return person
  }

  @GetMapping(value = ["/stocks/{symbol}"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
  fun prises(@PathVariable symbol: String): Flux<StockPrice> =
    Flux.interval(Duration.ofSeconds(1))
        .map { StockPrice(symbol, randomStockPrice(), now()) }

  private fun randomStockPrice(): Double = ThreadLocalRandom.current().nextDouble(100.0)
}

data class StockPrice (val symbol: String,
                       val price: Double,
                       val time: LocalDateTime)
