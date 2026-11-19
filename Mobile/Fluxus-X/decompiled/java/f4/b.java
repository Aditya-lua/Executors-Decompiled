package f4;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f15279a;
    public final ArrayList<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f15280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f15281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f15286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f15288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f15289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f15290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15291n;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(f4.a aVar) {
        int size = aVar.f15560c.size();
        this.f15279a = new int[size * 6];
        if (!aVar.f15566i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList<>(size);
        this.f15280c = new int[size];
        this.f15281d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            t0.a aVar2 = aVar.f15560c.get(i11);
            int i12 = i10 + 1;
            this.f15279a[i10] = aVar2.f15577a;
            ArrayList<String> arrayList = this.b;
            q qVar = aVar2.b;
            arrayList.add(qVar != null ? qVar.f15478f : null);
            int[] iArr = this.f15279a;
            iArr[i12] = aVar2.f15578c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f15579d;
            iArr[i10 + 3] = aVar2.f15580e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f15581f;
            i10 += 6;
            iArr[i13] = aVar2.f15582g;
            this.f15280c[i11] = aVar2.f15583h.ordinal();
            this.f15281d[i11] = aVar2.f15584i.ordinal();
        }
        this.f15282e = aVar.f15565h;
        this.f15283f = aVar.f15568k;
        this.f15284g = aVar.f15272v;
        this.f15285h = aVar.f15569l;
        this.f15286i = aVar.f15570m;
        this.f15287j = aVar.f15571n;
        this.f15288k = aVar.f15572o;
        this.f15289l = aVar.f15573p;
        this.f15290m = aVar.f15574q;
        this.f15291n = aVar.f15575r;
    }

    public final void a(@NonNull f4.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f15279a.length) {
                aVar.f15565h = this.f15282e;
                aVar.f15568k = this.f15283f;
                aVar.f15566i = true;
                aVar.f15569l = this.f15285h;
                aVar.f15570m = this.f15286i;
                aVar.f15571n = this.f15287j;
                aVar.f15572o = this.f15288k;
                aVar.f15573p = this.f15289l;
                aVar.f15574q = this.f15290m;
                aVar.f15575r = this.f15291n;
                return;
            }
            t0.a aVar2 = new t0.a();
            int i12 = i10 + 1;
            aVar2.f15577a = this.f15279a[i10];
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f15279a[i12]);
            }
            aVar2.f15583h = androidx.lifecycle.l.b.values()[this.f15280c[i11]];
            aVar2.f15584i = androidx.lifecycle.l.b.values()[this.f15281d[i11]];
            int[] iArr = this.f15279a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f15578c = z10;
            int i14 = iArr[i13];
            aVar2.f15579d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f15580e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f15581f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f15582g = i18;
            aVar.f15561d = i14;
            aVar.f15562e = i15;
            aVar.f15563f = i17;
            aVar.f15564g = i18;
            aVar.e(aVar2);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public f4.a f(@NonNull k0 k0Var) {
        f4.a aVar = new f4.a(k0Var);
        a(aVar);
        aVar.f15272v = this.f15284g;
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            String str = this.b.get(i10);
            if (str != null) {
                aVar.f15560c.get(i10).b = k0Var.k0(str);
            }
        }
        aVar.u(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f15279a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.f15280c);
        parcel.writeIntArray(this.f15281d);
        parcel.writeInt(this.f15282e);
        parcel.writeString(this.f15283f);
        parcel.writeInt(this.f15284g);
        parcel.writeInt(this.f15285h);
        TextUtils.writeToParcel(this.f15286i, parcel, 0);
        parcel.writeInt(this.f15287j);
        TextUtils.writeToParcel(this.f15288k, parcel, 0);
        parcel.writeStringList(this.f15289l);
        parcel.writeStringList(this.f15290m);
        parcel.writeInt(this.f15291n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f15279a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.f15280c = parcel.createIntArray();
        this.f15281d = parcel.createIntArray();
        this.f15282e = parcel.readInt();
        this.f15283f = parcel.readString();
        this.f15284g = parcel.readInt();
        this.f15285h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f15286i = (CharSequence) creator.createFromParcel(parcel);
        this.f15287j = parcel.readInt();
        this.f15288k = (CharSequence) creator.createFromParcel(parcel);
        this.f15289l = parcel.createStringArrayList();
        this.f15290m = parcel.createStringArrayList();
        this.f15291n = parcel.readInt() != 0;
    }
}
