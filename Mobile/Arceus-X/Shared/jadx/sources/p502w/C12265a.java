package p502w;

import android.os.Bundle;

/* JADX INFO: renamed from: w.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12265a {

    /* JADX INFO: renamed from: a */
    public final Integer f43405a;

    /* JADX INFO: renamed from: b */
    public final Integer f43406b;

    /* JADX INFO: renamed from: c */
    public final Integer f43407c;

    /* JADX INFO: renamed from: d */
    public final Integer f43408d;

    /* JADX INFO: renamed from: w.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Integer f43409a;

        /* JADX INFO: renamed from: b */
        public Integer f43410b;

        /* JADX INFO: renamed from: c */
        public Integer f43411c;

        /* JADX INFO: renamed from: d */
        public Integer f43412d;

        /* JADX INFO: renamed from: a */
        public C12265a m45516a() {
            return new C12265a(this.f43409a, this.f43410b, this.f43411c, this.f43412d);
        }
    }

    public C12265a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f43405a = num;
        this.f43406b = num2;
        this.f43407c = num3;
        this.f43408d = num4;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m45515a() {
        Bundle bundle = new Bundle();
        Integer num = this.f43405a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f43406b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f43407c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f43408d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
