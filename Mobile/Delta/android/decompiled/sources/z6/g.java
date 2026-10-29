package z6;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.vision.barcode.common.Barcode;
import e7.r;
import k6.n;
import k6.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.a2;
import m6.DecodeResult;
import m6.s;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 (2\u00020\u0001:\u0002\u0018\u0015BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lz6/g;", "Lm6/i;", "Lm6/s;", Payload.SOURCE, "Lx6/p;", "options", "Lz6/c$a;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lm6/s;Lx6/p;Lz6/c$a;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(Lm6/s;Lx6/p;ZZZ)V", "Lm6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "Lm6/s;", "b", "Lx6/p;", "c", "Lz6/c$a;", "getParser", "()Lz6/c$a;", "d", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "e", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "f", "getRenderToBitmap", "g", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements m6.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Function1<Context, Float> f37316h = new Function1() { // from class: z6.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(g.e((Context) obj));
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Function1<Context, Float> f37317i = new Function1() { // from class: z6.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(g.f((Context) obj));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a parser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Context, Float> density;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean useViewBoundsAsIntrinsicSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean renderToBitmap;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull s sVar, @NotNull Options options, @NotNull c.a aVar, @NotNull Function1<? super Context, Float> function1, boolean z10, boolean z11) {
        this.source = sVar;
        this.options = options;
        this.parser = aVar;
        this.density = function1;
        this.useViewBoundsAsIntrinsicSize = z10;
        this.renderToBitmap = z11;
    }

    public static final float e(Context context) {
        return 1.0f;
    }

    public static final float f(Context context) {
        return a7.d.a(context);
    }

    public static final DecodeResult g(g gVar) throws Throwable {
        Throwable th2;
        c cVarA;
        float width;
        float height;
        xu.g gVarSource = gVar.source.source();
        try {
            cVarA = gVar.parser.a(gVarSource);
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th2 = null;
        } catch (Throwable th4) {
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    jt.a.a(th4, th5);
                }
            }
            th2 = th4;
            cVarA = null;
        }
        if (th2 != null) {
            throw th2;
        }
        c.ViewBox viewBoxE = cVarA.e();
        if (!gVar.useViewBoundsAsIntrinsicSize || viewBoxE == null) {
            width = cVarA.getWidth();
            height = cVarA.getHeight();
        } else {
            width = i.b(viewBoxE);
            height = i.a(viewBoxE);
        }
        if (y6.h.b(gVar.options.getSize())) {
            float fFloatValue = gVar.density.invoke(gVar.options.getContext()).floatValue();
            if (width > 0.0f) {
                width *= fFloatValue;
            }
            if (height > 0.0f) {
                height *= fFloatValue;
            }
        }
        int iD = Barcode.FORMAT_UPC_A;
        int iD2 = width > 0.0f ? cu.b.d(width) : 512;
        if (height > 0.0f) {
            iD = cu.b.d(height);
        }
        long jB = m6.h.b(iD2, iD, gVar.options.getSize(), gVar.options.getScale(), x6.i.g(gVar.options));
        int iC = r.c(jB);
        int iD3 = r.d(jB);
        if (width > 0.0f && height > 0.0f) {
            float fE = m6.h.e(width, height, iC, iD3, gVar.options.getScale());
            iC = (int) (fE * width);
            iD3 = (int) (fE * height);
            if (viewBoxE == null) {
                cVarA.b(new c.ViewBox(0.0f, 0.0f, width, height));
            }
        }
        cVarA.a("100%");
        cVarA.d("100%");
        cVarA.c(gVar.options);
        n nVarF = cVarA.f(iC, iD3);
        if (gVar.renderToBitmap) {
            nVarF = v.d(v.g(nVarF, 0, 0, 3, null), false, 1, null);
        }
        return new DecodeResult(nVarF, gVar.renderToBitmap);
    }

    @Override // m6.i
    @Nullable
    public Object a(@NotNull nt.b<? super DecodeResult> bVar) {
        return a2.b(kotlin.coroutines.e.f22525a, new Function0() { // from class: z6.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.g(this.f37314a);
            }
        }, bVar);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB'\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lz6/g$b;", "Lm6/i$a;", "Lz6/c$a;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lz6/c$a;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(ZZZ)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", "a", "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "b", "(Lo6/o;)Z", "Lz6/c$a;", "getParser", "()Lz6/c$a;", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "c", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "d", "getRenderToBitmap", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements m6.i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c.a parser;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function1<Context, Float> density;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean useViewBoundsAsIntrinsicSize;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean renderToBitmap;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull c.a aVar, @NotNull Function1<? super Context, Float> function1, boolean z10, boolean z11) {
            this.parser = aVar;
            this.density = function1;
            this.useViewBoundsAsIntrinsicSize = z10;
            this.renderToBitmap = z11;
        }

        @Override // m6.i.a
        @Nullable
        public m6.i a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull k6.s imageLoader) {
            if (b(result)) {
                return new g(result.getSource(), options, this.parser, this.density, this.useViewBoundsAsIntrinsicSize, this.renderToBitmap);
            }
            return null;
        }

        public final boolean b(SourceFetchResult result) {
            return Intrinsics.c(result.getMimeType(), "image/svg+xml") || a.a(m6.h.f23984a, result.getSource().source());
        }

        public /* synthetic */ b(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12);
        }

        public b(boolean z10, boolean z11, boolean z12) {
            this(c.a.b, z12 ? g.f37317i : g.f37316h, z10, z11);
        }
    }

    public /* synthetic */ g(s sVar, Options options, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, options, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11, (i10 & 16) != 0 ? false : z12);
    }

    public g(@NotNull s sVar, @NotNull Options options, boolean z10, boolean z11, boolean z12) {
        this(sVar, options, c.a.b, z12 ? f37317i : f37316h, z10, z11);
    }
}
