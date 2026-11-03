package eb;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15985a;
    public static final q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f15991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f15992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f15993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f15994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f15995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f15996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f15997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f15998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f15999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f16000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f16001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f16002s;

    static {
        y yVarD = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15985a = yVarD.c("Passkeys__check_all_keys", false);
        b = yVarD.c("Passkeys__check_sync_status", true);
        f15986c = yVarD.c("Passkeys__client_data_hash_override_for_security_keys", false);
        f15987d = yVarD.c("Passkeys__direct_assetlinks", false);
        f15988e = yVarD.a("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        f15989f = yVarD.b("Passkeys__direct_assetlinks_rpids", "*");
        f15990g = yVarD.c("Passkeys__dispatch_prf_via_credman", true);
        f15991h = yVarD.b("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        f15992i = yVarD.c("Passkeys__hide_consent_page_in_registration_enabled", false);
        f15993j = yVarD.c("Passkeys__ignore_stop_during_hybrid_request", false);
        f15994k = yVarD.c("Passkeys__json_for_parcelables", false);
        f15995l = yVarD.c("Passkeys__passkey_entries_use_gpm_icon", false);
        f15996m = yVarD.c("Passkeys__reencrypt_passkey", false);
        f15997n = yVarD.c("Passkeys__return_cryptauth_status", false);
        f15998o = yVarD.c("Passkeys__set_key_version", true);
        f15999p = yVarD.a("Passkeys__should_show_welcome_fragment", -1L);
        f16000q = yVarD.c("Passkeys__skip_consent_after_retrieval", false);
        f16001r = yVarD.c("Passkeys__skip_consent_screen", false);
        f16002s = yVarD.c("Passkeys__use_result_receiver", false);
    }

    @Override // eb.q4
    public final boolean zza() {
        return ((Boolean) f15994k.zza()).booleanValue();
    }
}
