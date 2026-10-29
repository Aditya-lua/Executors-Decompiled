package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProcessPaymentParams {

    public static abstract class Builder {
        public abstract ProcessPaymentParams build();

        public abstract Builder setCheckoutSessionId(String str);

        public abstract Builder setIsInApp(boolean z10);

        public abstract Builder setOrderId(String str);

        public abstract Builder setPackageName(String str);

        public abstract Builder setPaymentProviderType(String str);

        public abstract Builder setProductId(String str);

        public abstract Builder setToken(String str);
    }

    public static Builder builder() {
        return new AutoValue_ProcessPaymentParams.Builder();
    }

    public abstract String checkoutSessionId();

    public abstract boolean isInApp();

    public abstract String orderId();

    public abstract String packageName();

    public abstract String paymentProviderType();

    public abstract String productId();

    public abstract String token();
}
