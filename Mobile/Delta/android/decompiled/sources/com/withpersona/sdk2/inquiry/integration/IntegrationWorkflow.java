package com.withpersona.sdk2.inquiry.integration;

import an.q;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.g;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import java.util.List;
import jt.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xo.BrowserSelection;
import xo.e;
import xu.h;
import ym.Snapshot;
import ym.k;
import ym.r;
import ym.w;
import ym.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005678.0B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020 *\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010$\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020#2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%JU\u0010,\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 0*0(0'*\u00020&2\"\u0010\u001b\u001a\u001e0\u001aR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Luq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "props", "Lym/i;", "snapshot", "u", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "state", "C", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)Lym/i;", "renderProps", "renderState", "Lym/k$a;", "context", "z", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;Lym/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "event", "", "v", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "r", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;Lym/k$a;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "p", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Lym/k$a;)Ljava/util/List;", "a", "Landroid/content/Context;", "b", "Luq/a;", "c", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Input", "State", "PendingAction", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntegrationWorkflow extends k<Input, State, b, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a integrationBrowserWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b4\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b?\u0010IR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bG\u0010;¨\u0006K"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Landroid/os/Parcelable;", "", "inquiryId", "sessionToken", "stepName", Payload.TYPE, "flowUrl", "redirectPath", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "startPage", "isSubmitting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;ZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInquiryId", "b", "getSessionToken", "c", "getStepName", "d", "getType", "e", "g", "f", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "h", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "getInquirySessionConfig", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "l", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "m", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "n", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String flowUrl;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String redirectPath;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.IntegrationStepStyle styles;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final IntegrationPage startPage;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isSubmitting;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
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
            return Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.stepName, input.stepName) && Intrinsics.c(this.type, input.type) && Intrinsics.c(this.flowUrl, input.flowUrl) && Intrinsics.c(this.redirectPath, input.redirectPath) && this.integrationStepBrowserType == input.integrationStepBrowserType && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.transitionError, input.transitionError) && Intrinsics.c(this.startPage, input.startPage) && this.isSubmitting == input.isSubmitting;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "Landroid/os/Parcelable;", "OpenBrowser", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PendingAction extends Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction$OpenBrowser;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBrowser implements PendingAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final OpenBrowser f11122a = new OpenBrowser();

            @NotNull
            public static final Parcelable.Creator<OpenBrowser> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<OpenBrowser> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OpenBrowser createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenBrowser.f11122a;
                }

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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "<init>", "()V", "Starting", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class State extends SimpleWorkflowState {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "pendingAction", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "u", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "v", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Starting extends State {

            @NotNull
            public static final Parcelable.Creator<Starting> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final PendingAction pendingAction;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Starting> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Starting createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Starting((PendingAction) parcel.readParcelable(Starting.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Starting[] newArray(int i10) {
                    return new Starting[i10];
                }
            }

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
                return (other instanceof Starting) && Intrinsics.c(this.pendingAction, ((Starting) other).pendingAction);
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
            public final Starting u(@Nullable PendingAction pendingAction) {
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

            public Starting(@Nullable PendingAction pendingAction) {
                super(null);
                this.pendingAction = pendingAction;
            }

            public /* synthetic */ Starting(PendingAction pendingAction, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : pendingAction);
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public State() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0202a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0202a f11124a = new C0202a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0202a);
            }

            public int hashCode() {
                return 224778200;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f11125a = new b();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f11126a = new c();

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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "", "c", "d", "a", "b", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f11127a = new a();

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0203b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0203b f11128a = new C0203b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0203b);
            }

            public int hashCode() {
                return -1332850934;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f11129a = new c();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f11130a = new d();

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

    public IntegrationWorkflow(@NotNull Context applicationContext, @NotNull uq.a navigationStateManager, @NotNull com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit A(IntegrationWorkflow integrationWorkflow, k.a aVar) {
        integrationWorkflow.v(aVar, a.C0202a.f11124a);
        return Unit.f22483a;
    }

    public static final Unit B(IntegrationWorkflow integrationWorkflow, k.a aVar) {
        integrationWorkflow.v(aVar, a.b.f11125a);
        return Unit.f22483a;
    }

    public static final Unit q(IntegrationWorkflow integrationWorkflow, k.a aVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        integrationWorkflow.v(aVar, a.c.f11126a);
        return Unit.f22483a;
    }

    public static final r s(IntegrationWorkflow integrationWorkflow, Input input, BrowserSelection browserSelection, final State.Starting starting, com.withpersona.sdk2.inquiry.integration.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.withpersona.sdk2.inquiry.integration.a.b.C0205a)) {
            throw new l();
        }
        TrackingEventsLogger.logIntegrationEvent$default(integrationWorkflow.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        return z.d(integrationWorkflow, null, new Function1() { // from class: xo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationWorkflow.t(starting, (r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit t(State.Starting starting, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(starting.u(null));
        action.d(b.d.f11130a);
        return Unit.f22483a;
    }

    public static final Unit w(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.a.f11127a);
        return Unit.f22483a;
    }

    public static final Unit x(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(b.C0203b.f11128a);
        return Unit.f22483a;
    }

    public static final Unit y(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        Intrinsics.d(objC, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting");
        action.e(((State.Starting) objC).u(PendingAction.OpenBrowser.f11122a));
        return Unit.f22483a;
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> p(IntegrationPage integrationPage, final k<? super Input, State, ? extends b, ? extends Object>.a aVar) {
        return new NestedUiStep.a().a(integrationPage.getOpenBrowserButton(), new Function1() { // from class: xo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationWorkflow.q(this.f35276a, aVar, (UiComponent) obj);
            }
        }).b();
    }

    public final void r(final Input renderProps, final State.Starting renderState, k<? super Input, State, ? extends b, ? extends Object>.a context) {
        PendingAction pendingAction = renderState.getPendingAction();
        if (!(pendingAction instanceof PendingAction.OpenBrowser)) {
            if (pendingAction != null) {
                throw new l();
            }
            return;
        }
        final BrowserSelection browserSelectionC = e.f35267a.c(this.applicationContext);
        TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(browserSelectionC.getSupportsAuthTab()), null, 8, null), false, 2, null);
        w.l(context, this.integrationBrowserWorkerFactory.a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), browserSelectionC, renderProps.getIntegrationStepBrowserType()), d0.k(com.withpersona.sdk2.inquiry.integration.a.class), "", new Function1() { // from class: xo.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationWorkflow.s(this.f35273a, renderProps, browserSelectionC, renderState, (com.withpersona.sdk2.inquiry.integration.a.b) obj);
            }
        });
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public State d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.I() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrO = hVarB.O();
                parcelObtain.unmarshall(bArrO, 0, bArrO.length);
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
        return new State.Starting(PendingAction.OpenBrowser.f11122a);
    }

    public final void v(k<? super Input, State, ? extends b, ? extends Object>.a aVar, a aVar2) {
        if (aVar2 instanceof a.C0202a) {
            aVar.d().a(z.d(this, null, new Function1() { // from class: xo.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntegrationWorkflow.w((r.c) obj);
                }
            }, 1, null));
        } else if (aVar2 instanceof a.b) {
            aVar.d().a(z.d(this, null, new Function1() { // from class: xo.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntegrationWorkflow.x((r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new l();
            }
            aVar.d().a(z.d(this, null, new Function1() { // from class: xo.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntegrationWorkflow.y((r.c) obj);
                }
            }, 1, null));
        }
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull State renderState, @NotNull final k<? super Input, State, ? extends b, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(renderState instanceof State.Starting)) {
            throw new l();
        }
        State.Starting starting = (State.Starting) renderState;
        r(renderProps, starting, context);
        uq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        IntegrationPage startPage = renderProps.getStartPage();
        Intrinsics.checkNotNull(startPage);
        IntegrationView integrationView = new IntegrationView(ar.b.a(startPage), this.navigationStateManager.b(), new Function0() { // from class: xo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationWorkflow.A(this.f35271a, context);
            }
        }, new Function0() { // from class: xo.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationWorkflow.B(this.f35272a, context);
            }
        }, p(renderProps.getStartPage(), context), starting.getPendingAction() != null || renderProps.getIsSubmitting());
        g.c(integrationView);
        return integrationView;
    }
}
