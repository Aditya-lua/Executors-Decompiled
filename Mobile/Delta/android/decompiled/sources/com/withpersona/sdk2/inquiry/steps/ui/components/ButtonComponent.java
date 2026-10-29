package com.withpersona.sdk2.inquiry.steps.ui.components;

import cr.h2;
import cr.o;
import cr.x;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "Lcr/o;", "Lcr/x;", "Lcr/h2;", "", "getName", "()Ljava/lang/String;", "name", "", "Y0", "()Z", "b", "(Z)V", "wasTapped", "getAutoSubmitCountdownText", "autoSubmitCountdownText", "", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "autoSubmitIntervalSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CombinedStepButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ButtonComponent extends AutoSubmitableComponent, o, x, h2 {
    boolean Y0();

    void b(boolean z10);

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent
    @Nullable
    String getAutoSubmitCountdownText();

    @Nullable
    Integer getAutoSubmitIntervalSeconds();

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    String getName();
}
