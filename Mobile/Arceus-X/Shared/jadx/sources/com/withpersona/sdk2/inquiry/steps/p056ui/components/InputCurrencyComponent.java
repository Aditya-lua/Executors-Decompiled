package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import cr.InterfaceC4286n4;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import er.C5202k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 JT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010G\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b!\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR(\u0010O\u001a\u00020H8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bN\u0010F\u001a\u0004\b<\u0010K\"\u0004\bL\u0010M¨\u0006P"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/n4;", "Lcr/o;", "Lcr/x;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)V", "newValue", "o", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/lang/Number;", "m", "()Ljava/lang/Number;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "k", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "f", "J", "R0", "()J", "", "Lmr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Ler/k;", "h", "Ler/k;", "()Ler/k;", "n", "(Ler/k;)V", "getNumberController$annotations", "numberController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputCurrencyComponent implements UiComponent, InterfaceC4286n4<InputCurrencyComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputCurrencyComponent> CREATOR = new C4046a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Number value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final TextBasedComponentStyle errorTextStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public C5202k numberController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4046a implements Parcelable.Creator<InputCurrencyComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputCurrencyComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCurrencyComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputCurrencyComponent[] newArray(int i10) {
            return new InputCurrencyComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputCurrencyComponent(@NotNull String name, @Nullable Number number, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable TextBasedComponentStyle textBasedComponentStyle, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.numberController = new C5202k(number);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputCurrencyComponent m20675j(InputCurrencyComponent inputCurrencyComponent, String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputCurrencyComponent.name;
        }
        if ((i10 & 2) != 0) {
            number = inputCurrencyComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputCurrencyComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputCurrencyComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            textBasedComponentStyle = inputCurrencyComponent.errorTextStyle;
        }
        if ((i10 & 32) != 0) {
            j10 = inputCurrencyComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputCurrencyComponent.m20678g(str, number, jsonLogicBoolean3, jsonLogicBoolean2, textBasedComponentStyle2, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCurrencyComponent)) {
            return false;
        }
        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) other;
        return Intrinsics.m31980c(this.name, inputCurrencyComponent.name) && Intrinsics.m31980c(this.value, inputCurrencyComponent.value) && Intrinsics.m31980c(this.hidden, inputCurrencyComponent.hidden) && Intrinsics.m31980c(this.disabled, inputCurrencyComponent.disabled) && Intrinsics.m31980c(this.errorTextStyle, inputCurrencyComponent.errorTextStyle) && this.lastValueUpdateTs == inputCurrencyComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4286n4
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public C5202k getNumberController() {
        return this.numberController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputCurrencyComponent m20678g(@NotNull String name, @Nullable Number value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable TextBasedComponentStyle errorTextStyle, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputCurrencyComponent(name, value, hidden, disabled, errorTextStyle, lastValueUpdateTs);
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

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Number number = this.value;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        return ((iHashCode4 + (textBasedComponentStyle != null ? textBasedComponentStyle.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Number getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: n */
    public void m20681n(@NotNull C5202k c5202k) {
        Intrinsics.checkNotNullParameter(c5202k, "<set-?>");
        this.numberController = c5202k;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4286n4
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public InputCurrencyComponent mo20676a(@Nullable Number newValue) {
        InputCurrencyComponent inputCurrencyComponentM20675j = m20675j(this, null, newValue, null, null, null, System.currentTimeMillis(), 29, null);
        inputCurrencyComponentM20675j.m20681n(getNumberController());
        return inputCurrencyComponentM20675j;
    }

    @NotNull
    public String toString() {
        return "InputCurrencyComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeSerializable(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r11v0 java.lang.String)
      (r12v0 java.lang.Number)
      (r13v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r14v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r15v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
     A[MD:(java.lang.String, java.lang.Number, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, long):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent.<init>(java.lang.String, java.lang.Number, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, long):void type: THIS */
    public /* synthetic */ InputCurrencyComponent(String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, number, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputCurrencyComponent(@NotNull InputCurrency config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputCurrency.Attributes attributes = config.getAttributes();
        Number prefill = attributes != null ? attributes.getPrefill() : null;
        InputCurrency.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputCurrency.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputTextBasedComponentStyle styles = config.getStyles();
        this(name, prefill, hidden, disabled, styles != null ? styles.getErrorTextStyle() : null, 0L, 32, null);
    }
}
