package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.SubmitButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R&\u0010<\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R(\u0010C\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bB\u0010;\u001a\u0004\b?\u0010@\"\u0004\b$\u0010A¨\u0006D"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "getDisabled", "d", "getAutoSubmitCountdownText", "e", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "f", "J", "R0", "()J", "", "Lmr/a;", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "h", "Z", "Y0", "()Z", "(Z)V", "getWasTapped$annotations", "wasTapped", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class SubmitButtonComponent implements ButtonComponent {

    @NotNull
    public static final Parcelable.Creator<SubmitButtonComponent> CREATOR = new C4081a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String autoSubmitCountdownText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer autoSubmitIntervalSeconds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean wasTapped;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4081a implements Parcelable.Creator<SubmitButtonComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SubmitButtonComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubmitButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(SubmitButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(SubmitButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SubmitButtonComponent[] newArray(int i10) {
            return new SubmitButtonComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SubmitButtonComponent(@NotNull String name, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable Integer num, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, cr.InterfaceC4248h2
    /* JADX INFO: renamed from: b */
    public void mo20533b(boolean z10) {
        this.wasTapped = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitButtonComponent)) {
            return false;
        }
        SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) other;
        return Intrinsics.m31980c(this.name, submitButtonComponent.name) && Intrinsics.m31980c(this.hidden, submitButtonComponent.hidden) && Intrinsics.m31980c(this.disabled, submitButtonComponent.disabled) && Intrinsics.m31980c(this.autoSubmitCountdownText, submitButtonComponent.autoSubmitCountdownText) && Intrinsics.m31980c(this.autoSubmitIntervalSeconds, submitButtonComponent.autoSubmitIntervalSeconds) && this.lastValueUpdateTs == submitButtonComponent.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent
    @Nullable
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent
    @Nullable
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
    }

    @Override // cr.InterfaceC4287o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // cr.InterfaceC4341x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.autoSubmitCountdownText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        return ((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "SubmitButtonComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r11v0 java.lang.String)
      (r12v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r13v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r14v0 java.lang.String)
      (r15v0 java.lang.Integer)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.Integer, long):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.Integer, long):void type: THIS */
    public /* synthetic */ SubmitButtonComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, jsonLogicBoolean2, str2, num, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubmitButtonComponent(@NotNull SubmitButton config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        BasicButtonAttributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        BasicButtonAttributes attributes2 = config.getAttributes();
        JsonLogicBoolean disabled = attributes2 != null ? attributes2.getDisabled() : null;
        BasicButtonAttributes attributes3 = config.getAttributes();
        String autoSubmitCountdownText = attributes3 != null ? attributes3.getAutoSubmitCountdownText() : null;
        BasicButtonAttributes attributes4 = config.getAttributes();
        this(name, hidden, disabled, autoSubmitCountdownText, attributes4 != null ? attributes4.getAutoSubmitIntervalSeconds() : null, 0L, 32, null);
    }
}
