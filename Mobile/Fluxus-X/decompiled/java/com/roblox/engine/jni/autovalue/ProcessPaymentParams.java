package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProcessPaymentParams {

    public static abstract class a {
        public abstract ProcessPaymentParams a();

        public abstract a b(String str);

        public abstract a c(boolean z10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(String str);

        public abstract a h(String str);
    }

    public static a builder() {
        return new AutoValue_ProcessPaymentParams.a();
    }

    public abstract String checkoutSessionId();

    public abstract boolean isInApp();

    public abstract String orderId();

    public abstract String packageName();

    public abstract String paymentProviderType();

    public abstract String productId();

    public abstract String token();
}
