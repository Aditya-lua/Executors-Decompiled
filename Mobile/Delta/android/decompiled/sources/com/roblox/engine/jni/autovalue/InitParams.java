package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InitParams {

    public static abstract class Builder {
        public abstract InitParams build();

        public abstract Builder setBaseURL(String str);

        public abstract Builder setBuildVariant(String str);

        public abstract Builder setDeviceParams(DeviceParams deviceParams);

        public abstract Builder setIsPotato(boolean z10);

        public abstract Builder setIsTablet(boolean z10);

        public abstract Builder setIsVrDevice(boolean z10);

        public abstract Builder setPlatformParams(PlatformParams platformParams);

        public abstract Builder setUserAgent(String str);

        public abstract Builder setVrContext(Activity activity);
    }

    public static Builder builder() {
        return new AutoValue_InitParams.Builder().setIsVrDevice(false);
    }

    public abstract String baseURL();

    public abstract String buildVariant();

    public abstract DeviceParams deviceParams();

    public abstract boolean isPotato();

    public abstract boolean isTablet();

    public abstract boolean isVrDevice();

    public abstract PlatformParams platformParams();

    public abstract String userAgent();

    public abstract Activity vrContext();
}
