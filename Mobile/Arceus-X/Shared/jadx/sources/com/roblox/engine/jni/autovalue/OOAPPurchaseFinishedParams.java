package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OOAPPurchaseFinishedParams {

    public static abstract class Builder {
        public abstract OOAPPurchaseFinishedParams build();

        public abstract Builder setCurrencyCode(String str);

        public abstract Builder setDescription(String str);

        public abstract Builder setDisplayPrice(String str);

        public abstract Builder setNativeProductId(String str);

        public abstract Builder setPrice(float f10);

        public abstract Builder setProductId(String str);

        public abstract Builder setRobloxPurchaseInfo(String str);

        public abstract Builder setRobuxAmount(int i10);
    }

    public static Builder builder() {
        return new AutoValue_OOAPPurchaseFinishedParams.Builder();
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
