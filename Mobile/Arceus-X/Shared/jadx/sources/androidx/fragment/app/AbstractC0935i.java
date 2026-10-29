package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC0935i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067d4.C4435b;
import p088e.BackEventCompat;
import p093e4.InterfaceC4830p0;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0013\b \u0018\u0000 42\u00020\u0001:\u0004=A %B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0019J%\u0010%\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\r¢\u0006\u0004\b-\u0010\u0019J\u0019\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u0004\u0018\u00010\u001e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00101J'\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u0019J\u001d\u0010<\u001a\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0002¢\u0006\u0004\b<\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010BR\u0016\u0010F\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010ER\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\u0016\u0010H\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010E¨\u0006I"}, m31665d2 = {"Landroidx/fragment/app/i;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/g;", "fragmentStateManager", "Landroidx/fragment/app/i$d$a;", "s", "(Landroidx/fragment/app/g;)Landroidx/fragment/app/i$d$a;", "Landroidx/fragment/app/i$d$b;", "finalState", "", "j", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/g;)V", "m", "(Landroidx/fragment/app/g;)V", "k", "l", "", "isPop", "D", "(Z)V", "z", "()V", "y", "()Z", "r", "n", "Landroidx/fragment/app/i$d;", "operation", "c", "(Landroidx/fragment/app/i$d;)V", "q", "", "operations", "d", "(Ljava/util/List;Z)V", "e", "(Ljava/util/List;)V", "Le/b;", "backEvent", "A", "(Le/b;)V", "f", "Landroidx/fragment/app/c;", "fragment", "o", "(Landroidx/fragment/app/c;)Landroidx/fragment/app/i$d;", "p", "lifecycleImpact", "g", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/g;)V", "", "newPendingOperations", "x", "(Ljava/util/List;)Z", "w", "C", "B", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC0935i {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> pendingOperations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<d> runningOperations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean runningNonSeekableTransition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean operationDirectionIsPop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isContainerPostponed;

    /* JADX INFO: renamed from: androidx.fragment.app.i$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/fragment/app/i$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/i;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/i;", "Le4/p0;", "factory", "b", "(Landroid/view/ViewGroup;Le4/p0;)Landroidx/fragment/app/i;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.fragment.app.i.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC0935i m4816a(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            InterfaceC4830p0 interfaceC4830p0M4376F0 = fragmentManager.m4376F0();
            Intrinsics.checkNotNullExpressionValue(interfaceC4830p0M4376F0, "fragmentManager.specialEffectsControllerFactory");
            return m4817b(container, interfaceC4830p0M4376F0);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final AbstractC0935i m4817b(@NotNull ViewGroup container, @NotNull InterfaceC4830p0 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            int i10 = C4435b.f18438b;
            Object tag = container.getTag(i10);
            if (tag instanceof AbstractC0935i) {
                return (AbstractC0935i) tag;
            }
            AbstractC0935i abstractC0935iMo4484a = factory.mo4484a(container);
            Intrinsics.checkNotNullExpressionValue(abstractC0935iMo4484a, "factory.createController(container)");
            container.setTag(i10, abstractC0935iMo4484a);
            return abstractC0935iMo4484a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$b */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, m31665d2 = {"Landroidx/fragment/app/i$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "", "g", "(Landroid/view/ViewGroup;)V", "f", "Le/b;", "backEvent", "e", "(Le/b;Landroid/view/ViewGroup;)V", "d", "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean isSeekingSupported;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isStarted;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean isCancelled;

        /* JADX INFO: renamed from: a */
        public final void m4818a(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isCancelled) {
                mo4529c(container);
            }
            this.isCancelled = true;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        /* JADX INFO: renamed from: c */
        public void mo4529c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        /* JADX INFO: renamed from: d */
        public void mo4530d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        /* JADX INFO: renamed from: e */
        public void mo4536e(@NotNull BackEventCompat backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        /* JADX INFO: renamed from: f */
        public void mo4537f(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
        }

        /* JADX INFO: renamed from: g */
        public final void m4819g(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!this.isStarted) {
                mo4537f(container);
            }
            this.isStarted = true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$c */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Landroidx/fragment/app/i$c;", "Landroidx/fragment/app/i$d;", "Landroidx/fragment/app/i$d$b;", "finalState", "Landroidx/fragment/app/i$d$a;", "lifecycleImpact", "Landroidx/fragment/app/g;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/g;)V", "", "p", "()V", "d", "l", "Landroidx/fragment/app/g;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class c extends d {

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final C0933g fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull d.b finalState, @NotNull d.a lifecycleImpact, @NotNull C0933g fragmentStateManager) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            ComponentCallbacksC0929c componentCallbacksC0929cM4764k = fragmentStateManager.m4764k();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cM4764k, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, componentCallbacksC0929cM4764k);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.AbstractC0935i.d
        /* JADX INFO: renamed from: d */
        public void mo4820d() {
            super.mo4820d();
            getFragment().f3451n = false;
            this.fragmentStateManager.m4766m();
        }

        @Override // androidx.fragment.app.AbstractC0935i.d
        /* JADX INFO: renamed from: p */
        public void mo4821p() {
            if (getIsStarted()) {
                return;
            }
            super.mo4821p();
            if (getLifecycleImpact() != d.a.ADDING) {
                if (getLifecycleImpact() == d.a.REMOVING) {
                    ComponentCallbacksC0929c componentCallbacksC0929cM4764k = this.fragmentStateManager.m4764k();
                    Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cM4764k, "fragmentStateManager.fragment");
                    View viewM4611J1 = componentCallbacksC0929cM4764k.m4611J1();
                    Intrinsics.checkNotNullExpressionValue(viewM4611J1, "fragment.requireView()");
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewM4611J1.findFocus() + " on view " + viewM4611J1 + " for Fragment " + componentCallbacksC0929cM4764k);
                    }
                    viewM4611J1.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC0929c componentCallbacksC0929cM4764k2 = this.fragmentStateManager.m4764k();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cM4764k2, "fragmentStateManager.fragment");
            View viewFindFocus = componentCallbacksC0929cM4764k2.f3418K.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC0929cM4764k2.m4633R1(viewFindFocus);
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC0929cM4764k2);
                }
            }
            View viewM4611J2 = getFragment().m4611J1();
            Intrinsics.checkNotNullExpressionValue(viewM4611J2, "this.fragment.requireView()");
            if (viewM4611J2.getParent() == null) {
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + componentCallbacksC0929cM4764k2 + " view " + viewM4611J2 + " to container in onStart");
                }
                this.fragmentStateManager.m4755b();
                viewM4611J2.setAlpha(0.0f);
            }
            if (viewM4611J2.getAlpha() == 0.0f && viewM4611J2.getVisibility() == 0) {
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Making view " + viewM4611J2 + " INVISIBLE in onStart");
                }
                viewM4611J2.setVisibility(4);
            }
            viewM4611J2.setAlpha(componentCallbacksC0929cM4764k2.m4631R());
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + componentCallbacksC0929cM4764k2.m4631R() + " in onStart");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$d */
    @Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, m31665d2 = {"Landroidx/fragment/app/i$d;", "", "Landroidx/fragment/app/i$d$b;", "finalState", "Landroidx/fragment/app/i$d$a;", "lifecycleImpact", "Landroidx/fragment/app/c;", "fragment", "<init>", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;Landroidx/fragment/app/c;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/i$d$b;Landroidx/fragment/app/i$d$a;)V", "Ljava/lang/Runnable;", "listener", "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/i$b;", "effect", "b", "(Landroidx/fragment/app/i$b;)V", "e", "p", "()V", "d", "Landroidx/fragment/app/i$d$b;", "g", "()Landroidx/fragment/app/i$d$b;", "setFinalState", "(Landroidx/fragment/app/i$d$b;)V", "Landroidx/fragment/app/i$d$a;", "i", "()Landroidx/fragment/app/i$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/i$d$a;)V", "Landroidx/fragment/app/c;", "h", "()Landroidx/fragment/app/c;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public b finalState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public a lifecycleImpact;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ComponentCallbacksC0929c fragment;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<Runnable> completionListeners;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean isCanceled;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean isComplete;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean isSeeking;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public boolean isStarted;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean isAwaitingContainerChanges;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final List<b> _effects;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final List<b> effects;

        /* JADX INFO: renamed from: androidx.fragment.app.i$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Landroidx/fragment/app/i$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: renamed from: androidx.fragment.app.i$d$b */
        @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/fragment/app/i$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "", "b", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "a", "c", "d", "e", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: androidx.fragment.app.i$d$b$a, reason: from kotlin metadata */
            @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Landroidx/fragment/app/i$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/i$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/i$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/i$d$b;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
            public static final class Companion {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.fragment.app.i.d.b.a.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public final b m4842a(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : m4843b(view.getVisibility());
                }

                @NotNull
                /* JADX INFO: renamed from: b */
                public final b m4843b(int visibility) {
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

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Companion() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.i$d$b$b, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
            public /* synthetic */ class C14076b {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f3581a;

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
                    f3581a = iArr;
                }
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public static final b m4840c(int i10) {
                return INSTANCE.m4843b(i10);
            }

            /* JADX INFO: renamed from: b */
            public final void m4841b(@NotNull View view, @NotNull ViewGroup container) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(container, "container");
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i10 = C14076b.f3581a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.m4349N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.m4349N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.i$d$c */
        @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f3582a;

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
                f3582a = iArr;
            }
        }

        public d(@NotNull b finalState, @NotNull a lifecycleImpact, @NotNull ComponentCallbacksC0929c fragment) {
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

        /* JADX INFO: renamed from: a */
        public final void m4822a(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.completionListeners.add(listener);
        }

        /* JADX INFO: renamed from: b */
        public final void m4823b(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this._effects.add(effect);
        }

        /* JADX INFO: renamed from: c */
        public final void m4824c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                mo4820d();
                return;
            }
            Iterator it = CollectionsKt.m31687M0(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).m4818a(container);
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo4820d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m4825e(@NotNull b effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                mo4820d();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<b> m4826f() {
            return this.effects;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ComponentCallbacksC0929c getFragment() {
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

        /* JADX INFO: renamed from: o */
        public final void m4835o(@NotNull b finalState, @NotNull a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f3582a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (FragmentManager.m4349N0(2)) {
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
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i10 == 3 && this.finalState != b.REMOVED) {
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        /* JADX INFO: renamed from: p */
        public void mo4821p() {
            this.isStarted = true;
        }

        /* JADX INFO: renamed from: q */
        public final void m4836q(boolean z10) {
            this.isAwaitingContainerChanges = z10;
        }

        /* JADX INFO: renamed from: r */
        public final void m4837r(boolean z10) {
            this.isSeeking = z10;
        }

        @NotNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.i$e */
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3583a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3583a = iArr;
        }
    }

    public AbstractC0935i(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    public static final void m4789h(AbstractC0935i this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            d.b finalState = operation.getFinalState();
            View view = operation.getFragment().f3418K;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.m4841b(view, this$0.container);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m4790i(AbstractC0935i this$0, c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final AbstractC0935i m4791u(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return INSTANCE.m4816a(viewGroup, fragmentManager);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final AbstractC0935i m4792v(@NotNull ViewGroup viewGroup, @NotNull InterfaceC4830p0 interfaceC4830p0) {
        return INSTANCE.m4817b(viewGroup, interfaceC4830p0);
    }

    /* JADX INFO: renamed from: A */
    public final void m4793A(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C7708u.m31931z(arrayList, ((d) it.next()).m4826f());
        }
        List listM0 = CollectionsKt.m31687M0(CollectionsKt.m31691Q0(arrayList));
        int size = listM0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listM0.get(i10)).mo4536e(backEvent, this.container);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m4794B(List<d> operations) {
        int size = operations.size();
        for (int i10 = 0; i10 < size; i10++) {
            operations.get(i10).mo4821p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            C7708u.m31931z(arrayList, ((d) it.next()).m4826f());
        }
        List listM0 = CollectionsKt.m31687M0(CollectionsKt.m31691Q0(arrayList));
        int size2 = listM0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listM0.get(i11)).m4819g(this.container);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4795C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                View viewM4611J1 = dVar.getFragment().m4611J1();
                Intrinsics.checkNotNullExpressionValue(viewM4611J1, "fragment.requireView()");
                dVar.m4835o(d.b.INSTANCE.m4843b(viewM4611J1.getVisibility()), d.a.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4796D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    /* JADX INFO: renamed from: c */
    public final void m4797c(@NotNull d operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (operation.getIsAwaitingContainerChanges()) {
            d.b finalState = operation.getFinalState();
            View viewM4611J1 = operation.getFragment().m4611J1();
            Intrinsics.checkNotNullExpressionValue(viewM4611J1, "operation.fragment.requireView()");
            finalState.m4841b(viewM4611J1, this.container);
            operation.m4836q(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4528d(@NotNull List<d> operations, boolean isPop);

    /* JADX INFO: renamed from: e */
    public void m4798e(@NotNull List<d> operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            C7708u.m31931z(arrayList, ((d) it.next()).m4826f());
        }
        List listM0 = CollectionsKt.m31687M0(CollectionsKt.m31691Q0(arrayList));
        int size = listM0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listM0.get(i10)).mo4530d(this.container);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            m4797c(operations.get(i11));
        }
        List listM1 = CollectionsKt.m31687M0(operations);
        int size3 = listM1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listM1.get(i12);
            if (dVar.m4826f().isEmpty()) {
                dVar.mo4820d();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4799f() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        m4794B(this.runningOperations);
        m4798e(this.runningOperations);
    }

    /* JADX INFO: renamed from: g */
    public final void m4800g(d.b finalState, d.a lifecycleImpact, C0933g fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = fragmentStateManager.m4764k();
                Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cM4764k, "fragmentStateManager.fragment");
                d dVarM4806o = m4806o(componentCallbacksC0929cM4764k);
                if (dVarM4806o == null) {
                    if (fragmentStateManager.m4764k().f3451n || fragmentStateManager.m4764k().f3450m) {
                        ComponentCallbacksC0929c componentCallbacksC0929cM4764k2 = fragmentStateManager.m4764k();
                        Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cM4764k2, "fragmentStateManager.fragment");
                        dVarM4806o = m4807p(componentCallbacksC0929cM4764k2);
                    } else {
                        dVarM4806o = null;
                    }
                }
                if (dVarM4806o != null) {
                    dVarM4806o.m4835o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.m4822a(new Runnable() { // from class: e4.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0935i.m4789h(this.f19496a, cVar);
                    }
                });
                cVar.m4822a(new Runnable() { // from class: e4.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0935i.m4790i(this.f19499a, cVar);
                    }
                });
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4801j(@NotNull d.b finalState, @NotNull C0933g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.m4764k());
        }
        m4800g(finalState, d.a.ADDING, fragmentStateManager);
    }

    /* JADX INFO: renamed from: k */
    public final void m4802k(@NotNull C0933g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.m4764k());
        }
        m4800g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    /* JADX INFO: renamed from: l */
    public final void m4803l(@NotNull C0933g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.m4764k());
        }
        m4800g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    /* JADX INFO: renamed from: m */
    public final void m4804m(@NotNull C0933g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.m4764k());
        }
        m4800g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    /* JADX INFO: renamed from: n */
    public final void m4805n() {
        boolean z10;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            m4808q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> listO0 = CollectionsKt.m31689O0(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = listO0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.pendingOperations.isEmpty() || !dVar.getFragment().f3451n) {
                        z10 = false;
                    }
                    dVar.m4837r(z10);
                }
                for (d dVar2 : listO0) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.m4349N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.mo4820d();
                    } else {
                        if (FragmentManager.m4349N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.m4824c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    m4795C();
                    List<d> listO1 = CollectionsKt.m31689O0(this.pendingOperations);
                    if (listO1.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listO1);
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    mo4528d(listO1, this.operationDirectionIsPop);
                    boolean zM4812w = m4812w(listO1);
                    boolean zM4813x = m4813x(listO1);
                    if (!zM4813x || zM4812w) {
                        z10 = false;
                    }
                    this.runningNonSeekableTransition = z10;
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zM4812w + " \ntransition = " + zM4813x);
                    }
                    if (!zM4813x) {
                        m4794B(listO1);
                        m4798e(listO1);
                    } else if (zM4812w) {
                        m4794B(listO1);
                        int size = listO1.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            m4797c(listO1.get(i10));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final d m4806o(ComponentCallbacksC0929c fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.m31980c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    /* JADX INFO: renamed from: p */
    public final d m4807p(ComponentCallbacksC0929c fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (Intrinsics.m31980c(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    /* JADX INFO: renamed from: q */
    public final void m4808q() {
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                m4795C();
                m4794B(this.pendingOperations);
                List<d> listO0 = CollectionsKt.m31689O0(this.runningOperations);
                Iterator it = listO0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).m4837r(false);
                }
                for (d dVar : listO0) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.m4824c(this.container);
                }
                List<d> listO1 = CollectionsKt.m31689O0(this.pendingOperations);
                Iterator it2 = listO1.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).m4837r(false);
                }
                for (d dVar2 : listO1) {
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.m4824c(this.container);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4809r() {
        if (this.isContainerPostponed) {
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            m4805n();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final d.a m4810s(@NotNull C0933g fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        ComponentCallbacksC0929c componentCallbacksC0929cM4764k = fragmentStateManager.m4764k();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cM4764k, "fragmentStateManager.fragment");
        d dVarM4806o = m4806o(componentCallbacksC0929cM4764k);
        d.a lifecycleImpact = dVarM4806o != null ? dVarM4806o.getLifecycleImpact() : null;
        d dVarM4807p = m4807p(componentCallbacksC0929cM4764k);
        d.a lifecycleImpact2 = dVarM4807p != null ? dVarM4807p.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : e.f3583a[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4812w(List<d> newPendingOperations) {
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
                if (!dVar.m4826f().isEmpty()) {
                    List<b> listM4826f = dVar.m4826f();
                    if (!(listM4826f instanceof Collection) || !listM4826f.isEmpty()) {
                        Iterator<T> it2 = listM4826f.iterator();
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
                C7708u.m31931z(arrayList, ((d) it3.next()).m4826f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4813x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().f3451n) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4814y() {
        return !this.pendingOperations.isEmpty();
    }

    /* JADX INFO: renamed from: z */
    public final void m4815z() {
        d dVarPrevious;
        synchronized (this.pendingOperations) {
            try {
                m4795C();
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
                    View view = dVar.getFragment().f3418K;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    d.b bVarM4842a = companion.m4842a(view);
                    d.b finalState = dVar.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && bVarM4842a != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                ComponentCallbacksC0929c fragment = dVar2 != null ? dVar2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.m4707u0() : false;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
