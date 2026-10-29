package se;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p076df.C4578a0;
import p076df.C4583e;
import p076df.C4591m;
import p076df.C4594p;
import p076df.C4599u;
import p379qe.C10567v;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: se.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C11290a implements InterfaceC10211a {

    /* JADX INFO: renamed from: c */
    public static final byte[] f39628c = C4594p.m22709a("7a806c");

    /* JADX INFO: renamed from: d */
    public static final byte[] f39629d = C4594p.m22709a("46bb91c3c5");

    /* JADX INFO: renamed from: e */
    public static final byte[] f39630e = C4594p.m22709a("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f */
    public static final byte[] f39631f = C4594p.m22709a("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g */
    public static final byte[] f39632g = C4594p.m22709a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<Cipher> f39633h = new a();

    /* JADX INFO: renamed from: a */
    public final SecretKey f39634a;

    /* JADX INFO: renamed from: b */
    public final byte[] f39635b;

    /* JADX INFO: renamed from: se.a$a */
    public class a extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherM22699a = C4591m.f18797b.m22699a("AES/GCM-SIV/NoPadding");
                if (C11290a.m42376h(cipherM22699a)) {
                    return cipherM22699a;
                }
                return null;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C11290a(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f39635b = bArr2;
        C4578a0.m22637a(bArr.length);
        this.f39634a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10211a m42373d(C10567v c10567v) {
        return new C11290a(c10567v.m40516c().m23856d(C10229j.m39322a()), c10567v.m40517d().m23850d());
    }

    /* JADX INFO: renamed from: f */
    public static AlgorithmParameterSpec m42374f(byte[] bArr) {
        return m42375g(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: g */
    public static AlgorithmParameterSpec m42375g(byte[] bArr, int i10, int i11) {
        return new GCMParameterSpec(128, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m42376h(Cipher cipher) {
        try {
            cipher.init(2, new SecretKeySpec(f39630e, "AES"), m42374f(f39631f));
            cipher.updateAAD(f39629d);
            byte[] bArr = f39632g;
            return C4583e.m22662b(cipher.doFinal(bArr, 0, bArr.length), f39628c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM42379j = m42379j(bArr, bArr2);
        byte[] bArr3 = this.f39635b;
        return bArr3.length == 0 ? bArrM42379j : C4583e.m22661a(bArr3, bArrM42379j);
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f39635b;
        if (bArr3.length == 0) {
            return m42378i(bArr, bArr2);
        }
        if (C12394s0.m46452e(bArr3, bArr)) {
            return m42378i(Arrays.copyOfRange(bArr, this.f39635b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    /* JADX INFO: renamed from: e */
    public final Cipher m42377e() throws GeneralSecurityException {
        Cipher cipher = f39633h.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m42378i(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherM42377e = m42377e();
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipherM42377e.init(2, this.f39634a, m42375g(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherM42377e.updateAAD(bArr2);
        }
        return cipherM42377e.doFinal(bArr, 12, bArr.length - 12);
    }

    /* JADX INFO: renamed from: j */
    public final byte[] m42379j(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherM42377e = m42377e();
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM22724a = C4599u.m22724a(12);
        System.arraycopy(bArrM22724a, 0, bArr3, 0, 12);
        cipherM42377e.init(1, this.f39634a, m42374f(bArrM22724a));
        if (bArr2 != null && bArr2.length != 0) {
            cipherM42377e.updateAAD(bArr2);
        }
        int iDoFinal = cipherM42377e.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }
}
