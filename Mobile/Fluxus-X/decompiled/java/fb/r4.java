package fb;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15841a;
    public static final q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f15847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f15848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f15849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f15850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f15851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f15852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f15853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f15854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f15855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f15856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f15857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f15858s;

    static {
        y yVarD = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15841a = yVarD.c("Passkeys__check_all_keys", false);
        b = yVarD.c("Passkeys__check_sync_status", true);
        f15842c = yVarD.c("Passkeys__client_data_hash_override_for_security_keys", false);
        f15843d = yVarD.c("Passkeys__direct_assetlinks", false);
        f15844e = yVarD.a("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        f15845f = yVarD.b("Passkeys__direct_assetlinks_rpids", "*");
        f15846g = yVarD.c("Passkeys__dispatch_prf_via_credman", true);
        f15847h = yVarD.b("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        f15848i = yVarD.c("Passkeys__hide_consent_page_in_registration_enabled", false);
        f15849j = yVarD.c("Passkeys__ignore_stop_during_hybrid_request", false);
        f15850k = yVarD.c("Passkeys__json_for_parcelables", false);
        f15851l = yVarD.c("Passkeys__passkey_entries_use_gpm_icon", false);
        f15852m = yVarD.c("Passkeys__reencrypt_passkey", false);
        f15853n = yVarD.c("Passkeys__return_cryptauth_status", false);
        f15854o = yVarD.c("Passkeys__set_key_version", true);
        f15855p = yVarD.a("Passkeys__should_show_welcome_fragment", -1L);
        f15856q = yVarD.c("Passkeys__skip_consent_after_retrieval", false);
        f15857r = yVarD.c("Passkeys__skip_consent_screen", false);
        f15858s = yVarD.c("Passkeys__use_result_receiver", false);
    }

    @Override // fb.q4
    public final boolean zza() {
        return ((Boolean) f15850k.zza()).booleanValue();
    }
}
