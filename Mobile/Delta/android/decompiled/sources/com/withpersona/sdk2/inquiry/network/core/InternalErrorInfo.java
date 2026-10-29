package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.i;
import um.m;
import um.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalErrorInfo implements Parcelable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final h<Object> fallbackAdapter = new h<Object>() { // from class: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$Companion$fallbackAdapter$1
        @Override // um.h
        public Object fromJson(m mVar) {
            mVar.b();
            mVar.d();
            return null;
        }

        @Override // um.h
        public void toJson(t tVar, Object obj) {
            tVar.c().n("message").M("Error with class '" + (obj != null ? obj.getClass().getCanonicalName() : null) + "' does not have a json adapter registered.").g();
        }
    }.nullSafe();

    @i(generateAdapter = true)
    public static final class CameraErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<CameraErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<CameraErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo createFromParcel(Parcel parcel) {
                return new CameraErrorInfo(parcel.readString());
            }

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
            return (obj instanceof CameraErrorInfo) && Intrinsics.c(this.message, ((CameraErrorInfo) obj).message);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h.e createAdapter() {
            return vm.b.b(InternalErrorInfo.class, Payload.TYPE).e(NetworkErrorInfo.class, "network").e(IntegrationErrorInfo.class, "integration").e(PermissionErrorInfo.class, "permission").e(CameraErrorInfo.class, "camera").e(ConfigurationErrorInfo.class, "configuration").e(InvalidOneTimeLinkCode.class, "one_time_link_code").e(UnknownErrorInfo.class, "unknown").d(InternalErrorInfo.fallbackAdapter);
        }

        private Companion() {
        }
    }

    @i(generateAdapter = true)
    public static final class ConfigurationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<ConfigurationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<ConfigurationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo createFromParcel(Parcel parcel) {
                return new ConfigurationErrorInfo(parcel.readString());
            }

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
            return (obj instanceof ConfigurationErrorInfo) && Intrinsics.c(this.message, ((ConfigurationErrorInfo) obj).message);
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

    @i(generateAdapter = true)
    public static final class IntegrationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<IntegrationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<IntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new IntegrationErrorInfo(parcel.readString());
            }

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
            return (obj instanceof IntegrationErrorInfo) && Intrinsics.c(this.message, ((IntegrationErrorInfo) obj).message);
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

    @i(generateAdapter = true)
    public static final class InvalidOneTimeLinkCode extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<InvalidOneTimeLinkCode> CREATOR = new Creator();

        @NotNull
        private final String oneTimeLinkCode;

        public static final class Creator implements Parcelable.Creator<InvalidOneTimeLinkCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode createFromParcel(Parcel parcel) {
                return new InvalidOneTimeLinkCode(parcel.readString());
            }

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
            return (obj instanceof InvalidOneTimeLinkCode) && Intrinsics.c(this.oneTimeLinkCode, ((InvalidOneTimeLinkCode) obj).oneTimeLinkCode);
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

    @i(generateAdapter = true)
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
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo createFromParcel(Parcel parcel) {
                return new NetworkErrorInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (ErrorResponse.Error) parcel.readParcelable(NetworkErrorInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo[] newArray(int i10) {
                return new NetworkErrorInfo[i10];
            }
        }

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
            return this.code == networkErrorInfo.code && Intrinsics.c(this.message, networkErrorInfo.message) && this.isRecoverable == networkErrorInfo.isRecoverable && Intrinsics.c(this.responseError, networkErrorInfo.responseError);
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

        public NetworkErrorInfo(int i10, @Nullable String str, boolean z10, @Nullable ErrorResponse.Error error) {
            super(null);
            this.code = i10;
            this.message = str;
            this.isRecoverable = z10;
            this.responseError = error;
        }
    }

    @i(generateAdapter = true)
    public static final class NoDiskSpaceErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<NoDiskSpaceErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<NoDiskSpaceErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo createFromParcel(Parcel parcel) {
                return new NoDiskSpaceErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo[] newArray(int i10) {
                return new NoDiskSpaceErrorInfo[i10];
            }
        }

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
            return (obj instanceof NoDiskSpaceErrorInfo) && Intrinsics.c(this.message, ((NoDiskSpaceErrorInfo) obj).message);
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

        public /* synthetic */ NoDiskSpaceErrorInfo(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "No disk space available." : str);
        }

        public NoDiskSpaceErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }
    }

    @i(generateAdapter = true)
    public static final class PermissionErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<PermissionErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<PermissionErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo createFromParcel(Parcel parcel) {
                return new PermissionErrorInfo(parcel.readString());
            }

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
            return (obj instanceof PermissionErrorInfo) && Intrinsics.c(this.message, ((PermissionErrorInfo) obj).message);
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

    @i(generateAdapter = true)
    public static final class UnknownErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<UnknownErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<UnknownErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo createFromParcel(Parcel parcel) {
                return new UnknownErrorInfo(parcel.readString());
            }

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
            return (obj instanceof UnknownErrorInfo) && Intrinsics.c(this.message, ((UnknownErrorInfo) obj).message);
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

    @i(generateAdapter = true)
    public static final class WebRtcIntegrationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<WebRtcIntegrationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<WebRtcIntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new WebRtcIntegrationErrorInfo(parcel.readString());
            }

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
            return (obj instanceof WebRtcIntegrationErrorInfo) && Intrinsics.c(this.message, ((WebRtcIntegrationErrorInfo) obj).message);
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

    public /* synthetic */ InternalErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalErrorInfo() {
    }
}
