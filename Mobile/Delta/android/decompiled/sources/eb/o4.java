package eb;

/* JADX INFO: loaded from: classes.dex */
public final class o4 implements n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15318a;
    public static final q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f15319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f15320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f15321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f15322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f15323g;

    static {
        y yVarD = new y("com.google.android.gms.fido").e(h1.m("FIDO")).d();
        f15318a = yVarD.c("Hybrid__client_enabled", false);
        b = yVarD.c("Hybrid__disavow_location_permissions", true);
        f15319c = yVarD.a("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        f15320d = yVarD.a("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        f15321e = yVarD.c("Hybrid__prf_eval_during_create", true);
        f15322f = yVarD.c("Hybrid__use_hybrid_for_server_link", false);
        f15323g = yVarD.c("Hybrid__websocket_close_socket", true);
    }

    @Override // eb.n4
    public final boolean zza() {
        return ((Boolean) f15318a.zza()).booleanValue();
    }
}
