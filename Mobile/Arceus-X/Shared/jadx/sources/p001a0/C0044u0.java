package p001a0;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import p063d0.C4382m;
import p140g0.C5931r1;

/* JADX INFO: renamed from: a0.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C0044u0 {

    /* JADX INFO: renamed from: a */
    public final a f88a;

    /* JADX INFO: renamed from: b */
    public final C4382m f89b;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, Size[]> f90c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<Integer, Size[]> f91d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Size[]> f92e = new HashMap();

    /* JADX INFO: renamed from: a0.u0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        StreamConfigurationMap mo97a();

        /* JADX INFO: renamed from: b */
        Size[] mo98b(Range<Integer> range);

        /* JADX INFO: renamed from: c */
        long mo99c(int i10, Size size);

        /* JADX INFO: renamed from: d */
        Size[] mo100d(int i10);

        /* JADX INFO: renamed from: e */
        int[] mo101e();

        /* JADX INFO: renamed from: f */
        Size[] mo102f();

        /* JADX INFO: renamed from: g */
        Range<Integer>[] mo103g(Size size);

        /* JADX INFO: renamed from: h */
        Size[] mo104h(int i10);
    }

    public C0044u0(StreamConfigurationMap streamConfigurationMap, C4382m c4382m) {
        this.f88a = new C0046v0(streamConfigurationMap);
        this.f89b = c4382m;
    }

    /* JADX INFO: renamed from: i */
    public static C0044u0 m88i(StreamConfigurationMap streamConfigurationMap, C4382m c4382m) {
        return new C0044u0(streamConfigurationMap, c4382m);
    }

    /* JADX INFO: renamed from: a */
    public Size[] m89a(int i10) {
        if (this.f91d.containsKey(Integer.valueOf(i10))) {
            if (this.f91d.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f91d.get(Integer.valueOf(i10)).clone();
        }
        Size[] sizeArrMo104h = this.f88a.mo104h(i10);
        if (sizeArrMo104h != null && sizeArrMo104h.length > 0) {
            sizeArrMo104h = this.f89b.m22044b(sizeArrMo104h, i10);
        }
        this.f91d.put(Integer.valueOf(i10), sizeArrMo104h);
        if (sizeArrMo104h != null) {
            return (Size[]) sizeArrMo104h.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Range<Integer>[] m90b(Size size) {
        return this.f88a.mo103g(size);
    }

    /* JADX INFO: renamed from: c */
    public Size[] m91c() {
        return this.f88a.mo102f();
    }

    /* JADX INFO: renamed from: d */
    public Size[] m92d(Range<Integer> range) {
        return this.f88a.mo98b(range);
    }

    /* JADX INFO: renamed from: e */
    public int[] m93e() {
        int[] iArrMo101e = this.f88a.mo101e();
        if (iArrMo101e == null) {
            return null;
        }
        return (int[]) iArrMo101e.clone();
    }

    /* JADX INFO: renamed from: f */
    public long m94f(int i10, Size size) {
        try {
            return this.f88a.mo99c(i10, size);
        } catch (RuntimeException e10) {
            C5931r1.m26573m("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i10 + " and size = " + size, e10);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: g */
    public Size[] m95g(int i10) {
        Size[] sizeArrMo100d = null;
        if (this.f90c.containsKey(Integer.valueOf(i10))) {
            if (this.f90c.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f90c.get(Integer.valueOf(i10)).clone();
        }
        try {
            sizeArrMo100d = this.f88a.mo100d(i10);
        } catch (Throwable th2) {
            C5931r1.m26573m("StreamConfigurationMapCompat", "Failed to get output sizes for " + i10, th2);
        }
        if (sizeArrMo100d != null && sizeArrMo100d.length != 0) {
            Size[] sizeArrM22044b = this.f89b.m22044b(sizeArrMo100d, i10);
            this.f90c.put(Integer.valueOf(i10), sizeArrM22044b);
            return (Size[]) sizeArrM22044b.clone();
        }
        C5931r1.m26572l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return sizeArrMo100d;
    }

    /* JADX INFO: renamed from: h */
    public StreamConfigurationMap m96h() {
        return this.f88a.mo97a();
    }
}
