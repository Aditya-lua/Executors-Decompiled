package cl;

import android.graphics.Point;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5504a;
    public Point b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f5505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f5506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5517o;

    public i a(String str) {
        this.f5508f = str;
        return this;
    }

    public i b(String str) {
        this.f5512j = str;
        return this;
    }

    public String c() {
        String strH = h();
        Locale locale = Locale.ROOT;
        String str = this.f5512j;
        String str2 = String.format(locale, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()%s  %s", Integer.valueOf(this.f5504a), Integer.valueOf(this.b.x), Integer.valueOf(this.b.y), Integer.valueOf(this.f5505c.x), Integer.valueOf(this.f5505c.y), Integer.valueOf(this.f5506d.x), Integer.valueOf(this.f5506d.y), o(this.f5507e), this.f5508f, this.f5509g, this.f5510h, strH, this.f5517o ? " AndroidPioneer" : BuildConfig.FLAVOR, String.format(locale, "%s RobloxApp/%s (%s; %s)", str, this.f5510h, this.f5511i, str));
        if (!this.f5514l) {
            return str2;
        }
        return str2 + " ChromeOS";
    }

    public i d(String str) {
        this.f5507e = str;
        return this;
    }

    public i e(String str) {
        this.f5511i = str;
        return this;
    }

    public i f(Point point) {
        this.f5506d = point;
        return this;
    }

    public i g(Point point) {
        this.f5505c = point;
        return this;
    }

    public String h() {
        if (this.f5515m) {
            return "VR";
        }
        if (this.f5513k) {
            return "Phone";
        }
        return this.f5516n ? "TV" : "Tablet";
    }

    public i i(boolean z10) {
        this.f5514l = z10;
        return this;
    }

    public i j(boolean z10) {
        this.f5513k = z10;
        return this;
    }

    public i k(boolean z10) {
        this.f5517o = z10;
        return this;
    }

    public i l(boolean z10) {
        this.f5516n = z10;
        return this;
    }

    public i m(boolean z10) {
        this.f5515m = z10;
        return this;
    }

    public i n(int i10) {
        this.f5504a = i10;
        return this;
    }

    public String o(String str) {
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

    public i p(Point point) {
        this.b = point;
        return this;
    }

    public i q(String str) {
        this.f5510h = str;
        return this;
    }

    public i r(String str) {
        this.f5509g = str;
        return this;
    }
}
