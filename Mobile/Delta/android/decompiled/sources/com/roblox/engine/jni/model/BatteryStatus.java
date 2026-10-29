package com.roblox.engine.jni.model;

/* JADX INFO: loaded from: classes2.dex */
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

        public final int androidValue;
        public final int robloxValue;

        a(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }

        public static int b(Integer num) {
            if (num == null) {
                return UNKNOWN.robloxValue;
            }
            for (a aVar : values()) {
                if (aVar.androidValue == num.intValue()) {
                    return aVar.robloxValue;
                }
            }
            return UNKNOWN.robloxValue;
        }
    }

    public enum b {
        UNKNOWN(-1, -1),
        NOT_PLUGGED(0, 0),
        AC(1, 1),
        USB(2, 2),
        WIRELESS(4, 4),
        DOCK(8, 8);

        public final int androidValue;
        public final int robloxValue;

        b(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }
    }

    public enum c {
        UNKNOWN(1, 1),
        CHARGING(2, 2),
        DISCHARGING(3, 3),
        NOT_CHARGING(4, 4),
        FULL(5, 5);

        public final int androidValue;
        public final int robloxValue;

        c(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }

        public static c b(Integer num) {
            if (num == null) {
                return UNKNOWN;
            }
            for (c cVar : values()) {
                if (cVar.androidValue == num.intValue()) {
                    return cVar;
                }
            }
            return UNKNOWN;
        }
    }
}
