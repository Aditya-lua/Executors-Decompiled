package cr;

import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "Lcr/y4;", "uiComponentHelper", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;Lcr/y4;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q4 {
    @NotNull
    public static final View b(@NotNull final SpacerComponent spacerComponent, @NotNull y4 uiComponentHelper) {
        Intrinsics.checkNotNullParameter(spacerComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        final View view = new View(uiComponentHelper.getContext());
        uiComponentHelper.d(new Function0() { // from class: cr.p4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q4.c(view, spacerComponent);
            }
        });
        return view;
    }

    public static final Unit c(View view, SpacerComponent spacerComponent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = kotlin.ranges.d.c(spacerComponent.getHeight(), 1);
        layoutParams.width = kotlin.ranges.d.c(spacerComponent.getWidth(), 1);
        view.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }
}
