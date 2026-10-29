package p287m6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4848b;
import p096e7.C4872r;
import p229jt.C7348o;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p256ku.C7835a2;
import p315nt.InterfaceC9557b;
import p323o6.SourceFetchResult;
import p344ot.C10047c;
import p477ut.C11958c;
import p478uu.InterfaceC11977h;
import p537x6.C12748i;
import p537x6.C12749j;
import p537x6.Options;
import p560xu.AbstractC12946p;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12951r0;
import p568y6.EnumC13104c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: m6.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0003\u0015\u0019\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lm6/c;", "Lm6/i;", "Lm6/s;", Payload.SOURCE, "Lx6/p;", "options", "Luu/h;", "parallelismLock", "Lm6/o;", "exifOrientationStrategy", "<init>", "(Lm6/s;Lx6/p;Luu/h;Lm6/o;)V", "Lm6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "Landroid/graphics/BitmapFactory$Options;", "e", "(Landroid/graphics/BitmapFactory$Options;)Lm6/g;", "Lm6/j;", "exifData", "", "c", "(Landroid/graphics/BitmapFactory$Options;Lm6/j;)V", "d", "Lm6/s;", "b", "Lx6/p;", "Luu/h;", "Lm6/o;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8429c implements InterfaceC8435i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8445s source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11977h parallelismLock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8441o exifOrientationStrategy;

    /* JADX INFO: renamed from: m6.c$b */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0012\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lm6/c$b;", "Lxu/p;", "Lxu/r0;", "delegate", "<init>", "(Lxu/r0;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "exception", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC12946p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Exception exception;

        public b(@NotNull InterfaceC12951r0 interfaceC12951r0) {
            super(interfaceC12951r0);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // p560xu.AbstractC12946p, p560xu.InterfaceC12951r0
        public long read(@NotNull C12924e sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e10) {
                this.exception = e10;
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: m6.c$c */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lm6/c$c;", "Lm6/i$a;", "Luu/h;", "parallelismLock", "Lm6/o;", "exifOrientationStrategy", "<init>", "(Luu/h;Lm6/o;)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", "a", "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "Luu/h;", "b", "Lm6/o;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC8435i.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC11977h parallelismLock;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC8441o exifOrientationStrategy;

        public c(@NotNull InterfaceC11977h interfaceC11977h, @NotNull InterfaceC8441o interfaceC8441o) {
            this.parallelismLock = interfaceC11977h;
            this.exifOrientationStrategy = interfaceC8441o;
        }

        @Override // p287m6.InterfaceC8435i.a
        @NotNull
        /* JADX INFO: renamed from: a */
        public InterfaceC8435i mo21787a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            return new C8429c(result.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }
    }

    /* JADX INFO: renamed from: m6.c$d */
    @InterfaceC10344f(m39663c = "coil3.decode.BitmapFactoryDecoder", m39664f = "BitmapFactoryDecoder.kt", m39665l = {212, 40}, m39666m = "decode")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f31093t;

        /* JADX INFO: renamed from: u */
        public int f31094u;

        /* JADX INFO: renamed from: v */
        public int f31095v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f31096w;

        /* JADX INFO: renamed from: y */
        public int f31098y;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31096w = obj;
            this.f31098y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8429c.this.mo34183a(this);
        }
    }

    public C8429c(@NotNull InterfaceC8445s interfaceC8445s, @NotNull Options options, @NotNull InterfaceC11977h interfaceC11977h, @NotNull InterfaceC8441o interfaceC8441o) {
        this.source = interfaceC8445s;
        this.options = options;
        this.parallelismLock = interfaceC11977h;
        this.exifOrientationStrategy = interfaceC8441o;
    }

    /* JADX INFO: renamed from: f */
    public static final DecodeResult m34182f(C8429c c8429c) {
        return c8429c.m34186e(new BitmapFactory.Options());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p287m6.InterfaceC8435i
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo34183a(@NotNull InterfaceC9557b<? super DecodeResult> interfaceC9557b) throws Throwable {
        d dVar;
        InterfaceC11977h interfaceC11977h;
        int i10;
        InterfaceC11977h interfaceC11977h2;
        Throwable th2;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i11 = dVar.f31098y;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f31098y = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f31096w;
        Object objM38805e = C10047c.m38805e();
        int i12 = dVar.f31098y;
        try {
            if (i12 == 0) {
                C7348o.m30470b(obj);
                interfaceC11977h = this.parallelismLock;
                dVar.f31093t = interfaceC11977h;
                dVar.f31094u = 0;
                dVar.f31098y = 1;
                if (interfaceC11977h.m44700b(dVar) != objM38805e) {
                    i10 = 0;
                }
                return objM38805e;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11977h2 = (InterfaceC11977h) dVar.f31093t;
                try {
                    C7348o.m30470b(obj);
                    DecodeResult decodeResult = (DecodeResult) obj;
                    interfaceC11977h2.m44699a();
                    return decodeResult;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC11977h2.m44699a();
                    throw th2;
                }
            }
            i10 = dVar.f31094u;
            InterfaceC11977h interfaceC11977h3 = (InterfaceC11977h) dVar.f31093t;
            C7348o.m30470b(obj);
            interfaceC11977h = interfaceC11977h3;
            Function0 function0 = new Function0() { // from class: m6.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8429c.m34182f(this.f31084a);
                }
            };
            dVar.f31093t = interfaceC11977h;
            dVar.f31094u = i10;
            dVar.f31095v = 0;
            dVar.f31098y = 2;
            Object objM32563c = C7835a2.m32563c(null, function0, dVar, 1, null);
            if (objM32563c != objM38805e) {
                interfaceC11977h2 = interfaceC11977h;
                obj = objM32563c;
                DecodeResult decodeResult2 = (DecodeResult) obj;
                interfaceC11977h2.m44699a();
                return decodeResult2;
            }
            return objM38805e;
        } catch (Throwable th4) {
            interfaceC11977h2 = interfaceC11977h;
            th2 = th4;
            interfaceC11977h2.m44699a();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m34184c(BitmapFactory.Options options, C8436j c8436j) {
        Bitmap.Config configM47593j = C12749j.m47593j(this.options);
        if (c8436j.getIsFlipped() || C8443q.m34211a(c8436j)) {
            configM47593j = C4848b.m23413e(configM47593j);
        }
        if (C12749j.m47591h(this.options) && configM47593j == Bitmap.Config.ARGB_8888 && Intrinsics.m31980c(options.outMimeType, "image/jpeg")) {
            configM47593j = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && configM47593j != Bitmap.Config.HARDWARE) {
            configM47593j = config2;
        }
        options.inPreferredConfig = configM47593j;
    }

    /* JADX INFO: renamed from: d */
    public final void m34185d(BitmapFactory.Options options, C8436j c8436j) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = C8443q.m34212b(c8436j) ? options.outHeight : options.outWidth;
        int i11 = C8443q.m34212b(c8436j) ? options.outWidth : options.outHeight;
        long jM34194b = C8434h.m34194b(i10, i11, this.options.getSize(), this.options.getScale(), C12748i.m47579g(this.options));
        int iM23480c = C4872r.m23480c(jM34194b);
        int iM23481d = C4872r.m23481d(jM34194b);
        int iM34193a = C8434h.m34193a(i10, i11, iM23480c, iM23481d, this.options.getScale());
        options.inSampleSize = iM34193a;
        double dM34195c = C8434h.m34195c(((double) i10) / ((double) iM34193a), ((double) i11) / ((double) iM34193a), iM23480c, iM23481d, this.options.getScale());
        if (this.options.getPrecision() == EnumC13104c.INEXACT) {
            dM34195c = C7764d.m32080e(dM34195c, 1.0d);
        }
        boolean z10 = dM34195c == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dM34195c > 1.0d) {
            options.inDensity = C4366b.m22015c(((double) Integer.MAX_VALUE) / dM34195c);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = C4366b.m22015c(((double) Integer.MAX_VALUE) * dM34195c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final DecodeResult m34186e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.source());
        InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(interfaceC12928gM47961c.peek().mo48051s3(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        C8442p c8442p = C8442p.f31123a;
        C8436j c8436jM34209a = c8442p.m34209a(options.outMimeType, interfaceC12928gM47961c, this.exifOrientationStrategy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (C12749j.m47595l(this.options) != null) {
            options.inPreferredColorSpace = C12749j.m47595l(this.options);
        }
        options.inPremultiplied = C12749j.m47597n(this.options);
        m34184c(options, c8436jM34209a);
        m34185d(options, c8436jM34209a);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(interfaceC12928gM47961c.mo48051s3(), null, options);
            C11958c.m44629a(interfaceC12928gM47961c, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            InterfaceC7474n interfaceC7474nM31088c = C7482v.m31088c(new BitmapDrawable(this.options.getContext().getResources(), c8442p.m34210b(bitmapDecodeStream, c8436jM34209a)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new DecodeResult(interfaceC7474nM31088c, z10);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(interfaceC12928gM47961c, th2);
                throw th3;
            }
        }
    }
}
