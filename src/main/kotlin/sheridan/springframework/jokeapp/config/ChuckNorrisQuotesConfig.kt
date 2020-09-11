package sheridan.springframework.jokeapp.config

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChuckNorrisQuotesConfig {

    @Bean
    fun chuckNorrisQuotes() = ChuckNorrisQuotes()

}