package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreparePaymentParams {

    public static abstract class Builder {
        public abstract PreparePaymentParams build();

        public abstract Builder setCurrencyCode(String str);

        public abstract Builder setIsInApp(boolean z10);

        public abstract Builder setPaymentMethod(String str);

        public abstract Builder setPaymentSessionId(String str);

        public abstract Builder setProductId(String str);
    }

    public static Builder builder() {
        return new AutoValue_PreparePaymentParams.Builder();
    }

    public abstract String currencyCode();

    public abstract boolean isInApp();

    public abstract String paymentMethod();

    public abstract String paymentSessionId();

    public abstract String productId();
}
