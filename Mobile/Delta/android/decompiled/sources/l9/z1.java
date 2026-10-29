package l9;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23110a = Collections.synchronizedMap(new w1.a());
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f23111c;

    public final i a(String str, Class cls) {
        return (i) cls.cast(this.f23110a.get(str));
    }

    public final void b(String str, i iVar) {
        Map map = this.f23110a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, iVar);
        if (this.b > 0) {
            new db.p(Looper.getMainLooper()).post(new y1(this, iVar, str));
        }
    }

    public final void c(Bundle bundle) {
        this.b = 1;
        this.f23111c = bundle;
        for (Map.Entry entry : this.f23110a.entrySet()) {
            ((i) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void d() {
        this.b = 2;
        Iterator it = this.f23110a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).j();
        }
    }

    public final void e() {
        this.b = 3;
        Iterator it = this.f23110a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).h();
        }
    }

    public final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f23110a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).e(i10, i11, intent);
        }
    }

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f23110a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((i) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void h() {
        this.b = 4;
        Iterator it = this.f23110a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }

    public final void i() {
        this.b = 5;
        Iterator it = this.f23110a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).g();
        }
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f23110a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int k() {
        return this.b;
    }

    public final /* synthetic */ Bundle l() {
        return this.f23111c;
    }
}
