package jar.n.mysurfspot.bot.handler


interface MessageHandler {
    fun handle(message: String?): String;
}