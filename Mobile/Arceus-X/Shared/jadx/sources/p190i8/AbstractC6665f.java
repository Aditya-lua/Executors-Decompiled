package p190i8;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p267l8.InterfaceC8011a;
import p569y7.EnumC13118e;

/* JADX INFO: renamed from: i8.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6665f {

    /* JADX INFO: renamed from: i8.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC8011a f25704a;

        /* JADX INFO: renamed from: b */
        public Map<EnumC13118e, b> f25705b = new HashMap();

        /* JADX INFO: renamed from: a */
        public a m28748a(EnumC13118e enumC13118e, b bVar) {
            this.f25705b.put(enumC13118e, bVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC6665f m28749b() {
            if (this.f25704a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f25705b.keySet().size() < EnumC13118e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC13118e, b> map = this.f25705b;
            this.f25705b = new HashMap();
            return AbstractC6665f.m28741d(this.f25704a, map);
        }

        /* JADX INFO: renamed from: c */
        public a m28750c(InterfaceC8011a interfaceC8011a) {
            this.f25704a = interfaceC8011a;
            return this;
        }
    }

    /* JADX INFO: renamed from: i8.f$b */
    public static abstract class b {

        /* JADX INFO: renamed from: i8.f$b$a */
        public static abstract class a {
            /* JADX INFO: renamed from: a */
            public abstract b mo28732a();

            /* JADX INFO: renamed from: b */
            public abstract a mo28733b(long j10);

            /* JADX INFO: renamed from: c */
            public abstract a mo28734c(Set<c> set);

            /* JADX INFO: renamed from: d */
            public abstract a mo28735d(long j10);
        }

        /* JADX INFO: renamed from: a */
        public static a m28751a() {
            return new C6662c.b().mo28734c(Collections.EMPTY_SET);
        }

        /* JADX INFO: renamed from: b */
        public abstract long mo28729b();

        /* JADX INFO: renamed from: c */
        public abstract Set<c> mo28730c();

        /* JADX INFO: renamed from: d */
        public abstract long mo28731d();
    }

    /* JADX INFO: renamed from: i8.f$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX INFO: renamed from: b */
    public static a m28740b() {
        return new a();
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6665f m28741d(InterfaceC8011a interfaceC8011a, Map<EnumC13118e, b> map) {
        return new C6661b(interfaceC8011a, map);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC6665f m28742f(InterfaceC8011a interfaceC8011a) {
        return m28740b().m28748a(EnumC13118e.DEFAULT, b.m28751a().mo28733b(30000L).mo28735d(86400000L).mo28732a()).m28748a(EnumC13118e.HIGHEST, b.m28751a().mo28733b(1000L).mo28735d(86400000L).mo28732a()).m28748a(EnumC13118e.VERY_LOW, b.m28751a().mo28733b(86400000L).mo28735d(86400000L).mo28734c(m28743i(c.DEVICE_IDLE)).mo28732a()).m28750c(interfaceC8011a).m28749b();
    }

    /* JADX INFO: renamed from: i */
    public static <T> Set<T> m28743i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* JADX INFO: renamed from: a */
    public final long m28744a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    /* JADX INFO: renamed from: c */
    public JobInfo.Builder m28745c(JobInfo.Builder builder, EnumC13118e enumC13118e, long j10, int i10) {
        builder.setMinimumLatency(m28746g(enumC13118e, j10, i10));
        m28747j(builder, mo28728h().get(enumC13118e).mo28730c());
        return builder;
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC8011a mo28727e();

    /* JADX INFO: renamed from: g */
    public long m28746g(EnumC13118e enumC13118e, long j10, int i10) {
        long jMo33091a = j10 - mo28727e().mo33091a();
        b bVar = mo28728h().get(enumC13118e);
        return Math.min(Math.max(m28744a(i10, bVar.mo28729b()), jMo33091a), bVar.mo28731d());
    }

    /* JADX INFO: renamed from: h */
    public abstract Map<EnumC13118e, b> mo28728h();

    /* JADX INFO: renamed from: j */
    public final void m28747j(JobInfo.Builder builder, Set<c> set) {
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
