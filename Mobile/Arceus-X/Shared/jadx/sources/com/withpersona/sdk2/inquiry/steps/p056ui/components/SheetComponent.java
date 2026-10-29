package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0001\u0001\u0011¨\u0006\u0012À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "V2", "()Z", "g1", "(Z)V", "shown", "E1", "p2", "showing", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "a1", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "screen", "l1", "hideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface SheetComponent extends UiComponent {
    /* JADX INFO: renamed from: E1 */
    boolean mo20558E1();

    /* JADX INFO: renamed from: V2 */
    boolean mo20559V2();

    @NotNull
    /* JADX INFO: renamed from: a1 */
    UiComponentScreen mo20561a1();

    /* JADX INFO: renamed from: g1 */
    void mo20563g1(boolean z10);

    /* JADX INFO: renamed from: l1 */
    default boolean mo20565l1() {
        return true;
    }

    /* JADX INFO: renamed from: p2 */
    void mo20566p2(boolean z10);
}
