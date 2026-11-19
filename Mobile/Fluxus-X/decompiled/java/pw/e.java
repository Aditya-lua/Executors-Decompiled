package pw;

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

/* JADX INFO: loaded from: classes2.dex */
public class e extends org.webrtc.voiceengine.a {
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f29387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public org.webrtc.voiceengine.a.InterfaceC0549a f29388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f29389e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29393i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f29395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f29396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f29397m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BroadcastReceiver f29399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f29400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AudioFocusRequest f29401q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29390f = -2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29394j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<b> f29398n = new HashSet();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29402a;

        static {
            int[] iArr = new int[b.values().length];
            f29402a = iArr;
            try {
                iArr[b.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29402a[b.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29402a[b.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29402a[b.BLUETOOTH.ordinal()] = 4;
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
            sb2.append(qw.a.k());
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
            e.this.f29393i = intExtra == 1;
            e.this.B();
        }

        public d() {
        }
    }

    public e(Context context) {
        Log.d("AppRtcAudioManager", "ctor");
        qw.a.f();
        this.b = context;
        this.f29387c = (AudioManager) context.getSystemService("audio");
        this.f29397m = h.n(context, new h.f() { // from class: pw.b
            @Override // pw.h.f
            public final void a() {
                this.f29385a.B();
            }
        });
        this.f29399o = new d();
        this.f29389e = c.UNINITIALIZED;
        b bVar = b.SPEAKER_PHONE;
        this.f29395k = bVar;
        Log.d("AppRtcAudioManager", "defaultAudioDevice: " + bVar);
        qw.a.u("AppRtcAudioManager");
        g(this);
    }

    public static e p(Context context) {
        return new e(context);
    }

    public final void A(BroadcastReceiver broadcastReceiver) {
        this.b.unregisterReceiver(broadcastReceiver);
    }

    public final void B() {
        b bVar;
        qw.a.f();
        Log.d("AppRtcAudioManager", "---> updateAudioDeviceState: wired headset=" + this.f29393i + ", BT isHeadsetAvailable=" + this.f29397m.s());
        Log.d("AppRtcAudioManager", "Device status: available=" + this.f29398n + ", selected=" + this.f29396l);
        AudioManager audioManager = this.f29387c;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManager", "Mode != MODE_IN_COMMUNICATION");
            qw.a.w("AppRtcAudioManager", this.f29387c, 3);
        }
        if (this.f29389e == c.UNINITIALIZED) {
            Log.d("AppRtcAudioManager", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f29397m.t()) {
            hashSet.add(b.BLUETOOTH);
        }
        if (this.f29393i) {
            hashSet.add(b.WIRED_HEADSET);
        } else {
            hashSet.add(b.SPEAKER_PHONE);
            if (q()) {
                hashSet.add(b.EARPIECE);
            }
        }
        boolean zEquals = this.f29398n.equals(hashSet);
        this.f29398n = hashSet;
        if (this.f29397m.t()) {
            bVar = b.BLUETOOTH;
        } else {
            bVar = this.f29393i ? b.WIRED_HEADSET : this.f29395k;
        }
        if (bVar != this.f29396l || !zEquals) {
            v(bVar);
            Log.d("AppRtcAudioManager", "New device status: available=" + this.f29398n + ", selected=" + bVar);
            if (this.f29388d != null) {
                HashSet hashSet2 = new HashSet();
                Iterator<b> it = this.f29398n.iterator();
                while (it.hasNext()) {
                    hashSet2.add(it.next().toString());
                }
                this.f29388d.a(this.f29396l.toString(), hashSet2);
            }
        }
        Log.d("AppRtcAudioManager", "<--- updateAudioDeviceState done");
    }

    @Override // org.webrtc.voiceengine.a
    public void d() {
        if (this.f29389e != c.UNINITIALIZED) {
            i();
        }
    }

    @Override // org.webrtc.voiceengine.a
    public void e(j.b bVar) {
    }

    @Override // org.webrtc.voiceengine.a
    public void h(final org.webrtc.voiceengine.a.InterfaceC0549a interfaceC0549a) {
        Log.d("AppRtcAudioManager", "startCommunication");
        this.f29394j++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: pw.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f29384a.s(interfaceC0549a);
            }
        });
    }

