package p278lp;

import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: lp.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C8234p implements C8232n.a {

    /* JADX INFO: renamed from: a */
    public final C8233o f30536a;

    public C8234p(C8233o c8233o) {
        this.f30536a = c8233o;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C8232n.a> m33596b(C8233o c8233o) {
        return C5831e.m26182a(new C8234p(c8233o));
    }

    @Override // p278lp.C8232n.a
    /* JADX INFO: renamed from: a */
    public C8232n mo33591a(JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return this.f30536a.m33595b(jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }
}
