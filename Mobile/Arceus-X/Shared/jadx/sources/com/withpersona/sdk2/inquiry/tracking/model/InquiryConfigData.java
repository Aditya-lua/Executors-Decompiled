package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 JÂ\u0001\u00108\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b'\u0010 R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 ¨\u0006?"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "", "templateId", "", "templateVersion", "environment", "environmentId", "organizationId", "uiFramework", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "themeSetId", "hasAccountId", "", "hasFields", "hasInquiryId", "hasOneTimeLinkCode", "hasRedirectUri", "hasReferenceId", "hasSessionToken", "hasTheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTemplateId", "()Ljava/lang/String;", "getTemplateVersion", "getEnvironment", "getEnvironmentId", "getOrganizationId", "getUiFramework", "()Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "getThemeSetId", "getHasAccountId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasFields", "getHasInquiryId", "getHasOneTimeLinkCode", "getHasRedirectUri", "getHasReferenceId", "getHasSessionToken", "getHasTheme", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class InquiryConfigData {

    @Nullable
    private final String environment;

    @Nullable
    private final String environmentId;

    @Nullable
    private final Boolean hasAccountId;

    @Nullable
    private final Boolean hasFields;

    @Nullable
    private final Boolean hasInquiryId;

    @Nullable
    private final Boolean hasOneTimeLinkCode;

    @Nullable
    private final Boolean hasRedirectUri;

    @Nullable
    private final Boolean hasReferenceId;

    @Nullable
    private final Boolean hasSessionToken;

    @Nullable
    private final Boolean hasTheme;

    @Nullable
    private final String organizationId;

    @Nullable
    private final String templateId;

    @Nullable
    private final String templateVersion;

    @Nullable
    private final String themeSetId;

    @Nullable
    private final UiFramework uiFramework;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InquiryConfigData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHasInquiryId() {
        return this.hasInquiryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getHasOneTimeLinkCode() {
        return this.hasOneTimeLinkCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getHasRedirectUri() {
        return this.hasRedirectUri;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getHasReferenceId() {
        return this.hasReferenceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getHasSessionToken() {
        return this.hasSessionToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getHasTheme() {
        return this.hasTheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEnvironmentId() {
        return this.environmentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrganizationId() {
        return this.organizationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UiFramework getUiFramework() {
        return this.uiFramework;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThemeSetId() {
        return this.themeSetId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getHasAccountId() {
        return this.hasAccountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHasFields() {
        return this.hasFields;
    }

    @NotNull
    public final InquiryConfigData copy(@InterfaceC11872g(name = "template_id") @Nullable String templateId, @InterfaceC11872g(name = "template_version") @Nullable String templateVersion, @Nullable String environment, @InterfaceC11872g(name = "environment_id") @Nullable String environmentId, @InterfaceC11872g(name = "organization_id") @Nullable String organizationId, @InterfaceC11872g(name = "ui_framework") @Nullable UiFramework uiFramework, @InterfaceC11872g(name = "theme_set_id") @Nullable String themeSetId, @InterfaceC11872g(name = "has_account_id") @Nullable Boolean hasAccountId, @InterfaceC11872g(name = "has_fields") @Nullable Boolean hasFields, @InterfaceC11872g(name = "has_inquiry_id") @Nullable Boolean hasInquiryId, @InterfaceC11872g(name = "has_one_time_link_code") @Nullable Boolean hasOneTimeLinkCode, @InterfaceC11872g(name = "has_redirect_uri") @Nullable Boolean hasRedirectUri, @InterfaceC11872g(name = "has_reference_id") @Nullable Boolean hasReferenceId, @InterfaceC11872g(name = "has_session_token") @Nullable Boolean hasSessionToken, @InterfaceC11872g(name = "has_theme") @Nullable Boolean hasTheme) {
        return new InquiryConfigData(templateId, templateVersion, environment, environmentId, organizationId, uiFramework, themeSetId, hasAccountId, hasFields, hasInquiryId, hasOneTimeLinkCode, hasRedirectUri, hasReferenceId, hasSessionToken, hasTheme);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquiryConfigData)) {
            return false;
        }
        InquiryConfigData inquiryConfigData = (InquiryConfigData) other;
        return Intrinsics.m31980c(this.templateId, inquiryConfigData.templateId) && Intrinsics.m31980c(this.templateVersion, inquiryConfigData.templateVersion) && Intrinsics.m31980c(this.environment, inquiryConfigData.environment) && Intrinsics.m31980c(this.environmentId, inquiryConfigData.environmentId) && Intrinsics.m31980c(this.organizationId, inquiryConfigData.organizationId) && this.uiFramework == inquiryConfigData.uiFramework && Intrinsics.m31980c(this.themeSetId, inquiryConfigData.themeSetId) && Intrinsics.m31980c(this.hasAccountId, inquiryConfigData.hasAccountId) && Intrinsics.m31980c(this.hasFields, inquiryConfigData.hasFields) && Intrinsics.m31980c(this.hasInquiryId, inquiryConfigData.hasInquiryId) && Intrinsics.m31980c(this.hasOneTimeLinkCode, inquiryConfigData.hasOneTimeLinkCode) && Intrinsics.m31980c(this.hasRedirectUri, inquiryConfigData.hasRedirectUri) && Intrinsics.m31980c(this.hasReferenceId, inquiryConfigData.hasReferenceId) && Intrinsics.m31980c(this.hasSessionToken, inquiryConfigData.hasSessionToken) && Intrinsics.m31980c(this.hasTheme, inquiryConfigData.hasTheme);
    }

    @Nullable
    public final String getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final String getEnvironmentId() {
        return this.environmentId;
    }

    @Nullable
    public final Boolean getHasAccountId() {
        return this.hasAccountId;
    }

    @Nullable
    public final Boolean getHasFields() {
        return this.hasFields;
    }

    @Nullable
    public final Boolean getHasInquiryId() {
        return this.hasInquiryId;
    }

    @Nullable
    public final Boolean getHasOneTimeLinkCode() {
        return this.hasOneTimeLinkCode;
    }

    @Nullable
    public final Boolean getHasRedirectUri() {
        return this.hasRedirectUri;
    }

    @Nullable
    public final Boolean getHasReferenceId() {
        return this.hasReferenceId;
    }

    @Nullable
    public final Boolean getHasSessionToken() {
        return this.hasSessionToken;
    }

    @Nullable
    public final Boolean getHasTheme() {
        return this.hasTheme;
    }

    @Nullable
    public final String getOrganizationId() {
        return this.organizationId;
    }

    @Nullable
    public final String getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    @Nullable
    public final String getThemeSetId() {
        return this.themeSetId;
    }

    @Nullable
    public final UiFramework getUiFramework() {
        return this.uiFramework;
    }

    public int hashCode() {
        String str = this.templateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.environment;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.environmentId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.organizationId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UiFramework uiFramework = this.uiFramework;
        int iHashCode6 = (iHashCode5 + (uiFramework == null ? 0 : uiFramework.hashCode())) * 31;
        String str6 = this.themeSetId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.hasAccountId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasFields;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasInquiryId;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasOneTimeLinkCode;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasRedirectUri;
        int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasReferenceId;
        int iHashCode13 = (iHashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasSessionToken;
        int iHashCode14 = (iHashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hasTheme;
        return iHashCode14 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InquiryConfigData(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", organizationId=" + this.organizationId + ", uiFramework=" + this.uiFramework + ", themeSetId=" + this.themeSetId + ", hasAccountId=" + this.hasAccountId + ", hasFields=" + this.hasFields + ", hasInquiryId=" + this.hasInquiryId + ", hasOneTimeLinkCode=" + this.hasOneTimeLinkCode + ", hasRedirectUri=" + this.hasRedirectUri + ", hasReferenceId=" + this.hasReferenceId + ", hasSessionToken=" + this.hasSessionToken + ", hasTheme=" + this.hasTheme + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public InquiryConfigData(@InterfaceC11872g(name = "template_id") @Nullable String str, @InterfaceC11872g(name = "template_version") @Nullable String str2, @Nullable String str3, @InterfaceC11872g(name = "environment_id") @Nullable String str4, @InterfaceC11872g(name = "organization_id") @Nullable String str5, @InterfaceC11872g(name = "ui_framework") @Nullable UiFramework uiFramework, @InterfaceC11872g(name = "theme_set_id") @Nullable String str6, @InterfaceC11872g(name = "has_account_id") @Nullable Boolean bool, @InterfaceC11872g(name = "has_fields") @Nullable Boolean bool2, @InterfaceC11872g(name = "has_inquiry_id") @Nullable Boolean bool3, @InterfaceC11872g(name = "has_one_time_link_code") @Nullable Boolean bool4, @InterfaceC11872g(name = "has_redirect_uri") @Nullable Boolean bool5, @InterfaceC11872g(name = "has_reference_id") @Nullable Boolean bool6, @InterfaceC11872g(name = "has_session_token") @Nullable Boolean bool7, @InterfaceC11872g(name = "has_theme") @Nullable Boolean bool8) {
        this.templateId = str;
        this.templateVersion = str2;
        this.environment = str3;
        this.environmentId = str4;
        this.organizationId = str5;
        this.uiFramework = uiFramework;
        this.themeSetId = str6;
        this.hasAccountId = bool;
        this.hasFields = bool2;
        this.hasInquiryId = bool3;
        this.hasOneTimeLinkCode = bool4;
        this.hasRedirectUri = bool5;
        this.hasReferenceId = bool6;
        this.hasSessionToken = bool7;
        this.hasTheme = bool8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.tracking.model.UiFramework:?: TERNARY null = ((wrap int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.tracking.model.UiFramework) : (r22v0 com.withpersona.sdk2.inquiry.tracking.model.UiFramework))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r30v0 java.lang.Boolean))
      (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r31v0 java.lang.Boolean))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.UiFramework, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:18) call: com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.UiFramework, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InquiryConfigData(String str, String str2, String str3, String str4, String str5, UiFramework uiFramework, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : uiFramework, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : bool3, (i10 & 1024) != 0 ? null : bool4, (i10 & 2048) != 0 ? null : bool5, (i10 & 4096) != 0 ? null : bool6, (i10 & 8192) != 0 ? null : bool7, (i10 & 16384) != 0 ? null : bool8);
    }
}
