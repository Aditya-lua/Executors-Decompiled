package dh;

import android.os.Handler;
import android.os.Message;
import com.google.mlkit.common.MlKitException;
import ek.q;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14777a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vector<a> f14778c = new Vector<>();

    public interface a {
        void start();
    }

    public d(String str) {
        this.f14777a = str;
    }

    public void a(a aVar) {
        this.f14778c.add(aVar);
        this.b++;
    }

    public abstract void b();

    public void c() {
        Iterator<a> it = this.f14778c.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    public void d(String str) {
        sendMessage(obtainMessage(MlKitException.CODE_SCANNER_UNAVAILABLE, str));
    }

    public void e() {
        sendMessage(obtainMessage(100));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 100 && this.b > 0) {
            q.i("rbx.execute", "MTCH.handleMessage() group:" + this.f14777a + " START size:" + this.b);
            c();
        } else if (i10 == 200) {
            this.b--;
            q.i("rbx.execute", "MTCH.handleMessage() task:" + message.obj + " COMPLETE size:" + this.b);
        }
        if (this.b <= 0) {
            q.i("rbx.execute", "MTCH.handleMessage() group:" + this.f14777a + " complete");
            b();
        }
    }
}
