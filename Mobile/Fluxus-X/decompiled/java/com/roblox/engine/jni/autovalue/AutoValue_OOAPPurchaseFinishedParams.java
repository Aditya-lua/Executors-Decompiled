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

    public static final class a extends OOAPPurchaseFinishedParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9566a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f9570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f9571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f9572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte f9573i;

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            if (this.f9573i == 3 && (str = this.f9566a) != null && (str2 = this.b) != null && (str3 = this.f9568d) != null && (str4 = this.f9569e) != null && (str5 = this.f9571g) != null && (str6 = this.f9572h) != null) {
                return new AutoValue_OOAPPurchaseFinishedParams(str, str2, this.f9567c, str3, str4, this.f9570f, str5, str6);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9566a == null) {
                sb2.append(" productId");
            }
            if (this.b == null) {
                sb2.append(" nativeProductId");
            }
            if ((this.f9573i & 1) == 0) {
                sb2.append(" robuxAmount");
            }
            if (this.f9568d == null) {
                sb2.append(" description");
            }
            if (this.f9569e == null) {
                sb2.append(" displayPrice");
            }
            if ((this.f9573i & 2) == 0) {
                sb2.append(" price");
            }
            if (this.f9571g == null) {
                sb2.append(" currencyCode");
            }
            if (this.f9572h == null) {
                sb2.append(" robloxPurchaseInfo");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null currencyCode");
            }
            this.f9571g = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null description");
            }
            this.f9568d = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayPrice");
            }
            this.f9569e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null nativeProductId");
            }
            this.b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a f(float f10) {
            this.f9570f = f10;
            this.f9573i = (byte) (this.f9573i | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null productId");
            }
            this.f9566a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null robloxPurchaseInfo");
            }
            this.f9572h = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams.a
        public OOAPPurchaseFinishedParams.a i(int i10) {
            this.f9567c = i10;
            this.f9573i = (byte) (this.f9573i | 1);
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
