package p100eb;

/* JADX INFO: renamed from: eb.l4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4965l4 implements InterfaceC4959k4 {

    /* JADX INFO: renamed from: a */
    public static final C4990q f19688a;

    /* JADX INFO: renamed from: b */
    public static final C4990q f19689b;

    /* JADX INFO: renamed from: c */
    public static final C4990q f19690c;

    /* JADX INFO: renamed from: d */
    public static final C4990q f19691d;

    /* JADX INFO: renamed from: e */
    public static final C4990q f19692e;

    /* JADX INFO: renamed from: f */
    public static final C4990q f19693f;

    /* JADX INFO: renamed from: g */
    public static final C4990q f19694g;

    /* JADX INFO: renamed from: h */
    public static final C4990q f19695h;

    static {
        C5038y c5038yM23722d = new C5038y("com.google.android.gms.fido").m23723e(AbstractC4938h1.m23609m("FIDO")).m23722d();
        f19688a = c5038yM23722d.m23721c("Fido2Ctap2Support__disable_transport_comparator", true);
        f19689b = c5038yM23722d.m23721c("Fido2Ctap2Support__enable_cancelling_requests", true);
        f19690c = c5038yM23722d.m23721c("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        f19691d = c5038yM23722d.m23721c("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        f19692e = c5038yM23722d.m23721c("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        f19693f = c5038yM23722d.m23721c("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        f19694g = c5038yM23722d.m23721c("Fido2Ctap2Support__transport_controller_refactor", false);
        f19695h = c5038yM23722d.m23721c("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // p100eb.InterfaceC4959k4
    public final boolean zza() {
        return ((Boolean) f19690c.zza()).booleanValue();
    }
}
