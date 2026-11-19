package vm;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import ok.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f34418a = MessageBus.getInstance();
    public ArrayList<Connection> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34419c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f34420d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Vibrator f34421e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, h> f34422f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f34423g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34424h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34425i = 0;

    public class a implements Callback {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            boolean zK = b.this.k();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("supportsHaptics", zK);
                b.this.f34418a.publishProtocolMethodResponseRaw("HapticProtocol", "SupportsHaptics", jSONObject2.toString(), 0, "{}");
            } catch (JSONException unused) {
                q.e("HapticProtocol", "Failed to write supportsHaptics in response to SupportsHaptics request");
            }
        }
    }

    /* JADX INFO: renamed from: vm.b$b, reason: collision with other inner class name */
    public class C0703b implements Callback {
        public C0703b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            try {
                b.this.f34423g = Float.valueOf(jSONObject.getString("intensity")).floatValue();
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
        public void run(JSONObject jSONObject) {
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
            b.this.f34418a.publishProtocolMethodResponseRaw("HapticProtocol", "GetMotors", jSONObject2.toString(), 0, "{}");
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
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
            b.this.f34424h = true;
            b.this.q();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f34431a = new b();
    }

    public static final class g extends xt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f34432a;
        public final float b;

        public g(float[] fArr, float f10) {
            this.f34432a = (float[]) fArr.clone();
            this.b = f10;
        }

        public final /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && Objects.equals(this.f34432a, gVar.f34432a);
        }

        public final /* synthetic */ Object[] b() {
            return new Object[]{this.f34432a, Float.valueOf(this.b)};
        }

        public float[] c() {
            return (float[]) this.f34432a.clone();
        }

        public float d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return vm.d.a(this.b, this.f34432a);
        }

        public final String toString() {
            return vm.c.a(b(), g.class, "a;b");
        }
    }

    public static final class h extends xt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34433a;
        public final Vibrator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f34434c;

        public h(String str, Vibrator vibrator, float[] fArr) {
            float[] fArr2 = (float[]) fArr.clone();
            this.f34433a = str;
            this.b = vibrator;
            this.f34434c = fArr2;
        }

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f34433a, hVar.f34433a) && Objects.equals(this.b, hVar.b) && Objects.equals(this.f34434c, hVar.f34434c);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f34433a, this.b, this.f34434c};
        }

        public String c() {
            return this.f34433a;
        }

        public float[] d() {
            return (float[]) this.f34434c.clone();
        }

        public Vibrator e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return vm.e.a(this.f34433a, this.b, this.f34434c);
        }

        public final String toString() {
            return vm.c.a(b(), h.class, "a;b;c");
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
        return f.f34431a;
    }

    public void e() {
        int i10 = this.f34425i + 1;
        this.f34425i = i10;
        if (i10 != 1) {
            return;
        }
        Timer timer = new Timer();
        this.f34420d = timer;
        timer.schedule(new e(), 500L);
    }

    public void f() {
        int i10 = this.f34425i - 1;
        this.f34425i = i10;
        if (i10 != 0) {
            return;
        }
        Timer timer = this.f34420d;
        if (timer != null) {
            timer.cancel();
            this.f34420d = null;
        }
        this.f34424h = false;
        q();
    }

    public Map<String, float[]> i() {
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, h>> it = this.f34422f.entrySet().iterator();
        while (it.hasNext()) {
            h value = it.next().getValue();
            map.put(value.c(), value.d());
        }
        return map;
    }

    public final String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, h> entry : this.f34422f.entrySet()) {
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
        return this.f34419c;
    }

    public void l(Context context) {
        if (this.f34419c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.f34421e = n(context);
        } else {
            this.f34421e = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = this.f34421e;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.f34419c = true;
        m(context);
        this.b.add(this.f34418a.subscribeProtocolMethodRequest("HapticProtocol", "SupportsHaptics", new a()));
        this.b.add(this.f34418a.subscribeProtocolMethodRequest("HapticProtocol", "UpdateSingletonVibration", new C0703b()));
        this.b.add(this.f34418a.subscribeProtocolMethodRequest("HapticProtocol", "GetMotors", new c()));
        this.b.add(this.f34418a.subscribeProtocolMethodRequest("HapticProtocol", "SetMotorState", new d()));
        if (bi.h.a().d()) {
            NativeGLInterface.nativeUpdateMobileHapticsState(k(), j());
        }
    }

    public final void m(Context context) {
        Vibrator vibrator;
        VibratorManager vibratorManagerA;
        if (Build.VERSION.SDK_INT >= 31 && (vibratorManagerA = vm.a.a(context.getSystemService("vibrator_manager"))) != null) {
            for (int i10 : vibratorManagerA.getVibratorIds()) {
                Vibrator vibrator2 = vibratorManagerA.getVibrator(i10);
                if (vibrator2 != null && vibrator2.hasVibrator()) {
                    String str = "vibrator_" + i10;
                    this.f34422f.put(str, new h(str, vibrator2, new float[]{0.0f, 0.0f, 0.0f}));
                }
            }
        }
        if (this.f34422f.isEmpty() && (vibrator = this.f34421e) != null && vibrator.hasVibrator()) {
            this.f34422f.put("defaultMotor", new h("defaultMotor", this.f34421e, new float[]{0.0f, 0.0f, 0.0f}));
        }
    }

    @TargetApi(31)
    public final Vibrator n(Context context) {
        VibratorManager vibratorManagerA = vm.a.a(context.getSystemService("vibrator_manager"));
        if (bi.h.a().H4() && vibratorManagerA == null) {
            return null;
        }
        return vibratorManagerA.getDefaultVibrator();
    }

    public final boolean o(Vibrator vibrator, VibrationEffect vibrationEffect) {
        if (vibrator != null && this.f34419c) {
            try {
                if (!vibrator.hasVibrator()) {
                    return false;
                }
                vibrator.vibrate(vibrationEffect);
                return true;
            } catch (IllegalArgumentException e10) {
                q.e("HapticProtocol", "Bad vibration effect: " + e10.getMessage());
                if (!g(vibrator)) {
                    this.f34419c = false;
                }
                return false;
            } catch (SecurityException e11) {
                q.e("HapticProtocol", "No vibration permission: " + e11.getMessage());
                this.f34419c = false;
            } catch (RuntimeException e12) {
                q.e("HapticProtocol", "Runtime crash from vibrator (OEM/HAL): " + e12.getMessage());
                if (!g(vibrator)) {
                    this.f34419c = false;
                }
                return false;
            } catch (Exception e13) {
                q.e("HapticProtocol", "Unexpected vibration exception: " + e13.getMessage());
                this.f34419c = false;
                return false;
            }
        }
        return false;
    }

    public final boolean p(Map<String, g> map) {
        if (!k()) {
            return false;
        }
        Iterator<Map.Entry<String, h>> it = this.f34422f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().e().cancel();
        }
        if (!this.f34424h) {
            return false;
        }
        boolean z10 = true;
        for (Map.Entry<String, g> entry : map.entrySet()) {
            h hVar = this.f34422f.get(entry.getKey());
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
                if (!bi.h.a().H4()) {
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
            this.f34421e.cancel();
            if (this.f34424h && (i10 = (int) (((double) (this.f34423g * 255.0f)) + 0.5d)) != 0) {
                VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{1000}, new int[]{i10}, 0);
                if (bi.h.a().H4()) {
                    o(this.f34421e, vibrationEffectCreateWaveform);
                } else {
                    this.f34421e.vibrate(vibrationEffectCreateWaveform);
                }
            }
        }
    }
}
