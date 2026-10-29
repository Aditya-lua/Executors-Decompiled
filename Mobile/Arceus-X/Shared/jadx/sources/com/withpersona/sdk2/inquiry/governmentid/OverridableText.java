package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "Landroid/os/Parcelable;", "", "", "backingData", "<init>", "(Ljava/util/Map;)V", "countryCode", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getBackingData", "()Ljava/util/Map;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class OverridableText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OverridableText> CREATOR = new C3518b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> backingData;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.OverridableText$a */
    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText$a;", "", "<init>", "()V", "", "countryCode", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", Text.type, "", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "a", "()Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "", "Ljava/util/Map;", "backingData", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3517a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, String> backingData = new LinkedHashMap();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final OverridableText m17308a() {
            return new OverridableText(this.backingData);
        }

        /* JADX INFO: renamed from: b */
        public final void m17309b(@Nullable String countryCode, @Nullable String idClass, @NotNull IdConfig.EnumC3514b side, @NotNull String text) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(text, "text");
            Map<String, String> map = this.backingData;
            String str = countryCode + "-" + idClass + "-" + side.getKey();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, text);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.OverridableText$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3518b implements Parcelable.Creator<OverridableText> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverridableText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new OverridableText(linkedHashMap);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OverridableText[] newArray(int i10) {
            return new OverridableText[i10];
        }
    }

    public OverridableText(@NotNull Map<String, String> backingData) {
        Intrinsics.checkNotNullParameter(backingData, "backingData");
        this.backingData = backingData;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m17307a(@Nullable String countryCode, @Nullable String idClass, @NotNull IdConfig.EnumC3514b side) {
        Intrinsics.checkNotNullParameter(side, "side");
        if (countryCode == null) {
            countryCode = "unpopulated";
        }
        if (Intrinsics.m31980c(idClass, "auto-classification") || idClass == null) {
            idClass = "unpopulated";
        }
        Map<String, String> map = this.backingData;
        String str = countryCode + "-" + idClass + "-" + side.getKey();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = map.get(lowerCase);
        if (str2 != null) {
            return str2;
        }
        Map<String, String> map2 = this.backingData;
        String str3 = ((String) null) + "-" + idClass + "-" + side.getKey();
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase2 = str3.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        String str4 = map2.get(lowerCase2);
        if (str4 != null) {
            return str4;
        }
        Map<String, String> map3 = this.backingData;
        String str5 = ((String) null) + "-" + ((String) null) + "-" + side.getKey();
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase3 = str5.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        String str6 = map3.get(lowerCase3);
        if (str6 != null) {
            return str6;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OverridableText) && Intrinsics.m31980c(this.backingData, ((OverridableText) other).backingData);
    }

    public int hashCode() {
        return this.backingData.hashCode();
    }

    @NotNull
    public String toString() {
        return "OverridableText(backingData=" + this.backingData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, String> map = this.backingData;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}
