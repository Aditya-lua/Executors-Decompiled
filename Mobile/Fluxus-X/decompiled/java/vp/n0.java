package vp;

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
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lvp/n0;", BuildConfig.FLAVOR, "Lkq/c;", "sandboxFlags", "<init>", "(Lkq/c;)V", "Lvp/s0;", "rendering", "Lpp/c;", "binding", "Lf4/k0;", "fragmentManager", BuildConfig.FLAVOR, "h", "(Lvp/s0;Lpp/c;Lf4/k0;)V", "i", "(Lpp/c;)V", "Landroid/content/Context;", "context", "m", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "containerViewId", "Lvp/z0;", "g", "(Lvp/s0;Lf4/k0;I)Lvp/z0;", "a", "Lkq/c;", "Landroid/app/Dialog;", "b", "Landroid/app/Dialog;", "optionsDialog", "c", "Lvp/z0;", "currentStepRendering", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c sandboxFlags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public z0 currentStepRendering;

    public n0(@NotNull kq.c sandboxFlags) {
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        this.sandboxFlags = sandboxFlags;
    }

    public static final void j(n0 n0Var, pp.c cVar, View view) {
        n0Var.sandboxFlags.g();
        Toast.makeText(cVar.b.getRootView().getContext(), "Setting the debug flag to: " + kq.c.INSTANCE.a(n0Var.sandboxFlags.getDebugForcedStatus()), 0).show();
    }

    public static final boolean k(n0 n0Var, Context context, View view) {
        Intrinsics.checkNotNull(context);
        n0Var.m(context);
        return true;
    }

    public static final Unit l(pp.c cVar, WindowInsetsCompat insets) {
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
        marginLayoutParams.bottomMargin = (int) (((double) insetsIgnoringVisibility.bottom) + xq.j.c(16.0d));
        floatingActionButton.setLayoutParams(marginLayoutParams);
        return Unit.f21506a;
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

    public final z0 g(s0 rendering, f4.k0 fragmentManager, int containerViewId) {
        if (rendering instanceof e1) {
            e1 e1Var = (e1) rendering;
            String key = e1Var.getKey();
            boolean didGoBack = e1Var.getDidGoBack();
            f4.q qVarM0 = fragmentManager.m0(containerViewId);
            f4.q qVarA = ((qVarM0 instanceof xp.b) && Intrinsics.c(qVarM0.h0(), key)) ? qVarM0 : xp.b.INSTANCE.a();
            if (didGoBack) {
                if (qVarM0 != null) {
                    p5.p pVar = new p5.p(8388613);
                    pVar.B0(null);
                    pVar.C0(30L);
                    pVar.z0(new DecelerateInterpolator());
                    qVarM0.Q1(pVar);
                }
                p5.p pVar2 = new p5.p(8388611);
                pVar2.B0(null);
                pVar2.z0(new DecelerateInterpolator());
                qVarA.P1(pVar2);
            } else {
                if (qVarM0 != null) {
                    p5.p pVar3 = new p5.p(8388611);
                    pVar3.B0(null);
                    pVar3.C0(30L);
                    pVar3.z0(new DecelerateInterpolator());
                    qVarM0.Q1(pVar3);
                }
                p5.p pVar4 = new p5.p(8388613);
                pVar4.B0(null);
                pVar4.z0(new DecelerateInterpolator());
                qVarA.P1(pVar4);
            }
            f4.t0 t0VarR = fragmentManager.r();
            t0VarR.o(containerViewId, qVarA, key);
            t0VarR.j();
            xp.b bVar = (xp.b) qVarA;
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
            throw new zt.l();
        }
        if (rendering instanceof u0) {
            tp.f fVarA = tp.f.INSTANCE.a();
            f4.t0 t0VarR2 = fragmentManager.r();
            t0VarR2.n(containerViewId, fVarA);
            t0VarR2.h();
            return new t0(((u0) rendering).getKey(), fVarA);
        }
        if (rendering instanceof a1) {
            a1 a1Var = (a1) rendering;
            String key2 = a1Var.getKey();
            boolean didGoBack2 = a1Var.getDidGoBack();
            f4.q qVarM1 = fragmentManager.m0(containerViewId);
            f4.q qVarA2 = ((qVarM1 instanceof is.c) && Intrinsics.c(qVarM1.h0(), key2)) ? qVarM1 : is.c.INSTANCE.a(a1Var.getProps());
            if (didGoBack2) {
                if (qVarM1 != null) {
                    p5.p pVar5 = new p5.p(8388613);
                    pVar5.B0(null);
                    pVar5.C0(30L);
                    pVar5.z0(new DecelerateInterpolator());
                    qVarM1.Q1(pVar5);
                }
                p5.p pVar6 = new p5.p(8388611);
                pVar6.B0(null);
                pVar6.z0(new DecelerateInterpolator());
                qVarA2.P1(pVar6);
            } else {
                if (qVarM1 != null) {
                    p5.p pVar7 = new p5.p(8388611);
                    pVar7.B0(null);
                    pVar7.C0(30L);
                    pVar7.z0(new DecelerateInterpolator());
                    qVarM1.Q1(pVar7);
                }
                p5.p pVar8 = new p5.p(8388613);
                pVar8.B0(null);
                pVar8.z0(new DecelerateInterpolator());
                qVarA2.P1(pVar8);
            }
            f4.t0 t0VarR3 = fragmentManager.r();
            t0VarR3.o(containerViewId, qVarA2, key2);
            t0VarR3.j();
            return new b1(a1Var.getKey(), (is.c) qVarA2);
        }
        if (rendering instanceof o0) {
            o0 o0Var = (o0) rendering;
            String key3 = o0Var.getKey();
            boolean didGoBack3 = o0Var.getDidGoBack();
            f4.q qVarM2 = fragmentManager.m0(containerViewId);
            f4.q qVarA3 = ((qVarM2 instanceof mp.c) && Intrinsics.c(qVarM2.h0(), key3)) ? qVarM2 : mp.c.INSTANCE.a(o0Var.getProps());
            if (didGoBack3) {
                if (qVarM2 != null) {
                    p5.p pVar9 = new p5.p(8388613);
                    pVar9.B0(null);
                    pVar9.C0(30L);
                    pVar9.z0(new DecelerateInterpolator());
                    qVarM2.Q1(pVar9);
                }
                p5.p pVar10 = new p5.p(8388611);
                pVar10.B0(null);
                pVar10.z0(new DecelerateInterpolator());
                qVarA3.P1(pVar10);
            } else {
                if (qVarM2 != null) {
                    p5.p pVar11 = new p5.p(8388611);
                    pVar11.B0(null);
                    pVar11.C0(30L);
                    pVar11.z0(new DecelerateInterpolator());
                    qVarM2.Q1(pVar11);
                }
                p5.p pVar12 = new p5.p(8388613);
                pVar12.B0(null);
                pVar12.z0(new DecelerateInterpolator());
                qVarA3.P1(pVar12);
            }
            f4.t0 t0VarR4 = fragmentManager.r();
            t0VarR4.o(containerViewId, qVarA3, key3);
            t0VarR4.j();
            return new p0(o0Var.getKey(), (mp.c) qVarA3);
        }
        if (rendering instanceof f) {
            f fVar = (f) rendering;
            String key4 = fVar.getKey();
            boolean didGoBack4 = fVar.getDidGoBack();
            f4.q qVarM3 = fragmentManager.m0(containerViewId);
            f4.q qVarA4 = ((qVarM3 instanceof ep.m) && Intrinsics.c(qVarM3.h0(), key4)) ? qVarM3 : ep.m.INSTANCE.a(fVar.getProps());
            if (didGoBack4) {
                if (qVarM3 != null) {
                    p5.p pVar13 = new p5.p(8388613);
                    pVar13.B0(null);
                    pVar13.C0(30L);
                    pVar13.z0(new DecelerateInterpolator());
                    qVarM3.Q1(pVar13);
                }
                p5.p pVar14 = new p5.p(8388611);
                pVar14.B0(null);
                pVar14.z0(new DecelerateInterpolator());
                qVarA4.P1(pVar14);
            } else {
                if (qVarM3 != null) {
                    p5.p pVar15 = new p5.p(8388611);
                    pVar15.B0(null);
                    pVar15.C0(30L);
                    pVar15.z0(new DecelerateInterpolator());
                    qVarM3.Q1(pVar15);
                }
                p5.p pVar16 = new p5.p(8388613);
                pVar16.B0(null);
                pVar16.z0(new DecelerateInterpolator());
                qVarA4.P1(pVar16);
            }
            f4.t0 t0VarR5 = fragmentManager.r();
            t0VarR5.o(containerViewId, qVarA4, key4);
            t0VarR5.j();
            return new g(fVar.getKey(), (ep.m) qVarA4);
        }
        if (rendering instanceof v0) {
            v0 v0Var = (v0) rendering;
            String key5 = v0Var.getKey();
            boolean didGoBack5 = v0Var.getDidGoBack();
            f4.q qVarM4 = fragmentManager.m0(containerViewId);
            f4.q qVarA5 = ((qVarM4 instanceof sq.h) && Intrinsics.c(qVarM4.h0(), key5)) ? qVarM4 : sq.h.INSTANCE.a(v0Var.getProps());
            if (didGoBack5) {
                if (qVarM4 != null) {
                    p5.p pVar17 = new p5.p(8388613);
                    pVar17.B0(null);
                    pVar17.C0(30L);
                    pVar17.z0(new DecelerateInterpolator());
                    qVarM4.Q1(pVar17);
                }
                p5.p pVar18 = new p5.p(8388611);
                pVar18.B0(null);
                pVar18.z0(new DecelerateInterpolator());
                qVarA5.P1(pVar18);
            } else {
                if (qVarM4 != null) {
                    p5.p pVar19 = new p5.p(8388611);
                    pVar19.B0(null);
                    pVar19.C0(30L);
                    pVar19.z0(new DecelerateInterpolator());
                    qVarM4.Q1(pVar19);
                }
                p5.p pVar20 = new p5.p(8388613);
                pVar20.B0(null);
                pVar20.z0(new DecelerateInterpolator());
                qVarA5.P1(pVar20);
            }
            f4.t0 t0VarR6 = fragmentManager.r();
            t0VarR6.o(containerViewId, qVarA5, key5);
            t0VarR6.j();
            return new w0(v0Var.getKey(), (sq.h) qVarA5);
        }
        if (!(rendering instanceof b)) {
            if ((rendering instanceof a) || rendering == null) {
                return null;
            }
            throw new zt.l();
        }
        b bVar2 = (b) rendering;
        String key6 = bVar2.getKey();
        boolean didGoBack6 = bVar2.getDidGoBack();
        f4.q qVarM5 = fragmentManager.m0(containerViewId);
        f4.q qVarA6 = ((qVarM5 instanceof qo.g) && Intrinsics.c(qVarM5.h0(), key6)) ? qVarM5 : qo.g.INSTANCE.a(bVar2.getProps());
        if (didGoBack6) {
            if (qVarM5 != null) {
                p5.p pVar21 = new p5.p(8388613);
                pVar21.B0(null);
                pVar21.C0(30L);
                pVar21.z0(new DecelerateInterpolator());
                qVarM5.Q1(pVar21);
            }
            p5.p pVar22 = new p5.p(8388611);
            pVar22.B0(null);
            pVar22.z0(new DecelerateInterpolator());
            qVarA6.P1(pVar22);
        } else {
            if (qVarM5 != null) {
                p5.p pVar23 = new p5.p(8388611);
                pVar23.B0(null);
                pVar23.C0(30L);
                pVar23.z0(new DecelerateInterpolator());
                qVarM5.Q1(pVar23);
            }
            p5.p pVar24 = new p5.p(8388613);
            pVar24.B0(null);
            pVar24.z0(new DecelerateInterpolator());
            qVarA6.P1(pVar24);
        }
        f4.t0 t0VarR7 = fragmentManager.r();
        t0VarR7.o(containerViewId, qVarA6, key6);
        t0VarR7.j();
        return new c(bVar2.getKey(), (qo.g) qVarA6);
    }

    public final void h(@Nullable s0 rendering, @NotNull pp.c binding, @NotNull f4.k0 fragmentManager) {
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
            z0VarG = g(rendering, fragmentManager, binding.f29261c.getId());
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
                throw new zt.l();
            }
            Intrinsics.d(z0VarG, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieStepRendering");
            v0 v0Var = (v0) rendering;
            ((w0) z0VarG).getFragment().J2(v0Var.getProps(), v0Var.getHandler());
        }
    }

    public final void i(final pp.c binding) {
        final Context context = binding.getRoot().getContext();
        binding.b.setVisibility(0);
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: vp.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.j(this.f35291a, binding, view);
            }
        });
        binding.b.setOnLongClickListener(new View.OnLongClickListener() { // from class: vp.i0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return n0.k(this.f35293a, context, view);
            }
        });
        FloatingActionButton floatingActionButton = binding.b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        kr.g.g(floatingActionButton, new Function1() { // from class: vp.j0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n0.l(binding, (WindowInsetsCompat) obj);
            }
        });
    }

    public final void m(Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, jc.j.f20443d);
        lq.a aVarC = lq.a.c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        dialog.setContentView(aVarC.getRoot());
        aVarC.f22457c.setTitle("Sandbox options");
        aVarC.f22457c.setNavigationIcon(xq.s.f37019u);
        aVarC.f22457c.setNavigationOnClickListener(new View.OnClickListener() { // from class: vp.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.n(dialog, view);
            }
        });
        aVarC.b.setChecked(this.sandboxFlags.b());
        aVarC.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vp.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                n0.o(this.f35299a, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vp.m0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                n0.p(this.f35301a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }
}
