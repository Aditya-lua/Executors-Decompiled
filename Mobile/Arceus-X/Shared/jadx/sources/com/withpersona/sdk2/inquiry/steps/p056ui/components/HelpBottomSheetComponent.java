package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p084dr.HelpBottomSheetViewModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "timesShown", "Ldr/o;", "p1", "(I)Ldr/o;", "", "isEnabled", "()Z", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface HelpBottomSheetComponent extends UiComponent {
    /* JADX INFO: renamed from: x2 */
    static /* synthetic */ HelpBottomSheetViewModel m20603x2(HelpBottomSheetComponent helpBottomSheetComponent, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getViewModel");
        }
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return helpBottomSheetComponent.mo20595p1(i10);
    }

    boolean isEnabled();

    @Nullable
    /* JADX INFO: renamed from: p1 */
    HelpBottomSheetViewModel mo20595p1(int timesShown);
}
