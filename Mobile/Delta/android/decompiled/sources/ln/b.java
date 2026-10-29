package ln;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lln/b;", "Lln/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "d", "()V", "c", "Lln/a$a;", "b", "()Lln/a$a;", "a", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "Landroid/hardware/Sensor;", "sensor", "", "J", "measurementsTaken", "", "D", "averageRotationPerMeasurement", "", "e", "Z", "isEventListenerRegistered", "ln/b$a", "f", "Lln/b$a;", "sensorEventListener", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ln.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SensorManager sensorManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Sensor sensor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long measurementsTaken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public double averageRotationPerMeasurement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isEventListenerRegistered;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a sensorEventListener;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ln/b$a", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent event) {
            float[] fArr;
            if (event == null || (fArr = event.values) == null || fArr.length < 3) {
                return;
            }
            double dAbs = ((double) ((Math.abs(fArr[0]) + Math.abs(fArr[1])) + Math.abs(fArr[2]))) / 3.0d;
            b bVar = b.this;
            bVar.averageRotationPerMeasurement = ((bVar.averageRotationPerMeasurement * b.this.measurementsTaken) + dAbs) / (b.this.measurementsTaken + 1);
            b.this.measurementsTaken++;
        }
    }

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.sensor = sensorManager.getDefaultSensor(4);
        this.sensorEventListener = new a();
    }

    @Override // ln.a
    public void a() {
        this.measurementsTaken = 0L;
        this.averageRotationPerMeasurement = 0.0d;
    }

    @Override // ln.a
    @NotNull
    public ln.a.CameraStats b() {
        long j10 = this.measurementsTaken;
        return new ln.a.CameraStats(j10 == 0 ? 0.0d : this.averageRotationPerMeasurement / j10);
    }

    @Override // ln.a
    public void c() {
        this.isEventListenerRegistered = false;
        this.sensorManager.unregisterListener(this.sensorEventListener);
    }

    @Override // ln.a
    public void d() {
        if (this.isEventListenerRegistered) {
            return;
        }
        this.isEventListenerRegistered = true;
        this.measurementsTaken = 0L;
        this.averageRotationPerMeasurement = 0.0d;
        Sensor sensor = this.sensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this.sensorEventListener, sensor, 100000);
        }
    }
}
