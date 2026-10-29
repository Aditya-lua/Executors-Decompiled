package l7;

/* JADX INFO: loaded from: classes3.dex */
public class g {
    public static final g b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.i<String, f7.i> f22979a = new w1.i<>(20);

    public static g b() {
        return b;
    }

    public f7.i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f22979a.d(str);
    }

    public void c(String str, f7.i iVar) {
        if (str == null) {
            return;
        }
        this.f22979a.e(str, iVar);
    }
}
