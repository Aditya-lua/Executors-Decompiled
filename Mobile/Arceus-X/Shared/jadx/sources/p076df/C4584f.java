package p076df;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p379qe.C10506a0;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;
import re.C10827f0;

/* JADX INFO: renamed from: df.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C4584f implements InterfaceC10211a {

    /* JADX INFO: renamed from: a */
    public final C10827f0 f18745a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18746b;

    public C4584f(byte[] bArr, byte[] bArr2) {
        this.f18745a = new C10827f0(bArr);
        this.f18746b = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m22666c(C10506a0 c10506a0) {
        return new C4584f(c10506a0.m40339c().m23856d(C10229j.m39322a()), c10506a0.m40340d().m23850d());
    }

    /* JADX INFO: renamed from: d */
    private byte[] m22667d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f18745a.mo41227a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    /* JADX INFO: renamed from: e */
    private byte[] m22668e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrM22724a = C4599u.m22724a(12);
        byteBufferAllocate.put(bArrM22724a);
        this.f18745a.mo41228b(byteBufferAllocate, bArrM22724a, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM22668e = m22668e(bArr, bArr2);
        byte[] bArr3 = this.f18746b;
        return bArr3.length == 0 ? bArrM22668e : C4583e.m22661a(bArr3, bArrM22668e);
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18746b;
        if (bArr3.length == 0) {
            return m22667d(bArr, bArr2);
        }
        if (C12394s0.m46452e(bArr3, bArr)) {
            return m22667d(Arrays.copyOfRange(bArr, this.f18746b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
