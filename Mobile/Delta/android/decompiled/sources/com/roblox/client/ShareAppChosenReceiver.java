package com.roblox.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import sg.w0;

/* JADX INFO: loaded from: classes2.dex */
public class ShareAppChosenReceiver extends w0 {
    @Override // sg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("android.intent.extra.CHOSEN_COMPONENT");
            if (obj instanceof ComponentName) {
                zj.a.b(((ComponentName) obj).getPackageName());
            }
        }
    }
}
