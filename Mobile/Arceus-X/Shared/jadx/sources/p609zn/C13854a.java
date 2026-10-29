package p609zn;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCombinedStepComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zn.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "document_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13854a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ButtonCombinedStepComponentStyle m50426a(@NotNull ButtonCancelComponentStyle buttonCancelComponentStyle) {
        Intrinsics.checkNotNullParameter(buttonCancelComponentStyle, "<this>");
        return new ButtonCombinedStepComponentStyle(buttonCancelComponentStyle.getPadding(), buttonCancelComponentStyle.getMargin(), buttonCancelComponentStyle.getJustify(), buttonCancelComponentStyle.getFontFamily(), buttonCancelComponentStyle.getFontSize(), buttonCancelComponentStyle.getFontWeight(), buttonCancelComponentStyle.getLetterSpacing(), buttonCancelComponentStyle.getLineHeight(), buttonCancelComponentStyle.getTextColor(), buttonCancelComponentStyle.getHeight(), buttonCancelComponentStyle.getWidth(), buttonCancelComponentStyle.getBackgroundColor(), buttonCancelComponentStyle.getBorderColor(), buttonCancelComponentStyle.getBorderRadius(), buttonCancelComponentStyle.getBorderWidth());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ButtonCombinedStepComponentStyle m50427b(@NotNull ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
        Intrinsics.checkNotNullParameter(buttonSubmitComponentStyle, "<this>");
        return new ButtonCombinedStepComponentStyle(buttonSubmitComponentStyle.getPadding(), buttonSubmitComponentStyle.getMargin(), buttonSubmitComponentStyle.getJustify(), buttonSubmitComponentStyle.getFontFamily(), buttonSubmitComponentStyle.getFontSize(), buttonSubmitComponentStyle.getFontWeight(), buttonSubmitComponentStyle.getLetterSpacing(), buttonSubmitComponentStyle.getLineHeight(), buttonSubmitComponentStyle.getTextColor(), buttonSubmitComponentStyle.getHeight(), buttonSubmitComponentStyle.getWidth(), buttonSubmitComponentStyle.getBackgroundColor(), buttonSubmitComponentStyle.getBorderColor(), buttonSubmitComponentStyle.getBorderRadius(), buttonSubmitComponentStyle.getBorderWidth());
    }
}
