package p115f1;

import android.util.Range;

/* JADX INFO: renamed from: f1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5234a {

    /* JADX INFO: renamed from: a */
    public static final Range<Integer> f20287a = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final Range<Integer> f20288b = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: c */
    public static final AbstractC5234a f20289c = m24218a().mo24226c(0).mo24224a();

    /* JADX INFO: renamed from: f1.a$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC5234a mo24224a();

        /* JADX INFO: renamed from: b */
        public abstract a mo24225b(Range<Integer> range);

        /* JADX INFO: renamed from: c */
        public abstract a mo24226c(int i10);

        /* JADX INFO: renamed from: d */
        public abstract a mo24227d(Range<Integer> range);

        /* JADX INFO: renamed from: e */
        public abstract a mo24228e(int i10);
    }

    /* JADX INFO: renamed from: a */
    public static a m24218a() {
        return new C5242c.b().m24261f(-1).mo24228e(-1).mo24226c(-1).mo24225b(f20287a).mo24227d(f20288b);
    }

    /* JADX INFO: renamed from: b */
    public abstract Range<Integer> mo24219b();

    /* JADX INFO: renamed from: c */
    public abstract int mo24220c();

    /* JADX INFO: renamed from: d */
    public abstract Range<Integer> mo24221d();

    /* JADX INFO: renamed from: e */
    public abstract int mo24222e();

    /* JADX INFO: renamed from: f */
    public abstract int mo24223f();
}
