package v;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33238a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f33239c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f33240a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f33241c;

        public a a() {
            return new a(this.f33240a, this.b, this.f33241c);
        }
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f33238a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f33239c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    public a(Integer num, Integer num2, Integer num3) {
        this.f33238a = num;
        this.b = num2;
        this.f33239c = num3;
    }
}
