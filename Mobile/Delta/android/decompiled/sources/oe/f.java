package oe;

import java.security.GeneralSecurityException;
import ze.j0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f27344a = new byte[0];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27345a;

        static {
            int[] iArr = new int[p0.values().length];
            f27345a = iArr;
            try {
                iArr[p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27345a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27345a[p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27345a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(j0.c cVar) throws GeneralSecurityException {
        int i10 = a.f27345a[cVar.g0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ve.e0.a(cVar.f0()).d();
        }
        if (i10 == 3) {
            return ve.e0.b(cVar.f0()).d();
        }
        if (i10 == 4) {
            return f27344a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
