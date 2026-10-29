package hv;

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
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class k extends com.roblox.audio.a {
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f19844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.roblox.audio.a.b f19845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f19846e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19850i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.roblox.audio.a.EnumC0130a f19852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.roblox.audio.a.EnumC0130a f19853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f19854m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BroadcastReceiver f19856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f19857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AudioFocusRequest f19858q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19847f = -2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19851j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<com.roblox.audio.a.EnumC0130a> f19855n = new HashSet();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19859a;

        static {
            int[] iArr = new int[com.roblox.audio.a.EnumC0130a.values().length];
            f19859a = iArr;
            try {
                iArr[com.roblox.audio.a.EnumC0130a.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19859a[com.roblox.audio.a.EnumC0130a.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19859a[com.roblox.audio.a.EnumC0130a.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19859a[com.roblox.audio.a.EnumC0130a.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        UNINITIALIZED,
        RUNNING
    }

    public class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WiredHeadsetReceiver.onReceive");
            sb2.append(iv.a.k());
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
            Log.d("AppRtcAudioManagerNew", sb2.toString());
            k.this.f19850i = intExtra == 1;
            k.this.C();
        }

        public c() {
        }
    }

    public k(Context context) {
        Log.d("AppRtcAudioManagerNew", "ctor");
        iv.a.f();
        this.b = context;
        this.f19844c = (AudioManager) context.getSystemService("audio");
        this.f19854m = n.n(context, new n.f() { // from class: hv.h
            @Override // hv.n.f
            public final void a() {
                this.f19842a.C();
            }
        });
        this.f19856o = new c();
        this.f19846e = b.UNINITIALIZED;
        com.roblox.audio.a.EnumC0130a enumC0130a = com.roblox.audio.a.EnumC0130a.SPEAKER_PHONE;
        this.f19852k = enumC0130a;
        Log.d("AppRtcAudioManagerNew", "defaultAudioDevice: " + enumC0130a);
        iv.a.u("AppRtcAudioManagerNew");
        h(this);
    }

    public static k q(Context context) {
        return new k(context);
    }

    public void A() {
        Log.d("AppRtcAudioManagerNew", "stop");
        iv.a.f();
        if (this.f19846e != b.RUNNING) {
            Log.w("AppRtcAudioManagerNew", "Trying to stop AudioManager in incorrect state: " + this.f19846e);
            return;
        }
        this.f19846e = b.UNINITIALIZED;
        B(this.f19856o);
        this.f19854m.I();
        if (this.f19844c != null) {
            y(this.f19848g);
            x(this.f19849h);
            int i10 = this.f19847f;
            if (i10 != -2) {
                iv.a.w("AppRtcAudioManagerNew", this.f19844c, i10);
            }
            p();
        }
        this.f19857p = null;
        Log.d("AppRtcAudioManagerNew", "Abandoned audio focus for VOICE_CALL streams");
        this.f19845d = null;
        Log.d("AppRtcAudioManagerNew", "AudioManager stopped");
    }

    public final void B(BroadcastReceiver broadcastReceiver) {
        this.b.unregisterReceiver(broadcastReceiver);
    }

    public final void C() {
        com.roblox.audio.a.EnumC0130a enumC0130a;
        iv.a.f();
        Log.d("AppRtcAudioManagerNew", "---> updateAudioDeviceState: wired headset=" + this.f19850i + ", BT isHeadsetAvailable=" + this.f19854m.s());
        Log.d("AppRtcAudioManagerNew", "Device status: available=" + this.f19855n + ", selected=" + this.f19853l);
        AudioManager audioManager = this.f19844c;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManagerNew", "Mode != MODE_IN_COMMUNICATION");
        }
        if (this.f19846e == b.UNINITIALIZED) {
            Log.d("AppRtcAudioManagerNew", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f19854m.t()) {
            hashSet.add(com.roblox.audio.a.EnumC0130a.BLUETOOTH);
        }
        if (this.f19850i) {
            hashSet.add(com.roblox.audio.a.EnumC0130a.WIRED_HEADSET);
        } else {
            hashSet.add(com.roblox.audio.a.EnumC0130a.SPEAKER_PHONE);
            if (r()) {
                hashSet.add(com.roblox.audio.a.EnumC0130a.EARPIECE);
            }
        }
        boolean zEquals = this.f19855n.equals(hashSet);
        this.f19855n = hashSet;
        if (this.f19854m.t()) {
            enumC0130a = com.roblox.audio.a.EnumC0130a.BLUETOOTH;
        } else {
            enumC0130a = this.f19850i ? com.roblox.audio.a.EnumC0130a.WIRED_HEADSET : this.f19852k;
        }
        if (enumC0130a != this.f19853l || !zEquals) {
            w(enumC0130a);
            Log.d("AppRtcAudioManagerNew", "New device status: available=" + this.f19855n + ", selected=" + enumC0130a);
            com.roblox.audio.a.b bVar = this.f19845d;
            if (bVar != null) {
                bVar.a(this.f19853l, this.f19855n);
            }
        }
        Log.d("AppRtcAudioManagerNew", "<--- updateAudioDeviceState done");
    }

    @Override // com.roblox.audio.a
    public com.roblox.audio.a.EnumC0130a c() {
        return this.f19853l;
    }

    @Override // com.roblox.audio.a
    public void e() {
        if (this.f19846e != b.UNINITIALIZED) {
            j();
        }
    }

    @Override // com.roblox.audio.a
    public void f(j.b bVar) {
    }

    @Override // com.roblox.audio.a
    public void i(final com.roblox.audio.a.b bVar) {
        Log.d("AppRtcAudioManagerNew", "startCommunication");
        this.f19851j++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: hv.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f19843a.t(bVar);
            }
        });
    }

    @Override // com.roblox.audio.a
    public void j() {
        Log.d("AppRtcAudioManagerNew", "stopCommunication");
        int i10 = this.f19851j - 1;
        this.f19851j = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: hv.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19841a.A();
                }
            });
        }
    }

    public final void p() {
        AudioManager audioManager = this.f19844c;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f19858q);
    }

    public final boolean r() {
        return this.b.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public final boolean s() {
        AudioManager audioManager = this.f19844c;
        if (audioManager == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("AppRtcAudioManagerNew", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("AppRtcAudioManagerNew", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    public final void u(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.b.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void v() {
        if (this.f19844c == null) {
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f19857p).build();
        this.f19858q = audioFocusRequestBuild;
        Log.d("AppRtcAudioManagerNew", "requestAudioFocusNew: result = " + iv.a.h(this.f19844c.requestAudioFocus(audioFocusRequestBuild)));
    }

    public final void w(com.roblox.audio.a.EnumC0130a enumC0130a) {
        Log.d("AppRtcAudioManagerNew", "setAudioDeviceInternal(device=" + enumC0130a + ")");
        iv.a.a(this.f19855n.contains(enumC0130a));
        int i10 = a.f19859a[enumC0130a.ordinal()];
        if (i10 == 1) {
            y(true);
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            y(false);
        } else {
            Log.e("AppRtcAudioManagerNew", "Invalid audio device selection");
        }
        this.f19853l = enumC0130a;
    }

    public final void x(boolean z10) {
        AudioManager audioManager = this.f19844c;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.f19844c.setMicrophoneMute(z10);
    }

    public final void y(boolean z10) {
        AudioManager audioManager = this.f19844c;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.f19844c.setSpeakerphoneOn(z10);
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(com.roblox.audio.a.b bVar) {
        Log.d("AppRtcAudioManagerNew", "start");
        iv.a.f();
        if (this.f19844c == null) {
            Log.w("AppRtcAudioManagerNew", "start: audioManager == null");
            return;
        }
        b bVar2 = this.f19846e;
        b bVar3 = b.RUNNING;
        if (bVar2 == bVar3) {
            Log.w("AppRtcAudioManagerNew", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManagerNew", "AudioManager starts...");
        this.f19845d = bVar;
        this.f19846e = bVar3;
        this.f19847f = this.f19844c.getMode();
        this.f19848g = this.f19844c.isSpeakerphoneOn();
        this.f19849h = this.f19844c.isMicrophoneMute();
        this.f19850i = s();
        this.f19857p = new AudioManager.OnAudioFocusChangeListener() { // from class: hv.j
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Log.d("AppRtcAudioManagerNew", "onAudioFocusChange: " + iv.a.g(i10));
            }
        };
        v();
        iv.a.w("AppRtcAudioManagerNew", this.f19844c, 3);
        x(false);
        this.f19853l = com.roblox.audio.a.EnumC0130a.NONE;
        this.f19855n.clear();
        this.f19854m.E();
        C();
        u(this.f19856o, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManagerNew", "AudioManager started");
    }
}
