package hr.ferit.brunozoric.taskie.networking.interactors

import hr.ferit.brunozoric.taskie.model.Task
import hr.ferit.brunozoric.taskie.model.request.AddTaskRequest
import hr.ferit.brunozoric.taskie.model.request.DeleteTaskRequest
import hr.ferit.brunozoric.taskie.model.request.UserDataRequest
import hr.ferit.brunozoric.taskie.model.response.GetTasksResponse
import hr.ferit.brunozoric.taskie.model.response.LoginResponse
import hr.ferit.brunozoric.taskie.model.response.RegisterResponse
import retrofit2.Callback

interface TaskieInteractor {

    fun deleteTask(request: String, deleteCallback: Callback<DeleteTaskRequest>)

    fun getTasks(taskieResponseCallback: Callback<GetTasksResponse>)

    fun register(request: UserDataRequest, registerCallback: Callback<RegisterResponse>)

    fun login(request: UserDataRequest, loginCallback: Callback<LoginResponse>)

    fun save(request: AddTaskRequest, saveCallback: Callback<Task>)


}