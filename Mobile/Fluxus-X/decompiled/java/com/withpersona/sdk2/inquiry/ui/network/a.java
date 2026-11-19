package com.withpersona.sdk2.inquiry.ui.network;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.collections.k0;
import p001kotlin.collections.q;
import p001kotlin.jvm.internal.Intrinsics;
import zt.l;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@p001kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", BuildConfig.FLAVOR, "a", "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    @NotNull
    public static final Object a(@NotNull ComponentParam componentParam) {
        Intrinsics.checkNotNullParameter(componentParam, "<this>");
        if (componentParam instanceof ComponentParam.a) {
            ComponentParam.a aVar = (ComponentParam.a) componentParam;
            return k0.m(s.a("street_1", aVar.getStreet1()), s.a("street_2", aVar.getStreet2()), s.a("city", aVar.getCity()), s.a("subdivision", aVar.getSubdivision()), s.a("postal_code", aVar.getPostalCode()));
        }
        if (componentParam instanceof ComponentParam.d) {
            return ((ComponentParam.d) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.e) {
            return ((ComponentParam.e) componentParam).a();
        }
        if (componentParam instanceof ComponentParam.b) {
            return Boolean.valueOf(((ComponentParam.b) componentParam).getValue());
        }
        if (componentParam instanceof ComponentParam.c) {
            return ((ComponentParam.c) componentParam).getValue();
        }
        if (componentParam instanceof ComponentParam.f) {
            String signatureImageString = ((ComponentParam.f) componentParam).getSignatureImageString();
            return signatureImageString == null ? BuildConfig.FLAVOR : signatureImageString;
        }
        if (componentParam instanceof ComponentParam.h) {
            ComponentParam.h hVar = (ComponentParam.h) componentParam;
            return k0.m(s.a("caFlag", hVar.getChipAuthenticationStatus()), s.a("dg1", hVar.getDg1()), s.a("dg2", hVar.getDg2()), s.a("sod", hVar.getSod()));
        }
        if (componentParam instanceof ComponentParam.j) {
            return ((ComponentParam.j) componentParam).a();
        }
        if (componentParam instanceof ComponentParam.i) {
            ComponentParam.i iVar = (ComponentParam.i) componentParam;
            return k0.m(s.a("idb_country", iVar.getCountry()), s.a("idb_type", iVar.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String()), s.a("idb_value", iVar.getValue()));
        }
        if (componentParam instanceof ComponentParam.k) {
            ComponentParam.k kVar = (ComponentParam.k) componentParam;
            return k0.m(s.a("code", kVar.getCode()), s.a("error", k0.m(s.a("name", kVar.getErrorName()), s.a("message", kVar.getErrorMessage()))));
        }
        if (!(componentParam instanceof ComponentParam.g)) {
            throw new l();
        }
        List<Uri> listF = ((ComponentParam.g) componentParam).f();
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
