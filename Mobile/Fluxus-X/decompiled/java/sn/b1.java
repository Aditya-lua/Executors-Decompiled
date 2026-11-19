package sn;

import android.graphics.Rect;
import android.media.Image;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001e\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0096A¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.¨\u0006/"}, d2 = {"Lsn/b1;", "Lwn/a;", "Lg0/u0$a;", "Ldv/g0;", "Lxn/d;", "Lun/g;", "Lsn/f1;", "selfieProcessor", "Ldv/b0;", "resultFlow", "<init>", "(Lsn/f1;Ldv/b0;)V", BuildConfig.FLAVOR, "minFaceRatio", "maxFaceRatio", BuildConfig.FLAVOR, "analyzeLightConditions", BuildConfig.FLAVOR, "m", "(DDZ)V", "Lsn/f1$c;", "pose", "n", "(Lsn/f1$c;)V", "Landroidx/camera/core/d;", "imageProxy", "j", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", BuildConfig.FLAVOR, "rotationDegrees", "i", "(Landroid/media/Image;I)V", "Landroid/graphics/Rect;", "rect", "previewRect", "b", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "a", "Lsn/f1;", "Ldv/b0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b1 implements wn.a, g0.u0.a, dv.g0<xn.d>, un.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f1 selfieProcessor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dv.b0<xn.d> resultFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", f = "SelfieDirectionFeed.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31553t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ xn.d f31555v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xn.d dVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f31555v = dVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return b1.this.new a(this.f31555v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f31553t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.b0 b0Var = b1.this.resultFlow;
                xn.d dVar = this.f31555v;
                this.f31553t = 1;
                if (b0Var.emit(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", f = "SelfieDirectionFeed.kt", l = {Barcode.FORMAT_EAN_8}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31556t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ xn.d f31558v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xn.d dVar, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f31558v = dVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return b1.this.new b(this.f31558v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f31556t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.b0 b0Var = b1.this.resultFlow;
                xn.d dVar = this.f31558v;
                this.f31556t = 1;
                if (b0Var.emit(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public b1(@NotNull f1 selfieProcessor, @NotNull dv.b0<xn.d> resultFlow) {
        Intrinsics.checkNotNullParameter(selfieProcessor, "selfieProcessor");
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = resultFlow;
    }

    @Override // wn.a
    public void b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.selfieProcessor.w(rect, previewRect);
    }

    @Override // dv.g0, dv.h
    @Nullable
    public Object collect(@NotNull dv.i<? super xn.d> iVar, @NotNull eu.b<?> bVar) {
        return this.resultFlow.collect(iVar, bVar);
    }

    @Override // un.g
    public void i(@NotNull Image image, int rotationDegrees) throws Exception {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            xn.d dVarD = this.selfieProcessor.d(image, rotationDegrees);
            nu.a.a(image, null);
            av.j.b(null, new b(dVarD, null), 1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(image, th2);
                throw th3;
            }
        }
    }

    @Override // g0.u0.a
    public void j(@NotNull androidx.camera.core.d imageProxy) throws Exception {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            xn.d dVarE = this.selfieProcessor.e(imageProxy);
            nu.a.a(imageProxy, null);
            av.j.b(null, new a(dVarE, null), 1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(imageProxy, th2);
                throw th3;
            }
        }
    }

    public final void m(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.selfieProcessor.u(minFaceRatio, maxFaceRatio, analyzeLightConditions);
    }

    public final void n(@NotNull f1.c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.selfieProcessor.v(pose);
    }
}
