package d;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11608n = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0206a extends Binder implements a {

        /* JADX INFO: renamed from: d.a$a$a, reason: collision with other inner class name */
        public static class C0207a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11609a;

            public C0207a(IBinder iBinder) {
                this.f11609a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11609a;
            }

            @Override // d.a
            public void g2(String str, int i10, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f11608n);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f11609a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static a r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f11608n);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0207a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    void g2(String str, int i10, String str2, Notification notification);
}
