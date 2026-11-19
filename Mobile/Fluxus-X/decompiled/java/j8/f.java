package j8;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m8.a f20157a;
        public Map<z7.e, b> b = new HashMap();

        public a a(z7.e eVar, b bVar) {
            this.b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f20157a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() < z7.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<z7.e, b> map = this.b;
            this.b = new HashMap();
            return f.d(this.f20157a, map);
        }

        public a c(m8.a aVar) {
            this.f20157a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new j8.c.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static f d(m8.a aVar, Map<z7.e, b> map) {
        return new j8.b(aVar, map);
    }

    public static f f(m8.a aVar) {
        return b().a(z7.e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(z7.e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(z7.e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, z7.e eVar, long j10, int i10) {
        builder.setMinimumLatency(g(eVar, j10, i10));
        j(builder, h().get(eVar).c());
        return builder;
    }

    public abstract m8.a e();

    public long g(z7.e eVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = h().get(eVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    public abstract Map<z7.e, b> h();

    public final void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
