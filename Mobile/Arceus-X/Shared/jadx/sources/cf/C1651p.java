package cf;

import af.C0218f0;
import af.EnumC0238p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p076df.C4583e;
import p515we.C12366e0;
import p515we.C12380l0;
import p515we.C12387p;
import p515we.C12394s0;
import pe.C10214b0;
import pe.C10229j;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: cf.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1651p implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10212a0 f6381a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6382b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6383c;

    /* JADX INFO: renamed from: cf.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6384a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f6384a = iArr;
            try {
                iArr[EnumC0238p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6384a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6384a[EnumC0238p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6384a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C1651p(InterfaceC10212a0 interfaceC10212a0, byte[] bArr, byte[] bArr2) {
        this.f6381a = interfaceC10212a0;
        this.f6382b = bArr;
        this.f6383c = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10212a0 m8299b(C12387p c12387p) throws GeneralSecurityException {
        C12380l0 c12380l0M46419b = c12387p.m46419b(C10229j.m39322a());
        return new C1651p((InterfaceC10212a0) C10214b0.m39300c(C0218f0.m720h0().m728D(c12380l0M46419b.m46396f()).m729E(c12380l0M46419b.m46397g()).m727C(c12380l0M46419b.m46394d()).build(), InterfaceC10212a0.class), m8301d(c12380l0M46419b), m8300c(c12380l0M46419b));
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m8300c(C12380l0 c12380l0) {
        return c12380l0.m46395e().equals(EnumC0238p0.LEGACY) ? new byte[]{0} : new byte[0];
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m8301d(C12380l0 c12380l0) throws GeneralSecurityException {
        int i10 = a.f6384a[c12380l0.m46395e().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return C12366e0.m46287a(c12380l0.m46393c().intValue()).m23850d();
        }
        if (i10 == 3) {
            return C12366e0.m46288b(c12380l0.m46393c().intValue()).m23850d();
        }
        if (i10 == 4) {
            return C12366e0.f44235a.m23850d();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Override // pe.InterfaceC10212a0
    /* JADX INFO: renamed from: a */
    public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f6382b;
        if (bArr3.length == 0 && this.f6383c.length == 0) {
            this.f6381a.mo7293a(bArr, bArr2);
            return;
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.f6383c;
        if (bArr4.length != 0) {
            bArr2 = C4583e.m22661a(bArr2, bArr4);
        }
        this.f6381a.mo7293a(Arrays.copyOfRange(bArr, this.f6382b.length, bArr.length), bArr2);
    }
}
