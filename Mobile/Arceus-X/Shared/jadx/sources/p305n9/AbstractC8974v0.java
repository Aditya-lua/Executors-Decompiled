package p305n9;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: n9.v0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8974v0 {

    /* JADX INFO: renamed from: a */
    public Object f32639a;

    /* JADX INFO: renamed from: b */
    public boolean f32640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC8923c f32641c;

    public AbstractC8974v0(AbstractC8923c abstractC8923c, Object obj) {
        Objects.requireNonNull(abstractC8923c);
        this.f32641c = abstractC8923c;
        this.f32639a = obj;
        this.f32640b = false;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo36032a(Object obj);

    /* JADX INFO: renamed from: b */
    public final void m36075b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f32639a;
                if (this.f32640b) {
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
            mo36032a(obj);
        }
        synchronized (this) {
            this.f32640b = true;
        }
        m36076c();
    }

    /* JADX INFO: renamed from: c */
    public final void m36076c() {
        m36077d();
        AbstractC8923c abstractC8923c = this.f32641c;
        synchronized (abstractC8923c.zzj()) {
            abstractC8923c.zzj().remove(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36077d() {
        synchronized (this) {
            this.f32639a = null;
        }
    }
}
