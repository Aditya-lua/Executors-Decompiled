package ni;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import p151gk.C6124q;
import p383qi.C10583b;
import pk.C10291a;

/* JADX INFO: renamed from: ni.a */
/* JADX INFO: loaded from: classes2.dex */
public class C9479a extends C10291a {
    /* JADX INFO: renamed from: d */
    public static Context m37342d() {
        return RobloxApplication.m14834f();
    }

    @Override // pk.C10291a
    /* JADX INFO: renamed from: a */
    public String mo37343a() {
        String strM40575i = C10583b.m40569f().m40575i(m37342d());
        if (strM40575i == null) {
            return mo37345c();
        }
        C6124q.m27064i("rbx.locale", "ugcLocaleCode : " + strM40575i);
        return strM40575i;
    }

    @Override // pk.C10291a
    /* JADX INFO: renamed from: b */
    public String mo37344b() {
        return m37342d().getResources().getConfiguration().getLocales().get(0).toString();
    }

    @Override // pk.C10291a
    /* JADX INFO: renamed from: c */
    public String mo37345c() {
        return C10583b.m40569f().m40576j().m40607d();
    }
}
