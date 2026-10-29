package cr;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcr/v3;", "", "Landroid/view/View;", "launchButton", "Landroid/widget/TextView;", "errorLabel", "<init>", "(Landroid/view/View;Landroid/widget/TextView;)V", "a", "Landroid/view/View;", "b", "()Landroid/view/View;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View launchButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TextView errorLabel;

    public v3(@NotNull View launchButton, @NotNull TextView errorLabel) {
        Intrinsics.checkNotNullParameter(launchButton, "launchButton");
        Intrinsics.checkNotNullParameter(errorLabel, "errorLabel");
        this.launchButton = launchButton;
        this.errorLabel = errorLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextView getErrorLabel() {
        return this.errorLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getLaunchButton() {
        return this.launchButton;
    }
}
