package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.l;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2533a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2546o;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(c cVar) {
        this.f2533a = cVar.getClass().getName();
        this.b = cVar.f2604f;
        this.f2534c = cVar.f2614p;
        this.f2535d = cVar.f2616r;
        this.f2536e = cVar.f2624z;
        this.f2537f = cVar.A;
        this.f2538g = cVar.B;
        this.f2539h = cVar.E;
        this.f2540i = cVar.f2611m;
        this.f2541j = cVar.D;
        this.f2542k = cVar.C;
        this.f2543l = cVar.U.ordinal();
        this.f2544m = cVar.f2607i;
        this.f2545n = cVar.f2608j;
        this.f2546o = cVar.M;
    }

    @NonNull
    public c a(@NonNull e eVar, @NonNull ClassLoader classLoader) {
        c cVarA = eVar.a(classLoader, this.f2533a);
        cVarA.f2604f = this.b;
        cVarA.f2614p = this.f2534c;
        cVarA.f2616r = this.f2535d;
        cVarA.f2617s = true;
        cVarA.f2624z = this.f2536e;
        cVarA.A = this.f2537f;
        cVarA.B = this.f2538g;
        cVarA.E = this.f2539h;
        cVarA.f2611m = this.f2540i;
        cVarA.D = this.f2541j;
        cVarA.C = this.f2542k;
        cVarA.U = l.b.values()[this.f2543l];
        cVarA.f2607i = this.f2544m;
        cVarA.f2608j = this.f2545n;
        cVarA.M = this.f2546o;
        return cVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2533a);
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(")}:");
        if (this.f2534c) {
            sb2.append(" fromLayout");
        }
        if (this.f2535d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f2537f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2537f));
        }
        String str = this.f2538g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2538g);
        }
        if (this.f2539h) {
            sb2.append(" retainInstance");
        }
        if (this.f2540i) {
            sb2.append(" removing");
        }
        if (this.f2541j) {
            sb2.append(" detached");
        }
        if (this.f2542k) {
            sb2.append(" hidden");
        }
        if (this.f2544m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f2544m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f2545n);
        }
        if (this.f2546o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2533a);
        parcel.writeString(this.b);
        parcel.writeInt(this.f2534c ? 1 : 0);
        parcel.writeInt(this.f2535d ? 1 : 0);
        parcel.writeInt(this.f2536e);
        parcel.writeInt(this.f2537f);
        parcel.writeString(this.f2538g);
        parcel.writeInt(this.f2539h ? 1 : 0);
        parcel.writeInt(this.f2540i ? 1 : 0);
        parcel.writeInt(this.f2541j ? 1 : 0);
        parcel.writeInt(this.f2542k ? 1 : 0);
        parcel.writeInt(this.f2543l);
        parcel.writeString(this.f2544m);
        parcel.writeInt(this.f2545n);
        parcel.writeInt(this.f2546o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f2533a = parcel.readString();
        this.b = parcel.readString();
        this.f2534c = parcel.readInt() != 0;
        this.f2535d = parcel.readInt() != 0;
        this.f2536e = parcel.readInt();
        this.f2537f = parcel.readInt();
        this.f2538g = parcel.readString();
        this.f2539h = parcel.readInt() != 0;
        this.f2540i = parcel.readInt() != 0;
        this.f2541j = parcel.readInt() != 0;
        this.f2542k = parcel.readInt() != 0;
        this.f2543l = parcel.readInt();
        this.f2544m = parcel.readString();
        this.f2545n = parcel.readInt();
        this.f2546o = parcel.readInt() != 0;
    }
}
