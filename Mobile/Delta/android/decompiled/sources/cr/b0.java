package cr;

import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "config", "Landroid/widget/ImageView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {
    @NotNull
    public static final ImageView b(@NotNull ImagePreviewComponent imagePreviewComponent, @NotNull y4 uiComponentHelper, @NotNull final CombinedStepImagePreview config) {
        Intrinsics.checkNotNullParameter(imagePreviewComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final nq.h hVarC = nq.h.c(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.d(new Function0() { // from class: cr.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.c(hVarC, config);
            }
        });
        ImageView root = hVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(nq.h hVar, CombinedStepImagePreview combinedStepImagePreview) {
        ImageView imageView = hVar.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        jr.g.b(imageView, combinedStepImagePreview.getStyles());
        return Unit.f22483a;
    }
}
