package p392qr;

import com.withpersona.sdk2.inquiry.p057ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.p057ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.p057ui.network.OneTimeLinkCodeForPersonasRequest;
import com.withpersona.sdk2.inquiry.p057ui.network.OneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.steps.p056ui.network.AddressAutocompleteResponse;
import kotlin.Metadata;
import mv.InterfaceC8692a;
import mv.InterfaceC8697f;
import mv.InterfaceC8700i;
import mv.InterfaceC8706o;
import mv.InterfaceC8710s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: qr.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014À\u0006\u0003"}, m31665d2 = {"Lqr/c;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "request", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "d", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;Lnt/b;)Ljava/lang/Object;", "addressId", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;Lnt/b;)Ljava/lang/Object;", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC10703c {
    @InterfaceC8706o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-create-popup-one-time-link-code")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m40795a(@InterfaceC8710s("inquiryId") @NotNull String str, @InterfaceC8700i("Authorization") @NotNull String str2, @NotNull InterfaceC9557b<? super C7396x<OneTimeLinkCodeResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-verify-popup-one-time-link-code")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m40796b(@InterfaceC8710s("inquiryId") @NotNull String str, @InterfaceC8700i("Authorization") @NotNull String str2, @InterfaceC8692a @NotNull OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequest, @NotNull InterfaceC9557b<? super C7396x<OneTimeLinkCodeResponse>> interfaceC9557b);

    @InterfaceC8697f("/api/internal/verify/v1/address/{addressId}")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m40797c(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8710s("addressId") @NotNull String str2, @NotNull InterfaceC9557b<? super C7396x<AddressDetailsResponse>> interfaceC9557b);

    @InterfaceC8706o("/api/internal/verify/v1/address/autocomplete")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m40798d(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8692a @NotNull AddressAutocompleteRequest addressAutocompleteRequest, @NotNull InterfaceC9557b<? super C7396x<AddressAutocompleteResponse>> interfaceC9557b);
}
