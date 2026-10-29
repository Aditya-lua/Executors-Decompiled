package p180hv;

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
import p202iv.C6990a;

/* JADX INFO: renamed from: hv.h */
/* JADX INFO: loaded from: classes2.dex */
public class C6587h {

    /* JADX INFO: renamed from: a */
    public final Context f24981a;

    /* JADX INFO: renamed from: b */
    public final f f24982b;

    /* JADX INFO: renamed from: c */
    public final AudioManager f24983c;

    /* JADX INFO: renamed from: d */
    public final Handler f24984d;

    /* JADX INFO: renamed from: e */
    public int f24985e;

    /* JADX INFO: renamed from: f */
    public e f24986f;

    /* JADX INFO: renamed from: g */
    public final BluetoothProfile.ServiceListener f24987g;

    /* JADX INFO: renamed from: h */
    public BluetoothAdapter f24988h;

    /* JADX INFO: renamed from: i */
    public BluetoothHeadset f24989i;

    /* JADX INFO: renamed from: j */
    public BluetoothDevice f24990j;

    /* JADX INFO: renamed from: k */
    public final BroadcastReceiver f24991k;

    /* JADX INFO: renamed from: l */
    public AudioDeviceCallback f24992l;

    /* JADX INFO: renamed from: m */
    public final Runnable f24993m = new Runnable() { // from class: hv.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f24980a.m28483j();
        }
    };

    /* JADX INFO: renamed from: hv.h$a */
    public class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesAdded");
            if (C6990a.m29413m(audioDeviceInfoArr, true)) {
                C6587h.this.m28497y();
            }
            if (C6990a.m29413m(audioDeviceInfoArr, false) && C6587h.this.f24986f == e.SCO_CONNECTED) {
                Log.d("AppRtcBluetoothMgr", "SCO_CONNECTED state but device in A2DP. Reconnecting...");
                C6587h.this.f24986f = e.HEADSET_AVAILABLE;
                C6587h.this.m28497y();
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesRemoved");
            if (C6990a.m29413m(audioDeviceInfoArr, true)) {
                C6587h.this.m28498z();
            }
        }
    }

    /* JADX INFO: renamed from: hv.h$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24995a;

        static {
            int[] iArr = new int[e.values().length];
            f24995a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24995a[e.SCO_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24995a[e.SCO_DISCONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24995a[e.HEADSET_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24995a[e.HEADSET_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24995a[e.SCO_CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: hv.h$c */
    public class c extends BroadcastReceiver {
        /* JADX INFO: renamed from: a */
        public void m28499a(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onAudioStateChanged: a=ACTION_AUDIO_STATE_CHANGED, s=" + C6990a.m29404d(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + C6587h.this.f24986f);
            switch (intExtra) {
                case 10:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now disconnected");
                    if (!isInitialStickyBroadcast()) {
                        C6587h.this.m28496x();
                    } else {
                        Log.d("AppRtcBluetoothMgr", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                    }
                    break;
                case 11:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connecting...");
                    break;
                case 12:
                    C6587h.this.m28495w();
                    break;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m28500b(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onConnectionStateChanged: a=ACTION_CONNECTION_STATE_CHANGED, s=" + C6990a.m29405e(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + C6587h.this.f24986f);
            if (intExtra == 0) {
                C6587h.this.m28498z();
            } else {
                if (intExtra != 2) {
                    return;
                }
                C6587h.this.m28497y();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m28501c(Intent intent) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onScoAudioStateUpdate: action=" + intent.getAction() + ", EXTRA_SCO_AUDIO_STATE=" + C6990a.m29403c(intExtra) + ", EXTRA_SCO_AUDIO_PREVIOUS_STATE=" + C6990a.m29403c(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0)) + ", sb=" + isInitialStickyBroadcast() + ", bluetoothState= " + C6587h.this.f24986f);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                }
                C6587h.this.m28495w();
            } else {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C6587h.this.m28496x();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C6587h.this.f24986f == e.UNINITIALIZED) {
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
                    m28501c(intent);
                    break;
                case "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED":
                    m28499a(intent);
                    break;
                case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                    m28500b(intent);
                    break;
            }
            Log.d("AppRtcBluetoothMgr", "<<< BluetoothHeadsetBroadcastReceiver.onReceive done: BT state=" + C6587h.this.f24986f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: hv.h$d */
    public class d implements BluetoothProfile.ServiceListener {
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            if (i10 != 1 || C6587h.this.f24986f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceConnected: BT state=" + C6587h.this.f24986f);
            C6587h.this.m28467A((BluetoothHeadset) bluetoothProfile);
            Log.d("AppRtcBluetoothMgr", "onServiceConnected done: BT state=" + C6587h.this.f24986f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 != 1 || C6587h.this.f24986f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceDisconnected: BT state=" + C6587h.this.f24986f);
            C6587h.this.m28468B();
            Log.d("AppRtcBluetoothMgr", "onServiceDisconnected done: BT state=" + C6587h.this.f24986f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d() {
        }
    }

    /* JADX INFO: renamed from: hv.h$e */
    public enum e {
        UNINITIALIZED,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    /* JADX INFO: renamed from: hv.h$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo28435a();
    }

    public C6587h(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "ctor");
        C6990a.m29406f();
        this.f24981a = context;
        this.f24982b = fVar;
        this.f24983c = m28487o(context);
        this.f24986f = e.UNINITIALIZED;
        this.f24987g = new d();
        this.f24991k = new c();
        this.f24984d = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: n */
    public static C6587h m28466n(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "create" + C6990a.m29411k());
        return new C6587h(context, fVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m28467A(BluetoothHeadset bluetoothHeadset) {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileConnected");
        this.f24989i = bluetoothHeadset;
        m28480N();
    }

    /* JADX INFO: renamed from: B */
    public final void m28468B() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileDisconnected");
        m28477K();
        this.f24989i = null;
        this.f24990j = null;
        m28480N();
    }

    /* JADX INFO: renamed from: C */
    public final void m28469C() {
        Log.d("AppRtcBluetoothMgr", "registerAudioDeviceCallback");
        if (this.f24992l != null || this.f24983c == null) {
            return;
        }
        a aVar = new a();
        this.f24992l = aVar;
        this.f24983c.registerAudioDeviceCallback(aVar, this.f24984d);
    }

    /* JADX INFO: renamed from: D */
    public Intent m28470D(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.f24981a.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: E */
    public void m28471E() {
        C6990a.m29406f();
        Log.d("AppRtcBluetoothMgr", "start");
        Log.d("AppRtcBluetoothMgr", "Starting AppRtcBluetoothManager...");
        AudioManager audioManager = this.f24983c;
        if (audioManager == null) {
            Log.w("AppRtcBluetoothMgr", "audioManager == null");
            return;
        }
        if (this.f24986f != e.UNINITIALIZED) {
            Log.w("AppRtcBluetoothMgr", "Invalid BT state");
            return;
        }
        this.f24989i = null;
        this.f24990j = null;
        this.f24985e = 0;
        if (!audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e("AppRtcBluetoothMgr", "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f24988h = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w("AppRtcBluetoothMgr", "Device does not support Bluetooth");
            return;
        }
        if (!m28488p(this.f24981a, this.f24987g)) {
            Log.e("AppRtcBluetoothMgr", "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        Intent intentM28470D = m28470D(this.f24991k, intentFilter);
        if (intentM28470D != null) {
            Log.d("AppRtcBluetoothMgr", "start: bluetoothHeadsetReceiver registered. receiverIntent.action=" + intentM28470D.getAction() + " receiverIntent.extras=" + intentM28470D.getExtras());
        }
        Log.d("AppRtcBluetoothMgr", "Bluetooth proxy for headset profile has started.");
        if (!m28484k()) {
            m28469C();
        }
        m28486m(e.HEADSET_UNAVAILABLE);
        Log.d("AppRtcBluetoothMgr", "start done: BT state=" + this.f24986f);
    }

    /* JADX INFO: renamed from: F */
    public final void m28472F() {
        AudioManager audioManager = this.f24983c;
        if (audioManager == null) {
            return;
        }
        audioManager.startBluetoothSco();
        this.f24983c.setBluetoothScoOn(true);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m28473G() {
        C6990a.m29406f();
        if (this.f24983c == null) {
            Log.w("AppRtcBluetoothMgr", "startScoAudio: audioManager == null");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "startSco: BT state=" + this.f24986f + ", attempts: " + this.f24985e + ", SCO is on: " + m28493u());
        if (this.f24985e >= 2) {
            Log.e("AppRtcBluetoothMgr", "BT SCO connection fails - no more attempts");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        m28472F();
        this.f24985e++;
        m28474H();
        Log.d("AppRtcBluetoothMgr", "startScoAudio done: BT state=" + this.f24986f + ", SCO is on: " + m28493u());
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final void m28474H() {
        C6990a.m29406f();
        Log.d("AppRtcBluetoothMgr", "startTimer");
        this.f24984d.removeCallbacks(this.f24993m);
        this.f24984d.postDelayed(this.f24993m, 4000L);
    }

    /* JADX INFO: renamed from: I */
    public void m28475I() {
        C6990a.m29406f();
        Log.d("AppRtcBluetoothMgr", "stop: BT state=" + this.f24986f);
        if (this.f24988h == null) {
            return;
        }
        e eVar = this.f24986f;
        e eVar2 = e.UNINITIALIZED;
        if (eVar == eVar2) {
            return;
        }
        m28478L();
        m28477K();
        m28479M(this.f24991k);
        m28485l();
        BluetoothHeadset bluetoothHeadset = this.f24989i;
        if (bluetoothHeadset != null) {
            this.f24988h.closeProfileProxy(1, bluetoothHeadset);
            this.f24989i = null;
        }
        this.f24988h = null;
        this.f24990j = null;
        m28486m(eVar2);
        Log.d("AppRtcBluetoothMgr", "stop done: BT state=" + this.f24986f);
    }

    /* JADX INFO: renamed from: J */
    public final void m28476J() {
        AudioManager audioManager = this.f24983c;
        if (audioManager == null) {
            return;
        }
        audioManager.stopBluetoothSco();
        this.f24983c.setBluetoothScoOn(false);
    }

    /* JADX INFO: renamed from: K */
    public final void m28477K() {
        C6990a.m29406f();
        if (this.f24983c == null) {
            Log.w("AppRtcBluetoothMgr", "stopScoAudio: audioManager == null");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "stopScoAudio: BT state=" + this.f24986f + ", SCO is on: " + m28493u());
        e eVar = this.f24986f;
        if (eVar == e.SCO_CONNECTING || eVar == e.SCO_CONNECTED) {
            m28485l();
            m28476J();
            m28486m(e.SCO_DISCONNECTING);
            Log.d("AppRtcBluetoothMgr", "stopScoAudio done: BT state=" + this.f24986f + ", SCO is on: " + m28493u());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m28478L() {
        AudioManager audioManager;
        Log.d("AppRtcBluetoothMgr", "unregisterAudioDeviceCallback");
        AudioDeviceCallback audioDeviceCallback = this.f24992l;
        if (audioDeviceCallback == null || (audioManager = this.f24983c) == null) {
            return;
        }
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    /* JADX INFO: renamed from: M */
    public void m28479M(BroadcastReceiver broadcastReceiver) {
        this.f24981a.unregisterReceiver(broadcastReceiver);
    }

    /* JADX INFO: renamed from: N */
    public final synchronized void m28480N() {
        try {
            Log.d("AppRtcBluetoothMgr", "update: bluetoothState=" + this.f24986f);
            e eVar = this.f24986f;
            int i10 = b.f24995a[eVar.ordinal()];
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                eVar = m28482P() ? e.HEADSET_AVAILABLE : e.HEADSET_UNAVAILABLE;
            } else if (i10 == 6 && m28490r()) {
                eVar = e.SCO_CONNECTED;
            }
            if (eVar == e.HEADSET_AVAILABLE && this.f24985e < 2) {
                Log.d("AppRtcBluetoothMgr", "Starting SCO Audio...");
                if (m28473G()) {
                    eVar = e.SCO_CONNECTING;
                }
            }
            if (eVar != this.f24986f) {
                m28486m(eVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m28481O() {
        C6990a.m29406f();
        Log.d("AppRtcBluetoothMgr", "updateAudioDeviceState");
        m28494v();
        f fVar = this.f24982b;
        if (fVar != null) {
            fVar.mo28435a();
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m28482P() {
        boolean zM29412l = false;
        if (this.f24986f == e.UNINITIALIZED) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: not initialized!");
            return false;
        }
        if (this.f24989i == null) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: bluetoothHeadset is null. bluetoothState=" + this.f24986f);
            return false;
        }
        if (m28484k()) {
            BluetoothDevice bluetoothDeviceM29410j = C6990a.m29410j("AppRtcBluetoothMgr", this.f24981a, this.f24989i);
            this.f24990j = bluetoothDeviceM29410j;
            if (bluetoothDeviceM29410j == null) {
                Log.d("AppRtcBluetoothMgr", "updateDevice: No connected bluetooth headset");
            } else {
                C6990a.m29420t("AppRtcBluetoothMgr", this.f24981a, this.f24989i, bluetoothDeviceM29410j);
                zM29412l = true;
            }
        } else {
            AudioManager audioManager = this.f24983c;
            if (audioManager != null) {
                C6990a.m29418r("AppRtcBluetoothMgr", audioManager);
                zM29412l = C6990a.m29412l(this.f24983c, false);
                Log.d("AppRtcBluetoothMgr", "updateDevice: permission not granted, bluetoothState=" + this.f24986f);
            }
        }
        Log.d("AppRtcBluetoothMgr", "updateDevice done: hasBluetoothHeadset=" + zM29412l);
        return zM29412l;
    }

    /* JADX INFO: renamed from: j */
    public final void m28483j() {
        boolean zM28490r;
        C6990a.m29406f();
        if (this.f24986f == e.UNINITIALIZED || this.f24989i == null) {
            Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: not initialized! BT state=" + this.f24986f);
            return;
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: BT state=" + this.f24986f + ", attempts: " + this.f24985e + ", SCO is on: " + m28493u());
        if (this.f24986f != e.SCO_CONNECTING) {
            return;
        }
        if (m28484k()) {
            BluetoothDevice bluetoothDeviceM29409i = C6990a.m29409i("AppRtcBluetoothMgr", this.f24981a, this.f24989i);
            this.f24990j = bluetoothDeviceM29409i;
            zM28490r = bluetoothDeviceM29409i != null;
        } else {
            zM28490r = m28490r();
        }
        if (zM28490r) {
            m28495w();
        } else {
            Log.w("AppRtcBluetoothMgr", "BT failed to connect after timeout");
            m28477K();
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout done: BT state=" + this.f24986f);
    }

    /* JADX INFO: renamed from: k */
    public boolean m28484k() {
        return Build.VERSION.SDK_INT < 31;
    }

    /* JADX INFO: renamed from: l */
    public final void m28485l() {
        C6990a.m29406f();
        Log.d("AppRtcBluetoothMgr", "cancelTimer");
        this.f24984d.removeCallbacks(this.f24993m);
    }

    /* JADX INFO: renamed from: m */
    public final void m28486m(e eVar) {
        if (eVar != this.f24986f) {
            Log.d("AppRtcBluetoothMgr", "Changing state from " + this.f24986f + " to " + eVar);
            this.f24986f = eVar;
            if (eVar != e.UNINITIALIZED) {
                m28481O();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public AudioManager m28487o(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: renamed from: p */
    public boolean m28488p(Context context, BluetoothProfile.ServiceListener serviceListener) {
        BluetoothAdapter bluetoothAdapter = this.f24988h;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.getProfileProxy(context, serviceListener, 1);
    }

    /* JADX INFO: renamed from: q */
    public final e m28489q() {
        C6990a.m29406f();
        return this.f24986f;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m28490r() {
        if (m28484k()) {
            return C6990a.m29415o("AppRtcBluetoothMgr", this.f24981a, this.f24989i, this.f24990j);
        }
        AudioManager audioManager = this.f24983c;
        if (audioManager != null) {
            return C6990a.m29412l(audioManager, true);
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean m28491s() {
        return m28489q() == e.SCO_CONNECTED || m28489q() == e.SCO_CONNECTING || m28489q() == e.HEADSET_AVAILABLE;
    }

    /* JADX INFO: renamed from: t */
    public boolean m28492t() {
        return m28489q() == e.SCO_CONNECTED;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m28493u() {
        AudioManager audioManager = this.f24983c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothScoOn();
    }

    /* JADX INFO: renamed from: v */
    public final void m28494v() {
        Log.d("AppRtcBluetoothMgr", "bluetoothState=" + this.f24986f);
        AudioManager audioManager = this.f24983c;
        if (audioManager != null) {
            C6990a.m29418r("AppRtcBluetoothMgr", audioManager);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothAdapter bluetoothAdapter = this.f24988h;
            if (bluetoothAdapter != null && defaultAdapter != bluetoothAdapter) {
                Log.d("AppRtcBluetoothMgr", "Cached adapter different that default BluetoothAdapter!");
            }
        } else {
            Log.d("AppRtcBluetoothMgr", "Default BluetoothAdapter unavailable!");
        }
        if (Build.VERSION.SDK_INT >= 31 && !C6990a.m29414n(this.f24981a, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d("AppRtcBluetoothMgr", "logBluetoothStatus: BLUETOOTH_CONNECT not granted!");
            return;
        }
        BluetoothHeadset bluetoothHeadset = this.f24989i;
        if (bluetoothHeadset != null) {
            C6990a.m29419s("AppRtcBluetoothMgr", this.f24981a, bluetoothHeadset);
        } else {
            Log.d("AppRtcBluetoothMgr", "No headset connected.");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m28495w() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected");
        if (this.f24986f == e.SCO_CONNECTED) {
            Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected: Audio already connected. state=" + this.f24986f);
            return;
        }
        m28485l();
        if (this.f24986f != e.SCO_CONNECTING) {
            Log.w("AppRtcBluetoothMgr", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connected");
        this.f24985e = 0;
        m28480N();
    }

    /* JADX INFO: renamed from: x */
    public final void m28496x() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioDisconnected");
        m28486m(e.HEADSET_AVAILABLE);
        this.f24985e = 0;
        m28480N();
    }

    /* JADX INFO: renamed from: y */
    public final void m28497y() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetConnected");
        this.f24985e = 0;
        m28480N();
    }

    /* JADX INFO: renamed from: z */
    public final void m28498z() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetDisconnected");
        m28477K();
        m28480N();
    }
}
