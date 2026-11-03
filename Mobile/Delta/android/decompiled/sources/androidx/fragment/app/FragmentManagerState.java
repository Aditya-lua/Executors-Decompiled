package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f2371a;
    public ArrayList<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f2372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f2375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<BackStackState> f2376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f2377h;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f2374e = null;
        this.f2375f = new ArrayList<>();
        this.f2376g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2371a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.f2372c, i10);
        parcel.writeInt(this.f2373d);
        parcel.writeString(this.f2374e);
        parcel.writeStringList(this.f2375f);
        parcel.writeTypedList(this.f2376g);
        parcel.writeTypedList(this.f2377h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2374e = null;
        this.f2375f = new ArrayList<>();
        this.f2376g = new ArrayList<>();
        this.f2371a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.f2372c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f2373d = parcel.readInt();
        this.f2374e = parcel.readString();
        this.f2375f = parcel.createStringArrayList();
        this.f2376g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f2377h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
