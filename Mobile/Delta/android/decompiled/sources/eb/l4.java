package eb;

/* JADX INFO: loaded from: classes.dex */
public final class l4 implements k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15296a;
    public static final q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f15302h;

    static {
        y yVarD = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15296a = yVarD.c("Fido2Ctap2Support__disable_transport_comparator", true);
        b = yVarD.c("Fido2Ctap2Support__enable_cancelling_requests", true);
        f15297c = yVarD.c("Fido2Ctap2Support__enable_flow_separation_refactor", false);
        f15298d = yVarD.c("Fido2Ctap2Support__nfc_activity_destroyed_check", true);
        f15299e = yVarD.c("Fido2Ctap2Support__remove_this_device_for_assertions", false);
        f15300f = yVarD.c("Fido2Ctap2Support__skip_usb_permission_dialog", false);
        f15301g = yVarD.c("Fido2Ctap2Support__transport_controller_refactor", false);
        f15302h = yVarD.c("Fido2Ctap2Support__update_user_cancel_response", false);
    }

    @Override // eb.k4
    public final boolean zza() {
        return ((Boolean) f15297c.zza()).booleanValue();
    }
}
