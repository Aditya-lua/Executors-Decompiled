package com.roblox.client;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import com.roblox.client.startup.StartedForEnum;

/* JADX INFO: loaded from: classes2.dex */
public class JNIAppRestarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8898a = "JNIAppRestarter";

    @Keep
    public static void restartApp(Context context, String str) {
        Log.d(f8898a, "restartApp(" + str + ")");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.APP_RESTART);
        intent.setFlags(268468224);
        context.startActivity(intent);
        Runtime.getRuntime().exit(0);
    }
}
