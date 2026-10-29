package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import cr.InterfaceC4341x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00107\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00068"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/x;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "", "height", "width", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;IIJ)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Spacer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "I", "d", "f", "e", "J", "R0", "()J", "", "Lmr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class SpacerComponent implements UiComponent, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<SpacerComponent> CREATOR = new C4080a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final int height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int width;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4080a implements Parcelable.Creator<SpacerComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpacerComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpacerComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(SpacerComponent.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpacerComponent[] newArray(int i10) {
            return new SpacerComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SpacerComponent(@NotNull String name, @Nullable JsonLogicBoolean jsonLogicBoolean, int i10, int i11, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.height = i10;
        this.width = i11;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacerComponent)) {
            return false;
        }
        SpacerComponent spacerComponent = (SpacerComponent) other;
        return Intrinsics.m31980c(this.name, spacerComponent.name) && Intrinsics.m31980c(this.hidden, spacerComponent.hidden) && this.height == spacerComponent.height && this.width == spacerComponent.width && this.lastValueUpdateTs == spacerComponent.lastValueUpdateTs;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWidth() {
        return this.width;
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
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        return ((((((iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.width)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "SpacerComponent(name=" + this.name + ", hidden=" + this.hidden + ", height=" + this.height + ", width=" + this.width + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeInt(this.height);
        dest.writeInt(this.width);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (r8v0 java.lang.String)
      (r9v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r10v0 int)
      (r11v0 int)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, int, int, long):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, int, int, long):void type: THIS */
    public /* synthetic */ SpacerComponent(String str, JsonLogicBoolean jsonLogicBoolean, int i10, int i11, long j10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, i10, i11, (i12 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpacerComponent(@NotNull Spacer config) {
        int iIntValue;
        String height;
        String strH0;
        Integer intOrNull;
        AttributeStyles.SpacerWidthStyle width;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        Double dp2;
        AttributeStyles.SpacerHeightStyle height2;
        StyleElements.Measurement base3;
        StyleElements.Size base4;
        Double dp3;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        Spacer.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        Spacer.SpacerComponentStyle styles = config.getStyles();
        if (styles == null || (height2 = styles.getHeight()) == null || (base3 = height2.getBase()) == null || (base4 = base3.getBase()) == null || (dp3 = base4.getDp()) == null) {
            Spacer.Attributes attributes2 = config.getAttributes();
            iIntValue = (attributes2 == null || (height = attributes2.getHeight()) == null || (strH0 = StringsKt.m32127H0(height, "px")) == null || (intOrNull = StringsKt.toIntOrNull(strH0)) == null) ? 1 : intOrNull.intValue();
        } else {
            iIntValue = (int) C7265j.m30285a(dp3.doubleValue());
        }
        int i10 = iIntValue;
        Spacer.SpacerComponentStyle styles2 = config.getStyles();
        this(name, hidden, i10, (styles2 == null || (width = styles2.getWidth()) == null || (base = width.getBase()) == null || (base2 = base.getBase()) == null || (dp2 = base2.getDp()) == null) ? 0 : (int) C7265j.m30285a(dp2.doubleValue()), 0L, 16, null);
    }
}
