package ck;

import ek.q;
import ek.y;
import hv.d;
import hv.f;
import hv.x;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import tk.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: ck.a$a, reason: collision with other inner class name */
    public class C0106a implements f<ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bk.a f5043a;

        public C0106a(bk.a aVar) {
            this.f5043a = aVar;
        }

        @Override // hv.f
        public void a(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            a.this.c(y.a(xVar), xVar.b(), this.f5043a);
        }

        @Override // hv.f
        public void b(d<ResponseBody> dVar, Throwable th2) {
            a.this.b(this.f5043a);
        }
    }

    public void a(bk.a aVar, String str) {
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void b(bk.a aVar) {
        q.h("rbx.accountsettings", " api failure");
        a(aVar, null);
    }

    public void c(String str, int i10, bk.a aVar) {
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

    public void d(long j10, bk.a aVar) {
        g.d().h().a(j10).m(new C0106a(aVar));
    }
}
