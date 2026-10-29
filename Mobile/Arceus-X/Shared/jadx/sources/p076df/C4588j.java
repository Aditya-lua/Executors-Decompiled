package p076df;

import bf.C1398i;
import bf.C1410o;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p102ef.C5109a;
import p465ue.C11844b;
import p515we.C12365e;
import p515we.C12394s0;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: df.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C4588j implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: d */
    public static final C11844b.b f18776d = C11844b.b.f41601a;

    /* JADX INFO: renamed from: a */
    public final C5109a f18777a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18778b;

    /* JADX INFO: renamed from: c */
    public final byte[] f18779c;

    public C4588j(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f18776d.mo44243a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f18777a = C5109a.m23847a(bArr);
        this.f18778b = bArr2;
        this.f18779c = bArr3;
        C12365e.m46263l();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10212a0 m22680b(C1410o c1410o) throws GeneralSecurityException {
        if (f18776d.mo44243a()) {
            return new C4588j(c1410o.m7339f().m23850d(), c1410o.mo7253b().m23850d(), c1410o.m7338e().m7290c().equals(C1398i.a.f5479d) ? new byte[]{0} : new byte[0]);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    /* JADX INFO: renamed from: c */
    private void m22681c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!C12365e.m46251A(bArr2, bArr, this.f18777a.m23850d())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // pe.InterfaceC10212a0
    /* JADX INFO: renamed from: a */
    public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18778b;
        if (bArr3.length == 0 && this.f18779c.length == 0) {
            m22681c(bArr, bArr2);
        } else {
            if (!C12394s0.m46452e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.f18779c;
            if (bArr4.length != 0) {
                bArr2 = C4583e.m22661a(bArr2, bArr4);
            }
            m22681c(Arrays.copyOfRange(bArr, this.f18778b.length, bArr.length), bArr2);
        }
    }
}
