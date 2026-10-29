package p106ek;

import dk.InterfaceC4632a;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;
import p151gk.C6132y;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p231jv.InterfaceC7378f;
import p493vk.C12225g;

/* JADX INFO: renamed from: ek.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5158a {

    /* JADX INFO: renamed from: ek.a$a */
    public class a implements InterfaceC7378f<ResponseBody> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4632a f20065a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceC4632a interfaceC4632a) {
            this.f20065a = interfaceC4632a;
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: a */
        public void mo23948a(InterfaceC7376d<ResponseBody> interfaceC7376d, C7396x<ResponseBody> c7396x) {
            C5158a.this.m23994c(C6132y.m27103a(c7396x), c7396x.m30654b(), this.f20065a);
        }

        @Override // p231jv.InterfaceC7378f
        /* JADX INFO: renamed from: b */
        public void mo23949b(InterfaceC7376d<ResponseBody> interfaceC7376d, Throwable th2) {
            C5158a.this.m23993b(this.f20065a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23992a(InterfaceC4632a interfaceC4632a, String str) {
        if (interfaceC4632a != null) {
            interfaceC4632a.mo22852a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23993b(InterfaceC4632a interfaceC4632a) {
        C6124q.m27063h("rbx.accountsettings", " api failure");
        m23992a(interfaceC4632a, null);
    }

    /* JADX INFO: renamed from: c */
    public void m23994c(String str, int i10, InterfaceC4632a interfaceC4632a) {
        String strM23996a = null;
        if (i10 == 200) {
            try {
                strM23996a = new C5159b(new JSONObject(str)).m23996a();
            } catch (JSONException e10) {
                e10.printStackTrace();
                C6124q.m27059d("JSONException thrown while parsing response to fetch user theme from server. Exception message: " + e10.getMessage());
            }
        } else {
            C6124q.m27063h("rbx.accountsettings", "response code != 200, response code = " + i10);
        }
        m23992a(interfaceC4632a, strM23996a);
    }

    /* JADX INFO: renamed from: d */
    public void m23995d(long j10, InterfaceC4632a interfaceC4632a) {
        C12225g.m45326d().mo45322h().m50304a(j10).mo30571B(new a(interfaceC4632a));
    }
}
