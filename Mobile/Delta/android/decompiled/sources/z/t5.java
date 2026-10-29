package z;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* JADX INFO: loaded from: classes.dex */
public class t5 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36831a;

        static {
            int[] iArr = new int[n0.j4.b.values().length];
            f36831a = iArr;
            try {
                iArr[n0.j4.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36831a[n0.j4.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36831a[n0.j4.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36831a[n0.j4.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36831a[n0.j4.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(n0.j4.b bVar, int i10) {
        int i11 = a.f36831a[bVar.ordinal()];
        if (i11 != 1) {
            return (i11 == 2 && c0.e.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i10 == 2 ? 5 : 2;
    }

    public static int b(n0.j4.b bVar, int i10) {
        int i11 = a.f36831a[bVar.ordinal()];
        if (i11 != 1) {
            return (i11 == 2 && c0.e.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i10 == 2 ? 5 : 1;
    }
}
