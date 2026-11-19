package zp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<JpMyNumberNfcReaderConfig>> f39427a;
    public final wt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<kq.c> f39428c;

    public v(wt.i<g.d<JpMyNumberNfcReaderConfig>> iVar, wt.i<Context> iVar2, wt.i<kq.c> iVar3) {
        this.f39427a = iVar;
        this.b = iVar2;
        this.f39428c = iVar3;
    }

    public static v a(wt.i<g.d<JpMyNumberNfcReaderConfig>> iVar, wt.i<Context> iVar2, wt.i<kq.c> iVar3) {
        return new v(iVar, iVar2, iVar3);
    }

    public static u c(g.d<JpMyNumberNfcReaderConfig> dVar, Context context, kq.c cVar, JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return new u(dVar, context, cVar, jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }

    public u b(JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return c(this.f39427a.get(), this.b.get(), this.f39428c.get(), jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }
}
