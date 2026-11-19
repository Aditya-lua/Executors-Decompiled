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

    public static final class a extends StartAppParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Surface f9593a;
        public PlatformParams b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f9598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9599h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f9600i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Activity f9601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte f9602k;

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams a() {
            Surface surface;
            PlatformParams platformParams;
            String str;
            String str2;
            String str3;
            String str4;
            if (this.f9602k == 7 && (surface = this.f9593a) != null && (platformParams = this.b) != null && (str = this.f9594c) != null && (str2 = this.f9595d) != null && (str3 = this.f9598g) != null && (str4 = this.f9600i) != null) {
                return new AutoValue_StartAppParams(surface, platformParams, str, str2, this.f9596e, this.f9597f, str3, this.f9599h, str4, this.f9601j);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9593a == null) {
                sb2.append(" surface");
            }
            if (this.b == null) {
                sb2.append(" platformParams");
            }
            if (this.f9594c == null) {
                sb2.append(" appStarterPlace");
            }
            if (this.f9595d == null) {
                sb2.append(" appStarterScript");
            }
            if ((this.f9602k & 1) == 0) {
                sb2.append(" appUserId");
            }
            if ((this.f9602k & 2) == 0) {
                sb2.append(" isUnder13");
            }
            if (this.f9598g == null) {
                sb2.append(" username");
            }
            if ((this.f9602k & 4) == 0) {
                sb2.append(" membershipType");
            }
            if (this.f9600i == null) {
                sb2.append(" selectedTheme");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null appStarterPlace");
            }
            this.f9594c = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null appStarterScript");
            }
            this.f9595d = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a d(long j10) {
            this.f9596e = j10;
            this.f9602k = (byte) (this.f9602k | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a e(boolean z10) {
            this.f9597f = z10;
            this.f9602k = (byte) (this.f9602k | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a f(int i10) {
            this.f9599h = i10;
            this.f9602k = (byte) (this.f9602k | 4);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a g(PlatformParams platformParams) {
            if (platformParams == null) {
                throw new NullPointerException("Null platformParams");
            }
            this.b = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null selectedTheme");
            }
            this.f9600i = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a i(Surface surface) {
            if (surface == null) {
                throw new NullPointerException("Null surface");
            }
            this.f9593a = surface;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null username");
            }
            this.f9598g = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartAppParams.a
        public StartAppParams.a k(Activity activity) {
            this.f9601j = activity;
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
