package gh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import bh.q0;
import bh.t0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import dj.g;
import f4.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ob.ua;
import ok.q;
import ok.z;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<String, String> f17742j = bh.b.a(new Map.Entry[]{ua.a("en", "EN"), ua.a("ar", "AR"), ua.a("id", "ID"), ua.a("fr", "FR"), ua.a("de", "DE"), ua.a("hi", "HI"), ua.a("it", "IT"), ua.a("ja", "JA"), ua.a("ko", "KO"), ua.a("pl", "PL"), ua.a("pt", "PT"), ua.a("th", "TH"), ua.a("tr", "TR"), ua.a("vi", "VI"), ua.a("zh", "ZH-S"), ua.a("es", "ES-ES")});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a f17743k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f17744a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17745c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17746d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17747e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17748f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17749g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f17750h = Boolean.TRUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<NameValuePair> f17751i;

    public static a e() {
        a aVar = f17743k;
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            try {
                if (f17743k == null) {
                    f17743k = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f17743k;
    }

    public static void h(Context context) {
        z.a(context, "rate_me_maybe").edit().clear().apply();
        q.b("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    @Override // gh.b.a
    public void a(Activity activity) {
        if (h.a().j5()) {
            Uri.Builder builderBuildUpon = Uri.parse(h.a().B0()).buildUpon();
            String str = f17742j.get(Locale.getDefault().getLanguage());
            if (str != null) {
                builderBuildUpon.appendQueryParameter("Q_lang", str);
            }
            c.a(activity, builderBuildUpon.build().toString());
        }
        SharedPreferences.Editor editorEdit = this.f17744a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        if (h.a().n0()) {
            j("not_now");
        } else {
            f().q("Mobile-Ratings-NotNow-Tapped-Android");
        }
    }

    @Override // gh.b.a
    public void b(Context context) {
        SharedPreferences.Editor editorEdit = this.f17744a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        AppRatingPromptHandler.k((j.b) context, context.getString(q0.f4225c));
        if (h.a().n0()) {
            j("yes");
        } else {
            f().q("Mobile-Ratings-Yes-Tapped-Android");
        }
    }

    @Override // gh.b.a
    public void c(Activity activity) {
        if (h.a().n0()) {
            j("close");
        }
        if (this.f17750h.booleanValue()) {
            d(true);
        } else {
            a(activity);
        }
    }

    @Override // gh.b.a
    public void d(boolean z10) {
        if (z10 || !h.a().n0()) {
            f().q("Mobile-Ratings-RemindMe-Tapped-Android");
        } else {
            j("remind");
        }
    }

    public final g f() {
        return g.b();
    }

    public void g(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f17751i = arrayList;
        arrayList.add(new NameValuePair("target", "mobile"));
        this.f17751i.add(new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, BuildConfig.FLAVOR));
        this.f17751i.add(new NameValuePair("gameId", BuildConfig.FLAVOR));
        this.f17751i.add(new NameValuePair("btn", BuildConfig.FLAVOR));
        SharedPreferences sharedPreferencesA = z.a(context, "rate_me_maybe");
        this.f17744a = sharedPreferencesA;
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        if (!"2.747.1486".equals(this.f17744a.getString("CURRENT_APP_VERSION", BuildConfig.FLAVOR))) {
            h(context);
            editorEdit.putString("CURRENT_APP_VERSION", "2.747.1486");
        }
        if (this.f17744a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L) == 0) {
            editorEdit.putLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", System.currentTimeMillis());
        }
        editorEdit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f17744a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f17744a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        editorEdit.apply();
    }

    public void i(Activity activity, long j10, String str) {
        if (this.f17744a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (this.f17749g > this.f17744a.getInt("PREF_GAMES_PLAYED", 0)) {
            q.b("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f17748f > this.f17744a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            q.b("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f17744a.edit();
        int i10 = this.f17744a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f17744a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j12 = this.f17744a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i11 = this.f17744a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i10 < this.b || jCurrentTimeMillis - j11 < ((long) this.f17745c) * 86400000) {
            q.b("RateMeMaybe", "Not enough time until initial prompt.");
            editorEdit.apply();
            return;
        }
        q.b("RateMeMaybe", "Enough time until initial prompt.");
        if (j12 != 0 && (i11 < this.f17746d || jCurrentTimeMillis - j12 < ((long) this.f17747e) * 86400000)) {
            q.b("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
            editorEdit.apply();
            return;
        }
        q.b("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
        if (h.a().n0()) {
            this.f17751i.set(1, new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, Long.toString(j10)));
            this.f17751i.set(2, new NameValuePair("gameId", str));
        }
        editorEdit.putLong("PREF_TIME_OF_LAST_PROMPT", jCurrentTimeMillis);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        editorEdit.apply();
        l(activity);
    }

    public final void j(String str) {
        this.f17751i.set(3, new NameValuePair("btn", str));
        t0.i("appRatingPrompt", "tap", this.f17751i);
    }

    public void k(int i10, int i11, int i12, int i13, long j10, int i14) {
        this.b = i10;
        this.f17745c = i11;
        this.f17746d = i12;
        this.f17747e = i13;
        this.f17748f = j10;
        this.f17749g = i14;
    }

    public final void l(Activity activity) {
        k0 k0VarL1 = ((j.b) activity).l1();
        if (k0VarL1.n0("rmmFragment") != null) {
            return;
        }
        b bVar = new b();
        bVar.x2(this);
        try {
            bVar.t2(k0VarL1, "rmmFragment");
            if (!h.a().n0()) {
                f().q("Mobile-Ratings-Shown-Android");
            } else {
                this.f17751i.set(3, new NameValuePair("btn", BuildConfig.FLAVOR));
                t0.i("appRatingPrompt", "impression", this.f17751i);
            }
        } catch (IllegalStateException e10) {
            q.e("RateMeMaybe", "Exception: " + e10.getMessage());
        }
    }

    public void m(long j10) {
        SharedPreferences.Editor editorEdit = this.f17744a.edit();
        if (j10 > this.f17744a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            editorEdit.putLong("PREF_LONGEST_GAME_DURATION", j10);
        }
        editorEdit.putInt("PREF_GAMES_PLAYED", this.f17744a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        editorEdit.apply();
    }
}
