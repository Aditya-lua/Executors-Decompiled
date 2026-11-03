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
    public final String f2378a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2391o;

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
        this.f2378a = cVar.getClass().getName();
        this.b = cVar.f2449f;
        this.f2379c = cVar.f2459p;
        this.f2380d = cVar.f2461r;
        this.f2381e = cVar.f2469z;
        this.f2382f = cVar.A;
        this.f2383g = cVar.B;
        this.f2384h = cVar.E;
        this.f2385i = cVar.f2456m;
        this.f2386j = cVar.D;
        this.f2387k = cVar.C;
        this.f2388l = cVar.U.ordinal();
        this.f2389m = cVar.f2452i;
        this.f2390n = cVar.f2453j;
        this.f2391o = cVar.M;
    }

    @NonNull
    public c a(@NonNull e eVar, @NonNull ClassLoader classLoader) {
        c cVarA = eVar.a(classLoader, this.f2378a);
        cVarA.f2449f = this.b;
        cVarA.f2459p = this.f2379c;
        cVarA.f2461r = this.f2380d;
        cVarA.f2462s = true;
        cVarA.f2469z = this.f2381e;
        cVarA.A = this.f2382f;
        cVarA.B = this.f2383g;
        cVarA.E = this.f2384h;
        cVarA.f2456m = this.f2385i;
        cVarA.D = this.f2386j;
        cVarA.C = this.f2387k;
        cVarA.U = l.b.values()[this.f2388l];
        cVarA.f2452i = this.f2389m;
        cVarA.f2453j = this.f2390n;
        cVarA.M = this.f2391o;
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
        sb2.append(this.f2378a);
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(")}:");
        if (this.f2379c) {
            sb2.append(" fromLayout");
        }
        if (this.f2380d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f2382f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2382f));
        }
        String str = this.f2383g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2383g);
        }
        if (this.f2384h) {
            sb2.append(" retainInstance");
        }
        if (this.f2385i) {
            sb2.append(" removing");
        }
        if (this.f2386j) {
            sb2.append(" detached");
        }
        if (this.f2387k) {
            sb2.append(" hidden");
        }
        if (this.f2389m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f2389m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f2390n);
        }
        if (this.f2391o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2378a);
        parcel.writeString(this.b);
        parcel.writeInt(this.f2379c ? 1 : 0);
        parcel.writeInt(this.f2380d ? 1 : 0);
        parcel.writeInt(this.f2381e);
        parcel.writeInt(this.f2382f);
        parcel.writeString(this.f2383g);
        parcel.writeInt(this.f2384h ? 1 : 0);
        parcel.writeInt(this.f2385i ? 1 : 0);
        parcel.writeInt(this.f2386j ? 1 : 0);
        parcel.writeInt(this.f2387k ? 1 : 0);
        parcel.writeInt(this.f2388l);
        parcel.writeString(this.f2389m);
        parcel.writeInt(this.f2390n);
        parcel.writeInt(this.f2391o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f2378a = parcel.readString();
        this.b = parcel.readString();
        this.f2379c = parcel.readInt() != 0;
        this.f2380d = parcel.readInt() != 0;
        this.f2381e = parcel.readInt();
        this.f2382f = parcel.readInt();
        this.f2383g = parcel.readString();
        this.f2384h = parcel.readInt() != 0;
        this.f2385i = parcel.readInt() != 0;
        this.f2386j = parcel.readInt() != 0;
        this.f2387k = parcel.readInt() != 0;
        this.f2388l = parcel.readInt();
        this.f2389m = parcel.readString();
        this.f2390n = parcel.readInt();
        this.f2391o = parcel.readInt() != 0;
    }
}
