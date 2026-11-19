package com.roblox.engine.jni.autovalue;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_NativePurchaseContext extends NativePurchaseContext {
    private final boolean isInApp;
    private final String paymentSessionId;
    private final String purchaseType;

    public static final class a extends NativePurchaseContext.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9563a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f9565d;

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.a
        public NativePurchaseContext a() {
            String str;
            if (this.f9565d == 1 && (str = this.b) != null) {
                return new AutoValue_NativePurchaseContext(this.f9563a, str, this.f9564c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.b == null) {
                sb2.append(" purchaseType");
            }
            if ((1 & this.f9565d) == 0) {
                sb2.append(" isInApp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.a
        public NativePurchaseContext.a b(boolean z10) {
            this.f9564c = z10;
            this.f9565d = (byte) (this.f9565d | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.a
        public NativePurchaseContext.a c(String str) {
            this.f9563a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext.a
        public NativePurchaseContext.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null purchaseType");
            }
            this.b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativePurchaseContext) {
            NativePurchaseContext nativePurchaseContext = (NativePurchaseContext) obj;
            String str = this.paymentSessionId;
            if (str != null ? str.equals(nativePurchaseContext.paymentSessionId()) : nativePurchaseContext.paymentSessionId() == null) {
                if (this.purchaseType.equals(nativePurchaseContext.purchaseType()) && this.isInApp == nativePurchaseContext.isInApp()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.paymentSessionId;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.purchaseType.hashCode()) * 1000003) ^ (this.isInApp ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext
    public boolean isInApp() {
        return this.isInApp;
    }

    @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext
    public String paymentSessionId() {
        return this.paymentSessionId;
    }

    @Override // com.roblox.engine.jni.autovalue.NativePurchaseContext
    public String purchaseType() {
        return this.purchaseType;
    }

    public String toString() {
        return "NativePurchaseContext{paymentSessionId=" + this.paymentSessionId + ", purchaseType=" + this.purchaseType + ", isInApp=" + this.isInApp + "}";
    }

    private AutoValue_NativePurchaseContext(String str, String str2, boolean z10) {
        this.paymentSessionId = str;
        this.purchaseType = str2;
        this.isInApp = z10;
    }
}
