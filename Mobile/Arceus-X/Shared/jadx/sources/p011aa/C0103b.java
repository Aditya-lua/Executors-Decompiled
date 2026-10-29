package p011aa;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: aa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0103b {

    /* JADX INFO: renamed from: A */
    public static final Feature f329A;

    /* JADX INFO: renamed from: B */
    public static final Feature f330B;

    /* JADX INFO: renamed from: C */
    public static final Feature f331C;

    /* JADX INFO: renamed from: D */
    public static final Feature[] f332D;

    /* JADX INFO: renamed from: a */
    public static final Feature f333a;

    /* JADX INFO: renamed from: b */
    public static final Feature f334b;

    /* JADX INFO: renamed from: c */
    public static final Feature f335c;

    /* JADX INFO: renamed from: d */
    public static final Feature f336d;

    /* JADX INFO: renamed from: e */
    public static final Feature f337e;

    /* JADX INFO: renamed from: f */
    public static final Feature f338f;

    /* JADX INFO: renamed from: g */
    public static final Feature f339g;

    /* JADX INFO: renamed from: h */
    public static final Feature f340h;

    /* JADX INFO: renamed from: i */
    public static final Feature f341i;

    /* JADX INFO: renamed from: j */
    public static final Feature f342j;

    /* JADX INFO: renamed from: k */
    public static final Feature f343k;

    /* JADX INFO: renamed from: l */
    public static final Feature f344l;

    /* JADX INFO: renamed from: m */
    public static final Feature f345m;

    /* JADX INFO: renamed from: n */
    public static final Feature f346n;

    /* JADX INFO: renamed from: o */
    public static final Feature f347o;

    /* JADX INFO: renamed from: p */
    public static final Feature f348p;

    /* JADX INFO: renamed from: q */
    public static final Feature f349q;

    /* JADX INFO: renamed from: r */
    public static final Feature f350r;

    /* JADX INFO: renamed from: s */
    public static final Feature f351s;

    /* JADX INFO: renamed from: t */
    public static final Feature f352t;

    /* JADX INFO: renamed from: u */
    public static final Feature f353u;

    /* JADX INFO: renamed from: v */
    public static final Feature f354v;

    /* JADX INFO: renamed from: w */
    public static final Feature f355w;

    /* JADX INFO: renamed from: x */
    public static final Feature f356x;

    /* JADX INFO: renamed from: y */
    public static final Feature f357y;

    /* JADX INFO: renamed from: z */
    public static final Feature f358z;

    static {
        Feature feature = new Feature("cancel_target_direct_transfer", 1L);
        f333a = feature;
        Feature feature2 = new Feature("delete_credential", 1L);
        f334b = feature2;
        Feature feature3 = new Feature("delete_device_public_key", 1L);
        f335c = feature3;
        Feature feature4 = new Feature("get_or_generate_device_public_key", 1L);
        f336d = feature4;
        Feature feature5 = new Feature("get_passkeys", 1L);
        f337e = feature5;
        Feature feature6 = new Feature("update_passkey", 1L);
        f338f = feature6;
        Feature feature7 = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        f339g = feature7;
        Feature feature8 = new Feature("is_user_verifying_platform_authenticator_available", 1L);
        f340h = feature8;
        Feature feature9 = new Feature("privileged_api_list_credentials", 2L);
        f341i = feature9;
        Feature feature10 = new Feature("start_target_direct_transfer", 1L);
        f342j = feature10;
        Feature feature11 = new Feature("first_party_api_get_link_info", 1L);
        f343k = feature11;
        Feature feature12 = new Feature("zero_party_api_register", 3L);
        f344l = feature12;
        Feature feature13 = new Feature("zero_party_api_sign", 3L);
        f345m = feature13;
        Feature feature14 = new Feature("zero_party_api_list_discoverable_credentials", 2L);
        f346n = feature14;
        Feature feature15 = new Feature("zero_party_api_authenticate_passkey", 3L);
        f347o = feature15;
        Feature feature16 = new Feature("zero_party_api_register_passkey", 1L);
        f348p = feature16;
        Feature feature17 = new Feature("zero_party_api_register_passkey_with_sync_account", 1L);
        f349q = feature17;
        Feature feature18 = new Feature("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        f350r = feature18;
        Feature feature19 = new Feature("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
        f351s = feature19;
        Feature feature20 = new Feature("get_browser_hybrid_client_sign_pending_intent", 1L);
        f352t = feature20;
        Feature feature21 = new Feature("get_browser_hybrid_client_registration_pending_intent", 1L);
        f353u = feature21;
        Feature feature22 = new Feature("privileged_authenticate_passkey", 2L);
        f354v = feature22;
        Feature feature23 = new Feature("privileged_register_passkey_with_sync_account", 1L);
        f355w = feature23;
        Feature feature24 = new Feature("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
        f356x = feature24;
        Feature feature25 = new Feature("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
        f357y = feature25;
        Feature feature26 = new Feature("zero_party_api_get_fido_security_key_only_sign_pending_intent", 1L);
        f358z = feature26;
        Feature feature27 = new Feature("zero_party_api_get_fido_security_key_only_registration_pending_intent", 1L);
        f329A = feature27;
        Feature feature28 = new Feature("zero_party_api_get_privileged_fido_security_key_only_sign_pending_intent", 1L);
        f330B = feature28;
        Feature feature29 = new Feature("zero_party_api_get_privileged_fido_security_key_only_registration_pending_intent", 1L);
        f331C = feature29;
        f332D = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, feature11, feature12, feature13, feature14, feature15, feature16, feature17, feature18, feature19, feature20, feature21, feature22, feature23, feature24, feature25, feature26, feature27, feature28, feature29};
    }
}
