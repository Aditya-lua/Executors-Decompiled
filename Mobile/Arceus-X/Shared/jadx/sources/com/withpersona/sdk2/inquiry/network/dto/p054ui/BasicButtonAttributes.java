package com.withpersona.sdk2.inquiry.network.dto.p054ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\bJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", Text.type, "", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getText", "()Ljava/lang/String;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "getAutoSubmitCountdownText", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class BasicButtonAttributes implements BaseButtonAttributes {

    @NotNull
    public static final Parcelable.Creator<BasicButtonAttributes> CREATOR = new Creator();

    @Nullable
    private final String autoSubmitCountdownText;

    @Nullable
    private final Integer autoSubmitIntervalSeconds;

    @Nullable
    private final Button.ButtonType buttonType;

    @Nullable
    private final JsonLogicBoolean disabled;

    @Nullable
    private final JsonLogicBoolean hidden;

    @NotNull
    private final String text;

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<BasicButtonAttributes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasicButtonAttributes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasicButtonAttributes(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasicButtonAttributes[] newArray(int i10) {
            return new BasicButtonAttributes[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BasicButtonAttributes(@NotNull String text, @Nullable Button.ButtonType buttonType, @Nullable String str, @Nullable Integer num, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.buttonType = buttonType;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
    @Nullable
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
    @Nullable
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
    @Nullable
    public Button.ButtonType getButtonType() {
        return this.buttonType;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
    @NotNull
    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        Button.ButtonType buttonType = this.buttonType;
        if (buttonType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(buttonType.name());
        }
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        if (jsonLogicBoolean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            jsonLogicBoolean.writeToParcel(dest, flags);
        }
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        if (jsonLogicBoolean2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            jsonLogicBoolean2.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
      (r2v0 java.lang.String)
      (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.Button$ButtonType)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0006: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
      (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r6v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
      (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x0010: ARITH (r8v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r7v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.Button$ButtonType, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.Button$ButtonType, java.lang.String, java.lang.Integer, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean):void type: THIS */
    public /* synthetic */ BasicButtonAttributes(String str, Button.ButtonType buttonType, String str2, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, buttonType, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : jsonLogicBoolean, (i10 & 32) != 0 ? null : jsonLogicBoolean2);
    }
}
