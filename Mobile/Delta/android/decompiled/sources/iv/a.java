package iv;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static String b(int i10) {
        switch (i10) {
            case 0:
                return "TYPE_UNKNOWN";
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
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case 24:
                return "TYPE_BUILTIN_SPEAKER_SAFE";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
            case 26:
                return "TYPE_BLE_HEADSET";
            case 27:
                return "TYPE_BLE_SPEAKER";
            case 28:
            default:
                return "TYPE_INVALID";
            case 29:
                return "TYPE_HDMI_EARC";
        }
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "SCO_AUDIO_STATE_ERROR:";
        }
        if (i10 == 0) {
            return "SCO_AUDIO_STATE_DISCONNECTED";
        }
        if (i10 == 1) {
            return "SCO_AUDIO_STATE_CONNECTED";
        }
        if (i10 == 2) {
            return "SCO_AUDIO_STATE_CONNECTING";
        }
        return "UNKNOWN (" + i10 + ")";
    }

    public static String d(int i10) {
        switch (i10) {
            case 10:
                return "STATE_AUDIO_DISCONNECTED";
            case 11:
                return "STATE_AUDIO_CONNECTING";
            case 12:
                return "STATE_AUDIO_CONNECTED";
            default:
                return "UNKNOWN";
        }
    }

    public static String e(int i10) {
        if (i10 == 0) {
            return "STATE_DISCONNECTED";
        }
        if (i10 == 1) {
            return "STATE_CONNECTING";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "STATE_DISCONNECTING";
        }
        return "STATE_CONNECTED";
    }

    public static void f() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static String g(int i10) {
        if (i10 == -3) {
            return "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        }
        if (i10 == -2) {
            return "AUDIOFOCUS_LOSS_TRANSIENT";
        }
        if (i10 == -1) {
            return "AUDIOFOCUS_LOSS";
        }
        if (i10 == 1) {
            return "AUDIOFOCUS_GAIN";
        }
        if (i10 == 2) {
            return "AUDIOFOCUS_GAIN_TRANSIENT";
        }
        if (i10 != 3) {
            return i10 != 4 ? "AUDIOFOCUS_INVALID" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
        }
        return "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
    }

    public static String h(int i10) {
        if (i10 == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "UNKNOWN" : "AUDIOFOCUS_REQUEST_DELAYED";
        }
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    public static BluetoothDevice i(String str, Context context, @NonNull BluetoothHeadset bluetoothHeadset) {
        if (Build.VERSION.SDK_INT >= 31 && !n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "getAudioConnectedBluetoothDevice: BLUETOOTH_CONNECT not granted!");
            return null;
        }
        BluetoothDevice bluetoothDeviceJ = j(str, context, bluetoothHeadset);
        if (bluetoothDeviceJ == null || !bluetoothHeadset.isAudioConnected(bluetoothDeviceJ)) {
            return null;
        }
        return bluetoothDeviceJ;
    }

    public static BluetoothDevice j(String str, Context context, @NonNull BluetoothHeadset bluetoothHeadset) {
        if (Build.VERSION.SDK_INT >= 31 && !n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "getConnectedBluetoothDevice: BLUETOOTH_CONNECT not granted!");
            return null;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            return null;
        }
        return connectedDevices.get(0);
    }

    public static String k() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    public static boolean l(@NonNull AudioManager audioManager, boolean z10) {
        return m(audioManager.getDevices(2), z10);
    }

    public static boolean m(@NonNull AudioDeviceInfo[] audioDeviceInfoArr, boolean z10) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            boolean z11 = audioDeviceInfo.getType() == 7;
            boolean z12 = audioDeviceInfo.getType() == 8;
            if (z10 && z11) {
                return true;
            }
            if (!z10 && (z12 || z11)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean o(String str, Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        if (bluetoothHeadset == null || bluetoothDevice == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 31 || n(context, "android.permission.BLUETOOTH_CONNECT")) {
            return bluetoothHeadset.isAudioConnected(bluetoothDevice);
        }
        Log.d(str, "isBluetoothAudioConnected: BLUETOOTH_CONNECT not granted!");
        return false;
    }

    public static void p(String str, String str2, AudioDeviceInfo audioDeviceInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("productName=");
        sb2.append(audioDeviceInfo.getProductName());
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
        Log.d(str, sb2.toString());
    }

    public static void q(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Log.d(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            p(str, "  ", audioDeviceInfo);
        }
    }

    public static void r(String str, AudioManager audioManager) {
        Log.d(str, "audioManager: mode=" + v(audioManager.getMode()) + ",isBluetoothScoAvailableOffCall=" + audioManager.isBluetoothScoAvailableOffCall() + ",isBluetoothScoOn=" + audioManager.isBluetoothScoOn());
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
            if (communicationDevice == null) {
                Log.d(str, "No audio device available");
            } else {
                p(str, "communicationDevice: ", communicationDevice);
            }
        }
        q(str, audioManager);
    }

    public static void s(String str, Context context, @NonNull BluetoothHeadset bluetoothHeadset) {
        if (Build.VERSION.SDK_INT >= 31 && !n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "logBluetoothAdapterInfo: BLUETOOTH_CONNECT not granted!");
            return;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            Log.d(str, "No connected bluetooth headset");
            return;
        }
        BluetoothDevice bluetoothDevice = connectedDevices.get(0);
        Log.d(str, "Connected bluetooth headset: name=" + bluetoothDevice.getName() + ", state=" + e(bluetoothHeadset.getConnectionState(bluetoothDevice)) + ", SCO audio=" + bluetoothHeadset.isAudioConnected(bluetoothDevice));
    }

    public static void t(String str, Context context, @NonNull BluetoothHeadset bluetoothHeadset, @NonNull BluetoothDevice bluetoothDevice) {
        if (Build.VERSION.SDK_INT >= 31 && !n(context, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d(str, "logBluetoothAdapterInfo: BLUETOOTH_CONNECT not granted!");
            return;
        }
        Log.d(str, "Connected bluetooth headset: name=" + bluetoothDevice.getName() + ", state=" + e(bluetoothHeadset.getConnectionState(bluetoothDevice)) + ", SCO audio=" + bluetoothHeadset.isAudioConnected(bluetoothDevice));
    }

    public static void u(String str) {
        Log.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    public static String v(int i10) {
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

    public static void w(String str, @NonNull AudioManager audioManager, int i10) {
        try {
            audioManager.setMode(i10);
        } catch (SecurityException e10) {
            Log.e(str, "Cannot set audio mode: " + i10, e10);
        }
    }
}
