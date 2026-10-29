package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LinkButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010>\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R(\u0010D\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b:\u0010?\u0012\u0004\bC\u0010=\u001a\u0004\b@\u0010A\"\u0004\b%\u0010B¨\u0006E"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "link", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "getDisabled", "d", "getAutoSubmitCountdownText", "e", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "f", "g", "J", "R0", "()J", "", "Lmr/a;", "h", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Z", "Y0", "()Z", "(Z)V", "getWasTapped$annotations", "wasTapped", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class LinkButtonComponent implements ButtonComponent {

    @NotNull
    public static final Parcelable.Creator<LinkButtonComponent> CREATOR = new C4070a();

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
    @Nullable
    public final String autoSubmitCountdownText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer autoSubmitIntervalSeconds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String link;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean wasTapped;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4070a implements Parcelable.Creator<LinkButtonComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkButtonComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(LinkButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(LinkButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinkButtonComponent[] newArray(int i10) {
            return new LinkButtonComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinkButtonComponent(@NotNull String name, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable Integer num, @NotNull String link, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(link, "link");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.link = link;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, cr.InterfaceC4248h2
    /* JADX INFO: renamed from: b */
    public void mo20533b(boolean z10) {
        this.wasTapped = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkButtonComponent)) {
            return false;
        }
        LinkButtonComponent linkButtonComponent = (LinkButtonComponent) other;
        return Intrinsics.m31980c(this.name, linkButtonComponent.name) && Intrinsics.m31980c(this.hidden, linkButtonComponent.hidden) && Intrinsics.m31980c(this.disabled, linkButtonComponent.disabled) && Intrinsics.m31980c(this.autoSubmitCountdownText, linkButtonComponent.autoSubmitCountdownText) && Intrinsics.m31980c(this.autoSubmitIntervalSeconds, linkButtonComponent.autoSubmitIntervalSeconds) && Intrinsics.m31980c(this.link, linkButtonComponent.link) && this.lastValueUpdateTs == linkButtonComponent.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent
    @Nullable
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent
    @Nullable
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
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

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.autoSubmitCountdownText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        return ((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.link.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "LinkButtonComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ", link=" + this.link + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.link);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
      (r12v0 java.lang.String)
      (r13v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r14v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r15v0 java.lang.String)
      (r16v0 java.lang.Integer)
      (r17v0 java.lang.String)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.Integer, java.lang.String, long):void (m)] (LINE:10) call: com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.Integer, java.lang.String, long):void type: THIS */
    public /* synthetic */ LinkButtonComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, String str3, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, jsonLogicBoolean2, str2, num, str3, (i10 & 64) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkButtonComponent(@NotNull LinkButton config) {
        String link;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        LinkButton.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        LinkButton.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean disabled = attributes2 != null ? attributes2.getDisabled() : null;
        LinkButton.Attributes attributes3 = config.getAttributes();
        String autoSubmitCountdownText = attributes3 != null ? attributes3.getAutoSubmitCountdownText() : null;
        LinkButton.Attributes attributes4 = config.getAttributes();
        Integer autoSubmitIntervalSeconds = attributes4 != null ? attributes4.getAutoSubmitIntervalSeconds() : null;
        LinkButton.Attributes attributes5 = config.getAttributes();
        this(name, hidden, disabled, autoSubmitCountdownText, autoSubmitIntervalSeconds, (attributes5 == null || (link = attributes5.getLink()) == null) ? "" : link, 0L, 64, null);
    }
}
