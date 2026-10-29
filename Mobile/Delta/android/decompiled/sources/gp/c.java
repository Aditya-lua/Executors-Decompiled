package gp;

import com.withpersona.sdk2.inquiry.network.dto.Attributes;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    @NotNull
    public static final InquirySessionConfig a(@NotNull Attributes attributes) {
        GpsCollectionRequirement gpsCollectionRequirementA;
        GpsPrecisionRequirement gpsPrecisionRequirementB;
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement gpsCollectionRequirement = attributes.getGpsCollectionRequirement();
        if (gpsCollectionRequirement == null || (gpsCollectionRequirementA = zo.b.a(gpsCollectionRequirement)) == null) {
            gpsCollectionRequirementA = GpsCollectionRequirement.NONE;
        }
        com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement gpsPrecisionRequirement = attributes.getGpsPrecisionRequirement();
        if (gpsPrecisionRequirement == null || (gpsPrecisionRequirementB = zo.b.b(gpsPrecisionRequirement)) == null) {
            gpsPrecisionRequirementB = GpsPrecisionRequirement.PRECISE;
        }
        return new InquirySessionConfig(gpsCollectionRequirementA, gpsPrecisionRequirementB, attributes.getPlayIntegrityProjectId() != null);
    }
}
