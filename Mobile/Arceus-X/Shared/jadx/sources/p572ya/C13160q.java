package p572ya;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: ya.q */
/* JADX INFO: loaded from: classes.dex */
public final class C13160q {

    /* JADX INFO: renamed from: a */
    public static final Feature f46416a;

    /* JADX INFO: renamed from: b */
    public static final Feature f46417b;

    /* JADX INFO: renamed from: c */
    public static final Feature f46418c;

    /* JADX INFO: renamed from: d */
    public static final Feature f46419d;

    /* JADX INFO: renamed from: e */
    public static final Feature f46420e;

    /* JADX INFO: renamed from: f */
    public static final Feature f46421f;

    /* JADX INFO: renamed from: g */
    public static final Feature f46422g;

    /* JADX INFO: renamed from: h */
    public static final Feature f46423h;

    /* JADX INFO: renamed from: i */
    public static final Feature[] f46424i;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        f46416a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        f46417b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        f46418c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        f46419d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        f46420e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        f46421f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        f46422g = feature7;
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        f46423h = feature8;
        f46424i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
