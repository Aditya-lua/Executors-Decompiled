package p115f1;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.InterfaceC5937t;
import p156h1.AbstractC6268i;
import p156h1.C6263d;
import p156h1.C6266g;
import p156h1.InterfaceC6265f;
import p183i1.AbstractC6601a;
import p183i1.C6619n;
import p183i1.C6620o;
import p205j1.C7016c;
import p234k1.C7407c;
import p260l1.AbstractC7962e;
import p260l1.C7959b;
import p260l1.C7970m;
import p282m1.AbstractC8383p1;
import p282m1.C8354g;
import p282m1.C8357h;
import p282m1.C8361i0;
import p282m1.C8368k1;
import p282m1.C8395t1;
import p282m1.InterfaceC8360i;
import p282m1.InterfaceC8369l;
import p282m1.InterfaceC8371l1;
import p282m1.InterfaceC8372m;
import p282m1.InterfaceC8375n;
import p282m1.InterfaceC8378o;
import p282m1.InterfaceC8389r1;
import p296n0.AbstractC8822s3;
import p296n0.C8851y2;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8722a3;
import p296n0.InterfaceC8799o0;
import p297n1.C8861d;
import p297n1.C8862e;
import p318o1.C9621a;
import p347p0.C10088d;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p503w0.C12271a;
import p503w0.InterfaceC12273c;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: f1.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5289r0 implements InterfaceC5237a2 {

    /* JADX INFO: renamed from: A0 */
    public static long f20468A0;

    /* JADX INFO: renamed from: q0 */
    public static final Set<l> f20469q0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* JADX INFO: renamed from: r0 */
    public static final Set<l> f20470r0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* JADX INFO: renamed from: s0 */
    public static final C5235a0 f20471s0;

    /* JADX INFO: renamed from: t0 */
    public static final AbstractC5245c2 f20472t0;

    /* JADX INFO: renamed from: u0 */
    public static final AbstractC5291s f20473u0;

    /* JADX INFO: renamed from: v0 */
    public static final Exception f20474v0;

    /* JADX INFO: renamed from: w0 */
    public static final InterfaceC8378o f20475w0;

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC6265f.a f20476x0;

    /* JADX INFO: renamed from: y0 */
    public static final Executor f20477y0;

    /* JADX INFO: renamed from: z0 */
    public static int f20478z0;

    /* JADX INFO: renamed from: A */
    public Integer f20479A;

    /* JADX INFO: renamed from: B */
    public C5948v2 f20480B;

    /* JADX INFO: renamed from: C */
    public EnumC8723a4 f20481C;

    /* JADX INFO: renamed from: D */
    public Surface f20482D;

    /* JADX INFO: renamed from: E */
    public Surface f20483E;

    /* JADX INFO: renamed from: F */
    public MediaMuxer f20484F;

    /* JADX INFO: renamed from: G */
    public final C8851y2<AbstractC5291s> f20485G;

    /* JADX INFO: renamed from: H */
    public C6619n f20486H;

    /* JADX INFO: renamed from: I */
    public InterfaceC8369l f20487I;

    /* JADX INFO: renamed from: J */
    public InterfaceC8371l1 f20488J;

    /* JADX INFO: renamed from: K */
    public InterfaceC8369l f20489K;

    /* JADX INFO: renamed from: L */
    public InterfaceC8371l1 f20490L;

    /* JADX INFO: renamed from: M */
    public h f20491M;

    /* JADX INFO: renamed from: N */
    public Uri f20492N;

    /* JADX INFO: renamed from: O */
    public long f20493O;

    /* JADX INFO: renamed from: P */
    public long f20494P;

    /* JADX INFO: renamed from: Q */
    public long f20495Q;

    /* JADX INFO: renamed from: R */
    public long f20496R;

    /* JADX INFO: renamed from: S */
    public int f20497S;

    /* JADX INFO: renamed from: T */
    public long f20498T;

    /* JADX INFO: renamed from: U */
    public long f20499U;

    /* JADX INFO: renamed from: V */
    public long f20500V;

    /* JADX INFO: renamed from: W */
    public long f20501W;

    /* JADX INFO: renamed from: X */
    public long f20502X;

    /* JADX INFO: renamed from: Y */
    public int f20503Y;

    /* JADX INFO: renamed from: Z */
    public Throwable f20504Z;

    /* JADX INFO: renamed from: a */
    public final C8851y2<AbstractC5257g1> f20505a;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC8360i f20506a0;

    /* JADX INFO: renamed from: b */
    public final C8851y2<Boolean> f20507b;

    /* JADX INFO: renamed from: b0 */
    public final InterfaceC12273c<InterfaceC8360i> f20508b0;

    /* JADX INFO: renamed from: c */
    public final Executor f20509c;

    /* JADX INFO: renamed from: c0 */
    public Throwable f20510c0;

    /* JADX INFO: renamed from: d */
    public final Executor f20511d;

    /* JADX INFO: renamed from: d0 */
    public boolean f20512d0;

    /* JADX INFO: renamed from: e */
    public final Executor f20513e;

    /* JADX INFO: renamed from: e0 */
    public InterfaceC5237a2.a f20514e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8378o f20515f;

    /* JADX INFO: renamed from: f0 */
    public ScheduledFuture<?> f20516f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8378o f20517g;

    /* JADX INFO: renamed from: g0 */
    public boolean f20518g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6265f.a f20519h;

    /* JADX INFO: renamed from: h0 */
    public C5314z1 f20520h0;

    /* JADX INFO: renamed from: i */
    public final Object f20521i = new Object();

    /* JADX INFO: renamed from: i0 */
    public AbstractC8383p1 f20522i0;

    /* JADX INFO: renamed from: j */
    public final boolean f20523j;

    /* JADX INFO: renamed from: j0 */
    public C5314z1 f20524j0;

    /* JADX INFO: renamed from: k */
    public final int f20525k;

    /* JADX INFO: renamed from: k0 */
    public double f20526k0;

    /* JADX INFO: renamed from: l */
    public final long f20527l;

    /* JADX INFO: renamed from: l0 */
    public boolean f20528l0;

    /* JADX INFO: renamed from: m */
    public final C8851y2<Range<Integer>> f20529m;

    /* JADX INFO: renamed from: m0 */
    public k f20530m0;

    /* JADX INFO: renamed from: n */
    public l f20531n;

    /* JADX INFO: renamed from: n0 */
    public InterfaceC6265f f20532n0;

    /* JADX INFO: renamed from: o */
    public l f20533o;

    /* JADX INFO: renamed from: o0 */
    public long f20534o0;

    /* JADX INFO: renamed from: p */
    public int f20535p;

    /* JADX INFO: renamed from: p0 */
    public boolean f20536p0;

    /* JADX INFO: renamed from: q */
    public j f20537q;

    /* JADX INFO: renamed from: r */
    public j f20538r;

    /* JADX INFO: renamed from: s */
    public long f20539s;

    /* JADX INFO: renamed from: t */
    public j f20540t;

    /* JADX INFO: renamed from: u */
    public boolean f20541u;

    /* JADX INFO: renamed from: v */
    public C5948v2.h f20542v;

    /* JADX INFO: renamed from: w */
    public C5948v2.h f20543w;

    /* JADX INFO: renamed from: x */
    public AbstractC6268i f20544x;

    /* JADX INFO: renamed from: y */
    public final List<InterfaceFutureC9440x<Void>> f20545y;

    /* JADX INFO: renamed from: z */
    public Integer f20546z;

    /* JADX INFO: renamed from: f1.r0$a */
    public class a implements InterfaceC10762c<InterfaceC8369l> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5314z1 f20547a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C5314z1 c5314z1) {
            this.f20547a = c5314z1;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC8369l interfaceC8369l) {
            InterfaceC8369l interfaceC8369l2;
            C5931r1.m26561a("Recorder", "VideoEncoder can be released: " + interfaceC8369l);
            if (interfaceC8369l == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = C5289r0.this.f20516f0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC8369l2 = C5289r0.this.f20487I) != null && interfaceC8369l2 == interfaceC8369l) {
                C5289r0.m24440T(interfaceC8369l2);
            }
            C5289r0 c5289r0 = C5289r0.this;
            c5289r0.f20524j0 = this.f20547a;
            c5289r0.m24502o0(null);
            C5289r0 c5289r1 = C5289r0.this;
            c5289r1.m24495g0(4, null, c5289r1.m24481Q());
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C5931r1.m26561a("Recorder", "Error in ReadyToReleaseFuture: " + th2);
        }
    }

    /* JADX INFO: renamed from: f1.r0$b */
    public class b implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6619n f20549a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(C6619n c6619n) {
            this.f20549a = c6619n;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            C5931r1.m26561a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f20549a.hashCode())));
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C5931r1.m26561a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f20549a.hashCode())));
        }
    }

    /* JADX INFO: renamed from: f1.r0$c */
    public class c implements InterfaceC8372m {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12997c.a f20551b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ j f20552c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(C12997c.a aVar, j jVar) {
            this.f20551b = aVar;
            this.f20552c = jVar;
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: a */
        public void mo24515a() {
            this.f20551b.m48314c(null);
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: b */
        public void mo24516b(InterfaceC8360i interfaceC8360i) {
            boolean z10;
            C5289r0 c5289r0 = C5289r0.this;
            if (c5289r0.f20484F != null) {
                try {
                    c5289r0.m24472G0(interfaceC8360i, this.f20552c);
                    if (interfaceC8360i != null) {
                        interfaceC8360i.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (interfaceC8360i != null) {
                        try {
                            interfaceC8360i.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (c5289r0.f20541u) {
                C5931r1.m26561a("Recorder", "Drop video data since recording is stopping.");
                interfaceC8360i.close();
                return;
            }
            InterfaceC8360i interfaceC8360i2 = c5289r0.f20506a0;
            if (interfaceC8360i2 != null) {
                interfaceC8360i2.close();
                C5289r0.this.f20506a0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!interfaceC8360i.mo33936w0()) {
                if (z10) {
                    C5931r1.m26561a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                C5931r1.m26561a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                C5289r0.this.f20487I.mo33998g();
                interfaceC8360i.close();
                return;
            }
            C5289r0 c5289r1 = C5289r0.this;
            c5289r1.f20506a0 = interfaceC8360i;
            if (!c5289r1.m24479O() || !C5289r0.this.f20508b0.isEmpty()) {
                C5931r1.m26561a("Recorder", "Received video keyframe. Starting muxer...");
                C5289r0.this.m24505r0(this.f20552c);
            } else if (z10) {
                C5931r1.m26561a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                C5931r1.m26561a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: c */
        public void mo24517c(C8357h c8357h) {
            this.f20551b.m48317f(c8357h);
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: e */
        public void mo24518e() {
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: f */
        public void mo24519f(InterfaceC8371l1 interfaceC8371l1) {
            C5289r0.this.f20488J = interfaceC8371l1;
        }
    }

    /* JADX INFO: renamed from: f1.r0$d */
    public class d implements C6619n.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC12631a f20554a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(InterfaceC12631a interfaceC12631a) {
            this.f20554a = interfaceC12631a;
        }

        @Override // p183i1.C6619n.c
        /* JADX INFO: renamed from: a */
        public void mo24520a(boolean z10) {
            C5289r0 c5289r0 = C5289r0.this;
            if (c5289r0.f20512d0 != z10) {
                c5289r0.f20512d0 = z10;
                c5289r0.m24466D0(true);
            } else {
                C5931r1.m26572l("Recorder", "Audio source silenced transitions to the same state " + z10);
            }
        }

        @Override // p183i1.C6619n.c
        /* JADX INFO: renamed from: b */
        public void mo24521b(double d10) {
            C5289r0.this.f20526k0 = d10;
        }

        @Override // p183i1.C6619n.c
        public void onError(Throwable th2) {
            C5931r1.m26564d("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof C6620o) {
                this.f20554a.accept(th2);
            }
        }
    }

    /* JADX INFO: renamed from: f1.r0$e */
    public class e implements InterfaceC8372m {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12997c.a f20556b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC12631a f20557c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ j f20558d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public e(C12997c.a aVar, InterfaceC12631a interfaceC12631a, j jVar) {
            this.f20556b = aVar;
            this.f20557c = interfaceC12631a;
            this.f20558d = jVar;
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: a */
        public void mo24515a() {
            this.f20556b.m48314c(null);
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: b */
        public void mo24516b(InterfaceC8360i interfaceC8360i) {
            C5289r0 c5289r0 = C5289r0.this;
            if (c5289r0.f20491M == h.DISABLED) {
                interfaceC8360i.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (c5289r0.f20484F == null) {
                if (c5289r0.f20541u) {
                    C5931r1.m26561a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    c5289r0.f20508b0.mo45551b(new C8354g(interfaceC8360i));
                    if (C5289r0.this.f20506a0 != null) {
                        C5931r1.m26561a("Recorder", "Received audio data. Starting muxer...");
                        C5289r0.this.m24505r0(this.f20558d);
                    } else {
                        C5931r1.m26561a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                interfaceC8360i.close();
                return;
            }
            try {
                c5289r0.m24470F0(interfaceC8360i, this.f20558d);
                if (interfaceC8360i != null) {
                    interfaceC8360i.close();
                }
            } catch (Throwable th2) {
                if (interfaceC8360i != null) {
                    try {
                        interfaceC8360i.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: c */
        public void mo24517c(C8357h c8357h) {
            if (C5289r0.this.f20510c0 == null) {
                this.f20557c.accept(c8357h);
            }
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: e */
        public void mo24518e() {
        }

        @Override // p282m1.InterfaceC8372m
        /* JADX INFO: renamed from: f */
        public void mo24519f(InterfaceC8371l1 interfaceC8371l1) {
            C5289r0.this.f20490L = interfaceC8371l1;
        }
    }

    /* JADX INFO: renamed from: f1.r0$f */
    public class f implements InterfaceC10762c<List<Void>> {
        public f() {
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Void> list) {
            C5931r1.m26561a("Recorder", "Encodings end successfully.");
            C5289r0 c5289r0 = C5289r0.this;
            c5289r0.m24471G(c5289r0.f20503Y, c5289r0.f20504Z);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C12637g.m47078j(C5289r0.this.f20540t != null, "In-progress recording shouldn't be null");
            if (C5289r0.this.f20540t.mo24333w()) {
                return;
            }
            C5931r1.m26561a("Recorder", "Encodings end with error: " + th2);
            C5289r0 c5289r0 = C5289r0.this;
            c5289r0.m24471G(c5289r0.f20484F == null ? 8 : 6, th2);
        }
    }

    /* JADX INFO: renamed from: f1.r0$g */
    public class g implements InterfaceC8722a3.a<Boolean> {
        public g() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p296n0.InterfaceC8722a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2367a(Boolean bool) {
            C5289r0.this.f20507b.m35552k(bool);
        }

        @Override // p296n0.InterfaceC8722a3.a
        public void onError(Throwable th2) {
            C5289r0.this.f20507b.m35551j(th2);
        }
    }

    /* JADX INFO: renamed from: f1.r0$h */
    public enum h {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* JADX INFO: renamed from: f1.r0$i */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public final AbstractC5291s.a f20569a;

        /* JADX INFO: renamed from: b */
        public int f20570b = 0;

        /* JADX INFO: renamed from: c */
        public Executor f20571c = null;

        /* JADX INFO: renamed from: d */
        public InterfaceC8378o f20572d;

        /* JADX INFO: renamed from: e */
        public InterfaceC8378o f20573e;

        /* JADX INFO: renamed from: f */
        public InterfaceC6265f.a f20574f;

        /* JADX INFO: renamed from: g */
        public long f20575g;

        public i() {
            InterfaceC8378o interfaceC8378o = C5289r0.f20475w0;
            this.f20572d = interfaceC8378o;
            this.f20573e = interfaceC8378o;
            this.f20574f = C5289r0.f20476x0;
            this.f20575g = -1L;
            this.f20569a = AbstractC5291s.m24567a();
        }

        /* JADX INFO: renamed from: c */
        public C5289r0 m24527c() {
            return new C5289r0(this.f20571c, this.f20569a.mo24308a(), this.f20570b, this.f20572d, this.f20573e, this.f20574f, this.f20575g);
        }

        /* JADX INFO: renamed from: d */
        public i m24528d(final int i10) {
            this.f20569a.m24572b(new InterfaceC12631a() { // from class: f1.s0
                @Override // p533x2.InterfaceC12631a
                public final void accept(Object obj) {
                    ((AbstractC5245c2.a) obj).mo24269b(i10);
                }
            });
            return this;
        }

        /* JADX INFO: renamed from: e */
        public i m24529e(Executor executor) {
            C12637g.m47076h(executor, "The specified executor can't be null.");
            this.f20571c = executor;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public i m24530f(final C5235a0 c5235a0) {
            C12637g.m47076h(c5235a0, "The specified quality selector can't be null.");
            this.f20569a.m24572b(new InterfaceC12631a() { // from class: f1.t0
                @Override // p533x2.InterfaceC12631a
                public final void accept(Object obj) {
                    ((AbstractC5245c2.a) obj).mo24272e(c5235a0);
                }
            });
            return this;
        }
    }

    /* JADX INFO: renamed from: f1.r0$j */
    public static abstract class j implements AutoCloseable {

        /* JADX INFO: renamed from: a */
        public final C10088d f20576a = C10088d.m38904b();

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f20577b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c */
        public final AtomicReference<d> f20578c = new AtomicReference<>(null);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<c> f20579d = new AtomicReference<>(null);

        /* JADX INFO: renamed from: e */
        public final AtomicReference<InterfaceC12631a<Uri>> f20580e = new AtomicReference<>(new InterfaceC12631a() { // from class: f1.z0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C5289r0.j.m24532b((Uri) obj);
            }
        });

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f20581f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g */
        public final C8851y2<Boolean> f20582g = C8851y2.m35550l(Boolean.FALSE);

        /* JADX INFO: renamed from: f1.r0$j$a */
        public class a implements c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f20583a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(Context context) {
                this.f20583a = context;
            }

            @Override // p115f1.C5289r0.j.c
            /* JADX INFO: renamed from: a */
            public C6619n mo24550a(AbstractC6601a abstractC6601a, Executor executor) {
                return new C6619n(abstractC6601a, executor, this.f20583a);
            }
        }

        /* JADX INFO: renamed from: f1.r0$j$b */
        public class b implements c {
            public b() {
            }

            @Override // p115f1.C5289r0.j.c
            /* JADX INFO: renamed from: a */
            public C6619n mo24550a(AbstractC6601a abstractC6601a, Executor executor) {
                return new C6619n(abstractC6601a, executor, null);
            }
        }

        /* JADX INFO: renamed from: f1.r0$j$c */
        public interface c {
            /* JADX INFO: renamed from: a */
            C6619n mo24550a(AbstractC6601a abstractC6601a, Executor executor);
        }

        /* JADX INFO: renamed from: f1.r0$j$d */
        public interface d {
            /* JADX INFO: renamed from: a */
            MediaMuxer mo24551a(int i10, InterfaceC12631a<Uri> interfaceC12631a);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m24531a(String str, Uri uri) {
            if (uri == null) {
                C5931r1.m26563c("Recorder", String.format("File scanning operation failed [path: %s]", str));
            } else {
                C5931r1.m26561a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m24532b(Uri uri) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m24533c(C5294t c5294t, Context context, Uri uri) throws Throwable {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String strM35580b = C8861d.m35580b(c5294t.m24574e(), uri, "_data");
            if (strM35580b != null) {
                MediaScannerConnection.scanFile(context, new String[]{strM35580b}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: f1.a1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        C5289r0.j.m24531a(str, uri2);
                    }
                });
                return;
            }
            C5931r1.m26561a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m24534d(C5294t c5294t, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            c5294t.m24574e().update(uri, contentValues, null, null);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ MediaMuxer m24536f(AbstractC5297u abstractC5297u, ParcelFileDescriptor parcelFileDescriptor, int i10, InterfaceC12631a interfaceC12631a) throws IOException {
            MediaMuxer mediaMuxerM29698a;
            Uri uriInsert = Uri.EMPTY;
            if (abstractC5297u instanceof C5288r) {
                File fileM24433d = ((C5288r) abstractC5297u).m24433d();
                if (!C8861d.m35579a(fileM24433d)) {
                    C5931r1.m26572l("Recorder", "Failed to create folder for " + fileM24433d.getAbsolutePath());
                }
                mediaMuxerM29698a = new MediaMuxer(fileM24433d.getAbsolutePath(), i10);
                uriInsert = Uri.fromFile(fileM24433d);
            } else if (abstractC5297u instanceof C5285q) {
                mediaMuxerM29698a = C7016c.m29698a(parcelFileDescriptor.getFileDescriptor(), i10);
            } else {
                if (!(abstractC5297u instanceof C5294t)) {
                    throw new AssertionError("Invalid output options type: " + abstractC5297u.getClass().getSimpleName());
                }
                C5294t c5294t = (C5294t) abstractC5297u;
                ContentValues contentValues = new ContentValues(c5294t.m24575f());
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    uriInsert = c5294t.m24574e().insert(c5294t.m24573d(), contentValues);
                    if (uriInsert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c5294t.m24574e().openFileDescriptor(uriInsert, "rw");
                    mediaMuxerM29698a = C7016c.m29698a(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), i10);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (RuntimeException e10) {
                    throw new IOException("Unable to create MediaStore entry by " + e10, e10);
                }
            }
            interfaceC12631a.accept(uriInsert);
            return mediaMuxerM29698a;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m24537g(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e10) {
                C5931r1.m26564d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e10);
            }
        }

        /* JADX INFO: renamed from: l */
        public static j m24538l(C5303w c5303w, long j10) {
            C5267k c5267k = new C5267k(c5303w.getOutputOptions(), c5303w.getListenerExecutor(), c5303w.m24582b(), c5303w.getIsAudioEnabled(), c5303w.getIsPersistent(), j10);
            c5267k.m24549y(c5303w.getIsAudioInitialMuted());
            return c5267k;
        }

        /* JADX INFO: renamed from: B */
        public C6619n m24539B(AbstractC6601a abstractC6601a, Executor executor) {
            if (!mo24332s()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c andSet = this.f20579d.getAndSet(null);
            if (andSet != null) {
                return andSet.mo24550a(abstractC6601a, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        /* JADX INFO: renamed from: F */
        public MediaMuxer m24540F(int i10, InterfaceC12631a<Uri> interfaceC12631a) throws IOException {
            if (!this.f20577b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f20578c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.mo24551a(i10, interfaceC12631a);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        /* JADX INFO: renamed from: H */
        public final void m24541H(AbstractC5241b2 abstractC5241b2) {
            if ((abstractC5241b2 instanceof AbstractC5241b2.d) || (abstractC5241b2 instanceof AbstractC5241b2.c)) {
                this.f20582g.m35552k(Boolean.TRUE);
            } else if ((abstractC5241b2 instanceof AbstractC5241b2.b) || (abstractC5241b2 instanceof AbstractC5241b2.a)) {
                this.f20582g.m35552k(Boolean.FALSE);
            }
        }

        /* JADX INFO: renamed from: I */
        public void m24542I(AbstractC5241b2 abstractC5241b2) {
            m24543L(abstractC5241b2, true);
        }

        /* JADX INFO: renamed from: L */
        public void m24543L(final AbstractC5241b2 abstractC5241b2, boolean z10) {
            if (!Objects.equals(abstractC5241b2.m24256c(), mo24330o())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + abstractC5241b2.m24256c() + ", Expected: " + mo24330o() + "]");
            }
            if (z10) {
                String str = "Sending VideoRecordEvent " + abstractC5241b2.getClass().getSimpleName();
                if (abstractC5241b2 instanceof AbstractC5241b2.a) {
                    AbstractC5241b2.a aVar = (AbstractC5241b2.a) abstractC5241b2;
                    if (aVar.m24260k()) {
                        str = str + String.format(" [error: %s]", AbstractC5241b2.a.m24257h(aVar.m24259j()));
                    }
                }
                C5931r1.m26561a("Recorder", str);
            }
            m24541H(abstractC5241b2);
            if (mo24328m() == null || mo24329n() == null) {
                return;
            }
            try {
                mo24328m().execute(new Runnable() { // from class: f1.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20643a.mo24329n().accept(abstractC5241b2);
                    }
                });
            } catch (RejectedExecutionException e10) {
                C5931r1.m26564d("Recorder", "The callback executor is invalid.", e10);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            m24544h(Uri.EMPTY);
        }

        public void finalize() throws Throwable {
            try {
                this.f20576a.m38907d();
                InterfaceC12631a<Uri> andSet = this.f20580e.getAndSet(null);
                if (andSet != null) {
                    m24545j(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m24544h(Uri uri) {
            if (this.f20577b.get()) {
                m24545j(this.f20580e.getAndSet(null), uri);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m24545j(InterfaceC12631a<Uri> interfaceC12631a, Uri uri) {
            if (interfaceC12631a != null) {
                this.f20576a.m38905a();
                interfaceC12631a.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        /* JADX INFO: renamed from: m */
        public abstract Executor mo24328m();

        /* JADX INFO: renamed from: n */
        public abstract InterfaceC12631a<AbstractC5241b2> mo24329n();

        /* JADX INFO: renamed from: o */
        public abstract AbstractC5297u mo24330o();

        /* JADX INFO: renamed from: q */
        public abstract long mo24331q();

        /* JADX INFO: renamed from: r */
        public AbstractC8822s3<Boolean> m24546r() {
            return this.f20582g;
        }

        /* JADX INFO: renamed from: s */
        public abstract boolean mo24332s();

        /* JADX INFO: renamed from: u */
        public void m24547u(final Context context) {
            if (this.f20577b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final AbstractC5297u abstractC5297uMo24330o = mo24330o();
            boolean z10 = abstractC5297uMo24330o instanceof C5285q;
            InterfaceC12631a<Uri> interfaceC12631a = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = z10 ? ((C5285q) abstractC5297uMo24330o).m24432d().dup() : null;
            this.f20576a.m38906c("finalizeRecording");
            this.f20578c.set(new d() { // from class: f1.u0
                @Override // p115f1.C5289r0.j.d
                /* JADX INFO: renamed from: a */
                public final MediaMuxer mo24551a(int i10, InterfaceC12631a interfaceC12631a2) {
                    return C5289r0.j.m24536f(abstractC5297uMo24330o, parcelFileDescriptorDup, i10, interfaceC12631a2);
                }
            });
            if (mo24332s()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f20579d.set(new a(context));
                } else {
                    this.f20579d.set(new b());
                }
            }
            if (abstractC5297uMo24330o instanceof C5294t) {
                final C5294t c5294t = (C5294t) abstractC5297uMo24330o;
                interfaceC12631a = Build.VERSION.SDK_INT >= 29 ? new InterfaceC12631a() { // from class: f1.v0
                    @Override // p533x2.InterfaceC12631a
                    public final void accept(Object obj) {
                        C5289r0.j.m24534d(c5294t, (Uri) obj);
                    }
                } : new InterfaceC12631a() { // from class: f1.w0
                    @Override // p533x2.InterfaceC12631a
                    public final void accept(Object obj) throws Throwable {
                        C5289r0.j.m24533c(c5294t, context, (Uri) obj);
                    }
                };
            } else if (z10) {
                interfaceC12631a = new InterfaceC12631a() { // from class: f1.x0
                    @Override // p533x2.InterfaceC12631a
                    public final void accept(Object obj) {
                        C5289r0.j.m24537g(parcelFileDescriptorDup, (Uri) obj);
                    }
                };
            }
            if (interfaceC12631a != null) {
                this.f20580e.set(interfaceC12631a);
            }
        }

        /* JADX INFO: renamed from: v */
        public boolean m24548v() {
            return this.f20581f.get();
        }

        /* JADX INFO: renamed from: w */
        public abstract boolean mo24333w();

        /* JADX INFO: renamed from: y */
        public void m24549y(boolean z10) {
            this.f20581f.set(z10);
        }
    }

    /* JADX INFO: renamed from: f1.r0$k */
    public class k {

        /* JADX INFO: renamed from: a */
        public final C5948v2 f20586a;

        /* JADX INFO: renamed from: b */
        public final EnumC8723a4 f20587b;

        /* JADX INFO: renamed from: c */
        public final int f20588c;

        /* JADX INFO: renamed from: d */
        public boolean f20589d = false;

        /* JADX INFO: renamed from: e */
        public int f20590e = 0;

        /* JADX INFO: renamed from: f */
        public ScheduledFuture<?> f20591f = null;

        /* JADX INFO: renamed from: f1.r0$k$a */
        public class a implements InterfaceC10762c<InterfaceC8369l> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5314z1 f20593a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(C5314z1 c5314z1) {
                this.f20593a = c5314z1;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m24564a(a aVar) {
                if (k.this.f20589d) {
                    return;
                }
                C5931r1.m26561a("Recorder", "Retry setupVideo #" + k.this.f20590e);
                k kVar = k.this;
                kVar.m24562k(kVar.f20586a, k.this.f20587b);
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            @Override // p397r0.InterfaceC10762c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(InterfaceC8369l interfaceC8369l) {
                C5931r1.m26561a("Recorder", "VideoEncoder is created. " + interfaceC8369l);
                if (interfaceC8369l == null) {
                    return;
                }
                C12637g.m47077i(C5289r0.this.f20520h0 == this.f20593a);
                C12637g.m47077i(C5289r0.this.f20487I == null);
                C5289r0.this.m24490b0(this.f20593a);
                C5289r0.this.m24483U();
            }

            @Override // p397r0.InterfaceC10762c
            public void onFailure(Throwable th2) {
                C5931r1.m26573m("Recorder", "VideoEncoder Setup error: " + th2, th2);
                if (k.this.f20590e >= k.this.f20588c) {
                    C5289r0.this.m24484V(th2);
                    return;
                }
                k.m24558g(k.this);
                k.this.f20591f = C5289r0.m24446l0(new Runnable() { // from class: f1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5289r0.k.a.m24564a(this.f20321a);
                    }
                }, C5289r0.this.f20513e, C5289r0.f20468A0, TimeUnit.MILLISECONDS);
            }
        }

        public k(C5948v2 c5948v2, EnumC8723a4 enumC8723a4, boolean z10, int i10) {
            this.f20586a = c5948v2;
            this.f20587b = enumC8723a4;
            C5289r0.this.f20536p0 = z10;
            this.f20588c = i10;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m24552a(k kVar, C5948v2 c5948v2, EnumC8723a4 enumC8723a4) {
            kVar.getClass();
            if (c5948v2.m26660v() || (C5289r0.this.f20520h0.m24618n(c5948v2) && !C5289r0.this.m24481Q())) {
                C5931r1.m26572l("Recorder", "Ignore the SurfaceRequest " + c5948v2 + " isServiced: " + c5948v2.m26660v() + " VideoEncoderSession: " + C5289r0.this.f20520h0 + " has been configured with a persistent in-progress recording.");
                return;
            }
            InterfaceC8378o interfaceC8378o = C5289r0.this.f20515f;
            C5289r0 c5289r0 = C5289r0.this;
            C5314z1 c5314z1 = new C5314z1(interfaceC8378o, c5289r0.f20513e, c5289r0.f20511d);
            C5289r0 c5289r1 = C5289r0.this;
            AbstractC5291s abstractC5291s = (AbstractC5291s) c5289r1.m24476K(c5289r1.f20485G);
            C5902k0 c5902k0M26653o = c5948v2.m26653o();
            AbstractC8383p1 abstractC8383p1M32998g = C7970m.m32998g(C7970m.m32995d(C7970m.m32996e(abstractC5291s, c5902k0M26653o, C5289r0.this.f20544x), enumC8723a4, abstractC5291s.mo24306d(), c5948v2.m26655q(), c5902k0M26653o, c5948v2.m26654p()), C5289r0.this.f20536p0);
            C5289r0.this.f20522i0 = abstractC8383p1M32998g;
            InterfaceFutureC9440x<InterfaceC8369l> interfaceFutureC9440xM24613i = c5314z1.m24613i(c5948v2, abstractC8383p1M32998g);
            C5289r0.this.f20520h0 = c5314z1;
            C10773n.m40987j(interfaceFutureC9440xM24613i, kVar.new a(c5314z1), C5289r0.this.f20513e);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ int m24558g(k kVar) {
            int i10 = kVar.f20590e;
            kVar.f20590e = i10 + 1;
            return i10;
        }

        /* JADX INFO: renamed from: j */
        public void m24561j() {
            if (this.f20589d) {
                return;
            }
            this.f20589d = true;
            ScheduledFuture<?> scheduledFuture = this.f20591f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f20591f = null;
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m24562k(final C5948v2 c5948v2, final EnumC8723a4 enumC8723a4) {
            C5289r0.this.m24499k0().mo37173a(new Runnable() { // from class: f1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    C5289r0.k.m24552a(this.f20298a, c5948v2, enumC8723a4);
                }
            }, C5289r0.this.f20513e);
        }

        /* JADX INFO: renamed from: l */
        public void m24563l() {
            m24562k(this.f20586a, this.f20587b);
        }
    }

    /* JADX INFO: renamed from: f1.r0$l */
    public enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C5235a0 c5235a0 = AbstractC5245c2.f20323b;
        f20471s0 = c5235a0;
        AbstractC5245c2 abstractC5245c2Mo24268a = AbstractC5245c2.m24262a().mo24272e(c5235a0).mo24269b(-1).mo24268a();
        f20472t0 = abstractC5245c2Mo24268a;
        f20473u0 = AbstractC5291s.m24567a().mo24311e(-1).mo24312f(abstractC5245c2Mo24268a).mo24308a();
        f20474v0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f20475w0 = new InterfaceC8378o() { // from class: f1.j0
            @Override // p282m1.InterfaceC8378o
            /* JADX INFO: renamed from: a */
            public final InterfaceC8369l mo24327a(Executor executor, InterfaceC8375n interfaceC8375n, int i10) {
                return new C8361i0(executor, interfaceC8375n, i10);
            }
        };
        f20476x0 = new InterfaceC6265f.a() { // from class: f1.k0
            @Override // p156h1.InterfaceC6265f.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6265f mo24334a(AbstractC5297u abstractC5297u) {
                return new C6266g(abstractC5297u);
            }
        };
        f20477y0 = C10417c.m40086g(C10417c.m40083d());
        f20478z0 = 3;
        f20468A0 = 1000L;
    }

    public C5289r0(Executor executor, AbstractC5291s abstractC5291s, int i10, InterfaceC8378o interfaceC8378o, InterfaceC8378o interfaceC8378o2, InterfaceC6265f.a aVar, long j10) {
        this.f20523j = C7407c.m30691b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f20529m = C8851y2.m35550l(null);
        this.f20531n = l.CONFIGURING;
        this.f20533o = null;
        this.f20535p = 0;
        this.f20537q = null;
        this.f20538r = null;
        this.f20539s = 0L;
        this.f20540t = null;
        this.f20541u = false;
        this.f20542v = null;
        this.f20543w = null;
        this.f20544x = null;
        this.f20545y = new ArrayList();
        this.f20546z = null;
        this.f20479A = null;
        this.f20482D = null;
        this.f20483E = null;
        this.f20484F = null;
        this.f20486H = null;
        this.f20487I = null;
        this.f20488J = null;
        this.f20489K = null;
        this.f20490L = null;
        this.f20491M = h.INITIALIZING;
        this.f20492N = Uri.EMPTY;
        this.f20493O = 0L;
        this.f20494P = 0L;
        this.f20495Q = 0L;
        this.f20496R = Long.MAX_VALUE;
        this.f20497S = 0;
        this.f20498T = Long.MAX_VALUE;
        this.f20499U = Long.MAX_VALUE;
        this.f20500V = Long.MAX_VALUE;
        this.f20501W = 0L;
        this.f20502X = 0L;
        this.f20503Y = 1;
        this.f20504Z = null;
        this.f20506a0 = null;
        this.f20508b0 = new C12271a(60);
        this.f20510c0 = null;
        this.f20512d0 = false;
        this.f20514e0 = InterfaceC5237a2.a.INACTIVE;
        this.f20516f0 = null;
        this.f20518g0 = false;
        this.f20522i0 = null;
        this.f20524j0 = null;
        this.f20526k0 = 0.0d;
        this.f20528l0 = false;
        this.f20530m0 = null;
        this.f20532n0 = null;
        this.f20534o0 = Long.MAX_VALUE;
        this.f20536p0 = false;
        this.f20509c = executor;
        executor = executor == null ? C10417c.m40083d() : executor;
        this.f20511d = executor;
        Executor executorM40086g = C10417c.m40086g(executor);
        this.f20513e = executorM40086g;
        this.f20485G = C8851y2.m35550l(m24467E(abstractC5291s));
        this.f20525k = i10;
        this.f20505a = C8851y2.m35550l(AbstractC5257g1.m24313d(this.f20535p, m24478N(this.f20531n)));
        this.f20507b = C8851y2.m35550l(Boolean.FALSE);
        this.f20515f = interfaceC8378o;
        this.f20517g = interfaceC8378o2;
        this.f20519h = aVar;
        this.f20520h0 = new C5314z1(interfaceC8378o, executorM40086g, executor);
        j10 = j10 == -1 ? 52428800L : j10;
        this.f20527l = j10;
        C5931r1.m26561a("Recorder", "mRequiredFreeStorageBytes = " + C8862e.m35581a(j10));
    }

    /* JADX INFO: renamed from: L */
    public static InterfaceC5260h1 m24438L(int i10, InterfaceC5937t interfaceC5937t, int i11) {
        return new C5248d1(i11, (InterfaceC8799o0) interfaceC5937t, i10, C8395t1.f30947d);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m24439R(C5251e1 c5251e1, j jVar) {
        return jVar != null && c5251e1.m24287d() == jVar.mo24331q();
    }

    /* JADX INFO: renamed from: T */
    public static void m24440T(InterfaceC8369l interfaceC8369l) {
        if (interfaceC8369l instanceof C8361i0) {
            ((C8361i0) interfaceC8369l).m33992c0();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24442i(InterfaceC8369l interfaceC8369l) {
        C5931r1.m26561a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (C7407c.m30691b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            m24440T(interfaceC8369l);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m24443j(C5289r0 c5289r0, C12997c.a aVar, Throwable th2) {
        if (c5289r0.f20510c0 == null) {
            if (th2 instanceof C8357h) {
                c5289r0.m24500m0(h.ERROR_ENCODER);
            } else {
                c5289r0.m24500m0(h.ERROR_SOURCE);
            }
            c5289r0.f20510c0 = th2;
            c5289r0.m24466D0(true);
            aVar.m48314c(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m24445l(C5289r0 c5289r0) {
        C5948v2 c5948v2 = c5289r0.f20480B;
        if (c5948v2 == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        c5289r0.m24469F(c5948v2, c5289r0.f20481C, false);
    }

    /* JADX INFO: renamed from: l0 */
    public static ScheduledFuture<?> m24446l0(final Runnable runnable, final Executor executor, long j10, TimeUnit timeUnit) {
        return C10417c.m40084e().schedule(new Runnable() { // from class: f1.f0
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j10, timeUnit);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m24450p(C5289r0 c5289r0, j jVar, C12997c.a aVar) {
        c5289r0.f20487I.mo33991c(c5289r0.new c(aVar, jVar), c5289r0.f20513e);
        return "videoEncodingFuture";
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m24451q(final C5289r0 c5289r0, j jVar, final C12997c.a aVar) {
        c5289r0.getClass();
        InterfaceC12631a interfaceC12631a = new InterfaceC12631a() { // from class: f1.g0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C5289r0.m24443j(this.f20361a, aVar, (Throwable) obj);
            }
        };
        c5289r0.f20486H.m28560A(c5289r0.f20513e, c5289r0.new d(interfaceC12631a));
        c5289r0.f20489K.mo33991c(c5289r0.new e(aVar, interfaceC12631a, jVar), c5289r0.f20513e);
        return "audioEncodingFuture";
    }

    /* JADX INFO: renamed from: z0 */
    public static int m24461z0(AbstractC6268i abstractC6268i, int i10) {
        if (abstractC6268i != null) {
            int iMo27491e = abstractC6268i.mo27491e();
            if (iMo27491e == 1) {
                return 2;
            }
            if (iMo27491e == 2) {
                return 0;
            }
            if (iMo27491e == 9) {
                return 1;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m24462A0() {
        C5314z1 c5314z1 = this.f20524j0;
        if (c5314z1 == null) {
            m24499k0();
            return;
        }
        C12637g.m47077i(c5314z1.m24617m() == this.f20487I);
        C5931r1.m26561a("Recorder", "Releasing video encoder: " + this.f20487I);
        this.f20524j0.m24622r();
        this.f20524j0 = null;
        this.f20487I = null;
        this.f20488J = null;
        m24502o0(null);
    }

    /* JADX INFO: renamed from: B0 */
    public void m24463B0() {
        boolean z10;
        j jVarM24482S;
        int i10;
        Throwable th2;
        synchronized (this.f20521i) {
            try {
                C5931r1.m26561a("Recorder", "tryServicePendingRecording on state: " + this.f20531n);
                int iOrdinal = this.f20531n.ordinal();
                boolean z11 = true;
                z10 = false;
                i10 = 0;
                jVarM24482S = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                    }
                    th2 = jVarM24482S;
                } else {
                    z11 = false;
                }
                if (this.f20514e0 == InterfaceC5237a2.a.INACTIVE) {
                    jVarM24482S = this.f20538r;
                    this.f20538r = null;
                    m24498j0();
                    i10 = 4;
                    z10 = z11;
                    th2 = f20474v0;
                } else {
                    if (this.f20537q != null || this.f20518g0) {
                        C5931r1.m26572l("Recorder", "PendingRecording is not handled, active recording = " + this.f20537q + ", need reset flag = " + this.f20518g0);
                    } else if (this.f20487I != null) {
                        i10 = 0;
                        z10 = z11;
                        th2 = null;
                        jVarM24482S = m24482S(this.f20531n);
                        jVarM24482S = null;
                    }
                    z10 = z11;
                    th2 = jVarM24482S;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVarM24482S != null) {
            m24510w0(jVarM24482S, z10);
        } else if (jVarM24482S != null) {
            m24473H(jVarM24482S, i10, th2);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m24464C0(final j jVar, boolean z10) {
        if (!this.f20545y.isEmpty()) {
            InterfaceFutureC9440x interfaceFutureC9440xM40988k = C10773n.m40988k(this.f20545y);
            if (!interfaceFutureC9440xM40988k.isDone()) {
                interfaceFutureC9440xM40988k.cancel(true);
            }
            this.f20545y.clear();
        }
        this.f20545y.add(C12997c.m48311a(new C12997c.c() { // from class: f1.d0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5289r0.m24450p(this.f20328a, jVar, aVar);
            }
        }));
        if (m24479O() && !z10) {
            this.f20545y.add(C12997c.m48311a(new C12997c.c() { // from class: f1.e0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C5289r0.m24451q(this.f20337a, jVar, aVar);
                }
            }));
        }
        C10773n.m40987j(C10773n.m40988k(this.f20545y), new f(), C10417c.m40081b());
    }

    /* JADX INFO: renamed from: D */
    public final void m24465D() {
        while (!this.f20508b0.isEmpty()) {
            this.f20508b0.mo45550a();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m24466D0(boolean z10) {
        j jVar = this.f20540t;
        if (jVar != null) {
            jVar.m24543L(AbstractC5241b2.m24255g(jVar.mo24330o(), m24475J()), z10);
        }
    }

    /* JADX INFO: renamed from: E */
    public final AbstractC5291s m24467E(AbstractC5291s abstractC5291s) {
        AbstractC5291s.a aVarMo24307i = abstractC5291s.mo24307i();
        if (abstractC5291s.mo24306d().mo24263b() == -1) {
            aVarMo24307i.m24572b(new InterfaceC12631a() { // from class: f1.i0
                @Override // p533x2.InterfaceC12631a
                public final void accept(Object obj) {
                    ((AbstractC5245c2.a) obj).mo24269b(C5289r0.f20472t0.mo24263b());
                }
            });
        }
        return aVarMo24307i.mo24308a();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m24468E0(l lVar) {
        if (!f20469q0.contains(this.f20531n)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f20531n);
        }
        if (!f20470r0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f20533o != lVar) {
            this.f20533o = lVar;
            this.f20505a.m35552k(AbstractC5257g1.m24314e(this.f20535p, m24478N(lVar), this.f20542v));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m24469F(C5948v2 c5948v2, EnumC8723a4 enumC8723a4, boolean z10) {
        if (c5948v2.m26660v()) {
            C5931r1.m26572l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        c5948v2.m26662x(this.f20513e, new C5948v2.i() { // from class: f1.o0
            @Override // p140g0.C5948v2.i
            /* JADX INFO: renamed from: a */
            public final void mo24343a(C5948v2.h hVar) {
                this.f20421a.f20543w = hVar;
            }
        });
        Size sizeM26655q = c5948v2.m26655q();
        C5902k0 c5902k0M26653o = c5948v2.m26653o();
        InterfaceC5260h1 interfaceC5260h1Mo24242f = mo24242f(c5948v2.m26651m().mo22074d(), c5948v2.m26656r());
        C5306x c5306xMo24275a = interfaceC5260h1Mo24242f.mo24275a(sizeM26655q, c5902k0M26653o);
        C5931r1.m26561a("Recorder", "Using supported quality of " + c5306xMo24275a + " for surface size " + sizeM26655q);
        if (c5306xMo24275a != C5306x.f20635g) {
            AbstractC6268i abstractC6268iMo24278d = interfaceC5260h1Mo24242f.mo24278d(c5306xMo24275a, c5902k0M26653o);
            this.f20544x = abstractC6268iMo24278d;
            if (abstractC6268iMo24278d == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        C5931r1.m26561a("Recorder", "mResolvedEncoderProfiles = " + this.f20544x);
        k kVar = this.f20530m0;
        if (kVar != null) {
            kVar.m24561j();
        }
        k kVar2 = new k(c5948v2, enumC8723a4, this.f20536p0, z10 ? f20478z0 : 0);
        this.f20530m0 = kVar2;
        kVar2.m24563l();
    }

    /* JADX INFO: renamed from: F0 */
    public void m24470F0(InterfaceC8360i interfaceC8360i, j jVar) throws Throwable {
        long size = this.f20493O + interfaceC8360i.size();
        long j10 = this.f20501W;
        if (j10 != 0 && size > j10) {
            C5931r1.m26561a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f20501W)));
            m24485W(jVar, 2, null);
            return;
        }
        long jMo33933f1 = interfaceC8360i.mo33933f1();
        long j11 = this.f20498T;
        if (j11 == Long.MAX_VALUE) {
            this.f20498T = jMo33933f1;
            C5931r1.m26561a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jMo33933f1), C6263d.m27513f(this.f20498T)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jMo33933f1 - Math.min(this.f20496R, j11));
            C12637g.m47078j(this.f20500V != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(jMo33933f1 - this.f20500V);
            long j12 = this.f20502X;
            if (j12 != 0 && nanos2 > j12) {
                C5931r1.m26561a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f20502X)));
                m24485W(jVar, 9, null);
                return;
            }
        }
        try {
            this.f20484F.writeSampleData(this.f20546z.intValue(), interfaceC8360i.mo33935t(), interfaceC8360i.mo33934m0());
            this.f20493O = size;
            this.f20494P += interfaceC8360i.size();
            this.f20500V = jMo33933f1;
        } catch (IllegalStateException e10) {
            m24485W(jVar, ((InterfaceC6265f) C12637g.m47075g(this.f20532n0)).mo27516a() < this.f20527l ? 3 : 1, e10);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m24471G(int i10, Throwable th2) {
        if (this.f20540t == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.f20484F;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f20484F.release();
            } catch (IllegalStateException e10) {
                C5931r1.m26564d("Recorder", "MediaMuxer failed to stop or release with error: " + e10.getMessage(), e10);
                if (i10 == 0) {
                    if (((InterfaceC6265f) C12637g.m47075g(this.f20532n0)).mo27516a() < this.f20527l) {
                        i10 = 3;
                    } else {
                        i10 = this.f20494P == 0 ? 8 : 1;
                    }
                }
            }
            this.f20484F = null;
        } else if (i10 == 0) {
            i10 = 8;
        }
        this.f20540t.m24544h(this.f20492N);
        AbstractC5297u abstractC5297uMo24330o = this.f20540t.mo24330o();
        AbstractC5254f1 abstractC5254f1M24475J = m24475J();
        AbstractC5300v abstractC5300vM24579b = AbstractC5300v.m24579b(this.f20492N);
        this.f20540t.m24542I(i10 == 0 ? AbstractC5241b2.m24250a(abstractC5297uMo24330o, abstractC5254f1M24475J, abstractC5300vM24579b) : AbstractC5241b2.m24251b(abstractC5297uMo24330o, abstractC5254f1M24475J, abstractC5300vM24579b, i10, th2));
        j jVar = this.f20540t;
        this.f20540t = null;
        this.f20541u = false;
        this.f20546z = null;
        this.f20479A = null;
        this.f20545y.clear();
        this.f20492N = Uri.EMPTY;
        this.f20493O = 0L;
        this.f20494P = 0L;
        this.f20495Q = 0L;
        this.f20496R = Long.MAX_VALUE;
        this.f20498T = Long.MAX_VALUE;
        this.f20499U = Long.MAX_VALUE;
        this.f20500V = Long.MAX_VALUE;
        this.f20503Y = 1;
        this.f20504Z = null;
        this.f20510c0 = null;
        this.f20526k0 = 0.0d;
        this.f20532n0 = null;
        this.f20534o0 = Long.MAX_VALUE;
        m24465D();
        m24501n0(null);
        int iOrdinal = this.f20491M.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            m24500m0(h.IDLING);
            this.f20486H.m28565F();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            m24500m0(h.INITIALIZING);
        }
        m24486X(jVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m24472G0(InterfaceC8360i interfaceC8360i, j jVar) throws Throwable {
        if (this.f20479A == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.f20493O + interfaceC8360i.size();
        long j10 = this.f20501W;
        long nanos = 0;
        if (j10 != 0 && size > j10) {
            C5931r1.m26561a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f20501W)));
            m24485W(jVar, 2, null);
            return;
        }
        long jMo33933f1 = interfaceC8360i.mo33933f1();
        long j11 = this.f20496R;
        if (j11 == Long.MAX_VALUE) {
            this.f20496R = jMo33933f1;
            C5931r1.m26561a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jMo33933f1), C6263d.m27513f(this.f20496R)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jMo33933f1 - Math.min(j11, this.f20498T));
            C12637g.m47078j(this.f20499U != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jMo33933f1 - this.f20499U) + nanos;
            long j12 = this.f20502X;
            if (j12 != 0 && nanos2 > j12) {
                C5931r1.m26561a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f20502X)));
                m24485W(jVar, 9, null);
                return;
            }
        }
        try {
            this.f20484F.writeSampleData(this.f20479A.intValue(), interfaceC8360i.mo33935t(), interfaceC8360i.mo33934m0());
            this.f20493O = size;
            this.f20495Q = nanos;
            this.f20499U = jMo33933f1;
            m24466D0(interfaceC8360i.mo33936w0());
            if (size > this.f20534o0) {
                long jMo27516a = ((InterfaceC6265f) C12637g.m47075g(this.f20532n0)).mo27516a();
                C5931r1.m26561a("Recorder", "availableBytes = " + C8862e.m35581a(jMo27516a));
                long j13 = this.f20527l;
                if (jMo27516a < j13) {
                    m24485W(jVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jMo27516a), Long.valueOf(this.f20527l))));
                } else {
                    this.f20534o0 = jMo27516a - j13;
                }
            }
        } catch (IllegalStateException e10) {
            m24485W(jVar, ((InterfaceC6265f) C12637g.m47075g(this.f20532n0)).mo27516a() < this.f20527l ? 3 : 1, e10);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m24473H(j jVar, int i10, Throwable th2) {
        Uri uri = Uri.EMPTY;
        jVar.m24544h(uri);
        jVar.m24542I(AbstractC5241b2.m24251b(jVar.mo24330o(), AbstractC5254f1.m24300d(0L, 0L, AbstractC5238b.m24245e(1, this.f20510c0, 0.0d, 0L)), AbstractC5300v.m24579b(uri), i10, th2));
    }

    /* JADX INFO: renamed from: I */
    public final List<InterfaceC8360i> m24474I(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f20508b0.isEmpty()) {
            InterfaceC8360i interfaceC8360iMo45550a = this.f20508b0.mo45550a();
            if (interfaceC8360iMo45550a.mo33933f1() >= j10) {
                arrayList.add(interfaceC8360iMo45550a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public AbstractC5254f1 m24475J() {
        return AbstractC5254f1.m24300d(this.f20495Q, this.f20493O, AbstractC5238b.m24245e(m24477M(this.f20491M), this.f20510c0, this.f20526k0, this.f20494P));
    }

    /* JADX INFO: renamed from: K */
    public <T> T m24476K(AbstractC8822s3<T> abstractC8822s3) {
        try {
            return abstractC8822s3.mo34017b().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: M */
    public final int m24477M(h hVar) {
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            j jVar = this.f20540t;
            if (jVar == null || !jVar.m24548v()) {
                return this.f20512d0 ? 2 : 0;
            }
            return 5;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + hVar);
    }

    /* JADX INFO: renamed from: N */
    public final AbstractC5257g1.a m24478N(l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) C7407c.m30691b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? AbstractC5257g1.a.ACTIVE : AbstractC5257g1.a.INACTIVE;
    }

    /* JADX INFO: renamed from: O */
    public boolean m24479O() {
        return this.f20491M == h.ENABLED;
    }

    /* JADX INFO: renamed from: P */
    public boolean m24480P() {
        return ((AbstractC5291s) m24476K(this.f20485G)).mo24304b().mo24220c() != 0;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m24481Q() {
        j jVar = this.f20540t;
        return jVar != null && jVar.mo24333w();
    }

    /* JADX INFO: renamed from: S */
    public final j m24482S(l lVar) {
        boolean z10;
        if (lVar == l.PENDING_PAUSED) {
            z10 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f20537q != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f20538r;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f20537q = jVar;
        jVar.m24546r().mo34018c(C10417c.m40081b(), new g());
        this.f20538r = null;
        if (z10) {
            m24503p0(l.PAUSED);
            return jVar;
        }
        m24503p0(l.RECORDING);
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX INFO: renamed from: U */
    public void m24483U() {
        j jVarM24482S;
        boolean z10;
        Exception exc;
        int i10;
        int i11;
        j jVar;
        synchronized (this.f20521i) {
            try {
                jVarM24482S = null;
                switch (this.f20531n) {
                    case CONFIGURING:
                        m24503p0(l.IDLING);
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    case PENDING_RECORDING:
                        z10 = false;
                        if (this.f20537q != null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f20514e0 == InterfaceC5237a2.a.INACTIVE) {
                            jVar = this.f20538r;
                            this.f20538r = null;
                            m24498j0();
                            exc = f20474v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarM24482S = m24482S(this.f20531n);
                            jVar = null;
                        }
                        break;
                    case PENDING_PAUSED:
                        z10 = true;
                        if (this.f20537q != null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f20514e0 == InterfaceC5237a2.a.INACTIVE) {
                            jVar = this.f20538r;
                            this.f20538r = null;
                            m24498j0();
                            exc = f20474v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarM24482S = m24482S(this.f20531n);
                            jVar = null;
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f20531n);
                    case RECORDING:
                        z10 = false;
                        C12637g.m47078j(m24481Q(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case PAUSED:
                        z10 = true;
                        C12637g.m47078j(m24481Q(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case STOPPING:
                        if (!this.f20523j) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                        break;
                    case ERROR:
                        C5931r1.m26563c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    default:
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == 0) {
            if (jVarM24482S != null) {
                m24510w0(jVarM24482S, z10);
                return;
            } else {
                if (jVar != null) {
                    m24473H(jVar, i10, exc);
                    return;
                }
                return;
            }
        }
        m24464C0(this.f20540t, true);
        this.f20487I.start();
        if (this.f20528l0) {
            j jVar2 = this.f20540t;
            jVar2.m24542I(AbstractC5241b2.m24253e(jVar2.mo24330o(), m24475J()));
            this.f20528l0 = false;
        }
        if (z10) {
            this.f20487I.pause();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m24484V(Throwable th2) {
        j jVar;
        synchronized (this.f20521i) {
            try {
                jVar = null;
                switch (this.f20531n) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f20538r;
                        this.f20538r = null;
                        jVar = jVar2;
                    case CONFIGURING:
                        m24504q0(-1);
                        m24503p0(l.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f20531n + ": " + th2);
                    default:
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVar != null) {
            m24473H(jVar, 7, th2);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m24485W(j jVar, int i10, Throwable th2) throws Throwable {
        Throwable th3;
        if (jVar != this.f20540t) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f20521i) {
            try {
                try {
                    boolean z10 = false;
                    switch (this.f20531n) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f20531n);
                        case RECORDING:
                        case PAUSED:
                            try {
                                m24503p0(l.STOPPING);
                                z10 = true;
                                break;
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (jVar != this.f20537q) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z10) {
                                m24512y0(jVar, -1L, i10, th2);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [f1.r0$j] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r8v0, types: [f1.r0] */
    /* JADX INFO: renamed from: X */
    public final void m24486X(j jVar) {
        j jVarM24482S;
        boolean z10;
        Object obj;
        Exception exc;
        int i10;
        int i11;
        int i12;
        C5948v2 c5948v2;
        ?? r8;
        synchronized (this.f20521i) {
            try {
                j jVar2 = this.f20537q;
                if (jVar2 != jVar) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                jVar2.m24546r().m35408f();
                jVarM24482S = null;
                exc = null;
                jVarM24482S = null;
                jVarM24482S = null;
                jVarM24482S = null;
                this.f20537q = null;
                int i13 = 1;
                switch (this.f20531n.ordinal()) {
                    case 1:
                        z10 = false;
                        if (this.f20514e0 == InterfaceC5237a2.a.INACTIVE) {
                            j jVar3 = this.f20538r;
                            this.f20538r = null;
                            m24503p0(l.CONFIGURING);
                            exc = f20474v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r8 = jVar3;
                        } else {
                            if (this.f20523j) {
                                this.f20483E = null;
                                c5948v2 = this.f20480B;
                                if (c5948v2 != null || c5948v2.m26660v()) {
                                    i13 = 0;
                                }
                                m24468E0(l.CONFIGURING);
                                i10 = i13;
                                i11 = 0;
                                i12 = i11;
                            } else if (this.f20487I != null) {
                                exc = null;
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                                jVarM24482S = m24482S(this.f20531n);
                            } else {
                                obj = null;
                                exc = null;
                                i10 = 0;
                                i11 = i10;
                                i12 = i11;
                                r8 = obj;
                            }
                            r8 = exc;
                        }
                        break;
                    case 2:
                        z10 = true;
                        if (this.f20514e0 == InterfaceC5237a2.a.INACTIVE) {
                            j jVar4 = this.f20538r;
                            this.f20538r = null;
                            m24503p0(l.CONFIGURING);
                            exc = f20474v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r8 = jVar4;
                        } else {
                            if (this.f20523j) {
                                this.f20483E = null;
                                c5948v2 = this.f20480B;
                                if (c5948v2 != null) {
                                    i13 = 0;
                                } else {
                                    i13 = 0;
                                }
                                m24468E0(l.CONFIGURING);
                                i10 = i13;
                                i11 = 0;
                                i12 = i11;
                            } else if (this.f20487I != null) {
                                exc = null;
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                                jVarM24482S = m24482S(this.f20531n);
                            } else {
                                obj = null;
                                exc = null;
                                i10 = 0;
                                i11 = i10;
                                i12 = i11;
                                r8 = obj;
                            }
                            r8 = exc;
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f20531n);
                    case 4:
                    case 5:
                    case 6:
                        if (!this.f20523j) {
                            m24503p0(l.IDLING);
                            obj = null;
                            exc = null;
                            z10 = false;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                            r8 = obj;
                        } else {
                            this.f20483E = null;
                            C5948v2 c5948v3 = this.f20480B;
                            if (c5948v3 == null || c5948v3.m26660v()) {
                                i13 = 0;
                            }
                            m24503p0(l.CONFIGURING);
                            i10 = i13;
                            z10 = false;
                            i11 = 0;
                            i12 = i11;
                            r8 = exc;
                        }
                        break;
                    case 7:
                        exc = null;
                        i11 = 1;
                        z10 = false;
                        i10 = 0;
                        i12 = 0;
                        r8 = exc;
                        break;
                    default:
                        obj = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        i12 = i11;
                        r8 = obj;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 != 0) {
            m24469F(this.f20480B, this.f20481C, false);
            return;
        }
        if (i11 != 0) {
            m24496h0();
            return;
        }
        if (jVarM24482S != null) {
            if (this.f20523j) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            m24510w0(jVarM24482S, z10);
        } else if (r8 != 0) {
            m24473H(r8, i12, exc);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m24487Y() {
        boolean z10;
        C5948v2 c5948v2;
        synchronized (this.f20521i) {
            try {
                switch (this.f20531n.ordinal()) {
                    case 1:
                    case 2:
                        m24468E0(l.CONFIGURING);
                        z10 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (m24481Q()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        m24503p0(l.CONFIGURING);
                        z10 = true;
                        break;
                    default:
                        z10 = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20518g0 = false;
        if (!z10 || (c5948v2 = this.f20480B) == null || c5948v2.m26660v()) {
            return;
        }
        m24469F(this.f20480B, this.f20481C, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m24488Z(InterfaceC5237a2.a aVar) throws Throwable {
        ScheduledFuture<?> scheduledFuture;
        InterfaceC8369l interfaceC8369l;
        InterfaceC5237a2.a aVar2 = this.f20514e0;
        this.f20514e0 = aVar;
        if (aVar2 == aVar) {
            C5931r1.m26561a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        C5931r1.m26561a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != InterfaceC5237a2.a.INACTIVE) {
            if (aVar != InterfaceC5237a2.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f20516f0) == null || !scheduledFuture.cancel(false) || (interfaceC8369l = this.f20487I) == null) {
                return;
            }
            m24440T(interfaceC8369l);
            return;
        }
        if (this.f20483E == null) {
            k kVar = this.f20530m0;
            if (kVar != null) {
                kVar.m24561j();
                this.f20530m0 = null;
            }
            m24495g0(4, null, false);
            return;
        }
        this.f20518g0 = true;
        j jVar = this.f20540t;
        if (jVar == null || jVar.mo24333w()) {
            return;
        }
        m24485W(this.f20540t, 4, null);
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: a */
    public void mo24237a(C5948v2 c5948v2) {
        mo24238b(c5948v2, EnumC8723a4.UPTIME, false);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m24489a0(C5948v2 c5948v2, EnumC8723a4 enumC8723a4, boolean z10) {
        C5948v2 c5948v3 = this.f20480B;
        if (c5948v3 != null && !c5948v3.m26660v()) {
            this.f20480B.m26664z();
        }
        this.f20536p0 = z10;
        this.f20480B = c5948v2;
        this.f20481C = enumC8723a4;
        m24469F(c5948v2, enumC8723a4, true);
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: b */
    public void mo24238b(final C5948v2 c5948v2, final EnumC8723a4 enumC8723a4, final boolean z10) {
        synchronized (this.f20521i) {
            try {
                C5931r1.m26561a("Recorder", "Surface is requested in state: " + this.f20531n + ", Current surface: " + this.f20535p);
                if (this.f20531n == l.ERROR) {
                    m24503p0(l.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20513e.execute(new Runnable() { // from class: f1.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20424a.m24489a0(c5948v2, enumC8723a4, z10);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m24490b0(C5314z1 c5314z1) {
        InterfaceC8369l interfaceC8369l = (InterfaceC8369l) C12637g.m47075g(c5314z1.m24617m());
        this.f20487I = interfaceC8369l;
        this.f20529m.m35552k(((InterfaceC8389r1) interfaceC8369l.mo33995e()).mo34057g());
        this.f20497S = this.f20487I.mo34000h();
        Surface surfaceM24615k = c5314z1.m24615k();
        this.f20483E = surfaceM24615k;
        m24502o0(surfaceM24615k);
        c5314z1.m24620p(this.f20513e, new InterfaceC8369l.c.a() { // from class: f1.h0
            @Override // p282m1.InterfaceC8369l.c.a
            /* JADX INFO: renamed from: a */
            public final void mo24320a(Surface surface) {
                this.f20370a.m24502o0(surface);
            }
        });
        C10773n.m40987j(c5314z1.m24616l(), new a(c5314z1), this.f20513e);
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: c */
    public InterfaceC8722a3<AbstractC5291s> mo24239c() {
        return this.f20485G;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m24491c0(j jVar) {
        if (this.f20540t != jVar || this.f20541u) {
            return;
        }
        if (m24479O()) {
            this.f20489K.pause();
        }
        this.f20487I.pause();
        j jVar2 = this.f20540t;
        jVar2.m24542I(AbstractC5241b2.m24252d(jVar2.mo24330o(), m24475J()));
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: d */
    public void mo24240d(final InterfaceC5237a2.a aVar) {
        this.f20513e.execute(new Runnable() { // from class: f1.n0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f20412a.m24488Z(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public C5303w m24492d0(Context context, C5288r c5288r) {
        return m24493e0(context, c5288r);
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: e */
    public InterfaceC8722a3<AbstractC5257g1> mo24241e() {
        return this.f20505a;
    }

    /* JADX INFO: renamed from: e0 */
    public final C5303w m24493e0(Context context, AbstractC5297u abstractC5297u) {
        C12637g.m47076h(abstractC5297u, "The OutputOptions cannot be null.");
        return new C5303w(context, this, abstractC5297u);
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: f */
    public InterfaceC5260h1 mo24242f(InterfaceC5937t interfaceC5937t, int i10) {
        return m24438L(i10 == 1 ? 2 : 1, interfaceC5937t, this.f20525k);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m24494f0() {
        C6619n c6619n = this.f20486H;
        if (c6619n == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f20486H = null;
        C5931r1.m26561a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(c6619n.hashCode())));
        C10773n.m40987j(c6619n.m28576w(), new b(c6619n), C10417c.m40081b());
    }

    @Override // p115f1.InterfaceC5237a2
    /* JADX INFO: renamed from: g */
    public InterfaceC8722a3<Boolean> mo24243g() {
        return this.f20507b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: g0 */
    public void m24495g0(int i10, Throwable th2, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f20521i) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f20531n) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        m24468E0(l.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        C12637g.m47078j(this.f20540t != null, "In-progress recording shouldn't be null when in state " + this.f20531n);
                        if (this.f20537q != this.f20540t) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!m24481Q()) {
                            m24503p0(l.RESETTING);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        m24503p0(l.RESETTING);
                        z11 = false;
                        break;
                    case RESETTING:
                    default:
                        z11 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z11) {
            if (z12) {
                m24512y0(this.f20540t, -1L, i10, th2);
            }
        } else if (z10) {
            m24497i0();
        } else {
            m24496h0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m24496h0() {
        if (this.f20489K != null) {
            C5931r1.m26561a("Recorder", "Releasing audio encoder.");
            this.f20489K.mo33987a();
            this.f20489K = null;
            this.f20490L = null;
        }
        if (this.f20486H != null) {
            m24494f0();
        }
        m24500m0(h.INITIALIZING);
        m24497i0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m24497i0() {
        if (this.f20487I != null) {
            C5931r1.m26561a("Recorder", "Releasing video encoder.");
            m24462A0();
        }
        m24487Y();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m24498j0() {
        if (f20469q0.contains(this.f20531n)) {
            m24503p0(this.f20533o);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f20531n);
    }

    /* JADX INFO: renamed from: k0 */
    public final InterfaceFutureC9440x<Void> m24499k0() {
        C5931r1.m26561a("Recorder", "Try to safely release video encoder: " + this.f20487I);
        return this.f20520h0.m24621q();
    }

    /* JADX INFO: renamed from: m0 */
    public void m24500m0(h hVar) {
        C5931r1.m26561a("Recorder", "Transitioning audio state: " + this.f20491M + " --> " + hVar);
        this.f20491M = hVar;
    }

    /* JADX INFO: renamed from: n0 */
    public void m24501n0(C5948v2.h hVar) {
        C5931r1.m26561a("Recorder", "Update stream transformation info: " + hVar);
        this.f20542v = hVar;
        synchronized (this.f20521i) {
            this.f20505a.m35552k(AbstractC5257g1.m24314e(this.f20535p, m24478N(this.f20531n), hVar));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m24502o0(Surface surface) {
        int iHashCode;
        if (this.f20482D == surface) {
            return;
        }
        this.f20482D = surface;
        synchronized (this.f20521i) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                iHashCode = 0;
            }
            m24504q0(iHashCode);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m24503p0(l lVar) {
        if (this.f20531n == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        C5931r1.m26561a("Recorder", "Transitioning Recorder internal state: " + this.f20531n + " --> " + lVar);
        Set<l> set = f20469q0;
        AbstractC5257g1.a aVarM24478N = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f20531n)) {
                if (!f20470r0.contains(this.f20531n)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f20531n);
                }
                l lVar2 = this.f20531n;
                this.f20533o = lVar2;
                aVarM24478N = m24478N(lVar2);
            }
        } else if (this.f20533o != null) {
            this.f20533o = null;
        }
        this.f20531n = lVar;
        if (aVarM24478N == null) {
            aVarM24478N = m24478N(lVar);
        }
        this.f20505a.m35552k(AbstractC5257g1.m24314e(this.f20535p, aVarM24478N, this.f20542v));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m24504q0(int i10) {
        if (this.f20535p == i10) {
            return;
        }
        C5931r1.m26561a("Recorder", "Transitioning streamId: " + this.f20535p + " --> " + i10);
        this.f20535p = i10;
        this.f20505a.m35552k(AbstractC5257g1.m24314e(i10, m24478N(this.f20531n), this.f20542v));
    }

    /* JADX INFO: renamed from: r0 */
    public void m24505r0(j jVar) {
        if (this.f20484F != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (m24479O() && this.f20508b0.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        InterfaceC8360i interfaceC8360i = this.f20506a0;
        if (interfaceC8360i == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f20506a0 = null;
            List<InterfaceC8360i> listM24474I = m24474I(interfaceC8360i.mo33933f1());
            long size = interfaceC8360i.size();
            Iterator<InterfaceC8360i> it = listM24474I.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j10 = this.f20501W;
            if (j10 != 0 && size > j10) {
                C5931r1.m26561a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f20501W)));
                m24485W(jVar, 2, null);
                interfaceC8360i.close();
                return;
            }
            int i10 = 3;
            try {
                AbstractC5291s abstractC5291s = (AbstractC5291s) m24476K(this.f20485G);
                MediaMuxer mediaMuxerM24540F = jVar.m24540F(abstractC5291s.mo24305c() == -1 ? m24461z0(this.f20544x, AbstractC5291s.m24570g(f20473u0.mo24305c())) : AbstractC5291s.m24570g(abstractC5291s.mo24305c()), new InterfaceC12631a() { // from class: f1.b0
                    @Override // p533x2.InterfaceC12631a
                    public final void accept(Object obj) {
                        this.f20297a.f20492N = (Uri) obj;
                    }
                });
                C5948v2.h hVar = this.f20543w;
                if (hVar != null) {
                    m24501n0(hVar);
                    mediaMuxerM24540F.setOrientationHint(hVar.mo26510b());
                }
                Location locationM24578c = jVar.mo24330o().m24578c();
                if (locationM24578c != null) {
                    try {
                        Pair<Double, Double> pairM37966a = C9621a.m37966a(locationM24578c.getLatitude(), locationM24578c.getLongitude());
                        mediaMuxerM24540F.setLocation((float) ((Double) pairM37966a.first).doubleValue(), (float) ((Double) pairM37966a.second).doubleValue());
                    } catch (IllegalArgumentException e10) {
                        mediaMuxerM24540F.release();
                        m24485W(jVar, 5, e10);
                        interfaceC8360i.close();
                        return;
                    }
                }
                this.f20479A = Integer.valueOf(mediaMuxerM24540F.addTrack(this.f20488J.mo33926a()));
                if (m24479O()) {
                    this.f20546z = Integer.valueOf(mediaMuxerM24540F.addTrack(this.f20490L.mo33926a()));
                }
                try {
                    mediaMuxerM24540F.start();
                    this.f20484F = mediaMuxerM24540F;
                    m24472G0(interfaceC8360i, jVar);
                    Iterator<InterfaceC8360i> it2 = listM24474I.iterator();
                    while (it2.hasNext()) {
                        m24470F0(it2.next(), jVar);
                    }
                    interfaceC8360i.close();
                } catch (IllegalStateException e11) {
                    if (((InterfaceC6265f) C12637g.m47075g(this.f20532n0)).mo27516a() >= this.f20527l) {
                        i10 = 1;
                    }
                    m24485W(jVar, i10, e11);
                    interfaceC8360i.close();
                }
            } catch (IOException e12) {
                if (!C8862e.m35585e(e12)) {
                    i10 = 5;
                }
                m24485W(jVar, i10, e12);
                interfaceC8360i.close();
            }
        } catch (Throwable th2) {
            if (interfaceC8360i != null) {
                try {
                    interfaceC8360i.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m24506s0(j jVar) {
        AbstractC5291s abstractC5291s = (AbstractC5291s) m24476K(this.f20485G);
        AbstractC7962e abstractC7962eM32962c = C7959b.m32962c(abstractC5291s, this.f20544x);
        EnumC8723a4 enumC8723a4 = EnumC8723a4.UPTIME;
        AbstractC8383p1 abstractC8383p1 = (AbstractC8383p1) C12637g.m47075g(this.f20522i0);
        AbstractC6601a abstractC6601aM32963d = C7959b.m32963d(abstractC7962eM32962c, abstractC5291s.mo24304b(), abstractC8383p1.mo33907f() != abstractC8383p1.mo33910i() ? new Rational(abstractC8383p1.mo33907f(), abstractC8383p1.mo33910i()) : null);
        if (this.f20486H != null) {
            m24494f0();
        }
        C6619n c6619nM24507t0 = m24507t0(jVar, abstractC6601aM32963d);
        this.f20486H = c6619nM24507t0;
        C5931r1.m26561a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(c6619nM24507t0.hashCode())));
        InterfaceC8369l interfaceC8369lMo24327a = this.f20517g.mo24327a(this.f20511d, C7959b.m32961b(abstractC7962eM32962c, enumC8723a4, abstractC6601aM32963d, abstractC5291s.mo24304b()), ((C5948v2) C12637g.m47075g(this.f20480B)).m26656r());
        this.f20489K = interfaceC8369lMo24327a;
        InterfaceC8369l.b bVarMo33989b = interfaceC8369lMo24327a.mo33989b();
        if (!(bVarMo33989b instanceof InterfaceC8369l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.f20486H.m28561B((InterfaceC8369l.a) bVarMo33989b);
    }

    /* JADX INFO: renamed from: t0 */
    public final C6619n m24507t0(j jVar, AbstractC6601a abstractC6601a) {
        return jVar.m24539B(abstractC6601a, f20477y0);
    }

    /* JADX INFO: renamed from: u0 */
    public C5251e1 m24508u0(C5303w c5303w) {
        long j10;
        j jVar;
        int i10;
        j jVar2;
        C12637g.m47076h(c5303w, "The given PendingRecording cannot be null.");
        synchronized (this.f20521i) {
            try {
                j10 = this.f20539s + 1;
                this.f20539s = j10;
                jVar = null;
                i10 = 0;
                switch (this.f20531n) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f20531n;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            C12637g.m47078j(this.f20537q == null && this.f20538r == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j jVarM24538l = j.m24538l(c5303w, j10);
                            jVarM24538l.m24547u(c5303w.getApplicationContext());
                            this.f20538r = jVarM24538l;
                            l lVar3 = this.f20531n;
                            if (lVar3 == lVar2) {
                                m24503p0(l.PENDING_RECORDING);
                                this.f20513e.execute(new Runnable() { // from class: f1.l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f20396a.m24463B0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                m24503p0(l.PENDING_RECORDING);
                                this.f20513e.execute(new Runnable() { // from class: f1.m0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C5289r0.m24445l(this.f20402a);
                                    }
                                });
                            } else {
                                m24503p0(l.PENDING_RECORDING);
                            }
                            e = null;
                        } catch (IOException e10) {
                            e = e10;
                            i10 = 5;
                        }
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        jVar2 = (j) C12637g.m47075g(this.f20538r);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f20537q;
                        jVar = jVar2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i10 == 0) {
            return C5251e1.m24285b(c5303w, j10);
        }
        C5931r1.m26563c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        m24473H(j.m24538l(c5303w, j10), i10, e);
        return C5251e1.m24284a(c5303w, j10);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: v0 */
    public final void m24509v0(j jVar) {
        h hVar;
        if (this.f20540t != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.f20540t = jVar;
        InterfaceC6265f interfaceC6265fMo24334a = this.f20519h.mo24334a(jVar.mo24330o());
        this.f20532n0 = interfaceC6265fMo24334a;
        long jMo27516a = interfaceC6265fMo24334a.mo27516a();
        C5931r1.m26561a("Recorder", "availableBytes = " + C8862e.m35581a(jMo27516a));
        long j10 = this.f20527l;
        if (jMo27516a < j10) {
            m24471G(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jMo27516a), Long.valueOf(this.f20527l))));
            return;
        }
        this.f20534o0 = jMo27516a - j10;
        if (jVar.mo24330o().m24577b() > 0) {
            this.f20501W = Math.round(jVar.mo24330o().m24577b() * 0.95d);
            C5931r1.m26561a("Recorder", "File size limit in bytes: " + this.f20501W);
        } else {
            this.f20501W = 0L;
        }
        if (jVar.mo24330o().m24576a() > 0) {
            this.f20502X = TimeUnit.MILLISECONDS.toNanos(jVar.mo24330o().m24576a());
            C5931r1.m26561a("Recorder", "Duration limit in nanoseconds: " + this.f20502X);
        } else {
            this.f20502X = 0L;
        }
        int iOrdinal = this.f20491M.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                m24500m0(jVar.mo24332s() ? h.ENABLED : h.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f20491M);
            }
        } else if (jVar.mo24332s()) {
            if (!m24480P()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.f20540t.mo24333w() || this.f20489K == null) {
                    m24506s0(jVar);
                }
                m24500m0(h.ENABLED);
            } catch (C6620o e10) {
                e = e10;
                C5931r1.m26564d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof C8368k1) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                m24500m0(hVar);
                this.f20510c0 = e;
            } catch (C8368k1 e11) {
                e = e11;
                C5931r1.m26564d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof C8368k1) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                m24500m0(hVar);
                this.f20510c0 = e;
            }
        }
        m24464C0(jVar, false);
        if (m24479O()) {
            this.f20486H.m28563D(jVar.m24548v());
            this.f20489K.start();
        }
        this.f20487I.start();
        j jVar2 = this.f20540t;
        jVar2.m24542I(AbstractC5241b2.m24254f(jVar2.mo24330o(), m24475J()));
    }

    /* JADX INFO: renamed from: w0 */
    public final void m24510w0(j jVar, boolean z10) {
        m24509v0(jVar);
        if (z10) {
            m24491c0(jVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x0 */
    public void m24511x0(C5251e1 c5251e1, int i10, Throwable th2) throws Throwable {
        Throwable th3;
        final int i11;
        final Throwable th4;
        synchronized (this.f20521i) {
            try {
                try {
                    if (!m24439R(c5251e1, this.f20538r)) {
                        try {
                            if (!m24439R(c5251e1, this.f20537q)) {
                                C5931r1.m26561a("Recorder", "stop() called on a recording that is no longer active: " + c5251e1.m24286c());
                                return;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            throw th3;
                        }
                    }
                    j jVar = null;
                    switch (this.f20531n) {
                        case CONFIGURING:
                        case IDLING:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            i11 = i10;
                            th4 = th2;
                            C12637g.m47077i(m24439R(c5251e1, this.f20538r));
                            j jVar2 = this.f20538r;
                            this.f20538r = null;
                            m24498j0();
                            jVar = jVar2;
                            if (jVar != null) {
                                if (i11 == 10) {
                                    C5931r1.m26563c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                m24473H(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case RECORDING:
                        case PAUSED:
                            m24503p0(l.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final j jVar3 = this.f20537q;
                            i11 = i10;
                            th4 = th2;
                            this.f20513e.execute(new Runnable() { // from class: f1.c0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f20316a.m24512y0(jVar3, micros, i11, th4);
                                }
                            });
                            if (jVar != null) {
                                if (i11 == 10) {
                                    C5931r1.m26563c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                m24473H(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case STOPPING:
                        case RESETTING:
                            C12637g.m47077i(m24439R(c5251e1, this.f20537q));
                        default:
                            i11 = i10;
                            th4 = th2;
                            if (jVar != null) {
                                if (i11 == 10) {
                                    C5931r1.m26563c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                m24473H(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
                th3 = th;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m24512y0(j jVar, long j10, int i10, Throwable th2) {
        if (this.f20540t != jVar || this.f20541u) {
            return;
        }
        this.f20541u = true;
        this.f20503Y = i10;
        this.f20504Z = th2;
        if (m24479O()) {
            m24465D();
            this.f20489K.mo33993d(j10);
        }
        InterfaceC8360i interfaceC8360i = this.f20506a0;
        if (interfaceC8360i != null) {
            interfaceC8360i.close();
            this.f20506a0 = null;
        }
        if (this.f20514e0 != InterfaceC5237a2.a.ACTIVE_NON_STREAMING) {
            final InterfaceC8369l interfaceC8369l = this.f20487I;
            this.f20516f0 = m24446l0(new Runnable() { // from class: f1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    C5289r0.m24442i(interfaceC8369l);
                }
            }, this.f20513e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            m24440T(this.f20487I);
        }
        this.f20487I.mo33993d(j10);
    }
}
