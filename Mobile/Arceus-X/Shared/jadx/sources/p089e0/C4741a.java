package p089e0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0013f;
import p001a0.C0034p0;
import p114f0.C5229h;
import p140g0.C5923p1;
import p140g0.C5931r1;
import p140g0.InterfaceC5937t;
import p155h0.InterfaceC6259a;
import p296n0.C8768i1;
import p589z.C13654x2;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public class C4741a implements InterfaceC6259a {

    /* JADX INFO: renamed from: b */
    public final C0034p0 f19274b;

    /* JADX INFO: renamed from: a */
    public final Object f19273a = new Object();

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> f19276d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Set<Set<String>> f19277e = new HashSet();

    /* JADX INFO: renamed from: f */
    public List<InterfaceC5937t> f19278f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f19279g = 0;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC6259a.a> f19275c = new ArrayList();

    public C4741a(C0034p0 c0034p0) {
        this.f19274b = c0034p0;
        try {
            mo23117f(Arrays.asList(c0034p0.m65d()));
        } catch (C0013f | C8768i1 e10) {
            C5931r1.m26564d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e10);
        }
    }

    @Override // p155h0.InterfaceC6259a
    /* JADX INFO: renamed from: c */
    public void mo23114c(InterfaceC6259a.a aVar) {
        synchronized (this.f19273a) {
            this.f19275c.add(aVar);
        }
    }

    @Override // p155h0.InterfaceC6259a
    /* JADX INFO: renamed from: d */
    public String mo23115d(String str) {
        synchronized (this.f19273a) {
            try {
                if (!this.f19276d.containsKey(str)) {
                    return null;
                }
                List<String> list = this.f19276d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator<InterfaceC5937t> it = this.f19278f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(C5229h.m24208a(it.next()).m24210c())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p155h0.InterfaceC6259a
    /* JADX INFO: renamed from: e */
    public int mo23116e() {
        int i10;
        synchronized (this.f19273a) {
            i10 = this.f19279g;
        }
        return i10;
    }

    @Override // p296n0.InterfaceC8786l2
    /* JADX INFO: renamed from: f */
    public void mo23117f(List<String> list) throws C8768i1 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set<String> set : this.f19274b.m66e()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (C13654x2.m49735a(this.f19274b, str) && C13654x2.m49735a(this.f19274b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (C5923p1 unused) {
                            C5931r1.m26561a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f19273a) {
                this.f19276d = map;
                this.f19277e = hashSet;
                C5931r1.m26561a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f19276d);
            }
        } catch (C0013f e10) {
            throw new C8768i1("Failed to retrieve concurrent camera id info.", e10);
        }
    }

    @Override // p155h0.InterfaceC6259a
    /* JADX INFO: renamed from: h */
    public void mo23118h(int i10) {
        synchronized (this.f19273a) {
            try {
                int i11 = this.f19279g;
                if (i10 == i11) {
                    return;
                }
                this.f19279g = i10;
                ArrayList arrayList = new ArrayList(this.f19275c);
                if (i11 == 2 && i10 != 2) {
                    this.f19278f.clear();
                }
                m23119i(arrayList, i11, i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m23119i(List<InterfaceC6259a.a> list, int i10, int i11) {
        Iterator<InterfaceC6259a.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo27488a(i10, i11);
        }
    }

    @Override // p155h0.InterfaceC6259a
    public void shutdown() {
        synchronized (this.f19273a) {
            this.f19275c.clear();
            this.f19276d.clear();
            this.f19278f.clear();
            this.f19277e.clear();
            this.f19279g = 0;
        }
    }
}
