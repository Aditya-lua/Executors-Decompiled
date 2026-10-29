package p035c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1494a extends IInterface {

    /* JADX INFO: renamed from: l */
    public static final String f5773l = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* JADX INFO: renamed from: c.a$a */
    public static abstract class a extends Binder implements InterfaceC1494a {
        public a() {
            attachInterface(this, InterfaceC1494a.f5773l);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1494a.f5773l;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    mo7622L1(parcel.readInt(), (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    mo7628m0(parcel.readString(), (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    mo7625g2((Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    mo7624c2(parcel.readString(), (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    mo7626j2(parcel.readInt(), (Uri) b.m7635c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleMo7623M = mo7623M(parcel.readString(), (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.m7636d(parcel2, bundleMo7623M, 1);
                    return true;
                case 8:
                    mo7631w1(parcel.readInt(), parcel.readInt(), (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    mo7629p0((Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    mo7632z(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    mo7627l1((Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    mo7630q1((Bundle) b.m7635c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: renamed from: c.a$b */
    public static class b {
        /* JADX INFO: renamed from: c */
        public static <T> T m7635c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static <T extends Parcelable> void m7636d(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    /* JADX INFO: renamed from: L1 */
    void mo7622L1(int i10, Bundle bundle);

    /* JADX INFO: renamed from: M */
    Bundle mo7623M(String str, Bundle bundle);

    /* JADX INFO: renamed from: c2 */
    void mo7624c2(String str, Bundle bundle);

    /* JADX INFO: renamed from: g2 */
    void mo7625g2(Bundle bundle);

    /* JADX INFO: renamed from: j2 */
    void mo7626j2(int i10, Uri uri, boolean z10, Bundle bundle);

    /* JADX INFO: renamed from: l1 */
    void mo7627l1(Bundle bundle);

    /* JADX INFO: renamed from: m0 */
    void mo7628m0(String str, Bundle bundle);

    /* JADX INFO: renamed from: p0 */
    void mo7629p0(Bundle bundle);

    /* JADX INFO: renamed from: q1 */
    void mo7630q1(Bundle bundle);

    /* JADX INFO: renamed from: w1 */
    void mo7631w1(int i10, int i11, Bundle bundle);

    /* JADX INFO: renamed from: z */
    void mo7632z(int i10, int i11, int i12, int i13, int i14, Bundle bundle);
}
