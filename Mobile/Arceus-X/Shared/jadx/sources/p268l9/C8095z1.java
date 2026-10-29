package p268l9;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p074db.HandlerC4534p;
import p504w1.C12277a;

/* JADX INFO: renamed from: l9.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8095z1 {

    /* JADX INFO: renamed from: a */
    public final Map f30133a = Collections.synchronizedMap(new C12277a());

    /* JADX INFO: renamed from: b */
    public int f30134b = 0;

    /* JADX INFO: renamed from: c */
    public Bundle f30135c;

    /* JADX INFO: renamed from: a */
    public final C8042i m33304a(String str, Class cls) {
        return (C8042i) cls.cast(this.f30133a.get(str));
    }

    /* JADX INFO: renamed from: b */
    public final void m33305b(String str, C8042i c8042i) {
        Map map = this.f30133a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, c8042i);
        if (this.f30134b > 0) {
            new HandlerC4534p(Looper.getMainLooper()).post(new RunnableC8092y1(this, c8042i, str));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33306c(Bundle bundle) {
        this.f30134b = 1;
        this.f30135c = bundle;
        for (Map.Entry entry : this.f30133a.entrySet()) {
            ((C8042i) entry.getValue()).mo33180f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m33307d() {
        this.f30134b = 2;
        Iterator it = this.f30133a.values().iterator();
        while (it.hasNext()) {
            ((C8042i) it.next()).mo33105j();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m33308e() {
        this.f30134b = 3;
        Iterator it = this.f30133a.values().iterator();
        while (it.hasNext()) {
            ((C8042i) it.next()).mo33104h();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33309f(int i10, int i11, Intent intent) {
        Iterator it = this.f30133a.values().iterator();
        while (it.hasNext()) {
            ((C8042i) it.next()).mo33179e(i10, i11, intent);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m33310g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f30133a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((C8042i) entry.getValue()).mo33182i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m33311h() {
        this.f30134b = 4;
        Iterator it = this.f30133a.values().iterator();
        while (it.hasNext()) {
            ((C8042i) it.next()).mo33106k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m33312i() {
        this.f30134b = 5;
        Iterator it = this.f30133a.values().iterator();
        while (it.hasNext()) {
            ((C8042i) it.next()).m33181g();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m33313j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f30133a.values().iterator();
        while (it.hasNext()) {
            ((C8042i) it.next()).m33177a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int m33314k() {
        return this.f30134b;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Bundle m33315l() {
        return this.f30135c;
    }
}
