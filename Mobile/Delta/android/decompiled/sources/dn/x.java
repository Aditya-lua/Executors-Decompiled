package dn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import hn.ViewfinderInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u00020\u0006B\u001d\b\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\rH\u0001¢\u0006\u0004\b*\u0010+J$\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040,H\u0096A¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b1\u00102R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Ldn/x;", "Lhn/a;", "Lg0/u0$a;", "Llu/g0;", "Lgt/n;", "Ldn/j0;", "Lfn/g;", "Llu/b0;", "resultFlow", "<init>", "(Llu/b0;)V", "Ldn/j0$c;", "side", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "rules", "Len/e;", "passiveAnalyzers", "", "analyzeViewfinderRegionOnly", "", "o", "(Ldn/j0$c;Ljava/util/List;Ljava/util/List;Z)V", "Landroid/graphics/Rect;", "rect", "previewRect", "b", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroidx/camera/core/d;", "imageProxy", "k", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "g", "(Landroid/media/Image;I)V", "Ldn/z;", "imageToAnalyze", "Ldn/b;", "analyzerResults", "p", "(Ldn/z;Ljava/util/List;)Ljava/lang/Object;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "n", "(Ldn/z;Llt/b;)Ljava/lang/Object;", "a", "Llu/b0;", "Ldn/j0$c;", "c", "Ljava/util/List;", "analyzers", "d", "Lhn/c;", "e", "Lhn/c;", "viewfinderInfo", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x implements hn.a, g0.u0.a, lu.g0<gt.n<? extends j0>>, fn.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.b0<gt.n<j0>> resultFlow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public j0.c side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends en.e> analyzers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends en.e> passiveAnalyzers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewfinderInfo viewfinderInfo;

    @nt.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed", f = "GovernmentIdFeed.kt", l = {92, 98}, m = "analyze-gIAlu-s")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public int I;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15202t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15203u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f15204v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f15205w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f15206x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f15207y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f15208z;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.G = obj;
            this.I |= Integer.MIN_VALUE;
            Object objN = x.this.n(null, this);
            return objN == mt.c.e() ? objN : gt.n.a(objN);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4", f = "GovernmentIdFeed.kt", l = {112, 114}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15209t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15210u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15211v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f15212w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f15213x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ x f15214y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.camera.core.d dVar, x xVar, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f15213x = dVar;
            this.f15214y = xVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f15213x, this.f15214y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (r1.emit(r3, r7) == r0) goto L25;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.AutoCloseable] */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
            /*
                r7 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r7.f15212w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                gt.o.b(r8)
                goto L74
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f15210u
                androidx.camera.core.d r1 = (androidx.camera.core.d) r1
                java.lang.Object r1 = r7.f15209t
                java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L2d
                gt.n r8 = (gt.n) r8     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L77
            L2f:
                gt.o.b(r8)
                androidx.camera.core.d r1 = r7.f15213x
                dn.x r8 = r7.f15214y
                dn.z r5 = dn.c0.f(r1)     // Catch: java.lang.Throwable -> L2d
                if (r5 != 0) goto L42
                kotlin.Unit r8 = kotlin.Unit.f22938a     // Catch: java.lang.Throwable -> L2d
                vt.a.a(r1, r4)
                return r8
            L42:
                r7.f15209t = r1     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r6 = nt.l.a(r1)     // Catch: java.lang.Throwable -> L2d
                r7.f15210u = r6     // Catch: java.lang.Throwable -> L2d
                r6 = 0
                r7.f15211v = r6     // Catch: java.lang.Throwable -> L2d
                r7.f15212w = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r8 = dn.x.l(r8, r5, r7)     // Catch: java.lang.Throwable -> L2d
                if (r8 != r0) goto L56
                goto L73
            L56:
                vt.a.a(r1, r4)
                dn.x r1 = r7.f15214y
                lu.b0 r1 = dn.x.m(r1)
                gt.n r3 = gt.n.a(r8)
                java.lang.Object r8 = nt.l.a(r8)
                r7.f15209t = r8
                r7.f15210u = r4
                r7.f15212w = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L74
            L73:
                return r0
            L74:
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            L77:
                throw r8     // Catch: java.lang.Throwable -> L78
            L78:
                r0 = move-exception
                vt.a.a(r1, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dn.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5", f = "GovernmentIdFeed.kt", l = {121, 123}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15215t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15216u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15217v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f15218w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Image f15219x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ x f15220y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ int f15221z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Image image, x xVar, int i10, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f15219x = image;
            this.f15220y = xVar;
            this.f15221z = i10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f15219x, this.f15220y, this.f15221z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r1.emit(r4, r6) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v5, types: [lu.b0] */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r6.f15218w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)
                goto L6e
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f15216u
                android.media.Image r1 = (android.media.Image) r1
                java.lang.Object r1 = r6.f15215t
                java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
                gt.o.b(r7)     // Catch: java.lang.Throwable -> L2c
                gt.n r7 = (gt.n) r7     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L2c
                goto L4f
            L2c:
                r7 = move-exception
                goto L71
            L2e:
                gt.o.b(r7)
                android.media.Image r1 = r6.f15219x
                dn.x r7 = r6.f15220y
                int r4 = r6.f15221z
                dn.z r4 = dn.c0.e(r1, r4)     // Catch: java.lang.Throwable -> L2c
                r6.f15215t = r1     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r5 = nt.l.a(r1)     // Catch: java.lang.Throwable -> L2c
                r6.f15216u = r5     // Catch: java.lang.Throwable -> L2c
                r5 = 0
                r6.f15217v = r5     // Catch: java.lang.Throwable -> L2c
                r6.f15218w = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r7 = dn.x.l(r7, r4, r6)     // Catch: java.lang.Throwable -> L2c
                if (r7 != r0) goto L4f
                goto L6d
            L4f:
                r3 = 0
                vt.a.a(r1, r3)
                dn.x r1 = r6.f15220y
                lu.b0 r1 = dn.x.m(r1)
                gt.n r4 = gt.n.a(r7)
                java.lang.Object r7 = nt.l.a(r7)
                r6.f15215t = r7
                r6.f15216u = r3
                r6.f15218w = r2
                java.lang.Object r7 = r1.emit(r4, r6)
                if (r7 != r0) goto L6e
            L6d:
                return r0
            L6e:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            L71:
                throw r7     // Catch: java.lang.Throwable -> L72
            L72:
                r0 = move-exception
                vt.a.a(r1, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dn.x.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public x(@NotNull lu.b0<gt.n<j0>> resultFlow) {
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.resultFlow = resultFlow;
        this.analyzers = kotlin.collections.p.k();
        this.passiveAnalyzers = kotlin.collections.p.k();
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [T, com.withpersona.sdk2.camera.ExtractedTexts] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, dn.j0$c] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, com.withpersona.sdk2.camera.ImageIdMetadata] */
    /* JADX WARN: Type inference failed for: r10v18, types: [T, dn.e] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, com.withpersona.sdk2.camera.ImageLightCondition] */
    public static final void q(kotlin.jvm.internal.y yVar, kotlin.jvm.internal.c0<e> c0Var, kotlin.jvm.internal.c0<ImageIdMetadata> c0Var2, kotlin.jvm.internal.c0<j0.c> c0Var3, kotlin.jvm.internal.c0<ExtractedTexts> c0Var4, kotlin.jvm.internal.y yVar2, kotlin.jvm.internal.c0<ImageLightCondition> c0Var5, en.a aVar, boolean z10) {
        en.a.b bVar = en.a.b.f16151a;
        if (!Intrinsics.c(aVar, bVar) && z10) {
            yVar.f23023a = true;
        }
        if (aVar instanceof en.a.C0299a) {
            if (c0Var.f23007a == null) {
                c0Var.f23007a = ((en.a.C0299a) aVar).getExtractedBarcode();
                return;
            }
            return;
        }
        if (aVar instanceof en.a.d) {
            c0Var2.f23007a = ((en.a.d) aVar).getMetadata();
            return;
        }
        if (aVar instanceof en.a.c) {
            en.a.c cVar = (en.a.c) aVar;
            q(yVar, c0Var, c0Var2, c0Var3, c0Var4, yVar2, c0Var5, cVar.getFrontOrBackData(), z10);
            c0Var3.f23007a = cVar.getSide();
        } else if (aVar instanceof en.a.f) {
            c0Var4.f23007a = ((en.a.f) aVar).getExtractedTexts();
        } else if (Intrinsics.c(aVar, bVar)) {
            yVar2.f23023a = true;
        } else {
            if (!(aVar instanceof en.a.e)) {
                throw new gt.l();
            }
            c0Var5.f23007a = ((en.a.e) aVar).getImageLightCondition();
        }
    }

    @Override // hn.a
    public void b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }

    @Override // lu.g0, lu.h
    @Nullable
    public Object collect(@NotNull lu.i<? super gt.n<? extends j0>> iVar, @NotNull lt.b<?> bVar) {
        return this.resultFlow.collect(iVar, bVar);
    }

    @Override // fn.g
    public void g(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        iu.j.b(null, new c(image, this, rotationDegrees, null), 1, null);
    }

    @Override // g0.u0.a
    public void k(@NotNull androidx.camera.core.d imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        iu.j.b(null, new b(imageProxy, this, null), 1, null);
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
    /* JADX WARN: Type inference failed for: r17v0, types: [dn.x] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:32:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0191 -> B:40:0x0192). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(dn.z r18, lt.b<? super gt.n<? extends dn.j0>> r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.x.n(dn.z, lt.b):java.lang.Object");
    }

    public final void o(@NotNull j0.c side, @NotNull List<? extends AutoCaptureRule> rules, @NotNull List<? extends en.e> passiveAnalyzers, boolean analyzeViewfinderRegionOnly) {
        Object oVar;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(passiveAnalyzers, "passiveAnalyzers");
        this.side = side;
        List<? extends AutoCaptureRule> list = rules;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (AutoCaptureRule autoCaptureRule : list) {
            if (autoCaptureRule instanceof AutoCaptureRule.BarcodePdf417Rule) {
                oVar = new en.d(analyzeViewfinderRegionOnly);
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontOrBackRule) {
                oVar = new en.g(new en.j(analyzeViewfinderRegionOnly), new en.d(analyzeViewfinderRegionOnly));
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontRule) {
                oVar = new en.j(analyzeViewfinderRegionOnly);
            } else if (autoCaptureRule instanceof AutoCaptureRule.MrzRule) {
                oVar = new en.m();
            } else {
                if (!(autoCaptureRule instanceof AutoCaptureRule.TextExtractionRule)) {
                    throw new gt.l();
                }
                oVar = new en.o();
            }
            arrayList.add(oVar);
        }
        this.analyzers = arrayList;
        this.passiveAnalyzers = passiveAnalyzers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, dn.j0$c] */
    @NotNull
    public final Object p(@NotNull z imageToAnalyze, @NotNull List<AnalyzerResult> analyzerResults) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        Intrinsics.checkNotNullParameter(analyzerResults, "analyzerResults");
        if (analyzerResults.isEmpty()) {
            gt.n.Companion companion = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(new en.b.c()));
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f23007a = this.side;
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var3 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var4 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var5 = new kotlin.jvm.internal.c0();
        Iterator<T> it = analyzerResults.iterator();
        Throwable thE = null;
        loop0: while (true) {
            th2 = thE;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                AnalyzerResult analyzerResult = (AnalyzerResult) it.next();
                Object result = analyzerResult.getResult();
                if (gt.n.h(result)) {
                    q(yVar, c0Var3, c0Var2, c0Var, c0Var4, yVar2, c0Var5, (en.a) result, analyzerResult.getIsActiveAnalyzer());
                }
                thE = gt.n.e(result);
                if (thE == null || th2 != null || !analyzerResult.getIsActiveAnalyzer()) {
                }
            }
            yVar2.f23023a = true;
        }
        if (yVar2.f23023a) {
            if (th2 != null) {
                gt.n.Companion companion2 = gt.n.INSTANCE;
                return gt.n.b(gt.o.a(th2));
            }
            gt.n.Companion companion3 = gt.n.INSTANCE;
            return gt.n.b(new j0.None((ImageLightCondition) c0Var5.f23007a));
        }
        if (!yVar.f23023a) {
            gt.n.Companion companion4 = gt.n.INSTANCE;
            return gt.n.b(new j0.None((ImageLightCondition) c0Var5.f23007a));
        }
        j0.c cVar = (j0.c) c0Var.f23007a;
        if (cVar == null) {
            gt.n.Companion companion5 = gt.n.INSTANCE;
            return gt.n.b(new j0.None((ImageLightCondition) c0Var5.f23007a));
        }
        Bitmap bitmapE = imageToAnalyze.e();
        if (bitmapE == null) {
            gt.n.Companion companion6 = gt.n.INSTANCE;
            return gt.n.b(new j0.None((ImageLightCondition) c0Var5.f23007a));
        }
        gt.n.Companion companion7 = gt.n.INSTANCE;
        return gt.n.b(new j0.ParsedIdSide(cVar, bitmapE, (ImageIdMetadata) c0Var2.f23007a, (e) c0Var3.f23007a, (ExtractedTexts) c0Var4.f23007a, (ImageLightCondition) c0Var5.f23007a));
    }
}
