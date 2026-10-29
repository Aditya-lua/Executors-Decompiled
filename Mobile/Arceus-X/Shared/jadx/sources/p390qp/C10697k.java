package p390qp;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.C3828b;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p152go.C6159e;
import p391qq.C10700c;
import p525wp.C12504c;

/* JADX INFO: renamed from: qp.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10697k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<PassportNfcReaderConfig>> f38222a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f38223b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C12504c> f38224c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C10700c> f38225d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C6159e> f38226e;

    public C10697k(InterfaceC5835i<AbstractC5854c<PassportNfcReaderConfig>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C12504c> interfaceC5835i3, InterfaceC5835i<C10700c> interfaceC5835i4, InterfaceC5835i<C6159e> interfaceC5835i5) {
        this.f38222a = interfaceC5835i;
        this.f38223b = interfaceC5835i2;
        this.f38224c = interfaceC5835i3;
        this.f38225d = interfaceC5835i4;
        this.f38226e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C10697k m40771a(InterfaceC5835i<AbstractC5854c<PassportNfcReaderConfig>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C12504c> interfaceC5835i3, InterfaceC5835i<C10700c> interfaceC5835i4, InterfaceC5835i<C6159e> interfaceC5835i5) {
        return new C10697k(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C3828b m40772c(AbstractC5854c<PassportNfcReaderConfig> abstractC5854c, Context context, C12504c c12504c, C10700c c10700c, C6159e c6159e, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends EnumC10688b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return new C3828b(abstractC5854c, context, c12504c, c10700c, c6159e, str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }

    /* JADX INFO: renamed from: b */
    public C3828b m40773b(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends EnumC10688b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return m40772c(this.f38222a.get(), this.f38223b.get(), this.f38224c.get(), this.f38225d.get(), this.f38226e.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
