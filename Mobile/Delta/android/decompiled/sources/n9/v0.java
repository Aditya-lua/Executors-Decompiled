package n9;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25300a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f25301c;

    public v0(c cVar, Object obj) {
        Objects.requireNonNull(cVar);
        this.f25301c = cVar;
        this.f25300a = obj;
        this.b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f25300a;
                if (this.b) {
                    String string = toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        c();
    }

    public final void c() {
        d();
        c cVar = this.f25301c;
        synchronized (cVar.zzj()) {
            cVar.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f25300a = null;
        }
    }
}
