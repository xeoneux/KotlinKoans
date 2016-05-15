fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val personalInfo = client?.personalInfo
    val email = personalInfo?.email

    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}