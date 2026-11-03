package pe;

import af.j0;
import af.p0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f28672a = new byte[0];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28673a;

        static {
            int[] iArr = new int[p0.values().length];
            f28673a = iArr;
            try {
                iArr[p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28673a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28673a[p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28673a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(j0.c cVar) throws GeneralSecurityException {
        int i10 = a.f28673a[cVar.g0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return we.e0.a(cVar.f0()).d();
        }
        if (i10 == 3) {
            return we.e0.b(cVar.f0()).d();
        }
        if (i10 == 4) {
            return f28672a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
