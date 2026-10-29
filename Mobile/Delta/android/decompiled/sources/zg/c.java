package zg;

import android.content.Context;
import hv.e;
import hv.k;
import org.webrtc.voiceengine.AppAudioManagerBase;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppAudioManagerBase f37619a;
    public final com.roblox.audio.a b;

    public c(Context context) {
        if (h.a().y3()) {
            this.b = k.q(context);
            this.f37619a = null;
        } else {
            this.b = null;
            this.f37619a = e.g(context);
        }
    }

    @Override // zg.a
    public void a() {
        if (h.a().y3()) {
            com.roblox.audio.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        AppAudioManagerBase appAudioManagerBase = this.f37619a;
        if (appAudioManagerBase != null) {
            appAudioManagerBase.dispose();
        }
    }

    @Override // zg.a
    public void b(j.b bVar) {
        if (h.a().y3()) {
            this.b.f(bVar);
        } else {
            this.f37619a.setActivityForPermissionRequest(bVar);
        }
    }
}
