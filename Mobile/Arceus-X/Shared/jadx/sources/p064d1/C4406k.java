package p064d1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import p140g0.AbstractC5952w2;
import p140g0.C5945v;
import p140g0.C5956x2;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5937t;
import p366q0.C10417c;
import p397r0.C10773n;
import p436t.InterfaceC11464a;
import p533x2.C12637g;

/* JADX INFO: renamed from: d1.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m31665d2 = {"Ld1/k;", "", "Ld1/g;", "lifecycleCameraProvider", "<init>", "(Ld1/g;)V", "", "Lg0/w2;", "useCases", "", "g", "([Lg0/w2;)V", "h", "()V", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lg0/v;", "cameraSelector", "Lg0/x2;", "useCaseGroup", "Lg0/l;", "c", "(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;", "Lg0/t;", "d", "(Lg0/v;)Lg0/t;", "Landroid/content/Context;", "context", "Lne/x;", "Ljava/lang/Void;", "f", "(Landroid/content/Context;)Lne/x;", "a", "Ld1/g;", "b", "camera-lifecycle_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
@SuppressLint({"NullAnnotationGroup"})
public final class C4406k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C4406k f18297c = new C4406k(new C4402g());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C4402g lifecycleCameraProvider;

    /* JADX INFO: renamed from: d1.k$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Ld1/k$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lne/x;", "Ld1/k;", "c", "(Landroid/content/Context;)Lne/x;", "sAppInstance", "Ld1/k;", "camera-lifecycle_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: d1.k.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static final C4406k m22145d(Void r8) {
            return C4406k.f18297c;
        }

        /* JADX INFO: renamed from: e */
        public static final C4406k m22146e(Function1 function1, Object obj) {
            return (C4406k) function1.invoke(obj);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final InterfaceFutureC9440x<C4406k> m22147c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C12637g.m47075g(context);
            InterfaceFutureC9440x interfaceFutureC9440xM22140f = C4406k.f18297c.m22140f(context);
            final Function1 function1 = new Function1() { // from class: d1.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4406k.Companion.m22145d((Void) obj);
                }
            };
            InterfaceFutureC9440x<C4406k> interfaceFutureC9440xM41001x = C10773n.m41001x(interfaceFutureC9440xM22140f, new InterfaceC11464a() { // from class: d1.j
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return C4406k.Companion.m22146e(function1, obj);
                }
            }, C10417c.m40081b());
            Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xM41001x, "transform(...)");
            return interfaceFutureC9440xM41001x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C4406k(C4402g c4402g) {
        this.lifecycleCameraProvider = c4402g;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceFutureC9440x<C4406k> m22137e(@NotNull Context context) {
        return INSTANCE.m22147c(context);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC5905l m22138c(@NotNull InterfaceC0980s lifecycleOwner, @NotNull C5945v cameraSelector, @NotNull C5956x2 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        return this.lifecycleCameraProvider.m22104m(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC5937t m22139d(@NotNull C5945v cameraSelector) {
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        return this.lifecycleCameraProvider.m22108r(cameraSelector);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceFutureC9440x<Void> m22140f(Context context) {
        return this.lifecycleCameraProvider.m22111u(context, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m22141g(@NotNull AbstractC5952w2... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        this.lifecycleCameraProvider.m22102D((AbstractC5952w2[]) Arrays.copyOf(useCases, useCases.length));
    }

    /* JADX INFO: renamed from: h */
    public final void m22142h() {
        this.lifecycleCameraProvider.m22103E();
    }
}
