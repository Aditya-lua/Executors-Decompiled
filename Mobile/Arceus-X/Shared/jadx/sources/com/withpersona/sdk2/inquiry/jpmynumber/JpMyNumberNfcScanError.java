package com.withpersona.sdk2.inquiry.jpmynumber;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "Landroid/os/Parcelable;", "<init>", "()V", "", "", "a", "()Ljava/util/Map;", "ChipLocked", "IncorrectPasswordLimitedRetries", "IncorrectPasswordUnlimitedRetries", "InvalidPasswordFormat", "UnsupportedVersion", "NfcDisabled", "NfcError", "Timeout", "UserCancelled", "UnknownError", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UserCancelled;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class JpMyNumberNfcScanError implements Parcelable {

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ChipLocked extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<ChipLocked> CREATOR = new C3748a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$ChipLocked$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3748a implements Parcelable.Creator<ChipLocked> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChipLocked createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChipLocked(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChipLocked[] newArray(int i10) {
                return new ChipLocked[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChipLocked(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChipLocked) && Intrinsics.m31980c(this.details, ((ChipLocked) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChipLocked(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "retriesRemaining", "", "details", "<init>", "(ILjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "g", "c", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class IncorrectPasswordLimitedRetries extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<IncorrectPasswordLimitedRetries> CREATOR = new C3749a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int retriesRemaining;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3749a implements Parcelable.Creator<IncorrectPasswordLimitedRetries> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordLimitedRetries createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncorrectPasswordLimitedRetries(parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordLimitedRetries[] newArray(int i10) {
                return new IncorrectPasswordLimitedRetries[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectPasswordLimitedRetries(int i10, @NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.retriesRemaining = i10;
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncorrectPasswordLimitedRetries)) {
                return false;
            }
            IncorrectPasswordLimitedRetries incorrectPasswordLimitedRetries = (IncorrectPasswordLimitedRetries) other;
            return this.retriesRemaining == incorrectPasswordLimitedRetries.retriesRemaining && Intrinsics.m31980c(this.details, incorrectPasswordLimitedRetries.details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getRetriesRemaining() {
            return this.retriesRemaining;
        }

        public int hashCode() {
            return (Integer.hashCode(this.retriesRemaining) * 31) + this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "IncorrectPasswordLimitedRetries(retriesRemaining=" + this.retriesRemaining + ", details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.retriesRemaining);
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class IncorrectPasswordUnlimitedRetries extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<IncorrectPasswordUnlimitedRetries> CREATOR = new C3750a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3750a implements Parcelable.Creator<IncorrectPasswordUnlimitedRetries> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordUnlimitedRetries createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncorrectPasswordUnlimitedRetries(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordUnlimitedRetries[] newArray(int i10) {
                return new IncorrectPasswordUnlimitedRetries[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectPasswordUnlimitedRetries(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IncorrectPasswordUnlimitedRetries) && Intrinsics.m31980c(this.details, ((IncorrectPasswordUnlimitedRetries) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "IncorrectPasswordUnlimitedRetries(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class InvalidPasswordFormat extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<InvalidPasswordFormat> CREATOR = new C3751a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$InvalidPasswordFormat$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3751a implements Parcelable.Creator<InvalidPasswordFormat> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InvalidPasswordFormat createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvalidPasswordFormat(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InvalidPasswordFormat[] newArray(int i10) {
                return new InvalidPasswordFormat[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidPasswordFormat(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidPasswordFormat) && Intrinsics.m31980c(this.details, ((InvalidPasswordFormat) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "InvalidPasswordFormat(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class NfcDisabled extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<NfcDisabled> CREATOR = new C3752a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$NfcDisabled$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3752a implements Parcelable.Creator<NfcDisabled> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcDisabled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NfcDisabled(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NfcDisabled[] newArray(int i10) {
                return new NfcDisabled[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcDisabled(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcDisabled) && Intrinsics.m31980c(this.details, ((NfcDisabled) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcDisabled(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class NfcError extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<NfcError> CREATOR = new C3753a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$NfcError$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3753a implements Parcelable.Creator<NfcError> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NfcError(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NfcError[] newArray(int i10) {
                return new NfcError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcError(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcError) && Intrinsics.m31980c(this.details, ((NfcError) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcError(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Timeout extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<Timeout> CREATOR = new C3754a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$Timeout$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3754a implements Parcelable.Creator<Timeout> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Timeout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Timeout[] newArray(int i10) {
                return new Timeout[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Timeout) && Intrinsics.m31980c(this.details, ((Timeout) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "Timeout(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class UnknownError extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<UnknownError> CREATOR = new C3755a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$UnknownError$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3755a implements Parcelable.Creator<UnknownError> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnknownError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnknownError(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UnknownError[] newArray(int i10) {
                return new UnknownError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownError) && Intrinsics.m31980c(this.details, ((UnknownError) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnknownError(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "", "details", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class UnsupportedVersion extends JpMyNumberNfcScanError {

        @NotNull
        public static final Parcelable.Creator<UnsupportedVersion> CREATOR = new C3756a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$UnsupportedVersion$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3756a implements Parcelable.Creator<UnsupportedVersion> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnsupportedVersion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsupportedVersion(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UnsupportedVersion[] newArray(int i10) {
                return new UnsupportedVersion[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedVersion(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedVersion) && Intrinsics.m31980c(this.details, ((UnsupportedVersion) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnsupportedVersion(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UserCancelled;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class UserCancelled extends JpMyNumberNfcScanError {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final UserCancelled f15643b = new UserCancelled();

        @NotNull
        public static final Parcelable.Creator<UserCancelled> CREATOR = new C3757a();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError$UserCancelled$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3757a implements Parcelable.Creator<UserCancelled> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserCancelled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UserCancelled.f15643b;
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UserCancelled[] newArray(int i10) {
                return new UserCancelled[i10];
            }
        }

        public UserCancelled() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof UserCancelled);
        }

        public int hashCode() {
            return -171356450;
        }

        @NotNull
        public String toString() {
            return "UserCancelled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanError.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ JpMyNumberNfcScanError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, String> m18887a() {
        if (this instanceof ChipLocked) {
            return C7690k0.m31798m(C7352s.m30477a("error", "chipLocked"), C7352s.m30477a("details", ((ChipLocked) this).getDetails()));
        }
        if (this instanceof IncorrectPasswordLimitedRetries) {
            IncorrectPasswordLimitedRetries incorrectPasswordLimitedRetries = (IncorrectPasswordLimitedRetries) this;
            return C7690k0.m31798m(C7352s.m30477a("error", "incorrectPasswordLimitedRetries"), C7352s.m30477a("details", incorrectPasswordLimitedRetries.getDetails()), C7352s.m30477a("retriesRemaining", String.valueOf(incorrectPasswordLimitedRetries.getRetriesRemaining())));
        }
        if (this instanceof IncorrectPasswordUnlimitedRetries) {
            return C7690k0.m31798m(C7352s.m30477a("error", "incorrectPasswordUnlimitedRetries"), C7352s.m30477a("details", ((IncorrectPasswordUnlimitedRetries) this).getDetails()));
        }
        if (this instanceof InvalidPasswordFormat) {
            return C7690k0.m31798m(C7352s.m30477a("error", "invalidPasswordFormat"), C7352s.m30477a("details", ((InvalidPasswordFormat) this).getDetails()));
        }
        if (this instanceof UnsupportedVersion) {
            return C7690k0.m31798m(C7352s.m30477a("error", "unsupportedVersion"), C7352s.m30477a("details", ((UnsupportedVersion) this).getDetails()));
        }
        if (this instanceof NfcDisabled) {
            return C7690k0.m31798m(C7352s.m30477a("error", "nfcDisabled"), C7352s.m30477a("details", ((NfcDisabled) this).getDetails()));
        }
        if (this instanceof NfcError) {
            return C7690k0.m31798m(C7352s.m30477a("error", "nfcError"), C7352s.m30477a("details", ((NfcError) this).getDetails()));
        }
        if (this instanceof Timeout) {
            return C7690k0.m31798m(C7352s.m30477a("error", "timeout"), C7352s.m30477a("details", ((Timeout) this).getDetails()));
        }
        if (Intrinsics.m31980c(this, UserCancelled.f15643b)) {
            return C7688j0.m31791g(C7352s.m30477a("error", "userCancelled"));
        }
        if (this instanceof UnknownError) {
            return C7690k0.m31798m(C7352s.m30477a("error", "unknownError"), C7352s.m30477a("details", ((UnknownError) this).getDetails()));
        }
        throw new C7345l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public JpMyNumberNfcScanError() {
    }
}
