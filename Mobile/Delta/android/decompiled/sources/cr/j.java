package cr;

import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButton;", "config", "Lcom/google/android/material/button/MaterialButton;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButton;)Lcom/google/android/material/button/MaterialButton;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    @NotNull
    public static final MaterialButton a(@NotNull CompleteButtonComponent completeButtonComponent, @NotNull y4 uiComponentHelper, @NotNull CompleteButton config) {
        Intrinsics.checkNotNullParameter(completeButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        return com.withpersona.sdk2.inquiry.steps.ui.components.b.c(completeButtonComponent, uiComponentHelper, config);
    }
}
