package cr;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import gr.C6218f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cr.w */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, m31665d2 = {"Lcr/w;", "", "Lcom/google/android/material/textfield/TextInputLayout;", "cardAccessNumber", "documentNumber", "Lgr/f;", "dateOfBirthBinding", "expirationDateBinding", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "launchButton", "Landroid/view/View;", "tipsButton", "Landroid/widget/TextView;", "errorLabel", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lgr/f;Lgr/f;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/view/View;Landroid/widget/TextView;)V", "a", "Lcom/google/android/material/textfield/TextInputLayout;", "()Lcom/google/android/material/textfield/TextInputLayout;", "b", "c", "Lgr/f;", "()Lgr/f;", "d", "e", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "f", "()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/view/View;", "g", "()Landroid/view/View;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4335w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TextInputLayout cardAccessNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TextInputLayout documentNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C6218f dateOfBirthBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C6218f expirationDateBinding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ButtonWithLoadingIndicator launchButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final View tipsButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final TextView errorLabel;

    public C4335w(@NotNull TextInputLayout cardAccessNumber, @NotNull TextInputLayout documentNumber, @NotNull C6218f dateOfBirthBinding, @NotNull C6218f expirationDateBinding, @NotNull ButtonWithLoadingIndicator launchButton, @Nullable View view, @NotNull TextView errorLabel) {
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirthBinding, "dateOfBirthBinding");
        Intrinsics.checkNotNullParameter(expirationDateBinding, "expirationDateBinding");
        Intrinsics.checkNotNullParameter(launchButton, "launchButton");
        Intrinsics.checkNotNullParameter(errorLabel, "errorLabel");
        this.cardAccessNumber = cardAccessNumber;
        this.documentNumber = documentNumber;
        this.dateOfBirthBinding = dateOfBirthBinding;
        this.expirationDateBinding = expirationDateBinding;
        this.launchButton = launchButton;
        this.tipsButton = view;
        this.errorLabel = errorLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextInputLayout getCardAccessNumber() {
        return this.cardAccessNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C6218f getDateOfBirthBinding() {
        return this.dateOfBirthBinding;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextInputLayout getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextView getErrorLabel() {
        return this.errorLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C6218f getExpirationDateBinding() {
        return this.expirationDateBinding;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ButtonWithLoadingIndicator getLaunchButton() {
        return this.launchButton;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final View getTipsButton() {
        return this.tipsButton;
    }
}
