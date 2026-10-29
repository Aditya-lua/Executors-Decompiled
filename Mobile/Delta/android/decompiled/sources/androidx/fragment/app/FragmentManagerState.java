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
    public ArrayList<String> f2526a;
    public ArrayList<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f2527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f2530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<BackStackState> f2531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f2532h;

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
        this.f2529e = null;
        this.f2530f = new ArrayList<>();
        this.f2531g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2526a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.f2527c, i10);
        parcel.writeInt(this.f2528d);
        parcel.writeString(this.f2529e);
        parcel.writeStringList(this.f2530f);
        parcel.writeTypedList(this.f2531g);
        parcel.writeTypedList(this.f2532h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2529e = null;
        this.f2530f = new ArrayList<>();
        this.f2531g = new ArrayList<>();
        this.f2526a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.f2527c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f2528d = parcel.readInt();
        this.f2529e = parcel.readString();
        this.f2530f = parcel.createStringArrayList();
        this.f2531g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f2532h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
