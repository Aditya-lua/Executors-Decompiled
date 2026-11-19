package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreparePaymentParams {

    public static abstract class a {
        public abstract PreparePaymentParams a();

        public abstract a b(String str);

        public abstract a c(boolean z10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);
    }

    public static a builder() {
        return new AutoValue_PreparePaymentParams.a();
    }

    public abstract String currencyCode();

    public abstract boolean isInApp();

    public abstract String paymentMethod();

    public abstract String paymentSessionId();

    public abstract String productId();
}
