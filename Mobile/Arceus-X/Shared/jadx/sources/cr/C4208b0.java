package cr;

import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ImagePreviewComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p227jr.C7301g;
import p313nq.C9552h;

/* JADX INFO: renamed from: cr.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "config", "Landroid/widget/ImageView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4208b0 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ImageView m21737b(@NotNull ImagePreviewComponent imagePreviewComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final CombinedStepImagePreview config) {
        Intrinsics.checkNotNullParameter(imagePreviewComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C9552h c9552hM37693c = C9552h.m37693c(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.m22002d(new Function0() { // from class: cr.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4208b0.m21738c(c9552hM37693c, config);
            }
        });
        ImageView root = c9552hM37693c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21738c(C9552h c9552h, CombinedStepImagePreview combinedStepImagePreview) {
        ImageView imageView = c9552h.f34531b;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        C7301g.m30369b(imageView, combinedStepImagePreview.getStyles());
        return Unit.f29331a;
    }
}
