package af;

import cf.f0;
import cf.p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import re.w;
import ye.e0;
import ye.l0;
import ye.o0;
import ye.p;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f426d = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f427a;
    public final p0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f428c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f429a;

        static {
            int[] iArr = new int[p0.values().length];
            f429a = iArr;
            try {
                iArr[p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f429a[p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f429a[p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f429a[p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n(w wVar, p0 p0Var, byte[] bArr) {
        this.f427a = wVar;
        this.b = p0Var;
        this.f428c = bArr;
    }

    public static w c(p pVar) throws GeneralSecurityException {
        byte[] bArrD;
        l0 l0VarB = pVar.b(re.j.a());
        w wVar = (w) o0.d().e(f0.h0().F(l0VarB.f()).G(l0VarB.g()).D(l0VarB.d()).build(), w.class);
        p0 p0VarE = l0VarB.e();
        int i10 = a.f429a[p0VarE.ordinal()];
        if (i10 == 1) {
            bArrD = e0.f37741a.d();
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

    @Override // re.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.b.equals(p0.LEGACY)) {
            bArr2 = ff.e.a(bArr2, f426d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.b.equals(p0.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f428c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f427a.a(bArr, bArr2);
    }

    @Override // re.w
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        if (this.b.equals(p0.LEGACY)) {
            bArr = ff.e.a(bArr, f426d);
        }
        return ff.e.a(this.f428c, this.f427a.b(bArr));
    }
}
