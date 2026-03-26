package org.pbc.website_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebsiteApiApplication

fun main(args: Array<String>) {
    runApplication<WebsiteApiApplication>(*args)
}
