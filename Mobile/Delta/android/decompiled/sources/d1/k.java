package d1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.p000lifecycle.s;
import g0.l;
import g0.t;
import g0.v;
import g0.w2;
import g0.x2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.x;
import org.jetbrains.annotations.NotNull;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Ld1/k;", "", "Ld1/g;", "lifecycleCameraProvider", "<init>", "(Ld1/g;)V", "", "Lg0/w2;", "useCases", "", "g", "([Lg0/w2;)V", "h", "()V", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lg0/v;", "cameraSelector", "Lg0/x2;", "useCaseGroup", "Lg0/l;", "c", "(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;", "Lg0/t;", "d", "(Lg0/v;)Lg0/t;", "Landroid/content/Context;", "context", "Lme/x;", "Ljava/lang/Void;", "f", "(Landroid/content/Context;)Lme/x;", "a", "Ld1/g;", "b", "camera-lifecycle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"NullAnnotationGroup"})
public final class k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f14303c = new k(new g());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g lifecycleCameraProvider;

    /* JADX INFO: renamed from: d1.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld1/k$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lme/x;", "Ld1/k;", "c", "(Landroid/content/Context;)Lme/x;", "sAppInstance", "Ld1/k;", "camera-lifecycle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final k d(Void r8) {
            return k.f14303c;
        }

        public static final k e(Function1 function1, Object obj) {
            return (k) function1.invoke(obj);
        }

        @NotNull
        public final x<k> c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            x2.g.g(context);
            x xVarF = k.f14303c.f(context);
            final Function1 function1 = new Function1() { // from class: d1.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k.Companion.d((Void) obj);
                }
            };
            x<k> xVarX = n.x(xVarF, new t.a() { // from class: d1.j
                @Override // t.a
                public final Object apply(Object obj) {
                    return k.Companion.e(function1, obj);
                }
            }, q0.c.b());
            Intrinsics.checkNotNullExpressionValue(xVarX, "transform(...)");
            return xVarX;
        }

        public Companion() {
        }
    }

    public k(g gVar) {
        this.lifecycleCameraProvider = gVar;
    }

    @NotNull
    public static final x<k> e(@NotNull Context context) {
        return INSTANCE.c(context);
    }

    @NotNull
    public final l c(@NotNull s lifecycleOwner, @NotNull v cameraSelector, @NotNull x2 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        return this.lifecycleCameraProvider.m(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    @NotNull
    public t d(@NotNull v cameraSelector) {
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        return this.lifecycleCameraProvider.r(cameraSelector);
    }

    public final x<Void> f(Context context) {
        return this.lifecycleCameraProvider.u(context, null);
    }

    public final void g(@NotNull w2... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        this.lifecycleCameraProvider.D((w2[]) Arrays.copyOf(useCases, useCases.length));
    }

    public final void h() {
        this.lifecycleCameraProvider.E();
    }
}
