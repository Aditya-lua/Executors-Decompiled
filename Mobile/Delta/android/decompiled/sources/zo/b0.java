package zo;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "Lzo/a0;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)Lzo/a0;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37841a;

        static {
            int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
            try {
                iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37841a = iArr;
        }
    }

    @NotNull
    public static final a0 a(@NotNull CheckInquiryResponse.PollingMode pollingMode) {
        Intrinsics.checkNotNullParameter(pollingMode, "<this>");
        int i10 = a.f37841a[pollingMode.ordinal()];
        if (i10 == 1) {
            return a0.Blocking;
        }
        if (i10 == 2) {
            return a0.Background;
        }
        if (i10 == 3) {
            return a0.Blocking;
        }
        throw new jt.l();
    }
}
