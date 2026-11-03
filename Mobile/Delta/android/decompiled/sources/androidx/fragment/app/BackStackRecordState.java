package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2311a;
    public final ArrayList<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f2312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f2318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f2320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f2321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f2322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2323n;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f2519c.size();
        this.f2311a = new int[size * 6];
        if (!aVar.f2525i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList<>(size);
        this.f2312c = new int[size];
        this.f2313d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            h.a aVar2 = aVar.f2519c.get(i11);
            int i12 = i10 + 1;
            this.f2311a[i10] = aVar2.f2536a;
            ArrayList<String> arrayList = this.b;
            c cVar = aVar2.b;
            arrayList.add(cVar != null ? cVar.f2449f : null);
            int[] iArr = this.f2311a;
            iArr[i12] = aVar2.f2537c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f2538d;
            iArr[i10 + 3] = aVar2.f2539e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f2540f;
            i10 += 6;
            iArr[i13] = aVar2.f2541g;
            this.f2312c[i11] = aVar2.f2542h.ordinal();
            this.f2313d[i11] = aVar2.f2543i.ordinal();
        }
        this.f2314e = aVar.f2524h;
        this.f2315f = aVar.f2527k;
        this.f2316g = aVar.f2394v;
        this.f2317h = aVar.f2528l;
        this.f2318i = aVar.f2529m;
        this.f2319j = aVar.f2530n;
        this.f2320k = aVar.f2531o;
        this.f2321l = aVar.f2532p;
        this.f2322m = aVar.f2533q;
        this.f2323n = aVar.f2534r;
    }

    public final void a(@NonNull androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f2311a.length) {
                aVar.f2524h = this.f2314e;
                aVar.f2527k = this.f2315f;
                aVar.f2525i = true;
                aVar.f2528l = this.f2317h;
                aVar.f2529m = this.f2318i;
                aVar.f2530n = this.f2319j;
                aVar.f2531o = this.f2320k;
                aVar.f2532p = this.f2321l;
                aVar.f2533q = this.f2322m;
                aVar.f2534r = this.f2323n;
                return;
            }
            h.a aVar2 = new h.a();
            int i12 = i10 + 1;
            aVar2.f2536a = this.f2311a[i10];
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2311a[i12]);
            }
            aVar2.f2542h = l.b.values()[this.f2312c[i11]];
            aVar2.f2543i = l.b.values()[this.f2313d[i11]];
            int[] iArr = this.f2311a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f2537c = z10;
            int i14 = iArr[i13];
            aVar2.f2538d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f2539e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f2540f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f2541g = i18;
            aVar.f2520d = i14;
            aVar.f2521e = i15;
            aVar.f2522f = i17;
            aVar.f2523g = i18;
            aVar.e(aVar2);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public androidx.fragment.app.a f(@NonNull FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.f2394v = this.f2316g;
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            String str = this.b.get(i10);
            if (str != null) {
                aVar.f2519c.get(i10).b = fragmentManager.k0(str);
            }
        }
        aVar.u(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2311a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.f2312c);
        parcel.writeIntArray(this.f2313d);
        parcel.writeInt(this.f2314e);
        parcel.writeString(this.f2315f);
        parcel.writeInt(this.f2316g);
        parcel.writeInt(this.f2317h);
        TextUtils.writeToParcel(this.f2318i, parcel, 0);
        parcel.writeInt(this.f2319j);
        TextUtils.writeToParcel(this.f2320k, parcel, 0);
        parcel.writeStringList(this.f2321l);
        parcel.writeStringList(this.f2322m);
        parcel.writeInt(this.f2323n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f2311a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.f2312c = parcel.createIntArray();
        this.f2313d = parcel.createIntArray();
        this.f2314e = parcel.readInt();
        this.f2315f = parcel.readString();
        this.f2316g = parcel.readInt();
        this.f2317h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2318i = (CharSequence) creator.createFromParcel(parcel);
        this.f2319j = parcel.readInt();
        this.f2320k = (CharSequence) creator.createFromParcel(parcel);
        this.f2321l = parcel.createStringArrayList();
        this.f2322m = parcel.createStringArrayList();
        this.f2323n = parcel.readInt() != 0;
    }
}
