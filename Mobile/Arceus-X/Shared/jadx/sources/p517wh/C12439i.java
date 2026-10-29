package p517wh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.BatteryStatus;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: renamed from: wh.i */
/* JADX INFO: loaded from: classes2.dex */
public class C12439i {

    /* JADX INFO: renamed from: g */
    public static final long f44483g;

    /* JADX INFO: renamed from: a */
    public final Context f44484a;

    /* JADX INFO: renamed from: b */
    public final BatteryManager f44485b;

    /* JADX INFO: renamed from: c */
    public BroadcastReceiver f44486c;

    /* JADX INFO: renamed from: d */
    public long f44487d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f44488e = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: wh.h
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return C12439i.m46576b(runnable);
        }
    });

    /* JADX INFO: renamed from: f */
    public ScheduledFuture<?> f44489f;

    /* JADX INFO: renamed from: wh.i$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (System.currentTimeMillis() - C12439i.this.f44487d > C12439i.f44483g) {
                C12439i.this.f44487d = System.currentTimeMillis();
                C12439i.this.m46588n(intent);
            }
        }
    }

    static {
        f44483g = C11659h.m43403a().mo43449G2() ? 15000L : 30000L;
    }

    public C12439i(@NonNull Context context) {
        this.f44484a = context;
        this.f44485b = (BatteryManager) context.getSystemService("batterymanager");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Thread m46576b(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("BatteryStatusObserver-" + System.currentTimeMillis());
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m46581g(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return Boolean.valueOf(intent.getBooleanExtra(str, false));
    }

    /* JADX INFO: renamed from: i */
    public static Integer m46582i(Intent intent, String str) {
        int intExtra;
        if (intent == null || !intent.hasExtra(str) || (intExtra = intent.getIntExtra(str, EditorInfoCompat.IME_FLAG_FORCE_ASCII)) == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    /* JADX INFO: renamed from: l */
    public static BatteryStatus.EnumC3316b m46583l(Integer num) {
        if (num == null) {
            return BatteryStatus.EnumC3316b.UNKNOWN;
        }
        for (BatteryStatus.EnumC3316b enumC3316b : BatteryStatus.EnumC3316b.values()) {
            if (enumC3316b.androidValue == num.intValue()) {
                return enumC3316b;
            }
        }
        return BatteryStatus.EnumC3316b.UNKNOWN;
    }

    /* JADX INFO: renamed from: h */
    public final Integer m46584h(int i10) {
        BatteryManager batteryManager = this.f44485b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Integer.valueOf((int) longProperty);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Long m46585j(int i10) {
        BatteryManager batteryManager = this.f44485b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i10);
        if (longProperty != Long.MIN_VALUE) {
            return Long.valueOf(longProperty);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final String m46586k(int i10) {
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

    /* JADX INFO: renamed from: m */
    public final void m46587m() {
        Integer num;
        Intent intentRegisterReceiver = this.f44484a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return;
        }
        BatteryStatus batteryStatus = new BatteryStatus();
        batteryStatus.chargeCounter = m46584h(1);
        Integer numM46584h = m46584h(2);
        batteryStatus.currentNow = numM46584h;
        if (numM46584h != null && Math.abs(numM46584h.intValue()) < 42000) {
            batteryStatus.currentNow = Integer.valueOf(batteryStatus.currentNow.intValue() * 1000);
        }
        Integer numM46584h2 = m46584h(3);
        batteryStatus.currentAverage = numM46584h2;
        if (numM46584h2 != null && Math.abs(numM46584h2.intValue()) < 42000) {
            batteryStatus.currentAverage = Integer.valueOf(batteryStatus.currentAverage.intValue() * 1000);
        }
        batteryStatus.energyCounter = m46585j(5);
        BatteryStatus.EnumC3317c enumC3317cM15815b = BatteryStatus.EnumC3317c.m15815b(m46582i(intentRegisterReceiver, NotificationCompat.CATEGORY_STATUS));
        batteryStatus.status = Integer.valueOf(enumC3317cM15815b.robloxValue);
        BatteryStatus.EnumC3316b enumC3316bM46583l = m46583l(m46582i(intentRegisterReceiver, "plugged"));
        batteryStatus.plugged = Integer.valueOf(enumC3316bM46583l.robloxValue);
        if (enumC3316bM46583l == BatteryStatus.EnumC3316b.NOT_PLUGGED) {
            Integer num2 = batteryStatus.currentNow;
            if (num2 != null && num2.intValue() > 0) {
                batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
                Integer num3 = batteryStatus.currentAverage;
                if (num3 != null) {
                    batteryStatus.currentAverage = Integer.valueOf(-num3.intValue());
                }
            }
        } else if (enumC3316bM46583l != BatteryStatus.EnumC3316b.UNKNOWN && (num = batteryStatus.currentNow) != null && num.intValue() < 0) {
            batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
            Integer num4 = batteryStatus.currentAverage;
            if (num4 != null) {
                batteryStatus.currentAverage = Integer.valueOf(-num4.intValue());
            }
        }
        Integer numM46582i = m46582i(intentRegisterReceiver, "level");
        Integer numM46582i2 = m46582i(intentRegisterReceiver, "scale");
        if (numM46582i != null && numM46582i2 != null) {
            batteryStatus.batteryPercentage = Integer.valueOf((numM46582i.intValue() * 100) / numM46582i2.intValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            batteryStatus.batteryLow = m46581g(intentRegisterReceiver, "battery_low");
        }
        batteryStatus.voltage = m46582i(intentRegisterReceiver, "voltage");
        Integer numM46582i3 = m46582i(intentRegisterReceiver, "temperature");
        if (numM46582i3 != null) {
            batteryStatus.temperature = Float.valueOf(numM46582i3.intValue() / 10.0f);
        }
        batteryStatus.technology = intentRegisterReceiver.getStringExtra("technology");
        batteryStatus.health = Integer.valueOf(BatteryStatus.EnumC3315a.m15812b(m46582i(intentRegisterReceiver, "health")));
        batteryStatus.present = m46581g(intentRegisterReceiver, "present");
        Integer num5 = batteryStatus.currentNow;
        if (num5 != null && batteryStatus.voltage != null) {
            batteryStatus.power = Integer.valueOf((int) ((num5.intValue() / 1000.0f) * (batteryStatus.voltage.intValue() / 1000.0f)));
        }
        if (C11659h.m43403a().mo43766z1()) {
            batteryStatus.batterySaverMode = Boolean.valueOf(((PowerManager) this.f44484a.getSystemService("power")).isPowerSaveMode());
        }
        C6124q.m27063h("rbx.perfdata", "perfdata battery " + enumC3316bM46583l.name() + " " + enumC3317cM15815b.name() + " " + batteryStatus.currentNow + "uAmps " + batteryStatus.power + "mW");
        NativeGLInterface.reportBatteryStatus(batteryStatus);
    }

    /* JADX INFO: renamed from: n */
    public final void m46588n(Intent intent) {
        int intExtra = (int) ((intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f);
        int intExtra2 = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        C6124q.m27063h("BatteryStatusObserver", "batteryStatus: " + m46586k(intExtra2) + " batteryLevel: " + intExtra);
        NativeGLInterface.reportBatteryStateChanged(intExtra, intExtra2);
    }

    /* JADX INFO: renamed from: o */
    public void m46589o() {
        m46591q();
        C6124q.m27063h("BatteryStatusObserver", "startObserving");
        if (C11659h.m43403a().mo43449G2()) {
            this.f44489f = this.f44488e.scheduleWithFixedDelay(new Runnable() { // from class: wh.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44480a.m46587m();
                }
            }, 0L, f44483g, TimeUnit.MILLISECONDS);
        } else {
            m46590p();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m46590p() {
        m46591q();
        C6124q.m27063h("BatteryStatusObserver", "startObserving");
        this.f44486c = new a();
        Intent intentRegisterReceiver = this.f44484a.registerReceiver(this.f44486c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            m46588n(intentRegisterReceiver);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m46591q() {
        if (this.f44486c != null) {
            C6124q.m27063h("BatteryStatusObserver", "stopObserving");
            this.f44484a.unregisterReceiver(this.f44486c);
            this.f44486c = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f44489f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f44489f = null;
        }
    }
}
