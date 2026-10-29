package p063d0;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p296n0.C8782k3;
import p589z.InterfaceC13537h5;

/* JADX INFO: renamed from: d0.h */
/* JADX INFO: loaded from: classes.dex */
public class C4377h {

    /* JADX INFO: renamed from: a */
    public final CaptureSessionOnClosedNotCalledQuirk f18229a;

    /* JADX INFO: renamed from: d0.h$a */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo22037a(InterfaceC13537h5 interfaceC13537h5);
    }

    public C4377h(C8782k3 c8782k3) {
        this.f18229a = (CaptureSessionOnClosedNotCalledQuirk) c8782k3.m35234b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m22033a(Set<InterfaceC13537h5> set) {
        for (InterfaceC13537h5 interfaceC13537h5 : set) {
            interfaceC13537h5.mo49410b().mo49427r(interfaceC13537h5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22034b(Set<InterfaceC13537h5> set) {
        for (InterfaceC13537h5 interfaceC13537h5 : set) {
            interfaceC13537h5.mo49410b().mo49428s(interfaceC13537h5);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m22035c(InterfaceC13537h5 interfaceC13537h5, List<InterfaceC13537h5> list, List<InterfaceC13537h5> list2, a aVar) {
        InterfaceC13537h5 next;
        InterfaceC13537h5 next2;
        if (m22036d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<InterfaceC13537h5> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != interfaceC13537h5) {
                linkedHashSet.add(next2);
            }
            m22034b(linkedHashSet);
        }
        aVar.mo22037a(interfaceC13537h5);
        if (m22036d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<InterfaceC13537h5> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != interfaceC13537h5) {
                linkedHashSet2.add(next);
            }
            m22033a(linkedHashSet2);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m22036d() {
        return this.f18229a != null;
    }
}
