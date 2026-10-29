package p268l9;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;
import p242k9.C7493c;
import p242k9.InterfaceC7497g;
import p504w1.C12277a;
import sb.C11264k;

/* JADX INFO: renamed from: l9.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8065p1 {

    /* JADX INFO: renamed from: d */
    public int f30079d;

    /* JADX INFO: renamed from: b */
    public final C12277a f30077b = new C12277a();

    /* JADX INFO: renamed from: c */
    public final C11264k f30078c = new C11264k();

    /* JADX INFO: renamed from: e */
    public boolean f30080e = false;

    /* JADX INFO: renamed from: a */
    public final C12277a f30076a = new C12277a();

    public C8065p1(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f30076a.put(((InterfaceC7497g) it.next()).mo31148u(), null);
        }
        this.f30079d = this.f30076a.keySet().size();
    }

    /* JADX INFO: renamed from: a */
    public final Task m33265a() {
        return this.f30078c.m42326a();
    }

    /* JADX INFO: renamed from: b */
    public final Set m33266b() {
        return this.f30076a.keySet();
    }

    /* JADX INFO: renamed from: c */
    public final void m33267c(C8021b c8021b, ConnectionResult connectionResult, String str) {
        this.f30076a.put(c8021b, connectionResult);
        this.f30077b.put(c8021b, str);
        this.f30079d--;
        if (!connectionResult.m9138A3()) {
            this.f30080e = true;
        }
        if (this.f30079d == 0) {
            if (!this.f30080e) {
                this.f30078c.m42328c(this.f30077b);
            } else {
                this.f30078c.m42327b(new C7493c(this.f30076a));
            }
        }
    }
}
