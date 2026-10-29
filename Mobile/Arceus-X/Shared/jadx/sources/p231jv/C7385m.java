package p231jv;

import java.util.Objects;

/* JADX INFO: renamed from: jv.m */
/* JADX INFO: loaded from: classes2.dex */
public class C7385m extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f28316a;

    /* JADX INFO: renamed from: b */
    public final String f28317b;

    /* JADX INFO: renamed from: c */
    public final transient C7396x<?> f28318c;

    public C7385m(C7396x<?> c7396x) {
        super(m30586b(c7396x));
        this.f28316a = c7396x.m30654b();
        this.f28317b = c7396x.m30658h();
        this.f28318c = c7396x;
    }

    /* JADX INFO: renamed from: b */
    public static String m30586b(C7396x<?> c7396x) {
        Objects.requireNonNull(c7396x, "response == null");
        return "HTTP " + c7396x.m30654b() + " " + c7396x.m30658h();
    }

    /* JADX INFO: renamed from: a */
    public int m30587a() {
        return this.f28316a;
    }

    /* JADX INFO: renamed from: c */
    public String m30588c() {
        return this.f28317b;
    }
}
