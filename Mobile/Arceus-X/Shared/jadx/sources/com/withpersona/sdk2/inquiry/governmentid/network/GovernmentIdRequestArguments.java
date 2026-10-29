package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0014¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "ids", "", "fieldKeyDocument", "fieldKeyIdClass", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "f", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class GovernmentIdRequestArguments implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdRequestArguments> CREATOR = new C3567a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<GovernmentId> ids;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String fieldKeyDocument;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String fieldKeyIdClass;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3567a implements Parcelable.Creator<GovernmentIdRequestArguments> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdRequestArguments createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(GovernmentIdRequestArguments.class.getClassLoader()));
            }
            return new GovernmentIdRequestArguments(arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdRequestArguments[] newArray(int i10) {
            return new GovernmentIdRequestArguments[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentId> */
    /* JADX WARN: Multi-variable type inference failed */
    public GovernmentIdRequestArguments(@NotNull List<? extends GovernmentId> ids, @NotNull String fieldKeyDocument, @NotNull String fieldKeyIdClass) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
        Intrinsics.checkNotNullParameter(fieldKeyIdClass, "fieldKeyIdClass");
        this.ids = ids;
        this.fieldKeyDocument = fieldKeyDocument;
        this.fieldKeyIdClass = fieldKeyIdClass;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFieldKeyDocument() {
        return this.fieldKeyDocument;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdRequestArguments)) {
            return false;
        }
        GovernmentIdRequestArguments governmentIdRequestArguments = (GovernmentIdRequestArguments) other;
        return Intrinsics.m31980c(this.ids, governmentIdRequestArguments.ids) && Intrinsics.m31980c(this.fieldKeyDocument, governmentIdRequestArguments.fieldKeyDocument) && Intrinsics.m31980c(this.fieldKeyIdClass, governmentIdRequestArguments.fieldKeyIdClass);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFieldKeyIdClass() {
        return this.fieldKeyIdClass;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<GovernmentId> m17717g() {
        return this.ids;
    }

    public int hashCode() {
        return (((this.ids.hashCode() * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode();
    }

    @NotNull
    public String toString() {
        return "GovernmentIdRequestArguments(ids=" + this.ids + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<GovernmentId> list = this.ids;
        dest.writeInt(list.size());
        Iterator<GovernmentId> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.fieldKeyDocument);
        dest.writeString(this.fieldKeyIdClass);
    }
}
