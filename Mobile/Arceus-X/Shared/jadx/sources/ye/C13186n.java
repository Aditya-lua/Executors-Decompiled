package ye;

import af.C0218f0;
import af.EnumC0238p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p076df.C4583e;
import p515we.C12366e0;
import p515we.C12380l0;
import p515we.C12386o0;
import p515we.C12387p;
import pe.C10229j;
import pe.InterfaceC10242w;

/* JADX INFO: renamed from: ye.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C13186n implements InterfaceC10242w {

    /* JADX INFO: renamed from: d */
    public static final byte[] f46451d = {0};

    /* JADX INFO: renamed from: a */
    public final InterfaceC10242w f46452a;

    /* JADX INFO: renamed from: b */
    public final EnumC0238p0 f46453b;

    /* JADX INFO: renamed from: c */
    public final byte[] f46454c;

    /* JADX INFO: renamed from: ye.n$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46455a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f46455a = iArr;
            try {
                iArr[EnumC0238p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46455a[EnumC0238p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46455a[EnumC0238p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46455a[EnumC0238p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C13186n(InterfaceC10242w interfaceC10242w, EnumC0238p0 enumC0238p0, byte[] bArr) {
        this.f46452a = interfaceC10242w;
        this.f46453b = enumC0238p0;
        this.f46454c = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10242w m48802c(C12387p c12387p) throws GeneralSecurityException {
        byte[] bArrM23850d;
        C12380l0 c12380l0M46419b = c12387p.m46419b(C10229j.m39322a());
        InterfaceC10242w interfaceC10242w = (InterfaceC10242w) C12386o0.m46416d().m46417e(C0218f0.m720h0().m728D(c12380l0M46419b.m46396f()).m729E(c12380l0M46419b.m46397g()).m727C(c12380l0M46419b.m46394d()).build(), InterfaceC10242w.class);
        EnumC0238p0 enumC0238p0M46395e = c12380l0M46419b.m46395e();
        int i10 = a.f46455a[enumC0238p0M46395e.ordinal()];
        if (i10 == 1) {
            bArrM23850d = C12366e0.f44235a.m23850d();
        } else if (i10 == 2 || i10 == 3) {
            bArrM23850d = C12366e0.m46287a(c12387p.mo7250a().intValue()).m23850d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrM23850d = C12366e0.m46288b(c12387p.mo7250a().intValue()).m23850d();
        }
        return new C13186n(interfaceC10242w, enumC0238p0M46395e, bArrM23850d);
    }

    @Override // pe.InterfaceC10242w
    /* JADX INFO: renamed from: a */
    public void mo22722a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.f46453b.equals(EnumC0238p0.LEGACY)) {
            bArr2 = C4583e.m22661a(bArr2, f46451d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.f46453b.equals(EnumC0238p0.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f46454c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f46452a.mo22722a(bArr, bArr2);
    }

    @Override // pe.InterfaceC10242w
    /* JADX INFO: renamed from: b */
    public byte[] mo22723b(byte[] bArr) throws GeneralSecurityException {
        if (this.f46453b.equals(EnumC0238p0.LEGACY)) {
            bArr = C4583e.m22661a(bArr, f46451d);
        }
        return C4583e.m22661a(this.f46454c, this.f46452a.mo22723b(bArr));
    }
}
