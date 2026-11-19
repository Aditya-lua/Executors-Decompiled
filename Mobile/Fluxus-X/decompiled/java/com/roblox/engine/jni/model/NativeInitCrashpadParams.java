package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeInitCrashpadParams {

    public static abstract class a {
        public abstract NativeInitCrashpadParams a();

        public final NativeInitCrashpadParams b() {
            return a();
        }

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(boolean z10);

        public abstract a g(String str);

        public abstract a h(List<String> list);

        public abstract a i(String str);

        public abstract a j(boolean z10);

        public abstract a k(String str);

        public abstract a l(String str);
    }

    public static a builder() {
        return new AutoValue_NativeInitCrashpadParams.a().f(false);
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
