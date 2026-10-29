package gp;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.InquiryField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gp.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b \u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b*\u0010\u0015R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b$\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b(\u0010\u0015¨\u0006/"}, d2 = {"Lgp/e;", "", "", "templateId", "templateVersion", "inquiryId", "sessionToken", "Lzo/h;", "environment", "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "themeSetId", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "j", "c", "e", "d", "h", "Lzo/h;", "()Lzo/h;", "f", "g", "getNote", "Ljava/util/Map;", "()Ljava/util/Map;", "k", "l", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InquiryAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String templateId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String templateVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String sessionToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final zo.h environment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String environmentId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String accountId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String referenceId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String note;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Map<String, InquiryField> fields;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String themeSetId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String redirectUri;

    /* JADX WARN: Multi-variable type inference failed */
    public InquiryAttributes(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull zo.h environment, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Map<String, ? extends InquiryField> map, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.environment = environment;
        this.environmentId = str5;
        this.accountId = str6;
        this.referenceId = str7;
        this.note = str8;
        this.fields = map;
        this.themeSetId = str9;
        this.redirectUri = str10;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final zo.h getEnvironment() {
        return this.environment;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEnvironmentId() {
        return this.environmentId;
    }

    @Nullable
    public final Map<String, InquiryField> d() {
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
        if (!(other instanceof InquiryAttributes)) {
            return false;
        }
        InquiryAttributes inquiryAttributes = (InquiryAttributes) other;
        return Intrinsics.c(this.templateId, inquiryAttributes.templateId) && Intrinsics.c(this.templateVersion, inquiryAttributes.templateVersion) && Intrinsics.c(this.inquiryId, inquiryAttributes.inquiryId) && Intrinsics.c(this.sessionToken, inquiryAttributes.sessionToken) && this.environment == inquiryAttributes.environment && Intrinsics.c(this.environmentId, inquiryAttributes.environmentId) && Intrinsics.c(this.accountId, inquiryAttributes.accountId) && Intrinsics.c(this.referenceId, inquiryAttributes.referenceId) && Intrinsics.c(this.note, inquiryAttributes.note) && Intrinsics.c(this.fields, inquiryAttributes.fields) && Intrinsics.c(this.themeSetId, inquiryAttributes.themeSetId) && Intrinsics.c(this.redirectUri, inquiryAttributes.redirectUri);
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
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        String str = this.templateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inquiryId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionToken;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.environment.hashCode()) * 31;
        String str5 = this.environmentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.accountId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.note;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, InquiryField> map = this.fields;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.themeSetId;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.redirectUri;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getThemeSetId() {
        return this.themeSetId;
    }

    @NotNull
    public String toString() {
        return "InquiryAttributes(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", note=" + this.note + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", redirectUri=" + this.redirectUri + ")";
    }

    public /* synthetic */ InquiryAttributes(String str, String str2, String str3, String str4, zo.h hVar, String str5, String str6, String str7, String str8, Map map, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, hVar, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str8, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : map, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : str9, (i10 & Barcode.FORMAT_PDF417) != 0 ? null : str10);
    }
}
