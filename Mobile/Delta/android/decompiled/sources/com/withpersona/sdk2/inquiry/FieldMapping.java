package com.withpersona.sdk2.inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/FieldMapping;", "Landroid/os/Parcelable;", "sourceFieldName", "", "destinationFieldName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSourceFieldName", "()Ljava/lang/String;", "getDestinationFieldName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FieldMapping implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FieldMapping> CREATOR = new Creator();

    @NotNull
    private final String destinationFieldName;

    @NotNull
    private final String sourceFieldName;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FieldMapping> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldMapping createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FieldMapping(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldMapping[] newArray(int i10) {
            return new FieldMapping[i10];
        }
    }

    public FieldMapping(@NotNull String sourceFieldName, @NotNull String destinationFieldName) {
        Intrinsics.checkNotNullParameter(sourceFieldName, "sourceFieldName");
        Intrinsics.checkNotNullParameter(destinationFieldName, "destinationFieldName");
        this.sourceFieldName = sourceFieldName;
        this.destinationFieldName = destinationFieldName;
    }

    public static /* synthetic */ FieldMapping copy$default(FieldMapping fieldMapping, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fieldMapping.sourceFieldName;
        }
        if ((i10 & 2) != 0) {
            str2 = fieldMapping.destinationFieldName;
        }
        return fieldMapping.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceFieldName() {
        return this.sourceFieldName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDestinationFieldName() {
        return this.destinationFieldName;
    }

    @NotNull
    public final FieldMapping copy(@NotNull String sourceFieldName, @NotNull String destinationFieldName) {
        Intrinsics.checkNotNullParameter(sourceFieldName, "sourceFieldName");
        Intrinsics.checkNotNullParameter(destinationFieldName, "destinationFieldName");
        return new FieldMapping(sourceFieldName, destinationFieldName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldMapping)) {
            return false;
        }
        FieldMapping fieldMapping = (FieldMapping) other;
        return Intrinsics.c(this.sourceFieldName, fieldMapping.sourceFieldName) && Intrinsics.c(this.destinationFieldName, fieldMapping.destinationFieldName);
    }

    @NotNull
    public final String getDestinationFieldName() {
        return this.destinationFieldName;
    }

    @NotNull
    public final String getSourceFieldName() {
        return this.sourceFieldName;
    }

    public int hashCode() {
        return (this.sourceFieldName.hashCode() * 31) + this.destinationFieldName.hashCode();
    }

    @NotNull
    public String toString() {
        return "FieldMapping(sourceFieldName=" + this.sourceFieldName + ", destinationFieldName=" + this.destinationFieldName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sourceFieldName);
        dest.writeString(this.destinationFieldName);
    }
}
