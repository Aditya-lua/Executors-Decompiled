package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0926a();

    /* JADX INFO: renamed from: a */
    public final String f3340a;

    /* JADX INFO: renamed from: b */
    public final String f3341b;

    /* JADX INFO: renamed from: c */
    public final boolean f3342c;

    /* JADX INFO: renamed from: d */
    public final boolean f3343d;

    /* JADX INFO: renamed from: e */
    public final int f3344e;

    /* JADX INFO: renamed from: f */
    public final int f3345f;

    /* JADX INFO: renamed from: g */
    public final String f3346g;

    /* JADX INFO: renamed from: h */
    public final boolean f3347h;

    /* JADX INFO: renamed from: i */
    public final boolean f3348i;

    /* JADX INFO: renamed from: j */
    public final boolean f3349j;

    /* JADX INFO: renamed from: k */
    public final boolean f3350k;

    /* JADX INFO: renamed from: l */
    public final int f3351l;

    /* JADX INFO: renamed from: m */
    public final String f3352m;

    /* JADX INFO: renamed from: n */
    public final int f3353n;

    /* JADX INFO: renamed from: o */
    public final boolean f3354o;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentState$a */
    public class C0926a implements Parcelable.Creator<FragmentState> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FragmentState(ComponentCallbacksC0929c componentCallbacksC0929c) {
        this.f3340a = componentCallbacksC0929c.getClass().getName();
        this.f3341b = componentCallbacksC0929c.f3443f;
        this.f3342c = componentCallbacksC0929c.f3453p;
        this.f3343d = componentCallbacksC0929c.f3455r;
        this.f3344e = componentCallbacksC0929c.f3463z;
        this.f3345f = componentCallbacksC0929c.f3408A;
        this.f3346g = componentCallbacksC0929c.f3409B;
        this.f3347h = componentCallbacksC0929c.f3412E;
        this.f3348i = componentCallbacksC0929c.f3450m;
        this.f3349j = componentCallbacksC0929c.f3411D;
        this.f3350k = componentCallbacksC0929c.f3410C;
        this.f3351l = componentCallbacksC0929c.f3428U.ordinal();
        this.f3352m = componentCallbacksC0929c.f3446i;
        this.f3353n = componentCallbacksC0929c.f3447j;
        this.f3354o = componentCallbacksC0929c.f3420M;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC0929c m4500a(@NonNull C0931e c0931e, @NonNull ClassLoader classLoader) {
        ComponentCallbacksC0929c componentCallbacksC0929cMo4483a = c0931e.mo4483a(classLoader, this.f3340a);
        componentCallbacksC0929cMo4483a.f3443f = this.f3341b;
        componentCallbacksC0929cMo4483a.f3453p = this.f3342c;
        componentCallbacksC0929cMo4483a.f3455r = this.f3343d;
        componentCallbacksC0929cMo4483a.f3456s = true;
        componentCallbacksC0929cMo4483a.f3463z = this.f3344e;
        componentCallbacksC0929cMo4483a.f3408A = this.f3345f;
        componentCallbacksC0929cMo4483a.f3409B = this.f3346g;
        componentCallbacksC0929cMo4483a.f3412E = this.f3347h;
        componentCallbacksC0929cMo4483a.f3450m = this.f3348i;
        componentCallbacksC0929cMo4483a.f3411D = this.f3349j;
        componentCallbacksC0929cMo4483a.f3410C = this.f3350k;
        componentCallbacksC0929cMo4483a.f3428U = AbstractC0966l.b.values()[this.f3351l];
        componentCallbacksC0929cMo4483a.f3446i = this.f3352m;
        componentCallbacksC0929cMo4483a.f3447j = this.f3353n;
        componentCallbacksC0929cMo4483a.f3420M = this.f3354o;
        return componentCallbacksC0929cMo4483a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3340a);
        sb2.append(" (");
        sb2.append(this.f3341b);
        sb2.append(")}:");
        if (this.f3342c) {
            sb2.append(" fromLayout");
        }
        if (this.f3343d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f3345f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3345f));
        }
        String str = this.f3346g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3346g);
        }
        if (this.f3347h) {
            sb2.append(" retainInstance");
        }
        if (this.f3348i) {
            sb2.append(" removing");
        }
        if (this.f3349j) {
            sb2.append(" detached");
        }
        if (this.f3350k) {
            sb2.append(" hidden");
        }
        if (this.f3352m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f3352m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f3353n);
        }
        if (this.f3354o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3340a);
        parcel.writeString(this.f3341b);
        parcel.writeInt(this.f3342c ? 1 : 0);
        parcel.writeInt(this.f3343d ? 1 : 0);
        parcel.writeInt(this.f3344e);
        parcel.writeInt(this.f3345f);
        parcel.writeString(this.f3346g);
        parcel.writeInt(this.f3347h ? 1 : 0);
        parcel.writeInt(this.f3348i ? 1 : 0);
        parcel.writeInt(this.f3349j ? 1 : 0);
        parcel.writeInt(this.f3350k ? 1 : 0);
        parcel.writeInt(this.f3351l);
        parcel.writeString(this.f3352m);
        parcel.writeInt(this.f3353n);
        parcel.writeInt(this.f3354o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f3340a = parcel.readString();
        this.f3341b = parcel.readString();
        this.f3342c = parcel.readInt() != 0;
        this.f3343d = parcel.readInt() != 0;
        this.f3344e = parcel.readInt();
        this.f3345f = parcel.readInt();
        this.f3346g = parcel.readString();
        this.f3347h = parcel.readInt() != 0;
        this.f3348i = parcel.readInt() != 0;
        this.f3349j = parcel.readInt() != 0;
        this.f3350k = parcel.readInt() != 0;
        this.f3351l = parcel.readInt();
        this.f3352m = parcel.readString();
        this.f3353n = parcel.readInt();
        this.f3354o = parcel.readInt() != 0;
    }
}
