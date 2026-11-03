package tk;

import android.graphics.Point;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32430a;
    public Point b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f32431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f32432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32443o;

    public i a(String str) {
        this.f32434f = str;
        return this;
    }

    public i b(String str) {
        this.f32438j = str;
        return this;
    }

    public String c() {
        String strH = h();
        Locale locale = Locale.ROOT;
        String str = this.f32438j;
        String str2 = String.format(locale, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()%s  %s", Integer.valueOf(this.f32430a), Integer.valueOf(this.b.x), Integer.valueOf(this.b.y), Integer.valueOf(this.f32431c.x), Integer.valueOf(this.f32431c.y), Integer.valueOf(this.f32432d.x), Integer.valueOf(this.f32432d.y), o(this.f32433e), this.f32434f, this.f32435g, this.f32436h, strH, this.f32443o ? " AndroidPioneer" : "", String.format(locale, "%s RobloxApp/%s (%s; %s)", str, this.f32436h, this.f32437i, str));
        if (!this.f32440l) {
            return str2;
        }
        return str2 + " ChromeOS";
    }

    public i d(String str) {
        this.f32433e = str;
        return this;
    }

    public i e(String str) {
        this.f32437i = str;
        return this;
    }

    public i f(Point point) {
        this.f32432d = point;
        return this;
    }

    public i g(Point point) {
        this.f32431c = point;
        return this;
    }

    public String h() {
        if (this.f32441m) {
            return "VR";
        }
        if (this.f32439k) {
            return "Phone";
        }
        return this.f32442n ? "TV" : "Tablet";
    }

    public i i(boolean z10) {
        this.f32440l = z10;
        return this;
    }

    public i j(boolean z10) {
        this.f32439k = z10;
        return this;
    }

    public i k(boolean z10) {
        this.f32443o = z10;
        return this;
    }

    public i l(boolean z10) {
        this.f32442n = z10;
        return this;
    }

    public i m(boolean z10) {
        this.f32441m = z10;
        return this;
    }

    public i n(int i10) {
        this.f32430a = i10;
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
        this.f32436h = str;
        return this;
    }

    public i r(String str) {
        this.f32435g = str;
        return this;
    }
}
