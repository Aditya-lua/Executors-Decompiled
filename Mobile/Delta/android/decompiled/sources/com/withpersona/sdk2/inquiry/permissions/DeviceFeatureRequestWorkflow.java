package com.withpersona.sdk2.inquiry.permissions;

import an.q;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
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
import rp.g0;
import rp.u;
import rp.v;
import ym.Snapshot;
import ym.h;
import ym.k;
import ym.r;
import ym.w;
import ym.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003%#'B\u0019\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032$\u0010\u0014\u001a 0\u0013R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001f\u001a\u00020\u001e*\u00180\u001aR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "deviceFeatureRequestWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/a$a;)V", "props", "Lym/i;", "snapshot", "t", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lym/i;)Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "renderProps", "renderState", "Lym/k$a;", "context", "u", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;Lym/k$a;)Ljava/lang/Object;", "state", "D", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;)Lym/i;", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "output", "", "r", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "s", "()V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "DeviceFeatureRequestState", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceFeatureRequestWorkflow extends k<Props, DeviceFeatureRequestState, Output, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a.InterfaceC0225a deviceFeatureRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "CheckDeviceFeatureState", "ShowDeviceFeaturePrompt", "RequestDeviceFeature", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class DeviceFeatureRequestState implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckDeviceFeatureState extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final CheckDeviceFeatureState f12246a = new CheckDeviceFeatureState();

            @NotNull
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckDeviceFeatureState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckDeviceFeatureState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckDeviceFeatureState.f12246a;
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
                return -86189441;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Complete extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Complete f12247a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f12247a;
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
                return 92238675;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequestDeviceFeature extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final RequestDeviceFeature f12248a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestDeviceFeature> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f12248a;
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
                return 1991921803;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final ShowDeviceFeaturePrompt f12249a = new ShowDeviceFeaturePrompt();

            @NotNull
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowDeviceFeaturePrompt> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowDeviceFeaturePrompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowDeviceFeaturePrompt.f12249a;
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
                return 725044653;
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
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "deviceFeatureState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "()Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Output {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final DeviceFeatureState deviceFeatureState;

        public Output(@NotNull DeviceFeatureState deviceFeatureState) {
            Intrinsics.checkNotNullParameter(deviceFeatureState, "deviceFeatureState");
            this.deviceFeatureState = deviceFeatureState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DeviceFeatureState getDeviceFeatureState() {
            return this.deviceFeatureState;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.c(this.deviceFeatureState, ((Output) other).deviceFeatureState);
        }

        public int hashCode() {
            return this.deviceFeatureState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Output(deviceFeatureState=" + this.deviceFeatureState + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "", "Lrp/u;", "feature", "", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalPositiveButton", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lrp/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/u;", "()Lrp/u;", "b", "Ljava/lang/String;", "e", "c", "d", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Props {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final u feature;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureRationale;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureModalPositiveButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureModalNegativeButton;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        public Props(@NotNull u feature, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable StepStyle stepStyle) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.feature = feature;
            this.requestFeatureTitle = str;
            this.requestFeatureRationale = str2;
            this.requestFeatureModalPositiveButton = str3;
            this.requestFeatureModalNegativeButton = str4;
            this.styles = stepStyle;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u getFeature() {
            return this.feature;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRequestFeatureModalNegativeButton() {
            return this.requestFeatureModalNegativeButton;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRequestFeatureModalPositiveButton() {
            return this.requestFeatureModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRequestFeatureRationale() {
            return this.requestFeatureRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRequestFeatureTitle() {
            return this.requestFeatureTitle;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.feature == props.feature && Intrinsics.c(this.requestFeatureTitle, props.requestFeatureTitle) && Intrinsics.c(this.requestFeatureRationale, props.requestFeatureRationale) && Intrinsics.c(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && Intrinsics.c(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && Intrinsics.c(this.styles, props.styles);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            String str = this.requestFeatureTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestFeatureRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestFeatureModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestFeatureModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Props(feature=" + this.feature + ", requestFeatureTitle=" + this.requestFeatureTitle + ", requestFeatureRationale=" + this.requestFeatureRationale + ", requestFeatureModalPositiveButton=" + this.requestFeatureModalPositiveButton + ", requestFeatureModalNegativeButton=" + this.requestFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1", f = "DeviceFeatureRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12256t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ k<Props, DeviceFeatureRequestState, Output, Object>.a f12258v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Props f12259w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a aVar, Props props, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f12258v = aVar;
            this.f12259w = props;
        }

        public static final Unit s(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, r.c cVar) {
            deviceFeatureRequestWorkflow.r(cVar, new DeviceFeatureState(props.getFeature(), v.Success));
            return Unit.f22483a;
        }

        public static final Unit t(r.c cVar) {
            cVar.e(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f12249a);
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return DeviceFeatureRequestWorkflow.this.new c(this.f12258v, this.f12259w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f12256t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (com.withpersona.sdk2.inquiry.shared.inquiry_session.a.b(DeviceFeatureRequestWorkflow.this.applicationContext)) {
                h<r<? super Props, DeviceFeatureRequestState, ? extends Output>> hVarD = this.f12258v.d();
                final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = DeviceFeatureRequestWorkflow.this;
                final Props props = this.f12259w;
                hVarD.a(z.d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DeviceFeatureRequestWorkflow.c.s(deviceFeatureRequestWorkflow, props, (ym.r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f12258v.d().a(z.d(DeviceFeatureRequestWorkflow.this, null, new Function1() { // from class: rp.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DeviceFeatureRequestWorkflow.c.t((ym.r.c) obj2);
                    }
                }, 1, null));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public DeviceFeatureRequestWorkflow(@NotNull Context applicationContext, @NotNull a.InterfaceC0225a deviceFeatureRequestWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        this.applicationContext = applicationContext;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
    }

    public static final Unit A(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.r(action, new DeviceFeatureState(props.getFeature(), v.Success));
        return Unit.f22483a;
    }

    public static final Unit B(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.r(action, new DeviceFeatureState(props.getFeature(), v.Failure));
        return Unit.f22483a;
    }

    public static final Unit C(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.r(action, new DeviceFeatureState(props.getFeature(), v.SettingsLaunched));
        return Unit.f22483a;
    }

    public static final Unit v(k.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow) {
        aVar.d().a(z.d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.w((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit w(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(DeviceFeatureRequestState.RequestDeviceFeature.f12248a);
        return Unit.f22483a;
    }

    public static final Unit x(k.a aVar, final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, final Props props) {
        aVar.d().a(z.d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.y(this.f30174a, props, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit y(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.r(action, new DeviceFeatureState(props.getFeature(), v.Failure));
        return Unit.f22483a;
    }

    public static final r z(final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, final Props props, a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof a.b.c) {
            return z.d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.A(this.f30155a, props, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof a.b.C0226a) {
            return z.d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.B(this.f30158a, props, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof a.b.C0227b)) {
            throw new l();
        }
        deviceFeatureRequestWorkflow.s();
        return z.d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.C(this.f30170a, props, (ym.r.c) obj);
            }
        }, 1, null);
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull DeviceFeatureRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }

    public final void r(r<? super Props, DeviceFeatureRequestState, Output>.c cVar, DeviceFeatureState deviceFeatureState) {
        cVar.d(new Output(deviceFeatureState));
    }

    public final void s() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public DeviceFeatureRequestState d(@NotNull Props props, @Nullable Snapshot snapshot) {
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
            DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) parcelable;
            if (deviceFeatureRequestState != null) {
                return deviceFeatureRequestState;
            }
        }
        return DeviceFeatureRequestState.CheckDeviceFeatureState.f12246a;
    }

    @Override // ym.k
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Props renderProps, @NotNull DeviceFeatureRequestState renderState, @NotNull final k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.c(renderState, DeviceFeatureRequestState.CheckDeviceFeatureState.f12246a)) {
            context.b("check_device_feature_state", new c(context, renderProps, null));
            return null;
        }
        if (!Intrinsics.c(renderState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f12249a)) {
            if (!Intrinsics.c(renderState, DeviceFeatureRequestState.RequestDeviceFeature.f12248a)) {
                if (Intrinsics.c(renderState, DeviceFeatureRequestState.Complete.f12247a)) {
                    return null;
                }
                throw new l();
            }
            w.l(context, this.deviceFeatureRequestWorkerFactory.a(), d0.k(a.class), "", new Function1() { // from class: rp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.z(this.f30150a, renderProps, (com.withpersona.sdk2.inquiry.permissions.a.b) obj);
                }
            });
            return null;
        }
        String requestFeatureTitle = renderProps.getRequestFeatureTitle();
        if (requestFeatureTitle == null) {
            requestFeatureTitle = "Couldn't access location feature";
        }
        String requestFeatureRationale = renderProps.getRequestFeatureRationale();
        if (requestFeatureRationale == null) {
            requestFeatureRationale = "Location is turned off, please allow access to your device's location feature";
        }
        String requestFeatureModalPositiveButton = renderProps.getRequestFeatureModalPositiveButton();
        if (requestFeatureModalPositiveButton == null) {
            requestFeatureModalPositiveButton = "Allow";
        }
        StepStyle styles = renderProps.getStyles();
        Function0 function0 = new Function0() { // from class: rp.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceFeatureRequestWorkflow.v(context, this);
            }
        };
        String requestFeatureModalNegativeButton = renderProps.getRequestFeatureModalNegativeButton();
        if (requestFeatureModalNegativeButton == null) {
            requestFeatureModalNegativeButton = "Cancel";
        }
        return new wq.m(new g0(requestFeatureTitle, requestFeatureRationale, requestFeatureModalPositiveButton, styles, function0, requestFeatureModalNegativeButton, new Function0() { // from class: rp.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceFeatureRequestWorkflow.x(context, this, renderProps);
            }
        }), wq.l.NONE);
    }
}
