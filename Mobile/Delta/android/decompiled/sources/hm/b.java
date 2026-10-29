package hm;

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
import gk.p;
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
    public MessageBus f19329a = MessageBus.f();
    public ArrayList<Connection> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19330c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f19331d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Vibrator f19332e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, h> f19333f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19334g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19335h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19336i = 0;

    public class a implements Callback {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            boolean zK = b.this.k();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("supportsHaptics", zK);
                b.this.f19329a.publishProtocolMethodResponseRaw("HapticProtocol", "SupportsHaptics", jSONObject2.toString(), 0, "{}");
            } catch (JSONException unused) {
                p.e("HapticProtocol", "Failed to write supportsHaptics in response to SupportsHaptics request");
            }
        }
    }

    /* JADX INFO: renamed from: hm.b$b, reason: collision with other inner class name */
    public class C0343b implements Callback {
        public C0343b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            try {
                b.this.f19334g = Float.valueOf(jSONObject.getString("intensity")).floatValue();
                b.this.q();
            } catch (JSONException unused) {
                p.e("HapticProtocol", "Failed to parse JSON in UpdateSingletonVibration request");
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
                p.e("HapticProtocol", "Exception while handling GetMotors request: " + e10.getMessage());
            }
            b.this.f19329a.publishProtocolMethodResponseRaw("HapticProtocol", "GetMotors", jSONObject2.toString(), 0, "{}");
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
                p.e("HapticProtocol", "Exception while handling SetMotorState request: " + e10.getMessage());
            }
        }
    }

    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b.this.f19335h = true;
            b.this.q();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f19342a = new b();
    }

    public static final class g extends gt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f19343a;
        public final float b;

        public g(float[] fArr, float f10) {
            this.f19343a = (float[]) fArr.clone();
            this.b = f10;
        }

        public final /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && Objects.equals(this.f19343a, gVar.f19343a);
        }

        public final /* synthetic */ Object[] b() {
            return new Object[]{this.f19343a, Float.valueOf(this.b)};
        }

        public float[] c() {
            return (float[]) this.f19343a.clone();
        }

        public float d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return hm.d.a(this.b, this.f19343a);
        }

        public final String toString() {
            return hm.c.a(b(), g.class, "a;b");
        }
    }

    public static final class h extends gt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19344a;
        public final Vibrator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f19345c;

        public h(String str, Vibrator vibrator, float[] fArr) {
            float[] fArr2 = (float[]) fArr.clone();
            this.f19344a = str;
            this.b = vibrator;
            this.f19345c = fArr2;
        }

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f19344a, hVar.f19344a) && Objects.equals(this.b, hVar.b) && Objects.equals(this.f19345c, hVar.f19345c);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f19344a, this.b, this.f19345c};
        }

        public String c() {
            return this.f19344a;
        }

        public float[] d() {
            return (float[]) this.f19345c.clone();
        }

        public Vibrator e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return hm.e.a(this.f19344a, this.b, this.f19345c);
        }

        public final String toString() {
            return hm.c.a(b(), h.class, "a;b;c");
        }
    }

    public static boolean g(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                vibrator.vibrate(VibrationEffect.createPredefined(0));
                return true;
            } catch (Exception e10) {
                p.e("HapticProtocol", "Fallback VibrationEffect failed: " + e10.getMessage());
            }
        }
        return false;
    }

    public static b h() {
        return f.f19342a;
    }

    public void e() {
        int i10 = this.f19336i + 1;
        this.f19336i = i10;
        if (i10 != 1) {
            return;
        }
        Timer timer = new Timer();
        this.f19331d = timer;
        timer.schedule(new e(), 500L);
    }

    public void f() {
        int i10 = this.f19336i - 1;
        this.f19336i = i10;
        if (i10 != 0) {
            return;
        }
        Timer timer = this.f19331d;
        if (timer != null) {
            timer.cancel();
            this.f19331d = null;
        }
        this.f19335h = false;
        q();
    }

    public Map<String, float[]> i() {
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, h>> it = this.f19333f.entrySet().iterator();
        while (it.hasNext()) {
            h value = it.next().getValue();
            map.put(value.c(), value.d());
        }
        return map;
    }

    public final String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, h> entry : this.f19333f.entrySet()) {
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
            p.e("HapticProtocol", "Exception while handling GetMotorsJSONString request: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public boolean k() {
        return this.f19330c;
    }

    public void l(Context context) {
        if (this.f19330c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.f19332e = n(context);
        } else {
            this.f19332e = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = this.f19332e;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.f19330c = true;
        m(context);
        this.b.add(this.f19329a.w("HapticProtocol", "SupportsHaptics", new a()));
        this.b.add(this.f19329a.w("HapticProtocol", "UpdateSingletonVibration", new C0343b()));
        this.b.add(this.f19329a.w("HapticProtocol", "GetMotors", new c()));
        this.b.add(this.f19329a.w("HapticProtocol", "SetMotorState", new d()));
        if (th.h.a().d()) {
            NativeGLInterface.nativeUpdateMobileHapticsState(k(), j());
        }
    }

    public final void m(Context context) {
        Vibrator vibrator;
        VibratorManager vibratorManagerA;
        if (Build.VERSION.SDK_INT >= 31 && (vibratorManagerA = hm.a.a(context.getSystemService("vibrator_manager"))) != null) {
            for (int i10 : vibratorManagerA.getVibratorIds()) {
                Vibrator vibrator2 = vibratorManagerA.getVibrator(i10);
                if (vibrator2 != null && vibrator2.hasVibrator()) {
                    String str = "vibrator_" + i10;
                    this.f19333f.put(str, new h(str, vibrator2, new float[]{0.0f, 0.0f, 0.0f}));
                }
            }
        }
        if (this.f19333f.isEmpty() && (vibrator = this.f19332e) != null && vibrator.hasVibrator()) {
            this.f19333f.put("defaultMotor", new h("defaultMotor", this.f19332e, new float[]{0.0f, 0.0f, 0.0f}));
        }
    }

    @TargetApi(31)
    public final Vibrator n(Context context) {
        VibratorManager vibratorManagerA = hm.a.a(context.getSystemService("vibrator_manager"));
        if (th.h.a().u4() && vibratorManagerA == null) {
            return null;
        }
        return vibratorManagerA.getDefaultVibrator();
    }

    public final boolean o(Vibrator vibrator, VibrationEffect vibrationEffect) {
        if (vibrator != null && this.f19330c) {
            try {
                if (!vibrator.hasVibrator()) {
                    return false;
                }
                vibrator.vibrate(vibrationEffect);
                return true;
            } catch (IllegalArgumentException e10) {
                p.e("HapticProtocol", "Bad vibration effect: " + e10.getMessage());
                if (!g(vibrator)) {
                    this.f19330c = false;
                }
                return false;
            } catch (SecurityException e11) {
                p.e("HapticProtocol", "No vibration permission: " + e11.getMessage());
                this.f19330c = false;
            } catch (RuntimeException e12) {
                p.e("HapticProtocol", "Runtime crash from vibrator (OEM/HAL): " + e12.getMessage());
                if (!g(vibrator)) {
                    this.f19330c = false;
                }
                return false;
            } catch (Exception e13) {
                p.e("HapticProtocol", "Unexpected vibration exception: " + e13.getMessage());
                this.f19330c = false;
                return false;
            }
        }
        return false;
    }

    public final boolean p(Map<String, g> map) {
        if (!k()) {
            return false;
        }
        Iterator<Map.Entry<String, h>> it = this.f19333f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().e().cancel();
        }
        if (!this.f19335h) {
            return false;
        }
        boolean z10 = true;
        for (Map.Entry<String, g> entry : map.entrySet()) {
            h hVar = this.f19333f.get(entry.getKey());
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
                if (!th.h.a().u4()) {
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
            this.f19332e.cancel();
            if (this.f19335h && (i10 = (int) (((double) (this.f19334g * 255.0f)) + 0.5d)) != 0) {
                VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{1000}, new int[]{i10}, 0);
                if (th.h.a().u4()) {
                    o(this.f19332e, vibrationEffectCreateWaveform);
                } else {
                    this.f19332e.vibrate(vibrationEffectCreateWaveform);
                }
            }
        }
    }
}
