package pe;

import af.C0226j0;
import af.EnumC0238p0;
import java.security.GeneralSecurityException;
import p515we.C12366e0;

/* JADX INFO: renamed from: pe.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10221f {

    /* JADX INFO: renamed from: a */
    public static final byte[] f36827a = new byte[0];

    /* JADX INFO: renamed from: pe.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36828a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f36828a = iArr;
            try {
                iArr[EnumC0238p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36828a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36828a[EnumC0238p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36828a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m39311a(C0226j0.c cVar) throws GeneralSecurityException {
        int i10 = a.f36828a[cVar.m818g0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return C12366e0.m46287a(cVar.m817f0()).m23850d();
        }
        if (i10 == 3) {
            return C12366e0.m46288b(cVar.m817f0()).m23850d();
        }
        if (i10 == 4) {
            return f36827a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
