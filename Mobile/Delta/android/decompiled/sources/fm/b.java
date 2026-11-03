package fm;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f17304a = MessageBus.f();
    public ArrayList<Connection> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17305c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f17306d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Vibrator f17307e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, h> f17308f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17309g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17310h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17311i = 0;

    public class a implements Callback {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            boolean zK = b.this.k();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("supportsHaptics", zK);
                b.this.f17304a.publishProtocolMethodResponseRaw("HapticProtocol", "SupportsHaptics", jSONObject2.toString(), 0, "{}");
            } catch (JSONException unused) {
                q.e("HapticProtocol", "Failed to write supportsHaptics in response to SupportsHaptics request");
            }
        }
    }

    /* JADX INFO: renamed from: fm.b$b, reason: collision with other inner class name */
    public class C0308b implements Callback {
        public C0308b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                b.this.f17309g = Float.valueOf(jSONObject.getString("intensity")).floatValue();
                b.this.q();
            } catch (JSONException unused) {
                q.e("HapticProtocol", "Failed to parse JSON in UpdateSingletonVibration request");
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry<String, float[]> entry : b.this.i().entrySet()) {
                    String key = entry.getKey();
                    float[] value = entry.getValue();
                    if (value.length == 3) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("x", value[0]);
                        jSONObject3.put("y", value[1]);
                        jSONObject3.put("z", value[2]);
                        jSONObject2.put(key, jSONObject3);
                    }
                }
            } catch (JSONException e10) {
                q.e("HapticProtocol", "Exception while handling GetMotors request: " + e10.getMessage());
            }
            b.this.f17304a.publishProtocolMethodResponseRaw("HapticProtocol", "GetMotors", jSONObject2.toString(), 0, "{}");
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    float f10 = (float) jSONObject2.getDouble("millisecondsPerSample");
                    JSONArray jSONArray = jSONObject2.getJSONArray("intensities");
                    float[] fArr = new float[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        fArr[i10] = (float) jSONArray.getDouble(i10);
                    }
                    map.put(next, new g(fArr, f10));
                }
                b.this.p(map);
            } catch (JSONException e10) {
                q.e("HapticProtocol", "Exception while handling SetMotorState request: " + e10.getMessage());
            }
        }
    }

    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b.this.f17310h = true;
            b.this.q();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f17317a = new b();
    }

    public static final class g extends et.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f17318a;
        public final float b;

        public g(float[] fArr, float f10) {
            this.f17318a = (float[]) fArr.clone();
            this.b = f10;
        }

        public final /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && Objects.equals(this.f17318a, gVar.f17318a);
        }

        public final /* synthetic */ Object[] b() {
            return new Object[]{this.f17318a, Float.valueOf(this.b)};
        }

        public float[] c() {
            return (float[]) this.f17318a.clone();
        }

        public float d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return fm.d.a(this.b, this.f17318a);
        }

        public final String toString() {
            return fm.c.a(b(), g.class, "a;b");
        }
    }

    public static final class h extends et.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17319a;
        public final Vibrator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f17320c;

        public h(String str, Vibrator vibrator, float[] fArr) {
            float[] fArr2 = (float[]) fArr.clone();
            this.f17319a = str;
            this.b = vibrator;
            this.f17320c = fArr2;
        }

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f17319a, hVar.f17319a) && Objects.equals(this.b, hVar.b) && Objects.equals(this.f17320c, hVar.f17320c);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f17319a, this.b, this.f17320c};
        }

        public String c() {
            return this.f17319a;
        }

        public float[] d() {
            return (float[]) this.f17320c.clone();
        }

        public Vibrator e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return fm.e.a(this.f17319a, this.b, this.f17320c);
        }

        public final String toString() {
            return fm.c.a(b(), h.class, "a;b;c");
        }
    }

    public static boolean g(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                vibrator.vibrate(VibrationEffect.createPredefined(0));
                return true;
            } catch (Exception e10) {
                q.e("HapticProtocol", "Fallback VibrationEffect failed: " + e10.getMessage());
            }
        }
        return false;
    }

    public static b h() {
        return f.f17317a;
    }

    public void e() {
        int i10 = this.f17311i + 1;
        this.f17311i = i10;
        if (i10 != 1) {
            return;
        }
        Timer timer = new Timer();
        this.f17306d = timer;
        timer.schedule(new e(), 500L);
    }

    public void f() {
        int i10 = this.f17311i - 1;
        this.f17311i = i10;
        if (i10 != 0) {
            return;
        }
        Timer timer = this.f17306d;
        if (timer != null) {
            timer.cancel();
            this.f17306d = null;
        }
        this.f17310h = false;
        q();
    }

    public Map<String, float[]> i() {
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, h>> it = this.f17308f.entrySet().iterator();
        while (it.hasNext()) {
            h value = it.next().getValue();
            map.put(value.c(), value.d());
        }
        return map;
    }

    public final String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, h> entry : this.f17308f.entrySet()) {
                String key = entry.getKey();
                float[] fArrD = entry.getValue().d();
                if (fArrD.length == 3) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", fArrD[0]);
                    jSONObject2.put("y", fArrD[1]);
                    jSONObject2.put("z", fArrD[2]);
                    jSONObject.put(key, jSONObject2);
                }
            }
        } catch (JSONException e10) {
            q.e("HapticProtocol", "Exception while handling GetMotorsJSONString request: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public boolean k() {
        return this.f17305c;
    }

    public void l(Context context) {
        if (this.f17305c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.f17307e = n(context);
        } else {
            this.f17307e = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = this.f17307e;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.f17305c = true;
        m(context);
        this.b.add(this.f17304a.w("HapticProtocol", "SupportsHaptics", new a()));
        this.b.add(this.f17304a.w("HapticProtocol", "UpdateSingletonVibration", new C0308b()));
        this.b.add(this.f17304a.w("HapticProtocol", "GetMotors", new c()));
        this.b.add(this.f17304a.w("HapticProtocol", "SetMotorState", new d()));
        if (rh.h.a().d()) {
            NativeGLInterface.nativeUpdateMobileHapticsState(k(), j());
        }
    }

    public final void m(Context context) {
        Vibrator vibrator;
        VibratorManager vibratorManagerA;
        if (Build.VERSION.SDK_INT >= 31 && (vibratorManagerA = fm.a.a(context.getSystemService("vibrator_manager"))) != null) {
            for (int i10 : vibratorManagerA.getVibratorIds()) {
                Vibrator vibrator2 = vibratorManagerA.getVibrator(i10);
                if (vibrator2 != null && vibrator2.hasVibrator()) {
                    String str = "vibrator_" + i10;
                    this.f17308f.put(str, new h(str, vibrator2, new float[]{0.0f, 0.0f, 0.0f}));
                }
            }
        }
        if (this.f17308f.isEmpty() && (vibrator = this.f17307e) != null && vibrator.hasVibrator()) {
            this.f17308f.put("defaultMotor", new h("defaultMotor", this.f17307e, new float[]{0.0f, 0.0f, 0.0f}));
        }
    }

    @TargetApi(31)
    public final Vibrator n(Context context) {
        VibratorManager vibratorManagerA = fm.a.a(context.getSystemService("vibrator_manager"));
        if (rh.h.a().G4() && vibratorManagerA == null) {
            return null;
        }
        return vibratorManagerA.getDefaultVibrator();
    }

    public final boolean o(Vibrator vibrator, VibrationEffect vibrationEffect) {
        if (vibrator != null && this.f17305c) {
            try {
                if (!vibrator.hasVibrator()) {
                    return false;
                }
                vibrator.vibrate(vibrationEffect);
                return true;
            } catch (IllegalArgumentException e10) {
                q.e("HapticProtocol", "Bad vibration effect: " + e10.getMessage());
                if (!g(vibrator)) {
                    this.f17305c = false;
                }
                return false;
            } catch (SecurityException e11) {
                q.e("HapticProtocol", "No vibration permission: " + e11.getMessage());
                this.f17305c = false;
            } catch (RuntimeException e12) {
                q.e("HapticProtocol", "Runtime crash from vibrator (OEM/HAL): " + e12.getMessage());
                if (!g(vibrator)) {
                    this.f17305c = false;
                }
                return false;
            } catch (Exception e13) {
                q.e("HapticProtocol", "Unexpected vibration exception: " + e13.getMessage());
                this.f17305c = false;
                return false;
            }
        }
        return false;
    }

    public final boolean p(Map<String, g> map) {
        if (!k()) {
            return false;
        }
        Iterator<Map.Entry<String, h>> it = this.f17308f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().e().cancel();
        }
        if (!this.f17310h) {
            return false;
        }
        boolean z10 = true;
        for (Map.Entry<String, g> entry : map.entrySet()) {
            h hVar = this.f17308f.get(entry.getKey());
            if (hVar != null) {
                Vibrator vibratorE = hVar.e();
                g value = entry.getValue();
                float fD = value.d();
                float[] fArrC = value.c();
                int length = fArrC.length;
                long[] jArr = new long[length];
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = (long) fD;
                    iArr[i10] = (int) (((double) (fArrC[i10] * 255.0f)) + 0.5d);
                }
                VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
                if (!rh.h.a().G4()) {
                    vibratorE.vibrate(vibrationEffectCreateWaveform);
                } else if (!o(vibratorE, vibrationEffectCreateWaveform)) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public void q() {
        int i10;
        if (k()) {
            this.f17307e.cancel();
            if (this.f17310h && (i10 = (int) (((double) (this.f17309g * 255.0f)) + 0.5d)) != 0) {
                VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{1000}, new int[]{i10}, 0);
                if (rh.h.a().G4()) {
                    o(this.f17307e, vibrationEffectCreateWaveform);
                } else {
                    this.f17307e.vibrate(vibrationEffectCreateWaveform);
                }
            }
        }
    }
}
