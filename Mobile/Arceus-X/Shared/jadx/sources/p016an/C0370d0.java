package p016an;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: an.d0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"", "Lan/a0;", "bindings", "Lan/c0;", "b", "([Lan/a0;)Lan/c0;", "a", "()Lan/c0;", "", "RenderingT", "rendering", "e", "(Lan/c0;Ljava/lang/Object;)Lan/a0;", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Lan/f0;", "viewStarter", "Landroid/view/View;", "c", "(Lan/c0;Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;Lan/f0;)Landroid/view/View;", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0370d0 {

    /* JADX INFO: renamed from: an.d0$a */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"", "RenderingT", "Landroid/view/View;", "newView", "", "a", "(Landroid/view/View;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function1<View, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC0374f0 f909i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Function1<View, Unit> f910j;

        /* JADX INFO: renamed from: an.d0$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "RenderingT", "", "b", "()V"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class C14066a extends AbstractC7746m implements Function0<Unit> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ Function1<View, Unit> f911i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ View f912j;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14066a(Function1<? super View, Unit> function1, View view) {
                super(0);
                this.f911i = function1;
                this.f912j = view;
            }

            /* JADX INFO: renamed from: b */
            public final void m1404b() {
                this.f911i.invoke(this.f912j);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m1404b();
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC0374f0 interfaceC0374f0, Function1<? super View, Unit> function1) {
            super(1);
            this.f909i = interfaceC0374f0;
            this.f910j = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m1403a(@NotNull View newView) {
            Intrinsics.checkNotNullParameter(newView, "newView");
            this.f909i.mo1416a(newView, new C14066a(this.f910j, newView));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            m1403a(view);
            return Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0368c0 m1398a() {
        return new C0394w((InterfaceC0364a0<?>[]) new InterfaceC0364a0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC0368c0 m1399b(@NotNull InterfaceC0364a0<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        return new C0394w((InterfaceC0364a0<?>[]) Arrays.copyOf(bindings, bindings.length));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <RenderingT> View m1400c(@NotNull InterfaceC0368c0 interfaceC0368c0, @NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup viewGroup, @Nullable InterfaceC0374f0 interfaceC0374f0) {
        Intrinsics.checkNotNullParameter(interfaceC0368c0, "<this>");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        View viewMo1379a = m1402e(interfaceC0368c0, initialRendering).mo1379a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        if (C0378h0.m1433d(viewMo1379a) != null) {
            if (interfaceC0374f0 == null) {
                return viewMo1379a;
            }
            C0372e0.m1413f(viewMo1379a, new a(interfaceC0374f0, C0372e0.m1412e(viewMo1379a)));
            return viewMo1379a;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewMo1379a + ", typically by the " + ((Object) InterfaceC0364a0.class.getName()) + " that created it.").toString());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ View m1401d(InterfaceC0368c0 interfaceC0368c0, Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup, InterfaceC0374f0 interfaceC0374f0, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            viewGroup = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC0374f0 = null;
        }
        return m1400c(interfaceC0368c0, obj, viewEnvironment, context, viewGroup, interfaceC0374f0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: RenderingT */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <RenderingT> InterfaceC0364a0<RenderingT> m1402e(@NotNull InterfaceC0368c0 interfaceC0368c0, @NotNull RenderingT rendering) {
        Intrinsics.checkNotNullParameter(interfaceC0368c0, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        InterfaceC0364a0<RenderingT> interfaceC0364a0Mo1389a = interfaceC0368c0.mo1389a(C7731d0.m32002b(rendering.getClass()));
        if (interfaceC0364a0Mo1389a == null) {
            InterfaceC0365b interfaceC0365b = rendering instanceof InterfaceC0365b ? (InterfaceC0365b) rendering : null;
            interfaceC0364a0Mo1389a = interfaceC0365b == null ? null : interfaceC0365b.mo1380a();
            if (interfaceC0364a0Mo1389a == null) {
                interfaceC0364a0Mo1389a = null;
            }
            if (interfaceC0364a0Mo1389a == null) {
                C0385n c0385n = (rendering instanceof C0384m ? (C0384m) rendering : null) != null ? C0385n.f943b : null;
                if (c0385n != null) {
                    return c0385n;
                }
                throw new IllegalArgumentException("A " + ((Object) C7731d0.m32002b(InterfaceC0364a0.class).mo28426f()) + " should have been registered to display " + ((Object) C7731d0.m32002b(rendering.getClass()).mo28426f()) + " instances, or that class should implement " + ((Object) C7731d0.m32002b(InterfaceC0365b.class).mo28427g()) + '<' + ((Object) C7731d0.m32002b(rendering.getClass()).mo28427g()) + ">.");
            }
        }
        return interfaceC0364a0Mo1389a;
    }
}
