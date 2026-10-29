package p028b8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: b8.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1261i {

    /* JADX INFO: renamed from: b8.i$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public final a m7028a(String str, int i10) {
            mo6989e().put(str, String.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m7029b(String str, long j10) {
            mo6989e().put(str, String.valueOf(j10));
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m7030c(String str, String str2) {
            mo6989e().put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public abstract AbstractC1261i mo6988d();

        /* JADX INFO: renamed from: e */
        public abstract Map<String, String> mo6989e();

        /* JADX INFO: renamed from: f */
        public abstract a mo6990f(Map<String, String> map);

        /* JADX INFO: renamed from: g */
        public abstract a mo6991g(Integer num);

        /* JADX INFO: renamed from: h */
        public abstract a mo6992h(C1260h c1260h);

        /* JADX INFO: renamed from: i */
        public abstract a mo6993i(long j10);

        /* JADX INFO: renamed from: j */
        public abstract a mo6994j(String str);

        /* JADX INFO: renamed from: k */
        public abstract a mo6995k(long j10);
    }

    /* JADX INFO: renamed from: a */
    public static a m7022a() {
        return new C1254b.b().mo6990f(new HashMap());
    }

    /* JADX INFO: renamed from: b */
    public final String m7023b(String str) {
        String str2 = mo6982c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    public abstract Map<String, String> mo6982c();

    /* JADX INFO: renamed from: d */
    public abstract Integer mo6983d();

    /* JADX INFO: renamed from: e */
    public abstract C1260h mo6984e();

    /* JADX INFO: renamed from: f */
    public abstract long mo6985f();

    /* JADX INFO: renamed from: g */
    public final int m7024g(String str) {
        String str2 = mo6982c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final long m7025h(String str) {
        String str2 = mo6982c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, String> m7026i() {
        return Collections.unmodifiableMap(mo6982c());
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo6986j();

    /* JADX INFO: renamed from: k */
    public abstract long mo6987k();

    /* JADX INFO: renamed from: l */
    public a m7027l() {
        return new C1254b.b().mo6994j(mo6986j()).mo6991g(mo6983d()).mo6992h(mo6984e()).mo6993i(mo6985f()).mo6995k(mo6987k()).mo6990f(new HashMap(mo6982c()));
    }
}
