package com.withpersona.sdk2.inquiry.network.dto.p054ui.styling;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\u0018\u0000 \u00042\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements;", "", "<init>", "()V", "Companion", "Size", "Measurement", "MeasurementSet", "Position", "DPSize", "SizeSet", "SimpleElementColor", "SimpleElementColorValue", "ComplexElementColor", "PositionType", "FontName", "FontWeightContainer", "FontWeight", "ChildSizes", "AxisContainer", "Axis", "FontStyle", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class StyleElements {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum Axis {
        HORIZONTAL,
        VERTICAL;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<Axis> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.Axis.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable Axis value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public Axis fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM44315B = reader.m44315B();
                if (Intrinsics.m31980c(objM44315B, "horizontal")) {
                    return Axis.HORIZONTAL;
                }
                return Intrinsics.m31980c(objM44315B, "vertical") ? Axis.VERTICAL : Axis.HORIZONTAL;
            }
        }

        @NotNull
        public static InterfaceC10707a<Axis> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class AxisContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AxisContainer> CREATOR = new Creator();

        @Nullable
        private final Axis base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<AxisContainer> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AxisContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AxisContainer(parcel.readInt() == 0 ? null : Axis.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AxisContainer[] newArray(int i10) {
                return new AxisContainer[i10];
            }
        }

        public AxisContainer(@Nullable Axis axis) {
            this.base = axis;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Axis getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Axis axis = this.base;
            if (axis == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(axis.name());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;", "Landroid/os/Parcelable;", "base", "", "<init>", "([I)V", "getBase", "()[I", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class ChildSizes implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ChildSizes> CREATOR = new Creator();

        @Nullable
        private final int[] base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<ChildSizes> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChildSizes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChildSizes(parcel.createIntArray());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChildSizes[] newArray(int i10) {
                return new ChildSizes[i10];
            }
        }

        public ChildSizes(@Nullable int[] iArr) {
            this.base = iArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final int[] getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeIntArray(this.base);
        }
    }

    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Companion;", "", "<init>", "()V", "Lum/m;", "reader", "", "getStringFromJsonReader", "(Lum/m;)Ljava/lang/String;", "", "getDoubleFromJsonReader", "(Lum/m;)Ljava/lang/Double;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Double getDoubleFromJsonReader(AbstractC11878m reader) {
            if (reader.mo44339u() != AbstractC11878m.c.NULL) {
                return Double.valueOf(reader.mo44332j());
            }
            reader.mo44321P();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getStringFromJsonReader(AbstractC11878m reader) {
            if (reader.mo44339u() != AbstractC11878m.c.NULL) {
                return reader.mo44338r();
            }
            reader.mo44321P();
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "Landroid/os/Parcelable;", "_base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "_focused", "_active", "_disabled", "_errored", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;)V", "get_base", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "get_focused", "get_active", "get_disabled", "get_errored", "base", "", "getBase", "()Ljava/lang/Integer;", "focused", "getFocused", "active", "getActive", "disabled", "getDisabled", "errored", "getErrored", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class ComplexElementColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ComplexElementColor> CREATOR = new Creator();

        @Nullable
        private final SimpleElementColorValue _active;

        @Nullable
        private final SimpleElementColorValue _base;

        @Nullable
        private final SimpleElementColorValue _disabled;

        @Nullable
        private final SimpleElementColorValue _errored;

        @Nullable
        private final SimpleElementColorValue _focused;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexElementColor> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexElementColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComplexElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SimpleElementColorValue.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexElementColor[] newArray(int i10) {
                return new ComplexElementColor[i10];
            }
        }

        public ComplexElementColor(@InterfaceC11872g(name = "base") @Nullable SimpleElementColorValue simpleElementColorValue, @InterfaceC11872g(name = "focused") @Nullable SimpleElementColorValue simpleElementColorValue2, @InterfaceC11872g(name = "active") @Nullable SimpleElementColorValue simpleElementColorValue3, @InterfaceC11872g(name = "disabled") @Nullable SimpleElementColorValue simpleElementColorValue4, @InterfaceC11872g(name = "errored") @Nullable SimpleElementColorValue simpleElementColorValue5) {
            this._base = simpleElementColorValue;
            this._focused = simpleElementColorValue2;
            this._active = simpleElementColorValue3;
            this._disabled = simpleElementColorValue4;
            this._errored = simpleElementColorValue5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Integer getActive() {
            SimpleElementColorValue simpleElementColorValue = this._active;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        @Nullable
        public final Integer getBase() {
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        @Nullable
        public final Integer getDisabled() {
            SimpleElementColorValue simpleElementColorValue = this._disabled;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        @Nullable
        public final Integer getErrored() {
            SimpleElementColorValue simpleElementColorValue = this._errored;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        @Nullable
        public final Integer getFocused() {
            SimpleElementColorValue simpleElementColorValue = this._focused;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        @Nullable
        public final SimpleElementColorValue get_active() {
            return this._active;
        }

        @Nullable
        public final SimpleElementColorValue get_base() {
            return this._base;
        }

        @Nullable
        public final SimpleElementColorValue get_disabled() {
            return this._disabled;
        }

        @Nullable
        public final SimpleElementColorValue get_errored() {
            return this._errored;
        }

        @Nullable
        public final SimpleElementColorValue get_focused() {
            return this._focused;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue2 = this._focused;
            if (simpleElementColorValue2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue2.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue3 = this._active;
            if (simpleElementColorValue3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue3.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue4 = this._disabled;
            if (simpleElementColorValue4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue4.writeToParcel(dest, flags);
            }
            SimpleElementColorValue simpleElementColorValue5 = this._errored;
            if (simpleElementColorValue5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue5.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "dp", "", "<init>", "(D)V", "getDp", "()Ljava/lang/Double;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public static final class DPSize implements Parcelable, Size {
        private final double dp;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<DPSize> CREATOR = new Creator();

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "<init>", "()V", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<DPSize> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.DPSize.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable DPSize value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @Nullable
            @InterfaceC11871f
            public DPSize fromJson(@NotNull AbstractC11878m reader) {
                Double dValueOf;
                String stringFromJsonReader;
                Intrinsics.checkNotNullParameter(reader, "reader");
                if (reader.mo44339u() == AbstractC11878m.c.BEGIN_OBJECT) {
                    reader.mo44325b();
                    dValueOf = null;
                    stringFromJsonReader = null;
                    while (reader.mo44329f()) {
                        String strMo44335n = reader.mo44335n();
                        if (Intrinsics.m31980c(strMo44335n, "unit")) {
                            stringFromJsonReader = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else if (Intrinsics.m31980c(strMo44335n, "value")) {
                            dValueOf = StyleElements.INSTANCE.getDoubleFromJsonReader(reader);
                        } else {
                            reader.mo44321P();
                        }
                    }
                    reader.mo44327d();
                } else {
                    reader.mo44321P();
                    dValueOf = null;
                    stringFromJsonReader = null;
                }
                if (Intrinsics.m31980c(stringFromJsonReader, "%") && dValueOf != null) {
                    dValueOf = Double.valueOf(StyleElementsKt.getPxToDp(Resources.getSystem().getDisplayMetrics().widthPixels) * (dValueOf.doubleValue() / 100.0d));
                }
                if (dValueOf == null) {
                    return null;
                }
                return new DPSize(dValueOf.doubleValue());
            }
        }

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<DPSize> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSize createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DPSize(parcel.readDouble());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSize[] newArray(int i10) {
                return new DPSize[i10];
            }
        }

        public DPSize(double d10) {
            this.dp = d10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.Size
        @NotNull
        public Double getDp() {
            return Double.valueOf(this.dp);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.dp);
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "Landroid/os/Parcelable;", "fontName", "", "<init>", "(Ljava/lang/String;)V", "getFontName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public static final class FontName implements Parcelable {

        @Nullable
        private final String fontName;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<FontName> CREATOR = new Creator();

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "<init>", "()V", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<FontName> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.FontName.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable FontName value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public FontName fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                String stringFromJsonReader = null;
                if (reader.mo44339u() == AbstractC11878m.c.BEGIN_OBJECT) {
                    reader.mo44325b();
                    while (reader.mo44329f()) {
                        if (Intrinsics.m31980c(reader.mo44335n(), "base")) {
                            stringFromJsonReader = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else {
                            reader.mo44321P();
                        }
                    }
                    reader.mo44327d();
                } else {
                    reader.mo44321P();
                }
                return new FontName(stringFromJsonReader);
            }
        }

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<FontName> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FontName(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i10) {
                return new FontName[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public FontName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getFontName() {
            return this.fontName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fontName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public FontName(@Nullable String str) {
            this.fontName = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
         A[MD:(java.lang.String):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.FontName.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ FontName(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "ITALIC", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum FontStyle {
        NORMAL,
        ITALIC;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<FontStyle> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.FontStyle.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable FontStyle value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public FontStyle fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Intrinsics.m31980c(reader.m44315B(), "italic") ? FontStyle.ITALIC : FontStyle.NORMAL;
            }
        }

        @NotNull
        public static InterfaceC10707a<FontStyle> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "", "<init>", "(Ljava/lang/String;I)V", "THIN", "EXTRA_LIGHT", "LIGHT", "NORMAL", "MEDIUM", "SEMI_BOLD", "BOLD", "EXTRA_BOLD", "HEAVY", "EXTRA_BLACK", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum FontWeight {
        THIN,
        EXTRA_LIGHT,
        LIGHT,
        NORMAL,
        MEDIUM,
        SEMI_BOLD,
        BOLD,
        EXTRA_BOLD,
        HEAVY,
        EXTRA_BLACK;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<FontWeight> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.FontWeight.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable FontWeight value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public FontWeight fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM44315B = reader.m44315B();
                if (Intrinsics.m31980c(objM44315B, "thin")) {
                    return FontWeight.THIN;
                }
                if (Intrinsics.m31980c(objM44315B, "extra light")) {
                    return FontWeight.EXTRA_LIGHT;
                }
                if (Intrinsics.m31980c(objM44315B, "light")) {
                    return FontWeight.LIGHT;
                }
                if (Intrinsics.m31980c(objM44315B, "normal")) {
                    return FontWeight.NORMAL;
                }
                if (Intrinsics.m31980c(objM44315B, "medium")) {
                    return FontWeight.MEDIUM;
                }
                if (Intrinsics.m31980c(objM44315B, "semi bold")) {
                    return FontWeight.SEMI_BOLD;
                }
                if (Intrinsics.m31980c(objM44315B, "bold")) {
                    return FontWeight.BOLD;
                }
                if (Intrinsics.m31980c(objM44315B, "extra bold")) {
                    return FontWeight.EXTRA_BOLD;
                }
                if (Intrinsics.m31980c(objM44315B, "heavy")) {
                    return FontWeight.HEAVY;
                }
                return Intrinsics.m31980c(objM44315B, "extra black") ? FontWeight.EXTRA_BLACK : FontWeight.NORMAL;
            }
        }

        @NotNull
        public static InterfaceC10707a<FontWeight> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class FontWeightContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FontWeightContainer> CREATOR = new Creator();

        @Nullable
        private final FontWeight base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<FontWeightContainer> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeightContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FontWeightContainer(parcel.readInt() == 0 ? null : FontWeight.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeightContainer[] newArray(int i10) {
                return new FontWeightContainer[i10];
            }
        }

        public FontWeightContainer(@Nullable FontWeight fontWeight) {
            this.base = fontWeight;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final FontWeight getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            FontWeight fontWeight = this.base;
            if (fontWeight == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(fontWeight.name());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Measurement implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Measurement> CREATOR = new Creator();

        @Nullable
        private final Size base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Measurement> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Measurement createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Measurement((Size) parcel.readParcelable(Measurement.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Measurement[] newArray(int i10) {
                return new Measurement[i10];
            }
        }

        public Measurement(@Nullable Size size) {
            this.base = size;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Size getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.base, flags);
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class MeasurementSet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MeasurementSet> CREATOR = new Creator();

        @Nullable
        private final SizeSet base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<MeasurementSet> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MeasurementSet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MeasurementSet(parcel.readInt() == 0 ? null : SizeSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MeasurementSet[] newArray(int i10) {
                return new MeasurementSet[i10];
            }
        }

        public MeasurementSet(@Nullable SizeSet sizeSet) {
            this.base = sizeSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final SizeSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            SizeSet sizeSet = this.base;
            if (sizeSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                sizeSet.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Position implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Position> CREATOR = new Creator();

        @Nullable
        private final PositionType base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Position(parcel.readInt() == 0 ? null : PositionType.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position[] newArray(int i10) {
                return new Position[i10];
            }
        }

        public Position(@Nullable PositionType positionType) {
            this.base = positionType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final PositionType getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PositionType positionType = this.base;
            if (positionType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(positionType.name());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum PositionType {
        START,
        CENTER,
        END;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<PositionType> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.PositionType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable PositionType value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @Nullable
            @InterfaceC11871f
            public PositionType fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM44315B = reader.m44315B();
                if (Intrinsics.m31980c(objM44315B, "start")) {
                    return PositionType.START;
                }
                if (Intrinsics.m31980c(objM44315B, "center")) {
                    return PositionType.CENTER;
                }
                if (Intrinsics.m31980c(objM44315B, "end")) {
                    return PositionType.END;
                }
                return null;
            }
        }

        @NotNull
        public static InterfaceC10707a<PositionType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class SimpleElementColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SimpleElementColor> CREATOR = new Creator();

        @Nullable
        private final SimpleElementColorValue base;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<SimpleElementColor> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColor[] newArray(int i10) {
                return new SimpleElementColor[i10];
            }
        }

        public SimpleElementColor(@Nullable SimpleElementColorValue simpleElementColorValue) {
            this.base = simpleElementColorValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final SimpleElementColorValue getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            SimpleElementColorValue simpleElementColorValue = this.base;
            if (simpleElementColorValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColorValue.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;", "Landroid/os/Parcelable;", "value", "", "<init>", "(Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class SimpleElementColorValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SimpleElementColorValue> CREATOR = new Creator();

        @Nullable
        private final Integer value;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<SimpleElementColorValue> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColorValue createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleElementColorValue(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColorValue[] newArray(int i10) {
                return new SimpleElementColorValue[i10];
            }
        }

        public SimpleElementColorValue(@RgbaHexColor @Nullable Integer num) {
            this.value = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Integer getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.value;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "Landroid/os/Parcelable;", "dp", "", "getDp", "()Ljava/lang/Double;", "PercentSize", "Companion", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$PercentSize;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface Size extends Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "<init>", "()V", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<Size> {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable Size value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @Nullable
            @InterfaceC11871f
            public Size fromJson(@NotNull AbstractC11878m reader) {
                Double doubleFromJsonReader;
                String stringFromJsonReader;
                Intrinsics.checkNotNullParameter(reader, "reader");
                if (reader.mo44339u() == AbstractC11878m.c.BEGIN_OBJECT) {
                    reader.mo44325b();
                    doubleFromJsonReader = null;
                    stringFromJsonReader = null;
                    while (reader.mo44329f()) {
                        String strMo44335n = reader.mo44335n();
                        if (Intrinsics.m31980c(strMo44335n, "unit")) {
                            stringFromJsonReader = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else if (Intrinsics.m31980c(strMo44335n, "value")) {
                            doubleFromJsonReader = StyleElements.INSTANCE.getDoubleFromJsonReader(reader);
                        } else {
                            reader.mo44321P();
                        }
                    }
                    reader.mo44327d();
                } else {
                    reader.mo44321P();
                    doubleFromJsonReader = null;
                    stringFromJsonReader = null;
                }
                if (Intrinsics.m31980c(stringFromJsonReader, "%") && doubleFromJsonReader != null) {
                    return new PercentSize(doubleFromJsonReader.doubleValue() / 100.0d);
                }
                if (doubleFromJsonReader != null) {
                    return new DPSize(doubleFromJsonReader.doubleValue());
                }
                return null;
            }
        }

        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size$PercentSize;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "percent", "", "<init>", "(D)V", "getPercent", "()D", "dp", "getDp", "()Ljava/lang/Double;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class PercentSize implements Size {

            @NotNull
            public static final Parcelable.Creator<PercentSize> CREATOR = new Creator();
            private final double percent;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<PercentSize> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PercentSize createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PercentSize(parcel.readDouble());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PercentSize[] newArray(int i10) {
                    return new PercentSize[i10];
                }
            }

            public PercentSize(double d10) {
                this.percent = d10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements.Size
            @Nullable
            public Double getDp() {
                return null;
            }

            public final double getPercent() {
                return this.percent;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeDouble(this.percent);
            }
        }

        @Nullable
        Double getDp();
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "Landroid/os/Parcelable;", "top", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "bottom", "left", "right", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V", "getTop", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getBottom", "getLeft", "getRight", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class SizeSet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SizeSet> CREATOR = new Creator();

        @Nullable
        private final Size bottom;

        @Nullable
        private final Size left;

        @Nullable
        private final Size right;

        @Nullable
        private final Size top;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<SizeSet> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SizeSet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SizeSet((Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()), (Size) parcel.readParcelable(SizeSet.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SizeSet[] newArray(int i10) {
                return new SizeSet[i10];
            }
        }

        public SizeSet(@Nullable Size size, @Nullable Size size2, @Nullable Size size3, @Nullable Size size4) {
            this.top = size;
            this.bottom = size2;
            this.left = size3;
            this.right = size4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Size getBottom() {
            return this.bottom;
        }

        @Nullable
        public final Size getLeft() {
            return this.left;
        }

        @Nullable
        public final Size getRight() {
            return this.right;
        }

        @Nullable
        public final Size getTop() {
            return this.top;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.top, flags);
            dest.writeParcelable(this.bottom, flags);
            dest.writeParcelable(this.left, flags);
            dest.writeParcelable(this.right, flags);
        }
    }
}
