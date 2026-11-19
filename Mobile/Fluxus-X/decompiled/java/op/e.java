package op;

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
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.internal.l;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import f4.k0;
import f4.q;
import jc.f;
import kr.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import xq.i;
import xq.p0;
import xq.z;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lop/e;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "k2", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lpp/a;", "binding", "C2", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lpp/a;)V", "w0", "Lpp/a;", "E2", "()Lpp/a;", "L2", "(Lpp/a;)V", "Lcom/withpersona/sdk2/inquiry/internal/l$a;", "D2", "()Lcom/withpersona/sdk2/inquiry/internal/l$a;", "args", BuildConfig.FLAVOR, "G2", "()I", "themeArg", "Lcom/withpersona/sdk2/inquiry/internal/i;", "F2", "()Lcom/withpersona/sdk2/inquiry/internal/i;", "inquiryFragment", "x0", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends com.google.android.material.bottomsheet.b {

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public pp.a binding;

    /* JADX INFO: renamed from: op.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lop/e$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lf4/k0;", "fragmentManager", BuildConfig.FLAVOR, "theme", "Lcom/withpersona/sdk2/inquiry/internal/l$a;", "cancelOutput", BuildConfig.FLAVOR, "a", "(Lf4/k0;ILcom/withpersona/sdk2/inquiry/internal/l$a;)V", BuildConfig.FLAVOR, "ARGUMENT_CANCEL_OUTPUT", "Ljava/lang/String;", "ARGUMENT_THEME", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull k0 fragmentManager, int theme, @NotNull l.Cancel cancelOutput) {
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
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(f.f20374f);
        viewGroup.setBackgroundResource(R.color.transparent);
        Intrinsics.checkNotNull(viewGroup);
        l.Cancel cancelD2 = eVar.D2();
        StepStyle styles = cancelD2 != null ? cancelD2.getStyles() : null;
        ConstraintLayout bottomSheetContent = eVar.E2().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        yr.c.c(viewGroup, styles, bottomSheetContent, null, false, 12, null);
    }

    public static final void I2(e eVar, View view) {
        eVar.e2();
    }

    public static final void J2(e eVar, l.Cancel cancel, View view) {
        eVar.e2();
        com.withpersona.sdk2.inquiry.internal.i iVarF2 = eVar.F2();
        if (iVarF2 != null) {
            iVarF2.n2(cancel);
        }
    }

    public static final Unit K2(e eVar, l.Cancel cancel, pp.a aVar) {
        eVar.C2(cancel.getStyles(), aVar);
        return Unit.f21506a;
    }

    public final void C2(StepStyle styles, pp.a binding) {
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle modalTextStyleValue;
        TextBasedComponentStyle modalTitleStyleValue;
        if (styles != null && (modalTitleStyleValue = styles.getModalTitleStyleValue()) != null) {
            TextView hintTitle = binding.f29256e;
            Intrinsics.checkNotNullExpressionValue(hintTitle, "hintTitle");
            h0.l(hintTitle, modalTitleStyleValue, null, 2, null);
        }
        if (styles != null && (modalTextStyleValue = styles.getModalTextStyleValue()) != null) {
            TextView hintMessage = binding.f29255d;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            h0.l(hintMessage, modalTextStyleValue, null, 2, null);
        }
        if (styles != null && (cancelDialogCloseStyleValue = styles.getCancelDialogCloseStyleValue()) != null) {
            PersonaMaterialButton closeButton = binding.f29254c;
            Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
            yr.e.h(closeButton, cancelDialogCloseStyleValue, false, false, false, 10, null);
        }
        if (styles == null || (cancelDialogResumeStyleValue = styles.getCancelDialogResumeStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton retryButton = binding.f29257f;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        yr.e.h(retryButton, cancelDialogResumeStyleValue, false, false, false, 10, null);
    }

    public final l.Cancel D2() {
        Bundle bundleT = t();
        if (bundleT != null) {
            return (l.Cancel) u2.c.a(bundleT, "ARGUMENT_CANCEL_OUTPUT", l.Cancel.class);
        }
        return null;
    }

    @NotNull
    public final pp.a E2() {
        pp.a aVar = this.binding;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("binding");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.internal.i F2() {
        q qVarJ = J();
        if (qVarJ instanceof com.withpersona.sdk2.inquiry.internal.i) {
            return (com.withpersona.sdk2.inquiry.internal.i) qVarJ;
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

    @Override // f4.q
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        if (G2() != 0) {
            inflater = inflater.cloneInContext(new o.d(inflater.getContext(), G2()));
        }
        pp.a aVarC = pp.a.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        L2(aVarC);
        ConstraintLayout root = E2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void L2(@NotNull pp.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.binding = aVar;
    }

    @Override // f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Window window;
        int iD;
        Integer modalBackgroundColorValue;
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        final l.Cancel cancelD2 = D2();
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
                iD = z.d(context, jc.b.f20300o, null, false, 6, null);
            } else {
                iD = modalBackgroundColorValue.intValue();
            }
            p0.a(window, iD);
        }
        final pp.a aVarE2 = E2();
        String title = cancelD2.getTitle();
        if (title != null) {
            aVarE2.f29256e.setText(title);
        }
        String message = cancelD2.getMessage();
        if (message != null) {
            aVarE2.f29255d.setText(message);
        }
        String cancelButtonText = cancelD2.getCancelButtonText();
        if (cancelButtonText != null) {
            aVarE2.f29254c.setText(cancelButtonText);
        }
        String resumeButtonText = cancelD2.getResumeButtonText();
        if (resumeButtonText != null) {
            aVarE2.f29257f.setText(resumeButtonText);
        }
        aVarE2.f29257f.setOnClickListener(new View.OnClickListener() { // from class: op.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.I2(this.f28319a, view2);
            }
        });
        aVarE2.f29254c.setOnClickListener(new View.OnClickListener() { // from class: op.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.J2(this.f28320a, cancelD2, view2);
            }
        });
        PersonaMaterialButton closeButton = aVarE2.f29254c;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        a0.b(closeButton, new Function0() { // from class: op.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.K2(this.f28321a, cancelD2, aVarE2);
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.b, j.m, f4.o
    @NotNull
    public Dialog k2(@Nullable Bundle savedInstanceState) {
        final Dialog dialogK2 = super.k2(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogK2, "onCreateDialog(...)");
        dialogK2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: op.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                e.H2(dialogK2, this, dialogInterface);
            }
        });
        return dialogK2;
    }
}
