package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_NativeInitCrashpadParams extends NativeInitCrashpadParams {
    private final String appVersion;
    private final String baseUrl;
    private final String buildVariant;
    private final boolean collectLogcat;
    private final String countName;
    private final List<String> envArgs;
    private final String handlerClassName;
    private final boolean isAtLeastQ;
    private final String token;
    private final String uploadUrl;

    public static final class a extends NativeInitCrashpadParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9627a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f9632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9633h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f9634i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9635j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f9636k;

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            if (this.f9636k == 3 && (str = this.f9627a) != null && (str2 = this.b) != null && (str3 = this.f9628c) != null && (str4 = this.f9629d) != null && (str5 = this.f9630e) != null && (str6 = this.f9631f) != null && (list = this.f9632g) != null && (str7 = this.f9634i) != null) {
                return new AutoValue_NativeInitCrashpadParams(str, str2, str3, str4, str5, str6, list, this.f9633h, str7, this.f9635j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9627a == null) {
                sb2.append(" appVersion");
            }
            if (this.b == null) {
                sb2.append(" baseUrl");
            }
            if (this.f9628c == null) {
                sb2.append(" countName");
            }
            if (this.f9629d == null) {
                sb2.append(" uploadUrl");
            }
            if (this.f9630e == null) {
                sb2.append(" token");
            }
            if (this.f9631f == null) {
                sb2.append(" handlerClassName");
            }
            if (this.f9632g == null) {
                sb2.append(" envArgs");
            }
            if ((this.f9636k & 1) == 0) {
                sb2.append(" isAtLeastQ");
            }
            if (this.f9634i == null) {
                sb2.append(" buildVariant");
            }
            if ((this.f9636k & 2) == 0) {
                sb2.append(" collectLogcat");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null appVersion");
            }
            this.f9627a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null baseUrl");
            }
            this.b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVariant");
            }
            this.f9634i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a f(boolean z10) {
            this.f9635j = z10;
            this.f9636k = (byte) (this.f9636k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null countName");
            }
            this.f9628c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a h(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null envArgs");
            }
            this.f9632g = list;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null handlerClassName");
            }
            this.f9631f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a j(boolean z10) {
            this.f9633h = z10;
            this.f9636k = (byte) (this.f9636k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a k(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f9630e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.a
        public NativeInitCrashpadParams.a l(String str) {
            if (str == null) {
                throw new NullPointerException("Null uploadUrl");
            }
            this.f9629d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String appVersion() {
        return this.appVersion;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String baseUrl() {
        return this.baseUrl;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String buildVariant() {
        return this.buildVariant;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean collectLogcat() {
        return this.collectLogcat;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String countName() {
        return this.countName;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public List<String> envArgs() {
        return this.envArgs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeInitCrashpadParams) {
            NativeInitCrashpadParams nativeInitCrashpadParams = (NativeInitCrashpadParams) obj;
            if (this.appVersion.equals(nativeInitCrashpadParams.appVersion()) && this.baseUrl.equals(nativeInitCrashpadParams.baseUrl()) && this.countName.equals(nativeInitCrashpadParams.countName()) && this.uploadUrl.equals(nativeInitCrashpadParams.uploadUrl()) && this.token.equals(nativeInitCrashpadParams.token()) && this.handlerClassName.equals(nativeInitCrashpadParams.handlerClassName()) && this.envArgs.equals(nativeInitCrashpadParams.envArgs()) && this.isAtLeastQ == nativeInitCrashpadParams.isAtLeastQ() && this.buildVariant.equals(nativeInitCrashpadParams.buildVariant()) && this.collectLogcat == nativeInitCrashpadParams.collectLogcat()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String handlerClassName() {
        return this.handlerClassName;
    }

    public int hashCode() {
        return ((((((((((((((((((this.appVersion.hashCode() ^ 1000003) * 1000003) ^ this.baseUrl.hashCode()) * 1000003) ^ this.countName.hashCode()) * 1000003) ^ this.uploadUrl.hashCode()) * 1000003) ^ this.token.hashCode()) * 1000003) ^ this.handlerClassName.hashCode()) * 1000003) ^ this.envArgs.hashCode()) * 1000003) ^ (this.isAtLeastQ ? 1231 : 1237)) * 1000003) ^ this.buildVariant.hashCode()) * 1000003) ^ (this.collectLogcat ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean isAtLeastQ() {
        return this.isAtLeastQ;
    }

    public String toString() {
        return "NativeInitCrashpadParams{appVersion=" + this.appVersion + ", baseUrl=" + this.baseUrl + ", countName=" + this.countName + ", uploadUrl=" + this.uploadUrl + ", token=" + this.token + ", handlerClassName=" + this.handlerClassName + ", envArgs=" + this.envArgs + ", isAtLeastQ=" + this.isAtLeastQ + ", buildVariant=" + this.buildVariant + ", collectLogcat=" + this.collectLogcat + "}";
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String token() {
        return this.token;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String uploadUrl() {
        return this.uploadUrl;
    }

    private AutoValue_NativeInitCrashpadParams(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, boolean z10, String str7, boolean z11) {
        this.appVersion = str;
        this.baseUrl = str2;
        this.countName = str3;
        this.uploadUrl = str4;
        this.token = str5;
        this.handlerClassName = str6;
        this.envArgs = list;
        this.isAtLeastQ = z10;
        this.buildVariant = str7;
        this.collectLogcat = z11;
    }
}
