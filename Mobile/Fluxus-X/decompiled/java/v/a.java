package v;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34126a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f34127c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f34128a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f34129c;

        public a a() {
            return new a(this.f34128a, this.b, this.f34129c);
        }
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f34126a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f34127c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    public a(Integer num, Integer num2, Integer num3) {
        this.f34126a = num;
        this.b = num2;
        this.f34127c = num3;
    }
}
