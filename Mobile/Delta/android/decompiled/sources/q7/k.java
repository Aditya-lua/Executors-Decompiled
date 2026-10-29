package q7;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r7.c.a f29251f = r7.c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r7.c.a f29252g = r7.c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m7.a f29253a;
    public m7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m7.b f29254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m7.b f29255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m7.b f29256e;

    public final void a(r7.c cVar, f7.i iVar) {
        cVar.c();
        String strM = "";
        while (cVar.f()) {
            int iR = cVar.r(f29252g);
            if (iR != 0) {
                if (iR == 1) {
                    strM.getClass();
                    switch (strM) {
                        case "Distance":
                            this.f29255d = d.e(cVar, iVar);
                            break;
                        case "Opacity":
                            this.b = d.f(cVar, iVar, false);
                            break;
                        case "Direction":
                            this.f29254c = d.f(cVar, iVar, false);
                            break;
                        case "Shadow Color":
                            this.f29253a = d.c(cVar, iVar);
                            break;
                        case "Softness":
                            this.f29256e = d.e(cVar, iVar);
                            break;
                        default:
                            cVar.u();
                            break;
                    }
                } else {
                    cVar.s();
                    cVar.u();
                }
            } else {
                strM = cVar.m();
            }
        }
        cVar.e();
    }

    public j b(r7.c cVar, f7.i iVar) {
        m7.b bVar;
        m7.b bVar2;
        m7.b bVar3;
        m7.b bVar4;
        while (cVar.f()) {
            if (cVar.r(f29251f) != 0) {
                cVar.s();
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    a(cVar, iVar);
                }
                cVar.d();
            }
        }
        m7.a aVar = this.f29253a;
        if (aVar == null || (bVar = this.b) == null || (bVar2 = this.f29254c) == null || (bVar3 = this.f29255d) == null || (bVar4 = this.f29256e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
