package com.roblox.engine.jni.autovalue;

import android.app.Activity;
import android.view.Surface;
import com.roblox.engine.jni.model.PlatformParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StartAppParams {

    public static abstract class a {
        public abstract StartAppParams a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(long j10);

        public abstract a e(boolean z10);

        public abstract a f(int i10);

        public abstract a g(PlatformParams platformParams);

        public abstract a h(String str);

        public abstract a i(Surface surface);

        public abstract a j(String str);

        public abstract a k(Activity activity);
    }

    public static a builder() {
        return new AutoValue_StartAppParams.a();
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
