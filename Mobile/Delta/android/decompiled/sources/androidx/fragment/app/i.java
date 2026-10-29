package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.BackEventCompat;
import e4.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0013\b \u0018\u0000 42\u00020\u0001:\u0004=A %B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0019J%\u0010%\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\r¢\u0006\u0004\b-\u0010\u0019J\u0019\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u0004\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00101J'\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u0019J\u001d\u0010<\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0002¢\u0006\u0004\b<\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010BR\u0016\u0010F\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010ER\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\u0016\u0010H\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010E¨\u0006I"}, d2 = {"Landroidx/fragment/app/i;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/g;", "fragmentStateManager", "Landroidx/fragment/app/i$d$a;", "s", "(Landroidx/fragment/app/g;)Landroidx/fragment/app/i$d$a;", "Landroidx/fragment/app/i$d$b;", "finalState", "", "j", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/g;)V", "m", "(Landroidx/fragment/app/g;)V", "k", "l", "", "isPop", "D", "(Z)V", "z", "()V", "y", "()Z", "r", "n", "Landroidx/fragment/app/i$d;", "operation", "c", "(Landroidx/fragment/app/i$d;)V", "q", "", "operations", "d", "(Ljava/util/List;Z)V", "e", "(Ljava/util/List;)V", "Le/b;", "backEvent", "A", "(Le/b;)V", "f", "Landroidx/fragment/app/c;", "fragment", "o", "(Landroidx/fragment/app/c;)Landroidx/fragment/app/i$d;", "p", "lifecycleImpact", "g", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/g;)V", "", "newPendingOperations", "x", "(Ljava/util/List;)Z", "w", "C", "B", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> pendingOperations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<d> runningOperations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean runningNonSeekableTransition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean operationDirectionIsPop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isContainerPostponed;

    /* JADX INFO: renamed from: androidx.fragment.app.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/i$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/i;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;", "Le4/p0;", "factory", "b", "(Landroid/view/ViewGroup;Le4/p0;)Landroidx/fragment/app/i;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            p0 p0VarF0 = fragmentManager.F0();
            Intrinsics.checkNotNullExpressionValue(p0VarF0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, p0VarF0);
        }

        @NotNull
        public final i b(@NotNull ViewGroup container, @NotNull p0 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            int i10 = d4.b.b;
            Object tag = container.getTag(i10);
            if (tag instanceof i) {
                return (i) tag;
            }
            i iVarA = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(iVarA, "factory.createController(container)");
            container.setTag(i10, iVarA);
            return iVarA;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/i$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "", "g", "(Landroid/view/ViewGroup;)V", "f", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", "d", "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean isSeekingSupported;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isStarted;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean isCancelled;

        public final void a(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isCancelled) {
                c(container);
            }
            this.isCancelled = true;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public void f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        public final void g(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isStarted) {
                f(container);
            }
            this.isStarted = true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/i$c;", "Landroidx/fragment/app/i$d;", "Landroidx/fragment/app/i$d$b;", "finalState", "Landroidx/fragment/app/i$d$a;", "lifecycleImpact", "Landroidx/fragment/app/g;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/g;)V", "", "p", "()V", "d", "l", "Landroidx/fragment/app/g;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull d.b finalState, @NotNull d.a lifecycleImpact, @NotNull g fragmentStateManager) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            androidx.fragment.app.c cVarK = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(cVarK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, cVarK);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.i.d
        public void d() {
            super.d();
            getFragment().f2612n = false;
            this.fragmentStateManager.m();
        }

        @Override // androidx.fragment.app.i.d
        public void p() {
            if (getIsStarted()) {
                return;
            }
            super.p();
            if (getLifecycleImpact() != d.a.ADDING) {
                if (getLifecycleImpact() == d.a.REMOVING) {
                    androidx.fragment.app.c cVarK = this.fragmentStateManager.k();
                    Intrinsics.checkNotNullExpressionValue(cVarK, "fragmentStateManager.fragment");
                    View viewJ1 = cVarK.J1();
                    Intrinsics.checkNotNullExpressionValue(viewJ1, "fragment.requireView()");
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewJ1.findFocus() + " on view " + viewJ1 + " for Fragment " + cVarK);
                    }
                    viewJ1.clearFocus();
                    return;
                }
                return;
            }
            androidx.fragment.app.c cVarK2 = this.fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(cVarK2, "fragmentStateManager.fragment");
            View viewFindFocus = cVarK2.K.findFocus();
            if (viewFindFocus != null) {
                cVarK2.R1(viewFindFocus);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + cVarK2);
                }
            }
            View viewJ2 = getFragment().J1();
            Intrinsics.checkNotNullExpressionValue(viewJ2, "this.fragment.requireView()");
            if (viewJ2.getParent() == null) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + cVarK2 + " view " + viewJ2 + " to container in onStart");
                }
                this.fragmentStateManager.b();
                viewJ2.setAlpha(0.0f);
            }
            if (viewJ2.getAlpha() == 0.0f && viewJ2.getVisibility() == 0) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Making view " + viewJ2 + " INVISIBLE in onStart");
                }
                viewJ2.setVisibility(4);
            }
            viewJ2.setAlpha(cVarK2.R());
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + cVarK2.R() + " in onStart");
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/i$d;", "", "Landroidx/fragment/app/i$d$b;", "finalState", "Landroidx/fragment/app/i$d$a;", "lifecycleImpact", "Landroidx/fragment/app/c;", "fragment", "<init>", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/c;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;)V", "Ljava/lang/Runnable;", "listener", "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/i$b;", "effect", "b", "(Landroidx/fragment/app/i$b;)V", "e", "p", "()V", "d", "Landroidx/fragment/app/i$d$b;", "g", "()Landroidx/fragment/app/i$d$b;", "setFinalState", "(Landroidx/fragment/app/i$d$b;)V", "Landroidx/fragment/app/i$d$a;", "i", "()Landroidx/fragment/app/i$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/i$d$a;)V", "Landroidx/fragment/app/c;", "h", "()Landroidx/fragment/app/c;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public b finalState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public a lifecycleImpact;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final androidx.fragment.app.c fragment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Runnable> completionListeners;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean isCanceled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean isComplete;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean isSeeking;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public boolean isStarted;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public boolean isAwaitingContainerChanges;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b> _effects;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b> effects;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/i$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/i$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "", "b", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "a", "c", "d", "e", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: androidx.fragment.app.i$d$b$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/i$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/i$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/i$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/i$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final b a(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                @NotNull
                public final b b(int visibility) {
                    if (visibility == 0) {
                        return b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return b.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }

                public Companion() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.i$d$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class C0042b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f2726a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f2726a = iArr;
                }
            }

            @NotNull
            public static final b c(int i10) {
                return INSTANCE.b(i10);
            }

            public final void b(@NotNull View view, @NotNull ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i10 = C0042b.f2726a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2727a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2727a = iArr;
            }
        }

        public d(@NotNull b finalState, @NotNull a lifecycleImpact, @NotNull androidx.fragment.app.c fragment) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void a(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void b(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this._effects.add(effect);
        }

        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                d();
                return;
            }
            Iterator it = CollectionsKt.M0(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                d();
            }
        }

        @NotNull
        public final List<b> f() {
            return this.effects;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final androidx.fragment.app.c getFragment() {
            return this.fragment;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final a getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        public final void o(@NotNull b finalState, @NotNull a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f2727a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = b.VISIBLE;
                    this.lifecycleImpact = a.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i10 == 3 && this.finalState != b.REMOVED) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        public void p() {
            this.isStarted = true;
        }

        public final void q(boolean z10) {
            this.isAwaitingContainerChanges = z10;
        }

        public final void r(boolean z10) {
            this.isSeeking = z10;
        }

        @NotNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2728a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2728a = iArr;
        }
    }

    public i(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    public static final void h(i this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            d.b finalState = operation.getFinalState();
            View view = operation.getFragment().K;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.b(view, this$0.container);
        }
    }

    public static final void i(i this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    @NotNull
    public static final i u(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return INSTANCE.a(viewGroup, fragmentManager);
    }

    @NotNull
    public static final i v(@NotNull ViewGroup viewGroup, @NotNull p0 p0Var) {
        return INSTANCE.b(viewGroup, p0Var);
    }

    public final void A(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            u.z(arrayList, ((d) it.next()).f());
        }
        List listM0 = CollectionsKt.M0(CollectionsKt.Q0(arrayList));
        int size = listM0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listM0.get(i10)).e(backEvent, this.container);
        }
    }

    public final void B(List<d> operations) {
        int size = operations.size();
        for (int i10 = 0; i10 < size; i10++) {
            operations.get(i10).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            u.z(arrayList, ((d) it.next()).f());
        }
        List listM0 = CollectionsKt.M0(CollectionsKt.Q0(arrayList));
        int size2 = listM0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listM0.get(i11)).g(this.container);
        }
    }

    public final void C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                View viewJ1 = dVar.getFragment().J1();
                Intrinsics.checkNotNullExpressionValue(viewJ1, "fragment.requireView()");
                dVar.o(d.b.INSTANCE.b(viewJ1.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    public final void c(@NotNull d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.getIsAwaitingContainerChanges()) {
            d.b finalState = operation.getFinalState();
            View viewJ1 = operation.getFragment().J1();
            Intrinsics.checkNotNullExpressionValue(viewJ1, "operation.fragment.requireView()");
            finalState.b(viewJ1, this.container);
            operation.q(false);
        }
    }

    public abstract void d(@NotNull List<d> operations, boolean isPop);

    public void e(@NotNull List<d> operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            u.z(arrayList, ((d) it.next()).f());
        }
        List listM0 = CollectionsKt.M0(CollectionsKt.Q0(arrayList));
        int size = listM0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listM0.get(i10)).d(this.container);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(operations.get(i11));
        }
        List listM1 = CollectionsKt.M0(operations);
        int size3 = listM1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listM1.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.runningOperations);
        e(this.runningOperations);
    }

    public final void g(d.b finalState, d.a lifecycleImpact, g fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                androidx.fragment.app.c cVarK = fragmentStateManager.k();
                Intrinsics.checkNotNullExpressionValue(cVarK, "fragmentStateManager.fragment");
                d dVarO = o(cVarK);
                if (dVarO == null) {
                    if (fragmentStateManager.k().f2612n || fragmentStateManager.k().f2611m) {
                        androidx.fragment.app.c cVarK2 = fragmentStateManager.k();
                        Intrinsics.checkNotNullExpressionValue(cVarK2, "fragmentStateManager.fragment");
                        dVarO = p(cVarK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.a(new Runnable() { // from class: e4.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.i.h(this.f15149a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: e4.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.i.i(this.f15151a, cVar);
                    }
                });
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(@NotNull d.b finalState, @NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> listO0 = CollectionsKt.O0(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = listO0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.pendingOperations.isEmpty() || !dVar.getFragment().f2612n) {
                        z10 = false;
                    }
                    dVar.r(z10);
                }
                for (d dVar2 : listO0) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    C();
                    List<d> listO1 = CollectionsKt.O0(this.pendingOperations);
                    if (listO1.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listO1);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listO1, this.operationDirectionIsPop);
                    boolean zW = w(listO1);
                    boolean zX = x(listO1);
                    if (!zX || zW) {
                        z10 = false;
                    }
                    this.runningNonSeekableTransition = z10;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listO1);
                        e(listO1);
                    } else if (zW) {
                        B(listO1);
                        int size = listO1.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c(listO1.get(i10));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d o(androidx.fragment.app.c fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final d p(androidx.fragment.app.c fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final void q() {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                C();
                B(this.pendingOperations);
                List<d> listO0 = CollectionsKt.O0(this.runningOperations);
                Iterator it = listO0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listO0) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.container);
                }
                List<d> listO1 = CollectionsKt.O0(this.pendingOperations);
                Iterator it2 = listO1.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listO1) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.container);
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.isContainerPostponed) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            n();
        }
    }

    @Nullable
    public final d.a s(@NotNull g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        androidx.fragment.app.c cVarK = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(cVarK, "fragmentStateManager.fragment");
        d dVarO = o(cVarK);
        d.a lifecycleImpact = dVarO != null ? dVarO.getLifecycleImpact() : null;
        d dVarP = p(cVarK);
        d.a lifecycleImpact2 = dVarP != null ? dVarP.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : e.f2728a[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean w(List<d> newPendingOperations) {
        boolean z10;
        List<d> list = newPendingOperations;
        Iterator<T> it = list.iterator();
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List<b> listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it2 = listF.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                        } while (((b) it2.next()).getIsSeekingSupported());
                    } else {
                        break;
                    }
                }
                z10 = false;
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                u.z(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().f2612n) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean y() {
        return !this.pendingOperations.isEmpty();
    }

    public final void z() {
        d dVarPrevious;
        synchronized (this.pendingOperations) {
            try {
                C();
                List<d> list = this.pendingOperations;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    d dVar = dVarPrevious;
                    d.b.Companion companion = d.b.INSTANCE;
                    View view = dVar.getFragment().K;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    d.b bVarA = companion.a(view);
                    d.b finalState = dVar.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                androidx.fragment.app.c fragment = dVar2 != null ? dVar2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.u0() : false;
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
