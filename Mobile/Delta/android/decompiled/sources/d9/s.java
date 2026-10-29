package d9;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface s extends IInterface {
    void A1(Status status);

    void Z(GoogleSignInAccount googleSignInAccount, Status status);

    void r1(Status status);
}
