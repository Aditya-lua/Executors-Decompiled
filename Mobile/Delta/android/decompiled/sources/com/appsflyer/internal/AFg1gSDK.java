package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1gSDK {
    private final LinkedHashMap<String, Object> unregisterClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f5372d = new Object() { // from class: com.appsflyer.internal.AFg1gSDK.4
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double AFLogger = Double.valueOf(-0.0d);

    public AFg1gSDK() {
        this.unregisterClient = new LinkedHashMap<>();
    }

    public static String AFKeystoreWrapper(Number number) throws Throwable {
        if (number == null) {
            throw new AFg1hSDK("Number must be non-null");
        }
        double dDoubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(dDoubleValue)};
            Map map = AFa1bSDK.getInstance;
            Object declaredMethod = map.get(-1950536006);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1bSDK.AFLogger((char) (37687 - View.getDefaultSize(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 282, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35)).getDeclaredMethod("d", Double.TYPE);
                map.put(-1950536006, declaredMethod);
            }
            ((Double) ((Method) declaredMethod).invoke(null, objArr)).getClass();
            if (number.equals(AFLogger)) {
                return "-0";
            }
            long jLongValue = number.longValue();
            return dDoubleValue == ((double) jLongValue) ? Long.toString(jLongValue) : number.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object registerClient(Object obj) throws Throwable {
        if (obj == null) {
            return f5372d;
        }
        if (((Class) AFa1bSDK.AFLogger((char) Color.green(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 318, 37 - View.resolveSizeAndState(0, 0, 0))).isInstance(obj) || (obj instanceof AFg1gSDK)) {
            return obj;
        }
        try {
            if (obj instanceof JSONArray) {
                try {
                    Object[] objArr = {obj.toString()};
                    Map map = AFa1bSDK.getInstance;
                    Object declaredConstructor = map.get(-699350596);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1bSDK.AFLogger((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getCapsMode("", 0, 0) + 318, 37 - View.combineMeasuredStates(0, 0))).getDeclaredConstructor(String.class);
                        map.put(-699350596, declaredConstructor);
                    }
                    obj = ((Constructor) declaredConstructor).newInstance(objArr);
                    return obj;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            if (obj instanceof JSONObject) {
                return new AFg1gSDK(obj.toString());
            }
            if (obj.equals(f5372d)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    try {
                        Object[] objArr2 = {(Collection) obj};
                        Map map2 = AFa1bSDK.getInstance;
                        Object declaredConstructor2 = map2.get(-1688574219);
                        if (declaredConstructor2 == null) {
                            declaredConstructor2 = ((Class) AFa1bSDK.AFLogger((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 318 - Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 37)).getDeclaredConstructor(Collection.class);
                            map2.put(-1688574219, declaredConstructor2);
                        }
                        return ((Constructor) declaredConstructor2).newInstance(objArr2);
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
                if (obj.getClass().isArray()) {
                    try {
                        Object[] objArr3 = {obj};
                        Map map3 = AFa1bSDK.getInstance;
                        Object declaredConstructor3 = map3.get(1891103082);
                        if (declaredConstructor3 == null) {
                            declaredConstructor3 = ((Class) AFa1bSDK.AFLogger((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 318, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36)).getDeclaredConstructor(Object.class);
                            map3.put(1891103082, declaredConstructor3);
                        }
                        return ((Constructor) declaredConstructor3).newInstance(objArr3);
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                }
                if (obj instanceof Map) {
                    return new AFg1gSDK((Map) obj);
                }
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            } catch (Exception unused) {
            }
            return null;
        } catch (AFg1hSDK unused2) {
        }
    }

    public final String toString() {
        try {
            AFg1cSDK aFg1cSDK = new AFg1cSDK();
            registerClient(aFg1cSDK);
            return aFg1cSDK.toString();
        } catch (AFg1hSDK unused) {
            return null;
        }
    }

    public AFg1gSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.unregisterClient.put(str, registerClient(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    private AFg1gSDK(Object obj) throws Throwable {
        try {
            Map map = AFa1bSDK.getInstance;
            Object declaredMethod = map.get(-1188160950);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1bSDK.AFLogger((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 354, View.MeasureSpec.getSize(0) + 37)).getDeclaredMethod("AFLogger", null);
                map.put(-1188160950, declaredMethod);
            }
            Object objInvoke = ((Method) declaredMethod).invoke(obj, null);
            if (!(objInvoke instanceof AFg1gSDK)) {
                Object[] objArr = {objInvoke, "AFJsonObject"};
                Object declaredMethod2 = map.get(998982983);
                if (declaredMethod2 == null) {
                    declaredMethod2 = ((Class) AFa1bSDK.AFLogger((char) (37687 - Color.alpha(0)), 282 - (ViewConfiguration.getPressedStateDuration() >> 16), 36 - View.resolveSize(0, 0))).getDeclaredMethod("AFLogger", Object.class, String.class);
                    map.put(998982983, declaredMethod2);
                }
                throw ((Throwable) ((Method) declaredMethod2).invoke(null, objArr));
            }
            this.unregisterClient = ((AFg1gSDK) objInvoke).unregisterClient;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public final AFg1gSDK AFKeystoreWrapper(String str, Object obj) throws Throwable {
        if (obj == null) {
            this.unregisterClient.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1bSDK.getInstance;
                Object method = map.get(-1950536006);
                if (method == null) {
                    method = ((Class) AFa1bSDK.AFLogger((char) (37687 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 282, 36 - (Process.myPid() >> 22))).getMethod("d", Double.TYPE);
                    map.put(-1950536006, method);
                }
                ((Double) ((Method) method).invoke(null, objArr)).getClass();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.unregisterClient;
        if (str == null) {
            throw new AFg1hSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFg1gSDK(String str) throws Throwable {
        try {
            Object[] objArr = {str};
            Map map = AFa1bSDK.getInstance;
            Object declaredConstructor = map.get(-385531939);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1bSDK.AFLogger((char) Color.green(0), 355 - Color.alpha(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37)).getDeclaredConstructor(String.class);
                map.put(-385531939, declaredConstructor);
            }
            this(((Constructor) declaredConstructor).newInstance(objArr));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public final void registerClient(AFg1cSDK aFg1cSDK) {
        aFg1cSDK.AFKeystoreWrapper(AFg1cSDK.AFa1ySDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.unregisterClient.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFg1cSDK.unregisterClient();
                aFg1cSDK.AFLogger(key);
                aFg1cSDK.d(entry.getValue());
            } else {
                throw new AFg1hSDK("Names must be non-null");
            }
        }
        aFg1cSDK.unregisterClient(AFg1cSDK.AFa1ySDK.EMPTY_OBJECT, AFg1cSDK.AFa1ySDK.NONEMPTY_OBJECT, "}");
    }
}
