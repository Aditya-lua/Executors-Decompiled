package up;

import com.github.luben.zstd.BuildConfig;
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
import mv.c0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010'J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lup/w;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", BuildConfig.FLAVOR, "fallbackMode", "Lsw/x;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "c", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "k", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "sessionToken", "inquiryId", "include", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lmv/i0;", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "i", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lmv/c0$c;", "body", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Leu/b;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "b", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "d", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Leu/b;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w {
    @Nullable
    @vw.o("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    Object a(@vw.i("Authorization") @NotNull String str, @vw.a @NotNull VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, @NotNull eu.b<? super sw.x<i0>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/current-inquiry-session/error")
    Object b(@vw.i("Authorization") @NotNull String str, @vw.a @NotNull ErrorRequest errorRequest, @NotNull eu.b<? super sw.x<i0>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/inquiries")
    Object c(@vw.a @NotNull CreateInquiryRequest createInquiryRequest, @vw.i("Persona-Fallback-Mode") @Nullable String str, @NotNull eu.b<? super sw.x<CheckInquiryResponse>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    Object d(@vw.a @NotNull ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, @NotNull eu.b<? super sw.x<ExchangeOneTimeLinkCodeResponse>> bVar);

    @vw.n("/api/internal/verify/v1/current-inquiry-session")
    @Nullable
    Object e(@vw.i("Authorization") @NotNull String str, @vw.a @NotNull UpdateInquirySessionRequest updateInquirySessionRequest, @NotNull eu.b<? super sw.x<i0>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/current-inquiry-session/cancel")
    Object f(@vw.i("Authorization") @NotNull String str, @NotNull eu.b<? super sw.x<i0>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @vw.l
    @vw.k({"Accept: multipart/form-data"})
    Object g(@vw.i("Authorization") @NotNull String str, @NotNull @vw.s("inquiryId") String str2, @vw.q @NotNull List<c0.c> list, @NotNull eu.b<? super sw.x<CheckInquiryResponse>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    Object h(@vw.i("Authorization") @NotNull String str, @NotNull @vw.s("inquiryId") String str2, @vw.a @NotNull TransitionBackRequest transitionBackRequest, @NotNull eu.b<? super sw.x<CheckInquiryResponse>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object i(@vw.i("Authorization") @NotNull String str, @NotNull @vw.s("inquiryId") String str2, @vw.a @NotNull TransitionInquiryRequest transitionInquiryRequest, @NotNull eu.b<? super sw.x<CheckInquiryResponse>> bVar);

    @vw.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    @Nullable
    Object j(@vw.i("Authorization") @NotNull String str, @vw.i("Persona-Device-Id") @Nullable String str2, @NotNull @vw.s("inquiryId") String str3, @vw.t("include") @NotNull String str4, @NotNull eu.b<? super sw.x<CheckInquiryResponse>> bVar);

    @Nullable
    @vw.o("/api/internal/verify/v1/inquiry-sessions")
    Object k(@vw.a @NotNull CreateInquirySessionRequest createInquirySessionRequest, @vw.i("Persona-Device-Id") @Nullable String str, @NotNull eu.b<? super sw.x<CreateInquirySessionResponse>> bVar);
}
