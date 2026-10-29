package p076df;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import p379qe.C10520f;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;
import pe.InterfaceC10242w;

/* JADX INFO: renamed from: df.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C4590l implements InterfaceC10211a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4595q f18793a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10242w f18794b;

    /* JADX INFO: renamed from: c */
    public final int f18795c;

    /* JADX INFO: renamed from: d */
    public final byte[] f18796d;

    public C4590l(InterfaceC4595q interfaceC4595q, InterfaceC10242w interfaceC10242w, int i10, byte[] bArr) {
        this.f18793a = interfaceC4595q;
        this.f18794b = interfaceC10242w;
        this.f18795c = i10;
        this.f18796d = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m22697c(C10520f c10520f) {
        return new C4590l(new C4577a(c10520f.m40353c().m23856d(C10229j.m39322a()), c10520f.m40356f().m40392f()), new C4598t(new C4597s("HMAC" + c10520f.m40356f().m40390d(), new SecretKeySpec(c10520f.m40354d().m23856d(C10229j.m39322a()), "HMAC")), c10520f.m40356f().m40393g()), c10520f.m40356f().m40393g(), c10520f.m40355e().m23850d());
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) {
        byte[] bArrMo22633a = this.f18793a.mo22633a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return C4583e.m22661a(this.f18796d, bArrMo22633a, this.f18794b.mo22723b(C4583e.m22661a(bArr2, bArrMo22633a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f18795c;
        byte[] bArr3 = this.f18796d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f18796d.length, bArr.length - this.f18795c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f18795c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f18794b.mo22722a(bArrCopyOfRange2, C4583e.m22661a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f18793a.mo22634b(bArrCopyOfRange);
    }
}
