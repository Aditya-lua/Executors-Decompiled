package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StartGameParams {
    private static final String TAG = "StartGameParams";

    public static abstract class Builder {
        public abstract StartGameParams autoBuild();

        public final StartGameParams build() {
            return autoBuild();
        }

        public abstract Builder setAccessCode(String str);

        public abstract Builder setCallId(String str);

        public abstract Builder setConversationId(long j10);

        public abstract Builder setDeviceParams(DeviceParams deviceParams);

        public abstract Builder setEventId(String str);

        public abstract Builder setGameId(String str);

        public abstract Builder setGameIdToExclude(String str);

        public abstract Builder setGameJoinContext(String str);

        public abstract Builder setIsUnder13(boolean z10);

        public abstract Builder setIsoContext(String str);

        public abstract Builder setJoinAttemptId(String str);

        public abstract Builder setJoinAttemptOrigin(String str);

        public abstract Builder setJoinRequestType(int i10);

        public abstract Builder setLaunchData(String str);

        public abstract Builder setLinkCode(String str);

        public abstract Builder setPlaceId(long j10);

        public abstract Builder setPlatformParams(PlatformParams platformParams);

        public abstract Builder setReferralPage(String str);

        public abstract Builder setReferredByPlayerId(long j10);

        public abstract Builder setReservedServerAccessCode(String str);

        public abstract Builder setSurface(Surface surface);

        public abstract Builder setUserId(long j10);

        public abstract Builder setUsername(String str);

        public abstract Builder setVrContext(Activity activity);
    }

    public static Builder builder() {
        return new AutoValue_StartGameParams.Builder().setLaunchData("").setGameJoinContext("").setEventId("").setLinkCode("").setReservedServerAccessCode("").setCallId("").setJoinAttemptId("").setJoinAttemptOrigin("").setIsoContext("").setReferredByPlayerId(0L).setGameIdToExclude("");
    }

    public abstract String accessCode();

    public abstract String callId();

    public abstract long conversationId();

    public abstract DeviceParams deviceParams();

    public abstract String eventId();

    public abstract String gameId();

    public abstract String gameIdToExclude();

    public abstract String gameJoinContext();

    public abstract boolean isUnder13();

    public abstract String isoContext();

    public abstract String joinAttemptId();

    public abstract String joinAttemptOrigin();

    public abstract int joinRequestType();

    public abstract String launchData();

    public abstract String linkCode();

    public abstract long placeId();

    public abstract PlatformParams platformParams();

    public abstract String referralPage();

    public abstract long referredByPlayerId();

    public abstract String reservedServerAccessCode();

    public abstract Surface surface();

    public abstract long userId();

    public abstract String username();

    public abstract Activity vrContext();
}
