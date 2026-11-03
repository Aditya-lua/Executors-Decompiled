package li;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class a extends nk.a {
    public static Context d() {
        return RobloxApplication.f();
    }

    @Override // nk.a
    public String a() {
        String strI = oi.b.f().i(d());
        if (strI == null) {
            return c();
        }
        q.i("rbx.locale", "ugcLocaleCode : " + strI);
        return strI;
    }

    @Override // nk.a
    public String b() {
        return d().getResources().getConfiguration().getLocales().get(0).toString();
    }

    @Override // nk.a
    public String c() {
        return oi.b.f().j().d();
    }
}
