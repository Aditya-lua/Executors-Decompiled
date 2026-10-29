package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCheckbox;
import cr.InterfaceC4280m4;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import er.C5207p;
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
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R&\u0010A\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R(\u0010H\u001a\u00020B8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010C\u0012\u0004\bG\u0010@\u001a\u0004\b;\u0010D\"\u0004\bE\u0010F¨\u0006I"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/m4;", "Lcr/o;", "Lcr/x;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;Z)V", "newValue", "m", "(Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Z", "getValue", "()Z", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "J", "R0", "()J", "", "Lmr/a;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Ler/p;", "Ler/p;", "()Ler/p;", "k", "(Ler/p;)V", "getTwoStateViewController$annotations", "twoStateViewController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputCheckboxComponent implements UiComponent, InterfaceC4280m4<InputCheckboxComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputCheckboxComponent> CREATOR = new C4043a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean value;

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
    public C5207p twoStateViewController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4043a implements Parcelable.Creator<InputCheckboxComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputCheckboxComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCheckboxComponent(parcel.readString(), parcel.readInt() != 0, (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputCheckboxComponent[] newArray(int i10) {
            return new InputCheckboxComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputCheckboxComponent(@NotNull String name, boolean z10, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = z10;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.twoStateViewController = new C5207p(z10);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getTwoStateViewController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputCheckboxComponent m20649j(InputCheckboxComponent inputCheckboxComponent, String str, boolean z10, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputCheckboxComponent.name;
        }
        if ((i10 & 2) != 0) {
            z10 = inputCheckboxComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputCheckboxComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputCheckboxComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            j10 = inputCheckboxComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        return inputCheckboxComponent.m20652g(str, z10, jsonLogicBoolean, jsonLogicBoolean2, j11);
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
        if (!(other instanceof InputCheckboxComponent)) {
            return false;
        }
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) other;
        return Intrinsics.m31980c(this.name, inputCheckboxComponent.name) && this.value == inputCheckboxComponent.value && Intrinsics.m31980c(this.hidden, inputCheckboxComponent.hidden) && Intrinsics.m31980c(this.disabled, inputCheckboxComponent.disabled) && this.lastValueUpdateTs == inputCheckboxComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4280m4
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public C5207p getTwoStateViewController() {
        return this.twoStateViewController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputCheckboxComponent m20652g(@NotNull String name, boolean value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputCheckboxComponent(name, value, hidden, disabled, lastValueUpdateTs);
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
        int iHashCode = ((this.name.hashCode() * 31) + Boolean.hashCode(this.value)) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return ((iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    /* JADX INFO: renamed from: k */
    public void m20653k(@NotNull C5207p c5207p) {
        Intrinsics.checkNotNullParameter(c5207p, "<set-?>");
        this.twoStateViewController = c5207p;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4280m4
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public InputCheckboxComponent mo20650a(boolean newValue) {
        InputCheckboxComponent inputCheckboxComponentM20649j = m20649j(this, null, newValue, null, null, System.currentTimeMillis(), 13, null);
        inputCheckboxComponentM20649j.m20653k(getTwoStateViewController());
        return inputCheckboxComponentM20649j;
    }

    @NotNull
    public String toString() {
        return "InputCheckboxComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.value ? 1 : 0);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (r8v0 java.lang.String)
      (r9v0 boolean)
      (r10v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r11v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
     A[MD:(java.lang.String, boolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent.<init>(java.lang.String, boolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void type: THIS */
    public /* synthetic */ InputCheckboxComponent(String str, boolean z10, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputCheckboxComponent(InputCheckbox inputCheckbox, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean prefill;
        if ((i10 & 2) != 0) {
            InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
            z10 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? false : prefill.booleanValue();
        }
        this(inputCheckbox, z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputCheckboxComponent(@NotNull InputCheckbox config, boolean z10) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputCheckbox.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        this(name, z10, hidden, attributes2 != null ? attributes2.getDisabled() : null, 0L, 16, null);
    }
}
