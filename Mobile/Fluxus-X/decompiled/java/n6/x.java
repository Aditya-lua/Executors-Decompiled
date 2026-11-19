package n6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p6.SourceFetchResult;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln6/x;", "Ln6/i;", "Landroid/graphics/ImageDecoder$Source;", Payload.SOURCE, "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Ly6/p;", "options", "Lkv/h;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Ly6/p;Lkv/h;)V", "Ln6/g;", "a", "(Leu/b;)Ljava/lang/Object;", "Landroid/graphics/ImageDecoder;", BuildConfig.FLAVOR, "e", "(Landroid/graphics/ImageDecoder;)V", "Landroid/graphics/ImageDecoder$Source;", "b", "Ljava/lang/AutoCloseable;", "c", "Ly6/p;", "d", "Lkv/h;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageDecoder.Source source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AutoCloseable closeable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.h parallelismLock;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln6/x$a;", "Ln6/i$a;", "Lkv/h;", "parallelismLock", "<init>", "(Lkv/h;)V", "Lp6/o;", "result", "Ly6/p;", "options", "Ll6/s;", "imageLoader", "Ln6/i;", "a", "(Lp6/o;Ly6/p;Ll6/s;)Ln6/i;", BuildConfig.FLAVOR, "b", "(Ly6/p;)Z", "Lkv/h;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final kv.h parallelismLock;

        public a(@NotNull kv.h hVar) {
            this.parallelismLock = hVar;
        }

        @Override // n6.i.a
        @Nullable
        public i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull l6.s imageLoader) {
            ImageDecoder.Source sourceB;
            if (b(options) && (sourceB = z.b(result.getSource(), options, false)) != null) {
                return new x(sourceB, result.getSource(), options, this.parallelismLock);
            }
            return null;
        }

        public final boolean b(Options options) {
            Bitmap.Config configJ = y6.j.j(options);
            return configJ == Bitmap.Config.ARGB_8888 || configJ == Bitmap.Config.HARDWARE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f25463t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f25464u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f25465v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f25467x;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25465v = obj;
            this.f25467x |= Integer.MIN_VALUE;
            return x.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", Payload.SOURCE, BuildConfig.FLAVOR, "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {
        public final /* synthetic */ p001kotlin.jvm.internal.y b;

        public c(p001kotlin.jvm.internal.y yVar) {
            this.b = yVar;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jB = h.b(width, height, x.this.options.getSize(), x.this.options.getScale(), y6.i.g(x.this.options));
            int iC = f7.r.c(jB);
            int iD = f7.r.d(jB);
            if (width > 0 && height > 0 && (width != iC || height != iD)) {
                double d10 = h.d(width, height, iC, iD, x.this.options.getScale());
                p001kotlin.jvm.internal.y yVar = this.b;
                boolean z10 = d10 < 1.0d;
                yVar.f21591a = z10;
                if (z10 || x.this.options.getPrecision() == z6.c.EXACT) {
                    imageDecoder.setTargetSize(su.b.c(((double) width) * d10), su.b.c(d10 * ((double) height)));
                }
            }
            x.this.e(imageDecoder);
        }
    }

    public x(@NotNull ImageDecoder.Source source, @NotNull AutoCloseable autoCloseable, @NotNull Options options, @NotNull kv.h hVar) {
        this.source = source;
        this.closeable = autoCloseable;
        this.options = options;
        this.parallelismLock = hVar;
    }

    public static final boolean f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n6.i
    @Nullable
    public Object a(@NotNull eu.b<? super DecodeResult> bVar) {
        b bVar2;
        kv.h hVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f25467x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f25467x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f25465v;
        Object objE = fu.c.e();
        int i11 = bVar2.f25467x;
        if (i11 == 0) {
            zt.o.b(obj);
            kv.h hVar2 = this.parallelismLock;
            bVar2.f25463t = hVar2;
            bVar2.f25464u = 0;
            bVar2.f25467x = 1;
            if (hVar2.c(bVar2) == objE) {
                return objE;
            }
            hVar = hVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (kv.h) bVar2.f25463t;
            zt.o.b(obj);
        }
        try {
            AutoCloseable autoCloseable = this.closeable;
            try {
                p001kotlin.jvm.internal.y yVar = new p001kotlin.jvm.internal.y();
                DecodeResult decodeResult = new DecodeResult(l6.v.d(ImageDecoder.decodeBitmap(this.source, new c(yVar)), false, 1, null), yVar.f21591a);
                nu.a.a(autoCloseable, null);
                hVar.a();
                return decodeResult;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    nu.a.a(autoCloseable, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            hVar.a();
            throw th4;
        }
    }

    public final void e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: n6.w
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return x.f(decodeException);
            }
        });
        imageDecoder.setAllocator(f7.b.d(y6.j.j(this.options)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!y6.j.h(this.options) ? 1 : 0);
        if (y6.j.l(this.options) != null) {
            imageDecoder.setTargetColorSpace(y6.j.l(this.options));
        }
        imageDecoder.setUnpremultipliedRequired(!y6.j.n(this.options));
    }
}
