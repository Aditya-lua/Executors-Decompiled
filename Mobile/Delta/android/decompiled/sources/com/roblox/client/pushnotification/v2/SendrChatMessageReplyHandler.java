package com.roblox.client.pushnotification.v2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.v2.SendrChatMessageReplyHandler;
import gk.p;
import jj.c;
import jj.i;
import nj.h;
import oi.f;

/* JADX INFO: loaded from: classes2.dex */
public class SendrChatMessageReplyHandler extends h {
    public static /* synthetic */ void k(Context context, String str, String str2, String str3, String str4, boolean z10) {
        new i().f(context, "ChatNewMessage_" + str, str2, str3, z10);
        p.e("rbx.push", "Failed to send Chat Message");
    }

    public static /* synthetic */ void l(Context context, long j10, long j11, String str, String str2, boolean z10) {
        new i().e(context, "ChatNewMessage_" + j10, j11, str, z10);
        p.e("rbx.push", "Failed to send Chat Message");
    }

    @Override // nj.h
    public Intent j(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", intent2.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Deprecated
    public final void m(long j10, String str) {
        p.i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + j10 + " ,messageId: " + str);
        f.c(j10, null);
    }

    public final void n(String str, String str2) {
        p.i("rbx.push", "In markChatNotificationAsRead(), conversationGuid: " + str + " ,messageId: " + str2);
        f.c(-1L, str);
    }

    @Deprecated
    public final void o(final long j10, String str, final Context context, final long j11, final String str2) {
        f.d(j10, null, str, new f.a() { // from class: oj.k
            @Override // oi.f.a
            public final void a(String str3, boolean z10) {
                SendrChatMessageReplyHandler.l(context, j11, j10, str2, str3, z10);
            }
        });
    }

    @Override // nj.h, sg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        super.onReceive(context, intent);
        if (intent == null || !"chat_message_replied".equals(intent.getAction())) {
            return;
        }
        p.i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        long longExtra = -1;
        if (th.h.a().n2()) {
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
        CharSequence charSequenceB = c.B(intent);
        if (charSequenceB != null) {
            if (th.h.a().n2()) {
                p(str, charSequenceB.toString(), context, str, stringExtra3);
                n(str, stringExtra2);
            } else {
                long j10 = longExtra;
                o(j10, charSequenceB.toString(), context, longExtra, stringExtra3);
                m(j10, stringExtra2);
            }
            b("chat message replied", context, intent, true, "ChatNewMessage");
        }
    }

    public final void p(final String str, String str2, final Context context, final String str3, final String str4) {
        f.d(-1L, str, str2, new f.a() { // from class: oj.j
            @Override // oi.f.a
            public final void a(String str5, boolean z10) {
                SendrChatMessageReplyHandler.k(context, str3, str, str4, str5, z10);
            }
        });
    }
}
