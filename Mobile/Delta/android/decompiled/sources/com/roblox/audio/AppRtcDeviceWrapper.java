package com.roblox.audio;

import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class AppRtcDeviceWrapper {
    private static final String TAG = "AppRtcDeviceWrapper";
    private final a audioManagerEvents;
    private final long nativeReference;

    public class a implements com.roblox.audio.a.b {
        @Override // com.roblox.audio.a.b
        public void a(com.roblox.audio.a.EnumC0130a enumC0130a, Set<com.roblox.audio.a.EnumC0130a> set) {
            Log.d(AppRtcDeviceWrapper.TAG, "onAudioDeviceChanged: selectedAudioDevice: " + enumC0130a.toString());
            Log.d(AppRtcDeviceWrapper.TAG, "Placeholder until Log Audio State is implemented.");
            AppRtcDeviceWrapper.this.nativeAudioDeviceChanged(enumC0130a.ordinal(), AppRtcDeviceWrapper.this.nativeReference);
        }

        public a() {
        }
    }

    public AppRtcDeviceWrapper(long j10) {
        this.nativeReference = j10;
        Log.d(TAG, "ctor AppRtcDeviceWrapper");
        if (com.roblox.audio.a.d()) {
            this.audioManagerEvents = new a();
        } else {
            this.audioManagerEvents = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAudioDeviceChanged(int i10, long j10);

    public int getSelectedAudioDeviceAsInt() {
        if (com.roblox.audio.a.d()) {
            return com.roblox.audio.a.b().c().ordinal();
        }
        Log.d(TAG, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager");
        return com.roblox.audio.a.EnumC0130a.NONE.ordinal();
    }

    public String getSelectedAudioDeviceName() {
        if (!com.roblox.audio.a.d()) {
            Log.d(TAG, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager");
            return "INVALID INSTANCE";
        }
        com.roblox.audio.a.EnumC0130a enumC0130aC = com.roblox.audio.a.b().c();
        if (enumC0130aC == com.roblox.audio.a.EnumC0130a.SPEAKER_PHONE) {
            return "Android Audio (Speaker)";
        }
        if (enumC0130aC == com.roblox.audio.a.EnumC0130a.WIRED_HEADSET) {
            return "Android Audio (Wired Device)";
        }
        if (enumC0130aC == com.roblox.audio.a.EnumC0130a.EARPIECE) {
            return "Android Audio (Earpiece)";
        }
        return enumC0130aC == com.roblox.audio.a.EnumC0130a.BLUETOOTH ? "Android Audio (Bluetooth)" : "Android Audio (NONE)";
    }

    public boolean isValid() {
        return com.roblox.audio.a.d();
    }

    public void wrapSetCommunicationMute(boolean z10) {
        Log.d(TAG, "setMicrophoneMute(" + z10 + ")");
        if (com.roblox.audio.a.d()) {
            com.roblox.audio.a.b().g(z10);
        }
    }

    public void wrapStartCommunication() {
        Log.d(TAG, "startCommunication()");
        if (com.roblox.audio.a.d()) {
            com.roblox.audio.a.b().i(this.audioManagerEvents);
        }
    }

    public void wrapStopCommunication() {
        Log.d(TAG, "stopCommunication()");
        if (com.roblox.audio.a.d()) {
            com.roblox.audio.a.b().j();
        }
    }
}
