package ba;

import k9.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d[] D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3801a;
    public static final d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f3802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f3803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f3804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f3805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f3806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f3807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f3808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f3809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f3810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f3811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f3812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f3813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f3814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f3815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f3816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f3817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f3818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f3819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f3820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f3821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f3822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f3823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f3824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f3825z;

    static {
        d dVar = new d("cancel_target_direct_transfer", 1L);
        f3801a = dVar;
        d dVar2 = new d("delete_credential", 1L);
        b = dVar2;
        d dVar3 = new d("delete_device_public_key", 1L);
        f3802c = dVar3;
        d dVar4 = new d("get_or_generate_device_public_key", 1L);
        f3803d = dVar4;
        d dVar5 = new d("get_passkeys", 1L);
        f3804e = dVar5;
        d dVar6 = new d("update_passkey", 1L);
        f3805f = dVar6;
        d dVar7 = new d("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        f3806g = dVar7;
        d dVar8 = new d("is_user_verifying_platform_authenticator_available", 1L);
        f3807h = dVar8;
        d dVar9 = new d("privileged_api_list_credentials", 2L);
        f3808i = dVar9;
        d dVar10 = new d("start_target_direct_transfer", 1L);
        f3809j = dVar10;
        d dVar11 = new d("first_party_api_get_link_info", 1L);
        f3810k = dVar11;
        d dVar12 = new d("zero_party_api_register", 3L);
        f3811l = dVar12;
        d dVar13 = new d("zero_party_api_sign", 3L);
        f3812m = dVar13;
        d dVar14 = new d("zero_party_api_list_discoverable_credentials", 2L);
        f3813n = dVar14;
        d dVar15 = new d("zero_party_api_authenticate_passkey", 3L);
        f3814o = dVar15;
        d dVar16 = new d("zero_party_api_register_passkey", 1L);
        f3815p = dVar16;
        d dVar17 = new d("zero_party_api_register_passkey_with_sync_account", 1L);
        f3816q = dVar17;
        d dVar18 = new d("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        f3817r = dVar18;
        d dVar19 = new d("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
        f3818s = dVar19;
        d dVar20 = new d("get_browser_hybrid_client_sign_pending_intent", 1L);
        f3819t = dVar20;
        d dVar21 = new d("get_browser_hybrid_client_registration_pending_intent", 1L);
        f3820u = dVar21;
        d dVar22 = new d("privileged_authenticate_passkey", 2L);
        f3821v = dVar22;
        d dVar23 = new d("privileged_register_passkey_with_sync_account", 1L);
        f3822w = dVar23;
        d dVar24 = new d("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
        f3823x = dVar24;
        d dVar25 = new d("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
        f3824y = dVar25;
        d dVar26 = new d("zero_party_api_get_fido_security_key_only_sign_pending_intent", 1L);
        f3825z = dVar26;
        d dVar27 = new d("zero_party_api_get_fido_security_key_only_registration_pending_intent", 1L);
        A = dVar27;
        d dVar28 = new d("zero_party_api_get_privileged_fido_security_key_only_sign_pending_intent", 1L);
        B = dVar28;
        d dVar29 = new d("zero_party_api_get_privileged_fido_security_key_only_registration_pending_intent", 1L);
        C = dVar29;
        D = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29};
    }
}
