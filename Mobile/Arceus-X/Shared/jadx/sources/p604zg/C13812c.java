package p604zg;

import android.content.Context;
import org.webrtc.voiceengine.AppAudioManagerBase;
import p180hv.C6584e;
import p203j.ActivityC6992b;

/* JADX INFO: renamed from: zg.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13812c implements InterfaceC13810a {

    /* JADX INFO: renamed from: a */
    public final AppAudioManagerBase f48431a;

    public C13812c(Context context) {
        this.f48431a = C6584e.m28441g(context);
    }

    @Override // p604zg.InterfaceC13810a
    /* JADX INFO: renamed from: a */
    public void mo50291a() {
        this.f48431a.dispose();
    }

    @Override // p604zg.InterfaceC13810a
    /* JADX INFO: renamed from: b */
    public void mo50292b(ActivityC6992b activityC6992b) {
        this.f48431a.setActivityForPermissionRequest(activityC6992b);
    }
}
