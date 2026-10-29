package qp;

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
    public final ft.i<g.c<PassportNfcReaderConfig>> f29597a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<wp.c> f29598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<qq.c> f29599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<go.e> f29600e;

    public k(ft.i<g.c<PassportNfcReaderConfig>> iVar, ft.i<Context> iVar2, ft.i<wp.c> iVar3, ft.i<qq.c> iVar4, ft.i<go.e> iVar5) {
        this.f29597a = iVar;
        this.b = iVar2;
        this.f29598c = iVar3;
        this.f29599d = iVar4;
        this.f29600e = iVar5;
    }

    public static k a(ft.i<g.c<PassportNfcReaderConfig>> iVar, ft.i<Context> iVar2, ft.i<wp.c> iVar3, ft.i<qq.c> iVar4, ft.i<go.e> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static com.withpersona.sdk2.inquiry.nfc.b c(g.c<PassportNfcReaderConfig> cVar, Context context, wp.c cVar2, qq.c cVar3, go.e eVar, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return new com.withpersona.sdk2.inquiry.nfc.b(cVar, context, cVar2, cVar3, eVar, str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }

    public com.withpersona.sdk2.inquiry.nfc.b b(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return c(this.f29597a.get(), this.b.get(), this.f29598c.get(), this.f29599d.get(), this.f29600e.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
