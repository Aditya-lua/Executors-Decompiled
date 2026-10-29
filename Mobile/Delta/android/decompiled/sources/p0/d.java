package p0;

import android.os.Build;
import android.util.CloseGuard;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28058a;

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CloseGuard f28059a = new CloseGuard();

        @Override // p0.d.b
        public void a(String str) {
            this.f28059a.open(str);
        }

        @Override // p0.d.b
        public void b() {
            this.f28059a.warnIfOpen();
        }

        @Override // p0.d.b
        public void close() {
            this.f28059a.close();
        }
    }

    public interface b {
        void a(String str);

        void b();

        void close();
    }

    public static final class c implements b {
        @Override // p0.d.b
        public void a(String str) {
            x2.g.h(str, "CloseMethodName must not be null.");
        }

        @Override // p0.d.b
        public void b() {
        }

        @Override // p0.d.b
        public void close() {
        }
    }

    public d(b bVar) {
        this.f28058a = bVar;
    }

    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public void a() {
        this.f28058a.close();
    }

    public void c(String str) {
        this.f28058a.a(str);
    }

    public void d() {
        this.f28058a.b();
    }
}
