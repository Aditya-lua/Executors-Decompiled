package p596z6;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p008a7.C0082d;
import p096e7.C4872r;
import p229jt.C7328a;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p256ku.C7835a2;
import p287m6.C8434h;
import p287m6.DecodeResult;
import p287m6.InterfaceC8435i;
import p287m6.InterfaceC8445s;
import p315nt.InterfaceC9557b;
import p323o6.SourceFetchResult;
import p537x6.C12748i;
import p537x6.Options;
import p560xu.InterfaceC12928g;
import p568y6.C13109h;

/* JADX INFO: renamed from: z6.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 (2\u00020\u0001:\u0002\u0018\u0015BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006)"}, m31665d2 = {"Lz6/g;", "Lm6/i;", "Lm6/s;", Payload.SOURCE, "Lx6/p;", "options", "Lz6/c$a;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lm6/s;Lx6/p;Lz6/c$a;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(Lm6/s;Lx6/p;ZZZ)V", "Lm6/g;", "a", "(Lnt/b;)Ljava/lang/Object;", "Lm6/s;", "b", "Lx6/p;", "c", "Lz6/c$a;", "getParser", "()Lz6/c$a;", "d", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "e", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "f", "getRenderToBitmap", "g", "coil-svg_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13729g implements InterfaceC8435i {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Function1<Context, Float> f48285h = new Function1() { // from class: z6.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(C13729g.m50133e((Context) obj));
        }
    };

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Function1<Context, Float> f48286i = new Function1() { // from class: z6.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(C13729g.m50134f((Context) obj));
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8445s source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13725c.a parser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<Context, Float> density;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean useViewBoundsAsIntrinsicSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean renderToBitmap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Float> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13729g(@NotNull InterfaceC8445s interfaceC8445s, @NotNull Options options, @NotNull InterfaceC13725c.a aVar, @NotNull Function1<? super Context, Float> function1, boolean z10, boolean z11) {
        this.source = interfaceC8445s;
        this.options = options;
        this.parser = aVar;
        this.density = function1;
        this.useViewBoundsAsIntrinsicSize = z10;
        this.renderToBitmap = z11;
    }

    /* JADX INFO: renamed from: e */
    public static final float m50133e(Context context) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: f */
    public static final float m50134f(Context context) {
        return C0082d.m206a(context);
    }

    /* JADX INFO: renamed from: g */
    public static final DecodeResult m50135g(C13729g c13729g) throws Throwable {
        Throwable th2;
        InterfaceC13725c interfaceC13725cMo50125a;
        float width;
        float height;
        InterfaceC12928g interfaceC12928gSource = c13729g.source.source();
        try {
            interfaceC13725cMo50125a = c13729g.parser.mo50125a(interfaceC12928gSource);
            if (interfaceC12928gSource != null) {
                try {
                    interfaceC12928gSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th2 = null;
        } catch (Throwable th4) {
            if (interfaceC12928gSource != null) {
                try {
                    interfaceC12928gSource.close();
                } catch (Throwable th5) {
                    C7328a.m30429a(th4, th5);
                }
            }
            th2 = th4;
            interfaceC13725cMo50125a = null;
        }
        if (th2 != null) {
            throw th2;
        }
        InterfaceC13725c.ViewBox viewBoxMo201e = interfaceC13725cMo50125a.mo201e();
        if (!c13729g.useViewBoundsAsIntrinsicSize || viewBoxMo201e == null) {
            width = interfaceC13725cMo50125a.getWidth();
            height = interfaceC13725cMo50125a.getHeight();
        } else {
            width = C13731i.m50138b(viewBoxMo201e);
            height = C13731i.m50137a(viewBoxMo201e);
        }
        if (C13109h.m48713b(c13729g.options.getSize())) {
            float fFloatValue = c13729g.density.invoke(c13729g.options.getContext()).floatValue();
            if (width > 0.0f) {
                width *= fFloatValue;
            }
            if (height > 0.0f) {
                height *= fFloatValue;
            }
        }
        long jM34194b = C8434h.m34194b(width > 0.0f ? C4366b.m22016d(width) : 512, height > 0.0f ? C4366b.m22016d(height) : 512, c13729g.options.getSize(), c13729g.options.getScale(), C12748i.m47579g(c13729g.options));
        int iM23480c = C4872r.m23480c(jM34194b);
        int iM23481d = C4872r.m23481d(jM34194b);
        if (width > 0.0f && height > 0.0f) {
            float fM34197e = C8434h.m34197e(width, height, iM23480c, iM23481d, c13729g.options.getScale());
            iM23480c = (int) (fM34197e * width);
            iM23481d = (int) (fM34197e * height);
            if (viewBoxMo201e == null) {
                interfaceC13725cMo50125a.mo198b(new InterfaceC13725c.ViewBox(0.0f, 0.0f, width, height));
            }
        }
        interfaceC13725cMo50125a.mo197a("100%");
        interfaceC13725cMo50125a.mo200d("100%");
        interfaceC13725cMo50125a.mo199c(c13729g.options);
        InterfaceC7474n interfaceC7474nMo202f = interfaceC13725cMo50125a.mo202f(iM23480c, iM23481d);
        if (c13729g.renderToBitmap) {
            interfaceC7474nMo202f = C7482v.m31089d(C7482v.m31092g(interfaceC7474nMo202f, 0, 0, 3, null), false, 1, null);
        }
        return new DecodeResult(interfaceC7474nMo202f, c13729g.renderToBitmap);
    }

    @Override // p287m6.InterfaceC8435i
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo34183a(@NotNull InterfaceC9557b<? super DecodeResult> interfaceC9557b) {
        return C7835a2.m32562b(C7721e.f29393a, new Function0() { // from class: z6.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13729g.m50135g(this.f48283a);
            }
        }, interfaceC9557b);
    }

    /* JADX INFO: renamed from: z6.g$b */
    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB'\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, m31665d2 = {"Lz6/g$b;", "Lm6/i$a;", "Lz6/c$a;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lz6/c$a;Lkotlin/jvm/functions/Function1;ZZ)V", "scaleToDensity", "(ZZZ)V", "Lo6/o;", "result", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lm6/i;", "a", "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;", "b", "(Lo6/o;)Z", "Lz6/c$a;", "getParser", "()Lz6/c$a;", "Lkotlin/jvm/functions/Function1;", "getDensity", "()Lkotlin/jvm/functions/Function1;", "c", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "d", "getRenderToBitmap", "coil-svg_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC8435i.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC13725c.a parser;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function1<Context, Float> density;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean useViewBoundsAsIntrinsicSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean renderToBitmap;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Float> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull InterfaceC13725c.a aVar, @NotNull Function1<? super Context, Float> function1, boolean z10, boolean z11) {
            this.parser = aVar;
            this.density = function1;
            this.useViewBoundsAsIntrinsicSize = z10;
            this.renderToBitmap = z11;
        }

        @Override // p287m6.InterfaceC8435i.a
        @Nullable
        /* JADX INFO: renamed from: a */
        public InterfaceC8435i mo21787a(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            if (m50136b(result)) {
                return new C13729g(result.getSource(), options, this.parser, this.density, this.useViewBoundsAsIntrinsicSize, this.renderToBitmap);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m50136b(SourceFetchResult result) {
            return Intrinsics.m31980c(result.getMimeType(), "image/svg+xml") || C13723a.m50123a(C8434h.f31110a, result.getSource().source());
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
          (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
          (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
          (wrap boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
         A[MD:(boolean, boolean, boolean):void (m)] (LINE:6) call: z6.g.b.<init>(boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ b(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12);
        }

        public b(boolean z10, boolean z11, boolean z12) {
            this(InterfaceC13725c.a.f48276b, z12 ? C13729g.f48286i : C13729g.f48285h, z10, z11);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
      (r2v0 m6.s)
      (r3v0 x6.p)
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
     A[MD:(m6.s, x6.p, boolean, boolean, boolean):void (m)] (LINE:8) call: z6.g.<init>(m6.s, x6.p, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C13729g(InterfaceC8445s interfaceC8445s, Options options, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8445s, options, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11, (i10 & 16) != 0 ? false : z12);
    }

    public C13729g(@NotNull InterfaceC8445s interfaceC8445s, @NotNull Options options, boolean z10, boolean z11, boolean z12) {
        this(interfaceC8445s, options, InterfaceC13725c.a.f48276b, z12 ? f48286i : f48285h, z10, z11);
    }
}
