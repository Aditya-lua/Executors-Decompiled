package cr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y3 {
    @NotNull
    public static final PersonaTextView b(@NotNull PrivacyPolicyComponent privacyPolicyComponent, @NotNull y4 uiComponentHelper, @NotNull final PrivacyPolicy config) {
        Intrinsics.checkNotNullParameter(privacyPolicyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.u uVarC = gr.u.c(uiComponentHelper.getLayoutInflater());
        PrivacyPolicy.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            PersonaTextView textView = uVarC.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            er.h.e(textView, attributes.getText());
            uiComponentHelper.d(new Function0() { // from class: cr.x3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y3.c(config, uVarC);
                }
            });
        }
        PersonaTextView root = uVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(PrivacyPolicy privacyPolicy, gr.u uVar) {
        TextBasedComponentStyle styles = privacyPolicy.getStyles();
        if (styles != null) {
            PersonaTextView textView = uVar.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            jr.h0.l(textView, styles, null, 2, null);
        }
        return Unit.f22483a;
    }
}
