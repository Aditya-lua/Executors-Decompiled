package p180hv;

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
import p202iv.C6990a;
import p203j.ActivityC6992b;

/* JADX INFO: renamed from: hv.e */
/* JADX INFO: loaded from: classes2.dex */
public class C6584e extends AppAudioManagerBase {

    /* JADX INFO: renamed from: a */
    public final Context f24953a;

    /* JADX INFO: renamed from: b */
    public final AudioManager f24954b;

    /* JADX INFO: renamed from: c */
    public AppAudioManagerBase.AudioManagerEvents f24955c;

    /* JADX INFO: renamed from: d */
    public c f24956d;

    /* JADX INFO: renamed from: f */
    public boolean f24958f;

    /* JADX INFO: renamed from: g */
    public boolean f24959g;

    /* JADX INFO: renamed from: h */
    public boolean f24960h;

    /* JADX INFO: renamed from: j */
    public final b f24962j;

    /* JADX INFO: renamed from: k */
    public b f24963k;

    /* JADX INFO: renamed from: l */
    public final C6587h f24964l;

    /* JADX INFO: renamed from: n */
    public final BroadcastReceiver f24966n;

    /* JADX INFO: renamed from: o */
    public AudioManager.OnAudioFocusChangeListener f24967o;

    /* JADX INFO: renamed from: p */
    public AudioFocusRequest f24968p;

    /* JADX INFO: renamed from: e */
    public int f24957e = -2;

    /* JADX INFO: renamed from: i */
    public int f24961i = 0;

    /* JADX INFO: renamed from: m */
    public Set<b> f24965m = new HashSet();

    /* JADX INFO: renamed from: hv.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24969a;

        static {
            int[] iArr = new int[b.values().length];
            f24969a = iArr;
            try {
                iArr[b.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24969a[b.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24969a[b.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24969a[b.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: hv.e$b */
    public enum b {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    /* JADX INFO: renamed from: hv.e$c */
    public enum c {
        UNINITIALIZED,
        RUNNING
    }

    /* JADX INFO: renamed from: hv.e$d */
    public class d extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WiredHeadsetReceiver.onReceive");
            sb2.append(C6990a.m29411k());
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
            C6584e.this.f24960h = intExtra == 1;
            C6584e.this.m28454s();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d() {
        }
    }

    public C6584e(Context context) {
        Log.d("AppRtcAudioManager", "ctor");
        C6990a.m29406f();
        this.f24953a = context;
        this.f24954b = (AudioManager) context.getSystemService("audio");
        this.f24964l = C6587h.m28466n(context, new C6587h.f() { // from class: hv.c
            @Override // p180hv.C6587h.f
            /* JADX INFO: renamed from: a */
            public final void mo28435a() {
                this.f24952a.m28454s();
            }
        });
        this.f24966n = new d();
        this.f24956d = c.UNINITIALIZED;
        b bVar = b.SPEAKER_PHONE;
        this.f24962j = bVar;
        Log.d("AppRtcAudioManager", "defaultAudioDevice: " + bVar);
        C6990a.m29421u("AppRtcAudioManager");
        setInstance(this);
    }

