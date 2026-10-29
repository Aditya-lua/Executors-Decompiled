package cr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v4 {
    @NotNull
    public static final PersonaTextView b(@NotNull TextComponent textComponent, @NotNull y4 uiComponentHelper, @NotNull final Text config) {
        Intrinsics.checkNotNullParameter(textComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.x xVarC = gr.x.c(uiComponentHelper.getLayoutInflater());
        Text.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            PersonaTextView textView = xVarC.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            er.h.e(textView, attributes.getText());
            uiComponentHelper.d(new Function0() { // from class: cr.u4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v4.c(config, xVarC);
                }
            });
        }
        PersonaTextView root = xVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(Text text, gr.x xVar) {
        TextBasedComponentStyle styles = text.getStyles();
        if (styles != null) {
            PersonaTextView textView = xVar.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            jr.h0.l(textView, styles, null, 2, null);
        }
        return Unit.f22483a;
    }
}
