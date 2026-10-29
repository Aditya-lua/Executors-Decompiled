package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class CancelButton implements Button {

    @NotNull
    public static final String type = "button_cancel";

    @Nullable
    private final BasicButtonAttributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final ButtonCancelComponentStyle styles;

    @NotNull
    public static final Parcelable.Creator<CancelButton> CREATOR = new Creator();

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<CancelButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelButton createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancelButton(parcel.readString(), parcel.readInt() == 0 ? null : BasicButtonAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelButton[] newArray(int i10) {
            return new CancelButton[i10];
        }
    }

    public CancelButton(@NotNull String name, @Nullable BasicButtonAttributes basicButtonAttributes, @Nullable ButtonCancelComponentStyle buttonCancelComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = basicButtonAttributes;
        this.styles = buttonCancelComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        BasicButtonAttributes basicButtonAttributes = this.attributes;
        if (basicButtonAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            basicButtonAttributes.writeToParcel(dest, flags);
        }
        ButtonCancelComponentStyle buttonCancelComponentStyle = this.styles;
        if (buttonCancelComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonCancelComponentStyle.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button
    @Nullable
    public ButtonCancelComponentStyle getStyles() {
        return this.styles;
    }

    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes; */
    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    public BasicButtonAttributes getAttributes() {
        return this.attributes;
    }
}
