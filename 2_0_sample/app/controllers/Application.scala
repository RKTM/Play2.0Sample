package controllers

import play.api._
import play.api.mvc._
import play.api.data._

import views._


object Application extends Controller {
  
   /**
   * Describes the hello form.
   */
//  val helloForm = Form(
//    of(
//      "name" -> requiredText,
//      "repeat" -> number(min = 1, max = 100),
//      "color" -> optional(text)
//    )
//  )
  
   /**
   * Home page
   */
//  def index = Action {
//    Ok(html.input(helloForm))
//  }
  
//  def index = Action {
//    Ok(views.html.index("Your new application is ready!"))
//  }

  /**
   * Handles the form submission.
   */
//  def sayHello = Action { implicit request =>
//    helloForm.bindFromRequest.fold(
//      formWithErrors => BadRequest(html.input(formWithErrors)),
//      {case (name, repeat, color) => Ok(html.hello(name, repeat.toInt, color))}
//    )
//  }
 
}