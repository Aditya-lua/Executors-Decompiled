package qr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqr/u5;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "b", "(Lqr/u5;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w5 {
    @NotNull
    public static final PersonaTextView b(@NotNull TitleComponent titleComponent, @NotNull z5 uiComponentHelper, @NotNull final Title config) {
        Intrinsics.checkNotNullParameter(titleComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.y yVarC = ur.y.c(uiComponentHelper.getLayoutInflater());
        Title.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            if (StringsKt.p0(attributes.getText())) {
                yVarC.getRoot().setVisibility(8);
            } else {
                PersonaTextView textView = yVarC.b;
                Intrinsics.checkNotNullExpressionValue(textView, "textView");
                sr.h.e(textView, attributes.getText());
                uiComponentHelper.d(new Function0() { // from class: qr.v5
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w5.c(config, yVarC);
                    }
                });
            }
        }
        PersonaTextView root = yVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(Title title, ur.y yVar) {
        TextBasedComponentStyle styles = title.getStyles();
        if (styles != null) {
            PersonaTextView textView = yVar.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            yr.h0.l(textView, styles, null, 2, null);
        }
        return Unit.f21506a;
    }
}
