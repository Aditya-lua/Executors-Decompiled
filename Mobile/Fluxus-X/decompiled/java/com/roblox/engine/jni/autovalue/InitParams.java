package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InitParams {

    public static abstract class a {
        public abstract InitParams a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(DeviceParams deviceParams);

        public abstract a e(boolean z10);

        public abstract a f(boolean z10);

        public abstract a g(boolean z10);

        public abstract a h(long j10);

        public abstract a i(PlatformParams platformParams);

        public abstract a j(String str);
    }

    public static a builder() {
        return new AutoValue_InitParams.a().g(false).h(0L);
    }

    public abstract String baseURL();

    public abstract String buildVariant();

    public abstract DeviceParams deviceParams();

    public abstract boolean isPotato();

    public abstract boolean isTablet();

    public abstract boolean isVrDevice();

    public abstract long pioneerPlaceId();

    public abstract PlatformParams platformParams();

    public abstract String userAgent();

    public abstract Activity vrContext();
}
