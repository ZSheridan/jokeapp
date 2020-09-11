package sheridan.springframework.jokeapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl(
        @Autowired
        private val chuckNorrisQuotes: ChuckNorrisQuotes
) : JokeService {

    override fun getJoke(): String = chuckNorrisQuotes.randomQuote

}