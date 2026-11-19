package w;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35422a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f35423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f35424d;

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    public static final class C0726a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f35425a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f35426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f35427d;

        public a a() {
            return new a(this.f35425a, this.b, this.f35426c, this.f35427d);
        }
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f35422a = num;
        this.b = num2;
        this.f35423c = num3;
        this.f35424d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f35422a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f35423c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f35424d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
