package yi;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.Locale;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f37879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yi.c f37880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Connection f37881h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f37875a = null;
    public f b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Locale f37876c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f37877d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37878e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yi.c.a f37882i = new a();

    public class a implements yi.c.a {
        public a() {
        }

        @Override // yi.c.a
        public yi.c a(Context context) {
            return new d(context);
        }
    }

    /* JADX INFO: renamed from: yi.b$b, reason: collision with other inner class name */
    public static final class C0768b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37884a = new b();
    }

    public enum c {
        LOCALE_MODE_LOGIN_SIGN_UP,
        LOCALE_MODE_GENERAL_EXPERIENCE
    }

    public static Locale b(String str) {
        if (!str.contains("_")) {
            return new Locale(str);
        }
        String[] strArrSplit = str.split("_");
        return new Locale(strArrSplit[0], strArrSplit[1]);
    }

    public static b f() {
        return C0768b.f37884a;
    }

    @NonNull
    public final f c() {
        Locale localeE = e();
        if (localeE != null) {
            String country = localeE.getCountry();
            String language = localeE.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (!TextUtils.isEmpty(country)) {
                    language = language + "_" + country;
                }
                f fVarA = f.a(language);
                return fVarA != null ? fVarA : f.f37889d;
            }
        }
        return f.f37889d;
    }

    @NonNull
    public f d(Context context) {
        f fVar = this.b;
        if (fVar != null) {
            return fVar;
        }
        f fVarB = h(context).b();
        return fVarB == null ? c() : fVarB;
    }

    public Locale e() {
        return this.f37876c;
    }

    public c g() {
        return this.f37879f;
    }

    public final yi.c h(Context context) {
        if (this.f37880g == null) {
            this.f37880g = this.f37882i.a(context);
        }
        return this.f37880g;
    }

    public String i(Context context) {
        String strD = this.f37878e;
        if (strD == null && context != null) {
            q.i("rbx.locale", "mUGCLocaleCode is Empty");
            f fVarD = h(context).d();
            if (fVarD != null) {
                strD = fVarD.d();
            }
            if (strD == null) {
                q.h("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                strD = f.f37889d.d();
            }
        }
        q.i("rbx.locale", "mUGCLocaleCode value is: " + strD);
        return strD;
    }

    public f j() {
        return this.f37875a;
    }

    public boolean k(f fVar) {
        return this.f37875a.equals(fVar);
    }

    public final /* synthetic */ void l(Context context, JSONObject jSONObject) {
        f fVarB;
        try {
            String string = jSONObject.getString("localeId");
            if (string == null || string.isEmpty() || (fVarB = f.b(string)) == null || f().k(fVarB)) {
                return;
            }
            q.h("rbx.locale", "Receive new locale value from LUA " + fVarB.d() + " " + fVarB.c());
            o(fVarB, context);
            r(fVarB);
            t(context, string);
            n(fVarB, context);
        } catch (JSONException unused) {
            q.e("MessageBus", "Failed to get QR code image userId");
        }
    }

    public void m(final Context context) {
        this.f37881h = MessageBus.getInstance().subscribe("Locale.RobloxLocaleIdChanged", new Callback() { // from class: yi.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f37874a.l(context, jSONObject);
            }
        });
    }

    public boolean n(f fVar, Context context) {
        if (fVar == null) {
            return false;
        }
        boolean zK = k(fVar);
        boolean z10 = !zK;
        if (!zK && context != null) {
            h(context).f(fVar);
            w(context, fVar);
        }
        return z10;
    }

    public void o(f fVar, Context context) {
        p(fVar);
        h(context).c(this.b);
    }

    public void p(f fVar) {
        this.b = fVar;
    }

    public void q(Locale locale) {
        this.f37876c = locale;
    }

    public void r(f fVar) {
        this.f37877d = fVar;
    }

    public void s(c cVar) {
        this.f37879f = cVar;
    }

    public void t(Context context, String str) {
        this.f37878e = str;
        h(context).a(this.f37878e);
    }

    public void u(Context context) {
        f fVarE = this.f37875a;
        if (fVarE == null) {
            q.h("rbx.locale", "mUserLocale is empty");
            fVarE = h(context).e();
            if (fVarE == null) {
                q.h("rbx.locale", "No stored value for mUserLocale.");
                fVarE = c();
            }
        }
        q.h("rbx.locale", "Updating App configuration based on locale = " + fVarE);
        w(context, fVarE);
    }

    public final Context v(Context context, String str, Resources resources, Configuration configuration) {
        Locale localeB = b(str);
        Locale.setDefault(localeB);
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    public final Context w(Context context, f fVar) {
        this.f37875a = fVar;
        String strC = fVar.c();
        Resources resources = context.getResources();
        return v(context, strC, resources, resources.getConfiguration());
    }
}
