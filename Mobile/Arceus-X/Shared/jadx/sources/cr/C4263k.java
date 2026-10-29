package cr;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cr.k */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "old", "new", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcr/y4;", "uiComponentHelper", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Lcr/y4;)Landroid/view/View;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4263k {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final View m21789a(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull C4352y4 uiComponentHelper) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CreatePersonaSheetComponent m21790b(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull UiComponent old, @NotNull UiComponent uiComponent) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(uiComponent, "new");
        UiComponentScreen screen = createPersonaSheetComponent.getScreen();
        List<UiComponent> components = createPersonaSheetComponent.getScreen().getComponents();
        return CreatePersonaSheetComponent.m20557f(createPersonaSheetComponent, null, null, null, false, false, false, false, UiComponentScreen.m20522g(screen, components != null ? C4086b.m20896m(components, old, uiComponent) : null, null, null, 6, null), 0L, 383, null);
    }
}
