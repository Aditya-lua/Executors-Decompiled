package es;

import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import qr.ActionButtonComponent;
import qr.CancelButtonComponent;
import qr.CompleteButtonComponent;
import qr.SubmitButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr/x5;", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "a", "(Lqr/x5;)Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m4 {
    @Nullable
    public static final UiStepButtonType a(@NotNull qr.x5 x5Var) {
        Intrinsics.checkNotNullParameter(x5Var, "<this>");
        if (x5Var instanceof ActionButtonComponent) {
            return UiStepButtonType.Action;
        }
        if (x5Var instanceof CompleteButtonComponent) {
            return UiStepButtonType.Complete;
        }
        if (x5Var instanceof SubmitButtonComponent) {
            return UiStepButtonType.Submit;
        }
        if (x5Var instanceof CancelButtonComponent) {
            return UiStepButtonType.Cancel;
        }
        if (x5Var instanceof ClickableStackComponent) {
            return UiStepButtonType.ClickableStack;
        }
        if (x5Var instanceof qr.d6) {
            return UiStepButtonType.ReusablePersona;
        }
        if (x5Var instanceof GovernmentIdNfcScanComponent) {
            return UiStepButtonType.Nfc;
        }
        if (x5Var instanceof MdocComponent) {
            return UiStepButtonType.Mdoc;
        }
        return null;
    }
}
