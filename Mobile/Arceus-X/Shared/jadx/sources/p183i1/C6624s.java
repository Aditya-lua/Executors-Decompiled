package p183i1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p140g0.C5931r1;
import p205j1.C7014a;
import p205j1.C7015b;
import p205j1.C7017d;
import p205j1.C7018e;
import p234k1.C7407c;
import p533x2.C12637g;

/* JADX INFO: renamed from: i1.s */
/* JADX INFO: loaded from: classes.dex */
public class C6624s implements InterfaceC6621p {

    /* JADX INFO: renamed from: m */
    public static final long f25547m = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: a */
    public AudioRecord f25548a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6601a f25549b;

    /* JADX INFO: renamed from: f */
    public final int f25553f;

    /* JADX INFO: renamed from: g */
    public final int f25554g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6621p.a f25555h;

    /* JADX INFO: renamed from: i */
    public Executor f25556i;

    /* JADX INFO: renamed from: j */
    public long f25557j;

    /* JADX INFO: renamed from: k */
    public AudioManager.AudioRecordingCallback f25558k;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f25550c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f25551d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final AtomicReference<Boolean> f25552e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l */
    public boolean f25559l = false;

    /* JADX INFO: renamed from: i1.s$a */
    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (C7015b.m29696a(audioRecordingConfiguration) == C6624s.this.f25548a.getAudioSessionId()) {
                    C6624s.this.m28600o(C7017d.m29700b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public C6624s(AbstractC6601a abstractC6601a, Context context) throws InterfaceC6621p.b {
        if (!m28596n(abstractC6601a.mo28512e(), abstractC6601a.mo28513f(), abstractC6601a.mo28509b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(abstractC6601a.mo28512e()), Integer.valueOf(abstractC6601a.mo28513f()), Integer.valueOf(abstractC6601a.mo28509b())));
        }
        this.f25549b = abstractC6601a;
        this.f25554g = abstractC6601a.m28511d();
        int iM28594l = m28594l(abstractC6601a.mo28512e(), abstractC6601a.mo28513f(), abstractC6601a.mo28509b());
        C12637g.m47077i(iM28594l > 0);
        int i10 = iM28594l * 2;
        this.f25553f = i10;
        AudioRecord audioRecordM28593j = m28593j(i10, abstractC6601a, context);
        this.f25548a = audioRecordM28593j;
        m28590e(audioRecordM28593j);
    }

    /* JADX INFO: renamed from: e */
    public static void m28590e(AudioRecord audioRecord) throws InterfaceC6621p.b {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new InterfaceC6621p.b("Unable to initialize AudioRecord");
    }

    /* JADX INFO: renamed from: h */
    public static AudioFormat m28591h(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(C6625t.m28602b(i11)).setEncoding(i12).build();
    }

    /* JADX INFO: renamed from: i */
    public static AudioFormat m28592i(AbstractC6601a abstractC6601a) {
        return m28591h(abstractC6601a.mo28512e(), abstractC6601a.mo28513f(), abstractC6601a.mo28509b());
    }

    /* JADX INFO: renamed from: j */
    public static AudioRecord m28593j(int i10, AbstractC6601a abstractC6601a, Context context) {
        int i11 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatM28592i = m28592i(abstractC6601a);
        AudioRecord.Builder builderM29692b = C7014a.m29692b();
        if (i11 >= 31 && context != null) {
            C7018e.m29703a(builderM29692b, context);
        }
        C7014a.m29694d(builderM29692b, abstractC6601a.mo28510c());
        C7014a.m29693c(builderM29692b, audioFormatM28592i);
        C7014a.m29695e(builderM29692b, i10);
        try {
            return C7014a.m29691a(builderM29692b);
        } catch (UnsupportedOperationException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m28594l(int i10, int i11, int i12) {
        return AudioRecord.getMinBufferSize(i10, C6625t.m28601a(i11), i12);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m28595m() {
        return C7407c.m30691b(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28596n(int i10, int i11, int i12) {
        if (i10 <= 0 || i11 <= 0 || m28594l(i10, i11, i12) <= 0) {
            return false;
        }
        try {
            m28591h(i10, i11, i12);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // p183i1.InterfaceC6621p
    /* JADX INFO: renamed from: a */
    public void mo28530a() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f25550c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f25558k) != null) {
            C7017d.m29702d(this.f25548a, audioRecordingCallback);
        }
        this.f25548a.release();
    }

    @Override // p183i1.InterfaceC6621p
    /* JADX INFO: renamed from: b */
    public void mo28531b(InterfaceC6621p.a aVar, Executor executor) {
        boolean z10 = true;
        C12637g.m47078j(!this.f25551d.get(), "AudioStream can not be started when setCallback.");
        m28597f();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        C12637g.m47070b(z10, "executor can't be null with non-null callback.");
        this.f25555h = aVar;
        this.f25556i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f25558k;
            if (audioRecordingCallback != null) {
                C7017d.m29702d(this.f25548a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f25558k == null) {
                this.f25558k = new a();
            }
            C7017d.m29701c(this.f25548a, executor, this.f25558k);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m28597f() {
        C12637g.m47078j(!this.f25550c.get(), "AudioStream has been released.");
    }

    /* JADX INFO: renamed from: g */
    public final void m28598g() {
        C12637g.m47078j(this.f25551d.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: renamed from: k */
    public final long m28599k() {
        long jM28603c;
        if (this.f25559l) {
            jM28603c = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (C7015b.m29697b(this.f25548a, audioTimestamp, 0) == 0) {
                jM28603c = C6625t.m28603c(this.f25549b.mo28512e(), this.f25557j, audioTimestamp);
                if (Math.abs(jM28603c - System.nanoTime()) > f25547m) {
                    this.f25559l = true;
                }
            } else {
                C5931r1.m26572l("AudioStreamImpl", "Unable to get audio timestamp");
            }
            jM28603c = -1;
        }
        return jM28603c == -1 ? System.nanoTime() : jM28603c;
    }

    /* JADX INFO: renamed from: o */
    public void m28600o(final boolean z10) {
        Executor executor = this.f25556i;
        final InterfaceC6621p.a aVar = this.f25555h;
        if (executor == null || aVar == null || Objects.equals(this.f25552e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.r
            @Override // java.lang.Runnable
            public final void run() {
                aVar.mo28583a(z10);
            }
        });
    }

    @Override // p183i1.InterfaceC6621p
    public InterfaceC6621p.c read(ByteBuffer byteBuffer) {
        long jM28599k;
        m28597f();
        m28598g();
        int i10 = this.f25548a.read(byteBuffer, this.f25553f);
        if (i10 > 0) {
            byteBuffer.limit(i10);
            jM28599k = m28599k();
            this.f25557j += C6625t.m28607g(i10, this.f25554g);
        } else {
            jM28599k = 0;
        }
        return InterfaceC6621p.c.m28585c(i10, jM28599k);
    }

    @Override // p183i1.InterfaceC6621p
    public void start() throws InterfaceC6621p.b {
        m28597f();
        if (this.f25551d.getAndSet(true)) {
            return;
        }
        if (m28595m()) {
            m28590e(this.f25548a);
        }
        this.f25548a.startRecording();
        boolean z10 = false;
        if (this.f25548a.getRecordingState() != 3) {
            this.f25551d.set(false);
            throw new InterfaceC6621p.b("Unable to start AudioRecord with state: " + this.f25548a.getRecordingState());
        }
        this.f25557j = 0L;
        this.f25559l = false;
        this.f25552e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationM29699a = C7017d.m29699a(this.f25548a);
            z10 = audioRecordingConfigurationM29699a != null && C7017d.m29700b(audioRecordingConfigurationM29699a);
        }
        m28600o(z10);
    }

    @Override // p183i1.InterfaceC6621p
    @SuppressLint({"MissingPermission"})
    public void stop() {
        m28597f();
        if (this.f25551d.getAndSet(false)) {
            this.f25548a.stop();
            if (this.f25548a.getRecordingState() != 1) {
                C5931r1.m26572l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f25548a.getRecordingState());
            }
            if (m28595m()) {
                this.f25548a.release();
                this.f25548a = m28593j(this.f25553f, this.f25549b, null);
            }
        }
    }
}
