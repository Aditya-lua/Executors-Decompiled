package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\fJ\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fJ%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fJ\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006%"}, d2 = {"Landroidx/fragment/app/f;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/c;", "f", "", "onlyRecursive", "", "g", "(Landroidx/fragment/app/c;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/c;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/c;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/f$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<a> lifecycleCallbacks;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/f$a;", "", "", "a", "Z", "b", "()Z", "recursive", "Landroidx/fragment/app/FragmentManager$l;", "callback", "Landroidx/fragment/app/FragmentManager$l;", "()Landroidx/fragment/app/FragmentManager$l;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean recursive;

        @NotNull
        public final FragmentManager.l a() {
            return null;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public f(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void a(@NotNull c f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().a(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void b(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.fragmentManager.A0().getContext();
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().b(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void c(@NotNull c f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().c(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void d(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().d(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void e(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().e(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void f(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().f(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void g(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.fragmentManager.A0().getContext();
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().g(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void h(@NotNull c f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().h(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void i(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().i(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void j(@NotNull c f10, @NotNull Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().j(f10, outState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void k(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().k(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void l(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().l(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void m(@NotNull c f10, @NotNull View v5, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v5, "v");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().m(f10, v5, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void n(@NotNull c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        c cVarD0 = this.fragmentManager.D0();
        if (cVarD0 != null) {
            FragmentManager fragmentManagerM = cVarD0.M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM, "parent.getParentFragmentManager()");
            fragmentManagerM.C0().n(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }
}
