package nn;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.b0 f26374a;
    public final sn.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qn.b0 f26375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sn.h f26376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sn.h f26377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f26378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f26379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26380h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26381i = false;

    public e(qn.b0 b0Var, sn.h hVar, qn.b0 b0Var2, sn.h hVar2, sn.h hVar3, e eVar, g gVar) {
        this.f26374a = b0Var;
        this.b = hVar;
        this.f26375c = b0Var2;
        this.f26376d = hVar2;
        this.f26377e = hVar3;
        this.f26378f = eVar;
        this.f26379g = gVar;
    }

    public static e a(qn.b0 b0Var, sn.h hVar, sn.h hVar2, e eVar, g gVar) {
        return new e(null, null, b0Var, hVar, hVar2, eVar, gVar);
    }

    public static e b(qn.b0 b0Var, sn.h hVar, qn.b0 b0Var2, sn.h hVar2, sn.h hVar3, e eVar, g gVar) {
        return new e(b0Var, hVar, b0Var2, hVar2, hVar3, eVar, gVar);
    }
}
