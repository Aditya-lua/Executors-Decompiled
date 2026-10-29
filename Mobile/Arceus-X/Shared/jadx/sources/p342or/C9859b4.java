package p342or;

import com.withpersona.sdk2.inquiry.steps.p056ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: or.b4 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "ui_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9859b4 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final UiStepButtonType m38753a(@NotNull UiComponent uiComponent) {
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
