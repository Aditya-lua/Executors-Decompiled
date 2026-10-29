package p222jj;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.PrivateMessageReceivedNotificationReceiver;
import p294mj.C8562v;
import p294mj.PrivateMessageNotification;
import sg.C11347q0;

/* JADX INFO: renamed from: jj.l */
/* JADX INFO: loaded from: classes2.dex */
public class C7187l extends AbstractC7176b<PrivateMessageNotification> {
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: k */
    public String mo29987k(int i10) {
        return i10 == 2 ? "private_message_received" : "private_message_received_cleared";
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: l */
    public Class<?> mo29988l() {
        return PrivateMessageReceivedNotificationReceiver.class;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: n */
    public String mo29990n(Context context) {
        return this.f27844a.m34499i() == 1 ? String.format(context.getResources().getString(C11347q0.f39928N0), m29989m().getAuthorUserName()) : String.format(context.getResources().getString(C11347q0.f39922K0), String.valueOf(this.f27844a.m34499i()));
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: o */
    public int mo29991o() {
        return 2;
    }

    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: q */
    public String mo29993q() {
        return "PrivateMessageReceived";
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
    /* JADX INFO: renamed from: r */
    public long mo29994r() {
        C8562v<T> c8562v = this.f27844a;
        return ((PrivateMessageNotification) c8562v.m34492b(c8562v.m34499i() - 1)).getAuthorUserId();
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // p294mj.C8562v.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo30012b(PrivateMessageNotification c8535c0, PrivateMessageNotification c8535c1) {
        return c8535c0.getMessageId() == c8535c1.getMessageId();
    }

    /* JADX DEBUG: Method merged with bridge method: u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent mo29997u(Intent intent, PrivateMessageNotification c8535c0) {
        if (this.f27844a.m34499i() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "PrivateMessageReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
            return intent;
        }
        intent.putExtra("EXTRA_CONVERSATION_ID", c8535c0.getMessageId());
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent; */
    @Override // p222jj.AbstractC7176b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent mo29998v(Intent intent, PrivateMessageNotification c8535c0) {
        return intent;
    }
}
