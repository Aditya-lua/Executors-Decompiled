package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zo.a0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "Transitioning", "UpdateInquirySession", "CheckingForNextState", "TransitioningBack", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$Transitioning;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$TransitioningBack;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$UpdateInquirySession;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransitionStatus implements Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lzo/a0;", "pollingMode", "", "canReuseWorkflow", "<init>", "(Lzo/a0;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lzo/a0;", "f", "()Lzo/a0;", "b", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckingForNextState extends TransitionStatus {

        @NotNull
        public static final Parcelable.Creator<CheckingForNextState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final a0 pollingMode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean canReuseWorkflow;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CheckingForNextState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckingForNextState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckingForNextState(a0.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CheckingForNextState[] newArray(int i10) {
                return new CheckingForNextState[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CheckingForNextState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanReuseWorkflow() {
            return this.canReuseWorkflow;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckingForNextState)) {
                return false;
            }
            CheckingForNextState checkingForNextState = (CheckingForNextState) other;
            return this.pollingMode == checkingForNextState.pollingMode && this.canReuseWorkflow == checkingForNextState.canReuseWorkflow;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final a0 getPollingMode() {
            return this.pollingMode;
        }

        public int hashCode() {
            return (this.pollingMode.hashCode() * 31) + Boolean.hashCode(this.canReuseWorkflow);
        }

        @NotNull
        public String toString() {
            return "CheckingForNextState(pollingMode=" + this.pollingMode + ", canReuseWorkflow=" + this.canReuseWorkflow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.pollingMode.name());
            dest.writeInt(this.canReuseWorkflow ? 1 : 0);
        }

        public /* synthetic */ CheckingForNextState(a0 a0Var, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? a0.Blocking : a0Var, (i10 & 2) != 0 ? false : z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckingForNextState(@NotNull a0 pollingMode, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
            this.pollingMode = pollingMode;
            this.canReuseWorkflow = z10;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$Transitioning;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transitioning extends TransitionStatus {

        @NotNull
        public static final Parcelable.Creator<Transitioning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final TransitionWorker.TransitionData transitionData;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Transitioning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Transitioning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transitioning(TransitionWorker.TransitionData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Transitioning[] newArray(int i10) {
                return new Transitioning[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transitioning(@NotNull TransitionWorker.TransitionData transitionData) {
            super(null);
            Intrinsics.checkNotNullParameter(transitionData, "transitionData");
            this.transitionData = transitionData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TransitionWorker.TransitionData getTransitionData() {
            return this.transitionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transitioning) && Intrinsics.c(this.transitionData, ((Transitioning) other).transitionData);
        }

        public int hashCode() {
            return this.transitionData.hashCode();
        }

        @NotNull
        public String toString() {
            return "Transitioning(transitionData=" + this.transitionData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.transitionData.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$TransitioningBack;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransitioningBack extends TransitionStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final TransitioningBack f11381a = new TransitioningBack();

        @NotNull
        public static final Parcelable.Creator<TransitioningBack> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransitioningBack> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransitioningBack createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransitioningBack.f11381a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TransitioningBack[] newArray(int i10) {
                return new TransitioningBack[i10];
            }
        }

        public TransitioningBack() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TransitioningBack);
        }

        public int hashCode() {
            return -593165066;
        }

        @NotNull
        public String toString() {
            return "TransitioningBack";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$UpdateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextStep", "", "canReuseWorkflow", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "f", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "b", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateInquirySession extends TransitionStatus {

        @NotNull
        public static final Parcelable.Creator<UpdateInquirySession> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final InquiryState nextStep;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean canReuseWorkflow;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateInquirySession> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UpdateInquirySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateInquirySession((InquiryState) parcel.readParcelable(UpdateInquirySession.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UpdateInquirySession[] newArray(int i10) {
                return new UpdateInquirySession[i10];
            }
        }

        public UpdateInquirySession(@Nullable InquiryState inquiryState, boolean z10) {
            super(null);
            this.nextStep = inquiryState;
            this.canReuseWorkflow = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanReuseWorkflow() {
            return this.canReuseWorkflow;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInquirySession)) {
                return false;
            }
            UpdateInquirySession updateInquirySession = (UpdateInquirySession) other;
            return Intrinsics.c(this.nextStep, updateInquirySession.nextStep) && this.canReuseWorkflow == updateInquirySession.canReuseWorkflow;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final InquiryState getNextStep() {
            return this.nextStep;
        }

        public int hashCode() {
            InquiryState inquiryState = this.nextStep;
            return ((inquiryState == null ? 0 : inquiryState.hashCode()) * 31) + Boolean.hashCode(this.canReuseWorkflow);
        }

        @NotNull
        public String toString() {
            return "UpdateInquirySession(nextStep=" + this.nextStep + ", canReuseWorkflow=" + this.canReuseWorkflow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.nextStep, flags);
            dest.writeInt(this.canReuseWorkflow ? 1 : 0);
        }
    }

    public /* synthetic */ TransitionStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TransitionStatus() {
    }
}
