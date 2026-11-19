package dl;

import java.util.concurrent.TimeUnit;
import mv.d0;
import mv.o;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f12500a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12502d;

    public class a implements dw.a.c {
        public a() {
        }

        @Override // dw.a.c
        public void a(String str) {
            q.b("rbx.http", str);
        }
    }

    public c() {
        this(null);
    }

    @Override // dl.f
    public d0 a() {
        dw.a aVar = new dw.a(new a());
        aVar.e(dw.a.b.BODY);
        d0.a aVar2 = new d0.a();
        aVar2.a(aVar);
        String str = this.f12502d;
        if (str != null) {
            aVar2.b(new fl.a(str));
        }
        aVar2.b(new fl.b());
        long j10 = this.b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.f(j10, timeUnit);
        aVar2.T(this.f12501c, timeUnit);
        o oVarE = this.f12500a;
        if (oVarE == null) {
            oVarE = j.e();
        }
        aVar2.h(oVarE);
        aVar2.l(false);
        return aVar2.c();
    }

    public c(o oVar) {
        this(oVar, 30, 30, cl.g.e());
    }

    public c(o oVar, int i10, int i11, String str) {
        this.f12500a = oVar;
        this.b = i10;
        this.f12501c = i11;
        this.f12502d = str;
    }
}
