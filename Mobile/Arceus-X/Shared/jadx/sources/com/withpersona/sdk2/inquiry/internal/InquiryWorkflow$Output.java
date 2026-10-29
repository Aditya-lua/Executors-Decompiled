package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m31665d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output", "Landroid/os/Parcelable;", "", "y", "()Ljava/lang/String;", "sessionToken", "Complete", "ReinitializeWithFallbackMode", "Cancel", "Error", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$ReinitializeWithFallbackMode;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InquiryWorkflow$Output extends Parcelable {

    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010\u0016¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "sessionToken", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "y", "e", "i", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Complete implements InquiryWorkflow$Output {

        @NotNull
        public static final Parcelable.Creator<Complete> CREATOR = new C3650a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryStatus;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output$Complete$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3650a implements Parcelable.Creator<Complete> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                int i11 = 0;
                while (true) {
                    String string3 = parcel.readString();
                    if (i11 == i10) {
                        return new Complete(string, string2, linkedHashMap, string3, parcel.readString());
                    }
                    linkedHashMap.put(string3, parcel.readParcelable(Complete.class.getClassLoader()));
                    i11++;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Complete[] newArray(int i10) {
                return new Complete[i10];
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField> */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(@NotNull String inquiryId, @NotNull String inquiryStatus, @NotNull Map<String, ? extends InquiryField> fields, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(inquiryStatus, "inquiryStatus");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.inquiryId = inquiryId;
            this.inquiryStatus = inquiryStatus;
            this.fields = fields;
            this.sessionToken = str;
            this.redirectUri = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, InquiryField> m18246a() {
            return this.fields;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.m31980c(this.inquiryId, complete.inquiryId) && Intrinsics.m31980c(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.m31980c(this.fields, complete.fields) && Intrinsics.m31980c(this.sessionToken, complete.sessionToken) && Intrinsics.m31980c(this.redirectUri, complete.redirectUri);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        public int hashCode() {
            int iHashCode = ((((this.inquiryId.hashCode() * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode()) * 31;
            String str = this.sessionToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.redirectUri;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @NotNull
        public String toString() {
            return "Complete(inquiryId=" + this.inquiryId + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ", sessionToken=" + this.sessionToken + ", redirectUri=" + this.redirectUri + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.inquiryStatus);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.sessionToken);
            dest.writeString(this.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u0015¨\u0006("}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "errorCode", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "sessionToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "g", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "c", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "d", "y", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Error implements InquiryWorkflow$Output {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new C3651a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String debugMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final ErrorCode errorCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final InternalErrorInfo cause;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output$Error$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3651a implements Parcelable.Creator<Error> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), (ErrorCode) parcel.readParcelable(Error.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Error[] newArray(int i10) {
                return new Error[i10];
            }
        }

        public Error(@Nullable String str, @NotNull ErrorCode errorCode, @NotNull InternalErrorInfo cause, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.debugMessage = str;
            this.errorCode = errorCode;
            this.cause = cause;
            this.sessionToken = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InternalErrorInfo getCause() {
            return this.cause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.m31980c(this.debugMessage, error.debugMessage) && this.errorCode == error.errorCode && Intrinsics.m31980c(this.cause, error.cause) && Intrinsics.m31980c(this.sessionToken, error.sessionToken);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDebugMessage() {
            return this.debugMessage;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            String str = this.debugMessage;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.cause.hashCode()) * 31;
            String str2 = this.sessionToken;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Error(debugMessage=" + this.debugMessage + ", errorCode=" + this.errorCode + ", cause=" + this.cause + ", sessionToken=" + this.sessionToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.debugMessage);
            dest.writeParcelable(this.errorCode, flags);
            dest.writeParcelable(this.cause, flags);
            dest.writeString(this.sessionToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$ReinitializeWithFallbackMode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "y", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ReinitializeWithFallbackMode implements InquiryWorkflow$Output {

        @NotNull
        public static final Parcelable.Creator<ReinitializeWithFallbackMode> CREATOR = new C3652a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output$ReinitializeWithFallbackMode$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3652a implements Parcelable.Creator<ReinitializeWithFallbackMode> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReinitializeWithFallbackMode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReinitializeWithFallbackMode(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReinitializeWithFallbackMode[] newArray(int i10) {
                return new ReinitializeWithFallbackMode[i10];
            }
        }

        public ReinitializeWithFallbackMode(@NotNull String inquiryId, @Nullable String str) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
            this.sessionToken = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReinitializeWithFallbackMode)) {
                return false;
            }
            ReinitializeWithFallbackMode reinitializeWithFallbackMode = (ReinitializeWithFallbackMode) other;
            return Intrinsics.m31980c(this.inquiryId, reinitializeWithFallbackMode.inquiryId) && Intrinsics.m31980c(this.sessionToken, reinitializeWithFallbackMode.sessionToken);
        }

        public int hashCode() {
            int iHashCode = this.inquiryId.hashCode() * 31;
            String str = this.sessionToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "ReinitializeWithFallbackMode(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    String getSessionToken();

    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0084\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b1\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b7\u0010\u001d¨\u00068"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", Title.type, "message", "resumeButtonText", "cancelButtonText", "", "force", "skipBackendCall", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "b", "y", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "p", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "d", "getTitle", "e", "k", "f", "n", "g", "h", "Z", "i", "()Z", "o", "m", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Cancel implements InquiryWorkflow$Output {

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new C3649a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyle styles;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String title;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String message;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public final String resumeButtonText;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        public final String cancelButtonText;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public final boolean force;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public final boolean skipBackendCall;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output$Cancel$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3649a implements Parcelable.Creator<Cancel> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                StepStyle stepStyle = (StepStyle) parcel.readParcelable(Cancel.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z10 = false;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                return new Cancel(string, string2, stepStyle, string3, string4, string5, string6, z10, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Cancel[] newArray(int i10) {
                return new Cancel[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Cancel(@Nullable String str, @Nullable String str2, @Nullable StepStyle stepStyle, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z10, boolean z11, @Nullable String str7) {
            this.inquiryId = str;
            this.sessionToken = str2;
            this.styles = stepStyle;
            this.title = str3;
            this.message = str4;
            this.resumeButtonText = str5;
            this.cancelButtonText = str6;
            this.force = z10;
            this.skipBackendCall = z11;
            this.redirectUri = str7;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ Cancel m18234f(Cancel cancel, String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cancel.inquiryId;
            }
            if ((i10 & 2) != 0) {
                str2 = cancel.sessionToken;
            }
            if ((i10 & 4) != 0) {
                stepStyle = cancel.styles;
            }
            if ((i10 & 8) != 0) {
                str3 = cancel.title;
            }
            if ((i10 & 16) != 0) {
                str4 = cancel.message;
            }
            if ((i10 & 32) != 0) {
                str5 = cancel.resumeButtonText;
            }
            if ((i10 & 64) != 0) {
                str6 = cancel.cancelButtonText;
            }
            if ((i10 & 128) != 0) {
                z10 = cancel.force;
            }
            if ((i10 & 256) != 0) {
                z11 = cancel.skipBackendCall;
            }
            if ((i10 & 512) != 0) {
                str7 = cancel.redirectUri;
            }
            boolean z12 = z11;
            String str8 = str7;
            String str9 = str6;
            boolean z13 = z10;
            String str10 = str4;
            String str11 = str5;
            return cancel.m18235a(str, str2, stepStyle, str3, str10, str11, str9, z13, z12, str8);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Cancel m18235a(@Nullable String inquiryId, @Nullable String sessionToken, @Nullable StepStyle styles, @Nullable String title, @Nullable String message, @Nullable String resumeButtonText, @Nullable String cancelButtonText, boolean force, boolean skipBackendCall, @Nullable String redirectUri) {
            return new Cancel(inquiryId, sessionToken, styles, title, message, resumeButtonText, cancelButtonText, force, skipBackendCall, redirectUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) other;
            return Intrinsics.m31980c(this.inquiryId, cancel.inquiryId) && Intrinsics.m31980c(this.sessionToken, cancel.sessionToken) && Intrinsics.m31980c(this.styles, cancel.styles) && Intrinsics.m31980c(this.title, cancel.title) && Intrinsics.m31980c(this.message, cancel.message) && Intrinsics.m31980c(this.resumeButtonText, cancel.resumeButtonText) && Intrinsics.m31980c(this.cancelButtonText, cancel.cancelButtonText) && this.force == cancel.force && this.skipBackendCall == cancel.skipBackendCall && Intrinsics.m31980c(this.redirectUri, cancel.redirectUri);
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getCancelButtonText() {
            return this.cancelButtonText;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.inquiryId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sessionToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (stepStyle == null ? 0 : stepStyle.hashCode())) * 31;
            String str3 = this.title;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.resumeButtonText;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cancelButtonText;
            int iHashCode7 = (((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.force)) * 31) + Boolean.hashCode(this.skipBackendCall)) * 31;
            String str7 = this.redirectUri;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getResumeButtonText() {
            return this.resumeButtonText;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getSkipBackendCall() {
            return this.skipBackendCall;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public String toString() {
            return "Cancel(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", styles=" + this.styles + ", title=" + this.title + ", message=" + this.message + ", resumeButtonText=" + this.resumeButtonText + ", cancelButtonText=" + this.cancelButtonText + ", force=" + this.force + ", skipBackendCall=" + this.skipBackendCall + ", redirectUri=" + this.redirectUri + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.styles, flags);
            dest.writeString(this.title);
            dest.writeString(this.message);
            dest.writeString(this.resumeButtonText);
            dest.writeString(this.cancelButtonText);
            dest.writeInt(this.force ? 1 : 0);
            dest.writeInt(this.skipBackendCall ? 1 : 0);
            dest.writeString(this.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
          (r2v0 java.lang.String)
          (r3v0 java.lang.String)
          (r4v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle)
          (r5v0 java.lang.String)
          (r6v0 java.lang.String)
          (r7v0 java.lang.String)
          (r8v0 java.lang.String)
          (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
          (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r12v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r12v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:12) call: com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output.Cancel.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, stepStyle, str3, str4, str5, str6, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : str7);
        }
    }
}
