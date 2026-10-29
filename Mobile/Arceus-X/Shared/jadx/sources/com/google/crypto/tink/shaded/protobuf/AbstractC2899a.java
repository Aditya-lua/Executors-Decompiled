package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2899a<MessageType extends AbstractC2899a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC2954s0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC2899a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC2954s0.a {
        /* JADX INFO: renamed from: n */
        public static C2937m1 m13377n(InterfaceC2954s0 interfaceC2954s0) {
            return new C2937m1(interfaceC2954s0);
        }

        /* JADX INFO: renamed from: j */
        public abstract BuilderType mo578j(MessageType messagetype);

        /* JADX DEBUG: Method merged with bridge method: H(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0$a; */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType mo576H(InterfaceC2954s0 interfaceC2954s0) {
            if (mo569f().getClass().isInstance(interfaceC2954s0)) {
                return (BuilderType) mo578j((AbstractC2899a) interfaceC2954s0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: b */
    public AbstractC2920h mo13369b() {
        try {
            AbstractC2920h.h hVarM13558l = AbstractC2920h.m13558l(mo14176c());
            mo14178i(hVarM13558l.m13577b());
            return hVarM13558l.m13576a();
        } catch (IOException e10) {
            throw new RuntimeException(m13372k("ByteString"), e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public int mo13370g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: j */
    public int mo13371j(InterfaceC2919g1 interfaceC2919g1) {
        int iMo13370g = mo13370g();
        if (iMo13370g != -1) {
            return iMo13370g;
        }
        int iMo13543d = interfaceC2919g1.mo13543d(this);
        mo13374m(iMo13543d);
        return iMo13543d;
    }

    /* JADX INFO: renamed from: k */
    public final String m13372k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: l */
    public C2937m1 m13373l() {
        return new C2937m1(this);
    }

    /* JADX INFO: renamed from: m */
    public void mo13374m(int i10) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: n */
    public byte[] m13375n() {
        try {
            byte[] bArr = new byte[mo14176c()];
            AbstractC2929k abstractC2929kM13787f0 = AbstractC2929k.m13787f0(bArr);
            mo14178i(abstractC2929kM13787f0);
            abstractC2929kM13787f0.m13829c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(m13372k("byte array"), e10);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m13376o(OutputStream outputStream) {
        AbstractC2929k abstractC2929kM13785e0 = AbstractC2929k.m13785e0(outputStream, AbstractC2929k.m13763I(mo14176c()));
        mo14178i(abstractC2929kM13785e0);
        abstractC2929kM13785e0.mo13828b0();
    }
}
