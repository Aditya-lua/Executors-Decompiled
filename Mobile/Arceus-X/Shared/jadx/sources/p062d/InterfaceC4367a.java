package p062d;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: d.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4367a extends IInterface {

    /* JADX INFO: renamed from: n */
    public static final String f18220n = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: d.a$a */
    public static abstract class a extends Binder implements InterfaceC4367a {

        /* JADX INFO: renamed from: d.a$a$a, reason: collision with other inner class name */
        public static class C14156a implements InterfaceC4367a {

            /* JADX INFO: renamed from: a */
            public IBinder f18221a;

            public C14156a(IBinder iBinder) {
                this.f18221a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18221a;
            }

            @Override // p062d.InterfaceC4367a
            /* JADX INFO: renamed from: i2 */
            public void mo22019i2(String str, int i10, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC4367a.f18220n);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    b.m22022b(parcelObtain, notification, 0);
                    this.f18221a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: r2 */
        public static InterfaceC4367a m22020r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4367a.f18220n);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4367a)) ? new C14156a(iBinder) : (InterfaceC4367a) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: d.a$b */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static <T extends Parcelable> void m22022b(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    /* JADX INFO: renamed from: i2 */
    void mo22019i2(String str, int i10, String str2, Notification notification);
}
