package p177hp;

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
import androidx.core.view.GravityCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import jp.C7244b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032bp.C1481c;
import p133fp.C5726f;
import p194ic.C6746j;
import p226jq.C7265j;
import p226jq.C7281s;
import p229jt.C7345l;
import p322o5.C9681p;
import p525wp.C12504c;
import p526wq.C12524g;
import p555xp.C12886a;

/* JADX INFO: renamed from: hp.n0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m31665d2 = {"Lhp/n0;", "", "Lwp/c;", "sandboxFlags", "<init>", "(Lwp/c;)V", "Lhp/s0;", "rendering", "Lbp/c;", "binding", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "h", "(Lhp/s0;Lbp/c;Landroidx/fragment/app/FragmentManager;)V", "i", "(Lbp/c;)V", "Landroid/content/Context;", "context", "m", "(Landroid/content/Context;)V", "", "containerViewId", "Lhp/z0;", "g", "(Lhp/s0;Landroidx/fragment/app/FragmentManager;I)Lhp/z0;", "a", "Lwp/c;", "Landroid/app/Dialog;", "b", "Landroid/app/Dialog;", "optionsDialog", "c", "Lhp/z0;", "currentStepRendering", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6510n0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Dialog optionsDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC6534z0 currentStepRendering;

    public C6510n0(@NotNull C12504c sandboxFlags) {
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        this.sandboxFlags = sandboxFlags;
    }

    /* JADX INFO: renamed from: j */
    public static final void m28340j(C6510n0 c6510n0, C1481c c1481c, View view) {
        c6510n0.sandboxFlags.m46826g();
        Toast.makeText(c1481c.f5756b.getRootView().getContext(), "Setting the debug flag to: " + C12504c.INSTANCE.m46827a(c6510n0.sandboxFlags.getDebugForcedStatus()), 0).show();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m28341k(C6510n0 c6510n0, Context context, View view) {
        Intrinsics.checkNotNull(context);
        c6510n0.m28349m(context);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m28342l(C1481c c1481c, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = c1481c.f5756b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) (((double) insetsIgnoringVisibility.bottom) + C7265j.m30287c(16.0d));
        floatingActionButton.setLayoutParams(marginLayoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m28343n(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public static final void m28344o(C6510n0 c6510n0, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        c6510n0.sandboxFlags.m46825f(z10);
    }

    /* JADX INFO: renamed from: p */
    public static final void m28345p(C6510n0 c6510n0, DialogInterface dialogInterface) {
        c6510n0.optionsDialog = null;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC6534z0 m28346g(InterfaceC6520s0 rendering, FragmentManager fragmentManager, int containerViewId) {
        if (rendering instanceof InterfaceC6492e1) {
            InterfaceC6492e1 interfaceC6492e1 = (InterfaceC6492e1) rendering;
            String key = interfaceC6492e1.getKey();
            boolean didGoBack = interfaceC6492e1.getDidGoBack();
            ComponentCallbacksC0929c componentCallbacksC0929cM4441m0 = fragmentManager.m4441m0(containerViewId);
            ComponentCallbacksC0929c componentCallbacksC0929cM30217a = ((componentCallbacksC0929cM4441m0 instanceof C7244b) && Intrinsics.m31980c(componentCallbacksC0929cM4441m0.m4672h0(), key)) ? componentCallbacksC0929cM4441m0 : C7244b.INSTANCE.m30217a();
            if (didGoBack) {
                if (componentCallbacksC0929cM4441m0 != null) {
                    C9681p c9681p = new C9681p(GravityCompat.END);
                    c9681p.mo38147x0(null);
                    c9681p.mo38148y0(30L);
                    c9681p.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m0.m4630Q1(c9681p);
                }
                C9681p c9681p2 = new C9681p(GravityCompat.START);
                c9681p2.mo38147x0(null);
                c9681p2.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM30217a.m4628P1(c9681p2);
            } else {
                if (componentCallbacksC0929cM4441m0 != null) {
                    C9681p c9681p3 = new C9681p(GravityCompat.START);
                    c9681p3.mo38147x0(null);
                    c9681p3.mo38148y0(30L);
                    c9681p3.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m0.m4630Q1(c9681p3);
                }
                C9681p c9681p4 = new C9681p(GravityCompat.END);
                c9681p4.mo38147x0(null);
                c9681p4.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM30217a.m4628P1(c9681p4);
            }
            AbstractC0934h abstractC0934hM4452r = fragmentManager.m4452r();
            abstractC0934hM4452r.m4782o(containerViewId, componentCallbacksC0929cM30217a, key);
            abstractC0934hM4452r.mo4511j();
            C7244b c7244b = (C7244b) componentCallbacksC0929cM30217a;
            c7244b.m30214k2(interfaceC6492e1);
            if (interfaceC6492e1 instanceof C6487d) {
                return new C6490e(((C6487d) rendering).getKey(), c7244b);
            }
            if (interfaceC6492e1 instanceof C6497h) {
                return new C6499i(((C6497h) rendering).getKey(), c7244b);
            }
            if (interfaceC6492e1 instanceof C6516q0) {
                return new C6518r0(((C6516q0) rendering).getKey(), c7244b);
            }
            if (interfaceC6492e1 instanceof C6530x0) {
                return new C6532y0(((C6530x0) rendering).getKey(), c7244b);
            }
            if (interfaceC6492e1 instanceof C6486c1) {
                return new C6489d1(((C6486c1) rendering).getKey(), c7244b);
            }
            throw new C7345l();
        }
        if (rendering instanceof C6524u0) {
            C5726f c5726fM25921a = C5726f.INSTANCE.m25921a();
            AbstractC0934h abstractC0934hM4452r2 = fragmentManager.m4452r();
            abstractC0934hM4452r2.m4781n(containerViewId, c5726fM25921a);
            abstractC0934hM4452r2.mo4509h();
            return new C6522t0(((C6524u0) rendering).getKey(), c5726fM25921a);
        }
        if (rendering instanceof C6480a1) {
            C6480a1 c6480a1 = (C6480a1) rendering;
            String key2 = c6480a1.getKey();
            boolean didGoBack2 = c6480a1.getDidGoBack();
            ComponentCallbacksC0929c componentCallbacksC0929cM4441m1 = fragmentManager.m4441m0(containerViewId);
            ComponentCallbacksC0929c componentCallbacksC0929cM21664a = ((componentCallbacksC0929cM4441m1 instanceof UiStepFragment) && Intrinsics.m31980c(componentCallbacksC0929cM4441m1.m4672h0(), key2)) ? componentCallbacksC0929cM4441m1 : UiStepFragment.INSTANCE.m21664a(c6480a1.getProps());
            if (didGoBack2) {
                if (componentCallbacksC0929cM4441m1 != null) {
                    C9681p c9681p5 = new C9681p(GravityCompat.END);
                    c9681p5.mo38147x0(null);
                    c9681p5.mo38148y0(30L);
                    c9681p5.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m1.m4630Q1(c9681p5);
                }
                C9681p c9681p6 = new C9681p(GravityCompat.START);
                c9681p6.mo38147x0(null);
                c9681p6.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM21664a.m4628P1(c9681p6);
            } else {
                if (componentCallbacksC0929cM4441m1 != null) {
                    C9681p c9681p7 = new C9681p(GravityCompat.START);
                    c9681p7.mo38147x0(null);
                    c9681p7.mo38148y0(30L);
                    c9681p7.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m1.m4630Q1(c9681p7);
                }
                C9681p c9681p8 = new C9681p(GravityCompat.END);
                c9681p8.mo38147x0(null);
                c9681p8.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM21664a.m4628P1(c9681p8);
            }
            AbstractC0934h abstractC0934hM4452r3 = fragmentManager.m4452r();
            abstractC0934hM4452r3.m4782o(containerViewId, componentCallbacksC0929cM21664a, key2);
            abstractC0934hM4452r3.mo4511j();
            return new C6483b1(c6480a1.getKey(), (UiStepFragment) componentCallbacksC0929cM21664a);
        }
        if (rendering instanceof C6512o0) {
            C6512o0 c6512o0 = (C6512o0) rendering;
            String key3 = c6512o0.getKey();
            boolean didGoBack3 = c6512o0.getDidGoBack();
            ComponentCallbacksC0929c componentCallbacksC0929cM4441m2 = fragmentManager.m4441m0(containerViewId);
            ComponentCallbacksC0929c componentCallbacksC0929cM18028a = ((componentCallbacksC0929cM4441m2 instanceof IntegrationStepFragment) && Intrinsics.m31980c(componentCallbacksC0929cM4441m2.m4672h0(), key3)) ? componentCallbacksC0929cM4441m2 : IntegrationStepFragment.INSTANCE.m18028a(c6512o0.getProps());
            if (didGoBack3) {
                if (componentCallbacksC0929cM4441m2 != null) {
                    C9681p c9681p9 = new C9681p(GravityCompat.END);
                    c9681p9.mo38147x0(null);
                    c9681p9.mo38148y0(30L);
                    c9681p9.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m2.m4630Q1(c9681p9);
                }
                C9681p c9681p10 = new C9681p(GravityCompat.START);
                c9681p10.mo38147x0(null);
                c9681p10.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM18028a.m4628P1(c9681p10);
            } else {
                if (componentCallbacksC0929cM4441m2 != null) {
                    C9681p c9681p11 = new C9681p(GravityCompat.START);
                    c9681p11.mo38147x0(null);
                    c9681p11.mo38148y0(30L);
                    c9681p11.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m2.m4630Q1(c9681p11);
                }
                C9681p c9681p12 = new C9681p(GravityCompat.END);
                c9681p12.mo38147x0(null);
                c9681p12.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM18028a.m4628P1(c9681p12);
            }
            AbstractC0934h abstractC0934hM4452r4 = fragmentManager.m4452r();
            abstractC0934hM4452r4.m4782o(containerViewId, componentCallbacksC0929cM18028a, key3);
            abstractC0934hM4452r4.mo4511j();
            return new C6514p0(c6512o0.getKey(), (IntegrationStepFragment) componentCallbacksC0929cM18028a);
        }
        if (rendering instanceof C6493f) {
            C6493f c6493f = (C6493f) rendering;
            String key4 = c6493f.getKey();
            boolean didGoBack4 = c6493f.getDidGoBack();
            ComponentCallbacksC0929c componentCallbacksC0929cM4441m3 = fragmentManager.m4441m0(containerViewId);
            ComponentCallbacksC0929c componentCallbacksC0929cM17791a = ((componentCallbacksC0929cM4441m3 instanceof GovernmentIdStepFragment) && Intrinsics.m31980c(componentCallbacksC0929cM4441m3.m4672h0(), key4)) ? componentCallbacksC0929cM4441m3 : GovernmentIdStepFragment.INSTANCE.m17791a(c6493f.getProps());
            if (didGoBack4) {
                if (componentCallbacksC0929cM4441m3 != null) {
                    C9681p c9681p13 = new C9681p(GravityCompat.END);
                    c9681p13.mo38147x0(null);
                    c9681p13.mo38148y0(30L);
                    c9681p13.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m3.m4630Q1(c9681p13);
                }
                C9681p c9681p14 = new C9681p(GravityCompat.START);
                c9681p14.mo38147x0(null);
                c9681p14.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM17791a.m4628P1(c9681p14);
            } else {
                if (componentCallbacksC0929cM4441m3 != null) {
                    C9681p c9681p15 = new C9681p(GravityCompat.START);
                    c9681p15.mo38147x0(null);
                    c9681p15.mo38148y0(30L);
                    c9681p15.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m3.m4630Q1(c9681p15);
                }
                C9681p c9681p16 = new C9681p(GravityCompat.END);
                c9681p16.mo38147x0(null);
                c9681p16.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM17791a.m4628P1(c9681p16);
            }
            AbstractC0934h abstractC0934hM4452r5 = fragmentManager.m4452r();
            abstractC0934hM4452r5.m4782o(containerViewId, componentCallbacksC0929cM17791a, key4);
            abstractC0934hM4452r5.mo4511j();
            return new C6495g(c6493f.getKey(), (GovernmentIdStepFragment) componentCallbacksC0929cM17791a);
        }
        if (rendering instanceof C6526v0) {
            C6526v0 c6526v0 = (C6526v0) rendering;
            String key5 = c6526v0.getKey();
            boolean didGoBack5 = c6526v0.getDidGoBack();
            ComponentCallbacksC0929c componentCallbacksC0929cM4441m4 = fragmentManager.m4441m0(containerViewId);
            ComponentCallbacksC0929c componentCallbacksC0929cM20239a = ((componentCallbacksC0929cM4441m4 instanceof SelfieStepFragment) && Intrinsics.m31980c(componentCallbacksC0929cM4441m4.m4672h0(), key5)) ? componentCallbacksC0929cM4441m4 : SelfieStepFragment.INSTANCE.m20239a(c6526v0.getProps());
            if (didGoBack5) {
                if (componentCallbacksC0929cM4441m4 != null) {
                    C9681p c9681p17 = new C9681p(GravityCompat.END);
                    c9681p17.mo38147x0(null);
                    c9681p17.mo38148y0(30L);
                    c9681p17.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m4.m4630Q1(c9681p17);
                }
                C9681p c9681p18 = new C9681p(GravityCompat.START);
                c9681p18.mo38147x0(null);
                c9681p18.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM20239a.m4628P1(c9681p18);
            } else {
                if (componentCallbacksC0929cM4441m4 != null) {
                    C9681p c9681p19 = new C9681p(GravityCompat.START);
                    c9681p19.mo38147x0(null);
                    c9681p19.mo38148y0(30L);
                    c9681p19.mo38144v0(new DecelerateInterpolator());
                    componentCallbacksC0929cM4441m4.m4630Q1(c9681p19);
                }
                C9681p c9681p20 = new C9681p(GravityCompat.END);
                c9681p20.mo38147x0(null);
                c9681p20.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM20239a.m4628P1(c9681p20);
            }
            AbstractC0934h abstractC0934hM4452r6 = fragmentManager.m4452r();
            abstractC0934hM4452r6.m4782o(containerViewId, componentCallbacksC0929cM20239a, key5);
            abstractC0934hM4452r6.mo4511j();
            return new C6528w0(c6526v0.getKey(), (SelfieStepFragment) componentCallbacksC0929cM20239a);
        }
        if (!(rendering instanceof C6481b)) {
            if ((rendering instanceof C6478a) || rendering == null) {
                return null;
            }
            throw new C7345l();
        }
        C6481b c6481b = (C6481b) rendering;
        String key6 = c6481b.getKey();
        boolean didGoBack6 = c6481b.getDidGoBack();
        ComponentCallbacksC0929c componentCallbacksC0929cM4441m5 = fragmentManager.m4441m0(containerViewId);
        ComponentCallbacksC0929c componentCallbacksC0929cM16789a = ((componentCallbacksC0929cM4441m5 instanceof DocumentStepFragment) && Intrinsics.m31980c(componentCallbacksC0929cM4441m5.m4672h0(), key6)) ? componentCallbacksC0929cM4441m5 : DocumentStepFragment.INSTANCE.m16789a(c6481b.getProps());
        if (didGoBack6) {
            if (componentCallbacksC0929cM4441m5 != null) {
                C9681p c9681p21 = new C9681p(GravityCompat.END);
                c9681p21.mo38147x0(null);
                c9681p21.mo38148y0(30L);
                c9681p21.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM4441m5.m4630Q1(c9681p21);
            }
            C9681p c9681p22 = new C9681p(GravityCompat.START);
            c9681p22.mo38147x0(null);
            c9681p22.mo38144v0(new DecelerateInterpolator());
            componentCallbacksC0929cM16789a.m4628P1(c9681p22);
        } else {
            if (componentCallbacksC0929cM4441m5 != null) {
                C9681p c9681p23 = new C9681p(GravityCompat.START);
                c9681p23.mo38147x0(null);
                c9681p23.mo38148y0(30L);
                c9681p23.mo38144v0(new DecelerateInterpolator());
                componentCallbacksC0929cM4441m5.m4630Q1(c9681p23);
            }
            C9681p c9681p24 = new C9681p(GravityCompat.END);
            c9681p24.mo38147x0(null);
            c9681p24.mo38144v0(new DecelerateInterpolator());
            componentCallbacksC0929cM16789a.m4628P1(c9681p24);
        }
        AbstractC0934h abstractC0934hM4452r7 = fragmentManager.m4452r();
        abstractC0934hM4452r7.m4782o(containerViewId, componentCallbacksC0929cM16789a, key6);
        abstractC0934hM4452r7.mo4511j();
        return new C6484c(c6481b.getKey(), (DocumentStepFragment) componentCallbacksC0929cM16789a);
    }

    /* JADX INFO: renamed from: h */
    public final void m28347h(@Nullable InterfaceC6520s0 rendering, @NotNull C1481c binding, @NotNull FragmentManager fragmentManager) {
        InterfaceC6534z0 interfaceC6534z0M28346g;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (rendering == null) {
            return;
        }
        if (this.sandboxFlags.getIsSandboxModeEnabled()) {
            m28348i(binding);
        } else {
            binding.f5756b.setVisibility(8);
        }
        InterfaceC6534z0 interfaceC6534z0 = this.currentStepRendering;
        if (Intrinsics.m31980c(interfaceC6534z0 != null ? interfaceC6534z0.getName() : null, rendering.getKey())) {
            interfaceC6534z0M28346g = this.currentStepRendering;
        } else {
            interfaceC6534z0M28346g = m28346g(rendering, fragmentManager, binding.f5757c.getId());
            this.currentStepRendering = interfaceC6534z0M28346g;
        }
        if (rendering instanceof C6486c1) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowRendering");
            ((C6489d1) interfaceC6534z0M28346g).getFragment().m30215m2((InterfaceC6492e1) rendering);
            return;
        }
        if (rendering instanceof C6480a1) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepRendering");
            C6480a1 c6480a1 = (C6480a1) rendering;
            ((C6483b1) interfaceC6534z0M28346g).getFragment().m21658q2(c6480a1.getProps(), c6480a1.getHandler());
            return;
        }
        if (rendering instanceof C6524u0) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.LoadingRendering");
            ((C6522t0) interfaceC6534z0M28346g).getFragment().m25918s2((C6524u0) rendering);
            return;
        }
        if (rendering instanceof C6478a) {
            return;
        }
        if (rendering instanceof C6487d) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentWorkflowRendering");
            ((C6490e) interfaceC6534z0M28346g).getFragment().m30215m2((InterfaceC6492e1) rendering);
            return;
        }
        if (rendering instanceof C6481b) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentStepRendering");
            C6481b c6481b = (C6481b) rendering;
            ((C6484c) interfaceC6534z0M28346g).getFragment().m16783w2(c6481b.getProps(), c6481b.getHandler());
            return;
        }
        if (rendering instanceof C6497h) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdWorkflowRendering");
            ((C6499i) interfaceC6534z0M28346g).getFragment().m30215m2((InterfaceC6492e1) rendering);
            return;
        }
        if (rendering instanceof C6493f) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepRendering");
            C6493f c6493f = (C6493f) rendering;
            ((C6495g) interfaceC6534z0M28346g).getFragment().m17782R2(c6493f.getProps(), c6493f.getHandler());
            return;
        }
        if (rendering instanceof C6512o0) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationStepRendering");
            C6512o0 c6512o0 = (C6512o0) rendering;
            ((C6514p0) interfaceC6534z0M28346g).getFragment().m18023r2(c6512o0.getProps(), c6512o0.getHandler());
        } else if (rendering instanceof C6516q0) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationWorkflowRendering");
            ((C6518r0) interfaceC6534z0M28346g).getFragment().m30215m2((InterfaceC6492e1) rendering);
        } else if (rendering instanceof C6530x0) {
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieWorkflowRendering");
            ((C6532y0) interfaceC6534z0M28346g).getFragment().m30215m2((InterfaceC6492e1) rendering);
        } else {
            if (!(rendering instanceof C6526v0)) {
                throw new C7345l();
            }
            Intrinsics.m31981d(interfaceC6534z0M28346g, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieStepRendering");
            C6526v0 c6526v0 = (C6526v0) rendering;
            ((C6528w0) interfaceC6534z0M28346g).getFragment().m20226J2(c6526v0.getProps(), c6526v0.getHandler());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m28348i(final C1481c binding) {
        final Context context = binding.getRoot().getContext();
        binding.f5756b.setVisibility(0);
        binding.f5756b.setOnClickListener(new View.OnClickListener() { // from class: hp.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6510n0.m28340j(this.f24767a, binding, view);
            }
        });
        binding.f5756b.setOnLongClickListener(new View.OnLongClickListener() { // from class: hp.i0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C6510n0.m28341k(this.f24771a, context, view);
            }
        });
        FloatingActionButton floatingActionButton = binding.f5756b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
        C12524g.m46876g(floatingActionButton, new Function1() { // from class: hp.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6510n0.m28342l(binding, (WindowInsetsCompat) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m28349m(Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, C6746j.f26112d);
        C12886a c12886aM47909c = C12886a.m47909c(LayoutInflater.from(dialog.getContext()));
        Intrinsics.checkNotNullExpressionValue(c12886aM47909c, "inflate(...)");
        dialog.setContentView(c12886aM47909c.getRoot());
        c12886aM47909c.f45747c.setTitle("Sandbox options");
        c12886aM47909c.f45747c.setNavigationIcon(C7281s.f28060u);
        c12886aM47909c.f45747c.setNavigationOnClickListener(new View.OnClickListener() { // from class: hp.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6510n0.m28343n(dialog, view);
            }
        });
        c12886aM47909c.f45746b.setChecked(this.sandboxFlags.m46821b());
        c12886aM47909c.f45746b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hp.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                C6510n0.m28344o(this.f24780a, compoundButton, z10);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hp.m0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C6510n0.m28345p(this.f24783a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }
}
