package cr;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.TitleComponent;
import er.C5199h;
import gr.C6237y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p227jr.C7304h0;

/* JADX INFO: renamed from: cr.x4 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;", "config", "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4346x4 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final PersonaTextView m21986b(@NotNull TitleComponent titleComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final Title config) {
        Intrinsics.checkNotNullParameter(titleComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6237y c6237yM27436c = C6237y.m27436c(uiComponentHelper.getLayoutInflater());
        Title.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            if (StringsKt.m32182p0(attributes.getText())) {
                c6237yM27436c.getRoot().setVisibility(8);
            } else {
                PersonaTextView textView = c6237yM27436c.f23752b;
                Intrinsics.checkNotNullExpressionValue(textView, "textView");
                C5199h.m24129e(textView, attributes.getText());
                uiComponentHelper.m22002d(new Function0() { // from class: cr.w4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4346x4.m21987c(config, c6237yM27436c);
                    }
                });
            }
        }
        PersonaTextView root = c6237yM27436c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21987c(Title title, C6237y c6237y) {
        TextBasedComponentStyle styles = title.getStyles();
        if (styles != null) {
            PersonaTextView textView = c6237y.f23752b;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            C7304h0.m30392l(textView, styles, null, 2, null);
        }
        return Unit.f29331a;
    }
}
