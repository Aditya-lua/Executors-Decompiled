package cr;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.PrivacyPolicyComponent;
import er.C5199h;
import gr.C6233u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.y3 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4351y3 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final PersonaTextView m21997b(@NotNull PrivacyPolicyComponent privacyPolicyComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final PrivacyPolicy config) {
        Intrinsics.checkNotNullParameter(privacyPolicyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6233u c6233uM27420c = C6233u.m27420c(uiComponentHelper.getLayoutInflater());
        PrivacyPolicy.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            PersonaTextView textView = c6233uM27420c.f23739b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            C5199h.m24129e(textView, attributes.getText());
            uiComponentHelper.m22002d(new Function0() { // from class: cr.x3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4351y3.m21998c(config, c6233uM27420c);
                }
            });
        }
        PersonaTextView root = c6233uM27420c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21998c(PrivacyPolicy privacyPolicy, C6233u c6233u) {
        TextBasedComponentStyle styles = privacyPolicy.getStyles();
        if (styles != null) {
            PersonaTextView textView = c6233u.f23739b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            C7304h0.m30392l(textView, styles, null, 2, null);
        }
        return Unit.f29331a;
    }
}
