package ep;

import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010'J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lep/w;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "", "fallbackMode", "Lhv/x;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "g", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "i", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "sessionToken", "inquiryId", "include", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lokhttp3/ResponseBody;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Llt/b;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "body", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Llt/b;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "d", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Llt/b;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w {
    @kv.o("/api/internal/verify/v1/current-inquiry-session/cancel")
    @Nullable
    Object a(@kv.i("Authorization") @NotNull String str, @NotNull lt.b<? super hv.x<ResponseBody>> bVar);

    @kv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    @Nullable
    Object b(@kv.i("Authorization") @NotNull String str, @kv.s("inquiryId") @NotNull String str2, @kv.a @NotNull TransitionBackRequest transitionBackRequest, @NotNull lt.b<? super hv.x<CheckInquiryResponse>> bVar);

    @kv.n("/api/internal/verify/v1/current-inquiry-session")
    @Nullable
    Object c(@kv.i("Authorization") @NotNull String str, @kv.a @NotNull UpdateInquirySessionRequest updateInquirySessionRequest, @NotNull lt.b<? super hv.x<ResponseBody>> bVar);

    @kv.o("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    @Nullable
    Object d(@kv.a @NotNull ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, @NotNull lt.b<? super hv.x<ExchangeOneTimeLinkCodeResponse>> bVar);

    @kv.o("/api/internal/verify/v1/current-inquiry-session/error")
    @Nullable
    Object e(@kv.i("Authorization") @NotNull String str, @kv.a @NotNull ErrorRequest errorRequest, @NotNull lt.b<? super hv.x<ResponseBody>> bVar);

    @kv.o("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    @Nullable
    Object f(@kv.i("Authorization") @NotNull String str, @kv.a @NotNull VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, @NotNull lt.b<? super hv.x<ResponseBody>> bVar);

    @kv.o("/api/internal/verify/v1/inquiries")
    @Nullable
    Object g(@kv.a @NotNull CreateInquiryRequest createInquiryRequest, @kv.i("Persona-Fallback-Mode") @Nullable String str, @NotNull lt.b<? super hv.x<CheckInquiryResponse>> bVar);

    @kv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    Object h(@kv.i("Authorization") @NotNull String str, @kv.s("inquiryId") @NotNull String str2, @kv.a @NotNull TransitionInquiryRequest transitionInquiryRequest, @NotNull lt.b<? super hv.x<CheckInquiryResponse>> bVar);

    @kv.o("/api/internal/verify/v1/inquiry-sessions")
    @Nullable
    Object i(@kv.a @NotNull CreateInquirySessionRequest createInquirySessionRequest, @kv.i("Persona-Device-Id") @Nullable String str, @NotNull lt.b<? super hv.x<CreateInquirySessionResponse>> bVar);

    @kv.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    @Nullable
    Object j(@kv.i("Authorization") @NotNull String str, @kv.i("Persona-Device-Id") @Nullable String str2, @kv.s("inquiryId") @NotNull String str3, @kv.t("include") @NotNull String str4, @NotNull lt.b<? super hv.x<CheckInquiryResponse>> bVar);

    @kv.k({"Accept: multipart/form-data"})
    @Nullable
    @kv.l
    @kv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object k(@kv.i("Authorization") @NotNull String str, @kv.s("inquiryId") @NotNull String str2, @kv.q @NotNull List<MultipartBody.Part> list, @NotNull lt.b<? super hv.x<CheckInquiryResponse>> bVar);
}
