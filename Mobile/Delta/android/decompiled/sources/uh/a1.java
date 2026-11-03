package uh;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import androidx.annotation.NonNull;
import com.roblox.engine.jni.NativeGLInterface;

/* JADX INFO: loaded from: classes2.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32937a;
    public PowerManager$OnThermalStatusChangedListener b;

    public class a implements PowerManager$OnThermalStatusChangedListener {
        public a() {
        }

        public void onThermalStatusChanged(int i10) {
            NativeGLInterface.reportThermalStateChanged(i10);
            ek.q.b("ThermalStatusObserver", "onThermalStatusChanged: " + i10);
        }
    }

    public a1(@NonNull Context context) {
        this.f32937a = context;
    }

    public void a() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) this.f32937a.getSystemService("power")) == null) {
            return;
        }
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = this.b;
        if (powerManager$OnThermalStatusChangedListener != null) {
            powerManager.removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
        }
        NativeGLInterface.reportThermalStateChanged(powerManager.getCurrentThermalStatus());
        ek.q.h("ThermalStatusObserver", "startObserving");
        a aVar = new a();
        this.b = aVar;
        powerManager.addThermalStatusListener(aVar);
    }

    public void b() {
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener;
        if (Build.VERSION.SDK_INT < 29 || this.b == null) {
            return;
        }
        ek.q.h("ThermalStatusObserver", "stopObserving");
        PowerManager powerManager = (PowerManager) this.f32937a.getSystemService("power");
        if (powerManager == null || (powerManager$OnThermalStatusChangedListener = this.b) == null) {
            return;
        }
        powerManager.removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
        this.b = null;
        NativeGLInterface.reportThermalStateChanged(-1);
    }
}
