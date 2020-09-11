package sheridan.springframework.jokeapp.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import sheridan.springframework.jokeapp.services.JokeService

@Controller
class JokeController (
        @Autowired
        private val jokeService: JokeService
) {

    @RequestMapping("/")
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())
        return "chucknorris"
    }

}