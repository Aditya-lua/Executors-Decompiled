package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends NativeInitCrashpadParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9657a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f9662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9665j;

    /* JADX INFO: renamed from: com.roblox.engine.jni.model.a$a, reason: collision with other inner class name */
    public static final class C0151a extends NativeInitCrashpadParams.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9666a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f9671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9672h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f9673i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9674j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f9675k;

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
            if (this.f9675k == 3 && (str = this.f9666a) != null && (str2 = this.b) != null && (str3 = this.f9667c) != null && (str4 = this.f9668d) != null && (str5 = this.f9669e) != null && (str6 = this.f9670f) != null && (list = this.f9671g) != null && (str7 = this.f9673i) != null) {
                return new a(str, str2, str3, str4, str5, str6, list, this.f9672h, str7, this.f9674j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9666a == null) {
                sb2.append(" appVersion");
            }
            if (this.b == null) {
                sb2.append(" baseUrl");
            }
            if (this.f9667c == null) {
                sb2.append(" countName");
            }
            if (this.f9668d == null) {
                sb2.append(" uploadUrl");
            }
            if (this.f9669e == null) {
                sb2.append(" token");
            }
            if (this.f9670f == null) {
                sb2.append(" handlerClassName");
            }
            if (this.f9671g == null) {
                sb2.append(" envArgs");
            }
            if ((this.f9675k & 1) == 0) {
                sb2.append(" isAtLeastQ");
            }
            if (this.f9673i == null) {
                sb2.append(" buildVariant");
            }
            if ((this.f9675k & 2) == 0) {
                sb2.append(" collectLogcat");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null appVersion");
            }
            this.f9666a = str;
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
            this.f9673i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder f(boolean z10) {
            this.f9674j = z10;
            this.f9675k = (byte) (this.f9675k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null countName");
            }
            this.f9667c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder h(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null envArgs");
            }
            this.f9671g = list;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder i(String str) {
            if (str == null) {
                throw new NullPointerException("Null handlerClassName");
            }
            this.f9670f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder j(boolean z10) {
            this.f9672h = z10;
            this.f9675k = (byte) (this.f9675k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder k(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f9669e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        public NativeInitCrashpadParams.Builder l(String str) {
            if (str == null) {
                throw new NullPointerException("Null uploadUrl");
            }
            this.f9668d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String appVersion() {
        return this.f9657a;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String baseUrl() {
        return this.b;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String buildVariant() {
        return this.f9664i;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean collectLogcat() {
        return this.f9665j;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String countName() {
        return this.f9658c;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public List<String> envArgs() {
        return this.f9662g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeInitCrashpadParams) {
            NativeInitCrashpadParams nativeInitCrashpadParams = (NativeInitCrashpadParams) obj;
            if (this.f9657a.equals(nativeInitCrashpadParams.appVersion()) && this.b.equals(nativeInitCrashpadParams.baseUrl()) && this.f9658c.equals(nativeInitCrashpadParams.countName()) && this.f9659d.equals(nativeInitCrashpadParams.uploadUrl()) && this.f9660e.equals(nativeInitCrashpadParams.token()) && this.f9661f.equals(nativeInitCrashpadParams.handlerClassName()) && this.f9662g.equals(nativeInitCrashpadParams.envArgs()) && this.f9663h == nativeInitCrashpadParams.isAtLeastQ() && this.f9664i.equals(nativeInitCrashpadParams.buildVariant()) && this.f9665j == nativeInitCrashpadParams.collectLogcat()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String handlerClassName() {
        return this.f9661f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f9657a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f9658c.hashCode()) * 1000003) ^ this.f9659d.hashCode()) * 1000003) ^ this.f9660e.hashCode()) * 1000003) ^ this.f9661f.hashCode()) * 1000003) ^ this.f9662g.hashCode()) * 1000003) ^ (this.f9663h ? 1231 : 1237)) * 1000003) ^ this.f9664i.hashCode()) * 1000003) ^ (this.f9665j ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean isAtLeastQ() {
        return this.f9663h;
    }

    public String toString() {
        return "NativeInitCrashpadParams{appVersion=" + this.f9657a + ", baseUrl=" + this.b + ", countName=" + this.f9658c + ", uploadUrl=" + this.f9659d + ", token=" + this.f9660e + ", handlerClassName=" + this.f9661f + ", envArgs=" + this.f9662g + ", isAtLeastQ=" + this.f9663h + ", buildVariant=" + this.f9664i + ", collectLogcat=" + this.f9665j + "}";
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String token() {
        return this.f9660e;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String uploadUrl() {
        return this.f9659d;
    }

    private a(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, boolean z10, String str7, boolean z11) {
        this.f9657a = str;
        this.b = str2;
        this.f9658c = str3;
        this.f9659d = str4;
        this.f9660e = str5;
        this.f9661f = str6;
        this.f9662g = list;
        this.f9663h = z10;
        this.f9664i = str7;
        this.f9665j = z11;
    }
}
