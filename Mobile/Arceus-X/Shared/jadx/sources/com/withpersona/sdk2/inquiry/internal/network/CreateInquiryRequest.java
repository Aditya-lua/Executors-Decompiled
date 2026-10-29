package com.withpersona.sdk2.inquiry.internal.network;

import androidx.core.view.PointerIconCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import gp.C6181a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0003\n\u0006\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "b", "Data", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class CreateInquiryRequest {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Data data;

    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "attributes", "", Payload.TYPE, "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "Adapter", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Data {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C3696a attributes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$Data$Adapter, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;", "", "<init>", "()V", "Lum/t;", "jsonWriter", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest.Data.Adapter.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            @InterfaceC11871f
            public final Data fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                reader.mo44325b();
                String strMo44338r = "";
                String strMo44338r2 = strMo44338r;
                while (reader.mo44329f()) {
                    String strMo44335n = reader.mo44335n();
                    if (Intrinsics.m31980c(strMo44335n, "templateId")) {
                        strMo44338r = reader.mo44338r();
                        Intrinsics.checkNotNullExpressionValue(strMo44338r, "nextString(...)");
                    } else if (Intrinsics.m31980c(strMo44335n, "environment")) {
                        strMo44338r2 = reader.mo44338r();
                        Intrinsics.checkNotNullExpressionValue(strMo44338r2, "nextString(...)");
                    } else {
                        reader.mo44321P();
                    }
                }
                reader.mo44327d();
                return new Data(new C3696a(strMo44338r, null, strMo44338r2, "", null, null, null, null, null, null, PointerIconCompat.TYPE_ALIAS, null), null, 2, 0 == true ? 1 : 0);
            }

            @InterfaceC11891z
            public final void toJson(@NotNull AbstractC11885t jsonWriter, @NotNull Data data) {
                Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
                Intrinsics.checkNotNullParameter(data, "data");
                jsonWriter.mo44374c();
                jsonWriter.mo44380n("attributes");
                jsonWriter.mo44374c();
                String templateId = data.getAttributes().getTemplateId();
                if (templateId != null) {
                    jsonWriter.mo44380n("inquiryTemplateId").mo44367M(templateId);
                }
                String templateVersion = data.getAttributes().getTemplateVersion();
                if (templateVersion != null) {
                    jsonWriter.mo44380n("inquiryTemplateVersionId").mo44367M(templateVersion);
                }
                jsonWriter.mo44380n("environment").mo44367M(data.getAttributes().getEnvironment());
                String environmentId = data.getAttributes().getEnvironmentId();
                if (environmentId != null) {
                    jsonWriter.mo44380n("environment_id").mo44367M(environmentId);
                }
                String accountId = data.getAttributes().getAccountId();
                if (accountId != null) {
                    jsonWriter.mo44380n("accountId").mo44367M(accountId);
                }
                String referenceId = data.getAttributes().getReferenceId();
                if (referenceId != null) {
                    jsonWriter.mo44380n("referenceId").mo44367M(referenceId);
                }
                String note = data.getAttributes().getNote();
                if (note != null) {
                    jsonWriter.mo44380n("note").mo44367M(note);
                }
                if (data.getAttributes().m18608d() != null) {
                    jsonWriter.mo44380n("fields");
                    InquiryFieldMap.INSTANCE.toJson(jsonWriter, new InquiryFieldMap(data.getAttributes().m18608d()));
                }
                if (data.getAttributes().getThemeSetId() != null) {
                    jsonWriter.mo44380n("themeSetId").mo44367M(data.getAttributes().getThemeSetId());
                }
                if (data.getAttributes().getRedirectUri() != null) {
                    jsonWriter.mo44380n("redirectUri").mo44367M(data.getAttributes().getRedirectUri());
                }
                jsonWriter.mo44378g();
                jsonWriter.mo44378g();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Data(@NotNull C3696a attributes, @NotNull String type) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(type, "type");
            this.attributes = attributes;
            this.type = type;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C3696a getAttributes() {
            return this.attributes;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
          (r1v0 com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$a)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("inquiry") : (r2v0 java.lang.String))
         A[MD:(com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$a, java.lang.String):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest.Data.<init>(com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$a, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ Data(C3696a c3696a, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c3696a, (i10 & 2) != 0 ? "inquiry" : str);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$b;", "", "<init>", "()V", "", "templateId", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "themeSetId", "redirectUri", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final CreateInquiryRequest m18615a(@Nullable String templateId, @Nullable String templateVersion, @NotNull String environment, @Nullable String environmentId, @Nullable String accountId, @Nullable String referenceId, @Nullable Map<String, ? extends InquiryField> fields, @Nullable String themeSetId, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new CreateInquiryRequest(new Data(new C3696a(templateId, templateVersion, environment, environmentId, accountId, referenceId, null, fields != null ? C6181a.m27238t(fields) : null, themeSetId, redirectUri, 64, null), null, 2, 0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public CreateInquiryRequest(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "", "", "templateId", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "i", "c", "d", "e", "f", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "j", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3696a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String templateId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String templateVersion;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String environment;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final String environmentId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final String accountId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final String referenceId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public final String note;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> fields;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final String themeSetId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public final String redirectUri;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3696a(@Nullable String str, @Nullable String str2, @NotNull String environment, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField> map, @Nullable String str7, @Nullable String str8) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.templateId = str;
            this.templateVersion = str2;
            this.environment = environment;
            this.environmentId = str3;
            this.accountId = str4;
            this.referenceId = str5;
            this.note = str6;
            this.fields = map;
            this.themeSetId = str7;
            this.redirectUri = str8;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> m18608d() {
            return this.fields;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNote() {
            return this.note;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
          (r4v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0010: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0015: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r12v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
          (wrap java.util.Map:?: TERNARY null = ((wrap int:0x001f: ARITH (r12v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r9v0 java.util.Map))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0024: ARITH (r12v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0029: ARITH (r12v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField>, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ C3696a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : map, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9);
        }
    }
}
