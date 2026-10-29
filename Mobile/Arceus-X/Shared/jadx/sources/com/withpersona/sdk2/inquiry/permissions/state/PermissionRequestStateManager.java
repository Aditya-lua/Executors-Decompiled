package com.withpersona.sdk2.inquiry.permissions.state;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.C3852a;
import com.withpersona.sdk2.inquiry.permissions.C3855d;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.C4012a;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p419rp.C11020h;
import p419rp.C11040n1;
import p419rp.CheckRequestPermissionRationaleStateView;
import p419rp.EnumC11028j1;
import p497vp.C12244g;
import p499vr.AbstractC12252c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004./01BG\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "permissionRequestDialogWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "deviceFeatureRequestWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lku/p0;)V", "props", "x", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "renderProps", "renderState", "", "y", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "output", "v", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "J", "()V", "w", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "h", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "c", "d", "PermissionRequestState", "DeviceFeatureRequestState", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PermissionRequestStateManager extends AbstractC12252c<PermissionRequestWorkflow.Props, PermissionRequestState, PermissionRequestWorkflow.Output, InterfaceC3892d> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C3855d.a permissionRequestDialogWorkerFactory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C3852a.a deviceFeatureRequestWorkerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "CheckDeviceFeatureState", "ShowDeviceFeaturePrompt", "RequestDeviceFeature", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class DeviceFeatureRequestState extends PermissionRequestState {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckDeviceFeatureState extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckDeviceFeatureState f15910a = new CheckDeviceFeatureState();

            @NotNull
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new C3878a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3878a implements Parcelable.Creator<CheckDeviceFeatureState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckDeviceFeatureState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckDeviceFeatureState.f15910a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckDeviceFeatureState[] newArray(int i10) {
                    return new CheckDeviceFeatureState[i10];
                }
            }

            public CheckDeviceFeatureState() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckDeviceFeatureState);
            }

            public int hashCode() {
                return -200408212;
            }

            @NotNull
            public String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RequestDeviceFeature extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final RequestDeviceFeature f15911a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new C3879a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3879a implements Parcelable.Creator<RequestDeviceFeature> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f15911a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature[] newArray(int i10) {
                    return new RequestDeviceFeature[i10];
                }
            }

            public RequestDeviceFeature() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestDeviceFeature);
            }

            public int hashCode() {
                return 1651676862;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final ShowDeviceFeaturePrompt f15912a = new ShowDeviceFeaturePrompt();

            @NotNull
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new C3880a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3880a implements Parcelable.Creator<ShowDeviceFeaturePrompt> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowDeviceFeaturePrompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowDeviceFeaturePrompt.f15912a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowDeviceFeaturePrompt[] newArray(int i10) {
                    return new ShowDeviceFeaturePrompt[i10];
                }
            }

            public ShowDeviceFeaturePrompt() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowDeviceFeaturePrompt);
            }

            public int hashCode() {
                return 610825882;
            }

            @NotNull
            public String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager.DeviceFeatureRequestState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ DeviceFeatureRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public DeviceFeatureRequestState() {
            super(null);
        }
    }

    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "<init>", "()V", "CheckPermissionState", "CheckPermissionRationaleState", "ShowRequestPermissionRationale", "RequestPermission", "RequestDeviceFeature", "CheckPermissionPermanentlyDenied", "ShowPermissionPermanentlyDeniedMessage", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class PermissionRequestState extends SimpleWorkflowState {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckPermissionPermanentlyDenied extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckPermissionPermanentlyDenied f15913a = new CheckPermissionPermanentlyDenied();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new C3881a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3881a implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.f15913a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied[] newArray(int i10) {
                    return new CheckPermissionPermanentlyDenied[i10];
                }
            }

            public CheckPermissionPermanentlyDenied() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionPermanentlyDenied);
            }

            public int hashCode() {
                return -1216770821;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckPermissionRationaleState extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckPermissionRationaleState f15914a = new CheckPermissionRationaleState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new C3882a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3882a implements Parcelable.Creator<CheckPermissionRationaleState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.f15914a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState[] newArray(int i10) {
                    return new CheckPermissionRationaleState[i10];
                }
            }

            public CheckPermissionRationaleState() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionRationaleState);
            }

            public int hashCode() {
                return 1021319477;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckPermissionState extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckPermissionState f15915a = new CheckPermissionState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new C3883a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$CheckPermissionState$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3883a implements Parcelable.Creator<CheckPermissionState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.f15915a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState[] newArray(int i10) {
                    return new CheckPermissionState[i10];
                }
            }

            public CheckPermissionState() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionState);
            }

            public int hashCode() {
                return 1373860566;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Complete extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Complete f15916a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new C3884a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$Complete$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3884a implements Parcelable.Creator<Complete> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f15916a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Complete[] newArray(int i10) {
                    return new Complete[i10];
                }
            }

            public Complete() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return -1573796811;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RequestDeviceFeature extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final RequestDeviceFeature f15917a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new C3885a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3885a implements Parcelable.Creator<RequestDeviceFeature> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f15917a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature[] newArray(int i10) {
                    return new RequestDeviceFeature[i10];
                }
            }

            public RequestDeviceFeature() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestDeviceFeature);
            }

            public int hashCode() {
                return 438328941;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RequestPermission extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final RequestPermission f15918a = new RequestPermission();

            @NotNull
            public static final Parcelable.Creator<RequestPermission> CREATOR = new C3886a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$RequestPermission$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3886a implements Parcelable.Creator<RequestPermission> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.f15918a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestPermission[] newArray(int i10) {
                    return new RequestPermission[i10];
                }
            }

            public RequestPermission() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestPermission);
            }

            public int hashCode() {
                return -1427966398;
            }

            @NotNull
            public String toString() {
                return "RequestPermission";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ShowPermissionPermanentlyDeniedMessage extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final ShowPermissionPermanentlyDeniedMessage f15919a = new ShowPermissionPermanentlyDeniedMessage();

            @NotNull
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new C3887a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3887a implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.f15919a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage[] newArray(int i10) {
                    return new ShowPermissionPermanentlyDeniedMessage[i10];
                }
            }

            public ShowPermissionPermanentlyDeniedMessage() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public int hashCode() {
                return 333834169;
            }

            @NotNull
            public String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ShowRequestPermissionRationale extends PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final ShowRequestPermissionRationale f15920a = new ShowRequestPermissionRationale();

            @NotNull
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new C3888a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3888a implements Parcelable.Creator<ShowRequestPermissionRationale> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.f15920a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale[] newArray(int i10) {
                    return new ShowRequestPermissionRationale[i10];
                }
            }

            public ShowRequestPermissionRationale() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowRequestPermissionRationale);
            }

            public int hashCode() {
                return -738457678;
            }

            @NotNull
            public String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager.PermissionRequestState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ PermissionRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public PermissionRequestState() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$1$1", m39664f = "PermissionRequestStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3889a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15921t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PermissionRequestState f15923v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3889a(PermissionRequestState permissionRequestState, InterfaceC9557b<? super C3889a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15923v = permissionRequestState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return PermissionRequestStateManager.this.new C3889a(this.f15923v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15921t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            PermissionRequestStateManager permissionRequestStateManager = PermissionRequestStateManager.this;
            permissionRequestStateManager.m19240y(permissionRequestStateManager.m45395b().getValue(), this.f15923v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3889a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$2", m39664f = "PermissionRequestStateManager.kt", m39665l = {80}, m39666m = "invokeSuspend")
    public static final class C3890b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15924t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PermissionRequestStateManager f15926a;

            public a(PermissionRequestStateManager permissionRequestStateManager) {
                this.f15926a = permissionRequestStateManager;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PermissionRequestWorkflow.Props props, InterfaceC9557b<? super Unit> interfaceC9557b) {
                PermissionRequestStateManager permissionRequestStateManager = this.f15926a;
                PermissionRequestState permissionRequestState = (PermissionRequestState) permissionRequestStateManager.m45397d().m45411i();
                if (permissionRequestState == null) {
                    return Unit.f29331a;
                }
                permissionRequestStateManager.m19240y(props, permissionRequestState);
                return Unit.f29331a;
            }
        }

        public C3890b(InterfaceC9557b<? super C3890b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return PermissionRequestStateManager.this.new C3890b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15924t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<PermissionRequestWorkflow.Props> interfaceC9566c0M45395b = PermissionRequestStateManager.this.m45395b();
                a aVar = new a(PermissionRequestStateManager.this);
                this.f15924t = 1;
                if (interfaceC9566c0M45395b.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3890b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$c */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3891c {
        @NotNull
        /* JADX INFO: renamed from: a */
        PermissionRequestStateManager mo19264a(@NotNull PermissionRequestWorkflow.Props initialProps, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$d */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "", "a", "b", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3892d {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$d$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "Lrp/h;", "view", "<init>", "(Lrp/h;)V", "a", "Lrp/h;", "()Lrp/h;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements InterfaceC3892d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final C11020h view;

            public a(@NotNull C11020h view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final C11020h getView() {
                return this.view;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$d$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "Lrp/i;", "view", "<init>", "(Lrp/i;)V", "a", "Lrp/i;", "()Lrp/i;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC3892d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final CheckRequestPermissionRationaleStateView view;

            public b(@NotNull CheckRequestPermissionRationaleStateView view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final CheckRequestPermissionRationaleStateView getView() {
                return this.view;
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$10", m39664f = "PermissionRequestStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3893e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15929t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PermissionRequestWorkflow.Props f15931v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3893e(PermissionRequestWorkflow.Props props, InterfaceC9557b<? super C3893e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f15931v = props;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return PermissionRequestStateManager.this.new C3893e(this.f15931v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15929t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (C4012a.m20431b(PermissionRequestStateManager.this.applicationContext)) {
                PermissionRequestStateManager.this.m19237v(new PermissionState(this.f15931v.getPermission(), EnumC11028j1.PermissionGranted));
            } else {
                PermissionRequestStateManager.this.m45397d().m45417p(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f15912a);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3893e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$f */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$1", m39664f = "PermissionRequestStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3894f extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15932t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PermissionRequestWorkflow.Props f15934v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3894f(PermissionRequestWorkflow.Props props, InterfaceC9557b<? super C3894f> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f15934v = props;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return PermissionRequestStateManager.this.new C3894f(this.f15934v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15932t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (C3858g.m19164b(PermissionRequestStateManager.this.applicationContext, this.f15934v.getPermission())) {
                PermissionRequestStateManager.this.m45397d().m45417p(PermissionRequestState.RequestDeviceFeature.f15917a);
            } else {
                PermissionRequestStateManager.this.m45397d().m45417p(PermissionRequestState.CheckPermissionRationaleState.f15914a);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3894f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$g */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$6", m39664f = "PermissionRequestStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3895g extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15935t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PermissionRequestWorkflow.Props f15937v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3895g(PermissionRequestWorkflow.Props props, InterfaceC9557b<? super C3895g> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f15937v = props;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return PermissionRequestStateManager.this.new C3895g(this.f15937v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15935t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            PermissionRequestStateManager.this.m19237v(new PermissionState(this.f15937v.getPermission(), EnumC11028j1.PermissionGranted));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3895g) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestStateManager(@NotNull PermissionRequestWorkflow.Props initialProps, @NotNull C0967l0 savedStateHandle, @NotNull Context applicationContext, @NotNull C3855d.a permissionRequestDialogWorkerFactory, @NotNull C3852a.a deviceFeatureRequestWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull final InterfaceC7906p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestDialogWorkerFactory, "permissionRequestDialogWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.permissionRequestDialogWorkerFactory = permissionRequestDialogWorkerFactory;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        if (m45397d().m45411i() == null) {
            m45397d().m45417p(m19239x(m45395b().getValue()));
        }
        m45397d().m45416o(new Function1() { // from class: up.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestStateManager.m19231r(coroutineScope, this, (PermissionRequestStateManager.PermissionRequestState) obj);
            }
        });
        C7882k.m32780d(coroutineScope, C7864g1.m32646d(), null, new C3890b(null), 2, null);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m19211A(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, C3852a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3852a.b.c) {
            permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionGranted));
        } else if (it instanceof C3852a.b.a) {
            permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        } else {
            if (!(it instanceof C3852a.b.C14135b)) {
                throw new C7345l();
            }
            permissionRequestStateManager.m19238w();
            permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.SettingsLaunched));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m19212B(PermissionRequestStateManager permissionRequestStateManager) {
        permissionRequestStateManager.m45397d().m45417p(PermissionRequestState.RequestPermission.f15918a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m19213C(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m19214D(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, C3855d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C3855d.b.C14137b.f15842a)) {
            permissionRequestStateManager.m45397d().m45417p(PermissionRequestState.RequestDeviceFeature.f15917a);
        } else {
            if (!Intrinsics.m31980c(it, C3855d.b.a.f15841a)) {
                throw new C7345l();
            }
            if (props.getOptional()) {
                permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
            } else {
                permissionRequestStateManager.m45397d().m45417p(PermissionRequestState.CheckPermissionPermanentlyDenied.f15913a);
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m19215E(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, boolean z10) {
        if (z10) {
            permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        } else {
            permissionRequestStateManager.m45397d().m45417p(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f15919a);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m19216F(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.m19236J();
        permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.SettingsLaunched));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m19217G(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m19218H(PermissionRequestStateManager permissionRequestStateManager) {
        permissionRequestStateManager.m45397d().m45417p(DeviceFeatureRequestState.RequestDeviceFeature.f15911a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m19219I(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.m19237v(new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m19231r(InterfaceC7906p0 interfaceC7906p0, PermissionRequestStateManager permissionRequestStateManager, PermissionRequestState permissionRequestState) {
        if (permissionRequestState == null) {
            return Unit.f29331a;
        }
        C7882k.m32780d(interfaceC7906p0, C7864g1.m32646d(), null, permissionRequestStateManager.new C3889a(permissionRequestState, null), 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m19235z(PermissionRequestStateManager permissionRequestStateManager, boolean z10) {
        if (z10) {
            permissionRequestStateManager.m45397d().m45417p(PermissionRequestState.ShowRequestPermissionRationale.f15920a);
        } else {
            permissionRequestStateManager.m45397d().m45417p(PermissionRequestState.RequestPermission.f15918a);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J */
    public final void m19236J() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    /* JADX INFO: renamed from: v */
    public final void m19237v(PermissionState output) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(C11040n1.m41737c(output.getPermission()), C11040n1.m41736b(output.getResult()), null, 4, null), false, 2, null);
        m45398e(new PermissionRequestWorkflow.Output(output));
    }

    /* JADX INFO: renamed from: w */
    public final void m19238w() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final PermissionRequestState m19239x(@NotNull PermissionRequestWorkflow.Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return PermissionRequestState.CheckPermissionState.f15915a;
    }

    /* JADX INFO: renamed from: y */
    public final void m19240y(final PermissionRequestWorkflow.Props renderProps, PermissionRequestState renderState) {
        if (Intrinsics.m31980c(renderState, PermissionRequestState.CheckPermissionState.f15915a)) {
            m45397d().m45414m("check_permission_state", new C3894f(renderProps, null));
            return;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.CheckPermissionRationaleState.f15914a)) {
            m45396c().setValue(new InterfaceC3892d.b(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: up.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestStateManager.m19235z(this.f42308a, ((Boolean) obj).booleanValue());
                }
            })));
            return;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.ShowRequestPermissionRationale.f15920a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(C11040n1.m41737c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            InterfaceC9566c0<InterfaceC3892d> interfaceC9566c0M45396c = m45396c();
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(C12244g.f43219D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: up.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.m19212B(this.f42309a);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(C12244g.f43218C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            interfaceC9566c0M45396c.setValue(new InterfaceC3892d.a(new C11020h(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: up.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.m19213C(this.f42310a, renderProps);
                }
            })));
            return;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.RequestPermission.f15918a)) {
            m45397d().m45415n(this.permissionRequestDialogWorkerFactory.m19154a(renderProps.getPermission()), new Function1() { // from class: up.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestStateManager.m19214D(this.f42312a, renderProps, (C3855d.b) obj);
                }
            });
            return;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.RequestDeviceFeature.f15917a)) {
            if (renderProps.m19127q()) {
                m45397d().m45417p(DeviceFeatureRequestState.CheckDeviceFeatureState.f15910a);
                return;
            } else {
                m45397d().m45414m("request_device_feature", new C3895g(renderProps, null));
                return;
            }
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.f15913a)) {
            m45396c().setValue(new InterfaceC3892d.b(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: up.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestStateManager.m19215E(this.f42314a, renderProps, ((Boolean) obj).booleanValue());
                }
            })));
            return;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f15919a)) {
            InterfaceC9566c0<InterfaceC3892d> interfaceC9566c0M45396c2 = m45396c();
            String title2 = renderProps.getTitle();
            String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
            String positiveButtonText2 = renderProps.getPositiveButtonText();
            if (positiveButtonText2 == null) {
                positiveButtonText2 = this.applicationContext.getString(C12244g.f43220E);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
            }
            String str2 = positiveButtonText2;
            StepStyle styles2 = renderProps.getStyles();
            Function0 function1 = new Function0() { // from class: up.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.m19216F(this.f42316a, renderProps);
                }
            };
            String negativeButtonText2 = renderProps.getNegativeButtonText();
            if (negativeButtonText2 == null) {
                negativeButtonText2 = this.applicationContext.getString(C12244g.f43218C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
            }
            interfaceC9566c0M45396c2.setValue(new InterfaceC3892d.a(new C11020h(title2, rationaleWhenPermanentlyDenied, str2, styles2, function1, negativeButtonText2, new Function0() { // from class: up.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.m19217G(this.f42318a, renderProps);
                }
            })));
            return;
        }
        if (Intrinsics.m31980c(renderState, DeviceFeatureRequestState.CheckDeviceFeatureState.f15910a)) {
            m45397d().m45414m("check_device_feature_state", new C3893e(renderProps, null));
            return;
        }
        if (!Intrinsics.m31980c(renderState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f15912a)) {
            if (Intrinsics.m31980c(renderState, DeviceFeatureRequestState.RequestDeviceFeature.f15911a)) {
                m45397d().m45415n(this.deviceFeatureRequestWorkerFactory.mo19142a(), new Function1() { // from class: up.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PermissionRequestStateManager.m19211A(this.f42306a, renderProps, (C3852a.b) obj);
                    }
                });
                return;
            } else {
                if (!Intrinsics.m31980c(renderState, PermissionRequestState.Complete.f15916a)) {
                    throw new C7345l();
                }
                return;
            }
        }
        InterfaceC9566c0<InterfaceC3892d> interfaceC9566c0M45396c3 = m45396c();
        String gpsFeatureTitle = renderProps.getGpsFeatureTitle();
        if (gpsFeatureTitle == null) {
            gpsFeatureTitle = "Couldn't access location feature";
        }
        String gpsFeatureRationale = renderProps.getGpsFeatureRationale();
        if (gpsFeatureRationale == null) {
            gpsFeatureRationale = "Location is turned off, please allow access to your device's location feature";
        }
        String positiveButtonText3 = renderProps.getPositiveButtonText();
        if (positiveButtonText3 == null) {
            positiveButtonText3 = "Allow";
        }
        StepStyle styles3 = renderProps.getStyles();
        Function0 function2 = new Function0() { // from class: up.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestStateManager.m19218H(this.f42320a);
            }
        };
        String gpsFeatureModalNegativeButton = renderProps.getGpsFeatureModalNegativeButton();
        if (gpsFeatureModalNegativeButton == null) {
            gpsFeatureModalNegativeButton = "Cancel";
        }
        interfaceC9566c0M45396c3.setValue(new InterfaceC3892d.a(new C11020h(gpsFeatureTitle, gpsFeatureRationale, positiveButtonText3, styles3, function2, gpsFeatureModalNegativeButton, new Function0() { // from class: up.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestStateManager.m19219I(this.f42321a, renderProps);
            }
        })));
    }
}
