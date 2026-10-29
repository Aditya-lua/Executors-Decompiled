package cr;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cr.f2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcr/f2;", "", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "scanButton", "Landroid/widget/TextView;", "errorLabel", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/TextView;)V", "a", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "b", "()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4236f2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ButtonWithLoadingIndicator scanButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TextView errorLabel;

    public C4236f2(@NotNull ButtonWithLoadingIndicator scanButton, @NotNull TextView errorLabel) {
        Intrinsics.checkNotNullParameter(scanButton, "scanButton");
        Intrinsics.checkNotNullParameter(errorLabel, "errorLabel");
        this.scanButton = scanButton;
        this.errorLabel = errorLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextView getErrorLabel() {
        return this.errorLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonWithLoadingIndicator getScanButton() {
        return this.scanButton;
    }
}
