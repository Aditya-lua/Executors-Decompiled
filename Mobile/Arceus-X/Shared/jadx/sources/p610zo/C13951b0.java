package p610zo;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: zo.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "Lzo/a0;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)Lzo/a0;", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13951b0 {

    /* JADX INFO: renamed from: zo.b0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48727a;

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
            f48727a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final EnumC13949a0 m50446a(@NotNull CheckInquiryResponse.PollingMode pollingMode) {
        Intrinsics.checkNotNullParameter(pollingMode, "<this>");
        int i10 = a.f48727a[pollingMode.ordinal()];
        if (i10 == 1) {
            return EnumC13949a0.Blocking;
        }
        if (i10 == 2) {
            return EnumC13949a0.Background;
        }
        if (i10 == 3) {
            return EnumC13949a0.Blocking;
        }
        throw new C7345l();
    }
}
