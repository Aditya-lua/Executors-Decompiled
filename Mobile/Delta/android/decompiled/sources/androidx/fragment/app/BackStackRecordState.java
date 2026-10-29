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
    public final int[] f2466a;
    public final ArrayList<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f2467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f2473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f2475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f2476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f2477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2478n;

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
        int size = aVar.f2674c.size();
        this.f2466a = new int[size * 6];
        if (!aVar.f2680i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList<>(size);
        this.f2467c = new int[size];
        this.f2468d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            h.a aVar2 = aVar.f2674c.get(i11);
            int i12 = i10 + 1;
            this.f2466a[i10] = aVar2.f2691a;
            ArrayList<String> arrayList = this.b;
            c cVar = aVar2.b;
            arrayList.add(cVar != null ? cVar.f2604f : null);
            int[] iArr = this.f2466a;
            iArr[i12] = aVar2.f2692c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f2693d;
            iArr[i10 + 3] = aVar2.f2694e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f2695f;
            i10 += 6;
            iArr[i13] = aVar2.f2696g;
            this.f2467c[i11] = aVar2.f2697h.ordinal();
            this.f2468d[i11] = aVar2.f2698i.ordinal();
        }
        this.f2469e = aVar.f2679h;
        this.f2470f = aVar.f2682k;
        this.f2471g = aVar.f2549v;
        this.f2472h = aVar.f2683l;
        this.f2473i = aVar.f2684m;
        this.f2474j = aVar.f2685n;
        this.f2475k = aVar.f2686o;
        this.f2476l = aVar.f2687p;
        this.f2477m = aVar.f2688q;
        this.f2478n = aVar.f2689r;
    }

    public final void a(@NonNull androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f2466a.length) {
                aVar.f2679h = this.f2469e;
                aVar.f2682k = this.f2470f;
                aVar.f2680i = true;
                aVar.f2683l = this.f2472h;
                aVar.f2684m = this.f2473i;
                aVar.f2685n = this.f2474j;
                aVar.f2686o = this.f2475k;
                aVar.f2687p = this.f2476l;
                aVar.f2688q = this.f2477m;
                aVar.f2689r = this.f2478n;
                return;
            }
            h.a aVar2 = new h.a();
            int i12 = i10 + 1;
            aVar2.f2691a = this.f2466a[i10];
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2466a[i12]);
            }
            aVar2.f2697h = l.b.values()[this.f2467c[i11]];
            aVar2.f2698i = l.b.values()[this.f2468d[i11]];
            int[] iArr = this.f2466a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f2692c = z10;
            int i14 = iArr[i13];
            aVar2.f2693d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f2694e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f2695f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f2696g = i18;
            aVar.f2675d = i14;
            aVar.f2676e = i15;
            aVar.f2677f = i17;
            aVar.f2678g = i18;
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
        aVar.f2549v = this.f2471g;
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            String str = this.b.get(i10);
            if (str != null) {
                aVar.f2674c.get(i10).b = fragmentManager.k0(str);
            }
        }
        aVar.u(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2466a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.f2467c);
        parcel.writeIntArray(this.f2468d);
        parcel.writeInt(this.f2469e);
        parcel.writeString(this.f2470f);
        parcel.writeInt(this.f2471g);
        parcel.writeInt(this.f2472h);
        TextUtils.writeToParcel(this.f2473i, parcel, 0);
        parcel.writeInt(this.f2474j);
        TextUtils.writeToParcel(this.f2475k, parcel, 0);
        parcel.writeStringList(this.f2476l);
        parcel.writeStringList(this.f2477m);
        parcel.writeInt(this.f2478n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f2466a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.f2467c = parcel.createIntArray();
        this.f2468d = parcel.createIntArray();
        this.f2469e = parcel.readInt();
        this.f2470f = parcel.readString();
        this.f2471g = parcel.readInt();
        this.f2472h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2473i = (CharSequence) creator.createFromParcel(parcel);
        this.f2474j = parcel.readInt();
        this.f2475k = (CharSequence) creator.createFromParcel(parcel);
        this.f2476l = parcel.createStringArrayList();
        this.f2477m = parcel.createStringArrayList();
        this.f2478n = parcel.readInt() != 0;
    }
}
