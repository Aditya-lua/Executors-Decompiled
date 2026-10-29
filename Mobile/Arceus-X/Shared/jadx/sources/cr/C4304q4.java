package cr;

import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SpacerComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cr.q4 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "Lcr/y4;", "uiComponentHelper", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;Lcr/y4;)Landroid/view/View;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4304q4 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final View m21916b(@NotNull final SpacerComponent spacerComponent, @NotNull C4352y4 uiComponentHelper) {
        Intrinsics.checkNotNullParameter(spacerComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        final View view = new View(uiComponentHelper.getContext());
        uiComponentHelper.m22002d(new Function0() { // from class: cr.p4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4304q4.m21917c(view, spacerComponent);
            }
        });
        return view;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21917c(View view, SpacerComponent spacerComponent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = C7764d.m32078c(spacerComponent.getHeight(), 1);
        layoutParams.width = C7764d.m32078c(spacerComponent.getWidth(), 1);
        view.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }
}
