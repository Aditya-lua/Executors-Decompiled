package p222jj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import p235k2.C7419k;
import p294mj.C8562v;
import p294mj.FriendRequestReceivedNotification;
import sg.C11332l0;
import sg.C11347q0;

/* JADX INFO: renamed from: jj.g */
/* JADX INFO: loaded from: classes2.dex */
public class C7182g extends AbstractC7176b<FriendRequestReceivedNotification> {
    /* JADX INFO: renamed from: A */
    public final PendingIntent m30033A(FriendRequestReceivedNotification c8561u, Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) FriendRequestReceivedNotificationReceiver.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", c8561u.getUserId());
        intent.putExtra("EXTRA_NOTIFICATION_ID", c8561u.getNotificationId());
        return PendingIntent.getBroadcast(context, 0, intent, 301989888);
    }

    /* JADX DEBUG: Method merged with bridge method: u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Intent mo29997u(Intent intent, FriendRequestReceivedNotification c8561u) {
        if (this.f27844a.m34499i() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", c8561u.getUserId());
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Intent mo29998v(Intent intent, FriendRequestReceivedNotification c8561u) {
        return intent;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: k */
    public String mo29987k(int i10) {
        return i10 == 2 ? "friend_request_received" : "friend_request_received_cleared";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: l */
    public Class<?> mo29988l() {
        return FriendRequestReceivedNotificationReceiver.class;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: n */
    public String mo29990n(Context context) {
        if (this.f27844a.m34499i() == 1) {
            String string = context.getResources().getString(C11347q0.f39940T0);
            C8562v<T> c8562v = this.f27844a;
            return String.format(string, m30037y((FriendRequestReceivedNotification) c8562v.m34492b(c8562v.m34499i() - 1)));
        }
        if (this.f27844a.m34499i() == 2) {
            String string2 = context.getResources().getString(C11347q0.f39938S0);
            C8562v<T> c8562v2 = this.f27844a;
            String strM30037y = m30037y((FriendRequestReceivedNotification) c8562v2.m34492b(c8562v2.m34499i() - 1));
            C8562v<T> c8562v3 = this.f27844a;
            return String.format(string2, strM30037y, m30037y((FriendRequestReceivedNotification) c8562v3.m34492b(c8562v3.m34499i() - 2)));
        }
        if (this.f27844a.m34499i() == 3) {
            String string3 = context.getResources().getString(C11347q0.f39934Q0);
            C8562v<T> c8562v4 = this.f27844a;
            String strM30037y2 = m30037y((FriendRequestReceivedNotification) c8562v4.m34492b(c8562v4.m34499i() - 1));
            C8562v<T> c8562v5 = this.f27844a;
            return String.format(string3, strM30037y2, m30037y((FriendRequestReceivedNotification) c8562v5.m34492b(c8562v5.m34499i() - 2)));
        }
        if (this.f27844a.m34499i() <= 3) {
            return null;
        }
        String string4 = context.getResources().getString(C11347q0.f39920J0);
        C8562v<T> c8562v6 = this.f27844a;
        String strM30037y3 = m30037y((FriendRequestReceivedNotification) c8562v6.m34492b(c8562v6.m34499i() - 1));
        C8562v<T> c8562v7 = this.f27844a;
        return String.format(string4, strM30037y3, m30037y((FriendRequestReceivedNotification) c8562v7.m34492b(c8562v7.m34499i() - 2)));
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: o */
    public int mo29991o() {
        return 0;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: q */
    public String mo29993q() {
        return "FriendRequestReceived";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: r */
    public long mo29994r() {
        return ((FriendRequestReceivedNotification) this.f27844a.m34492b(0)).getUserId();
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: w */
    public void mo29999w(Context context, C7419k.f fVar) {
        if (this.f27844a.m34495e()) {
            return;
        }
        if (this.f27844a.m34499i() == 1) {
            m30036x(context, fVar, (FriendRequestReceivedNotification) this.f27844a.m34492b(0));
        }
        ((NotificationManager) context.getSystemService("notification")).notify(0, fVar.m30780c());
    }

    /* JADX INFO: renamed from: x */
    public final C7419k.f m30036x(Context context, C7419k.f fVar, FriendRequestReceivedNotification c8561u) {
        fVar.m30778a(C11332l0.f39741a, context.getString(C11347q0.f39903C0), m30033A(c8561u, context, "friend_request_received_accepted"));
        fVar.m30778a(C11332l0.f39749i, context.getString(C11347q0.f39906D0), m30033A(c8561u, context, "friend_request_received_ignored"));
        return fVar;
    }

    /* JADX INFO: renamed from: y */
    public final String m30037y(FriendRequestReceivedNotification c8561u) {
        return c8561u.getUsername();
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // p294mj.C8562v.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo30012b(FriendRequestReceivedNotification c8561u, FriendRequestReceivedNotification c8561u2) {
        return c8561u.getUserId() == c8561u2.getUserId();
    }
}
