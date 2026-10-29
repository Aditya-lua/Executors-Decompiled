package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.material.snackbar.a */
/* JADX INFO: loaded from: classes2.dex */
public class C2850a {

    /* JADX INFO: renamed from: e */
    public static C2850a f10523e;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Object f10524a = new Object();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f10525b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c */
    public c f10526c;

    /* JADX INFO: renamed from: d */
    public c f10527d;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            C2850a.this.m13063d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo13031a(int i10);

        void show();
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final WeakReference<b> f10529a;

        /* JADX INFO: renamed from: b */
        public int f10530b;

        /* JADX INFO: renamed from: c */
        public boolean f10531c;

        public c(int i10, b bVar) {
            this.f10529a = new WeakReference<>(bVar);
            this.f10530b = i10;
        }

        /* JADX INFO: renamed from: a */
        public boolean m13074a(b bVar) {
            return bVar != null && this.f10529a.get() == bVar;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2850a m13060c() {
        if (f10523e == null) {
            f10523e = new C2850a();
        }
        return f10523e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13061a(@NonNull c cVar, int i10) {
        b bVar = cVar.f10529a.get();
        if (bVar == null) {
            return false;
        }
        this.f10525b.removeCallbacksAndMessages(cVar);
        bVar.mo13031a(i10);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m13062b(b bVar, int i10) {
        synchronized (this.f10524a) {
            try {
                if (m13065f(bVar)) {
                    m13061a(this.f10526c, i10);
                } else if (m13066g(bVar)) {
                    m13061a(this.f10527d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13063d(@NonNull c cVar) {
        synchronized (this.f10524a) {
            try {
                if (this.f10526c == cVar || this.f10527d == cVar) {
                    m13061a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m13064e(b bVar) {
        boolean z10;
        synchronized (this.f10524a) {
            try {
                z10 = m13065f(bVar) || m13066g(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13065f(b bVar) {
        c cVar = this.f10526c;
        return cVar != null && cVar.m13074a(bVar);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m13066g(b bVar) {
        c cVar = this.f10527d;
        return cVar != null && cVar.m13074a(bVar);
    }

    /* JADX INFO: renamed from: h */
    public void m13067h(b bVar) {
        synchronized (this.f10524a) {
            try {
                if (m13065f(bVar)) {
                    this.f10526c = null;
                    if (this.f10527d != null) {
                        m13073n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13068i(b bVar) {
        synchronized (this.f10524a) {
            try {
                if (m13065f(bVar)) {
                    m13071l(this.f10526c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m13069j(b bVar) {
        synchronized (this.f10524a) {
            try {
                if (m13065f(bVar)) {
                    c cVar = this.f10526c;
                    if (!cVar.f10531c) {
                        cVar.f10531c = true;
                        this.f10525b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13070k(b bVar) {
        synchronized (this.f10524a) {
            try {
                if (m13065f(bVar)) {
                    c cVar = this.f10526c;
                    if (cVar.f10531c) {
                        cVar.f10531c = false;
                        m13071l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13071l(@NonNull c cVar) {
        int i10 = cVar.f10530b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f10525b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f10525b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    /* JADX INFO: renamed from: m */
    public void m13072m(int i10, b bVar) {
        synchronized (this.f10524a) {
            try {
                if (m13065f(bVar)) {
                    c cVar = this.f10526c;
                    cVar.f10530b = i10;
                    this.f10525b.removeCallbacksAndMessages(cVar);
                    m13071l(this.f10526c);
                    return;
                }
                if (m13066g(bVar)) {
                    this.f10527d.f10530b = i10;
                } else {
                    this.f10527d = new c(i10, bVar);
                }
                c cVar2 = this.f10526c;
                if (cVar2 == null || !m13061a(cVar2, 4)) {
                    this.f10526c = null;
                    m13073n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13073n() {
        c cVar = this.f10527d;
        if (cVar != null) {
            this.f10526c = cVar;
            this.f10527d = null;
            b bVar = cVar.f10529a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f10526c = null;
            }
        }
    }
}
