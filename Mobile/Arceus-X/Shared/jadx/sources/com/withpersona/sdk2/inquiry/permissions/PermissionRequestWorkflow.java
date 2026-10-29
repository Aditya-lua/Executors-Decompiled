package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.C3855d;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0388q;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p419rp.C11018g0;
import p419rp.C11040n1;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p419rp.EnumC11057v;
import p419rp.OldCheckRequestPermissionRationaleStateView;
import p497vp.C12244g;
import p526wq.C12530m;
import p526wq.EnumC12529l;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.InterfaceC13205a;
import p581ym.InterfaceC13215h;
import p581ym.Snapshot;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003/01B)\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u0010*\u00180\u0013R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00032$\u0010!\u001a 0 R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "permissionRequestDialogWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "deviceFeatureRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/d$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "", "I", "()V", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "output", "G", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "props", "Lym/i;", "snapshot", "H", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lym/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "renderProps", "renderState", "Lym/k$a;", "context", "J", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lym/k$a;)Ljava/lang/Object;", "state", "h0", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Props", "Output", "PermissionRequestState", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PermissionRequestWorkflow extends AbstractC13218k<Props, PermissionRequestState, Output, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3855d.a permissionRequestDialogWorkerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Output implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Output> CREATOR = new C3838a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final PermissionState permissionState;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Output$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3838a implements Parcelable.Creator<Output> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Output createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Output(PermissionState.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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
            return (other instanceof Output) && Intrinsics.m31980c(this.permissionState, ((Output) other).permissionState);
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

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Landroid/os/Parcelable;", "CheckPermissionState", "CheckPermissionRationaleState", "ShowRequestPermissionRationale", "RequestPermission", "RequestDeviceFeature", "CheckPermissionPermanentlyDenied", "ShowPermissionPermanentlyDeniedMessage", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface PermissionRequestState extends Parcelable {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckPermissionPermanentlyDenied implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckPermissionPermanentlyDenied f15782a = new CheckPermissionPermanentlyDenied();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new C3839a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3839a implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionPermanentlyDenied createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.f15782a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckPermissionRationaleState implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckPermissionRationaleState f15783a = new CheckPermissionRationaleState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new C3840a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3840a implements Parcelable.Creator<CheckPermissionRationaleState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionRationaleState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.f15783a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckPermissionState implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckPermissionState f15784a = new CheckPermissionState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new C3841a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3841a implements Parcelable.Creator<CheckPermissionState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckPermissionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.f15784a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Complete implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Complete f15785a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new C3842a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$Complete$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3842a implements Parcelable.Creator<Complete> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f15785a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RequestDeviceFeature implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final RequestDeviceFeature f15786a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new C3843a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3843a implements Parcelable.Creator<RequestDeviceFeature> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f15786a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RequestPermission implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final RequestPermission f15787a = new RequestPermission();

            @NotNull
            public static final Parcelable.Creator<RequestPermission> CREATOR = new C3844a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$RequestPermission$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3844a implements Parcelable.Creator<RequestPermission> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.f15787a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ShowPermissionPermanentlyDeniedMessage implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final ShowPermissionPermanentlyDeniedMessage f15788a = new ShowPermissionPermanentlyDeniedMessage();

            @NotNull
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new C3845a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3845a implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.f15788a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ShowRequestPermissionRationale implements PermissionRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final ShowRequestPermissionRationale f15789a = new ShowRequestPermissionRationale();

            @NotNull
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new C3846a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3846a implements Parcelable.Creator<ShowRequestPermissionRationale> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowRequestPermissionRationale createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.f15789a;
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3848a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15801a;

        static {
            int[] iArr = new int[EnumC11057v.values().length];
            try {
                iArr[EnumC11057v.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11057v.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11057v.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15801a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", m39664f = "PermissionRequestWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3849b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15802t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Props f15804v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC13218k<Props, PermissionRequestState, Output, Object>.a f15805w;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props, com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState, com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Output, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3849b(Props props, AbstractC13218k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, InterfaceC9557b<? super C3849b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15804v = props;
            this.f15805w = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public static final Unit m19132s(AbstractC13225r.c cVar) {
            cVar.m48903e(PermissionRequestState.RequestDeviceFeature.f15786a);
            return Unit.f29331a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static final Unit m19133t(AbstractC13225r.c cVar) {
            cVar.m48903e(PermissionRequestState.CheckPermissionRationaleState.f15783a);
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return PermissionRequestWorkflow.this.new C3849b(this.f15804v, this.f15805w, interfaceC9557b);
        }

        /* JADX DEBUG: Class process forced to load method for inline: ym.w.g(ym.k, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):ym.r */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15802t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (C3858g.m19164b(PermissionRequestWorkflow.this.applicationContext, this.f15804v.getPermission())) {
                this.f15805w.mo48837d().mo17905a(C13233z.m48946d(PermissionRequestWorkflow.this, null, new Function1() { // from class: rp.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PermissionRequestWorkflow.C3849b.m19132s((AbstractC13225r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f15805w.mo48837d().mo17905a(C13233z.m48946d(PermissionRequestWorkflow.this, null, new Function1() { // from class: rp.h1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PermissionRequestWorkflow.C3849b.m19133t((AbstractC13225r.c) obj2);
                    }
                }, 1, null));
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3849b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", m39664f = "PermissionRequestWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3850c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15806t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Props, PermissionRequestState, Output, Object>.a f15807u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PermissionRequestWorkflow f15808v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Props f15809w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props, com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$PermissionRequestState, com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Output, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3850c(AbstractC13218k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props, InterfaceC9557b<? super C3850c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15807u = aVar;
            this.f15808v = permissionRequestWorkflow;
            this.f15809w = props;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m19135r(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c cVar) {
            permissionRequestWorkflow.m19093G(cVar, new PermissionState(props.getPermission(), EnumC11028j1.PermissionGranted));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3850c(this.f15807u, this.f15808v, this.f15809w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15806t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Props, PermissionRequestState, ? extends Output>> interfaceC13215hMo48837d = this.f15807u.mo48837d();
            final PermissionRequestWorkflow permissionRequestWorkflow = this.f15808v;
            final Props props = this.f15809w;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PermissionRequestWorkflow.C3850c.m19135r(permissionRequestWorkflow, props, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3850c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public PermissionRequestWorkflow(@NotNull Context applicationContext, @NotNull C3855d.a permissionRequestDialogWorkerFactory, @NotNull DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestDialogWorkerFactory, "permissionRequestDialogWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestDialogWorkerFactory = permissionRequestDialogWorkerFactory;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m19051K(AbstractC13218k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, final boolean z10) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19052L(z10, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m19052L(boolean z10, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            action.m48903e(PermissionRequestState.ShowRequestPermissionRationale.f15789a);
        } else {
            action.m48903e(PermissionRequestState.RequestPermission.f15787a);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M */
    public static final AbstractC13225r m19053M(final PermissionRequestWorkflow permissionRequestWorkflow, final AbstractC13218k.a aVar, final Props props, C3855d.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C3855d.b.C14137b.f15842a)) {
            return C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19057Q(aVar, permissionRequestWorkflow, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.m31980c(it, C3855d.b.a.f15841a)) {
            return C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19054N(aVar, permissionRequestWorkflow, props, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m19054N(AbstractC13218k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((Props) action.m48900b()).getOptional()) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19055O(this.f39045a, props, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19056P((AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m19055O(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m19056P(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(PermissionRequestState.CheckPermissionPermanentlyDenied.f15782a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m19057Q(AbstractC13218k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19058R((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m19058R(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(PermissionRequestState.RequestDeviceFeature.f15786a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S */
    public static final AbstractC13225r m19059S(final PermissionRequestWorkflow permissionRequestWorkflow, final AbstractC13218k.a aVar, final Props props, final DeviceFeatureRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19060T(it, aVar, permissionRequestWorkflow, props, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m19060T(DeviceFeatureRequestWorkflow.Output c3834a, AbstractC13218k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = C3848a.f15801a[c3834a.getDeviceFeatureState().getResult().ordinal()];
        if (i10 == 1) {
            aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19061U(this.f39061a, props, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        } else if (i10 == 2) {
            permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19062V(this.f39065a, props, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m19061U(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.PermissionGranted));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m19062V(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.SettingsLaunched));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m19063W(final AbstractC13218k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, final boolean z10) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19064X(z10, permissionRequestWorkflow, props, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m19064X(boolean z10, PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        } else {
            aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19065Y((AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m19065Y(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f15788a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m19066Z(final PermissionRequestWorkflow permissionRequestWorkflow, AbstractC13218k.a aVar, final Props props) {
        permissionRequestWorkflow.m19095I();
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19067a0(this.f39012a, props, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m19067a0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.SettingsLaunched));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m19068b0(AbstractC13218k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19069c0(this.f38942a, props, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m19069c0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m19070d0(AbstractC13218k.a aVar, PermissionRequestWorkflow permissionRequestWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19071e0((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m19071e0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(PermissionRequestState.RequestPermission.f15787a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m19072f0(AbstractC13218k.a aVar, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(permissionRequestWorkflow, null, new Function1() { // from class: rp.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.m19073g0(this.f38996a, props, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m19073g0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.m19093G(action, new PermissionState(props.getPermission(), EnumC11028j1.PermissionRejected));
        return Unit.f29331a;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logPermissionEvent$default(com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger, com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData, boolean, int, java.lang.Object):void */
    /* JADX INFO: renamed from: G */
    public final void m19093G(AbstractC13225r<? super Props, PermissionRequestState, Output>.c cVar, PermissionState permissionState) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(C11040n1.m41737c(permissionState.getPermission()), C11040n1.m41736b(permissionState.getResult()), null, 4, null), false, 2, null);
        cVar.m48902d(new Output(permissionState));
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public PermissionRequestState mo16430d(@NotNull Props props, @Nullable Snapshot snapshot) {
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
            PermissionRequestState permissionRequestState = (PermissionRequestState) parcelable;
            if (permissionRequestState != null) {
                return permissionRequestState;
            }
        }
        return PermissionRequestState.CheckPermissionState.f15784a;
    }

    /* JADX INFO: renamed from: I */
    public final void m19095I() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull final Props renderProps, @NotNull PermissionRequestState renderState, @NotNull final AbstractC13218k<? super Props, PermissionRequestState, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.m31980c(renderState, PermissionRequestState.CheckPermissionState.f15784a)) {
            context.mo48835b("check_permission_state", new C3849b(renderProps, context, null));
            return null;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.CheckPermissionRationaleState.f15783a)) {
            return new C12530m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: rp.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19051K(context, this, ((Boolean) obj).booleanValue());
                }
            }), EnumC12529l.NONE);
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.ShowRequestPermissionRationale.f15789a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(C11040n1.m41737c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(C12244g.f43219D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: rp.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.m19070d0(context, this);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(C12244g.f43218C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            return new C12530m(new C11018g0(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: rp.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.m19072f0(context, this, renderProps);
                }
            }), EnumC12529l.NONE);
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.RequestPermission.f15787a)) {
            C13230w.m48937l(context, this.permissionRequestDialogWorkerFactory.m19154a(renderProps.getPermission()), C7731d0.m32011k(C3855d.class), "", new Function1() { // from class: rp.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19053M(this.f39072a, context, renderProps, (C3855d.b) obj);
                }
            });
            return null;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.RequestDeviceFeature.f15786a)) {
            if (renderProps.m19127q()) {
                return InterfaceC13205a.a.m48838a(context, this.deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow.Props(C11040n1.m41735a(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new Function1() { // from class: rp.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PermissionRequestWorkflow.m19059S(this.f38919a, context, renderProps, (DeviceFeatureRequestWorkflow.Output) obj);
                    }
                }, 4, null);
            }
            context.mo48835b("request_device_feature", new C3850c(context, this, renderProps, null));
            return null;
        }
        if (Intrinsics.m31980c(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.f15782a)) {
            return new C12530m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: rp.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.m19063W(context, this, renderProps, ((Boolean) obj).booleanValue());
                }
            }), EnumC12529l.NONE);
        }
        if (!Intrinsics.m31980c(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.f15788a)) {
            if (Intrinsics.m31980c(renderState, PermissionRequestState.Complete.f15785a)) {
                return null;
            }
            throw new C7345l();
        }
        String title2 = renderProps.getTitle();
        String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
        String positiveButtonText2 = renderProps.getPositiveButtonText();
        if (positiveButtonText2 == null) {
            positiveButtonText2 = this.applicationContext.getString(C12244g.f43220E);
            Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
        }
        String str2 = positiveButtonText2;
        StepStyle styles2 = renderProps.getStyles();
        Function0 function1 = new Function0() { // from class: rp.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestWorkflow.m19066Z(this.f38931a, context, renderProps);
            }
        };
        String negativeButtonText2 = renderProps.getNegativeButtonText();
        if (negativeButtonText2 == null) {
            negativeButtonText2 = this.applicationContext.getString(C12244g.f43218C);
            Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
        }
        return new C12530m(new C11018g0(title2, rationaleWhenPermanentlyDenied, str2, styles2, function1, negativeButtonText2, new Function0() { // from class: rp.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestWorkflow.m19068b0(context, this, renderProps);
            }
        }), EnumC12529l.NONE);
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull PermissionRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C0388q.m1447a(state);
    }

    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b4\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010*¨\u0006<"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Landroid/os/Parcelable;", "Lrp/i0;", "permission", "", "optional", "", Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/i0;", "k", "()Lrp/i0;", "b", "Z", "j", "()Z", "c", "Ljava/lang/String;", "getTitle", "d", "n", "e", "o", "f", "m", "g", "i", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "q", "isPermissionLocation", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Props implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Props> CREATOR = new C3847a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC11024i0 permission;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean optional;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String rationale;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @NotNull
        public final String rationaleWhenPermanentlyDenied;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final String positiveButtonText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        public final String negativeButtonText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureTitle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureRationale;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final String gpsFeatureModalNegativeButton;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Props$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3847a implements Parcelable.Creator<Props> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Props createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Props(EnumC11024i0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(Props.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Props[] newArray(int i10) {
                return new Props[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Props(@NotNull EnumC11024i0 permission, boolean z10, @NotNull String title, @NotNull String rationale, @NotNull String rationaleWhenPermanentlyDenied, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable StepStyle stepStyle) {
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
            return this.permission == props.permission && this.optional == props.optional && Intrinsics.m31980c(this.title, props.title) && Intrinsics.m31980c(this.rationale, props.rationale) && Intrinsics.m31980c(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && Intrinsics.m31980c(this.positiveButtonText, props.positiveButtonText) && Intrinsics.m31980c(this.negativeButtonText, props.negativeButtonText) && Intrinsics.m31980c(this.gpsFeatureTitle, props.gpsFeatureTitle) && Intrinsics.m31980c(this.gpsFeatureRationale, props.gpsFeatureRationale) && Intrinsics.m31980c(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && Intrinsics.m31980c(this.styles, props.styles);
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
        public final EnumC11024i0 getPermission() {
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

        /* JADX INFO: renamed from: q */
        public final boolean m19127q() {
            EnumC11024i0 enumC11024i0 = this.permission;
            return enumC11024i0 == EnumC11024i0.RoughLocation || enumC11024i0 == EnumC11024i0.PreciseLocation;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
          (r15v0 rp.i0 A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (wrap boolean:?: TERNARY null = ((wrap int:0x0002: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
          (r17v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r18v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r19v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r20v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (r21v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0014: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001c: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
          (r25v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
         A[MD:(rp.i0, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle):void (m)] (LINE:13) call: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow.Props.<init>(rp.i0, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle):void type: THIS */
        public /* synthetic */ Props(EnumC11024i0 enumC11024i0, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyle stepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC11024i0, (i10 & 2) != 0 ? false : z10, str, str2, str3, str4, str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8, stepStyle);
        }
    }
}
