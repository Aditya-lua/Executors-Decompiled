package com.withpersona.sdk2.inquiry.nfc;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p390qp.C10697k;
import p390qp.EnumC10688b;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3829c implements C3828b.a {

    /* JADX INFO: renamed from: a */
    public final C10697k f15757a;

    public C3829c(C10697k c10697k) {
        this.f15757a = c10697k;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3828b.a> m18999b(C10697k c10697k) {
        return C5831e.m26182a(new C3829c(c10697k));
    }

    @Override // com.withpersona.sdk2.inquiry.nfc.C3828b.a
    /* JADX INFO: renamed from: a */
    public C3828b mo18997a(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends EnumC10688b> list, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return this.f15757a.m40773b(str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
