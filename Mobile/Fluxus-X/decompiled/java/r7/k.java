package r7;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s7.c.a f30581f = s7.c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s7.c.a f30582g = s7.c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n7.a f30583a;
    public n7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n7.b f30584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n7.b f30585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n7.b f30586e;

    public final void a(s7.c cVar, g7.i iVar) {
        cVar.c();
        String strN = BuildConfig.FLAVOR;
        while (cVar.f()) {
            int iS = cVar.s(f30582g);
            if (iS != 0) {
                if (iS == 1) {
                    strN.getClass();
                    switch (strN) {
                        case "Distance":
                            this.f30585d = d.e(cVar, iVar);
                            break;
                        case "Opacity":
                            this.b = d.f(cVar, iVar, false);
                            break;
                        case "Direction":
                            this.f30584c = d.f(cVar, iVar, false);
                            break;
                        case "Shadow Color":
                            this.f30583a = d.c(cVar, iVar);
                            break;
                        case "Softness":
                            this.f30586e = d.e(cVar, iVar);
                            break;
                        default:
                            cVar.w();
                            break;
                    }
                } else {
                    cVar.u();
                    cVar.w();
                }
            } else {
                strN = cVar.n();
            }
        }
        cVar.e();
    }

    public j b(s7.c cVar, g7.i iVar) {
        n7.b bVar;
        n7.b bVar2;
        n7.b bVar3;
        n7.b bVar4;
        while (cVar.f()) {
            if (cVar.s(f30581f) != 0) {
                cVar.u();
                cVar.w();
            } else {
                cVar.b();
                while (cVar.f()) {
                    a(cVar, iVar);
                }
                cVar.d();
            }
        }
        n7.a aVar = this.f30583a;
        if (aVar == null || (bVar = this.b) == null || (bVar2 = this.f30584c) == null || (bVar3 = this.f30585d) == null || (bVar4 = this.f30586e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
