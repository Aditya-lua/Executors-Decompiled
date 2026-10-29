package com.withpersona.sdk2.inquiry.nfc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p390qp.EnumC10687a;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "Cancel", "Error", "ShowTroubleshootingTips", "ReenterDetails", "a", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Cancel;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ReenterDetails;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ShowTroubleshootingTips;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class PassportNfcReaderOutput implements Parcelable {

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Cancel;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Cancel extends PassportNfcReaderOutput {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Cancel f15691a = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new C3820a();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput$Cancel$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3820a implements Parcelable.Creator<Cancel> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.f15691a;
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Cancel[] newArray(int i10) {
                return new Cancel[i10];
            }
        }

        public Cancel() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cancel);
        }

        public int hashCode() {
            return -869674698;
        }

        @NotNull
        public String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getDebugMessage", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "getCause", "()Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Error extends PassportNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new C3821a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String debugMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final EnumC3825a cause;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput$Error$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3821a implements Parcelable.Creator<Error> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), EnumC3825a.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Error[] newArray(int i10) {
                return new Error[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@Nullable String str, @NotNull EnumC3825a cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.debugMessage = str;
            this.cause = cause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.debugMessage);
            dest.writeString(this.cause.name());
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ReenterDetails;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "", "buttonComponentName", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ReenterDetails extends PassportNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<ReenterDetails> CREATOR = new C3822a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String buttonComponentName;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput$ReenterDetails$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3822a implements Parcelable.Creator<ReenterDetails> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReenterDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReenterDetails(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReenterDetails[] newArray(int i10) {
                return new ReenterDetails[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReenterDetails(@NotNull String buttonComponentName) {
            super(null);
            Intrinsics.checkNotNullParameter(buttonComponentName, "buttonComponentName");
            this.buttonComponentName = buttonComponentName;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonComponentName() {
            return this.buttonComponentName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReenterDetails) && Intrinsics.m31980c(this.buttonComponentName, ((ReenterDetails) other).buttonComponentName);
        }

        public int hashCode() {
            return this.buttonComponentName.hashCode();
        }

        @NotNull
        public String toString() {
            return "ReenterDetails(buttonComponentName=" + this.buttonComponentName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.buttonComponentName);
        }
    }

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ShowTroubleshootingTips;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ShowTroubleshootingTips extends PassportNfcReaderOutput {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final ShowTroubleshootingTips f15695a = new ShowTroubleshootingTips();

        @NotNull
        public static final Parcelable.Creator<ShowTroubleshootingTips> CREATOR = new C3823a();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput$ShowTroubleshootingTips$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3823a implements Parcelable.Creator<ShowTroubleshootingTips> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowTroubleshootingTips createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowTroubleshootingTips.f15695a;
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowTroubleshootingTips[] newArray(int i10) {
                return new ShowTroubleshootingTips[i10];
            }
        }

        public ShowTroubleshootingTips() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ShowTroubleshootingTips);
        }

        public int hashCode() {
            return 1816015673;
        }

        @NotNull
        public String toString() {
            return "ShowTroubleshootingTips";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "Lqp/a;", "chipAuthenticationStatus", "", "submitButtonComponentName", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lqp/a;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/net/Uri;", "f", "()Landroid/net/Uri;", "b", "g", "c", "i", "d", "Lqp/a;", "()Lqp/a;", "e", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Success extends PassportNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new C3824a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final Uri dg1Uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Uri dg2Uri;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Uri sodUri;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final EnumC10687a chipAuthenticationStatus;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String submitButtonComponentName;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput$Success$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3824a implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((Uri) parcel.readParcelable(Success.class.getClassLoader()), (Uri) parcel.readParcelable(Success.class.getClassLoader()), (Uri) parcel.readParcelable(Success.class.getClassLoader()), EnumC10687a.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Success[] newArray(int i10) {
                return new Success[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@Nullable Uri uri, @Nullable Uri uri2, @Nullable Uri uri3, @NotNull EnumC10687a chipAuthenticationStatus, @NotNull String submitButtonComponentName) {
            super(null);
            Intrinsics.checkNotNullParameter(chipAuthenticationStatus, "chipAuthenticationStatus");
            Intrinsics.checkNotNullParameter(submitButtonComponentName, "submitButtonComponentName");
            this.dg1Uri = uri;
            this.dg2Uri = uri2;
            this.sodUri = uri3;
            this.chipAuthenticationStatus = chipAuthenticationStatus;
            this.submitButtonComponentName = submitButtonComponentName;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC10687a getChipAuthenticationStatus() {
            return this.chipAuthenticationStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Uri getDg1Uri() {
            return this.dg1Uri;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Uri getDg2Uri() {
            return this.dg2Uri;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final Uri getSodUri() {
            return this.sodUri;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSubmitButtonComponentName() {
            return this.submitButtonComponentName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dg1Uri, flags);
            dest.writeParcelable(this.dg2Uri, flags);
            dest.writeParcelable(this.sodUri, flags);
            dest.writeString(this.chipAuthenticationStatus.name());
            dest.writeString(this.submitButtonComponentName);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3825a {
        AuthenticationError,
        Unknown;


        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC10707a f15704d = C10708b.m40805a(m18979a());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ PassportNfcReaderOutput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PassportNfcReaderOutput() {
    }
}
