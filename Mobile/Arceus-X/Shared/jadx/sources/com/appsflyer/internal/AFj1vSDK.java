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

    /* JADX INFO: renamed from: e */
    private static final BitSet f7073e;
    boolean AFKeystoreWrapper;
    final Runnable AFLogger;
    private final Runnable AFLoggerLogLevel;
    private boolean afDebugLog;

    /* JADX INFO: renamed from: d */
    final Runnable f7074d;
    private final Map<AFi1dSDK, AFi1dSDK> force;

    /* JADX INFO: renamed from: i */
    private final Map<AFi1dSDK, Map<String, Object>> f7075i;
    final Object registerClient;
    final Handler unregisterClient;

    /* JADX INFO: renamed from: v */
    private final SensorManager f7076v;

    /* JADX INFO: renamed from: w */
    private final ExecutorService f7077w;

    static {
        BitSet bitSet = new BitSet(6);
        f7073e = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AFj1vSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.registerClient = new Object();
        BitSet bitSet = f7073e;
        this.force = new HashMap(bitSet.size());
        this.f7075i = new ConcurrentHashMap(bitSet.size());
        this.AFLogger = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.registerClient) {
                    AFj1vSDK.this.m8954d();
                    AFj1vSDK aFj1vSDK = AFj1vSDK.this;
                    aFj1vSDK.unregisterClient.postDelayed(aFj1vSDK.f7074d, 150L);
                    AFj1vSDK.this.AFKeystoreWrapper = true;
                }
            }
        };
        this.f7074d = new Runnable() { // from class: com.appsflyer.internal.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7152a.force();
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
                            aFj1vSDK2.unregisterClient.removeCallbacks(aFj1vSDK2.f7074d);
                            AFj1vSDK.this.unregisterClient();
                            AFj1vSDK.this.AFKeystoreWrapper = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.f7076v = sensorManager;
        this.unregisterClient = handler;
        this.f7077w = executorService;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private List<Map<String, Object>> m8950e() {
        synchronized (this.registerClient) {
            try {
                if (!this.force.isEmpty() && this.afDebugLog) {
                    Iterator<AFi1dSDK> it = this.force.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFLogger(this.f7075i, false);
                    }
                }
                if (this.f7075i.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.f7075i.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void force() {
        synchronized (this.registerClient) {
            this.unregisterClient.post(new RunnableC1816l1(this));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    private List<Map<String, Object>> m8951i() {
        synchronized (this.registerClient) {
            try {
                Iterator<AFi1dSDK> it = this.force.values().iterator();
                while (it.hasNext()) {
                    it.next().AFLogger(this.f7075i, true);
                }
                if (this.f7075i.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.f7075i.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m8952v() {
        try {
            for (Sensor sensor : this.f7076v.getSensorList(-1)) {
                int type = sensor.getType();
                if (type >= 0 && f7073e.get(type)) {
                    AFi1dSDK aFi1dSDK = new AFi1dSDK(sensor, this.f7077w);
                    if (!this.force.containsKey(aFi1dSDK)) {
                        this.force.put(aFi1dSDK, aFi1dSDK);
                    }
                    this.f7076v.registerListener(this.force.get(aFi1dSDK), sensor, 1, this.unregisterClient);
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8963e(LogTag.ANTI_FRAUD, "Error registering sensor listeners", th2, false, false);
        }
        this.afDebugLog = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m8953w() {
        try {
            if (!this.force.isEmpty()) {
                for (AFi1dSDK aFi1dSDK : this.force.values()) {
                    this.f7076v.unregisterListener(aFi1dSDK);
                    aFi1dSDK.AFLogger(this.f7075i, true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8963e(LogTag.ANTI_FRAUD, "Error unregistering sensor listeners", th2, false, false);
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
        List<Map<String, Object>> listM8950e = m8950e();
        if (!listM8950e.isEmpty()) {
            concurrentHashMap.put("sensors", listM8950e);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listM8951i = m8951i();
        if (!listM8951i.isEmpty()) {
            concurrentHashMap.put("sensors", listM8951i);
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final void m8954d() {
        this.unregisterClient.post(new Runnable() { // from class: com.appsflyer.internal.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7149a.m8952v();
            }
        });
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void registerClient() {
        this.unregisterClient.post(this.AFLoggerLogLevel);
        this.unregisterClient.post(this.AFLogger);
    }

    public final void unregisterClient() {
        this.unregisterClient.post(new RunnableC1816l1(this));
    }

    public AFj1vSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
