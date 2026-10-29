package io;

import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfn/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "a", "(Lfn/e;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q2 {
    @NotNull
    public static final RawExtraction a(@NotNull fn.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof fn.e.MrzBarcodeInfo) {
            return new RawExtraction("mrz", ((fn.e.MrzBarcodeInfo) eVar).getExtractionRawPayload());
        }
        if (eVar instanceof fn.e.Pdf417BarcodeInfo) {
            return new RawExtraction("pdf417", ((fn.e.Pdf417BarcodeInfo) eVar).getExtractionRawPayload());
        }
        throw new jt.l();
    }
}
