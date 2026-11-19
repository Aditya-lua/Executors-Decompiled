package eq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<PassportNfcReaderConfig>> f14125a;
    public final wt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<kq.c> f14126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<er.c> f14127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<to.e> f14128e;

    public q(wt.i<g.d<PassportNfcReaderConfig>> iVar, wt.i<Context> iVar2, wt.i<kq.c> iVar3, wt.i<er.c> iVar4, wt.i<to.e> iVar5) {
        this.f14125a = iVar;
        this.b = iVar2;
        this.f14126c = iVar3;
        this.f14127d = iVar4;
        this.f14128e = iVar5;
    }

    public static q a(wt.i<g.d<PassportNfcReaderConfig>> iVar, wt.i<Context> iVar2, wt.i<kq.c> iVar3, wt.i<er.c> iVar4, wt.i<to.e> iVar5) {
        return new q(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static p c(g.d<PassportNfcReaderConfig> dVar, Context context, kq.c cVar, er.c cVar2, to.e eVar, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends c> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return new p(dVar, context, cVar, cVar2, eVar, str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }

    public p b(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends c> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return c(this.f14125a.get(), this.b.get(), this.f14126c.get(), this.f14127d.get(), this.f14128e.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
