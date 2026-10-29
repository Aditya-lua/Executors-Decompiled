package xg;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import gk.p;
import gk.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nb.pa;
import sg.q0;
import sg.t0;
import th.h;
import vi.g;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<String, String> f35180j = sg.b.a(new Map.Entry[]{pa.a("en", "EN"), pa.a("ar", "AR"), pa.a("id", "ID"), pa.a("fr", "FR"), pa.a("de", "DE"), pa.a("hi", "HI"), pa.a("it", "IT"), pa.a("ja", "JA"), pa.a("ko", "KO"), pa.a("pl", "PL"), pa.a("pt", "PT"), pa.a("th", "TH"), pa.a("tr", "TR"), pa.a("vi", "VI"), pa.a("zh", "ZH-S"), pa.a("es", "ES-ES")});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a f35181k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f35182a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35183c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35184d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35185e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35186f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35187g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f35188h = Boolean.TRUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<NameValuePair> f35189i;

    public static a e() {
        a aVar = f35181k;
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            try {
                if (f35181k == null) {
                    f35181k = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f35181k;
    }

    public static void h(Context context) {
        y.a(context, "rate_me_maybe").edit().clear().apply();
        p.b("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    @Override // xg.b.a
    public void a(Activity activity) {
        if (h.a().X4()) {
            Uri.Builder builderBuildUpon = Uri.parse(h.a().t0()).buildUpon();
            String str = f35180j.get(Locale.getDefault().getLanguage());
            if (str != null) {
                builderBuildUpon.appendQueryParameter("Q_lang", str);
            }
            c.a(activity, builderBuildUpon.build().toString());
        }
        SharedPreferences.Editor editorEdit = this.f35182a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        if (h.a().g0()) {
            j("not_now");
        } else {
            f().q("Mobile-Ratings-NotNow-Tapped-Android");
        }
    }

    @Override // xg.b.a
    public void b(Context context) {
        SharedPreferences.Editor editorEdit = this.f35182a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        AppRatingPromptHandler.k((j.b) context, context.getString(q0.f30918c));
        if (h.a().g0()) {
            j("yes");
        } else {
            f().q("Mobile-Ratings-Yes-Tapped-Android");
        }
    }

    @Override // xg.b.a
    public void c(Activity activity) {
        if (h.a().g0()) {
            j("close");
        }
        if (this.f35188h.booleanValue()) {
            d(true);
        } else {
            a(activity);
        }
    }

    @Override // xg.b.a
    public void d(boolean z10) {
        if (z10 || !h.a().g0()) {
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
        this.f35189i = arrayList;
        arrayList.add(new NameValuePair("target", "mobile"));
        this.f35189i.add(new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, ""));
        this.f35189i.add(new NameValuePair("gameId", ""));
        this.f35189i.add(new NameValuePair("btn", ""));
        SharedPreferences sharedPreferencesA = y.a(context, "rate_me_maybe");
        this.f35182a = sharedPreferencesA;
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        if (!"2.743.1136".equals(this.f35182a.getString("CURRENT_APP_VERSION", ""))) {
            h(context);
            editorEdit.putString("CURRENT_APP_VERSION", "2.743.1136");
        }
        if (this.f35182a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L) == 0) {
            editorEdit.putLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", System.currentTimeMillis());
        }
        editorEdit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f35182a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f35182a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        editorEdit.apply();
    }

    public void i(Activity activity, long j10, String str) {
        if (this.f35182a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (this.f35187g > this.f35182a.getInt("PREF_GAMES_PLAYED", 0)) {
            p.b("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f35186f > this.f35182a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            p.b("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f35182a.edit();
        int i10 = this.f35182a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f35182a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j12 = this.f35182a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i11 = this.f35182a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i10 < this.b || jCurrentTimeMillis - j11 < ((long) this.f35183c) * 86400000) {
            p.b("RateMeMaybe", "Not enough time until initial prompt.");
            editorEdit.apply();
            return;
        }
        p.b("RateMeMaybe", "Enough time until initial prompt.");
        if (j12 != 0 && (i11 < this.f35184d || jCurrentTimeMillis - j12 < ((long) this.f35185e) * 86400000)) {
            p.b("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
            editorEdit.apply();
            return;
        }
        p.b("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
        if (h.a().g0()) {
            this.f35189i.set(1, new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, Long.toString(j10)));
            this.f35189i.set(2, new NameValuePair("gameId", str));
        }
        editorEdit.putLong("PREF_TIME_OF_LAST_PROMPT", jCurrentTimeMillis);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        editorEdit.apply();
        l(activity);
    }

    public final void j(String str) {
        this.f35189i.set(3, new NameValuePair("btn", str));
        t0.i("appRatingPrompt", "tap", this.f35189i);
    }

    public void k(int i10, int i11, int i12, int i13, long j10, int i14) {
        this.b = i10;
        this.f35183c = i11;
        this.f35184d = i12;
        this.f35185e = i13;
        this.f35186f = j10;
        this.f35187g = i14;
    }

    public final void l(Activity activity) {
        FragmentManager fragmentManagerL1 = ((j.b) activity).l1();
        if (fragmentManagerL1.n0("rmmFragment") != null) {
            return;
        }
        b bVar = new b();
        bVar.x2(this);
        try {
            bVar.t2(fragmentManagerL1, "rmmFragment");
            if (!h.a().g0()) {
                f().q("Mobile-Ratings-Shown-Android");
            } else {
                this.f35189i.set(3, new NameValuePair("btn", ""));
                t0.i("appRatingPrompt", "impression", this.f35189i);
            }
        } catch (IllegalStateException e10) {
            p.e("RateMeMaybe", "Exception: " + e10.getMessage());
        }
    }

    public void m(long j10) {
        SharedPreferences.Editor editorEdit = this.f35182a.edit();
        if (j10 > this.f35182a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            editorEdit.putLong("PREF_LONGEST_GAME_DURATION", j10);
        }
        editorEdit.putInt("PREF_GAMES_PLAYED", this.f35182a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        editorEdit.apply();
    }
}
