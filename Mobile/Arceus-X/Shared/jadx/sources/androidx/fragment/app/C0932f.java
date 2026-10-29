package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\fJ\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fJ%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fJ\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006%"}, m31665d2 = {"Landroidx/fragment/app/f;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/c;", "f", "", "onlyRecursive", "", "g", "(Landroidx/fragment/app/c;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/c;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/c;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/f$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C0932f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<a> lifecycleCallbacks;

    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m31665d2 = {"Landroidx/fragment/app/f$a;", "", "", "a", "Z", "b", "()Z", "recursive", "Landroidx/fragment/app/FragmentManager$l;", "callback", "Landroidx/fragment/app/FragmentManager$l;", "()Landroidx/fragment/app/FragmentManager$l;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean recursive;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FragmentManager.AbstractC0919l m4752a() {
            return null;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public C0932f(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m4738a(@NotNull ComponentCallbacksC0929c f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4738a(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4739b(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.fragmentManager.m4365A0().getContext();
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4739b(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4740c(@NotNull ComponentCallbacksC0929c f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4740c(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4741d(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4741d(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4742e(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4742e(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4743f(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4743f(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4744g(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.fragmentManager.m4365A0().getContext();
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4744g(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4745h(@NotNull ComponentCallbacksC0929c f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4745h(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4746i(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4746i(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4747j(@NotNull ComponentCallbacksC0929c f10, @NotNull Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4747j(f10, outState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4748k(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4748k(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4749l(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4749l(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4750m(@NotNull ComponentCallbacksC0929c f10, @NotNull View v5, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v5, "v");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4750m(f10, v5, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4751n(@NotNull ComponentCallbacksC0929c f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        ComponentCallbacksC0929c componentCallbacksC0929cM4372D0 = this.fragmentManager.m4372D0();
        if (componentCallbacksC0929cM4372D0 != null) {
            FragmentManager fragmentManagerM4617M = componentCallbacksC0929cM4372D0.m4617M();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "parent.getParentFragmentManager()");
            fragmentManagerM4617M.m4370C0().m4751n(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.m4752a();
                throw null;
            }
        }
    }
}
