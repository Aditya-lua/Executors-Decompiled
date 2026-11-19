package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StartGameParams extends StartGameParams {
    private final String accessCode;
    private final String callId;
    private final long conversationId;
    private final DeviceParams deviceParams;
    private final String eventId;
    private final String gameId;
    private final String gameIdToExclude;
    private final String gameJoinContext;
    private final boolean isUnder13;
    private final String isoContext;
    private final String joinAttemptId;
    private final String joinAttemptOrigin;
    private final int joinRequestType;
    private final String launchData;
    private final String linkCode;
    private final long placeId;
    private final PlatformParams platformParams;
    private final String referralPage;
    private final long referredByPlayerId;
    private final String reservedServerAccessCode;
    private final Surface surface;
    private final long userId;
    private final String username;
    private final Activity vrContext;

    public static final class a extends StartGameParams.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Surface f9603a;
        public PlatformParams b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DeviceParams f9604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f9608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f9609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9610i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f9611j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f9612k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f9613l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f9614m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f9615n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f9616o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f9617p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f9618q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f9619r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f9620s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public String f9621t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f9622u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f9623v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f9624w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Activity f9625x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public byte f9626y;

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams a() {
            Surface surface;
            PlatformParams platformParams;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (this.f9626y == 63 && (surface = this.f9603a) != null && (platformParams = this.b) != null && (str = this.f9607f) != null && (str2 = this.f9608g) != null && (str3 = this.f9609h) != null && (str4 = this.f9611j) != null && (str5 = this.f9613l) != null && (str6 = this.f9614m) != null && (str7 = this.f9616o) != null && (str8 = this.f9617p) != null && (str9 = this.f9618q) != null && (str10 = this.f9619r) != null && (str11 = this.f9620s) != null && (str12 = this.f9621t) != null && (str13 = this.f9622u) != null) {
                return new AutoValue_StartGameParams(surface, platformParams, this.f9604c, this.f9605d, this.f9606e, str, str2, str3, this.f9610i, str4, this.f9612k, str5, str6, this.f9615n, str7, str8, str9, str10, str11, str12, str13, this.f9623v, this.f9624w, this.f9625x);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f9603a == null) {
                sb2.append(" surface");
            }
            if (this.b == null) {
                sb2.append(" platformParams");
            }
            if ((this.f9626y & 1) == 0) {
                sb2.append(" placeId");
            }
            if ((this.f9626y & 2) == 0) {
                sb2.append(" userId");
            }
            if (this.f9607f == null) {
                sb2.append(" accessCode");
            }
            if (this.f9608g == null) {
                sb2.append(" linkCode");
            }
            if (this.f9609h == null) {
                sb2.append(" gameId");
            }
            if ((this.f9626y & 4) == 0) {
                sb2.append(" isUnder13");
            }
            if (this.f9611j == null) {
                sb2.append(" username");
            }
            if ((this.f9626y & 8) == 0) {
                sb2.append(" conversationId");
            }
            if (this.f9613l == null) {
                sb2.append(" reservedServerAccessCode");
            }
            if (this.f9614m == null) {
                sb2.append(" callId");
            }
            if ((this.f9626y & 16) == 0) {
                sb2.append(" joinRequestType");
            }
            if (this.f9616o == null) {
                sb2.append(" referralPage");
            }
            if (this.f9617p == null) {
                sb2.append(" launchData");
            }
            if (this.f9618q == null) {
                sb2.append(" gameJoinContext");
            }
            if (this.f9619r == null) {
                sb2.append(" eventId");
            }
            if (this.f9620s == null) {
                sb2.append(" joinAttemptId");
            }
            if (this.f9621t == null) {
                sb2.append(" joinAttemptOrigin");
            }
            if (this.f9622u == null) {
                sb2.append(" isoContext");
            }
            if ((this.f9626y & 32) == 0) {
                sb2.append(" referredByPlayerId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null accessCode");
            }
            this.f9607f = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null callId");
            }
            this.f9614m = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a e(long j10) {
            this.f9612k = j10;
            this.f9626y = (byte) (this.f9626y | 8);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a f(DeviceParams deviceParams) {
            this.f9604c = deviceParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventId");
            }
            this.f9619r = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gameId");
            }
            this.f9609h = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a i(String str) {
            this.f9624w = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null gameJoinContext");
            }
            this.f9618q = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a k(boolean z10) {
            this.f9610i = z10;
            this.f9626y = (byte) (this.f9626y | 4);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a l(String str) {
            if (str == null) {
                throw new NullPointerException("Null isoContext");
            }
            this.f9622u = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a m(String str) {
            if (str == null) {
                throw new NullPointerException("Null joinAttemptId");
            }
            this.f9620s = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null joinAttemptOrigin");
            }
            this.f9621t = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a o(int i10) {
            this.f9615n = i10;
            this.f9626y = (byte) (this.f9626y | 16);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a p(String str) {
            if (str == null) {
                throw new NullPointerException("Null launchData");
            }
            this.f9617p = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a q(String str) {
            if (str == null) {
                throw new NullPointerException("Null linkCode");
            }
            this.f9608g = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a r(long j10) {
            this.f9605d = j10;
            this.f9626y = (byte) (this.f9626y | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a s(PlatformParams platformParams) {
            if (platformParams == null) {
                throw new NullPointerException("Null platformParams");
            }
            this.b = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a t(String str) {
            if (str == null) {
                throw new NullPointerException("Null referralPage");
            }
            this.f9616o = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a u(long j10) {
            this.f9623v = j10;
            this.f9626y = (byte) (this.f9626y | 32);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a v(String str) {
            if (str == null) {
                throw new NullPointerException("Null reservedServerAccessCode");
            }
            this.f9613l = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a w(Surface surface) {
            if (surface == null) {
                throw new NullPointerException("Null surface");
            }
            this.f9603a = surface;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a x(long j10) {
            this.f9606e = j10;
            this.f9626y = (byte) (this.f9626y | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a y(String str) {
            if (str == null) {
                throw new NullPointerException("Null username");
            }
            this.f9611j = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.a
        public StartGameParams.a z(Activity activity) {
            this.f9625x = activity;
            return this;
        }
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String accessCode() {
        return this.accessCode;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String callId() {
        return this.callId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long conversationId() {
        return this.conversationId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public DeviceParams deviceParams() {
        return this.deviceParams;
    }

    public boolean equals(Object obj) {
        DeviceParams deviceParams;
        String str;
        Activity activity;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartGameParams) {
            StartGameParams startGameParams = (StartGameParams) obj;
            if (this.surface.equals(startGameParams.surface()) && this.platformParams.equals(startGameParams.platformParams()) && ((deviceParams = this.deviceParams) != null ? deviceParams.equals(startGameParams.deviceParams()) : startGameParams.deviceParams() == null) && this.placeId == startGameParams.placeId() && this.userId == startGameParams.userId() && this.accessCode.equals(startGameParams.accessCode()) && this.linkCode.equals(startGameParams.linkCode()) && this.gameId.equals(startGameParams.gameId()) && this.isUnder13 == startGameParams.isUnder13() && this.username.equals(startGameParams.username()) && this.conversationId == startGameParams.conversationId() && this.reservedServerAccessCode.equals(startGameParams.reservedServerAccessCode()) && this.callId.equals(startGameParams.callId()) && this.joinRequestType == startGameParams.joinRequestType() && this.referralPage.equals(startGameParams.referralPage()) && this.launchData.equals(startGameParams.launchData()) && this.gameJoinContext.equals(startGameParams.gameJoinContext()) && this.eventId.equals(startGameParams.eventId()) && this.joinAttemptId.equals(startGameParams.joinAttemptId()) && this.joinAttemptOrigin.equals(startGameParams.joinAttemptOrigin()) && this.isoContext.equals(startGameParams.isoContext()) && this.referredByPlayerId == startGameParams.referredByPlayerId() && ((str = this.gameIdToExclude) != null ? str.equals(startGameParams.gameIdToExclude()) : startGameParams.gameIdToExclude() == null) && ((activity = this.vrContext) != null ? activity.equals(startGameParams.vrContext()) : startGameParams.vrContext() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String eventId() {
        return this.eventId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String gameId() {
        return this.gameId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String gameIdToExclude() {
        return this.gameIdToExclude;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String gameJoinContext() {
        return this.gameJoinContext;
    }

    public int hashCode() {
        int iHashCode = (((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.platformParams.hashCode()) * 1000003;
        DeviceParams deviceParams = this.deviceParams;
        int iHashCode2 = deviceParams == null ? 0 : deviceParams.hashCode();
        long j10 = this.placeId;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.userId;
        int iHashCode3 = (((((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.accessCode.hashCode()) * 1000003) ^ this.linkCode.hashCode()) * 1000003) ^ this.gameId.hashCode()) * 1000003) ^ (this.isUnder13 ? 1231 : 1237)) * 1000003) ^ this.username.hashCode()) * 1000003;
        long j12 = this.conversationId;
        int iHashCode4 = (((((((((((((((((((((iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.reservedServerAccessCode.hashCode()) * 1000003) ^ this.callId.hashCode()) * 1000003) ^ this.joinRequestType) * 1000003) ^ this.referralPage.hashCode()) * 1000003) ^ this.launchData.hashCode()) * 1000003) ^ this.gameJoinContext.hashCode()) * 1000003) ^ this.eventId.hashCode()) * 1000003) ^ this.joinAttemptId.hashCode()) * 1000003) ^ this.joinAttemptOrigin.hashCode()) * 1000003) ^ this.isoContext.hashCode()) * 1000003;
        long j13 = this.referredByPlayerId;
        int i11 = (iHashCode4 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str = this.gameIdToExclude;
        int iHashCode5 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Activity activity = this.vrContext;
        return iHashCode5 ^ (activity != null ? activity.hashCode() : 0);
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public boolean isUnder13() {
        return this.isUnder13;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String isoContext() {
        return this.isoContext;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String joinAttemptId() {
        return this.joinAttemptId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String joinAttemptOrigin() {
        return this.joinAttemptOrigin;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public int joinRequestType() {
        return this.joinRequestType;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String launchData() {
        return this.launchData;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String linkCode() {
        return this.linkCode;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long placeId() {
        return this.placeId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public PlatformParams platformParams() {
        return this.platformParams;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String referralPage() {
        return this.referralPage;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long referredByPlayerId() {
        return this.referredByPlayerId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String reservedServerAccessCode() {
        return this.reservedServerAccessCode;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public Surface surface() {
        return this.surface;
    }

    public String toString() {
        return "StartGameParams{surface=" + this.surface + ", platformParams=" + this.platformParams + ", deviceParams=" + this.deviceParams + ", placeId=" + this.placeId + ", userId=" + this.userId + ", accessCode=" + this.accessCode + ", linkCode=" + this.linkCode + ", gameId=" + this.gameId + ", isUnder13=" + this.isUnder13 + ", username=" + this.username + ", conversationId=" + this.conversationId + ", reservedServerAccessCode=" + this.reservedServerAccessCode + ", callId=" + this.callId + ", joinRequestType=" + this.joinRequestType + ", referralPage=" + this.referralPage + ", launchData=" + this.launchData + ", gameJoinContext=" + this.gameJoinContext + ", eventId=" + this.eventId + ", joinAttemptId=" + this.joinAttemptId + ", joinAttemptOrigin=" + this.joinAttemptOrigin + ", isoContext=" + this.isoContext + ", referredByPlayerId=" + this.referredByPlayerId + ", gameIdToExclude=" + this.gameIdToExclude + ", vrContext=" + this.vrContext + "}";
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public long userId() {
        return this.userId;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public String username() {
        return this.username;
    }

    @Override // com.roblox.engine.jni.autovalue.StartGameParams
    public Activity vrContext() {
        return this.vrContext;
    }

    private AutoValue_StartGameParams(Surface surface, PlatformParams platformParams, DeviceParams deviceParams, long j10, long j11, String str, String str2, String str3, boolean z10, String str4, long j12, String str5, String str6, int i10, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j13, String str14, Activity activity) {
        this.surface = surface;
        this.platformParams = platformParams;
        this.deviceParams = deviceParams;
        this.placeId = j10;
        this.userId = j11;
        this.accessCode = str;
        this.linkCode = str2;
        this.gameId = str3;
        this.isUnder13 = z10;
        this.username = str4;
        this.conversationId = j12;
        this.reservedServerAccessCode = str5;
        this.callId = str6;
        this.joinRequestType = i10;
        this.referralPage = str7;
        this.launchData = str8;
        this.gameJoinContext = str9;
        this.eventId = str10;
        this.joinAttemptId = str11;
        this.joinAttemptOrigin = str12;
        this.isoContext = str13;
        this.referredByPlayerId = j13;
        this.gameIdToExclude = str14;
        this.vrContext = activity;
    }
}
