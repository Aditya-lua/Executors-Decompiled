package p479v;

import android.os.Bundle;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11983a {

    /* JADX INFO: renamed from: a */
    public final Integer f42450a;

    /* JADX INFO: renamed from: b */
    public final Integer f42451b;

    /* JADX INFO: renamed from: c */
    public final Integer f42452c;

    /* JADX INFO: renamed from: v.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Integer f42453a;

        /* JADX INFO: renamed from: b */
        public Integer f42454b;

        /* JADX INFO: renamed from: c */
        public Integer f42455c;

        /* JADX INFO: renamed from: a */
        public C11983a m44735a() {
            return new C11983a(this.f42453a, this.f42454b, this.f42455c);
        }
    }

    /* JADX INFO: renamed from: a */
    public Bundle m44734a() {
        Bundle bundle = new Bundle();
        Integer num = this.f42450a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f42451b;
        if (num2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f42452c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11983a(Integer num, Integer num2, Integer num3) {
        this.f42450a = num;
        this.f42451b = num2;
        this.f42452c = num3;
    }
}
