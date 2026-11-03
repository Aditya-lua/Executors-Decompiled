package com.roblox.client.sms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import dv.c;
import ek.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oh.j;
import rg.w0;

/* JADX INFO: loaded from: classes2.dex */
public class SMSBroadcastReceiver extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f9470a = Pattern.compile("(\\d{6})");

    @Override // rg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            q.h("SMSBroadcastReceiver", "Status: " + status);
            int iX3 = status.x3();
            if (iX3 != 0) {
                if (iX3 != 15) {
                    return;
                }
                q.h("SMSBroadcastReceiver", "Timeout");
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            q.h("SMSBroadcastReceiver", "Message: " + str);
            if (TextUtils.isEmpty(str)) {
                q.h("SMSBroadcastReceiver", "Wrong format. Message: " + str);
                return;
            }
            Matcher matcher = this.f9470a.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(0);
                if (TextUtils.isEmpty(strGroup) || strGroup.length() != 6) {
                    return;
                }
                q.h("SMSBroadcastReceiver", "code: " + strGroup);
                c.d().j(new j(strGroup));
            }
        }
    }
}
