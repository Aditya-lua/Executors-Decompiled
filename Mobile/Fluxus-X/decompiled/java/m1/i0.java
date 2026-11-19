package m1;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import n0.a3;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements l {
    public static final Range<Long> H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public Future<?> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22762a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f22764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaFormat f22765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaCodec f22766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l.b f22767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1 f22768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f22769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pe.x<Void> f22770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1.c.a<Void> f22771k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a4 f22777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o1 f22778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rational f22779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f22780t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f22783w;
    public final Object b = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Queue<Integer> f22772l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Queue<y1.c.a<h1>> f22773m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<h1> f22774n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<k> f22775o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Deque<Range<Long>> f22776p = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f22781u = m.f22839a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Executor f22782v = q0.c.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Range<Long> f22784x = H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f22785y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22786z = false;
    public Long A = null;
    public Future<?> B = null;
    public g C = null;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    public class a implements r0.c<h1> {

        /* JADX INFO: renamed from: m1.i0$a$a, reason: collision with other inner class name */
        public class C0451a implements r0.c<Void> {
            public C0451a() {
            }

            @Override // r0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r10) {
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    i0.this.L((MediaCodec.CodecException) th2);
                } else {
                    i0.this.K(0, th2.getMessage(), th2);
                }
            }
        }

        public a() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(h1 h1Var) {
            h1Var.c(i0.this.I());
            h1Var.a(true);
            h1Var.b();
            r0.n.j(h1Var.d(), new C0451a(), i0.this.f22769i);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            i0.this.K(0, "Unable to acquire InputBuffer.", th2);
        }
    }

    public class b extends j1 {
        public b(MediaCodec mediaCodec, int i10) {
            super(mediaCodec, i10);
        }

        @Override // m1.j1, m1.h1
        public void c(long j10) {
            i0 i0Var = i0.this;
            if (!i0Var.f22763c) {
                j10 = i0Var.e0(j10);
            }
            super.c(j10);
        }
    }

    public class c implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f22790a;
        public final /* synthetic */ o1 b;

        public c(t.a aVar, o1 o1Var) {
            this.f22790a = aVar;
            this.b = o1Var;
        }

        @Override // m1.o1
        public long a() {
            return ((Long) this.f22790a.apply(Long.valueOf(this.b.a()))).longValue();
        }

        @Override // m1.o1
        public long b() {
            return ((Long) this.f22790a.apply(Long.valueOf(this.b.b()))).longValue();
        }
    }

    public static class d {
        public static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        public static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    public class e implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<a3.a<? super h1.c.a>, Executor> f22791a = new LinkedHashMap();
        public h1.c.a b = h1.c.a.INACTIVE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<pe.x<h1>> f22792c = new ArrayList();

        public e() {
        }

        public static /* synthetic */ Object h(final e eVar, final y1.c.a aVar) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(this.f22847a.b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(e eVar, final a3.a aVar, Executor executor) {
            eVar.f22791a.put((a3.a) x2.g.g(aVar), (Executor) x2.g.g(executor));
            final h1.c.a aVar2 = eVar.b;
            executor.execute(new Runnable() { // from class: m1.r0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final e eVar, final y1.c.a aVar) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.s0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.n(this.f22858a, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final e eVar, y1.c.a aVar) {
            h1.c.a aVar2 = eVar.b;
            if (aVar2 == h1.c.a.ACTIVE) {
                final pe.x<h1> xVarF = i0.this.F();
                r0.n.t(xVarF, aVar);
                aVar.a(new Runnable() { // from class: m1.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22822a.p(xVarF);
                    }
                }, q0.c.b());
                eVar.f22792c.add(xVarF);
                xVarF.a(new Runnable() { // from class: m1.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22836a.f22792c.remove(xVarF);
                    }
                }, i0.this.f22769i);
                return;
            }
            if (aVar2 == h1.c.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + eVar.b));
        }

        @Override // n0.a3
        public pe.x<h1.c.a> b() {
            return y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.m0
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return i0.e.h(this.f22840a, aVar);
                }
            });
        }

        @Override // n0.a3
        public void c(final Executor executor, final a3.a<? super h1.c.a> aVar) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.l0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.i(this.f22837a, aVar, executor);
                }
            });
        }

        @Override // n0.a3
        public void d(final a3.a<? super h1.c.a> aVar) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22843a.f22791a.remove(x2.g.g(aVar));
                }
            });
        }

        @Override // h1.c
        public pe.x<h1> e() {
            return y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.p0
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return i0.e.m(this.f22845a, aVar);
                }
            });
        }

        public final void p(pe.x<h1> xVar) {
            if (xVar.cancel(true)) {
                return;
            }
            x2.g.i(xVar.isDone());
            try {
                xVar.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                g0.r1.l(i0.this.f22762a, "Unable to cancel the input buffer: " + e10);
            }
        }

        public void q(boolean z10) {
            final h1.c.a aVar = z10 ? h1.c.a.ACTIVE : h1.c.a.INACTIVE;
            if (this.b == aVar) {
                return;
            }
            this.b = aVar;
            if (aVar == h1.c.a.INACTIVE) {
                Iterator<pe.x<h1>> it = this.f22792c.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.f22792c.clear();
            }
            for (final Map.Entry<a3.a<? super h1.c.a>, Executor> entry : this.f22791a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: m1.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((a3.a) entry.getKey()).a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d(i0.this.f22762a, "Unable to post to the supplied executor.", e10);
                }
            }
        }
    }

    public enum f {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    public class g extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o1.h f22803a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22804c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22805d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22806e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f22807f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f22808g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22809h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22810i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f22811j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f22812k;

        public class a implements r0.c<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f22814a;

            public a(k kVar) {
                this.f22814a = kVar;
            }

            @Override // r0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r10) {
                i0.this.f22775o.remove(this.f22814a);
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                i0.this.f22775o.remove(this.f22814a);
                if (th2 instanceof MediaCodec.CodecException) {
                    i0.this.L((MediaCodec.CodecException) th2);
                } else {
                    i0.this.K(0, th2.getMessage(), th2);
                }
            }
        }

        public g() {
            this.b = true;
            boolean z10 = i0.this.f22763c;
            this.f22812k = z10;
            if (z10) {
                this.f22803a = new o1.h(i0.this.f22778r, i0.this.f22777q, (CameraUseInconsistentTimebaseQuirk) k1.c.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f22803a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) k1.c.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.h(i0.this.f22765e.getString("mime"))) {
                return;
            }
            this.b = false;
        }

        public static /* synthetic */ MediaFormat a(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        public static /* synthetic */ void b(g gVar, Executor executor, final m mVar) {
            if (i0.this.f22783w == f.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(mVar);
                executor.execute(new Runnable() { // from class: m1.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mVar.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f22762a, "Unable to post to the supplied executor.", e10);
            }
        }

        public static /* synthetic */ void e(g gVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            i0 i0Var;
            final m mVar;
            Executor executor;
            if (gVar.f22811j) {
                g0.r1.l(i0.this.f22762a, "Receives frame after codec is reset.");
                return;
            }
            switch (i0.this.f22783w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (i0.this.b) {
                        i0Var = i0.this;
                        mVar = i0Var.f22781u;
                        executor = i0Var.f22782v;
                        break;
                    }
                    if (i0Var.f22763c && i0Var.S()) {
                        bufferInfo.presentationTimeUs = i0.this.e0(bufferInfo.presentationTimeUs);
                    }
                    if (!gVar.f22804c) {
                        gVar.f22804c = true;
                        try {
                            Objects.requireNonNull(mVar);
                            executor.execute(new Runnable() { // from class: m1.z0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    mVar.e();
                                }
                            });
                        } catch (RejectedExecutionException e10) {
                            g0.r1.d(i0.this.f22762a, "Unable to post to the supplied executor.", e10);
                        }
                        break;
                    }
                    if (!gVar.i(bufferInfo)) {
                        try {
                            i0.this.f22766f.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e11) {
                            i0.this.L(e11);
                            return;
                        }
                        break;
                    } else {
                        if (!gVar.f22805d) {
                            gVar.f22805d = true;
                            g0.r1.a(i0.this.f22762a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + i0.this.f22777q + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoM = gVar.m(bufferInfo);
                        gVar.f22808g = bufferInfoM.presentationTimeUs;
                        try {
                            gVar.n(new k(mediaCodec, i10, bufferInfoM), mVar, executor);
                        } catch (MediaCodec.CodecException e12) {
                            i0.this.L(e12);
                            return;
                        }
                        break;
                    }
                    if (!gVar.f22806e && gVar.j(bufferInfo)) {
                        gVar.l();
                    }
                    if (gVar.f22812k) {
                        gVar.f22812k = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f22783w);
            }
        }

        public static /* synthetic */ void f(g gVar, final MediaFormat mediaFormat) {
            final m mVar;
            Executor executor;
            if (gVar.f22811j) {
                g0.r1.l(i0.this.f22762a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (i0.this.f22783w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    i0 i0Var = i0.this;
                    if (i0Var.f22763c && i0Var.S()) {
                        mediaFormat.setInteger("time-lapse-enable", 1);
                        mediaFormat.setInteger("time-lapse-fps", ((p1) i0.this.f22764d).f());
                    }
                    synchronized (i0.this.b) {
                        i0 i0Var2 = i0.this;
                        mVar = i0Var2.f22781u;
                        executor = i0Var2.f22782v;
                        break;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: m1.a1
                            @Override // java.lang.Runnable
                            public final void run() {
                                mVar.f(new l1() { // from class: m1.d1
                                    @Override // m1.l1
                                    public final MediaFormat a() {
                                        return i0.g.a(mediaFormat);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e10) {
                        g0.r1.d(i0.this.f22762a, "Unable to post to the supplied executor.", e10);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f22783w);
            }
        }

        public static /* synthetic */ void g(g gVar, int i10) {
            if (gVar.f22811j) {
                g0.r1.l(i0.this.f22762a, "Receives input frame after codec is reset.");
                return;
            }
            switch (i0.this.f22783w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    i0.this.f22772l.offer(Integer.valueOf(i10));
                    i0.this.T();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f22783w);
            }
        }

        public static /* synthetic */ void h(g gVar, MediaCodec.CodecException codecException) {
            switch (i0.this.f22783w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    i0.this.L(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f22783w);
            }
        }

        public final boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f22806e) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by codec config.");
                return false;
            }
            o1.h hVar = this.f22803a;
            if (hVar != null) {
                bufferInfo.presentationTimeUs = hVar.b(bufferInfo.presentationTimeUs);
            }
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 <= this.f22807f) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f22807f = j10;
            if (!i0.this.f22784x.contains(Long.valueOf(j10))) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by not in start-stop range.");
                i0 i0Var = i0.this;
                if (i0Var.f22786z && bufferInfo.presentationTimeUs >= ((Long) i0Var.f22784x.getUpper()).longValue()) {
                    Future<?> future = i0.this.B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    i0.this.A = Long.valueOf(bufferInfo.presentationTimeUs);
                    i0.this.a0();
                    i0.this.f22786z = false;
                }
                return false;
            }
            if (q(bufferInfo)) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by pause.");
                return false;
            }
            if (i0.this.J(bufferInfo) <= this.f22808g) {
                g0.r1.a(i0.this.f22762a, "Drop buffer by adjusted time is less than the last sent time.");
                if (i0.this.f22763c && i0.Q(bufferInfo)) {
                    this.f22810i = true;
                }
                return false;
            }
            if (!this.f22805d && !this.f22810i && i0.this.f22763c) {
                this.f22810i = true;
            }
            if (this.f22810i) {
                if (!i0.Q(bufferInfo)) {
                    g0.r1.a(i0.this.f22762a, "Drop buffer by not a key frame.");
                    i0.this.W();
                    return false;
                }
                this.f22810i = false;
            }
            return true;
        }

        public final boolean j(MediaCodec.BufferInfo bufferInfo) {
            if (!i0.N(bufferInfo) || o()) {
                return this.b && k(bufferInfo);
            }
            return true;
        }

        public final boolean k(MediaCodec.BufferInfo bufferInfo) {
            i0 i0Var = i0.this;
            return i0Var.F && bufferInfo.presentationTimeUs > ((Long) i0Var.f22784x.getUpper()).longValue();
        }

        public void l() {
            i0 i0Var;
            final m mVar;
            final Executor executor;
            g0.r1.a(i0.this.f22762a, "reachEndData");
            if (this.f22806e) {
                return;
            }
            this.f22806e = true;
            if (i0.this.G != null) {
                i0.this.G.cancel(false);
                i0.this.G = null;
            }
            synchronized (i0.this.b) {
                i0Var = i0.this;
                mVar = i0Var.f22781u;
                executor = i0Var.f22782v;
            }
            i0Var.d0(new Runnable() { // from class: m1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.b(this.f22712a, executor, mVar);
                }
            });
        }

        public final MediaCodec.BufferInfo m(MediaCodec.BufferInfo bufferInfo) {
            long J = i0.this.J(bufferInfo);
            if (bufferInfo.presentationTimeUs == J) {
                return bufferInfo;
            }
            x2.g.i(J > this.f22808g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, J, bufferInfo.flags);
            return bufferInfo2;
        }

        public final void n(final k kVar, final m mVar, Executor executor) {
            i0.this.f22775o.add(kVar);
            r0.n.j(kVar.b(), new a(kVar), i0.this.f22769i);
            try {
                executor.execute(new Runnable() { // from class: m1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        mVar.b(kVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f22762a, "Unable to post to the supplied executor.", e10);
                kVar.close();
            }
        }

        public final boolean o() {
            return this.f22812k && k1.c.b(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.h(this.f22875a, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i10) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.v0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.g(this.f22869a, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            i0.this.f22769i.execute(new Runnable() { // from class: m1.w0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.e(this.f22871a, bufferInfo, mediaCodec, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            g0.r1.a(i0.this.f22762a, "onOutputFormatChanged: mediaFormat = " + mediaFormat + ", CSD data = " + h1.d.d(mediaFormat));
            i0.this.f22769i.execute(new Runnable() { // from class: m1.y0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.f(this.f22877a, mediaFormat);
                }
            });
        }

        public void p() {
            this.f22811j = true;
        }

        public final boolean q(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final m mVar;
            i0.this.g0(bufferInfo.presentationTimeUs);
            boolean zP = i0.this.P(bufferInfo.presentationTimeUs);
            boolean z10 = this.f22809h;
            if (!z10 && zP) {
                g0.r1.a(i0.this.f22762a, "Switch to pause state");
                this.f22809h = true;
                synchronized (i0.this.b) {
                    i0 i0Var = i0.this;
                    executor = i0Var.f22782v;
                    mVar = i0Var.f22781u;
                }
                Objects.requireNonNull(mVar);
                executor.execute(new Runnable() { // from class: m1.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mVar.d();
                    }
                });
                i0 i0Var2 = i0.this;
                if (i0Var2.f22783w == f.PAUSED && ((i0Var2.f22763c || k1.c.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!i0.this.f22763c || k1.c.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    l.b bVar = i0.this.f22767g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(false);
                    }
                    i0.this.Y(true);
                }
                i0.this.A = Long.valueOf(bufferInfo.presentationTimeUs);
                i0 i0Var3 = i0.this;
                if (i0Var3.f22786z) {
                    Future<?> future = i0Var3.B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    i0.this.a0();
                    i0.this.f22786z = false;
                }
            } else if (z10 && !zP) {
                g0.r1.a(i0.this.f22762a, "Switch to resume state");
                this.f22809h = false;
                if (i0.this.f22763c && !i0.Q(bufferInfo)) {
                    this.f22810i = true;
                }
            }
            return this.f22809h;
        }
    }

    public class h implements l.c {
        public Surface b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l.c.a f22817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f22818e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f22815a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<Surface> f22816c = new HashSet();

        public h() {
        }

        @Override // m1.l.c
        public void a(Executor executor, l.c.a aVar) {
            Surface surface;
            synchronized (this.f22815a) {
                this.f22817d = (l.c.a) x2.g.g(aVar);
                this.f22818e = (Executor) x2.g.g(executor);
                surface = this.b;
            }
            if (surface != null) {
                c(executor, aVar, surface);
            }
        }

        public final void c(Executor executor, final l.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: m1.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(surface);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f22762a, "Unable to post to the supplied executor.", e10);
            }
        }

        public void d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f22815a) {
                surface = this.b;
                this.b = null;
                hashSet = new HashSet(this.f22816c);
                this.f22816c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        @SuppressLint({"NewApi"})
        public void e() {
            Surface surfaceCreateInputSurface;
            l.c.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) k1.c.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f22815a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.b == null) {
                            surfaceCreateInputSurface = d.a();
                            this.b = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        d.b(i0.this.f22766f, this.b);
                    } else {
                        Surface surface = this.b;
                        if (surface != null) {
                            this.f22816c.add(surface);
                        }
                        surfaceCreateInputSurface = i0.this.f22766f.createInputSurface();
                        this.b = surfaceCreateInputSurface;
                    }
                    aVar = this.f22817d;
                    executor = this.f22818e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (surfaceCreateInputSurface == null || aVar == null || executor == null) {
                return;
            }
            c(executor, aVar, surfaceCreateInputSurface);
        }
    }

    public i0(Executor executor, n nVar, int i10) throws k1 {
        boolean z10 = false;
        x2.g.g(executor);
        this.f22764d = (n) x2.g.g(nVar);
        MediaCodec mediaCodecB = n1.a.b(nVar);
        this.f22766f = mediaCodecB;
        MediaCodecInfo codecInfo = mediaCodecB.getCodecInfo();
        this.f22769i = q0.c.g(executor);
        MediaFormat mediaFormatA = nVar.a();
        this.f22765e = mediaFormatA;
        a4 a4VarC = nVar.c();
        this.f22777q = a4VarC;
        this.f22778r = f0(new n1(), new t.a() { // from class: m1.d0
            @Override // t.a
            public final Object apply(Object obj) {
                return Long.valueOf(this.f22746a.e0(((Long) obj).longValue()));
            }
        });
        if (nVar instanceof m1.a) {
            m1.a aVar = (m1.a) nVar;
            this.f22762a = "AudioEncoder";
            this.f22763c = false;
            this.f22767g = new e();
            this.f22768h = new m1.b(codecInfo, nVar.b());
            this.f22779s = new Rational(aVar.f(), aVar.h());
        } else {
            if (!(nVar instanceof p1)) {
                throw new k1("Unknown encoder config type");
            }
            p1 p1Var = (p1) nVar;
            this.f22762a = "VideoEncoder";
            this.f22763c = true;
            this.f22767g = new h();
            t1 t1Var = new t1(codecInfo, nVar.b());
            H(t1Var, mediaFormatA);
            this.f22768h = t1Var;
            this.f22779s = new Rational(p1Var.f(), p1Var.i());
        }
        g0.r1.a(this.f22762a, "mInputTimebase = " + a4VarC);
        g0.r1.a(this.f22762a, "mMediaFormat = " + mediaFormatA);
        g0.r1.a(this.f22762a, "mCaptureToEncodeFrameRateRatio = " + this.f22779s);
        try {
            X();
            final AtomicReference atomicReference = new AtomicReference();
            this.f22770j = r0.n.s(y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.e0
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar2) {
                    return i0.v(atomicReference, aVar2);
                }
            }));
            this.f22771k = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
            if (this.f22763c && i10 == 1 && k1.c.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z10 = true;
            }
            this.f22780t = z10;
            Z(f.CONFIGURED);
        } catch (MediaCodec.CodecException e10) {
            throw new k1(e10);
        }
    }

    public static boolean N(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    public static boolean Q(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    public static boolean R(Rational rational) {
        return rational != null && rational.getDenominator() == rational.getNumerator();
    }

    public static o1 f0(o1 o1Var, t.a<Long, Long> aVar) {
        return new c(aVar, o1Var);
    }

    public static /* synthetic */ void i(i0 i0Var) {
        if (i0Var.f22786z) {
            g0.r1.l(i0Var.f22762a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            i0Var.A = null;
            i0Var.a0();
            i0Var.f22786z = false;
        }
    }

    public static /* synthetic */ void k(i0 i0Var) {
        int iOrdinal = i0Var.f22783w.ordinal();
        if (iOrdinal == 1) {
            i0Var.W();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public static /* synthetic */ void m(i0 i0Var, long j10) {
        switch (i0Var.f22783w) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                g0.r1.a(i0Var.f22762a, "Pause on " + h1.d.f(j10));
                i0Var.f22776p.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                i0Var.Z(f.PAUSED);
                return;
            case PENDING_START:
                i0Var.Z(f.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f22783w);
        }
    }

    public static /* synthetic */ void n(Executor executor, final g gVar) {
        Objects.requireNonNull(gVar);
        executor.execute(new Runnable() { // from class: m1.c0
            @Override // java.lang.Runnable
            public final void run() {
                gVar.l();
            }
        });
    }

    public static /* synthetic */ void q(i0 i0Var) {
        i0Var.E = true;
        if (i0Var.D) {
            if (!i0Var.f22780t) {
                g0.r1.a(i0Var.f22762a, "mMediaCodec.stop()");
                i0Var.f22766f.stop();
            }
            i0Var.X();
        }
    }

    public static /* synthetic */ void s(final i0 i0Var, long j10, long j11) {
        switch (i0Var.f22783w) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                f fVar = i0Var.f22783w;
                i0Var.Z(f.STOPPING);
                Long l10 = (Long) i0Var.f22784x.getLower();
                long jLongValue = l10.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j10 == -1) {
                    j10 = j11;
                } else if (j10 < jLongValue) {
                    g0.r1.l(i0Var.f22762a, "The expected stop time is less than the start time. Use current time as stop time.");
                    j10 = j11;
                }
                if (j10 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                i0Var.f22784x = Range.create(l10, Long.valueOf(j10));
                g0.r1.a(i0Var.f22762a, "Stop on " + h1.d.f(j10));
                if (fVar == f.PAUSED && i0Var.A != null) {
                    i0Var.a0();
                    return;
                } else {
                    i0Var.f22786z = true;
                    i0Var.B = q0.c.e().schedule(new Runnable() { // from class: m1.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            i0 i0Var2 = this.f22868a;
                            i0Var2.f22769i.execute(new Runnable() { // from class: m1.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i0.i(i0Var2);
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
            case PENDING_START:
            case PENDING_START_PAUSED:
                i0Var.Z(f.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f22783w);
        }
    }

    public static /* synthetic */ void t(i0 i0Var, long j10) {
        switch (i0Var.f22783w) {
            case CONFIGURED:
                i0Var.A = null;
                g0.r1.a(i0Var.f22762a, "Start on " + h1.d.f(j10));
                try {
                    if (i0Var.D) {
                        i0Var.X();
                    }
                    i0Var.f22784x = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    g0.r1.a(i0Var.f22762a, "mMediaCodec.start()");
                    i0Var.f22766f.start();
                    l.b bVar = i0Var.f22767g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(true);
                    }
                    i0Var.Z(f.STARTED);
                    return;
                } catch (MediaCodec.CodecException e10) {
                    i0Var.L(e10);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                i0Var.A = null;
                Range<Long> rangeRemoveLast = i0Var.f22776p.removeLast();
                x2.g.j(rangeRemoveLast != null && ((Long) rangeRemoveLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l10 = (Long) rangeRemoveLast.getLower();
                long jLongValue = l10.longValue();
                i0Var.f22776p.addLast(Range.create(l10, Long.valueOf(j10)));
                g0.r1.a(i0Var.f22762a, "Resume on " + h1.d.f(j10) + "\nPaused duration = " + h1.d.f(j10 - jLongValue));
                if ((i0Var.f22763c || k1.c.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!i0Var.f22763c || k1.c.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    i0Var.Y(false);
                    l.b bVar2 = i0Var.f22767g;
                    if (bVar2 instanceof e) {
                        ((e) bVar2).q(true);
                    }
                }
                if (i0Var.f22763c) {
                    i0Var.W();
                }
                i0Var.Z(f.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                i0Var.Z(f.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f22783w);
        }
    }

    public static /* synthetic */ Object v(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ void x(i0 i0Var, List list, Runnable runnable) {
        if (i0Var.f22783w != f.ERROR) {
            if (!list.isEmpty()) {
                g0.r1.a(i0Var.f22762a, "encoded data and input buffers are returned");
            }
            if (!(i0Var.f22767g instanceof h) || i0Var.E || i0Var.O()) {
                g0.r1.a(i0Var.f22762a, "mMediaCodec.stop()");
                i0Var.f22766f.stop();
            } else {
                if (i0Var.f22780t) {
                    g0.r1.a(i0Var.f22762a, "mMediaCodec.stop()");
                    i0Var.f22766f.stop();
                } else {
                    g0.r1.a(i0Var.f22762a, "mMediaCodec.flush()");
                    i0Var.f22766f.flush();
                }
                i0Var.D = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        i0Var.M();
    }

    public static /* synthetic */ void y(i0 i0Var) {
        switch (i0Var.f22783w) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                i0Var.V();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                i0Var.Z(f.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f22783w);
        }
    }

    public static /* synthetic */ Object z(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    public pe.x<h1> F() {
        switch (this.f22783w) {
            case CONFIGURED:
                return r0.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                pe.x<h1> xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: m1.a0
                    @Override // y1.c.InterfaceC0761c
                    public final Object a(y1.c.a aVar) {
                        return i0.z(atomicReference, aVar);
                    }
                });
                final y1.c.a<h1> aVar = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
                this.f22773m.offer(aVar);
                aVar.a(new Runnable() { // from class: m1.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22711a.f22773m.remove(aVar);
                    }
                }, this.f22769i);
                T();
                return xVarA;
            case ERROR:
                return r0.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return r0.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f22783w);
        }
    }

    public final void G() {
        if (k1.c.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final g gVar = this.C;
            final Executor executor = this.f22769i;
            Future<?> future = this.G;
            if (future != null) {
                future.cancel(false);
            }
            this.G = q0.c.e().schedule(new Runnable() { // from class: m1.z
                @Override // java.lang.Runnable
                public final void run() {
                    i0.n(executor, gVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void H(r1 r1Var, MediaFormat mediaFormat) {
        x2.g.i(this.f22763c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) r1Var.g().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
                g0.r1.a(this.f22762a, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    public long I() {
        return this.f22778r.b();
    }

    public long J(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f22785y;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    public void K(final int i10, final String str, final Throwable th2) {
        switch (this.f22783w) {
            case CONFIGURED:
                U(i10, str, th2);
                X();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                Z(f.ERROR);
                d0(new Runnable() { // from class: m1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22852a.U(i10, str, th2);
                    }
                });
                break;
            case ERROR:
                g0.r1.m(this.f22762a, "Get more than one error: " + str + "(" + i10 + ")", th2);
                break;
        }
    }

    public void L(MediaCodec.CodecException codecException) {
        K(1, codecException.getMessage(), codecException);
    }

    public void M() {
        f fVar = this.f22783w;
        if (fVar == f.PENDING_RELEASE) {
            V();
            return;
        }
        if (!this.D) {
            X();
        }
        Z(f.CONFIGURED);
        if (fVar == f.PENDING_START || fVar == f.PENDING_START_PAUSED) {
            start();
            if (fVar == f.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    public final boolean O() {
        return k1.c.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    public boolean P(long j10) {
        for (Range<Long> range : this.f22776p) {
            if (range.contains(Long.valueOf(j10))) {
                return true;
            }
            if (j10 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    public final boolean S() {
        return !R(this.f22779s);
    }

    public void T() {
        while (!this.f22773m.isEmpty() && !this.f22772l.isEmpty()) {
            y1.c.a aVarPoll = this.f22773m.poll();
            Objects.requireNonNull(aVarPoll);
            Integer numPoll = this.f22772l.poll();
            Objects.requireNonNull(numPoll);
            try {
                final b bVar = new b(this.f22766f, numPoll.intValue());
                if (aVarPoll.c(bVar)) {
                    this.f22774n.add(bVar);
                    bVar.d().a(new Runnable() { // from class: m1.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22870a.f22774n.remove(bVar);
                        }
                    }, this.f22769i);
                } else {
                    bVar.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                L(e10);
                return;
            }
        }
    }

    public void U(final int i10, final String str, final Throwable th2) {
        final m mVar;
        Executor executor;
        synchronized (this.b) {
            mVar = this.f22781u;
            executor = this.f22782v;
        }
        try {
            executor.execute(new Runnable() { // from class: m1.t
                @Override // java.lang.Runnable
                public final void run() {
                    mVar.c(new h(i10, str, th2));
                }
            });
        } catch (RejectedExecutionException e10) {
            g0.r1.d(this.f22762a, "Unable to post to the supplied executor.", e10);
        }
    }

    public final void V() {
        g0.r1.a(this.f22762a, "releaseInternal");
        if (this.D) {
            if (!this.f22780t) {
                g0.r1.a(this.f22762a, "mMediaCodec.stop()");
                this.f22766f.stop();
            }
            this.D = false;
        }
        g0.r1.a(this.f22762a, "mMediaCodec.release()");
        this.f22766f.release();
        l.b bVar = this.f22767g;
        if (bVar instanceof h) {
            ((h) bVar).d();
        }
        Z(f.RELEASED);
        this.f22771k.c(null);
    }

    public void W() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        g0.r1.a(this.f22762a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.f22766f.setParameters(bundle);
    }

    public final void X() {
        this.f22784x = H;
        this.f22785y = 0L;
        this.f22776p.clear();
        this.f22772l.clear();
        Iterator<y1.c.a<h1>> it = this.f22773m.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f22773m.clear();
        g0.r1.a(this.f22762a, "mMediaCodec.reset()");
        this.f22766f.reset();
        this.D = false;
        this.E = false;
        this.F = false;
        this.f22786z = false;
        Future<?> future = this.B;
        if (future != null) {
            future.cancel(true);
            this.B = null;
        }
        Future<?> future2 = this.G;
        if (future2 != null) {
            future2.cancel(false);
            this.G = null;
        }
        g gVar = this.C;
        if (gVar != null) {
            gVar.p();
        }
        this.C = new g();
        g0.r1.a(this.f22762a, "mMediaCodec.setCallback()");
        this.f22766f.setCallback(this.C);
        g0.r1.a(this.f22762a, "mMediaCodec.configure()");
        this.f22766f.configure(this.f22765e, (Surface) null, (MediaCrypto) null, 1);
        l.b bVar = this.f22767g;
        if (bVar instanceof h) {
            ((h) bVar).e();
        }
    }

    public void Y(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        g0.r1.a(this.f22762a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z10);
        this.f22766f.setParameters(bundle);
    }

    public final void Z(f fVar) {
        if (this.f22783w == fVar) {
            return;
        }
        g0.r1.a(this.f22762a, "Transitioning encoder internal state: " + this.f22783w + " --> " + fVar);
        this.f22783w = fVar;
    }

    @Override // m1.l
    public void a() {
        this.f22769i.execute(new Runnable() { // from class: m1.g0
            @Override // java.lang.Runnable
            public final void run() {
                i0.y(this.f22758a);
            }
        });
    }

    public void a0() {
        g0.r1.a(this.f22762a, "signalCodecStop");
        l.b bVar = this.f22767g;
        if (bVar instanceof e) {
            ((e) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator<h1> it = this.f22774n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
            r0.n.w(arrayList).a(new Runnable() { // from class: m1.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22876a.b0();
                }
            }, this.f22769i);
            return;
        }
        if (bVar instanceof h) {
            try {
                G();
                g0.r1.a(this.f22762a, "mMediaCodec.signalEndOfInputStream()");
                this.f22766f.signalEndOfInputStream();
                this.F = true;
            } catch (MediaCodec.CodecException e10) {
                L(e10);
            }
        }
    }

    @Override // m1.l
    public l.b b() {
        return this.f22767g;
    }

    public final void b0() {
        g0.r1.a(this.f22762a, "signalEndOfInputStream");
        r0.n.j(F(), new a(), this.f22769i);
    }

    @Override // m1.l
    public void c(m mVar, Executor executor) {
        synchronized (this.b) {
            this.f22781u = mVar;
            this.f22782v = executor;
        }
    }

    public void c0() {
        g0.r1.a(this.f22762a, "signalSourceStopped");
        this.f22769i.execute(new Runnable() { // from class: m1.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.q(this.f22761a);
            }
        });
    }

    @Override // m1.l
    public void d(final long j10) {
        final long jI = I();
        this.f22769i.execute(new Runnable() { // from class: m1.s
            @Override // java.lang.Runnable
            public final void run() {
                i0.s(this.f22856a, j10, jI);
            }
        });
    }

    public void d0(final Runnable runnable) {
        g0.r1.a(this.f22762a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<k> it = this.f22775o.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Iterator<h1> it2 = this.f22774n.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().d());
        }
        if (!arrayList.isEmpty()) {
            g0.r1.a(this.f22762a, "Waiting for resources to return. encoded data = " + this.f22775o.size() + ", input buffers = " + this.f22774n.size());
        }
        r0.n.w(arrayList).a(new Runnable() { // from class: m1.u
            @Override // java.lang.Runnable
            public final void run() {
                i0.x(this.f22865a, arrayList, runnable);
            }
        }, this.f22769i);
    }

    @Override // m1.l
    public f1 e() {
        return this.f22768h;
    }

    public final long e0(long j10) {
        return S() ? Math.round(j10 * this.f22779s.doubleValue()) : j10;
    }

    @Override // m1.l
    public pe.x<Void> f() {
        return this.f22770j;
    }

    @Override // m1.l
    public void g() {
        this.f22769i.execute(new Runnable() { // from class: m1.p
            @Override // java.lang.Runnable
            public final void run() {
                i0.k(this.f22844a);
            }
        });
    }

    public void g0(long j10) {
        while (!this.f22776p.isEmpty()) {
            Range<Long> first = this.f22776p.getFirst();
            if (j10 <= ((Long) first.getUpper()).longValue()) {
                return;
            }
            this.f22776p.removeFirst();
            this.f22785y += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
            g0.r1.a(this.f22762a, "Total paused duration = " + h1.d.f(this.f22785y));
        }
    }

    @Override // m1.l
    public int h() {
        if (this.f22765e.containsKey("bitrate")) {
            return this.f22765e.getInteger("bitrate");
        }
        return 0;
    }

    @Override // m1.l
    public void pause() {
        final long jI = I();
        this.f22769i.execute(new Runnable() { // from class: m1.f0
            @Override // java.lang.Runnable
            public final void run() {
                i0.m(this.f22754a, jI);
            }
        });
    }

    @Override // m1.l
    public void start() {
        final long jI = I();
        this.f22769i.execute(new Runnable() { // from class: m1.q
            @Override // java.lang.Runnable
            public final void run() {
                i0.t(this.f22846a, jI);
            }
        });
    }
}
