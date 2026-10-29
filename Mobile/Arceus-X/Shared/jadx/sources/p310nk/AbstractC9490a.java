package p310nk;

import android.content.Context;
import com.roblox.engine.jni.NativeGLInterface;
import p107el.C5160a;
import p151gk.C6124q;

/* JADX INFO: renamed from: nk.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9490a {

    /* JADX INFO: renamed from: a */
    public Context f34096a;

    /* JADX INFO: renamed from: b */
    public C9491b f34097b;

    /* JADX INFO: renamed from: c */
    public a f34098c;

    /* JADX INFO: renamed from: nk.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f34099a;
    }

    public AbstractC9490a(Context context, a aVar) {
        this.f34096a = context;
        this.f34098c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m37379a(int i10, int i11, int i12, int i13, int i14) {
        C6124q.m27064i("rbx.glview.layout", "doUpdateAppUISizes() vw:" + i10 + " status:" + i11 + " tbh:" + i12 + " bm:" + i13 + " rm:" + i14);
        NativeGLInterface.updateAppUISizes(i10, i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: b */
    public abstract C9491b mo37380b();

    /* JADX INFO: renamed from: c */
    public void m37381c(C9491b c9491b, boolean z10) {
        AbstractC9490a abstractC9490a;
        C9491b c9491b2;
        if (c9491b != null && (z10 || (c9491b2 = this.f34097b) == null || !c9491b2.equals(c9491b))) {
            this.f34097b = c9491b;
            try {
                float fM24001e = C5160a.m24001e(this.f34096a);
                int iM37384f = m37384f(c9491b.f34101a.right, fM24001e);
                int iM37384f2 = m37384f(c9491b.f34106f, fM24001e);
                int i10 = c9491b.f34105e;
                if (i10 > 0) {
                    abstractC9490a = this;
                    abstractC9490a.m37383e(true, 0, iM37384f2, iM37384f, m37384f(i10, fM24001e));
                } else {
                    abstractC9490a = this;
                    abstractC9490a.m37383e(false, 0, iM37384f2, iM37384f, 0);
                }
                if (m37385g()) {
                    return;
                }
                int iM37384f3 = m37384f(c9491b.f34103c, fM24001e);
                int iM37384f4 = m37384f(c9491b.f34107g, fM24001e);
                int iM37384f5 = m37384f(c9491b.f34104d, fM24001e);
                a aVar = abstractC9490a.f34098c;
                abstractC9490a.m37379a(iM37384f, iM37384f4, aVar != null ? aVar.f34099a : 0, iM37384f3, iM37384f5);
            } catch (Exception e10) {
                C6124q.m27060e("rbx.glview.layout", "onGlobalLayout() exception:" + e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m37382d(boolean z10) {
        m37381c(mo37380b(), z10);
    }

    /* JADX INFO: renamed from: e */
    public void m37383e(boolean z10, int i10, int i11, int i12, int i13) {
        C6124q.m27064i("rbx.glview.layout", "onUpdateKeyboardSize() v:" + z10 + " x:" + i10 + " y:" + i11 + " w:" + i12 + " h:" + i13);
        NativeGLInterface.updateKeyboardSize(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: f */
    public final int m37384f(int i10, float f10) {
        return (int) (((double) (i10 / f10)) + 0.5d);
    }

    /* JADX INFO: renamed from: g */
    public boolean m37385g() {
        return false;
    }
}
