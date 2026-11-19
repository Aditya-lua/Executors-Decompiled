package aj;

import java.util.Locale;
import mi.k;
import mv.i0;
import ok.q;
import ok.y;
import org.json.JSONException;
import org.json.JSONObject;
import sw.d;
import sw.f;
import sw.x;
import yi.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: aj.a$a, reason: collision with other inner class name */
    public class C0014a implements f<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f491a;

        public C0014a(g gVar) {
            this.f491a = gVar;
        }

        @Override // sw.f
        public void a(d<i0> dVar, Throwable th2) {
            a.this.b(this.f491a);
        }

        @Override // sw.f
        public void b(d<i0> dVar, x<i0> xVar) {
            a.this.c(y.a(xVar), xVar.b(), this.f491a);
        }
    }

    public void a(String str, String str2, String str3, g gVar) {
        if (gVar != null) {
            gVar.a(yi.f.b(str), yi.f.b(str2), str3);
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
                bj.a aVar = new bj.a(new JSONObject(str));
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
        cl.g.d().d(k.a().b()).getMultipleLocales(language + "-" + country).L(new C0014a(gVar));
    }
}
