package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativePurchaseContext {

    public static abstract class a {
        public abstract NativePurchaseContext a();

        public abstract a b(boolean z10);

        public abstract a c(String str);

        public abstract a d(String str);
    }

    public static a builder() {
        return new AutoValue_NativePurchaseContext.a();
    }

    public static NativePurchaseContext create(String str, String str2, boolean z10) {
        return builder().c(str).d(str2).b(z10).a();
    }

    public abstract boolean isInApp();

    public abstract String paymentSessionId();

    public abstract String purchaseType();
}
