package si;

import java.util.Locale;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p104ei.C5133k;
import p151gk.C6124q;
import p151gk.C6132y;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7378f;
import p383qi.C10587f;
import p383qi.InterfaceC10588g;
import p448ti.C11661a;
import p493vk.C12225g;

/* JADX INFO: renamed from: si.a */
/* JADX INFO: loaded from: classes2.dex */
public class C11385a {

    /* JADX INFO: renamed from: si.a$a */
    public class a implements InterfaceC7378f<ResponseBody> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC10588g f40266a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceC10588g interfaceC10588g) {
            this.f40266a = interfaceC10588g;
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<ResponseBody> interfaceC7376d, C7396x<ResponseBody> c7396x) {
            C11385a.this.m42703c(C6132y.m27103a(c7396x), c7396x.m30654b(), this.f40266a);
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<ResponseBody> interfaceC7376d, Throwable th2) {
            C11385a.this.m42702b(this.f40266a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42701a(String str, String str2, String str3, InterfaceC10588g interfaceC10588g) {
        if (interfaceC10588g != null) {
            interfaceC10588g.mo40608a(C10587f.m40605b(str), C10587f.m40605b(str2), str3);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42702b(InterfaceC10588g interfaceC10588g) {
        C6124q.m27063h("rbx.locale", " api failure");
        m42701a(null, null, null, interfaceC10588g);
    }

    /* JADX INFO: renamed from: c */
    public void m42703c(String str, int i10, InterfaceC10588g interfaceC10588g) {
        String strM43772a;
        String strM43774c;
        C6124q.m27063h("rbx.locale", "response: " + str + " ,response code:" + i10);
        String str2 = null;
        if (i10 == 200) {
            try {
                C11661a c11661a = new C11661a(new JSONObject(str));
                String strM43773b = c11661a.m43773b();
                strM43772a = c11661a.m43772a();
                str2 = strM43773b;
                strM43774c = c11661a.m43774c();
            } catch (JSONException e10) {
                e10.printStackTrace();
                strM43774c = null;
                strM43772a = null;
            }
            C6124q.m27063h("rbx.locale", "loginSignUpLocale = " + str2);
            C6124q.m27063h("rbx.locale", "generalExperienceLocale = " + strM43772a);
            C6124q.m27063h("rbx.locale", "ugcLocale = " + strM43774c);
            m42701a(str2, strM43772a, strM43774c, interfaceC10588g);
        }
        C6124q.m27063h("rbx.locale", "response code != 200, response code = " + i10);
        strM43774c = null;
        strM43772a = null;
        C6124q.m27063h("rbx.locale", "loginSignUpLocale = " + str2);
        C6124q.m27063h("rbx.locale", "generalExperienceLocale = " + strM43772a);
        C6124q.m27063h("rbx.locale", "ugcLocale = " + strM43774c);
        m42701a(str2, strM43772a, strM43774c, interfaceC10588g);
    }

    /* JADX INFO: renamed from: d */
    public void m42704d(Locale locale, InterfaceC10588g interfaceC10588g) {
        if (locale == null) {
            C6124q.m27063h("rbx.locale", "device locale null");
            m42701a(null, null, null, interfaceC10588g);
            return;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        C6124q.m27063h("rbx.locale", "deviceLocale: " + language + "-" + country);
        C12225g.m45326d().mo45320f(C5133k.m23938a().m23939b()).m50307a(language + "-" + country).mo30571B(new a(interfaceC10588g));
    }
}
