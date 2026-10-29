package za;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: za.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13761c {

    /* JADX INFO: renamed from: a */
    public static final Feature f48328a;

    /* JADX INFO: renamed from: b */
    public static final Feature f48329b;

    /* JADX INFO: renamed from: c */
    public static final Feature f48330c;

    /* JADX INFO: renamed from: d */
    public static final Feature f48331d;

    /* JADX INFO: renamed from: e */
    public static final Feature[] f48332e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f48328a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        f48329b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f48330c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f48331d = feature4;
        f48332e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
