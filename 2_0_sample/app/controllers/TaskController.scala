package controllers

import play.api._
import play.api.mvc._
import play.api.data._

import views._

import models._


object TaskController extends Controller {
  
  val taskForm = Form(
      "label" -> requiredText
  )
    
  def index = Action {
//    Ok("Hello world")
    Ok(views.html.tasks_index(Task.all(), taskForm))
  }
 
  def tasks = TODO
  
  def newTask = Action { implicit request =>
    taskForm.bindFromRequest.fold(
        errors => BadRequest(views.html.tasks_index(Task.all(), errors)),
        label => { 
          Task.create(label)
          Redirect(routes.TaskController.tasks)
        }
      )
  }
  
  def deleteTask(id: Long) = TODO

}