package o9;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26979a;
    public final /* synthetic */ m9.j b;

    public h0(Intent intent, m9.j jVar, int i10) {
        this.f26979a = intent;
        this.b = jVar;
    }

    @Override // o9.i0
    public final void a() {
        Intent intent = this.f26979a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
