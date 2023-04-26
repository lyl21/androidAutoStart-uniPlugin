package com.mibu.autostart

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log


/**
@author: lyl
@datetime: 2022-06-23  8:42
@params:
@description:  开机广播处理
 */
class DeviceOnOrOffReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {

        when(intent.action){
            Intent.ACTION_BOOT_COMPLETED->{
                val toIntent = context.packageManager.getLaunchIntentForPackage(context.packageName)
                context.startActivity(toIntent)
            }
            Intent.ACTION_SHUTDOWN->{
                Log.e("lll","监听到关机事件")
            }
        }
    }



}