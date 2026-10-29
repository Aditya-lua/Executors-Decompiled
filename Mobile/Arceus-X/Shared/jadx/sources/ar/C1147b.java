package ar;

import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ar.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1147b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final UiComponentScreen m6492a(@NotNull NestedUiStep nestedUiStep) {
        Intrinsics.checkNotNullParameter(nestedUiStep, "<this>");
        return new UiComponentScreen(nestedUiStep.getComponents(), nestedUiStep.mo16272W0(), nestedUiStep.getStyles());
    }
}
