package com.roblox.client.sms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p138fv.C5840c;
import p151gk.C6124q;
import ph.C10261j;
import sg.C11365w0;

/* JADX INFO: loaded from: classes2.dex */
public class SMSBroadcastReceiver extends C11365w0 {

    /* JADX INFO: renamed from: a */
    public final Pattern f12245a = Pattern.compile("(\\d{6})");

    @Override // sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            C6124q.m27063h("SMSBroadcastReceiver", "Status: " + status);
            int iM9166x3 = status.m9166x3();
            if (iM9166x3 != 0) {
                if (iM9166x3 != 15) {
                    return;
                }
                C6124q.m27063h("SMSBroadcastReceiver", "Timeout");
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            C6124q.m27063h("SMSBroadcastReceiver", "Message: " + str);
            if (TextUtils.isEmpty(str)) {
                C6124q.m27063h("SMSBroadcastReceiver", "Wrong format. Message: " + str);
                return;
            }
            Matcher matcher = this.f12245a.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(0);
                if (TextUtils.isEmpty(strGroup) || strGroup.length() != 6) {
                    return;
                }
                C6124q.m27063h("SMSBroadcastReceiver", "code: " + strGroup);
                C5840c.m26204d().m26211j(new C10261j(strGroup));
            }
        }
    }
}
