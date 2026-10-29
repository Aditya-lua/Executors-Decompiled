package io;

import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p132fn.AbstractC5679e;
import p229jt.C7345l;

/* JADX INFO: renamed from: io.q2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lfn/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "a", "(Lfn/e;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6907q2 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final RawExtraction m29328a(@NotNull AbstractC5679e abstractC5679e) {
        Intrinsics.checkNotNullParameter(abstractC5679e, "<this>");
        if (abstractC5679e instanceof AbstractC5679e.MrzBarcodeInfo) {
            return new RawExtraction("mrz", ((AbstractC5679e.MrzBarcodeInfo) abstractC5679e).getExtractionRawPayload());
        }
        if (abstractC5679e instanceof AbstractC5679e.Pdf417BarcodeInfo) {
            return new RawExtraction("pdf417", ((AbstractC5679e.Pdf417BarcodeInfo) abstractC5679e).getExtractionRawPayload());
        }
        throw new C7345l();
    }
}
