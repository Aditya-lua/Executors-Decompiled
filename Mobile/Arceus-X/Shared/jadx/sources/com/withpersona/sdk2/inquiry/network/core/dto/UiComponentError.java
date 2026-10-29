package com.withpersona.sdk2.inquiry.network.core.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputInternationalDb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UiComponentError implements Parcelable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion extends AbstractC11873h<UiComponentError> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getJsonType(AbstractC11878m abstractC11878m) {
            AbstractC11878m abstractC11878mMo44340v = abstractC11878m.mo44340v();
            abstractC11878mMo44340v.mo44325b();
            while (abstractC11878mMo44340v.mo44329f()) {
                if (Intrinsics.m31980c(abstractC11878mMo44340v.mo44335n(), Payload.TYPE)) {
                    return abstractC11878mMo44340v.mo44338r();
                }
                abstractC11878mMo44340v.mo44321P();
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p471um.AbstractC11873h
        @Nullable
        @InterfaceC11871f
        public UiComponentError fromJson(@NotNull AbstractC11878m abstractC11878m) {
            C11888w c11888wM44445d = new C11888w.b().m44445d();
            String jsonType = getJsonType(abstractC11878m);
            if (jsonType == null) {
                return null;
            }
            int iHashCode = jsonType.hashCode();
            if (iHashCode != -816959144) {
                if (iHashCode != -212588636) {
                    if (iHashCode == 1658531967 && jsonType.equals(InputAddress.type)) {
                        return (UiComponentError) c11888wM44445d.m44436c(UiInputAddressComponentError.class).fromJson(abstractC11878m);
                    }
                } else if (jsonType.equals(InputInternationalDb.type)) {
                    return (UiComponentError) c11888wM44445d.m44436c(UiInputInternationalDbComponentError.class).fromJson(abstractC11878m);
                }
            } else if (jsonType.equals("gov_id_nfc")) {
                return (UiComponentError) c11888wM44445d.m44436c(UiGovernmentIdNfcScanComponentError.class).fromJson(abstractC11878m);
            }
            return (UiComponentError) c11888wM44445d.m44436c(UiInputComponentError.class).fromJson(abstractC11878m);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        @InterfaceC11891z
        public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable UiComponentError uiComponentError) {
            C11888w c11888wM44445d = new C11888w.b().m44445d();
            if (uiComponentError instanceof UiGovernmentIdNfcScanComponentError) {
                c11888wM44445d.m44436c(UiGovernmentIdNfcScanComponentError.class).toJson(abstractC11885t, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputAddressComponentError) {
                c11888wM44445d.m44436c(UiInputAddressComponentError.class).toJson(abstractC11885t, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputComponentError) {
                c11888wM44445d.m44436c(UiInputComponentError.class).toJson(abstractC11885t, uiComponentError);
            } else if (uiComponentError instanceof UiInputInternationalDbComponentError) {
                c11888wM44445d.m44436c(UiInputInternationalDbComponentError.class).toJson(abstractC11885t, uiComponentError);
            } else {
                if (uiComponentError != null) {
                    throw new C7345l();
                }
                abstractC11885t.mo44381o();
            }
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class UiInputAddressComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiInputAddressComponentError> CREATOR = new Creator();

        @NotNull
        private Map<String, String> message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputAddressComponentError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputAddressComponentError(string, string2, linkedHashMap);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError[] newArray(int i10) {
                return new UiInputAddressComponentError[i10];
            }
        }

        public UiInputAddressComponentError(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError$UiInputAddressComponentError */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputAddressComponentError copy$default(UiInputAddressComponentError uiInputAddressComponentError, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiInputAddressComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiInputAddressComponentError.type;
            }
            if ((i10 & 4) != 0) {
                map = uiInputAddressComponentError.message;
            }
            return uiInputAddressComponentError.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.message;
        }

        @NotNull
        public final UiInputAddressComponentError copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return new UiInputAddressComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputAddressComponentError)) {
                return false;
            }
            UiInputAddressComponentError uiInputAddressComponentError = (UiInputAddressComponentError) obj;
            return Intrinsics.m31980c(this.name, uiInputAddressComponentError.name) && Intrinsics.m31980c(this.type, uiInputAddressComponentError.type) && Intrinsics.m31980c(this.message, uiInputAddressComponentError.message);
        }

        @NotNull
        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(@NotNull Map<String, String> map) {
            this.message = map;
        }

        @NotNull
        public String toString() {
            return "UiInputAddressComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class UiInputComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiInputComponentError> CREATOR = new Creator();

        @NotNull
        private final String message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputComponentError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError createFromParcel(Parcel parcel) {
                return new UiInputComponentError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError[] newArray(int i10) {
                return new UiInputComponentError[i10];
            }
        }

        public UiInputComponentError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = str3;
        }

        public static /* synthetic */ UiInputComponentError copy$default(UiInputComponentError uiInputComponentError, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiInputComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiInputComponentError.type;
            }
            if ((i10 & 4) != 0) {
                str3 = uiInputComponentError.message;
            }
            return uiInputComponentError.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final String component3() {
            return this.message;
        }

        @NotNull
        public final UiInputComponentError copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            return new UiInputComponentError(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputComponentError)) {
                return false;
            }
            UiInputComponentError uiInputComponentError = (UiInputComponentError) obj;
            return Intrinsics.m31980c(this.name, uiInputComponentError.name) && Intrinsics.m31980c(this.type, uiInputComponentError.type) && Intrinsics.m31980c(this.message, uiInputComponentError.message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiInputComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class UiInputInternationalDbComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiInputInternationalDbComponentError> CREATOR = new Creator();

        @NotNull
        private Map<String, String> message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputInternationalDbComponentError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputInternationalDbComponentError(string, string2, linkedHashMap);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError[] newArray(int i10) {
                return new UiInputInternationalDbComponentError[i10];
            }
        }

        public UiInputInternationalDbComponentError(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError$UiInputInternationalDbComponentError */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputInternationalDbComponentError copy$default(UiInputInternationalDbComponentError uiInputInternationalDbComponentError, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiInputInternationalDbComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiInputInternationalDbComponentError.type;
            }
            if ((i10 & 4) != 0) {
                map = uiInputInternationalDbComponentError.message;
            }
            return uiInputInternationalDbComponentError.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.message;
        }

        @NotNull
        public final UiInputInternationalDbComponentError copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return new UiInputInternationalDbComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputInternationalDbComponentError)) {
                return false;
            }
            UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiInputInternationalDbComponentError) obj;
            return Intrinsics.m31980c(this.name, uiInputInternationalDbComponentError.name) && Intrinsics.m31980c(this.type, uiInputInternationalDbComponentError.type) && Intrinsics.m31980c(this.message, uiInputInternationalDbComponentError.message);
        }

        @NotNull
        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(@NotNull Map<String, String> map) {
            this.message = map;
        }

        @NotNull
        public String toString() {
            return "UiInputInternationalDbComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ UiComponentError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String getType();

    @InterfaceC11874i(generateAdapter = true)
    public static final class UiGovernmentIdNfcScanComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiGovernmentIdNfcScanComponentError> CREATOR = new Creator();

        @NotNull
        private Map<String, String> message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiGovernmentIdNfcScanComponentError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiGovernmentIdNfcScanComponentError(string, string2, linkedHashMap);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError[] newArray(int i10) {
                return new UiGovernmentIdNfcScanComponentError[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("gov_id_nfc") : (r2v0 java.lang.String))
          (r3v0 java.util.Map)
         A[MD:(java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:2) call: com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError.UiGovernmentIdNfcScanComponentError.<init>(java.lang.String, java.lang.String, java.util.Map):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ UiGovernmentIdNfcScanComponentError(String str, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "gov_id_nfc" : str2, map);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError$UiGovernmentIdNfcScanComponentError */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiGovernmentIdNfcScanComponentError copy$default(UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiGovernmentIdNfcScanComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiGovernmentIdNfcScanComponentError.type;
            }
            if ((i10 & 4) != 0) {
                map = uiGovernmentIdNfcScanComponentError.message;
            }
            return uiGovernmentIdNfcScanComponentError.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.message;
        }

        @NotNull
        public final UiGovernmentIdNfcScanComponentError copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return new UiGovernmentIdNfcScanComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiGovernmentIdNfcScanComponentError)) {
                return false;
            }
            UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiGovernmentIdNfcScanComponentError) obj;
            return Intrinsics.m31980c(this.name, uiGovernmentIdNfcScanComponentError.name) && Intrinsics.m31980c(this.type, uiGovernmentIdNfcScanComponentError.type) && Intrinsics.m31980c(this.message, uiGovernmentIdNfcScanComponentError.message);
        }

        @NotNull
        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(@NotNull Map<String, String> map) {
            this.message = map;
        }

        @NotNull
        public String toString() {
            return "UiGovernmentIdNfcScanComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public UiGovernmentIdNfcScanComponentError(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private UiComponentError() {
    }
}
