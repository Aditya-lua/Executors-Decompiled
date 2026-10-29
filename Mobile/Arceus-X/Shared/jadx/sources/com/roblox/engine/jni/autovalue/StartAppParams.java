package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StartAppParams {

    public static abstract class Builder {
        public abstract StartAppParams build();

        public abstract Builder setAppStarterPlace(String str);

        public abstract Builder setAppStarterScript(String str);

        public abstract Builder setAppUserId(long j10);

        public abstract Builder setIsUnder13(boolean z10);

        public abstract Builder setMembershipType(int i10);

        public abstract Builder setPlatformParams(PlatformParams platformParams);

        public abstract Builder setSelectedTheme(String str);

        public abstract Builder setSurface(Surface surface);

        public abstract Builder setUsername(String str);

        public abstract Builder setVrContext(Activity activity);
    }

    public static Builder builder() {
        return new AutoValue_StartAppParams.Builder();
    }

    public abstract String appStarterPlace();

    public abstract String appStarterScript();

    public abstract long appUserId();

    public abstract boolean isUnder13();

    public abstract int membershipType();

    public abstract PlatformParams platformParams();

    public abstract String selectedTheme();

    public abstract Surface surface();

    public abstract String username();

    public abstract Activity vrContext();
}
