package hv;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class m extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19864a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient x<?> f19865c;

    public m(x<?> xVar) {
        super(b(xVar));
        this.f19864a = xVar.b();
        this.b = xVar.h();
        this.f19865c = xVar;
    }

    public static String b(x<?> xVar) {
        Objects.requireNonNull(xVar, "response == null");
        return "HTTP " + xVar.b() + " " + xVar.h();
    }

    public int a() {
        return this.f19864a;
    }

    public String c() {
        return this.b;
    }
}
