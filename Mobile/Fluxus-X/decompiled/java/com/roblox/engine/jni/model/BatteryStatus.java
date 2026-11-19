package com.roblox.engine.jni.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BatteryStatus {
    public Boolean batteryLow;
    public Integer batteryPercentage;
    public Boolean batterySaverMode;
    public Integer chargeCounter;
    public Integer currentAverage;
    public Integer currentNow;
    public Long energyCounter;
    public Integer health;
    public Integer plugged;
    public Integer power;
    public Boolean present;
    public Integer status;
    public String technology;
    public Float temperature;
    public Integer voltage;

    public enum a {
        UNKNOWN(0, 1),
        GOOD(1, 2),
        OVERHEAT(2, 3),
        DEAD(3, 4),
        OVER_VOLTAGE(4, 5),
        UNSPECFIED_FAILURE(5, 6),
        COLD(6, 7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9645a;
        public final int b;

        a(int i10, int i11) {
            this.f9645a = i10;
            this.b = i11;
        }

        public static int b(Integer num) {
            if (num == null) {
                return UNKNOWN.f9645a;
            }
            for (a aVar : values()) {
                if (aVar.b == num.intValue()) {
                    return aVar.f9645a;
                }
            }
            return UNKNOWN.f9645a;
        }
    }

    public enum b {
        UNKNOWN(-1, -1),
        NOT_PLUGGED(0, 0),
        AC(1, 1),
        USB(2, 2),
        WIRELESS(4, 4),
        DOCK(8, 8);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9653a;
        public final int b;

        b(int i10, int i11) {
            this.f9653a = i10;
            this.b = i11;
        }
    }

    public enum c {
        UNKNOWN(1, 1),
        CHARGING(2, 2),
        DISCHARGING(3, 3),
        NOT_CHARGING(4, 4),
        FULL(5, 5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9660a;
        public final int b;

        c(int i10, int i11) {
            this.f9660a = i10;
            this.b = i11;
        }

        public static c b(Integer num) {
            if (num == null) {
                return UNKNOWN;
            }
            for (c cVar : values()) {
                if (cVar.b == num.intValue()) {
                    return cVar;
                }
            }
            return UNKNOWN;
        }
    }
}
