package p132fn;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0494d;
import hn.InterfaceC6442g;
import kn.C7640c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.C5942u0;
import p225jn.InterfaceC7210a;
import p229jt.C7348o;
import p256ku.C7877j;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p559xt.C12915a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fn.n0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001e\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0096A¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.¨\u0006/"}, m31665d2 = {"Lfn/n0;", "Ljn/a;", "Lg0/u0$a;", "Lnu/g0;", "Lkn/c;", "Lhn/g;", "Lfn/r0;", "selfieProcessor", "Lnu/b0;", "resultFlow", "<init>", "(Lfn/r0;Lnu/b0;)V", "", "minFaceRatio", "maxFaceRatio", "", "analyzeLightConditions", "", "m", "(DDZ)V", "Lfn/r0$c;", "pose", "n", "(Lfn/r0$c;)V", "Landroidx/camera/core/d;", "imageProxy", "k", "(Landroidx/camera/core/d;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "h", "(Landroid/media/Image;I)V", "Landroid/graphics/Rect;", "rect", "previewRect", "b", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "Lfn/r0;", "Lnu/b0;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5698n0 implements InterfaceC7210a, C5942u0.a, InterfaceC9574g0<C7640c>, InterfaceC6442g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C5706r0 selfieProcessor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<C7640c> resultFlow;

    /* JADX INFO: renamed from: fn.n0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$1", m39664f = "SelfieDirectionFeed.kt", m39665l = {54}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21877t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7640c f21879v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7640c c7640c, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21879v = c7640c;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5698n0.this.new a(this.f21879v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f21877t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9564b0 interfaceC9564b0 = C5698n0.this.resultFlow;
                C7640c c7640c = this.f21879v;
                this.f21877t = 1;
                if (interfaceC9564b0.emit(c7640c, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fn.n0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.SelfieDirectionFeed$analyze$2", m39664f = "SelfieDirectionFeed.kt", m39665l = {64}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21880t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7640c f21882v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7640c c7640c, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21882v = c7640c;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5698n0.this.new b(this.f21882v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f21880t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9564b0 interfaceC9564b0 = C5698n0.this.resultFlow;
                C7640c c7640c = this.f21882v;
                this.f21880t = 1;
                if (interfaceC9564b0.emit(c7640c, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C5698n0(@NotNull C5706r0 selfieProcessor, @NotNull InterfaceC9564b0<C7640c> resultFlow) {
        Intrinsics.checkNotNullParameter(selfieProcessor, "selfieProcessor");
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.selfieProcessor = selfieProcessor;
        this.resultFlow = resultFlow;
    }

    @Override // p225jn.InterfaceC7210a
    /* JADX INFO: renamed from: b */
    public void mo25835b(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.selfieProcessor.m25874w(rect, previewRect);
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super C7640c> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return this.resultFlow.collect(interfaceC9577i, interfaceC9557b);
    }

    @Override // hn.InterfaceC6442g
    /* JADX INFO: renamed from: h */
    public void mo25836h(@NotNull Image image, int rotationDegrees) throws Exception {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            C7640c c7640cM25856d = this.selfieProcessor.m25856d(image, rotationDegrees);
            C12915a.m47941a(image, null);
            C7877j.m32694b(null, new b(c7640cM25856d, null), 1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(image, th2);
                throw th3;
            }
        }
    }

    @Override // p140g0.C5942u0.a
    /* JADX INFO: renamed from: k */
    public void mo23127k(@NotNull InterfaceC0494d imageProxy) throws Exception {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        try {
            C7640c c7640cM25857e = this.selfieProcessor.m25857e(imageProxy);
            C12915a.m47941a(imageProxy, null);
            C7877j.m32694b(null, new a(c7640cM25857e, null), 1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(imageProxy, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25837m(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.selfieProcessor.m25872u(minFaceRatio, maxFaceRatio, analyzeLightConditions);
    }

    /* JADX INFO: renamed from: n */
    public final void m25838n(@NotNull C5706r0.c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.selfieProcessor.m25873v(pose);
    }
}
