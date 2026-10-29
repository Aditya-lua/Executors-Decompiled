package gi;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {
    private String currency;
    private String paymentSessionId;
    private String productId;

    public b(String str, String str2) {
        this.productId = str;
        this.currency = str2;
    }

    public b(String str, String str2, String str3) {
        this.productId = str;
        this.currency = str2;
        this.paymentSessionId = str3;
    }
}
