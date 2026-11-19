package vi;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class a extends xk.a {
    public static Context d() {
        return RobloxApplication.f();
    }

    @Override // xk.a
    public String a() {
        String strI = yi.b.f().i(d());
        if (strI == null) {
            return c();
        }
        q.i("rbx.locale", "ugcLocaleCode : " + strI);
        return strI;
    }

    @Override // xk.a
    public String b() {
        return d().getResources().getConfiguration().getLocales().get(0).toString();
    }

    @Override // xk.a
    public String c() {
        return yi.b.f().j().d();
    }
}
