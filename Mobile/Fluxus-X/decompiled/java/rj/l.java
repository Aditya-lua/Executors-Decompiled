package rj;

import android.content.Context;
import android.content.Intent;
import bh.q0;
import com.roblox.client.pushnotification.notificationreceivers.PrivateMessageReceivedNotificationReceiver;
import uj.PrivateMessageNotification;

/* JADX INFO: loaded from: classes2.dex */
public class l extends b<PrivateMessageNotification> {
    @Override // rj.b
    public String k(int i10) {
        return i10 == 2 ? "private_message_received" : "private_message_received_cleared";
    }

    @Override // rj.b
    public Class<?> l() {
        return PrivateMessageReceivedNotificationReceiver.class;
    }

    @Override // rj.b
    public String n(Context context) {
        return this.f30738a.i() == 1 ? String.format(context.getResources().getString(q0.X0), m().getAuthorUserName()) : String.format(context.getResources().getString(q0.U0), String.valueOf(this.f30738a.i()));
    }

    @Override // rj.b
    public int o() {
        return 2;
    }

    @Override // rj.b
    public String q() {
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
    @Override // rj.b
    public long r() {
        uj.v<T> vVar = this.f30738a;
        return ((PrivateMessageNotification) vVar.b(vVar.i() - 1)).getAuthorUserId();
    }

    @Override // uj.v.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean b(PrivateMessageNotification c0Var, PrivateMessageNotification c0Var2) {
        return c0Var.getMessageId() == c0Var2.getMessageId();
    }

    @Override // rj.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Intent u(Intent intent, PrivateMessageNotification c0Var) {
        if (this.f30738a.i() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "PrivateMessageReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
            return intent;
        }
        intent.putExtra("EXTRA_CONVERSATION_ID", c0Var.getMessageId());
        intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        return intent;
    }

    @Override // rj.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Intent v(Intent intent, PrivateMessageNotification c0Var) {
        return intent;
    }
}
