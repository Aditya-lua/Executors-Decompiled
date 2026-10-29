package p103eh;

import android.os.Handler;
import android.os.Message;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.Vector;
import p151gk.C6124q;

/* JADX INFO: renamed from: eh.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractHandlerC5116d extends Handler {

    /* JADX INFO: renamed from: a */
    public String f19945a;

    /* JADX INFO: renamed from: b */
    public int f19946b = 0;

    /* JADX INFO: renamed from: c */
    public Vector<a> f19947c = new Vector<>();

    /* JADX INFO: renamed from: eh.d$a */
    public interface a {
        void start();
    }

    public AbstractHandlerC5116d(String str) {
        this.f19945a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m23872a(a aVar) {
        this.f19947c.add(aVar);
        this.f19946b++;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo23873b();

    /* JADX INFO: renamed from: c */
    public void m23874c() {
        Iterator<a> it = this.f19947c.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m23875d(String str) {
        sendMessage(obtainMessage(MlKitException.CODE_SCANNER_UNAVAILABLE, str));
    }

    /* JADX INFO: renamed from: e */
    public void m23876e() {
        sendMessage(obtainMessage(100));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 100 && this.f19946b > 0) {
            C6124q.m27064i("rbx.execute", "MTCH.handleMessage() group:" + this.f19945a + " START size:" + this.f19946b);
            m23874c();
        } else if (i10 == 200) {
            this.f19946b--;
            C6124q.m27064i("rbx.execute", "MTCH.handleMessage() task:" + message.obj + " COMPLETE size:" + this.f19946b);
        }
        if (this.f19946b <= 0) {
            C6124q.m27064i("rbx.execute", "MTCH.handleMessage() group:" + this.f19945a + " complete");
            mo23873b();
        }
    }
}
