package p076df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import p544xe.C12803a;
import p544xe.C12808f;
import p544xe.C12811i;
import p544xe.C12817o;
import p602ze.InterfaceC13793a;
import pe.C10229j;
import pe.InterfaceC10242w;

/* JADX INFO: renamed from: df.t */
/* JADX INFO: loaded from: classes2.dex */
public class C4598t implements InterfaceC10242w {

    /* JADX INFO: renamed from: e */
    public static final byte[] f18825e = {0};

    /* JADX INFO: renamed from: a */
    public final InterfaceC13793a f18826a;

    /* JADX INFO: renamed from: b */
    public final int f18827b;

    /* JADX INFO: renamed from: c */
    public final byte[] f18828c;

    /* JADX INFO: renamed from: d */
    public final byte[] f18829d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4598t(InterfaceC13793a interfaceC13793a, int i10) throws InvalidAlgorithmParameterException {
        this.f18826a = interfaceC13793a;
        this.f18827b = i10;
        this.f18828c = new byte[0];
        this.f18829d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC13793a.mo22714a(new byte[0], i10);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10242w m22720c(C12803a c12803a) {
        return new C4598t(c12803a);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10242w m22721d(C12811i c12811i) {
        return new C4598t(c12811i);
    }

    @Override // pe.InterfaceC10242w
    /* JADX INFO: renamed from: a */
    public void mo22722a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!C4583e.m22662b(mo22723b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // pe.InterfaceC10242w
    /* JADX INFO: renamed from: b */
    public byte[] mo22723b(byte[] bArr) {
        byte[] bArr2 = this.f18829d;
        return bArr2.length > 0 ? C4583e.m22661a(this.f18828c, this.f18826a.mo22714a(C4583e.m22661a(bArr, bArr2), this.f18827b)) : C4583e.m22661a(this.f18828c, this.f18826a.mo22714a(bArr, this.f18827b));
    }

    public C4598t(C12803a c12803a) {
        this.f18826a = new C4596r(c12803a.m47682c().m23856d(C10229j.m39322a()));
        this.f18827b = c12803a.m47684e().m47700c();
        this.f18828c = c12803a.m47683d().m23850d();
        if (c12803a.m47684e().m47703f().equals(C12808f.c.f45566d)) {
            byte[] bArr = f18825e;
            this.f18829d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f18829d = new byte[0];
        }
    }

    public C4598t(C12811i c12811i) {
        this.f18826a = new C4597s("HMAC" + c12811i.m47713e().m47726d(), new SecretKeySpec(c12811i.m47711c().m23856d(C10229j.m39322a()), "HMAC"));
        this.f18827b = c12811i.m47713e().m47725c();
        this.f18828c = c12811i.m47712d().m23850d();
        if (c12811i.m47713e().m47729g().equals(C12817o.d.f45600d)) {
            byte[] bArr = f18825e;
            this.f18829d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f18829d = new byte[0];
        }
    }
}
