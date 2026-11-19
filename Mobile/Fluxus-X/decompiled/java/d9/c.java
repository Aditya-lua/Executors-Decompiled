package d9;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import l9.p;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f11981a;
    public final GoogleSignInAccount b;

    public GoogleSignInAccount a() {
        return this.b;
    }

    @Override // l9.p
    @NonNull
    public Status n() {
        return this.f11981a;
    }
}
