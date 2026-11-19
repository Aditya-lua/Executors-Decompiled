package f1;

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
import g0.v2;
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
import n0.a3;
import n0.a4;
import n0.s3;
import n0.y2;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements a2 {
    public static long A0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Set<l> f15007q0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Set<l> f15008r0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a0 f15009s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final c2 f15010t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final s f15011u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Exception f15012v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final m1.o f15013w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h1.f.a f15014x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Executor f15015y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static int f15016z0;
    public Integer A;
    public v2 B;
    public a4 C;
    public Surface D;
    public Surface E;
    public MediaMuxer F;
    public final y2<s> G;
    public i1.n H;
    public m1.l I;
    public m1.l1 J;
    public m1.l K;
    public m1.l1 L;
    public h M;
    public Uri N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;
    public int Y;
    public Throwable Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2<g1> f15017a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public m1.i f15018a0;
    public final y2<Boolean> b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final w0.c<m1.i> f15019b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15020c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Throwable f15021c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f15022d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f15023d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f15024e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a2.a f15025e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1.o f15026f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ScheduledFuture<?> f15027f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1.o f15028g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f15029g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.f.a f15030h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public z1 f15031h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f15032i = new Object();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public m1.p1 f15033i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15034j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public z1 f15035j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f15036k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f15037k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15038l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f15039l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y2<Range<Integer>> f15040m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public k f15041m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f15042n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public h1.f f15043n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f15044o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f15045o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15046p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f15047p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f15048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f15049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f15050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f15051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v2.h f15053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v2.h f15054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h1.i f15055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<pe.x<Void>> f15056y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f15057z;

    public class a implements r0.c<m1.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f15058a;

        public a(z1 z1Var) {
            this.f15058a = z1Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(m1.l lVar) {
            m1.l lVar2;
            g0.r1.a("Recorder", "VideoEncoder can be released: " + lVar);
            if (lVar == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = r0.this.f15027f0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (lVar2 = r0.this.I) != null && lVar2 == lVar) {
                r0.T(lVar2);
            }
            r0 r0Var = r0.this;
            r0Var.f15035j0 = this.f15058a;
            r0Var.o0(null);
            r0 r0Var2 = r0.this;
            r0Var2.g0(4, null, r0Var2.Q());
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.a("Recorder", "Error in ReadyToReleaseFuture: " + th2);
        }
    }

    public class b implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i1.n f15059a;

        public b(i1.n nVar) {
            this.f15059a = nVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
            g0.r1.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f15059a.hashCode())));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f15059a.hashCode())));
        }
    }

    public class c implements m1.m {
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f15060c;

        public c(y1.c.a aVar, j jVar) {
            this.b = aVar;
            this.f15060c = jVar;
        }

        @Override // m1.m
        public void a() {
            this.b.c(null);
        }

        @Override // m1.m
        public void b(m1.i iVar) {
            boolean z10;
            r0 r0Var = r0.this;
            if (r0Var.F != null) {
                try {
                    r0Var.G0(iVar, this.f15060c);
                    if (iVar != null) {
                        iVar.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (iVar != null) {
                        try {
                            iVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (r0Var.f15052u) {
                g0.r1.a("Recorder", "Drop video data since recording is stopping.");
                iVar.close();
                return;
            }
            m1.i iVar2 = r0Var.f15018a0;
            if (iVar2 != null) {
                iVar2.close();
                r0.this.f15018a0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!iVar.v0()) {
                if (z10) {
                    g0.r1.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                g0.r1.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                r0.this.I.g();
                iVar.close();
                return;
            }
            r0 r0Var2 = r0.this;
            r0Var2.f15018a0 = iVar;
            if (!r0Var2.O() || !r0.this.f15019b0.isEmpty()) {
                g0.r1.a("Recorder", "Received video keyframe. Starting muxer...");
                r0.this.r0(this.f15060c);
            } else if (z10) {
                g0.r1.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                g0.r1.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // m1.m
        public void c(m1.h hVar) {
            this.b.f(hVar);
        }

        @Override // m1.m
        public void e() {
        }

        @Override // m1.m
        public void f(m1.l1 l1Var) {
            r0.this.J = l1Var;
        }
    }

    public class d implements i1.n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2.a f15062a;

        public d(x2.a aVar) {
            this.f15062a = aVar;
        }

        @Override // i1.n.c
        public void a(boolean z10) {
            r0 r0Var = r0.this;
            if (r0Var.f15023d0 != z10) {
                r0Var.f15023d0 = z10;
                r0Var.D0(true);
            } else {
                g0.r1.l("Recorder", "Audio source silenced transitions to the same state " + z10);
            }
        }

        @Override // i1.n.c
        public void b(double d10) {
            r0.this.f15037k0 = d10;
        }

        @Override // i1.n.c
        public void onError(Throwable th2) {
            g0.r1.d("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof i1.o) {
                this.f15062a.accept(th2);
            }
        }
    }

    public class e implements m1.m {
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x2.a f15063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f15064d;

        public e(y1.c.a aVar, x2.a aVar2, j jVar) {
            this.b = aVar;
            this.f15063c = aVar2;
            this.f15064d = jVar;
        }

        @Override // m1.m
        public void a() {
            this.b.c(null);
        }

        @Override // m1.m
        public void b(m1.i iVar) {
            r0 r0Var = r0.this;
            if (r0Var.M == h.DISABLED) {
                iVar.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (r0Var.F == null) {
                if (r0Var.f15052u) {
                    g0.r1.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    r0Var.f15019b0.b(new m1.g(iVar));
                    if (r0.this.f15018a0 != null) {
                        g0.r1.a("Recorder", "Received audio data. Starting muxer...");
                        r0.this.r0(this.f15064d);
                    } else {
                        g0.r1.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                iVar.close();
                return;
            }
            try {
                r0Var.F0(iVar, this.f15064d);
                if (iVar != null) {
                    iVar.close();
                }
            } catch (Throwable th2) {
                if (iVar != null) {
                    try {
                        iVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // m1.m
        public void c(m1.h hVar) {
            if (r0.this.f15021c0 == null) {
                this.f15063c.accept(hVar);
            }
        }

        @Override // m1.m
        public void e() {
        }

        @Override // m1.m
        public void f(m1.l1 l1Var) {
            r0.this.L = l1Var;
        }
    }

    public class f implements r0.c<List<Void>> {
        public f() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Void> list) {
            g0.r1.a("Recorder", "Encodings end successfully.");
            r0 r0Var = r0.this;
            r0Var.G(r0Var.Y, r0Var.Z);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            x2.g.j(r0.this.f15051t != null, "In-progress recording shouldn't be null");
            if (r0.this.f15051t.z()) {
                return;
            }
            g0.r1.a("Recorder", "Encodings end with error: " + th2);
            r0 r0Var = r0.this;
            r0Var.G(r0Var.F == null ? 8 : 6, th2);
        }
    }

    public class g implements a3.a<Boolean> {
        public g() {
        }

        @Override // n0.a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            r0.this.b.k(bool);
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            r0.this.b.j(th2);
        }
    }

    public enum h {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s.a f15074a;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f15075c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public m1.o f15076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m1.o f15077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public h1.f.a f15078f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f15079g;

        public i() {
            m1.o oVar = r0.f15013w0;
            this.f15076d = oVar;
            this.f15077e = oVar;
            this.f15078f = r0.f15014x0;
            this.f15079g = -1L;
            this.f15074a = s.a();
        }

        public r0 c() {
            return new r0(this.f15075c, this.f15074a.a(), this.b, this.f15076d, this.f15077e, this.f15078f, this.f15079g);
        }

        public i d(final int i10) {
            this.f15074a.b(new x2.a() { // from class: f1.s0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).b(i10);
                }
            });
            return this;
        }

        public i e(Executor executor) {
            x2.g.h(executor, "The specified executor can't be null.");
            this.f15075c = executor;
            return this;
        }

        public i f(final a0 a0Var) {
            x2.g.h(a0Var, "The specified quality selector can't be null.");
            this.f15074a.b(new x2.a() { // from class: f1.t0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).e(a0Var);
                }
            });
            return this;
        }
    }

    public static abstract class j implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p0.d f15080a = p0.d.b();
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<d> f15081c = new AtomicReference<>(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<c> f15082d = new AtomicReference<>(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<x2.a<Uri>> f15083e = new AtomicReference<>(new x2.a() { // from class: f1.z0
            @Override // x2.a
            public final void accept(Object obj) {
                r0.j.b((Uri) obj);
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f15084f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final y2<Boolean> f15085g = y2.l(Boolean.FALSE);

        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f15086a;

            public a(Context context) {
                this.f15086a = context;
            }

            @Override // f1.r0.j.c
            public i1.n a(i1.a aVar, Executor executor) {
                return new i1.n(aVar, executor, this.f15086a);
            }
        }

        public class b implements c {
            public b() {
            }

            @Override // f1.r0.j.c
            public i1.n a(i1.a aVar, Executor executor) {
                return new i1.n(aVar, executor, null);
            }
        }

        public interface c {
            i1.n a(i1.a aVar, Executor executor);
        }

        public interface d {
            MediaMuxer a(int i10, x2.a<Uri> aVar);
        }

        public static /* synthetic */ void a(String str, Uri uri) {
            if (uri == null) {
                g0.r1.c("Recorder", String.format("File scanning operation failed [path: %s]", str));
            } else {
                g0.r1.a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        public static /* synthetic */ void b(Uri uri) {
        }

        public static /* synthetic */ void c(t tVar, Context context, Uri uri) throws Throwable {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String strB = n1.d.b(tVar.e(), uri, "_data");
            if (strB != null) {
                MediaScannerConnection.scanFile(context, new String[]{strB}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: f1.a1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        r0.j.a(str, uri2);
                    }
                });
                return;
            }
            g0.r1.a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        public static /* synthetic */ void d(t tVar, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            tVar.e().update(uri, contentValues, null, null);
        }

        public static /* synthetic */ MediaMuxer f(u uVar, ParcelFileDescriptor parcelFileDescriptor, int i10, x2.a aVar) throws IOException {
            MediaMuxer mediaMuxerA;
            Uri uriInsert = Uri.EMPTY;
            if (uVar instanceof r) {
                File fileD = ((r) uVar).d();
                if (!n1.d.a(fileD)) {
                    g0.r1.l("Recorder", "Failed to create folder for " + fileD.getAbsolutePath());
                }
                mediaMuxerA = new MediaMuxer(fileD.getAbsolutePath(), i10);
                uriInsert = Uri.fromFile(fileD);
            } else if (uVar instanceof q) {
                mediaMuxerA = j1.c.a(parcelFileDescriptor.getFileDescriptor(), i10);
            } else {
                if (!(uVar instanceof t)) {
                    throw new AssertionError("Invalid output options type: " + uVar.getClass().getSimpleName());
                }
                t tVar = (t) uVar;
                ContentValues contentValues = new ContentValues(tVar.f());
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    uriInsert = tVar.e().insert(tVar.d(), contentValues);
                    if (uriInsert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = tVar.e().openFileDescriptor(uriInsert, "rw");
                    mediaMuxerA = j1.c.a(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), i10);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (RuntimeException e10) {
                    throw new IOException("Unable to create MediaStore entry by " + e10, e10);
                }
            }
            aVar.accept(uriInsert);
            return mediaMuxerA;
        }

        public static /* synthetic */ void g(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e10) {
                g0.r1.d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e10);
            }
        }

        public static j m(w wVar, long j10) {
            f1.k kVar = new f1.k(wVar.getOutputOptions(), wVar.getListenerExecutor(), wVar.b(), wVar.getIsAudioEnabled(), wVar.getIsPersistent(), j10);
            kVar.A(wVar.getIsAudioInitialMuted());
            return kVar;
        }

        public void A(boolean z10) {
            this.f15084f.set(z10);
        }

        public i1.n E(i1.a aVar, Executor executor) {
            if (!u()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c andSet = this.f15082d.getAndSet(null);
            if (andSet != null) {
                return andSet.a(aVar, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        public MediaMuxer I(int i10, x2.a<Uri> aVar) throws IOException {
            if (!this.b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f15081c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i10, aVar);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        public final void K(b2 b2Var) {
            if ((b2Var instanceof b2.d) || (b2Var instanceof b2.c)) {
                this.f15085g.k(Boolean.TRUE);
            } else if ((b2Var instanceof b2.b) || (b2Var instanceof b2.a)) {
                this.f15085g.k(Boolean.FALSE);
            }
        }

        public void L(b2 b2Var) {
            N(b2Var, true);
        }

        public void N(final b2 b2Var, boolean z10) {
            if (!Objects.equals(b2Var.c(), p())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + b2Var.c() + ", Expected: " + p() + "]");
            }
            if (z10) {
                String str = "Sending VideoRecordEvent " + b2Var.getClass().getSimpleName();
                if (b2Var instanceof b2.a) {
                    b2.a aVar = (b2.a) b2Var;
                    if (aVar.k()) {
                        str = str + String.format(" [error: %s]", b2.a.h(aVar.j()));
                    }
                }
                g0.r1.a("Recorder", str);
            }
            K(b2Var);
            if (n() == null || o() == null) {
                return;
            }
            try {
                n().execute(new Runnable() { // from class: f1.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15135a.o().accept(b2Var);
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d("Recorder", "The callback executor is invalid.", e10);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            h(Uri.EMPTY);
        }

        public void finalize() throws Throwable {
            try {
                this.f15080a.d();
                x2.a<Uri> andSet = this.f15083e.getAndSet(null);
                if (andSet != null) {
                    k(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void h(Uri uri) {
            if (this.b.get()) {
                k(this.f15083e.getAndSet(null), uri);
            }
        }

        public final void k(x2.a<Uri> aVar, Uri uri) {
            if (aVar != null) {
                this.f15080a.a();
                aVar.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public abstract Executor n();

        public abstract x2.a<b2> o();

        public abstract u p();

        public abstract long r();

        public s3<Boolean> s() {
            return this.f15085g;
        }

        public abstract boolean u();

        public void w(final Context context) {
            if (this.b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final u uVarP = p();
            boolean z10 = uVarP instanceof q;
            x2.a<Uri> aVar = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = z10 ? ((q) uVarP).d().dup() : null;
            this.f15080a.c("finalizeRecording");
            this.f15081c.set(new d() { // from class: f1.u0
                @Override // f1.r0.j.d
                public final MediaMuxer a(int i10, x2.a aVar2) {
                    return r0.j.f(uVarP, parcelFileDescriptorDup, i10, aVar2);
                }
            });
            if (u()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f15082d.set(new a(context));
                } else {
                    this.f15082d.set(new b());
                }
            }
            if (uVarP instanceof t) {
                final t tVar = (t) uVarP;
                aVar = Build.VERSION.SDK_INT >= 29 ? new x2.a() { // from class: f1.v0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        r0.j.d(tVar, (Uri) obj);
                    }
                } : new x2.a() { // from class: f1.w0
                    @Override // x2.a
                    public final void accept(Object obj) throws Throwable {
                        r0.j.c(tVar, context, (Uri) obj);
                    }
                };
            } else if (z10) {
                aVar = new x2.a() { // from class: f1.x0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        r0.j.g(parcelFileDescriptorDup, (Uri) obj);
                    }
                };
            }
            if (aVar != null) {
                this.f15083e.set(aVar);
            }
        }

        public boolean y() {
            return this.f15084f.get();
        }

        public abstract boolean z();
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v2 f15088a;
        public final a4 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15090d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15091e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ScheduledFuture<?> f15092f = null;

        public class a implements r0.c<m1.l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z1 f15094a;

            public a(z1 z1Var) {
                this.f15094a = z1Var;
            }

            public static /* synthetic */ void a(a aVar) {
                if (k.this.f15090d) {
                    return;
                }
                g0.r1.a("Recorder", "Retry setupVideo #" + k.this.f15091e);
                k kVar = k.this;
                kVar.k(kVar.f15088a, k.this.b);
            }

            @Override // r0.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(m1.l lVar) {
                g0.r1.a("Recorder", "VideoEncoder is created. " + lVar);
                if (lVar == null) {
                    return;
                }
                x2.g.i(r0.this.f15031h0 == this.f15094a);
                x2.g.i(r0.this.I == null);
                r0.this.b0(this.f15094a);
                r0.this.U();
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                g0.r1.m("Recorder", "VideoEncoder Setup error: " + th2, th2);
                if (k.this.f15091e >= k.this.f15089c) {
                    r0.this.V(th2);
                    return;
                }
                k.g(k.this);
                k.this.f15092f = r0.l0(new Runnable() { // from class: f1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.k.a.a(this.f14900a);
                    }
                }, r0.this.f15024e, r0.A0, TimeUnit.MILLISECONDS);
            }
        }

        public k(v2 v2Var, a4 a4Var, boolean z10, int i10) {
            this.f15088a = v2Var;
            this.b = a4Var;
            r0.this.f15047p0 = z10;
            this.f15089c = i10;
        }

        public static /* synthetic */ void a(k kVar, v2 v2Var, a4 a4Var) {
            kVar.getClass();
            if (v2Var.v() || (r0.this.f15031h0.n(v2Var) && !r0.this.Q())) {
                g0.r1.l("Recorder", "Ignore the SurfaceRequest " + v2Var + " isServiced: " + v2Var.v() + " VideoEncoderSession: " + r0.this.f15031h0 + " has been configured with a persistent in-progress recording.");
                return;
            }
            m1.o oVar = r0.this.f15026f;
            r0 r0Var = r0.this;
            z1 z1Var = new z1(oVar, r0Var.f15024e, r0Var.f15022d);
            r0 r0Var2 = r0.this;
            s sVar = (s) r0Var2.K(r0Var2.G);
            g0.k0 k0VarO = v2Var.o();
            m1.p1 p1VarG = l1.m.g(l1.m.d(l1.m.e(sVar, k0VarO, r0.this.f15055x), a4Var, sVar.d(), v2Var.q(), k0VarO, v2Var.p()), r0.this.f15047p0);
            r0.this.f15033i0 = p1VarG;
            pe.x<m1.l> xVarI = z1Var.i(v2Var, p1VarG);
            r0.this.f15031h0 = z1Var;
            r0.n.j(xVarI, kVar.new a(z1Var), r0.this.f15024e);
        }

        public static /* synthetic */ int g(k kVar) {
            int i10 = kVar.f15091e;
            kVar.f15091e = i10 + 1;
            return i10;
        }

        public void j() {
            if (this.f15090d) {
                return;
            }
            this.f15090d = true;
            ScheduledFuture<?> scheduledFuture = this.f15092f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f15092f = null;
            }
        }

        public final void k(final v2 v2Var, final a4 a4Var) {
            r0.this.k0().a(new Runnable() { // from class: f1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.k.a(this.f14881a, v2Var, a4Var);
                }
            }, r0.this.f15024e);
        }

        public void l() {
            k(this.f15088a, this.b);
        }
    }

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
        a0 a0Var = c2.b;
        f15009s0 = a0Var;
        c2 c2VarA = c2.a().e(a0Var).b(-1).a();
        f15010t0 = c2VarA;
        f15011u0 = s.a().e(-1).f(c2VarA).a();
        f15012v0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f15013w0 = new m1.o() { // from class: f1.j0
            @Override // m1.o
            public final m1.l a(Executor executor, m1.n nVar, int i10) {
                return new m1.i0(executor, nVar, i10);
            }
        };
        f15014x0 = new h1.f.a() { // from class: f1.k0
            @Override // h1.f.a
            public final h1.f a(u uVar) {
                return new h1.g(uVar);
            }
        };
        f15015y0 = q0.c.g(q0.c.d());
        f15016z0 = 3;
        A0 = 1000L;
    }

    public r0(Executor executor, s sVar, int i10, m1.o oVar, m1.o oVar2, h1.f.a aVar, long j10) {
        this.f15034j = k1.c.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f15040m = y2.l(null);
        this.f15042n = l.CONFIGURING;
        this.f15044o = null;
        this.f15046p = 0;
        this.f15048q = null;
        this.f15049r = null;
        this.f15050s = 0L;
        this.f15051t = null;
        this.f15052u = false;
        this.f15053v = null;
        this.f15054w = null;
        this.f15055x = null;
        this.f15056y = new ArrayList();
        this.f15057z = null;
        this.A = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = h.INITIALIZING;
        this.N = Uri.EMPTY;
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = Long.MAX_VALUE;
        this.S = 0;
        this.T = Long.MAX_VALUE;
        this.U = Long.MAX_VALUE;
        this.V = Long.MAX_VALUE;
        this.W = 0L;
        this.X = 0L;
        this.Y = 1;
        this.Z = null;
        this.f15018a0 = null;
        this.f15019b0 = new w0.a(60);
        this.f15021c0 = null;
        this.f15023d0 = false;
        this.f15025e0 = a2.a.INACTIVE;
        this.f15027f0 = null;
        this.f15029g0 = false;
        this.f15033i0 = null;
        this.f15035j0 = null;
        this.f15037k0 = 0.0d;
        this.f15039l0 = false;
        this.f15041m0 = null;
        this.f15043n0 = null;
        this.f15045o0 = Long.MAX_VALUE;
        this.f15047p0 = false;
        this.f15020c = executor;
        executor = executor == null ? q0.c.d() : executor;
        this.f15022d = executor;
        Executor executorG = q0.c.g(executor);
        this.f15024e = executorG;
        this.G = y2.l(E(sVar));
        this.f15036k = i10;
        this.f15017a = y2.l(g1.d(this.f15046p, N(this.f15042n)));
        this.b = y2.l(Boolean.FALSE);
        this.f15026f = oVar;
        this.f15028g = oVar2;
        this.f15030h = aVar;
        this.f15031h0 = new z1(oVar, executorG, executor);
        j10 = j10 == -1 ? 52428800L : j10;
        this.f15038l = j10;
        g0.r1.a("Recorder", "mRequiredFreeStorageBytes = " + n1.e.a(j10));
    }

    public static h1 L(int i10, g0.t tVar, int i11) {
        return new d1(i11, (n0.o0) tVar, i10, m1.t1.f22863d);
    }

    public static boolean R(e1 e1Var, j jVar) {
        return jVar != null && e1Var.d() == jVar.r();
    }

    public static void T(m1.l lVar) {
        if (lVar instanceof m1.i0) {
            ((m1.i0) lVar).c0();
        }
    }

    public static /* synthetic */ void i(m1.l lVar) {
        g0.r1.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (k1.c.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            T(lVar);
        }
    }

    public static /* synthetic */ void j(r0 r0Var, y1.c.a aVar, Throwable th2) {
        if (r0Var.f15021c0 == null) {
            if (th2 instanceof m1.h) {
                r0Var.m0(h.ERROR_ENCODER);
            } else {
                r0Var.m0(h.ERROR_SOURCE);
            }
            r0Var.f15021c0 = th2;
            r0Var.D0(true);
            aVar.c(null);
        }
    }

    public static /* synthetic */ void l(r0 r0Var) {
        v2 v2Var = r0Var.B;
        if (v2Var == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        r0Var.F(v2Var, r0Var.C, false);
    }

    public static ScheduledFuture<?> l0(final Runnable runnable, final Executor executor, long j10, TimeUnit timeUnit) {
        return q0.c.e().schedule(new Runnable() { // from class: f1.f0
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j10, timeUnit);
    }

    public static /* synthetic */ Object p(r0 r0Var, j jVar, y1.c.a aVar) {
        r0Var.I.c(r0Var.new c(aVar, jVar), r0Var.f15024e);
        return "videoEncodingFuture";
    }

    public static /* synthetic */ Object q(final r0 r0Var, j jVar, final y1.c.a aVar) {
        r0Var.getClass();
        x2.a aVar2 = new x2.a() { // from class: f1.g0
            @Override // x2.a
            public final void accept(Object obj) {
                r0.j(this.f14928a, aVar, (Throwable) obj);
            }
        };
        r0Var.H.A(r0Var.f15024e, r0Var.new d(aVar2));
        r0Var.K.c(r0Var.new e(aVar, aVar2, jVar), r0Var.f15024e);
        return "audioEncodingFuture";
    }

    public static int z0(h1.i iVar, int i10) {
        if (iVar != null) {
            int iE = iVar.e();
            if (iE == 1) {
                return 2;
            }
            if (iE == 2) {
                return 0;
            }
            if (iE == 9) {
                return 1;
            }
        }
        return i10;
    }

    public final void A0() {
        z1 z1Var = this.f15035j0;
        if (z1Var == null) {
            k0();
            return;
        }
        x2.g.i(z1Var.m() == this.I);
        g0.r1.a("Recorder", "Releasing video encoder: " + this.I);
        this.f15035j0.r();
        this.f15035j0 = null;
        this.I = null;
        this.J = null;
        o0(null);
    }

    public void B0() {
        boolean z10;
        j jVarS;
        int i10;
        Throwable th2;
        synchronized (this.f15032i) {
            try {
                g0.r1.a("Recorder", "tryServicePendingRecording on state: " + this.f15042n);
                int iOrdinal = this.f15042n.ordinal();
                boolean z11 = true;
                z10 = false;
                i10 = 0;
                jVarS = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                    }
                    th2 = jVarS;
                } else {
                    z11 = false;
                }
                if (this.f15025e0 == a2.a.INACTIVE) {
                    jVarS = this.f15049r;
                    this.f15049r = null;
                    j0();
                    i10 = 4;
                    z10 = z11;
                    th2 = f15012v0;
                } else {
                    if (this.f15048q != null || this.f15029g0) {
                        g0.r1.l("Recorder", "PendingRecording is not handled, active recording = " + this.f15048q + ", need reset flag = " + this.f15029g0);
                    } else if (this.I != null) {
                        i10 = 0;
                        z10 = z11;
                        th2 = null;
                        jVarS = S(this.f15042n);
                        jVarS = null;
                    }
                    z10 = z11;
                    th2 = jVarS;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVarS != null) {
            w0(jVarS, z10);
        } else if (jVarS != null) {
            H(jVarS, i10, th2);
        }
    }

    public final void C0(final j jVar, boolean z10) {
        if (!this.f15056y.isEmpty()) {
            pe.x xVarK = r0.n.k(this.f15056y);
            if (!xVarK.isDone()) {
                xVarK.cancel(true);
            }
            this.f15056y.clear();
        }
        this.f15056y.add(y1.c.a(new y1.c.InterfaceC0761c() { // from class: f1.d0
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return r0.p(this.f14905a, jVar, aVar);
            }
        }));
        if (O() && !z10) {
            this.f15056y.add(y1.c.a(new y1.c.InterfaceC0761c() { // from class: f1.e0
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return r0.q(this.f14911a, jVar, aVar);
                }
            }));
        }
        r0.n.j(r0.n.k(this.f15056y), new f(), q0.c.b());
    }

    public final void D() {
        while (!this.f15019b0.isEmpty()) {
            this.f15019b0.a();
        }
    }

    public void D0(boolean z10) {
        j jVar = this.f15051t;
        if (jVar != null) {
            jVar.N(b2.g(jVar.p(), J()), z10);
        }
    }

    public final s E(s sVar) {
        s.a aVarI = sVar.i();
        if (sVar.d().b() == -1) {
            aVarI.b(new x2.a() { // from class: f1.i0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).b(r0.f15010t0.b());
                }
            });
        }
        return aVarI.a();
    }

    public final void E0(l lVar) {
        if (!f15007q0.contains(this.f15042n)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f15042n);
        }
        if (!f15008r0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f15044o != lVar) {
            this.f15044o = lVar;
            this.f15017a.k(g1.e(this.f15046p, N(lVar), this.f15053v));
        }
    }

    public final void F(v2 v2Var, a4 a4Var, boolean z10) {
        if (v2Var.v()) {
            g0.r1.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        v2Var.x(this.f15024e, new v2.i() { // from class: f1.o0
            @Override // g0.v2.i
            public final void a(v2.h hVar) {
                this.f14976a.f15054w = hVar;
            }
        });
        Size sizeQ = v2Var.q();
        g0.k0 k0VarO = v2Var.o();
        h1 h1VarF = f(v2Var.m().d(), v2Var.r());
        x xVarA = h1VarF.a(sizeQ, k0VarO);
        g0.r1.a("Recorder", "Using supported quality of " + xVarA + " for surface size " + sizeQ);
        if (xVarA != x.f15128g) {
            h1.i iVarD = h1VarF.d(xVarA, k0VarO);
            this.f15055x = iVarD;
            if (iVarD == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        g0.r1.a("Recorder", "mResolvedEncoderProfiles = " + this.f15055x);
        k kVar = this.f15041m0;
        if (kVar != null) {
            kVar.j();
        }
        k kVar2 = new k(v2Var, a4Var, this.f15047p0, z10 ? f15016z0 : 0);
        this.f15041m0 = kVar2;
        kVar2.l();
    }

    public void F0(m1.i iVar, j jVar) throws Throwable {
        long size = this.O + iVar.size();
        long j10 = this.W;
        if (j10 != 0 && size > j10) {
            g0.r1.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.W)));
            W(jVar, 2, null);
            return;
        }
        long jD1 = iVar.d1();
        long j11 = this.T;
        if (j11 == Long.MAX_VALUE) {
            this.T = jD1;
            g0.r1.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jD1), h1.d.f(this.T)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jD1 - Math.min(this.R, j11));
            x2.g.j(this.V != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(jD1 - this.V);
            long j12 = this.X;
            if (j12 != 0 && nanos2 > j12) {
                g0.r1.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.X)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.F.writeSampleData(this.f15057z.intValue(), iVar.v(), iVar.o0());
            this.O = size;
            this.P += iVar.size();
            this.V = jD1;
        } catch (IllegalStateException e10) {
            W(jVar, ((h1.f) x2.g.g(this.f15043n0)).a() < this.f15038l ? 3 : 1, e10);
        }
    }

    public void G(int i10, Throwable th2) {
        if (this.f15051t == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.F;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.F.release();
            } catch (IllegalStateException e10) {
                g0.r1.d("Recorder", "MediaMuxer failed to stop or release with error: " + e10.getMessage(), e10);
                if (i10 == 0) {
                    if (((h1.f) x2.g.g(this.f15043n0)).a() < this.f15038l) {
                        i10 = 3;
                    } else {
                        i10 = this.P == 0 ? 8 : 1;
                    }
                }
            }
            this.F = null;
        } else if (i10 == 0) {
            i10 = 8;
        }
        this.f15051t.h(this.N);
        u uVarP = this.f15051t.p();
        f1 f1VarJ = J();
        v vVarB = v.b(this.N);
        this.f15051t.L(i10 == 0 ? b2.a(uVarP, f1VarJ, vVarB) : b2.b(uVarP, f1VarJ, vVarB, i10, th2));
        j jVar = this.f15051t;
        this.f15051t = null;
        this.f15052u = false;
        this.f15057z = null;
        this.A = null;
        this.f15056y.clear();
        this.N = Uri.EMPTY;
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = Long.MAX_VALUE;
        this.T = Long.MAX_VALUE;
        this.U = Long.MAX_VALUE;
        this.V = Long.MAX_VALUE;
        this.Y = 1;
        this.Z = null;
        this.f15021c0 = null;
        this.f15037k0 = 0.0d;
        this.f15043n0 = null;
        this.f15045o0 = Long.MAX_VALUE;
        D();
        n0(null);
        int iOrdinal = this.M.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            m0(h.IDLING);
            this.H.F();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            m0(h.INITIALIZING);
        }
        X(jVar);
    }

    public void G0(m1.i iVar, j jVar) throws Throwable {
        if (this.A == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.O + iVar.size();
        long j10 = this.W;
        long nanos = 0;
        if (j10 != 0 && size > j10) {
            g0.r1.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.W)));
            W(jVar, 2, null);
            return;
        }
        long jD1 = iVar.d1();
        long j11 = this.R;
        if (j11 == Long.MAX_VALUE) {
            this.R = jD1;
            g0.r1.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jD1), h1.d.f(this.R)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jD1 - Math.min(j11, this.T));
            x2.g.j(this.U != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jD1 - this.U) + nanos;
            long j12 = this.X;
            if (j12 != 0 && nanos2 > j12) {
                g0.r1.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.X)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.F.writeSampleData(this.A.intValue(), iVar.v(), iVar.o0());
            this.O = size;
            this.Q = nanos;
            this.U = jD1;
            D0(iVar.v0());
            if (size > this.f15045o0) {
                long jA = ((h1.f) x2.g.g(this.f15043n0)).a();
                g0.r1.a("Recorder", "availableBytes = " + n1.e.a(jA));
                long j13 = this.f15038l;
                if (jA < j13) {
                    W(jVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f15038l))));
                } else {
                    this.f15045o0 = jA - j13;
                }
            }
        } catch (IllegalStateException e10) {
            W(jVar, ((h1.f) x2.g.g(this.f15043n0)).a() < this.f15038l ? 3 : 1, e10);
        }
    }

    public final void H(j jVar, int i10, Throwable th2) {
        Uri uri = Uri.EMPTY;
        jVar.h(uri);
        jVar.L(b2.b(jVar.p(), f1.d(0L, 0L, f1.b.e(1, this.f15021c0, 0.0d, 0L)), v.b(uri), i10, th2));
    }

    public final List<m1.i> I(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f15019b0.isEmpty()) {
            m1.i iVarA = this.f15019b0.a();
            if (iVarA.d1() >= j10) {
                arrayList.add(iVarA);
            }
        }
        return arrayList;
    }

    public f1 J() {
        return f1.d(this.Q, this.O, f1.b.e(M(this.M), this.f15021c0, this.f15037k0, this.P));
    }

    public <T> T K(s3<T> s3Var) {
        try {
            return s3Var.b().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final int M(h hVar) {
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            j jVar = this.f15051t;
            if (jVar == null || !jVar.y()) {
                return this.f15023d0 ? 2 : 0;
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

    public final g1.a N(l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) k1.c.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? g1.a.ACTIVE : g1.a.INACTIVE;
    }

    public boolean O() {
        return this.M == h.ENABLED;
    }

    public boolean P() {
        return ((s) K(this.G)).b().c() != 0;
    }

    public boolean Q() {
        j jVar = this.f15051t;
        return jVar != null && jVar.z();
    }

    public final j S(l lVar) {
        boolean z10;
        if (lVar == l.PENDING_PAUSED) {
            z10 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f15048q != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f15049r;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f15048q = jVar;
        jVar.s().c(q0.c.b(), new g());
        this.f15049r = null;
        if (z10) {
            p0(l.PAUSED);
            return jVar;
        }
        p0(l.RECORDING);
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    public void U() {
        j jVarS;
        boolean z10;
        Exception exc;
        int i10;
        int i11;
        j jVar;
        synchronized (this.f15032i) {
            try {
                jVarS = null;
                switch (this.f15042n) {
                    case CONFIGURING:
                        p0(l.IDLING);
                        jVar = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        break;
                    case PENDING_RECORDING:
                        z10 = false;
                        if (this.f15048q != null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f15025e0 == a2.a.INACTIVE) {
                            jVar = this.f15049r;
                            this.f15049r = null;
                            j0();
                            exc = f15012v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarS = S(this.f15042n);
                            jVar = null;
                        }
                        break;
                    case PENDING_PAUSED:
                        z10 = true;
                        if (this.f15048q != null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f15025e0 == a2.a.INACTIVE) {
                            jVar = this.f15049r;
                            this.f15049r = null;
                            j0();
                            exc = f15012v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarS = S(this.f15042n);
                            jVar = null;
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f15042n);
                    case RECORDING:
                        z10 = false;
                        x2.g.j(Q(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case PAUSED:
                        z10 = true;
                        x2.g.j(Q(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i11 = 1;
                        jVar = null;
                        exc = null;
                        i10 = 0;
                        break;
                    case STOPPING:
                        if (!this.f15034j) {
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
                        g0.r1.c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
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
            if (jVarS != null) {
                w0(jVarS, z10);
                return;
            } else {
                if (jVar != null) {
                    H(jVar, i10, exc);
                    return;
                }
                return;
            }
        }
        C0(this.f15051t, true);
        this.I.start();
        if (this.f15039l0) {
            j jVar2 = this.f15051t;
            jVar2.L(b2.e(jVar2.p(), J()));
            this.f15039l0 = false;
        }
        if (z10) {
            this.I.pause();
        }
    }

    public void V(Throwable th2) {
        j jVar;
        synchronized (this.f15032i) {
            try {
                jVar = null;
                switch (this.f15042n) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f15049r;
                        this.f15049r = null;
                        jVar = jVar2;
                    case CONFIGURING:
                        q0(-1);
                        p0(l.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f15042n + ": " + th2);
                    default:
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVar != null) {
            H(jVar, 7, th2);
        }
    }

    public void W(j jVar, int i10, Throwable th2) throws Throwable {
        Throwable th3;
        if (jVar != this.f15051t) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f15032i) {
            try {
                try {
                    boolean z10 = false;
                    switch (this.f15042n) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f15042n);
                        case RECORDING:
                        case PAUSED:
                            try {
                                p0(l.STOPPING);
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
                            if (jVar != this.f15048q) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z10) {
                                y0(jVar, -1L, i10, th2);
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
    public final void X(j jVar) {
        j jVarS;
        boolean z10;
        Object obj;
        Exception exc;
        int i10;
        int i11;
        int i12;
        v2 v2Var;
        ?? r10;
        synchronized (this.f15032i) {
            try {
                j jVar2 = this.f15048q;
                if (jVar2 != jVar) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                jVar2.s().f();
                jVarS = null;
                exc = null;
                jVarS = null;
                jVarS = null;
                jVarS = null;
                this.f15048q = null;
                int i13 = 1;
                switch (this.f15042n.ordinal()) {
                    case 1:
                        z10 = false;
                        if (this.f15025e0 == a2.a.INACTIVE) {
                            j jVar3 = this.f15049r;
                            this.f15049r = null;
                            p0(l.CONFIGURING);
                            exc = f15012v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r10 = jVar3;
                        } else {
                            if (this.f15034j) {
                                this.E = null;
                                v2Var = this.B;
                                if (v2Var != null || v2Var.v()) {
                                    i13 = 0;
                                }
                                E0(l.CONFIGURING);
                                i10 = i13;
                                i11 = 0;
                                i12 = i11;
                            } else if (this.I != null) {
                                exc = null;
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                                jVarS = S(this.f15042n);
                            } else {
                                obj = null;
                                exc = null;
                                i10 = 0;
                                i11 = i10;
                                i12 = i11;
                                r10 = obj;
                            }
                            r10 = exc;
                        }
                        break;
                    case 2:
                        z10 = true;
                        if (this.f15025e0 == a2.a.INACTIVE) {
                            j jVar4 = this.f15049r;
                            this.f15049r = null;
                            p0(l.CONFIGURING);
                            exc = f15012v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r10 = jVar4;
                        } else {
                            if (this.f15034j) {
                                this.E = null;
                                v2Var = this.B;
                                if (v2Var != null) {
                                    i13 = 0;
                                } else {
                                    i13 = 0;
                                }
                                E0(l.CONFIGURING);
                                i10 = i13;
                                i11 = 0;
                                i12 = i11;
                            } else if (this.I != null) {
                                exc = null;
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                                jVarS = S(this.f15042n);
                            } else {
                                obj = null;
                                exc = null;
                                i10 = 0;
                                i11 = i10;
                                i12 = i11;
                                r10 = obj;
                            }
                            r10 = exc;
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f15042n);
                    case 4:
                    case 5:
                    case 6:
                        if (!this.f15034j) {
                            p0(l.IDLING);
                            obj = null;
                            exc = null;
                            z10 = false;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                            r10 = obj;
                        } else {
                            this.E = null;
                            v2 v2Var2 = this.B;
                            if (v2Var2 == null || v2Var2.v()) {
                                i13 = 0;
                            }
                            p0(l.CONFIGURING);
                            i10 = i13;
                            z10 = false;
                            i11 = 0;
                            i12 = i11;
                            r10 = exc;
                        }
                        break;
                    case 7:
                        exc = null;
                        i11 = 1;
                        z10 = false;
                        i10 = 0;
                        i12 = 0;
                        r10 = exc;
                        break;
                    default:
                        obj = null;
                        exc = null;
                        z10 = false;
                        i10 = 0;
                        i11 = i10;
                        i12 = i11;
                        r10 = obj;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 != 0) {
            F(this.B, this.C, false);
            return;
        }
        if (i11 != 0) {
            h0();
            return;
        }
        if (jVarS != null) {
            if (this.f15034j) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            w0(jVarS, z10);
        } else if (r10 != 0) {
            H(r10, i12, exc);
        }
    }

    public final void Y() {
        boolean z10;
        v2 v2Var;
        synchronized (this.f15032i) {
            try {
                switch (this.f15042n.ordinal()) {
                    case 1:
                    case 2:
                        E0(l.CONFIGURING);
                        z10 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (Q()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        p0(l.CONFIGURING);
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
        this.f15029g0 = false;
        if (!z10 || (v2Var = this.B) == null || v2Var.v()) {
            return;
        }
        F(this.B, this.C, false);
    }

    public void Z(a2.a aVar) throws Throwable {
        ScheduledFuture<?> scheduledFuture;
        m1.l lVar;
        a2.a aVar2 = this.f15025e0;
        this.f15025e0 = aVar;
        if (aVar2 == aVar) {
            g0.r1.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        g0.r1.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != a2.a.INACTIVE) {
            if (aVar != a2.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f15027f0) == null || !scheduledFuture.cancel(false) || (lVar = this.I) == null) {
                return;
            }
            T(lVar);
            return;
        }
        if (this.E == null) {
            k kVar = this.f15041m0;
            if (kVar != null) {
                kVar.j();
                this.f15041m0 = null;
            }
            g0(4, null, false);
            return;
        }
        this.f15029g0 = true;
        j jVar = this.f15051t;
        if (jVar == null || jVar.z()) {
            return;
        }
        W(this.f15051t, 4, null);
    }

    @Override // f1.a2
    public void a(v2 v2Var) {
        b(v2Var, a4.UPTIME, false);
    }

    public final void a0(v2 v2Var, a4 a4Var, boolean z10) {
        v2 v2Var2 = this.B;
        if (v2Var2 != null && !v2Var2.v()) {
            this.B.z();
        }
        this.f15047p0 = z10;
        this.B = v2Var;
        this.C = a4Var;
        F(v2Var, a4Var, true);
    }

    @Override // f1.a2
    public void b(final v2 v2Var, final a4 a4Var, final boolean z10) {
        synchronized (this.f15032i) {
            try {
                g0.r1.a("Recorder", "Surface is requested in state: " + this.f15042n + ", Current surface: " + this.f15046p);
                if (this.f15042n == l.ERROR) {
                    p0(l.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15024e.execute(new Runnable() { // from class: f1.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14979a.a0(v2Var, a4Var, z10);
            }
        });
    }

    public void b0(z1 z1Var) {
        m1.l lVar = (m1.l) x2.g.g(z1Var.m());
        this.I = lVar;
        this.f15040m.k(((m1.r1) lVar.e()).g());
        this.S = this.I.h();
        Surface surfaceK = z1Var.k();
        this.E = surfaceK;
        o0(surfaceK);
        z1Var.p(this.f15024e, new m1.l.c.a() { // from class: f1.h0
            @Override // m1.l.c.a
            public final void a(Surface surface) {
                this.f14934a.o0(surface);
            }
        });
        r0.n.j(z1Var.l(), new a(z1Var), this.f15024e);
    }

    @Override // f1.a2
    public a3<s> c() {
        return this.G;
    }

    public final void c0(j jVar) {
        if (this.f15051t != jVar || this.f15052u) {
            return;
        }
        if (O()) {
            this.K.pause();
        }
        this.I.pause();
        j jVar2 = this.f15051t;
        jVar2.L(b2.d(jVar2.p(), J()));
    }

    @Override // f1.a2
    public void d(final a2.a aVar) {
        this.f15024e.execute(new Runnable() { // from class: f1.n0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f14970a.Z(aVar);
            }
        });
    }

    public w d0(Context context, r rVar) {
        return e0(context, rVar);
    }

    @Override // f1.a2
    public a3<g1> e() {
        return this.f15017a;
    }

    public final w e0(Context context, u uVar) {
        x2.g.h(uVar, "The OutputOptions cannot be null.");
        return new w(context, this, uVar);
    }

    @Override // f1.a2
    public h1 f(g0.t tVar, int i10) {
        return L(i10 == 1 ? 2 : 1, tVar, this.f15036k);
    }

    public final void f0() {
        i1.n nVar = this.H;
        if (nVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.H = null;
        g0.r1.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(nVar.hashCode())));
        r0.n.j(nVar.w(), new b(nVar), q0.c.b());
    }

    @Override // f1.a2
    public a3<Boolean> g() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void g0(int i10, Throwable th2, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f15032i) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f15042n) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        E0(l.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        x2.g.j(this.f15051t != null, "In-progress recording shouldn't be null when in state " + this.f15042n);
                        if (this.f15048q != this.f15051t) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!Q()) {
                            p0(l.RESETTING);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        p0(l.RESETTING);
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
                y0(this.f15051t, -1L, i10, th2);
            }
        } else if (z10) {
            i0();
        } else {
            h0();
        }
    }

    public final void h0() {
        if (this.K != null) {
            g0.r1.a("Recorder", "Releasing audio encoder.");
            this.K.a();
            this.K = null;
            this.L = null;
        }
        if (this.H != null) {
            f0();
        }
        m0(h.INITIALIZING);
        i0();
    }

    public final void i0() {
        if (this.I != null) {
            g0.r1.a("Recorder", "Releasing video encoder.");
            A0();
        }
        Y();
    }

    public final void j0() {
        if (f15007q0.contains(this.f15042n)) {
            p0(this.f15044o);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f15042n);
    }

    public final pe.x<Void> k0() {
        g0.r1.a("Recorder", "Try to safely release video encoder: " + this.I);
        return this.f15031h0.q();
    }

    public void m0(h hVar) {
        g0.r1.a("Recorder", "Transitioning audio state: " + this.M + " --> " + hVar);
        this.M = hVar;
    }

    public void n0(v2.h hVar) {
        g0.r1.a("Recorder", "Update stream transformation info: " + hVar);
        this.f15053v = hVar;
        synchronized (this.f15032i) {
            this.f15017a.k(g1.e(this.f15046p, N(this.f15042n), hVar));
        }
    }

    public void o0(Surface surface) {
        int iHashCode;
        if (this.D == surface) {
            return;
        }
        this.D = surface;
        synchronized (this.f15032i) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                iHashCode = 0;
            }
            q0(iHashCode);
        }
    }

    public void p0(l lVar) {
        if (this.f15042n == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        g0.r1.a("Recorder", "Transitioning Recorder internal state: " + this.f15042n + " --> " + lVar);
        Set<l> set = f15007q0;
        g1.a aVarN = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f15042n)) {
                if (!f15008r0.contains(this.f15042n)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f15042n);
                }
                l lVar2 = this.f15042n;
                this.f15044o = lVar2;
                aVarN = N(lVar2);
            }
        } else if (this.f15044o != null) {
            this.f15044o = null;
        }
        this.f15042n = lVar;
        if (aVarN == null) {
            aVarN = N(lVar);
        }
        this.f15017a.k(g1.e(this.f15046p, aVarN, this.f15053v));
    }

    public final void q0(int i10) {
        if (this.f15046p == i10) {
            return;
        }
        g0.r1.a("Recorder", "Transitioning streamId: " + this.f15046p + " --> " + i10);
        this.f15046p = i10;
        this.f15017a.k(g1.e(i10, N(this.f15042n), this.f15053v));
    }

    public void r0(j jVar) {
        if (this.F != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (O() && this.f15019b0.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        m1.i iVar = this.f15018a0;
        if (iVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f15018a0 = null;
            List<m1.i> listI = I(iVar.d1());
            long size = iVar.size();
            Iterator<m1.i> it = listI.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j10 = this.W;
            if (j10 != 0 && size > j10) {
                g0.r1.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.W)));
                W(jVar, 2, null);
                iVar.close();
                return;
            }
            int i10 = 3;
            try {
                s sVar = (s) K(this.G);
                MediaMuxer mediaMuxerI = jVar.I(sVar.c() == -1 ? z0(this.f15055x, s.g(f15011u0.c())) : s.g(sVar.c()), new x2.a() { // from class: f1.b0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        this.f14880a.N = (Uri) obj;
                    }
                });
                v2.h hVar = this.f15054w;
                if (hVar != null) {
                    n0(hVar);
                    mediaMuxerI.setOrientationHint(hVar.b());
                }
                Location locationC = jVar.p().c();
                if (locationC != null) {
                    try {
                        Pair<Double, Double> pairA = o1.a.a(locationC.getLatitude(), locationC.getLongitude());
                        mediaMuxerI.setLocation((float) ((Double) pairA.first).doubleValue(), (float) ((Double) pairA.second).doubleValue());
                    } catch (IllegalArgumentException e10) {
                        mediaMuxerI.release();
                        W(jVar, 5, e10);
                        iVar.close();
                        return;
                    }
                }
                this.A = Integer.valueOf(mediaMuxerI.addTrack(this.J.a()));
                if (O()) {
                    this.f15057z = Integer.valueOf(mediaMuxerI.addTrack(this.L.a()));
                }
                try {
                    mediaMuxerI.start();
                    this.F = mediaMuxerI;
                    G0(iVar, jVar);
                    Iterator<m1.i> it2 = listI.iterator();
                    while (it2.hasNext()) {
                        F0(it2.next(), jVar);
                    }
                    iVar.close();
                } catch (IllegalStateException e11) {
                    if (((h1.f) x2.g.g(this.f15043n0)).a() >= this.f15038l) {
                        i10 = 1;
                    }
                    W(jVar, i10, e11);
                    iVar.close();
                }
            } catch (IOException e12) {
                if (!n1.e.e(e12)) {
                    i10 = 5;
                }
                W(jVar, i10, e12);
                iVar.close();
            }
        } catch (Throwable th2) {
            if (iVar != null) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final void s0(j jVar) {
        s sVar = (s) K(this.G);
        l1.e eVarC = l1.b.c(sVar, this.f15055x);
        a4 a4Var = a4.UPTIME;
        m1.p1 p1Var = (m1.p1) x2.g.g(this.f15033i0);
        i1.a aVarD = l1.b.d(eVarC, sVar.b(), p1Var.f() != p1Var.i() ? new Rational(p1Var.f(), p1Var.i()) : null);
        if (this.H != null) {
            f0();
        }
        i1.n nVarT0 = t0(jVar, aVarD);
        this.H = nVarT0;
        g0.r1.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(nVarT0.hashCode())));
        m1.l lVarA = this.f15028g.a(this.f15022d, l1.b.b(eVarC, a4Var, aVarD, sVar.b()), ((v2) x2.g.g(this.B)).r());
        this.K = lVarA;
        m1.l.b bVarB = lVarA.b();
        if (!(bVarB instanceof m1.l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.H.B((m1.l.a) bVarB);
    }

    public final i1.n t0(j jVar, i1.a aVar) {
        return jVar.E(aVar, f15015y0);
    }

    public e1 u0(w wVar) {
        long j10;
        j jVar;
        int i10;
        j jVar2;
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        synchronized (this.f15032i) {
            try {
                j10 = this.f15050s + 1;
                this.f15050s = j10;
                jVar = null;
                i10 = 0;
                switch (this.f15042n) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f15042n;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            x2.g.j(this.f15048q == null && this.f15049r == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j jVarM = j.m(wVar, j10);
                            jVarM.w(wVar.getApplicationContext());
                            this.f15049r = jVarM;
                            l lVar3 = this.f15042n;
                            if (lVar3 == lVar2) {
                                p0(l.PENDING_RECORDING);
                                this.f15024e.execute(new Runnable() { // from class: f1.l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f14956a.B0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                p0(l.PENDING_RECORDING);
                                this.f15024e.execute(new Runnable() { // from class: f1.m0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r0.l(this.f14961a);
                                    }
                                });
                            } else {
                                p0(l.PENDING_RECORDING);
                            }
                            e = null;
                        } catch (IOException e10) {
                            e = e10;
                            i10 = 5;
                        }
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        jVar2 = (j) x2.g.g(this.f15049r);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f15048q;
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
            return e1.b(wVar, j10);
        }
        g0.r1.c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        H(j.m(wVar, j10), i10, e);
        return e1.a(wVar, j10);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    @SuppressLint({"MissingPermission"})
    public final void v0(j jVar) {
        h hVar;
        if (this.f15051t != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.f15051t = jVar;
        h1.f fVarA = this.f15030h.a(jVar.p());
        this.f15043n0 = fVarA;
        long jA = fVarA.a();
        g0.r1.a("Recorder", "availableBytes = " + n1.e.a(jA));
        long j10 = this.f15038l;
        if (jA < j10) {
            G(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f15038l))));
            return;
        }
        this.f15045o0 = jA - j10;
        if (jVar.p().b() > 0) {
            this.W = Math.round(jVar.p().b() * 0.95d);
            g0.r1.a("Recorder", "File size limit in bytes: " + this.W);
        } else {
            this.W = 0L;
        }
        if (jVar.p().a() > 0) {
            this.X = TimeUnit.MILLISECONDS.toNanos(jVar.p().a());
            g0.r1.a("Recorder", "Duration limit in nanoseconds: " + this.X);
        } else {
            this.X = 0L;
        }
        int iOrdinal = this.M.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                m0(jVar.u() ? h.ENABLED : h.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.M);
            }
        } else if (jVar.u()) {
            if (!P()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.f15051t.z() || this.K == null) {
                    s0(jVar);
                }
                m0(h.ENABLED);
            } catch (i1.o e10) {
                e = e10;
                g0.r1.d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof m1.k1) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                m0(hVar);
                this.f15021c0 = e;
            } catch (m1.k1 e11) {
                e = e11;
                g0.r1.d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof m1.k1) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                m0(hVar);
                this.f15021c0 = e;
            }
        }
        C0(jVar, false);
        if (O()) {
            this.H.D(jVar.y());
            this.K.start();
        }
        this.I.start();
        j jVar2 = this.f15051t;
        jVar2.L(b2.f(jVar2.p(), J()));
    }

    public final void w0(j jVar, boolean z10) {
        v0(jVar);
        if (z10) {
            c0(jVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public void x0(e1 e1Var, int i10, Throwable th2) throws Throwable {
        Throwable th3;
        final int i11;
        final Throwable th4;
        synchronized (this.f15032i) {
            try {
                try {
                    if (!R(e1Var, this.f15049r)) {
                        try {
                            if (!R(e1Var, this.f15048q)) {
                                g0.r1.a("Recorder", "stop() called on a recording that is no longer active: " + e1Var.c());
                                return;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            throw th3;
                        }
                    }
                    j jVar = null;
                    switch (this.f15042n) {
                        case CONFIGURING:
                        case IDLING:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            i11 = i10;
                            th4 = th2;
                            x2.g.i(R(e1Var, this.f15049r));
                            j jVar2 = this.f15049r;
                            this.f15049r = null;
                            j0();
                            jVar = jVar2;
                            if (jVar != null) {
                                if (i11 == 10) {
                                    g0.r1.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                H(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case RECORDING:
                        case PAUSED:
                            p0(l.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final j jVar3 = this.f15048q;
                            i11 = i10;
                            th4 = th2;
                            this.f15024e.execute(new Runnable() { // from class: f1.c0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f14896a.y0(jVar3, micros, i11, th4);
                                }
                            });
                            if (jVar != null) {
                                if (i11 == 10) {
                                    g0.r1.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                H(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case STOPPING:
                        case RESETTING:
                            x2.g.i(R(e1Var, this.f15048q));
                        default:
                            i11 = i10;
                            th4 = th2;
                            if (jVar != null) {
                                if (i11 == 10) {
                                    g0.r1.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                H(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
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

    public void y0(j jVar, long j10, int i10, Throwable th2) {
        if (this.f15051t != jVar || this.f15052u) {
            return;
        }
        this.f15052u = true;
        this.Y = i10;
        this.Z = th2;
        if (O()) {
            D();
            this.K.d(j10);
        }
        m1.i iVar = this.f15018a0;
        if (iVar != null) {
            iVar.close();
            this.f15018a0 = null;
        }
        if (this.f15025e0 != a2.a.ACTIVE_NON_STREAMING) {
            final m1.l lVar = this.I;
            this.f15027f0 = l0(new Runnable() { // from class: f1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.i(lVar);
                }
            }, this.f15024e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            T(this.I);
        }
        this.I.d(j10);
    }
}
