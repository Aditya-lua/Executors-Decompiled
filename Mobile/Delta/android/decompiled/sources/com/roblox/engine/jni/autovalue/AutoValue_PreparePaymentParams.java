package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_PreparePaymentParams extends PreparePaymentParams {
    private final String currencyCode;
    private final boolean isInApp;
    private final String paymentMethod;
    private final String paymentSessionId;
    private final String productId;

    public static final class Builder extends PreparePaymentParams.Builder {
        private String currencyCode;
        private boolean isInApp;
        private String paymentMethod;
        private String paymentSessionId;
        private String productId;
        private byte set$0;

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.Builder
        public PreparePaymentParams build() {
            String str;
            String str2;
            if (this.set$0 == 1 && (str = this.productId) != null && (str2 = this.paymentMethod) != null) {
                return new AutoValue_PreparePaymentParams(str, this.currencyCode, this.paymentSessionId, str2, this.isInApp);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.productId == null) {
                sb2.append(" productId");
            }
            if (this.paymentMethod == null) {
                sb2.append(" paymentMethod");
            }
            if ((1 & this.set$0) == 0) {
                sb2.append(" isInApp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.Builder
        public PreparePaymentParams.Builder setCurrencyCode(String str) {
            this.currencyCode = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.Builder
        public PreparePaymentParams.Builder setIsInApp(boolean z10) {
            this.isInApp = z10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.Builder
        public PreparePaymentParams.Builder setPaymentMethod(String str) {
            if (str == null) {
                throw new NullPointerException("Null paymentMethod");
            }
            this.paymentMethod = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.Builder
        public PreparePaymentParams.Builder setPaymentSessionId(String str) {
            this.paymentSessionId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.PreparePaymentParams.Builder
        public PreparePaymentParams.Builder setProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null productId");
            }
            this.productId = str;
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
