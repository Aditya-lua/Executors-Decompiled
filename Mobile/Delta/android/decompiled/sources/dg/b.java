package dg;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f14768a;

    public static b b() {
        if (f14768a == null) {
            f14768a = new b();
        }
        return f14768a;
    }

    @Override // dg.a
    public long a() {
        return System.currentTimeMillis();
    }
}
