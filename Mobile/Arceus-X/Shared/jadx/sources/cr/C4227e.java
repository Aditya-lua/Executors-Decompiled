package cr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.BrandingComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p497vp.C12241d;

/* JADX INFO: renamed from: cr.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;", "Lcr/y4;", "uiComponentHelper", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;Lcr/y4;)Landroid/view/View;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4227e {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final View m21748b(@NotNull BrandingComponent brandingComponent, @NotNull C4352y4 uiComponentHelper) {
        Intrinsics.checkNotNullParameter(brandingComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Context context = uiComponentHelper.getContext();
        if (!brandingComponent.getShowBranding()) {
            return null;
        }
        final ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setImageResource(C12241d.f43201c);
        shapeableImageView.setAdjustViewBounds(true);
        shapeableImageView.setContentDescription(brandingComponent.getContentDescription());
        shapeableImageView.setPadding(shapeableImageView.getPaddingLeft(), (int) C7265j.m30285a(16.0d), shapeableImageView.getPaddingRight(), shapeableImageView.getPaddingBottom());
        uiComponentHelper.m22002d(new Function0() { // from class: cr.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4227e.m21749c(shapeableImageView);
            }
        });
        return shapeableImageView;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21749c(ShapeableImageView shapeableImageView) {
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
        c0513b.f1962G = 1.0f;
        ((ViewGroup.MarginLayoutParams) c0513b).width = -2;
        ((ViewGroup.MarginLayoutParams) c0513b).height = -2;
        shapeableImageView.setLayoutParams(c0513b);
        return Unit.f29331a;
    }
}
