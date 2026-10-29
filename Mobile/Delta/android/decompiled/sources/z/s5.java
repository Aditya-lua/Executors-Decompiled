package z;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends h5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h5.c> f36814a;

    public s5(List<h5.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f36814a = arrayList;
        arrayList.addAll(list);
    }

    public static h5.c x(h5.c... cVarArr) {
        return new s5(Arrays.asList(cVarArr));
    }

    @Override // z.h5.c
    public void p(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().p(h5Var);
        }
    }

    @Override // z.h5.c
    public void q(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().q(h5Var);
        }
    }

    @Override // z.h5.c
    public void r(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().r(h5Var);
        }
    }

    @Override // z.h5.c
    public void s(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().s(h5Var);
        }
    }

    @Override // z.h5.c
    public void t(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().t(h5Var);
        }
    }

    @Override // z.h5.c
    public void u(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().u(h5Var);
        }
    }

    @Override // z.h5.c
    public void v(h5 h5Var) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().v(h5Var);
        }
    }

    @Override // z.h5.c
    public void w(h5 h5Var, Surface surface) {
        Iterator<h5.c> it = this.f36814a.iterator();
        while (it.hasNext()) {
            it.next().w(h5Var, surface);
        }
    }

    public static class a extends h5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f36815a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f36815a = stateCallback;
        }

        @Override // z.h5.c
        public void p(h5 h5Var) {
            this.f36815a.onActive(h5Var.n().d());
        }

        @Override // z.h5.c
        public void q(h5 h5Var) {
            a0.d.a(this.f36815a, h5Var.n().d());
        }

        @Override // z.h5.c
        public void r(h5 h5Var) {
            this.f36815a.onClosed(h5Var.n().d());
        }

        @Override // z.h5.c
        public void s(h5 h5Var) {
            this.f36815a.onConfigureFailed(h5Var.n().d());
        }

        @Override // z.h5.c
        public void t(h5 h5Var) {
            this.f36815a.onConfigured(h5Var.n().d());
        }

        @Override // z.h5.c
        public void u(h5 h5Var) {
            this.f36815a.onReady(h5Var.n().d());
        }

        @Override // z.h5.c
        public void v(h5 h5Var) {
        }

        @Override // z.h5.c
        public void w(h5 h5Var, Surface surface) {
            a0.b.a(this.f36815a, h5Var.n().d(), surface);
        }

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(v2.a(list));
        }
    }
}