    /* JADX INFO: renamed from: g */
    public static C6584e m28441g(Context context) {
        return new C6584e(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m28442f() {
        AudioManager audioManager = this.f24954b;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f24968p);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28443h() {
        return this.f24953a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28444i() {
        AudioManager audioManager = this.f24954b;
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

    /* JADX INFO: renamed from: k */
    public final void m28446k(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f24953a.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: l */
    public final void m28447l() {
        if (this.f24954b == null) {
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f24967o).build();
        this.f24968p = audioFocusRequestBuild;
        Log.d("AppRtcAudioManager", "requestAudioFocusNew: result = " + C6990a.m29408h(this.f24954b.requestAudioFocus(audioFocusRequestBuild)));
    }

    /* JADX INFO: renamed from: m */
    public final void m28448m(b bVar) {
        Log.d("AppRtcAudioManager", "setAudioDeviceInternal(device=" + bVar + ")");
        C6990a.m29401a(this.f24965m.contains(bVar));
        int i10 = a.f24969a[bVar.ordinal()];
        if (i10 == 1) {
            m28450o(true);
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            m28450o(false);
        } else {
            Log.e("AppRtcAudioManager", "Invalid audio device selection");
        }
        this.f24963k = bVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m28449n(boolean z10) {
        AudioManager audioManager = this.f24954b;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.f24954b.setMicrophoneMute(z10);
    }

    /* JADX INFO: renamed from: o */
    public final void m28450o(boolean z10) {
        AudioManager audioManager = this.f24954b;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.f24954b.setSpeakerphoneOn(z10);
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void onDispose() {
        if (this.f24956d != c.UNINITIALIZED) {
            stopCommunication();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: j(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m28445j(AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "start");
        C6990a.m29406f();
        if (this.f24954b == null) {
            Log.w("AppRtcAudioManager", "start: audioManager == null");
            return;
        }
        c cVar = this.f24956d;
        c cVar2 = c.RUNNING;
        if (cVar == cVar2) {
            Log.w("AppRtcAudioManager", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManager", "AudioManager starts...");
        this.f24955c = audioManagerEvents;
        this.f24956d = cVar2;
        this.f24957e = this.f24954b.getMode();
        this.f24958f = this.f24954b.isSpeakerphoneOn();
        this.f24959g = this.f24954b.isMicrophoneMute();
        this.f24960h = m28444i();
        this.f24967o = new AudioManager.OnAudioFocusChangeListener() { // from class: hv.d
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Log.d("AppRtcAudioManager", "onAudioFocusChange: " + C6990a.m29407g(i10));
            }
        };
        m28447l();
        C6990a.m29423w("AppRtcAudioManager", this.f24954b, 3);
        m28449n(false);
        this.f24963k = b.NONE;
        this.f24965m.clear();
        this.f24964l.m28471E();
        m28454s();
        m28446k(this.f24966n, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManager", "AudioManager started");
    }

    /* JADX INFO: renamed from: q */
    public void m28452q() {
        Log.d("AppRtcAudioManager", "stop");
        C6990a.m29406f();
        if (this.f24956d != c.RUNNING) {
            Log.w("AppRtcAudioManager", "Trying to stop AudioManager in incorrect state: " + this.f24956d);
            return;
        }
        this.f24956d = c.UNINITIALIZED;
        m28453r(this.f24966n);
        this.f24964l.m28475I();
        if (this.f24954b != null) {
            m28450o(this.f24958f);
            m28449n(this.f24959g);
            int i10 = this.f24957e;
            if (i10 != -2) {
                C6990a.m29423w("AppRtcAudioManager", this.f24954b, i10);
            }
            m28442f();
        }
        this.f24967o = null;
        Log.d("AppRtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        this.f24955c = null;
        Log.d("AppRtcAudioManager", "AudioManager stopped");
    }

    /* JADX INFO: renamed from: r */
    public final void m28453r(BroadcastReceiver broadcastReceiver) {
        this.f24953a.unregisterReceiver(broadcastReceiver);
    }

    /* JADX INFO: renamed from: s */
    public final void m28454s() {
        b bVar;
        C6990a.m29406f();
        Log.d("AppRtcAudioManager", "---> updateAudioDeviceState: wired headset=" + this.f24960h + ", BT isHeadsetAvailable=" + this.f24964l.m28491s());
        Log.d("AppRtcAudioManager", "Device status: available=" + this.f24965m + ", selected=" + this.f24963k);
        AudioManager audioManager = this.f24954b;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManager", "Mode != MODE_IN_COMMUNICATION");
            C6990a.m29423w("AppRtcAudioManager", this.f24954b, 3);
        }
        if (this.f24956d == c.UNINITIALIZED) {
            Log.d("AppRtcAudioManager", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f24964l.m28492t()) {
            hashSet.add(b.BLUETOOTH);
        }
        if (this.f24960h) {
            hashSet.add(b.WIRED_HEADSET);
        } else {
            hashSet.add(b.SPEAKER_PHONE);
            if (m28443h()) {
                hashSet.add(b.EARPIECE);
            }
        }
        boolean zEquals = this.f24965m.equals(hashSet);
        this.f24965m = hashSet;
        if (this.f24964l.m28492t()) {
            bVar = b.BLUETOOTH;
        } else {
            bVar = this.f24960h ? b.WIRED_HEADSET : this.f24962j;
        }
        if (bVar != this.f24963k || !zEquals) {
            m28448m(bVar);
            Log.d("AppRtcAudioManager", "New device status: available=" + this.f24965m + ", selected=" + bVar);
            if (this.f24955c != null) {
                HashSet hashSet2 = new HashSet();
                Iterator<b> it = this.f24965m.iterator();
                while (it.hasNext()) {
                    hashSet2.add(it.next().toString());
                }
                this.f24955c.onAudioDeviceChanged(this.f24963k.toString(), hashSet2);
            }
        }
        Log.d("AppRtcAudioManager", "<--- updateAudioDeviceState done");
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void setActivityForPermissionRequest(ActivityC6992b activityC6992b) {
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void startCommunication(final AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "startCommunication");
        this.f24961i++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: hv.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f24949a.m28445j(audioManagerEvents);
            }
        });
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void stopCommunication() {
        Log.d("AppRtcAudioManager", "stopCommunication");
        int i10 = this.f24961i - 1;
        this.f24961i = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: hv.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24951a.m28452q();
                }
            });
        }
    }
}
