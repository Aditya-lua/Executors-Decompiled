package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ProcessPaymentParams extends ProcessPaymentParams {
    private final String checkoutSessionId;
    private final boolean isInApp;
    private final String orderId;
    private final String packageName;
    private final String paymentProviderType;
    private final String productId;
    private final String token;

    public static final class Builder extends ProcessPaymentParams.Builder {
        private String checkoutSessionId;
        private boolean isInApp;
        private String orderId;
        private String packageName;
        private String paymentProviderType;
        private String productId;
        private byte set$0;
        private String token;

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (this.set$0 == 1 && (str = this.paymentProviderType) != null && (str2 = this.productId) != null && (str3 = this.packageName) != null && (str4 = this.orderId) != null && (str5 = this.token) != null) {
                return new AutoValue_ProcessPaymentParams(this.checkoutSessionId, str, str2, str3, str4, str5, this.isInApp);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.paymentProviderType == null) {
                sb2.append(" paymentProviderType");
            }
            if (this.productId == null) {
                sb2.append(" productId");
            }
            if (this.packageName == null) {
                sb2.append(" packageName");
            }
            if (this.orderId == null) {
                sb2.append(" orderId");
            }
            if (this.token == null) {
                sb2.append(" token");
            }
            if ((1 & this.set$0) == 0) {
                sb2.append(" isInApp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setCheckoutSessionId(String str) {
            this.checkoutSessionId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setIsInApp(boolean z10) {
            this.isInApp = z10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setOrderId(String str) {
            if (str == null) {
                throw new NullPointerException("Null orderId");
            }
            this.orderId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setPackageName(String str) {
            if (str == null) {
                throw new NullPointerException("Null packageName");
            }
            this.packageName = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setPaymentProviderType(String str) {
            if (str == null) {
                throw new NullPointerException("Null paymentProviderType");
            }
            this.paymentProviderType = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null productId");
            }
            this.productId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.Builder
        public ProcessPaymentParams.Builder setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.token = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String checkoutSessionId() {
        return this.checkoutSessionId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessPaymentParams) {
            ProcessPaymentParams processPaymentParams = (ProcessPaymentParams) obj;
            String str = this.checkoutSessionId;
            if (str != null ? str.equals(processPaymentParams.checkoutSessionId()) : processPaymentParams.checkoutSessionId() == null) {
                if (this.paymentProviderType.equals(processPaymentParams.paymentProviderType()) && this.productId.equals(processPaymentParams.productId()) && this.packageName.equals(processPaymentParams.packageName()) && this.orderId.equals(processPaymentParams.orderId()) && this.token.equals(processPaymentParams.token()) && this.isInApp == processPaymentParams.isInApp()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.checkoutSessionId;
        return (((((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.paymentProviderType.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003) ^ this.packageName.hashCode()) * 1000003) ^ this.orderId.hashCode()) * 1000003) ^ this.token.hashCode()) * 1000003) ^ (this.isInApp ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public boolean isInApp() {
        return this.isInApp;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String orderId() {
        return this.orderId;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String packageName() {
        return this.packageName;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String paymentProviderType() {
        return this.paymentProviderType;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String productId() {
        return this.productId;
    }

    public String toString() {
        return "ProcessPaymentParams{checkoutSessionId=" + this.checkoutSessionId + ", paymentProviderType=" + this.paymentProviderType + ", productId=" + this.productId + ", packageName=" + this.packageName + ", orderId=" + this.orderId + ", token=" + this.token + ", isInApp=" + this.isInApp + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String token() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AutoValue_ProcessPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
        this.checkoutSessionId = str;
        this.paymentProviderType = str2;
        this.productId = str3;
        this.packageName = str4;
        this.orderId = str5;
        this.token = str6;
        this.isInApp = z10;
    }
}
