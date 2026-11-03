package ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x6.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Ler/w;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "", "b", "(Ler/w;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"ar/q$a", "Lb7/c;", "Lk6/n;", "placeholder", "", "b", "(Lk6/n;)V", "error", "a", "result", "c", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements b7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ er.w f3590a;
        public final /* synthetic */ er.w b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ESignatureComponent f3591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ er.w f3592d;

        public a(er.w wVar, er.w wVar2, ESignatureComponent eSignatureComponent, er.w wVar3) {
            this.f3590a = wVar;
            this.b = wVar2;
            this.f3591c = eSignatureComponent;
            this.f3592d = wVar3;
        }

        @Override // b7.c
        public void a(k6.n error) {
            this.b.b.setVisibility(0);
        }

        @Override // b7.c
        public void b(k6.n placeholder) {
            this.f3590a.b.setVisibility(8);
            this.f3590a.f16362c.setVisibility(8);
            this.f3590a.f16366g.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b7.c
        public void c(k6.n result) {
            Bitmap bitmap;
            BitmapDrawable bitmapDrawable = result instanceof BitmapDrawable ? (BitmapDrawable) result : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                return;
            }
            this.f3591c.getBitmapController().c(bitmap);
            this.f3592d.f16366g.setVisibility(0);
            this.f3592d.f16362c.setVisibility(0);
        }
    }

    public static final void b(er.w wVar, ESignature.ESignatureComponentStyle eSignatureComponentStyle) {
        Drawable drawableMutate;
        TextView addSignatureLabel = wVar.b;
        Intrinsics.checkNotNullExpressionValue(addSignatureLabel, "addSignatureLabel");
        hr.h0.l(addSignatureLabel, eSignatureComponentStyle.getInputTextStyle().getPlaceholderTextBasedStyle(), null, 2, null);
        Integer signaturePreviewBackgroundColor = eSignatureComponentStyle.getSignaturePreviewBackgroundColor();
        if (signaturePreviewBackgroundColor != null) {
            wVar.f16365f.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
        }
        Integer fillColorValue = eSignatureComponentStyle.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue = fillColorValue.intValue();
            Drawable drawable = wVar.f16362c.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setTint(iIntValue);
            }
        }
        TextView errorLabel = wVar.f16363d;
        Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
        hr.h0.l(errorLabel, eSignatureComponentStyle.getInputTextStyle().getErrorTextStyle(), null, 2, null);
        TextView label = wVar.f16364e;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        hr.h0.l(label, eSignatureComponentStyle.getInputTextStyle().getLabelTextBasedStyle(), null, 2, null);
        StyleElements.SizeSet margins = eSignatureComponentStyle.getMargins();
        if (margins != null) {
            ConstraintLayout root = wVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            kr.d.c(root, margins);
        }
        Integer baseBorderColorValue = eSignatureComponentStyle.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            wVar.f16365f.setStrokeColor(baseBorderColorValue.intValue());
        }
        Double borderWidthValue = eSignatureComponentStyle.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            wVar.f16365f.setStrokeWidth((int) Math.ceil(hq.j.a(borderWidthValue.doubleValue())));
        }
        Double borderRadiusValue = eSignatureComponentStyle.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            wVar.f16365f.setRadius((float) hq.j.a(borderRadiusValue.doubleValue()));
        }
    }

    @NotNull
    public static final ConstraintLayout c(@NotNull final ESignatureComponent eSignatureComponent, @NotNull y4 uiComponentHelper, @NotNull final ESignature config) {
        Intrinsics.checkNotNullParameter(eSignatureComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.w wVarC = er.w.c(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.d(new Function0() { // from class: ar.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.d(config, wVarC, eSignatureComponent);
            }
        });
        wVarC.getRoot().setTag(wVarC);
        ConstraintLayout root = wVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit d(ESignature eSignature, er.w wVar, ESignatureComponent eSignatureComponent) {
        String prefill;
        ESignature.Attributes attributes = eSignature.getAttributes();
        if (attributes != null && (prefill = attributes.getPrefill()) != null) {
            Context context = wVar.f16366g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            k6.s sVarD = x6.j.c(x6.i.b(new k6.s.a(context), true), 100).d();
            Context context2 = wVar.f16366g.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            sVarD.d(new ImageRequest.a(context2).c(prefill).v(new a(wVar, wVar, eSignatureComponent, wVar)).b());
        }
        ESignature.ESignatureComponentStyle styles = eSignature.getStyles();
        if (styles != null) {
            Intrinsics.checkNotNull(wVar);
            b(wVar, styles);
        }
        return Unit.f22938a;
    }
}
