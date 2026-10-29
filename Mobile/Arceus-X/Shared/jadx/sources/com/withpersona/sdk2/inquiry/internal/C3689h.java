package com.withpersona.sdk2.inquiry.internal;

import android.os.Bundle;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StyleVariant;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p456u2.C11774c;
import p610zo.EnumC13962h;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b1\u0010\fR\u0013\u00106\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00108\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b7\u0010-R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010>\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u0010\fR\u0011\u0010@\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b?\u0010\fR\u0011\u0010B\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bA\u0010\fR\u0011\u0010D\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bC\u0010\fR\u0013\u0010F\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bE\u0010\fR\u0011\u0010H\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0011\u0010J\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bI\u0010-R\u0011\u0010L\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bK\u0010-R\u0011\u0010N\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bM\u0010-R\u0013\u0010P\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bO\u0010\fR\u0013\u0010R\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bQ\u0010\fR\u0011\u0010T\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bS\u0010-R\u0011\u0010V\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bU\u0010-R\u0013\u0010X\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bW\u0010\fR\u0013\u0010Z\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bY\u0010\fR\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[8F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/h;", "", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "a", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "", "t", "()Ljava/lang/String;", "requestKey", "A", "templateId", "B", "templateVersion", "m", "inquiryId", "w", "sessionToken", "r", "referenceId", "accountId", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "k", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "fieldsWrapper", "", "C", "()Ljava/lang/Integer;", "theme", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "y", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lzo/h;", "f", "()Lzo/h;", "environment", "g", "environmentId", "", "e", "()Z", "enableErrorLogging", "F", "useServerStyles", "n", "locale", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "z", "()Lcom/withpersona/sdk2/inquiry/StyleVariant;", "styleVariant", "u", "returnCollectedData", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "h", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "v", "serverEndpoint", "G", "webRtcServerEndpoint", "i", "fallbackModeServerEndpoint", "E", "trackingEventServerEndpoint", "D", "themeSetId", "b", "consumeExceptions", "H", "isNavBarEnabled", "c", "controlNavigationBar", "d", "controlStatusBar", "o", "oneTimeLinkCode", "s", "relaySessionToken", "p", "redactAppIdentifyingInformation", "l", "handleBackPress", "q", "redirectUri", "x", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "j", "()Ljava/util/List;", "fieldMappings", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3689h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Bundle bundle;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/h$a;", "", "<init>", "()V", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "DEFAULT_SERVER_ENDPOINT", "Ljava/lang/String;", "DEFAULT_WEB_RTC_SERVER_ENDPOINT", "DEFAULT_FALLBACK_MODE_SERVER_ENDPOINT", "DEFAULT_TRACKING_EVENTS_SERVER_ENDPOINT", "PACKAGE_NAME_PREFIX", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m18550a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return StringsKt.m32155b1(str, "Bearer ", null, 2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C3689h(@Nullable Bundle bundle) {
        this.bundle = bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final String m18516A() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_ID_KEY");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final String m18517B() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_VERSION_KEY");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public final Integer m18518C() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return Integer.valueOf(bundle.getInt("THEME_KEY"));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public final String m18519D() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("THEME_SET_ID_KEY");
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final String m18520E() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("TRACKING_EVENTS_SERVER_ENDPOINT")) == null) ? "https://tg.withpersona.com" : string;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m18521F() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("USE_SERVER_STYLES", true);
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final String m18522G() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("WEB_RTC_SERVER_ENDPOINT")) == null) ? "https://webrtc-consumer.withpersona.com" : string;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m18523H() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("IS_NAV_BAR_ENABLED", true);
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m18524a() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ACCOUNT_ID_KEY");
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18525b() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONSUME_EXCEPTIONS", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18526c() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_NAVIGATION_BAR", true);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18527d() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_STATUS_BAR", true);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18528e() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("ENABLE_ERROR_LOGGING", true);
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final EnumC13962h m18529f() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("ENVIRONMENT_KEY") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -2056856391) {
                if (iHashCode == -1711584601 && string.equals("SANDBOX")) {
                    return EnumC13962h.SANDBOX;
                }
            } else if (string.equals("PRODUCTION")) {
                return EnumC13962h.PRODUCTION;
            }
        }
        return EnumC13962h.PRODUCTION;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m18530g() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ENVIRONMENT_ID_KEY");
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final FallbackMode m18531h() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("FALLBACK_MODE") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 64924498) {
                if (iHashCode != 74175084) {
                    if (iHashCode == 1933739535 && string.equals("ALWAYS")) {
                        return FallbackMode.ALWAYS;
                    }
                } else if (string.equals("NEVER")) {
                    return FallbackMode.NEVER;
                }
            } else if (string.equals("DEFER")) {
                return FallbackMode.DEFER;
            }
        }
        return FallbackMode.NEVER;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m18532i() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("FALLBACK_MODE_SERVER_ENDPOINT")) == null) ? "https://inquiry-fallback.withpersona.com" : string;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<FieldMapping> m18533j() {
        InquiryFieldMappings inquiryFieldMappings;
        List<FieldMapping> listM18078h1;
        Bundle bundle = this.bundle;
        return (bundle == null || (inquiryFieldMappings = (InquiryFieldMappings) C11774c.m44055a(bundle, "FIELD_MAPPINGS", InquiryFieldMappings.class)) == null || (listM18078h1 = inquiryFieldMappings.m18078h1()) == null) ? C7699p.m31892k() : listM18078h1;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final InquiryFieldsMap m18534k() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (InquiryFieldsMap) C11774c.m44055a(bundle, "FIELDS_MAP_KEY", InquiryFieldsMap.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m18535l() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("HANDLE_BACK_PRESS", true);
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final String m18536m() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("INQUIRY_ID_KEY");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final String m18537n() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("LOCALE");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final String m18538o() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ONE_TIME_LINK_CODE");
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18539p() {
        return m18542s() != null;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m18540q() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("REDIRECT_URI");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final String m18541r() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("REFERENCE_ID_KEY");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final String m18542s() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("RELAY_SESSION_TOKEN");
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final String m18543t() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("REQUEST_KEY")) == null) ? "com.withpersona.sdk2.request_key" : string;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18544u() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("RETURN_COLLECTED_DATA", false);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final String m18545v() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("SERVER_ENDPOINT")) == null) ? "https://withpersona.com" : string;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final String m18546w() {
        String string;
        Bundle bundle = this.bundle;
        if (bundle == null || (string = bundle.getString("SESSION_TOKEN_KEY")) == null) {
            return null;
        }
        return "Bearer " + string;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final String m18547x() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("SHARE_TOKEN");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final StaticInquiryTemplate m18548y() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (StaticInquiryTemplate) C11774c.m44055a(bundle, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final StyleVariant m18549z() {
        StyleVariant.Companion companion = StyleVariant.INSTANCE;
        Bundle bundle = this.bundle;
        return companion.fromValue(bundle != null ? bundle.getString("STYLE_VARIANT") : null);
    }
}
