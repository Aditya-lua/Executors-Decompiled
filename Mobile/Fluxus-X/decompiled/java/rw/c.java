package rw;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.google.mlkit.common.MlKitException;
import java.util.Arrays;
import java.util.List;
import org.webrtc.Logging;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f31091a = new String[0];
    public static final String[] b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f31092c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f31093d = 16000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f31094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f31095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f31096g;

    public static boolean a() {
        return Arrays.asList(f31091a).contains(Build.MODEL);
    }

    public static String b(int i10) {
        switch (i10) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case MlKitException.UNSUPPORTED /* 18 */:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List<String> c() {
        return Arrays.asList(b);
    }

    public static List<String> d() {
        return Arrays.asList(f31092c);
    }

    public static synchronized int e() {
        return f31093d;
    }

    public static String f() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    public static boolean g() {
        return ow.a.a().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static synchronized boolean h() {
        return f31094e;
    }

    public static void i(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.b(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(b(audioDeviceInfo.getType()));
            sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb2.append("channels=");
                sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb2.append("encodings=");
                sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb2.append("sample rates=");
                sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb2.append(", ");
            }
            sb2.append("id=");
            sb2.append(audioDeviceInfo.getId());
            Logging.b(str, sb2.toString());
        }
    }

    public static void j(String str) {
        m(str);
        AudioManager audioManager = (AudioManager) ow.a.a().getSystemService("audio");
        k(str, audioManager);
        l(str, audioManager);
        i(str, audioManager);
    }

    public static void k(String str, AudioManager audioManager) {
        Logging.b(str, "Audio State: audio mode: " + o(audioManager.getMode()) + ", has mic: " + g() + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    public static void l(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.b(str, "Audio State: ");
        boolean zIsVolumeFixed = audioManager.isVolumeFixed();
        Logging.b(str, "  fixed volume=" + zIsVolumeFixed);
        if (zIsVolumeFixed) {
            return;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  " + q(i11) + ": ");
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i11));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i11));
            n(str, audioManager, i11, sb2);
            Logging.b(str, sb2.toString());
        }
    }

    public static void m(String str) {
        Logging.b(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static void n(String str, AudioManager audioManager, int i10, StringBuilder sb2) {
        sb2.append(", muted=");
        sb2.append(audioManager.isStreamMute(i10));
    }

    public static String o(int i10) {
        if (i10 == 0) {
            return "MODE_NORMAL";
        }
        if (i10 == 1) {
            return "MODE_RINGTONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }

    public static boolean p() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static String q(int i10) {
        if (i10 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i10 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i10 == 2) {
            return "STREAM_RING";
        }
        if (i10 == 3) {
            return "STREAM_MUSIC";
        }
        if (i10 != 4) {
            return i10 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }

    public static synchronized boolean r() {
        try {
            if (f31095f) {
                Logging.d("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC AEC!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f31095f;
    }

    public static synchronized boolean s() {
        try {
            if (f31096g) {
                Logging.d("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC NS!");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f31096g;
    }
}
