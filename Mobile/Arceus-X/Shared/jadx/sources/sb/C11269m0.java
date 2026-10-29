package sb;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p268l9.C8042i;
import p268l9.InterfaceC8045j;

/* JADX INFO: renamed from: sb.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11269m0 extends C8042i {

    /* JADX INFO: renamed from: b */
    public final List f39583b;

    public C11269m0(InterfaceC8045j interfaceC8045j) {
        super(interfaceC8045j);
        this.f39583b = new ArrayList();
        this.f30023a.mo33114g("TaskOnStopCallback", this);
    }

    /* JADX INFO: renamed from: l */
    public static C11269m0 m42341l(Activity activity) {
        C11269m0 c11269m0;
        InterfaceC8045j interfaceC8045jM33175c = C8042i.m33175c(activity);
        synchronized (interfaceC8045jM33175c) {
            try {
                c11269m0 = (C11269m0) interfaceC8045jM33175c.mo33112d("TaskOnStopCallback", C11269m0.class);
                if (c11269m0 == null) {
                    c11269m0 = new C11269m0(interfaceC8045jM33175c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11269m0;
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: k */
    public final void mo33106k() {
        synchronized (this.f39583b) {
            try {
                Iterator it = this.f39583b.iterator();
                while (it.hasNext()) {
                    InterfaceC11259h0 interfaceC11259h0 = (InterfaceC11259h0) ((WeakReference) it.next()).get();
                    if (interfaceC11259h0 != null) {
                        interfaceC11259h0.zzc();
                    }
                }
                this.f39583b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m42342m(InterfaceC11259h0 interfaceC11259h0) {
        synchronized (this.f39583b) {
            this.f39583b.add(new WeakReference(interfaceC11259h0));
        }
    }
}
