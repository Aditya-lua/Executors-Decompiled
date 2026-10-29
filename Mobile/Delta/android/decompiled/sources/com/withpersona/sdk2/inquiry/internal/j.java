package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.UiFramework;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "uiFramework", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    @NotNull
    public static final InquiryConfigData a(@NotNull InquiryWorkflow$Props inquiryWorkflow$Props, @NotNull UiFramework uiFramework) {
        Intrinsics.checkNotNullParameter(inquiryWorkflow$Props, "<this>");
        Intrinsics.checkNotNullParameter(uiFramework, "uiFramework");
        if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.TemplateProps) {
            InquiryWorkflow$Props.TemplateProps templateProps = (InquiryWorkflow$Props.TemplateProps) inquiryWorkflow$Props;
            boolean z10 = false;
            String templateId = templateProps.getTemplateId();
            String templateVersion = templateProps.getTemplateVersion();
            String lowerCase = templateProps.getEnvironment().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String environmentId = templateProps.getEnvironmentId();
            String themeSetId = templateProps.getThemeSetId();
            boolean z11 = templateProps.getAccountId() != null;
            Map<String, InquiryField> mapG = templateProps.g();
            boolean z12 = mapG != null && (mapG.isEmpty() ^ true);
            boolean z13 = templateProps.getReferenceId() != null;
            boolean z14 = templateProps.getRedirectUri() != null;
            if (templateProps.getTheme() != null) {
                z10 = true;
            }
            return new InquiryConfigData(templateId, templateVersion, lowerCase, environmentId, null, uiFramework, themeSetId, Boolean.valueOf(z11), Boolean.valueOf(z12), null, null, Boolean.valueOf(z14), Boolean.valueOf(z13), Boolean.TRUE, Boolean.valueOf(z10), 1552, null);
        }
        if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.InquiryProps) {
            InquiryWorkflow$Props.InquiryProps inquiryProps = (InquiryWorkflow$Props.InquiryProps) inquiryWorkflow$Props;
            String lowerCase2 = inquiryProps.getEnvironment().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            boolean z15 = inquiryProps.getTheme() != null;
            Boolean bool = Boolean.TRUE;
            return new InquiryConfigData(null, null, lowerCase2, null, null, uiFramework, null, null, null, bool, null, null, null, bool, Boolean.valueOf(z15), 7643, null);
        }
        if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.OneTimeCodeProps) {
            InquiryWorkflow$Props.OneTimeCodeProps oneTimeCodeProps = (InquiryWorkflow$Props.OneTimeCodeProps) inquiryWorkflow$Props;
            String lowerCase3 = oneTimeCodeProps.getEnvironment().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            boolean z16 = oneTimeCodeProps.getTheme() != null;
            Boolean bool2 = Boolean.TRUE;
            return new InquiryConfigData(null, null, lowerCase3, null, null, uiFramework, null, null, null, null, bool2, null, null, bool2, Boolean.valueOf(z16), 7131, null);
        }
        if (!(inquiryWorkflow$Props instanceof InquiryWorkflow$Props.RelaySessionProps)) {
            throw new jt.l();
        }
        InquiryWorkflow$Props.RelaySessionProps relaySessionProps = (InquiryWorkflow$Props.RelaySessionProps) inquiryWorkflow$Props;
        String lowerCase4 = relaySessionProps.getEnvironment().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        return new InquiryConfigData(null, null, lowerCase4, null, null, uiFramework, null, null, null, null, null, null, null, Boolean.TRUE, Boolean.valueOf(relaySessionProps.getTheme() != null), 8155, null);
    }
}
