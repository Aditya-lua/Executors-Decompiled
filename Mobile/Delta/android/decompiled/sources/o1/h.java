package o1;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import g0.r1;
import m1.o1;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f27001a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraUseInconsistentTimebaseQuirk f27002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27003d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a4 f27004e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27005a;

        static {
            int[] iArr = new int[a4.values().length];
            f27005a = iArr;
            try {
                iArr[a4.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27005a[a4.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(o1 o1Var, a4 a4Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f27001a = o1Var;
        this.b = a4Var;
        this.f27002c = cameraUseInconsistentTimebaseQuirk;
    }

    public final long a() {
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            long jB = this.f27001a.b();
            long jA = this.f27001a.a();
            long jB2 = this.f27001a.b();
            long j12 = jB2 - jB;
            if (i10 == 0 || j12 < j10) {
                j11 = jA - ((jB + jB2) >> 1);
                j10 = j12;
            }
        }
        return Math.max(0L, j11);
    }

    public long b(long j10) {
        if (this.f27004e == null) {
            this.f27004e = e(j10);
        }
        int i10 = a.f27005a[this.f27004e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return j10;
            }
            throw new AssertionError("Unknown timebase: " + this.f27004e);
        }
        if (this.f27003d == -1) {
            this.f27003d = a();
            r1.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f27003d);
        }
        return j10 - this.f27003d;
    }

    public final boolean c() {
        return this.f27001a.a() - this.f27001a.b() > 3000000;
    }

    public final boolean d(long j10) {
        return Math.abs(j10 - this.f27001a.a()) < Math.abs(j10 - this.f27001a.b());
    }

    public final a4 e(long j10) {
        boolean z10;
        String str;
        if (this.f27002c != null) {
            r1.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z10 = false;
        } else {
            if (!c()) {
                return this.b;
            }
            z10 = true;
        }
        a4 a4Var = d(j10) ? a4.REALTIME : a4.UPTIME;
        if (!z10 || a4Var == this.b) {
            r1.a("VideoTimebaseConverter", "Detect input timebase = " + a4Var);
            return a4Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            str = ", SOC: " + Build.SOC_MODEL;
        } else {
            str = "";
        }
        r1.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), str, this.b, a4Var));
        return a4Var;
    }
}
