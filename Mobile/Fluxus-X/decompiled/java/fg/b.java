package fg;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f16105a;

    public static b b() {
        if (f16105a == null) {
            f16105a = new b();
        }
        return f16105a;
    }

    @Override // fg.a
    public long a() {
        return System.currentTimeMillis();
    }
}
