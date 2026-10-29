package com.withpersona.sdk2.inquiry.ui.network;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import jt.l;
import jt.s;
import kotlin.collections.k0;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "a", "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    @NotNull
    public static final Object a(@NotNull ComponentParam componentParam) {
        Intrinsics.checkNotNullParameter(componentParam, "<this>");
        if (componentParam instanceof ComponentParam.Address) {
            ComponentParam.Address address = (ComponentParam.Address) componentParam;
            return k0.m(s.a("street_1", address.getStreet1()), s.a("street_2", address.getStreet2()), s.a("city", address.getCity()), s.a("subdivision", address.getSubdivision()), s.a("postal_code", address.getPostalCode()));
        }
        if (componentParam instanceof ComponentParam.ComponentString) {
            return ((ComponentParam.ComponentString) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.ComponentStringList) {
            return ((ComponentParam.ComponentStringList) componentParam).a();
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
            return k0.m(s.a("caFlag", governmentIdNfcScan.getChipAuthenticationStatus()), s.a("dg1", governmentIdNfcScan.getDg1()), s.a("dg2", governmentIdNfcScan.getDg2()), s.a("sod", governmentIdNfcScan.getSod()));
        }
        if (componentParam instanceof ComponentParam.JpMyNumberNfcScanParams) {
            return ((ComponentParam.JpMyNumberNfcScanParams) componentParam).a();
        }
        if (componentParam instanceof ComponentParam.InternationalDbParams) {
            ComponentParam.InternationalDbParams internationalDbParams = (ComponentParam.InternationalDbParams) componentParam;
            return k0.m(s.a("idb_country", internationalDbParams.getCountry()), s.a("idb_type", internationalDbParams.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String()), s.a("idb_value", internationalDbParams.getValue()));
        }
        if (componentParam instanceof ComponentParam.PhoneNumberSnaParams) {
            ComponentParam.PhoneNumberSnaParams phoneNumberSnaParams = (ComponentParam.PhoneNumberSnaParams) componentParam;
            return k0.m(s.a("code", phoneNumberSnaParams.getCode()), s.a("error", k0.m(s.a("name", phoneNumberSnaParams.getErrorName()), s.a("message", phoneNumberSnaParams.getErrorMessage()))));
        }
        if (!(componentParam instanceof ComponentParam.FileUpload)) {
            throw new l();
        }
        List<Uri> listF = ((ComponentParam.FileUpload) componentParam).f();
        ArrayList arrayList = new ArrayList(q.u(listF, 10));
        for (Uri uri : listF) {
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
