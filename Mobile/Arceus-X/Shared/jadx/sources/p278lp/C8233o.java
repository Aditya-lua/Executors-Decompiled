package p278lp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p525wp.C12504c;

/* JADX INFO: renamed from: lp.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C8233o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<JpMyNumberNfcReaderConfig>> f30533a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f30534b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C12504c> f30535c;

    public C8233o(InterfaceC5835i<AbstractC5854c<JpMyNumberNfcReaderConfig>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C12504c> interfaceC5835i3) {
        this.f30533a = interfaceC5835i;
        this.f30534b = interfaceC5835i2;
        this.f30535c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C8233o m33593a(InterfaceC5835i<AbstractC5854c<JpMyNumberNfcReaderConfig>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C12504c> interfaceC5835i3) {
        return new C8233o(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C8232n m33594c(AbstractC5854c<JpMyNumberNfcReaderConfig> abstractC5854c, Context context, C12504c c12504c, JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return new C8232n(abstractC5854c, context, c12504c, jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }

    /* JADX INFO: renamed from: b */
    public C8232n m33595b(JpMyNumberNfcValidOperation jpMyNumberNfcValidOperation, JpMyNumberNfcStrings jpMyNumberNfcStrings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, boolean z10) {
        return m33594c(this.f30533a.get(), this.f30534b.get(), this.f30535c.get(), jpMyNumberNfcValidOperation, jpMyNumberNfcStrings, transitionComponents, jpMyNumberNfcScanStyles, uiStepStyle, num, z10);
    }
}
