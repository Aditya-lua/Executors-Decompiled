package lp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<g.c<JpMyNumberNfcReaderConfig>> f23527a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<wp.c> f23528c;

    public o(ft.i<g.c<JpMyNumberNfcReaderConfig>> iVar, ft.i<Context> iVar2, ft.i<wp.c> iVar3) {
        this.f23527a = iVar;
        this.b = iVar2;
        this.f23528c = iVar3;
    }

    public static o a(ft.i<g.c<JpMyNumberNfcReaderConfig>> iVar, ft.i<Context> iVar2, ft.i<wp.c> iVar3) {
        return new o(iVar, iVar2, iVar3);
    }

    public static n c(g.c<JpMyNumberNfcReaderConfig> cVar, Context context, wp.c cVar2, JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return new n(cVar, context, cVar2, jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }

    public n b(JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return c(this.f23527a.get(), this.b.get(), this.f23528c.get(), jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }
}
