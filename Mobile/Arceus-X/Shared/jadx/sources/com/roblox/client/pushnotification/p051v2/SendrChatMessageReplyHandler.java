package com.roblox.client.pushnotification.p051v2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.p051v2.SendrChatMessageReplyHandler;
import p151gk.C6124q;
import p222jj.C7178c;
import p222jj.C7184i;
import p309nj.AbstractC9489h;
import p333oi.C9740f;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class SendrChatMessageReplyHandler extends AbstractC9489h {
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15451k(Context context, String str, String str2, String str3, String str4, boolean z10) {
        new C7184i().m30044f(context, "ChatNewMessage_" + str, str2, str3, z10);
        C6124q.m27060e("rbx.push", "Failed to send Chat Message");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m15452l(Context context, long j10, long j11, String str, String str2, boolean z10) {
        new C7184i().m30043e(context, "ChatNewMessage_" + j10, j11, str, z10);
        C6124q.m27060e("rbx.push", "Failed to send Chat Message");
    }

    @Override // p309nj.AbstractC9489h
    /* JADX INFO: renamed from: j */
    public Intent mo15453j(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", intent2.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final void m15454m(long j10, String str) {
        C6124q.m27064i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + j10 + " ,messageId: " + str);
        C9740f.m38537c(j10, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m15455n(String str, String str2) {
        C6124q.m27064i("rbx.push", "In markChatNotificationAsRead(), conversationGuid: " + str + " ,messageId: " + str2);
        C9740f.m38537c(-1L, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public final void m15456o(final long j10, String str, final Context context, final long j11, final String str2) {
        C9740f.m38538d(j10, null, str, new C9740f.a() { // from class: oj.k
            @Override // p333oi.C9740f.a
            /* JADX INFO: renamed from: a */
            public final void mo38539a(String str3, boolean z10) {
                SendrChatMessageReplyHandler.m15452l(context, j11, j10, str2, str3, z10);
            }
        });
    }

    @Override // p309nj.AbstractC9489h, sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        super.onReceive(context, intent);
        if (intent == null || !"chat_message_replied".equals(intent.getAction())) {
            return;
        }
        C6124q.m27064i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        long longExtra = -1;
        if (C11659h.m43403a().mo43718s2()) {
            stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        } else {
            longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
            stringExtra = "";
        }
        String str = stringExtra;
        String stringExtra3 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        String stringExtra4 = intent.getStringExtra("tag");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(stringExtra4, stringExtra2.hashCode());
        }
        CharSequence charSequenceM30004B = C7178c.m30004B(intent);
        if (charSequenceM30004B != null) {
            if (C11659h.m43403a().mo43718s2()) {
                m15457p(str, charSequenceM30004B.toString(), context, str, stringExtra3);
                m15455n(str, stringExtra2);
            } else {
                long j10 = longExtra;
                m15456o(j10, charSequenceM30004B.toString(), context, longExtra, stringExtra3);
                m15454m(j10, stringExtra2);
            }
            m37374b("chat message replied", context, intent, true, "ChatNewMessage");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15457p(final String str, String str2, final Context context, final String str3, final String str4) {
        C9740f.m38538d(-1L, str, str2, new C9740f.a() { // from class: oj.j
            @Override // p333oi.C9740f.a
            /* JADX INFO: renamed from: a */
            public final void mo38539a(String str5, boolean z10) {
                SendrChatMessageReplyHandler.m15451k(context, str3, str, str4, str5, z10);
            }
        });
    }
}
