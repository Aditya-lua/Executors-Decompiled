package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p471um.InterfaceC11874i;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11874i(generateAdapter = true)
public final class ErrorResponse {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final List<Error> errors;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorResponse create(@Nullable String str) {
            return new ErrorResponse(C7697o.m31878d(new Error.UnknownError(str, null)));
        }

        @NotNull
        public final AbstractC11873h.e getAdapter() {
            return ErrorJsonAdapterFactory.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static abstract class Error implements Parcelable {

        @InterfaceC11874i(generateAdapter = true)
        public static final class FieldNotFoundError extends Error {

            @NotNull
            public static final Parcelable.Creator<FieldNotFoundError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<FieldNotFoundError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldNotFoundError createFromParcel(Parcel parcel) {
                    return new FieldNotFoundError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldNotFoundError[] newArray(int i10) {
                    return new FieldNotFoundError[i10];
                }
            }

            public FieldNotFoundError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ FieldNotFoundError copy$default(FieldNotFoundError fieldNotFoundError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = fieldNotFoundError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = fieldNotFoundError.details;
                }
                return fieldNotFoundError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final FieldNotFoundError copy(@Nullable String str, @Nullable String str2) {
                return new FieldNotFoundError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FieldNotFoundError)) {
                    return false;
                }
                FieldNotFoundError fieldNotFoundError = (FieldNotFoundError) obj;
                return Intrinsics.m31980c(this.title, fieldNotFoundError.title) && Intrinsics.m31980c(this.details, fieldNotFoundError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "FieldNotFoundError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class InactiveTemplateError extends Error {

            @NotNull
            public static final Parcelable.Creator<InactiveTemplateError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<InactiveTemplateError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InactiveTemplateError createFromParcel(Parcel parcel) {
                    return new InactiveTemplateError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InactiveTemplateError[] newArray(int i10) {
                    return new InactiveTemplateError[i10];
                }
            }

            public InactiveTemplateError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InactiveTemplateError copy$default(InactiveTemplateError inactiveTemplateError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = inactiveTemplateError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = inactiveTemplateError.details;
                }
                return inactiveTemplateError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final InactiveTemplateError copy(@Nullable String str, @Nullable String str2) {
                return new InactiveTemplateError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InactiveTemplateError)) {
                    return false;
                }
                InactiveTemplateError inactiveTemplateError = (InactiveTemplateError) obj;
                return Intrinsics.m31980c(this.title, inactiveTemplateError.title) && Intrinsics.m31980c(this.details, inactiveTemplateError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "InactiveTemplateError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class InconsistentTransitionError extends Error {

            @NotNull
            public static final Parcelable.Creator<InconsistentTransitionError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<InconsistentTransitionError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InconsistentTransitionError createFromParcel(Parcel parcel) {
                    return new InconsistentTransitionError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InconsistentTransitionError[] newArray(int i10) {
                    return new InconsistentTransitionError[i10];
                }
            }

            public InconsistentTransitionError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InconsistentTransitionError copy$default(InconsistentTransitionError inconsistentTransitionError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = inconsistentTransitionError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = inconsistentTransitionError.details;
                }
                return inconsistentTransitionError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final InconsistentTransitionError copy(@Nullable String str, @Nullable String str2) {
                return new InconsistentTransitionError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InconsistentTransitionError)) {
                    return false;
                }
                InconsistentTransitionError inconsistentTransitionError = (InconsistentTransitionError) obj;
                return Intrinsics.m31980c(this.title, inconsistentTransitionError.title) && Intrinsics.m31980c(this.details, inconsistentTransitionError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "InconsistentTransitionError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class InvalidConfigError extends Error {

            @NotNull
            public static final Parcelable.Creator<InvalidConfigError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<InvalidConfigError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidConfigError createFromParcel(Parcel parcel) {
                    return new InvalidConfigError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidConfigError[] newArray(int i10) {
                    return new InvalidConfigError[i10];
                }
            }

            public InvalidConfigError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InvalidConfigError copy$default(InvalidConfigError invalidConfigError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidConfigError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = invalidConfigError.details;
                }
                return invalidConfigError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final InvalidConfigError copy(@Nullable String str, @Nullable String str2) {
                return new InvalidConfigError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidConfigError)) {
                    return false;
                }
                InvalidConfigError invalidConfigError = (InvalidConfigError) obj;
                return Intrinsics.m31980c(this.title, invalidConfigError.title) && Intrinsics.m31980c(this.details, invalidConfigError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "InvalidConfigError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class InvalidFieldValueError extends Error {

            @NotNull
            public static final Parcelable.Creator<InvalidFieldValueError> CREATOR = new Creator();

            @Nullable
            private final Map<String, UiComponentError> details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<InvalidFieldValueError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidFieldValueError createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i10 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                        for (int i11 = 0; i11 != i10; i11++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readParcelable(InvalidFieldValueError.class.getClassLoader()));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new InvalidFieldValueError(string, linkedHashMap);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidFieldValueError[] newArray(int i10) {
                    return new InvalidFieldValueError[i10];
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError> */
            /* JADX WARN: Multi-variable type inference failed */
            public InvalidFieldValueError(@Nullable String str, @Nullable Map<String, ? extends UiComponentError> map) {
                super(null);
                this.title = str;
                this.details = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @NotNull
            public String getDescription() {
                Set<String> setKeySet;
                StringBuilder sb2 = new StringBuilder("Invalid value(s) on field(s) ");
                Map<String, UiComponentError> map = this.details;
                sb2.append((map == null || (setKeySet = map.keySet()) == null) ? null : CollectionsKt.m31715m0(setKeySet, null, null, null, 0, null, null, 63, null));
                sb2.append(".");
                return sb2.toString();
            }

            @Nullable
            public final Map<String, UiComponentError> getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                Map<String, UiComponentError> map = this.details;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, UiComponentError> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeParcelable(entry.getValue(), i10);
                }
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class RateLimitExceededError extends Error {

            @NotNull
            public static final Parcelable.Creator<RateLimitExceededError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<RateLimitExceededError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RateLimitExceededError createFromParcel(Parcel parcel) {
                    return new RateLimitExceededError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RateLimitExceededError[] newArray(int i10) {
                    return new RateLimitExceededError[i10];
                }
            }

            public RateLimitExceededError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ RateLimitExceededError copy$default(RateLimitExceededError rateLimitExceededError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = rateLimitExceededError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = rateLimitExceededError.details;
                }
                return rateLimitExceededError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final RateLimitExceededError copy(@Nullable String str, @Nullable String str2) {
                return new RateLimitExceededError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RateLimitExceededError)) {
                    return false;
                }
                RateLimitExceededError rateLimitExceededError = (RateLimitExceededError) obj;
                return Intrinsics.m31980c(this.title, rateLimitExceededError.title) && Intrinsics.m31980c(this.details, rateLimitExceededError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "RateLimitExceededError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class TransitionFromTerminalStateError extends Error {

            @NotNull
            public static final Parcelable.Creator<TransitionFromTerminalStateError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<TransitionFromTerminalStateError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionFromTerminalStateError createFromParcel(Parcel parcel) {
                    return new TransitionFromTerminalStateError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionFromTerminalStateError[] newArray(int i10) {
                    return new TransitionFromTerminalStateError[i10];
                }
            }

            public TransitionFromTerminalStateError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ TransitionFromTerminalStateError copy$default(TransitionFromTerminalStateError transitionFromTerminalStateError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = transitionFromTerminalStateError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = transitionFromTerminalStateError.details;
                }
                return transitionFromTerminalStateError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final TransitionFromTerminalStateError copy(@Nullable String str, @Nullable String str2) {
                return new TransitionFromTerminalStateError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransitionFromTerminalStateError)) {
                    return false;
                }
                TransitionFromTerminalStateError transitionFromTerminalStateError = (TransitionFromTerminalStateError) obj;
                return Intrinsics.m31980c(this.title, transitionFromTerminalStateError.title) && Intrinsics.m31980c(this.details, transitionFromTerminalStateError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TransitionFromTerminalStateError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class UnauthenticatedError extends Error {

            @NotNull
            public static final Parcelable.Creator<UnauthenticatedError> CREATOR = new Creator();

            @Nullable
            private final String details;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnauthenticatedError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnauthenticatedError createFromParcel(Parcel parcel) {
                    return new UnauthenticatedError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnauthenticatedError[] newArray(int i10) {
                    return new UnauthenticatedError[i10];
                }
            }

            public UnauthenticatedError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ UnauthenticatedError copy$default(UnauthenticatedError unauthenticatedError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unauthenticatedError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = unauthenticatedError.details;
                }
                return unauthenticatedError.copy(str, str2);
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.details;
            }

            @NotNull
            public final UnauthenticatedError copy(@Nullable String str, @Nullable String str2) {
                return new UnauthenticatedError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnauthenticatedError)) {
                    return false;
                }
                UnauthenticatedError unauthenticatedError = (UnauthenticatedError) obj;
                return Intrinsics.m31980c(this.title, unauthenticatedError.title) && Intrinsics.m31980c(this.details, unauthenticatedError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return this.details;
            }

            @Nullable
            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "UnauthenticatedError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class UnknownError extends Error {

            @NotNull
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();

            @Nullable
            private transient ResponseBody errorBody;

            @Nullable
            private final String originalCode;

            @Nullable
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError createFromParcel(Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError[] newArray(int i10) {
                    return new UnknownError[i10];
                }
            }

            public UnknownError(@Nullable String str, @Nullable String str2) {
                super(null);
                this.title = str;
                this.originalCode = str2;
            }

            public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknownError.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = unknownError.originalCode;
                }
                return unknownError.copy(str, str2);
            }

            public static /* synthetic */ void getErrorBody$annotations() {
            }

            @Nullable
            public final String component1() {
                return this.title;
            }

            @Nullable
            public final String component2() {
                return this.originalCode;
            }

            @NotNull
            public final UnknownError copy(@Nullable String str, @Nullable String str2) {
                return new UnknownError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnknownError)) {
                    return false;
                }
                UnknownError unknownError = (UnknownError) obj;
                return Intrinsics.m31980c(this.title, unknownError.title) && Intrinsics.m31980c(this.originalCode, unknownError.originalCode);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getDescription() {
                return getTitle();
            }

            @Nullable
            public final ResponseBody getErrorBody() {
                return this.errorBody;
            }

            @Nullable
            public final String getOriginalCode() {
                return this.originalCode;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            @Nullable
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.originalCode;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setErrorBody(@Nullable ResponseBody responseBody) {
                this.errorBody = responseBody;
            }

            @NotNull
            public String toString() {
                return "UnknownError(title=" + this.title + ", originalCode=" + this.originalCode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.originalCode);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract String getDescription();

        @Nullable
        public abstract String getTitle();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Error() {
        }
    }

    public static final class ErrorJsonAdapterFactory implements AbstractC11873h.e {

        @NotNull
        public static final ErrorJsonAdapterFactory INSTANCE = new ErrorJsonAdapterFactory();

        @NotNull
        private static final String LABEL_KEY = "code";
        private static final C12232b<Error> adapterFactory = C12232b.m45364b(Error.class, LABEL_KEY).m45368e(Error.InactiveTemplateError.class, "inactive_template_error").m45368e(Error.InvalidConfigError.class, "invalid_config").m45368e(Error.UnauthenticatedError.class, "unauthenticated").m45368e(Error.InconsistentTransitionError.class, "inconsistent_transition_error").m45368e(Error.TransitionFromTerminalStateError.class, "transition_from_terminal_state_error").m45368e(Error.FieldNotFoundError.class, "field_not_found_error").m45368e(Error.RateLimitExceededError.class, "rate_limit_exceeded").m45368e(Error.InvalidFieldValueError.class, "invalid_field_value_error").m45368e(Error.UnknownError.class, "unknown_error").m45367d(UnknownErrorAdapter.INSTANCE);

        private ErrorJsonAdapterFactory() {
        }

        @Override // p471um.AbstractC11873h.e
        @Nullable
        public AbstractC11873h<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull C11888w c11888w) {
            final AbstractC11873h<?> abstractC11873hCreate = adapterFactory.create(type, set, c11888w);
            if (abstractC11873hCreate == null) {
                return null;
            }
            return new AbstractC11873h<Error>(abstractC11873hCreate) { // from class: com.withpersona.sdk2.inquiry.network.core.ErrorResponse$ErrorJsonAdapterFactory$create$1
                private final AbstractC11873h<ErrorResponse.Error> errorAdapter;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: um.h<?> */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.errorAdapter = abstractC11873hCreate;
                }

                public static /* synthetic */ void getErrorAdapter$annotations() {
                }

                public final AbstractC11873h<ErrorResponse.Error> getErrorAdapter() {
                    return this.errorAdapter;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p471um.AbstractC11873h
                public ErrorResponse.Error fromJson(AbstractC11878m abstractC11878m) {
                    return ErrorResponse.ErrorJsonAdapterFactory.INSTANCE.hasLabel(abstractC11878m.mo44340v()) ? this.errorAdapter.fromJson(abstractC11878m) : ErrorResponse.UnknownErrorAdapter.INSTANCE.fromJson(abstractC11878m);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
                @Override // p471um.AbstractC11873h
                public void toJson(AbstractC11885t abstractC11885t, ErrorResponse.Error error) {
                    this.errorAdapter.toJson(abstractC11885t, error);
                }
            }.nullSafe();
        }

        public final boolean hasLabel(@NotNull AbstractC11878m abstractC11878m) {
            abstractC11878m.mo44325b();
            while (abstractC11878m.mo44329f()) {
                if (Intrinsics.m31980c(abstractC11878m.mo44335n(), LABEL_KEY)) {
                    return true;
                }
                abstractC11878m.mo44321P();
            }
            return false;
        }
    }

    public static final class UnknownErrorAdapter extends AbstractC11873h<Error.UnknownError> {

        @NotNull
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p471um.AbstractC11873h
        @NotNull
        public Error.UnknownError fromJson(@NotNull AbstractC11878m abstractC11878m) {
            abstractC11878m.mo44325b();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            while (abstractC11878m.mo44329f()) {
                String strMo44335n = abstractC11878m.mo44335n();
                if (Intrinsics.m31980c(strMo44335n, "code")) {
                    strNextStringOrNull2 = JsonReaderUtilsKt.nextStringOrNull(abstractC11878m);
                } else if (Intrinsics.m31980c(strMo44335n, Title.type)) {
                    strNextStringOrNull = JsonReaderUtilsKt.nextStringOrNull(abstractC11878m);
                } else {
                    abstractC11878m.mo44321P();
                }
            }
            abstractC11878m.mo44327d();
            return new Error.UnknownError(strNextStringOrNull, strNextStringOrNull2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable Error.UnknownError unknownError) {
            abstractC11885t.mo44374c();
            abstractC11885t.mo44380n("originalCode");
            abstractC11885t.mo44367M(unknownError != null ? unknownError.getOriginalCode() : null);
            abstractC11885t.mo44380n(Title.type);
            abstractC11885t.mo44367M(unknownError != null ? unknownError.getTitle() : null);
            abstractC11885t.mo44378g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.core.ErrorResponse$Error> */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorResponse(@Nullable List<? extends Error> list) {
        this.errors = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.core.ErrorResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = errorResponse.errors;
        }
        return errorResponse.copy(list);
    }

    @Nullable
    public final List<Error> component1() {
        return this.errors;
    }

    @NotNull
    public final ErrorResponse copy(@Nullable List<? extends Error> list) {
        return new ErrorResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && Intrinsics.m31980c(this.errors, ((ErrorResponse) obj).errors);
    }

    @Nullable
    public final List<Error> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<Error> list = this.errors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final /* synthetic */ <T extends Error> boolean isAnyError() {
        List<Error> errors = getErrors();
        if (errors == null || errors.isEmpty()) {
            return false;
        }
        for (Error error : errors) {
            Intrinsics.m31986i(3, "T");
            if (error != null) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "ErrorResponse(errors=" + this.errors + ")";
    }
}
