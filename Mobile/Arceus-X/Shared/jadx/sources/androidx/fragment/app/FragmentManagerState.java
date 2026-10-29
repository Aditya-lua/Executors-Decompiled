package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0925a();

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f3332a;

    /* JADX INFO: renamed from: b */
    public ArrayList<String> f3333b;

    /* JADX INFO: renamed from: c */
    public BackStackRecordState[] f3334c;

    /* JADX INFO: renamed from: d */
    public int f3335d;

    /* JADX INFO: renamed from: e */
    public String f3336e;

    /* JADX INFO: renamed from: f */
    public ArrayList<String> f3337f;

    /* JADX INFO: renamed from: g */
    public ArrayList<BackStackState> f3338g;

    /* JADX INFO: renamed from: h */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f3339h;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C0925a implements Parcelable.Creator<FragmentManagerState> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FragmentManagerState() {
        this.f3336e = null;
        this.f3337f = new ArrayList<>();
        this.f3338g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f3332a);
        parcel.writeStringList(this.f3333b);
        parcel.writeTypedArray(this.f3334c, i10);
        parcel.writeInt(this.f3335d);
        parcel.writeString(this.f3336e);
        parcel.writeStringList(this.f3337f);
        parcel.writeTypedList(this.f3338g);
        parcel.writeTypedList(this.f3339h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3336e = null;
        this.f3337f = new ArrayList<>();
        this.f3338g = new ArrayList<>();
        this.f3332a = parcel.createStringArrayList();
        this.f3333b = parcel.createStringArrayList();
        this.f3334c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f3335d = parcel.readInt();
        this.f3336e = parcel.readString();
        this.f3337f = parcel.createStringArrayList();
        this.f3338g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f3339h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
