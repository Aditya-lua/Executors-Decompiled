package qr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqr/n4;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "b", "(Lqr/n4;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p4 {
    @NotNull
    public static final PersonaTextView b(@NotNull PrivacyPolicyComponent privacyPolicyComponent, @NotNull z5 uiComponentHelper, @NotNull final PrivacyPolicy config) {
        Intrinsics.checkNotNullParameter(privacyPolicyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.u uVarC = ur.u.c(uiComponentHelper.getLayoutInflater());
        PrivacyPolicy.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            PersonaTextView textView = uVarC.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            sr.h.e(textView, attributes.getText());
            uiComponentHelper.d(new Function0() { // from class: qr.o4
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p4.c(config, uVarC);
                }
            });
        }
        PersonaTextView root = uVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(PrivacyPolicy privacyPolicy, ur.u uVar) {
        TextBasedComponentStyle styles = privacyPolicy.getStyles();
        if (styles != null) {
            PersonaTextView textView = uVar.b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            yr.h0.l(textView, styles, null, 2, null);
        }
        return Unit.f21506a;
    }
}
