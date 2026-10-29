package p161h6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p146g6.C6045y;
import p256ku.AbstractC7888l0;
import p256ku.C7931v1;

/* JADX INFO: renamed from: h6.c */
/* JADX INFO: loaded from: classes.dex */
public class C6293c implements InterfaceC6292b {

    /* JADX INFO: renamed from: a */
    public final C6045y f23874a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7888l0 f23875b;

    /* JADX INFO: renamed from: c */
    public final Handler f23876c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final Executor f23877d = new a();

    /* JADX INFO: renamed from: h6.c$a */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C6293c.this.f23876c.post(runnable);
        }
    }

    public C6293c(Executor executor) {
        C6045y c6045y = new C6045y(executor);
        this.f23874a = c6045y;
        this.f23875b = C7931v1.m32925b(c6045y);
    }

    @Override // p161h6.InterfaceC6292b
    /* JADX INFO: renamed from: a */
    public Executor mo27570a() {
        return this.f23877d;
    }

    @Override // p161h6.InterfaceC6292b
    /* JADX INFO: renamed from: b */
    public AbstractC7888l0 mo27571b() {
        return this.f23875b;
    }

    /* JADX DEBUG: Method merged with bridge method: c()Lh6/a; */
    @Override // p161h6.InterfaceC6292b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C6045y mo27572c() {
        return this.f23874a;
    }
}
