package com.roblox.engine.jni.autovalue;

import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RobloxTelemetryEventData {
    public static final String STANDARDIZED_FIELD_KEY_ADD_OS_INFO = "addOSInfo";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLACE_ID = "addPlaceId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLACE_INSTANCE_ID = "addPlaceInstanceId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLACE_SESSION_ID = "addSessionId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_PLAY_SESSION_ID = "addPlaySessionId";
    public static final String STANDARDIZED_FIELD_KEY_ADD_universe_ID = "addUniverseId";

    public static abstract class a {
        public abstract RobloxTelemetryEventData a();

        public final RobloxTelemetryEventData b() {
            return a();
        }

        public abstract a c(List<Pair<String, String>> list);

        public abstract a d(List<String> list);
    }

    public static a builder() {
        return new AutoValue_RobloxTelemetryEventData.a().e(BuildConfig.FLAVOR).c(new ArrayList()).d(new ArrayList());
    }

    public abstract List<Pair<String, String>> customStringFields();

    public abstract String eventContext();

    public abstract List<String> standardizedFields();
}
