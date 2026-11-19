package n6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import av.a2;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import ew.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p6.SourceFetchResult;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0003\u0015\u0019\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Ln6/c;", "Ln6/i;", "Ln6/s;", Payload.SOURCE, "Ly6/p;", "options", "Lkv/h;", "parallelismLock", "Ln6/o;", "exifOrientationStrategy", "<init>", "(Ln6/s;Ly6/p;Lkv/h;Ln6/o;)V", "Ln6/g;", "a", "(Leu/b;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "e", "(Landroid/graphics/BitmapFactory$Options;)Ln6/g;", "Ln6/j;", "exifData", BuildConfig.FLAVOR, "c", "(Landroid/graphics/BitmapFactory$Options;Ln6/j;)V", "d", "Ln6/s;", "b", "Ly6/p;", "Lkv/h;", "Ln6/o;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.h parallelismLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o exifOrientationStrategy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0012\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln6/c$b;", "Lew/n;", "Lew/l0;", "delegate", "<init>", "(Lew/l0;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ew.n {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Exception exception;

        public b(@NotNull l0 l0Var) {
            super(l0Var);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // ew.n, ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws Exception {
            try {
                return super.f3(sink, byteCount);
            } catch (Exception e10) {
                this.exception = e10;
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: n6.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln6/c$c;", "Ln6/i$a;", "Lkv/h;", "parallelismLock", "Ln6/o;", "exifOrientationStrategy", "<init>", "(Lkv/h;Ln6/o;)V", "Lp6/o;", "result", "Ly6/p;", "options", "Ll6/s;", "imageLoader", "Ln6/i;", "a", "(Lp6/o;Ly6/p;Ll6/s;)Ln6/i;", "Lkv/h;", "b", "Ln6/o;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0495c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kv.h parallelismLock;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final o exifOrientationStrategy;

        public C0495c(@NotNull kv.h hVar, @NotNull o oVar) {
            this.parallelismLock = hVar;
            this.exifOrientationStrategy = oVar;
        }

        @Override // n6.i.a
        @NotNull
        public i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull l6.s imageLoader) {
            return new c(result.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, RequestError.NETWORK_FAILURE}, m = "decode")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f25420t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f25421u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f25422v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f25423w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f25425y;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25423w = obj;
            this.f25425y |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(@NotNull s sVar, @NotNull Options options, @NotNull kv.h hVar, @NotNull o oVar) {
        this.source = sVar;
        this.options = options;
        this.parallelismLock = hVar;
        this.exifOrientationStrategy = oVar;
    }

    public static final DecodeResult f(c cVar) {
        return cVar.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n6.i
    @Nullable
    public Object a(@NotNull eu.b<? super DecodeResult> bVar) throws Throwable {
        d dVar;
        kv.h hVar;
        int i10;
        kv.h hVar2;
        Throwable th2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i11 = dVar.f25425y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f25425y = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f25423w;
        Object objE = fu.c.e();
        int i12 = dVar.f25425y;
        try {
            if (i12 == 0) {
                zt.o.b(obj);
                hVar = this.parallelismLock;
                dVar.f25420t = hVar;
                dVar.f25421u = 0;
                dVar.f25425y = 1;
                if (hVar.c(dVar) != objE) {
                    i10 = 0;
                }
                return objE;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar2 = (kv.h) dVar.f25420t;
                try {
                    zt.o.b(obj);
                    DecodeResult decodeResult = (DecodeResult) obj;
                    hVar2.a();
                    return decodeResult;
                } catch (Throwable th3) {
                    th2 = th3;
                    hVar2.a();
                    throw th2;
                }
            }
            i10 = dVar.f25421u;
            kv.h hVar3 = (kv.h) dVar.f25420t;
            zt.o.b(obj);
            hVar = hVar3;
            Function0 function0 = new Function0() { // from class: n6.b
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.f(this.f25414a);
                }
            };
            dVar.f25420t = hVar;
            dVar.f25421u = i10;
            dVar.f25422v = 0;
            dVar.f25425y = 2;
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
        Bitmap.Config configJ = y6.j.j(this.options);
        if (jVar.getIsFlipped() || q.a(jVar)) {
            configJ = f7.b.e(configJ);
        }
        if (y6.j.h(this.options) && configJ == Bitmap.Config.ARGB_8888 && Intrinsics.c(options.outMimeType, "image/jpeg")) {
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
        long jB = h.b(i10, i11, this.options.getSize(), this.options.getScale(), y6.i.g(this.options));
        int iC = f7.r.c(jB);
        int iD = f7.r.d(jB);
        int iA = h.a(i10, i11, iC, iD, this.options.getScale());
        options.inSampleSize = iA;
        double dC = h.c(((double) i10) / ((double) iA), ((double) i11) / ((double) iA), iC, iD, this.options.getScale());
        if (this.options.getPrecision() == z6.c.INEXACT) {
            dC = p001kotlin.ranges.d.e(dC, 1.0d);
        }
        boolean z10 = dC == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dC > 1.0d) {
            options.inDensity = su.b.c(((double) Integer.MAX_VALUE) / dC);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = su.b.c(((double) Integer.MAX_VALUE) * dC);
        }
    }

    public final DecodeResult e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.l3());
        ew.g gVarC = ew.v.c(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(gVarC.peek().x3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        p pVar = p.f25444a;
        j jVarA = pVar.a(options.outMimeType, gVarC, this.exifOrientationStrategy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (y6.j.l(this.options) != null) {
            options.inPreferredColorSpace = y6.j.l(this.options);
        }
        options.inPremultiplied = y6.j.n(this.options);
        c(options, jVarA);
        d(options, jVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(gVarC.x3(), null, options);
            lu.c.a(gVarC, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            l6.n nVarC = l6.v.c(new BitmapDrawable(this.options.getContext().getResources(), pVar.b(bitmapDecodeStream, jVarA)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new DecodeResult(nVarC, z10);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(gVarC, th2);
                throw th3;
            }
        }
    }
}
