package or;

import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b4 {
    @Nullable
    public static final UiStepButtonType a(@NotNull UiComponent uiComponent) {
        Intrinsics.checkNotNullParameter(uiComponent, "<this>");
        if (uiComponent instanceof ActionButtonComponent) {
            return UiStepButtonType.Action;
        }
        if (uiComponent instanceof CompleteButtonComponent) {
            return UiStepButtonType.Complete;
        }
        if (uiComponent instanceof SubmitButtonComponent) {
            return UiStepButtonType.Submit;
        }
        if (uiComponent instanceof CancelButtonComponent) {
            return UiStepButtonType.Cancel;
        }
        if (uiComponent instanceof ClickableStackComponent) {
            return UiStepButtonType.ClickableStack;
        }
        if (uiComponent instanceof VerifyPersonaButtonComponent) {
            return UiStepButtonType.ReusablePersona;
        }
        if (uiComponent instanceof GovernmentIdNfcScanComponent) {
            return UiStepButtonType.Nfc;
        }
        if (uiComponent instanceof MdocComponent) {
            return UiStepButtonType.Mdoc;
        }
        return null;
    }
}
