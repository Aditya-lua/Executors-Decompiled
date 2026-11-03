package oi;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.q;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f27905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public oi.c f27906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Connection f27907h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f27901a = null;
    public f b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Locale f27902c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f27903d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27904e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public oi.c.a f27908i = new a();

    public class a implements oi.c.a {
        public a() {
        }

        @Override // oi.c.a
        public oi.c a(Context context) {
            return new d(context);
        }
    }

    /* JADX INFO: renamed from: oi.b$b, reason: collision with other inner class name */
    public static final class C0485b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27910a = new b();
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
        return C0485b.f27910a;
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
                return fVarA != null ? fVarA : f.f27915d;
            }
        }
        return f.f27915d;
    }

    @NonNull
    public f d(Context context) {
        f fVar = this.b;
        if (fVar != null) {
            return fVar;
        }
        f fVarC = h(context).c();
        return fVarC == null ? c() : fVarC;
    }

    public Locale e() {
        return this.f27902c;
    }

    public c g() {
        return this.f27905f;
    }

    public final oi.c h(Context context) {
        if (this.f27906g == null) {
            this.f27906g = this.f27908i.a(context);
        }
        return this.f27906g;
    }

    public String i(Context context) {
        String strD = this.f27904e;
        if (strD == null && context != null) {
            q.i("rbx.locale", "mUGCLocaleCode is Empty");
            f fVarD = h(context).d();
            if (fVarD != null) {
                strD = fVarD.d();
            }
            if (strD == null) {
                q.h("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                strD = f.f27915d.d();
            }
        }
        q.i("rbx.locale", "mUGCLocaleCode value is: " + strD);
        return strD;
    }

    public f j() {
        return this.f27901a;
    }

    public boolean k(f fVar) {
        return this.f27901a.equals(fVar);
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
        this.f27907h = MessageBus.f().t("Locale.RobloxLocaleIdChanged", new Callback() { // from class: oi.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f27900a.l(context, jSONObject);
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
        h(context).b(this.b);
    }

    public void p(f fVar) {
        this.b = fVar;
    }

    public void q(Locale locale) {
        this.f27902c = locale;
    }

    public void r(f fVar) {
        this.f27903d = fVar;
    }

    public void s(c cVar) {
        this.f27905f = cVar;
    }

    public void t(Context context, String str) {
        this.f27904e = str;
        h(context).a(this.f27904e);
    }

    public void u(Context context) {
        f fVarE = this.f27901a;
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
        this.f27901a = fVar;
        String strC = fVar.c();
        Resources resources = context.getResources();
        return v(context, strC, resources, resources.getConfiguration());
    }
}
