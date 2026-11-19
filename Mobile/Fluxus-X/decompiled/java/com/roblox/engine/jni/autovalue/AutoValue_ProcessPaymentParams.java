package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ProcessPaymentParams extends ProcessPaymentParams {
    private final String checkoutSessionId;
    private final boolean isInApp;
    private final String orderId;
    private final String packageName;
    private final String paymentProviderType;
    private final String productId;
    private final String token;

    public static final class a extends ProcessPaymentParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9579a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f9585h;

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (this.f9585h == 1 && (str = this.b) != null && (str2 = this.f9580c) != null && (str3 = this.f9581d) != null && (str4 = this.f9582e) != null && (str5 = this.f9583f) != null) {
                return new AutoValue_ProcessPaymentParams(this.f9579a, str, str2, str3, str4, str5, this.f9584g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.b == null) {
                sb2.append(" paymentProviderType");
            }
            if (this.f9580c == null) {
                sb2.append(" productId");
            }
            if (this.f9581d == null) {
                sb2.append(" packageName");
            }
            if (this.f9582e == null) {
                sb2.append(" orderId");
            }
            if (this.f9583f == null) {
                sb2.append(" token");
            }
            if ((1 & this.f9585h) == 0) {
                sb2.append(" isInApp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a b(String str) {
            this.f9579a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a c(boolean z10) {
            this.f9584g = z10;
            this.f9585h = (byte) (this.f9585h | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null orderId");
            }
            this.f9582e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null packageName");
            }
            this.f9581d = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null paymentProviderType");
            }
            this.b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null productId");
            }
            this.f9580c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams.a
        public ProcessPaymentParams.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f9583f = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String checkoutSessionId() {
        return this.checkoutSessionId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessPaymentParams) {
            ProcessPaymentParams processPaymentParams = (ProcessPaymentParams) obj;
            String str = this.checkoutSessionId;
            if (str != null ? str.equals(processPaymentParams.checkoutSessionId()) : processPaymentParams.checkoutSessionId() == null) {
                if (this.paymentProviderType.equals(processPaymentParams.paymentProviderType()) && this.productId.equals(processPaymentParams.productId()) && this.packageName.equals(processPaymentParams.packageName()) && this.orderId.equals(processPaymentParams.orderId()) && this.token.equals(processPaymentParams.token()) && this.isInApp == processPaymentParams.isInApp()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.checkoutSessionId;
        return (((((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.paymentProviderType.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003) ^ this.packageName.hashCode()) * 1000003) ^ this.orderId.hashCode()) * 1000003) ^ this.token.hashCode()) * 1000003) ^ (this.isInApp ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public boolean isInApp() {
        return this.isInApp;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String orderId() {
        return this.orderId;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String packageName() {
        return this.packageName;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String paymentProviderType() {
        return this.paymentProviderType;
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String productId() {
        return this.productId;
    }

    public String toString() {
        return "ProcessPaymentParams{checkoutSessionId=" + this.checkoutSessionId + ", paymentProviderType=" + this.paymentProviderType + ", productId=" + this.productId + ", packageName=" + this.packageName + ", orderId=" + this.orderId + ", token=" + this.token + ", isInApp=" + this.isInApp + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.ProcessPaymentParams
    public String token() {
        return this.token;
    }

    private AutoValue_ProcessPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
        this.checkoutSessionId = str;
        this.paymentProviderType = str2;
        this.productId = str3;
        this.packageName = str4;
        this.orderId = str5;
        this.token = str6;
        this.isInApp = z10;
    }
}
