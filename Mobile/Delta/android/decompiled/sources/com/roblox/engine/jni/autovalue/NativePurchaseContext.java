package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativePurchaseContext {

    public static abstract class Builder {
        public abstract NativePurchaseContext build();

        public abstract Builder setIsInApp(boolean z10);

        public abstract Builder setPaymentSessionId(String str);

        public abstract Builder setPurchaseType(String str);
    }

    public static Builder builder() {
        return new AutoValue_NativePurchaseContext.Builder();
    }

    public static NativePurchaseContext create(String str, String str2, boolean z10) {
        return builder().setPaymentSessionId(str).setPurchaseType(str2).setIsInApp(z10).build();
    }

    public abstract boolean isInApp();

    public abstract String paymentSessionId();

    public abstract String purchaseType();
}
