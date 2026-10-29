package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.InterfaceC11874i;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "Landroid/os/Parcelable;", "Ho", "a", "IdAcceptedResponse", "ClassificationFailedResponse", "IdRejectedResponse", "Unknown", "IdClassesForCountry", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface AutoClassifyResponse extends Parcelable {

    /* JADX INFO: renamed from: Ho, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f14129a;

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "idClassesByCountries", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class ClassificationFailedResponse implements AutoClassifyResponse {

        @NotNull
        public static final Parcelable.Creator<ClassificationFailedResponse> CREATOR = new C3556a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<IdClassesForCountry> idClassesByCountries;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$ClassificationFailedResponse$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3556a implements Parcelable.Creator<ClassificationFailedResponse> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClassificationFailedResponse createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(IdClassesForCountry.CREATOR.createFromParcel(parcel));
                }
                return new ClassificationFailedResponse(arrayList);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ClassificationFailedResponse[] newArray(int i10) {
                return new ClassificationFailedResponse[i10];
            }
        }

        public ClassificationFailedResponse(@NotNull List<IdClassesForCountry> idClassesByCountries) {
            Intrinsics.checkNotNullParameter(idClassesByCountries, "idClassesByCountries");
            this.idClassesByCountries = idClassesByCountries;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<IdClassesForCountry> m17660a() {
            return this.idClassesByCountries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<IdClassesForCountry> list = this.idClassesByCountries;
            dest.writeInt(list.size());
            Iterator<IdClassesForCountry> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "", "countryCode", "idClass", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "idConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "f", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class IdAcceptedResponse implements AutoClassifyResponse {

        @NotNull
        public static final Parcelable.Creator<IdAcceptedResponse> CREATOR = new C3557a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String countryCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String idClass;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Id idConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdAcceptedResponse$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3557a implements Parcelable.Creator<IdAcceptedResponse> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdAcceptedResponse createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdAcceptedResponse(parcel.readString(), parcel.readString(), (Id) parcel.readParcelable(IdAcceptedResponse.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IdAcceptedResponse[] newArray(int i10) {
                return new IdAcceptedResponse[i10];
            }
        }

        public IdAcceptedResponse(@NotNull String countryCode, @NotNull String idClass, @NotNull Id idConfig) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(idConfig, "idConfig");
            this.countryCode = countryCode;
            this.idClass = idClass;
            this.idConfig = idConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getIdClass() {
            return this.idClass;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Id getIdConfig() {
            return this.idConfig;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.countryCode);
            dest.writeString(this.idClass);
            dest.writeParcelable(this.idConfig, flags);
        }
    }

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Landroid/os/Parcelable;", "", "countryName", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "idConfigs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class IdClassesForCountry implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdClassesForCountry> CREATOR = new C3558a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String countryName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String countryCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final List<Id> idConfigs;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdClassesForCountry$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3558a implements Parcelable.Creator<IdClassesForCountry> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdClassesForCountry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(IdClassesForCountry.class.getClassLoader()));
                }
                return new IdClassesForCountry(string, string2, arrayList);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IdClassesForCountry[] newArray(int i10) {
                return new IdClassesForCountry[i10];
            }
        }

        public IdClassesForCountry(@NotNull String countryName, @NotNull String countryCode, @NotNull List<Id> idConfigs) {
            Intrinsics.checkNotNullParameter(countryName, "countryName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(idConfigs, "idConfigs");
            this.countryName = countryName;
            this.countryCode = countryCode;
            this.idConfigs = idConfigs;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCountryName() {
            return this.countryName;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final List<Id> m17670g() {
            return this.idConfigs;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.countryName);
            dest.writeString(this.countryCode);
            List<Id> list = this.idConfigs;
            dest.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "idClassesByCountries", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class IdRejectedResponse implements AutoClassifyResponse {

        @NotNull
        public static final Parcelable.Creator<IdRejectedResponse> CREATOR = new C3559a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<IdClassesForCountry> idClassesByCountries;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdRejectedResponse$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3559a implements Parcelable.Creator<IdRejectedResponse> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdRejectedResponse createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(IdClassesForCountry.CREATOR.createFromParcel(parcel));
                }
                return new IdRejectedResponse(arrayList);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IdRejectedResponse[] newArray(int i10) {
                return new IdRejectedResponse[i10];
            }
        }

        public IdRejectedResponse(@NotNull List<IdClassesForCountry> idClassesByCountries) {
            Intrinsics.checkNotNullParameter(idClassesByCountries, "idClassesByCountries");
            this.idClassesByCountries = idClassesByCountries;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<IdClassesForCountry> m17673a() {
            return this.idClassesByCountries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<IdClassesForCountry> list = this.idClassesByCountries;
            dest.writeInt(list.size());
            Iterator<IdClassesForCountry> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Unknown implements AutoClassifyResponse {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Unknown f14128a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new C3560a();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$Unknown$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3560a implements Parcelable.Creator<Unknown> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f14128a;
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Unknown[] newArray(int i10) {
                return new Unknown[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -402570646;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;", "", "<init>", "()V", "Lum/h$e;", "a", "()Lum/h$e;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f14129a = new Companion();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC11873h.e m17678a() {
            C12232b c12232bM45368e = C12232b.m45364b(AutoClassifyResponse.class, "responseType").m45366c(Unknown.f14128a).m45368e(IdAcceptedResponse.class, "id_accepted").m45368e(ClassificationFailedResponse.class, "classification_failed").m45368e(IdRejectedResponse.class, "id_rejected");
            Intrinsics.checkNotNullExpressionValue(c12232bM45368e, "withSubtype(...)");
            return c12232bM45368e;
        }
    }
}
