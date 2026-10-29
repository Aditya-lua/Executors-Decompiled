package com.withpersona.sdk2.inquiry.governmentid.captureTips;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import er.h;
import jq.j;
import jr.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lr.c;
import no.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/captureTips/StaticCaptureTipsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Title.type, "subtext", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "iconAsset", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)V", "Lno/l;", "Lno/l;", "binding", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StaticCaptureTipsView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(@Nullable String title, @Nullable String subtext, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage iconAsset, @Nullable StepStyles.GovernmentIdStepStyle styles) {
        Double staticCaptureTipsBorderRadius;
        Integer staticCaptureTipsBackgroundColor;
        TextBasedComponentStyle staticCaptureTipsSubtextStyle;
        TextBasedComponentStyle staticCaptureTipsTitleStyle;
        RemoteImage staticCaptureTipsIconPictograph;
        TextView title2 = this.binding.f26591e;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        if (title == null) {
            title = "";
        }
        h.e(title2, title);
        TextView subtext2 = this.binding.f26590d;
        Intrinsics.checkNotNullExpressionValue(subtext2, "subtext");
        if (subtext == null) {
            subtext = "";
        }
        h.e(subtext2, subtext);
        if (iconAsset != null && (staticCaptureTipsIconPictograph = iconAsset.getStaticCaptureTipsIconPictograph()) != null) {
            ConstraintLayout iconContainer = this.binding.f26589c;
            Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
            c.f(staticCaptureTipsIconPictograph, iconContainer, false, 2, null);
            this.binding.b.setVisibility(8);
        }
        if (styles != null && (staticCaptureTipsTitleStyle = styles.getStaticCaptureTipsTitleStyle()) != null) {
            TextView title3 = this.binding.f26591e;
            Intrinsics.checkNotNullExpressionValue(title3, "title");
            h0.l(title3, staticCaptureTipsTitleStyle, null, 2, null);
        }
        if (styles != null && (staticCaptureTipsSubtextStyle = styles.getStaticCaptureTipsSubtextStyle()) != null) {
            TextView subtext3 = this.binding.f26590d;
            Intrinsics.checkNotNullExpressionValue(subtext3, "subtext");
            h0.l(subtext3, staticCaptureTipsSubtextStyle, null, 2, null);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-3355444);
        gradientDrawable.setCornerRadius(8.0f);
        if (styles != null && (staticCaptureTipsBackgroundColor = styles.getStaticCaptureTipsBackgroundColor()) != null) {
            gradientDrawable.setColor(staticCaptureTipsBackgroundColor.intValue());
        }
        if (styles != null && (staticCaptureTipsBorderRadius = styles.getStaticCaptureTipsBorderRadius()) != null) {
            gradientDrawable.setCornerRadius((float) j.a(staticCaptureTipsBorderRadius.doubleValue()));
        }
        this.binding.getRoot().setBackground(gradientDrawable);
    }

    public /* synthetic */ StaticCaptureTipsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        l lVarC = l.c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(lVarC, "inflate(...)");
        this.binding = lVarC;
    }
}
