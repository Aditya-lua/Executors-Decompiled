package f4;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15533a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f15543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f15545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f15546o;

    public class a implements Parcelable.Creator<q0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 createFromParcel(Parcel parcel) {
            return new q0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q0[] newArray(int i10) {
            return new q0[i10];
        }
    }

    public q0(q qVar) {
        this.f15533a = qVar.getClass().getName();
        this.b = qVar.f15478f;
        this.f15534c = qVar.f15488p;
        this.f15535d = qVar.f15490r;
        this.f15536e = qVar.f15498z;
        this.f15537f = qVar.A;
        this.f15538g = qVar.B;
        this.f15539h = qVar.E;
        this.f15540i = qVar.f15485m;
        this.f15541j = qVar.D;
        this.f15542k = qVar.C;
        this.f15543l = qVar.U.ordinal();
        this.f15544m = qVar.f15481i;
        this.f15545n = qVar.f15482j;
        this.f15546o = qVar.M;
    }

    @NonNull
    public q a(@NonNull z zVar, @NonNull ClassLoader classLoader) {
        q qVarA = zVar.a(classLoader, this.f15533a);
        qVarA.f15478f = this.b;
        qVarA.f15488p = this.f15534c;
        qVarA.f15490r = this.f15535d;
        qVarA.f15491s = true;
        qVarA.f15498z = this.f15536e;
        qVarA.A = this.f15537f;
        qVarA.B = this.f15538g;
        qVarA.E = this.f15539h;
        qVarA.f15485m = this.f15540i;
        qVarA.D = this.f15541j;
        qVarA.C = this.f15542k;
        qVarA.U = androidx.lifecycle.l.b.values()[this.f15543l];
        qVarA.f15481i = this.f15544m;
        qVarA.f15482j = this.f15545n;
        qVarA.M = this.f15546o;
        return qVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_ITF);
        sb2.append("FragmentState{");
        sb2.append(this.f15533a);
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(")}:");
        if (this.f15534c) {
            sb2.append(" fromLayout");
        }
        if (this.f15535d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f15537f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f15537f));
        }
        String str = this.f15538g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f15538g);
        }
        if (this.f15539h) {
            sb2.append(" retainInstance");
        }
        if (this.f15540i) {
            sb2.append(" removing");
        }
        if (this.f15541j) {
            sb2.append(" detached");
        }
        if (this.f15542k) {
            sb2.append(" hidden");
        }
        if (this.f15544m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f15544m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f15545n);
        }
        if (this.f15546o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15533a);
        parcel.writeString(this.b);
        parcel.writeInt(this.f15534c ? 1 : 0);
        parcel.writeInt(this.f15535d ? 1 : 0);
        parcel.writeInt(this.f15536e);
        parcel.writeInt(this.f15537f);
        parcel.writeString(this.f15538g);
        parcel.writeInt(this.f15539h ? 1 : 0);
        parcel.writeInt(this.f15540i ? 1 : 0);
        parcel.writeInt(this.f15541j ? 1 : 0);
        parcel.writeInt(this.f15542k ? 1 : 0);
        parcel.writeInt(this.f15543l);
        parcel.writeString(this.f15544m);
        parcel.writeInt(this.f15545n);
        parcel.writeInt(this.f15546o ? 1 : 0);
    }

    public q0(Parcel parcel) {
        this.f15533a = parcel.readString();
        this.b = parcel.readString();
        this.f15534c = parcel.readInt() != 0;
        this.f15535d = parcel.readInt() != 0;
        this.f15536e = parcel.readInt();
        this.f15537f = parcel.readInt();
        this.f15538g = parcel.readString();
        this.f15539h = parcel.readInt() != 0;
        this.f15540i = parcel.readInt() != 0;
        this.f15541j = parcel.readInt() != 0;
        this.f15542k = parcel.readInt() != 0;
        this.f15543l = parcel.readInt();
        this.f15544m = parcel.readString();
        this.f15545n = parcel.readInt();
        this.f15546o = parcel.readInt() != 0;
    }
}
