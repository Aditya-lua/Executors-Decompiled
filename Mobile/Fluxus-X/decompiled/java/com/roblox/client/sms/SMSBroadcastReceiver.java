package com.roblox.client.sms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bh.w0;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mw.c;
import ok.q;
import yh.j;

/* JADX INFO: loaded from: classes2.dex */
public class SMSBroadcastReceiver extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f9287a = Pattern.compile("(\\d{6})");

    @Override // bh.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            q.h("SMSBroadcastReceiver", "Status: " + status);
            int iC3 = status.C3();
            if (iC3 != 0) {
                if (iC3 != 15) {
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
            Matcher matcher = this.f9287a.matcher(str);
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
