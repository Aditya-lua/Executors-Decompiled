package zp;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f39429a;

    public w(v vVar) {
        this.f39429a = vVar;
    }

    public static wt.i<u.a> b(v vVar) {
        return wt.e.a(new w(vVar));
    }

    @Override // zp.u.a
    public u a(JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return this.f39429a.b(jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }
}
