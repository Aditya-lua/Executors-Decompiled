package bn;

import android.view.View;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbn/d;", "Landroidx/lifecycle/s;", "", "L", "()V", "yo", "a", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface d extends s {

    /* JADX INFO: renamed from: yo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f4264a;

    /* JADX INFO: renamed from: bn.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbn/d$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroidx/lifecycle/l;", "findParentLifecycle", "", "d", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lbn/d;", "c", "(Landroid/view/View;)Lbn/d;", "b", "(Landroid/view/View;)Landroidx/lifecycle/l;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f4264a = new Companion();

        /* JADX INFO: renamed from: bn.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "v", "Landroidx/lifecycle/l;", "a", "(Landroid/view/View;)Landroidx/lifecycle/l;"}, k = 3, mv = {1, 6, 0})
        public static final class C0085a extends m implements Function1<View, l> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final C0085a f4265i = new C0085a();

            public C0085a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke(@NotNull View v5) {
                Intrinsics.checkNotNullParameter(v5, "v");
                return Companion.f4264a.b(v5);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(Companion companion, View view, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                function1 = C0085a.f4265i;
            }
            companion.d(view, function1);
        }

        public final l b(View view) {
            s sVarA;
            Object parent = view.getParent();
            l lVarA = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null && (sVarA = c.f4262a.a(view2)) != null) {
                lVarA = sVarA.a();
            }
            if (lVarA != null) {
                return lVarA;
            }
            throw new IllegalStateException(("Expected parent or context of " + view + " to have or be a ViewTreeLifecycleOwner").toString());
        }

        @Nullable
        public final d c(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            s sVarA = androidx.p000lifecycle.View.a(view);
            if (sVarA instanceof d) {
                return (d) sVarA;
            }
            return null;
        }

        public final void d(@NotNull View view, @NotNull Function1<? super View, ? extends l> findParentLifecycle) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
            b bVar = new b(findParentLifecycle, false, 2, null);
            androidx.p000lifecycle.View.b(view, bVar);
            view.addOnAttachStateChangeListener(bVar);
        }
    }

    void L();
}
