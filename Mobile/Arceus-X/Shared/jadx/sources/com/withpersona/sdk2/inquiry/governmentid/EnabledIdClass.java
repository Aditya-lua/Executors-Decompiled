package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import io.EnumC6879j2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "Landroid/os/Parcelable;", "Lio/j2;", "icon", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "", "name", "<init>", "(Lio/j2;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio/j2;", "()Lio/j2;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "c", "Ljava/lang/String;", "getName", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class EnabledIdClass implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EnabledIdClass> CREATOR = new C3481a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC6879j2 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final IdConfig idConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3481a implements Parcelable.Creator<EnabledIdClass> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnabledIdClass createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EnabledIdClass(EnumC6879j2.valueOf(parcel.readString()), IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EnabledIdClass[] newArray(int i10) {
            return new EnabledIdClass[i10];
        }
    }

    public EnabledIdClass(@NotNull EnumC6879j2 icon, @NotNull IdConfig idConfig, @NotNull String name) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(idConfig, "idConfig");
        Intrinsics.checkNotNullParameter(name, "name");
        this.icon = icon;
        this.idConfig = idConfig;
        this.name = name;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC6879j2 getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnabledIdClass)) {
            return false;
        }
        EnabledIdClass enabledIdClass = (EnabledIdClass) other;
        return this.icon == enabledIdClass.icon && Intrinsics.m31980c(this.idConfig, enabledIdClass.idConfig) && Intrinsics.m31980c(this.name, enabledIdClass.name);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final IdConfig getIdConfig() {
        return this.idConfig;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.idConfig.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "EnabledIdClass(icon=" + this.icon + ", idConfig=" + this.idConfig + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.icon.name());
        this.idConfig.writeToParcel(dest, flags);
        dest.writeString(this.name);
    }
}
