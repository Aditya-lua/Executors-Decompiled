package f4;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f15432a;
    public ArrayList<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f15433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f15436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<c> f15437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<k0.m> f15438h;

    public class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0 createFromParcel(Parcel parcel) {
            return new m0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m0[] newArray(int i10) {
            return new m0[i10];
        }
    }

    public m0() {
        this.f15435e = null;
        this.f15436f = new ArrayList<>();
        this.f15437g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f15432a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.f15433c, i10);
        parcel.writeInt(this.f15434d);
        parcel.writeString(this.f15435e);
        parcel.writeStringList(this.f15436f);
        parcel.writeTypedList(this.f15437g);
        parcel.writeTypedList(this.f15438h);
    }

    public m0(Parcel parcel) {
        this.f15435e = null;
        this.f15436f = new ArrayList<>();
        this.f15437g = new ArrayList<>();
        this.f15432a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.f15433c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f15434d = parcel.readInt();
        this.f15435e = parcel.readString();
        this.f15436f = parcel.createStringArrayList();
        this.f15437g = parcel.createTypedArrayList(c.CREATOR);
        this.f15438h = parcel.createTypedArrayList(k0.m.CREATOR);
    }
}
