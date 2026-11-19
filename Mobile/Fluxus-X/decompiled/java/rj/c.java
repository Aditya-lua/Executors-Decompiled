package rj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import bh.l0;
import bh.q0;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b<uj.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f30760c = "key_reply_message";
    public long b;

    public c(long j10) {
        this.b = j10;
    }

    public static CharSequence B(Intent intent) {
        Bundle bundleJ = k2.t.j(intent);
        if (bundleJ != null) {
            return bundleJ.getCharSequence(f30760c);
        }
        return null;
    }

    public final String A() {
        uj.m mVarM = m();
        if (mVarM != null) {
            return y(mVarM);
        }
        return null;
    }

    public final PendingIntent C(uj.m mVar, Context context) {
        if (mVar == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) ChatMessageNotificationReceiver.class);
        intent.setAction("chat_message_replied");
        if (bi.h.a().A2()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", mVar.getConversationGuid());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", mVar.getConversationId());
        }
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", mVar.getConversationTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", mVar.getNotificationId());
        intent.putExtra("EXTRA_MESSAGE_ID", mVar.getMessageId());
        return PendingIntent.getBroadcast(context, (int) mVar.getConversationId(), intent, 301989888);
    }

    @Override // uj.v.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean b(uj.m mVar, uj.m mVar2) {
        return mVar.getMessageId() == mVar2.getMessageId();
    }

    @Override // rj.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, uj.m mVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.b);
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        return intent;
    }

    @Override // rj.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, uj.m mVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.b);
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        return intent;
    }

    @Override // rj.b, rj.j
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void c(Context context, uj.m mVar) {
        this.f30738a.g("FAILURE_NOTIFICATION_ID");
        super.c(context, mVar);
    }

    public final k2.k.f H(Context context, k2.k.f fVar, String str, boolean z10) {
        String str2 = String.format(context.getString(q0.R0), str);
        if (z10) {
            str2 = String.format(context.getString(q0.Q0), str);
        }
        fVar.m(str2);
        fVar.u(null);
        fVar.n(context.getString(q0.P0));
        fVar.E(new k2.k.d().h(str2));
        return fVar;
    }

    @Override // rj.b
    public k2.k.f h(Context context, boolean z10, Bitmap bitmap) {
        k2.k.f fVarH = super.h(context, z10, bitmap);
        uj.m mVarM = m();
        if (mVarM instanceof uj.a) {
            return H(context, fVarH, mVarM.getConversationTitle(), ((uj.a) mVarM).getIsChatMessageModerated());
        }
        fVarH.m(A());
        return x(context, fVarH);
    }

    @Override // rj.b
    public String k(int i10) {
        return i10 == 2 ? "chat_message_received" : "chat_message_cleared";
    }

    @Override // rj.b
    public Class<?> l() {
        return ChatMessageNotificationReceiver.class;
    }

    @Override // rj.b
    public String n(Context context) {
        return z(this.f30738a.c());
    }

    @Override // rj.b
    public int o() {
        return (int) this.b;
    }

    @Override // rj.b
    public String p(Context context) {
        return m().getConversationTitle();
    }

    @Override // rj.b
    public String q() {
        return "ChatNewMessage";
    }

    @Override // rj.b
    public long r() {
        return ((uj.m) this.f30738a.b(0)).getSenderId();
    }

    public final k2.k.f x(Context context, k2.k.f fVar) {
        String string = context.getString(q0.O0);
        fVar.b(new k2.k.a.C0395a(l0.b, string, C(m(), context)).a(new k2.t.d(f30760c).b(string).a()).d(true).b());
        return fVar;
    }

    public final String y(uj.m mVar) {
        if (mVar.getConversationType().equals("OneToOneConversation")) {
            return mVar.getMessageContent();
        }
        return mVar.getSenderName() + ": " + mVar.getMessageContent();
    }

    public final String z(List<uj.m> list) {
        ArrayList arrayList = new ArrayList(list);
        String strY = null;
        if (arrayList.size() > 0) {
            for (int i10 = r5 - 1; i10 >= 0; i10--) {
                uj.m mVar = (uj.m) arrayList.get(i10);
                if (!(mVar instanceof uj.a)) {
                    strY = strY == null ? y(mVar) : y(mVar) + "\n" + strY;
                }
            }
        }
        return strY;
    }
}
