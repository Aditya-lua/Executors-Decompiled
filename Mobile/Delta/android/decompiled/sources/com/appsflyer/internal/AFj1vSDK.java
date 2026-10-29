package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1vSDK implements AFj1ySDK {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BitSet f5445e;
    boolean AFKeystoreWrapper;
    final Runnable AFLogger;
    private final Runnable AFLoggerLogLevel;
    private boolean afDebugLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Runnable f5446d;
    private final Map<AFi1dSDK, AFi1dSDK> force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<AFi1dSDK, Map<String, Object>> f5447i;
    final Object registerClient;
    final Handler unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SensorManager f5448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ExecutorService f5449w;

    static {
        BitSet bitSet = new BitSet(6);
        f5445e = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1vSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.registerClient = new Object();
        BitSet bitSet = f5445e;
        this.force = new HashMap(bitSet.size());
        this.f5447i = new ConcurrentHashMap(bitSet.size());
        this.AFLogger = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.registerClient) {
                    AFj1vSDK.this.d();
                    AFj1vSDK aFj1vSDK = AFj1vSDK.this;
                    aFj1vSDK.unregisterClient.postDelayed(aFj1vSDK.f5446d, 150L);
                    AFj1vSDK.this.AFKeystoreWrapper = true;
                }
            }
        };
        this.f5446d = new Runnable() { // from class: com.appsflyer.internal.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5510a.force();
            }
        };
        this.AFLoggerLogLevel = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.registerClient) {
                    try {
                        AFj1vSDK aFj1vSDK = AFj1vSDK.this;
                        if (aFj1vSDK.AFKeystoreWrapper) {
                            aFj1vSDK.unregisterClient.removeCallbacks(aFj1vSDK.AFLogger);
                            AFj1vSDK aFj1vSDK2 = AFj1vSDK.this;
                            aFj1vSDK2.unregisterClient.removeCallbacks(aFj1vSDK2.f5446d);
                            AFj1vSDK.this.unregisterClient();
                            AFj1vSDK.this.AFKeystoreWrapper = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.f5448v = sensorManager;
        this.unregisterClient = handler;
        this.f5449w = executorService;
    }

    @NonNull
    private List<Map<String, Object>> e() {
        synchronized (this.registerClient) {
            try {
                if (!this.force.isEmpty() && this.afDebugLog) {
                    Iterator<AFi1dSDK> it = this.force.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFLogger(this.f5447i, false);
                    }
                }
                if (this.f5447i.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.f5447i.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void force() {
        synchronized (this.registerClient) {
            this.unregisterClient.post(new l1(this));
        }
    }

    @NonNull
    private List<Map<String, Object>> i() {
        synchronized (this.registerClient) {
            try {
                Iterator<AFi1dSDK> it = this.force.values().iterator();
                while (it.hasNext()) {
                    it.next().AFLogger(this.f5447i, true);
                }
                if (this.f5447i.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.f5447i.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        try {
            for (Sensor sensor : this.f5448v.getSensorList(-1)) {
                int type = sensor.getType();
                if (type >= 0 && f5445e.get(type)) {
                    AFi1dSDK aFi1dSDK = new AFi1dSDK(sensor, this.f5449w);
                    if (!this.force.containsKey(aFi1dSDK)) {
                        this.force.put(aFi1dSDK, aFi1dSDK);
                    }
                    this.f5448v.registerListener(this.force.get(aFi1dSDK), sensor, 1, this.unregisterClient);
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "Error registering sensor listeners", th2, false, false);
        }
        this.afDebugLog = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        try {
            if (!this.force.isEmpty()) {
                for (AFi1dSDK aFi1dSDK : this.force.values()) {
                    this.f5448v.unregisterListener(aFi1dSDK);
                    aFi1dSDK.AFLogger(this.f5447i, true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "Error unregistering sensor listeners", th2, false, false);
        }
        this.afDebugLog = false;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final synchronized void AFKeystoreWrapper() {
        this.unregisterClient.post(this.AFLoggerLogLevel);
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    @NonNull
    public final Map<String, Object> AFLogger() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listE = e();
        if (!listE.isEmpty()) {
            concurrentHashMap.put("sensors", listE);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listI = i();
        if (!listI.isEmpty()) {
            concurrentHashMap.put("sensors", listI);
        }
        return concurrentHashMap;
    }

    public final void d() {
        this.unregisterClient.post(new Runnable() { // from class: com.appsflyer.internal.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5507a.v();
            }
        });
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void registerClient() {
        this.unregisterClient.post(this.AFLoggerLogLevel);
        this.unregisterClient.post(this.AFLogger);
    }

    public final void unregisterClient() {
        this.unregisterClient.post(new l1(this));
    }

    public AFj1vSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
