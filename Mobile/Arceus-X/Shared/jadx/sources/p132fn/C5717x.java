package p132fn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0494d;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import gn.AbstractC6137a;
import gn.AbstractC6138b;
import gn.C6140d;
import gn.C6143g;
import gn.C6146j;
import gn.C6149m;
import gn.C6151o;
import gn.InterfaceC6141e;
import hn.InterfaceC6442g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.C5942u0;
import p225jn.InterfaceC7210a;
import p225jn.ViewfinderInfo;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7877j;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p559xt.C12915a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fn.x */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u00020\u0006B\u001d\b\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\rH\u0001¢\u0006\u0004\b*\u0010+J$\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040,H\u0096A¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b1\u00102R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m31665d2 = {"Lfn/x;", "Ljn/a;", "Lg0/u0$a;", "Lnu/g0;", "Ljt/n;", "Lfn/j0;", "Lhn/g;", "Lnu/b0;", "resultFlow", "<init>", "(Lnu/b0;)V", "Lfn/j0$c;", "side", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "rules", "Lgn/e;", "passiveAnalyzers", "", "analyzeViewfinderRegionOnly", "", "o", "(Lfn/j0$c;Ljava/util/List;Ljava/util/List;Z)V", "Landroid/graphics/Rect;", "rect", "previewRect", "b", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroidx/camera/core/d;", "imageProxy", "k", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "h", "(Landroid/media/Image;I)V", "Lfn/z;", "imageToAnalyze", "Lfn/b;", "analyzerResults", "p", "(Lfn/z;Ljava/util/List;)Ljava/lang/Object;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "n", "(Lfn/z;Lnt/b;)Ljava/lang/Object;", "a", "Lnu/b0;", "Lfn/j0$c;", "c", "Ljava/util/List;", "analyzers", "d", "Ljn/c;", "e", "Ljn/c;", "viewfinderInfo", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5717x implements InterfaceC7210a, C5942u0.a, InterfaceC9574g0<C7347n<? extends InterfaceC5690j0>>, InterfaceC6442g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<C7347n<InterfaceC5690j0>> resultFlow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InterfaceC5690j0.c side;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public List<? extends InterfaceC6141e> analyzers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<? extends InterfaceC6141e> passiveAnalyzers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ViewfinderInfo viewfinderInfo;

    /* JADX INFO: renamed from: fn.x$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.GovernmentIdFeed", m39664f = "GovernmentIdFeed.kt", m39665l = {92, 98}, m39666m = "analyze-gIAlu-s")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f21952A;

        /* JADX INFO: renamed from: B */
        public Object f21953B;

        /* JADX INFO: renamed from: C */
        public Object f21954C;

        /* JADX INFO: renamed from: D */
        public Object f21955D;

        /* JADX INFO: renamed from: E */
        public int f21956E;

        /* JADX INFO: renamed from: F */
        public int f21957F;

        /* JADX INFO: renamed from: G */
        public /* synthetic */ Object f21958G;

        /* JADX INFO: renamed from: I */
        public int f21960I;

        /* JADX INFO: renamed from: t */
        public Object f21961t;

        /* JADX INFO: renamed from: u */
        public Object f21962u;

        /* JADX INFO: renamed from: v */
        public Object f21963v;

        /* JADX INFO: renamed from: w */
        public Object f21964w;

        /* JADX INFO: renamed from: x */
        public Object f21965x;

        /* JADX INFO: renamed from: y */
        public Object f21966y;

        /* JADX INFO: renamed from: z */
        public Object f21967z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21958G = obj;
            this.f21960I |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM25896n = C5717x.this.m25896n(null, this);
            return objM25896n == C10047c.m38805e() ? objM25896n : C7347n.m30459a(objM25896n);
        }
    }

    /* JADX INFO: renamed from: fn.x$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4", m39664f = "GovernmentIdFeed.kt", m39665l = {112, 114}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f21968t;

        /* JADX INFO: renamed from: u */
        public Object f21969u;

        /* JADX INFO: renamed from: v */
        public int f21970v;

        /* JADX INFO: renamed from: w */
        public int f21971w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ InterfaceC0494d f21972x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C5717x f21973y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0494d interfaceC0494d, C5717x c5717x, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21972x = interfaceC0494d;
            this.f21973y = c5717x;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f21972x, this.f21973y, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (r1.emit(r3, r7) == r0) goto L25;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.AutoCloseable] */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            InterfaceC0494d interfaceC0494d;
            Object objM25896n;
            AutoCloseable autoCloseable;
            Object objM38805e = C10047c.m38805e();
            ?? r8 = this.f21971w;
            try {
                if (r8 != 0) {
                    if (r8 == 1) {
                        AutoCloseable autoCloseable2 = (AutoCloseable) this.f21968t;
                        C7348o.m30470b(obj);
                        objM25896n = ((C7347n) obj).getValue();
                        autoCloseable = autoCloseable2;
                    } else {
                        if (r8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj);
                interfaceC0494d = this.f21972x;
                C5717x c5717x = this.f21973y;
                InterfaceC5719z interfaceC5719zM25774f = C5676c0.m25774f(interfaceC0494d);
                if (interfaceC5719zM25774f == null) {
                    Unit unit = Unit.f29331a;
                    C12915a.m47941a(interfaceC0494d, null);
                    return unit;
                }
                this.f21968t = interfaceC0494d;
                this.f21969u = C10350l.m39676a(interfaceC0494d);
                this.f21970v = 0;
                this.f21971w = 1;
                objM25896n = c5717x.m25896n(interfaceC5719zM25774f, this);
                if (objM25896n != objM38805e) {
                }
                autoCloseable = interfaceC0494d;
                return objM38805e;
                autoCloseable = interfaceC0494d;
                C12915a.m47941a(autoCloseable, null);
                InterfaceC9564b0 interfaceC9564b0 = this.f21973y.resultFlow;
                C7347n c7347nM30459a = C7347n.m30459a(objM25896n);
                this.f21968t = C10350l.m39676a(objM25896n);
                this.f21969u = null;
                this.f21971w = 2;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(r8, th2);
                    throw th3;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fn.x$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5", m39664f = "GovernmentIdFeed.kt", m39665l = {121, 123}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f21974t;

        /* JADX INFO: renamed from: u */
        public Object f21975u;

        /* JADX INFO: renamed from: v */
        public int f21976v;

        /* JADX INFO: renamed from: w */
        public int f21977w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Image f21978x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C5717x f21979y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ int f21980z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Image image, C5717x c5717x, int i10, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21978x = image;
            this.f21979y = c5717x;
            this.f21980z = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f21978x, this.f21979y, this.f21980z, interfaceC9557b);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0008 */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r1.emit(r4, r6) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v5, types: [nu.b0] */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objM25896n;
            AutoCloseable autoCloseable;
            Object objM38805e = C10047c.m38805e();
            ?? r8 = this.f21977w;
            try {
                if (r8 != 0) {
                    if (r8 == 1) {
                        AutoCloseable autoCloseable2 = (AutoCloseable) this.f21974t;
                        C7348o.m30470b(obj);
                        objM25896n = ((C7347n) obj).getValue();
                        autoCloseable = autoCloseable2;
                    } else {
                        if (r8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj);
                Image image = this.f21978x;
                C5717x c5717x = this.f21979y;
                InterfaceC5719z interfaceC5719zM25773e = C5676c0.m25773e(image, this.f21980z);
                this.f21974t = image;
                this.f21975u = C10350l.m39676a(image);
                this.f21976v = 0;
                this.f21977w = 1;
                objM25896n = c5717x.m25896n(interfaceC5719zM25773e, this);
                autoCloseable = image;
                if (objM25896n != objM38805e) {
                }
                return objM38805e;
                C12915a.m47941a(autoCloseable, null);
                r8 = this.f21979y.resultFlow;
                C7347n c7347nM30459a = C7347n.m30459a(objM25896n);
                this.f21974t = C10350l.m39676a(objM25896n);
                this.f21975u = null;
                this.f21977w = 2;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(r8, th2);
                    throw th3;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C5717x(@NotNull InterfaceC9564b0<C7347n<InterfaceC5690j0>> resultFlow) {
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.resultFlow = resultFlow;
        this.analyzers = C7699p.m31892k();
        this.passiveAnalyzers = C7699p.m31892k();
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [T, com.withpersona.sdk2.camera.ExtractedTexts] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, fn.j0$c] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, com.withpersona.sdk2.camera.ImageIdMetadata] */
    /* JADX WARN: Type inference failed for: r10v18, types: [T, fn.e] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, com.withpersona.sdk2.camera.ImageLightCondition] */
    /* JADX INFO: renamed from: q */
    public static final void m25895q(C7758y c7758y, C7729c0<AbstractC5679e> c7729c0, C7729c0<ImageIdMetadata> c7729c1, C7729c0<InterfaceC5690j0.c> c7729c2, C7729c0<ExtractedTexts> c7729c3, C7758y c7758y2, C7729c0<ImageLightCondition> c7729c4, AbstractC6137a abstractC6137a, boolean z10) {
        AbstractC6137a.b bVar = AbstractC6137a.b.f23474a;
        if (!Intrinsics.m31980c(abstractC6137a, bVar) && z10) {
            c7758y.f29445a = true;
        }
        if (abstractC6137a instanceof AbstractC6137a.a) {
            if (c7729c0.f29425a == null) {
                c7729c0.f29425a = ((AbstractC6137a.a) abstractC6137a).getExtractedBarcode();
                return;
            }
            return;
        }
        if (abstractC6137a instanceof AbstractC6137a.d) {
            c7729c1.f29425a = ((AbstractC6137a.d) abstractC6137a).getMetadata();
            return;
        }
        if (abstractC6137a instanceof AbstractC6137a.c) {
            AbstractC6137a.c cVar = (AbstractC6137a.c) abstractC6137a;
            m25895q(c7758y, c7729c0, c7729c1, c7729c2, c7729c3, c7758y2, c7729c4, cVar.getFrontOrBackData(), z10);
            c7729c2.f29425a = cVar.getSide();
        } else if (abstractC6137a instanceof AbstractC6137a.f) {
            c7729c3.f29425a = ((AbstractC6137a.f) abstractC6137a).getExtractedTexts();
        } else if (Intrinsics.m31980c(abstractC6137a, bVar)) {
            c7758y2.f29445a = true;
        } else {
            if (!(abstractC6137a instanceof AbstractC6137a.e)) {
                throw new C7345l();
            }
            c7729c4.f29425a = ((AbstractC6137a.e) abstractC6137a).getImageLightCondition();
        }
    }

    @Override // p225jn.InterfaceC7210a
    /* JADX INFO: renamed from: b */
    public void mo25835b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super C7347n<? extends InterfaceC5690j0>> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.resultFlow.collect(interfaceC9577i, interfaceC9557b);
    }

    @Override // hn.InterfaceC6442g
    /* JADX INFO: renamed from: h */
    public void mo25836h(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        C7877j.m32694b(null, new c(image, this, rotationDegrees, null), 1, null);
    }

    @Override // p140g0.C5942u0.a
    /* JADX INFO: renamed from: k */
    public void mo23127k(@NotNull InterfaceC0494d imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        C7877j.m32694b(null, new b(imageProxy, this, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r17v0, types: [fn.x] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:32:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0191 -> B:40:0x0192). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n */
    public final java.lang.Object m25896n(p132fn.InterfaceC5719z r18, p315nt.InterfaceC9557b<? super p229jt.C7347n<? extends p132fn.InterfaceC5690j0>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof p132fn.C5717x.a
            if (r2 == 0) goto L17
            r2 = r1
            fn.x$a r2 = (p132fn.C5717x.a) r2
            int r3 = r2.f21960I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f21960I = r3
            goto L1c
        L17:
            fn.x$a r2 = new fn.x$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f21958G
            java.lang.Object r3 = p344ot.C10047c.m38805e()
            int r4 = r2.f21960I
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto La6
            if (r4 == r6) goto L6c
            if (r4 != r5) goto L64
            int r4 = r2.f21956E
            java.lang.Object r6 = r2.f21955D
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r8 = r2.f21954C
            gn.e r8 = (gn.InterfaceC6141e) r8
            java.lang.Object r8 = r2.f21952A
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r2.f21967z
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r10 = r2.f21966y
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r2.f21965x
            android.graphics.Rect r11 = (android.graphics.Rect) r11
            java.lang.Object r12 = r2.f21964w
            android.graphics.Rect r12 = (android.graphics.Rect) r12
            java.lang.Object r13 = r2.f21963v
            android.graphics.Rect r13 = (android.graphics.Rect) r13
            java.lang.Object r14 = r2.f21962u
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r2.f21961t
            fn.z r15 = (p132fn.InterfaceC5719z) r15
            p229jt.C7348o.m30470b(r1)
            jt.n r1 = (p229jt.C7347n) r1
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            r1 = r7
            goto L192
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L6c:
            int r4 = r2.f21956E
            java.lang.Object r8 = r2.f21955D
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r2.f21954C
            gn.e r9 = (gn.InterfaceC6141e) r9
            java.lang.Object r9 = r2.f21952A
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.f21967z
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r2.f21966y
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r12 = r2.f21965x
            android.graphics.Rect r12 = (android.graphics.Rect) r12
            java.lang.Object r13 = r2.f21964w
            android.graphics.Rect r13 = (android.graphics.Rect) r13
            java.lang.Object r14 = r2.f21963v
            android.graphics.Rect r14 = (android.graphics.Rect) r14
            java.lang.Object r15 = r2.f21962u
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r5 = r2.f21961t
            fn.z r5 = (p132fn.InterfaceC5719z) r5
            p229jt.C7348o.m30470b(r1)
            jt.n r1 = (p229jt.C7347n) r1
            java.lang.Object r1 = r1.getValue()
            r16 = r6
            r6 = r5
            r5 = r16
            goto L12a
        La6:
            p229jt.C7348o.m30470b(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            jn.c r4 = r0.viewfinderInfo
            r5 = 0
            r8 = r18
            if (r4 == 0) goto Lba
            android.graphics.Rect r4 = p225jn.C7213d.m30144a(r4, r8)
            goto Lbb
        Lba:
            r4 = r5
        Lbb:
            android.graphics.Rect r9 = new android.graphics.Rect
            int r10 = r8.getWidth()
            int r11 = r8.getHeight()
            r9.<init>(r7, r7, r10, r11)
            if (r4 == 0) goto Ld1
            boolean r10 = r9.contains(r4)
            if (r10 == 0) goto Ld1
            r5 = r4
        Ld1:
            java.util.List<? extends gn.e> r10 = r0.analyzers
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r11 = r10.iterator()
            r15 = r1
            r14 = r4
            r12 = r5
            r4 = r7
            r13 = r9
            r9 = r11
            r11 = r10
        Le0:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L137
            java.lang.Object r5 = r9.next()
            r10 = r5
            gn.e r10 = (gn.InterfaceC6141e) r10
            r2.f21961t = r8
            r2.f21962u = r15
            java.lang.Object r6 = pt.C10350l.m39676a(r14)
            r2.f21963v = r6
            java.lang.Object r6 = pt.C10350l.m39676a(r13)
            r2.f21964w = r6
            r2.f21965x = r12
            java.lang.Object r6 = pt.C10350l.m39676a(r11)
            r2.f21966y = r6
            r2.f21967z = r1
            r2.f21952A = r9
            java.lang.Object r5 = pt.C10350l.m39676a(r5)
            r2.f21953B = r5
            java.lang.Object r5 = pt.C10350l.m39676a(r10)
            r2.f21954C = r5
            r2.f21955D = r1
            r2.f21956E = r4
            r2.f21957F = r7
            r5 = 1
            r2.f21960I = r5
            java.lang.Object r6 = r10.mo27125a(r8, r12, r2)
            if (r6 != r3) goto L126
            goto L190
        L126:
            r10 = r1
            r1 = r6
            r6 = r8
            r8 = r10
        L12a:
            fn.b r7 = new fn.b
            r7.<init>(r1, r5)
            r8.add(r7)
            r8 = r6
            r1 = r10
            r7 = 0
            r6 = r5
            goto Le0
        L137:
            java.util.List<? extends gn.e> r1 = r0.passiveAnalyzers
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r4 = r15
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r1.iterator()
            r10 = r1
            r6 = r4
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r4 = 0
            r15 = r8
            r8 = r5
        L14b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L19c
            java.lang.Object r1 = r8.next()
            r5 = r1
            gn.e r5 = (gn.InterfaceC6141e) r5
            r2.f21961t = r15
            r2.f21962u = r14
            java.lang.Object r7 = pt.C10350l.m39676a(r13)
            r2.f21963v = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r12)
            r2.f21964w = r7
            r2.f21965x = r11
            java.lang.Object r7 = pt.C10350l.m39676a(r10)
            r2.f21966y = r7
            r2.f21967z = r6
            r2.f21952A = r8
            java.lang.Object r1 = pt.C10350l.m39676a(r1)
            r2.f21953B = r1
            java.lang.Object r1 = pt.C10350l.m39676a(r5)
            r2.f21954C = r1
            r2.f21955D = r6
            r2.f21956E = r4
            r1 = 0
            r2.f21957F = r1
            r7 = 2
            r2.f21960I = r7
            java.lang.Object r5 = r5.mo27125a(r15, r11, r2)
            if (r5 != r3) goto L191
        L190:
            return r3
        L191:
            r9 = r6
        L192:
            fn.b r7 = new fn.b
            r7.<init>(r5, r1)
            r6.add(r7)
            r6 = r9
            goto L14b
        L19c:
            java.lang.Object r1 = r0.m25898p(r15, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p132fn.C5717x.m25896n(fn.z, nt.b):java.lang.Object");
    }

    /* JADX INFO: renamed from: o */
    public final void m25897o(@NotNull InterfaceC5690j0.c side, @NotNull List<? extends AutoCaptureRule> rules, @NotNull List<? extends InterfaceC6141e> passiveAnalyzers, boolean analyzeViewfinderRegionOnly) {
        Object c6151o;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(passiveAnalyzers, "passiveAnalyzers");
        this.side = side;
        List<? extends AutoCaptureRule> list = rules;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (AutoCaptureRule autoCaptureRule : list) {
            if (autoCaptureRule instanceof AutoCaptureRule.BarcodePdf417Rule) {
                c6151o = new C6140d(analyzeViewfinderRegionOnly);
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontOrBackRule) {
                c6151o = new C6143g(new C6146j(analyzeViewfinderRegionOnly), new C6140d(analyzeViewfinderRegionOnly));
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontRule) {
                c6151o = new C6146j(analyzeViewfinderRegionOnly);
            } else if (autoCaptureRule instanceof AutoCaptureRule.MrzRule) {
                c6151o = new C6149m();
            } else {
                if (!(autoCaptureRule instanceof AutoCaptureRule.TextExtractionRule)) {
                    throw new C7345l();
                }
                c6151o = new C6151o();
            }
            arrayList.add(c6151o);
        }
        this.analyzers = arrayList;
        this.passiveAnalyzers = passiveAnalyzers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, fn.j0$c] */
    @NotNull
    /* JADX INFO: renamed from: p */
    public final Object m25898p(@NotNull InterfaceC5719z imageToAnalyze, @NotNull List<AnalyzerResult> analyzerResults) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        Intrinsics.checkNotNullParameter(analyzerResults, "analyzerResults");
        if (analyzerResults.isEmpty()) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new AbstractC6138b.c()));
        }
        C7758y c7758y = new C7758y();
        C7758y c7758y2 = new C7758y();
        C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = this.side;
        C7729c0 c7729c1 = new C7729c0();
        C7729c0 c7729c2 = new C7729c0();
        C7729c0 c7729c3 = new C7729c0();
        C7729c0 c7729c4 = new C7729c0();
        Iterator<T> it = analyzerResults.iterator();
        Throwable thM30463e = null;
        loop0: while (true) {
            th2 = thM30463e;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                AnalyzerResult analyzerResult = (AnalyzerResult) it.next();
                Object result = analyzerResult.getResult();
                if (C7347n.m30466h(result)) {
                    m25895q(c7758y, c7729c2, c7729c1, c7729c0, c7729c3, c7758y2, c7729c4, (AbstractC6137a) result, analyzerResult.getIsActiveAnalyzer());
                }
                thM30463e = C7347n.m30463e(result);
                if (thM30463e == null || th2 != null || !analyzerResult.getIsActiveAnalyzer()) {
                }
            }
            c7758y2.f29445a = true;
        }
        if (c7758y2.f29445a) {
            if (th2 != null) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(th2));
            }
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(new InterfaceC5690j0.None((ImageLightCondition) c7729c4.f29425a));
        }
        if (!c7758y.f29445a) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            return C7347n.m30460b(new InterfaceC5690j0.None((ImageLightCondition) c7729c4.f29425a));
        }
        InterfaceC5690j0.c cVar = (InterfaceC5690j0.c) c7729c0.f29425a;
        if (cVar == null) {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            return C7347n.m30460b(new InterfaceC5690j0.None((ImageLightCondition) c7729c4.f29425a));
        }
        Bitmap bitmapMo25780e = imageToAnalyze.mo25780e();
        if (bitmapMo25780e == null) {
            C7347n.Companion companion6 = C7347n.INSTANCE;
            return C7347n.m30460b(new InterfaceC5690j0.None((ImageLightCondition) c7729c4.f29425a));
        }
        C7347n.Companion companion7 = C7347n.INSTANCE;
        return C7347n.m30460b(new InterfaceC5690j0.ParsedIdSide(cVar, bitmapMo25780e, (ImageIdMetadata) c7729c1.f29425a, (AbstractC5679e) c7729c2.f29425a, (ExtractedTexts) c7729c3.f29425a, (ImageLightCondition) c7729c4.f29425a));
    }
}
