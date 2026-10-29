package an;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "Lan/a0;", "bindings", "Lan/c0;", "b", "([Lan/a0;)Lan/c0;", "a", "()Lan/c0;", "", "RenderingT", "rendering", "e", "(Lan/c0;Ljava/lang/Object;)Lan/a0;", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Lan/f0;", "viewStarter", "Landroid/view/View;", "c", "(Lan/c0;Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;Lan/f0;)Landroid/view/View;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class d0 {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Landroid/view/View;", "newView", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<View, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f0 f699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function1<View, Unit> f700j;

        /* JADX INFO: renamed from: an.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "RenderingT", "", "b", "()V"}, k = 3, mv = {1, 6, 0})
        public static final class C0009a extends kotlin.jvm.internal.m implements Function0<Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function1<View, Unit> f701i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ View f702j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0009a(Function1<? super View, Unit> function1, View view) {
                super(0);
                this.f701i = function1;
                this.f702j = view;
            }

            public final void b() {
                this.f701i.invoke(this.f702j);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                b();
                return Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f0 f0Var, Function1<? super View, Unit> function1) {
            super(1);
            this.f699i = f0Var;
            this.f700j = function1;
        }

        public final void a(@NotNull View newView) {
            Intrinsics.checkNotNullParameter(newView, "newView");
            this.f699i.a(newView, new C0009a(this.f700j, newView));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.f22483a;
        }
    }

    @NotNull
    public static final c0 a() {
        return new w((a0<?>[]) new a0[0]);
    }

    @NotNull
    public static final c0 b(@NotNull a0<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        return new w((a0<?>[]) Arrays.copyOf(bindings, bindings.length));
    }

    @NotNull
    public static final <RenderingT> View c(@NotNull c0 c0Var, @NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup viewGroup, @Nullable f0 f0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        View viewA = e(c0Var, initialRendering).a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        if (h0.d(viewA) != null) {
            if (f0Var == null) {
                return viewA;
            }
            e0.f(viewA, new a(f0Var, e0.e(viewA)));
            return viewA;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewA + ", typically by the " + ((Object) a0.class.getName()) + " that created it.").toString());
    }

    public static /* synthetic */ View d(c0 c0Var, Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup, f0 f0Var, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            viewGroup = null;
        }
        if ((i10 & 16) != 0) {
            f0Var = null;
        }
        return c(c0Var, obj, viewEnvironment, context, viewGroup, f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <RenderingT> a0<RenderingT> e(@NotNull c0 c0Var, @NotNull RenderingT rendering) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        a0<RenderingT> a0VarA = c0Var.a(kotlin.jvm.internal.d0.b(rendering.getClass()));
        if (a0VarA == null) {
            b bVar = rendering instanceof b ? (b) rendering : null;
            a0VarA = bVar == null ? null : bVar.a();
            if (a0VarA == null) {
                a0VarA = null;
            }
            if (a0VarA == null) {
                n nVar = (rendering instanceof m ? (m) rendering : null) != null ? n.b : null;
                if (nVar != null) {
                    return nVar;
                }
                throw new IllegalArgumentException("A " + ((Object) kotlin.jvm.internal.d0.b(a0.class).f()) + " should have been registered to display " + ((Object) kotlin.jvm.internal.d0.b(rendering.getClass()).f()) + " instances, or that class should implement " + ((Object) kotlin.jvm.internal.d0.b(b.class).g()) + '<' + ((Object) kotlin.jvm.internal.d0.b(rendering.getClass()).g()) + ">.");
            }
        }
        return a0VarA;
    }
}
