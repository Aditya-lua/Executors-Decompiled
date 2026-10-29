package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ar.C1147b;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.integration.C3612a;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0388q;
import p229jt.C7345l;
import p475uq.C11930a;
import p554xo.BrowserSelection;
import p554xo.C12873e;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.Snapshot;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005678.0B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020 *\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010$\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020#2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%JU\u0010,\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 0*0(0'*\u00020&2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Luq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "props", "Lym/i;", "snapshot", "u", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "state", "C", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)Lym/i;", "renderProps", "renderState", "Lym/k$a;", "context", "z", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;Lym/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", NotificationCompat.CATEGORY_EVENT, "", "v", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "r", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lym/k$a;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "p", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lym/k$a;)Ljava/util/List;", "a", "Landroid/content/Context;", "b", "Luq/a;", "c", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Input", "State", "PendingAction", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class IntegrationWorkflow extends AbstractC13218k<Input, State, InterfaceC3611b, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C3612a.a integrationBrowserWorkerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b4\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b?\u0010IR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bG\u0010;¨\u0006K"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Landroid/os/Parcelable;", "", "inquiryId", "sessionToken", "stepName", Payload.TYPE, "flowUrl", "redirectPath", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "startPage", "isSubmitting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;ZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInquiryId", "b", "getSessionToken", "c", "getStepName", "d", "getType", "e", "g", "f", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "h", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "l", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "m", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "n", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new C3607a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @NotNull
        public final String flowUrl;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @NotNull
        public final String redirectPath;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.IntegrationStepStyle styles;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final IntegrationPage startPage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        public final boolean isSubmitting;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$Input$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3607a implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserTypeValueOf = NextStep.Integration.IntegrationStepBrowserType.valueOf(parcel.readString());
                boolean z10 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new Input(string, string2, string3, string4, string5, string6, integrationStepBrowserTypeValueOf, z10, z11, (InquirySessionConfig) parcel.readParcelable(Input.class.getClassLoader()), (StepStyles.IntegrationStepStyle) parcel.readParcelable(Input.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Input.class.getClassLoader()), parcel.readInt() == 0 ? null : IntegrationPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @NotNull String type, @NotNull String flowUrl, @NotNull String redirectPath, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, boolean z10, boolean z11, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable StepStyles.IntegrationStepStyle integrationStepStyle, @Nullable InternalErrorInfo internalErrorInfo, @Nullable IntegrationPage integrationPage, boolean z12) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(flowUrl, "flowUrl");
            Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
            Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.stepName = stepName;
            this.type = type;
            this.flowUrl = flowUrl;
            this.redirectPath = redirectPath;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.inquirySessionConfig = inquirySessionConfig;
            this.styles = integrationStepStyle;
            this.transitionError = internalErrorInfo;
            this.startPage = integrationPage;
            this.isSubmitting = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.m31980c(this.inquiryId, input.inquiryId) && Intrinsics.m31980c(this.sessionToken, input.sessionToken) && Intrinsics.m31980c(this.stepName, input.stepName) && Intrinsics.m31980c(this.type, input.type) && Intrinsics.m31980c(this.flowUrl, input.flowUrl) && Intrinsics.m31980c(this.redirectPath, input.redirectPath) && this.integrationStepBrowserType == input.integrationStepBrowserType && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.m31980c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.m31980c(this.styles, input.styles) && Intrinsics.m31980c(this.transitionError, input.transitionError) && Intrinsics.m31980c(this.startPage, input.startPage) && this.isSubmitting == input.isSubmitting;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31) + this.stepName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31) + this.redirectPath.hashCode()) * 31) + this.integrationStepBrowserType.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int iHashCode3 = (iHashCode2 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31;
            IntegrationPage integrationPage = this.startPage;
            return ((iHashCode3 + (integrationPage != null ? integrationPage.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSubmitting);
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final NextStep.Integration.IntegrationStepBrowserType getIntegrationStepBrowserType() {
            return this.integrationStepBrowserType;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getRedirectPath() {
            return this.redirectPath;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final IntegrationPage getStartPage() {
            return this.startPage;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        @NotNull
        public String toString() {
            return "Input(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", stepName=" + this.stepName + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", redirectPath=" + this.redirectPath + ", integrationStepBrowserType=" + this.integrationStepBrowserType + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", inquirySessionConfig=" + this.inquirySessionConfig + ", styles=" + this.styles + ", transitionError=" + this.transitionError + ", startPage=" + this.startPage + ", isSubmitting=" + this.isSubmitting + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.stepName);
            dest.writeString(this.type);
            dest.writeString(this.flowUrl);
            dest.writeString(this.redirectPath);
            dest.writeString(this.integrationStepBrowserType.name());
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.transitionError, flags);
            IntegrationPage integrationPage = this.startPage;
            if (integrationPage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                integrationPage.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isSubmitting ? 1 : 0);
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "Landroid/os/Parcelable;", "OpenBrowser", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface PendingAction extends Parcelable {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class OpenBrowser implements PendingAction {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final OpenBrowser f14340a = new OpenBrowser();

            @NotNull
            public static final Parcelable.Creator<OpenBrowser> CREATOR = new C3608a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction$OpenBrowser$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3608a implements Parcelable.Creator<OpenBrowser> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OpenBrowser createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenBrowser.f14340a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OpenBrowser[] newArray(int i10) {
                    return new OpenBrowser[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof OpenBrowser);
            }

            public int hashCode() {
                return 2035883520;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "<init>", "()V", "Starting", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class State extends SimpleWorkflowState {

        @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "pendingAction", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "u", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "v", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Starting extends State {

            @NotNull
            public static final Parcelable.Creator<Starting> CREATOR = new C3609a();

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @Nullable
            public final PendingAction pendingAction;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3609a implements Parcelable.Creator<Starting> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Starting createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Starting((PendingAction) parcel.readParcelable(Starting.class.getClassLoader()));
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Starting[] newArray(int i10) {
                    return new Starting[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public Starting() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Starting) && Intrinsics.m31980c(this.pendingAction, ((Starting) other).pendingAction);
            }

            public int hashCode() {
                PendingAction pendingAction = this.pendingAction;
                if (pendingAction == null) {
                    return 0;
                }
                return pendingAction.hashCode();
            }

            @NotNull
            public String toString() {
                return "Starting(pendingAction=" + this.pendingAction + ")";
            }

            @NotNull
            /* JADX INFO: renamed from: u */
            public final Starting m17993u(@Nullable PendingAction pendingAction) {
                return new Starting(pendingAction);
            }

            @Nullable
            /* JADX INFO: renamed from: v, reason: from getter */
            public final PendingAction getPendingAction() {
                return this.pendingAction;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.pendingAction, flags);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Starting(@Nullable PendingAction pendingAction) {
                super(null);
                this.pendingAction = pendingAction;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
              (wrap com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction) : (r1v0 com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction))
             A[MD:(com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting.<init>(com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction):void type: THIS */
            public /* synthetic */ Starting(PendingAction pendingAction, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : pendingAction);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public State() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3610a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$a$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements InterfaceC3610a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f14342a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 224778200;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$a$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b implements InterfaceC3610a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f14343a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1292437803;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$a$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c implements InterfaceC3610a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f14344a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1979122029;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "", "c", "d", "a", "b", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3611b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements InterfaceC3611b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f14345a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1494152841;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b implements InterfaceC3611b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f14346a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1332850934;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c implements InterfaceC3611b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f14347a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 929193848;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b$d */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class d implements InterfaceC3611b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final d f14348a = new d();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1519977214;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }
    }

    public IntegrationWorkflow(@NotNull Context applicationContext, @NotNull C11930a navigationStateManager, @NotNull C3612a.a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m17960A(IntegrationWorkflow integrationWorkflow, AbstractC13218k.a aVar) {
        integrationWorkflow.m17980v(aVar, InterfaceC3610a.a.f14342a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m17961B(IntegrationWorkflow integrationWorkflow, AbstractC13218k.a aVar) {
        integrationWorkflow.m17980v(aVar, InterfaceC3610a.b.f14343a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m17970q(IntegrationWorkflow integrationWorkflow, AbstractC13218k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        integrationWorkflow.m17980v(aVar, InterfaceC3610a.c.f14344a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC13225r m17971s(IntegrationWorkflow integrationWorkflow, Input input, BrowserSelection browserSelection, final State.Starting starting, C3612a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof C3612a.b.a)) {
            throw new C7345l();
        }
        TrackingEventsLogger.logIntegrationEvent$default(integrationWorkflow.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        return C13233z.m48946d(integrationWorkflow, null, new Function1() { // from class: xo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationWorkflow.m17972t(starting, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m17972t(State.Starting starting, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(starting.m17993u(null));
        action.m48902d(InterfaceC3611b.d.f14348a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m17973w(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(InterfaceC3611b.a.f14345a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m17974x(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(InterfaceC3611b.b.f14346a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m17975y(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        Intrinsics.m31981d(objM48901c, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting");
        action.m48903e(((State.Starting) objM48901c).m17993u(PendingAction.OpenBrowser.f14340a));
        return Unit.f29331a;
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C0388q.m1447a(state);
    }

    /* JADX INFO: renamed from: p */
    public final List<Pair<String, Function1<UiComponent, Unit>>> m17977p(IntegrationPage integrationPage, final AbstractC13218k<? super Input, State, ? extends InterfaceC3611b, ? extends Object>.a aVar) {
        return new NestedUiStep.C4025a().m20520a(integrationPage.getOpenBrowserButton(), new Function1() { // from class: xo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationWorkflow.m17970q(this.f45742a, aVar, (UiComponent) obj);
            }
        }).m20521b();
    }

    /* JADX INFO: renamed from: r */
    public final void m17978r(final Input renderProps, final State.Starting renderState, AbstractC13218k<? super Input, State, ? extends InterfaceC3611b, ? extends Object>.a context) {
        PendingAction pendingAction = renderState.getPendingAction();
        if (!(pendingAction instanceof PendingAction.OpenBrowser)) {
            if (pendingAction != null) {
                throw new C7345l();
            }
            return;
        }
        final BrowserSelection browserSelectionM47907c = C12873e.f45728a.m47907c(this.applicationContext);
        TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(browserSelectionM47907c.getSupportsAuthTab()), null, 8, null), false, 2, null);
        C13230w.m48937l(context, this.integrationBrowserWorkerFactory.mo18005a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), browserSelectionM47907c, renderProps.getIntegrationStepBrowserType()), C7731d0.m32011k(C3612a.class), "", new Function1() { // from class: xo.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationWorkflow.m17971s(this.f45738a, renderProps, browserSelectionM47907c, renderState, (C3612a.b) obj);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public State mo16430d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            C12930h c12930hM48870b = snapshot.m48870b();
            Parcelable parcelable = null;
            if (c12930hM48870b.m48089I() <= 0) {
                c12930hM48870b = null;
            }
            if (c12930hM48870b != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrMo48094O = c12930hM48870b.mo48094O();
                parcelObtain.unmarshall(bArrMo48094O, 0, bArrMo48094O.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            State state = (State) parcelable;
            if (state != null) {
                return state;
            }
        }
        return new State.Starting(PendingAction.OpenBrowser.f14340a);
    }

    /* JADX INFO: renamed from: v */
    public final void m17980v(AbstractC13218k<? super Input, State, ? extends InterfaceC3611b, ? extends Object>.a aVar, InterfaceC3610a interfaceC3610a) {
        if (interfaceC3610a instanceof InterfaceC3610a.a) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: xo.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntegrationWorkflow.m17973w((AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else if (interfaceC3610a instanceof InterfaceC3610a.b) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: xo.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntegrationWorkflow.m17974x((AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(interfaceC3610a instanceof InterfaceC3610a.c)) {
                throw new C7345l();
            }
            aVar.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: xo.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntegrationWorkflow.m17975y((AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull Input renderProps, @NotNull State renderState, @NotNull final AbstractC13218k<? super Input, State, ? extends InterfaceC3611b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(renderState instanceof State.Starting)) {
            throw new C7345l();
        }
        State.Starting starting = (State.Starting) renderState;
        m17978r(renderProps, starting, context);
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        IntegrationPage startPage = renderProps.getStartPage();
        Intrinsics.checkNotNull(startPage);
        IntegrationView integrationView = new IntegrationView(C1147b.m6492a(startPage), this.navigationStateManager.m44528b(), new Function0() { // from class: xo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationWorkflow.m17960A(this.f45734a, context);
            }
        }, new Function0() { // from class: xo.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationWorkflow.m17961B(this.f45736a, context);
            }
        }, m17977p(renderProps.getStartPage(), context), starting.getPendingAction() != null || renderProps.getIsSubmitting());
        C3858g.m19165c(integrationView);
        return integrationView;
    }
}
