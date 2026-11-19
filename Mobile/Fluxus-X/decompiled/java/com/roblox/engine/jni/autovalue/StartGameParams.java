package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StartGameParams {
    private static final String TAG = "StartGameParams";

    public static abstract class a {
        public abstract StartGameParams a();

        public final StartGameParams b() {
            return a();
        }

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(long j10);

        public abstract a f(DeviceParams deviceParams);

        public abstract a g(String str);

        public abstract a h(String str);

        public abstract a i(String str);

        public abstract a j(String str);

        public abstract a k(boolean z10);

        public abstract a l(String str);

        public abstract a m(String str);

        public abstract a n(String str);

        public abstract a o(int i10);

        public abstract a p(String str);

        public abstract a q(String str);

        public abstract a r(long j10);

        public abstract a s(PlatformParams platformParams);

        public abstract a t(String str);

        public abstract a u(long j10);

        public abstract a v(String str);

        public abstract a w(Surface surface);

        public abstract a x(long j10);

        public abstract a y(String str);

        public abstract a z(Activity activity);
    }

    public static a builder() {
        return new AutoValue_StartGameParams.a().p(BuildConfig.FLAVOR).j(BuildConfig.FLAVOR).g(BuildConfig.FLAVOR).q(BuildConfig.FLAVOR).v(BuildConfig.FLAVOR).d(BuildConfig.FLAVOR).m(BuildConfig.FLAVOR).n(BuildConfig.FLAVOR).l(BuildConfig.FLAVOR).u(0L).i(BuildConfig.FLAVOR);
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
