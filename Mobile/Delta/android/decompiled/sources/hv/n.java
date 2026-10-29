package hv;

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
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19864a;
    public final f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f19865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f19866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f19868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BluetoothProfile.ServiceListener f19869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BluetoothAdapter f19870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BluetoothHeadset f19871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BluetoothDevice f19872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BroadcastReceiver f19873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AudioDeviceCallback f19874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Runnable f19875m = new Runnable() { // from class: hv.m
        @Override // java.lang.Runnable
        public final void run() {
            this.f19863a.j();
        }
    };

    public class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesAdded");
            if (iv.a.m(audioDeviceInfoArr, true)) {
                n.this.y();
            }
            if (iv.a.m(audioDeviceInfoArr, false) && n.this.f19868f == e.SCO_CONNECTED) {
                Log.d("AppRtcBluetoothMgr", "SCO_CONNECTED state but device in A2DP. Reconnecting...");
                n.this.f19868f = e.HEADSET_AVAILABLE;
                n.this.y();
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesRemoved");
            if (iv.a.m(audioDeviceInfoArr, true)) {
                n.this.z();
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19877a;

        static {
            int[] iArr = new int[e.values().length];
            f19877a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19877a[e.SCO_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19877a[e.SCO_DISCONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19877a[e.HEADSET_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19877a[e.HEADSET_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19877a[e.SCO_CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c extends BroadcastReceiver {
        public void a(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onAudioStateChanged: a=ACTION_AUDIO_STATE_CHANGED, s=" + iv.a.d(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + n.this.f19868f);
            switch (intExtra) {
                case 10:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now disconnected");
                    if (!isInitialStickyBroadcast()) {
                        n.this.x();
                    } else {
                        Log.d("AppRtcBluetoothMgr", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                    }
                    break;
                case 11:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connecting...");
                    break;
                case 12:
                    n.this.w();
                    break;
            }
        }

        public void b(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onConnectionStateChanged: a=ACTION_CONNECTION_STATE_CHANGED, s=" + iv.a.e(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + n.this.f19868f);
            if (intExtra == 0) {
                n.this.z();
            } else {
                if (intExtra != 2) {
                    return;
                }
                n.this.y();
            }
        }

        public void c(Intent intent) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onScoAudioStateUpdate: action=" + intent.getAction() + ", EXTRA_SCO_AUDIO_STATE=" + iv.a.c(intExtra) + ", EXTRA_SCO_AUDIO_PREVIOUS_STATE=" + iv.a.c(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0)) + ", sb=" + isInitialStickyBroadcast() + ", bluetoothState= " + n.this.f19868f);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                }
                n.this.w();
            } else {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                n.this.x();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (n.this.f19868f == e.UNINITIALIZED) {
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
            Log.d("AppRtcBluetoothMgr", "<<< BluetoothHeadsetBroadcastReceiver.onReceive done: BT state=" + n.this.f19868f);
        }

        public c() {
        }
    }

    public class d implements BluetoothProfile.ServiceListener {
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            if (i10 != 1 || n.this.f19868f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceConnected: BT state=" + n.this.f19868f);
            n.this.A((BluetoothHeadset) bluetoothProfile);
            Log.d("AppRtcBluetoothMgr", "onServiceConnected done: BT state=" + n.this.f19868f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 != 1 || n.this.f19868f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceDisconnected: BT state=" + n.this.f19868f);
            n.this.B();
            Log.d("AppRtcBluetoothMgr", "onServiceDisconnected done: BT state=" + n.this.f19868f);
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

    public n(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "ctor");
        iv.a.f();
        this.f19864a = context;
        this.b = fVar;
        this.f19865c = o(context);
        this.f19868f = e.UNINITIALIZED;
        this.f19869g = new d();
        this.f19873k = new c();
        this.f19866d = new Handler(Looper.getMainLooper());
    }

    public static n n(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "create" + iv.a.k());
        return new n(context, fVar);
    }

    public final void A(BluetoothHeadset bluetoothHeadset) {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileConnected");
        this.f19871i = bluetoothHeadset;
        N();
    }

    public final void B() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileDisconnected");
        K();
        this.f19871i = null;
        this.f19872j = null;
        N();
    }

    public final void C() {
        Log.d("AppRtcBluetoothMgr", "registerAudioDeviceCallback");
        if (this.f19874l != null || this.f19865c == null) {
            return;
        }
        a aVar = new a();
        this.f19874l = aVar;
        this.f19865c.registerAudioDeviceCallback(aVar, this.f19866d);
    }

    public Intent D(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.f19864a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void E() {
        iv.a.f();
        Log.d("AppRtcBluetoothMgr", "start");
        Log.d("AppRtcBluetoothMgr", "Starting AppRtcBluetoothManager...");
        AudioManager audioManager = this.f19865c;
        if (audioManager == null) {
            Log.w("AppRtcBluetoothMgr", "audioManager == null");
            return;
        }
        if (this.f19868f != e.UNINITIALIZED) {
            Log.w("AppRtcBluetoothMgr", "Invalid BT state");
            return;
        }
        this.f19871i = null;
        this.f19872j = null;
        this.f19867e = 0;
        if (!audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e("AppRtcBluetoothMgr", "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f19870h = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w("AppRtcBluetoothMgr", "Device does not support Bluetooth");
            return;
        }
        if (!p(this.f19864a, this.f19869g)) {
            Log.e("AppRtcBluetoothMgr", "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        Intent intentD = D(this.f19873k, intentFilter);
        if (intentD != null) {
            Log.d("AppRtcBluetoothMgr", "start: bluetoothHeadsetReceiver registered. receiverIntent.action=" + intentD.getAction() + " receiverIntent.extras=" + intentD.getExtras());
        }
        Log.d("AppRtcBluetoothMgr", "Bluetooth proxy for headset profile has started.");
        if (!k()) {
            C();
        }
        m(e.HEADSET_UNAVAILABLE);
        Log.d("AppRtcBluetoothMgr", "start done: BT state=" + this.f19868f);
    }

    public final void F() {
        AudioManager audioManager = this.f19865c;
        if (audioManager == null) {
            return;
        }
        audioManager.startBluetoothSco();
        this.f19865c.setBluetoothScoOn(true);
    }

    public final boolean G() {
        iv.a.f();
        if (this.f19865c == null) {
            Log.w("AppRtcBluetoothMgr", "startScoAudio: audioManager == null");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "startSco: BT state=" + this.f19868f + ", attempts: " + this.f19867e + ", SCO is on: " + u());
        if (this.f19867e >= 2) {
            Log.e("AppRtcBluetoothMgr", "BT SCO connection fails - no more attempts");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        F();
        this.f19867e++;
        H();
        Log.d("AppRtcBluetoothMgr", "startScoAudio done: BT state=" + this.f19868f + ", SCO is on: " + u());
        return true;
    }

    public final void H() {
        iv.a.f();
        Log.d("AppRtcBluetoothMgr", "startTimer");
        this.f19866d.removeCallbacks(this.f19875m);
        this.f19866d.postDelayed(this.f19875m, 4000L);
    }

    public void I() {
        iv.a.f();
        Log.d("AppRtcBluetoothMgr", "stop: BT state=" + this.f19868f);
        if (this.f19870h == null) {
            return;
        }
        e eVar = this.f19868f;
        e eVar2 = e.UNINITIALIZED;
        if (eVar == eVar2) {
            return;
        }
        L();
        K();
        M(this.f19873k);
        l();
        BluetoothHeadset bluetoothHeadset = this.f19871i;
        if (bluetoothHeadset != null) {
            this.f19870h.closeProfileProxy(1, bluetoothHeadset);
            this.f19871i = null;
        }
        this.f19870h = null;
        this.f19872j = null;
        m(eVar2);
        Log.d("AppRtcBluetoothMgr", "stop done: BT state=" + this.f19868f);
    }

    public final void J() {
        AudioManager audioManager = this.f19865c;
        if (audioManager == null) {
            return;
        }
        audioManager.stopBluetoothSco();
        this.f19865c.setBluetoothScoOn(false);
    }

    public final void K() {
        iv.a.f();
        if (this.f19865c == null) {
            Log.w("AppRtcBluetoothMgr", "stopScoAudio: audioManager == null");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "stopScoAudio: BT state=" + this.f19868f + ", SCO is on: " + u());
        e eVar = this.f19868f;
        if (eVar == e.SCO_CONNECTING || eVar == e.SCO_CONNECTED) {
            l();
            J();
            m(e.SCO_DISCONNECTING);
            Log.d("AppRtcBluetoothMgr", "stopScoAudio done: BT state=" + this.f19868f + ", SCO is on: " + u());
        }
    }

    public final void L() {
        AudioManager audioManager;
        Log.d("AppRtcBluetoothMgr", "unregisterAudioDeviceCallback");
        AudioDeviceCallback audioDeviceCallback = this.f19874l;
        if (audioDeviceCallback == null || (audioManager = this.f19865c) == null) {
            return;
        }
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    public void M(BroadcastReceiver broadcastReceiver) {
        this.f19864a.unregisterReceiver(broadcastReceiver);
    }

    public final synchronized void N() {
        try {
            Log.d("AppRtcBluetoothMgr", "update: bluetoothState=" + this.f19868f);
            e eVar = this.f19868f;
            int i10 = b.f19877a[eVar.ordinal()];
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                eVar = P() ? e.HEADSET_AVAILABLE : e.HEADSET_UNAVAILABLE;
            } else if (i10 == 6 && r()) {
                eVar = e.SCO_CONNECTED;
            }
            if (eVar == e.HEADSET_AVAILABLE && this.f19867e < 2) {
                Log.d("AppRtcBluetoothMgr", "Starting SCO Audio...");
                if (G()) {
                    eVar = e.SCO_CONNECTING;
                }
            }
            if (eVar != this.f19868f) {
                m(eVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void O() {
        iv.a.f();
        Log.d("AppRtcBluetoothMgr", "updateAudioDeviceState");
        v();
        f fVar = this.b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final boolean P() {
        boolean zL = false;
        if (this.f19868f == e.UNINITIALIZED) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: not initialized!");
            return false;
        }
        if (this.f19871i == null) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: bluetoothHeadset is null. bluetoothState=" + this.f19868f);
            return false;
        }
        if (k()) {
            BluetoothDevice bluetoothDeviceJ = iv.a.j("AppRtcBluetoothMgr", this.f19864a, this.f19871i);
            this.f19872j = bluetoothDeviceJ;
            if (bluetoothDeviceJ == null) {
                Log.d("AppRtcBluetoothMgr", "updateDevice: No connected bluetooth headset");
            } else {
                iv.a.t("AppRtcBluetoothMgr", this.f19864a, this.f19871i, bluetoothDeviceJ);
                zL = true;
            }
        } else {
            AudioManager audioManager = this.f19865c;
            if (audioManager != null) {
                iv.a.r("AppRtcBluetoothMgr", audioManager);
                zL = iv.a.l(this.f19865c, false);
                Log.d("AppRtcBluetoothMgr", "updateDevice: permission not granted, bluetoothState=" + this.f19868f);
            }
        }
        Log.d("AppRtcBluetoothMgr", "updateDevice done: hasBluetoothHeadset=" + zL);
        return zL;
    }

    public final void j() {
        boolean zR;
        iv.a.f();
        if (this.f19868f == e.UNINITIALIZED || this.f19871i == null) {
            Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: not initialized! BT state=" + this.f19868f);
            return;
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: BT state=" + this.f19868f + ", attempts: " + this.f19867e + ", SCO is on: " + u());
        if (this.f19868f != e.SCO_CONNECTING) {
            return;
        }
        if (k()) {
            BluetoothDevice bluetoothDeviceI = iv.a.i("AppRtcBluetoothMgr", this.f19864a, this.f19871i);
            this.f19872j = bluetoothDeviceI;
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
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout done: BT state=" + this.f19868f);
    }

    public boolean k() {
        return Build.VERSION.SDK_INT < 31;
    }

    public final void l() {
        iv.a.f();
        Log.d("AppRtcBluetoothMgr", "cancelTimer");
        this.f19866d.removeCallbacks(this.f19875m);
    }

    public final void m(e eVar) {
        if (eVar != this.f19868f) {
            Log.d("AppRtcBluetoothMgr", "Changing state from " + this.f19868f + " to " + eVar);
            this.f19868f = eVar;
            if (eVar != e.UNINITIALIZED) {
                O();
            }
        }
    }

    public AudioManager o(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public boolean p(Context context, BluetoothProfile.ServiceListener serviceListener) {
        BluetoothAdapter bluetoothAdapter = this.f19870h;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.getProfileProxy(context, serviceListener, 1);
    }

    public final e q() {
        iv.a.f();
        return this.f19868f;
    }

    public final boolean r() {
        if (k()) {
            return iv.a.o("AppRtcBluetoothMgr", this.f19864a, this.f19871i, this.f19872j);
        }
        AudioManager audioManager = this.f19865c;
        if (audioManager != null) {
            return iv.a.l(audioManager, true);
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
        AudioManager audioManager = this.f19865c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothScoOn();
    }

    public final void v() {
        Log.d("AppRtcBluetoothMgr", "bluetoothState=" + this.f19868f);
        AudioManager audioManager = this.f19865c;
        if (audioManager != null) {
            iv.a.r("AppRtcBluetoothMgr", audioManager);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothAdapter bluetoothAdapter = this.f19870h;
            if (bluetoothAdapter != null && defaultAdapter != bluetoothAdapter) {
                Log.d("AppRtcBluetoothMgr", "Cached adapter different that default BluetoothAdapter!");
            }
        } else {
            Log.d("AppRtcBluetoothMgr", "Default BluetoothAdapter unavailable!");
        }
        if (Build.VERSION.SDK_INT >= 31 && !iv.a.n(this.f19864a, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d("AppRtcBluetoothMgr", "logBluetoothStatus: BLUETOOTH_CONNECT not granted!");
            return;
        }
        BluetoothHeadset bluetoothHeadset = this.f19871i;
        if (bluetoothHeadset != null) {
            iv.a.s("AppRtcBluetoothMgr", this.f19864a, bluetoothHeadset);
        } else {
            Log.d("AppRtcBluetoothMgr", "No headset connected.");
        }
    }

    public final void w() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected");
        if (this.f19868f == e.SCO_CONNECTED) {
            Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected: Audio already connected. state=" + this.f19868f);
            return;
        }
        l();
        if (this.f19868f != e.SCO_CONNECTING) {
            Log.w("AppRtcBluetoothMgr", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connected");
        this.f19867e = 0;
        N();
    }

    public final void x() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioDisconnected");
        m(e.HEADSET_AVAILABLE);
        this.f19867e = 0;
        N();
    }

    public final void y() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetConnected");
        this.f19867e = 0;
        N();
    }

    public final void z() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetDisconnected");
        K();
        N();
    }
}
