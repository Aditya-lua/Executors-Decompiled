package com.withpersona.sdk2.inquiry.permissions;

import an.q;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import jt.l;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import rp.OldCheckRequestPermissionRationaleStateView;
import rp.g0;
import rp.i0;
import rp.j1;
import rp.n1;
import rp.v;
import ym.Snapshot;
import ym.h;
import ym.k;
import ym.r;
import ym.w;
import ym.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003/01B)\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u0010*\u00180\u0013R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00032$\u0010!\u001a 0 R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "permissionRequestDialogWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "deviceFeatureRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "I", "()V", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "output", "G", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "props", "Lym/i;", "snapshot", "H", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "renderProps", "renderState", "Lym/k$a;", "context", "J", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lym/k$a;)Ljava/lang/Object;", "state", "h0", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Props", "Output", "PermissionRequestState", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionRequestWorkflow extends k<Props, PermissionRequestState, Output, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d.a permissionRequestDialogWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Output implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Output> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PermissionState permissionState;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Output> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Output createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Output(PermissionState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Output[] newArray(int i10) {
                return new Output[i10];
            }
        }

        public Output(@NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.permissionState = permissionState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.c(this.permissionState, ((Output) other).permissionState);
        }

        public int hashCode() {
            return this.permissionState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Output(permissionState=" + this.permissionState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.permissionState.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Landroid/os/Parcelable;", "CheckPermissionState", "CheckPermissionRationaleState", "ShowRequestPermissionRationale", "RequestPermission", "RequestDeviceFeature", "CheckPermissionPermanentlyDenied", "ShowPermissionPermanentlyDeniedMessage", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PermissionRequestState extends Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionPermanentlyDenied implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionPermanentlyDenied f12265a = new CheckPermissionPermanentlyDenied();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.f12265a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied[] newArray(int i10) {
                    return new CheckPermissionPermanentlyDenied[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionPermanentlyDenied);
            }

            public int hashCode() {
                return -367421189;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionRationaleState implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionRationaleState f12266a = new CheckPermissionRationaleState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionRationaleState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.f12266a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState[] newArray(int i10) {
                    return new CheckPermissionRationaleState[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionRationaleState);
            }

            public int hashCode() {
                return -1860465355;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPermissionState implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckPermissionState f12267a = new CheckPermissionState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.f12267a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState[] newArray(int i10) {
                    return new CheckPermissionState[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof CheckPermissionState);
            }

            public int hashCode() {
                return -885686570;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Complete implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Complete f12268a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f12268a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Complete[] newArray(int i10) {
                    return new Complete[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return 1563807797;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestDeviceFeature implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestDeviceFeature f12269a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestDeviceFeature> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f12269a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature[] newArray(int i10) {
                    return new RequestDeviceFeature[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestDeviceFeature);
            }

            public int hashCode() {
                return -1821218195;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestPermission implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestPermission f12270a = new RequestPermission();

            @NotNull
            public static final Parcelable.Creator<RequestPermission> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestPermission> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.f12270a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final RequestPermission[] newArray(int i10) {
                    return new RequestPermission[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof RequestPermission);
            }

            public int hashCode() {
                return -2052298174;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPermissionPermanentlyDeniedMessage implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowPermissionPermanentlyDeniedMessage f12271a = new ShowPermissionPermanentlyDeniedMessage();

            @NotNull
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.f12271a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage[] newArray(int i10) {
                    return new ShowPermissionPermanentlyDeniedMessage[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public int hashCode() {
                return -1723010119;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowRequestPermissionRationale implements PermissionRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowRequestPermissionRationale f12272a = new ShowRequestPermissionRationale();

            @NotNull
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowRequestPermissionRationale> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.f12272a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale[] newArray(int i10) {
                    return new ShowRequestPermissionRationale[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof ShowRequestPermissionRationale);
            }

            public int hashCode() {
                return 120525746;
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
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12283a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12283a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12284t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Props f12286v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ k<Props, PermissionRequestState, Output, Object>.a f12287w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Props props, k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f12286v = props;
            this.f12287w = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(r.c cVar) {
            cVar.e(PermissionRequestState.RequestDeviceFeature.f12269a);
            return Unit.f22483a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(r.c cVar) {
            cVar.e(PermissionRequestState.CheckPermissionRationaleState.f12266a);
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return PermissionRequestWorkflow.this.new b(this.f12286v, this.f12287w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f12284t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (g.b(PermissionRequestWorkflow.this.applicationContext, this.f12286v.getPermission())) {
                this.f12287w.d().a(z.d(PermissionRequestWorkflow.this, null, new Function1() { // from class: rp.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PermissionRequestWorkflow.b.s((ym.r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f12287w.d().a(z.d(PermissionRequestWorkflow.this, null, new Function1() { // from class: rp.h1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PermissionRequestWorkflow.b.t((ym.r.c) obj2);
                    }
                }, 1, null));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12288t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k<Props, PermissionRequestState, Output, Object>.a f12289u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PermissionRequestWorkflow f12290v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Props f12291w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f12289u = aVar;
            this.f12290v = permissionRequestWorkflow;
            this.f12291w = props;
        }

        public static final Unit r(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c cVar) {
            permissionRequestWorkflow.G(cVar, new PermissionState(props.getPermission(), j1.PermissionGranted));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f12289u, this.f12290v, this.f12291w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f12288t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            h<r<? super Props, PermissionRequestState, ? extends Output>> hVarD = this.f12289u.d();
            final PermissionRequestWorkflow permissionRequestWorkflow = this.f12290v;
            final Props props = this.f12291w;
            hVarD.a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PermissionRequestWorkflow.c.r(permissionRequestWorkflow, props, (ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public PermissionRequestWorkflow(@NotNull Context applicationContext, @NotNull d.a permissionRequestDialogWorkerFactory, @NotNull DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestDialogWorkerFactory, "permissionRequestDialogWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestDialogWorkerFactory = permissionRequestDialogWorkerFactory;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit K(k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, final boolean z10) {
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.L(z10, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit L(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            action.e(PermissionRequestState.ShowRequestPermissionRationale.f12272a);
        } else {
            action.e(PermissionRequestState.RequestPermission.f12270a);
        }
        return Unit.f22483a;
    }

    public static final r M(final PermissionRequestWorkflow permissionRequestWorkflow, final k.a aVar, final Props props, d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, d.b.C0230b.f12316a)) {
            return z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.Q(aVar, permissionRequestWorkflow, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(it, d.b.a.f12315a)) {
            return z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.N(aVar, permissionRequestWorkflow, props, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new l();
    }

    public static final Unit N(k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((Props) action.b()).getOptional()) {
            aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.O(this.f30178a, props, (ym.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.P((ym.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f22483a;
    }

    public static final Unit O(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.PermissionRejected));
        return Unit.f22483a;
    }

    public static final Unit P(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.CheckPermissionPermanentlyDenied.f12265a);
        return Unit.f22483a;
    }

    public static final Unit Q(k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.R((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit R(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.RequestDeviceFeature.f12269a);
        return Unit.f22483a;
    }

    public static final r S(final PermissionRequestWorkflow permissionRequestWorkflow, final k.a aVar, final Props props, final DeviceFeatureRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.T(it, aVar, permissionRequestWorkflow, props, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit T(DeviceFeatureRequestWorkflow.Output aVar, k.a aVar2, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = a.f12283a[aVar.getDeviceFeatureState().getResult().ordinal()];
        if (i10 == 1) {
            aVar2.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.U(this.f30190a, props, (ym.r.c) obj);
                }
            }, 1, null));
        } else if (i10 == 2) {
            permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.PermissionRejected));
        } else {
            if (i10 != 3) {
                throw new l();
            }
            aVar2.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.V(this.f30192a, props, (ym.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f22483a;
    }

    public static final Unit U(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.PermissionGranted));
        return Unit.f22483a;
    }

    public static final Unit V(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.SettingsLaunched));
        return Unit.f22483a;
    }

    public static final Unit W(final k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, final boolean z10) {
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.X(z10, permissionRequestWorkflow, props, aVar, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit X(boolean z10, PermissionRequestWorkflow permissionRequestWorkflow, Props props, k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.PermissionRejected));
        } else {
            aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.Y((ym.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f22483a;
    }

    public static final Unit Y(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f12271a);
        return Unit.f22483a;
    }

    public static final Unit Z(final PermissionRequestWorkflow permissionRequestWorkflow, k.a aVar, final Props props) {
        permissionRequestWorkflow.I();
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.a0(this.f30156a, props, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit a0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.SettingsLaunched));
        return Unit.f22483a;
    }

    public static final Unit b0(k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.c0(this.f30104a, props, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit c0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.PermissionRejected));
        return Unit.f22483a;
    }

    public static final Unit d0(k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow) {
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.e0((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit e0(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(PermissionRequestState.RequestPermission.f12270a);
        return Unit.f22483a;
    }

    public static final Unit f0(k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        aVar.d().a(z.d(permissionRequestWorkflow, null, new Function1() { // from class: rp.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.g0(this.f30145a, props, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit g0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.G(action, new PermissionState(props.getPermission(), j1.PermissionRejected));
        return Unit.f22483a;
    }

    public final void G(r<? super Props, PermissionRequestState, Output>.c cVar, PermissionState permissionState) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(n1.c(permissionState.getPermission()), n1.b(permissionState.getResult()), null, 4, null), false, 2, null);
        cVar.d(new Output(permissionState));
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public PermissionRequestState d(@NotNull Props props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            xu.h hVarB = snapshot.b();
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
            PermissionRequestState permissionRequestState = (PermissionRequestState) parcelable;
            if (permissionRequestState != null) {
                return permissionRequestState;
            }
        }
        return PermissionRequestState.CheckPermissionState.f12267a;
    }

    public final void I() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    @Override // ym.k
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Props renderProps, @NotNull PermissionRequestState renderState, @NotNull final k<? super Props, PermissionRequestState, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionState.f12267a)) {
            context.b("check_permission_state", new b(renderProps, context, null));
            return null;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionRationaleState.f12266a)) {
            return new wq.m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: rp.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.K(context, this, ((Boolean) obj).booleanValue());
                }
            }), wq.l.NONE);
        }
        if (Intrinsics.c(renderState, PermissionRequestState.ShowRequestPermissionRationale.f12272a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(n1.c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(vp.g.D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: rp.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.d0(context, this);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(vp.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            return new wq.m(new g0(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: rp.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.f0(context, this, renderProps);
                }
            }), wq.l.NONE);
        }
        if (Intrinsics.c(renderState, PermissionRequestState.RequestPermission.f12270a)) {
            w.l(context, this.permissionRequestDialogWorkerFactory.a(renderProps.getPermission()), d0.k(d.class), "", new Function1() { // from class: rp.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.M(this.f30197a, context, renderProps, (com.withpersona.sdk2.inquiry.permissions.d.b) obj);
                }
            });
            return null;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.RequestDeviceFeature.f12269a)) {
            if (renderProps.q()) {
                return ym.a.C0661a.a(context, this.deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow.Props(n1.a(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new Function1() { // from class: rp.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PermissionRequestWorkflow.S(this.f30087a, context, renderProps, (DeviceFeatureRequestWorkflow.Output) obj);
                    }
                }, 4, null);
            }
            context.b("request_device_feature", new c(context, this, renderProps, null));
            return null;
        }
        if (Intrinsics.c(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.f12265a)) {
            return new wq.m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: rp.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.W(context, this, renderProps, ((Boolean) obj).booleanValue());
                }
            }), wq.l.NONE);
        }
        if (!Intrinsics.c(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f12271a)) {
            if (Intrinsics.c(renderState, PermissionRequestState.Complete.f12268a)) {
                return null;
            }
            throw new l();
        }
        String title2 = renderProps.getTitle();
        String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
        String positiveButtonText2 = renderProps.getPositiveButtonText();
        if (positiveButtonText2 == null) {
            positiveButtonText2 = this.applicationContext.getString(vp.g.E);
            Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
        }
        String str2 = positiveButtonText2;
        StepStyle styles2 = renderProps.getStyles();
        Function0 function1 = new Function0() { // from class: rp.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestWorkflow.Z(this.f30095a, context, renderProps);
            }
        };
        String negativeButtonText2 = renderProps.getNegativeButtonText();
        if (negativeButtonText2 == null) {
            negativeButtonText2 = this.applicationContext.getString(vp.g.C);
            Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
        }
        return new wq.m(new g0(title2, rationaleWhenPermanentlyDenied, str2, styles2, function1, negativeButtonText2, new Function0() { // from class: rp.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestWorkflow.b0(context, this, renderProps);
            }
        }), wq.l.NONE);
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull PermissionRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b4\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010*¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Landroid/os/Parcelable;", "Lrp/i0;", "permission", "", "optional", "", Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/i0;", "k", "()Lrp/i0;", "b", "Z", "j", "()Z", "c", "Ljava/lang/String;", "getTitle", "d", "n", "e", "o", "f", "m", "g", "i", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "q", "isPermissionLocation", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Props implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Props> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final i0 permission;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean optional;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String rationale;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String rationaleWhenPermanentlyDenied;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String positiveButtonText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String negativeButtonText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureTitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureRationale;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureModalNegativeButton;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Props> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Props createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Props(i0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(Props.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Props[] newArray(int i10) {
                return new Props[i10];
            }
        }

        public Props(@NotNull i0 permission, boolean z10, @NotNull String title, @NotNull String rationale, @NotNull String rationaleWhenPermanentlyDenied, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable StepStyle stepStyle) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rationale, "rationale");
            Intrinsics.checkNotNullParameter(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
            this.permission = permission;
            this.optional = z10;
            this.title = title;
            this.rationale = rationale;
            this.rationaleWhenPermanentlyDenied = rationaleWhenPermanentlyDenied;
            this.positiveButtonText = str;
            this.negativeButtonText = str2;
            this.gpsFeatureTitle = str3;
            this.gpsFeatureRationale = str4;
            this.gpsFeatureModalNegativeButton = str5;
            this.styles = stepStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGpsFeatureModalNegativeButton() {
            return this.gpsFeatureModalNegativeButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.permission == props.permission && this.optional == props.optional && Intrinsics.c(this.title, props.title) && Intrinsics.c(this.rationale, props.rationale) && Intrinsics.c(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && Intrinsics.c(this.positiveButtonText, props.positiveButtonText) && Intrinsics.c(this.negativeButtonText, props.negativeButtonText) && Intrinsics.c(this.gpsFeatureTitle, props.gpsFeatureTitle) && Intrinsics.c(this.gpsFeatureRationale, props.gpsFeatureRationale) && Intrinsics.c(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && Intrinsics.c(this.styles, props.styles);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.permission.hashCode() * 31) + Boolean.hashCode(this.optional)) * 31) + this.title.hashCode()) * 31) + this.rationale.hashCode()) * 31) + this.rationaleWhenPermanentlyDenied.hashCode()) * 31;
            String str = this.positiveButtonText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsFeatureTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsFeatureRationale;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureModalNegativeButton;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode6 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getOptional() {
            return this.optional;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final i0 getPermission() {
            return this.permission;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getRationale() {
            return this.rationale;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getRationaleWhenPermanentlyDenied() {
            return this.rationaleWhenPermanentlyDenied;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        public final boolean q() {
            i0 i0Var = this.permission;
            return i0Var == i0.RoughLocation || i0Var == i0.PreciseLocation;
        }

        @NotNull
        public String toString() {
            return "Props(permission=" + this.permission + ", optional=" + this.optional + ", title=" + this.title + ", rationale=" + this.rationale + ", rationaleWhenPermanentlyDenied=" + this.rationaleWhenPermanentlyDenied + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalNegativeButton=" + this.gpsFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.permission.name());
            dest.writeInt(this.optional ? 1 : 0);
            dest.writeString(this.title);
            dest.writeString(this.rationale);
            dest.writeString(this.rationaleWhenPermanentlyDenied);
            dest.writeString(this.positiveButtonText);
            dest.writeString(this.negativeButtonText);
            dest.writeString(this.gpsFeatureTitle);
            dest.writeString(this.gpsFeatureRationale);
            dest.writeString(this.gpsFeatureModalNegativeButton);
            dest.writeParcelable(this.styles, flags);
        }

        public /* synthetic */ Props(i0 i0Var, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyle stepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i0Var, (i10 & 2) != 0 ? false : z10, str, str2, str3, str4, str5, (i10 & 128) != 0 ? null : str6, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str7, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str8, stepStyle);
        }
    }
}
