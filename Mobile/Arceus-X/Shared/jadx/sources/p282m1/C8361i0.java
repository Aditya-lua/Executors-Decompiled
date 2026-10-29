package p282m1;

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
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p156h1.C6263d;
import p156h1.InterfaceC6262c;
import p234k1.C7407c;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8722a3;
import p297n1.C8858a;
import p318o1.C9628h;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p436t.InterfaceC11464a;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: m1.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C8361i0 implements InterfaceC8369l {

    /* JADX INFO: renamed from: H */
    public static final Range<Long> f30816H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* JADX INFO: renamed from: G */
    public Future<?> f30823G;

    /* JADX INFO: renamed from: a */
    public final String f30824a;

    /* JADX INFO: renamed from: c */
    public final boolean f30826c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8375n f30827d;

    /* JADX INFO: renamed from: e */
    public final MediaFormat f30828e;

    /* JADX INFO: renamed from: f */
    public final MediaCodec f30829f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8369l.b f30830g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8353f1 f30831h;

    /* JADX INFO: renamed from: i */
    public final Executor f30832i;

    /* JADX INFO: renamed from: j */
    public final InterfaceFutureC9440x<Void> f30833j;

    /* JADX INFO: renamed from: k */
    public final C12997c.a<Void> f30834k;

    /* JADX INFO: renamed from: q */
    public final EnumC8723a4 f30840q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC8380o1 f30841r;

    /* JADX INFO: renamed from: s */
    public final Rational f30842s;

    /* JADX INFO: renamed from: t */
    public final boolean f30843t;

    /* JADX INFO: renamed from: w */
    public f f30846w;

    /* JADX INFO: renamed from: b */
    public final Object f30825b = new Object();

    /* JADX INFO: renamed from: l */
    public final Queue<Integer> f30835l = new ArrayDeque();

    /* JADX INFO: renamed from: m */
    public final Queue<C12997c.a<InterfaceC8359h1>> f30836m = new ArrayDeque();

    /* JADX INFO: renamed from: n */
    public final Set<InterfaceC8359h1> f30837n = new HashSet();

    /* JADX INFO: renamed from: o */
    public final Set<C8366k> f30838o = new HashSet();

    /* JADX INFO: renamed from: p */
    public final Deque<Range<Long>> f30839p = new ArrayDeque();

    /* JADX INFO: renamed from: u */
    public InterfaceC8372m f30844u = InterfaceC8372m.f30913a;

    /* JADX INFO: renamed from: v */
    public Executor f30845v = C10417c.m40081b();

    /* JADX INFO: renamed from: x */
    public Range<Long> f30847x = f30816H;

    /* JADX INFO: renamed from: y */
    public long f30848y = 0;

    /* JADX INFO: renamed from: z */
    public boolean f30849z = false;

    /* JADX INFO: renamed from: A */
    public Long f30817A = null;

    /* JADX INFO: renamed from: B */
    public Future<?> f30818B = null;

    /* JADX INFO: renamed from: C */
    public g f30819C = null;

    /* JADX INFO: renamed from: D */
    public boolean f30820D = false;

    /* JADX INFO: renamed from: E */
    public boolean f30821E = false;

    /* JADX INFO: renamed from: F */
    public boolean f30822F = false;

    /* JADX INFO: renamed from: m1.i0$a */
    public class a implements InterfaceC10762c<InterfaceC8359h1> {

        /* JADX INFO: renamed from: m1.i0$a$a, reason: collision with other inner class name */
        public class C14200a implements InterfaceC10762c<Void> {
            public C14200a() {
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            @Override // p397r0.InterfaceC10762c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r8) {
            }

            @Override // p397r0.InterfaceC10762c
            public void onFailure(Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    C8361i0.this.m33975L((MediaCodec.CodecException) th2);
                } else {
                    C8361i0.this.m33974K(0, th2.getMessage(), th2);
                }
            }
        }

        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC8359h1 interfaceC8359h1) {
            interfaceC8359h1.mo33939c(C8361i0.this.m33972I());
            interfaceC8359h1.mo33937a(true);
            interfaceC8359h1.mo33938b();
            C10773n.m40987j(interfaceC8359h1.mo33940d(), new C14200a(), C8361i0.this.f30832i);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C8361i0.this.m33974K(0, "Unable to acquire InputBuffer.", th2);
        }
    }

    /* JADX INFO: renamed from: m1.i0$b */
    public class b extends C8365j1 {
        public b(MediaCodec mediaCodec, int i10) {
            super(mediaCodec, i10);
        }

        @Override // p282m1.C8365j1, p282m1.InterfaceC8359h1
        /* JADX INFO: renamed from: c */
        public void mo33939c(long j10) {
            C8361i0 c8361i0 = C8361i0.this;
            if (!c8361i0.f30826c) {
                j10 = c8361i0.m33996e0(j10);
            }
            super.mo33939c(j10);
        }
    }

    /* JADX INFO: renamed from: m1.i0$c */
    public class c implements InterfaceC8380o1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11464a f30853a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC8380o1 f30854b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(InterfaceC11464a interfaceC11464a, InterfaceC8380o1 interfaceC8380o1) {
            this.f30853a = interfaceC11464a;
            this.f30854b = interfaceC8380o1;
        }

        @Override // p282m1.InterfaceC8380o1
        /* JADX INFO: renamed from: a */
        public long mo34003a() {
            return ((Long) this.f30853a.apply(Long.valueOf(this.f30854b.mo34003a()))).longValue();
        }

        @Override // p282m1.InterfaceC8380o1
        /* JADX INFO: renamed from: b */
        public long mo34004b() {
            return ((Long) this.f30853a.apply(Long.valueOf(this.f30854b.mo34004b()))).longValue();
        }
    }

    /* JADX INFO: renamed from: m1.i0$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static Surface m34005a() {
            return MediaCodec.createPersistentInputSurface();
        }

        /* JADX INFO: renamed from: b */
        public static void m34006b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* JADX INFO: renamed from: m1.i0$e */
    public class e implements InterfaceC8369l.a {

        /* JADX INFO: renamed from: a */
        public final Map<InterfaceC8722a3.a<? super InterfaceC6262c.a>, Executor> f30855a = new LinkedHashMap();

        /* JADX INFO: renamed from: b */
        public InterfaceC6262c.a f30856b = InterfaceC6262c.a.INACTIVE;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceFutureC9440x<InterfaceC8359h1>> f30857c = new ArrayList();

        public e() {
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ Object m34009h(final e eVar, final C12997c.a aVar) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.m48314c(this.f30924a.f30856b);
                }
            });
            return "fetchData";
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m34010i(e eVar, final InterfaceC8722a3.a aVar, Executor executor) {
            eVar.f30855a.put((InterfaceC8722a3.a) C12637g.m47075g(aVar), (Executor) C12637g.m47075g(executor));
            final InterfaceC6262c.a aVar2 = eVar.f30856b;
            executor.execute(new Runnable() { // from class: m1.r0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.mo2367a(aVar2);
                }
            });
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ Object m34014m(final e eVar, final C12997c.a aVar) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.s0
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.e.m34015n(this.f30940a, aVar);
                }
            });
            return "acquireBuffer";
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m34015n(final e eVar, C12997c.a aVar) {
            InterfaceC6262c.a aVar2 = eVar.f30856b;
            if (aVar2 == InterfaceC6262c.a.ACTIVE) {
                final InterfaceFutureC9440x<InterfaceC8359h1> interfaceFutureC9440xM33969F = C8361i0.this.m33969F();
                C10773n.m40997t(interfaceFutureC9440xM33969F, aVar);
                aVar.m48312a(new Runnable() { // from class: m1.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30891a.m34020p(interfaceFutureC9440xM33969F);
                    }
                }, C10417c.m40081b());
                eVar.f30857c.add(interfaceFutureC9440xM33969F);
                interfaceFutureC9440xM33969F.mo37173a(new Runnable() { // from class: m1.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30908a.f30857c.remove(interfaceFutureC9440xM33969F);
                    }
                }, C8361i0.this.f30832i);
                return;
            }
            if (aVar2 == InterfaceC6262c.a.INACTIVE) {
                aVar.m48317f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.m48317f(new IllegalStateException("Unknown state: " + eVar.f30856b));
        }

        @Override // p296n0.InterfaceC8722a3
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC9440x<InterfaceC6262c.a> mo34017b() {
            return C12997c.m48311a(new C12997c.c() { // from class: m1.m0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C8361i0.e.m34009h(this.f30914a, aVar);
                }
            });
        }

        @Override // p296n0.InterfaceC8722a3
        /* JADX INFO: renamed from: c */
        public void mo34018c(final Executor executor, final InterfaceC8722a3.a<? super InterfaceC6262c.a> aVar) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.e.m34010i(this.f30910a, aVar, executor);
                }
            });
        }

        @Override // p296n0.InterfaceC8722a3
        /* JADX INFO: renamed from: d */
        public void mo34019d(final InterfaceC8722a3.a<? super InterfaceC6262c.a> aVar) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30918a.f30855a.remove(C12637g.m47075g(aVar));
                }
            });
        }

        @Override // p156h1.InterfaceC6262c
        /* JADX INFO: renamed from: e */
        public InterfaceFutureC9440x<InterfaceC8359h1> mo27506e() {
            return C12997c.m48311a(new C12997c.c() { // from class: m1.p0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C8361i0.e.m34014m(this.f30921a, aVar);
                }
            });
        }

        /* JADX INFO: renamed from: p */
        public final void m34020p(InterfaceFutureC9440x<InterfaceC8359h1> interfaceFutureC9440x) {
            if (interfaceFutureC9440x.cancel(true)) {
                return;
            }
            C12637g.m47077i(interfaceFutureC9440x.isDone());
            try {
                interfaceFutureC9440x.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                C5931r1.m26572l(C8361i0.this.f30824a, "Unable to cancel the input buffer: " + e10);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m34021q(boolean z10) {
            final InterfaceC6262c.a aVar = z10 ? InterfaceC6262c.a.ACTIVE : InterfaceC6262c.a.INACTIVE;
            if (this.f30856b == aVar) {
                return;
            }
            this.f30856b = aVar;
            if (aVar == InterfaceC6262c.a.INACTIVE) {
                Iterator<InterfaceFutureC9440x<InterfaceC8359h1>> it = this.f30857c.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.f30857c.clear();
            }
            for (final Map.Entry<InterfaceC8722a3.a<? super InterfaceC6262c.a>, Executor> entry : this.f30855a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: m1.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC8722a3.a) entry.getKey()).mo2367a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C5931r1.m26564d(C8361i0.this.f30824a, "Unable to post to the supplied executor.", e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1.i0$f */
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

    /* JADX INFO: renamed from: m1.i0$g */
    public class g extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a */
        public final C9628h f30869a;

        /* JADX INFO: renamed from: b */
        public boolean f30870b;

        /* JADX INFO: renamed from: c */
        public boolean f30871c = false;

        /* JADX INFO: renamed from: d */
        public boolean f30872d = false;

        /* JADX INFO: renamed from: e */
        public boolean f30873e = false;

        /* JADX INFO: renamed from: f */
        public long f30874f = 0;

        /* JADX INFO: renamed from: g */
        public long f30875g = 0;

        /* JADX INFO: renamed from: h */
        public boolean f30876h = false;

        /* JADX INFO: renamed from: i */
        public boolean f30877i = false;

        /* JADX INFO: renamed from: j */
        public boolean f30878j = false;

        /* JADX INFO: renamed from: k */
        public boolean f30879k;

        /* JADX INFO: renamed from: m1.i0$g$a */
        public class a implements InterfaceC10762c<Void> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C8366k f30881a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(C8366k c8366k) {
                this.f30881a = c8366k;
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            @Override // p397r0.InterfaceC10762c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r8) {
                C8361i0.this.f30838o.remove(this.f30881a);
            }

            @Override // p397r0.InterfaceC10762c
            public void onFailure(Throwable th2) {
                C8361i0.this.f30838o.remove(this.f30881a);
                if (th2 instanceof MediaCodec.CodecException) {
                    C8361i0.this.m33975L((MediaCodec.CodecException) th2);
                } else {
                    C8361i0.this.m33974K(0, th2.getMessage(), th2);
                }
            }
        }

        public g() {
            this.f30870b = true;
            boolean z10 = C8361i0.this.f30826c;
            this.f30879k = z10;
            if (z10) {
                this.f30869a = new C9628h(C8361i0.this.f30841r, C8361i0.this.f30840q, (CameraUseInconsistentTimebaseQuirk) C7407c.m30691b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f30869a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) C7407c.m30691b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.m2277h(C8361i0.this.f30828e.getString("mime"))) {
                return;
            }
            this.f30870b = false;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ MediaFormat m34023a(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m34024b(g gVar, Executor executor, final InterfaceC8372m interfaceC8372m) {
            if (C8361i0.this.f30846w == f.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC8372m);
                executor.execute(new Runnable() { // from class: m1.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC8372m.mo24515a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26564d(C8361i0.this.f30824a, "Unable to post to the supplied executor.", e10);
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m34027e(g gVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            C8361i0 c8361i0;
            final InterfaceC8372m interfaceC8372m;
            Executor executor;
            if (gVar.f30878j) {
                C5931r1.m26572l(C8361i0.this.f30824a, "Receives frame after codec is reset.");
                return;
            }
            switch (C8361i0.this.f30846w) {
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
                    synchronized (C8361i0.this.f30825b) {
                        c8361i0 = C8361i0.this;
                        interfaceC8372m = c8361i0.f30844u;
                        executor = c8361i0.f30845v;
                        break;
                    }
                    if (c8361i0.f30826c && c8361i0.m33979S()) {
                        bufferInfo.presentationTimeUs = C8361i0.this.m33996e0(bufferInfo.presentationTimeUs);
                    }
                    if (!gVar.f30871c) {
                        gVar.f30871c = true;
                        try {
                            Objects.requireNonNull(interfaceC8372m);
                            executor.execute(new Runnable() { // from class: m1.z0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    interfaceC8372m.mo24518e();
                                }
                            });
                        } catch (RejectedExecutionException e10) {
                            C5931r1.m26564d(C8361i0.this.f30824a, "Unable to post to the supplied executor.", e10);
                        }
                        break;
                    }
                    if (!gVar.m34031i(bufferInfo)) {
                        try {
                            C8361i0.this.f30829f.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e11) {
                            C8361i0.this.m33975L(e11);
                            return;
                        }
                        break;
                    } else {
                        if (!gVar.f30872d) {
                            gVar.f30872d = true;
                            C5931r1.m26561a(C8361i0.this.f30824a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + C8361i0.this.f30840q + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoM34035m = gVar.m34035m(bufferInfo);
                        gVar.f30875g = bufferInfoM34035m.presentationTimeUs;
                        try {
                            gVar.m34036n(new C8366k(mediaCodec, i10, bufferInfoM34035m), interfaceC8372m, executor);
                        } catch (MediaCodec.CodecException e12) {
                            C8361i0.this.m33975L(e12);
                            return;
                        }
                        break;
                    }
                    if (!gVar.f30873e && gVar.m34032j(bufferInfo)) {
                        gVar.m34034l();
                    }
                    if (gVar.f30879k) {
                        gVar.f30879k = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C8361i0.this.f30846w);
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m34028f(g gVar, final MediaFormat mediaFormat) {
            final InterfaceC8372m interfaceC8372m;
            Executor executor;
            if (gVar.f30878j) {
                C5931r1.m26572l(C8361i0.this.f30824a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (C8361i0.this.f30846w) {
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
                    C8361i0 c8361i0 = C8361i0.this;
                    if (c8361i0.f30826c && c8361i0.m33979S()) {
                        mediaFormat.setInteger("time-lapse-enable", 1);
                        mediaFormat.setInteger("time-lapse-fps", ((AbstractC8383p1) C8361i0.this.f30827d).mo33907f());
                    }
                    synchronized (C8361i0.this.f30825b) {
                        C8361i0 c8361i1 = C8361i0.this;
                        interfaceC8372m = c8361i1.f30844u;
                        executor = c8361i1.f30845v;
                        break;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: m1.a1
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC8372m.mo24519f(new InterfaceC8371l1() { // from class: m1.d1
                                    @Override // p282m1.InterfaceC8371l1
                                    /* JADX INFO: renamed from: a */
                                    public final MediaFormat mo33926a() {
                                        return C8361i0.g.m34023a(mediaFormat);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e10) {
                        C5931r1.m26564d(C8361i0.this.f30824a, "Unable to post to the supplied executor.", e10);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C8361i0.this.f30846w);
            }
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m34029g(g gVar, int i10) {
            if (gVar.f30878j) {
                C5931r1.m26572l(C8361i0.this.f30824a, "Receives input frame after codec is reset.");
                return;
            }
            switch (C8361i0.this.f30846w) {
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
                    C8361i0.this.f30835l.offer(Integer.valueOf(i10));
                    C8361i0.this.m33980T();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C8361i0.this.f30846w);
            }
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m34030h(g gVar, MediaCodec.CodecException codecException) {
            switch (C8361i0.this.f30846w) {
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
                    C8361i0.this.m33975L(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C8361i0.this.f30846w);
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m34031i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f30873e) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by codec config.");
                return false;
            }
            C9628h c9628h = this.f30869a;
            if (c9628h != null) {
                bufferInfo.presentationTimeUs = c9628h.m37993b(bufferInfo.presentationTimeUs);
            }
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 <= this.f30874f) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f30874f = j10;
            if (!C8361i0.this.f30847x.contains(Long.valueOf(j10))) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by not in start-stop range.");
                C8361i0 c8361i0 = C8361i0.this;
                if (c8361i0.f30849z && bufferInfo.presentationTimeUs >= ((Long) c8361i0.f30847x.getUpper()).longValue()) {
                    Future<?> future = C8361i0.this.f30818B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C8361i0.this.f30817A = Long.valueOf(bufferInfo.presentationTimeUs);
                    C8361i0.this.m33988a0();
                    C8361i0.this.f30849z = false;
                }
                return false;
            }
            if (m34039q(bufferInfo)) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by pause.");
                return false;
            }
            if (C8361i0.this.m33973J(bufferInfo) <= this.f30875g) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by adjusted time is less than the last sent time.");
                if (C8361i0.this.f30826c && C8361i0.m33948Q(bufferInfo)) {
                    this.f30877i = true;
                }
                return false;
            }
            if (!this.f30872d && !this.f30877i && C8361i0.this.f30826c) {
                this.f30877i = true;
            }
            if (this.f30877i) {
                if (!C8361i0.m33948Q(bufferInfo)) {
                    C5931r1.m26561a(C8361i0.this.f30824a, "Drop buffer by not a key frame.");
                    C8361i0.this.m33983W();
                    return false;
                }
                this.f30877i = false;
            }
            return true;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m34032j(MediaCodec.BufferInfo bufferInfo) {
            if (!C8361i0.m33947N(bufferInfo) || m34037o()) {
                return this.f30870b && m34033k(bufferInfo);
            }
            return true;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m34033k(MediaCodec.BufferInfo bufferInfo) {
            C8361i0 c8361i0 = C8361i0.this;
            return c8361i0.f30822F && bufferInfo.presentationTimeUs > ((Long) c8361i0.f30847x.getUpper()).longValue();
        }

        /* JADX INFO: renamed from: l */
        public void m34034l() {
            C8361i0 c8361i0;
            final InterfaceC8372m interfaceC8372m;
            final Executor executor;
            C5931r1.m26561a(C8361i0.this.f30824a, "reachEndData");
            if (this.f30873e) {
                return;
            }
            this.f30873e = true;
            if (C8361i0.this.f30823G != null) {
                C8361i0.this.f30823G.cancel(false);
                C8361i0.this.f30823G = null;
            }
            synchronized (C8361i0.this.f30825b) {
                c8361i0 = C8361i0.this;
                interfaceC8372m = c8361i0.f30844u;
                executor = c8361i0.f30845v;
            }
            c8361i0.m33994d0(new Runnable() { // from class: m1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.g.m34024b(this.f30756a, executor, interfaceC8372m);
                }
            });
        }

        /* JADX INFO: renamed from: m */
        public final MediaCodec.BufferInfo m34035m(MediaCodec.BufferInfo bufferInfo) {
            long jM33973J = C8361i0.this.m33973J(bufferInfo);
            if (bufferInfo.presentationTimeUs == jM33973J) {
                return bufferInfo;
            }
            C12637g.m47077i(jM33973J > this.f30875g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, jM33973J, bufferInfo.flags);
            return bufferInfo2;
        }

        /* JADX INFO: renamed from: n */
        public final void m34036n(final C8366k c8366k, final InterfaceC8372m interfaceC8372m, Executor executor) {
            C8361i0.this.f30838o.add(c8366k);
            C10773n.m40987j(c8366k.m34049b(), new a(c8366k), C8361i0.this.f30832i);
            try {
                executor.execute(new Runnable() { // from class: m1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC8372m.mo24516b(c8366k);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26564d(C8361i0.this.f30824a, "Unable to post to the supplied executor.", e10);
                c8366k.close();
            }
        }

        /* JADX INFO: renamed from: o */
        public final boolean m34037o() {
            return this.f30879k && C7407c.m30691b(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.g.m34030h(this.f30963a, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i10) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.v0
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.g.m34029g(this.f30954a, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.g.m34027e(this.f30958a, bufferInfo, mediaCodec, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            C5931r1.m26561a(C8361i0.this.f30824a, "onOutputFormatChanged: mediaFormat = " + mediaFormat + ", CSD data = " + C6263d.m27511d(mediaFormat));
            C8361i0.this.f30832i.execute(new Runnable() { // from class: m1.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.g.m34028f(this.f30966a, mediaFormat);
                }
            });
        }

        /* JADX INFO: renamed from: p */
        public void m34038p() {
            this.f30878j = true;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m34039q(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC8372m interfaceC8372m;
            C8361i0.this.m33999g0(bufferInfo.presentationTimeUs);
            boolean zM33978P = C8361i0.this.m33978P(bufferInfo.presentationTimeUs);
            boolean z10 = this.f30876h;
            if (!z10 && zM33978P) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Switch to pause state");
                this.f30876h = true;
                synchronized (C8361i0.this.f30825b) {
                    C8361i0 c8361i0 = C8361i0.this;
                    executor = c8361i0.f30845v;
                    interfaceC8372m = c8361i0.f30844u;
                }
                Objects.requireNonNull(interfaceC8372m);
                executor.execute(new Runnable() { // from class: m1.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC8372m.m34051d();
                    }
                });
                C8361i0 c8361i1 = C8361i0.this;
                if (c8361i1.f30846w == f.PAUSED && ((c8361i1.f30826c || C7407c.m30691b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!C8361i0.this.f30826c || C7407c.m30691b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    InterfaceC8369l.b bVar = C8361i0.this.f30830g;
                    if (bVar instanceof e) {
                        ((e) bVar).m34021q(false);
                    }
                    C8361i0.this.m33985Y(true);
                }
                C8361i0.this.f30817A = Long.valueOf(bufferInfo.presentationTimeUs);
                C8361i0 c8361i2 = C8361i0.this;
                if (c8361i2.f30849z) {
                    Future<?> future = c8361i2.f30818B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C8361i0.this.m33988a0();
                    C8361i0.this.f30849z = false;
                }
            } else if (z10 && !zM33978P) {
                C5931r1.m26561a(C8361i0.this.f30824a, "Switch to resume state");
                this.f30876h = false;
                if (C8361i0.this.f30826c && !C8361i0.m33948Q(bufferInfo)) {
                    this.f30877i = true;
                }
            }
            return this.f30876h;
        }
    }

    /* JADX INFO: renamed from: m1.i0$h */
    public class h implements InterfaceC8369l.c {

        /* JADX INFO: renamed from: b */
        public Surface f30884b;

        /* JADX INFO: renamed from: d */
        public InterfaceC8369l.c.a f30886d;

        /* JADX INFO: renamed from: e */
        public Executor f30887e;

        /* JADX INFO: renamed from: a */
        public final Object f30883a = new Object();

        /* JADX INFO: renamed from: c */
        public final Set<Surface> f30885c = new HashSet();

        public h() {
        }

        @Override // p282m1.InterfaceC8369l.c
        /* JADX INFO: renamed from: a */
        public void mo34042a(Executor executor, InterfaceC8369l.c.a aVar) {
            Surface surface;
            synchronized (this.f30883a) {
                this.f30886d = (InterfaceC8369l.c.a) C12637g.m47075g(aVar);
                this.f30887e = (Executor) C12637g.m47075g(executor);
                surface = this.f30884b;
            }
            if (surface != null) {
                m34043c(executor, aVar, surface);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m34043c(Executor executor, final InterfaceC8369l.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: m1.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.mo24320a(surface);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26564d(C8361i0.this.f30824a, "Unable to post to the supplied executor.", e10);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m34044d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f30883a) {
                surface = this.f30884b;
                this.f30884b = null;
                hashSet = new HashSet(this.f30885c);
                this.f30885c.clear();
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
        /* JADX INFO: renamed from: e */
        public void m34045e() {
            Surface surfaceCreateInputSurface;
            InterfaceC8369l.c.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) C7407c.m30691b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f30883a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f30884b == null) {
                            surfaceCreateInputSurface = d.m34005a();
                            this.f30884b = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        d.m34006b(C8361i0.this.f30829f, this.f30884b);
                    } else {
                        Surface surface = this.f30884b;
                        if (surface != null) {
                            this.f30885c.add(surface);
                        }
                        surfaceCreateInputSurface = C8361i0.this.f30829f.createInputSurface();
                        this.f30884b = surfaceCreateInputSurface;
                    }
                    aVar = this.f30886d;
                    executor = this.f30887e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (surfaceCreateInputSurface == null || aVar == null || executor == null) {
                return;
            }
            m34043c(executor, aVar, surfaceCreateInputSurface);
        }
    }

    public C8361i0(Executor executor, InterfaceC8375n interfaceC8375n, int i10) throws C8368k1 {
        boolean z10 = false;
        C12637g.m47075g(executor);
        this.f30827d = (InterfaceC8375n) C12637g.m47075g(interfaceC8375n);
        MediaCodec mediaCodecM35567b = C8858a.m35567b(interfaceC8375n);
        this.f30829f = mediaCodecM35567b;
        MediaCodecInfo codecInfo = mediaCodecM35567b.getCodecInfo();
        this.f30832i = C10417c.m40086g(executor);
        MediaFormat mediaFormatMo33889a = interfaceC8375n.mo33889a();
        this.f30828e = mediaFormatMo33889a;
        EnumC8723a4 enumC8723a4Mo33891c = interfaceC8375n.mo33891c();
        this.f30840q = enumC8723a4Mo33891c;
        this.f30841r = m33950f0(new C8377n1(), new InterfaceC11464a() { // from class: m1.d0
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return Long.valueOf(this.f30796a.m33996e0(((Long) obj).longValue()));
            }
        });
        if (interfaceC8375n instanceof AbstractC8336a) {
            AbstractC8336a abstractC8336a = (AbstractC8336a) interfaceC8375n;
            this.f30824a = "AudioEncoder";
            this.f30826c = false;
            this.f30830g = new e();
            this.f30831h = new C8339b(codecInfo, interfaceC8375n.mo33890b());
            this.f30842s = new Rational(abstractC8336a.mo33893f(), abstractC8336a.mo33895h());
        } else {
            if (!(interfaceC8375n instanceof AbstractC8383p1)) {
                throw new C8368k1("Unknown encoder config type");
            }
            AbstractC8383p1 abstractC8383p1 = (AbstractC8383p1) interfaceC8375n;
            this.f30824a = "VideoEncoder";
            this.f30826c = true;
            this.f30830g = new h();
            C8395t1 c8395t1 = new C8395t1(codecInfo, interfaceC8375n.mo33890b());
            m33971H(c8395t1, mediaFormatMo33889a);
            this.f30831h = c8395t1;
            this.f30842s = new Rational(abstractC8383p1.mo33907f(), abstractC8383p1.mo33910i());
        }
        C5931r1.m26561a(this.f30824a, "mInputTimebase = " + enumC8723a4Mo33891c);
        C5931r1.m26561a(this.f30824a, "mMediaFormat = " + mediaFormatMo33889a);
        C5931r1.m26561a(this.f30824a, "mCaptureToEncodeFrameRateRatio = " + this.f30842s);
        try {
            m33984X();
            final AtomicReference atomicReference = new AtomicReference();
            this.f30833j = C10773n.m40996s(C12997c.m48311a(new C12997c.c() { // from class: m1.e0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C8361i0.m33964v(atomicReference, aVar);
                }
            }));
            this.f30834k = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
            if (this.f30826c && i10 == 1 && C7407c.m30691b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z10 = true;
            }
            this.f30843t = z10;
            m33986Z(f.CONFIGURED);
        } catch (MediaCodec.CodecException e10) {
            throw new C8368k1(e10);
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m33947N(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m33948Q(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m33949R(Rational rational) {
        return rational != null && rational.getDenominator() == rational.getNumerator();
    }

    /* JADX INFO: renamed from: f0 */
    public static InterfaceC8380o1 m33950f0(InterfaceC8380o1 interfaceC8380o1, InterfaceC11464a<Long, Long> interfaceC11464a) {
        return new c(interfaceC11464a, interfaceC8380o1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m33951i(C8361i0 c8361i0) {
        if (c8361i0.f30849z) {
            C5931r1.m26572l(c8361i0.f30824a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            c8361i0.f30817A = null;
            c8361i0.m33988a0();
            c8361i0.f30849z = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m33953k(C8361i0 c8361i0) {
        int iOrdinal = c8361i0.f30846w.ordinal();
        if (iOrdinal == 1) {
            c8361i0.m33983W();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m33955m(C8361i0 c8361i0, long j10) {
        switch (c8361i0.f30846w) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                C5931r1.m26561a(c8361i0.f30824a, "Pause on " + C6263d.m27513f(j10));
                c8361i0.f30839p.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                c8361i0.m33986Z(f.PAUSED);
                return;
            case PENDING_START:
                c8361i0.m33986Z(f.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c8361i0.f30846w);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m33956n(Executor executor, final g gVar) {
        Objects.requireNonNull(gVar);
        executor.execute(new Runnable() { // from class: m1.c0
            @Override // java.lang.Runnable
            public final void run() {
                gVar.m34034l();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m33959q(C8361i0 c8361i0) {
        c8361i0.f30821E = true;
        if (c8361i0.f30820D) {
            if (!c8361i0.f30843t) {
                C5931r1.m26561a(c8361i0.f30824a, "mMediaCodec.stop()");
                c8361i0.f30829f.stop();
            }
            c8361i0.m33984X();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m33961s(final C8361i0 c8361i0, long j10, long j11) {
        switch (c8361i0.f30846w) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                f fVar = c8361i0.f30846w;
                c8361i0.m33986Z(f.STOPPING);
                Long l10 = (Long) c8361i0.f30847x.getLower();
                long jLongValue = l10.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j10 == -1) {
                    j10 = j11;
                } else if (j10 < jLongValue) {
                    C5931r1.m26572l(c8361i0.f30824a, "The expected stop time is less than the start time. Use current time as stop time.");
                    j10 = j11;
                }
                if (j10 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                c8361i0.f30847x = Range.create(l10, Long.valueOf(j10));
                C5931r1.m26561a(c8361i0.f30824a, "Stop on " + C6263d.m27513f(j10));
                if (fVar == f.PAUSED && c8361i0.f30817A != null) {
                    c8361i0.m33988a0();
                    return;
                } else {
                    c8361i0.f30849z = true;
                    c8361i0.f30818B = C10417c.m40084e().schedule(new Runnable() { // from class: m1.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8361i0 c8361i1 = this.f30953a;
                            c8361i1.f30832i.execute(new Runnable() { // from class: m1.x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8361i0.m33951i(c8361i1);
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
            case PENDING_START:
            case PENDING_START_PAUSED:
                c8361i0.m33986Z(f.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c8361i0.f30846w);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m33962t(C8361i0 c8361i0, long j10) {
        switch (c8361i0.f30846w) {
            case CONFIGURED:
                c8361i0.f30817A = null;
                C5931r1.m26561a(c8361i0.f30824a, "Start on " + C6263d.m27513f(j10));
                try {
                    if (c8361i0.f30820D) {
                        c8361i0.m33984X();
                    }
                    c8361i0.f30847x = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    C5931r1.m26561a(c8361i0.f30824a, "mMediaCodec.start()");
                    c8361i0.f30829f.start();
                    InterfaceC8369l.b bVar = c8361i0.f30830g;
                    if (bVar instanceof e) {
                        ((e) bVar).m34021q(true);
                    }
                    c8361i0.m33986Z(f.STARTED);
                    return;
                } catch (MediaCodec.CodecException e10) {
                    c8361i0.m33975L(e10);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                c8361i0.f30817A = null;
                Range<Long> rangeRemoveLast = c8361i0.f30839p.removeLast();
                C12637g.m47078j(rangeRemoveLast != null && ((Long) rangeRemoveLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l10 = (Long) rangeRemoveLast.getLower();
                long jLongValue = l10.longValue();
                c8361i0.f30839p.addLast(Range.create(l10, Long.valueOf(j10)));
                C5931r1.m26561a(c8361i0.f30824a, "Resume on " + C6263d.m27513f(j10) + "\nPaused duration = " + C6263d.m27513f(j10 - jLongValue));
                if ((c8361i0.f30826c || C7407c.m30691b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c8361i0.f30826c || C7407c.m30691b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    c8361i0.m33985Y(false);
                    InterfaceC8369l.b bVar2 = c8361i0.f30830g;
                    if (bVar2 instanceof e) {
                        ((e) bVar2).m34021q(true);
                    }
                }
                if (c8361i0.f30826c) {
                    c8361i0.m33983W();
                }
                c8361i0.m33986Z(f.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                c8361i0.m33986Z(f.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c8361i0.f30846w);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Object m33964v(AtomicReference atomicReference, C12997c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m33966x(C8361i0 c8361i0, List list, Runnable runnable) {
        if (c8361i0.f30846w != f.ERROR) {
            if (!list.isEmpty()) {
                C5931r1.m26561a(c8361i0.f30824a, "encoded data and input buffers are returned");
            }
            if (!(c8361i0.f30830g instanceof h) || c8361i0.f30821E || c8361i0.m33977O()) {
                C5931r1.m26561a(c8361i0.f30824a, "mMediaCodec.stop()");
                c8361i0.f30829f.stop();
            } else {
                if (c8361i0.f30843t) {
                    C5931r1.m26561a(c8361i0.f30824a, "mMediaCodec.stop()");
                    c8361i0.f30829f.stop();
                } else {
                    C5931r1.m26561a(c8361i0.f30824a, "mMediaCodec.flush()");
                    c8361i0.f30829f.flush();
                }
                c8361i0.f30820D = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        c8361i0.m33976M();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m33967y(C8361i0 c8361i0) {
        switch (c8361i0.f30846w) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                c8361i0.m33982V();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                c8361i0.m33986Z(f.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + c8361i0.f30846w);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Object m33968z(AtomicReference atomicReference, C12997c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    /* JADX INFO: renamed from: F */
    public InterfaceFutureC9440x<InterfaceC8359h1> m33969F() {
        switch (this.f30846w) {
            case CONFIGURED:
                return C10773n.m40991n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                InterfaceFutureC9440x<InterfaceC8359h1> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: m1.a0
                    @Override // p563y1.C12997c.c
                    /* JADX INFO: renamed from: a */
                    public final Object mo22051a(C12997c.a aVar) {
                        return C8361i0.m33968z(atomicReference, aVar);
                    }
                });
                final C12997c.a<InterfaceC8359h1> aVar = (C12997c.a) C12637g.m47075g((C12997c.a) atomicReference.get());
                this.f30836m.offer(aVar);
                aVar.m48312a(new Runnable() { // from class: m1.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30754a.f30836m.remove(aVar);
                    }
                }, this.f30832i);
                m33980T();
                return interfaceFutureC9440xM48311a;
            case ERROR:
                return C10773n.m40991n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return C10773n.m40991n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f30846w);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m33970G() {
        if (C7407c.m30691b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final g gVar = this.f30819C;
            final Executor executor = this.f30832i;
            Future<?> future = this.f30823G;
            if (future != null) {
                future.cancel(false);
            }
            this.f30823G = C10417c.m40084e().schedule(new Runnable() { // from class: m1.z
                @Override // java.lang.Runnable
                public final void run() {
                    C8361i0.m33956n(executor, gVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m33971H(InterfaceC8389r1 interfaceC8389r1, MediaFormat mediaFormat) {
        C12637g.m47077i(this.f30826c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) interfaceC8389r1.mo34057g().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
                C5931r1.m26561a(this.f30824a, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public long m33972I() {
        return this.f30841r.mo34004b();
    }

    /* JADX INFO: renamed from: J */
    public long m33973J(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f30848y;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    /* JADX INFO: renamed from: K */
    public void m33974K(final int i10, final String str, final Throwable th2) {
        switch (this.f30846w) {
            case CONFIGURED:
                m33981U(i10, str, th2);
                m33984X();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                m33986Z(f.ERROR);
                m33994d0(new Runnable() { // from class: m1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30931a.m33981U(i10, str, th2);
                    }
                });
                break;
            case ERROR:
                C5931r1.m26573m(this.f30824a, "Get more than one error: " + str + "(" + i10 + ")", th2);
                break;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m33975L(MediaCodec.CodecException codecException) {
        m33974K(1, codecException.getMessage(), codecException);
    }

    /* JADX INFO: renamed from: M */
    public void m33976M() {
        f fVar = this.f30846w;
        if (fVar == f.PENDING_RELEASE) {
            m33982V();
            return;
        }
        if (!this.f30820D) {
            m33984X();
        }
        m33986Z(f.CONFIGURED);
        if (fVar == f.PENDING_START || fVar == f.PENDING_START_PAUSED) {
            start();
            if (fVar == f.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m33977O() {
        return C7407c.m30691b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    /* JADX INFO: renamed from: P */
    public boolean m33978P(long j10) {
        for (Range<Long> range : this.f30839p) {
            if (range.contains(Long.valueOf(j10))) {
                return true;
            }
            if (j10 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m33979S() {
        return !m33949R(this.f30842s);
    }

    /* JADX INFO: renamed from: T */
    public void m33980T() {
        while (!this.f30836m.isEmpty() && !this.f30835l.isEmpty()) {
            C12997c.a aVarPoll = this.f30836m.poll();
            Objects.requireNonNull(aVarPoll);
            Integer numPoll = this.f30835l.poll();
            Objects.requireNonNull(numPoll);
            try {
                final b bVar = new b(this.f30829f, numPoll.intValue());
                if (aVarPoll.m48314c(bVar)) {
                    this.f30837n.add(bVar);
                    bVar.mo33940d().mo37173a(new Runnable() { // from class: m1.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30956a.f30837n.remove(bVar);
                        }
                    }, this.f30832i);
                } else {
                    bVar.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                m33975L(e10);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m33981U(final int i10, final String str, final Throwable th2) {
        final InterfaceC8372m interfaceC8372m;
        Executor executor;
        synchronized (this.f30825b) {
            interfaceC8372m = this.f30844u;
            executor = this.f30845v;
        }
        try {
            executor.execute(new Runnable() { // from class: m1.t
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC8372m.mo24517c(new C8357h(i10, str, th2));
                }
            });
        } catch (RejectedExecutionException e10) {
            C5931r1.m26564d(this.f30824a, "Unable to post to the supplied executor.", e10);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m33982V() {
        C5931r1.m26561a(this.f30824a, "releaseInternal");
        if (this.f30820D) {
            if (!this.f30843t) {
                C5931r1.m26561a(this.f30824a, "mMediaCodec.stop()");
                this.f30829f.stop();
            }
            this.f30820D = false;
        }
        C5931r1.m26561a(this.f30824a, "mMediaCodec.release()");
        this.f30829f.release();
        InterfaceC8369l.b bVar = this.f30830g;
        if (bVar instanceof h) {
            ((h) bVar).m34044d();
        }
        m33986Z(f.RELEASED);
        this.f30834k.m48314c(null);
    }

    /* JADX INFO: renamed from: W */
    public void m33983W() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        C5931r1.m26561a(this.f30824a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.f30829f.setParameters(bundle);
    }

    /* JADX INFO: renamed from: X */
    public final void m33984X() {
        this.f30847x = f30816H;
        this.f30848y = 0L;
        this.f30839p.clear();
        this.f30835l.clear();
        Iterator<C12997c.a<InterfaceC8359h1>> it = this.f30836m.iterator();
        while (it.hasNext()) {
            it.next().m48315d();
        }
        this.f30836m.clear();
        C5931r1.m26561a(this.f30824a, "mMediaCodec.reset()");
        this.f30829f.reset();
        this.f30820D = false;
        this.f30821E = false;
        this.f30822F = false;
        this.f30849z = false;
        Future<?> future = this.f30818B;
        if (future != null) {
            future.cancel(true);
            this.f30818B = null;
        }
        Future<?> future2 = this.f30823G;
        if (future2 != null) {
            future2.cancel(false);
            this.f30823G = null;
        }
        g gVar = this.f30819C;
        if (gVar != null) {
            gVar.m34038p();
        }
        this.f30819C = new g();
        C5931r1.m26561a(this.f30824a, "mMediaCodec.setCallback()");
        this.f30829f.setCallback(this.f30819C);
        C5931r1.m26561a(this.f30824a, "mMediaCodec.configure()");
        this.f30829f.configure(this.f30828e, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC8369l.b bVar = this.f30830g;
        if (bVar instanceof h) {
            ((h) bVar).m34045e();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m33985Y(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        C5931r1.m26561a(this.f30824a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z10);
        this.f30829f.setParameters(bundle);
    }

    /* JADX INFO: renamed from: Z */
    public final void m33986Z(f fVar) {
        if (this.f30846w == fVar) {
            return;
        }
        C5931r1.m26561a(this.f30824a, "Transitioning encoder internal state: " + this.f30846w + " --> " + fVar);
        this.f30846w = fVar;
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: a */
    public void mo33987a() {
        this.f30832i.execute(new Runnable() { // from class: m1.g0
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33967y(this.f30811a);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m33988a0() {
        C5931r1.m26561a(this.f30824a, "signalCodecStop");
        InterfaceC8369l.b bVar = this.f30830g;
        if (bVar instanceof e) {
            ((e) bVar).m34021q(false);
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC8359h1> it = this.f30837n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo33940d());
            }
            C10773n.m41000w(arrayList).mo37173a(new Runnable() { // from class: m1.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30965a.m33990b0();
                }
            }, this.f30832i);
            return;
        }
        if (bVar instanceof h) {
            try {
                m33970G();
                C5931r1.m26561a(this.f30824a, "mMediaCodec.signalEndOfInputStream()");
                this.f30829f.signalEndOfInputStream();
                this.f30822F = true;
            } catch (MediaCodec.CodecException e10) {
                m33975L(e10);
            }
        }
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: b */
    public InterfaceC8369l.b mo33989b() {
        return this.f30830g;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m33990b0() {
        C5931r1.m26561a(this.f30824a, "signalEndOfInputStream");
        C10773n.m40987j(m33969F(), new a(), this.f30832i);
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: c */
    public void mo33991c(InterfaceC8372m interfaceC8372m, Executor executor) {
        synchronized (this.f30825b) {
            this.f30844u = interfaceC8372m;
            this.f30845v = executor;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m33992c0() {
        C5931r1.m26561a(this.f30824a, "signalSourceStopped");
        this.f30832i.execute(new Runnable() { // from class: m1.h0
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33959q(this.f30815a);
            }
        });
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: d */
    public void mo33993d(final long j10) {
        final long jM33972I = m33972I();
        this.f30832i.execute(new Runnable() { // from class: m1.s
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33961s(this.f30937a, j10, jM33972I);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m33994d0(final Runnable runnable) {
        C5931r1.m26561a(this.f30824a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<C8366k> it = this.f30838o.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m34049b());
        }
        Iterator<InterfaceC8359h1> it2 = this.f30837n.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().mo33940d());
        }
        if (!arrayList.isEmpty()) {
            C5931r1.m26561a(this.f30824a, "Waiting for resources to return. encoded data = " + this.f30838o.size() + ", input buffers = " + this.f30837n.size());
        }
        C10773n.m41000w(arrayList).mo37173a(new Runnable() { // from class: m1.u
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33966x(this.f30949a, arrayList, runnable);
            }
        }, this.f30832i);
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: e */
    public InterfaceC8353f1 mo33995e() {
        return this.f30831h;
    }

    /* JADX INFO: renamed from: e0 */
    public final long m33996e0(long j10) {
        return m33979S() ? Math.round(j10 * this.f30842s.doubleValue()) : j10;
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<Void> mo33997f() {
        return this.f30833j;
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: g */
    public void mo33998g() {
        this.f30832i.execute(new Runnable() { // from class: m1.p
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33953k(this.f30920a);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m33999g0(long j10) {
        while (!this.f30839p.isEmpty()) {
            Range<Long> first = this.f30839p.getFirst();
            if (j10 <= ((Long) first.getUpper()).longValue()) {
                return;
            }
            this.f30839p.removeFirst();
            this.f30848y += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
            C5931r1.m26561a(this.f30824a, "Total paused duration = " + C6263d.m27513f(this.f30848y));
        }
    }

    @Override // p282m1.InterfaceC8369l
    /* JADX INFO: renamed from: h */
    public int mo34000h() {
        if (this.f30828e.containsKey("bitrate")) {
            return this.f30828e.getInteger("bitrate");
        }
        return 0;
    }

    @Override // p282m1.InterfaceC8369l
    public void pause() {
        final long jM33972I = m33972I();
        this.f30832i.execute(new Runnable() { // from class: m1.f0
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33955m(this.f30805a, jM33972I);
            }
        });
    }

    @Override // p282m1.InterfaceC8369l
    public void start() {
        final long jM33972I = m33972I();
        this.f30832i.execute(new Runnable() { // from class: m1.q
            @Override // java.lang.Runnable
            public final void run() {
                C8361i0.m33962t(this.f30922a, jM33972I);
            }
        });
    }
}
