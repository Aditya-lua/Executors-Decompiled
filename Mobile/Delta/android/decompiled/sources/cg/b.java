package cg;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f4930a;

    public static b b() {
        if (f4930a == null) {
            f4930a = new b();
        }
        return f4930a;
    }

    @Override // cg.a
    public long a() {
        return System.currentTimeMillis();
    }
}
