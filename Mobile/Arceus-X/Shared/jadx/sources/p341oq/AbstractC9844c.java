package p341oq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0963j0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9577i;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p402r5.InterfaceC10784a;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: oq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B)\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Loq/c;", "Lr5/a;", "T", "Rendering", "Loq/a;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "<init>", "(Lzt/n;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lnu/p0;", "g2", "(Lnu/p0;)V", "rendering", "h2", "(Ljava/lang/Object;)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC9844c<T extends InterfaceC10784a, Rendering> extends AbstractC9842a<T> {

    /* JADX INFO: renamed from: oq.c$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1", m39664f = "BaseWorkflowFragment.kt", m39665l = {33}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35679t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC9844c<T, Rendering> f35680u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9592p0<Rendering> f35681v;

        /* JADX INFO: renamed from: oq.c$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1$1", m39664f = "BaseWorkflowFragment.kt", m39665l = {34}, m39666m = "invokeSuspend")
        public static final class C14222a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f35682t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC9592p0<Rendering> f35683u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ AbstractC9844c<T, Rendering> f35684v;

            /* JADX INFO: renamed from: oq.c$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14223a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC9844c<T, Rendering> f35685a;

                public C14223a(AbstractC9844c<T, Rendering> abstractC9844c) {
                    this.f35685a = abstractC9844c;
                }

                @Override // nu.InterfaceC9577i
                public final Object emit(Rendering rendering, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    if (rendering == null) {
                        return Unit.f29331a;
                    }
                    this.f35685a.mo16775h2(rendering);
                    this.f35685a.m4659a2();
                    return Unit.f29331a;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.p0<? extends Rendering> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14222a(InterfaceC9592p0<? extends Rendering> interfaceC9592p0, AbstractC9844c<T, Rendering> abstractC9844c, InterfaceC9557b<? super C14222a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f35683u = interfaceC9592p0;
                this.f35684v = abstractC9844c;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14222a(this.f35683u, this.f35684v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f35682t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9592p0<Rendering> interfaceC9592p0 = this.f35683u;
                    C14223a c14223a = new C14223a(this.f35684v);
                    this.f35682t = 1;
                    if (interfaceC9592p0.collect(c14223a, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                throw new C7334d();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14222a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.p0<? extends Rendering> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC9844c<T, Rendering> abstractC9844c, InterfaceC9592p0<? extends Rendering> interfaceC9592p0, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35680u = abstractC9844c;
            this.f35681v = interfaceC9592p0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f35680u, this.f35681v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35679t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AbstractC9844c<T, Rendering> abstractC9844c = this.f35680u;
                AbstractC0966l.b bVar = AbstractC0966l.b.STARTED;
                C14222a c14222a = new C14222a(this.f35681v, abstractC9844c, null);
                this.f35679t = 1;
                if (C0963j0.m4921b(abstractC9844c, bVar, c14222a, this) == objM38805e) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9844c(@NotNull InterfaceC14057n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> inflateFn) {
        super(inflateFn);
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        m4597E1();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m38732g2(@NotNull InterfaceC9592p0<? extends Rendering> interfaceC9592p0) {
        Intrinsics.checkNotNullParameter(interfaceC9592p0, "<this>");
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new a(this, interfaceC9592p0, null), 3, null);
    }

    /* JADX INFO: renamed from: h2 */
    public abstract void mo16775h2(Rendering rendering);
}
