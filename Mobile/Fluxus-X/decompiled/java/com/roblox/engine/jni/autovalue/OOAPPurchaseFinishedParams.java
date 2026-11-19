package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OOAPPurchaseFinishedParams {

    public static abstract class a {
        public abstract OOAPPurchaseFinishedParams a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(float f10);

        public abstract a g(String str);

        public abstract a h(String str);

        public abstract a i(int i10);
    }

    public static a builder() {
        return new AutoValue_OOAPPurchaseFinishedParams.a();
    }

    public abstract String currencyCode();

    public abstract String description();

    public abstract String displayPrice();

    public abstract String nativeProductId();

    public abstract float price();

    public abstract String productId();

    public abstract String robloxPurchaseInfo();

    public abstract int robuxAmount();
}
