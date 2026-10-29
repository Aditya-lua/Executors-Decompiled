package p610zo;

import com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: zo.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13950b {

    /* JADX INFO: renamed from: zo.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48725a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f48726b;

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
            f48725a = iArr;
            int[] iArr2 = new int[GpsPrecisionRequirement.values().length];
            try {
                iArr2[GpsPrecisionRequirement.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GpsPrecisionRequirement.ROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f48726b = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement m50444a(@NotNull GpsCollectionRequirement gpsCollectionRequirement) {
        Intrinsics.checkNotNullParameter(gpsCollectionRequirement, "<this>");
        int i10 = a.f48725a[gpsCollectionRequirement.ordinal()];
        if (i10 == 1) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.REQUIRED;
        }
        if (i10 == 2) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.OPTIONAL;
        }
        if (i10 == 3) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement.NONE;
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement m50445b(@NotNull GpsPrecisionRequirement gpsPrecisionRequirement) {
        Intrinsics.checkNotNullParameter(gpsPrecisionRequirement, "<this>");
        int i10 = a.f48726b[gpsPrecisionRequirement.ordinal()];
        if (i10 == 1) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement.PRECISE;
        }
        if (i10 == 2) {
            return com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement.ROUGH;
        }
        throw new C7345l();
    }
}
