package cr;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "config", "Landroid/widget/ImageView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a4 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14095a;

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
            f14095a = iArr;
        }
    }

    @Nullable
    public static final ImageView b(@NotNull QRCodeComponent qRCodeComponent, @NotNull y4 uiComponentHelper, @NotNull final QRCode config) {
        String value;
        Intrinsics.checkNotNullParameter(qRCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        QRCode.Attributes attributes = config.getAttributes();
        if (attributes != null && (value = attributes.getValue()) != null) {
            int width = qRCodeComponent.getWidth();
            HashMap map = new HashMap();
            map.put(lg.b.MARGIN, 0);
            try {
                mg.b bVarA = new og.a().a(value, lg.a.QR_CODE, width, width, map);
                Integer strokeColor = config.getStrokeColor();
                int iIntValue = strokeColor != null ? strokeColor.intValue() : -16777216;
                Integer fillColor = config.getFillColor();
                int iIntValue2 = fillColor != null ? fillColor.intValue() : -1;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
                for (int i10 = 0; i10 < width; i10++) {
                    for (int i11 = 0; i11 < width; i11++) {
                        bitmapCreateBitmap.setPixel(i10, i11, bVarA.c(i10, i11) ? iIntValue : iIntValue2);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
                final ImageView imageView = new ImageView(uiComponentHelper.getContext());
                imageView.setImageBitmap(bitmapCreateBitmap);
                uiComponentHelper.d(new Function0() { // from class: cr.z3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a4.c(config, imageView);
                    }
                });
                return imageView;
            } catch (lg.c unused) {
            }
        }
        return null;
    }

    public static final Unit c(QRCode qRCode, ImageView imageView) {
        float f10;
        StyleElements.SizeSet margin = qRCode.getMargin();
        if (margin != null) {
            mr.d.c(imageView, margin);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = qRCode.getJustification();
        if (justification != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
            int i10 = a.f14095a[justification.ordinal()];
            if (i10 == 1) {
                f10 = 0.0f;
            } else if (i10 == 2) {
                f10 = 0.5f;
            } else {
                if (i10 != 3) {
                    throw new jt.l();
                }
                f10 = 1.0f;
            }
            bVar.G = f10;
        }
        imageView.setLayoutParams(layoutParams);
        return Unit.f22483a;
    }
}
