package vk;

import android.graphics.Point;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33295a;
    public Point b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Point f33296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f33297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f33307n;

    public i a(String str) {
        this.f33299f = str;
        return this;
    }

    public i b(String str) {
        this.f33303j = str;
        return this;
    }

    public String c() {
        String strH = h();
        Locale locale = Locale.ROOT;
        String str = this.f33303j;
        String str2 = String.format(locale, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()  %s", Integer.valueOf(this.f33295a), Integer.valueOf(this.b.x), Integer.valueOf(this.b.y), Integer.valueOf(this.f33296c.x), Integer.valueOf(this.f33296c.y), Integer.valueOf(this.f33297d.x), Integer.valueOf(this.f33297d.y), n(this.f33298e), this.f33299f, this.f33300g, this.f33301h, strH, String.format(locale, "%s RobloxApp/%s (%s; %s)", str, this.f33301h, this.f33302i, str));
        if (!this.f33305l) {
            return str2;
        }
        return str2 + " ChromeOS";
    }

    public i d(String str) {
        this.f33298e = str;
        return this;
    }

    public i e(String str) {
        this.f33302i = str;
        return this;
    }

    public i f(Point point) {
        this.f33297d = point;
        return this;
    }

    public i g(Point point) {
        this.f33296c = point;
        return this;
    }

    public String h() {
        if (this.f33306m) {
            return "VR";
        }
        if (this.f33304k) {
            return "Phone";
        }
        return this.f33307n ? "TV" : "Tablet";
    }

    public i i(boolean z10) {
        this.f33305l = z10;
        return this;
    }

    public i j(boolean z10) {
        this.f33304k = z10;
        return this;
    }

    public i k(boolean z10) {
        this.f33307n = z10;
        return this;
    }

    public i l(boolean z10) {
        this.f33306m = z10;
        return this;
    }

    public i m(int i10) {
        this.f33295a = i10;
        return this;
    }

    public String n(String str) {
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

    public i o(Point point) {
        this.b = point;
        return this;
    }

    public i p(String str) {
        this.f33301h = str;
        return this;
    }

    public i q(String str) {
        this.f33300g = str;
        return this;
    }
}
