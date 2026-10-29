package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0004\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "newChildren", "r1", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "getChildren", "()Ljava/util/List;", "children", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface UiComponentGroup extends UiComponent {
    @NotNull
    List<UiComponent> getChildren();

    @NotNull
    /* JADX INFO: renamed from: r1 */
    UiComponentGroup mo20548r1(@NotNull List<? extends UiComponent> newChildren);
}
