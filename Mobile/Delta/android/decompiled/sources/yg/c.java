package yg;

import android.content.Context;
import fv.e;
import org.webrtc.voiceengine.AppAudioManagerBase;

/* JADX INFO: loaded from: classes2.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppAudioManagerBase f36690a;

    public c(Context context) {
        this.f36690a = e.g(context);
    }

    @Override // yg.a
    public void a() {
        this.f36690a.dispose();
    }

    @Override // yg.a
    public void b(j.b bVar) {
        this.f36690a.setActivityForPermissionRequest(bVar);
    }
}
