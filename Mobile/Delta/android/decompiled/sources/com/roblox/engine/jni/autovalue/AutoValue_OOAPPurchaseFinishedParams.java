package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_OOAPPurchaseFinishedParams extends OOAPPurchaseFinishedParams {
    private final String currencyCode;
    private final String description;
    private final String displayPrice;
    private final String nativeProductId;
    private final float price;
    private final String productId;
    private final String robloxPurchaseInfo;
    private final int robuxAmount;

    public static final class Builder extends OOAPPurchaseFinishedParams.Builder {
        private String currencyCode;
        private String description;
        private String displayPrice;
        private String nativeProductId;
        private float price;
        private String productId;
        private String robloxPurchaseInfo;
        private int robuxAmount;
        private byte set$0;

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            if (this.set$0 == 3 && (str = this.productId) != null && (str2 = this.nativeProductId) != null && (str3 = this.description) != null && (str4 = this.displayPrice) != null && (str5 = this.currencyCode) != null && (str6 = this.robloxPurchaseInfo) != null) {
                return new AutoValue_OOAPPurchaseFinishedParams(str, str2, this.robuxAmount, str3, str4, this.price, str5, str6);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.productId == null) {
                sb2.append(" productId");
            }
            if (this.nativeProductId == null) {
                sb2.append(" nativeProductId");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" robuxAmount");
            }
            if (this.description == null) {
                sb2.append(" description");
            }
            if (this.displayPrice == null) {
                sb2.append(" displayPrice");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" price");
            }
            if (this.currencyCode == null) {
                sb2.append(" currencyCode");
            }
            if (this.robloxPurchaseInfo == null) {
                sb2.append(" robloxPurchaseInfo");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setCurrencyCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null currencyCode");
            }
            this.currencyCode = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setDescription(String str) {
            if (str == null) {
                throw new NullPointerException("Null description");
            }
            this.description = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setDisplayPrice(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayPrice");
            }
            this.displayPrice = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setNativeProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null nativeProductId");
            }
            this.nativeProductId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setPrice(float f10) {
            this.price = f10;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setProductId(String str) {
            if (str == null) {
                throw new NullPointerException("Null productId");
            }
            this.productId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setRobloxPurchaseInfo(String str) {
            if (str == null) {
                throw new NullPointerException("Null robloxPurchaseInfo");
            }
            this.robloxPurchaseInfo = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.Builder
        public OOAPPurchaseFinishedParams.Builder setRobuxAmount(int i10) {
            this.robuxAmount = i10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public String currencyCode() {
        return this.currencyCode;
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public String description() {
        return this.description;
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public String displayPrice() {
        return this.displayPrice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OOAPPurchaseFinishedParams) {
            OOAPPurchaseFinishedParams oOAPPurchaseFinishedParams = (OOAPPurchaseFinishedParams) obj;
            if (this.productId.equals(oOAPPurchaseFinishedParams.productId()) && this.nativeProductId.equals(oOAPPurchaseFinishedParams.nativeProductId()) && this.robuxAmount == oOAPPurchaseFinishedParams.robuxAmount() && this.description.equals(oOAPPurchaseFinishedParams.description()) && this.displayPrice.equals(oOAPPurchaseFinishedParams.displayPrice()) && Float.floatToIntBits(this.price) == Float.floatToIntBits(oOAPPurchaseFinishedParams.price()) && this.currencyCode.equals(oOAPPurchaseFinishedParams.currencyCode()) && this.robloxPurchaseInfo.equals(oOAPPurchaseFinishedParams.robloxPurchaseInfo())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.productId.hashCode() ^ 1000003) * 1000003) ^ this.nativeProductId.hashCode()) * 1000003) ^ this.robuxAmount) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.displayPrice.hashCode()) * 1000003) ^ Float.floatToIntBits(this.price)) * 1000003) ^ this.currencyCode.hashCode()) * 1000003) ^ this.robloxPurchaseInfo.hashCode();
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public String nativeProductId() {
        return this.nativeProductId;
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public float price() {
        return this.price;
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public String productId() {
        return this.productId;
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public String robloxPurchaseInfo() {
        return this.robloxPurchaseInfo;
    }

    @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams
    public int robuxAmount() {
        return this.robuxAmount;
    }

    public String toString() {
        return "OOAPPurchaseFinishedParams{productId=" + this.productId + ", nativeProductId=" + this.nativeProductId + ", robuxAmount=" + this.robuxAmount + ", description=" + this.description + ", displayPrice=" + this.displayPrice + ", price=" + this.price + ", currencyCode=" + this.currencyCode + ", robloxPurchaseInfo=" + this.robloxPurchaseInfo + "}";
    }

    private AutoValue_OOAPPurchaseFinishedParams(String str, String str2, int i10, String str3, String str4, float f10, String str5, String str6) {
        this.productId = str;
        this.nativeProductId = str2;
        this.robuxAmount = i10;
        this.description = str3;
        this.displayPrice = str4;
        this.price = f10;
        this.currencyCode = str5;
        this.robloxPurchaseInfo = str6;
    }
}
