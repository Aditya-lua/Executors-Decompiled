package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11874i;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalErrorInfo implements Parcelable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final AbstractC11873h<Object> fallbackAdapter = new AbstractC11873h<Object>() { // from class: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$Companion$fallbackAdapter$1
        @Override // p471um.AbstractC11873h
        public Object fromJson(AbstractC11878m abstractC11878m) {
            abstractC11878m.mo44325b();
            abstractC11878m.mo44327d();
            return null;
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, Object obj) {
            abstractC11885t.mo44374c().mo44380n("message").mo44367M("Error with class '" + (obj != null ? obj.getClass().getCanonicalName() : null) + "' does not have a json adapter registered.").mo44378g();
        }
    }.nullSafe();

    @InterfaceC11874i(generateAdapter = true)
    public static final class CameraErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<CameraErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<CameraErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo createFromParcel(Parcel parcel) {
                return new CameraErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo[] newArray(int i10) {
                return new CameraErrorInfo[i10];
            }
        }

        public CameraErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ CameraErrorInfo copy$default(CameraErrorInfo cameraErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cameraErrorInfo.message;
            }
            return cameraErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final CameraErrorInfo copy(@NotNull String str) {
            return new CameraErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraErrorInfo) && Intrinsics.m31980c(this.message, ((CameraErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "CameraErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AbstractC11873h.e createAdapter() {
            return C12232b.m45364b(InternalErrorInfo.class, Payload.TYPE).m45368e(NetworkErrorInfo.class, "network").m45368e(IntegrationErrorInfo.class, "integration").m45368e(PermissionErrorInfo.class, "permission").m45368e(CameraErrorInfo.class, "camera").m45368e(ConfigurationErrorInfo.class, "configuration").m45368e(InvalidOneTimeLinkCode.class, "one_time_link_code").m45368e(UnknownErrorInfo.class, EnvironmentCompat.MEDIA_UNKNOWN).m45367d(InternalErrorInfo.fallbackAdapter);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class ConfigurationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<ConfigurationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<ConfigurationErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo createFromParcel(Parcel parcel) {
                return new ConfigurationErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo[] newArray(int i10) {
                return new ConfigurationErrorInfo[i10];
            }
        }

        public ConfigurationErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ ConfigurationErrorInfo copy$default(ConfigurationErrorInfo configurationErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = configurationErrorInfo.message;
            }
            return configurationErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final ConfigurationErrorInfo copy(@NotNull String str) {
            return new ConfigurationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigurationErrorInfo) && Intrinsics.m31980c(this.message, ((ConfigurationErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConfigurationErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class IntegrationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<IntegrationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<IntegrationErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new IntegrationErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo[] newArray(int i10) {
                return new IntegrationErrorInfo[i10];
            }
        }

        public IntegrationErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ IntegrationErrorInfo copy$default(IntegrationErrorInfo integrationErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = integrationErrorInfo.message;
            }
            return integrationErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final IntegrationErrorInfo copy(@NotNull String str) {
            return new IntegrationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntegrationErrorInfo) && Intrinsics.m31980c(this.message, ((IntegrationErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "IntegrationErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class InvalidOneTimeLinkCode extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<InvalidOneTimeLinkCode> CREATOR = new Creator();

        @NotNull
        private final String oneTimeLinkCode;

        public static final class Creator implements Parcelable.Creator<InvalidOneTimeLinkCode> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode createFromParcel(Parcel parcel) {
                return new InvalidOneTimeLinkCode(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode[] newArray(int i10) {
                return new InvalidOneTimeLinkCode[i10];
            }
        }

        public InvalidOneTimeLinkCode(@NotNull String str) {
            super(null);
            this.oneTimeLinkCode = str;
        }

        public static /* synthetic */ InvalidOneTimeLinkCode copy$default(InvalidOneTimeLinkCode invalidOneTimeLinkCode, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = invalidOneTimeLinkCode.oneTimeLinkCode;
            }
            return invalidOneTimeLinkCode.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.oneTimeLinkCode;
        }

        @NotNull
        public final InvalidOneTimeLinkCode copy(@NotNull String str) {
            return new InvalidOneTimeLinkCode(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidOneTimeLinkCode) && Intrinsics.m31980c(this.oneTimeLinkCode, ((InvalidOneTimeLinkCode) obj).oneTimeLinkCode);
        }

        @NotNull
        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        public int hashCode() {
            return this.oneTimeLinkCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "InvalidOneTimeLinkCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.oneTimeLinkCode);
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class NetworkErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<NetworkErrorInfo> CREATOR = new Creator();
        private final int code;
        private final boolean isRecoverable;

        @Nullable
        private final String message;

        @Nullable
        private final ErrorResponse.Error responseError;

        public static final class Creator implements Parcelable.Creator<NetworkErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo createFromParcel(Parcel parcel) {
                return new NetworkErrorInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (ErrorResponse.Error) parcel.readParcelable(NetworkErrorInfo.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo[] newArray(int i10) {
                return new NetworkErrorInfo[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 int)
          (r2v0 java.lang.String)
          (r3v0 boolean)
          (wrap com.withpersona.sdk2.inquiry.network.core.ErrorResponse$Error:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.core.ErrorResponse$Error) : (r4v0 com.withpersona.sdk2.inquiry.network.core.ErrorResponse$Error))
         A[MD:(int, java.lang.String, boolean, com.withpersona.sdk2.inquiry.network.core.ErrorResponse$Error):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo.<init>(int, java.lang.String, boolean, com.withpersona.sdk2.inquiry.network.core.ErrorResponse$Error):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ NetworkErrorInfo(int i10, String str, boolean z10, ErrorResponse.Error error, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, z10, (i11 & 8) != 0 ? null : error);
        }

        public static /* synthetic */ NetworkErrorInfo copy$default(NetworkErrorInfo networkErrorInfo, int i10, String str, boolean z10, ErrorResponse.Error error, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = networkErrorInfo.code;
            }
            if ((i11 & 2) != 0) {
                str = networkErrorInfo.message;
            }
            if ((i11 & 4) != 0) {
                z10 = networkErrorInfo.isRecoverable;
            }
            if ((i11 & 8) != 0) {
                error = networkErrorInfo.responseError;
            }
            return networkErrorInfo.copy(i10, str, z10, error);
        }

        public final int component1() {
            return this.code;
        }

        @Nullable
        public final String component2() {
            return this.message;
        }

        public final boolean component3() {
            return this.isRecoverable;
        }

        @Nullable
        public final ErrorResponse.Error component4() {
            return this.responseError;
        }

        @NotNull
        public final NetworkErrorInfo copy(int i10, @Nullable String str, boolean z10, @Nullable ErrorResponse.Error error) {
            return new NetworkErrorInfo(i10, str, z10, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkErrorInfo)) {
                return false;
            }
            NetworkErrorInfo networkErrorInfo = (NetworkErrorInfo) obj;
            return this.code == networkErrorInfo.code && Intrinsics.m31980c(this.message, networkErrorInfo.message) && this.isRecoverable == networkErrorInfo.isRecoverable && Intrinsics.m31980c(this.responseError, networkErrorInfo.responseError);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final ErrorResponse.Error getResponseError() {
            return this.responseError;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            String str = this.message;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isRecoverable)) * 31;
            ErrorResponse.Error error = this.responseError;
            return iHashCode2 + (error != null ? error.hashCode() : 0);
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        @NotNull
        public String toString() {
            return "NetworkErrorInfo(code=" + this.code + ", message=" + this.message + ", isRecoverable=" + this.isRecoverable + ", responseError=" + this.responseError + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeInt(this.code);
            parcel.writeString(this.message);
            parcel.writeInt(this.isRecoverable ? 1 : 0);
            parcel.writeParcelable(this.responseError, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public NetworkErrorInfo(int i10, @Nullable String str, boolean z10, @Nullable ErrorResponse.Error error) {
            super(null);
            this.code = i10;
            this.message = str;
            this.isRecoverable = z10;
            this.responseError = error;
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class NoDiskSpaceErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<NoDiskSpaceErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<NoDiskSpaceErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo createFromParcel(Parcel parcel) {
                return new NoDiskSpaceErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo[] newArray(int i10) {
                return new NoDiskSpaceErrorInfo[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public NoDiskSpaceErrorInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoDiskSpaceErrorInfo copy$default(NoDiskSpaceErrorInfo noDiskSpaceErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = noDiskSpaceErrorInfo.message;
            }
            return noDiskSpaceErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final NoDiskSpaceErrorInfo copy(@NotNull String str) {
            return new NoDiskSpaceErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoDiskSpaceErrorInfo) && Intrinsics.m31980c(this.message, ((NoDiskSpaceErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoDiskSpaceErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("No disk space available.") : (r1v0 java.lang.String))
         A[MD:(java.lang.String):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NoDiskSpaceErrorInfo.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ NoDiskSpaceErrorInfo(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "No disk space available." : str);
        }

        public NoDiskSpaceErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class PermissionErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<PermissionErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<PermissionErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo createFromParcel(Parcel parcel) {
                return new PermissionErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo[] newArray(int i10) {
                return new PermissionErrorInfo[i10];
            }
        }

        public PermissionErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ PermissionErrorInfo copy$default(PermissionErrorInfo permissionErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = permissionErrorInfo.message;
            }
            return permissionErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final PermissionErrorInfo copy(@NotNull String str) {
            return new PermissionErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionErrorInfo) && Intrinsics.m31980c(this.message, ((PermissionErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "PermissionErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class UnknownErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<UnknownErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<UnknownErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo createFromParcel(Parcel parcel) {
                return new UnknownErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo[] newArray(int i10) {
                return new UnknownErrorInfo[i10];
            }
        }

        public UnknownErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ UnknownErrorInfo copy$default(UnknownErrorInfo unknownErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = unknownErrorInfo.message;
            }
            return unknownErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final UnknownErrorInfo copy(@NotNull String str) {
            return new UnknownErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownErrorInfo) && Intrinsics.m31980c(this.message, ((UnknownErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnknownErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11874i(generateAdapter = true)
    public static final class WebRtcIntegrationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<WebRtcIntegrationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<WebRtcIntegrationErrorInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new WebRtcIntegrationErrorInfo(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo[] newArray(int i10) {
                return new WebRtcIntegrationErrorInfo[i10];
            }
        }

        public WebRtcIntegrationErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ WebRtcIntegrationErrorInfo copy$default(WebRtcIntegrationErrorInfo webRtcIntegrationErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = webRtcIntegrationErrorInfo.message;
            }
            return webRtcIntegrationErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final WebRtcIntegrationErrorInfo copy(@NotNull String str) {
            return new WebRtcIntegrationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebRtcIntegrationErrorInfo) && Intrinsics.m31980c(this.message, ((WebRtcIntegrationErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "WebRtcIntegrationErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.message);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ InternalErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private InternalErrorInfo() {
    }
}
