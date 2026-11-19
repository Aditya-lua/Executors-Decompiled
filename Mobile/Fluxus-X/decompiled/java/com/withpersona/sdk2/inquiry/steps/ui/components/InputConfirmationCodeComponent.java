package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import java.util.ArrayList;
import java.util.List;
import nn.s;
import nn.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.h0;
import qr.j5;
import qr.w;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u0010?\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R(\u0010F\u001a\u00020@8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010A\u0012\u0004\bE\u0010>\u001a\u0004\b9\u0010B\"\u0004\bC\u0010DR\u001d\u0010M\u001a\u00020G8\u0006¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010>\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lqr/x5;", "Lqr/j5;", "Lqr/w;", "Lqr/h0;", BuildConfig.FLAVOR, "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", BuildConfig.FLAVOR, "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)V", "newString", "n", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "J", "S0", "()J", BuildConfig.FLAVOR, "Lbs/a;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lnn/s;", "Lnn/s;", "()Lnn/s;", "l", "(Lnn/s;)V", "getTextController$annotations", "textController", "Ltr/c;", "h", "Ltr/c;", "k", "()Ltr/c;", "getSubmitCodeHelper$annotations", "submitCodeHelper", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputConfirmationCodeComponent implements x5, j5<InputConfirmationCodeComponent>, w, h0 {

    @NotNull
    public static final Parcelable.Creator<InputConfirmationCodeComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<bs.a> associatedViews;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public s textController;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tr.c submitCodeHelper;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputConfirmationCodeComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputConfirmationCodeComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputConfirmationCodeComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputConfirmationCodeComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputConfirmationCodeComponent.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputConfirmationCodeComponent[] newArray(int i10) {
            return new InputConfirmationCodeComponent[i10];
        }
    }

    public InputConfirmationCodeComponent(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.textController = v.a(value);
        this.submitCodeHelper = new tr.c();
    }

    @hn.g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    public static /* synthetic */ InputConfirmationCodeComponent j(InputConfirmationCodeComponent inputConfirmationCodeComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputConfirmationCodeComponent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = inputConfirmationCodeComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputConfirmationCodeComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputConfirmationCodeComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            j10 = inputConfirmationCodeComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        return inputConfirmationCodeComponent.g(str, str2, jsonLogicBoolean, jsonLogicBoolean2, j11);
    }

    @Override // qr.x5
    /* JADX INFO: renamed from: S0, reason: from getter */
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
        if (!(other instanceof InputConfirmationCodeComponent)) {
            return false;
        }
        InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) other;
        return Intrinsics.c(this.name, inputConfirmationCodeComponent.name) && Intrinsics.c(this.value, inputConfirmationCodeComponent.value) && Intrinsics.c(this.hidden, inputConfirmationCodeComponent.hidden) && Intrinsics.c(this.disabled, inputConfirmationCodeComponent.disabled) && this.lastValueUpdateTs == inputConfirmationCodeComponent.lastValueUpdateTs;
    }

    @Override // qr.j5
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public s getTextController() {
        return this.textController;
    }

    @NotNull
    public final InputConfirmationCodeComponent g(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputConfirmationCodeComponent(name, value, hidden, disabled, lastValueUpdateTs);
    }

    @Override // qr.w
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // qr.h0
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // qr.x5
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return ((iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // qr.h0
    @NotNull
    public List<bs.a> i() {
        return this.associatedViews;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final tr.c getSubmitCodeHelper() {
        return this.submitCodeHelper;
    }

    public void l(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.textController = sVar;
    }

    @Override // qr.j5
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InputConfirmationCodeComponent a(@NotNull String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputConfirmationCodeComponent inputConfirmationCodeComponentJ = j(this, null, newString, null, null, System.currentTimeMillis(), 13, null);
        inputConfirmationCodeComponentJ.l(getTextController());
        return inputConfirmationCodeComponentJ;
    }

    @NotNull
    public String toString() {
        return "InputConfirmationCodeComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ InputConfirmationCodeComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputConfirmationCodeComponent(@NotNull InputConfirmationCode config) {
        String prefill;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputConfirmationCode.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefill = attributes.getPrefill()) == null) ? BuildConfig.FLAVOR : prefill;
        InputConfirmationCode.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputConfirmationCode.Attributes attributes3 = config.getAttributes();
        this(name, str, hidden, attributes3 != null ? attributes3.getDisabled() : null, 0L, 16, null);
    }
}
