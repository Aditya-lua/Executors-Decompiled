package qe;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements oe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.a f29328a;
    public final byte[] b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29329a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29329a = iArr;
            try {
                iArr[ze.p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29329a[ze.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29329a[ze.p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29329a[ze.p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j0(oe.a aVar, byte[] bArr) {
        this.f29328a = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static oe.a c(oe.a aVar, df.a aVar2) {
        return new j0(aVar, aVar2.d());
    }

    public static oe.a d(ve.p pVar) throws GeneralSecurityException {
        byte[] bArrD;
        ve.l0 l0VarB = pVar.b(oe.j.a());
        oe.a aVar = (oe.a) ve.o0.d().e(ze.f0.h0().D(l0VarB.f()).E(l0VarB.g()).C(l0VarB.d()).build(), oe.a.class);
        ze.p0 p0VarE = l0VarB.e();
        int i10 = a.f29329a[p0VarE.ordinal()];
        if (i10 == 1) {
            bArrD = ve.e0.f32930a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = ve.e0.a(pVar.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + p0VarE);
            }
            bArrD = ve.e0.b(pVar.a().intValue()).d();
        }
        return new j0(aVar, bArrD);
    }

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.f29328a.a(bArr, bArr2) : cf.e.a(bArr3, this.f29328a.a(bArr, bArr2));
    }

    @Override // oe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.f29328a.b(bArr, bArr2);
        }
        if (ve.s0.e(bArr3, bArr)) {
            return this.f29328a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
