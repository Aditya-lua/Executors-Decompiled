package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1dSDK implements SensorEventListener {
    private double AFKeystoreWrapper;

    @NonNull
    private final String AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5490d;

    @NonNull
    private final Executor force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5491i;
    private final int registerClient;

    @NonNull
    private final String unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float[][] f5492v = new float[2][];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long[] f5493w = new long[2];

    public AFi1dSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.f5490d = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.unregisterClient = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFLogger = str;
        this.registerClient = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.force = executorService;
    }

    private static double AFLogger(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i10 = 0; i10 < iMin; i10++) {
            dPow += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O_, reason: merged with bridge method [inline-methods] */
    public void P_(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.f5492v;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.f5493w[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.f5492v[1] = fArrCopyOf;
            this.f5493w[1] = jCurrentTimeMillis;
            this.AFKeystoreWrapper = AFLogger(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j10 - this.f5491i) {
            this.f5491i = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.f5493w[1] = jCurrentTimeMillis;
                return;
            }
            double dAFLogger = AFLogger(fArr3, fArr);
            if (dAFLogger > this.AFKeystoreWrapper) {
                this.f5492v[1] = Arrays.copyOf(fArr, fArr.length);
                this.f5493w[1] = jCurrentTimeMillis;
                this.AFKeystoreWrapper = dAFLogger;
            }
        }
    }

    @NonNull
    private Map<String, Object> registerClient() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.f5490d));
        concurrentHashMap.put("sN", this.unregisterClient);
        concurrentHashMap.put("sV", this.AFLogger);
        float[] fArr = this.f5492v[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", unregisterClient(fArr));
        }
        float[] fArr2 = this.f5492v[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", unregisterClient(fArr2));
        }
        return concurrentHashMap;
    }

    @NonNull
    private static List<Float> unregisterClient(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFi1dSDK) {
            AFi1dSDK aFi1dSDK = (AFi1dSDK) obj;
            int i10 = aFi1dSDK.f5490d;
            String str = aFi1dSDK.unregisterClient;
            String str2 = aFi1dSDK.AFLogger;
            if (this.f5490d == i10 && this.unregisterClient.equals(str) && this.AFLogger.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.registerClient;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.force.execute(new Runnable() { // from class: com.appsflyer.internal.b1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5548a.P_(sensorEvent);
                }
            });
        } else {
            P_(sensorEvent);
        }
    }

    public final void AFLogger(@NonNull Map<AFi1dSDK, Map<String, Object>> map, boolean z10) {
        if (this.f5492v[0] != null) {
            map.put(this, registerClient());
            if (z10) {
                int length = this.f5492v.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.f5492v[i10] = null;
                }
                int length2 = this.f5493w.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f5493w[i11] = 0;
                }
                this.AFKeystoreWrapper = 0.0d;
                this.f5491i = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, registerClient());
    }
}
