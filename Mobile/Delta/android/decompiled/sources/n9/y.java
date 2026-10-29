package n9;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f25306a;
    public final /* synthetic */ Activity b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25307c;

    public y(Intent intent, Activity activity, int i10) {
        this.f25306a = intent;
        this.b = activity;
        this.f25307c = i10;
    }

    @Override // n9.a0
    public final void a() {
        Intent intent = this.f25306a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.f25307c);
        }
    }
}
