package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.i;
import um.m;
import um.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "Landroid/os/Parcelable;", Payload.TYPE, "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Companion", "StringField", "IntegerField", "BooleanField", "FloatField", "DateField", "DatetimeField", "ChoicesField", "MultiChoicesField", "Unknown", "UnknownAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InquiryField implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h.e createAdapter() {
            vm.b bVarB = vm.b.b(InquiryField.class, Payload.TYPE);
            UnknownAdapter unknownAdapter = UnknownAdapter.INSTANCE;
            Intrinsics.d(unknownAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any>");
            vm.b bVarE = bVarB.d(unknownAdapter).e(StringField.class, StringField.TYPE).e(IntegerField.class, IntegerField.TYPE).e(BooleanField.class, BooleanField.TYPE).e(FloatField.class, FloatField.TYPE).e(FloatField.class, FloatField.TYPE2).e(DateField.class, DateField.TYPE).e(DatetimeField.class, DatetimeField.TYPE).e(ChoicesField.class, ChoicesField.TYPE).e(MultiChoicesField.class, MultiChoicesField.TYPE);
            Intrinsics.checkNotNullExpressionValue(bVarE, "withSubtype(...)");
            return bVarE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", Payload.TYPE, "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown extends InquiryField {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        @NotNull
        private final String type;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i10) {
                return new Unknown[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$UnknownAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "()V", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;)V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnknownAdapter extends h<InquiryField> {

        @NotNull
        public static final UnknownAdapter INSTANCE = new UnknownAdapter();

        private UnknownAdapter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // um.h
        @NotNull
        public InquiryField fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            reader.b();
            String strR = "";
            while (reader.f()) {
                if (Intrinsics.c(reader.n(), Payload.TYPE)) {
                    strR = reader.r();
                    Intrinsics.checkNotNullExpressionValue(strR, "nextString(...)");
                } else {
                    reader.P();
                }
            }
            reader.d();
            return new Unknown(strR);
        }

        @Override // um.h
        public void toJson(@NotNull t writer, @Nullable InquiryField value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.c();
            writer.n(Payload.TYPE);
            writer.M(value != null ? value.getType() : null);
            writer.g();
        }
    }

    public /* synthetic */ InquiryField(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class BooleanField extends InquiryField {

        @NotNull
        public static final String TYPE = "boolean";

        @NotNull
        private final String type;

        @Nullable
        private final Boolean value;

        @NotNull
        public static final Parcelable.Creator<BooleanField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BooleanField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BooleanField(boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField[] newArray(int i10) {
                return new BooleanField[i10];
            }
        }

        public /* synthetic */ BooleanField(Boolean bool, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i10 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ BooleanField copy$default(BooleanField booleanField, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = booleanField.value;
            }
            if ((i10 & 2) != 0) {
                str = booleanField.type;
            }
            return booleanField.copy(bool, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final BooleanField copy(@Nullable Boolean value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new BooleanField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BooleanField)) {
                return false;
            }
            BooleanField booleanField = (BooleanField) other;
            return Intrinsics.c(this.value, booleanField.value) && Intrinsics.c(this.type, booleanField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final Boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            Boolean bool = this.value;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "BooleanField(value=" + this.value + ", type=" + this.type + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            ?? BooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.value;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                dest.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            dest.writeInt(BooleanValue);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanField(@Nullable Boolean bool, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = bool;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class ChoicesField extends InquiryField {

        @NotNull
        public static final String TYPE = "choices";

        @NotNull
        private final String type;

        @Nullable
        private final String value;

        @NotNull
        public static final Parcelable.Creator<ChoicesField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChoicesField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField[] newArray(int i10) {
                return new ChoicesField[i10];
            }
        }

        public /* synthetic */ ChoicesField(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ ChoicesField copy$default(ChoicesField choicesField, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = choicesField.value;
            }
            if ((i10 & 2) != 0) {
                str2 = choicesField.type;
            }
            return choicesField.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final ChoicesField copy(@Nullable String value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new ChoicesField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChoicesField)) {
                return false;
            }
            ChoicesField choicesField = (ChoicesField) other;
            return Intrinsics.c(this.value, choicesField.value) && Intrinsics.c(this.type, choicesField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChoicesField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoicesField(@Nullable String str, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class DateField extends InquiryField {

        @NotNull
        public static final String TYPE = "date";

        @NotNull
        private final String type;

        @Nullable
        private final String value;

        @NotNull
        public static final Parcelable.Creator<DateField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField[] newArray(int i10) {
                return new DateField[i10];
            }
        }

        public /* synthetic */ DateField(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ DateField copy$default(DateField dateField, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dateField.value;
            }
            if ((i10 & 2) != 0) {
                str2 = dateField.type;
            }
            return dateField.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final DateField copy(@Nullable String value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new DateField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateField)) {
                return false;
            }
            DateField dateField = (DateField) other;
            return Intrinsics.c(this.value, dateField.value) && Intrinsics.c(this.type, dateField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "DateField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateField(@Nullable String str, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class DatetimeField extends InquiryField {

        @NotNull
        public static final String TYPE = "datetime";

        @NotNull
        private final String type;

        @Nullable
        private final String value;

        @NotNull
        public static final Parcelable.Creator<DatetimeField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DatetimeField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatetimeField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField[] newArray(int i10) {
                return new DatetimeField[i10];
            }
        }

        public /* synthetic */ DatetimeField(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ DatetimeField copy$default(DatetimeField datetimeField, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = datetimeField.value;
            }
            if ((i10 & 2) != 0) {
                str2 = datetimeField.type;
            }
            return datetimeField.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final DatetimeField copy(@Nullable String value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new DatetimeField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatetimeField)) {
                return false;
            }
            DatetimeField datetimeField = (DatetimeField) other;
            return Intrinsics.c(this.value, datetimeField.value) && Intrinsics.c(this.type, datetimeField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "DatetimeField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DatetimeField(@Nullable String str, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "", "<init>", "(Ljava/lang/Float;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class FloatField extends InquiryField {

        @NotNull
        public static final String TYPE = "float";

        @NotNull
        public static final String TYPE2 = "number";

        @NotNull
        private final String type;

        @Nullable
        private final Float value;

        @NotNull
        public static final Parcelable.Creator<FloatField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FloatField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FloatField(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField[] newArray(int i10) {
                return new FloatField[i10];
            }
        }

        public /* synthetic */ FloatField(Float f10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, (i10 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ FloatField copy$default(FloatField floatField, Float f10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = floatField.value;
            }
            if ((i10 & 2) != 0) {
                str = floatField.type;
            }
            return floatField.copy(f10, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Float getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final FloatField copy(@Nullable Float value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new FloatField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatField)) {
                return false;
            }
            FloatField floatField = (FloatField) other;
            return Intrinsics.c(this.value, floatField.value) && Intrinsics.c(this.type, floatField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final Float getValue() {
            return this.value;
        }

        public int hashCode() {
            Float f10 = this.value;
            return ((f10 == null ? 0 : f10.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "FloatField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Float f10 = this.value;
            if (f10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f10.floatValue());
            }
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FloatField(@Nullable Float f10, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = f10;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class IntegerField extends InquiryField {

        @NotNull
        public static final String TYPE = "integer";

        @NotNull
        private final String type;

        @Nullable
        private final Integer value;

        @NotNull
        public static final Parcelable.Creator<IntegerField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegerField(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField[] newArray(int i10) {
                return new IntegerField[i10];
            }
        }

        public /* synthetic */ IntegerField(Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i10 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ IntegerField copy$default(IntegerField integerField, Integer num, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = integerField.value;
            }
            if ((i10 & 2) != 0) {
                str = integerField.type;
            }
            return integerField.copy(num, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final IntegerField copy(@Nullable Integer value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new IntegerField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerField)) {
                return false;
            }
            IntegerField integerField = (IntegerField) other;
            return Intrinsics.c(this.value, integerField.value) && Intrinsics.c(this.type, integerField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            Integer num = this.value;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "IntegerField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.value;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerField(@Nullable Integer num, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = num;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J*\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "", Payload.TYPE, "<init>", "([Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getType", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "component1", "component2", "copy", "([Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class MultiChoicesField extends InquiryField {

        @NotNull
        public static final String TYPE = "multi_choices";

        @NotNull
        private final String type;

        @Nullable
        private final String[] value;

        @NotNull
        public static final Parcelable.Creator<MultiChoicesField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultiChoicesField(parcel.createStringArray(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField[] newArray(int i10) {
                return new MultiChoicesField[i10];
            }
        }

        public /* synthetic */ MultiChoicesField(String[] strArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, (i10 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ MultiChoicesField copy$default(MultiChoicesField multiChoicesField, String[] strArr, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                strArr = multiChoicesField.value;
            }
            if ((i10 & 2) != 0) {
                str = multiChoicesField.type;
            }
            return multiChoicesField.copy(strArr, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String[] getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final MultiChoicesField copy(@Nullable String[] value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new MultiChoicesField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.c(MultiChoicesField.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.d(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.InquiryField.MultiChoicesField");
            MultiChoicesField multiChoicesField = (MultiChoicesField) other;
            String[] strArr = this.value;
            if (strArr != null) {
                String[] strArr2 = multiChoicesField.value;
                if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                    return false;
                }
            } else if (multiChoicesField.value != null) {
                return false;
            }
            return true;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final String[] getValue() {
            return this.value;
        }

        public int hashCode() {
            String[] strArr = this.value;
            if (strArr != null) {
                return Arrays.hashCode(strArr);
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "MultiChoicesField(value=" + Arrays.toString(this.value) + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringArray(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiChoicesField(@Nullable String[] strArr, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = strArr;
            this.type = type;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", Payload.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class StringField extends InquiryField {

        @NotNull
        public static final String TYPE = "string";

        @NotNull
        private final String type;

        @Nullable
        private final String value;

        @NotNull
        public static final Parcelable.Creator<StringField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StringField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField[] newArray(int i10) {
                return new StringField[i10];
            }
        }

        public /* synthetic */ StringField(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ StringField copy$default(StringField stringField, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stringField.value;
            }
            if ((i10 & 2) != 0) {
                str2 = stringField.type;
            }
            return stringField.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final StringField copy(@Nullable String value, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new StringField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringField)) {
                return false;
            }
            StringField stringField = (StringField) other;
            return Intrinsics.c(this.value, stringField.value) && Intrinsics.c(this.type, stringField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        @NotNull
        public String getType() {
            return this.type;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringField(@Nullable String str, @NotNull String type) {
            super(type, null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    private InquiryField(String str) {
        this.type = str;
    }
}
