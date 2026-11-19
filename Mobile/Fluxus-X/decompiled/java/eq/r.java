package eq;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f14129a;

    public r(q qVar) {
        this.f14129a = qVar;
    }

    public static wt.i<p.a> b(q qVar) {
        return wt.e.a(new r(qVar));
    }

    @Override // eq.p.a
    public p a(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends c> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return this.f14129a.b(str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
