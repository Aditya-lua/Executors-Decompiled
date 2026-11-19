package a0;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import g0.r1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f60a;
    public final d0.m b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, Size[]> f61c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size[]> f62d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Size[]> f63e = new HashMap();

    public interface a {
        StreamConfigurationMap a();

        Size[] b(Range<Integer> range);

        long c(int i10, Size size);

        Size[] d(int i10);

        int[] e();

        Size[] f();

        Range<Integer>[] g(Size size);

        Size[] h(int i10);
    }

    public u0(StreamConfigurationMap streamConfigurationMap, d0.m mVar) {
        this.f60a = new v0(streamConfigurationMap);
        this.b = mVar;
    }

    public static u0 i(StreamConfigurationMap streamConfigurationMap, d0.m mVar) {
        return new u0(streamConfigurationMap, mVar);
    }

    public Size[] a(int i10) {
        if (this.f62d.containsKey(Integer.valueOf(i10))) {
            if (this.f62d.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f62d.get(Integer.valueOf(i10)).clone();
        }
        Size[] sizeArrH = this.f60a.h(i10);
        if (sizeArrH != null && sizeArrH.length > 0) {
            sizeArrH = this.b.b(sizeArrH, i10);
        }
        this.f62d.put(Integer.valueOf(i10), sizeArrH);
        if (sizeArrH != null) {
            return (Size[]) sizeArrH.clone();
        }
        return null;
    }

    public Range<Integer>[] b(Size size) {
        return this.f60a.g(size);
    }

    public Size[] c() {
        return this.f60a.f();
    }

    public Size[] d(Range<Integer> range) {
        return this.f60a.b(range);
    }

    public int[] e() {
        int[] iArrE = this.f60a.e();
        if (iArrE == null) {
            return null;
        }
        return (int[]) iArrE.clone();
    }

    public long f(int i10, Size size) {
        try {
            return this.f60a.c(i10, size);
        } catch (RuntimeException e10) {
            r1.m("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i10 + " and size = " + size, e10);
            return 0L;
        }
    }

    public Size[] g(int i10) {
        Size[] sizeArrD = null;
        if (this.f61c.containsKey(Integer.valueOf(i10))) {
            if (this.f61c.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f61c.get(Integer.valueOf(i10)).clone();
        }
        try {
            sizeArrD = this.f60a.d(i10);
        } catch (Throwable th2) {
            r1.m("StreamConfigurationMapCompat", "Failed to get output sizes for " + i10, th2);
        }
        if (sizeArrD != null && sizeArrD.length != 0) {
            Size[] sizeArrB = this.b.b(sizeArrD, i10);
            this.f61c.put(Integer.valueOf(i10), sizeArrB);
            return (Size[]) sizeArrB.clone();
        }
        r1.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return sizeArrD;
    }

    public StreamConfigurationMap h() {
        return this.f60a.a();
    }
}
