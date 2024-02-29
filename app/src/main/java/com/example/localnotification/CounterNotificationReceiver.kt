package com.example.localnotification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class CounterNotificationReceiver :BroadcastReceiver() {
    override fun onReceive(context: Context, p1: Intent?) {
        val service = CounterNotificationService(context)
        service.showNotification(++Counter.value)
    }
}