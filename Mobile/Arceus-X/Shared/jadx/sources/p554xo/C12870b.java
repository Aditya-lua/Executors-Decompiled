package p554xo;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonActionComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xo.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonActionComponentStyle;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonActionComponentStyle;", "integration_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12870b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ButtonActionComponentStyle m47901a(@NotNull ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
        Intrinsics.checkNotNullParameter(buttonSubmitComponentStyle, "<this>");
        return new ButtonActionComponentStyle(buttonSubmitComponentStyle.getPadding(), buttonSubmitComponentStyle.getMargin(), new AttributeStyles.ButtonBasedJustifyStyle(new StyleElements.Position(StyleElements.PositionType.END)), buttonSubmitComponentStyle.getFontFamily(), buttonSubmitComponentStyle.getFontSize(), buttonSubmitComponentStyle.getFontWeight(), buttonSubmitComponentStyle.getLetterSpacing(), buttonSubmitComponentStyle.getLineHeight(), buttonSubmitComponentStyle.getTextColor(), buttonSubmitComponentStyle.getHeight(), buttonSubmitComponentStyle.getWidth(), buttonSubmitComponentStyle.getBackgroundColor(), buttonSubmitComponentStyle.getBorderColor(), buttonSubmitComponentStyle.getBorderRadius(), buttonSubmitComponentStyle.getBorderWidth());
    }
}
