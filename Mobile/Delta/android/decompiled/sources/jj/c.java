package jj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import java.util.ArrayList;
import java.util.List;
import sg.l0;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b<mj.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f21501c = "key_reply_message";
    public long b;

    public c(long j10) {
        this.b = j10;
    }

    public static CharSequence B(Intent intent) {
        Bundle bundleJ = k2.t.j(intent);
        if (bundleJ != null) {
            return bundleJ.getCharSequence(f21501c);
        }
        return null;
    }

    public final String A() {
        mj.m mVarM = m();
        if (mVarM != null) {
            return y(mVarM);
        }
        return null;
    }

    public final PendingIntent C(mj.m mVar, Context context) {
        if (mVar == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) ChatMessageNotificationReceiver.class);
        intent.setAction("chat_message_replied");
        if (th.h.a().n2()) {
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

    @Override // mj.v.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean b(mj.m mVar, mj.m mVar2) {
        return mVar.getMessageId() == mVar2.getMessageId();
    }

    @Override // jj.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, mj.m mVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.b);
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        return intent;
    }

    @Override // jj.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, mj.m mVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.b);
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        return intent;
    }

    @Override // jj.b, jj.j
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void d(Context context, mj.m mVar) {
        this.f21479a.g("FAILURE_NOTIFICATION_ID");
        super.d(context, mVar);
    }

    public final k2.k.f H(Context context, k2.k.f fVar, String str, boolean z10) {
        String str2 = String.format(context.getString(q0.H0), str);
        if (z10) {
            str2 = String.format(context.getString(q0.G0), str);
        }
        fVar.k(str2);
        fVar.s(null);
        fVar.l(context.getString(q0.F0));
        fVar.B(new k2.k.d().h(str2));
        return fVar;
    }

    @Override // jj.b
    public k2.k.f h(Context context, boolean z10, Bitmap bitmap) {
        k2.k.f fVarH = super.h(context, z10, bitmap);
        mj.m mVarM = m();
        if (mVarM instanceof mj.a) {
            return H(context, fVarH, mVarM.getConversationTitle(), ((mj.a) mVarM).getIsChatMessageModerated());
        }
        fVarH.k(A());
        return x(context, fVarH);
    }

    @Override // jj.b
    public String k(int i10) {
        return i10 == 2 ? "chat_message_received" : "chat_message_cleared";
    }

    @Override // jj.b
    public Class<?> l() {
        return ChatMessageNotificationReceiver.class;
    }

    @Override // jj.b
    public String n(Context context) {
        return z(this.f21479a.c());
    }

    @Override // jj.b
    public int o() {
        return (int) this.b;
    }

    @Override // jj.b
    public String p(Context context) {
        return m().getConversationTitle();
    }

    @Override // jj.b
    public String q() {
        return "ChatNewMessage";
    }

    @Override // jj.b
    public long r() {
        return ((mj.m) this.f21479a.b(0)).getSenderId();
    }

    public final k2.k.f x(Context context, k2.k.f fVar) {
        String string = context.getString(q0.E0);
        fVar.b(new k2.k.a.C0390a(l0.b, string, C(m(), context)).a(new k2.t.d(f21501c).b(string).a()).d(true).b());
        return fVar;
    }

    public final String y(mj.m mVar) {
        if (mVar.getConversationType().equals("OneToOneConversation")) {
            return mVar.getMessageContent();
        }
        return mVar.getSenderName() + ": " + mVar.getMessageContent();
    }

    public final String z(List<mj.m> list) {
        ArrayList arrayList = new ArrayList(list);
        String strY = null;
        if (arrayList.size() > 0) {
            for (int i10 = r5 - 1; i10 >= 0; i10--) {
                mj.m mVar = (mj.m) arrayList.get(i10);
                if (!(mVar instanceof mj.a)) {
                    strY = strY == null ? y(mVar) : y(mVar) + "\n" + strY;
                }
            }
        }
        return strY;
    }
}
