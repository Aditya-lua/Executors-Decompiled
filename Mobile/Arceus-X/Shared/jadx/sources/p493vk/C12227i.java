package p493vk;

import android.graphics.Point;
import java.util.Locale;

/* JADX INFO: renamed from: vk.i */
/* JADX INFO: loaded from: classes2.dex */
public class C12227i {

    /* JADX INFO: renamed from: a */
    public int f43114a;

    /* JADX INFO: renamed from: b */
    public Point f43115b;

    /* JADX INFO: renamed from: c */
    public Point f43116c;

    /* JADX INFO: renamed from: d */
    public Point f43117d;

    /* JADX INFO: renamed from: e */
    public String f43118e;

    /* JADX INFO: renamed from: f */
    public String f43119f;

    /* JADX INFO: renamed from: g */
    public String f43120g;

    /* JADX INFO: renamed from: h */
    public String f43121h;

    /* JADX INFO: renamed from: i */
    public String f43122i;

    /* JADX INFO: renamed from: j */
    public String f43123j;

    /* JADX INFO: renamed from: k */
    public boolean f43124k;

    /* JADX INFO: renamed from: l */
    public boolean f43125l;

    /* JADX INFO: renamed from: m */
    public boolean f43126m;

    /* JADX INFO: renamed from: n */
    public boolean f43127n;

    /* JADX INFO: renamed from: a */
    public C12227i m45334a(String str) {
        this.f43119f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C12227i m45335b(String str) {
        this.f43123j = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m45336c() {
        String strM45341h = m45341h();
        Locale locale = Locale.ROOT;
        String str = this.f43123j;
        String str2 = String.format(locale, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()  %s", Integer.valueOf(this.f43114a), Integer.valueOf(this.f43115b.x), Integer.valueOf(this.f43115b.y), Integer.valueOf(this.f43116c.x), Integer.valueOf(this.f43116c.y), Integer.valueOf(this.f43117d.x), Integer.valueOf(this.f43117d.y), m45347n(this.f43118e), this.f43119f, this.f43120g, this.f43121h, strM45341h, String.format(locale, "%s RobloxApp/%s (%s; %s)", str, this.f43121h, this.f43122i, str));
        if (!this.f43125l) {
            return str2;
        }
        return str2 + " ChromeOS";
    }

    /* JADX INFO: renamed from: d */
    public C12227i m45337d(String str) {
        this.f43118e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C12227i m45338e(String str) {
        this.f43122i = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C12227i m45339f(Point point) {
        this.f43117d = point;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C12227i m45340g(Point point) {
        this.f43116c = point;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public String m45341h() {
        if (this.f43126m) {
            return "VR";
        }
        if (this.f43124k) {
            return "Phone";
        }
        return this.f43127n ? "TV" : "Tablet";
    }

    /* JADX INFO: renamed from: i */
    public C12227i m45342i(boolean z10) {
        this.f43125l = z10;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C12227i m45343j(boolean z10) {
        this.f43124k = z10;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C12227i m45344k(boolean z10) {
        this.f43127n = z10;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C12227i m45345l(boolean z10) {
        this.f43126m = z10;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C12227i m45346m(int i10) {
        this.f43114a = i10;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public String m45347n(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                sb2.append('_');
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public C12227i m45348o(Point point) {
        this.f43115b = point;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C12227i m45349p(String str) {
        this.f43121h = str;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C12227i m45350q(String str) {
        this.f43120g = str;
        return this;
    }
}
