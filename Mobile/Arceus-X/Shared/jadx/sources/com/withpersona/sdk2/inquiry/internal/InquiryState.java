package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.p057ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import io.EnumC6852d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p584yp.EnumC13272a;
import p610zo.InterfaceC13973m0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\r789:;<=>?@ABCB]\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b*\u0010\u0019R(\u00103\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00106\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u00105\u0082\u0001\rDEFGHIJKLMNOP¨\u0006Q"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "Landroid/os/Parcelable;", "", "sessionToken", "trackingEventsUrl", "inquiryId", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;)V", "p", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "other", "", "t0", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "i", "c", "g", "d", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "m", "h", "Z", "k", "()Z", "o", "(Z)V", "getDidGoBack$annotations", "()V", "didGoBack", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "CreateInquiryFromTemplate", "ResumeFallbackInquiry", "ExchangeOneTimeCode", "RedeemRelaySession", "CreateInquirySession", "ShowLoadingSpinner", "LoadFeatureFlagSession", "UiStepRunning", "GovernmentIdStepRunning", "SelfieStepRunning", "DocumentStepRunning", "IntegrationStepRunning", "Complete", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class InquiryState implements WorkflowState, Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String sessionToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String trackingEventsUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final TransitionStatus transitionStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final StepStyle styles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final NextStep.CancelDialog cancelDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String fromStep;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean didGoBack;

    @Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019Jr\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b$\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u001d¨\u00069"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "t", "Ljava/util/Map;", "s", "()Ljava/util/Map;", "o", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "p", "f", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Complete extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<Complete> CREATOR = new C3636a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$Complete$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3636a implements Parcelable.Creator<Complete> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(Complete.class.getClassLoader());
                String string4 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                }
                return new Complete(string, string2, string3, transitionStatus, string4, linkedHashMap, (InquirySessionConfig) parcel.readParcelable(Complete.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Complete[] newArray(int i10) {
                return new Complete[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
          (r2v0 java.lang.String)
          (r3v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r5v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r6v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r7v0 java.util.Map A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r8v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r9v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, java.lang.String, java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField>, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.InquiryState.Complete.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, java.lang.String, java.util.Map, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Complete(String str, String str2, String str3, TransitionStatus transitionStatus, String str4, Map map, InquirySessionConfig inquirySessionConfig, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, str4, map, inquirySessionConfig, str5);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState$Complete */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: r */
        public static /* synthetic */ Complete m18094r(Complete complete, String str, String str2, String str3, TransitionStatus transitionStatus, String str4, Map map, InquirySessionConfig inquirySessionConfig, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = complete.inquiryId;
            }
            if ((i10 & 2) != 0) {
                str2 = complete.sessionToken;
            }
            if ((i10 & 4) != 0) {
                str3 = complete.trackingEventsUrl;
            }
            if ((i10 & 8) != 0) {
                transitionStatus = complete.transitionStatus;
            }
            if ((i10 & 16) != 0) {
                str4 = complete.inquiryStatus;
            }
            if ((i10 & 32) != 0) {
                map = complete.fields;
            }
            if ((i10 & 64) != 0) {
                inquirySessionConfig = complete.inquirySessionConfig;
            }
            if ((i10 & 128) != 0) {
                str5 = complete.redirectUri;
            }
            InquirySessionConfig inquirySessionConfig2 = inquirySessionConfig;
            String str6 = str5;
            String str7 = str4;
            Map map2 = map;
            return complete.m18096q(str, str2, str3, transitionStatus, str7, map2, inquirySessionConfig2, str6);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.m31980c(this.inquiryId, complete.inquiryId) && Intrinsics.m31980c(this.sessionToken, complete.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, complete.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, complete.transitionStatus) && Intrinsics.m31980c(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.m31980c(this.fields, complete.fields) && Intrinsics.m31980c(this.inquirySessionConfig, complete.inquirySessionConfig) && Intrinsics.m31980c(this.redirectUri, complete.redirectUri);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (((((((iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode()) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str2 = this.redirectUri;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final Complete m18096q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryStatus, @NotNull Map<String, ? extends InquiryField> fields, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new Complete(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, inquiryStatus, fields, inquirySessionConfig, redirectUri);
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public final Map<String, InquiryField> m18097s() {
            return this.fields;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        @NotNull
        public String toString() {
            return "Complete(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ", inquirySessionConfig=" + this.inquirySessionConfig + ", redirectUri=" + this.redirectUri + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryStatus);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryStatus, @NotNull Map<String, ? extends InquiryField> fields, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.inquiryStatus = inquiryStatus;
            this.fields = fields;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str2;
        }
    }

    @Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$Jª\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010(R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b/\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b2\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\bD\u0010(R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0014\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\b9\u0010(R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bA\u0010P\u001a\u0004\bL\u0010QR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bR\u0010(¨\u0006S"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lzo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "documentStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentPages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "u", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "p", "v", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "w", "()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "t", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "f", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class DocumentStepRunning extends InquiryState implements InterfaceC13973m0 {

        @NotNull
        public static final Parcelable.Creator<DocumentStepRunning> CREATOR = new C3639a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.DocumentStepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Document documentStep;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final DocumentPages pages;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Document.AssetConfig assetConfig;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$DocumentStepRunning$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3639a implements Parcelable.Creator<DocumentStepRunning> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepRunning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepRunning(parcel.readString(), parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (DocumentPages) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (CustomPendingPage) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepRunning[] newArray(int i10) {
                return new DocumentStepRunning[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
          (r19v0 java.lang.String)
          (r20v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x000b: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r22v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r23v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle)
          (r24v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
          (r25v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document)
          (r26v0 java.lang.String)
          (r27v0 com.withpersona.sdk2.inquiry.document.DocumentPages)
          (r28v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig)
          (r29v0 java.lang.String)
          (r30v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig)
          (wrap com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage:?: TERNARY null = ((wrap int:0x0013: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage) : (r31v0 com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001c: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentPages, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.InquiryState.DocumentStepRunning.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document, java.lang.String, com.withpersona.sdk2.inquiry.document.DocumentPages, com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ DocumentStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str4, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str5, InquirySessionConfig inquirySessionConfig, CustomPendingPage customPendingPage, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, documentStepStyle, cancelDialog, document, str4, documentPages, assetConfig, str5, inquirySessionConfig, (i10 & 4096) != 0 ? null : customPendingPage, (i10 & 8192) != 0 ? null : str6);
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ DocumentStepRunning m18113r(DocumentStepRunning documentStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str4, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str5, InquirySessionConfig inquirySessionConfig, CustomPendingPage customPendingPage, String str6, int i10, Object obj) {
            return documentStepRunning.m18115q((i10 & 1) != 0 ? documentStepRunning.inquiryId : str, (i10 & 2) != 0 ? documentStepRunning.sessionToken : str2, (i10 & 4) != 0 ? documentStepRunning.trackingEventsUrl : str3, (i10 & 8) != 0 ? documentStepRunning.transitionStatus : transitionStatus, (i10 & 16) != 0 ? documentStepRunning.styles : documentStepStyle, (i10 & 32) != 0 ? documentStepRunning.cancelDialog : cancelDialog, (i10 & 64) != 0 ? documentStepRunning.documentStep : document, (i10 & 128) != 0 ? documentStepRunning.fromComponent : str4, (i10 & 256) != 0 ? documentStepRunning.pages : documentPages, (i10 & 512) != 0 ? documentStepRunning.assetConfig : assetConfig, (i10 & 1024) != 0 ? documentStepRunning.fromStep : str5, (i10 & 2048) != 0 ? documentStepRunning.inquirySessionConfig : inquirySessionConfig, (i10 & 4096) != 0 ? documentStepRunning.customPendingPage : customPendingPage, (i10 & 8192) != 0 ? documentStepRunning.redirectUri : str6);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepRunning)) {
                return false;
            }
            DocumentStepRunning documentStepRunning = (DocumentStepRunning) other;
            return Intrinsics.m31980c(this.inquiryId, documentStepRunning.inquiryId) && Intrinsics.m31980c(this.sessionToken, documentStepRunning.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, documentStepRunning.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, documentStepRunning.transitionStatus) && Intrinsics.m31980c(this.styles, documentStepRunning.styles) && Intrinsics.m31980c(this.cancelDialog, documentStepRunning.cancelDialog) && Intrinsics.m31980c(this.documentStep, documentStepRunning.documentStep) && Intrinsics.m31980c(this.fromComponent, documentStepRunning.fromComponent) && Intrinsics.m31980c(this.pages, documentStepRunning.pages) && Intrinsics.m31980c(this.assetConfig, documentStepRunning.assetConfig) && Intrinsics.m31980c(this.fromStep, documentStepRunning.fromStep) && Intrinsics.m31980c(this.inquirySessionConfig, documentStepRunning.inquirySessionConfig) && Intrinsics.m31980c(this.customPendingPage, documentStepRunning.customPendingPage) && Intrinsics.m31980c(this.redirectUri, documentStepRunning.redirectUri);
        }

        @Override // p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int iHashCode4 = (iHashCode3 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode5 = (((((((iHashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.documentStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.pages.hashCode()) * 31;
            NextStep.Document.AssetConfig assetConfig = this.assetConfig;
            int iHashCode6 = (((((iHashCode5 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.fromStep.hashCode()) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            int iHashCode7 = (iHashCode6 + (customPendingPage == null ? 0 : customPendingPage.hashCode())) * 31;
            String str2 = this.redirectUri;
            return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final DocumentStepRunning m18115q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.DocumentStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Document documentStep, @NotNull String fromComponent, @NotNull DocumentPages pages, @Nullable NextStep.Document.AssetConfig assetConfig, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable CustomPendingPage customPendingPage, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new DocumentStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, documentStep, fromComponent, pages, assetConfig, fromStep, inquirySessionConfig, customPendingPage, redirectUri);
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        public String toString() {
            return "DocumentStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", documentStep=" + this.documentStep + ", fromComponent=" + this.fromComponent + ", pages=" + this.pages + ", assetConfig=" + this.assetConfig + ", fromStep=" + this.fromStep + ", inquirySessionConfig=" + this.inquirySessionConfig + ", customPendingPage=" + this.customPendingPage + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final NextStep.Document getDocumentStep() {
            return this.documentStep;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final DocumentPages getPages() {
            return this.pages;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.documentStep, flags);
            dest.writeString(this.fromComponent);
            dest.writeParcelable(this.pages, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.fromStep);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.customPendingPage, flags);
            dest.writeString(this.redirectUri);
        }

        /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle; */
        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.DocumentStepStyle documentStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Document documentStep, @NotNull String fromComponent, @NotNull DocumentPages pages, @Nullable NextStep.Document.AssetConfig assetConfig, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable CustomPendingPage customPendingPage, @Nullable String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentStep, "documentStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = documentStepStyle;
            this.cancelDialog = cancelDialog;
            this.documentStep = documentStep;
            this.fromComponent = fromComponent;
            this.pages = pages;
            this.assetConfig = assetConfig;
            this.fromStep = fromStep;
            this.inquirySessionConfig = inquirySessionConfig;
            this.customPendingPage = customPendingPage;
            this.redirectUri = str2;
        }
    }

    @Metadata(m31664d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bS\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\u0013\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00103\u001a\u00020\u0013\u0012\b\u00104\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u001c¢\u0006\u0004\bA\u0010BJ\u001d\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u001c¢\u0006\u0004\bG\u0010HJÈ\u0003\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00132\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u00132\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00103\u001a\u00020\u00132\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00108\u001a\u0002072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\bM\u0010BJ\u001a\u0010P\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010LR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010LR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bR\u0010LR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010`\u001a\u0004\bU\u0010aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bc\u0010LR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bI\u0010S\u001a\u0004\bh\u0010LR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010S\u001a\u0004\b\\\u0010LR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bn\u0010k\u001a\u0004\bo\u0010mR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bl\u0010e\u001a\u0004\bt\u0010gR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006¢\u0006\f\n\u0004\bo\u0010e\u001a\u0004\bu\u0010gR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bc\u0010v\u001a\u0004\bw\u0010BR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bV\u0010x\u001a\u0004\by\u0010zR\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b{\u0010S\u001a\u0004\bv\u0010LR\u0017\u0010!\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b|\u0010S\u001a\u0004\bx\u0010LR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b}\u0010k\u001a\u0004\b~\u0010mR\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e8\u0006¢\u0006\r\n\u0004\b\u007f\u0010e\u001a\u0005\b\u0080\u0001\u0010gR\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010e\u001a\u0005\b\u0081\u0001\u0010gR\u001a\u0010'\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\bu\u0010S\u001a\u0005\b\u0082\u0001\u0010LR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\bj\u0010\u0085\u0001R\u0019\u0010+\u001a\u00020*8\u0006¢\u0006\u000e\n\u0005\bf\u0010\u0086\u0001\u001a\u0005\bp\u0010\u0087\u0001R\u001b\u0010-\u001a\u00020,8\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010/\u001a\u00020.8\u0006¢\u0006\u000f\n\u0005\bv\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u00100\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bx\u0010k\u001a\u0004\bn\u0010mR\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u007f\u0010\u0091\u0001R\u0018\u00103\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\bh\u0010k\u001a\u0005\b\u0092\u0001\u0010mR\u001d\u00104\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001e\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u00108\u001a\u0002078\u0006¢\u0006\u000e\n\u0005\bw\u0010\u009a\u0001\u001a\u0005\b|\u0010\u009b\u0001R\u001a\u00109\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\bt\u0010S\u001a\u0005\b\u008f\u0001\u0010LR\u001a\u0010:\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\br\u0010S\u001a\u0005\b\u009c\u0001\u0010LR\u001c\u0010;\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u000f\n\u0005\by\u0010\u0094\u0001\u001a\u0006\b\u009d\u0001\u0010\u0096\u0001R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u009e\u0001\u001a\u0005\b{\u0010\u009f\u0001R\u001e\u0010>\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010S\u001a\u0005\b \u0001\u0010L¨\u0006¡\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lzo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "enabledIdClasses", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "", "imageCaptureCount", "", "manualCaptureButtonDelayMs", "fieldKeyDocument", "fieldKeyIdClass", "shouldSkipReviewScreen", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoCaptureMethods", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "digitalIdConfig", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lio/d;", "designVersion", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lio/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;ZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lio/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "c0", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "x", "p", "Ljava/util/List;", "G", "()Ljava/util/List;", "L", "r", "s", "Z", "v", "()Z", "t", "w", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Q", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "P", "E", "I", "O", "J", "R", "()J", "z", "A", "B", "U", "C", "D", "d0", "g0", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "H", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "T", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "S", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "K", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "b0", "M", "Ljava/lang/Integer;", "N", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "Lio/d;", "()Lio/d;", "W", "V", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "f", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class GovernmentIdStepRunning extends InquiryState implements InterfaceC13973m0 {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepRunning> CREATOR = new C3641a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyIdClass;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        public final boolean shouldSkipReviewScreen;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.GovernmentId.AssetConfig assetConfig;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        @NotNull
        public final AutoClassificationConfig autoClassificationConfig;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        @NotNull
        public final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        public final boolean audioEnabled;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        @Nullable
        public final DigitalIdConfig digitalIdConfig;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        public final boolean staticCaptureTipsEnabled;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer holographicTorchEnabledDurationMs;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC6852d designVersion;

        /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
        @Nullable
        public final String silentNetworkAuthenticationCheckUrl;

        /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;

        /* JADX INFO: renamed from: S, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* JADX INFO: renamed from: T, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Id> enabledIdClasses;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.GovernmentId.Localizations localizations;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
        public final int imageCaptureCount;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
        public final long manualCaptureButtonDelayMs;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeyDocument;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$GovernmentIdStepRunning$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3641a implements Parcelable.Creator<GovernmentIdStepRunning> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v28 */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r1v9 */
            /* JADX WARN: Type inference failed for: r31v5 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v2, types: [int] */
            /* JADX WARN: Type inference failed for: r3v6 */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepRunning createFromParcel(Parcel parcel) {
                Class cls;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                String string4 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z10 = true;
                boolean z11 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    cls = GovernmentIdStepRunning.class;
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    cls = GovernmentIdStepRunning.class;
                    arrayList = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                    }
                }
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                ArrayList arrayList4 = arrayList;
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList3.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                }
                int i16 = parcel.readInt();
                Class cls2 = cls;
                long j10 = parcel.readLong();
                boolean z12 = false;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                int i17 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i17);
                for (?? r8 = z12; r8 != i17; r8++) {
                    arrayList5.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
                    i17 = i17;
                }
                int i18 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i18);
                ?? r10 = z12;
                while (r10 != i18) {
                    arrayList6.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(parcel.readString()));
                    r10 = (r10 == true ? 1 : 0) + 1;
                }
                return new GovernmentIdStepRunning(string, string2, string3, transitionStatus, governmentIdStepStyle, cancelDialog, string4, arrayList2, string5, string6, z11, z10, localizations, arrayList4, arrayList3, i16, j10, string7, string8, z12, arrayList5, arrayList6, parcel.readString(), (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(cls2.getClassLoader()), (AutoClassificationConfig) parcel.readParcelable(cls2.getClassLoader()), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0 ? true : z12, (DigitalIdConfig) parcel.readParcelable(r24.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (InquirySessionConfig) parcel.readParcelable(r24.getClassLoader()), EnumC6852d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (CustomPendingPage) parcel.readParcelable(cls2.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepRunning[] newArray(int i10) {
                return new GovernmentIdStepRunning[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007f: CONSTRUCTOR 
          (r43v0 java.lang.String)
          (r44v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r82v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0009: ARITH (r82v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r46v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r47v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle)
          (r48v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
          (r49v0 java.lang.String)
          (r50v0 java.util.List)
          (r51v0 java.lang.String)
          (r52v0 java.lang.String)
          (r53v0 boolean)
          (r54v0 boolean)
          (r55v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Localizations)
          (r56v0 java.util.List)
          (r57v0 java.util.List)
          (r58v0 int)
          (r59v0 long)
          (r61v0 java.lang.String)
          (r62v0 java.lang.String)
          (r63v0 boolean)
          (r64v0 java.util.List)
          (r65v0 java.util.List)
          (r66v0 java.lang.String)
          (r67v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig)
          (r68v0 com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig)
          (r69v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis)
          (r70v0 com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition)
          (r71v0 boolean)
          (r72v0 com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig)
          (r73v0 boolean)
          (r74v0 java.lang.Integer)
          (r75v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig)
          (r76v0 io.d)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0011: ARITH (r83v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r83v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
          (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0023: ARITH (r83v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r79v0 java.lang.Integer))
          (wrap com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage:?: TERNARY null = ((wrap int:0x002c: ARITH (r83v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage) : (r80v0 com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0035: ARITH (r83v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.network.dto.government_id.Id>, java.lang.String, java.lang.String, boolean, boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Localizations, java.util.List<com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$LocalizationOverride>, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile>, int, long, java.lang.String, java.lang.String, boolean, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$CaptureFileType>, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$VideoCaptureMethod>, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig, com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, boolean, com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig, boolean, java.lang.Integer, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, io.d, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.InquiryState.GovernmentIdStepRunning.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String, java.util.List, java.lang.String, java.lang.String, boolean, boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$Localizations, java.util.List, java.util.List, int, long, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig, com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements$Axis, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, boolean, com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig, boolean, java.lang.Integer, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, io.d, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ GovernmentIdStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str4, List list, String str5, String str6, boolean z10, boolean z11, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i10, long j10, String str7, String str8, boolean z12, List list4, List list5, String str9, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z13, DigitalIdConfig digitalIdConfig, boolean z14, Integer num, InquirySessionConfig inquirySessionConfig, EnumC6852d enumC6852d, String str10, String str11, Integer num2, CustomPendingPage customPendingPage, String str12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : transitionStatus, governmentIdStepStyle, cancelDialog, str4, list, str5, str6, z10, z11, localizations, list2, list3, i10, j10, str7, str8, z12, list4, list5, str9, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, z13, digitalIdConfig, z14, num, inquirySessionConfig, enumC6852d, (i12 & 2) != 0 ? null : str10, (i12 & 4) != 0 ? null : str11, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : customPendingPage, (i12 & 32) != 0 ? null : str12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState$GovernmentIdStepRunning */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: r */
        public static /* synthetic */ GovernmentIdStepRunning m18127r(GovernmentIdStepRunning governmentIdStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str4, List list, String str5, String str6, boolean z10, boolean z11, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i10, long j10, String str7, String str8, boolean z12, List list4, List list5, String str9, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z13, DigitalIdConfig digitalIdConfig, boolean z14, Integer num, InquirySessionConfig inquirySessionConfig, EnumC6852d enumC6852d, String str10, String str11, Integer num2, CustomPendingPage customPendingPage, String str12, int i11, int i12, Object obj) {
            String str13;
            CustomPendingPage customPendingPage2;
            String str14 = (i11 & 1) != 0 ? governmentIdStepRunning.inquiryId : str;
            String str15 = (i11 & 2) != 0 ? governmentIdStepRunning.sessionToken : str2;
            String str16 = (i11 & 4) != 0 ? governmentIdStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus2 = (i11 & 8) != 0 ? governmentIdStepRunning.transitionStatus : transitionStatus;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = (i11 & 16) != 0 ? governmentIdStepRunning.styles : governmentIdStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i11 & 32) != 0 ? governmentIdStepRunning.cancelDialog : cancelDialog;
            String str17 = (i11 & 64) != 0 ? governmentIdStepRunning.countryCode : str4;
            List list6 = (i11 & 128) != 0 ? governmentIdStepRunning.enabledIdClasses : list;
            String str18 = (i11 & 256) != 0 ? governmentIdStepRunning.fromComponent : str5;
            String str19 = (i11 & 512) != 0 ? governmentIdStepRunning.fromStep : str6;
            boolean z15 = (i11 & 1024) != 0 ? governmentIdStepRunning.backStepEnabled : z10;
            boolean z16 = (i11 & 2048) != 0 ? governmentIdStepRunning.cancelButtonEnabled : z11;
            NextStep.GovernmentId.Localizations localizations2 = (i11 & 4096) != 0 ? governmentIdStepRunning.localizations : localizations;
            List list7 = (i11 & 8192) != 0 ? governmentIdStepRunning.localizationOverrides : list2;
            String str20 = str14;
            List list8 = (i11 & 16384) != 0 ? governmentIdStepRunning.enabledCaptureOptionsNativeMobile : list3;
            int i13 = (i11 & 32768) != 0 ? governmentIdStepRunning.imageCaptureCount : i10;
            List list9 = list8;
            long j11 = (i11 & 65536) != 0 ? governmentIdStepRunning.manualCaptureButtonDelayMs : j10;
            String str21 = (i11 & 131072) != 0 ? governmentIdStepRunning.fieldKeyDocument : str7;
            String str22 = (i11 & 262144) != 0 ? governmentIdStepRunning.fieldKeyIdClass : str8;
            String str23 = str21;
            boolean z17 = (i11 & 524288) != 0 ? governmentIdStepRunning.shouldSkipReviewScreen : z12;
            List list10 = (i11 & 1048576) != 0 ? governmentIdStepRunning.enabledCaptureFileTypes : list4;
            List list11 = (i11 & 2097152) != 0 ? governmentIdStepRunning.videoCaptureMethods : list5;
            String str24 = (i11 & 4194304) != 0 ? governmentIdStepRunning.webRtcJwt : str9;
            NextStep.GovernmentId.AssetConfig assetConfig2 = (i11 & 8388608) != 0 ? governmentIdStepRunning.assetConfig : assetConfig;
            AutoClassificationConfig autoClassificationConfig2 = (i11 & 16777216) != 0 ? governmentIdStepRunning.autoClassificationConfig : autoClassificationConfig;
            StyleElements.Axis axis2 = (i11 & 33554432) != 0 ? governmentIdStepRunning.reviewCaptureButtonsAxis : axis;
            PendingPageTextPosition pendingPageTextPosition2 = (i11 & 67108864) != 0 ? governmentIdStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z18 = (i11 & 134217728) != 0 ? governmentIdStepRunning.audioEnabled : z13;
            DigitalIdConfig digitalIdConfig2 = (i11 & 268435456) != 0 ? governmentIdStepRunning.digitalIdConfig : digitalIdConfig;
            boolean z19 = (i11 & 536870912) != 0 ? governmentIdStepRunning.staticCaptureTipsEnabled : z14;
            Integer num3 = (i11 & 1073741824) != 0 ? governmentIdStepRunning.holographicTorchEnabledDurationMs : num;
            InquirySessionConfig inquirySessionConfig2 = (i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? governmentIdStepRunning.inquirySessionConfig : inquirySessionConfig;
            EnumC6852d enumC6852d2 = (i12 & 1) != 0 ? governmentIdStepRunning.designVersion : enumC6852d;
            String str25 = (i12 & 2) != 0 ? governmentIdStepRunning.flowWatermarkText : str10;
            String str26 = (i12 & 4) != 0 ? governmentIdStepRunning.silentNetworkAuthenticationCheckUrl : str11;
            Integer num4 = (i12 & 8) != 0 ? governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds : num2;
            CustomPendingPage customPendingPage3 = (i12 & 16) != 0 ? governmentIdStepRunning.customPendingPage : customPendingPage;
            if ((i12 & 32) != 0) {
                customPendingPage2 = customPendingPage3;
                str13 = governmentIdStepRunning.redirectUri;
            } else {
                str13 = str12;
                customPendingPage2 = customPendingPage3;
            }
            return governmentIdStepRunning.m18151q(str20, str15, str16, transitionStatus2, governmentIdStepStyle2, cancelDialog2, str17, list6, str18, str19, z15, z16, localizations2, list7, list9, i13, j11, str23, str22, z17, list10, list11, str24, assetConfig2, autoClassificationConfig2, axis2, pendingPageTextPosition2, z18, digitalIdConfig2, z19, num3, inquirySessionConfig2, enumC6852d2, str25, str26, num4, customPendingPage2, str13);
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final EnumC6852d getDesignVersion() {
            return this.designVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final DigitalIdConfig getDigitalIdConfig() {
            return this.digitalIdConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: D */
        public final List<NextStep.GovernmentId.CaptureFileType> m18130D() {
            return this.enabledCaptureFileTypes;
        }

        @NotNull
        /* JADX INFO: renamed from: E */
        public final List<CaptureOptionNativeMobile> m18131E() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        @NotNull
        /* JADX INFO: renamed from: G */
        public final List<Id> m18132G() {
            return this.enabledIdClasses;
        }

        @NotNull
        /* JADX INFO: renamed from: I, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        @Nullable
        /* JADX INFO: renamed from: K, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final Integer getHolographicTorchEnabledDurationMs() {
            return this.holographicTorchEnabledDurationMs;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        @Nullable
        /* JADX INFO: renamed from: P */
        public final List<NextStep.GovernmentId.LocalizationOverride> m18139P() {
            return this.localizationOverrides;
        }

        @NotNull
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final NextStep.GovernmentId.Localizations getLocalizations() {
            return this.localizations;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        @NotNull
        /* JADX INFO: renamed from: S, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: T, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX INFO: renamed from: U, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        @Nullable
        /* JADX INFO: renamed from: V, reason: from getter */
        public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
            return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
        }

        @Nullable
        /* JADX INFO: renamed from: W, reason: from getter */
        public final String getSilentNetworkAuthenticationCheckUrl() {
            return this.silentNetworkAuthenticationCheckUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        /* JADX INFO: renamed from: b0, reason: from getter */
        public final boolean getStaticCaptureTipsEnabled() {
            return this.staticCaptureTipsEnabled;
        }

        /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle; */
        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: c0, reason: from getter */
        public StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: d0 */
        public final List<NextStep.GovernmentId.VideoCaptureMethod> m18149d0() {
            return this.videoCaptureMethods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepRunning)) {
                return false;
            }
            GovernmentIdStepRunning governmentIdStepRunning = (GovernmentIdStepRunning) other;
            return Intrinsics.m31980c(this.inquiryId, governmentIdStepRunning.inquiryId) && Intrinsics.m31980c(this.sessionToken, governmentIdStepRunning.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, governmentIdStepRunning.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, governmentIdStepRunning.transitionStatus) && Intrinsics.m31980c(this.styles, governmentIdStepRunning.styles) && Intrinsics.m31980c(this.cancelDialog, governmentIdStepRunning.cancelDialog) && Intrinsics.m31980c(this.countryCode, governmentIdStepRunning.countryCode) && Intrinsics.m31980c(this.enabledIdClasses, governmentIdStepRunning.enabledIdClasses) && Intrinsics.m31980c(this.fromComponent, governmentIdStepRunning.fromComponent) && Intrinsics.m31980c(this.fromStep, governmentIdStepRunning.fromStep) && this.backStepEnabled == governmentIdStepRunning.backStepEnabled && this.cancelButtonEnabled == governmentIdStepRunning.cancelButtonEnabled && Intrinsics.m31980c(this.localizations, governmentIdStepRunning.localizations) && Intrinsics.m31980c(this.localizationOverrides, governmentIdStepRunning.localizationOverrides) && Intrinsics.m31980c(this.enabledCaptureOptionsNativeMobile, governmentIdStepRunning.enabledCaptureOptionsNativeMobile) && this.imageCaptureCount == governmentIdStepRunning.imageCaptureCount && this.manualCaptureButtonDelayMs == governmentIdStepRunning.manualCaptureButtonDelayMs && Intrinsics.m31980c(this.fieldKeyDocument, governmentIdStepRunning.fieldKeyDocument) && Intrinsics.m31980c(this.fieldKeyIdClass, governmentIdStepRunning.fieldKeyIdClass) && this.shouldSkipReviewScreen == governmentIdStepRunning.shouldSkipReviewScreen && Intrinsics.m31980c(this.enabledCaptureFileTypes, governmentIdStepRunning.enabledCaptureFileTypes) && Intrinsics.m31980c(this.videoCaptureMethods, governmentIdStepRunning.videoCaptureMethods) && Intrinsics.m31980c(this.webRtcJwt, governmentIdStepRunning.webRtcJwt) && Intrinsics.m31980c(this.assetConfig, governmentIdStepRunning.assetConfig) && Intrinsics.m31980c(this.autoClassificationConfig, governmentIdStepRunning.autoClassificationConfig) && this.reviewCaptureButtonsAxis == governmentIdStepRunning.reviewCaptureButtonsAxis && this.pendingPageTextVerticalPosition == governmentIdStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == governmentIdStepRunning.audioEnabled && Intrinsics.m31980c(this.digitalIdConfig, governmentIdStepRunning.digitalIdConfig) && this.staticCaptureTipsEnabled == governmentIdStepRunning.staticCaptureTipsEnabled && Intrinsics.m31980c(this.holographicTorchEnabledDurationMs, governmentIdStepRunning.holographicTorchEnabledDurationMs) && Intrinsics.m31980c(this.inquirySessionConfig, governmentIdStepRunning.inquirySessionConfig) && this.designVersion == governmentIdStepRunning.designVersion && Intrinsics.m31980c(this.flowWatermarkText, governmentIdStepRunning.flowWatermarkText) && Intrinsics.m31980c(this.silentNetworkAuthenticationCheckUrl, governmentIdStepRunning.silentNetworkAuthenticationCheckUrl) && Intrinsics.m31980c(this.silentNetworkAuthenticationBackgroundTimeoutSeconds, governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds) && Intrinsics.m31980c(this.customPendingPage, governmentIdStepRunning.customPendingPage) && Intrinsics.m31980c(this.redirectUri, governmentIdStepRunning.redirectUri);
        }

        @Override // p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* JADX INFO: renamed from: g0, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
            int iHashCode4 = (iHashCode3 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode5 = (iHashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            String str2 = this.countryCode;
            int iHashCode6 = (((((((((((((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.enabledIdClasses.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.localizations.hashCode()) * 31;
            List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
            int iHashCode7 = (((((((((((((((((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + this.enabledCaptureOptionsNativeMobile.hashCode()) * 31) + Integer.hashCode(this.imageCaptureCount)) * 31) + Long.hashCode(this.manualCaptureButtonDelayMs)) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode()) * 31) + Boolean.hashCode(this.shouldSkipReviewScreen)) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            String str3 = this.webRtcJwt;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NextStep.GovernmentId.AssetConfig assetConfig = this.assetConfig;
            int iHashCode9 = (((((((((iHashCode8 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.autoClassificationConfig.hashCode()) * 31) + this.reviewCaptureButtonsAxis.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31;
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            int iHashCode10 = (((iHashCode9 + (digitalIdConfig == null ? 0 : digitalIdConfig.hashCode())) * 31) + Boolean.hashCode(this.staticCaptureTipsEnabled)) * 31;
            Integer num = this.holographicTorchEnabledDurationMs;
            int iHashCode11 = (((((iHashCode10 + (num == null ? 0 : num.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31) + this.designVersion.hashCode()) * 31;
            String str4 = this.flowWatermarkText;
            int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.silentNetworkAuthenticationCheckUrl;
            int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            int iHashCode15 = (iHashCode14 + (customPendingPage == null ? 0 : customPendingPage.hashCode())) * 31;
            String str6 = this.redirectUri;
            return iHashCode15 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final GovernmentIdStepRunning m18151q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @Nullable String countryCode, @NotNull List<Id> enabledIdClasses, @NotNull String fromComponent, @NotNull String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull NextStep.GovernmentId.Localizations localizations, @Nullable List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int imageCaptureCount, long manualCaptureButtonDelayMs, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, boolean shouldSkipReviewScreen, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, @Nullable String webRtcJwt, @Nullable NextStep.GovernmentId.AssetConfig assetConfig, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, @Nullable DigitalIdConfig digitalIdConfig, boolean staticCaptureTipsEnabled, @Nullable Integer holographicTorchEnabledDurationMs, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull EnumC6852d designVersion, @Nullable String flowWatermarkText, @Nullable String silentNetworkAuthenticationCheckUrl, @Nullable Integer silentNetworkAuthenticationBackgroundTimeoutSeconds, @Nullable CustomPendingPage customPendingPage, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            return new GovernmentIdStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, countryCode, enabledIdClasses, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, localizations, localizationOverrides, enabledCaptureOptionsNativeMobile, imageCaptureCount, manualCaptureButtonDelayMs, fieldKeyDocument, fieldKeyIdClass, shouldSkipReviewScreen, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, assetConfig, autoClassificationConfig, reviewCaptureButtonsAxis, pendingPageTextVerticalPosition, audioEnabled, digitalIdConfig, staticCaptureTipsEnabled, holographicTorchEnabledDurationMs, inquirySessionConfig, designVersion, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, customPendingPage, redirectUri);
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        @NotNull
        public String toString() {
            return "GovernmentIdStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", countryCode=" + this.countryCode + ", enabledIdClasses=" + this.enabledIdClasses + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", localizations=" + this.localizations + ", localizationOverrides=" + this.localizationOverrides + ", enabledCaptureOptionsNativeMobile=" + this.enabledCaptureOptionsNativeMobile + ", imageCaptureCount=" + this.imageCaptureCount + ", manualCaptureButtonDelayMs=" + this.manualCaptureButtonDelayMs + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ", shouldSkipReviewScreen=" + this.shouldSkipReviewScreen + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", assetConfig=" + this.assetConfig + ", autoClassificationConfig=" + this.autoClassificationConfig + ", reviewCaptureButtonsAxis=" + this.reviewCaptureButtonsAxis + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", digitalIdConfig=" + this.digitalIdConfig + ", staticCaptureTipsEnabled=" + this.staticCaptureTipsEnabled + ", holographicTorchEnabledDurationMs=" + this.holographicTorchEnabledDurationMs + ", inquirySessionConfig=" + this.inquirySessionConfig + ", designVersion=" + this.designVersion + ", flowWatermarkText=" + this.flowWatermarkText + ", silentNetworkAuthenticationCheckUrl=" + this.silentNetworkAuthenticationCheckUrl + ", silentNetworkAuthenticationBackgroundTimeoutSeconds=" + this.silentNetworkAuthenticationBackgroundTimeoutSeconds + ", customPendingPage=" + this.customPendingPage + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final AutoClassificationConfig getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.countryCode);
            List<Id> list = this.enabledIdClasses;
            dest.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.GovernmentId.LocalizationOverride> list2 = this.localizationOverrides;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            List<CaptureOptionNativeMobile> list3 = this.enabledCaptureOptionsNativeMobile;
            dest.writeInt(list3.size());
            Iterator<CaptureOptionNativeMobile> it3 = list3.iterator();
            while (it3.hasNext()) {
                dest.writeString(it3.next().name());
            }
            dest.writeInt(this.imageCaptureCount);
            dest.writeLong(this.manualCaptureButtonDelayMs);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.fieldKeyIdClass);
            dest.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            List<NextStep.GovernmentId.CaptureFileType> list4 = this.enabledCaptureFileTypes;
            dest.writeInt(list4.size());
            Iterator<NextStep.GovernmentId.CaptureFileType> it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeString(it4.next().name());
            }
            List<NextStep.GovernmentId.VideoCaptureMethod> list5 = this.videoCaptureMethods;
            dest.writeInt(list5.size());
            Iterator<NextStep.GovernmentId.VideoCaptureMethod> it5 = list5.iterator();
            while (it5.hasNext()) {
                dest.writeString(it5.next().name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeParcelable(this.autoClassificationConfig, flags);
            dest.writeString(this.reviewCaptureButtonsAxis.name());
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.digitalIdConfig, flags);
            dest.writeInt(this.staticCaptureTipsEnabled ? 1 : 0);
            Integer num = this.holographicTorchEnabledDurationMs;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.designVersion.name());
            dest.writeString(this.flowWatermarkText);
            dest.writeString(this.silentNetworkAuthenticationCheckUrl);
            Integer num2 = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeParcelable(this.customPendingPage, flags);
            dest.writeString(this.redirectUri);
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile> */
        /* JADX DEBUG: Multi-variable search result rejected for r38v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$CaptureFileType> */
        /* JADX DEBUG: Multi-variable search result rejected for r39v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$VideoCaptureMethod> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public GovernmentIdStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @Nullable String str2, @NotNull List<Id> enabledIdClasses, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull NextStep.GovernmentId.Localizations localizations, @Nullable List<NextStep.GovernmentId.LocalizationOverride> list, @NotNull List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int i10, long j10, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass, boolean z12, @NotNull List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, @Nullable String str3, @Nullable NextStep.GovernmentId.AssetConfig assetConfig, @NotNull AutoClassificationConfig autoClassificationConfig, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean z13, @Nullable DigitalIdConfig digitalIdConfig, boolean z14, @Nullable Integer num, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull EnumC6852d designVersion, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable CustomPendingPage customPendingPage, @Nullable String str6) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(autoClassificationConfig, "autoClassificationConfig");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = governmentIdStepStyle;
            this.cancelDialog = cancelDialog;
            this.countryCode = str2;
            this.enabledIdClasses = enabledIdClasses;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.localizations = localizations;
            this.localizationOverrides = list;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.imageCaptureCount = i10;
            this.manualCaptureButtonDelayMs = j10;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.shouldSkipReviewScreen = z12;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.webRtcJwt = str3;
            this.assetConfig = assetConfig;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z13;
            this.digitalIdConfig = digitalIdConfig;
            this.staticCaptureTipsEnabled = z14;
            this.holographicTorchEnabledDurationMs = num;
            this.inquirySessionConfig = inquirySessionConfig;
            this.designVersion = designVersion;
            this.flowWatermarkText = str4;
            this.silentNetworkAuthenticationCheckUrl = str5;
            this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num2;
            this.customPendingPage = customPendingPage;
            this.redirectUri = str6;
        }
    }

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$LoadFeatureFlagSession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class LoadFeatureFlagSession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<LoadFeatureFlagSession> CREATOR = new C3643a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$LoadFeatureFlagSession$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3643a implements Parcelable.Creator<LoadFeatureFlagSession> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoadFeatureFlagSession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoadFeatureFlagSession(parcel.readString(), parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(LoadFeatureFlagSession.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LoadFeatureFlagSession[] newArray(int i10) {
                return new LoadFeatureFlagSession[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
          (r4v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig)
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.InquiryState.LoadFeatureFlagSession.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ LoadFeatureFlagSession(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadFeatureFlagSession)) {
                return false;
            }
            LoadFeatureFlagSession loadFeatureFlagSession = (LoadFeatureFlagSession) other;
            return Intrinsics.m31980c(this.inquiryId, loadFeatureFlagSession.inquiryId) && Intrinsics.m31980c(this.sessionToken, loadFeatureFlagSession.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, loadFeatureFlagSession.trackingEventsUrl) && Intrinsics.m31980c(this.inquirySessionConfig, loadFeatureFlagSession.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @NotNull
        public String toString() {
            return "LoadFeatureFlagSession(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadFeatureFlagSession(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    @Metadata(m31664d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bM\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÓ\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0019\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0019\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020\u0011\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u000203¢\u0006\u0004\b:\u0010;J\u001d\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u000203¢\u0006\u0004\b@\u0010AJ\u0090\u0003\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00192\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u000203HÖ\u0001¢\u0006\u0004\bF\u0010;J\u001a\u0010I\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bI\u0010JR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010ER\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\bO\u0010ER\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bK\u0010ER\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010Y\u001a\u0004\bN\u0010ZR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010ER\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010L\u001a\u0004\bU\u0010ER\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010dR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bg\u0010L\u001a\u0004\bh\u0010ER\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bc\u0010b\u001a\u0004\bi\u0010dR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bj\u0010dR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0006¢\u0006\f\n\u0004\bO\u0010p\u001a\u0004\bs\u0010rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bq\u0010t\u001a\u0004\be\u0010uR\u0019\u0010 \u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bv\u0010ER\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bw\u0010p\u001a\u0004\bx\u0010rR\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\by\u0010p\u001a\u0004\bz\u0010rR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0004\b`\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010)\u001a\u00020\u00118\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010b\u001a\u0004\bg\u0010dR\u001a\u0010+\u001a\u00020*8\u0006¢\u0006\u000f\n\u0005\bm\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010-\u001a\u00020,8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bo\u0010\u0088\u0001R\u001d\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bx\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u00100\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bz\u0010L\u001a\u0004\by\u0010ER\u001a\u00101\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010L\u001a\u0004\b{\u0010ER\u001b\u00102\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010L\u001a\u0005\b\u008c\u0001\u0010ER\u001d\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\b}\u0010\u0091\u0001\u001a\u0005\bk\u0010\u0092\u0001R\u001d\u00107\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\r\n\u0004\bi\u0010L\u001a\u0005\b\u0093\u0001\u0010E¨\u0006\u0094\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lzo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "selfieType", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "localizations", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPosesBuffer", "", "poseTimeoutMs", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lyp/a;", "designVersion", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "fileUploadUrl", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "", "silentNetworkAuthenticationBackgroundTimeoutSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lyp/a;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lyp/a;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "T", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "P", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "p", "E", "r", "Z", "u", "()Z", "s", "v", "t", "A", "O", "S", "w", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "G", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "x", "Ljava/util/List;", "z", "()Ljava/util/List;", "U", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "V", "B", "I", "C", "J", "D", "Ljava/lang/Long;", "N", "()Ljava/lang/Long;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "K", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "F", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "L", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "H", "Lyp/a;", "()Lyp/a;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "R", "M", "Ljava/lang/Integer;", "Q", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "f", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class SelfieStepRunning extends InquiryState implements InterfaceC13973m0 {

        @NotNull
        public static final Parcelable.Creator<SelfieStepRunning> CREATOR = new C3646a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<NextStep.Selfie.SelfiePose> orderedPoses;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<PoseInfo> orderedPosesBuffer;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final Long poseTimeoutMs;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        public final boolean audioEnabled;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC13272a designVersion;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        @Nullable
        public final String fileUploadUrl;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
        @Nullable
        public final String silentNetworkAuthenticationCheckUrl;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.SelfieStepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.CaptureMethod selfieType;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeySelfie;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        public final boolean requireStrictSelfieCapture;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        public final boolean skipPromptPage;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.Localizations localizations;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Selfie.AssetConfig assetConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$SelfieStepRunning$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3646a implements Parcelable.Creator<SelfieStepRunning> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepRunning createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                ArrayList arrayList;
                ArrayList arrayList2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.Selfie.CaptureMethod captureMethodValueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z12 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z12 = true;
                }
                if (parcel.readInt() == 0) {
                    z13 = z12;
                }
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                    z11 = true;
                } else {
                    z10 = z13;
                    z11 = z12;
                }
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int i11 = 0;
                while (i11 != i10) {
                    arrayList3.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
                    i11++;
                    i10 = i10;
                }
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int i13 = 0;
                while (i13 != i12) {
                    arrayList4.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
                    i13++;
                    i12 = i12;
                }
                NextStep.Selfie.AssetConfig assetConfig = (NextStep.Selfie.AssetConfig) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList = new ArrayList(i14);
                    int i15 = 0;
                    while (i15 != i14) {
                        arrayList.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                        i15++;
                        i14 = i14;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i16 = parcel.readInt();
                    arrayList2 = new ArrayList(i16);
                    int i17 = 0;
                    while (i17 != i16) {
                        arrayList2.add(parcel.readParcelable(r2.getClassLoader()));
                        i17++;
                        i16 = i16;
                    }
                }
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                PendingPageTextPosition pendingPageTextPositionValueOf = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                return new SelfieStepRunning(string, string2, string3, transitionStatus, selfieStepStyle, cancelDialog, captureMethodValueOf, string4, string5, z12, z13, string6, z11, z10, localizations, arrayList3, arrayList4, assetConfig, string7, arrayList, arrayList2, lValueOf, pendingPageTextPositionValueOf, z10, (PoseConfigs) parcel.readParcelable(r2.getClassLoader()), EnumC13272a.valueOf(parcel.readString()), (InquirySessionConfig) parcel.readParcelable(r2.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (CustomPendingPage) parcel.readParcelable(SelfieStepRunning.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepRunning[] newArray(int i10) {
                return new SelfieStepRunning[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007d: CONSTRUCTOR 
          (r37v0 java.lang.String)
          (r38v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r70v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0009: ARITH (r70v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r40v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r41v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$SelfieStepStyle)
          (r42v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
          (r43v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureMethod)
          (r44v0 java.lang.String)
          (r45v0 java.lang.String)
          (r46v0 boolean)
          (r47v0 boolean)
          (r48v0 java.lang.String)
          (r49v0 boolean)
          (r50v0 boolean)
          (r51v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Localizations)
          (r52v0 java.util.List)
          (r53v0 java.util.List)
          (r54v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig)
          (r55v0 java.lang.String)
          (r56v0 java.util.List)
          (r57v0 java.util.List)
          (r58v0 java.lang.Long)
          (r59v0 com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition)
          (r60v0 boolean)
          (r61v0 com.withpersona.sdk2.inquiry.selfie.PoseConfigs)
          (r62v0 yp.a)
          (r63v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig)
          (r64v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0013: ARITH (r70v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001e: ARITH (r70v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
          (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0029: ARITH (r70v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
          (wrap com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage:?: TERNARY null = ((wrap int:0x0034: ARITH (r70v0 int) & (wrap ??:SGET  A[WRAPPED] androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_FORCE_ASCII int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage) : (r68v0 com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x003d: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$SelfieStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureMethod, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Localizations, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureFileType>, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$VideoCaptureMethod>, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig, java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$SelfiePose>, java.util.List<com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo>, java.lang.Long, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, boolean, com.withpersona.sdk2.inquiry.selfie.PoseConfigs, yp.a, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.InquiryState.SelfieStepRunning.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$SelfieStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureMethod, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$Localizations, java.util.List, java.util.List, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig, java.lang.String, java.util.List, java.util.List, java.lang.Long, com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition, boolean, com.withpersona.sdk2.inquiry.selfie.PoseConfigs, yp.a, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ SelfieStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str4, String str5, boolean z10, boolean z11, String str6, boolean z12, boolean z13, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str7, List list3, List list4, Long l10, PendingPageTextPosition pendingPageTextPosition, boolean z14, PoseConfigs poseConfigs, EnumC13272a enumC13272a, InquirySessionConfig inquirySessionConfig, String str8, String str9, String str10, Integer num, CustomPendingPage customPendingPage, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, selfieStepStyle, cancelDialog, captureMethod, str4, str5, z10, z11, str6, z12, z13, localizations, list, list2, assetConfig, str7, list3, list4, l10, pendingPageTextPosition, z14, poseConfigs, enumC13272a, inquirySessionConfig, str8, (i10 & 268435456) != 0 ? null : str9, (i10 & 536870912) != 0 ? null : str10, (i10 & 1073741824) != 0 ? null : num, (i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : customPendingPage, (i11 & 1) != 0 ? null : str11);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState$SelfieStepRunning */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: r */
        public static /* synthetic */ SelfieStepRunning m18184r(SelfieStepRunning selfieStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str4, String str5, boolean z10, boolean z11, String str6, boolean z12, boolean z13, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str7, List list3, List list4, Long l10, PendingPageTextPosition pendingPageTextPosition, boolean z14, PoseConfigs poseConfigs, EnumC13272a enumC13272a, InquirySessionConfig inquirySessionConfig, String str8, String str9, String str10, Integer num, CustomPendingPage customPendingPage, String str11, int i10, int i11, Object obj) {
            String str12;
            CustomPendingPage customPendingPage2;
            String str13 = (i10 & 1) != 0 ? selfieStepRunning.inquiryId : str;
            String str14 = (i10 & 2) != 0 ? selfieStepRunning.sessionToken : str2;
            String str15 = (i10 & 4) != 0 ? selfieStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus2 = (i10 & 8) != 0 ? selfieStepRunning.transitionStatus : transitionStatus;
            StepStyles.SelfieStepStyle selfieStepStyle2 = (i10 & 16) != 0 ? selfieStepRunning.styles : selfieStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i10 & 32) != 0 ? selfieStepRunning.cancelDialog : cancelDialog;
            NextStep.Selfie.CaptureMethod captureMethod2 = (i10 & 64) != 0 ? selfieStepRunning.selfieType : captureMethod;
            String str16 = (i10 & 128) != 0 ? selfieStepRunning.fromComponent : str4;
            String str17 = (i10 & 256) != 0 ? selfieStepRunning.fromStep : str5;
            boolean z15 = (i10 & 512) != 0 ? selfieStepRunning.backStepEnabled : z10;
            boolean z16 = (i10 & 1024) != 0 ? selfieStepRunning.cancelButtonEnabled : z11;
            String str18 = (i10 & 2048) != 0 ? selfieStepRunning.fieldKeySelfie : str6;
            boolean z17 = (i10 & 4096) != 0 ? selfieStepRunning.requireStrictSelfieCapture : z12;
            boolean z18 = (i10 & 8192) != 0 ? selfieStepRunning.skipPromptPage : z13;
            String str19 = str13;
            NextStep.Selfie.Localizations localizations2 = (i10 & 16384) != 0 ? selfieStepRunning.localizations : localizations;
            List list5 = (i10 & 32768) != 0 ? selfieStepRunning.enabledCaptureFileTypes : list;
            List list6 = (i10 & 65536) != 0 ? selfieStepRunning.videoCaptureMethods : list2;
            NextStep.Selfie.AssetConfig assetConfig2 = (i10 & 131072) != 0 ? selfieStepRunning.assetConfig : assetConfig;
            String str20 = (i10 & 262144) != 0 ? selfieStepRunning.webRtcJwt : str7;
            List list7 = (i10 & 524288) != 0 ? selfieStepRunning.orderedPoses : list3;
            List list8 = (i10 & 1048576) != 0 ? selfieStepRunning.orderedPosesBuffer : list4;
            Long l11 = (i10 & 2097152) != 0 ? selfieStepRunning.poseTimeoutMs : l10;
            PendingPageTextPosition pendingPageTextPosition2 = (i10 & 4194304) != 0 ? selfieStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z19 = (i10 & 8388608) != 0 ? selfieStepRunning.audioEnabled : z14;
            PoseConfigs poseConfigs2 = (i10 & 16777216) != 0 ? selfieStepRunning.poseConfigs : poseConfigs;
            EnumC13272a enumC13272a2 = (i10 & 33554432) != 0 ? selfieStepRunning.designVersion : enumC13272a;
            InquirySessionConfig inquirySessionConfig2 = (i10 & 67108864) != 0 ? selfieStepRunning.inquirySessionConfig : inquirySessionConfig;
            String str21 = (i10 & 134217728) != 0 ? selfieStepRunning.fileUploadUrl : str8;
            String str22 = (i10 & 268435456) != 0 ? selfieStepRunning.flowWatermarkText : str9;
            String str23 = (i10 & 536870912) != 0 ? selfieStepRunning.silentNetworkAuthenticationCheckUrl : str10;
            Integer num2 = (i10 & 1073741824) != 0 ? selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds : num;
            CustomPendingPage customPendingPage3 = (i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? selfieStepRunning.customPendingPage : customPendingPage;
            if ((i11 & 1) != 0) {
                customPendingPage2 = customPendingPage3;
                str12 = selfieStepRunning.redirectUri;
            } else {
                str12 = str11;
                customPendingPage2 = customPendingPage3;
            }
            return selfieStepRunning.m18203q(str19, str14, str15, transitionStatus2, selfieStepStyle2, cancelDialog2, captureMethod2, str16, str17, z15, z16, str18, z17, z18, localizations2, list5, list6, assetConfig2, str20, list7, list8, l11, pendingPageTextPosition2, z19, poseConfigs2, enumC13272a2, inquirySessionConfig2, str21, str22, str23, num2, customPendingPage2, str12);
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getFileUploadUrl() {
            return this.fileUploadUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* JADX INFO: renamed from: E, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public final NextStep.Selfie.Localizations getLocalizations() {
            return this.localizations;
        }

        @Nullable
        /* JADX INFO: renamed from: I */
        public final List<NextStep.Selfie.SelfiePose> m18190I() {
            return this.orderedPoses;
        }

        @Nullable
        /* JADX INFO: renamed from: J */
        public final List<PoseInfo> m18191J() {
            return this.orderedPosesBuffer;
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final Long getPoseTimeoutMs() {
            return this.poseTimeoutMs;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        @NotNull
        /* JADX INFO: renamed from: P, reason: from getter */
        public final NextStep.Selfie.CaptureMethod getSelfieType() {
            return this.selfieType;
        }

        @Nullable
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final Integer getSilentNetworkAuthenticationBackgroundTimeoutSeconds() {
            return this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
        }

        @Nullable
        /* JADX INFO: renamed from: R, reason: from getter */
        public final String getSilentNetworkAuthenticationCheckUrl() {
            return this.silentNetworkAuthenticationCheckUrl;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle; */
        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: T, reason: from getter */
        public StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        /* JADX INFO: renamed from: U */
        public final List<NextStep.Selfie.VideoCaptureMethod> m18201U() {
            return this.videoCaptureMethods;
        }

        @Nullable
        /* JADX INFO: renamed from: V, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieStepRunning)) {
                return false;
            }
            SelfieStepRunning selfieStepRunning = (SelfieStepRunning) other;
            return Intrinsics.m31980c(this.inquiryId, selfieStepRunning.inquiryId) && Intrinsics.m31980c(this.sessionToken, selfieStepRunning.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, selfieStepRunning.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, selfieStepRunning.transitionStatus) && Intrinsics.m31980c(this.styles, selfieStepRunning.styles) && Intrinsics.m31980c(this.cancelDialog, selfieStepRunning.cancelDialog) && this.selfieType == selfieStepRunning.selfieType && Intrinsics.m31980c(this.fromComponent, selfieStepRunning.fromComponent) && Intrinsics.m31980c(this.fromStep, selfieStepRunning.fromStep) && this.backStepEnabled == selfieStepRunning.backStepEnabled && this.cancelButtonEnabled == selfieStepRunning.cancelButtonEnabled && Intrinsics.m31980c(this.fieldKeySelfie, selfieStepRunning.fieldKeySelfie) && this.requireStrictSelfieCapture == selfieStepRunning.requireStrictSelfieCapture && this.skipPromptPage == selfieStepRunning.skipPromptPage && Intrinsics.m31980c(this.localizations, selfieStepRunning.localizations) && Intrinsics.m31980c(this.enabledCaptureFileTypes, selfieStepRunning.enabledCaptureFileTypes) && Intrinsics.m31980c(this.videoCaptureMethods, selfieStepRunning.videoCaptureMethods) && Intrinsics.m31980c(this.assetConfig, selfieStepRunning.assetConfig) && Intrinsics.m31980c(this.webRtcJwt, selfieStepRunning.webRtcJwt) && Intrinsics.m31980c(this.orderedPoses, selfieStepRunning.orderedPoses) && Intrinsics.m31980c(this.orderedPosesBuffer, selfieStepRunning.orderedPosesBuffer) && Intrinsics.m31980c(this.poseTimeoutMs, selfieStepRunning.poseTimeoutMs) && this.pendingPageTextVerticalPosition == selfieStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == selfieStepRunning.audioEnabled && Intrinsics.m31980c(this.poseConfigs, selfieStepRunning.poseConfigs) && this.designVersion == selfieStepRunning.designVersion && Intrinsics.m31980c(this.inquirySessionConfig, selfieStepRunning.inquirySessionConfig) && Intrinsics.m31980c(this.fileUploadUrl, selfieStepRunning.fileUploadUrl) && Intrinsics.m31980c(this.flowWatermarkText, selfieStepRunning.flowWatermarkText) && Intrinsics.m31980c(this.silentNetworkAuthenticationCheckUrl, selfieStepRunning.silentNetworkAuthenticationCheckUrl) && Intrinsics.m31980c(this.silentNetworkAuthenticationBackgroundTimeoutSeconds, selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds) && Intrinsics.m31980c(this.customPendingPage, selfieStepRunning.customPendingPage) && Intrinsics.m31980c(this.redirectUri, selfieStepRunning.redirectUri);
        }

        @Override // p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int iHashCode4 = (iHashCode3 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode5 = (((((((((((((((((((((((iHashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.selfieType.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.localizations.hashCode()) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            NextStep.Selfie.AssetConfig assetConfig = this.assetConfig;
            int iHashCode6 = (iHashCode5 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
            String str2 = this.webRtcJwt;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<NextStep.Selfie.SelfiePose> list = this.orderedPoses;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            List<PoseInfo> list2 = this.orderedPosesBuffer;
            int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Long l10 = this.poseTimeoutMs;
            int iHashCode10 = (((((((((((iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode()) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str3 = this.fileUploadUrl;
            int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.flowWatermarkText;
            int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.silentNetworkAuthenticationCheckUrl;
            int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            int iHashCode15 = (iHashCode14 + (customPendingPage == null ? 0 : customPendingPage.hashCode())) * 31;
            String str6 = this.redirectUri;
            return iHashCode15 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final SelfieStepRunning m18203q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.SelfieStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Selfie.CaptureMethod selfieType, @NotNull String fromComponent, @NotNull String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull String fieldKeySelfie, boolean requireStrictSelfieCapture, boolean skipPromptPage, @NotNull NextStep.Selfie.Localizations localizations, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, @Nullable NextStep.Selfie.AssetConfig assetConfig, @Nullable String webRtcJwt, @Nullable List<? extends NextStep.Selfie.SelfiePose> orderedPoses, @Nullable List<PoseInfo> orderedPosesBuffer, @Nullable Long poseTimeoutMs, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, @NotNull PoseConfigs poseConfigs, @NotNull EnumC13272a designVersion, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String fileUploadUrl, @Nullable String flowWatermarkText, @Nullable String silentNetworkAuthenticationCheckUrl, @Nullable Integer silentNetworkAuthenticationBackgroundTimeoutSeconds, @Nullable CustomPendingPage customPendingPage, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new SelfieStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, selfieType, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, localizations, enabledCaptureFileTypes, videoCaptureMethods, assetConfig, webRtcJwt, orderedPoses, orderedPosesBuffer, poseTimeoutMs, pendingPageTextVerticalPosition, audioEnabled, poseConfigs, designVersion, inquirySessionConfig, fileUploadUrl, flowWatermarkText, silentNetworkAuthenticationCheckUrl, silentNetworkAuthenticationBackgroundTimeoutSeconds, customPendingPage, redirectUri);
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        @NotNull
        public String toString() {
            return "SelfieStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", selfieType=" + this.selfieType + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", localizations=" + this.localizations + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", assetConfig=" + this.assetConfig + ", webRtcJwt=" + this.webRtcJwt + ", orderedPoses=" + this.orderedPoses + ", orderedPosesBuffer=" + this.orderedPosesBuffer + ", poseTimeoutMs=" + this.poseTimeoutMs + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ", inquirySessionConfig=" + this.inquirySessionConfig + ", fileUploadUrl=" + this.fileUploadUrl + ", flowWatermarkText=" + this.flowWatermarkText + ", silentNetworkAuthenticationCheckUrl=" + this.silentNetworkAuthenticationCheckUrl + ", silentNetworkAuthenticationBackgroundTimeoutSeconds=" + this.silentNetworkAuthenticationBackgroundTimeoutSeconds + ", customPendingPage=" + this.customPendingPage + ", redirectUri=" + this.redirectUri + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.selfieType.name());
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.Selfie.CaptureFileType> list = this.enabledCaptureFileTypes;
            dest.writeInt(list.size());
            Iterator<NextStep.Selfie.CaptureFileType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<NextStep.Selfie.VideoCaptureMethod> list2 = this.videoCaptureMethods;
            dest.writeInt(list2.size());
            Iterator<NextStep.Selfie.VideoCaptureMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.webRtcJwt);
            List<NextStep.Selfie.SelfiePose> list3 = this.orderedPoses;
            if (list3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list3.size());
                Iterator<NextStep.Selfie.SelfiePose> it3 = list3.iterator();
                while (it3.hasNext()) {
                    dest.writeString(it3.next().name());
                }
            }
            List<PoseInfo> list4 = this.orderedPosesBuffer;
            if (list4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list4.size());
                Iterator<PoseInfo> it4 = list4.iterator();
                while (it4.hasNext()) {
                    dest.writeParcelable(it4.next(), flags);
                }
            }
            Long l10 = this.poseTimeoutMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.poseConfigs, flags);
            dest.writeString(this.designVersion.name());
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.fileUploadUrl);
            dest.writeString(this.flowWatermarkText);
            dest.writeString(this.silentNetworkAuthenticationCheckUrl);
            Integer num = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeParcelable(this.customPendingPage, flags);
            dest.writeString(this.redirectUri);
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final EnumC13272a getDesignVersion() {
            return this.designVersion;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        /* JADX INFO: renamed from: z */
        public final List<NextStep.Selfie.CaptureFileType> m18210z() {
            return this.enabledCaptureFileTypes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Multi-variable search result rejected for r32v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$CaptureFileType> */
        /* JADX DEBUG: Multi-variable search result rejected for r33v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$VideoCaptureMethod> */
        /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$SelfiePose> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelfieStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @NotNull NextStep.Selfie.CaptureMethod selfieType, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull String fieldKeySelfie, boolean z12, boolean z13, @NotNull NextStep.Selfie.Localizations localizations, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, @Nullable NextStep.Selfie.AssetConfig assetConfig, @Nullable String str2, @Nullable List<? extends NextStep.Selfie.SelfiePose> list, @Nullable List<PoseInfo> list2, @Nullable Long l10, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, boolean z14, @NotNull PoseConfigs poseConfigs, @NotNull EnumC13272a designVersion, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable CustomPendingPage customPendingPage, @Nullable String str6) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(localizations, "localizations");
            Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = selfieStepStyle;
            this.cancelDialog = cancelDialog;
            this.selfieType = selfieType;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z12;
            this.skipPromptPage = z13;
            this.localizations = localizations;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.assetConfig = assetConfig;
            this.webRtcJwt = str2;
            this.orderedPoses = list;
            this.orderedPosesBuffer = list2;
            this.poseTimeoutMs = l10;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z14;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.inquirySessionConfig = inquirySessionConfig;
            this.fileUploadUrl = str3;
            this.flowWatermarkText = str4;
            this.silentNetworkAuthenticationCheckUrl = str5;
            this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num;
            this.customPendingPage = customPendingPage;
            this.redirectUri = str6;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b.\u0010/J\u008e\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u0010)J\u001a\u00107\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u00103R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b9\u00103R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010G\u001a\u0004\b<\u0010HR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u00103R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u0010:\u001a\u0004\bO\u00103R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010VR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bW\u0010U\u001a\u0004\bW\u0010VR\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010VR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bZ\u0010:\u001a\u0004\b[\u00103R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bY\u0010\\\u001a\u0004\bZ\u0010]R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bN\u0010:\u001a\u0004\bX\u00103R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b=\u0010Q\u001a\u0004\b^\u0010SR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bK\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010#\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\be\u0010U\u001a\u0004\bf\u0010VR\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bg\u00103R\u0014\u0010h\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00103¨\u0006i"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lzo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "localizations", "inquiryStatus", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "webviewUrl", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "isRestoringState", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "z", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "p", "x", "C", "r", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "s", "Z", "()Z", "t", "u", "w", "v", "getWebviewUrl", "Ljava/util/Map;", "()Ljava/util/Map;", "A", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "D", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "B", "E", "f", "fromStep", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class UiStepRunning extends InquiryState implements InterfaceC13973m0 {

        @NotNull
        public static final Parcelable.Creator<UiStepRunning> CREATOR = new C3648a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        public final boolean isRestoringState;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.C3793Ui.Localizations localizations;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentConfig> components;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        public final boolean finalStep;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        @Nullable
        public final String webviewUrl;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
        @NotNull
        public final String clientSideKey;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<UiComponentErrorInfo> serverComponentErrors;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$UiStepRunning$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3648a implements Parcelable.Creator<UiStepRunning> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepRunning createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.C3793Ui.Localizations localizations = (NextStep.C3793Ui.Localizations) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z10 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList3.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    }
                    arrayList = arrayList3;
                }
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                if (parcel.readInt() == 0) {
                    z11 = z10;
                }
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                String string6 = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int i13 = 0;
                while (i13 != i12) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    i13++;
                    i12 = i12;
                }
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i14 = parcel.readInt();
                    arrayList2 = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        arrayList2.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    }
                }
                return new UiStepRunning(string, string2, string3, transitionStatus, uiStepStyle, cancelDialog, localizations, string4, string5, arrayList, z10, z11, z11, string6, linkedHashMap, string7, arrayList2, (InternalErrorInfo) parcel.readParcelable(UiStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(UiStepRunning.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepRunning[] newArray(int i10) {
                return new UiStepRunning[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
          (r25v0 java.lang.String)
          (r26v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0009: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r28v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r29v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle)
          (r30v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
          (r31v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations)
          (r32v0 java.lang.String)
          (r33v0 java.lang.String)
          (r34v0 java.util.List)
          (r35v0 boolean)
          (r36v0 boolean)
          (r37v0 boolean)
          (r38v0 java.lang.String)
          (r39v0 java.util.Map)
          (r40v0 java.lang.String)
          (r41v0 java.util.List)
          (wrap com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo:?: TERNARY null = ((wrap int:0x0013: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) : (r42v0 com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo))
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x001e: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0022: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r43v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
          (r44v0 boolean)
          (r45v0 java.lang.String)
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations, java.lang.String, java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig>, boolean, boolean, boolean, java.lang.String, java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField>, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo>, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, boolean, java.lang.String):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.UiStepRunning.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$UiStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, java.lang.String, java.util.Map, java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, boolean, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ UiStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.C3793Ui.Localizations localizations, String str4, String str5, List list, boolean z10, boolean z11, boolean z12, String str6, Map map, String str7, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z13, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, uiStepStyle, cancelDialog, localizations, str4, str5, list, z10, z11, z12, str6, map, str7, list2, (i10 & 131072) != 0 ? null : internalErrorInfo, (i10 & 262144) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig, z13, str8);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.withpersona.sdk2.inquiry.internal.InquiryState$UiStepRunning */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: r */
        public static /* synthetic */ UiStepRunning m18218r(UiStepRunning uiStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.C3793Ui.Localizations localizations, String str4, String str5, List list, boolean z10, boolean z11, boolean z12, String str6, Map map, String str7, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z13, String str8, int i10, Object obj) {
            String str9;
            boolean z14;
            String str10 = (i10 & 1) != 0 ? uiStepRunning.inquiryId : str;
            String str11 = (i10 & 2) != 0 ? uiStepRunning.sessionToken : str2;
            String str12 = (i10 & 4) != 0 ? uiStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus2 = (i10 & 8) != 0 ? uiStepRunning.transitionStatus : transitionStatus;
            StepStyles.UiStepStyle uiStepStyle2 = (i10 & 16) != 0 ? uiStepRunning.styles : uiStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i10 & 32) != 0 ? uiStepRunning.cancelDialog : cancelDialog;
            NextStep.C3793Ui.Localizations localizations2 = (i10 & 64) != 0 ? uiStepRunning.localizations : localizations;
            String str13 = (i10 & 128) != 0 ? uiStepRunning.inquiryStatus : str4;
            String str14 = (i10 & 256) != 0 ? uiStepRunning.stepName : str5;
            List list3 = (i10 & 512) != 0 ? uiStepRunning.components : list;
            boolean z15 = (i10 & 1024) != 0 ? uiStepRunning.backStepEnabled : z10;
            boolean z16 = (i10 & 2048) != 0 ? uiStepRunning.cancelButtonEnabled : z11;
            boolean z17 = (i10 & 4096) != 0 ? uiStepRunning.finalStep : z12;
            String str15 = (i10 & 8192) != 0 ? uiStepRunning.webviewUrl : str6;
            String str16 = str10;
            Map map2 = (i10 & 16384) != 0 ? uiStepRunning.fields : map;
            String str17 = (i10 & 32768) != 0 ? uiStepRunning.clientSideKey : str7;
            List list4 = (i10 & 65536) != 0 ? uiStepRunning.serverComponentErrors : list2;
            InternalErrorInfo internalErrorInfo2 = (i10 & 131072) != 0 ? uiStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig2 = (i10 & 262144) != 0 ? uiStepRunning.inquirySessionConfig : inquirySessionConfig;
            boolean z18 = (i10 & 524288) != 0 ? uiStepRunning.isRestoringState : z13;
            if ((i10 & 1048576) != 0) {
                z14 = z18;
                str9 = uiStepRunning.redirectUri;
            } else {
                str9 = str8;
                z14 = z18;
            }
            return uiStepRunning.m18223q(str16, str11, str12, transitionStatus2, uiStepStyle2, cancelDialog2, localizations2, str13, str14, list3, z15, z16, z17, str15, map2, str17, list4, internalErrorInfo2, inquirySessionConfig2, z14, str9);
        }

        @Nullable
        /* JADX INFO: renamed from: A */
        public final List<UiComponentErrorInfo> m18219A() {
            return this.serverComponentErrors;
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepRunning)) {
                return false;
            }
            UiStepRunning uiStepRunning = (UiStepRunning) other;
            return Intrinsics.m31980c(this.inquiryId, uiStepRunning.inquiryId) && Intrinsics.m31980c(this.sessionToken, uiStepRunning.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, uiStepRunning.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, uiStepRunning.transitionStatus) && Intrinsics.m31980c(this.styles, uiStepRunning.styles) && Intrinsics.m31980c(this.cancelDialog, uiStepRunning.cancelDialog) && Intrinsics.m31980c(this.localizations, uiStepRunning.localizations) && Intrinsics.m31980c(this.inquiryStatus, uiStepRunning.inquiryStatus) && Intrinsics.m31980c(this.stepName, uiStepRunning.stepName) && Intrinsics.m31980c(this.components, uiStepRunning.components) && this.backStepEnabled == uiStepRunning.backStepEnabled && this.cancelButtonEnabled == uiStepRunning.cancelButtonEnabled && this.finalStep == uiStepRunning.finalStep && Intrinsics.m31980c(this.webviewUrl, uiStepRunning.webviewUrl) && Intrinsics.m31980c(this.fields, uiStepRunning.fields) && Intrinsics.m31980c(this.clientSideKey, uiStepRunning.clientSideKey) && Intrinsics.m31980c(this.serverComponentErrors, uiStepRunning.serverComponentErrors) && Intrinsics.m31980c(this.transitionError, uiStepRunning.transitionError) && Intrinsics.m31980c(this.inquirySessionConfig, uiStepRunning.inquirySessionConfig) && this.isRestoringState == uiStepRunning.isRestoringState && Intrinsics.m31980c(this.redirectUri, uiStepRunning.redirectUri);
        }

        @Override // p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode4 = (iHashCode3 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode5 = (iHashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            NextStep.C3793Ui.Localizations localizations = this.localizations;
            int iHashCode6 = (((((iHashCode5 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int iHashCode7 = (((((((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31;
            String str2 = this.webviewUrl;
            int iHashCode8 = (((((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fields.hashCode()) * 31) + this.clientSideKey.hashCode()) * 31;
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int iHashCode10 = (((((iHashCode9 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31) + Boolean.hashCode(this.isRestoringState)) * 31;
            String str3 = this.redirectUri;
            return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: m */
        public String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final UiStepRunning m18223q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.UiStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @Nullable NextStep.C3793Ui.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> components, boolean backStepEnabled, boolean cancelButtonEnabled, boolean finalStep, @Nullable String webviewUrl, @NotNull Map<String, ? extends InquiryField> fields, @NotNull String clientSideKey, @Nullable List<UiComponentErrorInfo> serverComponentErrors, @Nullable InternalErrorInfo transitionError, @NotNull InquirySessionConfig inquirySessionConfig, boolean isRestoringState, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new UiStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, localizations, inquiryStatus, stepName, components, backStepEnabled, cancelButtonEnabled, finalStep, webviewUrl, fields, clientSideKey, serverComponentErrors, transitionError, inquirySessionConfig, isRestoringState, redirectUri);
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public String toString() {
            return "UiStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", components=" + this.components + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", webviewUrl=" + this.webviewUrl + ", fields=" + this.fields + ", clientSideKey=" + this.clientSideKey + ", serverComponentErrors=" + this.serverComponentErrors + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ", isRestoringState=" + this.isRestoringState + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getClientSideKey() {
            return this.clientSideKey;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final Map<String, InquiryField> m18227v() {
            return this.fields;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getFinalStep() {
            return this.finalStep;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.components;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeInt(this.finalStep ? 1 : 0);
            dest.writeString(this.webviewUrl);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.clientSideKey);
            List<UiComponentErrorInfo> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiComponentErrorInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
            dest.writeString(this.redirectUri);
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final NextStep.C3793Ui.Localizations getLocalizations() {
            return this.localizations;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle; */
        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, p610zo.InterfaceC13973m0
        @Nullable
        public StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r26v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
        /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UiStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @Nullable NextStep.C3793Ui.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> list, boolean z10, boolean z11, boolean z12, @Nullable String str2, @NotNull Map<String, ? extends InquiryField> fields, @NotNull String clientSideKey, @Nullable List<UiComponentErrorInfo> list2, @Nullable InternalErrorInfo internalErrorInfo, @NotNull InquirySessionConfig inquirySessionConfig, boolean z13, @Nullable String str3) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(fields, "fields");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = uiStepStyle;
            this.cancelDialog = cancelDialog;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.components = list;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.finalStep = z12;
            this.webviewUrl = str2;
            this.fields = fields;
            this.clientSideKey = clientSideKey;
            this.serverComponentErrors = list2;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.isRestoringState = z13;
            this.redirectUri = str3;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 java.lang.String)
      (r3v0 java.lang.String)
      (r4v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus)
      (r5v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle)
      (r6v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
      (r7v0 java.lang.String)
     A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.InquiryState.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ InquiryState(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, transitionStatus, stepStyle, cancelDialog, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract InquirySessionConfig getInquirySessionConfig();

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getInquiryId() {
        return this.inquiryId;
    }

    @Nullable
    public StepStyle getStyles() {
        return this.styles;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public String getTrackingEventsUrl() {
        return this.trackingEventsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public NextStep.CancelDialog getCancelDialog() {
        return this.cancelDialog;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public String getFromStep() {
        return this.fromStep;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public TransitionStatus getTransitionStatus() {
        return this.transitionStatus;
    }

    /* JADX INFO: renamed from: o */
    public final void m18091o(boolean z10) {
        this.didGoBack = z10;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final InquiryState m18092p(@Nullable TransitionStatus transitionStatus) {
        if (this instanceof Complete) {
            return Complete.m18094r((Complete) this, null, null, null, transitionStatus, null, null, null, null, 247, null);
        }
        if ((this instanceof CreateInquiryFromTemplate) || (this instanceof ResumeFallbackInquiry) || (this instanceof CreateInquirySession) || (this instanceof ExchangeOneTimeCode) || (this instanceof RedeemRelaySession)) {
            return this;
        }
        if (this instanceof DocumentStepRunning) {
            return DocumentStepRunning.m18113r((DocumentStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, null, null, null, null, 16375, null);
        }
        if (this instanceof GovernmentIdStepRunning) {
            return GovernmentIdStepRunning.m18127r((GovernmentIdStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, -9, 63, null);
        }
        if (this instanceof SelfieStepRunning) {
            return SelfieStepRunning.m18184r((SelfieStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -9, 1, null);
        }
        if (this instanceof ShowLoadingSpinner) {
            return ShowLoadingSpinner.m18213r((ShowLoadingSpinner) this, null, null, transitionStatus, null, null, false, null, 123, null);
        }
        if (this instanceof UiStepRunning) {
            return UiStepRunning.m18218r((UiStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, null, 2097143, null);
        }
        if (this instanceof IntegrationStepRunning) {
            return IntegrationStepRunning.m18161r((IntegrationStepRunning) this, null, null, null, transitionStatus, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 1048567, null);
        }
        if (this instanceof LoadFeatureFlagSession) {
            return this;
        }
        throw new C7345l();
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
    /* JADX INFO: renamed from: t0 */
    public boolean mo16478t0(@NotNull WorkflowState other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getClass() == other.getClass() && Intrinsics.m31980c(getFromStep(), ((InquiryState) other).getFromStep());
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public String getSessionToken() {
        return this.sessionToken;
    }

    @Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001dR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b<\u0010\u001d¨\u0006="}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "templateId", "templateVersion", "accountId", "environmentId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "u", "j", "v", "k", "q", "l", "r", "m", "t", "n", "Ljava/util/Map;", "s", "()Ljava/util/Map;", "o", "w", "p", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getRedirectUri", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class CreateInquiryFromTemplate extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<CreateInquiryFromTemplate> CREATOR = new C3637a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public final String templateId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final String templateVersion;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String accountId;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final String environmentId;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final String referenceId;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @Nullable
        public final String themeSetId;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @Nullable
        public final StaticInquiryTemplate staticInquiryTemplate;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$CreateInquiryFromTemplate$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3637a implements Parcelable.Creator<CreateInquiryFromTemplate> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CreateInquiryFromTemplate createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i10 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
                    }
                }
                return new CreateInquiryFromTemplate(string, string2, string3, string4, string5, linkedHashMap, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CreateInquiryFromTemplate[] newArray(int i10) {
                return new CreateInquiryFromTemplate[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
          (r13v0 java.lang.String)
          (r14v0 java.lang.String)
          (r15v0 java.lang.String)
          (r16v0 java.lang.String)
          (r17v0 java.lang.String)
          (r18v0 java.util.Map)
          (r19v0 java.lang.String)
          (r20v0 com.withpersona.sdk2.inquiry.StaticInquiryTemplate)
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x0002: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x000c: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0006: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r21v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
          (r22v0 java.lang.String)
         A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField>, java.lang.String, com.withpersona.sdk2.inquiry.StaticInquiryTemplate, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.CreateInquiryFromTemplate.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, com.withpersona.sdk2.inquiry.StaticInquiryTemplate, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ CreateInquiryFromTemplate(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, InquirySessionConfig inquirySessionConfig, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, map, str6, staticInquiryTemplate, (i10 & 256) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig, str7);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateInquiryFromTemplate)) {
                return false;
            }
            CreateInquiryFromTemplate createInquiryFromTemplate = (CreateInquiryFromTemplate) other;
            return Intrinsics.m31980c(this.templateId, createInquiryFromTemplate.templateId) && Intrinsics.m31980c(this.templateVersion, createInquiryFromTemplate.templateVersion) && Intrinsics.m31980c(this.accountId, createInquiryFromTemplate.accountId) && Intrinsics.m31980c(this.environmentId, createInquiryFromTemplate.environmentId) && Intrinsics.m31980c(this.referenceId, createInquiryFromTemplate.referenceId) && Intrinsics.m31980c(this.fields, createInquiryFromTemplate.fields) && Intrinsics.m31980c(this.themeSetId, createInquiryFromTemplate.themeSetId) && Intrinsics.m31980c(this.staticInquiryTemplate, createInquiryFromTemplate.staticInquiryTemplate) && Intrinsics.m31980c(this.inquirySessionConfig, createInquiryFromTemplate.inquirySessionConfig) && Intrinsics.m31980c(this.redirectUri, createInquiryFromTemplate.redirectUri);
        }

        public int hashCode() {
            String str = this.templateId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.environmentId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referenceId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, InquiryField> map = this.fields;
            int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            int iHashCode8 = (((iHashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str7 = this.redirectUri;
            return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final Map<String, InquiryField> m18103s() {
            return this.fields;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @NotNull
        public String toString() {
            return "CreateInquiryFromTemplate(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", environmentId=" + this.environmentId + ", referenceId=" + this.referenceId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ", inquirySessionConfig=" + this.inquirySessionConfig + ", redirectUri=" + this.redirectUri + ")";
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.templateId);
            dest.writeString(this.templateVersion);
            dest.writeString(this.accountId);
            dest.writeString(this.environmentId);
            dest.writeString(this.referenceId);
            Map<String, InquiryField> map = this.fields;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeString(this.themeSetId);
            dest.writeParcelable(this.staticInquiryTemplate, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.redirectUri);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CreateInquiryFromTemplate(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, ? extends InquiryField> map, @Nullable String str6, @Nullable StaticInquiryTemplate staticInquiryTemplate, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str7) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.environmentId = str4;
            this.referenceId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str7;
        }
    }

    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "q", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class CreateInquirySession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<CreateInquirySession> CREATOR = new C3638a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final InquirySessionDataWrapper inquirySessionDataWrapper;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$CreateInquirySession$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3638a implements Parcelable.Creator<CreateInquirySession> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CreateInquirySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateInquirySession(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(CreateInquirySession.class.getClassLoader()), (InquirySessionDataWrapper) parcel.readParcelable(CreateInquirySession.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CreateInquirySession[] newArray(int i10) {
                return new CreateInquirySession[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:0x0006: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0004: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r2v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
          (wrap com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper:?: TERNARY null = ((wrap int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.CreateInquirySession.<init>(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ CreateInquirySession(String str, InquirySessionConfig inquirySessionConfig, InquirySessionDataWrapper inquirySessionDataWrapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig, (i10 & 4) != 0 ? null : inquirySessionDataWrapper);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateInquirySession)) {
                return false;
            }
            CreateInquirySession createInquirySession = (CreateInquirySession) other;
            return Intrinsics.m31980c(this.inquiryId, createInquirySession.inquiryId) && Intrinsics.m31980c(this.inquirySessionConfig, createInquirySession.inquirySessionConfig) && Intrinsics.m31980c(this.inquirySessionDataWrapper, createInquirySession.inquirySessionDataWrapper);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.inquirySessionConfig.hashCode()) * 31;
            InquirySessionDataWrapper inquirySessionDataWrapper = this.inquirySessionDataWrapper;
            return iHashCode + (inquirySessionDataWrapper == null ? 0 : inquirySessionDataWrapper.hashCode());
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final InquirySessionDataWrapper getInquirySessionDataWrapper() {
            return this.inquirySessionDataWrapper;
        }

        @NotNull
        public String toString() {
            return "CreateInquirySession(inquiryId=" + this.inquiryId + ", inquirySessionConfig=" + this.inquirySessionConfig + ", inquirySessionDataWrapper=" + this.inquirySessionDataWrapper + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.inquirySessionDataWrapper, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateInquirySession(@NotNull String inquiryId, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.inquirySessionConfig = inquirySessionConfig;
            this.inquirySessionDataWrapper = inquirySessionDataWrapper;
        }
    }

    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ExchangeOneTimeCode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "q", "j", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ExchangeOneTimeCode extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ExchangeOneTimeCode> CREATOR = new C3640a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String oneTimeLinkCode;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$ExchangeOneTimeCode$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3640a implements Parcelable.Creator<ExchangeOneTimeCode> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExchangeOneTimeCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeOneTimeCode(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(ExchangeOneTimeCode.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExchangeOneTimeCode[] newArray(int i10) {
                return new ExchangeOneTimeCode[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:0x0006: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0004: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r2v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.ExchangeOneTimeCode.<init>(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ ExchangeOneTimeCode(String str, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExchangeOneTimeCode)) {
                return false;
            }
            ExchangeOneTimeCode exchangeOneTimeCode = (ExchangeOneTimeCode) other;
            return Intrinsics.m31980c(this.oneTimeLinkCode, exchangeOneTimeCode.oneTimeLinkCode) && Intrinsics.m31980c(this.inquirySessionConfig, exchangeOneTimeCode.inquirySessionConfig);
        }

        public int hashCode() {
            return (this.oneTimeLinkCode.hashCode() * 31) + this.inquirySessionConfig.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        @NotNull
        public String toString() {
            return "ExchangeOneTimeCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.oneTimeLinkCode);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExchangeOneTimeCode(@NotNull String oneTimeLinkCode, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.oneTimeLinkCode = oneTimeLinkCode;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    @Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#¢\u0006\u0004\b*\u0010+Jè\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00103\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010/R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010/R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b5\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010C\u001a\u0004\b8\u0010DR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010/R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u0010/R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\bI\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u0010/R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bT\u0010/R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bN\u0010WR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bL\u0010V\u001a\u0004\bR\u0010WR\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bX\u0010/R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b9\u0010Y\u001a\u0004\bU\u0010ZR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bT\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\bb\u0010/R\u0014\u0010c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010/¨\u0006d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lzo/m0;", "", "inquiryId", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", Payload.TYPE, "flowUrl", "redirectPath", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "localizations", "inquiryStatus", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "integrationPage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$IntegrationStepRunning;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "g", "j", "y", "k", "l", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "o", "D", "p", "u", "x", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "w", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "t", "getInquiryStatus", "z", "v", "Z", "()Z", "getClientSideKey", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "C", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "B", "f", "fromStep", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class IntegrationStepRunning extends InquiryState implements InterfaceC13973m0 {

        @NotNull
        public static final Parcelable.Creator<IntegrationStepRunning> CREATOR = new C3642a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.IntegrationStepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @NotNull
        public final String flowUrl;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @NotNull
        public final String redirectPath;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        @Nullable
        public final NextStep.Integration.Localizations localizations;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
        @NotNull
        public final String clientSideKey;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
        @Nullable
        public final IntegrationPage integrationPage;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3642a implements Parcelable.Creator<IntegrationStepRunning> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepRunning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegrationStepRunning(parcel.readString(), parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (StepStyles.IntegrationStepStyle) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), NextStep.Integration.IntegrationStepBrowserType.valueOf(parcel.readString()), (NextStep.Integration.Localizations) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (IntegrationPage) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepRunning[] newArray(int i10) {
                return new IntegrationStepRunning[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
          (r24v0 java.lang.String)
          (r25v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0009: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r27v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r28v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle)
          (r29v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog)
          (r30v0 java.lang.String)
          (r31v0 java.lang.String)
          (r32v0 java.lang.String)
          (r33v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType)
          (r34v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations)
          (r35v0 java.lang.String)
          (r36v0 java.lang.String)
          (r37v0 boolean)
          (r38v0 boolean)
          (r39v0 java.lang.String)
          (r40v0 com.withpersona.sdk2.inquiry.integration.IntegrationPage)
          (wrap com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo:?: TERNARY null = ((wrap int:0x0013: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) : (r41v0 com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo))
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x001e: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0028: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0022: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r42v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x002f: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.withpersona.sdk2.inquiry.integration.IntegrationPage, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.IntegrationStepRunning.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType, com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.withpersona.sdk2.inquiry.integration.IntegrationPage, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ IntegrationStepRunning(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str4, String str5, String str6, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, NextStep.Integration.Localizations localizations, String str7, String str8, boolean z10, boolean z11, String str9, IntegrationPage integrationPage, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, integrationStepStyle, cancelDialog, str4, str5, str6, integrationStepBrowserType, localizations, str7, str8, z10, z11, str9, integrationPage, (i10 & 131072) != 0 ? null : internalErrorInfo, (i10 & 262144) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig, (i10 & 524288) != 0 ? null : str10);
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ IntegrationStepRunning m18161r(IntegrationStepRunning integrationStepRunning, String str, String str2, String str3, TransitionStatus transitionStatus, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str4, String str5, String str6, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, NextStep.Integration.Localizations localizations, String str7, String str8, boolean z10, boolean z11, String str9, IntegrationPage integrationPage, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, String str10, int i10, Object obj) {
            String str11;
            InquirySessionConfig inquirySessionConfig2;
            String str12 = (i10 & 1) != 0 ? integrationStepRunning.inquiryId : str;
            String str13 = (i10 & 2) != 0 ? integrationStepRunning.sessionToken : str2;
            String str14 = (i10 & 4) != 0 ? integrationStepRunning.trackingEventsUrl : str3;
            TransitionStatus transitionStatus2 = (i10 & 8) != 0 ? integrationStepRunning.transitionStatus : transitionStatus;
            StepStyles.IntegrationStepStyle integrationStepStyle2 = (i10 & 16) != 0 ? integrationStepRunning.styles : integrationStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i10 & 32) != 0 ? integrationStepRunning.cancelDialog : cancelDialog;
            String str15 = (i10 & 64) != 0 ? integrationStepRunning.type : str4;
            String str16 = (i10 & 128) != 0 ? integrationStepRunning.flowUrl : str5;
            String str17 = (i10 & 256) != 0 ? integrationStepRunning.redirectPath : str6;
            NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType2 = (i10 & 512) != 0 ? integrationStepRunning.integrationStepBrowserType : integrationStepBrowserType;
            NextStep.Integration.Localizations localizations2 = (i10 & 1024) != 0 ? integrationStepRunning.localizations : localizations;
            String str18 = (i10 & 2048) != 0 ? integrationStepRunning.inquiryStatus : str7;
            String str19 = (i10 & 4096) != 0 ? integrationStepRunning.stepName : str8;
            boolean z12 = (i10 & 8192) != 0 ? integrationStepRunning.backStepEnabled : z10;
            String str20 = str12;
            boolean z13 = (i10 & 16384) != 0 ? integrationStepRunning.cancelButtonEnabled : z11;
            String str21 = (i10 & 32768) != 0 ? integrationStepRunning.clientSideKey : str9;
            IntegrationPage integrationPage2 = (i10 & 65536) != 0 ? integrationStepRunning.integrationPage : integrationPage;
            InternalErrorInfo internalErrorInfo2 = (i10 & 131072) != 0 ? integrationStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig3 = (i10 & 262144) != 0 ? integrationStepRunning.inquirySessionConfig : inquirySessionConfig;
            if ((i10 & 524288) != 0) {
                inquirySessionConfig2 = inquirySessionConfig3;
                str11 = integrationStepRunning.redirectUri;
            } else {
                str11 = str10;
                inquirySessionConfig2 = inquirySessionConfig3;
            }
            return integrationStepRunning.m18165q(str20, str13, str14, transitionStatus2, integrationStepStyle2, cancelDialog2, str15, str16, str17, integrationStepBrowserType2, localizations2, str18, str19, z12, z13, str21, integrationPage2, internalErrorInfo2, inquirySessionConfig2, str11);
        }

        /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle; */
        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public StepStyles.IntegrationStepStyle getStyles() {
            return this.styles;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        @NotNull
        /* JADX INFO: renamed from: D, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegrationStepRunning)) {
                return false;
            }
            IntegrationStepRunning integrationStepRunning = (IntegrationStepRunning) other;
            return Intrinsics.m31980c(this.inquiryId, integrationStepRunning.inquiryId) && Intrinsics.m31980c(this.sessionToken, integrationStepRunning.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, integrationStepRunning.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, integrationStepRunning.transitionStatus) && Intrinsics.m31980c(this.styles, integrationStepRunning.styles) && Intrinsics.m31980c(this.cancelDialog, integrationStepRunning.cancelDialog) && Intrinsics.m31980c(this.type, integrationStepRunning.type) && Intrinsics.m31980c(this.flowUrl, integrationStepRunning.flowUrl) && Intrinsics.m31980c(this.redirectPath, integrationStepRunning.redirectPath) && this.integrationStepBrowserType == integrationStepRunning.integrationStepBrowserType && Intrinsics.m31980c(this.localizations, integrationStepRunning.localizations) && Intrinsics.m31980c(this.inquiryStatus, integrationStepRunning.inquiryStatus) && Intrinsics.m31980c(this.stepName, integrationStepRunning.stepName) && this.backStepEnabled == integrationStepRunning.backStepEnabled && this.cancelButtonEnabled == integrationStepRunning.cancelButtonEnabled && Intrinsics.m31980c(this.clientSideKey, integrationStepRunning.clientSideKey) && Intrinsics.m31980c(this.integrationPage, integrationStepRunning.integrationPage) && Intrinsics.m31980c(this.transitionError, integrationStepRunning.transitionError) && Intrinsics.m31980c(this.inquirySessionConfig, integrationStepRunning.inquirySessionConfig) && Intrinsics.m31980c(this.redirectUri, integrationStepRunning.redirectUri);
        }

        @Override // p610zo.InterfaceC13973m0
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int iHashCode4 = (iHashCode3 + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode5 = (((((((((iHashCode4 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31) + this.redirectPath.hashCode()) * 31) + this.integrationStepBrowserType.hashCode()) * 31;
            NextStep.Integration.Localizations localizations = this.localizations;
            int iHashCode6 = (((((((((((iHashCode5 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.clientSideKey.hashCode()) * 31;
            IntegrationPage integrationPage = this.integrationPage;
            int iHashCode7 = (iHashCode6 + (integrationPage == null ? 0 : integrationPage.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int iHashCode8 = (((iHashCode7 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str2 = this.redirectUri;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final IntegrationStepRunning m18165q(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.IntegrationStepStyle styles, @Nullable NextStep.CancelDialog cancelDialog, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, @Nullable NextStep.Integration.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, boolean backStepEnabled, boolean cancelButtonEnabled, @NotNull String clientSideKey, @Nullable IntegrationPage integrationPage, @Nullable InternalErrorInfo transitionError, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new IntegrationStepRunning(inquiryId, sessionToken, trackingEventsUrl, transitionStatus, styles, cancelDialog, type, flowUrl, redirectPath, integrationStepBrowserType, localizations, inquiryStatus, stepName, backStepEnabled, cancelButtonEnabled, clientSideKey, integrationPage, transitionError, inquirySessionConfig, redirectUri);
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public String toString() {
            return "IntegrationStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", redirectPath=" + this.redirectPath + ", integrationStepBrowserType=" + this.integrationStepBrowserType + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", clientSideKey=" + this.clientSideKey + ", integrationPage=" + this.integrationPage + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ", redirectUri=" + this.redirectUri + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final IntegrationPage getIntegrationPage() {
            return this.integrationPage;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final NextStep.Integration.IntegrationStepBrowserType getIntegrationStepBrowserType() {
            return this.integrationStepBrowserType;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.type);
            dest.writeString(this.flowUrl);
            dest.writeString(this.redirectPath);
            dest.writeString(this.integrationStepBrowserType.name());
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.clientSideKey);
            dest.writeParcelable(this.integrationPage, flags);
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeString(this.redirectUri);
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getRedirectPath() {
            return this.redirectPath;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        /* JADX INFO: renamed from: z */
        public final String m18172z() {
            return this.stepName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegrationStepRunning(@NotNull String inquiryId, @NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle, @Nullable NextStep.CancelDialog cancelDialog, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, @Nullable NextStep.Integration.Localizations localizations, @NotNull String inquiryStatus, @NotNull String stepName, boolean z10, boolean z11, @NotNull String clientSideKey, @Nullable IntegrationPage integrationPage, @Nullable InternalErrorInfo internalErrorInfo, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str2) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(clientSideKey, "clientSideKey");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.styles = integrationStepStyle;
            this.cancelDialog = cancelDialog;
            this.type = type;
            this.flowUrl = flowUrl;
            this.redirectPath = redirectPath;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.clientSideKey = clientSideKey;
            this.integrationPage = integrationPage;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str2;
        }
    }

    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$RedeemRelaySession;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "q", "j", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class RedeemRelaySession extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<RedeemRelaySession> CREATOR = new C3644a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String relaySessionToken;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$RedeemRelaySession$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3644a implements Parcelable.Creator<RedeemRelaySession> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RedeemRelaySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemRelaySession(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(RedeemRelaySession.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RedeemRelaySession[] newArray(int i10) {
                return new RedeemRelaySession[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:0x0006: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0004: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r2v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.RedeemRelaySession.<init>(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ RedeemRelaySession(String str, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedeemRelaySession)) {
                return false;
            }
            RedeemRelaySession redeemRelaySession = (RedeemRelaySession) other;
            return Intrinsics.m31980c(this.relaySessionToken, redeemRelaySession.relaySessionToken) && Intrinsics.m31980c(this.inquirySessionConfig, redeemRelaySession.inquirySessionConfig);
        }

        public int hashCode() {
            return (this.relaySessionToken.hashCode() * 31) + this.inquirySessionConfig.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getRelaySessionToken() {
            return this.relaySessionToken;
        }

        @NotNull
        public String toString() {
            return "RedeemRelaySession(relaySessionToken=" + this.relaySessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.relaySessionToken);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedeemRelaySession(@NotNull String relaySessionToken, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(relaySessionToken, "relaySessionToken");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.relaySessionToken = relaySessionToken;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "fallbackInquiryId", "fallbackSessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "q", "j", "r", "k", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ResumeFallbackInquiry extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ResumeFallbackInquiry> CREATOR = new C3645a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fallbackInquiryId;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fallbackSessionToken;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$ResumeFallbackInquiry$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3645a implements Parcelable.Creator<ResumeFallbackInquiry> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResumeFallbackInquiry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResumeFallbackInquiry(parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(ResumeFallbackInquiry.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ResumeFallbackInquiry[] newArray(int i10) {
                return new ResumeFallbackInquiry[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:0x0006: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0004: SGET  A[WRAPPED] (LINE:1) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:1)) : (r3v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.internal.InquiryState.ResumeFallbackInquiry.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ ResumeFallbackInquiry(String str, String str2, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResumeFallbackInquiry)) {
                return false;
            }
            ResumeFallbackInquiry resumeFallbackInquiry = (ResumeFallbackInquiry) other;
            return Intrinsics.m31980c(this.fallbackInquiryId, resumeFallbackInquiry.fallbackInquiryId) && Intrinsics.m31980c(this.fallbackSessionToken, resumeFallbackInquiry.fallbackSessionToken) && Intrinsics.m31980c(this.inquirySessionConfig, resumeFallbackInquiry.inquirySessionConfig);
        }

        public int hashCode() {
            return (((this.fallbackInquiryId.hashCode() * 31) + this.fallbackSessionToken.hashCode()) * 31) + this.inquirySessionConfig.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getFallbackInquiryId() {
            return this.fallbackInquiryId;
        }

        @NotNull
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        @NotNull
        public String toString() {
            return "ResumeFallbackInquiry(fallbackInquiryId=" + this.fallbackInquiryId + ", fallbackSessionToken=" + this.fallbackSessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fallbackInquiryId);
            dest.writeString(this.fallbackSessionToken);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeFallbackInquiry(@NotNull String fallbackInquiryId, @NotNull String fallbackSessionToken, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(fallbackInquiryId, "fallbackInquiryId");
            Intrinsics.checkNotNullParameter(fallbackSessionToken, "fallbackSessionToken");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.fallbackInquiryId = fallbackInquiryId;
            this.fallbackSessionToken = fallbackSessionToken;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public InquiryState(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str4) {
        this.sessionToken = str;
        this.trackingEventsUrl = str2;
        this.inquiryId = str3;
        this.transitionStatus = transitionStatus;
        this.styles = stepStyle;
        this.cancelDialog = cancelDialog;
        this.fromStep = str4;
    }

    @Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "", "sessionToken", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "transitionStatus", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "q", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "y", "j", "k", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "n", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "l", "g", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Z", "s", "()Z", "o", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ShowLoadingSpinner extends InquiryState {

        @NotNull
        public static final Parcelable.Creator<ShowLoadingSpinner> CREATOR = new C3647a();

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final String trackingEventsUrl;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final TransitionStatus transitionStatus;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        public final boolean useBasicSpinner;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryState$ShowLoadingSpinner$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3647a implements Parcelable.Creator<ShowLoadingSpinner> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowLoadingSpinner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowLoadingSpinner(parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readString(), (StepStyle) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readInt() != 0, (InquirySessionConfig) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowLoadingSpinner[] newArray(int i10) {
                return new ShowLoadingSpinner[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
          (r3v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
          (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:0x000e: CONSTRUCTOR 
          (null zo.a0)
          false
          (3 int)
          (wrap java.lang.Object[]:?: TERNARY null = ((0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
         A[MD:(zo.a0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.TransitionStatus.CheckingForNextState.<init>(zo.a0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
          (r6v0 java.lang.String)
          (r7v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle)
          (r8v0 boolean)
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:?: TERNARY null = ((wrap int:0x0011: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig:0x0017: INVOKE 
          (wrap com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a:0x0015: SGET  A[WRAPPED] (LINE:2) com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.d com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig$a)
         VIRTUAL call: com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig.a.a():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig A[MD:():com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig (m), WRAPPED] (LINE:2)) : (r9v0 com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, boolean, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.internal.InquiryState.ShowLoadingSpinner.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, boolean, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ShowLoadingSpinner(String str, String str2, TransitionStatus transitionStatus, String str3, StepStyle stepStyle, boolean z10, InquirySessionConfig inquirySessionConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? new TransitionStatus.CheckingForNextState(null, false, 3, 0 == true ? 1 : 0) : transitionStatus, str3, stepStyle, z10, (i10 & 64) != 0 ? InquirySessionConfig.INSTANCE.m20427a() : inquirySessionConfig);
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ ShowLoadingSpinner m18213r(ShowLoadingSpinner showLoadingSpinner, String str, String str2, TransitionStatus transitionStatus, String str3, StepStyle stepStyle, boolean z10, InquirySessionConfig inquirySessionConfig, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = showLoadingSpinner.sessionToken;
            }
            if ((i10 & 2) != 0) {
                str2 = showLoadingSpinner.trackingEventsUrl;
            }
            if ((i10 & 4) != 0) {
                transitionStatus = showLoadingSpinner.transitionStatus;
            }
            if ((i10 & 8) != 0) {
                str3 = showLoadingSpinner.inquiryId;
            }
            if ((i10 & 16) != 0) {
                stepStyle = showLoadingSpinner.styles;
            }
            if ((i10 & 32) != 0) {
                z10 = showLoadingSpinner.useBasicSpinner;
            }
            if ((i10 & 64) != 0) {
                inquirySessionConfig = showLoadingSpinner.inquirySessionConfig;
            }
            boolean z11 = z10;
            InquirySessionConfig inquirySessionConfig2 = inquirySessionConfig;
            StepStyle stepStyle2 = stepStyle;
            TransitionStatus transitionStatus2 = transitionStatus;
            return showLoadingSpinner.m18214q(str, str2, transitionStatus2, str3, stepStyle2, z11, inquirySessionConfig2);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowLoadingSpinner)) {
                return false;
            }
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) other;
            return Intrinsics.m31980c(this.sessionToken, showLoadingSpinner.sessionToken) && Intrinsics.m31980c(this.trackingEventsUrl, showLoadingSpinner.trackingEventsUrl) && Intrinsics.m31980c(this.transitionStatus, showLoadingSpinner.transitionStatus) && Intrinsics.m31980c(this.inquiryId, showLoadingSpinner.inquiryId) && Intrinsics.m31980c(this.styles, showLoadingSpinner.styles) && this.useBasicSpinner == showLoadingSpinner.useBasicSpinner && Intrinsics.m31980c(this.inquirySessionConfig, showLoadingSpinner.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, p610zo.InterfaceC13973m0
        @Nullable
        public StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = this.sessionToken.hashCode() * 31;
            String str = this.trackingEventsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int iHashCode3 = (((iHashCode2 + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31) + this.inquiryId.hashCode()) * 31;
            StepStyle stepStyle = this.styles;
            return ((((iHashCode3 + (stepStyle != null ? stepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.useBasicSpinner)) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public String getTrackingEventsUrl() {
            return this.trackingEventsUrl;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final ShowLoadingSpinner m18214q(@NotNull String sessionToken, @Nullable String trackingEventsUrl, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryId, @Nullable StepStyle styles, boolean useBasicSpinner, @NotNull InquirySessionConfig inquirySessionConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new ShowLoadingSpinner(sessionToken, trackingEventsUrl, transitionStatus, inquiryId, styles, useBasicSpinner, inquirySessionConfig);
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getUseBasicSpinner() {
            return this.useBasicSpinner;
        }

        @NotNull
        public String toString() {
            return "ShowLoadingSpinner(sessionToken=" + this.sessionToken + ", trackingEventsUrl=" + this.trackingEventsUrl + ", transitionStatus=" + this.transitionStatus + ", inquiryId=" + this.inquiryId + ", styles=" + this.styles + ", useBasicSpinner=" + this.useBasicSpinner + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.trackingEventsUrl);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryId);
            dest.writeParcelable(this.styles, flags);
            dest.writeInt(this.useBasicSpinner ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLoadingSpinner(@NotNull String sessionToken, @Nullable String str, @Nullable TransitionStatus transitionStatus, @NotNull String inquiryId, @Nullable StepStyle stepStyle, boolean z10, @NotNull InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.trackingEventsUrl = str;
            this.transitionStatus = transitionStatus;
            this.inquiryId = inquiryId;
            this.styles = stepStyle;
            this.useBasicSpinner = z10;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
      (wrap com.withpersona.sdk2.inquiry.internal.TransitionStatus:?: TERNARY null = ((wrap int:0x0010: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.internal.TransitionStatus) : (r6v0 com.withpersona.sdk2.inquiry.internal.TransitionStatus))
      (wrap com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle:?: TERNARY null = ((wrap int:0x0015: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle) : (r7v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle))
      (wrap com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog:?: TERNARY null = ((wrap int:0x001a: ARITH (r10v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog) : (r8v0 com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001f: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
      (null kotlin.jvm.internal.DefaultConstructorMarker)
     A[MD:(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.internal.InquiryState.<init>(java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.TransitionStatus, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ InquiryState(String str, String str2, String str3, TransitionStatus transitionStatus, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : transitionStatus, (i10 & 16) != 0 ? null : stepStyle, (i10 & 32) != 0 ? null : cancelDialog, (i10 & 64) != 0 ? null : str4, null);
    }
}
