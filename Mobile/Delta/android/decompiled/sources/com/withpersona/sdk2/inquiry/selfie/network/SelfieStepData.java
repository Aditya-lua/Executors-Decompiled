package com.withpersona.sdk2.inquiry.selfie.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b)\u0010\"¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "centerCapture", "leftCapture", "rightCapture", "upCapture", "downCapture", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "c", "getLeftCapture", "d", "getRightCapture", "e", "getUpCapture", "getDownCapture", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfieStepData implements StepData {

    @NotNull
    public static final Parcelable.Creator<SelfieStepData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String stepName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Selfie centerCapture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Selfie leftCapture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Selfie rightCapture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Selfie upCapture;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Selfie downCapture;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelfieStepData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelfieStepData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfieStepData(parcel.readString(), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SelfieStepData[] newArray(int i10) {
            return new SelfieStepData[i10];
        }
    }

    public SelfieStepData(@NotNull String stepName, @Nullable Selfie selfie, @Nullable Selfie selfie2, @Nullable Selfie selfie3, @Nullable Selfie selfie4, @Nullable Selfie selfie5) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.stepName = stepName;
        this.centerCapture = selfie;
        this.leftCapture = selfie2;
        this.rightCapture = selfie3;
        this.upCapture = selfie4;
        this.downCapture = selfie5;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Selfie getCenterCapture() {
        return this.centerCapture;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieStepData)) {
            return false;
        }
        SelfieStepData selfieStepData = (SelfieStepData) other;
        return Intrinsics.c(this.stepName, selfieStepData.stepName) && Intrinsics.c(this.centerCapture, selfieStepData.centerCapture) && Intrinsics.c(this.leftCapture, selfieStepData.leftCapture) && Intrinsics.c(this.rightCapture, selfieStepData.rightCapture) && Intrinsics.c(this.upCapture, selfieStepData.upCapture) && Intrinsics.c(this.downCapture, selfieStepData.downCapture);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getStepName() {
        return this.stepName;
    }

    public int hashCode() {
        int iHashCode = this.stepName.hashCode() * 31;
        Selfie selfie = this.centerCapture;
        int iHashCode2 = (iHashCode + (selfie == null ? 0 : selfie.hashCode())) * 31;
        Selfie selfie2 = this.leftCapture;
        int iHashCode3 = (iHashCode2 + (selfie2 == null ? 0 : selfie2.hashCode())) * 31;
        Selfie selfie3 = this.rightCapture;
        int iHashCode4 = (iHashCode3 + (selfie3 == null ? 0 : selfie3.hashCode())) * 31;
        Selfie selfie4 = this.upCapture;
        int iHashCode5 = (iHashCode4 + (selfie4 == null ? 0 : selfie4.hashCode())) * 31;
        Selfie selfie5 = this.downCapture;
        return iHashCode5 + (selfie5 != null ? selfie5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ", upCapture=" + this.upCapture + ", downCapture=" + this.downCapture + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.stepName);
        dest.writeParcelable(this.centerCapture, flags);
        dest.writeParcelable(this.leftCapture, flags);
        dest.writeParcelable(this.rightCapture, flags);
        dest.writeParcelable(this.upCapture, flags);
        dest.writeParcelable(this.downCapture, flags);
    }
}
