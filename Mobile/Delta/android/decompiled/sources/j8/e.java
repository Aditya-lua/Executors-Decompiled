package j8;

import backtraceio.library.services.BacktraceMetrics;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f21119a = a().f(10485760).d(MlKitException.CODE_SCANNER_UNAVAILABLE).b(BacktraceMetrics.defaultTimeBetweenRetriesMs).c(604800000).e(81920).a();

    public static abstract class a {
        public abstract e a();

        public abstract a b(int i10);

        public abstract a c(long j10);

        public abstract a d(int i10);

        public abstract a e(int i10);

        public abstract a f(long j10);
    }

    public static a a() {
        return new j8.a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
