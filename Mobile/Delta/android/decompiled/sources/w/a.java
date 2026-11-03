package w;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33733a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f33734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f33735d;

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    public static final class C0619a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f33736a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f33737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f33738d;

        public a a() {
            return new a(this.f33736a, this.b, this.f33737c, this.f33738d);
        }
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f33733a = num;
        this.b = num2;
        this.f33734c = num3;
        this.f33735d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f33733a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f33734c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f33735d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
