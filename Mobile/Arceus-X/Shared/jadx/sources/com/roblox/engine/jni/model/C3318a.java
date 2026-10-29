package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: renamed from: com.roblox.engine.jni.model.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3318a extends NativeInitCrashpadParams {

    /* JADX INFO: renamed from: a */
    public final String f12596a;

    /* JADX INFO: renamed from: b */
    public final String f12597b;

    /* JADX INFO: renamed from: c */
    public final String f12598c;

    /* JADX INFO: renamed from: d */
    public final String f12599d;

    /* JADX INFO: renamed from: e */
    public final String f12600e;

    /* JADX INFO: renamed from: f */
    public final String f12601f;

    /* JADX INFO: renamed from: g */
    public final List<String> f12602g;

    /* JADX INFO: renamed from: h */
    public final boolean f12603h;

    /* JADX INFO: renamed from: i */
    public final String f12604i;

    /* JADX INFO: renamed from: j */
    public final boolean f12605j;

    /* JADX INFO: renamed from: com.roblox.engine.jni.model.a$a */
    public static final class a extends NativeInitCrashpadParams.Builder {

        /* JADX INFO: renamed from: a */
        public String f12606a;

        /* JADX INFO: renamed from: b */
        public String f12607b;

        /* JADX INFO: renamed from: c */
        public String f12608c;

        /* JADX INFO: renamed from: d */
        public String f12609d;

        /* JADX INFO: renamed from: e */
        public String f12610e;

        /* JADX INFO: renamed from: f */
        public String f12611f;

        /* JADX INFO: renamed from: g */
        public List<String> f12612g;

        /* JADX INFO: renamed from: h */
        public boolean f12613h;

        /* JADX INFO: renamed from: i */
        public String f12614i;

        /* JADX INFO: renamed from: j */
        public boolean f12615j;

        /* JADX INFO: renamed from: k */
        public byte f12616k;

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: a */
        public NativeInitCrashpadParams mo15816a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            if (this.f12616k == 3 && (str = this.f12606a) != null && (str2 = this.f12607b) != null && (str3 = this.f12608c) != null && (str4 = this.f12609d) != null && (str5 = this.f12610e) != null && (str6 = this.f12611f) != null && (list = this.f12612g) != null && (str7 = this.f12614i) != null) {
                return new C3318a(str, str2, str3, str4, str5, str6, list, this.f12613h, str7, this.f12615j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f12606a == null) {
                sb2.append(" appVersion");
            }
            if (this.f12607b == null) {
                sb2.append(" baseUrl");
            }
            if (this.f12608c == null) {
                sb2.append(" countName");
            }
            if (this.f12609d == null) {
                sb2.append(" uploadUrl");
            }
            if (this.f12610e == null) {
                sb2.append(" token");
            }
            if (this.f12611f == null) {
                sb2.append(" handlerClassName");
            }
            if (this.f12612g == null) {
                sb2.append(" envArgs");
            }
            if ((this.f12616k & 1) == 0) {
                sb2.append(" isAtLeastQ");
            }
            if (this.f12614i == null) {
                sb2.append(" buildVariant");
            }
            if ((this.f12616k & 2) == 0) {
                sb2.append(" collectLogcat");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: c */
        public NativeInitCrashpadParams.Builder mo15818c(String str) {
            if (str == null) {
                throw new NullPointerException("Null appVersion");
            }
            this.f12606a = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: d */
        public NativeInitCrashpadParams.Builder mo15819d(String str) {
            if (str == null) {
                throw new NullPointerException("Null baseUrl");
            }
            this.f12607b = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: e */
        public NativeInitCrashpadParams.Builder mo15820e(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVariant");
            }
            this.f12614i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: f */
        public NativeInitCrashpadParams.Builder mo15821f(boolean z10) {
            this.f12615j = z10;
            this.f12616k = (byte) (this.f12616k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: g */
        public NativeInitCrashpadParams.Builder mo15822g(String str) {
            if (str == null) {
                throw new NullPointerException("Null countName");
            }
            this.f12608c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: h */
        public NativeInitCrashpadParams.Builder mo15823h(List<String> list) {
            if (list == null) {
                throw new NullPointerException("Null envArgs");
            }
            this.f12612g = list;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: i */
        public NativeInitCrashpadParams.Builder mo15824i(String str) {
            if (str == null) {
                throw new NullPointerException("Null handlerClassName");
            }
            this.f12611f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: j */
        public NativeInitCrashpadParams.Builder mo15825j(boolean z10) {
            this.f12613h = z10;
            this.f12616k = (byte) (this.f12616k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: k */
        public NativeInitCrashpadParams.Builder mo15826k(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f12610e = str;
            return this;
        }

        @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams.Builder
        /* JADX INFO: renamed from: l */
        public NativeInitCrashpadParams.Builder mo15827l(String str) {
            if (str == null) {
                throw new NullPointerException("Null uploadUrl");
            }
            this.f12609d = str;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String appVersion() {
        return this.f12596a;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String baseUrl() {
        return this.f12597b;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String buildVariant() {
        return this.f12604i;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean collectLogcat() {
        return this.f12605j;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String countName() {
        return this.f12598c;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public List<String> envArgs() {
        return this.f12602g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NativeInitCrashpadParams) {
            NativeInitCrashpadParams nativeInitCrashpadParams = (NativeInitCrashpadParams) obj;
            if (this.f12596a.equals(nativeInitCrashpadParams.appVersion()) && this.f12597b.equals(nativeInitCrashpadParams.baseUrl()) && this.f12598c.equals(nativeInitCrashpadParams.countName()) && this.f12599d.equals(nativeInitCrashpadParams.uploadUrl()) && this.f12600e.equals(nativeInitCrashpadParams.token()) && this.f12601f.equals(nativeInitCrashpadParams.handlerClassName()) && this.f12602g.equals(nativeInitCrashpadParams.envArgs()) && this.f12603h == nativeInitCrashpadParams.isAtLeastQ() && this.f12604i.equals(nativeInitCrashpadParams.buildVariant()) && this.f12605j == nativeInitCrashpadParams.collectLogcat()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String handlerClassName() {
        return this.f12601f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f12596a.hashCode() ^ 1000003) * 1000003) ^ this.f12597b.hashCode()) * 1000003) ^ this.f12598c.hashCode()) * 1000003) ^ this.f12599d.hashCode()) * 1000003) ^ this.f12600e.hashCode()) * 1000003) ^ this.f12601f.hashCode()) * 1000003) ^ this.f12602g.hashCode()) * 1000003) ^ (this.f12603h ? 1231 : 1237)) * 1000003) ^ this.f12604i.hashCode()) * 1000003) ^ (this.f12605j ? 1231 : 1237);
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public boolean isAtLeastQ() {
        return this.f12603h;
    }

    public String toString() {
        return "NativeInitCrashpadParams{appVersion=" + this.f12596a + ", baseUrl=" + this.f12597b + ", countName=" + this.f12598c + ", uploadUrl=" + this.f12599d + ", token=" + this.f12600e + ", handlerClassName=" + this.f12601f + ", envArgs=" + this.f12602g + ", isAtLeastQ=" + this.f12603h + ", buildVariant=" + this.f12604i + ", collectLogcat=" + this.f12605j + "}";
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String token() {
        return this.f12600e;
    }

    @Override // com.roblox.engine.jni.model.NativeInitCrashpadParams
    public String uploadUrl() {
        return this.f12599d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private C3318a(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, boolean z10, String str7, boolean z11) {
        this.f12596a = str;
        this.f12597b = str2;
        this.f12598c = str3;
        this.f12599d = str4;
        this.f12600e = str5;
        this.f12601f = str6;
        this.f12602g = list;
        this.f12603h = z10;
        this.f12604i = str7;
        this.f12605j = z11;
    }
}
