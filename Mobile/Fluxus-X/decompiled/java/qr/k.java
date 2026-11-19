package qr;

import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqr/j;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;", "config", "Lcom/google/android/material/button/MaterialButton;", "a", "(Lqr/j;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;)Lcom/google/android/material/button/MaterialButton;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    @NotNull
    public static final MaterialButton a(@NotNull CancelButtonComponent cancelButtonComponent, @NotNull z5 uiComponentHelper, @NotNull CancelButton config) {
        Intrinsics.checkNotNullParameter(cancelButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        return com.withpersona.sdk2.inquiry.steps.ui.components.g.c(cancelButtonComponent, uiComponentHelper, config);
    }
}
