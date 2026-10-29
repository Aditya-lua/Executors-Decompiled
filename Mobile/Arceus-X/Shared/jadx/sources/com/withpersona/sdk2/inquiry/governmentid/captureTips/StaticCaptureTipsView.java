package com.withpersona.sdk2.inquiry.governmentid.captureTips;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import er.C5199h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lr.C8243c;
import no.C9536l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p227jr.C7304h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/captureTips/StaticCaptureTipsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Title.type, "subtext", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "iconAsset", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)V", "Lno/l;", "Lno/l;", "binding", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class StaticCaptureTipsView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C9536l binding;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m17511a(@Nullable String title, @Nullable String subtext, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage iconAsset, @Nullable StepStyles.GovernmentIdStepStyle styles) {
        Double staticCaptureTipsBorderRadius;
        Integer staticCaptureTipsBackgroundColor;
        TextBasedComponentStyle staticCaptureTipsSubtextStyle;
        TextBasedComponentStyle staticCaptureTipsTitleStyle;
        RemoteImage staticCaptureTipsIconPictograph;
        TextView title2 = this.binding.f34450e;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        if (title == null) {
            title = "";
        }
        C5199h.m24129e(title2, title);
        TextView subtext2 = this.binding.f34449d;
        Intrinsics.checkNotNullExpressionValue(subtext2, "subtext");
        if (subtext == null) {
            subtext = "";
        }
        C5199h.m24129e(subtext2, subtext);
        if (iconAsset != null && (staticCaptureTipsIconPictograph = iconAsset.getStaticCaptureTipsIconPictograph()) != null) {
            ConstraintLayout iconContainer = this.binding.f34448c;
            Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
            C8243c.m33618f(staticCaptureTipsIconPictograph, iconContainer, false, 2, null);
            this.binding.f34447b.setVisibility(8);
        }
        if (styles != null && (staticCaptureTipsTitleStyle = styles.getStaticCaptureTipsTitleStyle()) != null) {
            TextView title3 = this.binding.f34450e;
            Intrinsics.checkNotNullExpressionValue(title3, "title");
            C7304h0.m30392l(title3, staticCaptureTipsTitleStyle, null, 2, null);
        }
        if (styles != null && (staticCaptureTipsSubtextStyle = styles.getStaticCaptureTipsSubtextStyle()) != null) {
            TextView subtext3 = this.binding.f34449d;
            Intrinsics.checkNotNullExpressionValue(subtext3, "subtext");
            C7304h0.m30392l(subtext3, staticCaptureTipsSubtextStyle, null, 2, null);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-3355444);
        gradientDrawable.setCornerRadius(8.0f);
        if (styles != null && (staticCaptureTipsBackgroundColor = styles.getStaticCaptureTipsBackgroundColor()) != null) {
            gradientDrawable.setColor(staticCaptureTipsBackgroundColor.intValue());
        }
        if (styles != null && (staticCaptureTipsBorderRadius = styles.getStaticCaptureTipsBorderRadius()) != null) {
            gradientDrawable.setCornerRadius((float) C7265j.m30285a(staticCaptureTipsBorderRadius.doubleValue()));
        }
        this.binding.getRoot().setBackground(gradientDrawable);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ StaticCaptureTipsView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCaptureTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        C9536l c9536lM37645c = C9536l.m37645c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c9536lM37645c, "inflate(...)");
        this.binding = c9536lM37645c;
    }
}
