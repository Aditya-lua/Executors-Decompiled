package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeInitCrashpadParams {

    public static abstract class Builder {
        /* JADX INFO: renamed from: a */
        public abstract NativeInitCrashpadParams mo15816a();

        /* JADX INFO: renamed from: b */
        public final NativeInitCrashpadParams m15817b() {
            return mo15816a();
        }

        /* JADX INFO: renamed from: c */
        public abstract Builder mo15818c(String str);

        /* JADX INFO: renamed from: d */
        public abstract Builder mo15819d(String str);

        /* JADX INFO: renamed from: e */
        public abstract Builder mo15820e(String str);

        /* JADX INFO: renamed from: f */
        public abstract Builder mo15821f(boolean z10);

        /* JADX INFO: renamed from: g */
        public abstract Builder mo15822g(String str);

        /* JADX INFO: renamed from: h */
        public abstract Builder mo15823h(List<String> list);

        /* JADX INFO: renamed from: i */
        public abstract Builder mo15824i(String str);

        /* JADX INFO: renamed from: j */
        public abstract Builder mo15825j(boolean z10);

        /* JADX INFO: renamed from: k */
        public abstract Builder mo15826k(String str);

        /* JADX INFO: renamed from: l */
        public abstract Builder mo15827l(String str);
    }

    public static Builder builder() {
        return new C3318a.a().mo15821f(false);
    }

    public abstract String appVersion();

    public abstract String baseUrl();

    public abstract String buildVariant();

    public abstract boolean collectLogcat();

    public abstract String countName();

    public abstract List<String> envArgs();

    public abstract String handlerClassName();

    public abstract boolean isAtLeastQ();

    public abstract String token();

    public abstract String uploadUrl();
}
