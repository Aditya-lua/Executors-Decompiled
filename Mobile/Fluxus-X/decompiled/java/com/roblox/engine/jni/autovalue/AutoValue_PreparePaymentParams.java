package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_PreparePaymentParams extends PreparePaymentParams {
    private final String currencyCode;
    private final boolean isInApp;
    private final String paymentMethod;
    private final String paymentSessionId;
    private final String productId;

    public static final class a extends PreparePaymentParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9574a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f9578f;

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.a
        public PreparePaymentParams a() {
            String str;
            String str2;
            if (this.f9578f == 1 && (str = this.f9574a) != null && (str2 = this.f9576d) != null) {
                return new AutoValue_PreparePaymentParams(str, this.b, this.f9575c, str2, this.f9577e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9574a == null) {
                sb2.append(" productId");
            }
            if (this.f9576d == null) {
                sb2.append(" paymentMethod");
            }
            if ((1 & this.f9578f) == 0) {
                sb2.append(" isInApp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.a
        public PreparePaymentParams.a b(String str) {
            this.b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.a
        public PreparePaymentParams.a c(boolean z10) {
            this.f9577e = z10;
            this.f9578f = (byte) (this.f9578f | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.a
        public PreparePaymentParams.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null paymentMethod");
            }
            this.f9576d = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.a
        public PreparePaymentParams.a e(String str) {
            this.f9575c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.a
        public PreparePaymentParams.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null productId");
            }
            this.f9574a = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams
    public String currencyCode() {
        return this.currencyCode;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePaymentParams) {
            PreparePaymentParams preparePaymentParams = (PreparePaymentParams) obj;
            if (this.productId.equals(preparePaymentParams.productId()) && ((str = this.currencyCode) != null ? str.equals(preparePaymentParams.currencyCode()) : preparePaymentParams.currencyCode() == null) && ((str2 = this.paymentSessionId) != null ? str2.equals(preparePaymentParams.paymentSessionId()) : preparePaymentParams.paymentSessionId() == null) && this.paymentMethod.equals(preparePaymentParams.paymentMethod()) && this.isInApp == preparePaymentParams.isInApp()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.productId.hashCode() ^ 1000003) * 1000003;
        String str = this.currencyCode;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.paymentSessionId;
        return ((((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.paymentMethod.hashCode()) * 1000003) ^ (this.isInApp ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams
    public boolean isInApp() {
        return this.isInApp;
    }

    @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams
    public String paymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams
    public String paymentSessionId() {
        return this.paymentSessionId;
    }

    @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams
    public String productId() {
        return this.productId;
    }

    public String toString() {
        return "PreparePaymentParams{productId=" + this.productId + ", currencyCode=" + this.currencyCode + ", paymentSessionId=" + this.paymentSessionId + ", paymentMethod=" + this.paymentMethod + ", isInApp=" + this.isInApp + "}";
    }

    private AutoValue_PreparePaymentParams(String str, String str2, String str3, String str4, boolean z10) {
        this.productId = str;
        this.currencyCode = str2;
        this.paymentSessionId = str3;
        this.paymentMethod = str4;
        this.isInApp = z10;
    }
}
