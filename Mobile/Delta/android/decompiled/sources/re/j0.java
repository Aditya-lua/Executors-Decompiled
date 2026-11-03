package re;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pe.a f30279a;
    public final byte[] b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30280a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30280a = iArr;
            try {
                iArr[af.p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30280a[af.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30280a[af.p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30280a[af.p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j0(pe.a aVar, byte[] bArr) {
        this.f30279a = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static pe.a c(pe.a aVar, ef.a aVar2) {
        return new j0(aVar, aVar2.d());
    }

    public static pe.a d(we.p pVar) throws GeneralSecurityException {
        byte[] bArrD;
        we.l0 l0VarB = pVar.b(pe.j.a());
        pe.a aVar = (pe.a) we.o0.d().e(af.f0.h0().D(l0VarB.f()).E(l0VarB.g()).C(l0VarB.d()).build(), pe.a.class);
        af.p0 p0VarE = l0VarB.e();
        int i10 = a.f30280a[p0VarE.ordinal()];
        if (i10 == 1) {
            bArrD = we.e0.f34384a.d();
        } else if (i10 == 2 || i10 == 3) {
            bArrD = we.e0.a(pVar.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + p0VarE);
            }
            bArrD = we.e0.b(pVar.a().intValue()).d();
        }
        return new j0(aVar, bArrD);
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.f30279a.a(bArr, bArr2) : df.e.a(bArr3, this.f30279a.a(bArr, bArr2));
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.f30279a.b(bArr, bArr2);
        }
        if (we.s0.e(bArr3, bArr)) {
            return this.f30279a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
