package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_InitParams extends InitParams {
    private final String baseURL;
    private final String buildVariant;
    private final DeviceParams deviceParams;
    private final boolean isPotato;
    private final boolean isTablet;
    private final boolean isVrDevice;
    private final PlatformParams platformParams;
    private final String userAgent;
    private final Activity vrContext;

    public static final class Builder extends InitParams.Builder {
        private String baseURL;
        private String buildVariant;
        private DeviceParams deviceParams;
        private boolean isPotato;
        private boolean isTablet;
        private boolean isVrDevice;
        private PlatformParams platformParams;
        private byte set$0;
        private String userAgent;
        private Activity vrContext;

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams build() {
            PlatformParams platformParams;
            DeviceParams deviceParams;
            String str;
            String str2;
            if (this.set$0 == 7 && (platformParams = this.platformParams) != null && (deviceParams = this.deviceParams) != null && (str = this.baseURL) != null && (str2 = this.userAgent) != null) {
                return new AutoValue_InitParams(platformParams, deviceParams, str, str2, this.isTablet, this.isPotato, this.isVrDevice, this.buildVariant, this.vrContext);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.platformParams == null) {
                sb2.append(" platformParams");
            }
            if (this.deviceParams == null) {
                sb2.append(" deviceParams");
            }
            if (this.baseURL == null) {
                sb2.append(" baseURL");
            }
            if (this.userAgent == null) {
                sb2.append(" userAgent");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" isTablet");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" isPotato");
            }
            if ((this.set$0 & 4) == 0) {
                sb2.append(" isVrDevice");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setBaseURL(String str) {
            if (str == null) {
                throw new NullPointerException("Null baseURL");
            }
            this.baseURL = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setBuildVariant(String str) {
            this.buildVariant = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setDeviceParams(DeviceParams deviceParams) {
            if (deviceParams == null) {
                throw new NullPointerException("Null deviceParams");
            }
            this.deviceParams = deviceParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setIsPotato(boolean z10) {
            this.isPotato = z10;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setIsTablet(boolean z10) {
            this.isTablet = z10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setIsVrDevice(boolean z10) {
            this.isVrDevice = z10;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setPlatformParams(PlatformParams platformParams) {
            if (platformParams == null) {
                throw new NullPointerException("Null platformParams");
            }
            this.platformParams = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setUserAgent(String str) {
            if (str == null) {
                throw new NullPointerException("Null userAgent");
            }
            this.userAgent = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.Builder
        public InitParams.Builder setVrContext(Activity activity) {
            this.vrContext = activity;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String baseURL() {
        return this.baseURL;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String buildVariant() {
        return this.buildVariant;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public DeviceParams deviceParams() {
        return this.deviceParams;
    }

    public boolean equals(Object obj) {
        String str;
        Activity activity;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InitParams) {
            InitParams initParams = (InitParams) obj;
            if (this.platformParams.equals(initParams.platformParams()) && this.deviceParams.equals(initParams.deviceParams()) && this.baseURL.equals(initParams.baseURL()) && this.userAgent.equals(initParams.userAgent()) && this.isTablet == initParams.isTablet() && this.isPotato == initParams.isPotato() && this.isVrDevice == initParams.isVrDevice() && ((str = this.buildVariant) != null ? str.equals(initParams.buildVariant()) : initParams.buildVariant() == null) && ((activity = this.vrContext) != null ? activity.equals(initParams.vrContext()) : initParams.vrContext() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((this.platformParams.hashCode() ^ 1000003) * 1000003) ^ this.deviceParams.hashCode()) * 1000003) ^ this.baseURL.hashCode()) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ (this.isTablet ? 1231 : 1237)) * 1000003) ^ (this.isPotato ? 1231 : 1237)) * 1000003) ^ (this.isVrDevice ? 1231 : 1237)) * 1000003;
        String str = this.buildVariant;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Activity activity = this.vrContext;
        return iHashCode2 ^ (activity != null ? activity.hashCode() : 0);
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public boolean isPotato() {
        return this.isPotato;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public boolean isTablet() {
        return this.isTablet;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public boolean isVrDevice() {
        return this.isVrDevice;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public PlatformParams platformParams() {
        return this.platformParams;
    }

    public String toString() {
        return "InitParams{platformParams=" + this.platformParams + ", deviceParams=" + this.deviceParams + ", baseURL=" + this.baseURL + ", userAgent=" + this.userAgent + ", isTablet=" + this.isTablet + ", isPotato=" + this.isPotato + ", isVrDevice=" + this.isVrDevice + ", buildVariant=" + this.buildVariant + ", vrContext=" + this.vrContext + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String userAgent() {
        return this.userAgent;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public Activity vrContext() {
        return this.vrContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AutoValue_InitParams(PlatformParams platformParams, DeviceParams deviceParams, String str, String str2, boolean z10, boolean z11, boolean z12, String str3, Activity activity) {
        this.platformParams = platformParams;
        this.deviceParams = deviceParams;
        this.baseURL = str;
        this.userAgent = str2;
        this.isTablet = z10;
        this.isPotato = z11;
        this.isVrDevice = z12;
        this.buildVariant = str3;
        this.vrContext = activity;
    }
}
