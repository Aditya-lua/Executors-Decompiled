package fq;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import ln.Snapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003+')B)\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u00020\u0010*\u00180\u0013R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00032$\u0010!\u001a 0 R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lfq/n1;", "Lln/k;", "Lfq/n1$c;", "Lfq/n1$b;", "Lfq/n1$a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lfq/o0$a;", "permissionRequestDialogWorkerFactory", "Lfq/u;", "deviceFeatureRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lfq/o0$a;Lfq/u;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", BuildConfig.FLAVOR, "I", "()V", "Lln/r$c;", "Lln/r;", "Lfq/t1;", "output", "G", "(Lln/r$c;Lfq/t1;)V", "props", "Lln/i;", "snapshot", "H", "(Lfq/n1$c;Lln/i;)Lfq/n1$b;", "renderProps", "renderState", "Lln/k$a;", "context", "J", "(Lfq/n1$c;Lfq/n1$b;Lln/k$a;)Ljava/lang/Object;", "state", "h0", "(Lfq/n1$b;)Lln/i;", "a", "Landroid/content/Context;", "b", "Lfq/o0$a;", "c", "Lfq/u;", "d", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n1 extends ln.k<Props, b, Output, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o0.a permissionRequestDialogWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u deviceFeatureRequestWorkflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: fq.n1$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfq/n1$a;", "Landroid/os/Parcelable;", "Lfq/t1;", "permissionState", "<init>", "(Lfq/t1;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lfq/t1;", "()Lfq/t1;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Output implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Output> CREATOR = new C0305a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PermissionState permissionState;

        /* JADX INFO: renamed from: fq.n1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0305a implements Parcelable.Creator<Output> {
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lfq/n1$b;", "Landroid/os/Parcelable;", "c", "b", "h", "f", "e", "a", "g", "d", "Lfq/n1$b$a;", "Lfq/n1$b$b;", "Lfq/n1$b$c;", "Lfq/n1$b$d;", "Lfq/n1$b$e;", "Lfq/n1$b$f;", "Lfq/n1$b$g;", "Lfq/n1$b$h;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$a;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f16466a = new a();

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0306a();

            /* JADX INFO: renamed from: fq.n1$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0306a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f16466a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
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

        /* JADX INFO: renamed from: fq.n1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$b;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0307b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0307b f16467a = new C0307b();

            @NotNull
            public static final Parcelable.Creator<C0307b> CREATOR = new a();

            /* JADX INFO: renamed from: fq.n1$b$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0307b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0307b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0307b.f16467a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0307b[] newArray(int i10) {
                    return new C0307b[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0307b);
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$c;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f16468a = new c();

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return c.f16468a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$d;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f16469a = new d();

            @NotNull
            public static final Parcelable.Creator<d> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return d.f16469a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$e;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f16470a = new e();

            @NotNull
            public static final Parcelable.Creator<e> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return e.f16470a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof e);
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$f;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f16471a = new f();

            @NotNull
            public static final Parcelable.Creator<f> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return f.f16471a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i10) {
                    return new f[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof f);
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$g;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f16472a = new g();

            @NotNull
            public static final Parcelable.Creator<g> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<g> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return g.f16472a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i10) {
                    return new g[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof g);
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfq/n1$b$h;", "Lfq/n1$b;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f16473a = new h();

            @NotNull
            public static final Parcelable.Creator<h> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<h> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return h.f16473a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i10) {
                    return new h[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof h);
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
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16484a;

        static {
            int[] iArr = new int[a0.values().length];
            try {
                iArr[a0.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a0.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16484a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16485t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Props f16487v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ln.k<Props, b, Output, Object>.a f16488w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Props props, ln.k<? super Props, b, Output, ? extends Object>.a aVar, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f16487v = props;
            this.f16488w = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(ln.r.c cVar) {
            cVar.e(b.e.f16470a);
            return Unit.f21506a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(ln.r.c cVar) {
            cVar.e(b.C0307b.f16467a);
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return n1.this.new e(this.f16487v, this.f16488w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f16485t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (y1.b(n1.this.applicationContext, this.f16487v.getPermission())) {
                this.f16488w.d().a(ln.z.d(n1.this, null, new Function1() { // from class: fq.o1
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n1.e.q((ln.r.c) obj2);
                    }
                }, 1, null));
            } else {
                this.f16488w.d().a(ln.z.d(n1.this, null, new Function1() { // from class: fq.p1
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n1.e.r((ln.r.c) obj2);
                    }
                }, 1, null));
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16489t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ln.k<Props, b, Output, Object>.a f16490u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n1 f16491v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Props f16492w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ln.k<? super Props, b, Output, ? extends Object>.a aVar, n1 n1Var, Props props, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f16490u = aVar;
            this.f16491v = n1Var;
            this.f16492w = props;
        }

        public static final Unit p(n1 n1Var, Props props, ln.r.c cVar) {
            n1Var.G(cVar, new PermissionState(props.getPermission(), s1.PermissionGranted));
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f16490u, this.f16491v, this.f16492w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f16489t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ln.h<ln.r<? super Props, b, ? extends Output>> hVarD = this.f16490u.d();
            final n1 n1Var = this.f16491v;
            final Props props = this.f16492w;
            hVarD.a(ln.z.d(n1Var, null, new Function1() { // from class: fq.q1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return n1.f.p(n1Var, props, (ln.r.c) obj2);
                }
            }, 1, null));
            return Unit.f21506a;
        }
    }

    public n1(@NotNull Context applicationContext, @NotNull o0.a permissionRequestDialogWorkerFactory, @NotNull u deviceFeatureRequestWorkflow, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestDialogWorkerFactory, "permissionRequestDialogWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestDialogWorkerFactory = permissionRequestDialogWorkerFactory;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final Unit K(ln.k.a aVar, n1 n1Var, final boolean z10) {
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.l1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.L(z10, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit L(boolean z10, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            action.e(b.h.f16473a);
        } else {
            action.e(b.f.f16471a);
        }
        return Unit.f21506a;
    }

    public static final ln.r M(final n1 n1Var, final ln.k.a aVar, final Props props, o0.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, o0.b.C0308b.f16500a)) {
            return ln.z.d(n1Var, null, new Function1() { // from class: fq.w0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.Q(aVar, n1Var, (ln.r.c) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.c(it, o0.b.a.f16499a)) {
            return ln.z.d(n1Var, null, new Function1() { // from class: fq.x0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.N(aVar, n1Var, props, (ln.r.c) obj);
                }
            }, 1, null);
        }
        throw new zt.l();
    }

    public static final Unit N(ln.k.a aVar, final n1 n1Var, final Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((Props) action.b()).getOptional()) {
            aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.z0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.O(this.f16560a, props, (ln.r.c) obj);
                }
            }, 1, null));
        } else {
            aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.a1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.P((ln.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f21506a;
    }

    public static final Unit O(n1 n1Var, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        n1Var.G(action, new PermissionState(props.getPermission(), s1.PermissionRejected));
        return Unit.f21506a;
    }

    public static final Unit P(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(b.a.f16466a);
        return Unit.f21506a;
    }

    public static final Unit Q(ln.k.a aVar, n1 n1Var, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.y0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.R((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit R(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(b.e.f16470a);
        return Unit.f21506a;
    }

    public static final ln.r S(final n1 n1Var, final ln.k.a aVar, final Props props, final u.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ln.z.d(n1Var, null, new Function1() { // from class: fq.v0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.T(it, aVar, n1Var, props, (ln.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit T(u.Output bVar, ln.k.a aVar, final n1 n1Var, final Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i10 = d.f16484a[bVar.getDeviceFeatureState().getResult().ordinal()];
        if (i10 == 1) {
            aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.d1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.U(this.f16387a, props, (ln.r.c) obj);
                }
            }, 1, null));
        } else if (i10 == 2) {
            n1Var.G(action, new PermissionState(props.getPermission(), s1.PermissionRejected));
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.e1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.V(this.f16390a, props, (ln.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f21506a;
    }

    public static final Unit U(n1 n1Var, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        n1Var.G(action, new PermissionState(props.getPermission(), s1.PermissionGranted));
        return Unit.f21506a;
    }

    public static final Unit V(n1 n1Var, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        n1Var.G(action, new PermissionState(props.getPermission(), s1.SettingsLaunched));
        return Unit.f21506a;
    }

    public static final Unit W(final ln.k.a aVar, final n1 n1Var, final Props props, final boolean z10) {
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.t0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.X(z10, n1Var, props, aVar, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit X(boolean z10, n1 n1Var, Props props, ln.k.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            n1Var.G(action, new PermissionState(props.getPermission(), s1.PermissionRejected));
        } else {
            aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.c1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.Y((ln.r.c) obj);
                }
            }, 1, null));
        }
        return Unit.f21506a;
    }

    public static final Unit Y(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(b.g.f16472a);
        return Unit.f21506a;
    }

    public static final Unit Z(final n1 n1Var, ln.k.a aVar, final Props props) {
        n1Var.I();
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.u0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.a0(this.f16541a, props, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit a0(n1 n1Var, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        n1Var.G(action, new PermissionState(props.getPermission(), s1.SettingsLaunched));
        return Unit.f21506a;
    }

    public static final Unit b0(ln.k.a aVar, final n1 n1Var, final Props props) {
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.m1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.c0(this.f16454a, props, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit c0(n1 n1Var, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        n1Var.G(action, new PermissionState(props.getPermission(), s1.PermissionRejected));
        return Unit.f21506a;
    }

    public static final Unit d0(ln.k.a aVar, n1 n1Var) {
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.s0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.e0((ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit e0(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(b.f.f16471a);
        return Unit.f21506a;
    }

    public static final Unit f0(ln.k.a aVar, final n1 n1Var, final Props props) {
        aVar.d().a(ln.z.d(n1Var, null, new Function1() { // from class: fq.r0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n1.g0(this.f16513a, props, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit g0(n1 n1Var, Props props, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        n1Var.G(action, new PermissionState(props.getPermission(), s1.PermissionRejected));
        return Unit.f21506a;
    }

    public final void G(ln.r<? super Props, b, Output>.c cVar, PermissionState permissionState) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(x1.c(permissionState.getPermission()), x1.b(permissionState.getResult()), null, 4, null), false, 2, null);
        cVar.d(new Output(permissionState));
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b d(@NotNull Props props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ew.h hVarB = snapshot.b();
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
            b bVar = (b) parcelable;
            if (bVar != null) {
                return bVar;
            }
        }
        return b.c.f16468a;
    }

    public final void I() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    @Override // ln.k
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull final Props renderProps, @NotNull b renderState, @NotNull final ln.k<? super Props, b, Output, ? extends Object>.a context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.c(renderState, b.c.f16468a)) {
            context.b("check_permission_state", new e(renderProps, context, null));
            return null;
        }
        if (Intrinsics.c(renderState, b.C0307b.f16467a)) {
            return new kr.m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: fq.q0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.K(context, this, ((Boolean) obj).booleanValue());
                }
            }), kr.l.NONE);
        }
        if (Intrinsics.c(renderState, b.h.f16473a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(x1.c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(jq.g.D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: fq.b1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n1.d0(context, this);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(jq.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            return new kr.m(new l0(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: fq.f1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n1.f0(context, this, renderProps);
                }
            }), kr.l.NONE);
        }
        if (Intrinsics.c(renderState, b.f.f16471a)) {
            ln.w.l(context, this.permissionRequestDialogWorkerFactory.a(renderProps.getPermission()), p001kotlin.jvm.internal.d0.k(o0.class), BuildConfig.FLAVOR, new Function1() { // from class: fq.g1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.M(this.f16396a, context, renderProps, (o0.b) obj);
                }
            });
            return null;
        }
        if (Intrinsics.c(renderState, b.e.f16470a)) {
            if (renderProps.q()) {
                return ln.a.C0433a.a(context, this.deviceFeatureRequestWorkflow, new u.Props(x1.a(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new Function1() { // from class: fq.h1
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n1.S(this.f16405a, context, renderProps, (u.Output) obj);
                    }
                }, 4, null);
            }
            context.b("request_device_feature", new f(context, this, renderProps, null));
            return null;
        }
        if (Intrinsics.c(renderState, b.a.f16466a)) {
            return new kr.m(new OldCheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: fq.i1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n1.W(context, this, renderProps, ((Boolean) obj).booleanValue());
                }
            }), kr.l.NONE);
        }
        if (!Intrinsics.c(renderState, b.g.f16472a)) {
            if (Intrinsics.c(renderState, b.d.f16469a)) {
                return null;
            }
            throw new zt.l();
        }
        String title2 = renderProps.getTitle();
        String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
        String positiveButtonText2 = renderProps.getPositiveButtonText();
        if (positiveButtonText2 == null) {
            positiveButtonText2 = this.applicationContext.getString(jq.g.E);
            Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
        }
        String str2 = positiveButtonText2;
        StepStyle styles2 = renderProps.getStyles();
        Function0 function1 = new Function0() { // from class: fq.j1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.Z(this.f16427a, context, renderProps);
            }
        };
        String negativeButtonText2 = renderProps.getNegativeButtonText();
        if (negativeButtonText2 == null) {
            negativeButtonText2 = this.applicationContext.getString(jq.g.C);
            Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
        }
        return new kr.m(new l0(title2, rationaleWhenPermanentlyDenied, str2, styles2, function1, negativeButtonText2, new Function0() { // from class: fq.k1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.b0(context, this, renderProps);
            }
        }), kr.l.NONE);
    }

    @Override // ln.k
    @NotNull
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return nn.r.a(state);
    }

    /* JADX INFO: renamed from: fq.n1$c, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b4\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010*¨\u0006<"}, d2 = {"Lfq/n1$c;", "Landroid/os/Parcelable;", "Lfq/n0;", "permission", BuildConfig.FLAVOR, "optional", BuildConfig.FLAVOR, Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lfq/n0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq/n0;", "k", "()Lfq/n0;", "b", "Z", "j", "()Z", "c", "Ljava/lang/String;", "getTitle", "d", "n", "e", "o", "f", "l", "g", "i", "h", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "q", "isPermissionLocation", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Props implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Props> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n0 permission;

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

        /* JADX INFO: renamed from: fq.n1$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Props> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Props createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Props(n0.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(Props.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Props[] newArray(int i10) {
                return new Props[i10];
            }
        }

        public Props(@NotNull n0 permission, boolean z10, @NotNull String title, @NotNull String rationale, @NotNull String rationaleWhenPermanentlyDenied, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable StepStyle stepStyle) {
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
        public final n0 getPermission() {
            return this.permission;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
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
            n0 n0Var = this.permission;
            return n0Var == n0.RoughLocation || n0Var == n0.PreciseLocation;
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

        public /* synthetic */ Props(n0 n0Var, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyle stepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(n0Var, (i10 & 2) != 0 ? false : z10, str, str2, str3, str4, str5, (i10 & Barcode.FORMAT_ITF) != 0 ? null : str6, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str7, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str8, stepStyle);
        }
    }
}
