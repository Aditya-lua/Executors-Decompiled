package qr;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import java.util.List;
import or.UiComponentScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "Lqr/x5;", "old", "new", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;Lqr/x5;Lqr/x5;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "Lqr/z5;", "uiComponentHelper", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;Lqr/z5;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    @Nullable
    public static final View a(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull z5 uiComponentHelper) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        return null;
    }

    @NotNull
    public static final CreatePersonaSheetComponent b(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull x5 old, @NotNull x5 x5Var) {
        Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "<this>");
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(x5Var, "new");
        UiComponentScreen screen = createPersonaSheetComponent.getScreen();
        List<x5> components = createPersonaSheetComponent.getScreen().getComponents();
        return CreatePersonaSheetComponent.f(createPersonaSheetComponent, null, null, null, false, false, false, false, UiComponentScreen.g(screen, components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.g.m(components, old, x5Var) : null, null, null, 6, null), 0L, 383, null);
    }
}
