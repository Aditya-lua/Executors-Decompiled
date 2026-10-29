package eb;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15371a;
    public static final q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f15377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f15378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f15379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f15380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f15381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f15382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f15383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f15384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f15385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f15386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f15387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f15388s;

    static {
        y yVarD = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15371a = yVarD.c("Passkeys__check_all_keys", false);
        b = yVarD.c("Passkeys__check_sync_status", true);
        f15372c = yVarD.c("Passkeys__client_data_hash_override_for_security_keys", false);
        f15373d = yVarD.c("Passkeys__direct_assetlinks", false);
        f15374e = yVarD.a("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        f15375f = yVarD.b("Passkeys__direct_assetlinks_rpids", "*");
        f15376g = yVarD.c("Passkeys__dispatch_prf_via_credman", true);
        f15377h = yVarD.b("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        f15378i = yVarD.c("Passkeys__hide_consent_page_in_registration_enabled", false);
        f15379j = yVarD.c("Passkeys__ignore_stop_during_hybrid_request", false);
        f15380k = yVarD.c("Passkeys__json_for_parcelables", false);
        f15381l = yVarD.c("Passkeys__passkey_entries_use_gpm_icon", false);
        f15382m = yVarD.c("Passkeys__reencrypt_passkey", false);
        f15383n = yVarD.c("Passkeys__return_cryptauth_status", false);
        f15384o = yVarD.c("Passkeys__set_key_version", true);
        f15385p = yVarD.a("Passkeys__should_show_welcome_fragment", -1L);
        f15386q = yVarD.c("Passkeys__skip_consent_after_retrieval", false);
        f15387r = yVarD.c("Passkeys__skip_consent_screen", false);
        f15388s = yVarD.c("Passkeys__use_result_receiver", false);
    }

    @Override // eb.q4
    public final boolean zza() {
        return ((Boolean) f15380k.zza()).booleanValue();
    }
}
