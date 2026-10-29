package ap;

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
import androidx.core.view.c1;
import androidx.fragment.app.FragmentManager;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import hc.f;
import jq.i;
import jq.p0;
import jq.z;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lap/e;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "k2", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lbp/a;", "binding", "C2", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lbp/a;)V", "w0", "Lbp/a;", "E2", "()Lbp/a;", "L2", "(Lbp/a;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "D2", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "args", "", "G2", "()I", "themeArg", "Lcom/withpersona/sdk2/inquiry/internal/i;", "F2", "()Lcom/withpersona/sdk2/inquiry/internal/i;", "inquiryFragment", "x0", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends com.google.android.material.bottomsheet.b {

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public bp.a binding;

    /* JADX INFO: renamed from: ap.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lap/e$a;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "theme", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "cancelOutput", "", "a", "(Landroidx/fragment/app/FragmentManager;ILcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;)V", "", "ARGUMENT_CANCEL_OUTPUT", "Ljava/lang/String;", "ARGUMENT_THEME", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull FragmentManager fragmentManager, int theme, @NotNull InquiryWorkflow$Output.Cancel cancelOutput) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGUMENT_CANCEL_OUTPUT", cancelOutput);
            bundle.putInt("ARGUMENT_THEME", theme);
            eVar.O1(bundle);
            if (cancelOutput.getStyles() == null) {
                eVar.r2(0, theme);
            }
            i.a(eVar, fragmentManager, "cancel_dialog_fragment");
        }

        public Companion() {
        }
    }

    public static final void H2(Dialog dialog, e eVar, DialogInterface dialogInterface) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(f.f18864f);
        viewGroup.setBackgroundResource(R.color.transparent);
        Intrinsics.checkNotNull(viewGroup);
        InquiryWorkflow$Output.Cancel cancelD2 = eVar.D2();
        StepStyle styles = cancelD2 != null ? cancelD2.getStyles() : null;
        ConstraintLayout bottomSheetContent = eVar.E2().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        jr.c.c(viewGroup, styles, bottomSheetContent, null, false, 12, null);
    }

    public static final void I2(e eVar, View view) {
        eVar.e2();
    }

    public static final void J2(e eVar, InquiryWorkflow$Output.Cancel cancel, View view) {
        eVar.e2();
        com.withpersona.sdk2.inquiry.internal.i iVarF2 = eVar.F2();
        if (iVarF2 != null) {
            iVarF2.n2(cancel);
        }
    }

    public static final Unit K2(e eVar, InquiryWorkflow$Output.Cancel cancel, bp.a aVar) {
        eVar.C2(cancel.getStyles(), aVar);
        return Unit.f22483a;
    }

    public final void C2(StepStyle styles, bp.a binding) {
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle modalTextStyleValue;
        TextBasedComponentStyle modalTitleStyleValue;
        if (styles != null && (modalTitleStyleValue = styles.getModalTitleStyleValue()) != null) {
            TextView hintTitle = binding.f4294e;
            Intrinsics.checkNotNullExpressionValue(hintTitle, "hintTitle");
            h0.l(hintTitle, modalTitleStyleValue, null, 2, null);
        }
        if (styles != null && (modalTextStyleValue = styles.getModalTextStyleValue()) != null) {
            TextView hintMessage = binding.f4293d;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            h0.l(hintMessage, modalTextStyleValue, null, 2, null);
        }
        if (styles != null && (cancelDialogCloseStyleValue = styles.getCancelDialogCloseStyleValue()) != null) {
            PersonaMaterialButton closeButton = binding.f4292c;
            Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
            jr.e.h(closeButton, cancelDialogCloseStyleValue, false, false, false, 10, null);
        }
        if (styles == null || (cancelDialogResumeStyleValue = styles.getCancelDialogResumeStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton retryButton = binding.f4295f;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        jr.e.h(retryButton, cancelDialogResumeStyleValue, false, false, false, 10, null);
    }

    public final InquiryWorkflow$Output.Cancel D2() {
        Bundle bundleT = t();
        if (bundleT != null) {
            return (InquiryWorkflow$Output.Cancel) u2.c.a(bundleT, "ARGUMENT_CANCEL_OUTPUT", InquiryWorkflow$Output.Cancel.class);
        }
        return null;
    }

    @NotNull
    public final bp.a E2() {
        bp.a aVar = this.binding;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("binding");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.internal.i F2() {
        androidx.fragment.app.c cVarK = K();
        if (cVarK instanceof com.withpersona.sdk2.inquiry.internal.i) {
            return (com.withpersona.sdk2.inquiry.internal.i) cVarK;
        }
        return null;
    }

    public final int G2() {
        Bundle bundleT = t();
        if (bundleT != null) {
            return bundleT.getInt("ARGUMENT_THEME", 0);
        }
        return 0;
    }

    @Override // androidx.fragment.app.c
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        if (G2() != 0) {
            inflater = inflater.cloneInContext(new o.d(inflater.getContext(), G2()));
        }
        bp.a aVarC = bp.a.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        L2(aVarC);
        ConstraintLayout root = E2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void L2(@NotNull bp.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.binding = aVar;
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        int iD;
        Integer modalBackgroundColorValue;
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        final InquiryWorkflow$Output.Cancel cancelD2 = D2();
        if (cancelD2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Dialog dialogH2 = h2();
        if (dialogH2 != null && (window = dialogH2.getWindow()) != null) {
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            c1.b(window, false);
            StepStyle styles = cancelD2.getStyles();
            if (styles == null || (modalBackgroundColorValue = styles.getModalBackgroundColorValue()) == null) {
                Context context = window.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iD = z.d(context, hc.b.f18790o, null, false, 6, null);
            } else {
                iD = modalBackgroundColorValue.intValue();
            }
            p0.a(window, iD);
        }
        final bp.a aVarE2 = E2();
        String title = cancelD2.getTitle();
        if (title != null) {
            aVarE2.f4294e.setText(title);
        }
        String message = cancelD2.getMessage();
        if (message != null) {
            aVarE2.f4293d.setText(message);
        }
        String cancelButtonText = cancelD2.getCancelButtonText();
        if (cancelButtonText != null) {
            aVarE2.f4292c.setText(cancelButtonText);
        }
        String resumeButtonText = cancelD2.getResumeButtonText();
        if (resumeButtonText != null) {
            aVarE2.f4295f.setText(resumeButtonText);
        }
        aVarE2.f4295f.setOnClickListener(new View.OnClickListener() { // from class: ap.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.I2(this.f3568a, view2);
            }
        });
        aVarE2.f4292c.setOnClickListener(new View.OnClickListener() { // from class: ap.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.J2(this.f3569a, cancelD2, view2);
            }
        });
        PersonaMaterialButton closeButton = aVarE2.f4292c;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        wq.z.b(closeButton, new Function0() { // from class: ap.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.K2(this.f3570a, cancelD2, aVarE2);
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.b, j.m, e4.k
    @NotNull
    public Dialog k2(@Nullable Bundle savedInstanceState) {
        final Dialog dialogK2 = super.k2(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogK2, "onCreateDialog(...)");
        dialogK2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ap.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                e.H2(dialogK2, this, dialogInterface);
            }
        });
        return dialogK2;
    }
}
