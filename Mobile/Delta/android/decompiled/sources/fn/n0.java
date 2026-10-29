package fn;

import android.graphics.Rect;
import android.media.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001e\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0096A¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.¨\u0006/"}, d2 = {"Lfn/n0;", "Ljn/a;", "Lg0/u0$a;", "Lnu/g0;", "Lkn/c;", "Lhn/g;", "Lfn/r0;", "selfieProcessor", "Lnu/b0;", "resultFlow", "<init>", "(Lfn/r0;Lnu/b0;)V", "", "minFaceRatio", "maxFaceRatio", "", "analyzeLightConditions", "", "m", "(DDZ)V", "Lfn/r0$c;", "pose", "n", "(Lfn/r0$c;)V", "Landroidx/camera/core/d;", "imageProxy", "k", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "h", "(Landroid/media/Image;I)V", "Landroid/graphics/Rect;", "rect", "previewRect", "b", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "Lfn/r0;", "Lnu/b0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 implements jn.a, g0.u0.a, nu.g0<kn.c>, hn.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 selfieProcessor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final nu.b0<kn.c> resultFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", f = "SelfieDirectionFeed.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16941t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ kn.c f16943v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kn.c cVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f16943v = cVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return n0.this.new a(this.f16943v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f16941t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.b0 b0Var = n0.this.resultFlow;
                kn.c cVar = this.f16943v;
                this.f16941t = 1;
                if (b0Var.emit(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", f = "SelfieDirectionFeed.kt", l = {64}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16944t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ kn.c f16946v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kn.c cVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f16946v = cVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return n0.this.new b(this.f16946v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f16944t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.b0 b0Var = n0.this.resultFlow;
                kn.c cVar = this.f16946v;
                this.f16944t = 1;
                if (b0Var.emit(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public n0(@NotNull r0 selfieProcessor, @NotNull nu.b0<kn.c> resultFlow) {
        Intrinsics.checkNotNullParameter(selfieProcessor, "selfieProcessor");
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = resultFlow;
    }

    @Override // jn.a
    public void b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.selfieProcessor.w(rect, previewRect);
    }

    @Override // nu.g0, nu.h
    @Nullable
    public Object collect(@NotNull nu.i<? super kn.c> iVar, @NotNull nt.b<?> bVar) {
        return this.resultFlow.collect(iVar, bVar);
    }

    @Override // hn.g
    public void h(@NotNull Image image, int rotationDegrees) throws Exception {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            kn.c cVarD = this.selfieProcessor.d(image, rotationDegrees);
            xt.a.a(image, null);
            ku.j.b(null, new b(cVarD, null), 1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(image, th2);
                throw th3;
            }
        }
    }

    @Override // g0.u0.a
    public void k(@NotNull androidx.camera.core.d imageProxy) throws Exception {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            kn.c cVarE = this.selfieProcessor.e(imageProxy);
            xt.a.a(imageProxy, null);
            ku.j.b(null, new a(cVarE, null), 1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xt.a.a(imageProxy, th2);
                throw th3;
            }
        }
    }

    public final void m(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.selfieProcessor.u(minFaceRatio, maxFaceRatio, analyzeLightConditions);
    }

    public final void n(@NotNull r0.c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.selfieProcessor.v(pose);
    }
}
