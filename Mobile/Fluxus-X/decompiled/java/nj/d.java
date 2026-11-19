package nj;

/* JADX INFO: loaded from: classes2.dex */
public class d implements oi.a {
    private boolean isInApp;
    private boolean isRetry;
    private String orderId;
    private String packageName;
    private String productId;
    private String token;

    public d(w7.k kVar, boolean z10, boolean z11) {
        this.packageName = kVar.d();
        this.productId = b.k(kVar);
        this.orderId = kVar.b();
        this.isRetry = z10;
        this.token = kVar.g();
        this.isInApp = z11;
    }
}
