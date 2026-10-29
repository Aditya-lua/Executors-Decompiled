package fj;

import gi.InterfaceC6100a;
import p486v7.C12052k;

/* JADX INFO: renamed from: fj.d */
/* JADX INFO: loaded from: classes2.dex */
public class C5618d implements InterfaceC6100a {
    private boolean isInApp;
    private boolean isRetry;
    private String orderId;
    private String packageName;
    private String productId;
    private String token;

    public C5618d(C12052k c12052k, boolean z10, boolean z11) {
        this.packageName = c12052k.m44883d();
        this.productId = C5614b.m25427j(c12052k);
        this.orderId = c12052k.m44881b();
        this.isRetry = z10;
        this.token = c12052k.m44886g();
        this.isInApp = z11;
    }
}
