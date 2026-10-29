package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f8203e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f8204a = new Object();

    @NonNull
    public final Handler b = new Handler(Looper.getMainLooper(), new C0123a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f8205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f8206d;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0123a implements Handler.Callback {
        public C0123a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a(int i10);

        void show();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<b> f8208a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8209c;

        public c(int i10, b bVar) {
            this.f8208a = new WeakReference<>(bVar);
            this.b = i10;
        }

        public boolean a(b bVar) {
            return bVar != null && this.f8208a.get() == bVar;
        }
    }

    public static a c() {
        if (f8203e == null) {
            f8203e = new a();
        }
        return f8203e;
    }

    public final boolean a(@NonNull c cVar, int i10) {
        b bVar = cVar.f8208a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    public void b(b bVar, int i10) {
        synchronized (this.f8204a) {
            try {
                if (f(bVar)) {
                    a(this.f8205c, i10);
                } else if (g(bVar)) {
                    a(this.f8206d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(@NonNull c cVar) {
        synchronized (this.f8204a) {
            try {
                if (this.f8205c == cVar || this.f8206d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f8204a) {
            try {
                z10 = f(bVar) || g(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final boolean f(b bVar) {
        c cVar = this.f8205c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.f8206d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.f8204a) {
            try {
                if (f(bVar)) {
                    this.f8205c = null;
                    if (this.f8206d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f8204a) {
            try {
                if (f(bVar)) {
                    l(this.f8205c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f8204a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8205c;
                    if (!cVar.f8209c) {
                        cVar.f8209c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f8204a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8205c;
                    if (cVar.f8209c) {
                        cVar.f8209c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(@NonNull c cVar) {
        int i10 = cVar.b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    public void m(int i10, b bVar) {
        synchronized (this.f8204a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8205c;
                    cVar.b = i10;
                    this.b.removeCallbacksAndMessages(cVar);
                    l(this.f8205c);
                    return;
                }
                if (g(bVar)) {
                    this.f8206d.b = i10;
                } else {
                    this.f8206d = new c(i10, bVar);
                }
                c cVar2 = this.f8205c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f8205c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        c cVar = this.f8206d;
        if (cVar != null) {
            this.f8205c = cVar;
            this.f8206d = null;
            b bVar = cVar.f8208a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f8205c = null;
            }
        }
    }
}
