package gp;

import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.governmentid.C3541d;
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
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.p057ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.C3957i;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import io.EnumC6852d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7352s;
import p394qt.InterfaceC10707a;
import p584yp.EnumC13272a;

/* JADX INFO: renamed from: gp.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u001a\u001a\u00020\u0019*\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001ac\u00100\u001a\u00020/*\u00020$2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b0\u00101\u001a\u0017\u00103\u001a\u0004\u0018\u000102*\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b3\u00104\u001aM\u00107\u001a\u00020/*\u0002052\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b7\u00108\u001aC\u0010:\u001a\u00020/*\u0002092\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b:\u0010;\u001aM\u0010=\u001a\u00020/*\u00020<2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b=\u0010>\u001aC\u0010@\u001a\u00020/*\u00020?2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b@\u0010A\u001aa\u0010C\u001a\u00020/*\u00020B2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020/*\u00020E2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\bG\u0010H\u001a\u001b\u0010K\u001a\u00020J*\n\u0012\u0004\u0012\u00020I\u0018\u00010\u0003H\u0002¢\u0006\u0004\bK\u0010L\u001a\u0013\u0010N\u001a\u00020M*\u00020IH\u0002¢\u0006\u0004\bN\u0010O\u001a\u0015\u0010Q\u001a\u0004\u0018\u00010P*\u00020\u0001H\u0002¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010S\u001a\u00020<*\u00020$H\u0002¢\u0006\u0004\bS\u0010T\u001a\u0013\u0010W\u001a\u00020V*\u00020UH\u0002¢\u0006\u0004\bW\u0010X\u001a\u0013\u0010Z\u001a\u00020\u0010*\u00020YH\u0002¢\u0006\u0004\bZ\u0010[\u001a\u0015\u0010]\u001a\u00020\\*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b]\u0010^\u001a\u0015\u0010`\u001a\u00020_*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b`\u0010a\u001a)\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020b0(*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\bc\u0010d\u001a)\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)0(*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020b0(¢\u0006\u0004\be\u0010d\u001a\u0011\u0010f\u001a\u00020)*\u00020b¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010h\u001a\u00020b*\u00020)¢\u0006\u0004\bh\u0010i\u001a\u0011\u0010l\u001a\u00020k*\u00020j¢\u0006\u0004\bl\u0010m\u001a\u0013\u0010p\u001a\u0004\u0018\u00010o*\u00020n¢\u0006\u0004\bp\u0010q\"0\u0010w\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010s\u0012\u0004\u0012\u00020\u00010(*\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\"0\u0010y\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010s\u0012\u0004\u0012\u00020\u00010(*\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010v\"0\u0010}\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010s\u0012\u0004\u0012\u00020\u00010(*\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\"%\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\u00010(*\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010|\"'\u0010w\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010(*\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"'\u0010y\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u00010(*\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "", "centerOnly", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;)Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "sessionToken", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "trackingEventsUrl", "redirectUri", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "C", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;)Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "selectedCountryCode", "z", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "B", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "A", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "y", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "x", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "defaultTrackingEventsUrl", "w", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "N", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "M", "(Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Lkn/a;", "Q", "(Ljava/lang/String;)Lkn/a;", "K", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "J", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "L", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "Lyp/a;", "P", "(Ljava/lang/String;)Lyp/a;", "Lio/d;", "r", "(Ljava/lang/String;)Lio/d;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "v", "(Ljava/util/Map;)Ljava/util/Map;", "t", "s", "(Lcom/withpersona/sdk2/inquiry/InquiryField;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;)Lcom/withpersona/sdk2/inquiry/InquiryField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "R", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePoseInfo;", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "O", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePoseInfo;)Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;)Ljava/util/Map;", "titleBySide", "a", "descriptionBySide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;)Ljava/util/Map;", "scanInstructionsBySide", "Lgp/x;", "c", "scanInstructionsByClassAndSide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;)Ljava/util/Map;", "b", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6181a {
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final InquiryState m27201A(@NotNull NextStep.Integration integration, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
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
        IntegrationPage integrationPageM27229k = m27229k(localizations3 != null ? localizations3.getPendingPage() : null, integration.getStyles());
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new InquiryState.IntegrationStepRunning(inquiryId, sessionToken, str2, null, styles, cancelDialog, type, flowUrl, redirectPath, integrationStepBrowserType2, localizations2, str4, name, zBooleanValue, zBooleanValue2, string, integrationPageM27229k, null, inquirySessionConfig, str3, 131080, null);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final InquiryState m27202B(@NotNull NextStep.Selfie selfie, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2) {
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
            enabledCaptureFileTypes = C7699p.m31892k();
        }
        List<NextStep.Selfie.CaptureFileType> list = enabledCaptureFileTypes;
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = selfie.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = C7699p.m31892k();
        }
        List<NextStep.Selfie.VideoCaptureMethod> list2 = videoCaptureMethods;
        NextStep.Selfie.AssetConfig assets = selfie.getConfig().getAssets();
        String videoSessionJwt = selfie.getConfig().getVideoSessionJwt();
        List<NextStep.Selfie.SelfiePose> orderedPoses = selfie.getConfig().getOrderedPoses();
        List<NextStep.Selfie.SelfiePoseInfo> orderedPosesBuffer = selfie.getConfig().getOrderedPosesBuffer();
        NextStep.C3793Ui uiStep = null;
        if (orderedPosesBuffer != null) {
            arrayList = new ArrayList();
            Iterator<T> it = orderedPosesBuffer.iterator();
            while (it.hasNext()) {
                PoseInfo poseInfoM27215O = m27215O((NextStep.Selfie.SelfiePoseInfo) it.next());
                if (poseInfoM27215O != null) {
                    arrayList.add(poseInfoM27215O);
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
        PoseConfigs poseConfigsM27214N = m27214N(selfie.getConfig().getPoseConfigs());
        EnumC13272a enumC13272aM27216P = m27216P(selfie.getConfig().getDesignVersion());
        String imageUploadUrl = selfie.getConfig().getImageUploadUrl();
        String flowWatermarkText = selfie.getConfig().getFlowWatermarkText();
        String silentNetworkAuthenticationCheckUrl = selfie.getConfig().getSilentNetworkAuthenticationCheckUrl();
        Integer silentNetworkAuthenticationBackgroundTimeoutSeconds = selfie.getConfig().getSilentNetworkAuthenticationBackgroundTimeoutSeconds();
        NextStep.Selfie.Pages pages = selfie.getConfig().getPages();
        if (pages != null && (selfie2 = pages.getSelfie()) != null && (pending = selfie2.getPending()) != null) {
            uiStep = pending.getUiStep();
        }
        return new InquiryState.SelfieStepRunning(inquiryId, sessionToken, str, null, styles, cancelDialog, selfieType, name, name2, zBooleanValue, zBooleanValue2, fieldKeySelfie, requireStrictSelfieCapture, zBooleanValue3, localizations, list, list2, assets, videoSessionJwt, orderedPoses, arrayList, poseTimeoutMs, pendingPageTextPosition, zBooleanValue4, poseConfigsM27214N, enumC13272aM27216P, inquirySessionConfig, imageUploadUrl, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, m27235q(uiStep), str2, 8, 0, null);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final InquiryState m27203C(@NotNull NextStep.C3793Ui c3793Ui, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @Nullable Map<String, ? extends InquiryField> map, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
        Map<String, com.withpersona.sdk2.inquiry.InquiryField> mapM31795j;
        Intrinsics.checkNotNullParameter(c3793Ui, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String str4 = str == null ? "" : str;
        String name = c3793Ui.getName();
        List<UiComponentConfig> components = c3793Ui.getConfig().getComponents();
        if (components == null) {
            components = C7699p.m31892k();
        }
        List<UiComponentConfig> list = components;
        Boolean backStepEnabled = c3793Ui.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = c3793Ui.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        Boolean terminal = c3793Ui.getConfig().getTerminal();
        boolean zBooleanValue3 = terminal != null ? terminal.booleanValue() : false;
        String webviewUrl = c3793Ui.getConfig().getWebviewUrl();
        if (map == null || (mapM31795j = m27240v(map)) == null) {
            mapM31795j = C7690k0.m31795j();
        }
        Map<String, com.withpersona.sdk2.inquiry.InquiryField> map2 = mapM31795j;
        StepStyles.UiStepStyle styles = c3793Ui.getStyles();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        NextStep.C3793Ui.Localizations localizations = c3793Ui.getConfig().getLocalizations();
        ArrayList arrayList = null;
        NextStep.CancelDialog cancelDialog = localizations != null ? localizations.getCancelDialog() : null;
        NextStep.C3793Ui.Localizations localizations2 = c3793Ui.getConfig().getLocalizations();
        List<UiComponentError> serverComponentErrors = c3793Ui.getConfig().getServerComponentErrors();
        if (serverComponentErrors != null) {
            List<UiComponentError> list2 = serverComponentErrors;
            arrayList = new ArrayList(C7701q.m31905u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new UiComponentErrorInfo((UiComponentError) it.next(), 0L, 2, null));
            }
        }
        return new InquiryState.UiStepRunning(inquiryId, sessionToken, str2, null, styles, cancelDialog, localizations2, str4, name, list, zBooleanValue, zBooleanValue2, zBooleanValue3, webviewUrl, map2, string, arrayList, null, inquirySessionConfig, false, str3, 131080, null);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ InquiryState m27204D(NextStep.Complete complete, String str, String str2, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        return m27242x(complete, str, str2, str3, map, inquirySessionConfig, str4, str5);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ InquiryState m27205E(NextStep.Document document, String str, String str2, InquirySessionConfig inquirySessionConfig, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        return m27243y(document, str, str2, inquirySessionConfig, str3, str4);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ InquiryState m27206F(NextStep.GovernmentId governmentId, String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        return m27244z(governmentId, str, str2, str3, inquirySessionConfig, str4, str5);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ InquiryState m27207G(NextStep.Integration integration, String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        return m27201A(integration, str, str2, str3, inquirySessionConfig, str4, str5);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ InquiryState m27208H(NextStep.Selfie selfie, String str, String str2, InquirySessionConfig inquirySessionConfig, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        return m27202B(selfie, str, str2, inquirySessionConfig, str3, str4);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ InquiryState m27209I(NextStep.C3793Ui c3793Ui, String str, String str2, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4, String str5, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        return m27203C(c3793Ui, str, str2, str3, map, inquirySessionConfig, str4, str5);
    }

    /* JADX INFO: renamed from: J */
    public static final NextStep.Integration.Localizations m27210J(NextStep.C3793Ui.Localizations localizations) {
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

    /* JADX INFO: renamed from: K */
    public static final NextStep.Integration m27211K(NextStep.C3793Ui c3793Ui) {
        String name = c3793Ui.getName();
        Boolean backStepEnabled = c3793Ui.getConfig().getBackStepEnabled();
        Boolean cancelButtonEnabled = c3793Ui.getConfig().getCancelButtonEnabled();
        String webviewUrl = c3793Ui.getConfig().getWebviewUrl();
        if (webviewUrl == null) {
            webviewUrl = "";
        }
        String str = webviewUrl;
        NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = NextStep.Integration.IntegrationStepBrowserType.AuthSession;
        NextStep.C3793Ui.Localizations localizations = c3793Ui.getConfig().getLocalizations();
        NextStep.Integration.Config config = new NextStep.Integration.Config(backStepEnabled, cancelButtonEnabled, "webview", str, "", integrationStepBrowserType, localizations != null ? m27210J(localizations) : null);
        StepStyles.UiStepStyle styles = c3793Ui.getStyles();
        return new NextStep.Integration(name, config, styles != null ? m27212L(styles) : null);
    }

    /* JADX INFO: renamed from: L */
    public static final StepStyles.IntegrationStepStyle m27212L(StepStyles.UiStepStyle uiStepStyle) {
        return new StepStyles.IntegrationStepStyle(uiStepStyle.getHeaderButtonColor(), uiStepStyle.getBackgroundColor(), uiStepStyle.getBackgroundImage(), uiStepStyle.getTitleStyle(), uiStepStyle.getNavBarTitleStyle(), uiStepStyle.getTextStyle(), uiStepStyle.getButtonPrimaryStyle(), uiStepStyle.getButtonSecondaryStyle(), uiStepStyle.getStrokeColor(), uiStepStyle.getFillColor(), uiStepStyle.getAlignment(), uiStepStyle.getPadding(), uiStepStyle.getBorderRadius());
    }

    /* JADX INFO: renamed from: M */
    public static final PoseConfig m27213M(com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig poseConfig) {
        PoseConfig poseConfigM19278a = PoseConfig.INSTANCE.m19278a();
        Boolean allowReview = poseConfig.getAllowReview();
        boolean zBooleanValue = allowReview != null ? allowReview.booleanValue() : poseConfigM19278a.getAllowReview();
        Boolean manualCaptureEnabled = poseConfig.getManualCaptureEnabled();
        boolean zBooleanValue2 = manualCaptureEnabled != null ? manualCaptureEnabled.booleanValue() : poseConfigM19278a.getManualCaptureEnabled();
        Long manualCaptureDelayMs = poseConfig.getManualCaptureDelayMs();
        long jLongValue = manualCaptureDelayMs != null ? manualCaptureDelayMs.longValue() : poseConfigM19278a.getManualCaptureDelayMs();
        Boolean autoCaptureEnabled = poseConfig.getAutoCaptureEnabled();
        return new PoseConfig(zBooleanValue, zBooleanValue2, jLongValue, autoCaptureEnabled != null ? autoCaptureEnabled.booleanValue() : poseConfigM19278a.getAutoCaptureEnabled());
    }

    /* JADX INFO: renamed from: N */
    public static final PoseConfigs m27214N(List<com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig> list) {
        EnumC7638a enumC7638aM27217Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = C7699p.m31892k();
        }
        for (com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig poseConfig : list) {
            String pose = poseConfig.getPose();
            if (pose != null && (enumC7638aM27217Q = m27217Q(pose)) != null) {
                linkedHashMap.put(enumC7638aM27217Q, m27213M(poseConfig));
            }
        }
        return new PoseConfigs(linkedHashMap);
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public static final PoseInfo m27215O(@NotNull NextStep.Selfie.SelfiePoseInfo selfiePoseInfo) {
        EnumC7638a enumC7638aM20081c;
        String token;
        Intrinsics.checkNotNullParameter(selfiePoseInfo, "<this>");
        Integer index = selfiePoseInfo.getIndex();
        if (index != null) {
            int iIntValue = index.intValue();
            NextStep.Selfie.SelfiePose pose = selfiePoseInfo.getPose();
            if (pose == null || (enumC7638aM20081c = C3957i.m20081c(pose)) == null || (token = selfiePoseInfo.getToken()) == null) {
                return null;
            }
            return new PoseInfo(iIntValue, enumC7638aM20081c, false, token);
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    public static final EnumC13272a m27216P(String str) {
        if (Intrinsics.m31980c(str, "K0000")) {
            return EnumC13272a.K0000;
        }
        return Intrinsics.m31980c(str, "0") ? EnumC13272a.V0 : EnumC13272a.V1;
    }

    /* JADX INFO: renamed from: Q */
    public static final EnumC7638a m27217Q(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1364013995) {
            if (str.equals("center")) {
                return EnumC7638a.Center;
            }
            return null;
        }
        if (iHashCode == 3317767) {
            if (str.equals("left")) {
                return EnumC7638a.Left;
            }
            return null;
        }
        if (iHashCode == 108511772 && str.equals("right")) {
            return EnumC7638a.Right;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public static final InquiryTheme m27218R(@NotNull InquiryTemplateVersion.InquiryTheme inquiryTheme) {
        Intrinsics.checkNotNullParameter(inquiryTheme, "<this>");
        return new InquiryTheme(Intrinsics.m31980c(inquiryTheme.getIconStyle(), "none") ? InquiryTheme.EnumC4006c.None : InquiryTheme.EnumC4006c.Default);
    }

    /* JADX INFO: renamed from: a */
    public static final Map<Pair<IdConfig.EnumC3514b, String>, String> m27219a(NextStep.GovernmentId.RequestPage requestPage) {
        return C7690k0.m31798m(C7352s.m30477a(new Pair(IdConfig.EnumC3514b.Front, "descriptionFront"), requestPage.getDescriptionFront()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.Back, "descriptionBack"), requestPage.getDescriptionBack()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.BarcodePdf417, "descriptionPdf417"), requestPage.getDescriptionPdf417()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.PassportSignature, "descriptionPassportSignature"), requestPage.getDescriptionPassportSignature()));
    }

    /* JADX INFO: renamed from: b */
    public static final Map<IdConfig.EnumC3514b, String> m27220b(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return C7690k0.m31798m(C7352s.m30477a(IdConfig.EnumC3514b.Front, reviewUploadPage.getDescriptionFront()), C7352s.m30477a(IdConfig.EnumC3514b.Back, reviewUploadPage.getDescriptionBack()), C7352s.m30477a(IdConfig.EnumC3514b.BarcodePdf417, reviewUploadPage.getDescriptionPdf417()), C7352s.m30477a(IdConfig.EnumC3514b.PassportSignature, reviewUploadPage.getDescriptionPassportSignature()));
    }

    /* JADX INFO: renamed from: c */
    public static final Map<LocalizedTextKey, String> m27221c(NextStep.GovernmentId.CapturePage capturePage) {
        Map mapM31788d = C7688j0.m31788d();
        String passportPortraitCaptureFrameLabel = capturePage.getPassportPortraitCaptureFrameLabel();
        if (passportPortraitCaptureFrameLabel != null) {
            if (StringsKt.m32182p0(passportPortraitCaptureFrameLabel)) {
                passportPortraitCaptureFrameLabel = null;
            }
            if (passportPortraitCaptureFrameLabel != null) {
            }
        }
        for (Map.Entry<Pair<IdConfig.EnumC3514b, String>, String> entry : m27222d(capturePage).entrySet()) {
            Pair<IdConfig.EnumC3514b, String> key = entry.getKey();
            mapM31788d.put(new LocalizedTextKey(key.m31673c(), key.m31674d(), null, 4, null), entry.getValue());
        }
        return C7688j0.m31787c(mapM31788d);
    }

    /* JADX INFO: renamed from: d */
    public static final Map<Pair<IdConfig.EnumC3514b, String>, String> m27222d(NextStep.GovernmentId.CapturePage capturePage) {
        return C7690k0.m31798m(C7352s.m30477a(new Pair(IdConfig.EnumC3514b.Front, "scanFront"), capturePage.getScanFront()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.Back, "scanBack"), capturePage.getScanBack()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.BarcodePdf417, "scanPdf417"), capturePage.getScanPdf417()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.PassportSignature, "scanSignature"), capturePage.getScanSignature()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.FrontOrBack, "scanFrontOrBack"), capturePage.getScanFrontOrBack()));
    }

    /* JADX INFO: renamed from: e */
    public static final Map<Pair<IdConfig.EnumC3514b, String>, String> m27223e(NextStep.GovernmentId.RequestPage requestPage) {
        return C7690k0.m31798m(C7352s.m30477a(new Pair(IdConfig.EnumC3514b.Front, "titleFront"), requestPage.getTitleFront()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.Back, "titleBack"), requestPage.getTitleBack()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.BarcodePdf417, "titlePdf417"), requestPage.getTitlePdf417()), C7352s.m30477a(new Pair(IdConfig.EnumC3514b.PassportSignature, "titlePassportSignature"), requestPage.getTitlePassportSignature()));
    }

    /* JADX INFO: renamed from: f */
    public static final Map<IdConfig.EnumC3514b, String> m27224f(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return C7690k0.m31798m(C7352s.m30477a(IdConfig.EnumC3514b.Front, reviewUploadPage.getTitleFront()), C7352s.m30477a(IdConfig.EnumC3514b.Back, reviewUploadPage.getTitleBack()), C7352s.m30477a(IdConfig.EnumC3514b.BarcodePdf417, reviewUploadPage.getTitlePdf417()), C7352s.m30477a(IdConfig.EnumC3514b.PassportSignature, reviewUploadPage.getTitlePassportSignature()));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final DocumentPages m27225g(@Nullable NextStep.Document.Pages pages, @NotNull NextStep.Document.Localizations localizations, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
        StepStyles.DocumentStepStyle documentStepStyle2;
        DocumentStartPage documentStartPageM16277a;
        UploadOptionsDialog uploadOptionsDialogM16560a;
        NextStep.Document.Pages.DocumentPages document;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog;
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.Document.Pages.DocumentStartPage prompt;
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        if (pages == null || (document2 = pages.getDocument()) == null || (prompt = document2.getPrompt()) == null || (documentStartPageM16277a = m27226h(prompt)) == null) {
            documentStepStyle2 = documentStepStyle;
            documentStartPageM16277a = DocumentStartPage.INSTANCE.m16277a(localizations.getPromptPage().getTitle(), localizations.getPromptPage().getPrompt(), localizations.getPromptPage().getBtnUpload(), localizations.getPromptPage().getBtnCapture(), documentStepStyle2);
        } else {
            documentStepStyle2 = documentStepStyle;
        }
        if (pages == null || (document = pages.getDocument()) == null || (uploadOptionsDialog = document.getUploadOptionsDialog()) == null || (uploadOptionsDialogM16560a = m27227i(uploadOptionsDialog)) == null) {
            uploadOptionsDialogM16560a = UploadOptionsDialog.INSTANCE.m16560a(localizations.getPromptPage().getCaptureOptionsDialogTitle(), localizations.getPromptPage().getBtnCapture(), localizations.getPromptPage().getBtnUpload(), documentStepStyle2);
        }
        return new DocumentPages(documentStartPageM16277a, uploadOptionsDialogM16560a);
    }

    /* JADX INFO: renamed from: h */
    public static final DocumentStartPage m27226h(NextStep.Document.Pages.DocumentStartPage documentStartPage) {
        List<UiComponentConfig> components = documentStartPage.getUiStep().getConfig().getComponents();
        List<UiComponent> listM20892i = components != null ? C4086b.m20892i(components) : null;
        List<UiComponentConfig> components2 = documentStartPage.getUiStep().getConfig().getComponents();
        if (components2 == null) {
            components2 = C7699p.m31892k();
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
        return new DocumentStartPage(listM20892i, list, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonUploadOptions() : null);
    }

    /* JADX INFO: renamed from: i */
    public static final UploadOptionsDialog m27227i(NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog) {
        List<UiComponentConfig> components = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        List<UiComponent> listM20892i = components != null ? C4086b.m20892i(components) : null;
        List<UiComponentConfig> components2 = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        if (components2 == null) {
            components2 = C7699p.m31892k();
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
        return new UploadOptionsDialog(listM20892i, list, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonCancel() : null);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final GovernmentIdWorkflow.Input.Strings m27228j(@NotNull NextStep.GovernmentId.Localizations localizations, @NotNull String countryCode, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list) {
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
        OverridableText overridableTextM27231m = m27231m(list, localizations.getCapturePage().getTitle(), Title.type, "capturePage");
        OverridableText overridableTextM27231m2 = m27231m(list, localizations.getCapturePage().getDescription(), "description", "capturePage");
        OverridableText overridableTextM27234p = m27234p(list, "capturePage", m27221c(localizations.getCapturePage()));
        String capturing = localizations.getCapturePage().getCapturing();
        OverridableText overridableTextM27231m3 = m27231m(list, localizations.getCapturePage().getConfirmCapture(), "confirmCapture", "capturePage");
        String disclaimer2 = localizations.getCapturePage().getDisclaimer();
        String str = disclaimer2 != null ? disclaimer2 : "";
        String buttonSubmit = localizations.getCheckPage().getButtonSubmit();
        String buttonRetake = localizations.getCheckPage().getButtonRetake();
        OverridableText overridableTextM27231m4 = m27231m(list, localizations.getCheckPage().getTitleConfirmCapture(), "titleConfirmCapture", "checkPage");
        String title2 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        Map<String, String> mapM27232n = m27232n(list, countryCode, localizations.getSelectPage().getIdClassToName());
        OverridableText overridableTextM27233o = m27233o(list, "requestPage", m27223e(localizations.getRequestPage()));
        OverridableText overridableTextM27233o2 = m27233o(list, "requestPage", m27219a(localizations.getRequestPage()));
        String liveUploadButtonText = localizations.getRequestPage().getLiveUploadButtonText();
        String choosePhotoButtonText = localizations.getRequestPage().getChoosePhotoButtonText();
        Map<IdConfig.EnumC3514b, String> mapM27224f = m27224f(localizations.getReviewUploadPage());
        Map<IdConfig.EnumC3514b, String> mapM27220b = m27220b(localizations.getReviewUploadPage());
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
        return new GovernmentIdWorkflow.Input.Strings(title, prompt, choose, disclaimer, navBarTitle, navBarTitle2, navBarTitle3, navBarTitle4, navBarTitle5, navBarTitle6, navBarTitle7, overridableTextM27231m, overridableTextM27231m2, overridableTextM27234p, capturing, overridableTextM27231m3, str, buttonSubmit, buttonRetake, overridableTextM27231m4, title2, description, mapM27232n, overridableTextM27233o, overridableTextM27233o2, liveUploadButtonText, choosePhotoButtonText, mapM27224f, mapM27220b, confirmButtonText, chooseAnotherButtonText, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, hintHoldStill, hintLowLight, btnHelp, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueBtn, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHintsMobile, idFrontHelpModalContinueBtn, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHintsMobile, idBackHelpModalContinueBtn, staticCaptureTipsTitle, staticCaptureTipsSubtext, unableToClassifyDocumentTitle, unableToClassifyDocumentContinueButtonText, idClassRejectedTitle, idClassRejectedContinueButtonText, countryInputTitle, idClassInputTitle, manualClassificationTitle, manualClassificationContinueButtonText, autoClassificationPage10 != null ? autoClassificationPage10.getAutoClassificationCaptureTipText() : null, list);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final IntegrationPage m27229k(@Nullable NextStep.Integration.PendingPage pendingPage, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle) {
        return IntegrationPage.INSTANCE.m17942a(pendingPage != null ? pendingPage.getTitle() : null, pendingPage != null ? pendingPage.getDescriptionMobile() : null, pendingPage != null ? pendingPage.getBtnLaunchMobile() : null, integrationStepStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final SelfieWorkflow.Input.Strings m27230l(@NotNull NextStep.Selfie.Localizations localizations, boolean z10) {
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

    /* JADX INFO: renamed from: m */
    public static final OverridableText m27231m(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        InterfaceC10707a<IdConfig.EnumC3514b> interfaceC10707aM17294d = IdConfig.EnumC3514b.m17294d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(interfaceC10707aM17294d, 10)), 16));
        Iterator<IdConfig.EnumC3514b> it = interfaceC10707aM17294d.iterator();
        while (it.hasNext()) {
            Pair pairM30477a = C7352s.m30477a(new Pair(it.next(), str2), str);
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        return m27233o(list, str3, linkedHashMap);
    }

    /* JADX INFO: renamed from: n */
    public static final Map<String, String> m27232n(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<String, String> map) {
        ArrayList arrayList;
        Object obj;
        String text;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.m31980c(((NextStep.GovernmentId.LocalizationOverride) obj2).getPage(), "selectPage")) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(map.size()));
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
                    if (Intrinsics.m31980c(localizationOverride.getCountryCode(), str) && (Intrinsics.m31980c(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null)) {
                        if (Intrinsics.m31980c(localizationOverride.getKey(), str2)) {
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

    /* JADX INFO: renamed from: o */
    public static final OverridableText m27233o(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<Pair<IdConfig.EnumC3514b, String>, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = (Pair) entry.getKey();
            linkedHashMap.put(new LocalizedTextKey((IdConfig.EnumC3514b) pair.m31673c(), (String) pair.m31674d(), null, 4, null), entry.getValue());
        }
        return m27234p(list, str, linkedHashMap);
    }

    /* JADX INFO: renamed from: p */
    public static final OverridableText m27234p(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<LocalizedTextKey, String> map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.m31980c(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        OverridableText.C3517a c3517a = new OverridableText.C3517a();
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
                    if (Intrinsics.m31980c(localizationOverride.getSide(), key.getSide().getKey()) || localizationOverride.getSide() == null) {
                        if (Intrinsics.m31980c(localizationOverride.getKey(), key.getLocalizationKey())) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            } else {
                arrayList2 = null;
            }
            c3517a.m17309b(null, key.getIdClass(), key.getSide(), value);
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
                    c3517a.m17309b(countryCode, idClass, key.getSide(), localizationOverride2.getText());
                }
            }
        }
        return c3517a.m17308a();
    }

    /* JADX INFO: renamed from: q */
    public static final CustomPendingPage m27235q(NextStep.C3793Ui c3793Ui) {
        if (c3793Ui == null) {
            return null;
        }
        List<UiComponentConfig> components = c3793Ui.getConfig().getComponents();
        List<UiComponentConfig> list = components;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return new CustomPendingPage(C4086b.m20892i(components), components, c3793Ui.getStyles());
    }

    /* JADX INFO: renamed from: r */
    public static final EnumC6852d m27236r(String str) {
        return Intrinsics.m31980c(str, "K0000") ? EnumC6852d.K0000 : EnumC6852d.V0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final InquiryField m27237s(@NotNull com.withpersona.sdk2.inquiry.InquiryField inquiryField) {
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
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static final Map<String, InquiryField> m27238t(@NotNull Map<String, ? extends com.withpersona.sdk2.inquiry.InquiryField> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), m27237s((com.withpersona.sdk2.inquiry.InquiryField) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final com.withpersona.sdk2.inquiry.InquiryField m27239u(@NotNull InquiryField inquiryField) {
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
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final Map<String, com.withpersona.sdk2.inquiry.InquiryField> m27240v(@NotNull Map<String, ? extends InquiryField> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), m27239u((InquiryField) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final InquiryState m27241w(@NotNull CheckInquiryResponse checkInquiryResponse, @NotNull String sessionToken, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str) {
        String trackingEventsUrl;
        Intrinsics.checkNotNullParameter(checkInquiryResponse, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String id2 = checkInquiryResponse.getData().getId();
        CheckInquiryResponse.Meta meta = checkInquiryResponse.getMeta();
        String str2 = (meta == null || (trackingEventsUrl = meta.getTrackingEventsUrl()) == null) ? str : trackingEventsUrl;
        NextStep nextStep = checkInquiryResponse.getData().getAttributes().getNextStep();
        if (nextStep instanceof NextStep.C3793Ui) {
            NextStep.C3793Ui c3793Ui = (NextStep.C3793Ui) nextStep;
            String webviewUrl = c3793Ui.getConfig().getWebviewUrl();
            return (webviewUrl == null || StringsKt.m32182p0(webviewUrl)) ? m27203C(c3793Ui, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri()) : m27201A(m27211K(c3793Ui), sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.GovernmentId) {
            return m27244z((NextStep.GovernmentId) nextStep, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getSelectedCountryCode(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Selfie) {
            return m27202B((NextStep.Selfie) nextStep, sessionToken, id2, inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Document) {
            return m27243y((NextStep.Document) nextStep, sessionToken, id2, inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Complete) {
            return m27242x((NextStep.Complete) nextStep, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (nextStep instanceof NextStep.Integration) {
            return m27201A((NextStep.Integration) nextStep, sessionToken, id2, checkInquiryResponse.getData().getAttributes().getStatus(), inquirySessionConfig, str2, checkInquiryResponse.getData().getAttributes().getRedirectUri());
        }
        if (!Intrinsics.m31980c(nextStep, NextStep.Unknown.INSTANCE)) {
            throw new C7345l();
        }
        throw new IllegalArgumentException("Unknown type for step " + nextStep.getName());
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final InquiryState m27242x(@NotNull NextStep.Complete complete, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @Nullable Map<String, ? extends InquiryField> map, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
        Map<String, com.withpersona.sdk2.inquiry.InquiryField> mapM31795j;
        Intrinsics.checkNotNullParameter(complete, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        if (str == null) {
            str = "";
        }
        String str4 = str;
        if (map == null || (mapM31795j = m27240v(map)) == null) {
            mapM31795j = C7690k0.m31795j();
        }
        return new InquiryState.Complete(inquiryId, sessionToken, str2, null, str4, mapM31795j, inquirySessionConfig, str3, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final InquiryState m27243y(@NotNull NextStep.Document document, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str, @Nullable String str2) {
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
        DocumentPages documentPagesM27225g = m27225g(document.getConfig().getPages(), document.getConfig().getLocalizations(), document.getStyles());
        NextStep.Document.AssetConfig assets = document.getConfig().getAssets();
        NextStep.Document.Pages pages = document.getConfig().getPages();
        return new InquiryState.DocumentStepRunning(inquiryId, sessionToken, str, null, styles, cancelDialog, document, name, documentPagesM27225g, assets, name2, inquirySessionConfig, m27235q((pages == null || (document2 = pages.getDocument()) == null || (pending = document2.getPending()) == null) ? null : pending.getUiStep()), str2, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final InquiryState m27244z(@NotNull NextStep.GovernmentId governmentId, @NotNull String sessionToken, @NotNull String inquiryId, @Nullable String str, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2, @Nullable String str3) {
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
            idclasses = C7699p.m31892k();
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
            enabledCaptureOptionsNativeMobile = C7697o.m31878d(CaptureOptionNativeMobile.MOBILE_CAMERA);
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
            enabledCaptureFileTypes = C7699p.m31892k();
        }
        List<NextStep.GovernmentId.CaptureFileType> list3 = enabledCaptureFileTypes;
        List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods = governmentId.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = C7699p.m31892k();
        }
        List<NextStep.GovernmentId.VideoCaptureMethod> list4 = videoCaptureMethods;
        String videoSessionJwt = governmentId.getConfig().getVideoSessionJwt();
        NextStep.GovernmentId.AssetConfig assets = governmentId.getConfig().getAssets();
        AutoClassificationConfig autoClassificationConfigM17522k = C3541d.m17522k(governmentId.getConfig().getAutoClassificationConfig(), jLongValue);
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
        EnumC6852d enumC6852dM27236r = m27236r(governmentId.getConfig().getGovidDesignVersion());
        String flowWatermarkText = governmentId.getConfig().getFlowWatermarkText();
        String silentNetworkAuthenticationCheckUrl = governmentId.getConfig().getSilentNetworkAuthenticationCheckUrl();
        Integer silentNetworkAuthenticationBackgroundTimeoutSeconds = governmentId.getConfig().getSilentNetworkAuthenticationBackgroundTimeoutSeconds();
        NextStep.GovernmentId.Pages pages = governmentId.getConfig().getPages();
        return new InquiryState.GovernmentIdStepRunning(inquiryId, sessionToken, str2, null, styles, cancelDialog, str, list, name, name2, zBooleanValue, zBooleanValue2, localizations, localizationOverrides, list2, iIntValue, jLongValue, fieldKeyDocument, fieldKeyIdclass, zBooleanValue3, list3, list4, videoSessionJwt, assets, autoClassificationConfigM17522k, axis, pendingPageTextPosition, zBooleanValue4, null, zBooleanValue5, holographicTorchEnabledDurationMs, inquirySessionConfig, enumC6852dM27236r, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, m27235q((pages == null || (governmentId2 = pages.getGovernmentId()) == null || (pending = governmentId2.getPending()) == null) ? null : pending.getUiStep()), str3, 8, 0, null);
    }
}
