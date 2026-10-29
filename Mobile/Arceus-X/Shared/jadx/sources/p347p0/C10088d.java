package p347p0;

import android.os.Build;
import android.util.CloseGuard;
import p533x2.C12637g;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10088d {

    /* JADX INFO: renamed from: a */
    public final b f36324a;

    /* JADX INFO: renamed from: p0.d$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public final CloseGuard f36325a = new CloseGuard();

        @Override // p347p0.C10088d.b
        /* JADX INFO: renamed from: a */
        public void mo38908a(String str) {
            this.f36325a.open(str);
        }

        @Override // p347p0.C10088d.b
        /* JADX INFO: renamed from: b */
        public void mo38909b() {
            this.f36325a.warnIfOpen();
        }

        @Override // p347p0.C10088d.b
        public void close() {
            this.f36325a.close();
        }
    }

    /* JADX INFO: renamed from: p0.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo38908a(String str);

        /* JADX INFO: renamed from: b */
        void mo38909b();

        void close();
    }

    /* JADX INFO: renamed from: p0.d$c */
    public static final class c implements b {
        @Override // p347p0.C10088d.b
        /* JADX INFO: renamed from: a */
        public void mo38908a(String str) {
            C12637g.m47076h(str, "CloseMethodName must not be null.");
        }

        @Override // p347p0.C10088d.b
        /* JADX INFO: renamed from: b */
        public void mo38909b() {
        }

        @Override // p347p0.C10088d.b
        public void close() {
        }
    }

    public C10088d(b bVar) {
        this.f36324a = bVar;
    }

    /* JADX INFO: renamed from: b */
    public static C10088d m38904b() {
        return Build.VERSION.SDK_INT >= 30 ? new C10088d(new a()) : new C10088d(new c());
    }

    /* JADX INFO: renamed from: a */
    public void m38905a() {
        this.f36324a.close();
    }

    /* JADX INFO: renamed from: c */
    public void m38906c(String str) {
        this.f36324a.mo38908a(str);
    }

    /* JADX INFO: renamed from: d */
    public void m38907d() {
        this.f36324a.mo38909b();
    }
}
