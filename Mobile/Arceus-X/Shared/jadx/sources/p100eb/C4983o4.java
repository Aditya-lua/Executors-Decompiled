package p100eb;

/* JADX INFO: renamed from: eb.o4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4983o4 implements InterfaceC4977n4 {

    /* JADX INFO: renamed from: a */
    public static final C4990q f19716a;

    /* JADX INFO: renamed from: b */
    public static final C4990q f19717b;

    /* JADX INFO: renamed from: c */
    public static final C4990q f19718c;

    /* JADX INFO: renamed from: d */
    public static final C4990q f19719d;

    /* JADX INFO: renamed from: e */
    public static final C4990q f19720e;

    /* JADX INFO: renamed from: f */
    public static final C4990q f19721f;

    /* JADX INFO: renamed from: g */
    public static final C4990q f19722g;

    static {
        C5038y c5038yM23722d = new C5038y("com.google.android.gms.fido").m23723e(AbstractC4938h1.m23609m("FIDO")).m23722d();
        f19716a = c5038yM23722d.m23721c("Hybrid__client_enabled", false);
        f19717b = c5038yM23722d.m23721c("Hybrid__disavow_location_permissions", true);
        f19718c = c5038yM23722d.m23719a("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        f19719d = c5038yM23722d.m23719a("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        f19720e = c5038yM23722d.m23721c("Hybrid__prf_eval_during_create", true);
        f19721f = c5038yM23722d.m23721c("Hybrid__use_hybrid_for_server_link", false);
        f19722g = c5038yM23722d.m23721c("Hybrid__websocket_close_socket", true);
    }

    @Override // p100eb.InterfaceC4977n4
    public final boolean zza() {
        return ((Boolean) f19716a.zza()).booleanValue();
    }
}
