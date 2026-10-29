package cr;

import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CancelButtonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cr.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;", "config", "Lcom/google/android/material/button/MaterialButton;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;)Lcom/google/android/material/button/MaterialButton;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4233f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final MaterialButton m21762a(@NotNull CancelButtonComponent cancelButtonComponent, @NotNull C4352y4 uiComponentHelper, @NotNull CancelButton config) {
        Intrinsics.checkNotNullParameter(cancelButtonComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        return C4086b.m20886c(cancelButtonComponent, uiComponentHelper, config);
    }
}
