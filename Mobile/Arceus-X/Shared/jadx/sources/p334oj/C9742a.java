package p334oj;

import android.content.Context;
import java.util.Map;
import p104ei.C5125c;
import p151gk.C6130w;
import p222jj.C7193r;
import p222jj.C7195t;
import p222jj.C7199x;
import p360pj.InterfaceC10290f;
import sg.C11356t0;
import th.C11659h;
import vi.C12211b;

/* JADX INFO: renamed from: oj.a */
/* JADX INFO: loaded from: classes2.dex */
public class C9742a {
    /* JADX INFO: renamed from: a */
    public String m38544a(Context context, String str, C7199x c7199x) {
        return c7199x.m30120a(context, str);
    }

    /* JADX INFO: renamed from: b */
    public final String m38545b(Context context) {
        return C6130w.m27099a(context);
    }

    /* JADX INFO: renamed from: c */
    public final C7199x m38546c() {
        return new C7199x();
    }

    /* JADX INFO: renamed from: d */
    public void m38547d(Context context, Map<String, String> map) {
        if (context == null || map == null || C7195t.m30098g().m30106i(context)) {
            return;
        }
        C12211b.m45200f().m45210l(context);
        C5125c.m23921e(context);
        String strM38544a = m38544a(context, C7193r.m30069k().m30083n(context), m38546c());
        String strM38545b = m38545b(context);
        InterfaceC10290f interfaceC10290fM38569a = new C9753l().m38569a(map);
        if (interfaceC10290fM38569a.mo39539k() && strM38545b.equals("foreground")) {
            return;
        }
        C11356t0.m42550t("v" + interfaceC10290fM38569a.mo39542n(), strM38544a, interfaceC10290fM38569a.mo39531c(), interfaceC10290fM38569a.getId(), strM38545b, interfaceC10290fM38569a.mo39542n(), interfaceC10290fM38569a.mo39530b());
        if (C11659h.m43403a().mo43487L5()) {
            C11356t0.m42551u("v" + interfaceC10290fM38569a.mo39542n(), interfaceC10290fM38569a, null);
        }
        InterfaceC9743b interfaceC9743bM38570a = new C9754m().m38570a(interfaceC10290fM38569a);
        if (interfaceC9743bM38570a != null) {
            interfaceC9743bM38570a.mo38548a(context, interfaceC10290fM38569a);
        }
    }
}
