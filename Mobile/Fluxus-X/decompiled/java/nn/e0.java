package nn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {BuildConfig.FLAVOR, "Lnn/b0;", "bindings", "Lnn/d0;", "b", "([Lnn/b0;)Lnn/d0;", "a", "()Lnn/d0;", BuildConfig.FLAVOR, "RenderingT", "rendering", "e", "(Lnn/d0;Ljava/lang/Object;)Lnn/b0;", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Lnn/g0;", "viewStarter", "Landroid/view/View;", "c", "(Lnn/d0;Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;Lnn/g0;)Landroid/view/View;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class e0 {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "RenderingT", "Landroid/view/View;", "newView", BuildConfig.FLAVOR, "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function1<View, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ g0 f25840i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function1<View, Unit> f25841j;

        /* JADX INFO: renamed from: nn.e0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "RenderingT", BuildConfig.FLAVOR, "b", "()V"}, k = 3, mv = {1, 6, 0})
        public static final class C0504a extends p001kotlin.jvm.internal.m implements Function0<Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function1<View, Unit> f25842i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ View f25843j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0504a(Function1<? super View, Unit> function1, View view) {
                super(0);
                this.f25842i = function1;
                this.f25843j = view;
            }

            public final void b() {
                this.f25842i.invoke(this.f25843j);
            }

            @Override // p001kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                b();
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g0 g0Var, Function1<? super View, Unit> function1) {
            super(1);
            this.f25840i = g0Var;
            this.f25841j = function1;
        }

        public final void a(@NotNull View newView) {
            Intrinsics.checkNotNullParameter(newView, "newView");
            this.f25840i.a(newView, new C0504a(this.f25841j, newView));
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.f21506a;
        }
    }

    @NotNull
    public static final d0 a() {
        return new x((b0<?>[]) new b0[0]);
    }

    @NotNull
    public static final d0 b(@NotNull b0<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        return new x((b0<?>[]) Arrays.copyOf(bindings, bindings.length));
    }

    @NotNull
    public static final <RenderingT> View c(@NotNull d0 d0Var, @NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup viewGroup, @Nullable g0 g0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        View viewA = e(d0Var, initialRendering).a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        if (j0.d(viewA) != null) {
            if (g0Var == null) {
                return viewA;
            }
            f0.f(viewA, new a(g0Var, f0.e(viewA)));
            return viewA;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewA + ", typically by the " + ((Object) b0.class.getName()) + " that created it.").toString());
    }

    public static /* synthetic */ View d(d0 d0Var, Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup, g0 g0Var, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            viewGroup = null;
        }
        if ((i10 & 16) != 0) {
            g0Var = null;
        }
        return c(d0Var, obj, viewEnvironment, context, viewGroup, g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <RenderingT> b0<RenderingT> e(@NotNull d0 d0Var, @NotNull RenderingT rendering) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        b0<RenderingT> b0VarA = d0Var.a(p001kotlin.jvm.internal.d0.b(rendering.getClass()));
        if (b0VarA == null) {
            b bVar = rendering instanceof b ? (b) rendering : null;
            b0VarA = bVar == null ? null : bVar.a();
            if (b0VarA == null) {
                b0VarA = null;
            }
            if (b0VarA == null) {
                n nVar = (rendering instanceof m ? (m) rendering : null) != null ? n.b : null;
                if (nVar != null) {
                    return nVar;
                }
                throw new IllegalArgumentException("A " + ((Object) p001kotlin.jvm.internal.d0.b(b0.class).f()) + " should have been registered to display " + ((Object) p001kotlin.jvm.internal.d0.b(rendering.getClass()).f()) + " instances, or that class should implement " + ((Object) p001kotlin.jvm.internal.d0.b(b.class).h()) + '<' + ((Object) p001kotlin.jvm.internal.d0.b(rendering.getClass()).h()) + ">.");
            }
        }
        return b0VarA;
    }
}
