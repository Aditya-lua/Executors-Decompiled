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

    /* JADX INFO: renamed from: com.roblox.engine.jni.model.BatteryStatus$a */
    public enum EnumC3315a {
        UNKNOWN(0, 1),
        GOOD(1, 2),
        OVERHEAT(2, 3),
        DEAD(3, 4),
        OVER_VOLTAGE(4, 5),
        UNSPECFIED_FAILURE(5, 6),
        COLD(6, 7);

        public final int androidValue;
        public final int robloxValue;

        EnumC3315a(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }

        /* JADX INFO: renamed from: b */
        public static int m15812b(Integer num) {
            if (num == null) {
                return UNKNOWN.robloxValue;
            }
            for (EnumC3315a enumC3315a : values()) {
                if (enumC3315a.androidValue == num.intValue()) {
                    return enumC3315a.robloxValue;
                }
            }
            return UNKNOWN.robloxValue;
        }
    }

    /* JADX INFO: renamed from: com.roblox.engine.jni.model.BatteryStatus$b */
    public enum EnumC3316b {
        UNKNOWN(-1, -1),
        NOT_PLUGGED(0, 0),
        AC(1, 1),
        USB(2, 2),
        WIRELESS(4, 4),
        DOCK(8, 8);

        public final int androidValue;
        public final int robloxValue;

        EnumC3316b(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }
    }

    /* JADX INFO: renamed from: com.roblox.engine.jni.model.BatteryStatus$c */
    public enum EnumC3317c {
        UNKNOWN(1, 1),
        CHARGING(2, 2),
        DISCHARGING(3, 3),
        NOT_CHARGING(4, 4),
        FULL(5, 5);

        public final int androidValue;
        public final int robloxValue;

        EnumC3317c(int i10, int i11) {
            this.robloxValue = i10;
            this.androidValue = i11;
        }

        /* JADX INFO: renamed from: b */
        public static EnumC3317c m15815b(Integer num) {
            if (num == null) {
                return UNKNOWN;
            }
            for (EnumC3317c enumC3317c : values()) {
                if (enumC3317c.androidValue == num.intValue()) {
                    return enumC3317c;
                }
            }
            return UNKNOWN;
        }
    }
}
