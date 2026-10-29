package org.webrtc.voiceengine;

import java.util.Set;
import p203j.ActivityC6992b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppAudioManagerBase {
    private static AppAudioManagerBase sInstance;

    public interface AudioManagerEvents {
        void onAudioDeviceChanged(String str, Set<String> set);
    }

    public static AppAudioManagerBase getInstance() {
        return sInstance;
    }

    public static boolean hasInstance() {
        return sInstance != null;
    }

    public void dispose() {
        AppAudioManagerBase appAudioManagerBase = sInstance;
        if (this == appAudioManagerBase) {
            appAudioManagerBase.onDispose();
            sInstance = null;
        }
    }

    public abstract void onDispose();

    public void setActivityForPermissionRequest(ActivityC6992b activityC6992b) {
    }

    public void setCommunicationMute(boolean z10) {
    }

    public void setInstance(AppAudioManagerBase appAudioManagerBase) {
        sInstance = appAudioManagerBase;
    }

    public abstract void startCommunication(AudioManagerEvents audioManagerEvents);

    public abstract void stopCommunication();
}
