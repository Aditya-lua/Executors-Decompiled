package p318o1;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import p140g0.C5931r1;
import p282m1.InterfaceC8380o1;
import p296n0.EnumC8723a4;

/* JADX INFO: renamed from: o1.h */
/* JADX INFO: loaded from: classes.dex */
public class C9628h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8380o1 f34921a;

    /* JADX INFO: renamed from: b */
    public final EnumC8723a4 f34922b;

    /* JADX INFO: renamed from: c */
    public final CameraUseInconsistentTimebaseQuirk f34923c;

    /* JADX INFO: renamed from: d */
    public long f34924d = -1;

    /* JADX INFO: renamed from: e */
    public EnumC8723a4 f34925e;

    /* JADX INFO: renamed from: o1.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34926a;

        static {
            int[] iArr = new int[EnumC8723a4.values().length];
            f34926a = iArr;
            try {
                iArr[EnumC8723a4.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34926a[EnumC8723a4.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9628h(InterfaceC8380o1 interfaceC8380o1, EnumC8723a4 enumC8723a4, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f34921a = interfaceC8380o1;
        this.f34922b = enumC8723a4;
        this.f34923c = cameraUseInconsistentTimebaseQuirk;
    }

    /* JADX INFO: renamed from: a */
    public final long m37992a() {
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            long jMo34004b = this.f34921a.mo34004b();
            long jMo34003a = this.f34921a.mo34003a();
            long jMo34004b2 = this.f34921a.mo34004b();
            long j12 = jMo34004b2 - jMo34004b;
            if (i10 == 0 || j12 < j10) {
                j11 = jMo34003a - ((jMo34004b + jMo34004b2) >> 1);
                j10 = j12;
            }
        }
        return Math.max(0L, j11);
    }

    /* JADX INFO: renamed from: b */
    public long m37993b(long j10) {
        if (this.f34925e == null) {
            this.f34925e = m37996e(j10);
        }
        int i10 = a.f34926a[this.f34925e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return j10;
            }
            throw new AssertionError("Unknown timebase: " + this.f34925e);
        }
        if (this.f34924d == -1) {
            this.f34924d = m37992a();
            C5931r1.m26561a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f34924d);
        }
        return j10 - this.f34924d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37994c() {
        return this.f34921a.mo34003a() - this.f34921a.mo34004b() > 3000000;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37995d(long j10) {
        return Math.abs(j10 - this.f34921a.mo34003a()) < Math.abs(j10 - this.f34921a.mo34004b());
    }

    /* JADX INFO: renamed from: e */
    public final EnumC8723a4 m37996e(long j10) {
        boolean z10;
        String str;
        if (this.f34923c != null) {
            C5931r1.m26572l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z10 = false;
        } else {
            if (!m37994c()) {
                return this.f34922b;
            }
            z10 = true;
        }
        EnumC8723a4 enumC8723a4 = m37995d(j10) ? EnumC8723a4.REALTIME : EnumC8723a4.UPTIME;
        if (!z10 || enumC8723a4 == this.f34922b) {
            C5931r1.m26561a("VideoTimebaseConverter", "Detect input timebase = " + enumC8723a4);
            return enumC8723a4;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            str = ", SOC: " + Build.SOC_MODEL;
        } else {
            str = "";
        }
        C5931r1.m26563c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), str, this.f34922b, enumC8723a4));
        return enumC8723a4;
    }
}
