package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import sb.C11264k;

/* JADX INFO: renamed from: l9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C8090y implements OnCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f30124a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8093z f30125b;

    public C8090y(C8093z c8093z, C11264k c11264k) {
        this.f30125b = c8093z;
        this.f30124a = c11264k;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f30125b.f30131b.remove(this.f30124a);
    }
}
