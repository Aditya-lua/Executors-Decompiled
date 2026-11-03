package com.withpersona.sdk2.inquiry.nfc;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import dt.e;
import dt.i;
import java.util.List;
import op.k;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12325a;

    public c(k kVar) {
        this.f12325a = kVar;
    }

    public static i<b.a> b(k kVar) {
        return e.a(new c(kVar));
    }

    @Override // com.withpersona.sdk2.inquiry.nfc.b.a
    public b a(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends op.b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return this.f12325a.b(str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
