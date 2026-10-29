package jj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import mj.FriendRequestReceivedNotification;
import sg.l0;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class g extends b<FriendRequestReceivedNotification> {
    public final PendingIntent A(FriendRequestReceivedNotification uVar, Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) FriendRequestReceivedNotificationReceiver.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", uVar.getUserId());
        intent.putExtra("EXTRA_NOTIFICATION_ID", uVar.getNotificationId());
        return PendingIntent.getBroadcast(context, 0, intent, 301989888);
    }

    @Override // jj.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, FriendRequestReceivedNotification uVar) {
        if (this.f21479a.i() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", uVar.getUserId());
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        return intent;
    }

    @Override // jj.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, FriendRequestReceivedNotification uVar) {
        return intent;
    }

    @Override // jj.b
    public String k(int i10) {
        return i10 == 2 ? "friend_request_received" : "friend_request_received_cleared";
    }

    @Override // jj.b
    public Class<?> l() {
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
    @Override // jj.b
    public String n(Context context) {
        if (this.f21479a.i() == 1) {
            String string = context.getResources().getString(q0.T0);
            mj.v<T> vVar = this.f21479a;
            return String.format(string, y((FriendRequestReceivedNotification) vVar.b(vVar.i() - 1)));
        }
        if (this.f21479a.i() == 2) {
            String string2 = context.getResources().getString(q0.S0);
            mj.v<T> vVar2 = this.f21479a;
            String strY = y((FriendRequestReceivedNotification) vVar2.b(vVar2.i() - 1));
            mj.v<T> vVar3 = this.f21479a;
            return String.format(string2, strY, y((FriendRequestReceivedNotification) vVar3.b(vVar3.i() - 2)));
        }
        if (this.f21479a.i() == 3) {
            String string3 = context.getResources().getString(q0.Q0);
            mj.v<T> vVar4 = this.f21479a;
            String strY2 = y((FriendRequestReceivedNotification) vVar4.b(vVar4.i() - 1));
            mj.v<T> vVar5 = this.f21479a;
            return String.format(string3, strY2, y((FriendRequestReceivedNotification) vVar5.b(vVar5.i() - 2)));
        }
        if (this.f21479a.i() <= 3) {
            return null;
        }
        String string4 = context.getResources().getString(q0.J0);
        mj.v<T> vVar6 = this.f21479a;
        String strY3 = y((FriendRequestReceivedNotification) vVar6.b(vVar6.i() - 1));
        mj.v<T> vVar7 = this.f21479a;
        return String.format(string4, strY3, y((FriendRequestReceivedNotification) vVar7.b(vVar7.i() - 2)));
    }

    @Override // jj.b
    public int o() {
        return 0;
    }

    @Override // jj.b
    public String q() {
        return "FriendRequestReceived";
    }

    @Override // jj.b
    public long r() {
        return ((FriendRequestReceivedNotification) this.f21479a.b(0)).getUserId();
    }

    @Override // jj.b
    public void w(Context context, k2.k.f fVar) {
        if (this.f21479a.e()) {
            return;
        }
        if (this.f21479a.i() == 1) {
            x(context, fVar, (FriendRequestReceivedNotification) this.f21479a.b(0));
        }
        ((NotificationManager) context.getSystemService("notification")).notify(0, fVar.c());
    }

    public final k2.k.f x(Context context, k2.k.f fVar, FriendRequestReceivedNotification uVar) {
        fVar.a(l0.f30798a, context.getString(q0.C0), A(uVar, context, "friend_request_received_accepted"));
        fVar.a(l0.f30805i, context.getString(q0.D0), A(uVar, context, "friend_request_received_ignored"));
        return fVar;
    }

    public final String y(FriendRequestReceivedNotification uVar) {
        return uVar.getUsername();
    }

    @Override // mj.v.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean b(FriendRequestReceivedNotification uVar, FriendRequestReceivedNotification uVar2) {
        return uVar.getUserId() == uVar2.getUserId();
    }
}
