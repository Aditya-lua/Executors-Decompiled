package mk;

import cl.g;
import mv.i0;
import ok.q;
import ok.y;
import org.json.JSONException;
import org.json.JSONObject;
import sw.d;
import sw.f;
import sw.x;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: mk.a$a, reason: collision with other inner class name */
    public class C0454a implements f<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lk.a f23319a;

        public C0454a(lk.a aVar) {
            this.f23319a = aVar;
        }

        @Override // sw.f
        public void a(d<i0> dVar, Throwable th2) {
            a.this.b(this.f23319a);
        }

        @Override // sw.f
        public void b(d<i0> dVar, x<i0> xVar) {
            a.this.c(y.a(xVar), xVar.b(), this.f23319a);
        }
    }

    public void a(lk.a aVar, String str) {
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void b(lk.a aVar) {
        q.h("rbx.accountsettings", " api failure");
        a(aVar, null);
    }

    public void c(String str, int i10, lk.a aVar) {
        String strA = null;
        if (i10 == 200) {
            try {
                strA = new b(new JSONObject(str)).a();
            } catch (JSONException e10) {
                e10.printStackTrace();
                q.d("JSONException thrown while parsing response to fetch user theme from server. Exception message: " + e10.getMessage());
            }
        } else {
            q.h("rbx.accountsettings", "response code != 200, response code = " + i10);
        }
        a(aVar, strA);
    }

    public void d(long j10, lk.a aVar) {
        g.d().h().getUserSelectedTheme(j10).L(new C0454a(aVar));
    }
}
