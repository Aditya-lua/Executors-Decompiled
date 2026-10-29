package com.withpersona.sdk2.inquiry;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vp.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0003J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\"\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0006\u0010,\u001a\u00020-J\u000f\u0010.\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010/R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "", "templateId", "", "templateVersion", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "accountId", "referenceId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "theme", "", "Ljava/lang/Integer;", "userProvidedTheme", "", "themeSetId", "environment", "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "enableErrorLogging", "Ljava/lang/Boolean;", "returnCollectedData", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "useServerStyles", "locale", "styleVariant", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "consumeExceptions", "redirectUri", "shareToken", "fieldMappings", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "personaHost", "Lcom/withpersona/sdk2/inquiry/PersonaHost;", "fromTemplateId", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "routingCountry", "host", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "resolveTheme", "()Ljava/lang/Integer;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InquiryTemplateBuilder {

    @Nullable
    private String accountId;

    @Nullable
    private Boolean consumeExceptions;

    @Nullable
    private Boolean enableErrorLogging;

    @Nullable
    private Environment environment;

    @Nullable
    private String environmentId;

    @NotNull
    private FallbackMode fallbackMode;

    @NotNull
    private List<FieldMapping> fieldMappings;

    @Nullable
    private Fields fields;

    @Nullable
    private String locale;

    @Nullable
    private PersonaHost personaHost;

    @Nullable
    private String redirectUri;

    @Nullable
    private String referenceId;

    @Nullable
    private Boolean returnCollectedData;

    @Nullable
    private String shareToken;

    @Nullable
    private final StaticInquiryTemplate staticInquiryTemplate;

    @Nullable
    private StyleVariant styleVariant;

    @Nullable
    private final String templateId;

    @Nullable
    private final String templateVersion;

    @Nullable
    private Integer theme;

    @Nullable
    private String themeSetId;

    @Nullable
    private Boolean useServerStyles;
    private boolean userProvidedTheme;

    public InquiryTemplateBuilder() {
        this(null, null, null, 7, null);
    }

    private final Integer resolveTheme() {
        if (!this.userProvidedTheme && this.styleVariant == StyleVariant.DARK) {
            return Integer.valueOf(h.f33412a);
        }
        return this.theme;
    }

    @NotNull
    public final InquiryTemplateBuilder accountId(@Nullable String accountId) {
        this.referenceId = null;
        this.accountId = accountId;
        return this;
    }

    @NotNull
    public final Inquiry build() {
        return new Inquiry(this.templateId, this.templateVersion, null, null, null, null, this.referenceId, this.accountId, this.fields, resolveTheme(), this.environment, this.environmentId, this.enableErrorLogging, this.returnCollectedData, this.fallbackMode, this.useServerStyles, this.staticInquiryTemplate, this.themeSetId, this.locale, this.styleVariant, this.consumeExceptions, this.redirectUri, this.shareToken, this.fieldMappings, this.personaHost);
    }

    @NotNull
    public final InquiryTemplateBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder enableErrorLogging(boolean enableErrorLogging) {
        this.enableErrorLogging = Boolean.valueOf(enableErrorLogging);
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder environment(@NotNull Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.environment = environment;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder environmentId(@NotNull String environmentId) {
        Intrinsics.checkNotNullParameter(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    @ExperimentalFallbackMode
    @NotNull
    public final InquiryTemplateBuilder fallbackMode(@NotNull FallbackMode fallbackMode) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        this.fallbackMode = fallbackMode;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder fieldMappings(@NotNull List<FieldMapping> fieldMappings) {
        Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
        this.fieldMappings = fieldMappings;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder fields(@Nullable Fields fields) {
        this.fields = fields;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder fromTemplateId(@NotNull String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return new InquiryTemplateBuilder(templateId, null, null, 6, null);
    }

    @NotNull
    public final InquiryTemplateBuilder host(@NotNull PersonaHost personaHost) {
        Intrinsics.checkNotNullParameter(personaHost, "personaHost");
        this.personaHost = personaHost;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder locale(@Nullable String locale) {
        this.locale = locale;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder redirectUri(@Nullable String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder referenceId(@Nullable String referenceId) {
        this.accountId = null;
        this.referenceId = referenceId;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder returnCollectedData(boolean returnCollectedData) {
        this.returnCollectedData = Boolean.valueOf(returnCollectedData);
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder routingCountry(@Nullable String routingCountry) {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @NotNull
    public final InquiryTemplateBuilder shareToken(@Nullable String shareToken) {
        if (shareToken == null) {
            shareToken = null;
        } else {
            if (!(shareToken.length() > 0)) {
                shareToken = null;
            }
        }
        this.shareToken = shareToken;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder styleVariant(@Nullable StyleVariant styleVariant) {
        this.styleVariant = styleVariant;
        return this;
    }

    @NotNull
    public final InquiryTemplateBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.userProvidedTheme = true;
        this.useServerStyles = Boolean.FALSE;
        return this;
    }

    @ExperimentalThemeSetId
    @NotNull
    public final InquiryTemplateBuilder themeSetId(@NotNull String themeSetId) {
        Intrinsics.checkNotNullParameter(themeSetId, "themeSetId");
        this.themeSetId = themeSetId;
        return this;
    }

    public InquiryTemplateBuilder(@Nullable String str, @Nullable String str2, @Nullable StaticInquiryTemplate staticInquiryTemplate) {
        this.templateId = str;
        this.templateVersion = str2;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.fallbackMode = FallbackMode.NEVER;
        this.fieldMappings = p.k();
    }

    @NotNull
    public final InquiryTemplateBuilder theme(@NotNull ThemeSource themeSource) {
        Intrinsics.checkNotNullParameter(themeSource, "themeSource");
        this.theme = themeSource.getTheme();
        this.userProvidedTheme = themeSource.getTheme() != null;
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }

    public /* synthetic */ InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : staticInquiryTemplate);
    }
}
