package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputNumber;
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
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010B\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R(\u0010I\u001a\u00020C8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010D\u0012\u0004\bH\u0010A\u001a\u0004\b<\u0010E\"\u0004\bF\u0010G¨\u0006J"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/n4;", "Lcr/o;", "Lcr/x;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;)V", "newValue", "m", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "J", "R0", "()J", "", "Lmr/a;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Ler/k;", "Ler/k;", "()Ler/k;", "k", "(Ler/k;)V", "getNumberController$annotations", "numberController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputNumberComponent implements UiComponent, InterfaceC4286n4<InputNumberComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputNumberComponent> CREATOR = new C4060a();

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
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public C5202k numberController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4060a implements Parcelable.Creator<InputNumberComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputNumberComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputNumberComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputNumberComponent[] newArray(int i10) {
            return new InputNumberComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputNumberComponent(@NotNull String name, @Nullable Number number, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.numberController = new C5202k(number);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputNumberComponent m20751j(InputNumberComponent inputNumberComponent, String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputNumberComponent.name;
        }
        if ((i10 & 2) != 0) {
            number = inputNumberComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputNumberComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputNumberComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            j10 = inputNumberComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        return inputNumberComponent.m20752g(str, number, jsonLogicBoolean, jsonLogicBoolean2, j11);
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
        if (!(other instanceof InputNumberComponent)) {
            return false;
        }
        InputNumberComponent inputNumberComponent = (InputNumberComponent) other;
        return Intrinsics.m31980c(this.name, inputNumberComponent.name) && Intrinsics.m31980c(this.value, inputNumberComponent.value) && Intrinsics.m31980c(this.hidden, inputNumberComponent.hidden) && Intrinsics.m31980c(this.disabled, inputNumberComponent.disabled) && this.lastValueUpdateTs == inputNumberComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4286n4
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public C5202k getNumberController() {
        return this.numberController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputNumberComponent m20752g(@NotNull String name, @Nullable Number value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputNumberComponent(name, value, hidden, disabled, lastValueUpdateTs);
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
        return ((iHashCode3 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    /* JADX INFO: renamed from: k */
    public void m20753k(@NotNull C5202k c5202k) {
        Intrinsics.checkNotNullParameter(c5202k, "<set-?>");
        this.numberController = c5202k;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4286n4
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public InputNumberComponent mo20676a(@Nullable Number newValue) {
        InputNumberComponent inputNumberComponentM20751j = m20751j(this, null, newValue, null, null, System.currentTimeMillis(), 13, null);
        inputNumberComponentM20751j.m20753k(getNumberController());
        return inputNumberComponentM20751j;
    }

    @NotNull
    public String toString() {
        return "InputNumberComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeSerializable(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (r8v0 java.lang.String)
      (r9v0 java.lang.Number)
      (r10v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r11v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
     A[MD:(java.lang.String, java.lang.Number, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent.<init>(java.lang.String, java.lang.Number, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void type: THIS */
    public /* synthetic */ InputNumberComponent(String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, number, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputNumberComponent(@NotNull InputNumber config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputNumber.Attributes attributes = config.getAttributes();
        Number prefill = attributes != null ? attributes.getPrefill() : null;
        InputNumber.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputNumber.Attributes attributes3 = config.getAttributes();
        this(name, prefill, hidden, attributes3 != null ? attributes3.getDisabled() : null, 0L, 16, null);
    }
}
