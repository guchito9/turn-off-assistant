package com.guche.turnoffassistant

import android.content.Context
import android.service.voice.VoiceInteractionSession
import java.io.IOException

class MyAssistantSession internal constructor(context: Context) : VoiceInteractionSession(context) {

    override fun onHandleAssist(state: AssistState) {
        super.onHandleAssist(state)
        try {
            Runtime.getRuntime().exec("su -c input keyevent 26")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}