package p072d9;

import android.os.Parcel;
import p572ya.BinderC13162s;

/* JADX INFO: renamed from: d9.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4488p extends BinderC13162s implements InterfaceC4489q {
    public AbstractBinderC4488p() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p572ya.BinderC13162s
    /* JADX INFO: renamed from: r2 */
    public final boolean mo22446r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            mo22447E();
        } else {
            if (i10 != 2) {
                return false;
            }
            mo22448t();
        }
        return true;
    }
}
