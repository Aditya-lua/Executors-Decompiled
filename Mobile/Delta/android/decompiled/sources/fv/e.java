package fv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.voiceengine.AppAudioManagerBase;

/* JADX INFO: loaded from: classes2.dex */
public class e extends AppAudioManagerBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17792a;
    public final AudioManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppAudioManagerBase.AudioManagerEvents f17793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17794d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17798h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f17800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f17801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f17802l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BroadcastReceiver f17804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f17805o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AudioFocusRequest f17806p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17795e = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17799i = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Set<b> f17803m = new HashSet();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17807a;

        static {
            int[] iArr = new int[b.values().length];
            f17807a = iArr;
            try {
                iArr[b.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17807a[b.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17807a[b.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17807a[b.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    public enum c {
        UNINITIALIZED,
        RUNNING
    }

    public class d extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WiredHeadsetReceiver.onReceive");
            sb2.append(gv.a.k());
            sb2.append(": a=");
            sb2.append(intent.getAction());
            sb2.append(", s=");
            sb2.append(intExtra == 0 ? "unplugged" : "plugged");
            sb2.append(", m=");
            sb2.append(intExtra2 == 1 ? "mic" : "no mic");
            sb2.append(", n=");
            sb2.append(stringExtra);
            sb2.append(", sb=");
            sb2.append(isInitialStickyBroadcast());
            Log.d("AppRtcAudioManager", sb2.toString());
            e.this.f17798h = intExtra == 1;
            e.this.s();
        }

        public d() {
        }
    }

    public e(Context context) {
        Log.d("AppRtcAudioManager", "ctor");
        gv.a.f();
        this.f17792a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.f17802l = h.n(context, new h.f() { // from class: fv.c
            @Override // fv.h.f
            public final void a() {
                this.f17791a.s();
            }
        });
        this.f17804n = new d();
        this.f17794d = c.UNINITIALIZED;
        b bVar = b.SPEAKER_PHONE;
        this.f17800j = bVar;
        Log.d("AppRtcAudioManager", "defaultAudioDevice: " + bVar);
        gv.a.u("AppRtcAudioManager");
        setInstance(this);
    }

    public static e g(Context context) {
        return new e(context);
    }

    public final void f() {
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f17806p);
    }

    public final boolean h() {
        return this.f17792a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public final boolean i() {
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("AppRtcAudioManager", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("AppRtcAudioManager", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    public final void k(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f17792a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void l() {
        if (this.b == null) {
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f17805o).build();
        this.f17806p = audioFocusRequestBuild;
        Log.d("AppRtcAudioManager", "requestAudioFocusNew: result = " + gv.a.h(this.b.requestAudioFocus(audioFocusRequestBuild)));
    }

    public final void m(b bVar) {
        Log.d("AppRtcAudioManager", "setAudioDeviceInternal(device=" + bVar + ")");
        gv.a.a(this.f17803m.contains(bVar));
        int i10 = a.f17807a[bVar.ordinal()];
        if (i10 == 1) {
            o(true);
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            o(false);
        } else {
            Log.e("AppRtcAudioManager", "Invalid audio device selection");
        }
        this.f17801k = bVar;
    }

    public final void n(boolean z10) {
        AudioManager audioManager = this.b;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.b.setMicrophoneMute(z10);
    }

    public final void o(boolean z10) {
        AudioManager audioManager = this.b;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.b.setSpeakerphoneOn(z10);
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void onDispose() {
        if (this.f17794d != c.UNINITIALIZED) {
            stopCommunication();
        }
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "start");
        gv.a.f();
        if (this.b == null) {
            Log.w("AppRtcAudioManager", "start: audioManager == null");
            return;
        }
        c cVar = this.f17794d;
        c cVar2 = c.RUNNING;
        if (cVar == cVar2) {
            Log.w("AppRtcAudioManager", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManager", "AudioManager starts...");
        this.f17793c = audioManagerEvents;
        this.f17794d = cVar2;
        this.f17795e = this.b.getMode();
        this.f17796f = this.b.isSpeakerphoneOn();
        this.f17797g = this.b.isMicrophoneMute();
        this.f17798h = i();
        this.f17805o = new AudioManager.OnAudioFocusChangeListener() { // from class: fv.d
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Log.d("AppRtcAudioManager", "onAudioFocusChange: " + gv.a.g(i10));
            }
        };
        l();
        gv.a.w("AppRtcAudioManager", this.b, 3);
        n(false);
        this.f17801k = b.NONE;
        this.f17803m.clear();
        this.f17802l.E();
        s();
        k(this.f17804n, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManager", "AudioManager started");
    }

    public void q() {
        Log.d("AppRtcAudioManager", "stop");
        gv.a.f();
        if (this.f17794d != c.RUNNING) {
            Log.w("AppRtcAudioManager", "Trying to stop AudioManager in incorrect state: " + this.f17794d);
            return;
        }
        this.f17794d = c.UNINITIALIZED;
        r(this.f17804n);
        this.f17802l.I();
        if (this.b != null) {
            o(this.f17796f);
            n(this.f17797g);
            int i10 = this.f17795e;
            if (i10 != -2) {
                gv.a.w("AppRtcAudioManager", this.b, i10);
            }
            f();
        }
        this.f17805o = null;
        Log.d("AppRtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        this.f17793c = null;
        Log.d("AppRtcAudioManager", "AudioManager stopped");
    }

    public final void r(BroadcastReceiver broadcastReceiver) {
        this.f17792a.unregisterReceiver(broadcastReceiver);
    }

    public final void s() {
        b bVar;
        gv.a.f();
        Log.d("AppRtcAudioManager", "---> updateAudioDeviceState: wired headset=" + this.f17798h + ", BT isHeadsetAvailable=" + this.f17802l.s());
        Log.d("AppRtcAudioManager", "Device status: available=" + this.f17803m + ", selected=" + this.f17801k);
        AudioManager audioManager = this.b;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManager", "Mode != MODE_IN_COMMUNICATION");
            gv.a.w("AppRtcAudioManager", this.b, 3);
        }
        if (this.f17794d == c.UNINITIALIZED) {
            Log.d("AppRtcAudioManager", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f17802l.t()) {
            hashSet.add(b.BLUETOOTH);
        }
        if (this.f17798h) {
            hashSet.add(b.WIRED_HEADSET);
        } else {
            hashSet.add(b.SPEAKER_PHONE);
            if (h()) {
                hashSet.add(b.EARPIECE);
            }
        }
        boolean zEquals = this.f17803m.equals(hashSet);
        this.f17803m = hashSet;
        if (this.f17802l.t()) {
            bVar = b.BLUETOOTH;
        } else {
            bVar = this.f17798h ? b.WIRED_HEADSET : this.f17800j;
        }
        if (bVar != this.f17801k || !zEquals) {
            m(bVar);
            Log.d("AppRtcAudioManager", "New device status: available=" + this.f17803m + ", selected=" + bVar);
            if (this.f17793c != null) {
                HashSet hashSet2 = new HashSet();
                Iterator<b> it = this.f17803m.iterator();
                while (it.hasNext()) {
                    hashSet2.add(it.next().toString());
                }
                this.f17793c.onAudioDeviceChanged(this.f17801k.toString(), hashSet2);
            }
        }
        Log.d("AppRtcAudioManager", "<--- updateAudioDeviceState done");
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void setActivityForPermissionRequest(j.b bVar) {
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void startCommunication(final AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "startCommunication");
        this.f17799i++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fv.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f17789a.j(audioManagerEvents);
            }
        });
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void stopCommunication() {
        Log.d("AppRtcAudioManager", "stopCommunication");
        int i10 = this.f17799i - 1;
        this.f17799i = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fv.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17790a.q();
                }
            });
        }
    }
}
