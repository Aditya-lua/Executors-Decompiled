package bn;

import android.view.View;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bn.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m31665d2 = {"Lbn/d;", "Landroidx/lifecycle/s;", "", "L", "()V", "yo", "a", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public interface InterfaceC1472d extends InterfaceC0980s {

    /* JADX INFO: renamed from: yo, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5716a;

    /* JADX INFO: renamed from: bn.d$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lbn/d$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroidx/lifecycle/l;", "findParentLifecycle", "", "d", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lbn/d;", "c", "(Landroid/view/View;)Lbn/d;", "b", "(Landroid/view/View;)Landroidx/lifecycle/l;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5716a = new Companion();

        /* JADX INFO: renamed from: bn.d$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroid/view/View;", "v", "Landroidx/lifecycle/l;", "a", "(Landroid/view/View;)Landroidx/lifecycle/l;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class C14095a extends AbstractC7746m implements Function1<View, AbstractC0966l> {

            /* JADX INFO: renamed from: i */
            public static final C14095a f5717i = new C14095a();

            public C14095a() {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC0966l invoke(@NotNull View v5) {
                Intrinsics.checkNotNullParameter(v5, "v");
                return Companion.f5716a.m7551b(v5);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: bn.d$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m7550e(Companion companion, View view, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                function1 = C14095a.f5717i;
            }
            companion.m7553d(view, function1);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC0966l m7551b(View view) {
            InterfaceC0980s interfaceC0980sM7545a;
            Object parent = view.getParent();
            AbstractC0966l abstractC0966lMo4656a = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null && (interfaceC0980sM7545a = C1471c.f5714a.m7545a(view2)) != null) {
                abstractC0966lMo4656a = interfaceC0980sM7545a.mo4656a();
            }
            if (abstractC0966lMo4656a != null) {
                return abstractC0966lMo4656a;
            }
            throw new IllegalStateException(("Expected parent or context of " + view + " to have or be a ViewTreeLifecycleOwner").toString());
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final InterfaceC1472d m7552c(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            InterfaceC0980s interfaceC0980sM4901a = androidx.p616lifecycle.View.m4901a(view);
            if (interfaceC0980sM4901a instanceof InterfaceC1472d) {
                return (InterfaceC1472d) interfaceC0980sM4901a;
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final void m7553d(@NotNull View view, @NotNull Function1<? super View, ? extends AbstractC0966l> findParentLifecycle) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
            ViewOnAttachStateChangeListenerC1470b viewOnAttachStateChangeListenerC1470b = new ViewOnAttachStateChangeListenerC1470b(findParentLifecycle, false, 2, null);
            androidx.p616lifecycle.View.m4902b(view, viewOnAttachStateChangeListenerC1470b);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1470b);
        }
    }

    /* JADX INFO: renamed from: L */
    void mo7543L();
}
