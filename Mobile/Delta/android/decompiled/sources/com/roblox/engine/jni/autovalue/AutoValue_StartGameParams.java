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

    public static final class Builder extends StartGameParams.Builder {
        private String accessCode;
        private String callId;
        private long conversationId;
        private DeviceParams deviceParams;
        private String eventId;
        private String gameId;
        private String gameIdToExclude;
        private String gameJoinContext;
        private boolean isUnder13;
        private String isoContext;
        private String joinAttemptId;
        private String joinAttemptOrigin;
        private int joinRequestType;
        private String launchData;
        private String linkCode;
        private long placeId;
        private PlatformParams platformParams;
        private String referralPage;
        private long referredByPlayerId;
        private String reservedServerAccessCode;
        private byte set$0;
        private Surface surface;
        private long userId;
        private String username;
        private Activity vrContext;

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams autoBuild() {
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
            if (this.set$0 == 63 && (surface = this.surface) != null && (platformParams = this.platformParams) != null && (str = this.accessCode) != null && (str2 = this.linkCode) != null && (str3 = this.gameId) != null && (str4 = this.username) != null && (str5 = this.reservedServerAccessCode) != null && (str6 = this.callId) != null && (str7 = this.referralPage) != null && (str8 = this.launchData) != null && (str9 = this.gameJoinContext) != null && (str10 = this.eventId) != null && (str11 = this.joinAttemptId) != null && (str12 = this.joinAttemptOrigin) != null && (str13 = this.isoContext) != null) {
                return new AutoValue_StartGameParams(surface, platformParams, this.deviceParams, this.placeId, this.userId, str, str2, str3, this.isUnder13, str4, this.conversationId, str5, str6, this.joinRequestType, str7, str8, str9, str10, str11, str12, str13, this.referredByPlayerId, this.gameIdToExclude, this.vrContext);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.surface == null) {
                sb2.append(" surface");
            }
            if (this.platformParams == null) {
                sb2.append(" platformParams");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" placeId");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" userId");
            }
            if (this.accessCode == null) {
                sb2.append(" accessCode");
            }
            if (this.linkCode == null) {
                sb2.append(" linkCode");
            }
            if (this.gameId == null) {
                sb2.append(" gameId");
            }
            if ((this.set$0 & 4) == 0) {
                sb2.append(" isUnder13");
            }
            if (this.username == null) {
                sb2.append(" username");
            }
            if ((this.set$0 & 8) == 0) {
                sb2.append(" conversationId");
            }
            if (this.reservedServerAccessCode == null) {
                sb2.append(" reservedServerAccessCode");
            }
            if (this.callId == null) {
                sb2.append(" callId");
            }
            if ((this.set$0 & 16) == 0) {
                sb2.append(" joinRequestType");
            }
            if (this.referralPage == null) {
                sb2.append(" referralPage");
            }
            if (this.launchData == null) {
                sb2.append(" launchData");
            }
            if (this.gameJoinContext == null) {
                sb2.append(" gameJoinContext");
            }
            if (this.eventId == null) {
                sb2.append(" eventId");
            }
            if (this.joinAttemptId == null) {
                sb2.append(" joinAttemptId");
            }
            if (this.joinAttemptOrigin == null) {
                sb2.append(" joinAttemptOrigin");
            }
            if (this.isoContext == null) {
                sb2.append(" isoContext");
            }
            if ((this.set$0 & 32) == 0) {
                sb2.append(" referredByPlayerId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setAccessCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null accessCode");
            }
            this.accessCode = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setCallId(String str) {
            if (str == null) {
                throw new NullPointerException("Null callId");
            }
            this.callId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setConversationId(long j10) {
            this.conversationId = j10;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setDeviceParams(DeviceParams deviceParams) {
            this.deviceParams = deviceParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setEventId(String str) {
            if (str == null) {
                throw new NullPointerException("Null eventId");
            }
            this.eventId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setGameId(String str) {
            if (str == null) {
                throw new NullPointerException("Null gameId");
            }
            this.gameId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setGameIdToExclude(String str) {
            this.gameIdToExclude = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setGameJoinContext(String str) {
            if (str == null) {
                throw new NullPointerException("Null gameJoinContext");
            }
            this.gameJoinContext = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setIsUnder13(boolean z10) {
            this.isUnder13 = z10;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setIsoContext(String str) {
            if (str == null) {
                throw new NullPointerException("Null isoContext");
            }
            this.isoContext = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setJoinAttemptId(String str) {
            if (str == null) {
                throw new NullPointerException("Null joinAttemptId");
            }
            this.joinAttemptId = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setJoinAttemptOrigin(String str) {
            if (str == null) {
                throw new NullPointerException("Null joinAttemptOrigin");
            }
            this.joinAttemptOrigin = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setJoinRequestType(int i10) {
            this.joinRequestType = i10;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setLaunchData(String str) {
            if (str == null) {
                throw new NullPointerException("Null launchData");
            }
            this.launchData = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setLinkCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null linkCode");
            }
            this.linkCode = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setPlaceId(long j10) {
            this.placeId = j10;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setPlatformParams(PlatformParams platformParams) {
            if (platformParams == null) {
                throw new NullPointerException("Null platformParams");
            }
            this.platformParams = platformParams;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setReferralPage(String str) {
            if (str == null) {
                throw new NullPointerException("Null referralPage");
            }
            this.referralPage = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setReferredByPlayerId(long j10) {
            this.referredByPlayerId = j10;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setReservedServerAccessCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null reservedServerAccessCode");
            }
            this.reservedServerAccessCode = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setSurface(Surface surface) {
            if (surface == null) {
                throw new NullPointerException("Null surface");
            }
            this.surface = surface;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setUserId(long j10) {
            this.userId = j10;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setUsername(String str) {
            if (str == null) {
                throw new NullPointerException("Null username");
            }
            this.username = str;
            return this;
        }

        @Override // com.roblox.engine.jni.autovalue.StartGameParams.Builder
        public StartGameParams.Builder setVrContext(Activity activity) {
            this.vrContext = activity;
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
