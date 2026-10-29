package si;

import ei.k;
import gk.p;
import java.util.Locale;
import jv.d;
import jv.f;
import jv.x;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import qi.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: si.a$a, reason: collision with other inner class name */
    public class C0544a implements f<ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31143a;

        public C0544a(g gVar) {
            this.f31143a = gVar;
        }

        @Override // jv.f
        public void a(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            a.this.c(gk.x.a(xVar), xVar.b(), this.f31143a);
        }

        @Override // jv.f
        public void b(d<ResponseBody> dVar, Throwable th2) {
            a.this.b(this.f31143a);
        }
    }

    public void a(String str, String str2, String str3, g gVar) {
        if (gVar != null) {
            gVar.a(qi.f.b(str), qi.f.b(str2), str3);
        }
    }

    public void b(g gVar) {
        p.h("rbx.locale", " api failure");
        a(null, null, null, gVar);
    }

    public void c(String str, int i10, g gVar) {
        String strA;
        String strC;
        p.h("rbx.locale", "response: " + str + " ,response code:" + i10);
        String str2 = null;
        if (i10 == 200) {
            try {
                ti.a aVar = new ti.a(new JSONObject(str));
                String strB = aVar.b();
                strA = aVar.a();
                str2 = strB;
                strC = aVar.c();
            } catch (JSONException e10) {
                e10.printStackTrace();
                strC = null;
                strA = null;
            }
            p.h("rbx.locale", "loginSignUpLocale = " + str2);
            p.h("rbx.locale", "generalExperienceLocale = " + strA);
            p.h("rbx.locale", "ugcLocale = " + strC);
            a(str2, strA, strC, gVar);
        }
        p.h("rbx.locale", "response code != 200, response code = " + i10);
        strC = null;
        strA = null;
        p.h("rbx.locale", "loginSignUpLocale = " + str2);
        p.h("rbx.locale", "generalExperienceLocale = " + strA);
        p.h("rbx.locale", "ugcLocale = " + strC);
        a(str2, strA, strC, gVar);
    }

    public void d(Locale locale, g gVar) {
        if (locale == null) {
            p.h("rbx.locale", "device locale null");
            a(null, null, null, gVar);
            return;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        p.h("rbx.locale", "deviceLocale: " + language + "-" + country);
        vk.g.d().f(k.a().b()).a(language + "-" + country).B(new C0544a(gVar));
    }
}
