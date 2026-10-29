package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Ljava/io/Closeable;", "Landroid/os/Parcelable;", "<init>", "()V", "", "close", "UiStepData", "SelfieStepData", "GovernmentIdStepData", "DocumentStepData", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$DocumentStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$UiStepData;", "inquiry-types_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class StepData implements Closeable, Parcelable {

    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$DocumentStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "Landroid/os/Parcelable;", "", "stepName", "", "Lcom/withpersona/sdk2/inquiry/types/collected_data/DocumentFile;", "documents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "close", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStepName", "b", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "inquiry-types_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class DocumentStepData extends StepData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepData> CREATOR = new C4128a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<DocumentFile> documents;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.types.collected_data.StepData$DocumentStepData$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4128a implements Parcelable.Creator<DocumentStepData> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(DocumentFile.CREATOR.createFromParcel(parcel));
                }
                return new DocumentStepData(string, arrayList);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepData[] newArray(int i10) {
                return new DocumentStepData[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentStepData(@NotNull String stepName, @NotNull List<DocumentFile> documents) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.stepName = stepName;
            this.documents = documents;
        }

        @Override // com.withpersona.sdk2.inquiry.types.collected_data.StepData, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<T> it = this.documents.iterator();
            while (it.hasNext()) {
                ((DocumentFile) it.next()).getData().delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepData)) {
                return false;
            }
            DocumentStepData documentStepData = (DocumentStepData) other;
            return Intrinsics.m31980c(this.stepName, documentStepData.stepName) && Intrinsics.m31980c(this.documents, documentStepData.documents);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.documents.hashCode();
        }

        @NotNull
        public String toString() {
            return "DocumentStepData(stepName=" + this.stepName + ", documents=" + this.documents + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.stepName);
            List<DocumentFile> list = this.documents;
            dest.writeInt(list.size());
            Iterator<DocumentFile> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "", "stepName", "", "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;", "captures", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "idDetails", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;)V", "", "close", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStepName", "b", "Ljava/util/List;", "getCaptures", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "getIdDetails", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "inquiry-types_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class GovernmentIdStepData extends StepData {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new C4129a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentIdCapture> captures;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final CollectedGovernmentIdDetails idDetails;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.types.collected_data.StepData$GovernmentIdStepData$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4129a implements Parcelable.Creator<GovernmentIdStepData> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(GovernmentIdCapture.CREATOR.createFromParcel(parcel));
                }
                return new GovernmentIdStepData(string, arrayList, CollectedGovernmentIdDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepData[] newArray(int i10) {
                return new GovernmentIdStepData[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentIdStepData(@NotNull String stepName, @NotNull List<GovernmentIdCapture> captures, @NotNull CollectedGovernmentIdDetails idDetails) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(captures, "captures");
            Intrinsics.checkNotNullParameter(idDetails, "idDetails");
            this.stepName = stepName;
            this.captures = captures;
            this.idDetails = idDetails;
        }

        @Override // com.withpersona.sdk2.inquiry.types.collected_data.StepData, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<T> it = this.captures.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((GovernmentIdCapture) it.next()).m20967d3().iterator();
                while (it2.hasNext()) {
                    ((GovernmentIdCapture.Frame) it2.next()).getData().delete();
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepData)) {
                return false;
            }
            GovernmentIdStepData governmentIdStepData = (GovernmentIdStepData) other;
            return Intrinsics.m31980c(this.stepName, governmentIdStepData.stepName) && Intrinsics.m31980c(this.captures, governmentIdStepData.captures) && Intrinsics.m31980c(this.idDetails, governmentIdStepData.idDetails);
        }

        public int hashCode() {
            return (((this.stepName.hashCode() * 31) + this.captures.hashCode()) * 31) + this.idDetails.hashCode();
        }

        @NotNull
        public String toString() {
            return "GovernmentIdStepData(stepName=" + this.stepName + ", captures=" + this.captures + ", idDetails=" + this.idDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.stepName);
            List<GovernmentIdCapture> list = this.captures;
            dest.writeInt(list.size());
            Iterator<GovernmentIdCapture> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            this.idDetails.writeToParcel(dest, flags);
        }
    }

    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#¨\u0006("}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "", "stepName", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "centerCapture", "leftCapture", "rightCapture", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;)V", "", "close", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStepName", "b", "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "getCenterCapture", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;", "c", "getLeftCapture", "d", "getRightCapture", "inquiry-types_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class SelfieStepData extends StepData {

        @NotNull
        public static final Parcelable.Creator<SelfieStepData> CREATOR = new C4130a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final SelfieCapture centerCapture;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final SelfieCapture leftCapture;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final SelfieCapture rightCapture;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.types.collected_data.StepData$SelfieStepData$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4130a implements Parcelable.Creator<SelfieStepData> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepData(parcel.readString(), parcel.readInt() == 0 ? null : SelfieCapture.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieCapture.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelfieCapture.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepData[] newArray(int i10) {
                return new SelfieStepData[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieStepData(@NotNull String stepName, @Nullable SelfieCapture selfieCapture, @Nullable SelfieCapture selfieCapture2, @Nullable SelfieCapture selfieCapture3) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.stepName = stepName;
            this.centerCapture = selfieCapture;
            this.leftCapture = selfieCapture2;
            this.rightCapture = selfieCapture3;
        }

        @Override // com.withpersona.sdk2.inquiry.types.collected_data.StepData, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            File data;
            for (SelfieCapture selfieCapture : C7699p.m31895n(this.centerCapture, this.leftCapture, this.rightCapture)) {
                if (selfieCapture != null && (data = selfieCapture.getData()) != null) {
                    data.delete();
                }
            }
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
            return Intrinsics.m31980c(this.stepName, selfieStepData.stepName) && Intrinsics.m31980c(this.centerCapture, selfieStepData.centerCapture) && Intrinsics.m31980c(this.leftCapture, selfieStepData.leftCapture) && Intrinsics.m31980c(this.rightCapture, selfieStepData.rightCapture);
        }

        public int hashCode() {
            int iHashCode = this.stepName.hashCode() * 31;
            SelfieCapture selfieCapture = this.centerCapture;
            int iHashCode2 = (iHashCode + (selfieCapture == null ? 0 : selfieCapture.hashCode())) * 31;
            SelfieCapture selfieCapture2 = this.leftCapture;
            int iHashCode3 = (iHashCode2 + (selfieCapture2 == null ? 0 : selfieCapture2.hashCode())) * 31;
            SelfieCapture selfieCapture3 = this.rightCapture;
            return iHashCode3 + (selfieCapture3 != null ? selfieCapture3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.stepName);
            SelfieCapture selfieCapture = this.centerCapture;
            if (selfieCapture == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieCapture.writeToParcel(dest, flags);
            }
            SelfieCapture selfieCapture2 = this.leftCapture;
            if (selfieCapture2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieCapture2.writeToParcel(dest, flags);
            }
            SelfieCapture selfieCapture3 = this.rightCapture;
            if (selfieCapture3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieCapture3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$UiStepData;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;", "", "stepName", "", "", "componentParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStepName", "b", "Ljava/util/Map;", "getComponentParams", "()Ljava/util/Map;", "inquiry-types_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class UiStepData extends StepData {

        @NotNull
        public static final Parcelable.Creator<UiStepData> CREATOR = new C4131a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, Object> componentParams;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.types.collected_data.StepData$UiStepData$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4131a implements Parcelable.Creator<UiStepData> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(UiStepData.class.getClassLoader()));
                }
                return new UiStepData(string, linkedHashMap);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepData[] newArray(int i10) {
                return new UiStepData[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UiStepData(@NotNull String stepName, @NotNull Map<String, ? extends Object> componentParams) {
            super(null);
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            this.stepName = stepName;
            this.componentParams = componentParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepData)) {
                return false;
            }
            UiStepData uiStepData = (UiStepData) other;
            return Intrinsics.m31980c(this.stepName, uiStepData.stepName) && Intrinsics.m31980c(this.componentParams, uiStepData.componentParams);
        }

        public int hashCode() {
            return (this.stepName.hashCode() * 31) + this.componentParams.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiStepData(stepName=" + this.stepName + ", componentParams=" + this.componentParams + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.stepName);
            Map<String, Object> map = this.componentParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.types.collected_data.StepData.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ StepData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public StepData() {
    }
}
