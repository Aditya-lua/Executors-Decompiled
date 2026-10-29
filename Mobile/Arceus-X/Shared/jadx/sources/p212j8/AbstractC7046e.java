package p212j8;

import backtraceio.library.services.BacktraceMetrics;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: renamed from: j8.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7046e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC7046e f27620a = m29760a().mo29745f(10485760).mo29743d(MlKitException.CODE_SCANNER_UNAVAILABLE).mo29741b(BacktraceMetrics.defaultTimeBetweenRetriesMs).mo29742c(604800000).mo29744e(81920).mo29740a();

    /* JADX INFO: renamed from: j8.e$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC7046e mo29740a();

        /* JADX INFO: renamed from: b */
        public abstract a mo29741b(int i10);

        /* JADX INFO: renamed from: c */
        public abstract a mo29742c(long j10);

        /* JADX INFO: renamed from: d */
        public abstract a mo29743d(int i10);

        /* JADX INFO: renamed from: e */
        public abstract a mo29744e(int i10);

        /* JADX INFO: renamed from: f */
        public abstract a mo29745f(long j10);
    }

    /* JADX INFO: renamed from: a */
    public static a m29760a() {
        return new C7038a.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo29735b();

    /* JADX INFO: renamed from: c */
    public abstract long mo29736c();

    /* JADX INFO: renamed from: d */
    public abstract int mo29737d();

    /* JADX INFO: renamed from: e */
    public abstract int mo29738e();

    /* JADX INFO: renamed from: f */
    public abstract long mo29739f();
}
