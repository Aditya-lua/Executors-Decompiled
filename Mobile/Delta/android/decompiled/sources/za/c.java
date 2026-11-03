package za;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature f38045a;
    public static final Feature b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f38046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Feature f38047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Feature[] f38048e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f38045a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f38046c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f38047d = feature4;
        f38048e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
