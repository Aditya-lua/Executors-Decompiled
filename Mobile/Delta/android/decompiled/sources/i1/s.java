package i1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import g0.r1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class s implements p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f20220m = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioRecord f20221a;
    public final i1.a b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p.a f20227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f20228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AudioManager.AudioRecordingCallback f20230k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f20222c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20223d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<Boolean> f20224e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20231l = false;

    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (j1.b.a(audioRecordingConfiguration) == s.this.f20221a.getAudioSessionId()) {
                    s.this.o(j1.d.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public s(i1.a aVar, Context context) throws p.b {
        if (!n(aVar.e(), aVar.f(), aVar.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.e()), Integer.valueOf(aVar.f()), Integer.valueOf(aVar.b())));
        }
        this.b = aVar;
        this.f20226g = aVar.d();
        int iL = l(aVar.e(), aVar.f(), aVar.b());
        x2.g.i(iL > 0);
        int i10 = iL * 2;
        this.f20225f = i10;
        AudioRecord audioRecordJ = j(i10, aVar, context);
        this.f20221a = audioRecordJ;
        e(audioRecordJ);
    }

    public static void e(AudioRecord audioRecord) throws p.b {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new p.b("Unable to initialize AudioRecord");
    }

    public static AudioFormat h(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(t.b(i11)).setEncoding(i12).build();
    }

    public static AudioFormat i(i1.a aVar) {
        return h(aVar.e(), aVar.f(), aVar.b());
    }

    public static AudioRecord j(int i10, i1.a aVar, Context context) {
        int i11 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatI = i(aVar);
        AudioRecord.Builder builderB = j1.a.b();
        if (i11 >= 31 && context != null) {
            j1.e.a(builderB, context);
        }
        j1.a.d(builderB, aVar.c());
        j1.a.c(builderB, audioFormatI);
        j1.a.e(builderB, i10);
        try {
            return j1.a.a(builderB);
        } catch (UnsupportedOperationException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int l(int i10, int i11, int i12) {
        return AudioRecord.getMinBufferSize(i10, t.a(i11), i12);
    }

    public static boolean m() {
        return k1.c.b(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean n(int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || l(i10, i11, i12) <= 0) {
            return false;
        }
        try {
            h(i10, i11, i12);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // i1.p
    public void a() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f20222c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f20230k) != null) {
            j1.d.d(this.f20221a, audioRecordingCallback);
        }
        this.f20221a.release();
    }

    @Override // i1.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        x2.g.j(!this.f20223d.get(), "AudioStream can not be started when setCallback.");
        f();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        x2.g.b(z10, "executor can't be null with non-null callback.");
        this.f20227h = aVar;
        this.f20228i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f20230k;
            if (audioRecordingCallback != null) {
                j1.d.d(this.f20221a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f20230k == null) {
                this.f20230k = new a();
            }
            j1.d.c(this.f20221a, executor, this.f20230k);
        }
    }

    public final void f() {
        x2.g.j(!this.f20222c.get(), "AudioStream has been released.");
    }

    public final void g() {
        x2.g.j(this.f20223d.get(), "AudioStream has not been started.");
    }

    public final long k() {
        long jC;
        if (this.f20231l) {
            jC = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (j1.b.b(this.f20221a, audioTimestamp, 0) == 0) {
                jC = t.c(this.b.e(), this.f20229j, audioTimestamp);
                if (Math.abs(jC - System.nanoTime()) > f20220m) {
                    this.f20231l = true;
                }
            } else {
                r1.l("AudioStreamImpl", "Unable to get audio timestamp");
            }
            jC = -1;
        }
        return jC == -1 ? System.nanoTime() : jC;
    }

    public void o(final boolean z10) {
        Executor executor = this.f20228i;
        final p.a aVar = this.f20227h;
        if (executor == null || aVar == null || Objects.equals(this.f20224e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.r
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(z10);
            }
        });
    }

    @Override // i1.p
    public p.c read(ByteBuffer byteBuffer) {
        long jK;
        f();
        g();
        int i10 = this.f20221a.read(byteBuffer, this.f20225f);
        if (i10 > 0) {
            byteBuffer.limit(i10);
            jK = k();
            this.f20229j += t.g(i10, this.f20226g);
        } else {
            jK = 0;
        }
        return p.c.c(i10, jK);
    }

    @Override // i1.p
    public void start() throws p.b {
        f();
        if (this.f20223d.getAndSet(true)) {
            return;
        }
        if (m()) {
            e(this.f20221a);
        }
        this.f20221a.startRecording();
        boolean z10 = false;
        if (this.f20221a.getRecordingState() != 3) {
            this.f20223d.set(false);
            throw new p.b("Unable to start AudioRecord with state: " + this.f20221a.getRecordingState());
        }
        this.f20229j = 0L;
        this.f20231l = false;
        this.f20224e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = j1.d.a(this.f20221a);
            z10 = audioRecordingConfigurationA != null && j1.d.b(audioRecordingConfigurationA);
        }
        o(z10);
    }

    @Override // i1.p
    @SuppressLint({"MissingPermission"})
    public void stop() {
        f();
        if (this.f20223d.getAndSet(false)) {
            this.f20221a.stop();
            if (this.f20221a.getRecordingState() != 1) {
                r1.l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f20221a.getRecordingState());
            }
            if (m()) {
                this.f20221a.release();
                this.f20221a = j(this.f20225f, this.b, null);
            }
        }
    }
}
