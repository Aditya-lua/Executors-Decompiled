package rb;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends cb.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // cb.b
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                cb.c.b(parcel);
                break;
            case 4:
                cb.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                cb.c.b(parcel);
                break;
            case 7:
                cb.c.b(parcel);
                break;
            case 8:
                l lVar = (l) cb.c.a(parcel, l.CREATOR);
                cb.c.b(parcel);
                o0(lVar);
                break;
            case 9:
                cb.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
