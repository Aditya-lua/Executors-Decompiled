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
import gt.AbstractC6240a;
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
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: renamed from: hm.b */
/* JADX INFO: loaded from: classes2.dex */
public class C6426b {

    /* JADX INFO: renamed from: a */
    public MessageBus f24353a = MessageBus.m16016f();

    /* JADX INFO: renamed from: b */
    public ArrayList<Connection> f24354b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public boolean f24355c = false;

    /* JADX INFO: renamed from: d */
    public Timer f24356d = null;

    /* JADX INFO: renamed from: e */
    public Vibrator f24357e = null;

    /* JADX INFO: renamed from: f */
    public Map<String, h> f24358f = new HashMap();

    /* JADX INFO: renamed from: g */
    public float f24359g = 0.0f;

    /* JADX INFO: renamed from: h */
    public boolean f24360h = true;

    /* JADX INFO: renamed from: i */
    public int f24361i = 0;

    /* JADX INFO: renamed from: hm.b$a */
    public class a implements Callback {
        public a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            boolean zM28016k = C6426b.this.m28016k();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("supportsHaptics", zM28016k);
                C6426b.this.f24353a.publishProtocolMethodResponseRaw("HapticProtocol", "SupportsHaptics", jSONObject2.toString(), 0, "{}");
            } catch (JSONException unused) {
                C6124q.m27060e("HapticProtocol", "Failed to write supportsHaptics in response to SupportsHaptics request");
            }
        }
    }

    /* JADX INFO: renamed from: hm.b$b */
    public class b implements Callback {
        public b() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            try {
                C6426b.this.f24359g = Float.valueOf(jSONObject.getString("intensity")).floatValue();
                C6426b.this.m28022q();
            } catch (JSONException unused) {
                C6124q.m27060e("HapticProtocol", "Failed to parse JSON in UpdateSingletonVibration request");
            }
        }
    }

    /* JADX INFO: renamed from: hm.b$c */
    public class c implements Callback {
        public c() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (Map.Entry<String, float[]> entry : C6426b.this.m28014i().entrySet()) {
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
                C6124q.m27060e("HapticProtocol", "Exception while handling GetMotors request: " + e10.getMessage());
            }
            C6426b.this.f24353a.publishProtocolMethodResponseRaw("HapticProtocol", "GetMotors", jSONObject2.toString(), 0, "{}");
        }
    }

    /* JADX INFO: renamed from: hm.b$d */
    public class d implements Callback {
        public d() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
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
                C6426b.this.m28021p(map);
            } catch (JSONException e10) {
                C6124q.m27060e("HapticProtocol", "Exception while handling SetMotorState request: " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: hm.b$e */
    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C6426b.this.f24360h = true;
            C6426b.this.m28022q();
        }
    }

    /* JADX INFO: renamed from: hm.b$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public static C6426b f24367a = new C6426b();
    }

    /* JADX INFO: renamed from: hm.b$g */
    public static final class g extends AbstractC6240a {

        /* JADX INFO: renamed from: a */
        public final float[] f24368a;

        /* JADX INFO: renamed from: b */
        public final float f24369b;

        public g(float[] fArr, float f10) {
            this.f24368a = (float[]) fArr.clone();
            this.f24369b = f10;
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean m28024a(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f24369b == gVar.f24369b && Objects.equals(this.f24368a, gVar.f24368a);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object[] m28025b() {
            return new Object[]{this.f24368a, Float.valueOf(this.f24369b)};
        }

        /* JADX INFO: renamed from: c */
        public float[] m28026c() {
            return (float[]) this.f24368a.clone();
        }

        /* JADX INFO: renamed from: d */
        public float m28027d() {
            return this.f24369b;
        }

        public final boolean equals(Object obj) {
            return m28024a(obj);
        }

        public final int hashCode() {
            return C6428d.m28034a(this.f24369b, this.f24368a);
        }

        public final String toString() {
            return C6427c.m28033a(m28025b(), g.class, "a;b");
        }
    }

    /* JADX INFO: renamed from: hm.b$h */
    public static final class h extends AbstractC6240a {

        /* JADX INFO: renamed from: a */
        public final String f24370a;

        /* JADX INFO: renamed from: b */
        public final Vibrator f24371b;

        /* JADX INFO: renamed from: c */
        public final float[] f24372c;

        public h(String str, Vibrator vibrator, float[] fArr) {
            float[] fArr2 = (float[]) fArr.clone();
            this.f24370a = str;
            this.f24371b = vibrator;
            this.f24372c = fArr2;
        }

        /* JADX INFO: renamed from: a */
        private /* synthetic */ boolean m28028a(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f24370a, hVar.f24370a) && Objects.equals(this.f24371b, hVar.f24371b) && Objects.equals(this.f24372c, hVar.f24372c);
        }

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object[] m28029b() {
            return new Object[]{this.f24370a, this.f24371b, this.f24372c};
        }

        /* JADX INFO: renamed from: c */
        public String m28030c() {
            return this.f24370a;
        }

        /* JADX INFO: renamed from: d */
        public float[] m28031d() {
            return (float[]) this.f24372c.clone();
        }

        /* JADX INFO: renamed from: e */
        public Vibrator m28032e() {
            return this.f24371b;
        }

        public final boolean equals(Object obj) {
            return m28028a(obj);
        }

        public final int hashCode() {
            return C6429e.m28035a(this.f24370a, this.f24371b, this.f24372c);
        }

        public final String toString() {
            return C6427c.m28033a(m28029b(), h.class, "a;b;c");
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m28010g(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                vibrator.vibrate(VibrationEffect.createPredefined(0));
                return true;
            } catch (Exception e10) {
                C6124q.m27060e("HapticProtocol", "Fallback VibrationEffect failed: " + e10.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static C6426b m28011h() {
        return f.f24367a;
    }

    /* JADX INFO: renamed from: e */
    public void m28012e() {
        int i10 = this.f24361i + 1;
        this.f24361i = i10;
        if (i10 != 1) {
            return;
        }
        Timer timer = new Timer();
        this.f24356d = timer;
        timer.schedule(new e(), 500L);
    }

    /* JADX INFO: renamed from: f */
    public void m28013f() {
        int i10 = this.f24361i - 1;
        this.f24361i = i10;
        if (i10 != 0) {
            return;
        }
        Timer timer = this.f24356d;
        if (timer != null) {
            timer.cancel();
            this.f24356d = null;
        }
        this.f24360h = false;
        m28022q();
    }

    /* JADX INFO: renamed from: i */
    public Map<String, float[]> m28014i() {
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, h>> it = this.f24358f.entrySet().iterator();
        while (it.hasNext()) {
            h value = it.next().getValue();
            map.put(value.m28030c(), value.m28031d());
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public final String m28015j() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, h> entry : this.f24358f.entrySet()) {
                String key = entry.getKey();
                float[] fArrM28031d = entry.getValue().m28031d();
                if (fArrM28031d.length == 3) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", fArrM28031d[0]);
                    jSONObject2.put("y", fArrM28031d[1]);
                    jSONObject2.put("z", fArrM28031d[2]);
                    jSONObject.put(key, jSONObject2);
                }
            }
        } catch (JSONException e10) {
            C6124q.m27060e("HapticProtocol", "Exception while handling GetMotorsJSONString request: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: k */
    public boolean m28016k() {
        return this.f24355c;
    }

    /* JADX INFO: renamed from: l */
    public void m28017l(Context context) {
        if (this.f24355c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.f24357e = m28019n(context);
        } else {
            this.f24357e = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = this.f24357e;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.f24355c = true;
        m28018m(context);
        this.f24354b.add(this.f24353a.m16033w("HapticProtocol", "SupportsHaptics", new a()));
        this.f24354b.add(this.f24353a.m16033w("HapticProtocol", "UpdateSingletonVibration", new b()));
        this.f24354b.add(this.f24353a.m16033w("HapticProtocol", "GetMotors", new c()));
        this.f24354b.add(this.f24353a.m16033w("HapticProtocol", "SetMotorState", new d()));
        if (C11659h.m43403a().mo43608d()) {
            NativeGLInterface.nativeUpdateMobileHapticsState(m28016k(), m28015j());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m28018m(Context context) {
        Vibrator vibrator;
        VibratorManager vibratorManagerM28005a;
        if (Build.VERSION.SDK_INT >= 31 && (vibratorManagerM28005a = C6425a.m28005a(context.getSystemService("vibrator_manager"))) != null) {
            for (int i10 : vibratorManagerM28005a.getVibratorIds()) {
                Vibrator vibrator2 = vibratorManagerM28005a.getVibrator(i10);
                if (vibrator2 != null && vibrator2.hasVibrator()) {
                    String str = "vibrator_" + i10;
                    this.f24358f.put(str, new h(str, vibrator2, new float[]{0.0f, 0.0f, 0.0f}));
                }
            }
        }
        if (this.f24358f.isEmpty() && (vibrator = this.f24357e) != null && vibrator.hasVibrator()) {
            this.f24358f.put("defaultMotor", new h("defaultMotor", this.f24357e, new float[]{0.0f, 0.0f, 0.0f}));
        }
    }

    @TargetApi(31)
    /* JADX INFO: renamed from: n */
    public final Vibrator m28019n(Context context) {
        VibratorManager vibratorManagerM28005a = C6425a.m28005a(context.getSystemService("vibrator_manager"));
        if (C11659h.m43403a().mo43769z4() && vibratorManagerM28005a == null) {
            return null;
        }
        return vibratorManagerM28005a.getDefaultVibrator();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m28020o(Vibrator vibrator, VibrationEffect vibrationEffect) {
        if (vibrator != null && this.f24355c) {
            try {
                if (!vibrator.hasVibrator()) {
                    return false;
                }
                vibrator.vibrate(vibrationEffect);
                return true;
            } catch (IllegalArgumentException e10) {
                C6124q.m27060e("HapticProtocol", "Bad vibration effect: " + e10.getMessage());
                if (!m28010g(vibrator)) {
                    this.f24355c = false;
                }
                return false;
            } catch (SecurityException e11) {
                C6124q.m27060e("HapticProtocol", "No vibration permission: " + e11.getMessage());
                this.f24355c = false;
            } catch (RuntimeException e12) {
                C6124q.m27060e("HapticProtocol", "Runtime crash from vibrator (OEM/HAL): " + e12.getMessage());
                if (!m28010g(vibrator)) {
                    this.f24355c = false;
                }
                return false;
            } catch (Exception e13) {
                C6124q.m27060e("HapticProtocol", "Unexpected vibration exception: " + e13.getMessage());
                this.f24355c = false;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m28021p(Map<String, g> map) {
        if (!m28016k()) {
            return false;
        }
        Iterator<Map.Entry<String, h>> it = this.f24358f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m28032e().cancel();
        }
        if (!this.f24360h) {
            return false;
        }
        boolean z10 = true;
        for (Map.Entry<String, g> entry : map.entrySet()) {
            h hVar = this.f24358f.get(entry.getKey());
            if (hVar != null) {
                Vibrator vibratorM28032e = hVar.m28032e();
                g value = entry.getValue();
                float fM28027d = value.m28027d();
                float[] fArrM28026c = value.m28026c();
                int length = fArrM28026c.length;
                long[] jArr = new long[length];
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = (long) fM28027d;
                    iArr[i10] = (int) (((double) (fArrM28026c[i10] * 255.0f)) + 0.5d);
                }
                VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
                if (!C11659h.m43403a().mo43769z4()) {
                    vibratorM28032e.vibrate(vibrationEffectCreateWaveform);
                } else if (!m28020o(vibratorM28032e, vibrationEffectCreateWaveform)) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    /* JADX INFO: renamed from: q */
    public void m28022q() {
        int i10;
        if (m28016k()) {
            this.f24357e.cancel();
            if (this.f24360h && (i10 = (int) (((double) (this.f24359g * 255.0f)) + 0.5d)) != 0) {
                VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{1000}, new int[]{i10}, 0);
                if (C11659h.m43403a().mo43769z4()) {
                    m28020o(this.f24357e, vibrationEffectCreateWaveform);
                } else {
                    this.f24357e.vibrate(vibrationEffectCreateWaveform);
                }
            }
        }
    }
}
