package qr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqr/d6;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "a", "(Lqr/d6;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e6 {
    @Nullable
    public static final ButtonWithLoadingIndicator a(@NotNull d6 d6Var, @NotNull z5 uiComponentHelper, @NotNull VerifyPersonaButton config) {
        Intrinsics.checkNotNullParameter(d6Var, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        if (d6Var.getUrl() != null) {
            return com.withpersona.sdk2.inquiry.steps.ui.components.g.e(d6Var, uiComponentHelper, config);
        }
        return null;
    }
}
