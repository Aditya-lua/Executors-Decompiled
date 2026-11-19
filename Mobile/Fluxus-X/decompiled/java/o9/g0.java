package o9;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26960a;
    public final /* synthetic */ Activity b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26961c;

    public g0(Intent intent, Activity activity, int i10) {
        this.f26960a = intent;
        this.b = activity;
        this.f26961c = i10;
    }

    @Override // o9.i0
    public final void a() {
        Intent intent = this.f26960a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.f26961c);
        }
    }
}
