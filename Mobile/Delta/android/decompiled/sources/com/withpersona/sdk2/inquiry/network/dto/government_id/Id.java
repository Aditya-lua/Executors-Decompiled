package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qt.b;
import um.h;
import um.i;
import um.w;
import vm.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003'()B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Landroid/os/Parcelable;", "class", "", "requiresSides", "", "icon", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "capturePageConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;Ljava/util/List;)V", "getClass", "()Ljava/lang/String;", "getRequiresSides", "()Ljava/util/List;", "getIcon", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "getCapturePageConfigs", "isDynamicGovId", "", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "IdIcon", "IdLocalIcon", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class Id implements Parcelable {

    @Nullable
    private final List<CapturePageConfig> capturePageConfigs;

    @NotNull
    private final String class;

    @Nullable
    private final IdIcon icon;

    @NotNull
    private final List<String> requiresSides;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Id> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h createAdapter$lambda$0(Type type, Set set, w wVar) {
            if (Intrinsics.c(type, CapturePageConfig.RuleType.class)) {
                return a.a(CapturePageConfig.RuleType.class).d(null);
            }
            if (Intrinsics.c(type, CapturePageConfig.OverlayLocalIcon.class)) {
                return a.a(CapturePageConfig.OverlayLocalIcon.class).d(null);
            }
            if (Intrinsics.c(type, IdLocalIcon.class)) {
                return a.a(IdLocalIcon.class).d(null);
            }
            return null;
        }

        @NotNull
        public final h.e createAdapter() {
            return new h.e() { // from class: pp.a
                @Override // um.h.e
                public final h create(Type type, Set set, w wVar) {
                    return Id.Companion.createAdapter$lambda$0(type, set, wVar);
                }
            };
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Id> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Id createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            IdIcon idIconCreateFromParcel = parcel.readInt() == 0 ? null : IdIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(CapturePageConfig.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Id(string, arrayListCreateStringArrayList, idIconCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Id[] newArray(int i10) {
            return new Id[i10];
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "Landroid/os/Parcelable;", "iconFallback", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)V", "getIconFallback", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class IdIcon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdIcon> CREATOR = new Creator();

        @Nullable
        private final IdLocalIcon iconFallback;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IdIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdIcon(parcel.readInt() == 0 ? null : IdLocalIcon.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon[] newArray(int i10) {
                return new IdIcon[i10];
            }
        }

        public IdIcon(@Nullable IdLocalIcon idLocalIcon) {
            this.iconFallback = idLocalIcon;
        }

        public static /* synthetic */ IdIcon copy$default(IdIcon idIcon, IdLocalIcon idLocalIcon, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                idLocalIcon = idIcon.iconFallback;
            }
            return idIcon.copy(idLocalIcon);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        @NotNull
        public final IdIcon copy(@Nullable IdLocalIcon iconFallback) {
            return new IdIcon(iconFallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdIcon) && this.iconFallback == ((IdIcon) other).iconFallback;
        }

        @Nullable
        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public int hashCode() {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                return 0;
            }
            return idLocalIcon.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdIcon(iconFallback=" + this.iconFallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(idLocalIcon.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "", "<init>", "(Ljava/lang/String;I)V", "WORLD", "CARD", "FLAG", "HOUSE", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = false)
    public enum IdLocalIcon {
        WORLD,
        CARD,
        FLAG,
        HOUSE;

        private static final /* synthetic */ qt.a $ENTRIES = b.a(values());

        @NotNull
        public static qt.a<IdLocalIcon> getEntries() {
            return $ENTRIES;
        }
    }

    public Id(@NotNull String str, @NotNull List<String> requiresSides, @Nullable IdIcon idIcon, @Nullable List<CapturePageConfig> list) {
        Intrinsics.checkNotNullParameter(str, "class");
        Intrinsics.checkNotNullParameter(requiresSides, "requiresSides");
        this.class = str;
        this.requiresSides = requiresSides;
        this.icon = idIcon;
        this.capturePageConfigs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Id copy$default(Id id2, String str, List list, IdIcon idIcon, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = id2.class;
        }
        if ((i10 & 2) != 0) {
            list = id2.requiresSides;
        }
        if ((i10 & 4) != 0) {
            idIcon = id2.icon;
        }
        if ((i10 & 8) != 0) {
            list2 = id2.capturePageConfigs;
        }
        return id2.copy(str, list, idIcon, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClass() {
        return this.class;
    }

    @NotNull
    public final List<String> component2() {
        return this.requiresSides;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IdIcon getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<CapturePageConfig> component4() {
        return this.capturePageConfigs;
    }

    @NotNull
    public final Id copy(@NotNull String str, @NotNull List<String> requiresSides, @Nullable IdIcon icon, @Nullable List<CapturePageConfig> capturePageConfigs) {
        Intrinsics.checkNotNullParameter(str, "class");
        Intrinsics.checkNotNullParameter(requiresSides, "requiresSides");
        return new Id(str, requiresSides, icon, capturePageConfigs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Id)) {
            return false;
        }
        Id id2 = (Id) other;
        return Intrinsics.c(this.class, id2.class) && Intrinsics.c(this.requiresSides, id2.requiresSides) && Intrinsics.c(this.icon, id2.icon) && Intrinsics.c(this.capturePageConfigs, id2.capturePageConfigs);
    }

    @Nullable
    public final List<CapturePageConfig> getCapturePageConfigs() {
        return this.capturePageConfigs;
    }

    @NotNull
    public final String getClass() {
        return this.class;
    }

    @Nullable
    public final IdIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<String> getRequiresSides() {
        return this.requiresSides;
    }

    public int hashCode() {
        int iHashCode = ((this.class.hashCode() * 31) + this.requiresSides.hashCode()) * 31;
        IdIcon idIcon = this.icon;
        int iHashCode2 = (iHashCode + (idIcon == null ? 0 : idIcon.hashCode())) * 31;
        List<CapturePageConfig> list = this.capturePageConfigs;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isDynamicGovId() {
        return this.capturePageConfigs != null;
    }

    @NotNull
    public String toString() {
        return "Id(class=" + this.class + ", requiresSides=" + this.requiresSides + ", icon=" + this.icon + ", capturePageConfigs=" + this.capturePageConfigs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.class);
        dest.writeStringList(this.requiresSides);
        IdIcon idIcon = this.icon;
        if (idIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            idIcon.writeToParcel(dest, flags);
        }
        List<CapturePageConfig> list = this.capturePageConfigs;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<CapturePageConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
