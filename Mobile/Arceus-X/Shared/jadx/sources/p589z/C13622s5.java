package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001a0.C0005b;
import p001a0.C0009d;

/* JADX INFO: renamed from: z.s5 */
/* JADX INFO: loaded from: classes.dex */
public final class C13622s5 extends InterfaceC13537h5.c {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC13537h5.c> f47670a;

    public C13622s5(List<InterfaceC13537h5.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f47670a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC13537h5.c m49608x(InterfaceC13537h5.c... cVarArr) {
        return new C13622s5(Arrays.asList(cVarArr));
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: p */
    public void mo49425p(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49425p(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: q */
    public void mo49426q(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49426q(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: r */
    public void mo49427r(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49427r(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: s */
    public void mo49428s(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49428s(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: t */
    public void mo49429t(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49429t(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: u */
    public void mo49430u(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49430u(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: v */
    public void mo49431v(InterfaceC13537h5 interfaceC13537h5) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49431v(interfaceC13537h5);
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: w */
    public void mo49432w(InterfaceC13537h5 interfaceC13537h5, Surface surface) {
        Iterator<InterfaceC13537h5.c> it = this.f47670a.iterator();
        while (it.hasNext()) {
            it.next().mo49432w(interfaceC13537h5, surface);
        }
    }

    /* JADX INFO: renamed from: z.s5$a */
    public static class a extends InterfaceC13537h5.c {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.StateCallback f47671a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f47671a = stateCallback;
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: p */
        public void mo49425p(InterfaceC13537h5 interfaceC13537h5) {
            this.f47671a.onActive(interfaceC13537h5.mo49419n().m39d());
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: q */
        public void mo49426q(InterfaceC13537h5 interfaceC13537h5) {
            C0009d.m21a(this.f47671a, interfaceC13537h5.mo49419n().m39d());
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: r */
        public void mo49427r(InterfaceC13537h5 interfaceC13537h5) {
            this.f47671a.onClosed(interfaceC13537h5.mo49419n().m39d());
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: s */
        public void mo49428s(InterfaceC13537h5 interfaceC13537h5) {
            this.f47671a.onConfigureFailed(interfaceC13537h5.mo49419n().m39d());
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: t */
        public void mo49429t(InterfaceC13537h5 interfaceC13537h5) {
            this.f47671a.onConfigured(interfaceC13537h5.mo49419n().m39d());
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: u */
        public void mo49430u(InterfaceC13537h5 interfaceC13537h5) {
            this.f47671a.onReady(interfaceC13537h5.mo49419n().m39d());
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: v */
        public void mo49431v(InterfaceC13537h5 interfaceC13537h5) {
        }

        @Override // p589z.InterfaceC13537h5.c
        /* JADX INFO: renamed from: w */
        public void mo49432w(InterfaceC13537h5 interfaceC13537h5, Surface surface) {
            C0005b.m5a(this.f47671a, interfaceC13537h5.mo49419n().m39d(), surface);
        }

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(C13640v2.m49731a(list));
        }
    }
}
