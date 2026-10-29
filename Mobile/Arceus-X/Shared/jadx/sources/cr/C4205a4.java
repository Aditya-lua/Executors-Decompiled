package cr;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.QRCodeComponent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mg.C8522c;
import mg.EnumC8520a;
import mg.EnumC8521b;
import mr.C8652d;
import ng.C9471b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import pg.C10251a;

/* JADX INFO: renamed from: cr.a4 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "config", "Landroid/widget/ImageView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4205a4 {

    /* JADX INFO: renamed from: cr.a4$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17992a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17992a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ImageView m21734b(@NotNull QRCodeComponent qRCodeComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final QRCode config) {
        String value;
        Intrinsics.checkNotNullParameter(qRCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        QRCode.Attributes attributes = config.getAttributes();
        if (attributes != null && (value = attributes.getValue()) != null) {
            int width = qRCodeComponent.getWidth();
            HashMap map = new HashMap();
            map.put(EnumC8521b.MARGIN, 0);
            try {
                C9471b c9471bM39405a = new C10251a().m39405a(value, EnumC8520a.QR_CODE, width, width, map);
                Integer strokeColor = config.getStrokeColor();
                int iIntValue = strokeColor != null ? strokeColor.intValue() : ViewCompat.MEASURED_STATE_MASK;
                Integer fillColor = config.getFillColor();
                int iIntValue2 = fillColor != null ? fillColor.intValue() : -1;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
                for (int i10 = 0; i10 < width; i10++) {
                    for (int i11 = 0; i11 < width; i11++) {
                        bitmapCreateBitmap.setPixel(i10, i11, c9471bM39405a.m37317c(i10, i11) ? iIntValue : iIntValue2);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
                final ImageView imageView = new ImageView(uiComponentHelper.getContext());
                imageView.setImageBitmap(bitmapCreateBitmap);
                uiComponentHelper.m22002d(new Function0() { // from class: cr.z3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4205a4.m21735c(config, imageView);
                    }
                });
                return imageView;
            } catch (C8522c unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21735c(QRCode qRCode, ImageView imageView) {
        float f10;
        StyleElements.SizeSet margin = qRCode.getMargin();
        if (margin != null) {
            C8652d.m34730c(imageView, margin);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = qRCode.getJustification();
        if (justification != null && (layoutParams instanceof ConstraintLayout.C0513b)) {
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0513b).width = -2;
            int i10 = a.f17992a[justification.ordinal()];
            if (i10 == 1) {
                f10 = 0.0f;
            } else if (i10 == 2) {
                f10 = 0.5f;
            } else {
                if (i10 != 3) {
                    throw new C7345l();
                }
                f10 = 1.0f;
            }
            c0513b.f1962G = f10;
        }
        imageView.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }
}
