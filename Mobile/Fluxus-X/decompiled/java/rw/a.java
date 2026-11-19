package rw;

import android.media.audiofx.AudioEffect;
import android.os.Build;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f31089a = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID b = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AudioEffect.Descriptor[] f31090c;

    public static boolean a() {
        boolean z10 = (!g() || c.r() || d() || f()) ? false : true;
        Logging.b("WebRtcAudioEffects", "canUseAcousticEchoCanceler: " + z10);
        return z10;
    }

    public static boolean b() {
        boolean z10 = (!l() || c.s() || i() || k()) ? false : true;
        Logging.b("WebRtcAudioEffects", "canUseNoiseSuppressor: " + z10);
        return z10;
    }

    public static AudioEffect.Descriptor[] c() {
        AudioEffect.Descriptor[] descriptorArr = f31090c;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        f31090c = descriptorArrQueryEffects;
        return descriptorArrQueryEffects;
    }

    public static boolean d() {
        List<String> listC = c.c();
        String str = Build.MODEL;
        boolean zContains = listC.contains(str);
        if (zContains) {
            Logging.d("WebRtcAudioEffects", str + " is blacklisted for HW AEC usage!");
        }
        return zContains;
    }

    public static boolean e() {
        return h(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean f() {
        for (AudioEffect.Descriptor descriptor : c()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(f31089a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g() {
        return e();
    }

    public static boolean h(UUID uuid) {
        AudioEffect.Descriptor[] descriptorArrC = c();
        if (descriptorArrC == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : descriptorArrC) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i() {
        List<String> listD = c.d();
        String str = Build.MODEL;
        boolean zContains = listD.contains(str);
        if (zContains) {
            Logging.d("WebRtcAudioEffects", str + " is blacklisted for HW NS usage!");
        }
        return zContains;
    }

    public static boolean j() {
        return h(AudioEffect.EFFECT_TYPE_NS);
    }

    public static boolean k() {
        for (AudioEffect.Descriptor descriptor : c()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l() {
        return j();
    }
}
