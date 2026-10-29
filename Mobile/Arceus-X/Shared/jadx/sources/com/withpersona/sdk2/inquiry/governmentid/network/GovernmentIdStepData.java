package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdStepData;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "", "stepName", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "ids", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GovernmentIdStepData implements StepData {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new C3568a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String stepName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<GovernmentId> ids;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3568a implements Parcelable.Creator<GovernmentIdStepData> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdStepData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(GovernmentIdStepData.class.getClassLoader()));
            }
            return new GovernmentIdStepData(string, arrayList);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdStepData[] newArray(int i10) {
            return new GovernmentIdStepData[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentId> */
    /* JADX WARN: Multi-variable type inference failed */
    public GovernmentIdStepData(@NotNull String stepName, @NotNull List<? extends GovernmentId> ids) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.stepName = stepName;
        this.ids = ids;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<GovernmentId> m17720a() {
        return this.ids;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getStepName() {
        return this.stepName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.stepName);
        List<GovernmentId> list = this.ids;
        dest.writeInt(list.size());
        Iterator<GovernmentId> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }
}
