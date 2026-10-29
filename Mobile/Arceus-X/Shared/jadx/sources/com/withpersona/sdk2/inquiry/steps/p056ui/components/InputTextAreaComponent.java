package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
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
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010D\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b \u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR(\u0010L\u001a\u00020E8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010C\u001a\u0004\b9\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o4;", "Lcr/o;", "Lcr/x;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)V", "newString", "n", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "k", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "f", "J", "R0", "()J", "", "Lmr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lan/r;", "h", "Lan/r;", "()Lan/r;", "m", "(Lan/r;)V", "getTextController$annotations", "textController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputTextAreaComponent implements UiComponent, InterfaceC4292o4<InputTextAreaComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputTextAreaComponent> CREATOR = new C4067a();

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
    public final TextBasedComponentStyle errorTextStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r textController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4067a implements Parcelable.Creator<InputTextAreaComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputTextAreaComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputTextAreaComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputTextAreaComponent[] newArray(int i10) {
            return new InputTextAreaComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputTextAreaComponent(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable TextBasedComponentStyle textBasedComponentStyle, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.textController = C0392u.m1458a(value);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputTextAreaComponent m20786j(InputTextAreaComponent inputTextAreaComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputTextAreaComponent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = inputTextAreaComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputTextAreaComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputTextAreaComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            textBasedComponentStyle = inputTextAreaComponent.errorTextStyle;
        }
        if ((i10 & 32) != 0) {
            j10 = inputTextAreaComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputTextAreaComponent.m20787g(str, str2, jsonLogicBoolean3, jsonLogicBoolean2, textBasedComponentStyle2, j11);
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
        if (!(other instanceof InputTextAreaComponent)) {
            return false;
        }
        InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) other;
        return Intrinsics.m31980c(this.name, inputTextAreaComponent.name) && Intrinsics.m31980c(this.value, inputTextAreaComponent.value) && Intrinsics.m31980c(this.hidden, inputTextAreaComponent.hidden) && Intrinsics.m31980c(this.disabled, inputTextAreaComponent.disabled) && Intrinsics.m31980c(this.errorTextStyle, inputTextAreaComponent.errorTextStyle) && this.lastValueUpdateTs == inputTextAreaComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4292o4
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public InterfaceC0389r getTextController() {
        return this.textController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputTextAreaComponent m20787g(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable TextBasedComponentStyle errorTextStyle, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputTextAreaComponent(name, value, hidden, disabled, errorTextStyle, lastValueUpdateTs);
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
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        return ((iHashCode3 + (textBasedComponentStyle != null ? textBasedComponentStyle.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
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

    /* JADX INFO: renamed from: m */
    public void m20789m(@NotNull InterfaceC0389r interfaceC0389r) {
        Intrinsics.checkNotNullParameter(interfaceC0389r, "<set-?>");
        this.textController = interfaceC0389r;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4292o4
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InputTextAreaComponent mo20667a(@NotNull String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputTextAreaComponent inputTextAreaComponentM20786j = m20786j(this, null, newString, null, null, null, System.currentTimeMillis(), 29, null);
        inputTextAreaComponentM20786j.m20789m(getTextController());
        return inputTextAreaComponentM20786j;
    }

    @NotNull
    public String toString() {
        return "InputTextAreaComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r11v0 java.lang.String)
      (r12v0 java.lang.String)
      (r13v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r14v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r15v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, long):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, long):void type: THIS */
    public /* synthetic */ InputTextAreaComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputTextAreaComponent(@NotNull InputTextArea config) {
        String prefill;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputTextArea.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill;
        InputTextArea.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputTextArea.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputTextBasedComponentStyle styles = config.getStyles();
        this(name, str, hidden, disabled, styles != null ? styles.getErrorTextStyle() : null, 0L, 32, null);
    }
}
