package jj;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestAcceptedNotificationReceiver;
import mj.FriendRequestAcceptedNotification;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b<FriendRequestAcceptedNotification> {
    @Override // jj.b
    public String k(int i10) {
        return i10 == 2 ? "friend_request_accepted" : "friend_request_accepted_cleared";
    }

    @Override // jj.b
    public Class<?> l() {
        return FriendRequestAcceptedNotificationReceiver.class;
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
        String strJ;
        mj.v<T> vVar = this.f21479a;
        String strJ2 = ((FriendRequestAcceptedNotification) vVar.b(vVar.i() - 1)).getUsername();
        if (this.f21479a.i() > 1) {
            mj.v<T> vVar2 = this.f21479a;
            strJ = ((FriendRequestAcceptedNotification) vVar2.b(vVar2.i() - 2)).getUsername();
        } else {
            strJ = "";
        }
        if (this.f21479a.i() == 1) {
            return String.format(context.getResources().getString(q0.O0), strJ2);
        }
        if (this.f21479a.i() == 2) {
            return String.format(context.getResources().getString(q0.R0), strJ2, strJ);
        }
        if (this.f21479a.i() == 3) {
            return String.format(context.getResources().getString(q0.P0), strJ2, strJ);
        }
        if (this.f21479a.i() > 3) {
            return String.format(context.getResources().getString(q0.I0), strJ2, strJ);
        }
        return null;
    }

    @Override // jj.b
    public int o() {
        return 1;
    }

    @Override // jj.b
    public String q() {
        return "FriendRequestAccepted";
    }

    @Override // jj.b
    public long r() {
        return ((FriendRequestAcceptedNotification) this.f21479a.b(0)).getUserId();
    }

    @Override // mj.v.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean b(FriendRequestAcceptedNotification qVar, FriendRequestAcceptedNotification qVar2) {
        return qVar.getUserId() == qVar2.getUserId();
    }

    @Override // jj.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, FriendRequestAcceptedNotification qVar) {
        if (this.f21479a.i() <= 1) {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", qVar.getUserId());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
        intent.putExtra("EXTRA_CATEGORY", "FriendRequestAccepted");
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        return intent;
    }

    @Override // jj.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, FriendRequestAcceptedNotification qVar) {
        return intent;
    }
}
