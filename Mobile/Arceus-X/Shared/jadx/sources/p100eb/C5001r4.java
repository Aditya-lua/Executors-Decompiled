package p100eb;

/* JADX INFO: renamed from: eb.r4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5001r4 implements InterfaceC4995q4 {

    /* JADX INFO: renamed from: a */
    public static final C4990q f19780a;

    /* JADX INFO: renamed from: b */
    public static final C4990q f19781b;

    /* JADX INFO: renamed from: c */
    public static final C4990q f19782c;

    /* JADX INFO: renamed from: d */
    public static final C4990q f19783d;

    /* JADX INFO: renamed from: e */
    public static final C4990q f19784e;

    /* JADX INFO: renamed from: f */
    public static final C4990q f19785f;

    /* JADX INFO: renamed from: g */
    public static final C4990q f19786g;

    /* JADX INFO: renamed from: h */
    public static final C4990q f19787h;

    /* JADX INFO: renamed from: i */
    public static final C4990q f19788i;

    /* JADX INFO: renamed from: j */
    public static final C4990q f19789j;

    /* JADX INFO: renamed from: k */
    public static final C4990q f19790k;

    /* JADX INFO: renamed from: l */
    public static final C4990q f19791l;

    /* JADX INFO: renamed from: m */
    public static final C4990q f19792m;

    /* JADX INFO: renamed from: n */
    public static final C4990q f19793n;

    /* JADX INFO: renamed from: o */
    public static final C4990q f19794o;

    /* JADX INFO: renamed from: p */
    public static final C4990q f19795p;

    /* JADX INFO: renamed from: q */
    public static final C4990q f19796q;

    /* JADX INFO: renamed from: r */
    public static final C4990q f19797r;

    /* JADX INFO: renamed from: s */
    public static final C4990q f19798s;

    static {
        C5038y c5038yM23722d = new C5038y("com.google.android.gms.fido").m23723e(AbstractC4938h1.m23609m("FIDO")).m23722d();
        f19780a = c5038yM23722d.m23721c("Passkeys__check_all_keys", false);
        f19781b = c5038yM23722d.m23721c("Passkeys__check_sync_status", true);
        f19782c = c5038yM23722d.m23721c("Passkeys__client_data_hash_override_for_security_keys", false);
        f19783d = c5038yM23722d.m23721c("Passkeys__direct_assetlinks", false);
        f19784e = c5038yM23722d.m23719a("Passkeys__direct_assetlinks_cache_seconds", 604800L);
        f19785f = c5038yM23722d.m23720b("Passkeys__direct_assetlinks_rpids", "*");
        f19786g = c5038yM23722d.m23721c("Passkeys__dispatch_prf_via_credman", true);
        f19787h = c5038yM23722d.m23720b("Passkeys__help_center_url", "https://support.google.com/accounts/answer/6208650");
        f19788i = c5038yM23722d.m23721c("Passkeys__hide_consent_page_in_registration_enabled", false);
        f19789j = c5038yM23722d.m23721c("Passkeys__ignore_stop_during_hybrid_request", false);
        f19790k = c5038yM23722d.m23721c("Passkeys__json_for_parcelables", false);
        f19791l = c5038yM23722d.m23721c("Passkeys__passkey_entries_use_gpm_icon", false);
        f19792m = c5038yM23722d.m23721c("Passkeys__reencrypt_passkey", false);
        f19793n = c5038yM23722d.m23721c("Passkeys__return_cryptauth_status", false);
        f19794o = c5038yM23722d.m23721c("Passkeys__set_key_version", true);
        f19795p = c5038yM23722d.m23719a("Passkeys__should_show_welcome_fragment", -1L);
        f19796q = c5038yM23722d.m23721c("Passkeys__skip_consent_after_retrieval", false);
        f19797r = c5038yM23722d.m23721c("Passkeys__skip_consent_screen", false);
        f19798s = c5038yM23722d.m23721c("Passkeys__use_result_receiver", false);
    }

    @Override // p100eb.InterfaceC4995q4
    public final boolean zza() {
        return ((Boolean) f19790k.zza()).booleanValue();
    }
}
