package ek;

import gk.p;
import jv.d;
import jv.f;
import jv.x;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import vk.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: ek.a$a, reason: collision with other inner class name */
    public class C0285a implements f<ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dk.a f15625a;

        public C0285a(dk.a aVar) {
            this.f15625a = aVar;
        }

        @Override // jv.f
        public void a(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            a.this.c(gk.x.a(xVar), xVar.b(), this.f15625a);
        }

        @Override // jv.f
        public void b(d<ResponseBody> dVar, Throwable th2) {
            a.this.b(this.f15625a);
        }
    }

    public void a(dk.a aVar, String str) {
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void b(dk.a aVar) {
        p.h("rbx.accountsettings", " api failure");
        a(aVar, null);
    }

    public void c(String str, int i10, dk.a aVar) {
        String strA = null;
        if (i10 == 200) {
            try {
                strA = new b(new JSONObject(str)).a();
            } catch (JSONException e10) {
                e10.printStackTrace();
                p.d("JSONException thrown while parsing response to fetch user theme from server. Exception message: " + e10.getMessage());
            }
        } else {
            p.h("rbx.accountsettings", "response code != 200, response code = " + i10);
        }
        a(aVar, strA);
    }

    public void d(long j10, dk.a aVar) {
        g.d().h().a(j10).B(new C0285a(aVar));
    }
}
