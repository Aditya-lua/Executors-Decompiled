package qr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqr/f;", "Lqr/z5;", "uiComponentHelper", "Landroid/view/View;", "b", "(Lqr/f;Lqr/z5;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    @Nullable
    public static final View b(@NotNull BrandingComponent brandingComponent, @NotNull z5 uiComponentHelper) {
        Intrinsics.checkNotNullParameter(brandingComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Context context = uiComponentHelper.getContext();
        if (!brandingComponent.getShowBranding()) {
            return null;
        }
        final ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setImageResource(jq.d.f20855c);
        shapeableImageView.setAdjustViewBounds(true);
        shapeableImageView.setContentDescription(brandingComponent.getContentDescription());
        shapeableImageView.setPadding(shapeableImageView.getPaddingLeft(), (int) xq.j.a(16.0d), shapeableImageView.getPaddingRight(), shapeableImageView.getPaddingBottom());
        uiComponentHelper.d(new Function0() { // from class: qr.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.c(shapeableImageView);
            }
        });
        return shapeableImageView;
    }

    public static final Unit c(ShapeableImageView shapeableImageView) {
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.G = 1.0f;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        shapeableImageView.setLayoutParams(bVar);
        return Unit.f21506a;
    }
}
