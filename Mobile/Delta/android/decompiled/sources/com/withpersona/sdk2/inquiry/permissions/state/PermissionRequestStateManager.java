package com.withpersona.sdk2.inquiry.permissions.state;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import gt.l;
import gt.o;
import iu.g1;
import iu.k;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lu.c0;
import lu.i;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.CheckRequestPermissionRationaleStateView;
import pp.h;
import pp.j1;
import pp.n1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004./01BG\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "permissionRequestDialogWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "deviceFeatureRequestWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Liu/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Liu/p0;)V", "props", "x", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "renderProps", "renderState", "", "y", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;)V", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "output", "v", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "J", "()V", "w", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "h", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "c", "d", "PermissionRequestState", "DeviceFeatureRequestState", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionRequestStateManager extends tr.c<PermissionRequestWorkflow.Props, PermissionRequestState, PermissionRequestWorkflow.Output, d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.d.a permissionRequestDialogWorkerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a deviceFeatureRequestWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "CheckDeviceFeatureState", "ShowDeviceFeaturePrompt", "RequestDeviceFeature", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class DeviceFeatureRequestState extends PermissionRequestState {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckDeviceFeatureState extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckDeviceFeatureState f12453a = new CheckDeviceFeatureState();

            @NotNull
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckDeviceFeatureState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckDeviceFeatureState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckDeviceFeatureState.f12453a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestDeviceFeature extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestDeviceFeature f12454a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestDeviceFeature> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f12454a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowDeviceFeaturePrompt f12455a = new ShowDeviceFeaturePrompt();

            @NotNull
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowDeviceFeaturePrompt> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowDeviceFeaturePrompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowDeviceFeaturePrompt.f12455a;
                }

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

        public /* synthetic */ DeviceFeatureRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public DeviceFeatureRequestState() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "<init>", "()V", "CheckPermissionState", "CheckPermissionRationaleState", "ShowRequestPermissionRationale", "RequestPermission", "RequestDeviceFeature", "CheckPermissionPermanentlyDenied", "ShowPermissionPermanentlyDeniedMessage", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class PermissionRequestState extends SimpleWorkflowState {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionPermanentlyDenied extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionPermanentlyDenied f12456a = new CheckPermissionPermanentlyDenied();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.f12456a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionRationaleState extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionRationaleState f12457a = new CheckPermissionRationaleState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionRationaleState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.f12457a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionState extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionState f12458a = new CheckPermissionState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.f12458a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Complete extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Complete f12459a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f12459a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestDeviceFeature extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestDeviceFeature f12460a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestDeviceFeature> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f12460a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestPermission extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestPermission f12461a = new RequestPermission();

            @NotNull
            public static final Parcelable.Creator<RequestPermission> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestPermission> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.f12461a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPermissionPermanentlyDeniedMessage extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowPermissionPermanentlyDeniedMessage f12462a = new ShowPermissionPermanentlyDeniedMessage();

            @NotNull
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.f12462a;
                }

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowRequestPermissionRationale extends PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowRequestPermissionRationale f12463a = new ShowRequestPermissionRationale();

            @NotNull
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowRequestPermissionRationale> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.f12463a;
                }

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

        public /* synthetic */ PermissionRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public PermissionRequestState() {
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$1$1", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12464t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestState f12466v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequestState permissionRequestState, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f12466v = permissionRequestState;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return PermissionRequestStateManager.this.new a(this.f12466v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f12464t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            PermissionRequestStateManager permissionRequestStateManager = PermissionRequestStateManager.this;
            permissionRequestStateManager.y(permissionRequestStateManager.b().getValue(), this.f12466v);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$2", f = "PermissionRequestStateManager.kt", l = {80}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12467t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ PermissionRequestStateManager f12469a;

            public a(PermissionRequestStateManager permissionRequestStateManager) {
                this.f12469a = permissionRequestStateManager;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PermissionRequestWorkflow.Props props, lt.b<? super Unit> bVar) {
                PermissionRequestStateManager permissionRequestStateManager = this.f12469a;
                PermissionRequestState permissionRequestState = (PermissionRequestState) permissionRequestStateManager.d().i();
                if (permissionRequestState == null) {
                    return Unit.f22938a;
                }
                permissionRequestStateManager.y(props, permissionRequestState);
                return Unit.f22938a;
            }
        }

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return PermissionRequestStateManager.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12467t;
            if (i10 == 0) {
                o.b(obj);
                c0<PermissionRequestWorkflow.Props> c0VarB = PermissionRequestStateManager.this.b();
                a aVar = new a(PermissionRequestStateManager.this);
                this.f12467t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        PermissionRequestStateManager a(@NotNull PermissionRequestWorkflow.Props initialProps, @NotNull l0 savedStateHandle);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "", "a", "b", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$a;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "Lpp/h;", "view", "<init>", "(Lpp/h;)V", "a", "Lpp/h;", "()Lpp/h;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final h view;

            public a(@NotNull h view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final h getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d$b;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "Lpp/i;", "view", "<init>", "(Lpp/i;)V", "a", "Lpp/i;", "()Lpp/i;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$10", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12472t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestWorkflow.Props f12474v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PermissionRequestWorkflow.Props props, lt.b<? super e> bVar) {
            super(1, bVar);
            this.f12474v = props;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return PermissionRequestStateManager.this.new e(this.f12474v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f12472t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (com.withpersona.sdk2.inquiry.shared.inquiry_session.a.b(PermissionRequestStateManager.this.applicationContext)) {
                PermissionRequestStateManager.this.v(new PermissionState(this.f12474v.getPermission(), j1.PermissionGranted));
            } else {
                PermissionRequestStateManager.this.d().p(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f12455a);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$1", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12475t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestWorkflow.Props f12477v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PermissionRequestWorkflow.Props props, lt.b<? super f> bVar) {
            super(1, bVar);
            this.f12477v = props;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return PermissionRequestStateManager.this.new f(this.f12477v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f12475t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (com.withpersona.sdk2.inquiry.permissions.g.b(PermissionRequestStateManager.this.applicationContext, this.f12477v.getPermission())) {
                PermissionRequestStateManager.this.d().p(PermissionRequestState.RequestDeviceFeature.f12460a);
            } else {
                PermissionRequestStateManager.this.d().p(PermissionRequestState.CheckPermissionRationaleState.f12457a);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$6", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12478t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestWorkflow.Props f12480v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PermissionRequestWorkflow.Props props, lt.b<? super g> bVar) {
            super(1, bVar);
            this.f12480v = props;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return PermissionRequestStateManager.this.new g(this.f12480v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f12478t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            PermissionRequestStateManager.this.v(new PermissionState(this.f12480v.getPermission(), j1.PermissionGranted));
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestStateManager(@NotNull PermissionRequestWorkflow.Props initialProps, @NotNull l0 savedStateHandle, @NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.permissions.d.a permissionRequestDialogWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a deviceFeatureRequestWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull final p0 coroutineScope) {
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
        if (d().i() == null) {
            d().p(x(b().getValue()));
        }
        d().o(new Function1() { // from class: sp.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestStateManager.r(coroutineScope, this, (PermissionRequestStateManager.PermissionRequestState) obj);
            }
        });
        k.d(coroutineScope, g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, com.withpersona.sdk2.inquiry.permissions.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.permissions.a.b.c) {
            permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionGranted));
        } else if (it instanceof com.withpersona.sdk2.inquiry.permissions.a.b.C0229a) {
            permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionRejected));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.permissions.a.b.C0230b)) {
                throw new l();
            }
            permissionRequestStateManager.w();
            permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.SettingsLaunched));
        }
        return Unit.f22938a;
    }

    public static final Unit B(PermissionRequestStateManager permissionRequestStateManager) {
        permissionRequestStateManager.d().p(PermissionRequestState.RequestPermission.f12461a);
        return Unit.f22938a;
    }

    public static final Unit C(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionRejected));
        return Unit.f22938a;
    }

    public static final Unit D(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, com.withpersona.sdk2.inquiry.permissions.d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.permissions.d.b.C0233b.f12397a)) {
            permissionRequestStateManager.d().p(PermissionRequestState.RequestDeviceFeature.f12460a);
        } else {
            if (!Intrinsics.c(it, com.withpersona.sdk2.inquiry.permissions.d.b.a.f12396a)) {
                throw new l();
            }
            if (props.getOptional()) {
                permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionRejected));
            } else {
                permissionRequestStateManager.d().p(PermissionRequestState.CheckPermissionPermanentlyDenied.f12456a);
            }
        }
        return Unit.f22938a;
    }

    public static final Unit E(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props, boolean z10) {
        if (z10) {
            permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionRejected));
        } else {
            permissionRequestStateManager.d().p(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f12462a);
        }
        return Unit.f22938a;
    }

    public static final Unit F(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.J();
        permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.SettingsLaunched));
        return Unit.f22938a;
    }

    public static final Unit G(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionRejected));
        return Unit.f22938a;
    }

    public static final Unit H(PermissionRequestStateManager permissionRequestStateManager) {
        permissionRequestStateManager.d().p(DeviceFeatureRequestState.RequestDeviceFeature.f12454a);
        return Unit.f22938a;
    }

    public static final Unit I(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestWorkflow.Props props) {
        permissionRequestStateManager.v(new PermissionState(props.getPermission(), j1.PermissionRejected));
        return Unit.f22938a;
    }

    public static final Unit r(p0 p0Var, PermissionRequestStateManager permissionRequestStateManager, PermissionRequestState permissionRequestState) {
        if (permissionRequestState == null) {
            return Unit.f22938a;
        }
        k.d(p0Var, g1.d(), null, permissionRequestStateManager.new a(permissionRequestState, null), 2, null);
        return Unit.f22938a;
    }

    public static final Unit z(PermissionRequestStateManager permissionRequestStateManager, boolean z10) {
        if (z10) {
            permissionRequestStateManager.d().p(PermissionRequestState.ShowRequestPermissionRationale.f12463a);
        } else {
            permissionRequestStateManager.d().p(PermissionRequestState.RequestPermission.f12461a);
        }
        return Unit.f22938a;
    }

    public final void J() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    public final void v(PermissionState output) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(n1.c(output.getPermission()), n1.b(output.getResult()), null, 4, null), false, 2, null);
        e(new PermissionRequestWorkflow.Output(output));
    }

    public final void w() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    @NotNull
    public final PermissionRequestState x(@NotNull PermissionRequestWorkflow.Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return PermissionRequestState.CheckPermissionState.f12458a;
    }

    public final void y(final PermissionRequestWorkflow.Props renderProps, PermissionRequestState renderState) {
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionState.f12458a)) {
            d().m("check_permission_state", new f(renderProps, null));
            return;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionRationaleState.f12457a)) {
            c().setValue(new d.b(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: sp.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestStateManager.z(this.f31750a, ((Boolean) obj).booleanValue());
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.ShowRequestPermissionRationale.f12463a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(n1.c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            c0<d> c0VarC = c();
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(tp.g.D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: sp.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.B(this.f31751a);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(tp.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            c0VarC.setValue(new d.a(new h(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: sp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.C(this.f31752a, renderProps);
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.RequestPermission.f12461a)) {
            d().n(this.permissionRequestDialogWorkerFactory.a(renderProps.getPermission()), new Function1() { // from class: sp.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestStateManager.D(this.f31753a, renderProps, (com.withpersona.sdk2.inquiry.permissions.d.b) obj);
                }
            });
            return;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.RequestDeviceFeature.f12460a)) {
            if (renderProps.q()) {
                d().p(DeviceFeatureRequestState.CheckDeviceFeatureState.f12453a);
                return;
            } else {
                d().m("request_device_feature", new g(renderProps, null));
                return;
            }
        }
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.f12456a)) {
            c().setValue(new d.b(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: sp.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestStateManager.E(this.f31754a, renderProps, ((Boolean) obj).booleanValue());
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f12462a)) {
            c0<d> c0VarC2 = c();
            String title2 = renderProps.getTitle();
            String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
            String positiveButtonText2 = renderProps.getPositiveButtonText();
            if (positiveButtonText2 == null) {
                positiveButtonText2 = this.applicationContext.getString(tp.g.E);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
            }
            String str2 = positiveButtonText2;
            StepStyle styles2 = renderProps.getStyles();
            Function0 function1 = new Function0() { // from class: sp.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.F(this.f31755a, renderProps);
                }
            };
            String negativeButtonText2 = renderProps.getNegativeButtonText();
            if (negativeButtonText2 == null) {
                negativeButtonText2 = this.applicationContext.getString(tp.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
            }
            c0VarC2.setValue(new d.a(new h(title2, rationaleWhenPermanentlyDenied, str2, styles2, function1, negativeButtonText2, new Function0() { // from class: sp.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestStateManager.G(this.f31756a, renderProps);
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, DeviceFeatureRequestState.CheckDeviceFeatureState.f12453a)) {
            d().m("check_device_feature_state", new e(renderProps, null));
            return;
        }
        if (!Intrinsics.c(renderState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f12455a)) {
            if (Intrinsics.c(renderState, DeviceFeatureRequestState.RequestDeviceFeature.f12454a)) {
                d().n(this.deviceFeatureRequestWorkerFactory.a(), new Function1() { // from class: sp.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PermissionRequestStateManager.A(this.f31749a, renderProps, (com.withpersona.sdk2.inquiry.permissions.a.b) obj);
                    }
                });
                return;
            } else {
                if (!Intrinsics.c(renderState, PermissionRequestState.Complete.f12459a)) {
                    throw new l();
                }
                return;
            }
        }
        c0<d> c0VarC3 = c();
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
        Function0 function2 = new Function0() { // from class: sp.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestStateManager.H(this.f31757a);
            }
        };
        String gpsFeatureModalNegativeButton = renderProps.getGpsFeatureModalNegativeButton();
        if (gpsFeatureModalNegativeButton == null) {
            gpsFeatureModalNegativeButton = "Cancel";
        }
        c0VarC3.setValue(new d.a(new h(gpsFeatureTitle, gpsFeatureRationale, positiveButtonText3, styles3, function2, gpsFeatureModalNegativeButton, new Function0() { // from class: sp.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestStateManager.I(this.f31758a, renderProps);
            }
        })));
    }
}
