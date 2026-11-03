package jp;

import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f22182a;

    public p(o oVar) {
        this.f22182a = oVar;
    }

    public static dt.i<n.a> b(o oVar) {
        return dt.e.a(new p(oVar));
    }

    @Override // jp.n.a
    public n a(JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return this.f22182a.b(jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }
}
