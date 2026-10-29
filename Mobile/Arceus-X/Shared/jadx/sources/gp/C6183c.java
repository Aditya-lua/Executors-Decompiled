package gp;

import com.withpersona.sdk2.inquiry.network.dto.Attributes;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p610zo.C13950b;

/* JADX INFO: renamed from: gp.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6183c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InquirySessionConfig m27246a(@NotNull Attributes attributes) {
        GpsCollectionRequirement gpsCollectionRequirementM50444a;
        GpsPrecisionRequirement gpsPrecisionRequirementM50445b;
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement gpsCollectionRequirement = attributes.getGpsCollectionRequirement();
        if (gpsCollectionRequirement == null || (gpsCollectionRequirementM50444a = C13950b.m50444a(gpsCollectionRequirement)) == null) {
            gpsCollectionRequirementM50444a = GpsCollectionRequirement.NONE;
        }
        com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement gpsPrecisionRequirement = attributes.getGpsPrecisionRequirement();
        if (gpsPrecisionRequirement == null || (gpsPrecisionRequirementM50445b = C13950b.m50445b(gpsPrecisionRequirement)) == null) {
            gpsPrecisionRequirementM50445b = GpsPrecisionRequirement.PRECISE;
        }
        return new InquirySessionConfig(gpsCollectionRequirementM50444a, gpsPrecisionRequirementM50445b, attributes.getPlayIntegrityProjectId() != null);
    }
}
