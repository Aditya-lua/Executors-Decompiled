package com.withpersona.sdk2.inquiry.p057ui.network;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p229jt.C7352s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "a", "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;", "ui_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4177a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Object m21637a(@NotNull ComponentParam componentParam) {
        Intrinsics.checkNotNullParameter(componentParam, "<this>");
        if (componentParam instanceof ComponentParam.Address) {
            ComponentParam.Address address = (ComponentParam.Address) componentParam;
            return C7690k0.m31798m(C7352s.m30477a("street_1", address.getStreet1()), C7352s.m30477a("street_2", address.getStreet2()), C7352s.m30477a("city", address.getCity()), C7352s.m30477a("subdivision", address.getSubdivision()), C7352s.m30477a("postal_code", address.getPostalCode()));
        }
        if (componentParam instanceof ComponentParam.ComponentString) {
            return ((ComponentParam.ComponentString) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ComponentStringList) {
            return ((ComponentParam.ComponentStringList) componentParam).m21552a();
        }
        if (componentParam instanceof ComponentParam.ComponentBoolean) {
            return Boolean.valueOf(((ComponentParam.ComponentBoolean) componentParam).getValue());
        }
        if (componentParam instanceof ComponentParam.ComponentNumber) {
            return ((ComponentParam.ComponentNumber) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ESignature) {
            String signatureImageString = ((ComponentParam.ESignature) componentParam).getSignatureImageString();
            return signatureImageString == null ? "" : signatureImageString;
        }
        if (componentParam instanceof ComponentParam.GovernmentIdNfcScan) {
            ComponentParam.GovernmentIdNfcScan governmentIdNfcScan = (ComponentParam.GovernmentIdNfcScan) componentParam;
            return C7690k0.m31798m(C7352s.m30477a("caFlag", governmentIdNfcScan.getChipAuthenticationStatus()), C7352s.m30477a("dg1", governmentIdNfcScan.getDg1()), C7352s.m30477a("dg2", governmentIdNfcScan.getDg2()), C7352s.m30477a("sod", governmentIdNfcScan.getSod()));
        }
        if (componentParam instanceof ComponentParam.JpMyNumberNfcScanParams) {
            return ((ComponentParam.JpMyNumberNfcScanParams) componentParam).m21573a();
        }
        if (componentParam instanceof ComponentParam.InternationalDbParams) {
            ComponentParam.InternationalDbParams internationalDbParams = (ComponentParam.InternationalDbParams) componentParam;
            return C7690k0.m31798m(C7352s.m30477a("idb_country", internationalDbParams.getCountry()), C7352s.m30477a("idb_type", internationalDbParams.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String()), C7352s.m30477a("idb_value", internationalDbParams.getValue()));
        }
        if (componentParam instanceof ComponentParam.PhoneNumberSnaParams) {
            ComponentParam.PhoneNumberSnaParams phoneNumberSnaParams = (ComponentParam.PhoneNumberSnaParams) componentParam;
            return C7690k0.m31798m(C7352s.m30477a("code", phoneNumberSnaParams.getCode()), C7352s.m30477a("error", C7690k0.m31798m(C7352s.m30477a("name", phoneNumberSnaParams.getErrorName()), C7352s.m30477a("message", phoneNumberSnaParams.getErrorMessage()))));
        }
        if (!(componentParam instanceof ComponentParam.FileUpload)) {
            throw new C7345l();
        }
        List<Uri> listM21559f = ((ComponentParam.FileUpload) componentParam).m21559f();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM21559f, 10));
        for (Uri uri : listM21559f) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = uri.toString();
                Intrinsics.checkNotNullExpressionValue(lastPathSegment, "toString(...)");
            }
            arrayList.add(lastPathSegment);
        }
        return arrayList;
    }
}
