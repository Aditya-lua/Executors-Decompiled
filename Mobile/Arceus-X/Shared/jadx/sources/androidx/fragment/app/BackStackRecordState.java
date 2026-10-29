package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0904a();

    /* JADX INFO: renamed from: a */
    public final int[] f3239a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> f3240b;

    /* JADX INFO: renamed from: c */
    public final int[] f3241c;

    /* JADX INFO: renamed from: d */
    public final int[] f3242d;

    /* JADX INFO: renamed from: e */
    public final int f3243e;

    /* JADX INFO: renamed from: f */
    public final String f3244f;

    /* JADX INFO: renamed from: g */
    public final int f3245g;

    /* JADX INFO: renamed from: h */
    public final int f3246h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f3247i;

    /* JADX INFO: renamed from: j */
    public final int f3248j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f3249k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<String> f3250l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<String> f3251m;

    /* JADX INFO: renamed from: n */
    public final boolean f3252n;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C0904a implements Parcelable.Creator<BackStackRecordState> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BackStackRecordState(C0927a c0927a) {
        int size = c0927a.f3523c.size();
        this.f3239a = new int[size * 6];
        if (!c0927a.f3529i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3240b = new ArrayList<>(size);
        this.f3241c = new int[size];
        this.f3242d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC0934h.a aVar = c0927a.f3523c.get(i11);
            int i12 = i10 + 1;
            this.f3239a[i10] = aVar.f3540a;
            ArrayList<String> arrayList = this.f3240b;
            ComponentCallbacksC0929c componentCallbacksC0929c = aVar.f3541b;
            arrayList.add(componentCallbacksC0929c != null ? componentCallbacksC0929c.f3443f : null);
            int[] iArr = this.f3239a;
            iArr[i12] = aVar.f3542c ? 1 : 0;
            iArr[i10 + 2] = aVar.f3543d;
            iArr[i10 + 3] = aVar.f3544e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f3545f;
            i10 += 6;
            iArr[i13] = aVar.f3546g;
            this.f3241c[i11] = aVar.f3547h.ordinal();
            this.f3242d[i11] = aVar.f3548i.ordinal();
        }
        this.f3243e = c0927a.f3528h;
        this.f3244f = c0927a.f3531k;
        this.f3245g = c0927a.f3357v;
        this.f3246h = c0927a.f3532l;
        this.f3247i = c0927a.f3533m;
        this.f3248j = c0927a.f3534n;
        this.f3249k = c0927a.f3535o;
        this.f3250l = c0927a.f3536p;
        this.f3251m = c0927a.f3537q;
        this.f3252n = c0927a.f3538r;
    }

    /* JADX INFO: renamed from: a */
    public final void m4340a(@NonNull C0927a c0927a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f3239a.length) {
                c0927a.f3528h = this.f3243e;
                c0927a.f3531k = this.f3244f;
                c0927a.f3529i = true;
                c0927a.f3532l = this.f3246h;
                c0927a.f3533m = this.f3247i;
                c0927a.f3534n = this.f3248j;
                c0927a.f3535o = this.f3249k;
                c0927a.f3536p = this.f3250l;
                c0927a.f3537q = this.f3251m;
                c0927a.f3538r = this.f3252n;
                return;
            }
            AbstractC0934h.a aVar = new AbstractC0934h.a();
            int i12 = i10 + 1;
            aVar.f3540a = this.f3239a[i10];
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0927a + " op #" + i11 + " base fragment #" + this.f3239a[i12]);
            }
            aVar.f3547h = AbstractC0966l.b.values()[this.f3241c[i11]];
            aVar.f3548i = AbstractC0966l.b.values()[this.f3242d[i11]];
            int[] iArr = this.f3239a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f3542c = z10;
            int i14 = iArr[i13];
            aVar.f3543d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f3544e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f3545f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f3546g = i18;
            c0927a.f3524d = i14;
            c0927a.f3525e = i15;
            c0927a.f3526f = i17;
            c0927a.f3527g = i18;
            c0927a.m4778e(aVar);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C0927a m4341f(@NonNull FragmentManager fragmentManager) {
        C0927a c0927a = new C0927a(fragmentManager);
        m4340a(c0927a);
        c0927a.f3357v = this.f3245g;
        for (int i10 = 0; i10 < this.f3240b.size(); i10++) {
            String str = this.f3240b.get(i10);
            if (str != null) {
                c0927a.f3523c.get(i10).f3541b = fragmentManager.m4435k0(str);
            }
        }
        c0927a.m4515u(1);
        return c0927a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3239a);
        parcel.writeStringList(this.f3240b);
        parcel.writeIntArray(this.f3241c);
        parcel.writeIntArray(this.f3242d);
        parcel.writeInt(this.f3243e);
        parcel.writeString(this.f3244f);
        parcel.writeInt(this.f3245g);
        parcel.writeInt(this.f3246h);
        TextUtils.writeToParcel(this.f3247i, parcel, 0);
        parcel.writeInt(this.f3248j);
        TextUtils.writeToParcel(this.f3249k, parcel, 0);
        parcel.writeStringList(this.f3250l);
        parcel.writeStringList(this.f3251m);
        parcel.writeInt(this.f3252n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f3239a = parcel.createIntArray();
        this.f3240b = parcel.createStringArrayList();
        this.f3241c = parcel.createIntArray();
        this.f3242d = parcel.createIntArray();
        this.f3243e = parcel.readInt();
        this.f3244f = parcel.readString();
        this.f3245g = parcel.readInt();
        this.f3246h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3247i = (CharSequence) creator.createFromParcel(parcel);
        this.f3248j = parcel.readInt();
        this.f3249k = (CharSequence) creator.createFromParcel(parcel);
        this.f3250l = parcel.createStringArrayList();
        this.f3251m = parcel.createStringArrayList();
        this.f3252n = parcel.readInt() != 0;
    }
}
