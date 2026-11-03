package hj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import java.util.ArrayList;
import java.util.List;
import rg.l0;
import rg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b<kj.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f19509c = "key_reply_message";
    public long b;

    public c(long j10) {
        this.b = j10;
    }

    public static CharSequence B(Intent intent) {
        Bundle bundleJ = k2.t.j(intent);
        if (bundleJ != null) {
            return bundleJ.getCharSequence(f19509c);
        }
        return null;
    }

    public final String A() {
        kj.m mVarM = m();
        if (mVarM != null) {
            return y(mVarM);
        }
        return null;
    }

    public final PendingIntent C(kj.m mVar, Context context) {
        if (mVar == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) ChatMessageNotificationReceiver.class);
        intent.setAction("chat_message_replied");
        if (rh.h.a().y2()) {
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

    @Override // kj.v.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean b(kj.m mVar, kj.m mVar2) {
        return mVar.getMessageId() == mVar2.getMessageId();
    }

    @Override // hj.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, kj.m mVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.b);
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        return intent;
    }

    @Override // hj.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, kj.m mVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.b);
        intent.putExtra("EXTRA_CATEGORY", mVar.getCategory());
        return intent;
    }

    @Override // hj.b, hj.j
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void c(Context context, kj.m mVar) {
        this.f19487a.g("FAILURE_NOTIFICATION_ID");
        super.c(context, mVar);
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

    @Override // hj.b
    public k2.k.f h(Context context, boolean z10, Bitmap bitmap) {
        k2.k.f fVarH = super.h(context, z10, bitmap);
        kj.m mVarM = m();
        if (mVarM instanceof kj.a) {
            return H(context, fVarH, mVarM.getConversationTitle(), ((kj.a) mVarM).getIsChatMessageModerated());
        }
        fVarH.k(A());
        return x(context, fVarH);
    }

    @Override // hj.b
    public String k(int i10) {
        return i10 == 2 ? "chat_message_received" : "chat_message_cleared";
    }

    @Override // hj.b
    public Class<?> l() {
        return ChatMessageNotificationReceiver.class;
    }

    @Override // hj.b
    public String n(Context context) {
        return z(this.f19487a.c());
    }

    @Override // hj.b
    public int o() {
        return (int) this.b;
    }

    @Override // hj.b
    public String p(Context context) {
        return m().getConversationTitle();
    }

    @Override // hj.b
    public String q() {
        return "ChatNewMessage";
    }

    @Override // hj.b
    public long r() {
        return ((kj.m) this.f19487a.b(0)).getSenderId();
    }

    public final k2.k.f x(Context context, k2.k.f fVar) {
        String string = context.getString(q0.E0);
        fVar.b(new k2.k.a.C0389a(l0.b, string, C(m(), context)).a(new k2.t.d(f19509c).b(string).a()).d(true).b());
        return fVar;
    }

    public final String y(kj.m mVar) {
        if (mVar.getConversationType().equals("OneToOneConversation")) {
            return mVar.getMessageContent();
        }
        return mVar.getSenderName() + ": " + mVar.getMessageContent();
    }

    public final String z(List<kj.m> list) {
        ArrayList arrayList = new ArrayList(list);
        String strY = null;
        if (arrayList.size() > 0) {
            for (int i10 = r5 - 1; i10 >= 0; i10--) {
                kj.m mVar = (kj.m) arrayList.get(i10);
                if (!(mVar instanceof kj.a)) {
                    strY = strY == null ? y(mVar) : y(mVar) + "\n" + strY;
                }
            }
        }
        return strY;
    }
}
