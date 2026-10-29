package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "", "name", "", "children", "", "firstBelowTheFoldChildIndex", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;)V", "newChildren", "r1", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", "J", "R0", "()J", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class FooterComponent implements UiComponent, UiComponentGroup {

    @NotNull
    public static final Parcelable.Creator<FooterComponent> CREATOR = new C4037a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<UiComponent> children;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer firstBelowTheFoldChildIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4037a implements Parcelable.Creator<FooterComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FooterComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(FooterComponent.class.getClassLoader()));
            }
            return new FooterComponent(string, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FooterComponent[] newArray(int i10) {
            return new FooterComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> */
    /* JADX WARN: Multi-variable type inference failed */
    public FooterComponent(@NotNull String name, @NotNull List<? extends UiComponent> children, @Nullable Integer num, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.children = children;
        this.firstBelowTheFoldChildIndex = num;
        this.lastValueUpdateTs = j10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ FooterComponent m20580f(FooterComponent footerComponent, String str, List list, Integer num, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footerComponent.name;
        }
        if ((i10 & 2) != 0) {
            list = footerComponent.children;
        }
        if ((i10 & 4) != 0) {
            num = footerComponent.firstBelowTheFoldChildIndex;
        }
        if ((i10 & 8) != 0) {
            j10 = footerComponent.lastValueUpdateTs;
        }
        Integer num2 = num;
        return footerComponent.m20581a(str, list, num2, j10);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final FooterComponent m20581a(@NotNull String name, @NotNull List<? extends UiComponent> children, @Nullable Integer firstBelowTheFoldChildIndex, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        return new FooterComponent(name, children, firstBelowTheFoldChildIndex, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterComponent)) {
            return false;
        }
        FooterComponent footerComponent = (FooterComponent) other;
        return Intrinsics.m31980c(this.name, footerComponent.name) && Intrinsics.m31980c(this.children, footerComponent.children) && Intrinsics.m31980c(this.firstBelowTheFoldChildIndex, footerComponent.firstBelowTheFoldChildIndex) && this.lastValueUpdateTs == footerComponent.lastValueUpdateTs;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getFirstBelowTheFoldChildIndex() {
        return this.firstBelowTheFoldChildIndex;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup
    @NotNull
    public List<UiComponent> getChildren() {
        return this.children;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        Integer num = this.firstBelowTheFoldChildIndex;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup
    @NotNull
    /* JADX INFO: renamed from: r1 */
    public UiComponentGroup mo20548r1(@NotNull List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return m20580f(this, null, newChildren, null, 0L, 13, null);
    }

    @NotNull
    public String toString() {
        return "FooterComponent(name=" + this.name + ", children=" + this.children + ", firstBelowTheFoldChildIndex=" + this.firstBelowTheFoldChildIndex + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        List<UiComponent> list = this.children;
        dest.writeInt(list.size());
        Iterator<UiComponent> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        Integer num = this.firstBelowTheFoldChildIndex;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r7v0 java.lang.String)
      (r8v0 java.util.List)
      (r9v0 java.lang.Integer)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
     A[MD:(java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent>, java.lang.Integer, long):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent.<init>(java.lang.String, java.util.List, java.lang.Integer, long):void type: THIS */
    public /* synthetic */ FooterComponent(String str, List list, Integer num, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, num, (i10 & 8) != 0 ? 0L : j10);
    }

    public FooterComponent(@NotNull Footer config) {
        List listM31892k;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        List<UiComponentConfig> children = config.getChildren();
        if (children != null) {
            listM31892k = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                UiComponent uiComponentM20895l = C4086b.m20895l((UiComponentConfig) it.next());
                if (uiComponentM20895l != null) {
                    listM31892k.add(uiComponentM20895l);
                }
            }
        } else {
            listM31892k = C7699p.m31892k();
        }
        List list = listM31892k;
        Footer.Attributes attributes = config.getAttributes();
        this(name, list, attributes != null ? attributes.getFirstBelowTheFoldChildIndex() : null, 0L, 8, null);
    }
}
