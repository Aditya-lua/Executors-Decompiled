package sn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import wn.ViewfinderInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u00020\u0006B\u001d\b\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\rH\u0001¢\u0006\u0004\b*\u0010+J$\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040,H\u0096A¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b1\u00102R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lsn/h0;", "Lwn/a;", "Lg0/u0$a;", "Ldv/g0;", "Lzt/n;", "Lsn/w0;", "Lun/g;", "Ldv/b0;", "resultFlow", "<init>", "(Ldv/b0;)V", "Lsn/w0$c;", "side", BuildConfig.FLAVOR, "Lsn/e;", "rules", "Ltn/e;", "passiveAnalyzers", BuildConfig.FLAVOR, "analyzeViewfinderRegionOnly", BuildConfig.FLAVOR, "o", "(Lsn/w0$c;Ljava/util/List;Ljava/util/List;Z)V", "Landroid/graphics/Rect;", "rect", "previewRect", "b", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroidx/camera/core/d;", "imageProxy", "j", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", BuildConfig.FLAVOR, "rotationDegrees", "i", "(Landroid/media/Image;I)V", "Lsn/l0;", "imageToAnalyze", "Lsn/b;", "analyzerResults", "p", "(Lsn/l0;Ljava/util/List;)Ljava/lang/Object;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "n", "(Lsn/l0;Leu/b;)Ljava/lang/Object;", "a", "Ldv/b0;", "Lsn/w0$c;", "c", "Ljava/util/List;", "analyzers", "d", "Lwn/c;", "e", "Lwn/c;", "viewfinderInfo", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements wn.a, g0.u0.a, dv.g0<zt.n<? extends w0>>, un.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.b0<zt.n<w0>> resultFlow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public w0.c side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends tn.e> analyzers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends tn.e> passiveAnalyzers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewfinderInfo viewfinderInfo;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed", f = "GovernmentIdFeed.kt", l = {92, 98}, m = "analyze-gIAlu-s")
    public static final class a extends gu.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public int I;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31613t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31614u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31615v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31616w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f31617x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f31618y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f31619z;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.G = obj;
            this.I |= Integer.MIN_VALUE;
            Object objN = h0.this.n(null, this);
            return objN == fu.c.e() ? objN : zt.n.a(objN);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4", f = "GovernmentIdFeed.kt", l = {112, 114}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31620t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31621u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31622v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31623w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f31624x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h0 f31625y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.camera.core.d dVar, h0 h0Var, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f31624x = dVar;
            this.f31625y = h0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f31624x, this.f31625y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        
            if (r1.emit(r3, r7) == r0) goto L25;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.AutoCloseable] */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objN;
            AutoCloseable autoCloseable;
            Object objE = fu.c.e();
            ?? r10 = this.f31623w;
            try {
                if (r10 != 0) {
                    if (r10 == 1) {
                        AutoCloseable autoCloseable2 = (AutoCloseable) this.f31620t;
                        zt.o.b(obj);
                        objN = ((zt.n) obj).getValue();
                        autoCloseable = autoCloseable2;
                    } else {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return Unit.f21506a;
                }
                zt.o.b(obj);
                androidx.camera.core.d dVar = this.f31624x;
                h0 h0Var = this.f31625y;
                l0 l0VarF = o0.f(dVar);
                if (l0VarF == null) {
                    Unit unit = Unit.f21506a;
                    nu.a.a(dVar, null);
                    return unit;
                }
                this.f31620t = dVar;
                this.f31621u = gu.l.a(dVar);
                this.f31622v = 0;
                this.f31623w = 1;
                objN = h0Var.n(l0VarF, this);
                autoCloseable = dVar;
                if (objN != objE) {
                }
                return objE;
                nu.a.a(autoCloseable, null);
                dv.b0 b0Var = this.f31625y.resultFlow;
                zt.n nVarA = zt.n.a(objN);
                this.f31620t = gu.l.a(objN);
                this.f31621u = null;
                this.f31623w = 2;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    nu.a.a(r10, th2);
                    throw th3;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5", f = "GovernmentIdFeed.kt", l = {121, 123}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31626t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31627u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31628v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31629w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Image f31630x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h0 f31631y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ int f31632z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Image image, h0 h0Var, int i10, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f31630x = image;
            this.f31631y = h0Var;
            this.f31632z = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f31630x, this.f31631y, this.f31632z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r1.emit(r4, r6) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v5, types: [dv.b0] */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objN;
            AutoCloseable autoCloseable;
            Object objE = fu.c.e();
            ?? r10 = this.f31629w;
            try {
                if (r10 != 0) {
                    if (r10 == 1) {
                        AutoCloseable autoCloseable2 = (AutoCloseable) this.f31626t;
                        zt.o.b(obj);
                        objN = ((zt.n) obj).getValue();
                        autoCloseable = autoCloseable2;
                    } else {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj);
                    }
                    return Unit.f21506a;
                }
                zt.o.b(obj);
                Image image = this.f31630x;
                h0 h0Var = this.f31631y;
                l0 l0VarE = o0.e(image, this.f31632z);
                this.f31626t = image;
                this.f31627u = gu.l.a(image);
                this.f31628v = 0;
                this.f31629w = 1;
                objN = h0Var.n(l0VarE, this);
                autoCloseable = image;
                if (objN != objE) {
                }
                return objE;
                nu.a.a(autoCloseable, null);
                r10 = this.f31631y.resultFlow;
                zt.n nVarA = zt.n.a(objN);
                this.f31626t = gu.l.a(objN);
                this.f31627u = null;
                this.f31629w = 2;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    nu.a.a(r10, th2);
                    throw th3;
                }
            }
        }
    }

    public h0(@NotNull dv.b0<zt.n<w0>> resultFlow) {
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.resultFlow = resultFlow;
        this.analyzers = p001kotlin.collections.p.k();
        this.passiveAnalyzers = p001kotlin.collections.p.k();
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [T, sn.e0] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, sn.w0$c] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, sn.j0] */
    /* JADX WARN: Type inference failed for: r10v18, types: [T, sn.g] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, sn.k0] */
    public static final void q(p001kotlin.jvm.internal.y yVar, p001kotlin.jvm.internal.c0<g> c0Var, p001kotlin.jvm.internal.c0<ImageIdMetadata> c0Var2, p001kotlin.jvm.internal.c0<w0.c> c0Var3, p001kotlin.jvm.internal.c0<ExtractedTexts> c0Var4, p001kotlin.jvm.internal.y yVar2, p001kotlin.jvm.internal.c0<ImageLightCondition> c0Var5, tn.a aVar, boolean z10) {
        tn.a.b bVar = tn.a.b.f32571a;
        if (!Intrinsics.c(aVar, bVar) && z10) {
            yVar.f21591a = true;
        }
        if (aVar instanceof tn.a.C0655a) {
            if (c0Var.f21575a == null) {
                c0Var.f21575a = ((tn.a.C0655a) aVar).getExtractedBarcode();
                return;
            }
            return;
        }
        if (aVar instanceof tn.a.d) {
            c0Var2.f21575a = ((tn.a.d) aVar).getMetadata();
            return;
        }
        if (aVar instanceof tn.a.c) {
            tn.a.c cVar = (tn.a.c) aVar;
            q(yVar, c0Var, c0Var2, c0Var3, c0Var4, yVar2, c0Var5, cVar.getFrontOrBackData(), z10);
            c0Var3.f21575a = cVar.getSide();
        } else if (aVar instanceof tn.a.f) {
            c0Var4.f21575a = ((tn.a.f) aVar).getExtractedTexts();
        } else if (Intrinsics.c(aVar, bVar)) {
            yVar2.f21591a = true;
        } else {
            if (!(aVar instanceof tn.a.e)) {
                throw new zt.l();
            }
            c0Var5.f21575a = ((tn.a.e) aVar).getImageLightCondition();
        }
    }

    @Override // wn.a
    public void b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }

    @Override // dv.g0, dv.h
    @Nullable
    public Object collect(@NotNull dv.i<? super zt.n<? extends w0>> iVar, @NotNull eu.b<?> bVar) {
        return this.resultFlow.collect(iVar, bVar);
    }

    @Override // un.g
    public void i(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        av.j.b(null, new c(image, this, rotationDegrees, null), 1, null);
    }

    @Override // g0.u0.a
    public void j(@NotNull androidx.camera.core.d imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        av.j.b(null, new b(imageProxy, this, null), 1, null);
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
    /* JADX WARN: Type inference failed for: r17v0, types: [sn.h0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:32:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0191 -> B:40:0x0192). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(sn.l0 r18, eu.b<? super zt.n<? extends sn.w0>> r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.h0.n(sn.l0, eu.b):java.lang.Object");
    }

    public final void o(@NotNull w0.c side, @NotNull List<? extends e> rules, @NotNull List<? extends tn.e> passiveAnalyzers, boolean analyzeViewfinderRegionOnly) {
        tn.e oVar;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(passiveAnalyzers, "passiveAnalyzers");
        this.side = side;
        List<? extends e> list = rules;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        for (e eVar : list) {
            if (eVar instanceof e.BarcodePdf417Rule) {
                oVar = new tn.d(analyzeViewfinderRegionOnly);
            } else if (eVar instanceof e.FrontOrBackRule) {
                oVar = new tn.g(new tn.j(analyzeViewfinderRegionOnly), new tn.d(analyzeViewfinderRegionOnly));
            } else if (eVar instanceof e.FrontRule) {
                oVar = new tn.j(analyzeViewfinderRegionOnly);
            } else if (eVar instanceof e.MrzRule) {
                oVar = new tn.m();
            } else {
                if (!(eVar instanceof e.TextExtractionRule)) {
                    throw new zt.l();
                }
                oVar = new tn.o();
            }
            arrayList.add(oVar);
        }
        this.analyzers = arrayList;
        this.passiveAnalyzers = passiveAnalyzers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, sn.w0$c] */
    @NotNull
    public final Object p(@NotNull l0 imageToAnalyze, @NotNull List<AnalyzerResult> analyzerResults) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        Intrinsics.checkNotNullParameter(analyzerResults, "analyzerResults");
        if (analyzerResults.isEmpty()) {
            zt.n.Companion companion = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(new tn.b.c()));
        }
        p001kotlin.jvm.internal.y yVar = new p001kotlin.jvm.internal.y();
        p001kotlin.jvm.internal.y yVar2 = new p001kotlin.jvm.internal.y();
        p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
        c0Var.f21575a = this.side;
        p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
        p001kotlin.jvm.internal.c0 c0Var3 = new p001kotlin.jvm.internal.c0();
        p001kotlin.jvm.internal.c0 c0Var4 = new p001kotlin.jvm.internal.c0();
        p001kotlin.jvm.internal.c0 c0Var5 = new p001kotlin.jvm.internal.c0();
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
                if (zt.n.h(result)) {
                    q(yVar, c0Var3, c0Var2, c0Var, c0Var4, yVar2, c0Var5, (tn.a) result, analyzerResult.getIsActiveAnalyzer());
                }
                thE = zt.n.e(result);
                if (thE == null || th2 != null || !analyzerResult.getIsActiveAnalyzer()) {
                }
            }
            yVar2.f21591a = true;
        }
        if (yVar2.f21591a) {
            if (th2 != null) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                return zt.n.b(zt.o.a(th2));
            }
            zt.n.Companion companion3 = zt.n.INSTANCE;
            return zt.n.b(new w0.None((ImageLightCondition) c0Var5.f21575a));
        }
        if (!yVar.f21591a) {
            zt.n.Companion companion4 = zt.n.INSTANCE;
            return zt.n.b(new w0.None((ImageLightCondition) c0Var5.f21575a));
        }
        w0.c cVar = (w0.c) c0Var.f21575a;
        if (cVar == null) {
            zt.n.Companion companion5 = zt.n.INSTANCE;
            return zt.n.b(new w0.None((ImageLightCondition) c0Var5.f21575a));
        }
        Bitmap bitmapA = imageToAnalyze.a();
        if (bitmapA == null) {
            zt.n.Companion companion6 = zt.n.INSTANCE;
            return zt.n.b(new w0.None((ImageLightCondition) c0Var5.f21575a));
        }
        zt.n.Companion companion7 = zt.n.INSTANCE;
        return zt.n.b(new w0.ParsedIdSide(cVar, bitmapA, (ImageIdMetadata) c0Var2.f21575a, (g) c0Var3.f21575a, (ExtractedTexts) c0Var4.f21575a, (ImageLightCondition) c0Var5.f21575a));
    }
}
