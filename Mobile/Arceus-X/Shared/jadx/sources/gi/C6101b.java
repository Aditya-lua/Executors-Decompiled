package gi;

/* JADX INFO: renamed from: gi.b */
/* JADX INFO: loaded from: classes2.dex */
public class C6101b implements InterfaceC6100a {
    private String currency;
    private String paymentSessionId;
    private String productId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6101b(String str, String str2) {
        this.productId = str;
        this.currency = str2;
    }

    public C6101b(String str, String str2, String str3) {
        this.productId = str;
        this.currency = str2;
        this.paymentSessionId = str3;
    }
}
