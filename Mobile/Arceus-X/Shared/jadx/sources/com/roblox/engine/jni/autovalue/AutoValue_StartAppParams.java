package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StartAppParams extends StartAppParams {
    private final String appStarterPlace;
    private final String appStarterScript;
    private final long appUserId;
    private final boolean isUnder13;
    private final int membershipType;
    private final PlatformParams platformParams;
    private final String selectedTheme;
    private final Surface surface;
    private final String username;
    private final Activity vrContext;

    public static final class Builder extends StartAppParams.Builder {
        private String appStarterPlace;
        private String appStarterScript;
        private long appUserId;
        private boolean isUnder13;
        private int membershipType;
        private PlatformParams platformParams;
        private String selectedTheme;
        private byte set$0;
        private Surface surface;
        private String username;
        private Activity vrContext;

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams build() {
            Surface surface;
            PlatformParams platformParams;
            String str;
            String str2;
            String str3;
            String str4;
            if (this.set$0 == 7 && (surface = this.surface) != null && (platformParams = this.platformParams) != null && (str = this.appStarterPlace) != null && (str2 = this.appStarterScript) != null && (str3 = this.username) != null && (str4 = this.selectedTheme) != null) {
                return new AutoValue_StartAppParams(surface, platformParams, str, str2, this.appUserId, this.isUnder13, str3, this.membershipType, str4, this.vrContext);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.surface == null) {
                sb2.append(" surface");
            }
            if (this.platformParams == null) {
                sb2.append(" platformParams");
            }
            if (this.appStarterPlace == null) {
                sb2.append(" appStarterPlace");
            }
            if (this.appStarterScript == null) {
                sb2.append(" appStarterScript");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" appUserId");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" isUnder13");
            }
            if (this.username == null) {
                sb2.append(" username");
            }
            if ((this.set$0 & 4) == 0) {
                sb2.append(" membershipType");
            }
            if (this.selectedTheme == null) {
                sb2.append(" selectedTheme");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setAppStarterPlace(String str) {
            if (str == null) {
                throw new NullPointerException("Null appStarterPlace");
            }
            this.appStarterPlace = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setAppStarterScript(String str) {
            if (str == null) {
                throw new NullPointerException("Null appStarterScript");
            }
            this.appStarterScript = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setAppUserId(long j10) {
            this.appUserId = j10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setIsUnder13(boolean z10) {
            this.isUnder13 = z10;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setMembershipType(int i10) {
            this.membershipType = i10;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setPlatformParams(PlatformParams platformParams) {
            if (platformParams == null) {
                throw new NullPointerException("Null platformParams");
            }
            this.platformParams = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setSelectedTheme(String str) {
            if (str == null) {
                throw new NullPointerException("Null selectedTheme");
            }
            this.selectedTheme = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setSurface(Surface surface) {
            if (surface == null) {
                throw new NullPointerException("Null surface");
            }
            this.surface = surface;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setUsername(String str) {
            if (str == null) {
                throw new NullPointerException("Null username");
            }
            this.username = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.Builder
        public StartAppParams.Builder setVrContext(Activity activity) {
            this.vrContext = activity;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String appStarterPlace() {
        return this.appStarterPlace;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String appStarterScript() {
        return this.appStarterScript;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public long appUserId() {
        return this.appUserId;
    }

    public boolean equals(Object obj) {
        Activity activity;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartAppParams) {
            StartAppParams startAppParams = (StartAppParams) obj;
            if (this.surface.equals(startAppParams.surface()) && this.platformParams.equals(startAppParams.platformParams()) && this.appStarterPlace.equals(startAppParams.appStarterPlace()) && this.appStarterScript.equals(startAppParams.appStarterScript()) && this.appUserId == startAppParams.appUserId() && this.isUnder13 == startAppParams.isUnder13() && this.username.equals(startAppParams.username()) && this.membershipType == startAppParams.membershipType() && this.selectedTheme.equals(startAppParams.selectedTheme()) && ((activity = this.vrContext) != null ? activity.equals(startAppParams.vrContext()) : startAppParams.vrContext() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.platformParams.hashCode()) * 1000003) ^ this.appStarterPlace.hashCode()) * 1000003) ^ this.appStarterScript.hashCode()) * 1000003;
        long j10 = this.appUserId;
        int iHashCode2 = (((((((((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.isUnder13 ? 1231 : 1237)) * 1000003) ^ this.username.hashCode()) * 1000003) ^ this.membershipType) * 1000003) ^ this.selectedTheme.hashCode()) * 1000003;
        Activity activity = this.vrContext;
        return iHashCode2 ^ (activity == null ? 0 : activity.hashCode());
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public boolean isUnder13() {
        return this.isUnder13;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public int membershipType() {
        return this.membershipType;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public PlatformParams platformParams() {
        return this.platformParams;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String selectedTheme() {
        return this.selectedTheme;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public Surface surface() {
        return this.surface;
    }

    public String toString() {
        return "StartAppParams{surface=" + this.surface + ", platformParams=" + this.platformParams + ", appStarterPlace=" + this.appStarterPlace + ", appStarterScript=" + this.appStarterScript + ", appUserId=" + this.appUserId + ", isUnder13=" + this.isUnder13 + ", username=" + this.username + ", membershipType=" + this.membershipType + ", selectedTheme=" + this.selectedTheme + ", vrContext=" + this.vrContext + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public String username() {
        return this.username;
    }

    @Override // com.roblox.engine.jni.autovalue.StartAppParams
    public Activity vrContext() {
        return this.vrContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AutoValue_StartAppParams(Surface surface, PlatformParams platformParams, String str, String str2, long j10, boolean z10, String str3, int i10, String str4, Activity activity) {
        this.surface = surface;
        this.platformParams = platformParams;
        this.appStarterPlace = str;
        this.appStarterScript = str2;
        this.appUserId = j10;
        this.isUnder13 = z10;
        this.username = str3;
        this.membershipType = i10;
        this.selectedTheme = str4;
        this.vrContext = activity;
    }
}
