package p517wh;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.p017os.PowerManager$OnThermalStatusChangedListener;
import androidx.annotation.NonNull;
import com.roblox.engine.jni.NativeGLInterface;
import p151gk.C6124q;

/* JADX INFO: renamed from: wh.z0 */
/* JADX INFO: loaded from: classes2.dex */
public class C12474z0 {

    /* JADX INFO: renamed from: a */
    public final Context f44599a;

    /* JADX INFO: renamed from: b */
    public PowerManager$OnThermalStatusChangedListener f44600b;

    /* JADX INFO: renamed from: wh.z0$a */
    public class a implements PowerManager$OnThermalStatusChangedListener {
        public a() {
        }

        public void onThermalStatusChanged(int i10) {
            NativeGLInterface.reportThermalStateChanged(i10);
            C6124q.m27057b("ThermalStatusObserver", "onThermalStatusChanged: " + i10);
        }
    }

    public C12474z0(@NonNull Context context) {
        this.f44599a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m46725a() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) this.f44599a.getSystemService("power")) == null) {
            return;
        }
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = this.f44600b;
        if (powerManager$OnThermalStatusChangedListener != null) {
            powerManager.removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
        }
        NativeGLInterface.reportThermalStateChanged(powerManager.getCurrentThermalStatus());
        C6124q.m27063h("ThermalStatusObserver", "startObserving");
        a aVar = new a();
        this.f44600b = aVar;
        powerManager.addThermalStatusListener(aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m46726b() {
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener;
        if (Build.VERSION.SDK_INT < 29 || this.f44600b == null) {
            return;
        }
        C6124q.m27063h("ThermalStatusObserver", "stopObserving");
        PowerManager powerManager = (PowerManager) this.f44599a.getSystemService("power");
        if (powerManager == null || (powerManager$OnThermalStatusChangedListener = this.f44600b) == null) {
            return;
        }
        powerManager.removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
        this.f44600b = null;
        NativeGLInterface.reportThermalStateChanged(-1);
    }
}
