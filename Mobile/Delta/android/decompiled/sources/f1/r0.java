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
    public static final Set<l> f16530q0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Set<l> f16531r0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final a0 f16532s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final c2 f16533t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final s f16534u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Exception f16535v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final m1.o f16536w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final h1.f.a f16537x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Executor f16538y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static int f16539z0;
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
    public final y2<g1> f16540a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public m1.i f16541a0;
    public final y2<Boolean> b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final w0.c<m1.i> f16542b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16543c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Throwable f16544c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16545d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f16546d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f16547e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a2.a f16548e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1.o f16549f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ScheduledFuture<?> f16550f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1.o f16551g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f16552g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.f.a f16553h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public z1 f16554h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16555i = new Object();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public m1.p1 f16556i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f16557j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public z1 f16558j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16559k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f16560k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f16561l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f16562l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y2<Range<Integer>> f16563m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public k f16564m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f16565n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public h1.f f16566n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f16567o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f16568o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16569p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f16570p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f16571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f16572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f16573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f16574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v2.h f16576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v2.h f16577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h1.i f16578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<ne.x<Void>> f16579y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f16580z;

    public class a implements r0.c<m1.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1 f16581a;

        public a(z1 z1Var) {
            this.f16581a = z1Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(m1.l lVar) {
            m1.l lVar2;
            g0.r1.a("Recorder", "VideoEncoder can be released: " + lVar);
            if (lVar == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = r0.this.f16550f0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (lVar2 = r0.this.I) != null && lVar2 == lVar) {
                r0.T(lVar2);
            }
            r0 r0Var = r0.this;
            r0Var.f16558j0 = this.f16581a;
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
        public final /* synthetic */ i1.n f16582a;

        public b(i1.n nVar) {
            this.f16582a = nVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            g0.r1.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f16582a.hashCode())));
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f16582a.hashCode())));
        }
    }

    public class c implements m1.m {
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f16583c;

        public c(y1.c.a aVar, j jVar) {
            this.b = aVar;
            this.f16583c = jVar;
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
                    r0Var.G0(iVar, this.f16583c);
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
            if (r0Var.f16575u) {
                g0.r1.a("Recorder", "Drop video data since recording is stopping.");
                iVar.close();
                return;
            }
            m1.i iVar2 = r0Var.f16541a0;
            if (iVar2 != null) {
                iVar2.close();
                r0.this.f16541a0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!iVar.s0()) {
                if (z10) {
                    g0.r1.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                g0.r1.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                r0.this.I.g();
                iVar.close();
                return;
            }
            r0 r0Var2 = r0.this;
            r0Var2.f16541a0 = iVar;
            if (!r0Var2.O() || !r0.this.f16542b0.isEmpty()) {
                g0.r1.a("Recorder", "Received video keyframe. Starting muxer...");
                r0.this.r0(this.f16583c);
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
        public final /* synthetic */ x2.a f16585a;

        public d(x2.a aVar) {
            this.f16585a = aVar;
        }

        @Override // i1.n.c
        public void a(boolean z10) {
            r0 r0Var = r0.this;
            if (r0Var.f16546d0 != z10) {
                r0Var.f16546d0 = z10;
                r0Var.D0(true);
            } else {
                g0.r1.l("Recorder", "Audio source silenced transitions to the same state " + z10);
            }
        }

        @Override // i1.n.c
        public void b(double d10) {
            r0.this.f16560k0 = d10;
        }

        @Override // i1.n.c
        public void onError(Throwable th2) {
            g0.r1.d("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof i1.o) {
                this.f16585a.accept(th2);
            }
        }
    }

    public class e implements m1.m {
        public final /* synthetic */ y1.c.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x2.a f16586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f16587d;

        public e(y1.c.a aVar, x2.a aVar2, j jVar) {
            this.b = aVar;
            this.f16586c = aVar2;
            this.f16587d = jVar;
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
                if (r0Var.f16575u) {
                    g0.r1.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    r0Var.f16542b0.b(new m1.g(iVar));
                    if (r0.this.f16541a0 != null) {
                        g0.r1.a("Recorder", "Received audio data. Starting muxer...");
                        r0.this.r0(this.f16587d);
                    } else {
                        g0.r1.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                iVar.close();
                return;
            }
            try {
                r0Var.F0(iVar, this.f16587d);
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
            if (r0.this.f16544c0 == null) {
                this.f16586c.accept(hVar);
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
            x2.g.j(r0.this.f16574t != null, "In-progress recording shouldn't be null");
            if (r0.this.f16574t.w()) {
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
        public final s.a f16597a;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f16598c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public m1.o f16599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m1.o f16600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public h1.f.a f16601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f16602g;

        public i() {
            m1.o oVar = r0.f16536w0;
            this.f16599d = oVar;
            this.f16600e = oVar;
            this.f16601f = r0.f16537x0;
            this.f16602g = -1L;
            this.f16597a = s.a();
        }

        public r0 c() {
            return new r0(this.f16598c, this.f16597a.a(), this.b, this.f16599d, this.f16600e, this.f16601f, this.f16602g);
        }

        public i d(final int i10) {
            this.f16597a.b(new x2.a() { // from class: f1.s0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).b(i10);
                }
            });
            return this;
        }

        public i e(Executor executor) {
            x2.g.h(executor, "The specified executor can't be null.");
            this.f16598c = executor;
            return this;
        }

        public i f(final a0 a0Var) {
            x2.g.h(a0Var, "The specified quality selector can't be null.");
            this.f16597a.b(new x2.a() { // from class: f1.t0
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
        public final p0.d f16603a = p0.d.b();
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<d> f16604c = new AtomicReference<>(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<c> f16605d = new AtomicReference<>(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<x2.a<Uri>> f16606e = new AtomicReference<>(new x2.a() { // from class: f1.z0
            @Override // x2.a
            public final void accept(Object obj) {
                r0.j.b((Uri) obj);
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f16607f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final y2<Boolean> f16608g = y2.l(Boolean.FALSE);

        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f16609a;

            public a(Context context) {
                this.f16609a = context;
            }

            @Override // f1.r0.j.c
            public i1.n a(i1.a aVar, Executor executor) {
                return new i1.n(aVar, executor, this.f16609a);
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

        public static j l(w wVar, long j10) {
            f1.k kVar = new f1.k(wVar.getOutputOptions(), wVar.getListenerExecutor(), wVar.b(), wVar.getIsAudioEnabled(), wVar.getIsPersistent(), j10);
            kVar.x(wVar.getIsAudioInitialMuted());
            return kVar;
        }

        public i1.n A(i1.a aVar, Executor executor) {
            if (!s()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c andSet = this.f16605d.getAndSet(null);
            if (andSet != null) {
                return andSet.a(aVar, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        public MediaMuxer F(int i10, x2.a<Uri> aVar) throws IOException {
            if (!this.b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f16604c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i10, aVar);
            } catch (RuntimeException e10) {
                throw new IOException("Failed to create MediaMuxer by " + e10, e10);
            }
        }

        public final void H(b2 b2Var) {
            if ((b2Var instanceof b2.d) || (b2Var instanceof b2.c)) {
                this.f16608g.k(Boolean.TRUE);
            } else if ((b2Var instanceof b2.b) || (b2Var instanceof b2.a)) {
                this.f16608g.k(Boolean.FALSE);
            }
        }

        public void I(b2 b2Var) {
            L(b2Var, true);
        }

        public void L(final b2 b2Var, boolean z10) {
            if (!Objects.equals(b2Var.c(), o())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + b2Var.c() + ", Expected: " + o() + "]");
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
            H(b2Var);
            if (m() == null || n() == null) {
                return;
            }
            try {
                m().execute(new Runnable() { // from class: f1.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16658a.n().accept(b2Var);
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
                this.f16603a.d();
                x2.a<Uri> andSet = this.f16606e.getAndSet(null);
                if (andSet != null) {
                    j(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void h(Uri uri) {
            if (this.b.get()) {
                j(this.f16606e.getAndSet(null), uri);
            }
        }

        public final void j(x2.a<Uri> aVar, Uri uri) {
            if (aVar != null) {
                this.f16603a.a();
                aVar.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public abstract Executor m();

        public abstract x2.a<b2> n();

        public abstract u o();

        public abstract long q();

        public s3<Boolean> r() {
            return this.f16608g;
        }

        public abstract boolean s();

        public void u(final Context context) {
            if (this.b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final u uVarO = o();
            boolean z10 = uVarO instanceof q;
            x2.a<Uri> aVar = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = z10 ? ((q) uVarO).d().dup() : null;
            this.f16603a.c("finalizeRecording");
            this.f16604c.set(new d() { // from class: f1.u0
                @Override // f1.r0.j.d
                public final MediaMuxer a(int i10, x2.a aVar2) {
                    return r0.j.f(uVarO, parcelFileDescriptorDup, i10, aVar2);
                }
            });
            if (s()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f16605d.set(new a(context));
                } else {
                    this.f16605d.set(new b());
                }
            }
            if (uVarO instanceof t) {
                final t tVar = (t) uVarO;
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
                this.f16606e.set(aVar);
            }
        }

        public boolean v() {
            return this.f16607f.get();
        }

        public abstract boolean w();

        public void x(boolean z10) {
            this.f16607f.set(z10);
        }
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v2 f16611a;
        public final a4 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16613d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16614e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ScheduledFuture<?> f16615f = null;

        public class a implements r0.c<m1.l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z1 f16617a;

            public a(z1 z1Var) {
                this.f16617a = z1Var;
            }

            public static /* synthetic */ void a(a aVar) {
                if (k.this.f16613d) {
                    return;
                }
                g0.r1.a("Recorder", "Retry setupVideo #" + k.this.f16614e);
                k kVar = k.this;
                kVar.k(kVar.f16611a, k.this.b);
            }

            @Override // r0.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(m1.l lVar) {
                g0.r1.a("Recorder", "VideoEncoder is created. " + lVar);
                if (lVar == null) {
                    return;
                }
                x2.g.i(r0.this.f16554h0 == this.f16617a);
                x2.g.i(r0.this.I == null);
                r0.this.b0(this.f16617a);
                r0.this.U();
            }

            @Override // r0.c
            public void onFailure(Throwable th2) {
                g0.r1.m("Recorder", "VideoEncoder Setup error: " + th2, th2);
                if (k.this.f16614e >= k.this.f16612c) {
                    r0.this.V(th2);
                    return;
                }
                k.g(k.this);
                k.this.f16615f = r0.l0(new Runnable() { // from class: f1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.k.a.a(this.f16423a);
                    }
                }, r0.this.f16547e, r0.A0, TimeUnit.MILLISECONDS);
            }
        }

        public k(v2 v2Var, a4 a4Var, boolean z10, int i10) {
            this.f16611a = v2Var;
            this.b = a4Var;
            r0.this.f16570p0 = z10;
            this.f16612c = i10;
        }

        public static /* synthetic */ void a(k kVar, v2 v2Var, a4 a4Var) {
            kVar.getClass();
            if (v2Var.v() || (r0.this.f16554h0.n(v2Var) && !r0.this.Q())) {
                g0.r1.l("Recorder", "Ignore the SurfaceRequest " + v2Var + " isServiced: " + v2Var.v() + " VideoEncoderSession: " + r0.this.f16554h0 + " has been configured with a persistent in-progress recording.");
                return;
            }
            m1.o oVar = r0.this.f16549f;
            r0 r0Var = r0.this;
            z1 z1Var = new z1(oVar, r0Var.f16547e, r0Var.f16545d);
            r0 r0Var2 = r0.this;
            s sVar = (s) r0Var2.K(r0Var2.G);
            g0.k0 k0VarO = v2Var.o();
            m1.p1 p1VarG = l1.m.g(l1.m.d(l1.m.e(sVar, k0VarO, r0.this.f16578x), a4Var, sVar.d(), v2Var.q(), k0VarO, v2Var.p()), r0.this.f16570p0);
            r0.this.f16556i0 = p1VarG;
            ne.x<m1.l> xVarI = z1Var.i(v2Var, p1VarG);
            r0.this.f16554h0 = z1Var;
            r0.n.j(xVarI, kVar.new a(z1Var), r0.this.f16547e);
        }

        public static /* synthetic */ int g(k kVar) {
            int i10 = kVar.f16614e;
            kVar.f16614e = i10 + 1;
            return i10;
        }

        public void j() {
            if (this.f16613d) {
                return;
            }
            this.f16613d = true;
            ScheduledFuture<?> scheduledFuture = this.f16615f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f16615f = null;
            }
        }

        public final void k(final v2 v2Var, final a4 a4Var) {
            r0.this.k0().a(new Runnable() { // from class: f1.b1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.k.a(this.f16404a, v2Var, a4Var);
                }
            }, r0.this.f16547e);
        }

        public void l() {
            k(this.f16611a, this.b);
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
        f16532s0 = a0Var;
        c2 c2VarA = c2.a().e(a0Var).b(-1).a();
        f16533t0 = c2VarA;
        f16534u0 = s.a().e(-1).f(c2VarA).a();
        f16535v0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f16536w0 = new m1.o() { // from class: f1.j0
            @Override // m1.o
            public final m1.l a(Executor executor, m1.n nVar, int i10) {
                return new m1.i0(executor, nVar, i10);
            }
        };
        f16537x0 = new h1.f.a() { // from class: f1.k0
            @Override // h1.f.a
            public final h1.f a(u uVar) {
                return new h1.g(uVar);
            }
        };
        f16538y0 = q0.c.g(q0.c.d());
        f16539z0 = 3;
        A0 = 1000L;
    }

    public r0(Executor executor, s sVar, int i10, m1.o oVar, m1.o oVar2, h1.f.a aVar, long j10) {
        this.f16557j = k1.c.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f16563m = y2.l(null);
        this.f16565n = l.CONFIGURING;
        this.f16567o = null;
        this.f16569p = 0;
        this.f16571q = null;
        this.f16572r = null;
        this.f16573s = 0L;
        this.f16574t = null;
        this.f16575u = false;
        this.f16576v = null;
        this.f16577w = null;
        this.f16578x = null;
        this.f16579y = new ArrayList();
        this.f16580z = null;
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
        this.f16541a0 = null;
        this.f16542b0 = new w0.a(60);
        this.f16544c0 = null;
        this.f16546d0 = false;
        this.f16548e0 = a2.a.INACTIVE;
        this.f16550f0 = null;
        this.f16552g0 = false;
        this.f16556i0 = null;
        this.f16558j0 = null;
        this.f16560k0 = 0.0d;
        this.f16562l0 = false;
        this.f16564m0 = null;
        this.f16566n0 = null;
        this.f16568o0 = Long.MAX_VALUE;
        this.f16570p0 = false;
        this.f16543c = executor;
        executor = executor == null ? q0.c.d() : executor;
        this.f16545d = executor;
        Executor executorG = q0.c.g(executor);
        this.f16547e = executorG;
        this.G = y2.l(E(sVar));
        this.f16559k = i10;
        this.f16540a = y2.l(g1.d(this.f16569p, N(this.f16565n)));
        this.b = y2.l(Boolean.FALSE);
        this.f16549f = oVar;
        this.f16551g = oVar2;
        this.f16553h = aVar;
        this.f16554h0 = new z1(oVar, executorG, executor);
        j10 = j10 == -1 ? 52428800L : j10;
        this.f16561l = j10;
        g0.r1.a("Recorder", "mRequiredFreeStorageBytes = " + n1.e.a(j10));
    }

    public static h1 L(int i10, g0.t tVar, int i11) {
        return new d1(i11, (n0.o0) tVar, i10, m1.t1.f24503d);
    }

    public static boolean R(e1 e1Var, j jVar) {
        return jVar != null && e1Var.d() == jVar.q();
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
        if (r0Var.f16544c0 == null) {
            if (th2 instanceof m1.h) {
                r0Var.m0(h.ERROR_ENCODER);
            } else {
                r0Var.m0(h.ERROR_SOURCE);
            }
            r0Var.f16544c0 = th2;
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
        r0Var.I.c(r0Var.new c(aVar, jVar), r0Var.f16547e);
        return "videoEncodingFuture";
    }

    public static /* synthetic */ Object q(final r0 r0Var, j jVar, final y1.c.a aVar) {
        r0Var.getClass();
        x2.a aVar2 = new x2.a() { // from class: f1.g0
            @Override // x2.a
            public final void accept(Object obj) {
                r0.j(this.f16451a, aVar, (Throwable) obj);
            }
        };
        r0Var.H.A(r0Var.f16547e, r0Var.new d(aVar2));
        r0Var.K.c(r0Var.new e(aVar, aVar2, jVar), r0Var.f16547e);
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
        z1 z1Var = this.f16558j0;
        if (z1Var == null) {
            k0();
            return;
        }
        x2.g.i(z1Var.m() == this.I);
        g0.r1.a("Recorder", "Releasing video encoder: " + this.I);
        this.f16558j0.r();
        this.f16558j0 = null;
        this.I = null;
        this.J = null;
        o0(null);
    }

    public void B0() {
        boolean z10;
        j jVarS;
        int i10;
        Throwable th2;
        synchronized (this.f16555i) {
            try {
                g0.r1.a("Recorder", "tryServicePendingRecording on state: " + this.f16565n);
                int iOrdinal = this.f16565n.ordinal();
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
                if (this.f16548e0 == a2.a.INACTIVE) {
                    jVarS = this.f16572r;
                    this.f16572r = null;
                    j0();
                    i10 = 4;
                    z10 = z11;
                    th2 = f16535v0;
                } else {
                    if (this.f16571q != null || this.f16552g0) {
                        g0.r1.l("Recorder", "PendingRecording is not handled, active recording = " + this.f16571q + ", need reset flag = " + this.f16552g0);
                    } else if (this.I != null) {
                        i10 = 0;
                        z10 = z11;
                        th2 = null;
                        jVarS = S(this.f16565n);
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
        if (!this.f16579y.isEmpty()) {
            ne.x xVarK = r0.n.k(this.f16579y);
            if (!xVarK.isDone()) {
                xVarK.cancel(true);
            }
            this.f16579y.clear();
        }
        this.f16579y.add(y1.c.a(new y1.c.InterfaceC0665c() { // from class: f1.d0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return r0.p(this.f16428a, jVar, aVar);
            }
        }));
        if (O() && !z10) {
            this.f16579y.add(y1.c.a(new y1.c.InterfaceC0665c() { // from class: f1.e0
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return r0.q(this.f16434a, jVar, aVar);
                }
            }));
        }
        r0.n.j(r0.n.k(this.f16579y), new f(), q0.c.b());
    }

    public final void D() {
        while (!this.f16542b0.isEmpty()) {
            this.f16542b0.a();
        }
    }

    public void D0(boolean z10) {
        j jVar = this.f16574t;
        if (jVar != null) {
            jVar.L(b2.g(jVar.o(), J()), z10);
        }
    }

    public final s E(s sVar) {
        s.a aVarI = sVar.i();
        if (sVar.d().b() == -1) {
            aVarI.b(new x2.a() { // from class: f1.i0
                @Override // x2.a
                public final void accept(Object obj) {
                    ((c2.a) obj).b(r0.f16533t0.b());
                }
            });
        }
        return aVarI.a();
    }

    public final void E0(l lVar) {
        if (!f16530q0.contains(this.f16565n)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f16565n);
        }
        if (!f16531r0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f16567o != lVar) {
            this.f16567o = lVar;
            this.f16540a.k(g1.e(this.f16569p, N(lVar), this.f16576v));
        }
    }

    public final void F(v2 v2Var, a4 a4Var, boolean z10) {
        if (v2Var.v()) {
            g0.r1.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        v2Var.x(this.f16547e, new v2.i() { // from class: f1.o0
            @Override // g0.v2.i
            public final void a(v2.h hVar) {
                this.f16499a.f16577w = hVar;
            }
        });
        Size sizeQ = v2Var.q();
        g0.k0 k0VarO = v2Var.o();
        h1 h1VarF = f(v2Var.m().d(), v2Var.r());
        x xVarA = h1VarF.a(sizeQ, k0VarO);
        g0.r1.a("Recorder", "Using supported quality of " + xVarA + " for surface size " + sizeQ);
        if (xVarA != x.f16651g) {
            h1.i iVarD = h1VarF.d(xVarA, k0VarO);
            this.f16578x = iVarD;
            if (iVarD == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        g0.r1.a("Recorder", "mResolvedEncoderProfiles = " + this.f16578x);
        k kVar = this.f16564m0;
        if (kVar != null) {
            kVar.j();
        }
        k kVar2 = new k(v2Var, a4Var, this.f16570p0, z10 ? f16539z0 : 0);
        this.f16564m0 = kVar2;
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
        long jA1 = iVar.a1();
        long j11 = this.T;
        if (j11 == Long.MAX_VALUE) {
            this.T = jA1;
            g0.r1.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jA1), h1.d.f(this.T)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jA1 - Math.min(this.R, j11));
            x2.g.j(this.V != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(jA1 - this.V);
            long j12 = this.X;
            if (j12 != 0 && nanos2 > j12) {
                g0.r1.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.X)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.F.writeSampleData(this.f16580z.intValue(), iVar.t(), iVar.j0());
            this.O = size;
            this.P += iVar.size();
            this.V = jA1;
        } catch (IllegalStateException e10) {
            W(jVar, ((h1.f) x2.g.g(this.f16566n0)).a() < this.f16561l ? 3 : 1, e10);
        }
    }

    public void G(int i10, Throwable th2) {
        if (this.f16574t == null) {
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
                    if (((h1.f) x2.g.g(this.f16566n0)).a() < this.f16561l) {
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
        this.f16574t.h(this.N);
        u uVarO = this.f16574t.o();
        f1 f1VarJ = J();
        v vVarB = v.b(this.N);
        this.f16574t.I(i10 == 0 ? b2.a(uVarO, f1VarJ, vVarB) : b2.b(uVarO, f1VarJ, vVarB, i10, th2));
        j jVar = this.f16574t;
        this.f16574t = null;
        this.f16575u = false;
        this.f16580z = null;
        this.A = null;
        this.f16579y.clear();
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
        this.f16544c0 = null;
        this.f16560k0 = 0.0d;
        this.f16566n0 = null;
        this.f16568o0 = Long.MAX_VALUE;
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
        long jA1 = iVar.a1();
        long j11 = this.R;
        if (j11 == Long.MAX_VALUE) {
            this.R = jA1;
            g0.r1.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jA1), h1.d.f(this.R)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jA1 - Math.min(j11, this.T));
            x2.g.j(this.U != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jA1 - this.U) + nanos;
            long j12 = this.X;
            if (j12 != 0 && nanos2 > j12) {
                g0.r1.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.X)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.F.writeSampleData(this.A.intValue(), iVar.t(), iVar.j0());
            this.O = size;
            this.Q = nanos;
            this.U = jA1;
            D0(iVar.s0());
            if (size > this.f16568o0) {
                long jA = ((h1.f) x2.g.g(this.f16566n0)).a();
                g0.r1.a("Recorder", "availableBytes = " + n1.e.a(jA));
                long j13 = this.f16561l;
                if (jA < j13) {
                    W(jVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f16561l))));
                } else {
                    this.f16568o0 = jA - j13;
                }
            }
        } catch (IllegalStateException e10) {
            W(jVar, ((h1.f) x2.g.g(this.f16566n0)).a() < this.f16561l ? 3 : 1, e10);
        }
    }

    public final void H(j jVar, int i10, Throwable th2) {
        Uri uri = Uri.EMPTY;
        jVar.h(uri);
        jVar.I(b2.b(jVar.o(), f1.d(0L, 0L, f1.b.e(1, this.f16544c0, 0.0d, 0L)), v.b(uri), i10, th2));
    }

    public final List<m1.i> I(long j10) {
        ArrayList arrayList = new ArrayList();
        while (!this.f16542b0.isEmpty()) {
            m1.i iVarA = this.f16542b0.a();
            if (iVarA.a1() >= j10) {
                arrayList.add(iVarA);
            }
        }
        return arrayList;
    }

    public f1 J() {
        return f1.d(this.Q, this.O, f1.b.e(M(this.M), this.f16544c0, this.f16560k0, this.P));
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
            j jVar = this.f16574t;
            if (jVar == null || !jVar.v()) {
                return this.f16546d0 ? 2 : 0;
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
        j jVar = this.f16574t;
        return jVar != null && jVar.w();
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
        if (this.f16571q != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f16572r;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f16571q = jVar;
        jVar.r().c(q0.c.b(), new g());
        this.f16572r = null;
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
        synchronized (this.f16555i) {
            try {
                jVarS = null;
                switch (this.f16565n) {
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
                        if (this.f16571q != null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f16548e0 == a2.a.INACTIVE) {
                            jVar = this.f16572r;
                            this.f16572r = null;
                            j0();
                            exc = f16535v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarS = S(this.f16565n);
                            jVar = null;
                        }
                        break;
                    case PENDING_PAUSED:
                        z10 = true;
                        if (this.f16571q != null) {
                            jVar = null;
                            exc = null;
                            i10 = 0;
                            i11 = i10;
                        } else if (this.f16548e0 == a2.a.INACTIVE) {
                            jVar = this.f16572r;
                            this.f16572r = null;
                            j0();
                            exc = f16535v0;
                            i10 = 4;
                            i11 = 0;
                        } else {
                            exc = null;
                            i10 = 0;
                            i11 = 0;
                            jVarS = S(this.f16565n);
                            jVar = null;
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f16565n);
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
                        if (!this.f16557j) {
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
        C0(this.f16574t, true);
        this.I.start();
        if (this.f16562l0) {
            j jVar2 = this.f16574t;
            jVar2.I(b2.e(jVar2.o(), J()));
            this.f16562l0 = false;
        }
        if (z10) {
            this.I.pause();
        }
    }

    public void V(Throwable th2) {
        j jVar;
        synchronized (this.f16555i) {
            try {
                jVar = null;
                switch (this.f16565n) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f16572r;
                        this.f16572r = null;
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
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f16565n + ": " + th2);
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
        if (jVar != this.f16574t) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f16555i) {
            try {
                try {
                    boolean z10 = false;
                    switch (this.f16565n) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f16565n);
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
                            if (jVar != this.f16571q) {
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
        ?? r8;
        synchronized (this.f16555i) {
            try {
                j jVar2 = this.f16571q;
                if (jVar2 != jVar) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                jVar2.r().f();
                jVarS = null;
                exc = null;
                jVarS = null;
                jVarS = null;
                jVarS = null;
                this.f16571q = null;
                int i13 = 1;
                switch (this.f16565n.ordinal()) {
                    case 1:
                        z10 = false;
                        if (this.f16548e0 == a2.a.INACTIVE) {
                            j jVar3 = this.f16572r;
                            this.f16572r = null;
                            p0(l.CONFIGURING);
                            exc = f16535v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r8 = jVar3;
                        } else {
                            if (this.f16557j) {
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
                                jVarS = S(this.f16565n);
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
                        if (this.f16548e0 == a2.a.INACTIVE) {
                            j jVar4 = this.f16572r;
                            this.f16572r = null;
                            p0(l.CONFIGURING);
                            exc = f16535v0;
                            i11 = 0;
                            i12 = 4;
                            i10 = 0;
                            r8 = jVar4;
                        } else {
                            if (this.f16557j) {
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
                                jVarS = S(this.f16565n);
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
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f16565n);
                    case 4:
                    case 5:
                    case 6:
                        if (!this.f16557j) {
                            p0(l.IDLING);
                            obj = null;
                            exc = null;
                            z10 = false;
                            i10 = 0;
                            i11 = i10;
                            i12 = i11;
                            r8 = obj;
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
            F(this.B, this.C, false);
            return;
        }
        if (i11 != 0) {
            h0();
            return;
        }
        if (jVarS != null) {
            if (this.f16557j) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            w0(jVarS, z10);
        } else if (r8 != 0) {
            H(r8, i12, exc);
        }
    }

    public final void Y() {
        boolean z10;
        v2 v2Var;
        synchronized (this.f16555i) {
            try {
                switch (this.f16565n.ordinal()) {
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
        this.f16552g0 = false;
        if (!z10 || (v2Var = this.B) == null || v2Var.v()) {
            return;
        }
        F(this.B, this.C, false);
    }

    public void Z(a2.a aVar) throws Throwable {
        ScheduledFuture<?> scheduledFuture;
        m1.l lVar;
        a2.a aVar2 = this.f16548e0;
        this.f16548e0 = aVar;
        if (aVar2 == aVar) {
            g0.r1.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        g0.r1.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != a2.a.INACTIVE) {
            if (aVar != a2.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f16550f0) == null || !scheduledFuture.cancel(false) || (lVar = this.I) == null) {
                return;
            }
            T(lVar);
            return;
        }
        if (this.E == null) {
            k kVar = this.f16564m0;
            if (kVar != null) {
                kVar.j();
                this.f16564m0 = null;
            }
            g0(4, null, false);
            return;
        }
        this.f16552g0 = true;
        j jVar = this.f16574t;
        if (jVar == null || jVar.w()) {
            return;
        }
        W(this.f16574t, 4, null);
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
        this.f16570p0 = z10;
        this.B = v2Var;
        this.C = a4Var;
        F(v2Var, a4Var, true);
    }

    @Override // f1.a2
    public void b(final v2 v2Var, final a4 a4Var, final boolean z10) {
        synchronized (this.f16555i) {
            try {
                g0.r1.a("Recorder", "Surface is requested in state: " + this.f16565n + ", Current surface: " + this.f16569p);
                if (this.f16565n == l.ERROR) {
                    p0(l.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16547e.execute(new Runnable() { // from class: f1.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16502a.a0(v2Var, a4Var, z10);
            }
        });
    }

    public void b0(z1 z1Var) {
        m1.l lVar = (m1.l) x2.g.g(z1Var.m());
        this.I = lVar;
        this.f16563m.k(((m1.r1) lVar.e()).g());
        this.S = this.I.h();
        Surface surfaceK = z1Var.k();
        this.E = surfaceK;
        o0(surfaceK);
        z1Var.p(this.f16547e, new m1.l.c.a() { // from class: f1.h0
            @Override // m1.l.c.a
            public final void a(Surface surface) {
                this.f16457a.o0(surface);
            }
        });
        r0.n.j(z1Var.l(), new a(z1Var), this.f16547e);
    }

    @Override // f1.a2
    public a3<s> c() {
        return this.G;
    }

    public final void c0(j jVar) {
        if (this.f16574t != jVar || this.f16575u) {
            return;
        }
        if (O()) {
            this.K.pause();
        }
        this.I.pause();
        j jVar2 = this.f16574t;
        jVar2.I(b2.d(jVar2.o(), J()));
    }

    @Override // f1.a2
    public void d(final a2.a aVar) {
        this.f16547e.execute(new Runnable() { // from class: f1.n0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f16493a.Z(aVar);
            }
        });
    }

    public w d0(Context context, r rVar) {
        return e0(context, rVar);
    }

    @Override // f1.a2
    public a3<g1> e() {
        return this.f16540a;
    }

    public final w e0(Context context, u uVar) {
        x2.g.h(uVar, "The OutputOptions cannot be null.");
        return new w(context, this, uVar);
    }

    @Override // f1.a2
    public h1 f(g0.t tVar, int i10) {
        return L(i10 == 1 ? 2 : 1, tVar, this.f16559k);
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
        synchronized (this.f16555i) {
            try {
                z11 = true;
                z12 = false;
                switch (this.f16565n) {
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
                        x2.g.j(this.f16574t != null, "In-progress recording shouldn't be null when in state " + this.f16565n);
                        if (this.f16571q != this.f16574t) {
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
                y0(this.f16574t, -1L, i10, th2);
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
        if (f16530q0.contains(this.f16565n)) {
            p0(this.f16567o);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f16565n);
    }

    public final ne.x<Void> k0() {
        g0.r1.a("Recorder", "Try to safely release video encoder: " + this.I);
        return this.f16554h0.q();
    }

    public void m0(h hVar) {
        g0.r1.a("Recorder", "Transitioning audio state: " + this.M + " --> " + hVar);
        this.M = hVar;
    }

    public void n0(v2.h hVar) {
        g0.r1.a("Recorder", "Update stream transformation info: " + hVar);
        this.f16576v = hVar;
        synchronized (this.f16555i) {
            this.f16540a.k(g1.e(this.f16569p, N(this.f16565n), hVar));
        }
    }

    public void o0(Surface surface) {
        int iHashCode;
        if (this.D == surface) {
            return;
        }
        this.D = surface;
        synchronized (this.f16555i) {
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
        if (this.f16565n == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        g0.r1.a("Recorder", "Transitioning Recorder internal state: " + this.f16565n + " --> " + lVar);
        Set<l> set = f16530q0;
        g1.a aVarN = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f16565n)) {
                if (!f16531r0.contains(this.f16565n)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f16565n);
                }
                l lVar2 = this.f16565n;
                this.f16567o = lVar2;
                aVarN = N(lVar2);
            }
        } else if (this.f16567o != null) {
            this.f16567o = null;
        }
        this.f16565n = lVar;
        if (aVarN == null) {
            aVarN = N(lVar);
        }
        this.f16540a.k(g1.e(this.f16569p, aVarN, this.f16576v));
    }

    public final void q0(int i10) {
        if (this.f16569p == i10) {
            return;
        }
        g0.r1.a("Recorder", "Transitioning streamId: " + this.f16569p + " --> " + i10);
        this.f16569p = i10;
        this.f16540a.k(g1.e(i10, N(this.f16565n), this.f16576v));
    }

    public void r0(j jVar) {
        if (this.F != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (O() && this.f16542b0.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        m1.i iVar = this.f16541a0;
        if (iVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.f16541a0 = null;
            List<m1.i> listI = I(iVar.a1());
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
                MediaMuxer mediaMuxerF = jVar.F(sVar.c() == -1 ? z0(this.f16578x, s.g(f16534u0.c())) : s.g(sVar.c()), new x2.a() { // from class: f1.b0
                    @Override // x2.a
                    public final void accept(Object obj) {
                        this.f16403a.N = (Uri) obj;
                    }
                });
                v2.h hVar = this.f16577w;
                if (hVar != null) {
                    n0(hVar);
                    mediaMuxerF.setOrientationHint(hVar.b());
                }
                Location locationC = jVar.o().c();
                if (locationC != null) {
                    try {
                        Pair<Double, Double> pairA = o1.a.a(locationC.getLatitude(), locationC.getLongitude());
                        mediaMuxerF.setLocation((float) ((Double) pairA.first).doubleValue(), (float) ((Double) pairA.second).doubleValue());
                    } catch (IllegalArgumentException e10) {
                        mediaMuxerF.release();
                        W(jVar, 5, e10);
                        iVar.close();
                        return;
                    }
                }
                this.A = Integer.valueOf(mediaMuxerF.addTrack(this.J.a()));
                if (O()) {
                    this.f16580z = Integer.valueOf(mediaMuxerF.addTrack(this.L.a()));
                }
                try {
                    mediaMuxerF.start();
                    this.F = mediaMuxerF;
                    G0(iVar, jVar);
                    Iterator<m1.i> it2 = listI.iterator();
                    while (it2.hasNext()) {
                        F0(it2.next(), jVar);
                    }
                    iVar.close();
                } catch (IllegalStateException e11) {
                    if (((h1.f) x2.g.g(this.f16566n0)).a() >= this.f16561l) {
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
        l1.e eVarC = l1.b.c(sVar, this.f16578x);
        a4 a4Var = a4.UPTIME;
        m1.p1 p1Var = (m1.p1) x2.g.g(this.f16556i0);
        i1.a aVarD = l1.b.d(eVarC, sVar.b(), p1Var.f() != p1Var.i() ? new Rational(p1Var.f(), p1Var.i()) : null);
        if (this.H != null) {
            f0();
        }
        i1.n nVarT0 = t0(jVar, aVarD);
        this.H = nVarT0;
        g0.r1.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(nVarT0.hashCode())));
        m1.l lVarA = this.f16551g.a(this.f16545d, l1.b.b(eVarC, a4Var, aVarD, sVar.b()), ((v2) x2.g.g(this.B)).r());
        this.K = lVarA;
        m1.l.b bVarB = lVarA.b();
        if (!(bVarB instanceof m1.l.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.H.B((m1.l.a) bVarB);
    }

    public final i1.n t0(j jVar, i1.a aVar) {
        return jVar.A(aVar, f16538y0);
    }

    public e1 u0(w wVar) {
        long j10;
        j jVar;
        int i10;
        j jVar2;
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        synchronized (this.f16555i) {
            try {
                j10 = this.f16573s + 1;
                this.f16573s = j10;
                jVar = null;
                i10 = 0;
                switch (this.f16565n) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f16565n;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            x2.g.j(this.f16571q == null && this.f16572r == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j jVarL = j.l(wVar, j10);
                            jVarL.u(wVar.getApplicationContext());
                            this.f16572r = jVarL;
                            l lVar3 = this.f16565n;
                            if (lVar3 == lVar2) {
                                p0(l.PENDING_RECORDING);
                                this.f16547e.execute(new Runnable() { // from class: f1.l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f16479a.B0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                p0(l.PENDING_RECORDING);
                                this.f16547e.execute(new Runnable() { // from class: f1.m0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r0.l(this.f16484a);
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
                        jVar2 = (j) x2.g.g(this.f16572r);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f16571q;
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
        H(j.l(wVar, j10), i10, e);
        return e1.a(wVar, j10);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    @SuppressLint({"MissingPermission"})
    public final void v0(j jVar) {
        h hVar;
        if (this.f16574t != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.f16574t = jVar;
        h1.f fVarA = this.f16553h.a(jVar.o());
        this.f16566n0 = fVarA;
        long jA = fVarA.a();
        g0.r1.a("Recorder", "availableBytes = " + n1.e.a(jA));
        long j10 = this.f16561l;
        if (jA < j10) {
            G(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f16561l))));
            return;
        }
        this.f16568o0 = jA - j10;
        if (jVar.o().b() > 0) {
            this.W = Math.round(jVar.o().b() * 0.95d);
            g0.r1.a("Recorder", "File size limit in bytes: " + this.W);
        } else {
            this.W = 0L;
        }
        if (jVar.o().a() > 0) {
            this.X = TimeUnit.MILLISECONDS.toNanos(jVar.o().a());
            g0.r1.a("Recorder", "Duration limit in nanoseconds: " + this.X);
        } else {
            this.X = 0L;
        }
        int iOrdinal = this.M.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                m0(jVar.s() ? h.ENABLED : h.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.M);
            }
        } else if (jVar.s()) {
            if (!P()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.f16574t.w() || this.K == null) {
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
                this.f16544c0 = e;
            } catch (m1.k1 e11) {
                e = e11;
                g0.r1.d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof m1.k1) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                m0(hVar);
                this.f16544c0 = e;
            }
        }
        C0(jVar, false);
        if (O()) {
            this.H.D(jVar.v());
            this.K.start();
        }
        this.I.start();
        j jVar2 = this.f16574t;
        jVar2.I(b2.f(jVar2.o(), J()));
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
        synchronized (this.f16555i) {
            try {
                try {
                    if (!R(e1Var, this.f16572r)) {
                        try {
                            if (!R(e1Var, this.f16571q)) {
                                g0.r1.a("Recorder", "stop() called on a recording that is no longer active: " + e1Var.c());
                                return;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            throw th3;
                        }
                    }
                    j jVar = null;
                    switch (this.f16565n) {
                        case CONFIGURING:
                        case IDLING:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            i11 = i10;
                            th4 = th2;
                            x2.g.i(R(e1Var, this.f16572r));
                            j jVar2 = this.f16572r;
                            this.f16572r = null;
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
                            final j jVar3 = this.f16571q;
                            i11 = i10;
                            th4 = th2;
                            this.f16547e.execute(new Runnable() { // from class: f1.c0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f16419a.y0(jVar3, micros, i11, th4);
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
                            x2.g.i(R(e1Var, this.f16571q));
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
        if (this.f16574t != jVar || this.f16575u) {
            return;
        }
        this.f16575u = true;
        this.Y = i10;
        this.Z = th2;
        if (O()) {
            D();
            this.K.d(j10);
        }
        m1.i iVar = this.f16541a0;
        if (iVar != null) {
            iVar.close();
            this.f16541a0 = null;
        }
        if (this.f16548e0 != a2.a.ACTIVE_NON_STREAMING) {
            final m1.l lVar = this.I;
            this.f16550f0 = l0(new Runnable() { // from class: f1.q0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.i(lVar);
                }
            }, this.f16547e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            T(this.I);
        }
        this.I.d(j10);
    }
}
