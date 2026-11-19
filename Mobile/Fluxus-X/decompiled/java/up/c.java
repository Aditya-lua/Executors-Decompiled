package up;

import com.withpersona.sdk2.inquiry.network.dto.Attributes;
import com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement;
import hr.InquirySessionConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "Lhr/g;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lhr/g;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    @NotNull
    public static final InquirySessionConfig a(@NotNull Attributes attributes) {
        hr.a aVarA;
        hr.e eVarB;
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        GpsCollectionRequirement gpsCollectionRequirement = attributes.getGpsCollectionRequirement();
        if (gpsCollectionRequirement == null || (aVarA = np.b.a(gpsCollectionRequirement)) == null) {
            aVarA = hr.a.NONE;
        }
        GpsPrecisionRequirement gpsPrecisionRequirement = attributes.getGpsPrecisionRequirement();
        if (gpsPrecisionRequirement == null || (eVarB = np.b.b(gpsPrecisionRequirement)) == null) {
            eVarB = hr.e.PRECISE;
        }
        return new InquirySessionConfig(aVarA, eVarB, attributes.getPlayIntegrityProjectId() != null);
    }
}
