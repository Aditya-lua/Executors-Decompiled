package eb;

/* JADX INFO: loaded from: classes.dex */
public final class l4 implements k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15910a;
    public static final q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f15916h;

    static {
        y yVarD = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15910a = yVarD.c("Fido2Ctap2Support__disable_transport_comparator", true);
        b = yVarD.c("Fido2Ctap2Support__enable_cancelling_requests", true);
        f15911c = yVarD.c("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        f15912d = yVarD.c("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        f15913e = yVarD.c("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        f15914f = yVarD.c("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        f15915g = yVarD.c("Fido2Ctap2Support__transport_controller_refactor", false);
        f15916h = yVarD.c("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // eb.k4
    public final boolean zza() {
        return ((Boolean) f15911c.zza()).booleanValue();
    }
}
