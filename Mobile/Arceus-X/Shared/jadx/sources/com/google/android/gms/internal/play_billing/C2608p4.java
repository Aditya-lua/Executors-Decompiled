package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC2652t4;
import com.google.android.gms.internal.play_billing.C2608p4;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p4 */
/* JADX INFO: loaded from: classes.dex */
public class C2608p4<MessageType extends AbstractC2652t4<MessageType, BuilderType>, BuilderType extends C2608p4<MessageType, BuilderType>> extends AbstractC2453b3<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2652t4 f9185a;

    /* JADX INFO: renamed from: b */
    public AbstractC2652t4 f9186b;

    public C2608p4(MessageType messagetype) {
        this.f9185a = messagetype;
        if (messagetype.m11753l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9186b = messagetype.m11758u();
    }

    /* JADX INFO: renamed from: b */
    public static void m11641b(Object obj, Object obj2) {
        C2489e6.m11377a().m11378b(obj.getClass()).mo11215c(obj, obj2);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C2608p4 clone() {
        C2608p4 c2608p4 = (C2608p4) this.f9185a.mo11269p(5, null, null);
        c2608p4.f9186b = mo11643g();
        return c2608p4;
    }

    /* JADX INFO: renamed from: h */
    public final C2608p4 m11644h(AbstractC2652t4 abstractC2652t4) {
        if (!this.f9185a.equals(abstractC2652t4)) {
            if (!this.f9186b.m11753l()) {
                m11648n();
            }
            m11641b(this.f9186b, abstractC2652t4);
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final MessageType m11645i() {
        MessageType messagetype = (MessageType) mo11643g();
        if (messagetype.zzo()) {
            return messagetype;
        }
        throw new C2643s6(messagetype);
    }

    /* JADX DEBUG: Method merged with bridge method: g()Lcom/google/android/gms/internal/play_billing/x5; */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2686w5
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MessageType mo11643g() {
        if (!this.f9186b.m11753l()) {
            return (MessageType) this.f9186b;
        }
        this.f9186b.m11748A();
        return (MessageType) this.f9186b;
    }

    /* JADX INFO: renamed from: k */
    public final void m11647k() {
        if (this.f9186b.m11753l()) {
            return;
        }
        m11648n();
    }

    /* JADX INFO: renamed from: n */
    public void m11648n() {
        AbstractC2652t4 abstractC2652t4M11758u = this.f9185a.m11758u();
        m11641b(abstractC2652t4M11758u, this.f9186b);
        this.f9186b = abstractC2652t4M11758u;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.gms.internal.play_billing.t4.k(com.google.android.gms.internal.play_billing.t4, boolean):boolean */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2708y5
    public final boolean zzo() {
        return AbstractC2652t4.m11741o(this.f9186b, false);
    }
}
