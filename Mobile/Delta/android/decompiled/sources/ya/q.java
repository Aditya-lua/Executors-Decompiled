package ya;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature f36658a;
    public static final Feature b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f36659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Feature f36660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Feature f36661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Feature f36662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Feature f36663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Feature f36664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Feature[] f36665i;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        f36658a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        f36659c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        f36660d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        f36661e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        f36662f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        f36663g = feature7;
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        f36664h = feature8;
        f36665i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
