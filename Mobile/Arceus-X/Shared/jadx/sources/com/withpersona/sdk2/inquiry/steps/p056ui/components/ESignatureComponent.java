package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ESignature;
import cr.InterfaceC4214c;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import er.C5194c;
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
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R*\u0010=\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010E\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010<\u001a\u0004\bB\u0010CR(\u0010L\u001a\u00020F8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010G\u0012\u0004\bK\u0010<\u001a\u0004\b(\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/c;", "Lcr/o;", "Lcr/x;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)V", "Landroid/graphics/Bitmap;", "newValue", "m", "(Landroid/graphics/Bitmap;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "getDisabled", "d", "J", "R0", "()J", "e", "Landroid/graphics/Bitmap;", "getValue", "()Landroid/graphics/Bitmap;", "setValue", "(Landroid/graphics/Bitmap;)V", "getValue$annotations", "()V", "value", "", "Lmr/a;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "associatedViews", "Ler/c;", "Ler/c;", "()Ler/c;", "k", "(Ler/c;)V", "getBitmapController$annotations", "bitmapController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class ESignatureComponent implements UiComponent, InterfaceC4214c<ESignatureComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<ESignatureComponent> CREATOR = new C4036a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Bitmap value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public C5194c bitmapController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4036a implements Parcelable.Creator<ESignatureComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ESignatureComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ESignatureComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(ESignatureComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ESignatureComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ESignatureComponent[] newArray(int i10) {
            return new ESignatureComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ESignatureComponent(@NotNull String name, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.bitmapController = new C5194c(null);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getBitmapController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ ESignatureComponent m20572j(ESignatureComponent eSignatureComponent, String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eSignatureComponent.name;
        }
        if ((i10 & 2) != 0) {
            jsonLogicBoolean = eSignatureComponent.hidden;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean2 = eSignatureComponent.disabled;
        }
        if ((i10 & 8) != 0) {
            j10 = eSignatureComponent.lastValueUpdateTs;
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        return eSignatureComponent.m20575g(str, jsonLogicBoolean, jsonLogicBoolean3, j10);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4214c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public C5194c getBitmapController() {
        return this.bitmapController;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESignatureComponent)) {
            return false;
        }
        ESignatureComponent eSignatureComponent = (ESignatureComponent) other;
        return Intrinsics.m31980c(this.name, eSignatureComponent.name) && Intrinsics.m31980c(this.hidden, eSignatureComponent.hidden) && Intrinsics.m31980c(this.disabled, eSignatureComponent.disabled) && this.lastValueUpdateTs == eSignatureComponent.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ESignatureComponent m20575g(@NotNull String name, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ESignatureComponent(name, hidden, disabled, lastValueUpdateTs);
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
    public void m20576k(@NotNull C5194c c5194c) {
        Intrinsics.checkNotNullParameter(c5194c, "<set-?>");
        this.bitmapController = c5194c;
    }

    /* JADX DEBUG: Method merged with bridge method: f(Landroid/graphics/Bitmap;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4214c
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ESignatureComponent mo20574f(@Nullable Bitmap newValue) {
        ESignatureComponent eSignatureComponentM20572j = m20572j(this, null, null, null, System.currentTimeMillis(), 7, null);
        eSignatureComponentM20572j.value = newValue;
        eSignatureComponentM20572j.m20576k(getBitmapController());
        return eSignatureComponentM20572j;
    }

    @NotNull
    public String toString() {
        return "ESignatureComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r7v0 java.lang.String)
      (r8v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r9v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void (m)] (LINE:8) call: com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void type: THIS */
    public /* synthetic */ ESignatureComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 8) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ESignatureComponent(@NotNull ESignature config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        ESignature.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        ESignature.Attributes attributes2 = config.getAttributes();
        this(name, hidden, attributes2 != null ? attributes2.getDisabled() : null, 0L, 8, null);
    }
}
