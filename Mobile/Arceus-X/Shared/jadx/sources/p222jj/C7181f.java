package p222jj;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestAcceptedNotificationReceiver;
import p294mj.C8562v;
import p294mj.FriendRequestAcceptedNotification;
import sg.C11347q0;

/* JADX INFO: renamed from: jj.f */
/* JADX INFO: loaded from: classes2.dex */
public class C7181f extends AbstractC7176b<FriendRequestAcceptedNotification> {
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: k */
    public String mo29987k(int i10) {
        return i10 == 2 ? "friend_request_accepted" : "friend_request_accepted_cleared";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: l */
    public Class<?> mo29988l() {
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
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: n */
    public String mo29990n(Context context) {
        String strM34482j;
        C8562v<T> c8562v = this.f27844a;
        String strM34482j2 = ((FriendRequestAcceptedNotification) c8562v.m34492b(c8562v.m34499i() - 1)).getUsername();
        if (this.f27844a.m34499i() > 1) {
            C8562v<T> c8562v2 = this.f27844a;
            strM34482j = ((FriendRequestAcceptedNotification) c8562v2.m34492b(c8562v2.m34499i() - 2)).getUsername();
        } else {
            strM34482j = "";
        }
        if (this.f27844a.m34499i() == 1) {
            return String.format(context.getResources().getString(C11347q0.f39930O0), strM34482j2);
        }
        if (this.f27844a.m34499i() == 2) {
            return String.format(context.getResources().getString(C11347q0.f39936R0), strM34482j2, strM34482j);
        }
        if (this.f27844a.m34499i() == 3) {
            return String.format(context.getResources().getString(C11347q0.f39932P0), strM34482j2, strM34482j);
        }
        if (this.f27844a.m34499i() > 3) {
            return String.format(context.getResources().getString(C11347q0.f39918I0), strM34482j2, strM34482j);
        }
        return null;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: o */
    public int mo29991o() {
        return 1;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: q */
    public String mo29993q() {
        return "FriendRequestAccepted";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: r */
    public long mo29994r() {
        return ((FriendRequestAcceptedNotification) this.f27844a.m34492b(0)).getUserId();
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // p294mj.C8562v.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo30012b(FriendRequestAcceptedNotification c8557q, FriendRequestAcceptedNotification c8557q2) {
        return c8557q.getUserId() == c8557q2.getUserId();
    }

    /* JADX DEBUG: Method merged with bridge method: u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent mo29997u(Intent intent, FriendRequestAcceptedNotification c8557q) {
        if (this.f27844a.m34499i() <= 1) {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", c8557q.getUserId());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
            return intent;
        }
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
        intent.putExtra("EXTRA_CATEGORY", "FriendRequestAccepted");
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent mo29998v(Intent intent, FriendRequestAcceptedNotification c8557q) {
        return intent;
    }
}
