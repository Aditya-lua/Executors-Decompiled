package zo;

import com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37840a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[GpsCollectionRequirement.values().length];
            try {
                iArr[GpsCollectionRequirement.REQUIRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GpsCollectionRequirement.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GpsCollectionRequirement.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37840a = iArr;
            int[] iArr2 = new int[GpsPrecisionRequirement.values().length];
            try {
                iArr2[GpsPrecisionRequirement.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GpsPrecisionRequirement.ROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement a(@NotNull GpsCollectionRequirement gpsCollectionRequirement) {
        Intrinsics.checkNotNullParameter(gpsCollectionRequirement, "<this>");
        int i10 = a.f37840a[gpsCollectionRequirement.ordinal()];
        if (i10 == 1) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.REQUIRED;
        }
        if (i10 == 2) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.OPTIONAL;
        }
        if (i10 == 3) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.NONE;
        }
        throw new jt.l();
    }

    @NotNull
    public static final com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement b(@NotNull GpsPrecisionRequirement gpsPrecisionRequirement) {
        Intrinsics.checkNotNullParameter(gpsPrecisionRequirement, "<this>");
        int i10 = a.b[gpsPrecisionRequirement.ordinal()];
        if (i10 == 1) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement.PRECISE;
        }
        if (i10 == 2) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement.ROUGH;
        }
        throw new jt.l();
    }
}
