package ma;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.Task;
import gb.x0;
import tb.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23097a;

    public a() {
        super(new x0(Looper.getMainLooper()));
        this.f23097a = new k();
    }

    public final Task a() {
        return this.f23097a.a();
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        Intent intent;
        super.onReceiveResult(i10, bundle);
        boolean z10 = i10 == -1;
        if (bundle == null || (intent = (Intent) bundle.getParcelable("resultData")) == null) {
            intent = new Intent();
        }
        this.f23097a.e(z10 ? c.a(intent) : c.b(intent));
    }
}
