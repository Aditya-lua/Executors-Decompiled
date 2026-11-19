package ld;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import w1.j;

/* JADX INFO: loaded from: classes2.dex */
public class a extends r3.a {
    public static final Parcelable.Creator<a> CREATOR = new C0425a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final j<String, Bundle> f22070c;

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    public class C0425a implements Parcelable.ClassLoaderCreator<a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0425a c0425a) {
        this(parcel, classLoader);
    }

    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f22070c + "}";
    }

    @Override // r3.a, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f22070c.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f22070c.f(i11);
            bundleArr[i11] = this.f22070c.j(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f22070c = new j<>();
    }

    public a(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f22070c = new j<>(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22070c.put(strArr[i11], bundleArr[i11]);
        }
    }
}
