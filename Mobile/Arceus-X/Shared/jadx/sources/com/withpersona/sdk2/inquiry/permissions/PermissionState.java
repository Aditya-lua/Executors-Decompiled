package com.withpersona.sdk2.inquiry.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "Landroid/os/Parcelable;", "Lrp/i0;", "permission", "Lrp/j1;", "result", "<init>", "(Lrp/i0;Lrp/j1;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/i0;", "()Lrp/i0;", "b", "Lrp/j1;", "f", "()Lrp/j1;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PermissionState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PermissionState> CREATOR = new C3851a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC11024i0 permission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC11028j1 result;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionState$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3851a implements Parcelable.Creator<PermissionState> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PermissionState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionState(EnumC11024i0.valueOf(parcel.readString()), EnumC11028j1.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PermissionState[] newArray(int i10) {
            return new PermissionState[i10];
        }
    }

    public PermissionState(@NotNull EnumC11024i0 permission, @NotNull EnumC11028j1 result) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(result, "result");
        this.permission = permission;
        this.result = result;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC11024i0 getPermission() {
        return this.permission;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionState)) {
            return false;
        }
        PermissionState permissionState = (PermissionState) other;
        return this.permission == permissionState.permission && this.result == permissionState.result;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC11028j1 getResult() {
        return this.result;
    }

    public int hashCode() {
        return (this.permission.hashCode() * 31) + this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionState(permission=" + this.permission + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.permission.name());
        dest.writeString(this.result.name());
    }
}
