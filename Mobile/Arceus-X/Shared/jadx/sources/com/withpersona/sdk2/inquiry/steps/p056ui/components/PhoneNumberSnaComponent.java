package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.PhoneNumberSna;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0011J+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;", "config", "code", "errorName", "errorMessage", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;)V", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PhoneNumberSna;", "c", "g", "d", "k", "e", "j", "f", "getAutoSubmitCountdownText", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "h", "J", "R0", "()J", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PhoneNumberSnaComponent implements UiComponent, AutoSubmitableComponent {

    @NotNull
    public static final Parcelable.Creator<PhoneNumberSnaComponent> CREATOR = new C4075a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final PhoneNumberSna config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String code;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String autoSubmitCountdownText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer autoSubmitIntervalSeconds;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4075a implements Parcelable.Creator<PhoneNumberSnaComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PhoneNumberSnaComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhoneNumberSnaComponent(parcel.readString(), (PhoneNumberSna) parcel.readParcelable(PhoneNumberSnaComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PhoneNumberSnaComponent[] newArray(int i10) {
            return new PhoneNumberSnaComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PhoneNumberSnaComponent(@NotNull String name, @NotNull PhoneNumberSna config, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        this.name = name;
        this.config = config;
        this.code = str;
        this.errorName = str2;
        this.errorMessage = str3;
        this.autoSubmitCountdownText = str4;
        this.autoSubmitIntervalSeconds = num;
        this.lastValueUpdateTs = j10;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ PhoneNumberSnaComponent m20831f(PhoneNumberSnaComponent phoneNumberSnaComponent, String str, PhoneNumberSna phoneNumberSna, String str2, String str3, String str4, String str5, Integer num, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = phoneNumberSnaComponent.name;
        }
        if ((i10 & 2) != 0) {
            phoneNumberSna = phoneNumberSnaComponent.config;
        }
        if ((i10 & 4) != 0) {
            str2 = phoneNumberSnaComponent.code;
        }
        if ((i10 & 8) != 0) {
            str3 = phoneNumberSnaComponent.errorName;
        }
        if ((i10 & 16) != 0) {
            str4 = phoneNumberSnaComponent.errorMessage;
        }
        if ((i10 & 32) != 0) {
            str5 = phoneNumberSnaComponent.autoSubmitCountdownText;
        }
        if ((i10 & 64) != 0) {
            num = phoneNumberSnaComponent.autoSubmitIntervalSeconds;
        }
        if ((i10 & 128) != 0) {
            j10 = phoneNumberSnaComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        String str6 = str5;
        Integer num2 = num;
        String str7 = str4;
        String str8 = str2;
        return phoneNumberSnaComponent.m20832a(str, phoneNumberSna, str8, str3, str7, str6, num2, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final PhoneNumberSnaComponent m20832a(@NotNull String name, @NotNull PhoneNumberSna config, @Nullable String code, @Nullable String errorName, @Nullable String errorMessage, @Nullable String autoSubmitCountdownText, @Nullable Integer autoSubmitIntervalSeconds, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        return new PhoneNumberSnaComponent(name, config, code, errorName, errorMessage, autoSubmitCountdownText, autoSubmitIntervalSeconds, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneNumberSnaComponent)) {
            return false;
        }
        PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) other;
        return Intrinsics.m31980c(this.name, phoneNumberSnaComponent.name) && Intrinsics.m31980c(this.config, phoneNumberSnaComponent.config) && Intrinsics.m31980c(this.code, phoneNumberSnaComponent.code) && Intrinsics.m31980c(this.errorName, phoneNumberSnaComponent.errorName) && Intrinsics.m31980c(this.errorMessage, phoneNumberSnaComponent.errorMessage) && Intrinsics.m31980c(this.autoSubmitCountdownText, phoneNumberSnaComponent.autoSubmitCountdownText) && Intrinsics.m31980c(this.autoSubmitIntervalSeconds, phoneNumberSnaComponent.autoSubmitIntervalSeconds) && this.lastValueUpdateTs == phoneNumberSnaComponent.lastValueUpdateTs;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent
    @Nullable
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.config.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.autoSubmitCountdownText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        return ((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final PhoneNumberSna getConfig() {
        return this.config;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final PhoneNumberSnaComponent m20837m(@Nullable String code, @Nullable String errorName, @Nullable String errorMessage) {
        return m20831f(this, null, null, code, errorName, errorMessage, null, 0, 0L, 131, null);
    }

    @NotNull
    public String toString() {
        return "PhoneNumberSnaComponent(name=" + this.name + ", config=" + this.config + ", code=" + this.code + ", errorName=" + this.errorName + ", errorMessage=" + this.errorMessage + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.config, flags);
        dest.writeString(this.code);
        dest.writeString(this.errorName);
        dest.writeString(this.errorMessage);
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
      (r2v0 java.lang.String)
      (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna)
      (r4v0 java.lang.String)
      (r5v0 java.lang.String)
      (r6v0 java.lang.String)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0006: ARITH (r11v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
      (wrap long:?: TERNARY null = ((wrap int:0x000b: ARITH (r11v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, long):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, long):void type: THIS */
    public /* synthetic */ PhoneNumberSnaComponent(String str, PhoneNumberSna phoneNumberSna, String str2, String str3, String str4, String str5, Integer num, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, phoneNumberSna, str2, str3, str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? 0L : j10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneNumberSnaComponent(@NotNull PhoneNumberSna config) {
        this(config.getName(), config, null, null, null, null, null, 0L, 224, null);
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
