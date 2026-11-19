package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;
import rw.c;

/* JADX INFO: loaded from: classes2.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage = false;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden = false;
    private static boolean useAudioManagerCommunicationMode = true;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private final a audioManagerEvents;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final b volumeLogger;

    public class a implements org.webrtc.voiceengine.a.InterfaceC0549a {
        @Override // org.webrtc.voiceengine.a.InterfaceC0549a
        public void a(String str, Set<String> set) {
            Logging.b(WebRtcAudioManager.TAG, "onAudioDeviceChanged: selectedAudioDevice: " + str);
            c.j(WebRtcAudioManager.TAG);
        }

        public a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioManager f28523a;
        public Timer b;

        public class a extends TimerTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28524a;
            public final int b;

            public a(int i10, int i11) {
                this.f28524a = i10;
                this.b = i11;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int mode = b.this.f28523a.getMode();
                if (mode == 1) {
                    Logging.b(WebRtcAudioManager.TAG, "STREAM_RING stream volume: " + b.this.f28523a.getStreamVolume(2) + " (max=" + this.f28524a + ")");
                    return;
                }
                if (mode == 3) {
                    Logging.b(WebRtcAudioManager.TAG, "VOICE_CALL stream volume: " + b.this.f28523a.getStreamVolume(0) + " (max=" + this.b + ")");
                }
            }
        }

        public b(AudioManager audioManager) {
            this.f28523a = audioManager;
        }

        public void c() {
            Timer timer = new Timer("WebRtcVolumeLevelLoggerThread");
            this.b = timer;
            timer.schedule(new a(this.f28523a.getStreamMaxVolume(2), this.f28523a.getStreamMaxVolume(0)), 0L, 30000L);
        }

        public final void d() {
            Timer timer = this.b;
            if (timer != null) {
                timer.cancel();
                this.b = null;
            }
        }
    }

    public WebRtcAudioManager(long j10) {
        Logging.b(TAG, "ctor" + c.f());
        this.nativeAudioManager = j10;
        AudioManager audioManager = (AudioManager) ow.a.a().getSystemService("audio");
        this.audioManager = audioManager;
        if (org.webrtc.voiceengine.a.c()) {
            this.audioManagerEvents = new a();
        } else {
            this.audioManagerEvents = null;
            if (useAudioManagerCommunicationMode) {
                audioManager.setMode(3);
            }
        }
        this.volumeLogger = new b(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j10);
        c.j(TAG);
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        Logging.b(TAG, "dispose" + c.f());
        if (this.initialized) {
            if (org.webrtc.voiceengine.a.c()) {
                org.webrtc.voiceengine.a.b().i();
            }
            this.volumeLogger.d();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i10, int i11) {
        return AudioRecord.getMinBufferSize(i10, i11 == 1 ? 16 : 12, 2) / (i11 * 2);
    }

    private static int getMinOutputFrameSize(int i10, int i11) {
        return AudioTrack.getMinBufferSize(i10, i11 == 1 ? 4 : 12, 2) / (i11 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (c.p()) {
            Logging.b(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (c.h()) {
            Logging.b(TAG, "Default sample rate is overriden to " + c.e() + " Hz");
            return c.e();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        Logging.b(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? c.e() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        return useStereoInput;
    }

    public static synchronized boolean getStereoOutput() {
        return useStereoOutput;
    }

    private boolean hasEarpiece() {
        return ow.a.a().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        Logging.b(TAG, "init" + c.f());
        if (this.initialized) {
            return blacklistDeviceForAAudioUsage;
        }
        Logging.b(TAG, "audio mode is: " + c.o(this.audioManager.getMode()));
        this.initialized = blacklistDeviceForAAudioUsage;
        this.volumeLogger.c();
        if (org.webrtc.voiceengine.a.c()) {
            org.webrtc.voiceengine.a.b().h(this.audioManagerEvents);
        }
        return blacklistDeviceForAAudioUsage;
    }

    private boolean isAAudioSupported() {
        Logging.d(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return rw.a.a();
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean zA = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : c.a();
        if (zA) {
            Logging.b(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return zA;
    }

    private boolean isLowLatencyOutputSupported() {
        return ow.a.a().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return rw.a.b();
    }

    private boolean isProAudioSupported() {
        if (ow.a.a().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private native void nativeCacheAudioParameters(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i13, int i14, long j10);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z10) {
        blacklistDeviceForOpenSLESUsageIsOverridden = blacklistDeviceForAAudioUsage;
        blacklistDeviceForOpenSLESUsage = z10;
    }

    private void setMicrophoneMute(boolean z10) {
        Logging.b(TAG, "setMicrophoneMute(" + z10 + ")" + c.f());
        if (org.webrtc.voiceengine.a.c()) {
            org.webrtc.voiceengine.a.b().f(z10);
        }
    }

    public static synchronized void setStereoInput(boolean z10) {
        Logging.d(TAG, "Overriding default input behavior: setStereoInput(" + z10 + ')');
        useStereoInput = z10;
    }

    public static synchronized void setStereoOutput(boolean z10) {
        Logging.d(TAG, "Overriding default output behavior: setStereoOutput(" + z10 + ')');
        useStereoOutput = z10;
    }

    public static void setUseAudioManagerCommunicationMode(boolean z10) {
        useAudioManagerCommunicationMode = z10;
    }

    private void storeAudioParameters() {
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }
}
