package com.withpersona.sdk2.inquiry.jpmynumber;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "Failed", "Cancel", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Cancel;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Success;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class JpMyNumberNfcReaderOutput implements Parcelable {

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Cancel;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Cancel extends JpMyNumberNfcReaderOutput {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Cancel f15627a = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new C3745a();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput$Cancel$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3745a implements Parcelable.Creator<Cancel> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.f15627a;
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
            return 738354687;
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

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "result", "", "transitionComponentName", "<init>", "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Failed extends JpMyNumberNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<Failed> CREATOR = new C3746a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final JpMyNumberNfcScanResult result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String transitionComponentName;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput$Failed$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3746a implements Parcelable.Creator<Failed> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed((JpMyNumberNfcScanResult) parcel.readParcelable(Failed.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Failed[] newArray(int i10) {
                return new Failed[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull JpMyNumberNfcScanResult result, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.transitionComponentName = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final JpMyNumberNfcScanResult getResult() {
            return this.result;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTransitionComponentName() {
            return this.transitionComponentName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.result, flags);
            dest.writeString(this.transitionComponentName);
        }
    }

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Success;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "result", "", "transitionComponentName", "<init>", "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Success extends JpMyNumberNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new C3747a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final JpMyNumberNfcScanResult result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String transitionComponentName;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput$Success$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3747a implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((JpMyNumberNfcScanResult) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Success[] newArray(int i10) {
                return new Success[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull JpMyNumberNfcScanResult result, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.transitionComponentName = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final JpMyNumberNfcScanResult getResult() {
            return this.result;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTransitionComponentName() {
            return this.transitionComponentName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.result, flags);
            dest.writeString(this.transitionComponentName);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ JpMyNumberNfcReaderOutput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public JpMyNumberNfcReaderOutput() {
    }
}
