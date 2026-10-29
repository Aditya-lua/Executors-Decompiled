package p045c9;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p242k9.InterfaceC7504n;

/* JADX INFO: renamed from: c9.c */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C1570c implements InterfaceC7504n {

    /* JADX INFO: renamed from: a */
    public final Status f6278a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount f6279b;

    /* JADX INFO: renamed from: a */
    public GoogleSignInAccount m8182a() {
        return this.f6279b;
    }

    @Override // p242k9.InterfaceC7504n
    @NonNull
    /* JADX INFO: renamed from: m */
    public Status mo8183m() {
        return this.f6278a;
    }
}
