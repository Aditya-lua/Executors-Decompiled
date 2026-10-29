package hp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lhp/n0;", "", "Lwp/c;", "sandboxFlags", "<init>", "(Lwp/c;)V", "Lhp/s0;", "rendering", "Lbp/c;", "binding", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "h", "(Lhp/s0;Lbp/c;Landroidx/fragment/app/FragmentManager;)V", "i", "(Lbp/c;)V", "Landroid/content/Context;", "context", "m", "(Landroid/content/Context;)V", "", "containerViewId", "Lhp/z0;", "g", "(Lhp/s0;Landroidx/fragment/app/FragmentManager;I)Lhp/z0;", "a", "Lwp/c;", "Landroid/app/Dialog;", "b", "Landroid/app/Dialog;", "optionsDialog", "c", "Lhp/z0;", "currentStepRendering", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wp.c sandboxFlags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public z0 currentStepRendering;

    public n0(@NotNull wp.c sandboxFlags) {
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        this.sandboxFlags = sandboxFlags;
    }

    public static final void j(n0 n0Var, bp.c cVar, View view) {
        n0Var.sandboxFlags.g();
        Toast.makeText(cVar.b.getRootView().getContext(), "Setting the debug flag to: " + wp.c.INSTANCE.a(n0Var.sandboxFlags.getDebugForcedStatus()), 0).show();
    }

    public static final boolean k(n0 n0Var, Context context, View view) {
        Intrinsics.checkNotNull(context);
        n0Var.m(context);
        return true;
    }

    public static final Unit l(bp.c cVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = cVar.b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) (((double) insetsIgnoringVisibility.bottom) + jq.j.c(16.0d));
        floatingActionButton.setLayoutParams(marginLayoutParams);
        return Unit.f22483a;
    }

    public static final void n(Dialog dialog, View view) {
        dialog.dismiss();
    }

    public static final void o(n0 n0Var, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        n0Var.sandboxFlags.f(z10);
    }

    public static final void p(n0 n0Var, DialogInterface dialogInterface) {
        n0Var.optionsDialog = null;
    }

    public final z0 g(s0 rendering, FragmentManager fragmentManager, int containerViewId) {
        if (rendering instanceof e1) {
            e1 e1Var = (e1) rendering;
            String key = e1Var.getKey();
            boolean didGoBack = e1Var.getDidGoBack();
            androidx.fragment.app.c cVarM0 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c cVarA = ((cVarM0 instanceof jp.b) && Intrinsics.c(cVarM0.h0(), key)) ? cVarM0 : jp.b.INSTANCE.a();
            if (didGoBack) {
                if (cVarM0 != null) {
                    o5.p pVar = new o5.p(8388613);
                    pVar.x0(null);
                    pVar.y0(30L);
                    pVar.v0(new DecelerateInterpolator());
                    cVarM0.Q1(pVar);
                }
                o5.p pVar2 = new o5.p(8388611);
                pVar2.x0(null);
                pVar2.v0(new DecelerateInterpolator());
                cVarA.P1(pVar2);
            } else {
                if (cVarM0 != null) {
                    o5.p pVar3 = new o5.p(8388611);
                    pVar3.x0(null);
                    pVar3.y0(30L);
                    pVar3.v0(new DecelerateInterpolator());
                    cVarM0.Q1(pVar3);
                }
                o5.p pVar4 = new o5.p(8388613);
                pVar4.x0(null);
                pVar4.v0(new DecelerateInterpolator());
                cVarA.P1(pVar4);
            }
            androidx.fragment.app.h hVarR = fragmentManager.r();
            hVarR.o(containerViewId, cVarA, key);
            hVarR.j();
            jp.b bVar = (jp.b) cVarA;
            bVar.k2(e1Var);
            if (e1Var instanceof d) {
                return new e(((d) rendering).getKey(), bVar);
            }
            if (e1Var instanceof h) {
                return new i(((h) rendering).getKey(), bVar);
            }
            if (e1Var instanceof q0) {
                return new r0(((q0) rendering).getKey(), bVar);
            }
            if (e1Var instanceof x0) {
                return new y0(((x0) rendering).getKey(), bVar);
            }
            if (e1Var instanceof c1) {
                return new d1(((c1) rendering).getKey(), bVar);
            }
            throw new jt.l();
        }
        if (rendering instanceof u0) {
            fp.f fVarA = fp.f.INSTANCE.a();
            androidx.fragment.app.h hVarR2 = fragmentManager.r();
            hVarR2.n(containerViewId, fVarA);
            hVarR2.h();
            return new t0(((u0) rendering).getKey(), fVarA);
        }
        if (rendering instanceof a1) {
            a1 a1Var = (a1) rendering;
            String key2 = a1Var.getKey();
            boolean didGoBack2 = a1Var.getDidGoBack();
            androidx.fragment.app.c cVarM1 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c cVarA2 = ((cVarM1 instanceof UiStepFragment) && Intrinsics.c(cVarM1.h0(), key2)) ? cVarM1 : UiStepFragment.INSTANCE.a(a1Var.getProps());
            if (didGoBack2) {
                if (cVarM1 != null) {
                    o5.p pVar5 = new o5.p(8388613);
                    pVar5.x0(null);
                    pVar5.y0(30L);
                    pVar5.v0(new DecelerateInterpolator());
                    cVarM1.Q1(pVar5);
                }
                o5.p pVar6 = new o5.p(8388611);
                pVar6.x0(null);
                pVar6.v0(new DecelerateInterpolator());
                cVarA2.P1(pVar6);
            } else {
                if (cVarM1 != null) {
                    o5.p pVar7 = new o5.p(8388611);
                    pVar7.x0(null);
                    pVar7.y0(30L);
                    pVar7.v0(new DecelerateInterpolator());
                    cVarM1.Q1(pVar7);
                }
                o5.p pVar8 = new o5.p(8388613);
                pVar8.x0(null);
                pVar8.v0(new DecelerateInterpolator());
                cVarA2.P1(pVar8);
            }
            androidx.fragment.app.h hVarR3 = fragmentManager.r();
            hVarR3.o(containerViewId, cVarA2, key2);
            hVarR3.j();
            return new b1(a1Var.getKey(), (UiStepFragment) cVarA2);
        }
        if (rendering instanceof o0) {
            o0 o0Var = (o0) rendering;
            String key3 = o0Var.getKey();
            boolean didGoBack3 = o0Var.getDidGoBack();
            androidx.fragment.app.c cVarM2 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c cVarA3 = ((cVarM2 instanceof IntegrationStepFragment) && Intrinsics.c(cVarM2.h0(), key3)) ? cVarM2 : IntegrationStepFragment.INSTANCE.a(o0Var.getProps());
            if (didGoBack3) {
                if (cVarM2 != null) {
                    o5.p pVar9 = new o5.p(8388613);
                    pVar9.x0(null);
                    pVar9.y0(30L);
                    pVar9.v0(new DecelerateInterpolator());
                    cVarM2.Q1(pVar9);
                }
                o5.p pVar10 = new o5.p(8388611);
                pVar10.x0(null);
                pVar10.v0(new DecelerateInterpolator());
                cVarA3.P1(pVar10);
            } else {
                if (cVarM2 != null) {
                    o5.p pVar11 = new o5.p(8388611);
                    pVar11.x0(null);
                    pVar11.y0(30L);
                    pVar11.v0(new DecelerateInterpolator());
                    cVarM2.Q1(pVar11);
                }
                o5.p pVar12 = new o5.p(8388613);
                pVar12.x0(null);
                pVar12.v0(new DecelerateInterpolator());
                cVarA3.P1(pVar12);
            }
            androidx.fragment.app.h hVarR4 = fragmentManager.r();
            hVarR4.o(containerViewId, cVarA3, key3);
            hVarR4.j();
            return new p0(o0Var.getKey(), (IntegrationStepFragment) cVarA3);
        }
        if (rendering instanceof f) {
            f fVar = (f) rendering;
            String key4 = fVar.getKey();
            boolean didGoBack4 = fVar.getDidGoBack();
            androidx.fragment.app.c cVarM3 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c cVarA4 = ((cVarM3 instanceof GovernmentIdStepFragment) && Intrinsics.c(cVarM3.h0(), key4)) ? cVarM3 : GovernmentIdStepFragment.INSTANCE.a(fVar.getProps());
            if (didGoBack4) {
                if (cVarM3 != null) {
                    o5.p pVar13 = new o5.p(8388613);
                    pVar13.x0(null);
                    pVar13.y0(30L);
                    pVar13.v0(new DecelerateInterpolator());
                    cVarM3.Q1(pVar13);
                }
                o5.p pVar14 = new o5.p(8388611);
                pVar14.x0(null);
                pVar14.v0(new DecelerateInterpolator());
                cVarA4.P1(pVar14);
            } else {
                if (cVarM3 != null) {
                    o5.p pVar15 = new o5.p(8388611);
                    pVar15.x0(null);
                    pVar15.y0(30L);
                    pVar15.v0(new DecelerateInterpolator());
                    cVarM3.Q1(pVar15);
                }
                o5.p pVar16 = new o5.p(8388613);
                pVar16.x0(null);
                pVar16.v0(new DecelerateInterpolator());
                cVarA4.P1(pVar16);
            }
            androidx.fragment.app.h hVarR5 = fragmentManager.r();
            hVarR5.o(containerViewId, cVarA4, key4);
            hVarR5.j();
            return new g(fVar.getKey(), (GovernmentIdStepFragment) cVarA4);
        }
        if (rendering instanceof v0) {
            v0 v0Var = (v0) rendering;
            String key5 = v0Var.getKey();
            boolean didGoBack5 = v0Var.getDidGoBack();
            androidx.fragment.app.c cVarM4 = fragmentManager.m0(containerViewId);
            androidx.fragment.app.c cVarA5 = ((cVarM4 instanceof SelfieStepFragment) && Intrinsics.c(cVarM4.h0(), key5)) ? cVarM4 : SelfieStepFragment.INSTANCE.a(v0Var.getProps());
            if (didGoBack5) {
                if (cVarM4 != null) {
                    o5.p pVar17 = new o5.p(8388613);
                    pVar17.x0(null);
                    pVar17.y0(30L);
                    pVar17.v0(new DecelerateInterpolator());
                    cVarM4.Q1(pVar17);
                }
                o5.p pVar18 = new o5.p(8388611);
                pVar18.x0(null);
                pVar18.v0(new DecelerateInterpolator());
                cVarA5.P1(pVar18);
            } else {
                if (cVarM4 != null) {
                    o5.p pVar19 = new o5.p(8388611);
                    pVar19.x0(null);
                    pVar19.y0(30L);
                    pVar19.v0(new DecelerateInterpolator());
                    cVarM4.Q1(pVar19);
                }
                o5.p pVar20 = new o5.p(8388613);
                pVar20.x0(null);
                pVar20.v0(new DecelerateInterpolator());
                cVarA5.P1(pVar20);
            }
            androidx.fragment.app.h hVarR6 = fragmentManager.r();
            hVarR6.o(containerViewId, cVarA5, key5);
            hVarR6.j();
            return new w0(v0Var.getKey(), (SelfieStepFragment) cVarA5);
        }
        if (!(rendering instanceof b)) {
            if ((rendering instanceof a) || rendering == null) {
                return null;
            }
            throw new jt.l();
        }
        b bVar2 = (b) rendering;
        String key6 = bVar2.getKey();
        boolean didGoBack6 = bVar2.getDidGoBack();
        androidx.fragment.app.c cVarM5 = fragmentManager.m0(containerViewId);
        androidx.fragment.app.c cVarA6 = ((cVarM5 instanceof DocumentStepFragment) && Intrinsics.c(cVarM5.h0(), key6)) ? cVarM5 : DocumentStepFragment.INSTANCE.a(bVar2.getProps());
        if (didGoBack6) {
            if (cVarM5 != null) {
                o5.p pVar21 = new o5.p(8388613);
                pVar21.x0(null);
                pVar21.y0(30L);
                pVar21.v0(new DecelerateInterpolator());
                cVarM5.Q1(pVar21);
            }
            o5.p pVar22 = new o5.p(8388611);
            pVar22.x0(null);
            pVar22.v0(new DecelerateInterpolator());
            cVarA6.P1(pVar22);
        } else {
            if (cVarM5 != null) {
                o5.p pVar23 = new o5.p(8388611);
                pVar23.x0(null);
                pVar23.y0(30L);
                pVar23.v0(new DecelerateInterpolator());
                cVarM5.Q1(pVar23);
            }
            o5.p pVar24 = new o5.p(8388613);
            pVar24.x0(null);
            pVar24.v0(new DecelerateInterpolator());
            cVarA6.P1(pVar24);
        }
        androidx.fragment.app.h hVarR7 = fragmentManager.r();
        hVarR7.o(containerViewId, cVarA6, key6);
        hVarR7.j();
        return new c(bVar2.getKey(), (DocumentStepFragment) cVarA6);
    }

    public final void h(@Nullable s0 rendering, @NotNull bp.c binding, @NotNull FragmentManager fragmentManager) {
        z0 z0VarG;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (rendering == null) {
            return;
        }
        if (this.sandboxFlags.getIsSandboxModeEnabled()) {
            i(binding);
        } else {
            binding.b.setVisibility(8);
        }
        z0 z0Var = this.currentStepRendering;
        if (Intrinsics.c(z0Var != null ? z0Var.getName() : null, rendering.getKey())) {
            z0VarG = this.currentStepRendering;
        } else {
            z0VarG = g(rendering, fragmentManager, binding.f4299c.getId());
            this.currentStepRendering = z0VarG;
        }
        if (rendering instanceof c1) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowRendering");
            ((d1) z0VarG).getFragment().m2((e1) rendering);
            return;
        }
        if (rendering instanceof a1) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepRendering");
            a1 a1Var = (a1) rendering;
            ((b1) z0VarG).getFragment().q2(a1Var.getProps(), a1Var.getHandler());
            return;
        }
        if (rendering instanceof u0) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.LoadingRendering");
            ((t0) z0VarG).getFragment().s2((u0) rendering);
            return;
        }
        if (rendering instanceof a) {
            return;
        }
        if (rendering instanceof d) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentWorkflowRendering");
            ((e) z0VarG).getFragment().m2((e1) rendering);
            return;
        }
        if (rendering instanceof b) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentStepRendering");
            b bVar = (b) rendering;
            ((c) z0VarG).getFragment().w2(bVar.getProps(), bVar.getHandler());
            return;
        }
        if (rendering instanceof h) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdWorkflowRendering");
            ((i) z0VarG).getFragment().m2((e1) rendering);
            return;
        }
        if (rendering instanceof f) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepRendering");
            f fVar = (f) rendering;
            ((g) z0VarG).getFragment().R2(fVar.getProps(), fVar.getHandler());
            return;
        }
        if (rendering instanceof o0) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationStepRendering");
            o0 o0Var = (o0) rendering;
            ((p0) z0VarG).getFragment().r2(o0Var.getProps(), o0Var.getHandler());
        } else if (rendering instanceof q0) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationWorkflowRendering");
            ((r0) z0VarG).getFragment().m2((e1) rendering);
        } else if (rendering instanceof x0) {
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieWorkflowRendering");
            ((y0) z0VarG).getFragment().m2((e1) rendering);
        } else {
            if (!(rendering instanceof v0)) {
                throw new jt.l();
            }
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieStepRendering");
            v0 v0Var = (v0) rendering;
            ((w0) z0VarG).getFragment().J2(v0Var.getProps(), v0Var.getHandler());
        }
    }

    public final void i(final bp.c binding) {
        final Context context = binding.getRoot().getContext();
        binding.b.setVisibility(0);
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: hp.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.j(this.f19674a, binding, view);
            }
        });
        binding.b.setOnLongClickListener(new View.OnLongClickListener() { // from class: hp.i0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return n0.k(this.f19676a, context, view);
            }
        });
        FloatingActionButton floatingActionButton = binding.b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        wq.g.g(floatingActionButton, new Function1() { // from class: hp.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n0.l(binding, (WindowInsetsCompat) obj);
            }
        });
    }

    public final void m(Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, hc.j.f18933d);
        xp.a aVarC = xp.a.c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        dialog.setContentView(aVarC.getRoot());
        aVarC.f35279c.setTitle("Sandbox options");
        aVarC.f35279c.setNavigationIcon(jq.s.f21652u);
        aVarC.f35279c.setNavigationOnClickListener(new View.OnClickListener() { // from class: hp.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.n(dialog, view);
            }
        });
        aVarC.b.setChecked(this.sandboxFlags.b());
        aVarC.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hp.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                n0.o(this.f19682a, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hp.m0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                n0.p(this.f19684a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }
}
