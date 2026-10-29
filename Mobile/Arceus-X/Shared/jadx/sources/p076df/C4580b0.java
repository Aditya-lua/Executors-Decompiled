package p076df;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p379qe.C10552p1;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;
import re.C10833i0;

/* JADX INFO: renamed from: df.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4580b0 implements InterfaceC10211a {

    /* JADX INFO: renamed from: a */
    public final C10833i0 f18732a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18733b;

    public C4580b0(byte[] bArr, byte[] bArr2) {
        this.f18732a = new C10833i0(bArr);
        this.f18733b = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m22651c(C10552p1 c10552p1) {
        return new C4580b0(c10552p1.m40454c().m23856d(C10229j.m39322a()), c10552p1.m40455d().m23850d());
    }

    /* JADX INFO: renamed from: d */
    private byte[] m22652d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f18732a.mo41227a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    /* JADX INFO: renamed from: e */
    private byte[] m22653e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrM22724a = C4599u.m22724a(24);
        byteBufferAllocate.put(bArrM22724a);
        this.f18732a.mo41228b(byteBufferAllocate, bArrM22724a, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM22653e = m22653e(bArr, bArr2);
        byte[] bArr3 = this.f18733b;
        return bArr3.length == 0 ? bArrM22653e : C4583e.m22661a(bArr3, bArrM22653e);
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18733b;
        if (bArr3.length == 0) {
            return m22652d(bArr, bArr2);
        }
        if (C12394s0.m46452e(bArr3, bArr)) {
            return m22652d(Arrays.copyOfRange(bArr, this.f18733b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
