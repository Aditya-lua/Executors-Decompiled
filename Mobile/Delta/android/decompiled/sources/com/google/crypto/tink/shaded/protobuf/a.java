package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0126a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0126a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0126a<MessageType, BuilderType>> implements s0.a {
        public static m1 n(s0 s0Var) {
            return new m1(s0Var);
        }

        public abstract BuilderType j(MessageType messagetype);

        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType H(s0 s0Var) {
            if (f().getClass().isInstance(s0Var)) {
                return (BuilderType) j((a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public h b() {
        try {
            h.C0127h c0127hL = h.l(c());
            i(c0127hL.b());
            return c0127hL.a();
        } catch (IOException e10) {
            throw new RuntimeException(k("ByteString"), e10);
        }
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int j(g1 g1Var) {
        int iG = g();
        if (iG != -1) {
            return iG;
        }
        int iD = g1Var.d(this);
        m(iD);
        return iD;
    }

    public final String k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public m1 l() {
        return new m1(this);
    }

    public void m(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] n() {
        try {
            byte[] bArr = new byte[c()];
            k kVarF0 = k.f0(bArr);
            i(kVarF0);
            kVarF0.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(k("byte array"), e10);
        }
    }

    public void o(OutputStream outputStream) {
        k kVarE0 = k.e0(outputStream, k.I(c()));
        i(kVarE0);
        kVarE0.b0();
    }
}
