package m9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class y implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb.k f23090a;
    public final /* synthetic */ z b;

    public y(z zVar, tb.k kVar) {
        this.b = zVar;
        this.f23090a = kVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.b.b.remove(this.f23090a);
    }
}
