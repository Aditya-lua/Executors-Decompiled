package te;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements re.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.a f32353a;
    public final byte[] b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32354a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32354a = iArr;
            try {
                iArr[cf.p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32354a[cf.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32354a[cf.p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32354a[cf.p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j0(re.a aVar, byte[] bArr) {
        this.f32353a = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static re.a c(re.a aVar, gf.a aVar2) {
        return new j0(aVar, aVar2.d());
    }

    public static re.a d(ye.p pVar) throws GeneralSecurityException {
        byte[] bArrD;
        ye.l0 l0VarB = pVar.b(re.j.a());
        re.a aVar = (re.a) ye.o0.d().e(cf.f0.h0().F(l0VarB.f()).G(l0VarB.g()).D(l0VarB.d()).build(), re.a.class);
        cf.p0 p0VarE = l0VarB.e();
        int i10 = a.f32354a[p0VarE.ordinal()];
        if (i10 == 1) {
            bArrD = ye.e0.f37741a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = ye.e0.a(pVar.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + p0VarE);
            }
            bArrD = ye.e0.b(pVar.a().intValue()).d();
        }
        return new j0(aVar, bArrD);
    }

    @Override // re.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.f32353a.a(bArr, bArr2) : ff.e.a(bArr3, this.f32353a.a(bArr, bArr2));
    }

    @Override // re.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.f32353a.b(bArr, bArr2);
        }
        if (ye.s0.e(bArr3, bArr)) {
            return this.f32353a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
