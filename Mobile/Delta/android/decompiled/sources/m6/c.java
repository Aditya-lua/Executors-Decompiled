package m6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ku.a2;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import xu.b0;
import xu.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0003\u0015\u0019\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lm6/c;", "Lm6/i;", "Lm6/s;", Payload.SOURCE, "Lx6/p;", "options", "Luu/h;", "parallelismLock", "Lm6/o;", "exifOrientationStrategy", "<init>", "(Lm6/s;Lx6/p;Luu/h;Lm6/o;)V", "Lm6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "e", "(Landroid/graphics/BitmapFactory$Options;)Lm6/g;", "Lm6/j;", "exifData", "", "c", "(Landroid/graphics/BitmapFactory$Options;Lm6/j;)V", "d", "Lm6/s;", "b", "Lx6/p;", "Luu/h;", "Lm6/o;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.h parallelismLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o exifOrientationStrategy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0012\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lm6/c$b;", "Lxu/p;", "Lxu/r0;", "delegate", "<init>", "(Lxu/r0;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends xu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Exception exception;

        public b(@NotNull r0 r0Var) {
            super(r0Var);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // xu.p, xu.r0
        public long read(@NotNull xu.e sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e10) {
                this.exception = e10;
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: m6.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm6/c$c;", "Lm6/i$a;", "Luu/h;", "parallelismLock", "Lm6/o;", "exifOrientationStrategy", "<init>", "(Luu/h;Lm6/o;)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", "a", "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "Luu/h;", "b", "Lm6/o;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0425c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final uu.h parallelismLock;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final o exifOrientationStrategy;

        public C0425c(@NotNull uu.h hVar, @NotNull o oVar) {
            this.parallelismLock = hVar;
            this.exifOrientationStrategy = oVar;
        }

        @Override // m6.i.a
        @NotNull
        public i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull k6.s imageLoader) {
            return new c(result.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }
    }

    @pt.f(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23970t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f23971u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f23972v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f23973w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f23975y;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23973w = obj;
            this.f23975y |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(@NotNull s sVar, @NotNull Options options, @NotNull uu.h hVar, @NotNull o oVar) {
        this.source = sVar;
        this.options = options;
        this.parallelismLock = hVar;
        this.exifOrientationStrategy = oVar;
    }

    public static final DecodeResult f(c cVar) {
        return cVar.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // m6.i
    @Nullable
    public Object a(@NotNull nt.b<? super DecodeResult> bVar) throws Throwable {
        d dVar;
        uu.h hVar;
        int i10;
        uu.h hVar2;
        Throwable th2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i11 = dVar.f23975y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f23975y = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f23973w;
        Object objE = ot.c.e();
        int i12 = dVar.f23975y;
        try {
            if (i12 == 0) {
                jt.o.b(obj);
                hVar = this.parallelismLock;
                dVar.f23970t = hVar;
                dVar.f23971u = 0;
                dVar.f23975y = 1;
                if (hVar.b(dVar) != objE) {
                    i10 = 0;
                }
                return objE;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar2 = (uu.h) dVar.f23970t;
                try {
                    jt.o.b(obj);
                    DecodeResult decodeResult = (DecodeResult) obj;
                    hVar2.a();
                    return decodeResult;
                } catch (Throwable th3) {
                    th2 = th3;
                    hVar2.a();
                    throw th2;
                }
            }
            i10 = dVar.f23971u;
            uu.h hVar3 = (uu.h) dVar.f23970t;
            jt.o.b(obj);
            hVar = hVar3;
            Function0 function0 = new Function0() { // from class: m6.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.f(this.f23963a);
                }
            };
            dVar.f23970t = hVar;
            dVar.f23971u = i10;
            dVar.f23972v = 0;
            dVar.f23975y = 2;
            Object objC = a2.c(null, function0, dVar, 1, null);
            if (objC != objE) {
                hVar2 = hVar;
                obj = objC;
                DecodeResult decodeResult2 = (DecodeResult) obj;
                hVar2.a();
                return decodeResult2;
            }
            return objE;
        } catch (Throwable th4) {
            hVar2 = hVar;
            th2 = th4;
            hVar2.a();
            throw th2;
        }
    }

    public final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config configJ = x6.j.j(this.options);
        if (jVar.getIsFlipped() || q.a(jVar)) {
            configJ = e7.b.e(configJ);
        }
        if (x6.j.h(this.options) && configJ == Bitmap.Config.ARGB_8888 && Intrinsics.c(options.outMimeType, "image/jpeg")) {
            configJ = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && configJ != Bitmap.Config.HARDWARE) {
            configJ = config2;
        }
        options.inPreferredConfig = configJ;
    }

    public final void d(BitmapFactory.Options options, j jVar) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = q.b(jVar) ? options.outHeight : options.outWidth;
        int i11 = q.b(jVar) ? options.outWidth : options.outHeight;
        long jB = h.b(i10, i11, this.options.getSize(), this.options.getScale(), x6.i.g(this.options));
        int iC = e7.r.c(jB);
        int iD = e7.r.d(jB);
        int iA = h.a(i10, i11, iC, iD, this.options.getScale());
        options.inSampleSize = iA;
        double dC = h.c(((double) i10) / ((double) iA), ((double) i11) / ((double) iA), iC, iD, this.options.getScale());
        if (this.options.getPrecision() == y6.c.INEXACT) {
            dC = kotlin.ranges.d.e(dC, 1.0d);
        }
        boolean z10 = dC == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dC > 1.0d) {
            options.inDensity = cu.b.c(((double) Integer.MAX_VALUE) / dC);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = cu.b.c(((double) Integer.MAX_VALUE) * dC);
        }
    }

    public final DecodeResult e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.source());
        xu.g gVarC = b0.c(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(gVarC.peek().s3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        p pVar = p.f23994a;
        j jVarA = pVar.a(options.outMimeType, gVarC, this.exifOrientationStrategy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (x6.j.l(this.options) != null) {
            options.inPreferredColorSpace = x6.j.l(this.options);
        }
        options.inPremultiplied = x6.j.n(this.options);
        c(options, jVarA);
        d(options, jVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(gVarC.s3(), null, options);
            ut.c.a(gVarC, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            k6.n nVarC = k6.v.c(new BitmapDrawable(this.options.getContext().getResources(), pVar.b(bitmapDecodeStream, jVarA)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new DecodeResult(nVarC, z10);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ut.c.a(gVarC, th2);
                throw th3;
            }
        }
    }
}
