package z8;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f39175a;
    public String b;

    public f() {
        this.f39175a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.b = str;
        return this;
    }

    public f(g gVar) {
        this.f39175a = Boolean.FALSE;
        g.b(gVar);
        this.f39175a = Boolean.valueOf(gVar.b);
        this.b = gVar.f39178c;
    }
}
