package p318o1;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p296n0.C8782k3;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8855z1;

/* JADX INFO: renamed from: o1.e */
/* JADX INFO: loaded from: classes.dex */
public class C9625e implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8855z1 f34910c;

    /* JADX INFO: renamed from: d */
    public final C8782k3 f34911d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, InterfaceC8721a2> f34912e = new HashMap();

    public C9625e(InterfaceC8855z1 interfaceC8855z1, C8782k3 c8782k3) {
        this.f34910c = interfaceC8855z1;
        this.f34911d = c8782k3;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC8721a2.c m37984d(InterfaceC8721a2.c cVar, Size size) {
        return InterfaceC8721a2.c.m34987a(cVar.mo34991e(), cVar.mo34995i(), cVar.mo34989c(), cVar.mo34992f(), size.getWidth(), size.getHeight(), cVar.mo34996j(), cVar.mo34988b(), cVar.mo34990d(), cVar.mo34993g());
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC8721a2 m37985f(int i10) {
        InterfaceC8721a2 interfaceC8721a2M37986c;
        if (this.f34912e.containsKey(Integer.valueOf(i10))) {
            return this.f34912e.get(Integer.valueOf(i10));
        }
        if (this.f34910c.mo27503a(i10)) {
            InterfaceC8721a2 interfaceC8721a2Mo27504b = this.f34910c.mo27504b(i10);
            Objects.requireNonNull(interfaceC8721a2Mo27504b);
            interfaceC8721a2M37986c = interfaceC8721a2Mo27504b;
            Size sizeM37987e = m37987e(i10);
            if (sizeM37987e != null) {
                interfaceC8721a2M37986c = m37986c(interfaceC8721a2M37986c, sizeM37987e);
            }
        } else {
            interfaceC8721a2M37986c = null;
        }
        this.f34912e.put(Integer.valueOf(i10), interfaceC8721a2M37986c);
        return interfaceC8721a2M37986c;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return this.f34910c.mo27503a(i10) && m37985f(i10) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        return m37985f(i10);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC8721a2 m37986c(InterfaceC8721a2 interfaceC8721a2, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8721a2.c> it = interfaceC8721a2.mo27490b().iterator();
        while (it.hasNext()) {
            arrayList.add(m37984d(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC8721a2.b.m34986h(interfaceC8721a2.mo27489a(), interfaceC8721a2.mo27491e(), interfaceC8721a2.mo27492f(), arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final Size m37987e(int i10) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f34911d.m35235c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.m2339g(i10);
            }
        }
        return null;
    }
}
