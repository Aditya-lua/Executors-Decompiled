package p222jj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import java.util.ArrayList;
import java.util.List;
import p235k2.C7419k;
import p235k2.C7428t;
import p294mj.C8530a;
import p294mj.C8553m;
import sg.C11332l0;
import sg.C11347q0;
import th.C11659h;

/* JADX INFO: renamed from: jj.c */
/* JADX INFO: loaded from: classes2.dex */
public class C7178c extends AbstractC7176b<C8553m> {

    /* JADX INFO: renamed from: c */
    public static String f27868c = "key_reply_message";

    /* JADX INFO: renamed from: b */
    public long f27869b;

    public C7178c(long j10) {
        this.f27869b = j10;
    }

    /* JADX INFO: renamed from: B */
    public static CharSequence m30004B(Intent intent) {
        Bundle bundleM30934j = C7428t.m30934j(intent);
        if (bundleM30934j != null) {
            return bundleM30934j.getCharSequence(f27868c);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final String m30005A() {
        C8553m c8553mM29989m = m29989m();
        if (c8553mM29989m != null) {
            return m30014y(c8553mM29989m);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final PendingIntent m30006C(C8553m c8553m, Context context) {
        if (c8553m == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) ChatMessageNotificationReceiver.class);
        intent.setAction("chat_message_replied");
        if (C11659h.m43403a().mo43718s2()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", c8553m.getConversationGuid());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", c8553m.getConversationId());
        }
        intent.putExtra("EXTRA_CATEGORY", c8553m.getCategory());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", c8553m.getConversationTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", c8553m.getNotificationId());
        intent.putExtra("EXTRA_MESSAGE_ID", c8553m.getMessageId());
        return PendingIntent.getBroadcast(context, (int) c8553m.getConversationId(), intent, 301989888);
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // p294mj.C8562v.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean mo30012b(C8553m c8553m, C8553m c8553m2) {
        return c8553m.getMessageId() == c8553m2.getMessageId();
    }

    /* JADX DEBUG: Method merged with bridge method: u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Intent mo29997u(Intent intent, C8553m c8553m) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.f27869b);
        intent.putExtra("EXTRA_CATEGORY", c8553m.getCategory());
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Intent mo29998v(Intent intent, C8553m c8553m) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.f27869b);
        intent.putExtra("EXTRA_CATEGORY", c8553m.getCategory());
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: d(Landroid/content/Context;Lmj/j0;)V */
    @Override // p222jj.AbstractC7176b, p222jj.InterfaceC7185j
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29981d(Context context, C8553m c8553m) {
        this.f27844a.m34497g("FAILURE_NOTIFICATION_ID");
        super.mo29981d(context, c8553m);
    }

    /* JADX INFO: renamed from: H */
    public final C7419k.f m30011H(Context context, C7419k.f fVar, String str, boolean z10) {
        String str2 = String.format(context.getString(C11347q0.f39916H0), str);
        if (z10) {
            str2 = String.format(context.getString(C11347q0.f39914G0), str);
        }
        fVar.m30787k(str2);
        fVar.m30795s(null);
        fVar.m30788l(context.getString(C11347q0.f39912F0));
        fVar.m30772B(new C7419k.d().m30768h(str2));
        return fVar;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: h */
    public C7419k.f mo29984h(Context context, boolean z10, Bitmap bitmap) {
        C7419k.f fVarMo29984h = super.mo29984h(context, z10, bitmap);
        C8553m c8553mM29989m = m29989m();
        if (c8553mM29989m instanceof C8530a) {
            return m30011H(context, fVarMo29984h, c8553mM29989m.getConversationTitle(), ((C8530a) c8553mM29989m).getIsChatMessageModerated());
        }
        fVarMo29984h.m30787k(m30005A());
        return m30013x(context, fVarMo29984h);
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: k */
    public String mo29987k(int i10) {
        return i10 == 2 ? "chat_message_received" : "chat_message_cleared";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: l */
    public Class<?> mo29988l() {
        return ChatMessageNotificationReceiver.class;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: n */
    public String mo29990n(Context context) {
        return m30015z(this.f27844a.m34493c());
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: o */
    public int mo29991o() {
        return (int) this.f27869b;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: p */
    public String mo29992p(Context context) {
        return m29989m().getConversationTitle();
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: q */
    public String mo29993q() {
        return "ChatNewMessage";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: r */
    public long mo29994r() {
        return ((C8553m) this.f27844a.m34492b(0)).getSenderId();
    }

    /* JADX INFO: renamed from: x */
    public final C7419k.f m30013x(Context context, C7419k.f fVar) {
        String string = context.getString(C11347q0.f39909E0);
        fVar.m30779b(new C7419k.a.C14195a(C11332l0.f39742b, string, m30006C(m29989m(), context)).m30752a(new C7428t.d(f27868c).m30948b(string).m30947a()).m30755d(true).m30753b());
        return fVar;
    }

    /* JADX INFO: renamed from: y */
    public final String m30014y(C8553m c8553m) {
        if (c8553m.getConversationType().equals("OneToOneConversation")) {
            return c8553m.getMessageContent();
        }
        return c8553m.getSenderName() + ": " + c8553m.getMessageContent();
    }

    /* JADX INFO: renamed from: z */
    public final String m30015z(List<C8553m> list) {
        ArrayList arrayList = new ArrayList(list);
        String strM30014y = null;
        if (arrayList.size() > 0) {
            for (int i10 = r5 - 1; i10 >= 0; i10--) {
                C8553m c8553m = (C8553m) arrayList.get(i10);
                if (!(c8553m instanceof C8530a)) {
                    strM30014y = strM30014y == null ? m30014y(c8553m) : m30014y(c8553m) + "\n" + strM30014y;
                }
            }
        }
        return strM30014y;
    }
}
