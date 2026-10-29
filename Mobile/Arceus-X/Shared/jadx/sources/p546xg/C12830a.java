package p546xg;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p151gk.C6124q;
import p151gk.C6133z;
import p203j.ActivityC6992b;
import p306nb.C9241pa;
import sg.C11297b;
import sg.C11347q0;
import sg.C11356t0;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: renamed from: xg.a */
/* JADX INFO: loaded from: classes2.dex */
public class C12830a implements ViewOnClickListenerC12831b.a {

    /* JADX INFO: renamed from: j */
    public static final Map<String, String> f45617j = C11297b.m42490a(new Map.Entry[]{C9241pa.m36627a("en", "EN"), C9241pa.m36627a("ar", "AR"), C9241pa.m36627a("id", "ID"), C9241pa.m36627a("fr", "FR"), C9241pa.m36627a("de", "DE"), C9241pa.m36627a("hi", "HI"), C9241pa.m36627a("it", "IT"), C9241pa.m36627a("ja", "JA"), C9241pa.m36627a("ko", "KO"), C9241pa.m36627a("pl", "PL"), C9241pa.m36627a("pt", "PT"), C9241pa.m36627a("th", "TH"), C9241pa.m36627a("tr", "TR"), C9241pa.m36627a("vi", "VI"), C9241pa.m36627a("zh", "ZH-S"), C9241pa.m36627a("es", "ES-ES")});

    /* JADX INFO: renamed from: k */
    public static C12830a f45618k;

    /* JADX INFO: renamed from: a */
    public SharedPreferences f45619a;

    /* JADX INFO: renamed from: b */
    public int f45620b = 0;

    /* JADX INFO: renamed from: c */
    public int f45621c = 0;

    /* JADX INFO: renamed from: d */
    public int f45622d = 0;

    /* JADX INFO: renamed from: e */
    public int f45623e = 0;

    /* JADX INFO: renamed from: f */
    public long f45624f = 0;

    /* JADX INFO: renamed from: g */
    public int f45625g = 0;

    /* JADX INFO: renamed from: h */
    public Boolean f45626h = Boolean.TRUE;

    /* JADX INFO: renamed from: i */
    public List<NameValuePair> f45627i;

