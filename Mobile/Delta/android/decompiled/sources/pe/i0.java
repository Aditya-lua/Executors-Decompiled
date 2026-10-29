package pe;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements oe.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f28450d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<String> f28451e = g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28452a;
    public final oe.x b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oe.a f28453c;

    @Deprecated
    public i0(ze.h0 h0Var, oe.a aVar) {
        if (f(h0Var.f0())) {
            this.f28452a = h0Var.f0();
            this.b = e(h0Var);
            this.f28453c = aVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + h0Var.f0() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static oe.a d(c cVar, oe.a aVar) throws GeneralSecurityException {
        try {
            return new i0(ze.h0.j0(oe.h0.b(cVar), com.google.crypto.tink.shaded.protobuf.p.b()), aVar);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static boolean f(String str) {
        return f28451e.contains(str);
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

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        oe.l lVarC = ve.w.f().c(this.b, null);
        byte[] bArrA = this.f28453c.a(((ve.l0) ve.d0.c().n(lVarC, ve.l0.class, oe.j.a())).g().x(), f28450d);
        if (bArrA.length <= 4096) {
            return c(bArrA, ((oe.a) ve.a0.c().b(lVarC, oe.a.class)).a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // oe.a
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
            return ((oe.a) ve.a0.c().b(ve.d0.c().f(ve.l0.b(this.f28452a, com.google.crypto.tink.shaded.protobuf.h.e(this.f28453c.b(bArr3, f28450d)), ze.f0.c.SYMMETRIC, ze.p0.RAW, null), oe.j.a()), oe.a.class)).b(bArr4, bArr2);
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

    public final oe.x e(ze.h0 h0Var) {
        return oe.h0.a(ze.h0.i0(h0Var).C(ze.p0.RAW).build().n());
    }
}
