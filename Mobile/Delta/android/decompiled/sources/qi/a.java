package qi;

import ci.k;
import ek.q;
import ek.y;
import hv.d;
import hv.f;
import hv.x;
import java.util.Locale;
import oi.g;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: qi.a$a, reason: collision with other inner class name */
    public class C0517a implements f<ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29890a;

        public C0517a(g gVar) {
            this.f29890a = gVar;
        }

        @Override // hv.f
        public void a(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            a.this.c(y.a(xVar), xVar.b(), this.f29890a);
        }

        @Override // hv.f
        public void b(d<ResponseBody> dVar, Throwable th2) {
            a.this.b(this.f29890a);
        }
    }

    public void a(String str, String str2, String str3, g gVar) {
        if (gVar != null) {
            gVar.a(oi.f.b(str), oi.f.b(str2), str3);
        }
    }

    public void b(g gVar) {
        q.h("rbx.locale", " api failure");
        a(null, null, null, gVar);
    }

    public void c(String str, int i10, g gVar) {
        String strA;
        String strC;
        q.h("rbx.locale", "response: " + str + " ,response code:" + i10);
        String str2 = null;
        if (i10 == 200) {
            try {
                ri.a aVar = new ri.a(new JSONObject(str));
                String strB = aVar.b();
                strA = aVar.a();
                str2 = strB;
                strC = aVar.c();
            } catch (JSONException e10) {
                e10.printStackTrace();
                strC = null;
                strA = null;
            }
            q.h("rbx.locale", "loginSignUpLocale = " + str2);
            q.h("rbx.locale", "generalExperienceLocale = " + strA);
            q.h("rbx.locale", "ugcLocale = " + strC);
            a(str2, strA, strC, gVar);
        }
        q.h("rbx.locale", "response code != 200, response code = " + i10);
        strC = null;
        strA = null;
        q.h("rbx.locale", "loginSignUpLocale = " + str2);
        q.h("rbx.locale", "generalExperienceLocale = " + strA);
        q.h("rbx.locale", "ugcLocale = " + strC);
        a(str2, strA, strC, gVar);
    }

    public void d(Locale locale, g gVar) {
        if (locale == null) {
            q.h("rbx.locale", "device locale null");
            a(null, null, null, gVar);
            return;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        q.h("rbx.locale", "deviceLocale: " + language + "-" + country);
        tk.g.d().e(k.a().b()).a(language + "-" + country).m(new C0517a(gVar));
    }
}
