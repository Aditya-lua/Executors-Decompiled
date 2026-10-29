package p287m6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.internal.C7758y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4848b;
import p096e7.C4872r;
import p229jt.C7348o;
import p239k6.C7482v;
import p239k6.InterfaceC7479s;
import p315nt.InterfaceC9557b;
import p323o6.SourceFetchResult;
import p344ot.C10047c;
import p478uu.InterfaceC11977h;
import p537x6.C12748i;
import p537x6.C12749j;
import p537x6.Options;
import p559xt.C12915a;
import p568y6.EnumC13104c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: m6.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lm6/x;", "Lm6/i;", "Landroid/graphics/ImageDecoder$Source;", Payload.SOURCE, "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lx6/p;", "options", "Luu/h;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lx6/p;Luu/h;)V", "Lm6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "Landroid/graphics/ImageDecoder;", "", "e", "(Landroid/graphics/ImageDecoder;)V", "Landroid/graphics/ImageDecoder$Source;", "b", "Ljava/lang/AutoCloseable;", "c", "Lx6/p;", "d", "Luu/h;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8450x implements InterfaceC8435i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImageDecoder.Source source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AutoCloseable closeable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11977h parallelismLock;

    /* JADX INFO: renamed from: m6.x$a */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lm6/x$a;", "Lm6/i$a;", "Luu/h;", "parallelismLock", "<init>", "(Luu/h;)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", "a", "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "", "b", "(Lx6/p;)Z", "Luu/h;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC8435i.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC11977h parallelismLock;

        public a(@NotNull InterfaceC11977h interfaceC11977h) {
            this.parallelismLock = interfaceC11977h;
        }

        @Override // p287m6.InterfaceC8435i.a
        @Nullable
        /* JADX INFO: renamed from: a */
        public InterfaceC8435i mo21787a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            ImageDecoder.Source sourceM34231b;
            if (m34229b(options) && (sourceM34231b = C8452z.m34231b(result.getSource(), options, false)) != null) {
                return new C8450x(sourceM34231b, result.getSource(), options, this.parallelismLock);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m34229b(Options options) {
            Bitmap.Config configM47593j = C12749j.m47593j(options);
            return configM47593j == Bitmap.Config.ARGB_8888 || configM47593j == Bitmap.Config.HARDWARE;
        }
    }

    /* JADX INFO: renamed from: m6.x$b */
    @InterfaceC10344f(m39663c = "coil3.decode.StaticImageDecoder", m39664f = "StaticImageDecoder.kt", m39665l = {168}, m39666m = "decode")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f31147t;

        /* JADX INFO: renamed from: u */
        public int f31148u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f31149v;

        /* JADX INFO: renamed from: x */
        public int f31151x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31149v = obj;
            this.f31151x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8450x.this.mo34183a(this);
        }
    }

    /* JADX INFO: renamed from: m6.x$c */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m31665d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", Payload.SOURCE, "", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7758y f31153b;

        public c(C7758y c7758y) {
            this.f31153b = c7758y;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jM34194b = C8434h.m34194b(width, height, C8450x.this.options.getSize(), C8450x.this.options.getScale(), C12748i.m47579g(C8450x.this.options));
            int iM23480c = C4872r.m23480c(jM34194b);
            int iM23481d = C4872r.m23481d(jM34194b);
            if (width > 0 && height > 0 && (width != iM23480c || height != iM23481d)) {
                double dM34196d = C8434h.m34196d(width, height, iM23480c, iM23481d, C8450x.this.options.getScale());
                C7758y c7758y = this.f31153b;
                boolean z10 = dM34196d < 1.0d;
                c7758y.f29445a = z10;
                if (z10 || C8450x.this.options.getPrecision() == EnumC13104c.EXACT) {
                    imageDecoder.setTargetSize(C4366b.m22015c(((double) width) * dM34196d), C4366b.m22015c(dM34196d * ((double) height)));
                }
            }
            C8450x.this.m34228e(imageDecoder);
        }
    }

    public C8450x(@NotNull ImageDecoder.Source source, @NotNull AutoCloseable autoCloseable, @NotNull Options options, @NotNull InterfaceC11977h interfaceC11977h) {
        this.source = source;
        this.closeable = autoCloseable;
        this.options = options;
        this.parallelismLock = interfaceC11977h;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m34227f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p287m6.InterfaceC8435i
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo34183a(@NotNull InterfaceC9557b<? super DecodeResult> interfaceC9557b) {
        b bVar;
        InterfaceC11977h interfaceC11977h;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f31151x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f31151x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f31149v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f31151x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11977h interfaceC11977h2 = this.parallelismLock;
            bVar.f31147t = interfaceC11977h2;
            bVar.f31148u = 0;
            bVar.f31151x = 1;
            if (interfaceC11977h2.m44700b(bVar) == objM38805e) {
                return objM38805e;
            }
            interfaceC11977h = interfaceC11977h2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11977h = (InterfaceC11977h) bVar.f31147t;
            C7348o.m30470b(obj);
        }
        try {
            AutoCloseable autoCloseable = this.closeable;
            try {
                C7758y c7758y = new C7758y();
                DecodeResult decodeResult = new DecodeResult(C7482v.m31089d(ImageDecoder.decodeBitmap(this.source, new c(c7758y)), false, 1, null), c7758y.f29445a);
                C12915a.m47941a(autoCloseable, null);
                interfaceC11977h.m44699a();
                return decodeResult;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(autoCloseable, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            interfaceC11977h.m44699a();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m34228e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: m6.w
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return C8450x.m34227f(decodeException);
            }
        });
        imageDecoder.setAllocator(C4848b.m23412d(C12749j.m47593j(this.options)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!C12749j.m47591h(this.options) ? 1 : 0);
        if (C12749j.m47595l(this.options) != null) {
            imageDecoder.setTargetColorSpace(C12749j.m47595l(this.options));
        }
        imageDecoder.setUnpremultipliedRequired(!C12749j.m47597n(this.options));
    }
}
