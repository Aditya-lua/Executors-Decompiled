package com.roblox.protocols.telemetrybindingsplatforminterface.generated;

import androidx.annotation.Keep;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class TelemetryBridge {

    @Keep
    public static final int APIVERSION = 3;

    @Keep
    public static final class CppProxy extends TelemetryBridge {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j10) {
            if (j10 == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j10;
            NativeObjectManager.register(this, j10);
        }

        public static native void nativeDestroy(long j10);
    }

    public static native TelemetryFieldValue boolFieldValue(boolean z10);

    public static native TelemetryFieldValue doubleFieldValue(double d10);

    public static native TelemetryFieldValue intFieldValue(long j10);

    public static native boolean logCounter(TelemetryConfig telemetryConfig, TelemetryData telemetryData, double d10);

    public static native boolean logEvent(TelemetryConfig telemetryConfig, TelemetryData telemetryData);

    public static native boolean logStat(TelemetryConfig telemetryConfig, TelemetryData telemetryData, double d10);

    public static native TelemetryFieldValue stringFieldValue(String str);

    public static native TelemetryConfig telemetryConfig(String str, HashSet<TelemetryBackend> hashSet, Integer num, String str2, String str3);

    public static native TelemetryConfig telemetryConfigV3(String str, HashSet<TelemetryBackend> hashSet, Integer num, String str2, String str3, String str4);

    public static native TelemetryData telemetryData(HashMap<String, TelemetryFieldValue> map, HashSet<TelemetryStandardizedField> hashSet, String str, String str2);
}
