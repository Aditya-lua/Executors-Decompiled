package com.roblox.engine.jni.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeInitCrashpadParams {

    public static abstract class Builder {
        public abstract NativeInitCrashpadParams a();

        public final NativeInitCrashpadParams b() {
            return a();
        }

        public abstract Builder c(String str);

        public abstract Builder d(String str);

        public abstract Builder e(String str);

        public abstract Builder f(boolean z10);

        public abstract Builder g(String str);

        public abstract Builder h(List<String> list);

        public abstract Builder i(String str);

        public abstract Builder j(boolean z10);

        public abstract Builder k(String str);

        public abstract Builder l(String str);
    }

    public static Builder builder() {
        return new a.C0151a().f(false);
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
