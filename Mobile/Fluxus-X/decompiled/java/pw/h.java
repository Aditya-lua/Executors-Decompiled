package pw;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29412a;
    public final f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f29413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f29414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f29416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BluetoothProfile.ServiceListener f29417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BluetoothAdapter f29418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BluetoothHeadset f29419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BluetoothDevice f29420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BroadcastReceiver f29421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AudioDeviceCallback f29422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Runnable f29423m = new Runnable() { // from class: pw.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f29411a.j();
        }
    };

    public class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesAdded");
            if (qw.a.m(audioDeviceInfoArr, true)) {
                h.this.y();
            }
            if (qw.a.m(audioDeviceInfoArr, false) && h.this.f29416f == e.SCO_CONNECTED) {
                Log.d("AppRtcBluetoothMgr", "SCO_CONNECTED state but device in A2DP. Reconnecting...");
                h.this.f29416f = e.HEADSET_AVAILABLE;
                h.this.y();
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesRemoved");
            if (qw.a.m(audioDeviceInfoArr, true)) {
                h.this.z();
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29425a;

        static {
            int[] iArr = new int[e.values().length];
            f29425a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29425a[e.SCO_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29425a[e.SCO_DISCONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29425a[e.HEADSET_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29425a[e.HEADSET_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29425a[e.SCO_CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c extends BroadcastReceiver {
        public void a(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onAudioStateChanged: a=ACTION_AUDIO_STATE_CHANGED, s=" + qw.a.d(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + h.this.f29416f);
            switch (intExtra) {
                case 10:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now disconnected");
                    if (!isInitialStickyBroadcast()) {
                        h.this.x();
                    } else {
                        Log.d("AppRtcBluetoothMgr", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                    }
                    break;
                case 11:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connecting...");
                    break;
                case 12:
                    h.this.w();
                    break;
            }
        }

        public void b(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onConnectionStateChanged: a=ACTION_CONNECTION_STATE_CHANGED, s=" + qw.a.e(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + h.this.f29416f);
            if (intExtra == 0) {
                h.this.z();
            } else {
                if (intExtra != 2) {
                    return;
                }
                h.this.y();
            }
        }

        public void c(Intent intent) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onScoAudioStateUpdate: action=" + intent.getAction() + ", EXTRA_SCO_AUDIO_STATE=" + qw.a.c(intExtra) + ", EXTRA_SCO_AUDIO_PREVIOUS_STATE=" + qw.a.c(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0)) + ", sb=" + isInitialStickyBroadcast() + ", bluetoothState= " + h.this.f29416f);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                }
                h.this.w();
            } else {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                h.this.x();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (h.this.f29416f == e.UNINITIALIZED) {
                return;
            }
            String action = intent.getAction();
            Log.d("AppRtcBluetoothMgr", ">>> BluetoothHeadsetBroadcastReceiver.onReceive: action=" + action);
            if (intent.getExtras() != null) {
                Log.d("AppRtcBluetoothMgr", ">>> BluetoothHeadsetBroadcastReceiver.onReceive: extras=" + intent.getExtras().toString());
            }
            action.getClass();
            switch (action) {
                case "android.media.ACTION_SCO_AUDIO_STATE_UPDATED":
                    c(intent);
                    break;
                case "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED":
                    a(intent);
                    break;
                case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                    b(intent);
                    break;
            }
            Log.d("AppRtcBluetoothMgr", "<<< BluetoothHeadsetBroadcastReceiver.onReceive done: BT state=" + h.this.f29416f);
        }

        public c() {
        }
    }

    public class d implements BluetoothProfile.ServiceListener {
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            if (i10 != 1 || h.this.f29416f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceConnected: BT state=" + h.this.f29416f);
            h.this.A((BluetoothHeadset) bluetoothProfile);
            Log.d("AppRtcBluetoothMgr", "onServiceConnected done: BT state=" + h.this.f29416f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 != 1 || h.this.f29416f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceDisconnected: BT state=" + h.this.f29416f);
            h.this.B();
            Log.d("AppRtcBluetoothMgr", "onServiceDisconnected done: BT state=" + h.this.f29416f);
        }

        public d() {
        }
    }

    public enum e {
        UNINITIALIZED,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    public interface f {
        void a();
    }

    public h(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "ctor");
        qw.a.f();
        this.f29412a = context;
        this.b = fVar;
        this.f29413c = o(context);
        this.f29416f = e.UNINITIALIZED;
        this.f29417g = new d();
        this.f29421k = new c();
        this.f29414d = new Handler(Looper.getMainLooper());
    }

    public static h n(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "create" + qw.a.k());
        return new h(context, fVar);
    }

    public final void A(BluetoothHeadset bluetoothHeadset) {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileConnected");
        this.f29419i = bluetoothHeadset;
        N();
    }

    public final void B() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileDisconnected");
        K();
        this.f29419i = null;
        this.f29420j = null;
        N();
    }

    public final void C() {
        Log.d("AppRtcBluetoothMgr", "registerAudioDeviceCallback");
        if (this.f29422l != null || this.f29413c == null) {
            return;
        }
        a aVar = new a();
        this.f29422l = aVar;
        this.f29413c.registerAudioDeviceCallback(aVar, this.f29414d);
    }

    public Intent D(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.f29412a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void E() {
        qw.a.f();
        Log.d("AppRtcBluetoothMgr", "start");
        Log.d("AppRtcBluetoothMgr", "Starting AppRtcBluetoothManager...");
        AudioManager audioManager = this.f29413c;
        if (audioManager == null) {
            Log.w("AppRtcBluetoothMgr", "audioManager == null");
            return;
        }
        if (this.f29416f != e.UNINITIALIZED) {
            Log.w("AppRtcBluetoothMgr", "Invalid BT state");
            return;
        }
        this.f29419i = null;
        this.f29420j = null;
        this.f29415e = 0;
        if (!audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e("AppRtcBluetoothMgr", "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f29418h = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w("AppRtcBluetoothMgr", "Device does not support Bluetooth");
            return;
        }
        if (!p(this.f29412a, this.f29417g)) {
            Log.e("AppRtcBluetoothMgr", "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        Intent intentD = D(this.f29421k, intentFilter);
        if (intentD != null) {
            Log.d("AppRtcBluetoothMgr", "start: bluetoothHeadsetReceiver registered. receiverIntent.action=" + intentD.getAction() + " receiverIntent.extras=" + intentD.getExtras());
        }
        Log.d("AppRtcBluetoothMgr", "Bluetooth proxy for headset profile has started.");
        if (!k()) {
            C();
        }
        m(e.HEADSET_UNAVAILABLE);
        Log.d("AppRtcBluetoothMgr", "start done: BT state=" + this.f29416f);
    }

    public final void F() {
        AudioManager audioManager = this.f29413c;
        if (audioManager == null) {
            return;
        }
        audioManager.startBluetoothSco();
        this.f29413c.setBluetoothScoOn(true);
    }

    public final boolean G() {
        qw.a.f();
        if (this.f29413c == null) {
            Log.w("AppRtcBluetoothMgr", "startScoAudio: audioManager == null");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "startSco: BT state=" + this.f29416f + ", attempts: " + this.f29415e + ", SCO is on: " + u());
        if (this.f29415e >= 2) {
            Log.e("AppRtcBluetoothMgr", "BT SCO connection fails - no more attempts");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        F();
        this.f29415e++;
        H();
        Log.d("AppRtcBluetoothMgr", "startScoAudio done: BT state=" + this.f29416f + ", SCO is on: " + u());
        return true;
    }

    public final void H() {
        qw.a.f();
        Log.d("AppRtcBluetoothMgr", "startTimer");
        this.f29414d.removeCallbacks(this.f29423m);
        this.f29414d.postDelayed(this.f29423m, 4000L);
    }

    public void I() {
        qw.a.f();
        Log.d("AppRtcBluetoothMgr", "stop: BT state=" + this.f29416f);
        if (this.f29418h == null) {
            return;
        }
        e eVar = this.f29416f;
        e eVar2 = e.UNINITIALIZED;
        if (eVar == eVar2) {
            return;
        }
        L();
        K();
        M(this.f29421k);
        l();
        BluetoothHeadset bluetoothHeadset = this.f29419i;
        if (bluetoothHeadset != null) {
            this.f29418h.closeProfileProxy(1, bluetoothHeadset);
            this.f29419i = null;
        }
        this.f29418h = null;
        this.f29420j = null;
        m(eVar2);
        Log.d("AppRtcBluetoothMgr", "stop done: BT state=" + this.f29416f);
    }

    public final void J() {
        AudioManager audioManager = this.f29413c;
        if (audioManager == null) {
            return;
        }
        audioManager.stopBluetoothSco();
        this.f29413c.setBluetoothScoOn(false);
    }

    public final void K() {
        qw.a.f();
        if (this.f29413c == null) {
            Log.w("AppRtcBluetoothMgr", "stopScoAudio: audioManager == null");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "stopScoAudio: BT state=" + this.f29416f + ", SCO is on: " + u());
        e eVar = this.f29416f;
        if (eVar == e.SCO_CONNECTING || eVar == e.SCO_CONNECTED) {
            l();
            J();
            m(e.SCO_DISCONNECTING);
            Log.d("AppRtcBluetoothMgr", "stopScoAudio done: BT state=" + this.f29416f + ", SCO is on: " + u());
        }
    }

    public final void L() {
        AudioManager audioManager;
        Log.d("AppRtcBluetoothMgr", "unregisterAudioDeviceCallback");
        AudioDeviceCallback audioDeviceCallback = this.f29422l;
        if (audioDeviceCallback == null || (audioManager = this.f29413c) == null) {
            return;
        }
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    public void M(BroadcastReceiver broadcastReceiver) {
        this.f29412a.unregisterReceiver(broadcastReceiver);
    }

    public final synchronized void N() {
        try {
            Log.d("AppRtcBluetoothMgr", "update: bluetoothState=" + this.f29416f);
            e eVar = this.f29416f;
            int i10 = b.f29425a[eVar.ordinal()];
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                eVar = P() ? e.HEADSET_AVAILABLE : e.HEADSET_UNAVAILABLE;
            } else if (i10 == 6 && r()) {
                eVar = e.SCO_CONNECTED;
            }
            if (eVar == e.HEADSET_AVAILABLE && this.f29415e < 2) {
                Log.d("AppRtcBluetoothMgr", "Starting SCO Audio...");
                if (G()) {
                    eVar = e.SCO_CONNECTING;
                }
            }
            if (eVar != this.f29416f) {
                m(eVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void O() {
        qw.a.f();
        Log.d("AppRtcBluetoothMgr", "updateAudioDeviceState");
        v();
        f fVar = this.b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final boolean P() {
        boolean zL = false;
        if (this.f29416f == e.UNINITIALIZED) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: not initialized!");
            return false;
        }
        if (this.f29419i == null) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: bluetoothHeadset is null. bluetoothState=" + this.f29416f);
            return false;
        }
        if (k()) {
            BluetoothDevice bluetoothDeviceJ = qw.a.j("AppRtcBluetoothMgr", this.f29412a, this.f29419i);
            this.f29420j = bluetoothDeviceJ;
            if (bluetoothDeviceJ == null) {
                Log.d("AppRtcBluetoothMgr", "updateDevice: No connected bluetooth headset");
            } else {
                qw.a.t("AppRtcBluetoothMgr", this.f29412a, this.f29419i, bluetoothDeviceJ);
                zL = true;
            }
        } else {
            AudioManager audioManager = this.f29413c;
            if (audioManager != null) {
                qw.a.r("AppRtcBluetoothMgr", audioManager);
                zL = qw.a.l(this.f29413c, false);
                Log.d("AppRtcBluetoothMgr", "updateDevice: permission not granted, bluetoothState=" + this.f29416f);
            }
        }
        Log.d("AppRtcBluetoothMgr", "updateDevice done: hasBluetoothHeadset=" + zL);
        return zL;
    }

    public final void j() {
        boolean zR;
        qw.a.f();
        if (this.f29416f == e.UNINITIALIZED || this.f29419i == null) {
            Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: not initialized! BT state=" + this.f29416f);
            return;
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: BT state=" + this.f29416f + ", attempts: " + this.f29415e + ", SCO is on: " + u());
        if (this.f29416f != e.SCO_CONNECTING) {
            return;
        }
        if (k()) {
            BluetoothDevice bluetoothDeviceI = qw.a.i("AppRtcBluetoothMgr", this.f29412a, this.f29419i);
            this.f29420j = bluetoothDeviceI;
            zR = bluetoothDeviceI != null;
        } else {
            zR = r();
        }
        if (zR) {
            w();
        } else {
            Log.w("AppRtcBluetoothMgr", "BT failed to connect after timeout");
            K();
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout done: BT state=" + this.f29416f);
    }

    public boolean k() {
        return Build.VERSION.SDK_INT < 31;
    }

    public final void l() {
        qw.a.f();
        Log.d("AppRtcBluetoothMgr", "cancelTimer");
        this.f29414d.removeCallbacks(this.f29423m);
    }

    public final void m(e eVar) {
        if (eVar != this.f29416f) {
            Log.d("AppRtcBluetoothMgr", "Changing state from " + this.f29416f + " to " + eVar);
            this.f29416f = eVar;
            if (eVar != e.UNINITIALIZED) {
                O();
            }
        }
    }

    public AudioManager o(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public boolean p(Context context, BluetoothProfile.ServiceListener serviceListener) {
        BluetoothAdapter bluetoothAdapter = this.f29418h;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.getProfileProxy(context, serviceListener, 1);
    }

    public final e q() {
        qw.a.f();
        return this.f29416f;
    }

    public final boolean r() {
        if (k()) {
            return qw.a.o("AppRtcBluetoothMgr", this.f29412a, this.f29419i, this.f29420j);
        }
        AudioManager audioManager = this.f29413c;
        if (audioManager != null) {
            return qw.a.l(audioManager, true);
        }
        return false;
    }

    public boolean s() {
        return q() == e.SCO_CONNECTED || q() == e.SCO_CONNECTING || q() == e.HEADSET_AVAILABLE;
    }

    public boolean t() {
        return q() == e.SCO_CONNECTED;
    }

    public final boolean u() {
        AudioManager audioManager = this.f29413c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothScoOn();
    }

    public final void v() {
        Log.d("AppRtcBluetoothMgr", "bluetoothState=" + this.f29416f);
        AudioManager audioManager = this.f29413c;
        if (audioManager != null) {
            qw.a.r("AppRtcBluetoothMgr", audioManager);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothAdapter bluetoothAdapter = this.f29418h;
            if (bluetoothAdapter != null && defaultAdapter != bluetoothAdapter) {
                Log.d("AppRtcBluetoothMgr", "Cached adapter different that default BluetoothAdapter!");
            }
        } else {
            Log.d("AppRtcBluetoothMgr", "Default BluetoothAdapter unavailable!");
        }
        if (Build.VERSION.SDK_INT >= 31 && !qw.a.n(this.f29412a, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d("AppRtcBluetoothMgr", "logBluetoothStatus: BLUETOOTH_CONNECT not granted!");
            return;
        }
        BluetoothHeadset bluetoothHeadset = this.f29419i;
        if (bluetoothHeadset != null) {
            qw.a.s("AppRtcBluetoothMgr", this.f29412a, bluetoothHeadset);
        } else {
            Log.d("AppRtcBluetoothMgr", "No headset connected.");
        }
    }

    public final void w() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected");
        if (this.f29416f == e.SCO_CONNECTED) {
            Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected: Audio already connected. state=" + this.f29416f);
            return;
        }
        l();
        if (this.f29416f != e.SCO_CONNECTING) {
            Log.w("AppRtcBluetoothMgr", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connected");
        this.f29415e = 0;
        N();
    }

    public final void x() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioDisconnected");
        m(e.HEADSET_AVAILABLE);
        this.f29415e = 0;
        N();
    }

    public final void y() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetConnected");
        this.f29415e = 0;
        N();
    }

    public final void z() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetDisconnected");
        K();
        N();
    }
}
