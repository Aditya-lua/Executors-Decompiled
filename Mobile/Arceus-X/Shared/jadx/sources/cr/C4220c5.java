package cr;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.VerifyPersonaButtonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cr.c5 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4220c5 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ButtonWithLoadingIndicator m21746a(@NotNull VerifyPersonaButtonComponent verifyPersonaButtonComponent, @NotNull C4352y4 uiComponentHelper, @NotNull VerifyPersonaButton config) {
        Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        if (verifyPersonaButtonComponent.getUrl() != null) {
            return C4086b.m20888e(verifyPersonaButtonComponent, uiComponentHelper, config);
        }
        return null;
    }
}
