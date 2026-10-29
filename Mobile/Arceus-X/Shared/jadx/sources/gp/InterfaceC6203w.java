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
import com.withpersona.sdk2.inquiry.p057ui.network.TransitionInquiryRequest;
import java.util.List;
import kotlin.Metadata;
import mv.InterfaceC8692a;
import mv.InterfaceC8697f;
import mv.InterfaceC8700i;
import mv.InterfaceC8702k;
import mv.InterfaceC8703l;
import mv.InterfaceC8705n;
import mv.InterfaceC8706o;
import mv.InterfaceC8708q;
import mv.InterfaceC8710s;
import mv.InterfaceC8711t;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gp.w */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH§@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010'J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, m31665d2 = {"Lgp/w;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "", "fallbackMode", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "k", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "g", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "sessionToken", "inquiryId", "include", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lokhttp3/ResponseBody;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lnt/b;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "body", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "j", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lnt/b;)Ljava/lang/Object;", "h", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lnt/b;)Ljava/lang/Object;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC6203w {
    @InterfaceC8706o("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m27312a(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8692a @NotNull VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, @NotNull InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m27313b(@InterfaceC8692a @NotNull ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, @NotNull InterfaceC9557b<? super C7396x<ExchangeOneTimeLinkCodeResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/current-inquiry-session/error")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m27314c(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8692a @NotNull ErrorRequest errorRequest, @NotNull InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b);

    @InterfaceC8697f("/api/internal/verify/v1/inquiries/{inquiryId}")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m27315d(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8700i("Persona-Device-Id") @Nullable String str2, @InterfaceC8710s("inquiryId") @NotNull String str3, @InterfaceC8711t("include") @NotNull String str4, @NotNull InterfaceC9557b<? super C7396x<CheckInquiryResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m27316e(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("inquiryId") @NotNull String str2, @InterfaceC8692a @NotNull TransitionInquiryRequest transitionInquiryRequest, @NotNull InterfaceC9557b<? super C7396x<CheckInquiryResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Nullable
    @InterfaceC8702k({"Accept: multipart/form-data"})
    @InterfaceC8703l
    /* JADX INFO: renamed from: f */
    Object m27317f(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("inquiryId") @NotNull String str2, @InterfaceC8708q @NotNull List<MultipartBody.Part> list, @NotNull InterfaceC9557b<? super C7396x<CheckInquiryResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiry-sessions")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m27318g(@InterfaceC8692a @NotNull CreateInquirySessionRequest createInquirySessionRequest, @InterfaceC8700i("Persona-Device-Id") @Nullable String str, @NotNull InterfaceC9557b<? super C7396x<CreateInquirySessionResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/current-inquiry-session/cancel")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m27319h(@InterfaceC8700i("Authorization") @NotNull String str, @NotNull InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b);

    @InterfaceC8705n("/api/internal/verify/v1/current-inquiry-session")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m27320i(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8692a @NotNull UpdateInquirySessionRequest updateInquirySessionRequest, @NotNull InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m27321j(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("inquiryId") @NotNull String str2, @InterfaceC8692a @NotNull TransitionBackRequest transitionBackRequest, @NotNull InterfaceC9557b<? super C7396x<CheckInquiryResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiries")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m27322k(@InterfaceC8692a @NotNull CreateInquiryRequest createInquiryRequest, @InterfaceC8700i("Persona-Fallback-Mode") @Nullable String str, @NotNull InterfaceC9557b<? super C7396x<CheckInquiryResponse>> interfaceC9557b);
}
