package wg;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import ek.q;
import ek.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nb.pa;
import rg.q0;
import rg.t0;
import rh.h;
import ti.g;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<String, String> f34505j = rg.b.a(new Map.Entry[]{pa.a("en", "EN"), pa.a("ar", "AR"), pa.a("id", "ID"), pa.a("fr", "FR"), pa.a("de", "DE"), pa.a("hi", "HI"), pa.a("it", "IT"), pa.a("ja", "JA"), pa.a("ko", "KO"), pa.a("pl", "PL"), pa.a("pt", "PT"), pa.a("th", "TH"), pa.a("tr", "TR"), pa.a("vi", "VI"), pa.a("zh", "ZH-S"), pa.a("es", "ES-ES")});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a f34506k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f34507a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34508c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34509d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34510e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34511f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34512g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f34513h = Boolean.TRUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<NameValuePair> f34514i;

    public static a e() {
        a aVar = f34506k;
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            try {
                if (f34506k == null) {
                    f34506k = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f34506k;
    }

    public static void h(Context context) {
        z.a(context, "rate_me_maybe").edit().clear().apply();
        q.b("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    @Override // wg.b.a
    public void a(Activity activity) {
        if (h.a().k5()) {
            Uri.Builder builderBuildUpon = Uri.parse(h.a().y0()).buildUpon();
            String str = f34505j.get(Locale.getDefault().getLanguage());
            if (str != null) {
                builderBuildUpon.appendQueryParameter("Q_lang", str);
            }
            c.a(activity, builderBuildUpon.build().toString());
        }
        SharedPreferences.Editor editorEdit = this.f34507a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        if (h.a().l0()) {
            j("not_now");
        } else {
            f().q("Mobile-Ratings-NotNow-Tapped-Android");
        }
    }

    @Override // wg.b.a
    public void b(Context context) {
        SharedPreferences.Editor editorEdit = this.f34507a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        AppRatingPromptHandler.k((j.b) context, context.getString(q0.f30523c));
        if (h.a().l0()) {
            j("yes");
        } else {
            f().q("Mobile-Ratings-Yes-Tapped-Android");
        }
    }

    @Override // wg.b.a
    public void c(Activity activity) {
        if (h.a().l0()) {
            j("close");
        }
        if (this.f34513h.booleanValue()) {
            d(true);
        } else {
            a(activity);
        }
    }

    @Override // wg.b.a
    public void d(boolean z10) {
        if (z10 || !h.a().l0()) {
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
        this.f34514i = arrayList;
        arrayList.add(new NameValuePair("target", "mobile"));
        this.f34514i.add(new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, ""));
        this.f34514i.add(new NameValuePair("gameId", ""));
        this.f34514i.add(new NameValuePair("btn", ""));
        SharedPreferences sharedPreferencesA = z.a(context, "rate_me_maybe");
        this.f34507a = sharedPreferencesA;
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        if (!"2.745.1142".equals(this.f34507a.getString("CURRENT_APP_VERSION", ""))) {
            h(context);
            editorEdit.putString("CURRENT_APP_VERSION", "2.745.1142");
        }
        if (this.f34507a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L) == 0) {
            editorEdit.putLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", System.currentTimeMillis());
        }
        editorEdit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f34507a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f34507a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        editorEdit.apply();
    }

    public void i(Activity activity, long j10, String str) {
        if (this.f34507a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (this.f34512g > this.f34507a.getInt("PREF_GAMES_PLAYED", 0)) {
            q.b("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f34511f > this.f34507a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            q.b("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f34507a.edit();
        int i10 = this.f34507a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f34507a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j12 = this.f34507a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i11 = this.f34507a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i10 < this.b || jCurrentTimeMillis - j11 < ((long) this.f34508c) * 86400000) {
            q.b("RateMeMaybe", "Not enough time until initial prompt.");
            editorEdit.apply();
            return;
        }
        q.b("RateMeMaybe", "Enough time until initial prompt.");
        if (j12 != 0 && (i11 < this.f34509d || jCurrentTimeMillis - j12 < ((long) this.f34510e) * 86400000)) {
            q.b("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
            editorEdit.apply();
            return;
        }
        q.b("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
        if (h.a().l0()) {
            this.f34514i.set(1, new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, Long.toString(j10)));
            this.f34514i.set(2, new NameValuePair("gameId", str));
        }
        editorEdit.putLong("PREF_TIME_OF_LAST_PROMPT", jCurrentTimeMillis);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        editorEdit.apply();
        l(activity);
    }

    public final void j(String str) {
        this.f34514i.set(3, new NameValuePair("btn", str));
        t0.i("appRatingPrompt", "tap", this.f34514i);
    }

    public void k(int i10, int i11, int i12, int i13, long j10, int i14) {
        this.b = i10;
        this.f34508c = i11;
        this.f34509d = i12;
        this.f34510e = i13;
        this.f34511f = j10;
        this.f34512g = i14;
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
            if (!h.a().l0()) {
                f().q("Mobile-Ratings-Shown-Android");
            } else {
                this.f34514i.set(3, new NameValuePair("btn", ""));
                t0.i("appRatingPrompt", "impression", this.f34514i);
            }
        } catch (IllegalStateException e10) {
            q.e("RateMeMaybe", "Exception: " + e10.getMessage());
        }
    }

    public void m(long j10) {
        SharedPreferences.Editor editorEdit = this.f34507a.edit();
        if (j10 > this.f34507a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            editorEdit.putLong("PREF_LONGEST_GAME_DURATION", j10);
        }
        editorEdit.putInt("PREF_GAMES_PLAYED", this.f34507a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        editorEdit.apply();
    }
}
