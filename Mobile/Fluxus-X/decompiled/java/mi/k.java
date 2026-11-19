package mi;

import mv.d0;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f23267a;
    public int b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23268c = 5;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f23269a = new k();
    }

    public static k a() {
        return a.f23269a;
    }

    public d0 b() {
        if (this.f23267a == null) {
            this.f23267a = new dl.c(null, this.b, this.f23268c, cl.g.e()).a();
        }
        return this.f23267a;
    }
}
