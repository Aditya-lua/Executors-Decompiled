package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_NativePurchaseContext extends NativePurchaseContext {
    private final boolean isInApp;
    private final String paymentSessionId;
    private final String purchaseType;

    public static final class Builder extends NativePurchaseContext.Builder {
        private boolean isInApp;
        private String paymentSessionId;
        private String purchaseType;
        private byte set$0;

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.Builder
        public NativePurchaseContext build() {
            String str;
            if (this.set$0 == 1 && (str = this.purchaseType) != null) {
                return new AutoValue_NativePurchaseContext(this.paymentSessionId, str, this.isInApp);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.purchaseType == null) {
                sb2.append(" purchaseType");
            }
            if ((1 & this.set$0) == 0) {
                sb2.append(" isInApp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.Builder
        public NativePurchaseContext.Builder setIsInApp(boolean z10) {
            this.isInApp = z10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.Builder
        public NativePurchaseContext.Builder setPaymentSessionId(String str) {
            this.paymentSessionId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.Builder
        public NativePurchaseContext.Builder setPurchaseType(String str) {
            if (str == null) {
                throw new NullPointerException("Null purchaseType");
            }
            this.purchaseType = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativePurchaseContext) {
            NativePurchaseContext nativePurchaseContext = (NativePurchaseContext) obj;
            String str = this.paymentSessionId;
            if (str != null ? str.equals(nativePurchaseContext.paymentSessionId()) : nativePurchaseContext.paymentSessionId() == null) {
                if (this.purchaseType.equals(nativePurchaseContext.purchaseType()) && this.isInApp == nativePurchaseContext.isInApp()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.paymentSessionId;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.purchaseType.hashCode()) * 1000003) ^ (this.isInApp ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext
    public boolean isInApp() {
        return this.isInApp;
    }

    @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext
    public String paymentSessionId() {
        return this.paymentSessionId;
    }

    @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext
    public String purchaseType() {
        return this.purchaseType;
    }

    public String toString() {
        return "NativePurchaseContext{paymentSessionId=" + this.paymentSessionId + ", purchaseType=" + this.purchaseType + ", isInApp=" + this.isInApp + "}";
    }

    private AutoValue_NativePurchaseContext(String str, String str2, boolean z10) {
        this.paymentSessionId = str;
        this.purchaseType = str2;
        this.isInApp = z10;
    }
}
