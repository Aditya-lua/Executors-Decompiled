package p019ap;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0590c1;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.C2759b;
import com.withpersona.sdk2.inquiry.internal.C3690i;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032bp.C1479a;
import p194ic.C6738b;
import p194ic.C6742f;
import p226jq.C7263i;
import p226jq.C7278p0;
import p226jq.C7288z;
import p227jr.C7293c;
import p227jr.C7297e;
import p227jr.C7304h0;
import p316o.C9611d;
import p456u2.C11774c;
import p526wq.C12543z;

/* JADX INFO: renamed from: ap.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, m31665d2 = {"Lap/e;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "k2", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lbp/a;", "binding", "C2", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lbp/a;)V", "w0", "Lbp/a;", "E2", "()Lbp/a;", "L2", "(Lbp/a;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "D2", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "args", "", "G2", "()I", "themeArg", "Lcom/withpersona/sdk2/inquiry/internal/i;", "F2", "()Lcom/withpersona/sdk2/inquiry/internal/i;", "inquiryFragment", "x0", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1136e extends C2759b {

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public C1479a binding;

    /* JADX INFO: renamed from: ap.e$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lap/e$a;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "theme", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "cancelOutput", "", "a", "(Landroidx/fragment/app/FragmentManager;ILcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;)V", "", "ARGUMENT_CANCEL_OUTPUT", "Ljava/lang/String;", "ARGUMENT_THEME", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ap.e.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m6460a(@NotNull FragmentManager fragmentManager, int theme, @NotNull InquiryWorkflow$Output.Cancel cancelOutput) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
            C1136e c1136e = new C1136e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGUMENT_CANCEL_OUTPUT", cancelOutput);
            bundle.putInt("ARGUMENT_THEME", theme);
            c1136e.m4625O1(bundle);
            if (cancelOutput.getStyles() == null) {
                c1136e.m23337r2(0, theme);
            }
            C7263i.m30283a(c1136e, fragmentManager, "cancel_dialog_fragment");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: H2 */
    public static final void m6447H2(Dialog dialog, C1136e c1136e, DialogInterface dialogInterface) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(C6742f.f26035f);
        viewGroup.setBackgroundResource(R.color.transparent);
        Intrinsics.checkNotNull(viewGroup);
        InquiryWorkflow$Output.Cancel cancelM6454D2 = c1136e.m6454D2();
        StepStyle styles = cancelM6454D2 != null ? cancelM6454D2.getStyles() : null;
        ConstraintLayout bottomSheetContent = c1136e.m6455E2().f5747b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        C7293c.m30334c(viewGroup, styles, bottomSheetContent, null, false, 12, null);
    }

    /* JADX INFO: renamed from: I2 */
    public static final void m6448I2(C1136e c1136e, View view) {
        c1136e.mo12190e2();
    }

    /* JADX INFO: renamed from: J2 */
    public static final void m6449J2(C1136e c1136e, InquiryWorkflow$Output.Cancel cancel, View view) {
        c1136e.mo12190e2();
        C3690i c3690iM6456F2 = c1136e.m6456F2();
        if (c3690iM6456F2 != null) {
            c3690iM6456F2.m18564n2(cancel);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static final Unit m6450K2(C1136e c1136e, InquiryWorkflow$Output.Cancel cancel, C1479a c1479a) {
        c1136e.m6453C2(cancel.getStyles(), c1479a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m6453C2(StepStyle styles, C1479a binding) {
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle modalTextStyleValue;
        TextBasedComponentStyle modalTitleStyleValue;
        if (styles != null && (modalTitleStyleValue = styles.getModalTitleStyleValue()) != null) {
            TextView hintTitle = binding.f5750e;
            Intrinsics.checkNotNullExpressionValue(hintTitle, "hintTitle");
            C7304h0.m30392l(hintTitle, modalTitleStyleValue, null, 2, null);
        }
        if (styles != null && (modalTextStyleValue = styles.getModalTextStyleValue()) != null) {
            TextView hintMessage = binding.f5749d;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            C7304h0.m30392l(hintMessage, modalTextStyleValue, null, 2, null);
        }
        if (styles != null && (cancelDialogCloseStyleValue = styles.getCancelDialogCloseStyleValue()) != null) {
            PersonaMaterialButton closeButton = binding.f5748c;
            Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
            C7297e.m30364h(closeButton, cancelDialogCloseStyleValue, false, false, false, 10, null);
        }
        if (styles == null || (cancelDialogResumeStyleValue = styles.getCancelDialogResumeStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton retryButton = binding.f5751f;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        C7297e.m30364h(retryButton, cancelDialogResumeStyleValue, false, false, false, 10, null);
    }

    /* JADX INFO: renamed from: D2 */
    public final InquiryWorkflow$Output.Cancel m6454D2() {
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            return (InquiryWorkflow$Output.Cancel) C11774c.m44055a(bundleM4704t, "ARGUMENT_CANCEL_OUTPUT", InquiryWorkflow$Output.Cancel.class);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E2 */
    public final C1479a m6455E2() {
        C1479a c1479a = this.binding;
        if (c1479a != null) {
            return c1479a;
        }
        Intrinsics.m31998u("binding");
        return null;
    }

    /* JADX INFO: renamed from: F2 */
    public final C3690i m6456F2() {
        ComponentCallbacksC0929c componentCallbacksC0929cM4612K = m4612K();
        if (componentCallbacksC0929cM4612K instanceof C3690i) {
            return (C3690i) componentCallbacksC0929cM4612K;
        }
        return null;
    }

    /* JADX INFO: renamed from: G2 */
    public final int m6457G2() {
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            return bundleM4704t.getInt("ARGUMENT_THEME", 0);
        }
        return 0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.mo1225J0(inflater, container, savedInstanceState);
        if (m6457G2() != 0) {
            inflater = inflater.cloneInContext(new C9611d(inflater.getContext(), m6457G2()));
        }
        C1479a c1479aM7590c = C1479a.m7590c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c1479aM7590c, "inflate(...)");
        m6458L2(c1479aM7590c);
        ConstraintLayout root = m6455E2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m6458L2(@NotNull C1479a c1479a) {
        Intrinsics.checkNotNullParameter(c1479a, "<set-?>");
        this.binding = c1479a;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        int iM30328d;
        Integer modalBackgroundColorValue;
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        final InquiryWorkflow$Output.Cancel cancelM6454D2 = m6454D2();
        if (cancelM6454D2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Dialog dialogM23328h2 = m23328h2();
        if (dialogM23328h2 != null && (window = dialogM23328h2.getWindow()) != null) {
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            C0590c1.m2821b(window, false);
            StepStyle styles = cancelM6454D2.getStyles();
            if (styles == null || (modalBackgroundColorValue = styles.getModalBackgroundColorValue()) == null) {
                Context context = window.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iM30328d = C7288z.m30328d(context, C6738b.f25908o, null, false, 6, null);
            } else {
                iM30328d = modalBackgroundColorValue.intValue();
            }
            C7278p0.m30321a(window, iM30328d);
        }
        final C1479a c1479aM6455E2 = m6455E2();
        String title = cancelM6454D2.getTitle();
        if (title != null) {
            c1479aM6455E2.f5750e.setText(title);
        }
        String message = cancelM6454D2.getMessage();
        if (message != null) {
            c1479aM6455E2.f5749d.setText(message);
        }
        String cancelButtonText = cancelM6454D2.getCancelButtonText();
        if (cancelButtonText != null) {
            c1479aM6455E2.f5748c.setText(cancelButtonText);
        }
        String resumeButtonText = cancelM6454D2.getResumeButtonText();
        if (resumeButtonText != null) {
            c1479aM6455E2.f5751f.setText(resumeButtonText);
        }
        c1479aM6455E2.f5751f.setOnClickListener(new View.OnClickListener() { // from class: ap.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1136e.m6448I2(this.f4659a, view2);
            }
        });
        c1479aM6455E2.f5748c.setOnClickListener(new View.OnClickListener() { // from class: ap.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1136e.m6449J2(this.f4660a, cancelM6454D2, view2);
            }
        });
        PersonaMaterialButton closeButton = c1479aM6455E2.f5748c;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        C12543z.m46890b(closeButton, new Function0() { // from class: ap.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1136e.m6450K2(this.f4662a, cancelM6454D2, c1479aM6455E2);
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.C2759b, p203j.C7003m, p093e4.DialogInterfaceOnCancelListenerC4819k
    @NotNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(@Nullable Bundle savedInstanceState) {
        final Dialog dialogMo6459k2 = super.mo6459k2(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogMo6459k2, "onCreateDialog(...)");
        dialogMo6459k2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ap.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C1136e.m6447H2(dialogMo6459k2, this, dialogInterface);
            }
        });
        return dialogMo6459k2;
    }
}
