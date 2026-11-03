package df;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements pe.a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14693d = ue.b.EnumC0590b.f32770a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.a f14694a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14695c;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f14693d.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f14694a = ef.a.a(bArr);
        this.b = bArr2;
        this.f14695c = bArr3;
        we.e.l();
    }

    public static pe.a0 b(bf.o oVar) throws GeneralSecurityException {
        if (f14693d.a()) {
            return new j(oVar.f().d(), oVar.b().d(), oVar.e().c().equals(bf.i.a.f4091d) ? new byte[]{0} : new byte[0]);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    private void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!we.e.A(bArr2, bArr, this.f14694a.d())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // pe.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0 && this.f14695c.length == 0) {
            c(bArr, bArr2);
        } else {
            if (!s0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.f14695c;
            if (bArr4.length != 0) {
                bArr2 = e.a(bArr2, bArr4);
            }
            c(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
        }
    }
}
