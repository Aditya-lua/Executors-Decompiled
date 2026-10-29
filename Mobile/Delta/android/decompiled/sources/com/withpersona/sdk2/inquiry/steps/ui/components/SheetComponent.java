package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0001\u0001\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "V2", "()Z", "f1", "(Z)V", "shown", "E1", "p2", "showing", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "a1", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "screen", "k1", "hideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SheetComponent extends UiComponent {
    boolean E1();

    boolean V2();

    @NotNull
    UiComponentScreen a1();

    void f1(boolean z10);

    default boolean k1() {
        return true;
    }

    void p2(boolean z10);
}
