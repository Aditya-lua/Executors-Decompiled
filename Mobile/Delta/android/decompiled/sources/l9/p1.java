package l9;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23468d;
    public final w1.a b = new w1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.k f23467c = new sb.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23469e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.a f23466a = new w1.a();

    public p1(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f23466a.put(((k9.g) it.next()).u(), null);
        }
        this.f23468d = this.f23466a.keySet().size();
    }

    public final Task a() {
        return this.f23467c.a();
    }

    public final Set b() {
        return this.f23466a.keySet();
    }

    public final void c(b bVar, ConnectionResult connectionResult, String str) {
        this.f23466a.put(bVar, connectionResult);
        this.b.put(bVar, str);
        this.f23468d--;
        if (!connectionResult.A3()) {
            this.f23469e = true;
        }
        if (this.f23468d == 0) {
            if (!this.f23469e) {
                this.f23467c.c(this.b);
            } else {
                this.f23467c.b(new k9.c(this.f23466a));
            }
        }
    }
}
