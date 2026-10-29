package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.InquiryField;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;", "Landroid/os/Parcelable;", "", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "<init>", "(Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class InquiryFieldsMap implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InquiryFieldsMap> CREATOR = new C3635a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InquiryField> fields;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryFieldsMap$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3635a implements Parcelable.Creator<InquiryFieldsMap> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InquiryFieldsMap createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(InquiryFieldsMap.class.getClassLoader()));
            }
            return new InquiryFieldsMap(linkedHashMap);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InquiryFieldsMap[] newArray(int i10) {
            return new InquiryFieldsMap[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.InquiryField> */
    /* JADX WARN: Multi-variable type inference failed */
    public InquiryFieldsMap(@NotNull Map<String, ? extends InquiryField> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.fields = fields;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, InquiryField> m18081a() {
        return this.fields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, InquiryField> map = this.fields;
        dest.writeInt(map.size());
        for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
    }
}
