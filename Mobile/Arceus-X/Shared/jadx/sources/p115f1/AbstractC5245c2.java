package p115f1;

import android.util.Range;
import java.util.Arrays;

/* JADX INFO: renamed from: f1.c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5245c2 {

    /* JADX INFO: renamed from: a */
    public static final Range<Integer> f20322a = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final C5235a0 f20323b;

    /* JADX INFO: renamed from: f1.c2$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC5245c2 mo24268a();

        /* JADX INFO: renamed from: b */
        public abstract a mo24269b(int i10);

        /* JADX INFO: renamed from: c */
        public abstract a mo24270c(Range<Integer> range);

        /* JADX INFO: renamed from: d */
        public abstract a mo24271d(int i10);

        /* JADX INFO: renamed from: e */
        public abstract a mo24272e(C5235a0 c5235a0);
    }

    static {
        C5306x c5306x = C5306x.f20631c;
        f20323b = C5235a0.m24232e(Arrays.asList(c5306x, C5306x.f20630b, C5306x.f20629a), C5282p.m24344a(c5306x));
    }

    /* JADX INFO: renamed from: a */
    public static a m24262a() {
        return new C5276n.b().mo24272e(f20323b).mo24271d(0).mo24270c(f20322a).mo24269b(-1);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo24263b();

    /* JADX INFO: renamed from: c */
    public abstract Range<Integer> mo24264c();

    /* JADX INFO: renamed from: d */
    public abstract int mo24265d();

    /* JADX INFO: renamed from: e */
    public abstract C5235a0 mo24266e();

    /* JADX INFO: renamed from: f */
    public abstract a mo24267f();
}