    @Override // org.webrtc.voiceengine.a
    public void i() {
        Log.d("AppRtcAudioManager", "stopCommunication");
        int i10 = this.f29394j - 1;
        this.f29394j = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: pw.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29386a.z();
                }
            });
        }
    }

    public final void o() {
        AudioManager audioManager = this.f29387c;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f29401q);
    }

    public final boolean q() {
        return this.b.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public final boolean r() {
        AudioManager audioManager = this.f29387c;
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

    public final void t(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.b.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void u() {
        if (this.f29387c == null) {
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f29400p).build();
        this.f29401q = audioFocusRequestBuild;
        Log.d("AppRtcAudioManager", "requestAudioFocusNew: result = " + qw.a.h(this.f29387c.requestAudioFocus(audioFocusRequestBuild)));
    }

    public final void v(b bVar) {
        Log.d("AppRtcAudioManager", "setAudioDeviceInternal(device=" + bVar + ")");
        qw.a.a(this.f29398n.contains(bVar));
        int i10 = a.f29402a[bVar.ordinal()];
        if (i10 == 1) {
            x(true);
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            x(false);
        } else {
            Log.e("AppRtcAudioManager", "Invalid audio device selection");
        }
        this.f29396l = bVar;
    }

    public final void w(boolean z10) {
        AudioManager audioManager = this.f29387c;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.f29387c.setMicrophoneMute(z10);
    }

    public final void x(boolean z10) {
        AudioManager audioManager = this.f29387c;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.f29387c.setSpeakerphoneOn(z10);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(org.webrtc.voiceengine.a.InterfaceC0549a interfaceC0549a) {
        Log.d("AppRtcAudioManager", "start");
        qw.a.f();
        if (this.f29387c == null) {
            Log.w("AppRtcAudioManager", "start: audioManager == null");
            return;
        }
        c cVar = this.f29389e;
        c cVar2 = c.RUNNING;
        if (cVar == cVar2) {
            Log.w("AppRtcAudioManager", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManager", "AudioManager starts...");
        this.f29388d = interfaceC0549a;
        this.f29389e = cVar2;
        this.f29390f = this.f29387c.getMode();
        this.f29391g = this.f29387c.isSpeakerphoneOn();
        this.f29392h = this.f29387c.isMicrophoneMute();
        this.f29393i = r();
        this.f29400p = new AudioManager.OnAudioFocusChangeListener() { // from class: pw.d
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Log.d("AppRtcAudioManager", "onAudioFocusChange: " + qw.a.g(i10));
            }
        };
        u();
        qw.a.w("AppRtcAudioManager", this.f29387c, 3);
        w(false);
        this.f29396l = b.NONE;
        this.f29398n.clear();
        this.f29397m.E();
        B();
        t(this.f29399o, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManager", "AudioManager started");
    }

    public void z() {
        Log.d("AppRtcAudioManager", "stop");
        qw.a.f();
        if (this.f29389e != c.RUNNING) {
            Log.w("AppRtcAudioManager", "Trying to stop AudioManager in incorrect state: " + this.f29389e);
            return;
        }
        this.f29389e = c.UNINITIALIZED;
        A(this.f29399o);
        this.f29397m.I();
        if (this.f29387c != null) {
            x(this.f29391g);
            w(this.f29392h);
            int i10 = this.f29390f;
            if (i10 != -2) {
                qw.a.w("AppRtcAudioManager", this.f29387c, i10);
            }
            o();
        }
        this.f29400p = null;
        Log.d("AppRtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        this.f29388d = null;
        Log.d("AppRtcAudioManager", "AudioManager stopped");
    }
}
