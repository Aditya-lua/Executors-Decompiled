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
    private final long pioneerPlaceId;
    private final PlatformParams platformParams;
    private final String userAgent;
    private final Activity vrContext;

    public static final class a extends InitParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PlatformParams f9553a;
        public DeviceParams b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f9559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f9560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Activity f9561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f9562k;

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams a() {
            PlatformParams platformParams;
            DeviceParams deviceParams;
            String str;
            String str2;
            if (this.f9562k == 15 && (platformParams = this.f9553a) != null && (deviceParams = this.b) != null && (str = this.f9554c) != null && (str2 = this.f9555d) != null) {
                return new AutoValue_InitParams(platformParams, deviceParams, str, str2, this.f9556e, this.f9557f, this.f9558g, this.f9559h, this.f9560i, this.f9561j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9553a == null) {
                sb2.append(" platformParams");
            }
            if (this.b == null) {
                sb2.append(" deviceParams");
            }
            if (this.f9554c == null) {
                sb2.append(" baseURL");
            }
            if (this.f9555d == null) {
                sb2.append(" userAgent");
            }
            if ((this.f9562k & 1) == 0) {
                sb2.append(" isTablet");
            }
            if ((this.f9562k & 2) == 0) {
                sb2.append(" isPotato");
            }
            if ((this.f9562k & 4) == 0) {
                sb2.append(" isVrDevice");
            }
            if ((this.f9562k & 8) == 0) {
                sb2.append(" pioneerPlaceId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null baseURL");
            }
            this.f9554c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a c(String str) {
            this.f9560i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a d(DeviceParams deviceParams) {
            if (deviceParams == null) {
                throw new NullPointerException("Null deviceParams");
            }
            this.b = deviceParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a e(boolean z10) {
            this.f9557f = z10;
            this.f9562k = (byte) (this.f9562k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a f(boolean z10) {
            this.f9556e = z10;
            this.f9562k = (byte) (this.f9562k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a g(boolean z10) {
            this.f9558g = z10;
            this.f9562k = (byte) (this.f9562k | 4);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a h(long j10) {
            this.f9559h = j10;
            this.f9562k = (byte) (this.f9562k | 8);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a i(PlatformParams platformParams) {
            if (platformParams == null) {
                throw new NullPointerException("Null platformParams");
            }
            this.f9553a = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.InitParams.a
        public InitParams.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null userAgent");
            }
            this.f9555d = str;
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
            if (this.platformParams.equals(initParams.platformParams()) && this.deviceParams.equals(initParams.deviceParams()) && this.baseURL.equals(initParams.baseURL()) && this.userAgent.equals(initParams.userAgent()) && this.isTablet == initParams.isTablet() && this.isPotato == initParams.isPotato() && this.isVrDevice == initParams.isVrDevice() && this.pioneerPlaceId == initParams.pioneerPlaceId() && ((str = this.buildVariant) != null ? str.equals(initParams.buildVariant()) : initParams.buildVariant() == null) && ((activity = this.vrContext) != null ? activity.equals(initParams.vrContext()) : initParams.vrContext() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.platformParams.hashCode() ^ 1000003) * 1000003) ^ this.deviceParams.hashCode()) * 1000003) ^ this.baseURL.hashCode()) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ (this.isTablet ? 1231 : 1237)) * 1000003) ^ (this.isPotato ? 1231 : 1237)) * 1000003;
        int i10 = this.isVrDevice ? 1231 : 1237;
        long j10 = this.pioneerPlaceId;
        int i11 = (((iHashCode ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.buildVariant;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
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
    public long pioneerPlaceId() {
        return this.pioneerPlaceId;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public PlatformParams platformParams() {
        return this.platformParams;
    }

    public String toString() {
        return "InitParams{platformParams=" + this.platformParams + ", deviceParams=" + this.deviceParams + ", baseURL=" + this.baseURL + ", userAgent=" + this.userAgent + ", isTablet=" + this.isTablet + ", isPotato=" + this.isPotato + ", isVrDevice=" + this.isVrDevice + ", pioneerPlaceId=" + this.pioneerPlaceId + ", buildVariant=" + this.buildVariant + ", vrContext=" + this.vrContext + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public String userAgent() {
        return this.userAgent;
    }

    @Override // com.roblox.engine.jni.autovalue.InitParams
    public Activity vrContext() {
        return this.vrContext;
    }

    private AutoValue_InitParams(PlatformParams platformParams, DeviceParams deviceParams, String str, String str2, boolean z10, boolean z11, boolean z12, long j10, String str3, Activity activity) {
        this.platformParams = platformParams;
        this.deviceParams = deviceParams;
        this.baseURL = str;
        this.userAgent = str2;
        this.isTablet = z10;
        this.isPotato = z11;
        this.isVrDevice = z12;
        this.pioneerPlaceId = j10;
        this.buildVariant = str3;
        this.vrContext = activity;
    }
}
