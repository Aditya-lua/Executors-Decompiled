package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.t4;

/* JADX INFO: loaded from: classes.dex */
public class p4<MessageType extends t4<MessageType, BuilderType>, BuilderType extends p4<MessageType, BuilderType>> extends b3<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4 f7202a;
    public t4 b;

    public p4(MessageType messagetype) {
        this.f7202a = messagetype;
        if (messagetype.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = messagetype.u();
    }

    public static void b(Object obj, Object obj2) {
        e6.a().b(obj.getClass()).c(obj, obj2);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final p4 clone() {
        p4 p4Var = (p4) this.f7202a.p(5, null, null);
        p4Var.b = g();
        return p4Var;
    }

    public final p4 h(t4 t4Var) {
        if (!this.f7202a.equals(t4Var)) {
            if (!this.b.l()) {
                n();
            }
            b(this.b, t4Var);
        }
        return this;
    }

    public final MessageType i() {
        MessageType messagetype = (MessageType) g();
        if (messagetype.zzo()) {
            return messagetype;
        }
        throw new s6(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.w5
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MessageType g() {
        if (!this.b.l()) {
            return (MessageType) this.b;
        }
        this.b.A();
        return (MessageType) this.b;
    }

    public final void k() {
        if (this.b.l()) {
            return;
        }
        n();
    }

    public void n() {
        t4 t4VarU = this.f7202a.u();
        b(t4VarU, this.b);
        this.b = t4VarU;
    }

    @Override // com.google.android.gms.internal.play_billing.y5
    public final boolean zzo() {
        return t4.o(this.b, false);
    }
}