    /* JADX INFO: renamed from: e */
    public static C12830a m47749e() {
        C12830a c12830a = f45618k;
        if (c12830a != null) {
            return c12830a;
        }
        synchronized (C12830a.class) {
            try {
                if (f45618k == null) {
                    f45618k = new C12830a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f45618k;
    }

    /* JADX INFO: renamed from: h */
    public static void m47750h(Context context) {
        C6133z.m27104a(context, "rate_me_maybe").edit().clear().apply();
        C6124q.m27057b("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    @Override // p546xg.ViewOnClickListenerC12831b.a
    /* JADX INFO: renamed from: a */
    public void mo47751a(Activity activity) {
        if (C11659h.m43403a().mo43614d5()) {
            Uri.Builder builderBuildUpon = Uri.parse(C11659h.m43403a().mo43751x0()).buildUpon();
            String str = f45617j.get(Locale.getDefault().getLanguage());
            if (str != null) {
                builderBuildUpon.appendQueryParameter("Q_lang", str);
            }
            C12832c.m47766a(activity, builderBuildUpon.build().toString());
        }
        SharedPreferences.Editor editorEdit = this.f45619a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        if (C11659h.m43403a().mo43660k0()) {
            m47758j("not_now");
        } else {
            m47755f().m45278q("Mobile-Ratings-NotNow-Tapped-Android");
        }
    }

    @Override // p546xg.ViewOnClickListenerC12831b.a
    /* JADX INFO: renamed from: b */
    public void mo47752b(Context context) {
        SharedPreferences.Editor editorEdit = this.f45619a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        AppRatingPromptHandler.m15979k((ActivityC6992b) context, context.getString(C11347q0.f39959c));
        if (C11659h.m43403a().mo43660k0()) {
            m47758j("yes");
        } else {
            m47755f().m45278q("Mobile-Ratings-Yes-Tapped-Android");
        }
    }

    @Override // p546xg.ViewOnClickListenerC12831b.a
    /* JADX INFO: renamed from: c */
    public void mo47753c(Activity activity) {
        if (C11659h.m43403a().mo43660k0()) {
            m47758j("close");
        }
        if (this.f45626h.booleanValue()) {
            mo47754d(true);
        } else {
            mo47751a(activity);
        }
    }

    @Override // p546xg.ViewOnClickListenerC12831b.a
    /* JADX INFO: renamed from: d */
    public void mo47754d(boolean z10) {
        if (z10 || !C11659h.m43403a().mo43660k0()) {
            m47755f().m45278q("Mobile-Ratings-RemindMe-Tapped-Android");
        } else {
            m47758j("remind");
        }
    }

    /* JADX INFO: renamed from: f */
    public final C12216g m47755f() {
        return C12216g.m45228b();
    }

    /* JADX INFO: renamed from: g */
    public void m47756g(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f45627i = arrayList;
        arrayList.add(new NameValuePair("target", "mobile"));
        this.f45627i.add(new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, ""));
        this.f45627i.add(new NameValuePair("gameId", ""));
        this.f45627i.add(new NameValuePair("btn", ""));
        SharedPreferences sharedPreferencesM27104a = C6133z.m27104a(context, "rate_me_maybe");
        this.f45619a = sharedPreferencesM27104a;
        SharedPreferences.Editor editorEdit = sharedPreferencesM27104a.edit();
        if (!"2.744.1081".equals(this.f45619a.getString("CURRENT_APP_VERSION", ""))) {
            m47750h(context);
            editorEdit.putString("CURRENT_APP_VERSION", "2.744.1081");
        }
        if (this.f45619a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L) == 0) {
            editorEdit.putLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", System.currentTimeMillis());
        }
        editorEdit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f45619a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f45619a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: i */
    public void m47757i(Activity activity, long j10, String str) {
        if (this.f45619a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (this.f45625g > this.f45619a.getInt("PREF_GAMES_PLAYED", 0)) {
            C6124q.m27057b("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f45624f > this.f45619a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            C6124q.m27057b("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f45619a.edit();
        int i10 = this.f45619a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f45619a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j12 = this.f45619a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i11 = this.f45619a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i10 < this.f45620b || jCurrentTimeMillis - j11 < ((long) this.f45621c) * 86400000) {
            C6124q.m27057b("RateMeMaybe", "Not enough time until initial prompt.");
            editorEdit.apply();
            return;
        }
        C6124q.m27057b("RateMeMaybe", "Enough time until initial prompt.");
        if (j12 != 0 && (i11 < this.f45622d || jCurrentTimeMillis - j12 < ((long) this.f45623e) * 86400000)) {
            C6124q.m27057b("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
            editorEdit.apply();
            return;
        }
        C6124q.m27057b("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
        if (C11659h.m43403a().mo43660k0()) {
            this.f45627i.set(1, new NameValuePair(PinShortcutHandler.EXTRA_PLACE_ID, Long.toString(j10)));
            this.f45627i.set(2, new NameValuePair("gameId", str));
        }
        editorEdit.putLong("PREF_TIME_OF_LAST_PROMPT", jCurrentTimeMillis);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        editorEdit.apply();
        m47760l(activity);
    }

    /* JADX INFO: renamed from: j */
    public final void m47758j(String str) {
        this.f45627i.set(3, new NameValuePair("btn", str));
        C11356t0.m42539i("appRatingPrompt", "tap", this.f45627i);
    }

    /* JADX INFO: renamed from: k */
    public void m47759k(int i10, int i11, int i12, int i13, long j10, int i14) {
        this.f45620b = i10;
        this.f45621c = i11;
        this.f45622d = i12;
        this.f45623e = i13;
        this.f45624f = j10;
        this.f45625g = i14;
    }

    /* JADX INFO: renamed from: l */
    public final void m47760l(Activity activity) {
        FragmentManager fragmentManagerM23360l1 = ((ActivityC6992b) activity).m23360l1();
        if (fragmentManagerM23360l1.m4444n0("rmmFragment") != null) {
            return;
        }
        ViewOnClickListenerC12831b viewOnClickListenerC12831b = new ViewOnClickListenerC12831b();
        viewOnClickListenerC12831b.m47765x2(this);
        try {
            viewOnClickListenerC12831b.mo23339t2(fragmentManagerM23360l1, "rmmFragment");
            if (!C11659h.m43403a().mo43660k0()) {
                m47755f().m45278q("Mobile-Ratings-Shown-Android");
            } else {
                this.f45627i.set(3, new NameValuePair("btn", ""));
                C11356t0.m42539i("appRatingPrompt", "impression", this.f45627i);
            }
        } catch (IllegalStateException e10) {
            C6124q.m27060e("RateMeMaybe", "Exception: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m47761m(long j10) {
        SharedPreferences.Editor editorEdit = this.f45619a.edit();
        if (j10 > this.f45619a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            editorEdit.putLong("PREF_LONGEST_GAME_DURATION", j10);
        }
        editorEdit.putInt("PREF_GAMES_PLAYED", this.f45619a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        editorEdit.apply();
    }
}
