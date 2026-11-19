package vo;

import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn/g;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "a", "(Lsn/g;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q3 {
    @NotNull
    public static final RawExtraction a(@NotNull sn.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof sn.g.MrzBarcodeInfo) {
            return new RawExtraction("mrz", ((sn.g.MrzBarcodeInfo) gVar).getExtractionRawPayload());
        }
        if (gVar instanceof sn.g.Pdf417BarcodeInfo) {
            return new RawExtraction("pdf417", ((sn.g.Pdf417BarcodeInfo) gVar).getExtractionRawPayload());
        }
        throw new zt.l();
    }
}
