package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC8692a;
import mv.InterfaceC8700i;
import mv.InterfaceC8702k;
import mv.InterfaceC8706o;
import mv.InterfaceC8716y;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082dp.EnumC4654h;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006#À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "request", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "b", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "d", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;Lnt/b;)Ljava/lang/Object;", "authHeader", "Ldp/h;", "productionEndpoint", "", "requestCount", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "c", "(Ljava/lang/String;Ldp/h;ILcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;Lnt/b;)Ljava/lang/Object;", "url", "Lokhttp3/RequestBody;", "body", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;", "UploadUrlResponse", "UploadUrlRequest", "StatusRequest", "StatusResponse", "StaticTemplate", "SessionIdRequest", "SessionIdResponse", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface FallbackModeService {

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJz\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b%\u0010\u0012¨\u0006&"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "", "", "inquiryTemplateId", "inquiryTemplateVersion", "inquiryId", "referenceId", "accountId", "environment", "environmentId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "e", "d", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "i", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class SessionIdRequest {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryTemplateId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String inquiryTemplateVersion;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final String inquiryId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String referenceId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String accountId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final String environment;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        public final String environmentId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @Nullable
        public final InquiryFieldMap fields;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public final String themeSetId;

        public SessionIdRequest(@InterfaceC11872g(name = "inquiry-template-id") @NotNull String inquiryTemplateId, @InterfaceC11872g(name = "inquiry-template-version-id") @Nullable String str, @InterfaceC11872g(name = "inquiry-id") @Nullable String str2, @InterfaceC11872g(name = "reference-id") @Nullable String str3, @InterfaceC11872g(name = "account-id") @Nullable String str4, @Nullable String str5, @InterfaceC11872g(name = "environment-id") @Nullable String str6, @Nullable InquiryFieldMap inquiryFieldMap, @InterfaceC11872g(name = "theme-set-id") @Nullable String str7) {
            Intrinsics.checkNotNullParameter(inquiryTemplateId, "inquiryTemplateId");
            this.inquiryTemplateId = inquiryTemplateId;
            this.inquiryTemplateVersion = str;
            this.inquiryId = str2;
            this.referenceId = str3;
            this.accountId = str4;
            this.environment = str5;
            this.environmentId = str6;
            this.fields = inquiryFieldMap;
            this.themeSetId = str7;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @NotNull
        public final SessionIdRequest copy(@InterfaceC11872g(name = "inquiry-template-id") @NotNull String inquiryTemplateId, @InterfaceC11872g(name = "inquiry-template-version-id") @Nullable String inquiryTemplateVersion, @InterfaceC11872g(name = "inquiry-id") @Nullable String inquiryId, @InterfaceC11872g(name = "reference-id") @Nullable String referenceId, @InterfaceC11872g(name = "account-id") @Nullable String accountId, @Nullable String environment, @InterfaceC11872g(name = "environment-id") @Nullable String environmentId, @Nullable InquiryFieldMap fields, @InterfaceC11872g(name = "theme-set-id") @Nullable String themeSetId) {
            Intrinsics.checkNotNullParameter(inquiryTemplateId, "inquiryTemplateId");
            return new SessionIdRequest(inquiryTemplateId, inquiryTemplateVersion, inquiryId, referenceId, accountId, environment, environmentId, fields, themeSetId);
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final InquiryFieldMap getFields() {
            return this.fields;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionIdRequest)) {
                return false;
            }
            SessionIdRequest sessionIdRequest = (SessionIdRequest) other;
            return Intrinsics.m31980c(this.inquiryTemplateId, sessionIdRequest.inquiryTemplateId) && Intrinsics.m31980c(this.inquiryTemplateVersion, sessionIdRequest.inquiryTemplateVersion) && Intrinsics.m31980c(this.inquiryId, sessionIdRequest.inquiryId) && Intrinsics.m31980c(this.referenceId, sessionIdRequest.referenceId) && Intrinsics.m31980c(this.accountId, sessionIdRequest.accountId) && Intrinsics.m31980c(this.environment, sessionIdRequest.environment) && Intrinsics.m31980c(this.environmentId, sessionIdRequest.environmentId) && Intrinsics.m31980c(this.fields, sessionIdRequest.fields) && Intrinsics.m31980c(this.themeSetId, sessionIdRequest.themeSetId);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getInquiryTemplateId() {
            return this.inquiryTemplateId;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getInquiryTemplateVersion() {
            return this.inquiryTemplateVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        public int hashCode() {
            int iHashCode = this.inquiryTemplateId.hashCode() * 31;
            String str = this.inquiryTemplateVersion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inquiryId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.referenceId;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accountId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.environment;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.environmentId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            InquiryFieldMap inquiryFieldMap = this.fields;
            int iHashCode8 = (iHashCode7 + (inquiryFieldMap == null ? 0 : inquiryFieldMap.hashCode())) * 31;
            String str7 = this.themeSetId;
            return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        @NotNull
        public String toString() {
            return "SessionIdRequest(inquiryTemplateId=" + this.inquiryTemplateId + ", inquiryTemplateVersion=" + this.inquiryTemplateVersion + ", inquiryId=" + this.inquiryId + ", referenceId=" + this.referenceId + ", accountId=" + this.accountId + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class SessionIdResponse {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String token;

        public SessionIdResponse(@NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionIdResponse) && Intrinsics.m31980c(this.token, ((SessionIdResponse) other).token);
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        @NotNull
        public String toString() {
            return "SessionIdResponse(token=" + this.token + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class StaticTemplate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep> steps;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep> */
        /* JADX WARN: Multi-variable type inference failed */
        public StaticTemplate(@NotNull List<? extends NextStep> steps) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.steps = steps;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<NextStep> m18460a() {
            return this.steps;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StaticTemplate) && Intrinsics.m31980c(this.steps, ((StaticTemplate) other).steps);
        }

        public int hashCode() {
            return this.steps.hashCode();
        }

        @NotNull
        public String toString() {
            return "StaticTemplate(steps=" + this.steps + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "", "", "inquiryTemplateId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class StatusRequest {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String inquiryTemplateId;

        public StatusRequest(@InterfaceC11872g(name = "inquiry-template-id") @Nullable String str) {
            this.inquiryTemplateId = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquiryTemplateId() {
            return this.inquiryTemplateId;
        }

        @NotNull
        public final StatusRequest copy(@InterfaceC11872g(name = "inquiry-template-id") @Nullable String inquiryTemplateId) {
            return new StatusRequest(inquiryTemplateId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusRequest) && Intrinsics.m31980c(this.inquiryTemplateId, ((StatusRequest) other).inquiryTemplateId);
        }

        public int hashCode() {
            String str = this.inquiryTemplateId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "StatusRequest(inquiryTemplateId=" + this.inquiryTemplateId + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "staticInquiryTemplate", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)V", "copy", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class StatusResponse {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final StaticTemplate staticInquiryTemplate;

        public StatusResponse(@InterfaceC11872g(name = "static-inquiry-template") @Nullable StaticTemplate staticTemplate) {
            this.staticInquiryTemplate = staticTemplate;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final StaticTemplate getStaticInquiryTemplate() {
            return this.staticInquiryTemplate;
        }

        @NotNull
        public final StatusResponse copy(@InterfaceC11872g(name = "static-inquiry-template") @Nullable StaticTemplate staticInquiryTemplate) {
            return new StatusResponse(staticInquiryTemplate);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusResponse) && Intrinsics.m31980c(this.staticInquiryTemplate, ((StatusResponse) other).staticInquiryTemplate);
        }

        public int hashCode() {
            StaticTemplate staticTemplate = this.staticInquiryTemplate;
            if (staticTemplate == null) {
                return 0;
            }
            return staticTemplate.hashCode();
        }

        @NotNull
        public String toString() {
            return "StatusResponse(staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "", "", "expectedContentLength", "", "expectedContentType", "<init>", "(JLjava/lang/String;)V", "copy", "(JLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class UploadUrlRequest {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long expectedContentLength;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String expectedContentType;

        public UploadUrlRequest(@InterfaceC11872g(name = "expected-content-length") long j10, @InterfaceC11872g(name = "expected-content-type") @NotNull String expectedContentType) {
            Intrinsics.checkNotNullParameter(expectedContentType, "expectedContentType");
            this.expectedContentLength = j10;
            this.expectedContentType = expectedContentType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getExpectedContentLength() {
            return this.expectedContentLength;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExpectedContentType() {
            return this.expectedContentType;
        }

        @NotNull
        public final UploadUrlRequest copy(@InterfaceC11872g(name = "expected-content-length") long expectedContentLength, @InterfaceC11872g(name = "expected-content-type") @NotNull String expectedContentType) {
            Intrinsics.checkNotNullParameter(expectedContentType, "expectedContentType");
            return new UploadUrlRequest(expectedContentLength, expectedContentType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadUrlRequest)) {
                return false;
            }
            UploadUrlRequest uploadUrlRequest = (UploadUrlRequest) other;
            return this.expectedContentLength == uploadUrlRequest.expectedContentLength && Intrinsics.m31980c(this.expectedContentType, uploadUrlRequest.expectedContentType);
        }

        public int hashCode() {
            return (Long.hashCode(this.expectedContentLength) * 31) + this.expectedContentType.hashCode();
        }

        @NotNull
        public String toString() {
            return "UploadUrlRequest(expectedContentLength=" + this.expectedContentLength + ", expectedContentType=" + this.expectedContentType + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "", "", "location", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class UploadUrlResponse {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String location;

        public UploadUrlResponse(@NotNull String location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.location = location;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadUrlResponse) && Intrinsics.m31980c(this.location, ((UploadUrlResponse) other).location);
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        @NotNull
        public String toString() {
            return "UploadUrlResponse(location=" + this.location + ")";
        }
    }

    @InterfaceC8706o
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m18446a(@InterfaceC8716y @NotNull String str, @InterfaceC8692a @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<Object>> interfaceC9557b);

    @InterfaceC8702k({"Content-Type: application/json"})
    @InterfaceC8706o("/template")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m18447b(@InterfaceC8700i("Authorization") @Nullable String str, @InterfaceC8692a @NotNull StatusRequest statusRequest, @NotNull InterfaceC9557b<? super C7396x<StatusResponse>> interfaceC9557b);

    @InterfaceC8702k({"Content-Type: application/json"})
    @InterfaceC8706o("/part")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m18448c(@InterfaceC8700i("Authorization") @NotNull String str, @InterfaceC8700i("Persona-Fallback-Production-Endpoint") @NotNull EnumC4654h enumC4654h, @InterfaceC8700i("Persona-Fallback-Request-Count") int i10, @InterfaceC8692a @NotNull UploadUrlRequest uploadUrlRequest, @NotNull InterfaceC9557b<? super C7396x<UploadUrlResponse>> interfaceC9557b);

    @InterfaceC8702k({"Content-Type: application/json"})
    @InterfaceC8706o("/session")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m18449d(@InterfaceC8692a @NotNull SessionIdRequest sessionIdRequest, @NotNull InterfaceC9557b<? super C7396x<SessionIdResponse>> interfaceC9557b);
}
