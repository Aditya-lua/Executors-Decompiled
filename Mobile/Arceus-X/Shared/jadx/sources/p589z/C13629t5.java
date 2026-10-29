package p589z;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import p036c0.C1500e;
import p296n0.InterfaceC8777j4;

/* JADX INFO: renamed from: z.t5 */
/* JADX INFO: loaded from: classes.dex */
public class C13629t5 {

    /* JADX INFO: renamed from: z.t5$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47695a;

        static {
            int[] iArr = new int[InterfaceC8777j4.b.values().length];
            f47695a = iArr;
            try {
                iArr[InterfaceC8777j4.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47695a[InterfaceC8777j4.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47695a[InterfaceC8777j4.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47695a[InterfaceC8777j4.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47695a[InterfaceC8777j4.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m49622a(InterfaceC8777j4.b bVar, int i10) {
        int i11 = a.f47695a[bVar.ordinal()];
        if (i11 != 1) {
            return (i11 == 2 && C1500e.m7653b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i10 == 2 ? 5 : 2;
    }

    /* JADX INFO: renamed from: b */
    public static int m49623b(InterfaceC8777j4.b bVar, int i10) {
        int i11 = a.f47695a[bVar.ordinal()];
        if (i11 != 1) {
            return (i11 == 2 && C1500e.m7653b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i10 == 2 ? 5 : 1;
    }
}
