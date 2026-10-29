package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import cr.InterfaceC4287o;
import cr.InterfaceC4292o4;
import cr.InterfaceC4341x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0392u;
import p016an.InterfaceC0389r;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010D\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b \u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR(\u0010L\u001a\u00020E8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010C\u001a\u0004\b9\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o4;", "Lcr/o;", "Lcr/x;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "styles", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)V", "newString", "n", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "k", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "f", "J", "R0", "()J", "", "Lmr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lan/r;", "h", "Lan/r;", "()Lan/r;", "m", "(Lan/r;)V", "getTextController$annotations", "textController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputMaskedTextComponent implements UiComponent, InterfaceC4292o4<InputMaskedTextComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputMaskedTextComponent> CREATOR = new C4057a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final InputTextBasedComponentStyle styles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r textController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4057a implements Parcelable.Creator<InputMaskedTextComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMaskedTextComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputMaskedTextComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), (InputTextBasedComponentStyle) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMaskedTextComponent[] newArray(int i10) {
            return new InputMaskedTextComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputMaskedTextComponent(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable InputTextBasedComponentStyle inputTextBasedComponentStyle, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.styles = inputTextBasedComponentStyle;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.textController = C0392u.m1458a(value);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputMaskedTextComponent m20734j(InputMaskedTextComponent inputMaskedTextComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, InputTextBasedComponentStyle inputTextBasedComponentStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputMaskedTextComponent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = inputMaskedTextComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputMaskedTextComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputMaskedTextComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            inputTextBasedComponentStyle = inputMaskedTextComponent.styles;
        }
        if ((i10 & 32) != 0) {
            j10 = inputMaskedTextComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        InputTextBasedComponentStyle inputTextBasedComponentStyle2 = inputTextBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputMaskedTextComponent.m20735g(str, str2, jsonLogicBoolean3, jsonLogicBoolean2, inputTextBasedComponentStyle2, j11);
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
        if (!(other instanceof InputMaskedTextComponent)) {
            return false;
        }
        InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) other;
        return Intrinsics.m31980c(this.name, inputMaskedTextComponent.name) && Intrinsics.m31980c(this.value, inputMaskedTextComponent.value) && Intrinsics.m31980c(this.hidden, inputMaskedTextComponent.hidden) && Intrinsics.m31980c(this.disabled, inputMaskedTextComponent.disabled) && Intrinsics.m31980c(this.styles, inputMaskedTextComponent.styles) && this.lastValueUpdateTs == inputMaskedTextComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4292o4
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public InterfaceC0389r getTextController() {
        return this.textController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputMaskedTextComponent m20735g(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable InputTextBasedComponentStyle styles, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputMaskedTextComponent(name, value, hidden, disabled, styles, lastValueUpdateTs);
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
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
        return ((iHashCode3 + (inputTextBasedComponentStyle != null ? inputTextBasedComponentStyle.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final InputTextBasedComponentStyle getStyles() {
        return this.styles;
    }

    /* JADX INFO: renamed from: m */
    public void m20737m(@NotNull InterfaceC0389r interfaceC0389r) {
        Intrinsics.checkNotNullParameter(interfaceC0389r, "<set-?>");
        this.textController = interfaceC0389r;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4292o4
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InputMaskedTextComponent mo20667a(@NotNull String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputMaskedTextComponent inputMaskedTextComponentM20734j = m20734j(this, null, newString, null, null, null, System.currentTimeMillis(), 29, null);
        inputMaskedTextComponentM20734j.m20737m(getTextController());
        return inputMaskedTextComponentM20734j;
    }

    @NotNull
    public String toString() {
        return "InputMaskedTextComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", styles=" + this.styles + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.styles, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r11v0 java.lang.String)
      (r12v0 java.lang.String)
      (r13v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r14v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r15v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle, long):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle, long):void type: THIS */
    public /* synthetic */ InputMaskedTextComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, InputTextBasedComponentStyle inputTextBasedComponentStyle, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsonLogicBoolean, jsonLogicBoolean2, inputTextBasedComponentStyle, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputMaskedTextComponent(@NotNull InputMaskedText config) {
        String prefill;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputMaskedText.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill;
        InputMaskedText.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputMaskedText.Attributes attributes3 = config.getAttributes();
        this(name, str, hidden, attributes3 != null ? attributes3.getDisabled() : null, config.getStyles(), 0L, 32, null);
    }
}
