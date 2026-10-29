package wh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.BatteryStatus;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f34298g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34299a;
    public final BatteryManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BroadcastReceiver f34300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34301d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f34302e = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: wh.h
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return i.b(runnable);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduledFuture<?> f34303f;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (System.currentTimeMillis() - i.this.f34301d > i.f34298g) {
                i.this.f34301d = System.currentTimeMillis();
                i.this.n(intent);
            }
        }
    }

    static {
        f34298g = th.h.a().A2() ? 15000L : 30000L;
    }

    public i(@NonNull Context context) {
        this.f34299a = context;
        this.b = (BatteryManager) context.getSystemService("batterymanager");
    }

    public static /* synthetic */ Thread b(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("BatteryStatusObserver-" + System.currentTimeMillis());
        thread.setDaemon(true);
        return thread;
    }

    public static Boolean g(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return Boolean.valueOf(intent.getBooleanExtra(str, false));
    }

    public static Integer i(Intent intent, String str) {
        int intExtra;
        if (intent == null || !intent.hasExtra(str) || (intExtra = intent.getIntExtra(str, Integer.MIN_VALUE)) == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    public static BatteryStatus.b l(Integer num) {
        if (num == null) {
            return BatteryStatus.b.UNKNOWN;
        }
        for (BatteryStatus.b bVar : BatteryStatus.b.values()) {
            if (bVar.androidValue == num.intValue()) {
                return bVar;
            }
        }
        return BatteryStatus.b.UNKNOWN;
    }

    public final Integer h(int i10) {
        BatteryManager batteryManager = this.b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Integer.valueOf((int) longProperty);
        }
        return null;
    }

    public final Long j(int i10) {
        BatteryManager batteryManager = this.b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Long.valueOf(longProperty);
        }
        return null;
    }

    public final String k(int i10) {
        if (i10 == 2) {
            return "BATTERY_STATUS_CHARGING";
        }
        if (i10 == 3) {
            return "BATTERY_STATUS_DISCHARGING";
        }
        if (i10 != 4) {
            return i10 != 5 ? "BATTERY_STATUS_UNKNOWN" : "BATTERY_STATUS_FULL";
        }
        return "BATTERY_STATUS_NOT_CHARGING";
    }

    public final void m() {
        Integer num;
        Intent intentRegisterReceiver = this.f34299a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return;
        }
        BatteryStatus batteryStatus = new BatteryStatus();
        batteryStatus.chargeCounter = h(1);
        Integer numH = h(2);
        batteryStatus.currentNow = numH;
        if (numH != null && Math.abs(numH.intValue()) < 42000) {
            batteryStatus.currentNow = Integer.valueOf(batteryStatus.currentNow.intValue() * 1000);
        }
        Integer numH2 = h(3);
        batteryStatus.currentAverage = numH2;
        if (numH2 != null && Math.abs(numH2.intValue()) < 42000) {
            batteryStatus.currentAverage = Integer.valueOf(batteryStatus.currentAverage.intValue() * 1000);
        }
        batteryStatus.energyCounter = j(5);
        BatteryStatus.c cVarB = BatteryStatus.c.b(i(intentRegisterReceiver, "status"));
        batteryStatus.status = Integer.valueOf(cVarB.robloxValue);
        BatteryStatus.b bVarL = l(i(intentRegisterReceiver, "plugged"));
        batteryStatus.plugged = Integer.valueOf(bVarL.robloxValue);
        if (bVarL == BatteryStatus.b.NOT_PLUGGED) {
            Integer num2 = batteryStatus.currentNow;
            if (num2 != null && num2.intValue() > 0) {
                batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
                Integer num3 = batteryStatus.currentAverage;
                if (num3 != null) {
                    batteryStatus.currentAverage = Integer.valueOf(-num3.intValue());
                }
            }
        } else if (bVarL != BatteryStatus.b.UNKNOWN && (num = batteryStatus.currentNow) != null && num.intValue() < 0) {
            batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
            Integer num4 = batteryStatus.currentAverage;
            if (num4 != null) {
                batteryStatus.currentAverage = Integer.valueOf(-num4.intValue());
            }
        }
        Integer numI = i(intentRegisterReceiver, "level");
        Integer numI2 = i(intentRegisterReceiver, "scale");
        if (numI != null && numI2 != null) {
            batteryStatus.batteryPercentage = Integer.valueOf((numI.intValue() * 100) / numI2.intValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            batteryStatus.batteryLow = g(intentRegisterReceiver, "battery_low");
        }
        batteryStatus.voltage = i(intentRegisterReceiver, "voltage");
        Integer numI3 = i(intentRegisterReceiver, "temperature");
        if (numI3 != null) {
            batteryStatus.temperature = Float.valueOf(numI3.intValue() / 10.0f);
        }
        batteryStatus.technology = intentRegisterReceiver.getStringExtra("technology");
        batteryStatus.health = Integer.valueOf(BatteryStatus.a.b(i(intentRegisterReceiver, "health")));
        batteryStatus.present = g(intentRegisterReceiver, "present");
        Integer num5 = batteryStatus.currentNow;
        if (num5 != null && batteryStatus.voltage != null) {
            batteryStatus.power = Integer.valueOf((int) ((num5.intValue() / 1000.0f) * (batteryStatus.voltage.intValue() / 1000.0f)));
        }
        if (th.h.a().u1()) {
            batteryStatus.batterySaverMode = Boolean.valueOf(((PowerManager) this.f34299a.getSystemService("power")).isPowerSaveMode());
        }
        gk.p.h("rbx.perfdata", "perfdata battery " + bVarL.name() + " " + cVarB.name() + " " + batteryStatus.currentNow + "uAmps " + batteryStatus.power + "mW");
        NativeGLInterface.reportBatteryStatus(batteryStatus);
    }

    public final void n(Intent intent) {
        int intExtra = (int) ((intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f);
        int intExtra2 = intent.getIntExtra("status", -1);
        gk.p.h("BatteryStatusObserver", "batteryStatus: " + k(intExtra2) + " batteryLevel: " + intExtra);
        NativeGLInterface.reportBatteryStateChanged(intExtra, intExtra2);
    }

    public void o() {
        q();
        gk.p.h("BatteryStatusObserver", "startObserving");
        if (th.h.a().A2()) {
            this.f34303f = this.f34302e.scheduleWithFixedDelay(new Runnable() { // from class: wh.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34295a.m();
                }
            }, 0L, f34298g, TimeUnit.MILLISECONDS);
        } else {
            p();
        }
    }

    public void p() {
        q();
        gk.p.h("BatteryStatusObserver", "startObserving");
        this.f34300c = new a();
        Intent intentRegisterReceiver = this.f34299a.registerReceiver(this.f34300c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            n(intentRegisterReceiver);
        }
    }

    public void q() {
        if (this.f34300c != null) {
            gk.p.h("BatteryStatusObserver", "stopObserving");
            this.f34299a.unregisterReceiver(this.f34300c);
            this.f34300c = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f34303f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f34303f = null;
        }
    }
}
