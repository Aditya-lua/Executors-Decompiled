package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class y implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f23105a;
    public final /* synthetic */ z b;

    public y(z zVar, sb.k kVar) {
        this.b = zVar;
        this.f23105a = kVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.b.b.remove(this.f23105a);
    }
}
