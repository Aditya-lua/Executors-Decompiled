package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2902b<MessageType extends InterfaceC2954s0> implements InterfaceC2901a1<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final C2944p f10800a = C2944p.m14035b();

    /* JADX INFO: renamed from: c */
    public final MessageType m13393c(MessageType messagetype) throws C2903b0 {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m13394d(messagetype).m13983a().m13409k(messagetype);
    }

    /* JADX INFO: renamed from: d */
    public final C2937m1 m13394d(MessageType messagetype) {
        return messagetype instanceof AbstractC2899a ? ((AbstractC2899a) messagetype).m13373l() : new C2937m1(messagetype);
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Ljava/lang/Object; */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo13392b(AbstractC2920h abstractC2920h, C2944p c2944p) {
        return (MessageType) m13393c(m13396f(abstractC2920h, c2944p));
    }

    /* JADX INFO: renamed from: f */
    public MessageType m13396f(AbstractC2920h abstractC2920h, C2944p c2944p) throws C2903b0 {
        AbstractC2923i abstractC2923iMo13565m = abstractC2920h.mo13565m();
        MessageType messagetypeMo13391a = mo13391a(abstractC2923iMo13565m, c2944p);
        try {
            abstractC2923iMo13565m.mo13595a(0);
            return messagetypeMo13391a;
        } catch (C2903b0 e10) {
            throw e10.m13409k(messagetypeMo13391a);
        }
    }
}
