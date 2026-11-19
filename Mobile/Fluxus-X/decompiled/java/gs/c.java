package gs;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeForPersonasRequest;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import sw.x;
import vw.f;
import vw.i;
import vw.o;
import vw.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lgs/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "request", "Lsw/x;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "b", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;Leu/b;)Ljava/lang/Object;", "addressId", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;Leu/b;)Ljava/lang/Object;", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @Nullable
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-create-popup-one-time-link-code")
    Object a(@NotNull @s("inquiryId") String str, @i("Authorization") @NotNull String str2, @NotNull eu.b<? super x<OneTimeLinkCodeResponse>> bVar);

    @Nullable
    @o("/api/internal/verify/v1/address/autocomplete")
    Object b(@i("Authorization") @NotNull String str, @vw.a @NotNull AddressAutocompleteRequest addressAutocompleteRequest, @NotNull eu.b<? super x<AddressAutocompleteResponse>> bVar);

    @f("/api/internal/verify/v1/address/{addressId}")
    @Nullable
    Object c(@i("Authorization") @NotNull String str, @NotNull @s("addressId") String str2, @NotNull eu.b<? super x<AddressDetailsResponse>> bVar);

    @Nullable
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-verify-popup-one-time-link-code")
    Object d(@NotNull @s("inquiryId") String str, @i("Authorization") @NotNull String str2, @vw.a @NotNull OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequest, @NotNull eu.b<? super x<OneTimeLinkCodeResponse>> bVar);
}
