package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import np.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "d", "a", "c", "Lcom/withpersona/sdk2/inquiry/internal/w$a;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Lcom/withpersona/sdk2/inquiry/internal/w$c;", "Lcom/withpersona/sdk2/inquiry/internal/w$d;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class w implements Parcelable {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$a;", "Lcom/withpersona/sdk2/inquiry/internal/w;", "Lnp/c0;", "pollingMode", BuildConfig.FLAVOR, "canReuseWorkflow", "<init>", "(Lnp/c0;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lnp/c0;", "f", "()Lnp/c0;", "b", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckingForNextState extends w {

        @NotNull
        public static final Parcelable.Creator<CheckingForNextState> CREATOR = new C0189a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c0 pollingMode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean canReuseWorkflow;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0189a implements Parcelable.Creator<CheckingForNextState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckingForNextState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckingForNextState(c0.valueOf(parcel.readString()), parcel.readInt() != 0);
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
        public final c0 getPollingMode() {
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

        public /* synthetic */ CheckingForNextState(c0 c0Var, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? c0.Blocking : c0Var, (i10 & 2) != 0 ? false : z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckingForNextState(@NotNull c0 pollingMode, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
            this.pollingMode = pollingMode;
            this.canReuseWorkflow = z10;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Lcom/withpersona/sdk2/inquiry/internal/w;", "Lcom/withpersona/sdk2/inquiry/internal/x$c;", "transitionData", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/x$c;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/x$c;", "()Lcom/withpersona/sdk2/inquiry/internal/x$c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transitioning extends w {

        @NotNull
        public static final Parcelable.Creator<Transitioning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final x.TransitionData transitionData;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Transitioning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Transitioning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transitioning(x.TransitionData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Transitioning[] newArray(int i10) {
                return new Transitioning[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transitioning(@NotNull x.TransitionData transitionData) {
            super(null);
            Intrinsics.checkNotNullParameter(transitionData, "transitionData");
            this.transitionData = transitionData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final x.TransitionData getTransitionData() {
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$c;", "Lcom/withpersona/sdk2/inquiry/internal/w;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f10906a = new c();

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return c.f10906a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$d;", "Lcom/withpersona/sdk2/inquiry/internal/w;", "Lcom/withpersona/sdk2/inquiry/internal/j;", "nextStep", BuildConfig.FLAVOR, "canReuseWorkflow", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/j;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/j;", "f", "()Lcom/withpersona/sdk2/inquiry/internal/j;", "b", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateInquirySession extends w {

        @NotNull
        public static final Parcelable.Creator<UpdateInquirySession> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j nextStep;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean canReuseWorkflow;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateInquirySession> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UpdateInquirySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateInquirySession((j) parcel.readParcelable(UpdateInquirySession.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UpdateInquirySession[] newArray(int i10) {
                return new UpdateInquirySession[i10];
            }
        }

        public UpdateInquirySession(@Nullable j jVar, boolean z10) {
            super(null);
            this.nextStep = jVar;
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
        public final j getNextStep() {
            return this.nextStep;
        }

        public int hashCode() {
            j jVar = this.nextStep;
            return ((jVar == null ? 0 : jVar.hashCode()) * 31) + Boolean.hashCode(this.canReuseWorkflow);
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

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public w() {
    }
}
