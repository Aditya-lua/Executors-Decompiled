package p305n9;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: n9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C8979y extends AbstractDialogInterfaceOnClickListenerC8918a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Intent f32649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f32650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32651c;

    public C8979y(Intent intent, Activity activity, int i10) {
        this.f32649a = intent;
        this.f32650b = activity;
        this.f32651c = i10;
    }

    @Override // p305n9.AbstractDialogInterfaceOnClickListenerC8918a0
    /* JADX INFO: renamed from: a */
    public final void mo35954a() {
        Intent intent = this.f32649a;
        if (intent != null) {
            this.f32650b.startActivityForResult(intent, this.f32651c);
        }
    }
}
