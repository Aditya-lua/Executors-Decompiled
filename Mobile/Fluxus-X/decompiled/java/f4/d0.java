package f4;

import android.os.Bundle;
import android.view.View;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\fJ\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fJ%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fJ\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\fJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006%"}, d2 = {"Lf4/d0;", BuildConfig.FLAVOR, "Lf4/k0;", "fragmentManager", "<init>", "(Lf4/k0;)V", "Lf4/q;", "f", BuildConfig.FLAVOR, "onlyRecursive", BuildConfig.FLAVOR, "g", "(Lf4/q;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Lf4/q;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Lf4/q;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Lf4/k0;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lf4/d0$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k0 fragmentManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<a> lifecycleCallbacks;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lf4/d0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "Z", "b", "()Z", "recursive", "Lf4/k0$l;", "callback", "Lf4/k0$l;", "()Lf4/k0$l;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean recursive;

        @NotNull
        public final k0.l a() {
            return null;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public d0(@NotNull k0 fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void a(@NotNull q f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().a(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void b(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.fragmentManager.A0().getContext();
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().b(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void c(@NotNull q f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().c(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void d(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().d(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void e(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().e(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void f(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().f(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void g(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.fragmentManager.A0().getContext();
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().g(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void h(@NotNull q f10, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().h(f10, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void i(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().i(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void j(@NotNull q f10, @NotNull Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().j(f10, outState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void k(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().k(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void l(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().l(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void m(@NotNull q f10, @NotNull View v8, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v8, "v");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().m(f10, v8, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }

    public final void n(@NotNull q f10, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f10, "f");
        q qVarD0 = this.fragmentManager.D0();
        if (qVarD0 != null) {
            k0 k0VarL = qVarD0.L();
            Intrinsics.checkNotNullExpressionValue(k0VarL, "parent.getParentFragmentManager()");
            k0VarL.C0().n(f10, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.a();
                throw null;
            }
        }
    }
}
