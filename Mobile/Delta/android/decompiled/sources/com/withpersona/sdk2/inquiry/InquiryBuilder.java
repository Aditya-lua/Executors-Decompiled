package com.withpersona.sdk2.inquiry;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vp.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u0016\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u000f\u0010!\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\"R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "", "<init>", "()V", "inquiryId", "", "oneTimeLinkCode", "relaySessionToken", "theme", "", "Ljava/lang/Integer;", "userProvidedTheme", "", "sessionToken", "useServerStyles", "Ljava/lang/Boolean;", "locale", "styleVariant", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "consumeExceptions", "redirectUri", "shareToken", "fieldMappings", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "personaHost", "Lcom/withpersona/sdk2/inquiry/PersonaHost;", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "routingCountry", "host", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "resolveTheme", "()Ljava/lang/Integer;", "Companion", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InquiryBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Boolean consumeExceptions;

    @NotNull
    private List<FieldMapping> fieldMappings = p.k();

    @Nullable
    private String inquiryId;

    @Nullable
    private String locale;

    @Nullable
    private String oneTimeLinkCode;

    @Nullable
    private PersonaHost personaHost;

    @Nullable
    private String redirectUri;

    @Nullable
    private String relaySessionToken;

    @Nullable
    private String sessionToken;

    @Nullable
    private String shareToken;

    @Nullable
    private StyleVariant styleVariant;

    @Nullable
    private Integer theme;

    @Nullable
    private Boolean useServerStyles;
    private boolean userProvidedTheme;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;", "", "<init>", "()V", "fromInquiryId", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "inquiryId", "", "fromInquiryId$inquiry_dynamic_feature_release", "fromOneTimeLinkCode", "code", "fromOneTimeLinkCode$inquiry_dynamic_feature_release", "fromRelaySessionToken", "relaySessionToken", "fromRelaySessionToken$inquiry_dynamic_feature_release", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InquiryBuilder fromInquiryId$inquiry_dynamic_feature_release(@NotNull String inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.inquiryId = inquiryId;
            return inquiryBuilder;
        }

        @NotNull
        public final InquiryBuilder fromOneTimeLinkCode$inquiry_dynamic_feature_release(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.oneTimeLinkCode = code;
            return inquiryBuilder;
        }

        @NotNull
        public final InquiryBuilder fromRelaySessionToken$inquiry_dynamic_feature_release(@NotNull String relaySessionToken) {
            Intrinsics.checkNotNullParameter(relaySessionToken, "relaySessionToken");
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.relaySessionToken = relaySessionToken;
            return inquiryBuilder;
        }

        private Companion() {
        }
    }

    private final Integer resolveTheme() {
        if (!this.userProvidedTheme && this.styleVariant == StyleVariant.DARK) {
            return Integer.valueOf(h.f33412a);
        }
        return this.theme;
    }

    @NotNull
    public final Inquiry build() {
        String str = this.inquiryId;
        String str2 = this.oneTimeLinkCode;
        String str3 = this.relaySessionToken;
        String str4 = this.sessionToken;
        Integer numResolveTheme = resolveTheme();
        String str5 = this.inquiryId;
        return new Inquiry(null, null, str, str4, str2, str3, null, null, null, numResolveTheme, null, null, null, null, (str5 == null || !x.T(str5, "iqfs", false, 2, null)) ? FallbackMode.NEVER : FallbackMode.ALWAYS, this.useServerStyles, null, null, this.locale, this.styleVariant, this.consumeExceptions, this.redirectUri, this.shareToken, this.fieldMappings, this.personaHost);
    }

    @NotNull
    public final InquiryBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    @NotNull
    public final InquiryBuilder fieldMappings(@NotNull List<FieldMapping> fieldMappings) {
        Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
        this.fieldMappings = fieldMappings;
        return this;
    }

    @NotNull
    public final InquiryBuilder host(@NotNull PersonaHost personaHost) {
        Intrinsics.checkNotNullParameter(personaHost, "personaHost");
        this.personaHost = personaHost;
        return this;
    }

    @NotNull
    public final InquiryBuilder locale(@Nullable String locale) {
        this.locale = locale;
        return this;
    }

    @NotNull
    public final InquiryBuilder redirectUri(@Nullable String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    @NotNull
    public final InquiryBuilder routingCountry(@Nullable String routingCountry) {
        return this;
    }

    @NotNull
    public final InquiryBuilder sessionToken(@Nullable String sessionToken) {
        if (sessionToken != null && sessionToken.length() != 0) {
            this.sessionToken = sessionToken;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @NotNull
    public final InquiryBuilder shareToken(@Nullable String shareToken) {
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
    public final InquiryBuilder styleVariant(@Nullable StyleVariant styleVariant) {
        this.styleVariant = styleVariant;
        return this;
    }

    @NotNull
    public final InquiryBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.userProvidedTheme = true;
        this.useServerStyles = Boolean.FALSE;
        return this;
    }

    @NotNull
    public final InquiryBuilder theme(@NotNull ThemeSource themeSource) {
        Intrinsics.checkNotNullParameter(themeSource, "themeSource");
        this.theme = themeSource.getTheme();
        this.userProvidedTheme = themeSource.getTheme() != null;
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }
}
