package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1wSDK {

    public static final class AFa1vSDK {

        @Nullable
        final String AFLogger;
        final float unregisterClient;

        public AFa1vSDK(float f10, @Nullable String str) {
            this.unregisterClient = f10;
            this.AFLogger = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Float.compare(this.unregisterClient, aFa1vSDK.unregisterClient) == 0 && Intrinsics.m31980c(this.AFLogger, aFa1vSDK.AFLogger);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.unregisterClient) * 31;
            String str = this.AFLogger;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.unregisterClient + ", charging=" + this.AFLogger + ")";
        }
    }

    @NotNull
    AFa1vSDK registerClient(@NotNull Context context);
}
