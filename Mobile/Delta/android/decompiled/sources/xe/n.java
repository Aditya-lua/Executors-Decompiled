package xe;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import oe.w;
import ve.e0;
import ve.l0;
import ve.o0;
import ve.p;
import ze.f0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f35176d = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f35177a;
    public final p0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f35178c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35179a;

        static {
            int[] iArr = new int[p0.values().length];
            f35179a = iArr;
            try {
                iArr[p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35179a[p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35179a[p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35179a[p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n(w wVar, p0 p0Var, byte[] bArr) {
        this.f35177a = wVar;
        this.b = p0Var;
        this.f35178c = bArr;
    }

    public static w c(p pVar) throws GeneralSecurityException {
        byte[] bArrD;
        l0 l0VarB = pVar.b(oe.j.a());
        w wVar = (w) o0.d().e(f0.h0().D(l0VarB.f()).E(l0VarB.g()).C(l0VarB.d()).build(), w.class);
        p0 p0VarE = l0VarB.e();
        int i10 = a.f35179a[p0VarE.ordinal()];
        if (i10 == 1) {
            bArrD = e0.f32930a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = e0.a(pVar.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrD = e0.b(pVar.a().intValue()).d();
        }
        return new n(wVar, p0VarE, bArrD);
    }

    @Override // oe.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.b.equals(p0.LEGACY)) {
            bArr2 = cf.e.a(bArr2, f35176d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.b.equals(p0.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f35178c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f35177a.a(bArr, bArr2);
    }

    @Override // oe.w
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        if (this.b.equals(p0.LEGACY)) {
            bArr = cf.e.a(bArr, f35176d);
        }
        return cf.e.a(this.f35178c, this.f35177a.b(bArr));
    }
}
