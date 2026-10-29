package qi;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import gk.p;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f29401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qi.c f29402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Connection f29403h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f29397a = null;
    public f b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Locale f29398c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f29399d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29400e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qi.c.a f29404i = new a();

    public class a implements qi.c.a {
        public a() {
        }

        @Override // qi.c.a
        public qi.c a(Context context) {
            return new d(context);
        }
    }

    /* JADX INFO: renamed from: qi.b$b, reason: collision with other inner class name */
    public static final class C0517b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29406a = new b();
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
        return C0517b.f29406a;
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
                return fVarA != null ? fVarA : f.f29411d;
            }
        }
        return f.f29411d;
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
        return this.f29398c;
    }

    public c g() {
        return this.f29401f;
    }

    public final qi.c h(Context context) {
        if (this.f29402g == null) {
            this.f29402g = this.f29404i.a(context);
        }
        return this.f29402g;
    }

    public String i(Context context) {
        String strD = this.f29400e;
        if (strD == null && context != null) {
            p.i("rbx.locale", "mUGCLocaleCode is Empty");
            f fVarD = h(context).d();
            if (fVarD != null) {
                strD = fVarD.d();
            }
            if (strD == null) {
                p.h("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                strD = f.f29411d.d();
            }
        }
        p.i("rbx.locale", "mUGCLocaleCode value is: " + strD);
        return strD;
    }

    public f j() {
        return this.f29397a;
    }

    public boolean k(f fVar) {
        return this.f29397a.equals(fVar);
    }

    public final /* synthetic */ void l(Context context, JSONObject jSONObject) {
        f fVarB;
        try {
            String string = jSONObject.getString("localeId");
            if (string == null || string.isEmpty() || (fVarB = f.b(string)) == null || f().k(fVarB)) {
                return;
            }
            p.h("rbx.locale", "Receive new locale value from LUA " + fVarB.d() + " " + fVarB.c());
            o(fVarB, context);
            r(fVarB);
            t(context, string);
            n(fVarB, context);
        } catch (JSONException unused) {
            p.e("MessageBus", "Failed to get QR code image userId");
        }
    }

    public void m(final Context context) {
        this.f29403h = MessageBus.f().t("Locale.RobloxLocaleIdChanged", new Callback() { // from class: qi.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f29396a.l(context, jSONObject);
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
            h(context).e(fVar);
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
        this.f29398c = locale;
    }

    public void r(f fVar) {
        this.f29399d = fVar;
    }

    public void s(c cVar) {
        this.f29401f = cVar;
    }

    public void t(Context context, String str) {
        this.f29400e = str;
        h(context).a(this.f29400e);
    }

    public void u(Context context) {
        f fVarF = this.f29397a;
        if (fVarF == null) {
            p.h("rbx.locale", "mUserLocale is empty");
            fVarF = h(context).f();
            if (fVarF == null) {
                p.h("rbx.locale", "No stored value for mUserLocale.");
                fVarF = c();
            }
        }
        p.h("rbx.locale", "Updating App configuration based on locale = " + fVarF);
        w(context, fVarF);
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
        this.f29397a = fVar;
        String strC = fVar.c();
        Resources resources = context.getResources();
        return v(context, strC, resources, resources.getConfiguration());
    }
}
