package rj;

import android.content.Context;
import android.content.Intent;
import bh.q0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestAcceptedNotificationReceiver;
import uj.FriendRequestAcceptedNotification;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b<FriendRequestAcceptedNotification> {
    @Override // rj.b
    public String k(int i10) {
        return i10 == 2 ? "friend_request_accepted" : "friend_request_accepted_cleared";
    }

    @Override // rj.b
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
    @Override // rj.b
    public String n(Context context) {
        String strJ;
        uj.v<T> vVar = this.f30738a;
        String strJ2 = ((FriendRequestAcceptedNotification) vVar.b(vVar.i() - 1)).getUsername();
        if (this.f30738a.i() > 1) {
            uj.v<T> vVar2 = this.f30738a;
            strJ = ((FriendRequestAcceptedNotification) vVar2.b(vVar2.i() - 2)).getUsername();
        } else {
            strJ = BuildConfig.FLAVOR;
        }
        if (this.f30738a.i() == 1) {
            return String.format(context.getResources().getString(q0.Y0), strJ2);
        }
        if (this.f30738a.i() == 2) {
            return String.format(context.getResources().getString(q0.f4224b1), strJ2, strJ);
        }
        if (this.f30738a.i() == 3) {
            return String.format(context.getResources().getString(q0.Z0), strJ2, strJ);
        }
        if (this.f30738a.i() > 3) {
            return String.format(context.getResources().getString(q0.S0), strJ2, strJ);
        }
        return null;
    }

    @Override // rj.b
    public int o() {
        return 1;
    }

    @Override // rj.b
    public String q() {
        return "FriendRequestAccepted";
    }

    @Override // rj.b
    public long r() {
        return ((FriendRequestAcceptedNotification) this.f30738a.b(0)).getUserId();
    }

    @Override // uj.v.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean b(FriendRequestAcceptedNotification qVar, FriendRequestAcceptedNotification qVar2) {
        return qVar.getUserId() == qVar2.getUserId();
    }

    @Override // rj.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, FriendRequestAcceptedNotification qVar) {
        if (this.f30738a.i() <= 1) {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", qVar.getUserId());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
        intent.putExtra("EXTRA_CATEGORY", "FriendRequestAccepted");
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        return intent;
    }

    @Override // rj.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, FriendRequestAcceptedNotification qVar) {
        return intent;
    }
}
