package gp;

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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010'J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lgp/w;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "", "fallbackMode", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "k", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "g", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "sessionToken", "inquiryId", "include", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lokhttp3/ResponseBody;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lnt/b;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "body", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "j", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lnt/b;)Ljava/lang/Object;", "h", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lnt/b;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w {
    @mv.o("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    @Nullable
    Object a(@mv.i("Authorization") @NotNull String str, @mv.a @NotNull VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, @NotNull nt.b<? super jv.x<ResponseBody>> bVar);

    @mv.o("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    @Nullable
    Object b(@mv.a @NotNull ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, @NotNull nt.b<? super jv.x<ExchangeOneTimeLinkCodeResponse>> bVar);

    @mv.o("/api/internal/verify/v1/current-inquiry-session/error")
    @Nullable
    Object c(@mv.i("Authorization") @NotNull String str, @mv.a @NotNull ErrorRequest errorRequest, @NotNull nt.b<? super jv.x<ResponseBody>> bVar);

    @mv.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    @Nullable
    Object d(@mv.i("Authorization") @NotNull String str, @mv.i("Persona-Device-Id") @Nullable String str2, @mv.s("inquiryId") @NotNull String str3, @mv.t("include") @NotNull String str4, @NotNull nt.b<? super jv.x<CheckInquiryResponse>> bVar);

    @mv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    Object e(@mv.i("Authorization") @NotNull String str, @mv.s("inquiryId") @NotNull String str2, @mv.a @NotNull TransitionInquiryRequest transitionInquiryRequest, @NotNull nt.b<? super jv.x<CheckInquiryResponse>> bVar);

    @mv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    @mv.k({"Accept: multipart/form-data"})
    @mv.l
    Object f(@mv.i("Authorization") @NotNull String str, @mv.s("inquiryId") @NotNull String str2, @mv.q @NotNull List<MultipartBody.Part> list, @NotNull nt.b<? super jv.x<CheckInquiryResponse>> bVar);

    @mv.o("/api/internal/verify/v1/inquiry-sessions")
    @Nullable
    Object g(@mv.a @NotNull CreateInquirySessionRequest createInquirySessionRequest, @mv.i("Persona-Device-Id") @Nullable String str, @NotNull nt.b<? super jv.x<CreateInquirySessionResponse>> bVar);

    @mv.o("/api/internal/verify/v1/current-inquiry-session/cancel")
    @Nullable
    Object h(@mv.i("Authorization") @NotNull String str, @NotNull nt.b<? super jv.x<ResponseBody>> bVar);

    @mv.n("/api/internal/verify/v1/current-inquiry-session")
    @Nullable
    Object i(@mv.i("Authorization") @NotNull String str, @mv.a @NotNull UpdateInquirySessionRequest updateInquirySessionRequest, @NotNull nt.b<? super jv.x<ResponseBody>> bVar);

    @mv.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    @Nullable
    Object j(@mv.i("Authorization") @NotNull String str, @mv.s("inquiryId") @NotNull String str2, @mv.a @NotNull TransitionBackRequest transitionBackRequest, @NotNull nt.b<? super jv.x<CheckInquiryResponse>> bVar);

    @mv.o("/api/internal/verify/v1/inquiries")
    @Nullable
    Object k(@mv.a @NotNull CreateInquiryRequest createInquiryRequest, @mv.i("Persona-Fallback-Mode") @Nullable String str, @NotNull nt.b<? super jv.x<CheckInquiryResponse>> bVar);
}
