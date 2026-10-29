package ni;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import gk.p;

/* JADX INFO: loaded from: classes2.dex */
public class a extends pk.a {
    public static Context d() {
        return RobloxApplication.f();
    }

    @Override // pk.a
    public String a() {
        String strI = qi.b.f().i(d());
        if (strI == null) {
            return c();
        }
        p.i("rbx.locale", "ugcLocaleCode : " + strI);
        return strI;
    }

    @Override // pk.a
    public String b() {
        return d().getResources().getConfiguration().getLocales().get(0).toString();
    }

    @Override // pk.a
    public String c() {
        return qi.b.f().j().d();
    }
}
