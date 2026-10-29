package gp;

import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverridableText;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryTemplateVersion;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u001a\u001a\u00020\u0019*\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001ac\u00100\u001a\u00020/*\u00020$2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b0\u00101\u001a\u0017\u00103\u001a\u0004\u0018\u000102*\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b3\u00104\u001aM\u00107\u001a\u00020/*\u0002052\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b7\u00108\u001aC\u0010:\u001a\u00020/*\u0002092\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b:\u0010;\u001aM\u0010=\u001a\u00020/*\u00020<2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b=\u0010>\u001aC\u0010@\u001a\u00020/*\u00020?2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b@\u0010A\u001aa\u0010C\u001a\u00020/*\u00020B2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020/*\u00020E2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\bG\u0010H\u001a\u001b\u0010K\u001a\u00020J*\n\u0012\u0004\u0012\u00020I\u0018\u00010\u0003H\u0002¢\u0006\u0004\bK\u0010L\u001a\u0013\u0010N\u001a\u00020M*\u00020IH\u0002¢\u0006\u0004\bN\u0010O\u001a\u0015\u0010Q\u001a\u0004\u0018\u00010P*\u00020\u0001H\u0002¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010S\u001a\u00020<*\u00020$H\u0002¢\u0006\u0004\bS\u0010T\u001a\u0013\u0010W\u001a\u00020V*\u00020UH\u0002¢\u0006\u0004\bW\u0010X\u001a\u0013\u0010Z\u001a\u00020\u0010*\u00020YH\u0002¢\u0006\u0004\bZ\u0010[\u001a\u0015\u0010]\u001a\u00020\\*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b]\u0010^\u001a\u0015\u0010`\u001a\u00020_*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b`\u0010a\u001a)\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020b0(*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\bc\u0010d\u001a)\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)0(*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020b0(¢\u0006\u0004\be\u0010d\u001a\u0011\u0010f\u001a\u00020)*\u00020b¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010h\u001a\u00020b*\u00020)¢\u0006\u0004\bh\u0010i\u001a\u0011\u0010l\u001a\u00020k*\u00020j¢\u0006\u0004\bl\u0010m\u001a\u0013\u0010p\u001a\u0004\u0018\u00010o*\u00020n¢\u0006\u0004\bp\u0010q\"0\u0010w\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010s\u0012\u0004\u0012\u00020\u00010(*\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\"0\u0010y\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010s\u0012\u0004\u0012\u00020\u00010(*\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010v\"0\u0010}\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010s\u0012\u0004\u0012\u00020\u00010(*\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\"%\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\u00010(*\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010|\"'\u0010w\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010(*\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"'\u0010y\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010(*\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "", "centerOnly", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;)Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "sessionToken", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "trackingEventsUrl", "redirectUri", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "C", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;)Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "selectedCountryCode", "z", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "B", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "A", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "y", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "x", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "defaultTrackingEventsUrl", "w", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "N", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "M", "(Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Lkn/a;", "Q", "(Ljava/lang/String;)Lkn/a;", "K", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "J", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "L", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "Lyp/a;", "P", "(Ljava/lang/String;)Lyp/a;", "Lio/d;", "r", "(Ljava/lang/String;)Lio/d;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "v", "(Ljava/util/Map;)Ljava/util/Map;", "t", "s", "(Lcom/withpersona/sdk2/inquiry/InquiryField;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;)Lcom/withpersona/sdk2/inquiry/InquiryField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "R", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePoseInfo;", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "O", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePoseInfo;)Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;)Ljava/util/Map;", "titleBySide", "a", "descriptionBySide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;)Ljava/util/Map;", "scanInstructionsBySide", "Lgp/x;", "c", "scanInstructionsByClassAndSide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;)Ljava/util/Map;", "b", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    @NotNull
    public static final InquiryState A(@NotNull NextStep.Integration integration, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(integration, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String str4 = str == null ? "" : str;
        String name = integration.getName();
        String type = integration.getConfig().getType();
        String flowUrl = integration.getConfig().getFlowUrl();
        String redirectPath = integration.getConfig().getRedirectPath();
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = integration.getConfig().getIntegrationStepBrowserType();
        if (integrationStepBrowserType == null) {
            integrationStepBrowserType = NextStep.Integration.IntegrationStepBrowserType.AuthSession;
        }
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType2 = integrationStepBrowserType;
        Boolean backStepEnabled = integration.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = integration.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        NextStep.Integration.Localizations localizations = integration.getConfig().getLocalizations();
        NextStep.CancelDialog cancelDialog = localizations != null ? localizations.getCancelDialog() : null;
        NextStep.Integration.Localizations localizations2 = integration.getConfig().getLocalizations();
        StepStyles.IntegrationStepStyle styles = integration.getStyles();
        NextStep.Integration.Localizations localizations3 = integration.getConfig().getLocalizations();
        IntegrationPage integrationPageK = k(localizations3 != null ? localizations3.getPendingPage() : null, integration.getStyles());
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new InquiryState.IntegrationStepRunning(inquiryId, sessionToken, str2, null, styles, cancelDialog, type, flowUrl, redirectPath, integrationStepBrowserType2, localizations2, str4, name, zBooleanValue, zBooleanValue2, string, integrationPageK, null, inquirySessionConfig, str3, 131080, null);
    }

    @NotNull
    public static final InquiryState B(@NotNull NextStep.Selfie selfie, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2) {
        ArrayList arrayList;
        NextStep.Selfie.Pages.SelfiePages selfie2;
        NextStep.PendingUiPage pending;
        Intrinsics.checkNotNullParameter(selfie, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        NextStep.Selfie.CaptureMethod selfieType = selfie.getConfig().getSelfieType();
        String name = selfie.getName();
        String name2 = selfie.getName();
        Boolean backStepEnabled = selfie.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = selfie.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String fieldKeySelfie = selfie.getConfig().getFieldKeySelfie();
        boolean requireStrictSelfieCapture = selfie.getConfig().getRequireStrictSelfieCapture();
        Boolean skipPromptPage = selfie.getConfig().getSkipPromptPage();
        boolean zBooleanValue3 = skipPromptPage != null ? skipPromptPage.booleanValue() : false;
        NextStep.Selfie.Localizations localizations = selfie.getConfig().getLocalizations();
        StepStyles.SelfieStepStyle styles = selfie.getStyles();
        NextStep.CancelDialog cancelDialog = selfie.getConfig().getLocalizations().getCancelDialog();
        List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes = selfie.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = kotlin.collections.p.k();
        }
        List<NextStep.Selfie.CaptureFileType> list = enabledCaptureFileTypes;
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = selfie.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = kotlin.collections.p.k();
        }
        List<NextStep.Selfie.VideoCaptureMethod> list2 = videoCaptureMethods;
        NextStep.Selfie.AssetConfig assets = selfie.getConfig().getAssets();
        String videoSessionJwt = selfie.getConfig().getVideoSessionJwt();
        List<NextStep.Selfie.SelfiePose> orderedPoses = selfie.getConfig().getOrderedPoses();
        List<NextStep.Selfie.SelfiePoseInfo> orderedPosesBuffer = selfie.getConfig().getOrderedPosesBuffer();
        NextStep.Ui uiStep = null;
        if (orderedPosesBuffer != null) {
            arrayList = new ArrayList();
            Iterator<T> it = orderedPosesBuffer.iterator();
            while (it.hasNext()) {
                PoseInfo poseInfoO = O((NextStep.Selfie.SelfiePoseInfo) it.next());
                if (poseInfoO != null) {
                    arrayList.add(poseInfoO);
                }
            }
        } else {
            arrayList = null;
        }
        Long poseTimeoutMs = selfie.getConfig().getPoseTimeoutMs();
        PendingPageTextPosition pendingPageTextVerticalPosition = selfie.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = selfie.getConfig().getAudioEnabled();
        boolean zBooleanValue4 = audioEnabled != null ? audioEnabled.booleanValue() : true;
        PoseConfigs poseConfigsN = N(selfie.getConfig().getPoseConfigs());
        yp.a aVarP = P(selfie.getConfig().getDesignVersion());
        String imageUploadUrl = selfie.getConfig().getImageUploadUrl();
        String flowWatermarkText = selfie.getConfig().getFlowWatermarkText();
        String silentNetworkAuthenticationCheckUrl = selfie.getConfig().getSilentNetworkAuthenticationCheckUrl();
        Integer silentNetworkAuthenticationBackgroundTimeoutSeconds = selfie.getConfig().getSilentNetworkAuthenticationBackgroundTimeoutSeconds();
        NextStep.Selfie.Pages pages = selfie.getConfig().getPages();
        if (pages != null && (selfie2 = pages.getSelfie()) != null && (pending = selfie2.getPending()) != null) {
            uiStep = pending.getUiStep();
        }
        return new InquiryState.SelfieStepRunning(inquiryId, sessionToken, str, null, styles, cancelDialog, selfieType, name, name2, zBooleanValue, zBooleanValue2, fieldKeySelfie, requireStrictSelfieCapture, zBooleanValue3, localizations, list, list2, assets, videoSessionJwt, orderedPoses, arrayList, poseTimeoutMs, pendingPageTextPosition, zBooleanValue4, poseConfigsN, aVarP, inquirySessionConfig, imageUploadUrl, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, q(uiStep), str2, 8, 0, null);
    }

    @NotNull
    public static final InquiryState C(@NotNull NextStep.Ui ui2, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @Nullable Map<String, ? extends InquiryField> map, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
        Map<String, com.withpersona.sdk2.inquiry.InquiryField> mapJ;
        Intrinsics.checkNotNullParameter(ui2, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String str4 = str == null ? "" : str;
        String name = ui2.getName();
        List<UiComponentConfig> components = ui2.getConfig().getComponents();
        if (components == null) {
            components = kotlin.collections.p.k();
        }
        List<UiComponentConfig> list = components;
        Boolean backStepEnabled = ui2.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = ui2.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        Boolean terminal = ui2.getConfig().getTerminal();
        boolean zBooleanValue3 = terminal != null ? terminal.booleanValue() : false;
        String webviewUrl = ui2.getConfig().getWebviewUrl();
        if (map == null || (mapJ = v(map)) == null) {
            mapJ = k0.j();
        }
        Map<String, com.withpersona.sdk2.inquiry.InquiryField> map2 = mapJ;
        StepStyles.UiStepStyle styles = ui2.getStyles();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        NextStep.Ui.Localizations localizations = ui2.getConfig().getLocalizations();
        ArrayList arrayList = null;
        NextStep.CancelDialog cancelDialog = localizations != null ? localizations.getCancelDialog() : null;
        NextStep.Ui.Localizations localizations2 = ui2.getConfig().getLocalizations();
        List<UiComponentError> serverComponentErrors = ui2.getConfig().getServerComponentErrors();
        if (serverComponentErrors != null) {
            List<UiComponentError> list2 = serverComponentErrors;
            arrayList = new ArrayList(kotlin.collections.q.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new UiComponentErrorInfo((UiComponentError) it.next(), 0L, 2, null));
            }
        }
        return new InquiryState.UiStepRunning(inquiryId, sessionToken, str2, null, styles, cancelDialog, localizations2, str4, name, list, zBooleanValue, zBooleanValue2, zBooleanValue3, webviewUrl, map2, string, arrayList, null, inquirySessionConfig, false, str3, 131080, null);
    }

    public static /* synthetic */ InquiryState D(NextStep.Complete complete, String str, String str2, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        return x(complete, str, str2, str3, map, inquirySessionConfig, str4, str5);
    }

    public static /* synthetic */ InquiryState E(NextStep.Document document, String str, String str2, InquirySessionConfig inquirySessionConfig, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        return y(document, str, str2, inquirySessionConfig, str3, str4);
    }

    public static /* synthetic */ InquiryState F(NextStep.GovernmentId governmentId, String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        return z(governmentId, str, str2, str3, inquirySessionConfig, str4, str5);
    }

    public static /* synthetic */ InquiryState G(NextStep.Integration integration, String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        return A(integration, str, str2, str3, inquirySessionConfig, str4, str5);
    }

    public static /* synthetic */ InquiryState H(NextStep.Selfie selfie, String str, String str2, InquirySessionConfig inquirySessionConfig, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        return B(selfie, str, str2, inquirySessionConfig, str3, str4);
    }

    public static /* synthetic */ InquiryState I(NextStep.Ui ui2, String str, String str2, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        return C(ui2, str, str2, str3, map, inquirySessionConfig, str4, str5);
    }

    public static final NextStep.Integration.Localizations J(NextStep.Ui.Localizations localizations) {
        String title;
        String description;
        String launchButtonTitle;
        NextStep.CancelDialog cancelDialog = localizations.getCancelDialog();
        NextStep.WebViewPendingPage webviewPendingPage = localizations.getWebviewPendingPage();
        String str = "";
        if (webviewPendingPage == null || (title = webviewPendingPage.getTitle()) == null) {
            title = "";
        }
        NextStep.WebViewPendingPage webviewPendingPage2 = localizations.getWebviewPendingPage();
        if (webviewPendingPage2 == null || (description = webviewPendingPage2.getDescription()) == null) {
            description = "";
        }
        NextStep.WebViewPendingPage webviewPendingPage3 = localizations.getWebviewPendingPage();
        if (webviewPendingPage3 != null && (launchButtonTitle = webviewPendingPage3.getLaunchButtonTitle()) != null) {
            str = launchButtonTitle;
        }
        return new NextStep.Integration.Localizations(cancelDialog, new NextStep.Integration.PendingPage(title, description, str));
    }

    public static final NextStep.Integration K(NextStep.Ui ui2) {
        String name = ui2.getName();
        Boolean backStepEnabled = ui2.getConfig().getBackStepEnabled();
        Boolean cancelButtonEnabled = ui2.getConfig().getCancelButtonEnabled();
        String webviewUrl = ui2.getConfig().getWebviewUrl();
        if (webviewUrl == null) {
            webviewUrl = "";
        }
        String str = webviewUrl;
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = NextStep.Integration.IntegrationStepBrowserType.AuthSession;
        NextStep.Ui.Localizations localizations = ui2.getConfig().getLocalizations();
        NextStep.Integration.Config config = new NextStep.Integration.Config(backStepEnabled, cancelButtonEnabled, "webview", str, "", integrationStepBrowserType, localizations != null ? J(localizations) : null);
        StepStyles.UiStepStyle styles = ui2.getStyles();
        return new NextStep.Integration(name, config, styles != null ? L(styles) : null);
    }

    public static final StepStyles.IntegrationStepStyle L(StepStyles.UiStepStyle uiStepStyle) {
        return new StepStyles.IntegrationStepStyle(uiStepStyle.getHeaderButtonColor(), uiStepStyle.getBackgroundColor(), uiStepStyle.getBackgroundImage(), uiStepStyle.getTitleStyle(), uiStepStyle.getNavBarTitleStyle(), uiStepStyle.getTextStyle(), uiStepStyle.getButtonPrimaryStyle(), uiStepStyle.getButtonSecondaryStyle(), uiStepStyle.getStrokeColor(), uiStepStyle.getFillColor(), uiStepStyle.getAlignment(), uiStepStyle.getPadding(), uiStepStyle.getBorderRadius());
    }

    public static final PoseConfig M(com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig poseConfig) {
        PoseConfig poseConfigA = PoseConfig.INSTANCE.a();
        Boolean allowReview = poseConfig.getAllowReview();
        boolean zBooleanValue = allowReview != null ? allowReview.booleanValue() : poseConfigA.getAllowReview();
        Boolean manualCaptureEnabled = poseConfig.getManualCaptureEnabled();
        boolean zBooleanValue2 = manualCaptureEnabled != null ? manualCaptureEnabled.booleanValue() : poseConfigA.getManualCaptureEnabled();
        Long manualCaptureDelayMs = poseConfig.getManualCaptureDelayMs();
        long jLongValue = manualCaptureDelayMs != null ? manualCaptureDelayMs.longValue() : poseConfigA.getManualCaptureDelayMs();
        Boolean autoCaptureEnabled = poseConfig.getAutoCaptureEnabled();
        return new PoseConfig(zBooleanValue, zBooleanValue2, jLongValue, autoCaptureEnabled != null ? autoCaptureEnabled.booleanValue() : poseConfigA.getAutoCaptureEnabled());
    }

    public static final PoseConfigs N(List<com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig> list) {
        kn.a aVarQ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = kotlin.collections.p.k();
        }
        for (com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig poseConfig : list) {
            String pose = poseConfig.getPose();
            if (pose != null && (aVarQ = Q(pose)) != null) {
                linkedHashMap.put(aVarQ, M(poseConfig));
            }
        }
        return new PoseConfigs(linkedHashMap);
    }

    @Nullable
    public static final PoseInfo O(@NotNull NextStep.Selfie.SelfiePoseInfo selfiePoseInfo) {
        kn.a aVarC;
        String token;
        Intrinsics.checkNotNullParameter(selfiePoseInfo, "<this>");
        Integer index = selfiePoseInfo.getIndex();
        if (index != null) {
            int iIntValue = index.intValue();
            NextStep.Selfie.SelfiePose pose = selfiePoseInfo.getPose();
            if (pose == null || (aVarC = com.withpersona.sdk2.inquiry.selfie.i.c(pose)) == null || (token = selfiePoseInfo.getToken()) == null) {
                return null;
            }
            return new PoseInfo(iIntValue, aVarC, false, token);
        }
        return null;
    }

    public static final yp.a P(String str) {
        if (Intrinsics.c(str, "K0000")) {
            return yp.a.K0000;
        }
        return Intrinsics.c(str, "0") ? yp.a.V0 : yp.a.V1;
    }

    public static final kn.a Q(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1364013995) {
            if (str.equals("center")) {
                return kn.a.Center;
            }
            return null;
        }
        if (iHashCode == 3317767) {
            if (str.equals("left")) {
                return kn.a.Left;
            }
            return null;
        }
        if (iHashCode == 108511772 && str.equals("right")) {
            return kn.a.Right;
        }
        return null;
    }

    @NotNull
    public static final InquiryTheme R(@NotNull InquiryTemplateVersion.InquiryTheme inquiryTheme) {
        Intrinsics.checkNotNullParameter(inquiryTheme, "<this>");
        return new InquiryTheme(Intrinsics.c(inquiryTheme.getIconStyle(), "none") ? InquiryTheme.c.None : InquiryTheme.c.Default);
    }

    public static final Map<Pair<IdConfig.b, String>, String> a(NextStep.GovernmentId.RequestPage requestPage) {
        return k0.m(jt.s.a(new Pair(IdConfig.b.Front, "descriptionFront"), requestPage.getDescriptionFront()), jt.s.a(new Pair(IdConfig.b.Back, "descriptionBack"), requestPage.getDescriptionBack()), jt.s.a(new Pair(IdConfig.b.BarcodePdf417, "descriptionPdf417"), requestPage.getDescriptionPdf417()), jt.s.a(new Pair(IdConfig.b.PassportSignature, "descriptionPassportSignature"), requestPage.getDescriptionPassportSignature()));
    }

    public static final Map<IdConfig.b, String> b(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return k0.m(jt.s.a(IdConfig.b.Front, reviewUploadPage.getDescriptionFront()), jt.s.a(IdConfig.b.Back, reviewUploadPage.getDescriptionBack()), jt.s.a(IdConfig.b.BarcodePdf417, reviewUploadPage.getDescriptionPdf417()), jt.s.a(IdConfig.b.PassportSignature, reviewUploadPage.getDescriptionPassportSignature()));
    }

    public static final Map<LocalizedTextKey, String> c(NextStep.GovernmentId.CapturePage capturePage) {
        Map mapD = j0.d();
        String passportPortraitCaptureFrameLabel = capturePage.getPassportPortraitCaptureFrameLabel();
        if (passportPortraitCaptureFrameLabel != null) {
            if (StringsKt.p0(passportPortraitCaptureFrameLabel)) {
                passportPortraitCaptureFrameLabel = null;
            }
            if (passportPortraitCaptureFrameLabel != null) {
            }
        }
        for (Map.Entry<Pair<IdConfig.b, String>, String> entry : d(capturePage).entrySet()) {
            Pair<IdConfig.b, String> key = entry.getKey();
            mapD.put(new LocalizedTextKey(key.c(), key.d(), null, 4, null), entry.getValue());
        }
        return j0.c(mapD);
    }

    public static final Map<Pair<IdConfig.b, String>, String> d(NextStep.GovernmentId.CapturePage capturePage) {
        return k0.m(jt.s.a(new Pair(IdConfig.b.Front, "scanFront"), capturePage.getScanFront()), jt.s.a(new Pair(IdConfig.b.Back, "scanBack"), capturePage.getScanBack()), jt.s.a(new Pair(IdConfig.b.BarcodePdf417, "scanPdf417"), capturePage.getScanPdf417()), jt.s.a(new Pair(IdConfig.b.PassportSignature, "scanSignature"), capturePage.getScanSignature()), jt.s.a(new Pair(IdConfig.b.FrontOrBack, "scanFrontOrBack"), capturePage.getScanFrontOrBack()));
    }

    public static final Map<Pair<IdConfig.b, String>, String> e(NextStep.GovernmentId.RequestPage requestPage) {
        return k0.m(jt.s.a(new Pair(IdConfig.b.Front, "titleFront"), requestPage.getTitleFront()), jt.s.a(new Pair(IdConfig.b.Back, "titleBack"), requestPage.getTitleBack()), jt.s.a(new Pair(IdConfig.b.BarcodePdf417, "titlePdf417"), requestPage.getTitlePdf417()), jt.s.a(new Pair(IdConfig.b.PassportSignature, "titlePassportSignature"), requestPage.getTitlePassportSignature()));
    }

    public static final Map<IdConfig.b, String> f(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return k0.m(jt.s.a(IdConfig.b.Front, reviewUploadPage.getTitleFront()), jt.s.a(IdConfig.b.Back, reviewUploadPage.getTitleBack()), jt.s.a(IdConfig.b.BarcodePdf417, reviewUploadPage.getTitlePdf417()), jt.s.a(IdConfig.b.PassportSignature, reviewUploadPage.getTitlePassportSignature()));
    }

    @NotNull
    public static final DocumentPages g(@Nullable NextStep.Document.Pages pages, @NotNull NextStep.Document.Localizations localizations, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
        StepStyles.DocumentStepStyle documentStepStyle2;
        DocumentStartPage documentStartPageA;
        UploadOptionsDialog uploadOptionsDialogA;
        NextStep.Document.Pages.DocumentPages document;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog;
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.Document.Pages.DocumentStartPage prompt;
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        if (pages == null || (document2 = pages.getDocument()) == null || (prompt = document2.getPrompt()) == null || (documentStartPageA = h(prompt)) == null) {
            documentStepStyle2 = documentStepStyle;
            documentStartPageA = DocumentStartPage.INSTANCE.a(localizations.getPromptPage().getTitle(), localizations.getPromptPage().getPrompt(), localizations.getPromptPage().getBtnUpload(), localizations.getPromptPage().getBtnCapture(), documentStepStyle2);
        } else {
            documentStepStyle2 = documentStepStyle;
        }
        if (pages == null || (document = pages.getDocument()) == null || (uploadOptionsDialog = document.getUploadOptionsDialog()) == null || (uploadOptionsDialogA = i(uploadOptionsDialog)) == null) {
            uploadOptionsDialogA = UploadOptionsDialog.INSTANCE.a(localizations.getPromptPage().getCaptureOptionsDialogTitle(), localizations.getPromptPage().getBtnCapture(), localizations.getPromptPage().getBtnUpload(), documentStepStyle2);
        }
        return new DocumentPages(documentStartPageA, uploadOptionsDialogA);
    }

    public static final DocumentStartPage h(NextStep.Document.Pages.DocumentStartPage documentStartPage) {
        List<UiComponentConfig> components = documentStartPage.getUiStep().getConfig().getComponents();
        List<UiComponent> listI = components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components) : null;
        List<UiComponentConfig> components2 = documentStartPage.getUiStep().getConfig().getComponents();
        if (components2 == null) {
            components2 = kotlin.collections.p.k();
        }
        List<UiComponentConfig> list = components2;
        StepStyles.UiStepStyle styles = documentStartPage.getUiStep().getStyles();
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping = documentStartPage.getComponentNameMapping();
        String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping2 = documentStartPage.getComponentNameMapping();
        String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping3 = documentStartPage.getComponentNameMapping();
        String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping4 = documentStartPage.getComponentNameMapping();
        return new DocumentStartPage(listI, list, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonUploadOptions() : null);
    }

    public static final UploadOptionsDialog i(NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog) {
        List<UiComponentConfig> components = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        List<UiComponent> listI = components != null ? com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components) : null;
        List<UiComponentConfig> components2 = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        if (components2 == null) {
            components2 = kotlin.collections.p.k();
        }
        List<UiComponentConfig> list = components2;
        StepStyles.UiStepStyle styles = uploadOptionsDialog.getUiStep().getStyles();
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping = uploadOptionsDialog.getComponentNameMapping();
        String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping2 = uploadOptionsDialog.getComponentNameMapping();
        String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping3 = uploadOptionsDialog.getComponentNameMapping();
        String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping4 = uploadOptionsDialog.getComponentNameMapping();
        return new UploadOptionsDialog(listI, list, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonCancel() : null);
    }

    @NotNull
    public static final GovernmentIdWorkflow.Input.Strings j(@NotNull NextStep.GovernmentId.Localizations localizations, @NotNull String countryCode, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list) {
        Intrinsics.checkNotNullParameter(localizations, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String title = localizations.getSelectPage().getTitle();
        String prompt = localizations.getSelectPage().getPrompt();
        String choose = localizations.getSelectPage().getChoose();
        String disclaimer = localizations.getSelectPage().getDisclaimer();
        if (disclaimer == null) {
            disclaimer = "";
        }
        String navBarTitle = localizations.getSelectPage().getNavBarTitle();
        String navBarTitle2 = localizations.getCapturePage().getNavBarTitle();
        String navBarTitle3 = localizations.getCheckPage().getNavBarTitle();
        String navBarTitle4 = localizations.getPendingPage().getNavBarTitle();
        String navBarTitle5 = localizations.getRequestPage().getNavBarTitle();
        String navBarTitle6 = localizations.getReviewUploadPage().getNavBarTitle();
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = localizations.getAutoClassificationPage();
        String navBarTitle7 = autoClassificationPage != null ? autoClassificationPage.getNavBarTitle() : null;
        OverridableText overridableTextM = m(list, localizations.getCapturePage().getTitle(), Title.type, "capturePage");
        OverridableText overridableTextM2 = m(list, localizations.getCapturePage().getDescription(), "description", "capturePage");
        OverridableText overridableTextP = p(list, "capturePage", c(localizations.getCapturePage()));
        String capturing = localizations.getCapturePage().getCapturing();
        OverridableText overridableTextM3 = m(list, localizations.getCapturePage().getConfirmCapture(), "confirmCapture", "capturePage");
        String disclaimer2 = localizations.getCapturePage().getDisclaimer();
        String str = disclaimer2 != null ? disclaimer2 : "";
        String buttonSubmit = localizations.getCheckPage().getButtonSubmit();
        String buttonRetake = localizations.getCheckPage().getButtonRetake();
        OverridableText overridableTextM4 = m(list, localizations.getCheckPage().getTitleConfirmCapture(), "titleConfirmCapture", "checkPage");
        String title2 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        Map<String, String> mapN = n(list, countryCode, localizations.getSelectPage().getIdClassToName());
        OverridableText overridableTextO = o(list, "requestPage", e(localizations.getRequestPage()));
        OverridableText overridableTextO2 = o(list, "requestPage", a(localizations.getRequestPage()));
        String liveUploadButtonText = localizations.getRequestPage().getLiveUploadButtonText();
        String choosePhotoButtonText = localizations.getRequestPage().getChoosePhotoButtonText();
        Map<IdConfig.b, String> mapF = f(localizations.getReviewUploadPage());
        Map<IdConfig.b, String> mapB = b(localizations.getReviewUploadPage());
        String confirmButtonText = localizations.getReviewUploadPage().getConfirmButtonText();
        String chooseAnotherButtonText = localizations.getReviewUploadPage().getChooseAnotherButtonText();
        String cameraPermissionsTitle = localizations.getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = localizations.getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = localizations.getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = localizations.getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = localizations.getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = localizations.getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = localizations.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = localizations.getPromptPage().getMicrophonePermissionsBtnCancel();
        String hintHoldStill = localizations.getCapturePage().getHintHoldStill();
        String hintLowLight = localizations.getCapturePage().getHintLowLight();
        String btnHelp = localizations.getCapturePage().getBtnHelp();
        String barcodeHelpModalTitle = localizations.getCapturePage().getBarcodeHelpModalTitle();
        String barcodeHelpModalPrompt = localizations.getCapturePage().getBarcodeHelpModalPrompt();
        String barcodeHelpModalHints = localizations.getCapturePage().getBarcodeHelpModalHints();
        String barcodeHelpModalContinueBtn = localizations.getCapturePage().getBarcodeHelpModalContinueBtn();
        String idFrontHelpModalTitle = localizations.getCapturePage().getIdFrontHelpModalTitle();
        String idFrontHelpModalPrompt = localizations.getCapturePage().getIdFrontHelpModalPrompt();
        String idFrontHelpModalHintsMobile = localizations.getCapturePage().getIdFrontHelpModalHintsMobile();
        String idFrontHelpModalContinueBtn = localizations.getCapturePage().getIdFrontHelpModalContinueBtn();
        String idBackHelpModalTitle = localizations.getCapturePage().getIdBackHelpModalTitle();
        String idBackHelpModalPrompt = localizations.getCapturePage().getIdBackHelpModalPrompt();
        String idBackHelpModalHintsMobile = localizations.getCapturePage().getIdBackHelpModalHintsMobile();
        String idBackHelpModalContinueBtn = localizations.getCapturePage().getIdBackHelpModalContinueBtn();
        String staticCaptureTipsTitle = localizations.getCapturePage().getStaticCaptureTipsTitle();
        String staticCaptureTipsSubtext = localizations.getCapturePage().getStaticCaptureTipsSubtext();
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = localizations.getAutoClassificationPage();
        String unableToClassifyDocumentTitle = autoClassificationPage2 != null ? autoClassificationPage2.getUnableToClassifyDocumentTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage3 = localizations.getAutoClassificationPage();
        String unableToClassifyDocumentContinueButtonText = autoClassificationPage3 != null ? autoClassificationPage3.getUnableToClassifyDocumentContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage4 = localizations.getAutoClassificationPage();
        String idClassRejectedTitle = autoClassificationPage4 != null ? autoClassificationPage4.getIdClassRejectedTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage5 = localizations.getAutoClassificationPage();
        String idClassRejectedContinueButtonText = autoClassificationPage5 != null ? autoClassificationPage5.getIdClassRejectedContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage6 = localizations.getAutoClassificationPage();
        String countryInputTitle = autoClassificationPage6 != null ? autoClassificationPage6.getCountryInputTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage7 = localizations.getAutoClassificationPage();
        String idClassInputTitle = autoClassificationPage7 != null ? autoClassificationPage7.getIdClassInputTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage8 = localizations.getAutoClassificationPage();
        String manualClassificationTitle = autoClassificationPage8 != null ? autoClassificationPage8.getManualClassificationTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage9 = localizations.getAutoClassificationPage();
        String manualClassificationContinueButtonText = autoClassificationPage9 != null ? autoClassificationPage9.getManualClassificationContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage10 = localizations.getAutoClassificationPage();
        return new GovernmentIdWorkflow.Input.Strings(title, prompt, choose, disclaimer, navBarTitle, navBarTitle2, navBarTitle3, navBarTitle4, navBarTitle5, navBarTitle6, navBarTitle7, overridableTextM, overridableTextM2, overridableTextP, capturing, overridableTextM3, str, buttonSubmit, buttonRetake, overridableTextM4, title2, description, mapN, overridableTextO, overridableTextO2, liveUploadButtonText, choosePhotoButtonText, mapF, mapB, confirmButtonText, chooseAnotherButtonText, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, hintHoldStill, hintLowLight, btnHelp, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueBtn, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHintsMobile, idFrontHelpModalContinueBtn, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHintsMobile, idBackHelpModalContinueBtn, staticCaptureTipsTitle, staticCaptureTipsSubtext, unableToClassifyDocumentTitle, unableToClassifyDocumentContinueButtonText, idClassRejectedTitle, idClassRejectedContinueButtonText, countryInputTitle, idClassInputTitle, manualClassificationTitle, manualClassificationContinueButtonText, autoClassificationPage10 != null ? autoClassificationPage10.getAutoClassificationCaptureTipText() : null, list);
    }

    @NotNull
    public static final IntegrationPage k(@Nullable NextStep.Integration.PendingPage pendingPage, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle) {
        return IntegrationPage.INSTANCE.a(pendingPage != null ? pendingPage.getTitle() : null, pendingPage != null ? pendingPage.getDescriptionMobile() : null, pendingPage != null ? pendingPage.getBtnLaunchMobile() : null, integrationStepStyle);
    }

    @NotNull
    public static final SelfieWorkflow.Input.Strings l(@NotNull NextStep.Selfie.Localizations localizations, boolean z10) {
        Intrinsics.checkNotNullParameter(localizations, "<this>");
        String title = localizations.getPromptPage().getTitle();
        String promptCenter = z10 ? localizations.getPromptPage().getPromptCenter() : localizations.getPromptPage().getPrompt();
        String disclosure = localizations.getPromptPage().getDisclosure();
        String buttonSubmit = localizations.getPromptPage().getButtonSubmit();
        String title2 = localizations.getCapturePage().getTitle();
        if (title2 == null) {
            title2 = "";
        }
        String str = title2;
        String navBarTitle = localizations.getCapturePage().getNavBarTitle();
        String navBarTitle2 = localizations.getPromptPage().getNavBarTitle();
        String navBarTitle3 = localizations.getPendingPage().getNavBarTitle();
        NextStep.Selfie.CheckPage checkPage = localizations.getCheckPage();
        String navBarTitle4 = checkPage != null ? checkPage.getNavBarTitle() : null;
        String selfieHintTakePhoto = localizations.getCapturePage().getSelfieHintTakePhoto();
        String selfieHintCenterFace = localizations.getCapturePage().getSelfieHintCenterFace();
        String selfieHintFaceTooClose = localizations.getCapturePage().getSelfieHintFaceTooClose();
        String selfieHintFaceTooFar = localizations.getCapturePage().getSelfieHintFaceTooFar();
        String selfieHintFaceIncomplete = localizations.getCapturePage().getSelfieHintFaceIncomplete();
        String selfieHintMultipleFaces = localizations.getCapturePage().getSelfieHintMultipleFaces();
        String selfieHintPoseNotCenter = localizations.getCapturePage().getSelfieHintPoseNotCenter();
        String selfieHintLookLeft = localizations.getCapturePage().getSelfieHintLookLeft();
        String selfieHintLookRight = localizations.getCapturePage().getSelfieHintLookRight();
        String selfieHintLookUp = localizations.getCapturePage().getSelfieHintLookUp();
        String selfieHintLookDown = localizations.getCapturePage().getSelfieHintLookDown();
        String selfieHintHoldStill = localizations.getCapturePage().getSelfieHintHoldStill();
        String selfieHintPoseTimeout = localizations.getCapturePage().getSelfieHintPoseTimeout();
        String title3 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        NextStep.Selfie.CheckPage checkPage2 = localizations.getCheckPage();
        String title4 = checkPage2 != null ? checkPage2.getTitle() : null;
        NextStep.Selfie.CheckPage checkPage3 = localizations.getCheckPage();
        String description2 = checkPage3 != null ? checkPage3.getDescription() : null;
        NextStep.Selfie.CheckPage checkPage4 = localizations.getCheckPage();
        String selfieLabelFront = checkPage4 != null ? checkPage4.getSelfieLabelFront() : null;
        NextStep.Selfie.CheckPage checkPage5 = localizations.getCheckPage();
        String selfieLabelLeft = checkPage5 != null ? checkPage5.getSelfieLabelLeft() : null;
        NextStep.Selfie.CheckPage checkPage6 = localizations.getCheckPage();
        String selfieLabelRight = checkPage6 != null ? checkPage6.getSelfieLabelRight() : null;
        NextStep.Selfie.CheckPage checkPage7 = localizations.getCheckPage();
        String selfieLabelUp = checkPage7 != null ? checkPage7.getSelfieLabelUp() : null;
        NextStep.Selfie.CheckPage checkPage8 = localizations.getCheckPage();
        String selfieLabelDown = checkPage8 != null ? checkPage8.getSelfieLabelDown() : null;
        NextStep.Selfie.CheckPage checkPage9 = localizations.getCheckPage();
        String btnSubmit = checkPage9 != null ? checkPage9.getBtnSubmit() : null;
        NextStep.Selfie.CheckPage checkPage10 = localizations.getCheckPage();
        return new SelfieWorkflow.Input.Strings(title, promptCenter, disclosure, buttonSubmit, str, navBarTitle, navBarTitle2, navBarTitle3, navBarTitle4, selfieHintTakePhoto, selfieHintCenterFace, selfieHintFaceTooClose, selfieHintFaceTooFar, selfieHintMultipleFaces, selfieHintFaceIncomplete, selfieHintPoseNotCenter, selfieHintLookLeft, selfieHintLookRight, selfieHintLookUp, selfieHintLookDown, selfieHintHoldStill, selfieHintPoseTimeout, title3, description, title4, description2, selfieLabelFront, selfieLabelLeft, selfieLabelRight, selfieLabelUp, selfieLabelDown, btnSubmit, checkPage10 != null ? checkPage10.getBtnRetake() : null, localizations.getCapturePage().getAutoCaptureOn(), localizations.getCapturePage().getCaptureSuccess(), localizations.getCapturePage().getSelfieHintCenterFaceDescription(), localizations.getCapturePage().getSelfieHintLookLeftDescription(), localizations.getCapturePage().getSelfieHintLookRightDescription(), localizations.getCapturePage().getSelfieHintLookUpDescription(), localizations.getCapturePage().getSelfieHintLookDownDescription(), localizations.getCapturePage().getCameraLoadingTitle(), localizations.getCapturePage().getSelfieHintVerifying(), localizations.getCapturePage().getSelfieHintAutoCaptureTimeout(), localizations.getCapturePage().getDisclaimer());
    }

    public static final OverridableText m(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        qt.a<IdConfig.b> aVarD = IdConfig.b.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(kotlin.collections.q.u(aVarD, 10)), 16));
        Iterator<IdConfig.b> it = aVarD.iterator();
        while (it.hasNext()) {
            Pair pairA = jt.s.a(new Pair(it.next(), str2), str);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return o(list, str3, linkedHashMap);
    }

    public static final Map<String, String> n(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<String, String> map) {
        ArrayList arrayList;
        Object obj;
        String text;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.c(((NextStep.GovernmentId.LocalizationOverride) obj2).getPage(), "selectPage")) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i10);
                    i10++;
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj;
                    if (Intrinsics.c(localizationOverride.getCountryCode(), str) && (Intrinsics.c(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null)) {
                        if (Intrinsics.c(localizationOverride.getKey(), str2)) {
                            break;
                        }
                    }
                }
                NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) obj;
                if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                    str3 = text;
                }
            }
            linkedHashMap.put(key, str3);
        }
        return linkedHashMap;
    }

    public static final OverridableText o(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<Pair<IdConfig.b, String>, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = (Pair) entry.getKey();
            linkedHashMap.put(new LocalizedTextKey((IdConfig.b) pair.c(), (String) pair.d(), null, 4, null), entry.getValue());
        }
        return p(list, str, linkedHashMap);
    }

    public static final OverridableText p(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<LocalizedTextKey, String> map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.c(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        OverridableText.a aVar = new OverridableText.a();
        for (Map.Entry<LocalizedTextKey, String> entry : map.entrySet()) {
            LocalizedTextKey key = entry.getKey();
            String value = entry.getValue();
            int i10 = 0;
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj2;
                    if (Intrinsics.c(localizationOverride.getSide(), key.getSide().getKey()) || localizationOverride.getSide() == null) {
                        if (Intrinsics.c(localizationOverride.getKey(), key.getLocalizationKey())) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            } else {
                arrayList2 = null;
            }
            aVar.b(null, key.getIdClass(), key.getSide(), value);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) obj3;
                    String countryCode = localizationOverride2.getCountryCode();
                    String idClass = localizationOverride2.getIdClass();
                    if (idClass == null) {
                        idClass = key.getIdClass();
                    }
                    aVar.b(countryCode, idClass, key.getSide(), localizationOverride2.getText());
                }
            }
        }
        return aVar.a();
    }

    public static final CustomPendingPage q(NextStep.Ui ui2) {
        if (ui2 == null) {
            return null;
        }
        List<UiComponentConfig> components = ui2.getConfig().getComponents();
        List<UiComponentConfig> list = components;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return new CustomPendingPage(com.withpersona.sdk2.inquiry.steps.ui.components.b.i(components), components, ui2.getStyles());
    }

    public static final io.d r(String str) {
        return Intrinsics.c(str, "K0000") ? io.d.K0000 : io.d.V0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final InquiryField s(@NotNull com.withpersona.sdk2.inquiry.InquiryField inquiryField) {
        Intrinsics.checkNotNullParameter(inquiryField, "<this>");
        int i10 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.BooleanField) {
            return new InquiryField.BooleanField(((com.withpersona.sdk2.inquiry.InquiryField.BooleanField) inquiryField).getValue(), str, i10, objArr15 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.ChoicesField) {
            return new InquiryField.ChoicesField(((com.withpersona.sdk2.inquiry.InquiryField.ChoicesField) inquiryField).getValue(), objArr14 == true ? 1 : 0, i10, objArr13 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.DateField) {
            return new InquiryField.DateField(String.valueOf(((com.withpersona.sdk2.inquiry.InquiryField.DateField) inquiryField).getValue()), objArr12 == true ? 1 : 0, i10, objArr11 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.DatetimeField) {
            return new InquiryField.DatetimeField(String.valueOf(((com.withpersona.sdk2.inquiry.InquiryField.DatetimeField) inquiryField).getValue()), objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.FloatField) {
            return new InquiryField.FloatField(((com.withpersona.sdk2.inquiry.InquiryField.FloatField) inquiryField).getValue(), objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.IntegerField) {
            return new InquiryField.IntegerField(((com.withpersona.sdk2.inquiry.InquiryField.IntegerField) inquiryField).getValue(), objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.MultiChoicesField) {
            return new InquiryField.MultiChoicesField(((com.withpersona.sdk2.inquiry.InquiryField.MultiChoicesField) inquiryField).getValue(), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.StringField) {
            return new InquiryField.StringField(((com.withpersona.sdk2.inquiry.InquiryField.StringField) inquiryField).getValue(), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        if (inquiryField instanceof com.withpersona.sdk2.inquiry.InquiryField.UnknownField) {
            return new InquiryField.Unknown(((com.withpersona.sdk2.inquiry.InquiryField.UnknownField) inquiryField).getType());
        }
        throw new jt.l();
    }

    @NotNull
    public static final Map<String, InquiryField> t(@NotNull Map<String, ? extends com.withpersona.sdk2.inquiry.InquiryField> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), s((com.withpersona.sdk2.inquiry.InquiryField) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final com.withpersona.sdk2.inquiry.InquiryField u(@NotNull InquiryField inquiryField) {
        Intrinsics.checkNotNullParameter(inquiryField, "<this>");
        if (inquiryField instanceof InquiryField.BooleanField) {
            return new com.withpersona.sdk2.inquiry.InquiryField.BooleanField(((InquiryField.BooleanField) inquiryField).getValue());
        }
        if (inquiryField instanceof InquiryField.ChoicesField) {
            return new com.withpersona.sdk2.inquiry.InquiryField.ChoicesField(((InquiryField.ChoicesField) inquiryField).getValue());
        }
        if (inquiryField instanceof InquiryField.DateField) {
            String value = ((InquiryField.DateField) inquiryField).getValue();
            return value != null ? new com.withpersona.sdk2.inquiry.InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(value)) : new com.withpersona.sdk2.inquiry.InquiryField.DateField(null);
        }
        if (inquiryField instanceof InquiryField.DatetimeField) {
            String value2 = ((InquiryField.DatetimeField) inquiryField).getValue();
            return value2 != null ? new com.withpersona.sdk2.inquiry.InquiryField.DatetimeField(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(value2)) : new com.withpersona.sdk2.inquiry.InquiryField.DatetimeField(null);
        }
        if (inquiryField instanceof InquiryField.FloatField) {
            return new com.withpersona.sdk2.inquiry.InquiryField.FloatField(((InquiryField.FloatField) inquiryField).getValue());
        }
        if (inquiryField instanceof InquiryField.IntegerField) {
            return new com.withpersona.sdk2.inquiry.InquiryField.IntegerField(((InquiryField.IntegerField) inquiryField).getValue());
        }
        if (inquiryField instanceof InquiryField.MultiChoicesField) {
            return new com.withpersona.sdk2.inquiry.InquiryField.MultiChoicesField(((InquiryField.MultiChoicesField) inquiryField).getValue());
        }
        if (inquiryField instanceof InquiryField.StringField) {
            return new com.withpersona.sdk2.inquiry.InquiryField.StringField(((InquiryField.StringField) inquiryField).getValue());
        }
        if (inquiryField instanceof InquiryField.Unknown) {
            return new com.withpersona.sdk2.inquiry.InquiryField.UnknownField(((InquiryField.Unknown) inquiryField).getType());
        }
        throw new jt.l();
    }

    @NotNull
    public static final Map<String, com.withpersona.sdk2.inquiry.InquiryField> v(@NotNull Map<String, ? extends InquiryField> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), u((InquiryField) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final InquiryState w(@NotNull CheckInquiryResponse checkInquiryResponse, @NotNull String sessionToken, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str) {
        String trackingEventsUrl;
        Intrinsics.checkNotNullParameter(checkInquiryResponse, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String id2 = checkInquiryResponse.getData().getId();
        CheckInquiryResponse.Meta meta = checkInquiryResponse.getMeta();
        String str2 = (meta == null || (trackingEventsUrl = meta.getTrackingEventsUrl()) == null) ? str : trackingEventsUrl;
        NextStep nextStep = checkInquiryResponse.getData().getAttributes().getNextStep();
        if (nextStep instanceof NextStep.Ui) {
            NextStep.Ui ui2 = (NextStep.Ui) nextStep;
            String webviewUrl = ui2.getConfig().getWebviewUrl();
            return (webviewUrl == null || StringsKt.p0(webviewUrl)) ? C(ui2, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri()) : A(K(ui2), sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.GovernmentId) {
            return z((NextStep.GovernmentId) nextStep, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getSelectedCountryCode(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Selfie) {
            return B((NextStep.Selfie) nextStep, sessionToken, id2, inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Document) {
            return y((NextStep.Document) nextStep, sessionToken, id2, inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Complete) {
            return x((NextStep.Complete) nextStep, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Integration) {
            return A((NextStep.Integration) nextStep, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (!Intrinsics.c(nextStep, NextStep.Unknown.INSTANCE)) {
            throw new jt.l();
        }
        throw new IllegalArgumentException("Unknown type for step " + nextStep.getName());
    }

    @NotNull
    public static final InquiryState x(@NotNull NextStep.Complete complete, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @Nullable Map<String, ? extends InquiryField> map, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
        Map<String, com.withpersona.sdk2.inquiry.InquiryField> mapJ;
        Intrinsics.checkNotNullParameter(complete, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        if (str == null) {
            str = "";
        }
        String str4 = str;
        if (map == null || (mapJ = v(map)) == null) {
            mapJ = k0.j();
        }
        return new InquiryState.Complete(inquiryId, sessionToken, str2, null, str4, mapJ, inquirySessionConfig, str3, 8, null);
    }

    @NotNull
    public static final InquiryState y(@NotNull NextStep.Document document, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2) {
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.PendingUiPage pending;
        Intrinsics.checkNotNullParameter(document, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String name = document.getName();
        String name2 = document.getName();
        StepStyles.DocumentStepStyle styles = document.getStyles();
        NextStep.CancelDialog cancelDialog = document.getConfig().getLocalizations().getCancelDialog();
        DocumentPages documentPagesG = g(document.getConfig().getPages(), document.getConfig().getLocalizations(), document.getStyles());
        NextStep.Document.AssetConfig assets = document.getConfig().getAssets();
        NextStep.Document.Pages pages = document.getConfig().getPages();
        return new InquiryState.DocumentStepRunning(inquiryId, sessionToken, str, null, styles, cancelDialog, document, name, documentPagesG, assets, name2, inquirySessionConfig, q((pages == null || (document2 = pages.getDocument()) == null || (pending = document2.getPending()) == null) ? null : pending.getUiStep()), str2, 8, null);
    }

    @NotNull
    public static final InquiryState z(@NotNull NextStep.GovernmentId governmentId, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
        NextStep.GovernmentId.Pages.GovernmentIdPages governmentId2;
        NextStep.PendingUiPage pending;
        Intrinsics.checkNotNullParameter(governmentId, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Long nativeMobileCameraManualCaptureDelayMs = governmentId.getConfig().getNativeMobileCameraManualCaptureDelayMs();
        long jLongValue = nativeMobileCameraManualCaptureDelayMs != null ? nativeMobileCameraManualCaptureDelayMs.longValue() : 8000L;
        List<Id> idclasses = governmentId.getConfig().getIdclasses();
        if (idclasses == null) {
            idclasses = kotlin.collections.p.k();
        }
        List<Id> list = idclasses;
        String name = governmentId.getName();
        String name2 = governmentId.getName();
        Boolean backStepEnabled = governmentId.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = governmentId.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        NextStep.GovernmentId.Localizations localizations = governmentId.getConfig().getLocalizations();
        List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides = governmentId.getConfig().getLocalizationOverrides();
        List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile = governmentId.getConfig().getEnabledCaptureOptionsNativeMobile();
        if (enabledCaptureOptionsNativeMobile == null) {
            enabledCaptureOptionsNativeMobile = kotlin.collections.o.d(CaptureOptionNativeMobile.MOBILE_CAMERA);
        }
        List<CaptureOptionNativeMobile> list2 = enabledCaptureOptionsNativeMobile;
        StepStyles.GovernmentIdStepStyle styles = governmentId.getStyles();
        Integer imageCaptureCount = governmentId.getConfig().getImageCaptureCount();
        int iIntValue = imageCaptureCount != null ? imageCaptureCount.intValue() : 3;
        String fieldKeyDocument = governmentId.getConfig().getFieldKeyDocument();
        String fieldKeyIdclass = governmentId.getConfig().getFieldKeyIdclass();
        NextStep.CancelDialog cancelDialog = governmentId.getConfig().getLocalizations().getCancelDialog();
        Boolean shouldSkipReviewScreen = governmentId.getConfig().getShouldSkipReviewScreen();
        boolean zBooleanValue3 = shouldSkipReviewScreen != null ? shouldSkipReviewScreen.booleanValue() : false;
        List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes = governmentId.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = kotlin.collections.p.k();
        }
        List<NextStep.GovernmentId.CaptureFileType> list3 = enabledCaptureFileTypes;
        List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods = governmentId.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = kotlin.collections.p.k();
        }
        List<NextStep.GovernmentId.VideoCaptureMethod> list4 = videoCaptureMethods;
        String videoSessionJwt = governmentId.getConfig().getVideoSessionJwt();
        NextStep.GovernmentId.AssetConfig assets = governmentId.getConfig().getAssets();
        AutoClassificationConfig autoClassificationConfigK = com.withpersona.sdk2.inquiry.governmentid.d.k(governmentId.getConfig().getAutoClassificationConfig(), jLongValue);
        StyleElements.Axis reviewCaptureButtonsAxis = governmentId.getConfig().getReviewCaptureButtonsAxis();
        if (reviewCaptureButtonsAxis == null) {
            reviewCaptureButtonsAxis = StyleElements.Axis.HORIZONTAL;
        }
        StyleElements.Axis axis = reviewCaptureButtonsAxis;
        PendingPageTextPosition pendingPageTextVerticalPosition = governmentId.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = governmentId.getConfig().getAudioEnabled();
        boolean zBooleanValue4 = audioEnabled != null ? audioEnabled.booleanValue() : true;
        Boolean staticCaptureTipsEnabled = governmentId.getConfig().getStaticCaptureTipsEnabled();
        boolean zBooleanValue5 = staticCaptureTipsEnabled != null ? staticCaptureTipsEnabled.booleanValue() : false;
        Integer holographicTorchEnabledDurationMs = governmentId.getConfig().getHolographicTorchEnabledDurationMs();
        io.d dVarR = r(governmentId.getConfig().getGovidDesignVersion());
        String flowWatermarkText = governmentId.getConfig().getFlowWatermarkText();
        String silentNetworkAuthenticationCheckUrl = governmentId.getConfig().getSilentNetworkAuthenticationCheckUrl();
        Integer silentNetworkAuthenticationBackgroundTimeoutSeconds = governmentId.getConfig().getSilentNetworkAuthenticationBackgroundTimeoutSeconds();
        NextStep.GovernmentId.Pages pages = governmentId.getConfig().getPages();
        return new InquiryState.GovernmentIdStepRunning(inquiryId, sessionToken, str2, null, styles, cancelDialog, str, list, name, name2, zBooleanValue, zBooleanValue2, localizations, localizationOverrides, list2, iIntValue, jLongValue, fieldKeyDocument, fieldKeyIdclass, zBooleanValue3, list3, list4, videoSessionJwt, assets, autoClassificationConfigK, axis, pendingPageTextPosition, zBooleanValue4, null, zBooleanValue5, holographicTorchEnabledDurationMs, inquirySessionConfig, dVarR, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, q((pages == null || (governmentId2 = pages.getGovernmentId()) == null || (pending = governmentId2.getPending()) == null) ? null : pending.getUiStep()), str3, 8, 0, null);
    }
}
