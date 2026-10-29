package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.C3852a;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.C4012a;
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
import p419rp.EnumC11055u;
import p419rp.EnumC11057v;
import p526wq.C12530m;
import p526wq.EnumC12529l;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.InterfaceC13215h;
import p581ym.Snapshot;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003%#'B\u0019\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032$\u0010\u0014\u001a 0\u0013R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001f\u001a\u00020\u001e*\u00180\u001aR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "deviceFeatureRequestWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/a$a;)V", "props", "Lym/i;", "snapshot", "t", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lym/i;)Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "renderProps", "renderState", "Lym/k$a;", "context", "u", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;Lym/k$a;)Ljava/lang/Object;", "state", "D", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;)Lym/i;", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "output", "", "r", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "s", "()V", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "DeviceFeatureRequestState", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DeviceFeatureRequestWorkflow extends AbstractC13218k<Props, DeviceFeatureRequestState, Output, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3852a.a deviceFeatureRequestWorkerFactory;

    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "CheckDeviceFeatureState", "ShowDeviceFeaturePrompt", "RequestDeviceFeature", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class DeviceFeatureRequestState implements Parcelable {

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class CheckDeviceFeatureState extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final CheckDeviceFeatureState f15760a = new CheckDeviceFeatureState();

            @NotNull
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new C3830a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3830a implements Parcelable.Creator<CheckDeviceFeatureState> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CheckDeviceFeatureState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckDeviceFeatureState.f15760a;
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Complete extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final Complete f15761a = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new C3831a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3831a implements Parcelable.Creator<Complete> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.f15761a;
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class RequestDeviceFeature extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final RequestDeviceFeature f15762a = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new C3832a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3832a implements Parcelable.Creator<RequestDeviceFeature> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.f15762a;
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

        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final ShowDeviceFeaturePrompt f15763a = new ShowDeviceFeaturePrompt();

            @NotNull
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new C3833a();

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3833a implements Parcelable.Creator<ShowDeviceFeaturePrompt> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ShowDeviceFeaturePrompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowDeviceFeaturePrompt.f15763a;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ DeviceFeatureRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public DeviceFeatureRequestState() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "deviceFeatureState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "()Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Output {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
            return (other instanceof Output) && Intrinsics.m31980c(this.deviceFeatureState, ((Output) other).deviceFeatureState);
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
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "", "Lrp/u;", "feature", "", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalPositiveButton", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lrp/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/u;", "()Lrp/u;", "b", "Ljava/lang/String;", "e", "c", "d", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Props {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC11055u feature;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureRationale;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureModalPositiveButton;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String requestFeatureModalNegativeButton;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        public Props(@NotNull EnumC11055u feature, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable StepStyle stepStyle) {
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
        public final EnumC11055u getFeature() {
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
            return this.feature == props.feature && Intrinsics.m31980c(this.requestFeatureTitle, props.requestFeatureTitle) && Intrinsics.m31980c(this.requestFeatureRationale, props.requestFeatureRationale) && Intrinsics.m31980c(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && Intrinsics.m31980c(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && Intrinsics.m31980c(this.styles, props.styles);
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1", m39664f = "DeviceFeatureRequestWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3836c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15771t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC13218k<Props, DeviceFeatureRequestState, Output, Object>.a f15773v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Props f15774w;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$b, com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$DeviceFeatureRequestState, com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3836c(AbstractC13218k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a aVar, Props props, InterfaceC9557b<? super C3836c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15773v = aVar;
            this.f15774w = props;
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m19040s(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, AbstractC13225r.c cVar) {
            deviceFeatureRequestWorkflow.m19019r(cVar, new DeviceFeatureState(props.getFeature(), EnumC11057v.Success));
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: t */
        public static final Unit m19041t(AbstractC13225r.c cVar) {
            cVar.m48903e(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f15763a);
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return DeviceFeatureRequestWorkflow.this.new C3836c(this.f15773v, this.f15774w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f15771t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (C4012a.m20431b(DeviceFeatureRequestWorkflow.this.applicationContext)) {
                InterfaceC13215h<AbstractC13225r<? super Props, DeviceFeatureRequestState, ? extends Output>> interfaceC13215hMo48837d = this.f15773v.mo48837d();
                final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = DeviceFeatureRequestWorkflow.this;
                final Props props = this.f15774w;
                interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DeviceFeatureRequestWorkflow.C3836c.m19040s(deviceFeatureRequestWorkflow, props, (AbstractC13225r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f15773v.mo48837d().mo17905a(C13233z.m48946d(DeviceFeatureRequestWorkflow.this, null, new Function1() { // from class: rp.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DeviceFeatureRequestWorkflow.C3836c.m19041t((AbstractC13225r.c) obj2);
                    }
                }, 1, null));
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3836c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public DeviceFeatureRequestWorkflow(@NotNull Context applicationContext, @NotNull C3852a.a deviceFeatureRequestWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        this.applicationContext = applicationContext;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m19000A(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.m19019r(action, new DeviceFeatureState(props.getFeature(), EnumC11057v.Success));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m19001B(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.m19019r(action, new DeviceFeatureState(props.getFeature(), EnumC11057v.Failure));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m19002C(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.m19019r(action, new DeviceFeatureState(props.getFeature(), EnumC11057v.SettingsLaunched));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m19013v(AbstractC13218k.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.m19014w((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m19014w(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(DeviceFeatureRequestState.RequestDeviceFeature.f15762a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m19015x(AbstractC13218k.a aVar, final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, final Props props) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.m19016y(this.f39038a, props, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m19016y(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.m19019r(action, new DeviceFeatureState(props.getFeature(), EnumC11057v.Failure));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final AbstractC13225r m19017z(final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, final Props props, C3852a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C3852a.b.c) {
            return C13233z.m48946d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.m19000A(this.f39010a, props, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C3852a.b.a) {
            return C13233z.m48946d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.m19001B(this.f39016a, props, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof C3852a.b.C14135b)) {
            throw new C7345l();
        }
        deviceFeatureRequestWorkflow.m19020s();
        return C13233z.m48946d(deviceFeatureRequestWorkflow, null, new Function1() { // from class: rp.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.m19002C(this.f39031a, props, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull DeviceFeatureRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C0388q.m1447a(state);
    }

    /* JADX INFO: renamed from: r */
    public final void m19019r(AbstractC13225r<? super Props, DeviceFeatureRequestState, Output>.c cVar, DeviceFeatureState deviceFeatureState) {
        cVar.m48902d(new Output(deviceFeatureState));
    }

    /* JADX INFO: renamed from: s */
    public final void m19020s() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public DeviceFeatureRequestState mo16430d(@NotNull Props props, @Nullable Snapshot snapshot) {
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
            DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) parcelable;
            if (deviceFeatureRequestState != null) {
                return deviceFeatureRequestState;
            }
        }
        return DeviceFeatureRequestState.CheckDeviceFeatureState.f15760a;
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull final Props renderProps, @NotNull DeviceFeatureRequestState renderState, @NotNull final AbstractC13218k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.m31980c(renderState, DeviceFeatureRequestState.CheckDeviceFeatureState.f15760a)) {
            context.mo48835b("check_device_feature_state", new C3836c(context, renderProps, null));
            return null;
        }
        if (!Intrinsics.m31980c(renderState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.f15763a)) {
            if (!Intrinsics.m31980c(renderState, DeviceFeatureRequestState.RequestDeviceFeature.f15762a)) {
                if (Intrinsics.m31980c(renderState, DeviceFeatureRequestState.Complete.f15761a)) {
                    return null;
                }
                throw new C7345l();
            }
            C13230w.m48937l(context, this.deviceFeatureRequestWorkerFactory.mo19142a(), C7731d0.m32011k(C3852a.class), "", new Function1() { // from class: rp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.m19017z(this.f39003a, renderProps, (C3852a.b) obj);
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
                return DeviceFeatureRequestWorkflow.m19013v(context, this);
            }
        };
        String requestFeatureModalNegativeButton = renderProps.getRequestFeatureModalNegativeButton();
        if (requestFeatureModalNegativeButton == null) {
            requestFeatureModalNegativeButton = "Cancel";
        }
        return new C12530m(new C11018g0(requestFeatureTitle, requestFeatureRationale, requestFeatureModalPositiveButton, styles, function0, requestFeatureModalNegativeButton, new Function0() { // from class: rp.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceFeatureRequestWorkflow.m19015x(context, this, renderProps);
            }
        }), EnumC12529l.NONE);
    }
}
