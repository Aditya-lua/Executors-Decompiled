package n9;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26127a;
    public final /* synthetic */ Activity b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26128c;

    public y(Intent intent, Activity activity, int i10) {
        this.f26127a = intent;
        this.b = activity;
        this.f26128c = i10;
    }

    @Override // n9.a0
    public final void a() {
        Intent intent = this.f26127a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.f26128c);
        }
    }
}
