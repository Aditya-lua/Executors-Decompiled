package e9;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface t extends IInterface {
    void C1(Status status);

    void T(GoogleSignInAccount googleSignInAccount, Status status);

    void v1(Status status);
}
