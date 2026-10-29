package p325o9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p305n9.C8953m;

/* JADX INFO: renamed from: o9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9719c {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T extends SafeParcelable> T m38483a(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        C8953m.m36047l(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends SafeParcelable> T m38484b(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m38483a(byteArrayExtra, creator);
    }
}
