package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputDate;
import cr.InterfaceC4269l;
import cr.InterfaceC4287o;
import cr.InterfaceC4341x;
import er.C5198g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 Jd\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\b=\u0010>R&\u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bA\u00109\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010;R(\u0010L\u001a\u00020F8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bB\u0010G\u0012\u0004\bK\u0010D\u001a\u0004\b8\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/l;", "Lcr/o;", "Lcr/x;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "monthPlaceholder", "", "monthList", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;)V", "newDate", "m", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "getMonthPlaceholder", "f", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "J", "R0", "()J", "", "Lmr/a;", "h", "i", "getAssociatedViews$annotations", "()V", "associatedViews", "Ler/g;", "Ler/g;", "()Ler/g;", "k", "(Ler/g;)V", "getDateController$annotations", "dateController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputDateComponent implements UiComponent, InterfaceC4269l<InputDateComponent>, InterfaceC4287o, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<InputDateComponent> CREATOR = new C4047a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String monthPlaceholder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<String> monthList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public C5198g dateController;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4047a implements Parcelable.Creator<InputDateComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputDateComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDateComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputDateComponent[] newArray(int i10) {
            return new InputDateComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputDateComponent(@NotNull String name, @Nullable String str, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str2, @NotNull List<String> monthList, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        this.name = name;
        this.value = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.monthPlaceholder = str2;
        this.monthList = monthList;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.dateController = new C5198g(str, str2, monthList);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getDateController$annotations() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputDateComponent m20685j(InputDateComponent inputDateComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str3, List list, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputDateComponent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = inputDateComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputDateComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputDateComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            str3 = inputDateComponent.monthPlaceholder;
        }
        if ((i10 & 32) != 0) {
            list = inputDateComponent.monthList;
        }
        if ((i10 & 64) != 0) {
            j10 = inputDateComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        String str4 = str3;
        List list2 = list;
        return inputDateComponent.m20688g(str, str2, jsonLogicBoolean, jsonLogicBoolean2, str4, list2, j11);
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
        if (!(other instanceof InputDateComponent)) {
            return false;
        }
        InputDateComponent inputDateComponent = (InputDateComponent) other;
        return Intrinsics.m31980c(this.name, inputDateComponent.name) && Intrinsics.m31980c(this.value, inputDateComponent.value) && Intrinsics.m31980c(this.hidden, inputDateComponent.hidden) && Intrinsics.m31980c(this.disabled, inputDateComponent.disabled) && Intrinsics.m31980c(this.monthPlaceholder, inputDateComponent.monthPlaceholder) && Intrinsics.m31980c(this.monthList, inputDateComponent.monthList) && this.lastValueUpdateTs == inputDateComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4269l
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public C5198g getDateController() {
        return this.dateController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputDateComponent m20688g(@NotNull String name, @Nullable String value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable String monthPlaceholder, @NotNull List<String> monthList, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        return new InputDateComponent(name, value, hidden, disabled, monthPlaceholder, monthList, lastValueUpdateTs);
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
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str2 = this.monthPlaceholder;
        return ((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.monthList.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    /* JADX INFO: renamed from: k */
    public void m20689k(@NotNull C5198g c5198g) {
        Intrinsics.checkNotNullParameter(c5198g, "<set-?>");
        this.dateController = c5198g;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4269l
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public InputDateComponent mo20686a(@Nullable String newDate) {
        InputDateComponent inputDateComponentM20685j = m20685j(this, null, newDate, null, null, null, null, System.currentTimeMillis(), 61, null);
        inputDateComponentM20685j.m20689k(getDateController());
        return inputDateComponentM20685j;
    }

    @NotNull
    public String toString() {
        return "InputDateComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", monthPlaceholder=" + this.monthPlaceholder + ", monthList=" + this.monthList + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.monthPlaceholder);
        dest.writeStringList(this.monthList);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
      (r12v0 java.lang.String)
      (r13v0 java.lang.String)
      (r14v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r15v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r16v0 java.lang.String)
      (r17v0 java.util.List)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.util.List<java.lang.String>, long):void (m)] (LINE:11) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.util.List, long):void type: THIS */
    public /* synthetic */ InputDateComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str3, List list, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsonLogicBoolean, jsonLogicBoolean2, str3, list, (i10 & 64) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputDateComponent(@NotNull InputDate config) {
        List<String> textMonths;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputDate.Attributes attributes = config.getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputDate.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputDate.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputDate.Attributes attributes4 = config.getAttributes();
        String placeholderMonth = attributes4 != null ? attributes4.getPlaceholderMonth() : null;
        InputDate.Attributes attributes5 = config.getAttributes();
        this(name, prefill, hidden, disabled, placeholderMonth, (attributes5 == null || (textMonths = attributes5.getTextMonths()) == null) ? C7699p.m31892k() : textMonths, 0L, 64, null);
    }
}
