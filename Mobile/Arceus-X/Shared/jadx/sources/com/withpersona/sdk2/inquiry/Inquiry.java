package com.withpersona.sdk2.inquiry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMappings;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldsMap;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p110eo.C5173a;
import p154h.AbstractC6248a;
import p229jt.C7345l;
import p456u2.C11774c;
import p610zo.C13955d0;
import p610zo.C13986w;
import p610zo.EnumC13985v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u00020\u0001:\u00029:B\u0087\u0002\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000eH\u0007J\b\u0010/\u001a\u000200H\u0007J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0015\u00105\u001a\u00020+2\u0006\u00106\u001a\u000207H\u0000¢\u0006\u0002\b8R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010(R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry;", "", "templateId", "", "templateVersion", "inquiryId", "sessionToken", "oneTimeLinkCode", "relaySessionToken", "referenceId", "accountId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "theme", "", "environment", "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "enableErrorLogging", "", "returnCollectedData", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "useServerStyles", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "themeSetId", "locale", "styleVariant", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "consumeExceptions", "redirectUri", "shareToken", "fieldMappings", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "personaHost", "Lcom/withpersona/sdk2/inquiry/PersonaHost;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StyleVariant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/PersonaHost;)V", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "start", "", "activity", "Landroid/app/Activity;", "requestCode", "buildInlineInquiry", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "toInquiryActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "addArgumentsToBundle", "bundle", "Landroid/os/Bundle;", "addArgumentsToBundle$inquiry_dynamic_feature_release", "Contract", "Companion", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Inquiry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String accountId;

    @Nullable
    private final Boolean consumeExceptions;

    @Nullable
    private final Boolean enableErrorLogging;

    @Nullable
    private final Environment environment;

    @Nullable
    private final String environmentId;

    @Nullable
    private final FallbackMode fallbackMode;

    @NotNull
    private final List<FieldMapping> fieldMappings;

    @Nullable
    private final Fields fields;

    @Nullable
    private final String inquiryId;

    @Nullable
    private final String locale;

    @Nullable
    private final String oneTimeLinkCode;

    @Nullable
    private final PersonaHost personaHost;

    @Nullable
    private final String redirectUri;

    @Nullable
    private final String referenceId;

    @Nullable
    private final String relaySessionToken;

    @Nullable
    private final Boolean returnCollectedData;

    @Nullable
    private final String sessionToken;

    @Nullable
    private final String shareToken;

    @Nullable
    private final StaticInquiryTemplate staticInquiryTemplate;

    @Nullable
    private final StyleVariant styleVariant;

    @Nullable
    private final String templateId;

    @Nullable
    private final String templateVersion;

    @Nullable
    private final Integer theme;

    @Nullable
    private final String themeSetId;

    @Nullable
    private final Boolean useServerStyles;

    @Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u0018J%\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010\u0003J\r\u0010'\u001a\u00020%¢\u0006\u0004\b'\u0010\u0003R.\u0010/\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010\u0003\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroid/content/Context;", "context", "Lzo/v;", "getStatus", "(Landroid/os/Bundle;Landroid/content/Context;)Lzo/v;", "", "templateId", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "fromTemplate", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "templateVersion", "fromTemplateVersion", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "fromStaticTemplate", "(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "fromInquiry", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "oneTimeLinkCode", "fromOneTimeLinkCode", "relaySessionToken", "fromRelaySessionToken", "Landroid/content/Intent;", "intent", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "onActivityResult", "(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "bundle", "extractInquiryResponseFromBundle", "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "", "prefetchModels", "cancelRunningInquiries", "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "value", "getOnEventListener", "()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "setOnEventListener", "(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V", "getOnEventListener$annotations", "onEventListener", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC13985v.values().length];
                try {
                    iArr[EnumC13985v.INQUIRY_COMPLETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13985v.INQUIRY_CANCELED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC13985v.INQUIRY_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.Inquiry.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalInquiryApi
        public static /* synthetic */ void getOnEventListener$annotations() {
        }

        private final EnumC13985v getStatus(Bundle bundle, Context context) {
            String string;
            EnumC13985v enumC13985vValueOf = null;
            if (bundle != null && (string = bundle.getString("PERSONA_ACTIVITY_RESULT")) != null) {
                try {
                    enumC13985vValueOf = EnumC13985v.valueOf(string);
                } catch (Exception unused) {
                }
            }
            if (enumC13985vValueOf != null) {
                return enumC13985vValueOf;
            }
            if (context != null && new C5173a(context).m24053f()) {
                return EnumC13985v.INQUIRY_ERROR;
            }
            return EnumC13985v.INQUIRY_CANCELED;
        }

        public static /* synthetic */ InquiryResponse onActivityResult$default(Companion companion, Intent intent, Context context, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                context = null;
            }
            return companion.onActivityResult(intent, context);
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager.cancelRunningInquiries$default(com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager, boolean, int, java.lang.Object):void */
        public final void cancelRunningInquiries() {
            InquiryActivityBroadcastManager.cancelRunningInquiries$default(InquiryActivityBroadcastManager.INSTANCE, false, 1, null);
        }

        @NotNull
        public final InquiryResponse extractInquiryResponseFromBundle(@Nullable Bundle bundle, @Nullable Context context) {
            InquiryFieldsMap inquiryFieldsMap;
            ErrorCode errorCode;
            ErrorCode errorCode2;
            EnumC13985v status = getStatus(bundle, context);
            String string = bundle != null ? bundle.getString("INQUIRY_ID_KEY") : null;
            int i10 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i10 == 1) {
                if (bundle == null || (inquiryFieldsMap = (InquiryFieldsMap) C11774c.m44055a(bundle, "FIELDS_MAP_KEY", InquiryFieldsMap.class)) == null) {
                    inquiryFieldsMap = new InquiryFieldsMap(C7690k0.m31795j());
                }
                String string2 = bundle != null ? bundle.getString("INQUIRY_STATUS_KEY") : null;
                CollectedData collectedData = bundle != null ? (CollectedData) C11774c.m44055a(bundle, "COLLECTED_DATA", CollectedData.class) : null;
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string2);
                return new InquiryResponse.Complete(string, string2, inquiryFieldsMap.m18081a(), collectedData);
            }
            if (i10 == 2) {
                return new InquiryResponse.Cancel(string, bundle != null ? bundle.getString("SESSION_TOKEN_KEY") : null);
            }
            if (i10 != 3) {
                throw new C7345l();
            }
            String string3 = bundle != null ? bundle.getString("ERROR_DEBUG_MESSAGE_KEY") : null;
            String strM24052e = context != null ? new C5173a(context).m24052e() : null;
            if (bundle != null) {
                try {
                    errorCode = (ErrorCode) bundle.getParcelable("ERROR_CODE_KEY");
                } catch (Exception unused) {
                    errorCode2 = ErrorCode.UnexpectedError;
                }
            } else {
                errorCode = null;
            }
            ErrorCode errorCode3 = errorCode != null ? errorCode : null;
            if (errorCode3 == null) {
                errorCode3 = ErrorCode.UnexpectedError;
            }
            errorCode2 = errorCode3;
            if (string3 == null) {
                string3 = "An otherwise unexpected error occurred.";
            }
            return new InquiryResponse.Error(string3, errorCode2, strM24052e);
        }

        @NotNull
        public final InquiryBuilder fromInquiry(@NotNull String inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return InquiryBuilder.INSTANCE.fromInquiryId$inquiry_dynamic_feature_release(inquiryId);
        }

        @NotNull
        public final InquiryBuilder fromOneTimeLinkCode(@NotNull String oneTimeLinkCode) {
            Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
            return InquiryBuilder.INSTANCE.fromOneTimeLinkCode$inquiry_dynamic_feature_release(oneTimeLinkCode);
        }

        @NotNull
        public final InquiryBuilder fromRelaySessionToken(@NotNull String relaySessionToken) {
            Intrinsics.checkNotNullParameter(relaySessionToken, "relaySessionToken");
            return InquiryBuilder.INSTANCE.fromRelaySessionToken$inquiry_dynamic_feature_release(relaySessionToken);
        }

        @ExperimentalInquiryFlow
        @NotNull
        public final InquiryTemplateBuilder fromStaticTemplate(@NotNull StaticInquiryTemplate staticInquiryTemplate) {
            Intrinsics.checkNotNullParameter(staticInquiryTemplate, "staticInquiryTemplate");
            return new InquiryTemplateBuilder(null, null, staticInquiryTemplate, 3, null);
        }

        @NotNull
        public final InquiryTemplateBuilder fromTemplate(@NotNull String templateId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            return new InquiryTemplateBuilder(templateId, null, null, 6, null);
        }

        @NotNull
        public final InquiryTemplateBuilder fromTemplateVersion(@NotNull String templateVersion) {
            Intrinsics.checkNotNullParameter(templateVersion, "templateVersion");
            return new InquiryTemplateBuilder(null, templateVersion, null, 5, null);
        }

        @Nullable
        public final OnInquiryEventListener getOnEventListener() {
            return C13986w.INSTANCE.m50534a().getOnEventListener();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @NotNull
        public final InquiryResponse onActivityResult(@Nullable Intent intent) {
            return onActivityResult$default(this, intent, null, 2, null);
        }

        public final void prefetchModels() throws IllegalAccessException, InstantiationException {
            C13955d0.f48737a.m50456a();
        }

        public final void setOnEventListener(@Nullable OnInquiryEventListener onInquiryEventListener) {
            C13986w.INSTANCE.m50534a().m50533d(onInquiryEventListener);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @NotNull
        public final InquiryResponse onActivityResult(@Nullable Intent intent, @Nullable Context context) {
            return extractInquiryResponseFromBundle(intent != null ? intent.getExtras() : null, context);
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;", "Lh/a;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "<init>", "()V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/Inquiry;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "Landroid/content/Context;", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static class Contract extends AbstractC6248a<Inquiry, InquiryResponse> {

        @Nullable
        private Context context;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Contract() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Contract(@NotNull Context context) {
            this();
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // p154h.AbstractC6248a
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Inquiry input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input.toInquiryActivityIntent(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p154h.AbstractC6248a
        @NotNull
        public InquiryResponse parseResult(int resultCode, @Nullable Intent intent) {
            return Inquiry.INSTANCE.onActivityResult(intent, this.context);
        }
    }

    public Inquiry(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Fields fields, @Nullable Integer num, @Nullable Environment environment, @Nullable String str9, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable FallbackMode fallbackMode, @Nullable Boolean bool3, @Nullable StaticInquiryTemplate staticInquiryTemplate, @Nullable String str10, @Nullable String str11, @Nullable StyleVariant styleVariant, @Nullable Boolean bool4, @Nullable String str12, @Nullable String str13, @NotNull List<FieldMapping> fieldMappings, @Nullable PersonaHost personaHost) {
        Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.oneTimeLinkCode = str5;
        this.relaySessionToken = str6;
        this.referenceId = str7;
        this.accountId = str8;
        this.fields = fields;
        this.theme = num;
        this.environment = environment;
        this.environmentId = str9;
        this.enableErrorLogging = bool;
        this.returnCollectedData = bool2;
        this.fallbackMode = fallbackMode;
        this.useServerStyles = bool3;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.themeSetId = str10;
        this.locale = str11;
        this.styleVariant = styleVariant;
        this.consumeExceptions = bool4;
        this.redirectUri = str12;
        this.shareToken = str13;
        this.fieldMappings = fieldMappings;
        this.personaHost = personaHost;
    }

    @NotNull
    public static final InquiryResponse extractInquiryResponseFromBundle(@Nullable Bundle bundle, @Nullable Context context) {
        return INSTANCE.extractInquiryResponseFromBundle(bundle, context);
    }

    @NotNull
    public static final InquiryBuilder fromInquiry(@NotNull String str) {
        return INSTANCE.fromInquiry(str);
    }

    @NotNull
    public static final InquiryBuilder fromOneTimeLinkCode(@NotNull String str) {
        return INSTANCE.fromOneTimeLinkCode(str);
    }

    @NotNull
    public static final InquiryBuilder fromRelaySessionToken(@NotNull String str) {
        return INSTANCE.fromRelaySessionToken(str);
    }

    @ExperimentalInquiryFlow
    @NotNull
    public static final InquiryTemplateBuilder fromStaticTemplate(@NotNull StaticInquiryTemplate staticInquiryTemplate) {
        return INSTANCE.fromStaticTemplate(staticInquiryTemplate);
    }

    @NotNull
    public static final InquiryTemplateBuilder fromTemplate(@NotNull String str) {
        return INSTANCE.fromTemplate(str);
    }

    @NotNull
    public static final InquiryTemplateBuilder fromTemplateVersion(@NotNull String str) {
        return INSTANCE.fromTemplateVersion(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public static final InquiryResponse onActivityResult(@Nullable Intent intent) {
        return INSTANCE.onActivityResult(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent toInquiryActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.withpersona.sdk2.inquiry.internal.InquiryActivity");
        Bundle bundle = new Bundle();
        addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        intent.replaceExtras(bundle);
        return intent;
    }

    public final void addArgumentsToBundle$inquiry_dynamic_feature_release(@NotNull Bundle bundle) {
        PersonaHostEndpoints endpoints;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str = this.templateId;
        if (str != null) {
            bundle.putString("TEMPLATE_ID_KEY", str);
        }
        String str2 = this.templateVersion;
        if (str2 != null) {
            bundle.putString("TEMPLATE_VERSION_KEY", str2);
        }
        String str3 = this.inquiryId;
        if (str3 != null) {
            bundle.putString("INQUIRY_ID_KEY", str3);
        }
        String str4 = this.oneTimeLinkCode;
        if (str4 != null) {
            bundle.putString("ONE_TIME_LINK_CODE", str4);
        }
        String str5 = this.relaySessionToken;
        if (str5 != null) {
            bundle.putString("RELAY_SESSION_TOKEN", str5);
        }
        String str6 = this.sessionToken;
        if (str6 != null) {
            bundle.putString("SESSION_TOKEN_KEY", str6);
        }
        String str7 = this.referenceId;
        if (str7 != null) {
            bundle.putString("REFERENCE_ID_KEY", str7);
        }
        String str8 = this.accountId;
        if (str8 != null) {
            bundle.putString("ACCOUNT_ID_KEY", str8);
        }
        Fields fields = this.fields;
        if (fields != null) {
            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(fields.getFields$inquiry_dynamic_feature_release()));
        }
        Integer num = this.theme;
        if (num != null) {
            bundle.putInt("THEME_KEY", num.intValue());
        }
        StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
        if (staticInquiryTemplate != null) {
            bundle.putParcelable("STATIC_INQUIRY_TEMPLATE_KEY", staticInquiryTemplate);
        }
        Environment environment = this.environment;
        if (environment != null) {
            bundle.putString("ENVIRONMENT_KEY", environment.name());
        }
        String str9 = this.environmentId;
        if (str9 != null) {
            bundle.putString("ENVIRONMENT_ID_KEY", str9);
        }
        Boolean bool = this.enableErrorLogging;
        if (bool != null) {
            bundle.putBoolean("ENABLE_ERROR_LOGGING", bool.booleanValue());
        }
        Boolean bool2 = this.returnCollectedData;
        if (bool2 != null) {
            bundle.putBoolean("RETURN_COLLECTED_DATA", bool2.booleanValue());
        }
        FallbackMode fallbackMode = this.fallbackMode;
        if (fallbackMode != null) {
            bundle.putString("FALLBACK_MODE", fallbackMode.name());
        }
        Boolean bool3 = this.useServerStyles;
        if (bool3 != null) {
            bundle.putBoolean("USE_SERVER_STYLES", bool3.booleanValue());
        }
        String str10 = this.themeSetId;
        if (str10 != null) {
            bundle.putString("THEME_SET_ID_KEY", str10);
        }
        String str11 = this.locale;
        if (str11 != null) {
            bundle.putString("LOCALE", str11);
        }
        StyleVariant styleVariant = this.styleVariant;
        if (styleVariant != null) {
            bundle.putString("STYLE_VARIANT", styleVariant.getValue());
        }
        Boolean bool4 = this.consumeExceptions;
        if (bool4 != null) {
            bundle.putBoolean("CONSUME_EXCEPTIONS", bool4.booleanValue());
        }
        String str12 = this.redirectUri;
        if (str12 != null) {
            bundle.putString("REDIRECT_URI", str12);
        }
        String str13 = this.shareToken;
        if (str13 != null) {
            bundle.putString("SHARE_TOKEN", str13);
        }
        if (!this.fieldMappings.isEmpty()) {
            bundle.putParcelable("FIELD_MAPPINGS", new InquiryFieldMappings(this.fieldMappings));
        }
        PersonaHost personaHost = this.personaHost;
        if (personaHost == null || (endpoints = PersonaHostEndpointsKt.getEndpoints(personaHost)) == null) {
            return;
        }
        bundle.putString("SERVER_ENDPOINT", endpoints.getServerEndpoint());
        bundle.putString("WEB_RTC_SERVER_ENDPOINT", endpoints.getWebRtcServerEndpoint());
        bundle.putString("FALLBACK_MODE_SERVER_ENDPOINT", endpoints.getFallbackModeServerEndpoint());
        bundle.putString("TRACKING_EVENTS_SERVER_ENDPOINT", endpoints.getTrackingEventsServerEndpoint());
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiryBuilder buildInlineInquiry() {
        return new InlineInquiryBuilder(this);
    }

    public final void start(@NotNull Activity activity, int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(toInquiryActivityIntent(activity), requestCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NotNull
    public static final InquiryResponse onActivityResult(@Nullable Intent intent, @Nullable Context context) {
        return INSTANCE.onActivityResult(intent, context);
    }
}
