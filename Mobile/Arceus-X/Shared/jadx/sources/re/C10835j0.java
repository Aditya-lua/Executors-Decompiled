package re;

import af.C0218f0;
import af.EnumC0238p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p076df.C4583e;
import p102ef.C5109a;
import p515we.C12366e0;
import p515we.C12380l0;
import p515we.C12386o0;
import p515we.C12387p;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: re.j0 */
/* JADX INFO: loaded from: classes2.dex */
public class C10835j0 implements InterfaceC10211a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10211a f38554a;

    /* JADX INFO: renamed from: b */
    public final byte[] f38555b;

    /* JADX INFO: renamed from: re.j0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38556a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f38556a = iArr;
            try {
                iArr[EnumC0238p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38556a[EnumC0238p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38556a[EnumC0238p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38556a[EnumC0238p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C10835j0(InterfaceC10211a interfaceC10211a, byte[] bArr) {
        this.f38554a = interfaceC10211a;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f38555b = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m41245c(InterfaceC10211a interfaceC10211a, C5109a c5109a) {
        return new C10835j0(interfaceC10211a, c5109a.m23850d());
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10211a m41246d(C12387p c12387p) throws GeneralSecurityException {
        byte[] bArrM23850d;
        C12380l0 c12380l0M46419b = c12387p.m46419b(C10229j.m39322a());
        InterfaceC10211a interfaceC10211a = (InterfaceC10211a) C12386o0.m46416d().m46417e(C0218f0.m720h0().m728D(c12380l0M46419b.m46396f()).m729E(c12380l0M46419b.m46397g()).m727C(c12380l0M46419b.m46394d()).build(), InterfaceC10211a.class);
        EnumC0238p0 enumC0238p0M46395e = c12380l0M46419b.m46395e();
        int i10 = a.f38556a[enumC0238p0M46395e.ordinal()];
        if (i10 == 1) {
            bArrM23850d = C12366e0.f44235a.m23850d();
        } else if (i10 == 2 || i10 == 3) {
            bArrM23850d = C12366e0.m46287a(c12387p.mo7250a().intValue()).m23850d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + enumC0238p0M46395e);
            }
            bArrM23850d = C12366e0.m46288b(c12387p.mo7250a().intValue()).m23850d();
        }
        return new C10835j0(interfaceC10211a, bArrM23850d);
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f38555b;
        return bArr3.length == 0 ? this.f38554a.mo22645a(bArr, bArr2) : C4583e.m22661a(bArr3, this.f38554a.mo22645a(bArr, bArr2));
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f38555b;
        if (bArr3.length == 0) {
            return this.f38554a.mo22646b(bArr, bArr2);
        }
        if (C12394s0.m46452e(bArr3, bArr)) {
            return this.f38554a.mo22646b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
