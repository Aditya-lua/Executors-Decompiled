package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends NativeInitCrashpadParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9737a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f9742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9745j;

    /* JADX INFO: renamed from: com.roblox.engine.jni.model.a$a, reason: collision with other inner class name */
    public static final class C0154a extends NativeInitCrashpadParams.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9746a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f9751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f9753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f9755k;

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            if (this.f9755k == 3 && (str = this.f9746a) != null && (str2 = this.b) != null && (str3 = this.f9747c) != null && (str4 = this.f9748d) != null && (str5 = this.f9749e) != null && (str6 = this.f9750f) != null && (list = this.f9751g) != null && (str7 = this.f9753i) != null) {
                return new a(str, str2, str3, str4, str5, str6, list, this.f9752h, str7, this.f9754j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9746a == null) {
                sb2.append(" appVersion");
            }
            if (this.b == null) {
                sb2.append(" baseUrl");
            }
            if (this.f9747c == null) {
                sb2.append(" countName");
            }
            if (this.f9748d == null) {
                sb2.append(" uploadUrl");
            }
            if (this.f9749e == null) {
                sb2.append(" token");
            }
            if (this.f9750f == null) {
                sb2.append(" handlerClassName");
            }
            if (this.f9751g == null) {
                sb2.append(" envArgs");
            }
            if ((this.f9755k & 1) == 0) {
                sb2.append(" isAtLeastQ");
            }
            if (this.f9753i == null) {
                sb2.append(" buildVariant");
            }
            if ((this.f9755k & 2) == 0) {
                sb2.append(" collectLogcat");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null appVersion");
            }
            this.f9746a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null baseUrl");
            }
            this.b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVariant");
            }
            this.f9753i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder f(boolean z10) {
            this.f9754j = z10;
            this.f9755k = (byte) (this.f9755k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null countName");
            }
            this.f9747c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder h(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null envArgs");
            }
            this.f9751g = list;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder i(String str) {
            if (str == null) {
                throw new NullPointerException("Null handlerClassName");
            }
            this.f9750f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder j(boolean z10) {
            this.f9752h = z10;
            this.f9755k = (byte) (this.f9755k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder k(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f9749e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder l(String str) {
            if (str == null) {
                throw new NullPointerException("Null uploadUrl");
            }
            this.f9748d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String appVersion() {
        return this.f9737a;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String baseUrl() {
        return this.b;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String buildVariant() {
        return this.f9744i;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean collectLogcat() {
        return this.f9745j;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String countName() {
        return this.f9738c;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public List<String> envArgs() {
        return this.f9742g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeInitCrashpadParams) {
            NativeInitCrashpadParams nativeInitCrashpadParams = (NativeInitCrashpadParams) obj;
            if (this.f9737a.equals(nativeInitCrashpadParams.appVersion()) && this.b.equals(nativeInitCrashpadParams.baseUrl()) && this.f9738c.equals(nativeInitCrashpadParams.countName()) && this.f9739d.equals(nativeInitCrashpadParams.uploadUrl()) && this.f9740e.equals(nativeInitCrashpadParams.token()) && this.f9741f.equals(nativeInitCrashpadParams.handlerClassName()) && this.f9742g.equals(nativeInitCrashpadParams.envArgs()) && this.f9743h == nativeInitCrashpadParams.isAtLeastQ() && this.f9744i.equals(nativeInitCrashpadParams.buildVariant()) && this.f9745j == nativeInitCrashpadParams.collectLogcat()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String handlerClassName() {
        return this.f9741f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f9737a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f9738c.hashCode()) * 1000003) ^ this.f9739d.hashCode()) * 1000003) ^ this.f9740e.hashCode()) * 1000003) ^ this.f9741f.hashCode()) * 1000003) ^ this.f9742g.hashCode()) * 1000003) ^ (this.f9743h ? 1231 : 1237)) * 1000003) ^ this.f9744i.hashCode()) * 1000003) ^ (this.f9745j ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean isAtLeastQ() {
        return this.f9743h;
    }

    public String toString() {
        return "NativeInitCrashpadParams{appVersion=" + this.f9737a + ", baseUrl=" + this.b + ", countName=" + this.f9738c + ", uploadUrl=" + this.f9739d + ", token=" + this.f9740e + ", handlerClassName=" + this.f9741f + ", envArgs=" + this.f9742g + ", isAtLeastQ=" + this.f9743h + ", buildVariant=" + this.f9744i + ", collectLogcat=" + this.f9745j + "}";
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String token() {
        return this.f9740e;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String uploadUrl() {
        return this.f9739d;
    }

    private a(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, boolean z10, String str7, boolean z11) {
        this.f9737a = str;
        this.b = str2;
        this.f9738c = str3;
        this.f9739d = str4;
        this.f9740e = str5;
        this.f9741f = str6;
        this.f9742g = list;
        this.f9743h = z10;
        this.f9744i = str7;
        this.f9745j = z11;
    }
}
