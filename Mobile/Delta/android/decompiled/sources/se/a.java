package se;

import df.a0;
import df.e;
import df.m;
import df.p;
import df.u;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import pe.j;
import qe.v;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements pe.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f31171c = p.a("7a806c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f31172d = p.a("46bb91c3c5");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f31173e = p.a("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f31174f = p.a("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f31175g = p.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f31176h = new C0549a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f31177a;
    public final byte[] b;

    /* JADX INFO: renamed from: se.a$a, reason: collision with other inner class name */
    public class C0549a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherA = m.b.a("AES/GCM-SIV/NoPadding");
                if (a.h(cipherA)) {
                    return cipherA;
                }
                return null;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.b = bArr2;
        a0.a(bArr.length);
        this.f31177a = new SecretKeySpec(bArr, "AES");
    }

    public static pe.a d(v vVar) {
        return new a(vVar.c().d(j.a()), vVar.d().d());
    }

    public static AlgorithmParameterSpec f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec g(byte[] bArr, int i10, int i11) {
        return new GCMParameterSpec(128, bArr, i10, i11);
    }

    public static boolean h(Cipher cipher) {
        try {
            cipher.init(2, new SecretKeySpec(f31173e, "AES"), f(f31174f));
            cipher.updateAAD(f31172d);
            byte[] bArr = f31175g;
            return e.b(cipher.doFinal(bArr, 0, bArr.length), f31171c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrJ = j(bArr, bArr2);
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrJ : e.a(bArr3, bArrJ);
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return i(bArr, bArr2);
        }
        if (s0.e(bArr3, bArr)) {
            return i(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final Cipher e() throws GeneralSecurityException {
        Cipher cipher = f31176h.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    public final byte[] i(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherE = e();
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipherE.init(2, this.f31177a, g(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherE.updateAAD(bArr2);
        }
        return cipherE.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] j(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherE = e();
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = u.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        cipherE.init(1, this.f31177a, f(bArrA));
        if (bArr2 != null && bArr2.length != 0) {
            cipherE.updateAAD(bArr2);
        }
        int iDoFinal = cipherE.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }
}
