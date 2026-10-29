package c9;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import k9.n;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f4670a;
    public final GoogleSignInAccount b;

    public GoogleSignInAccount a() {
        return this.b;
    }

    @Override // k9.n
    @NonNull
    public Status m() {
        return this.f4670a;
    }
}
