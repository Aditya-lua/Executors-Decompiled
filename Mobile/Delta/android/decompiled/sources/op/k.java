package op;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<PassportNfcReaderConfig>> f28141a;
    public final dt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<up.c> f28142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<oq.c> f28143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<eo.e> f28144e;

    public k(dt.i<g.c<PassportNfcReaderConfig>> iVar, dt.i<Context> iVar2, dt.i<up.c> iVar3, dt.i<oq.c> iVar4, dt.i<eo.e> iVar5) {
        this.f28141a = iVar;
        this.b = iVar2;
        this.f28142c = iVar3;
        this.f28143d = iVar4;
        this.f28144e = iVar5;
    }

    public static k a(dt.i<g.c<PassportNfcReaderConfig>> iVar, dt.i<Context> iVar2, dt.i<up.c> iVar3, dt.i<oq.c> iVar4, dt.i<eo.e> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static com.withpersona.sdk2.inquiry.nfc.b c(g.c<PassportNfcReaderConfig> cVar, Context context, up.c cVar2, oq.c cVar3, eo.e eVar, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return new com.withpersona.sdk2.inquiry.nfc.b(cVar, context, cVar2, cVar3, eVar, str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }

    public com.withpersona.sdk2.inquiry.nfc.b b(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return c(this.f28141a.get(), this.b.get(), this.f28142c.get(), this.f28143d.get(), this.f28144e.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
