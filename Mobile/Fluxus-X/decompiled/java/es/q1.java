package es;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f14419a;

    public q1(p1 p1Var) {
        this.f14419a = p1Var;
    }

    public static wt.i<o1.a> b(p1 p1Var) {
        return wt.e.a(new q1(p1Var));
    }

    @Override // es.o1.a
    public o1 a(String str, String str2, String str3, String str4) {
        return this.f14419a.b(str, str2, str3, str4);
    }
}
