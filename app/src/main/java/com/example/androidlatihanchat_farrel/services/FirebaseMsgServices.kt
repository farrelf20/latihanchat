package com.example.androidlatihanchat_farrel.services

class FirebaseMsgServices : FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d(LOG_TAG, "FCM Message Id: " + p0!!.getMessageId()!!)
        Log.d(LOG_TAG, "FCM Notification Message: " + p0!!.getNotification()!!)
        Log.d(LOG_TAG, "FCM Data Message: " + p0!!.getData())
    }
}