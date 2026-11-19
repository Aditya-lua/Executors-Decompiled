package se;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements re.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f31329d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<String> f31330e = g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31331a;
    public final re.x b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.a f31332c;

    @Deprecated
    public i0(cf.h0 h0Var, re.a aVar) {
        if (f(h0Var.f0())) {
            this.f31331a = h0Var.f0();
            this.b = e(h0Var);
            this.f31332c = aVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + h0Var.f0() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static re.a d(c cVar, re.a aVar) throws GeneralSecurityException {
        try {
            return new i0(cf.h0.j0(re.h0.b(cVar), com.google.crypto.tink.shaded.protobuf.p.b()), aVar);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static boolean f(String str) {
        return f31330e.contains(str);
    }

    public static Set<String> g() {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // re.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        re.l lVarC = ye.w.f().c(this.b, null);
        byte[] bArrA = this.f31332c.a(((ye.l0) ye.d0.c().n(lVarC, ye.l0.class, re.j.a())).g().v(), f31329d);
        if (bArrA.length <= 4096) {
            return c(bArrA, ((re.a) ye.a0.c().b(lVarC, re.a.class)).a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // re.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > 4096 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((re.a) ye.a0.c().b(ye.d0.c().f(ye.l0.b(this.f31331a, com.google.crypto.tink.shaded.protobuf.h.e(this.f31332c.b(bArr3, f31329d)), cf.f0.c.SYMMETRIC, cf.p0.RAW, null), re.j.a()), re.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public final re.x e(cf.h0 h0Var) {
        return re.h0.a(cf.h0.i0(h0Var).D(cf.p0.RAW).build().n());
    }
}
