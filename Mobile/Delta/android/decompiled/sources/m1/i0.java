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
    public final String f24402a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f24404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaFormat f24405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaCodec f24406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l.b f24407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1 f24408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f24409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ne.x<Void> f24410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y1.c.a<Void> f24411k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a4 f24417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o1 f24418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rational f24419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f24420t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f24423w;
    public final Object b = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Queue<Integer> f24412l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Queue<y1.c.a<h1>> f24413m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<h1> f24414n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<k> f24415o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Deque<Range<Long>> f24416p = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f24421u = m.f24479a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Executor f24422v = q0.c.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Range<Long> f24424x = H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f24425y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24426z = false;
    public Long A = null;
    public Future<?> B = null;
    public g C = null;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    public class a implements r0.c<h1> {

        /* JADX INFO: renamed from: m1.i0$a$a, reason: collision with other inner class name */
        public class C0433a implements r0.c<Void> {
            public C0433a() {
            }

            @Override // r0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r8) {
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
            r0.n.j(h1Var.d(), new C0433a(), i0.this.f24409i);
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
            if (!i0Var.f24403c) {
                j10 = i0Var.e0(j10);
            }
            super.c(j10);
        }
    }

    public class c implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f24430a;
        public final /* synthetic */ o1 b;

        public c(t.a aVar, o1 o1Var) {
            this.f24430a = aVar;
            this.b = o1Var;
        }

        @Override // m1.o1
        public long a() {
            return ((Long) this.f24430a.apply(Long.valueOf(this.b.a()))).longValue();
        }

        @Override // m1.o1
        public long b() {
            return ((Long) this.f24430a.apply(Long.valueOf(this.b.b()))).longValue();
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
        public final Map<a3.a<? super h1.c.a>, Executor> f24431a = new LinkedHashMap();
        public h1.c.a b = h1.c.a.INACTIVE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ne.x<h1>> f24432c = new ArrayList();

        public e() {
        }

        public static /* synthetic */ Object h(final e eVar, final y1.c.a aVar) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(this.f24487a.b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(e eVar, final a3.a aVar, Executor executor) {
            eVar.f24431a.put((a3.a) x2.g.g(aVar), (Executor) x2.g.g(executor));
            final h1.c.a aVar2 = eVar.b;
            executor.execute(new Runnable() { // from class: m1.r0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final e eVar, final y1.c.a aVar) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.s0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.n(this.f24498a, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final e eVar, y1.c.a aVar) {
            h1.c.a aVar2 = eVar.b;
            if (aVar2 == h1.c.a.ACTIVE) {
                final ne.x<h1> xVarF = i0.this.F();
                r0.n.t(xVarF, aVar);
                aVar.a(new Runnable() { // from class: m1.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24462a.p(xVarF);
                    }
                }, q0.c.b());
                eVar.f24432c.add(xVarF);
                xVarF.a(new Runnable() { // from class: m1.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24476a.f24432c.remove(xVarF);
                    }
                }, i0.this.f24409i);
                return;
            }
            if (aVar2 == h1.c.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + eVar.b));
        }

        @Override // n0.a3
        public ne.x<h1.c.a> b() {
            return y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.m0
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return i0.e.h(this.f24480a, aVar);
                }
            });
        }

        @Override // n0.a3
        public void c(final Executor executor, final a3.a<? super h1.c.a> aVar) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.l0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.e.i(this.f24477a, aVar, executor);
                }
            });
        }

        @Override // n0.a3
        public void d(final a3.a<? super h1.c.a> aVar) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24483a.f24431a.remove(x2.g.g(aVar));
                }
            });
        }

        @Override // h1.c
        public ne.x<h1> e() {
            return y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.p0
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return i0.e.m(this.f24485a, aVar);
                }
            });
        }

        public final void p(ne.x<h1> xVar) {
            if (xVar.cancel(true)) {
                return;
            }
            x2.g.i(xVar.isDone());
            try {
                xVar.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                g0.r1.l(i0.this.f24402a, "Unable to cancel the input buffer: " + e10);
            }
        }

        public void q(boolean z10) {
            final h1.c.a aVar = z10 ? h1.c.a.ACTIVE : h1.c.a.INACTIVE;
            if (this.b == aVar) {
                return;
            }
            this.b = aVar;
            if (aVar == h1.c.a.INACTIVE) {
                Iterator<ne.x<h1>> it = this.f24432c.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.f24432c.clear();
            }
            for (final Map.Entry<a3.a<? super h1.c.a>, Executor> entry : this.f24431a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: m1.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((a3.a) entry.getKey()).a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d(i0.this.f24402a, "Unable to post to the supplied executor.", e10);
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
        public final o1.h f24443a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24444c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24445d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24446e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f24447f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f24448g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f24449h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f24450i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f24451j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f24452k;

        public class a implements r0.c<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f24454a;

            public a(k kVar) {
                this.f24454a = kVar;
            }

            @Override // r0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r8) {
                i0.this.f24415o.remove(this.f24454a);
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                i0.this.f24415o.remove(this.f24454a);
                if (th2 instanceof MediaCodec.CodecException) {
                    i0.this.L((MediaCodec.CodecException) th2);
                } else {
                    i0.this.K(0, th2.getMessage(), th2);
                }
            }
        }

        public g() {
            this.b = true;
            boolean z10 = i0.this.f24403c;
            this.f24452k = z10;
            if (z10) {
                this.f24443a = new o1.h(i0.this.f24418r, i0.this.f24417q, (CameraUseInconsistentTimebaseQuirk) k1.c.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f24443a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) k1.c.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.h(i0.this.f24405e.getString("mime"))) {
                return;
            }
            this.b = false;
        }

        public static /* synthetic */ MediaFormat a(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        public static /* synthetic */ void b(g gVar, Executor executor, final m mVar) {
            if (i0.this.f24423w == f.ERROR) {
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
                g0.r1.d(i0.this.f24402a, "Unable to post to the supplied executor.", e10);
            }
        }

        public static /* synthetic */ void e(g gVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            i0 i0Var;
            final m mVar;
            Executor executor;
            if (gVar.f24451j) {
                g0.r1.l(i0.this.f24402a, "Receives frame after codec is reset.");
                return;
            }
            switch (i0.this.f24423w) {
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
                        mVar = i0Var.f24421u;
                        executor = i0Var.f24422v;
                        break;
                    }
                    if (i0Var.f24403c && i0Var.S()) {
                        bufferInfo.presentationTimeUs = i0.this.e0(bufferInfo.presentationTimeUs);
                    }
                    if (!gVar.f24444c) {
                        gVar.f24444c = true;
                        try {
                            Objects.requireNonNull(mVar);
                            executor.execute(new Runnable() { // from class: m1.z0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    mVar.e();
                                }
                            });
                        } catch (RejectedExecutionException e10) {
                            g0.r1.d(i0.this.f24402a, "Unable to post to the supplied executor.", e10);
                        }
                        break;
                    }
                    if (!gVar.i(bufferInfo)) {
                        try {
                            i0.this.f24406f.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e11) {
                            i0.this.L(e11);
                            return;
                        }
                        break;
                    } else {
                        if (!gVar.f24445d) {
                            gVar.f24445d = true;
                            g0.r1.a(i0.this.f24402a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + i0.this.f24417q + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoM = gVar.m(bufferInfo);
                        gVar.f24448g = bufferInfoM.presentationTimeUs;
                        try {
                            gVar.n(new k(mediaCodec, i10, bufferInfoM), mVar, executor);
                        } catch (MediaCodec.CodecException e12) {
                            i0.this.L(e12);
                            return;
                        }
                        break;
                    }
                    if (!gVar.f24446e && gVar.j(bufferInfo)) {
                        gVar.l();
                    }
                    if (gVar.f24452k) {
                        gVar.f24452k = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24423w);
            }
        }

        public static /* synthetic */ void f(g gVar, final MediaFormat mediaFormat) {
            final m mVar;
            Executor executor;
            if (gVar.f24451j) {
                g0.r1.l(i0.this.f24402a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (i0.this.f24423w) {
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
                    if (i0Var.f24403c && i0Var.S()) {
                        mediaFormat.setInteger("time-lapse-enable", 1);
                        mediaFormat.setInteger("time-lapse-fps", ((p1) i0.this.f24404d).f());
                    }
                    synchronized (i0.this.b) {
                        i0 i0Var2 = i0.this;
                        mVar = i0Var2.f24421u;
                        executor = i0Var2.f24422v;
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
                        g0.r1.d(i0.this.f24402a, "Unable to post to the supplied executor.", e10);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24423w);
            }
        }

        public static /* synthetic */ void g(g gVar, int i10) {
            if (gVar.f24451j) {
                g0.r1.l(i0.this.f24402a, "Receives input frame after codec is reset.");
                return;
            }
            switch (i0.this.f24423w) {
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
                    i0.this.f24412l.offer(Integer.valueOf(i10));
                    i0.this.T();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + i0.this.f24423w);
            }
        }

        public static /* synthetic */ void h(g gVar, MediaCodec.CodecException codecException) {
            switch (i0.this.f24423w) {
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
                    throw new IllegalStateException("Unknown state: " + i0.this.f24423w);
            }
        }

        public final boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f24446e) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by codec config.");
                return false;
            }
            o1.h hVar = this.f24443a;
            if (hVar != null) {
                bufferInfo.presentationTimeUs = hVar.b(bufferInfo.presentationTimeUs);
            }
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 <= this.f24447f) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f24447f = j10;
            if (!i0.this.f24424x.contains(Long.valueOf(j10))) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by not in start-stop range.");
                i0 i0Var = i0.this;
                if (i0Var.f24426z && bufferInfo.presentationTimeUs >= ((Long) i0Var.f24424x.getUpper()).longValue()) {
                    Future<?> future = i0.this.B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    i0.this.A = Long.valueOf(bufferInfo.presentationTimeUs);
                    i0.this.a0();
                    i0.this.f24426z = false;
                }
                return false;
            }
            if (q(bufferInfo)) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by pause.");
                return false;
            }
            if (i0.this.J(bufferInfo) <= this.f24448g) {
                g0.r1.a(i0.this.f24402a, "Drop buffer by adjusted time is less than the last sent time.");
                if (i0.this.f24403c && i0.Q(bufferInfo)) {
                    this.f24450i = true;
                }
                return false;
            }
            if (!this.f24445d && !this.f24450i && i0.this.f24403c) {
                this.f24450i = true;
            }
            if (this.f24450i) {
                if (!i0.Q(bufferInfo)) {
                    g0.r1.a(i0.this.f24402a, "Drop buffer by not a key frame.");
                    i0.this.W();
                    return false;
                }
                this.f24450i = false;
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
            return i0Var.F && bufferInfo.presentationTimeUs > ((Long) i0Var.f24424x.getUpper()).longValue();
        }

        public void l() {
            i0 i0Var;
            final m mVar;
            final Executor executor;
            g0.r1.a(i0.this.f24402a, "reachEndData");
            if (this.f24446e) {
                return;
            }
            this.f24446e = true;
            if (i0.this.G != null) {
                i0.this.G.cancel(false);
                i0.this.G = null;
            }
            synchronized (i0.this.b) {
                i0Var = i0.this;
                mVar = i0Var.f24421u;
                executor = i0Var.f24422v;
            }
            i0Var.d0(new Runnable() { // from class: m1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.b(this.f24352a, executor, mVar);
                }
            });
        }

        public final MediaCodec.BufferInfo m(MediaCodec.BufferInfo bufferInfo) {
            long J = i0.this.J(bufferInfo);
            if (bufferInfo.presentationTimeUs == J) {
                return bufferInfo;
            }
            x2.g.i(J > this.f24448g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, J, bufferInfo.flags);
            return bufferInfo2;
        }

        public final void n(final k kVar, final m mVar, Executor executor) {
            i0.this.f24415o.add(kVar);
            r0.n.j(kVar.b(), new a(kVar), i0.this.f24409i);
            try {
                executor.execute(new Runnable() { // from class: m1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        mVar.b(kVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d(i0.this.f24402a, "Unable to post to the supplied executor.", e10);
                kVar.close();
            }
        }

        public final boolean o() {
            return this.f24452k && k1.c.b(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.h(this.f24515a, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i10) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.v0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.g(this.f24509a, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            i0.this.f24409i.execute(new Runnable() { // from class: m1.w0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.e(this.f24511a, bufferInfo, mediaCodec, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            g0.r1.a(i0.this.f24402a, "onOutputFormatChanged: mediaFormat = " + mediaFormat + ", CSD data = " + h1.d.d(mediaFormat));
            i0.this.f24409i.execute(new Runnable() { // from class: m1.y0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.g.f(this.f24517a, mediaFormat);
                }
            });
        }

        public void p() {
            this.f24451j = true;
        }

        public final boolean q(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final m mVar;
            i0.this.g0(bufferInfo.presentationTimeUs);
            boolean zP = i0.this.P(bufferInfo.presentationTimeUs);
            boolean z10 = this.f24449h;
            if (!z10 && zP) {
                g0.r1.a(i0.this.f24402a, "Switch to pause state");
                this.f24449h = true;
                synchronized (i0.this.b) {
                    i0 i0Var = i0.this;
                    executor = i0Var.f24422v;
                    mVar = i0Var.f24421u;
                }
                Objects.requireNonNull(mVar);
                executor.execute(new Runnable() { // from class: m1.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mVar.d();
                    }
                });
                i0 i0Var2 = i0.this;
                if (i0Var2.f24423w == f.PAUSED && ((i0Var2.f24403c || k1.c.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!i0.this.f24403c || k1.c.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    l.b bVar = i0.this.f24407g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(false);
                    }
                    i0.this.Y(true);
                }
                i0.this.A = Long.valueOf(bufferInfo.presentationTimeUs);
                i0 i0Var3 = i0.this;
                if (i0Var3.f24426z) {
                    Future<?> future = i0Var3.B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    i0.this.a0();
                    i0.this.f24426z = false;
                }
            } else if (z10 && !zP) {
                g0.r1.a(i0.this.f24402a, "Switch to resume state");
                this.f24449h = false;
                if (i0.this.f24403c && !i0.Q(bufferInfo)) {
                    this.f24450i = true;
                }
            }
            return this.f24449h;
        }
    }

    public class h implements l.c {
        public Surface b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l.c.a f24457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f24458e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f24455a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<Surface> f24456c = new HashSet();

        public h() {
        }

        @Override // m1.l.c
        public void a(Executor executor, l.c.a aVar) {
            Surface surface;
            synchronized (this.f24455a) {
                this.f24457d = (l.c.a) x2.g.g(aVar);
                this.f24458e = (Executor) x2.g.g(executor);
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
                g0.r1.d(i0.this.f24402a, "Unable to post to the supplied executor.", e10);
            }
        }

        public void d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f24455a) {
                surface = this.b;
                this.b = null;
                hashSet = new HashSet(this.f24456c);
                this.f24456c.clear();
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
            synchronized (this.f24455a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.b == null) {
                            surfaceCreateInputSurface = d.a();
                            this.b = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        d.b(i0.this.f24406f, this.b);
                    } else {
                        Surface surface = this.b;
                        if (surface != null) {
                            this.f24456c.add(surface);
                        }
                        surfaceCreateInputSurface = i0.this.f24406f.createInputSurface();
                        this.b = surfaceCreateInputSurface;
                    }
                    aVar = this.f24457d;
                    executor = this.f24458e;
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
        this.f24404d = (n) x2.g.g(nVar);
        MediaCodec mediaCodecB = n1.a.b(nVar);
        this.f24406f = mediaCodecB;
        MediaCodecInfo codecInfo = mediaCodecB.getCodecInfo();
        this.f24409i = q0.c.g(executor);
        MediaFormat mediaFormatA = nVar.a();
        this.f24405e = mediaFormatA;
        a4 a4VarC = nVar.c();
        this.f24417q = a4VarC;
        this.f24418r = f0(new n1(), new t.a() { // from class: m1.d0
            @Override // t.a
            public final Object apply(Object obj) {
                return Long.valueOf(this.f24386a.e0(((Long) obj).longValue()));
            }
        });
        if (nVar instanceof m1.a) {
            m1.a aVar = (m1.a) nVar;
            this.f24402a = "AudioEncoder";
            this.f24403c = false;
            this.f24407g = new e();
            this.f24408h = new m1.b(codecInfo, nVar.b());
            this.f24419s = new Rational(aVar.f(), aVar.h());
        } else {
            if (!(nVar instanceof p1)) {
                throw new k1("Unknown encoder config type");
            }
            p1 p1Var = (p1) nVar;
            this.f24402a = "VideoEncoder";
            this.f24403c = true;
            this.f24407g = new h();
            t1 t1Var = new t1(codecInfo, nVar.b());
            H(t1Var, mediaFormatA);
            this.f24408h = t1Var;
            this.f24419s = new Rational(p1Var.f(), p1Var.i());
        }
        g0.r1.a(this.f24402a, "mInputTimebase = " + a4VarC);
        g0.r1.a(this.f24402a, "mMediaFormat = " + mediaFormatA);
        g0.r1.a(this.f24402a, "mCaptureToEncodeFrameRateRatio = " + this.f24419s);
        try {
            X();
            final AtomicReference atomicReference = new AtomicReference();
            this.f24410j = r0.n.s(y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.e0
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar2) {
                    return i0.v(atomicReference, aVar2);
                }
            }));
            this.f24411k = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
            if (this.f24403c && i10 == 1 && k1.c.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z10 = true;
            }
            this.f24420t = z10;
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
        if (i0Var.f24426z) {
            g0.r1.l(i0Var.f24402a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            i0Var.A = null;
            i0Var.a0();
            i0Var.f24426z = false;
        }
    }

    public static /* synthetic */ void k(i0 i0Var) {
        int iOrdinal = i0Var.f24423w.ordinal();
        if (iOrdinal == 1) {
            i0Var.W();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public static /* synthetic */ void m(i0 i0Var, long j10) {
        switch (i0Var.f24423w) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                g0.r1.a(i0Var.f24402a, "Pause on " + h1.d.f(j10));
                i0Var.f24416p.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                i0Var.Z(f.PAUSED);
                return;
            case PENDING_START:
                i0Var.Z(f.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + i0Var.f24423w);
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
            if (!i0Var.f24420t) {
                g0.r1.a(i0Var.f24402a, "mMediaCodec.stop()");
                i0Var.f24406f.stop();
            }
            i0Var.X();
        }
    }

    public static /* synthetic */ void s(final i0 i0Var, long j10, long j11) {
        switch (i0Var.f24423w) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                f fVar = i0Var.f24423w;
                i0Var.Z(f.STOPPING);
                Long l10 = (Long) i0Var.f24424x.getLower();
                long jLongValue = l10.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j10 == -1) {
                    j10 = j11;
                } else if (j10 < jLongValue) {
                    g0.r1.l(i0Var.f24402a, "The expected stop time is less than the start time. Use current time as stop time.");
                    j10 = j11;
                }
                if (j10 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                i0Var.f24424x = Range.create(l10, Long.valueOf(j10));
                g0.r1.a(i0Var.f24402a, "Stop on " + h1.d.f(j10));
                if (fVar == f.PAUSED && i0Var.A != null) {
                    i0Var.a0();
                    return;
                } else {
                    i0Var.f24426z = true;
                    i0Var.B = q0.c.e().schedule(new Runnable() { // from class: m1.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            i0 i0Var2 = this.f24508a;
                            i0Var2.f24409i.execute(new Runnable() { // from class: m1.x
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
                throw new IllegalStateException("Unknown state: " + i0Var.f24423w);
        }
    }

    public static /* synthetic */ void t(i0 i0Var, long j10) {
        switch (i0Var.f24423w) {
            case CONFIGURED:
                i0Var.A = null;
                g0.r1.a(i0Var.f24402a, "Start on " + h1.d.f(j10));
                try {
                    if (i0Var.D) {
                        i0Var.X();
                    }
                    i0Var.f24424x = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    g0.r1.a(i0Var.f24402a, "mMediaCodec.start()");
                    i0Var.f24406f.start();
                    l.b bVar = i0Var.f24407g;
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
                Range<Long> rangeRemoveLast = i0Var.f24416p.removeLast();
                x2.g.j(rangeRemoveLast != null && ((Long) rangeRemoveLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l10 = (Long) rangeRemoveLast.getLower();
                long jLongValue = l10.longValue();
                i0Var.f24416p.addLast(Range.create(l10, Long.valueOf(j10)));
                g0.r1.a(i0Var.f24402a, "Resume on " + h1.d.f(j10) + "\nPaused duration = " + h1.d.f(j10 - jLongValue));
                if ((i0Var.f24403c || k1.c.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!i0Var.f24403c || k1.c.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    i0Var.Y(false);
                    l.b bVar2 = i0Var.f24407g;
                    if (bVar2 instanceof e) {
                        ((e) bVar2).q(true);
                    }
                }
                if (i0Var.f24403c) {
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
                throw new IllegalStateException("Unknown state: " + i0Var.f24423w);
        }
    }

    public static /* synthetic */ Object v(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ void x(i0 i0Var, List list, Runnable runnable) {
        if (i0Var.f24423w != f.ERROR) {
            if (!list.isEmpty()) {
                g0.r1.a(i0Var.f24402a, "encoded data and input buffers are returned");
            }
            if (!(i0Var.f24407g instanceof h) || i0Var.E || i0Var.O()) {
                g0.r1.a(i0Var.f24402a, "mMediaCodec.stop()");
                i0Var.f24406f.stop();
            } else {
                if (i0Var.f24420t) {
                    g0.r1.a(i0Var.f24402a, "mMediaCodec.stop()");
                    i0Var.f24406f.stop();
                } else {
                    g0.r1.a(i0Var.f24402a, "mMediaCodec.flush()");
                    i0Var.f24406f.flush();
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
        switch (i0Var.f24423w) {
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
                throw new IllegalStateException("Unknown state: " + i0Var.f24423w);
        }
    }

    public static /* synthetic */ Object z(AtomicReference atomicReference, y1.c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    public ne.x<h1> F() {
        switch (this.f24423w) {
            case CONFIGURED:
                return r0.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                ne.x<h1> xVarA = y1.c.a(new y1.c.InterfaceC0665c() { // from class: m1.a0
                    @Override // y1.c.InterfaceC0665c
                    public final Object a(y1.c.a aVar) {
                        return i0.z(atomicReference, aVar);
                    }
                });
                final y1.c.a<h1> aVar = (y1.c.a) x2.g.g((y1.c.a) atomicReference.get());
                this.f24413m.offer(aVar);
                aVar.a(new Runnable() { // from class: m1.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24351a.f24413m.remove(aVar);
                    }
                }, this.f24409i);
                T();
                return xVarA;
            case ERROR:
                return r0.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return r0.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f24423w);
        }
    }

    public final void G() {
        if (k1.c.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final g gVar = this.C;
            final Executor executor = this.f24409i;
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
        x2.g.i(this.f24403c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) r1Var.g().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
                g0.r1.a(this.f24402a, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    public long I() {
        return this.f24418r.b();
    }

    public long J(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f24425y;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    public void K(final int i10, final String str, final Throwable th2) {
        switch (this.f24423w) {
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
                        this.f24492a.U(i10, str, th2);
                    }
                });
                break;
            case ERROR:
                g0.r1.m(this.f24402a, "Get more than one error: " + str + "(" + i10 + ")", th2);
                break;
        }
    }

    public void L(MediaCodec.CodecException codecException) {
        K(1, codecException.getMessage(), codecException);
    }

    public void M() {
        f fVar = this.f24423w;
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
        for (Range<Long> range : this.f24416p) {
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
        return !R(this.f24419s);
    }

    public void T() {
        while (!this.f24413m.isEmpty() && !this.f24412l.isEmpty()) {
            y1.c.a aVarPoll = this.f24413m.poll();
            Objects.requireNonNull(aVarPoll);
            Integer numPoll = this.f24412l.poll();
            Objects.requireNonNull(numPoll);
            try {
                final b bVar = new b(this.f24406f, numPoll.intValue());
                if (aVarPoll.c(bVar)) {
                    this.f24414n.add(bVar);
                    bVar.d().a(new Runnable() { // from class: m1.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24510a.f24414n.remove(bVar);
                        }
                    }, this.f24409i);
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
            mVar = this.f24421u;
            executor = this.f24422v;
        }
        try {
            executor.execute(new Runnable() { // from class: m1.t
                @Override // java.lang.Runnable
                public final void run() {
                    mVar.c(new h(i10, str, th2));
                }
            });
        } catch (RejectedExecutionException e10) {
            g0.r1.d(this.f24402a, "Unable to post to the supplied executor.", e10);
        }
    }

    public final void V() {
        g0.r1.a(this.f24402a, "releaseInternal");
        if (this.D) {
            if (!this.f24420t) {
                g0.r1.a(this.f24402a, "mMediaCodec.stop()");
                this.f24406f.stop();
            }
            this.D = false;
        }
        g0.r1.a(this.f24402a, "mMediaCodec.release()");
        this.f24406f.release();
        l.b bVar = this.f24407g;
        if (bVar instanceof h) {
            ((h) bVar).d();
        }
        Z(f.RELEASED);
        this.f24411k.c(null);
    }

    public void W() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        g0.r1.a(this.f24402a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.f24406f.setParameters(bundle);
    }

    public final void X() {
        this.f24424x = H;
        this.f24425y = 0L;
        this.f24416p.clear();
        this.f24412l.clear();
        Iterator<y1.c.a<h1>> it = this.f24413m.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f24413m.clear();
        g0.r1.a(this.f24402a, "mMediaCodec.reset()");
        this.f24406f.reset();
        this.D = false;
        this.E = false;
        this.F = false;
        this.f24426z = false;
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
        g0.r1.a(this.f24402a, "mMediaCodec.setCallback()");
        this.f24406f.setCallback(this.C);
        g0.r1.a(this.f24402a, "mMediaCodec.configure()");
        this.f24406f.configure(this.f24405e, (Surface) null, (MediaCrypto) null, 1);
        l.b bVar = this.f24407g;
        if (bVar instanceof h) {
            ((h) bVar).e();
        }
    }

    public void Y(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        g0.r1.a(this.f24402a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z10);
        this.f24406f.setParameters(bundle);
    }

    public final void Z(f fVar) {
        if (this.f24423w == fVar) {
            return;
        }
        g0.r1.a(this.f24402a, "Transitioning encoder internal state: " + this.f24423w + " --> " + fVar);
        this.f24423w = fVar;
    }

    @Override // m1.l
    public void a() {
        this.f24409i.execute(new Runnable() { // from class: m1.g0
            @Override // java.lang.Runnable
            public final void run() {
                i0.y(this.f24398a);
            }
        });
    }

    public void a0() {
        g0.r1.a(this.f24402a, "signalCodecStop");
        l.b bVar = this.f24407g;
        if (bVar instanceof e) {
            ((e) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator<h1> it = this.f24414n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
            r0.n.w(arrayList).a(new Runnable() { // from class: m1.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24516a.b0();
                }
            }, this.f24409i);
            return;
        }
        if (bVar instanceof h) {
            try {
                G();
                g0.r1.a(this.f24402a, "mMediaCodec.signalEndOfInputStream()");
                this.f24406f.signalEndOfInputStream();
                this.F = true;
            } catch (MediaCodec.CodecException e10) {
                L(e10);
            }
        }
    }

    @Override // m1.l
    public l.b b() {
        return this.f24407g;
    }

    public final void b0() {
        g0.r1.a(this.f24402a, "signalEndOfInputStream");
        r0.n.j(F(), new a(), this.f24409i);
    }

    @Override // m1.l
    public void c(m mVar, Executor executor) {
        synchronized (this.b) {
            this.f24421u = mVar;
            this.f24422v = executor;
        }
    }

    public void c0() {
        g0.r1.a(this.f24402a, "signalSourceStopped");
        this.f24409i.execute(new Runnable() { // from class: m1.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.q(this.f24401a);
            }
        });
    }

    @Override // m1.l
    public void d(final long j10) {
        final long jI = I();
        this.f24409i.execute(new Runnable() { // from class: m1.s
            @Override // java.lang.Runnable
            public final void run() {
                i0.s(this.f24496a, j10, jI);
            }
        });
    }

    public void d0(final Runnable runnable) {
        g0.r1.a(this.f24402a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<k> it = this.f24415o.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Iterator<h1> it2 = this.f24414n.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().d());
        }
        if (!arrayList.isEmpty()) {
            g0.r1.a(this.f24402a, "Waiting for resources to return. encoded data = " + this.f24415o.size() + ", input buffers = " + this.f24414n.size());
        }
        r0.n.w(arrayList).a(new Runnable() { // from class: m1.u
            @Override // java.lang.Runnable
            public final void run() {
                i0.x(this.f24505a, arrayList, runnable);
            }
        }, this.f24409i);
    }

    @Override // m1.l
    public f1 e() {
        return this.f24408h;
    }

    public final long e0(long j10) {
        return S() ? Math.round(j10 * this.f24419s.doubleValue()) : j10;
    }

    @Override // m1.l
    public ne.x<Void> f() {
        return this.f24410j;
    }

    @Override // m1.l
    public void g() {
        this.f24409i.execute(new Runnable() { // from class: m1.p
            @Override // java.lang.Runnable
            public final void run() {
                i0.k(this.f24484a);
            }
        });
    }

    public void g0(long j10) {
        while (!this.f24416p.isEmpty()) {
            Range<Long> first = this.f24416p.getFirst();
            if (j10 <= ((Long) first.getUpper()).longValue()) {
                return;
            }
            this.f24416p.removeFirst();
            this.f24425y += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
            g0.r1.a(this.f24402a, "Total paused duration = " + h1.d.f(this.f24425y));
        }
    }

    @Override // m1.l
    public int h() {
        if (this.f24405e.containsKey("bitrate")) {
            return this.f24405e.getInteger("bitrate");
        }
        return 0;
    }

    @Override // m1.l
    public void pause() {
        final long jI = I();
        this.f24409i.execute(new Runnable() { // from class: m1.f0
            @Override // java.lang.Runnable
            public final void run() {
                i0.m(this.f24394a, jI);
            }
        });
    }

    @Override // m1.l
    public void start() {
        final long jI = I();
        this.f24409i.execute(new Runnable() { // from class: m1.q
            @Override // java.lang.Runnable
            public final void run() {
                i0.t(this.f24486a, jI);
            }
        });
    }
}
