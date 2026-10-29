package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import cr.InterfaceC4341x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010 R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b7\u0010*\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010,¨\u0006<"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "Lcr/x;", "", "name", "", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;)V", "newChildren", "r1", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "J", "R0", "()J", "", "Lmr/a;", "e", "i", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class HorizontalStackComponent implements UiComponent, UiComponentGroup, InterfaceC4341x {

    @NotNull
    public static final Parcelable.Creator<HorizontalStackComponent> CREATOR = new C4039a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<UiComponent> children;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponent$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4039a implements Parcelable.Creator<HorizontalStackComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HorizontalStackComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(HorizontalStackComponent.class.getClassLoader()));
            }
            return new HorizontalStackComponent(string, arrayList, (JsonLogicBoolean) parcel.readParcelable(HorizontalStackComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HorizontalStackComponent[] newArray(int i10) {
            return new HorizontalStackComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> */
    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalStackComponent(@NotNull String name, @NotNull List<? extends UiComponent> children, @Nullable JsonLogicBoolean jsonLogicBoolean, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.children = children;
        this.hidden = jsonLogicBoolean;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ HorizontalStackComponent m20604f(HorizontalStackComponent horizontalStackComponent, String str, List list, JsonLogicBoolean jsonLogicBoolean, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = horizontalStackComponent.name;
        }
        if ((i10 & 2) != 0) {
            list = horizontalStackComponent.children;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = horizontalStackComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            j10 = horizontalStackComponent.lastValueUpdateTs;
        }
        JsonLogicBoolean jsonLogicBoolean2 = jsonLogicBoolean;
        return horizontalStackComponent.m20605a(str, list, jsonLogicBoolean2, j10);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HorizontalStackComponent m20605a(@NotNull String name, @NotNull List<? extends UiComponent> children, @Nullable JsonLogicBoolean hidden, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(children, "children");
        return new HorizontalStackComponent(name, children, hidden, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalStackComponent)) {
            return false;
        }
        HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) other;
        return Intrinsics.m31980c(this.name, horizontalStackComponent.name) && Intrinsics.m31980c(this.children, horizontalStackComponent.children) && Intrinsics.m31980c(this.hidden, horizontalStackComponent.hidden) && this.lastValueUpdateTs == horizontalStackComponent.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup
    @NotNull
    public List<UiComponent> getChildren() {
        return this.children;
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
        int iHashCode = ((this.name.hashCode() * 31) + this.children.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        return ((iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup
    @NotNull
    /* JADX INFO: renamed from: r1 */
    public UiComponentGroup mo20548r1(@NotNull List<? extends UiComponent> newChildren) {
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        return m20604f(this, null, newChildren, null, 0L, 13, null);
    }

    @NotNull
    public String toString() {
        return "HorizontalStackComponent(name=" + this.name + ", children=" + this.children + ", hidden=" + this.hidden + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        List<UiComponent> list = this.children;
        dest.writeInt(list.size());
        Iterator<UiComponent> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r7v0 java.lang.String)
      (r8v0 java.util.List)
      (r9v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
     A[MD:(java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent>, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void (m)] (LINE:7) call: com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponent.<init>(java.lang.String, java.util.List, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, long):void type: THIS */
    public /* synthetic */ HorizontalStackComponent(String str, List list, JsonLogicBoolean jsonLogicBoolean, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, jsonLogicBoolean, (i10 & 8) != 0 ? 0L : j10);
    }

    public HorizontalStackComponent(@NotNull HorizontalStack config) {
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
        HorizontalStack.Attributes attributes = config.getAttributes();
        this(name, list, attributes != null ? attributes.getHidden() : null, 0L, 8, null);
    }
}
