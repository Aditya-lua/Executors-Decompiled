package p383qi;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;

/* JADX INFO: renamed from: qi.b */
/* JADX INFO: loaded from: classes2.dex */
public class C10583b {

    /* JADX INFO: renamed from: f */
    public c f37979f;

    /* JADX INFO: renamed from: g */
    public InterfaceC10584c f37980g;

    /* JADX INFO: renamed from: h */
    public Connection f37981h;

    /* JADX INFO: renamed from: a */
    public C10587f f37974a = null;

    /* JADX INFO: renamed from: b */
    public C10587f f37975b = null;

    /* JADX INFO: renamed from: c */
    public Locale f37976c = null;

    /* JADX INFO: renamed from: d */
    public C10587f f37977d = null;

    /* JADX INFO: renamed from: e */
    public String f37978e = null;

    /* JADX INFO: renamed from: i */
    public InterfaceC10584c.a f37982i = new a();

    /* JADX INFO: renamed from: qi.b$a */
    public class a implements InterfaceC10584c.a {
        public a() {
        }

        @Override // p383qi.InterfaceC10584c.a
        /* JADX INFO: renamed from: a */
        public InterfaceC10584c mo40590a(Context context) {
            return new C10585d(context);
        }
    }

    /* JADX INFO: renamed from: qi.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C10583b f37984a = new C10583b();
    }

    /* JADX INFO: renamed from: qi.b$c */
    public enum c {
        LOCALE_MODE_LOGIN_SIGN_UP,
        LOCALE_MODE_GENERAL_EXPERIENCE
    }

    /* JADX INFO: renamed from: b */
    public static Locale m40568b(String str) {
        if (!str.contains("_")) {
            return new Locale(str);
        }
        String[] strArrSplit = str.split("_");
        return new Locale(strArrSplit[0], strArrSplit[1]);
    }

    /* JADX INFO: renamed from: f */
    public static C10583b m40569f() {
        return b.f37984a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final C10587f m40570c() {
        Locale localeM40572e = m40572e();
        if (localeM40572e != null) {
            String country = localeM40572e.getCountry();
            String language = localeM40572e.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (!TextUtils.isEmpty(country)) {
                    language = language + "_" + country;
                }
                C10587f c10587fM40604a = C10587f.m40604a(language);
                return c10587fM40604a != null ? c10587fM40604a : C10587f.f37990d;
            }
        }
        return C10587f.f37990d;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C10587f m40571d(Context context) {
        C10587f c10587f = this.f37975b;
        if (c10587f != null) {
            return c10587f;
        }
        C10587f c10587fMo40594b = m40574h(context).mo40594b();
        return c10587fMo40594b == null ? m40570c() : c10587fMo40594b;
    }

    /* JADX INFO: renamed from: e */
    public Locale m40572e() {
        return this.f37976c;
    }

    /* JADX INFO: renamed from: g */
    public c m40573g() {
        return this.f37979f;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC10584c m40574h(Context context) {
        if (this.f37980g == null) {
            this.f37980g = this.f37982i.mo40590a(context);
        }
        return this.f37980g;
    }

    /* JADX INFO: renamed from: i */
    public String m40575i(Context context) {
        String strM40607d = this.f37978e;
        if (strM40607d == null && context != null) {
            C6124q.m27064i("rbx.locale", "mUGCLocaleCode is Empty");
            C10587f c10587fMo40596d = m40574h(context).mo40596d();
            if (c10587fMo40596d != null) {
                strM40607d = c10587fMo40596d.m40607d();
            }
            if (strM40607d == null) {
                C6124q.m27063h("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                strM40607d = C10587f.f37990d.m40607d();
            }
        }
        C6124q.m27064i("rbx.locale", "mUGCLocaleCode value is: " + strM40607d);
        return strM40607d;
    }

    /* JADX INFO: renamed from: j */
    public C10587f m40576j() {
        return this.f37974a;
    }

    /* JADX INFO: renamed from: k */
    public boolean m40577k(C10587f c10587f) {
        return this.f37974a.equals(c10587f);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m40578l(Context context, JSONObject jSONObject) {
        C10587f c10587fM40605b;
        try {
            String string = jSONObject.getString("localeId");
            if (string == null || string.isEmpty() || (c10587fM40605b = C10587f.m40605b(string)) == null || m40569f().m40577k(c10587fM40605b)) {
                return;
            }
            C6124q.m27063h("rbx.locale", "Receive new locale value from LUA " + c10587fM40605b.m40607d() + " " + c10587fM40605b.m40606c());
            m40581o(c10587fM40605b, context);
            m40584r(c10587fM40605b);
            m40586t(context, string);
            m40580n(c10587fM40605b, context);
        } catch (JSONException unused) {
            C6124q.m27060e("MessageBus", "Failed to get QR code image userId");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m40579m(final Context context) {
        this.f37981h = MessageBus.m16016f().m16030t("Locale.RobloxLocaleIdChanged", new Callback() { // from class: qi.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f37972a.m40578l(context, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public boolean m40580n(C10587f c10587f, Context context) {
        if (c10587f == null) {
            return false;
        }
        boolean zM40577k = m40577k(c10587f);
        boolean z10 = !zM40577k;
        if (!zM40577k && context != null) {
            m40574h(context).mo40597e(c10587f);
            m40589w(context, c10587f);
        }
        return z10;
    }

    /* JADX INFO: renamed from: o */
    public void m40581o(C10587f c10587f, Context context) {
        m40582p(c10587f);
        m40574h(context).mo40595c(this.f37975b);
    }

    /* JADX INFO: renamed from: p */
    public void m40582p(C10587f c10587f) {
        this.f37975b = c10587f;
    }

    /* JADX INFO: renamed from: q */
    public void m40583q(Locale locale) {
        this.f37976c = locale;
    }

    /* JADX INFO: renamed from: r */
    public void m40584r(C10587f c10587f) {
        this.f37977d = c10587f;
    }

    /* JADX INFO: renamed from: s */
    public void m40585s(c cVar) {
        this.f37979f = cVar;
    }

    /* JADX INFO: renamed from: t */
    public void m40586t(Context context, String str) {
        this.f37978e = str;
        m40574h(context).mo40593a(this.f37978e);
    }

    /* JADX INFO: renamed from: u */
    public void m40587u(Context context) {
        C10587f c10587fMo40598f = this.f37974a;
        if (c10587fMo40598f == null) {
            C6124q.m27063h("rbx.locale", "mUserLocale is empty");
            c10587fMo40598f = m40574h(context).mo40598f();
            if (c10587fMo40598f == null) {
                C6124q.m27063h("rbx.locale", "No stored value for mUserLocale.");
                c10587fMo40598f = m40570c();
            }
        }
        C6124q.m27063h("rbx.locale", "Updating App configuration based on locale = " + c10587fMo40598f);
        m40589w(context, c10587fMo40598f);
    }

    /* JADX INFO: renamed from: v */
    public final Context m40588v(Context context, String str, Resources resources, Configuration configuration) {
        Locale localeM40568b = m40568b(str);
        Locale.setDefault(localeM40568b);
        configuration.setLocale(localeM40568b);
        configuration.setLayoutDirection(localeM40568b);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: w */
    public final Context m40589w(Context context, C10587f c10587f) {
        this.f37974a = c10587f;
        String strM40606c = c10587f.m40606c();
        Resources resources = context.getResources();
        return m40588v(context, strM40606c, resources, resources.getConfiguration());
    }
}
