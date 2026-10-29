package cr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ESignatureComponent;
import gr.C6235w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import p027b7.InterfaceC1251c;
import p226jq.C7265j;
import p227jr.C7304h0;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p537x6.C12748i;
import p537x6.C12749j;
import p537x6.ImageRequest;

/* JADX INFO: renamed from: cr.q */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgr/w;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "", "b", "(Lgr/w;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4299q {

    /* JADX INFO: renamed from: cr.q$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m31665d2 = {"cr/q$a", "Lb7/c;", "Lk6/n;", "placeholder", "", "b", "(Lk6/n;)V", "error", "a", "result", "c", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC1251c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6235w f18118a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6235w f18119b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ESignatureComponent f18120c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C6235w f18121d;

        public a(C6235w c6235w, C6235w c6235w2, ESignatureComponent eSignatureComponent, C6235w c6235w3) {
            this.f18118a = c6235w;
            this.f18119b = c6235w2;
            this.f18120c = eSignatureComponent;
            this.f18121d = c6235w3;
        }

        @Override // p027b7.InterfaceC1251c
        /* JADX INFO: renamed from: a */
        public void mo6967a(InterfaceC7474n error) {
            this.f18119b.f23743b.setVisibility(0);
        }

        @Override // p027b7.InterfaceC1251c
        /* JADX INFO: renamed from: b */
        public void mo6968b(InterfaceC7474n placeholder) {
            this.f18118a.f23743b.setVisibility(8);
            this.f18118a.f23744c.setVisibility(8);
            this.f18118a.f23748g.setVisibility(8);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: k6.n */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p027b7.InterfaceC1251c
        /* JADX INFO: renamed from: c */
        public void mo6969c(InterfaceC7474n result) {
            Bitmap bitmap;
            BitmapDrawable bitmapDrawable = result instanceof BitmapDrawable ? (BitmapDrawable) result : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                return;
            }
            this.f18120c.getBitmapController().m24097c(bitmap);
            this.f18121d.f23748g.setVisibility(0);
            this.f18121d.f23744c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21909b(C6235w c6235w, ESignature.ESignatureComponentStyle eSignatureComponentStyle) {
        Drawable drawableMutate;
        TextView addSignatureLabel = c6235w.f23743b;
        Intrinsics.checkNotNullExpressionValue(addSignatureLabel, "addSignatureLabel");
        C7304h0.m30392l(addSignatureLabel, eSignatureComponentStyle.getInputTextStyle().getPlaceholderTextBasedStyle(), null, 2, null);
        Integer signaturePreviewBackgroundColor = eSignatureComponentStyle.getSignaturePreviewBackgroundColor();
        if (signaturePreviewBackgroundColor != null) {
            c6235w.f23747f.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
        }
        Integer fillColorValue = eSignatureComponentStyle.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue = fillColorValue.intValue();
            Drawable drawable = c6235w.f23744c.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setTint(iIntValue);
            }
        }
        TextView errorLabel = c6235w.f23745d;
        Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
        C7304h0.m30392l(errorLabel, eSignatureComponentStyle.getInputTextStyle().getErrorTextStyle(), null, 2, null);
        TextView label = c6235w.f23746e;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        C7304h0.m30392l(label, eSignatureComponentStyle.getInputTextStyle().getLabelTextBasedStyle(), null, 2, null);
        StyleElements.SizeSet margins = eSignatureComponentStyle.getMargins();
        if (margins != null) {
            ConstraintLayout root = c6235w.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C8652d.m34730c(root, margins);
        }
        Integer baseBorderColorValue = eSignatureComponentStyle.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            c6235w.f23747f.setStrokeColor(baseBorderColorValue.intValue());
        }
        Double borderWidthValue = eSignatureComponentStyle.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            c6235w.f23747f.setStrokeWidth((int) Math.ceil(C7265j.m30285a(borderWidthValue.doubleValue())));
        }
        Double borderRadiusValue = eSignatureComponentStyle.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            c6235w.f23747f.setRadius((float) C7265j.m30285a(borderRadiusValue.doubleValue()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ConstraintLayout m21910c(@NotNull final ESignatureComponent eSignatureComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final ESignature config) {
        Intrinsics.checkNotNullParameter(eSignatureComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6235w c6235wM27428c = C6235w.m27428c(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.m22002d(new Function0() { // from class: cr.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4299q.m21911d(config, c6235wM27428c, eSignatureComponent);
            }
        });
        c6235wM27428c.getRoot().setTag(c6235wM27428c);
        ConstraintLayout root = c6235wM27428c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m21911d(ESignature eSignature, C6235w c6235w, ESignatureComponent eSignatureComponent) {
        String prefill;
        ESignature.Attributes attributes = eSignature.getAttributes();
        if (attributes != null && (prefill = attributes.getPrefill()) != null) {
            Context context = c6235w.f23748g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InterfaceC7479s interfaceC7479sM31076d = C12749j.m47586c(C12748i.m47574b(new InterfaceC7479s.a(context), true), 100).m31076d();
            Context context2 = c6235w.f23748g.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            interfaceC7479sM31076d.mo31067c(new ImageRequest.a(context2).m47525c(prefill).m47543v(new a(c6235w, c6235w, eSignatureComponent, c6235w)).m47524b());
        }
        ESignature.ESignatureComponentStyle styles = eSignature.getStyles();
        if (styles != null) {
            Intrinsics.checkNotNull(c6235w);
            m21909b(c6235w, styles);
        }
        return Unit.f29331a;
    }
}
