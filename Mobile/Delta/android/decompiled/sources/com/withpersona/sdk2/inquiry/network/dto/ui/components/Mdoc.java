package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonComponentStylingKt;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0005\"#$%&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "Provider", "ClientMetadata", "MdocComponentStyle", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class Mdoc implements Parcelable, UiComponentConfig {

    @NotNull
    public static final String type = "mdoc";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final MdocComponentStyle styles;

    @NotNull
    public static final Parcelable.Creator<Mdoc> CREATOR = new Creator();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "Landroid/os/Parcelable;", "requestJsonString", "", "<init>", "(Ljava/lang/String;)V", "getRequestJsonString", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class ClientMetadata implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClientMetadata> CREATOR = new Creator();

        @Nullable
        private final String requestJsonString;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClientMetadata> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientMetadata createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClientMetadata(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientMetadata[] newArray(int i10) {
                return new ClientMetadata[i10];
            }
        }

        public ClientMetadata(@g(name = "requestJSONString") @Nullable String str) {
            this.requestJsonString = str;
        }

        public static /* synthetic */ ClientMetadata copy$default(ClientMetadata clientMetadata, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = clientMetadata.requestJsonString;
            }
            return clientMetadata.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequestJsonString() {
            return this.requestJsonString;
        }

        @NotNull
        public final ClientMetadata copy(@g(name = "requestJSONString") @Nullable String requestJsonString) {
            return new ClientMetadata(requestJsonString);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientMetadata) && Intrinsics.c(this.requestJsonString, ((ClientMetadata) other).requestJsonString);
        }

        @Nullable
        public final String getRequestJsonString() {
            return this.requestJsonString;
        }

        public int hashCode() {
            String str = this.requestJsonString;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClientMetadata(requestJsonString=" + this.requestJsonString + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestJsonString);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Mdoc> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mdoc createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Mdoc(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MdocComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mdoc[] newArray(int i10) {
            return new Mdoc[i10];
        }
    }

    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000b\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J¾\u0001\u0010\u008a\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 HÆ\u0001J\u0007\u0010\u008b\u0001\u001a\u00020PJ\u0017\u0010\u008c\u0001\u001a\u00030\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001HÖ\u0003J\n\u0010\u0090\u0001\u001a\u00020PHÖ\u0001J\n\u0010\u0091\u0001\u001a\u00020ZHÖ\u0001J\u001b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020PR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0016\u0010G\u001a\u0004\u0018\u00010H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010NR\u0016\u0010Y\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u0004\u0018\u00010^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010a\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010NR\u0016\u0010c\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010RR\u0014\u0010e\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010RR\u0016\u0010g\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010RR\u0016\u0010i\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010NR\u0016\u0010k\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010NR\u0016\u0010m\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010RR\u0016\u0010o\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010RR\u0016\u0010q\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010RR\u0016\u0010s\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010NR\u0016\u0010u\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010NR\u0011\u0010w\u001a\u00020x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006\u0097\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;)V", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "paddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "marginValue", "getMarginValue", "justificationValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "fontSizeValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "baseTextColorValue", "", "getBaseTextColorValue", "()Ljava/lang/Integer;", "activeTextColorValue", "getActiveTextColorValue", "disabledTextColorValue", "getDisabledTextColorValue", "letterSpacingValue", "getLetterSpacingValue", "fontNameValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontWeightValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "lineHeightValue", "getLineHeightValue", "baseBackgroundColorValue", "getBaseBackgroundColorValue", "activeBackgroundColorValue", "getActiveBackgroundColorValue", "disabledBackgroundColorValue", "getDisabledBackgroundColorValue", "heightValue", "getHeightValue", "widthValue", "getWidthValue", "baseBorderColorValue", "getBaseBorderColorValue", "activeBorderColorValue", "getActiveBorderColorValue", "disabledBorderColorValue", "getDisabledBorderColorValue", "borderRadiusValue", "getBorderRadiusValue", "borderWidthValue", "getBorderWidthValue", "errorLabelStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorLabelStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class MdocComponentStyle implements Parcelable, BaseButtonComponentStyle {

        @NotNull
        public static final Parcelable.Creator<MdocComponentStyle> CREATOR = new Creator();

        @Nullable
        private final AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor;

        @Nullable
        private final AttributeStyles.ButtonBasedBorderColorStyle borderColor;

        @Nullable
        private final AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius;

        @Nullable
        private final AttributeStyles.ButtonBasedBorderWidthStyle borderWidth;

        @Nullable
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;

        @Nullable
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;

        @Nullable
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;

        @Nullable
        private final AttributeStyles.ButtonBasedHeightStyle height;

        @Nullable
        private final AttributeStyles.ButtonBasedJustifyStyle justify;

        @Nullable
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;

        @Nullable
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;

        @Nullable
        private final AttributeStyles.ButtonBasedMarginStyle margin;

        @Nullable
        private final AttributeStyles.ButtonBasedPaddingStyle padding;

        @Nullable
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;

        @Nullable
        private final AttributeStyles.ButtonBasedWidthStyle width;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MdocComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MdocComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MdocComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderWidthStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MdocComponentStyle[] newArray(int i10) {
                return new MdocComponentStyle[i10];
            }
        }

        public MdocComponentStyle(@Nullable AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle, @Nullable AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle, @Nullable AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle, @Nullable AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle, @Nullable AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle, @Nullable AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle, @Nullable AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, @Nullable AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, @Nullable AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, @Nullable AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, @Nullable AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, @Nullable AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, @Nullable AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle, @Nullable AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle, @Nullable AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle) {
            this.padding = buttonBasedPaddingStyle;
            this.width = buttonBasedWidthStyle;
            this.height = buttonBasedHeightStyle;
            this.justify = buttonBasedJustifyStyle;
            this.margin = buttonBasedMarginStyle;
            this.borderRadius = buttonBasedBorderRadiusStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.backgroundColor = buttonBasedBackgroundColorStyle;
            this.borderColor = buttonBasedBorderColorStyle;
            this.borderWidth = buttonBasedBorderWidthStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
            return this.width;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
            return this.height;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
            return this.justify;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
            return this.margin;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @NotNull
        public final MdocComponentStyle copy(@Nullable AttributeStyles.ButtonBasedPaddingStyle padding, @Nullable AttributeStyles.ButtonBasedWidthStyle width, @Nullable AttributeStyles.ButtonBasedHeightStyle height, @Nullable AttributeStyles.ButtonBasedJustifyStyle justify, @Nullable AttributeStyles.ButtonBasedMarginStyle margin, @Nullable AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius, @Nullable AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily, @Nullable AttributeStyles.ComplexTextBasedFontSizeStyle fontSize, @Nullable AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight, @Nullable AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing, @Nullable AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight, @Nullable AttributeStyles.ComplexTextBasedTextColorStyle textColor, @Nullable AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor, @Nullable AttributeStyles.ButtonBasedBorderColorStyle borderColor, @Nullable AttributeStyles.ButtonBasedBorderWidthStyle borderWidth) {
            return new MdocComponentStyle(padding, width, height, justify, margin, borderRadius, fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, textColor, backgroundColor, borderColor, borderWidth);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MdocComponentStyle)) {
                return false;
            }
            MdocComponentStyle mdocComponentStyle = (MdocComponentStyle) other;
            return Intrinsics.c(this.padding, mdocComponentStyle.padding) && Intrinsics.c(this.width, mdocComponentStyle.width) && Intrinsics.c(this.height, mdocComponentStyle.height) && Intrinsics.c(this.justify, mdocComponentStyle.justify) && Intrinsics.c(this.margin, mdocComponentStyle.margin) && Intrinsics.c(this.borderRadius, mdocComponentStyle.borderRadius) && Intrinsics.c(this.fontFamily, mdocComponentStyle.fontFamily) && Intrinsics.c(this.fontSize, mdocComponentStyle.fontSize) && Intrinsics.c(this.fontWeight, mdocComponentStyle.fontWeight) && Intrinsics.c(this.letterSpacing, mdocComponentStyle.letterSpacing) && Intrinsics.c(this.lineHeight, mdocComponentStyle.lineHeight) && Intrinsics.c(this.textColor, mdocComponentStyle.textColor) && Intrinsics.c(this.backgroundColor, mdocComponentStyle.backgroundColor) && Intrinsics.c(this.borderColor, mdocComponentStyle.borderColor) && Intrinsics.c(this.borderWidth, mdocComponentStyle.borderWidth);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @NotNull
        public Integer getActiveBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer active;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            return Integer.valueOf((buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (active = base.getActive()) == null) ? ButtonComponentStylingKt.getDefaultLoadingColor() : active.intValue());
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getActiveBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getActiveTextColorValue() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getActive();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            if (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getBaseTextColorValue() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getBase();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getBorderRadiusValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            if (buttonBasedBorderRadiusStyle == null || (base = buttonBasedBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            StyleElements.SizeSet base2;
            StyleElements.Size top;
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            if (buttonBasedBorderWidthStyle == null || (base = buttonBasedBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer disabled;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            return (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            Integer disabled;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            return (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBorderColorValue() : disabled;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Integer getDisabledTextColorValue() {
            StyleElements.ComplexElementColor label;
            Integer disabled;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            return (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null || (disabled = label.getDisabled()) == null) ? getBaseTextColorValue() : disabled;
        }

        @NotNull
        public final TextBasedComponentStyle getErrorLabelStyle() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            Integer base = null;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getError() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getError() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getError() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getError() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getError() : null);
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle != null && (error = complexTextBasedTextColorStyle.getError()) != null) {
                base = error.getBase();
            }
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
        }

        @Nullable
        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public String getFontNameValue() {
            StyleElements.FontName base;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
                return null;
            }
            return base.getFontName();
        }

        @Nullable
        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getFontSizeValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (base = complexTextBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Nullable
        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public StyleElements.FontWeight getFontWeightValue() {
            StyleElements.FontWeightContainer base;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (base = complexTextBasedFontWeightStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
            return this.height;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getHeightValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            if (buttonBasedHeightStyle == null || (base = buttonBasedHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public StyleElements.PositionType getJustificationValue() {
            StyleElements.Position base;
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            if (buttonBasedJustifyStyle == null || (base = buttonBasedJustifyStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
            return this.justify;
        }

        @Nullable
        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getLetterSpacingValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Nullable
        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getLineHeightValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (base = complexTextBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
            return this.margin;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            if (buttonBasedMarginStyle == null || (base = buttonBasedMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            if (buttonBasedPaddingStyle == null || (base = buttonBasedPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Nullable
        public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
            return this.width;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        @Nullable
        public Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            if (buttonBasedWidthStyle == null || (base = buttonBasedWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public int hashCode() {
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            int iHashCode = (buttonBasedPaddingStyle == null ? 0 : buttonBasedPaddingStyle.hashCode()) * 31;
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            int iHashCode2 = (iHashCode + (buttonBasedWidthStyle == null ? 0 : buttonBasedWidthStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            int iHashCode3 = (iHashCode2 + (buttonBasedHeightStyle == null ? 0 : buttonBasedHeightStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            int iHashCode4 = (iHashCode3 + (buttonBasedJustifyStyle == null ? 0 : buttonBasedJustifyStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            int iHashCode5 = (iHashCode4 + (buttonBasedMarginStyle == null ? 0 : buttonBasedMarginStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            int iHashCode6 = (iHashCode5 + (buttonBasedBorderRadiusStyle == null ? 0 : buttonBasedBorderRadiusStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            int iHashCode7 = (iHashCode6 + (complexTextBasedFontFamilyStyle == null ? 0 : complexTextBasedFontFamilyStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            int iHashCode8 = (iHashCode7 + (complexTextBasedFontSizeStyle == null ? 0 : complexTextBasedFontSizeStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            int iHashCode9 = (iHashCode8 + (complexTextBasedFontWeightStyle == null ? 0 : complexTextBasedFontWeightStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            int iHashCode10 = (iHashCode9 + (complexTextBasedLetterSpacingStyle == null ? 0 : complexTextBasedLetterSpacingStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            int iHashCode11 = (iHashCode10 + (complexTextBasedLineHeightStyle == null ? 0 : complexTextBasedLineHeightStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            int iHashCode12 = (iHashCode11 + (complexTextBasedTextColorStyle == null ? 0 : complexTextBasedTextColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            int iHashCode13 = (iHashCode12 + (buttonBasedBackgroundColorStyle == null ? 0 : buttonBasedBackgroundColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            int iHashCode14 = (iHashCode13 + (buttonBasedBorderColorStyle == null ? 0 : buttonBasedBorderColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            return iHashCode14 + (buttonBasedBorderWidthStyle != null ? buttonBasedBorderWidthStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MdocComponentStyle(padding=" + this.padding + ", width=" + this.width + ", height=" + this.height + ", justify=" + this.justify + ", margin=" + this.margin + ", borderRadius=" + this.borderRadius + ", fontFamily=" + this.fontFamily + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            if (buttonBasedPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            if (buttonBasedWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            if (buttonBasedHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            if (buttonBasedJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            if (buttonBasedMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            if (buttonBasedBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedFontFamilyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedFontSizeStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedFontWeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedLetterSpacingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedLineHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            if (buttonBasedBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            if (buttonBasedBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            if (buttonBasedBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderWidthStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\bJ\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Landroid/os/Parcelable;", "providerType", "", "idType", "merchantId", "nonce", "minAge", "", "elementToStoreLength", "", "clientMetadata", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;)V", "getProviderType", "()Ljava/lang/String;", "getIdType", "getMerchantId", "getNonce", "getMinAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getElementToStoreLength", "()Ljava/util/Map;", "getClientMetadata", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Provider implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Provider> CREATOR = new Creator();

        @Nullable
        private final ClientMetadata clientMetadata;

        @Nullable
        private final Map<String, Integer> elementToStoreLength;

        @Nullable
        private final String idType;

        @Nullable
        private final String merchantId;

        @Nullable
        private final Integer minAge;

        @Nullable
        private final String nonce;

        @Nullable
        private final String providerType;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Provider> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provider createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i10 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                }
                return new Provider(string, string2, string3, string4, numValueOf, linkedHashMap, parcel.readInt() != 0 ? ClientMetadata.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provider[] newArray(int i10) {
                return new Provider[i10];
            }
        }

        public Provider(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Map<String, Integer> map, @Nullable ClientMetadata clientMetadata) {
            this.providerType = str;
            this.idType = str2;
            this.merchantId = str3;
            this.nonce = str4;
            this.minAge = num;
            this.elementToStoreLength = map;
            this.clientMetadata = clientMetadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Provider copy$default(Provider provider, String str, String str2, String str3, String str4, Integer num, Map map, ClientMetadata clientMetadata, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = provider.providerType;
            }
            if ((i10 & 2) != 0) {
                str2 = provider.idType;
            }
            if ((i10 & 4) != 0) {
                str3 = provider.merchantId;
            }
            if ((i10 & 8) != 0) {
                str4 = provider.nonce;
            }
            if ((i10 & 16) != 0) {
                num = provider.minAge;
            }
            if ((i10 & 32) != 0) {
                map = provider.elementToStoreLength;
            }
            if ((i10 & 64) != 0) {
                clientMetadata = provider.clientMetadata;
            }
            Map map2 = map;
            ClientMetadata clientMetadata2 = clientMetadata;
            Integer num2 = num;
            String str5 = str3;
            return provider.copy(str, str2, str5, str4, num2, map2, clientMetadata2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProviderType() {
            return this.providerType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMerchantId() {
            return this.merchantId;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getMinAge() {
            return this.minAge;
        }

        @Nullable
        public final Map<String, Integer> component6() {
            return this.elementToStoreLength;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ClientMetadata getClientMetadata() {
            return this.clientMetadata;
        }

        @NotNull
        public final Provider copy(@Nullable String providerType, @Nullable String idType, @Nullable String merchantId, @Nullable String nonce, @Nullable Integer minAge, @Nullable Map<String, Integer> elementToStoreLength, @Nullable ClientMetadata clientMetadata) {
            return new Provider(providerType, idType, merchantId, nonce, minAge, elementToStoreLength, clientMetadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) other;
            return Intrinsics.c(this.providerType, provider.providerType) && Intrinsics.c(this.idType, provider.idType) && Intrinsics.c(this.merchantId, provider.merchantId) && Intrinsics.c(this.nonce, provider.nonce) && Intrinsics.c(this.minAge, provider.minAge) && Intrinsics.c(this.elementToStoreLength, provider.elementToStoreLength) && Intrinsics.c(this.clientMetadata, provider.clientMetadata);
        }

        @Nullable
        public final ClientMetadata getClientMetadata() {
            return this.clientMetadata;
        }

        @Nullable
        public final Map<String, Integer> getElementToStoreLength() {
            return this.elementToStoreLength;
        }

        @Nullable
        public final String getIdType() {
            return this.idType;
        }

        @Nullable
        public final String getMerchantId() {
            return this.merchantId;
        }

        @Nullable
        public final Integer getMinAge() {
            return this.minAge;
        }

        @Nullable
        public final String getNonce() {
            return this.nonce;
        }

        @Nullable
        public final String getProviderType() {
            return this.providerType;
        }

        public int hashCode() {
            String str = this.providerType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.idType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.merchantId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.nonce;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.minAge;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Map<String, Integer> map = this.elementToStoreLength;
            int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            ClientMetadata clientMetadata = this.clientMetadata;
            return iHashCode6 + (clientMetadata != null ? clientMetadata.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Provider(providerType=" + this.providerType + ", idType=" + this.idType + ", merchantId=" + this.merchantId + ", nonce=" + this.nonce + ", minAge=" + this.minAge + ", elementToStoreLength=" + this.elementToStoreLength + ", clientMetadata=" + this.clientMetadata + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.providerType);
            dest.writeString(this.idType);
            dest.writeString(this.merchantId);
            dest.writeString(this.nonce);
            Integer num = this.minAge;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Map<String, Integer> map = this.elementToStoreLength;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeInt(entry.getValue().intValue());
                }
            }
            ClientMetadata clientMetadata = this.clientMetadata;
            if (clientMetadata == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clientMetadata.writeToParcel(dest, flags);
            }
        }
    }

    public Mdoc(@NotNull String name, @Nullable Attributes attributes, @Nullable MdocComponentStyle mdocComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = mdocComponentStyle;
    }

    public static /* synthetic */ Mdoc copy$default(Mdoc mdoc, String str, Attributes attributes, MdocComponentStyle mdocComponentStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mdoc.name;
        }
        if ((i10 & 2) != 0) {
            attributes = mdoc.attributes;
        }
        if ((i10 & 4) != 0) {
            mdocComponentStyle = mdoc.styles;
        }
        return mdoc.copy(str, attributes, mdocComponentStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MdocComponentStyle getStyles() {
        return this.styles;
    }

    @NotNull
    public final Mdoc copy(@NotNull String name, @Nullable Attributes attributes, @Nullable MdocComponentStyle styles) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Mdoc(name, attributes, styles);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mdoc)) {
            return false;
        }
        Mdoc mdoc = (Mdoc) other;
        return Intrinsics.c(this.name, mdoc.name) && Intrinsics.c(this.attributes, mdoc.attributes) && Intrinsics.c(this.styles, mdoc.styles);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final MdocComponentStyle getStyles() {
        return this.styles;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Attributes attributes = this.attributes;
        int iHashCode2 = (iHashCode + (attributes == null ? 0 : attributes.hashCode())) * 31;
        MdocComponentStyle mdocComponentStyle = this.styles;
        return iHashCode2 + (mdocComponentStyle != null ? mdocComponentStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Mdoc(name=" + this.name + ", attributes=" + this.attributes + ", styles=" + this.styles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        MdocComponentStyle mdocComponentStyle = this.styles;
        if (mdocComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mdocComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 Jx\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0010J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "provider", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "noMdocAvailableText", "", "errorRetrievingMdocText", "showWhenMdocNotAvailable", "", "successfulMdocRetrievalTransitionComponentName", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDisabled", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "getProvider", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "getNoMdocAvailableText", "()Ljava/lang/String;", "getErrorRetrievingMdocText", "getShowWhenMdocNotAvailable", "()Z", "getSuccessfulMdocRetrievalTransitionComponentName", "getAutoSubmitCountdownText", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Attributes implements Parcelable, UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final String autoSubmitCountdownText;

        @Nullable
        private final Integer autoSubmitIntervalSeconds;

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final String errorRetrievingMdocText;

        @Nullable
        private final JsonLogicBoolean hidden;

        @Nullable
        private final String noMdocAvailableText;

        @Nullable
        private final Provider provider;
        private final boolean showWhenMdocNotAvailable;

        @Nullable
        private final String successfulMdocRetrievalTransitionComponentName;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i10) {
                return new Attributes[i10];
            }
        }

        public Attributes(@Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable Provider provider, @Nullable String str, @Nullable String str2, boolean z10, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
            this.disabled = jsonLogicBoolean;
            this.hidden = jsonLogicBoolean2;
            this.provider = provider;
            this.noMdocAvailableText = str;
            this.errorRetrievingMdocText = str2;
            this.showWhenMdocNotAvailable = z10;
            this.successfulMdocRetrievalTransitionComponentName = str3;
            this.autoSubmitCountdownText = str4;
            this.autoSubmitIntervalSeconds = num;
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z10, String str3, String str4, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jsonLogicBoolean = attributes.disabled;
            }
            if ((i10 & 2) != 0) {
                jsonLogicBoolean2 = attributes.hidden;
            }
            if ((i10 & 4) != 0) {
                provider = attributes.provider;
            }
            if ((i10 & 8) != 0) {
                str = attributes.noMdocAvailableText;
            }
            if ((i10 & 16) != 0) {
                str2 = attributes.errorRetrievingMdocText;
            }
            if ((i10 & 32) != 0) {
                z10 = attributes.showWhenMdocNotAvailable;
            }
            if ((i10 & 64) != 0) {
                str3 = attributes.successfulMdocRetrievalTransitionComponentName;
            }
            if ((i10 & 128) != 0) {
                str4 = attributes.autoSubmitCountdownText;
            }
            if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                num = attributes.autoSubmitIntervalSeconds;
            }
            String str5 = str4;
            Integer num2 = num;
            boolean z11 = z10;
            String str6 = str3;
            String str7 = str2;
            Provider provider2 = provider;
            return attributes.copy(jsonLogicBoolean, jsonLogicBoolean2, provider2, str, str7, z11, str6, str5, num2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Provider getProvider() {
            return this.provider;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getNoMdocAvailableText() {
            return this.noMdocAvailableText;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getErrorRetrievingMdocText() {
            return this.errorRetrievingMdocText;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getShowWhenMdocNotAvailable() {
            return this.showWhenMdocNotAvailable;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSuccessfulMdocRetrievalTransitionComponentName() {
            return this.successfulMdocRetrievalTransitionComponentName;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        @NotNull
        public final Attributes copy(@Nullable JsonLogicBoolean disabled, @Nullable JsonLogicBoolean hidden, @Nullable Provider provider, @Nullable String noMdocAvailableText, @Nullable String errorRetrievingMdocText, boolean showWhenMdocNotAvailable, @Nullable String successfulMdocRetrievalTransitionComponentName, @Nullable String autoSubmitCountdownText, @Nullable Integer autoSubmitIntervalSeconds) {
            return new Attributes(disabled, hidden, provider, noMdocAvailableText, errorRetrievingMdocText, showWhenMdocNotAvailable, successfulMdocRetrievalTransitionComponentName, autoSubmitCountdownText, autoSubmitIntervalSeconds);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attributes)) {
                return false;
            }
            Attributes attributes = (Attributes) other;
            return Intrinsics.c(this.disabled, attributes.disabled) && Intrinsics.c(this.hidden, attributes.hidden) && Intrinsics.c(this.provider, attributes.provider) && Intrinsics.c(this.noMdocAvailableText, attributes.noMdocAvailableText) && Intrinsics.c(this.errorRetrievingMdocText, attributes.errorRetrievingMdocText) && this.showWhenMdocNotAvailable == attributes.showWhenMdocNotAvailable && Intrinsics.c(this.successfulMdocRetrievalTransitionComponentName, attributes.successfulMdocRetrievalTransitionComponentName) && Intrinsics.c(this.autoSubmitCountdownText, attributes.autoSubmitCountdownText) && Intrinsics.c(this.autoSubmitIntervalSeconds, attributes.autoSubmitIntervalSeconds);
        }

        @Nullable
        public final String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        @Nullable
        public final Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        @Nullable
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Nullable
        public final String getErrorRetrievingMdocText() {
            return this.errorRetrievingMdocText;
        }

        @Nullable
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Nullable
        public final String getNoMdocAvailableText() {
            return this.noMdocAvailableText;
        }

        @Nullable
        public final Provider getProvider() {
            return this.provider;
        }

        public final boolean getShowWhenMdocNotAvailable() {
            return this.showWhenMdocNotAvailable;
        }

        @Nullable
        public final String getSuccessfulMdocRetrievalTransitionComponentName() {
            return this.successfulMdocRetrievalTransitionComponentName;
        }

        public int hashCode() {
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            int iHashCode = (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode()) * 31;
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            int iHashCode2 = (iHashCode + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
            Provider provider = this.provider;
            int iHashCode3 = (iHashCode2 + (provider == null ? 0 : provider.hashCode())) * 31;
            String str = this.noMdocAvailableText;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorRetrievingMdocText;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showWhenMdocNotAvailable)) * 31;
            String str3 = this.successfulMdocRetrievalTransitionComponentName;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.autoSubmitCountdownText;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.autoSubmitIntervalSeconds;
            return iHashCode7 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Attributes(disabled=" + this.disabled + ", hidden=" + this.hidden + ", provider=" + this.provider + ", noMdocAvailableText=" + this.noMdocAvailableText + ", errorRetrievingMdocText=" + this.errorRetrievingMdocText + ", showWhenMdocNotAvailable=" + this.showWhenMdocNotAvailable + ", successfulMdocRetrievalTransitionComponentName=" + this.successfulMdocRetrievalTransitionComponentName + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
            Provider provider = this.provider;
            if (provider == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                provider.writeToParcel(dest, flags);
            }
            dest.writeString(this.noMdocAvailableText);
            dest.writeString(this.errorRetrievingMdocText);
            dest.writeInt(this.showWhenMdocNotAvailable ? 1 : 0);
            dest.writeString(this.successfulMdocRetrievalTransitionComponentName);
            dest.writeString(this.autoSubmitCountdownText);
            Integer num = this.autoSubmitIntervalSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }

        public /* synthetic */ Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z10, String str3, String str4, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(jsonLogicBoolean, jsonLogicBoolean2, provider, str, str2, z10, str3, (i10 & 128) != 0 ? null : str4, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : num);
        }
    }
}
