package p004a3;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: a3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0065d {

    /* JADX INFO: renamed from: a */
    public final b f138a;

    /* JADX INFO: renamed from: a3.d$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public final InputContentInfo f139a;

        public a(Object obj) {
            this.f139a = (InputContentInfo) obj;
        }

        @Override // p004a3.C0065d.b
        /* JADX INFO: renamed from: a */
        public Object mo147a() {
            return this.f139a;
        }

        @Override // p004a3.C0065d.b
        /* JADX INFO: renamed from: b */
        public Uri mo148b() {
            return this.f139a.getContentUri();
        }

        @Override // p004a3.C0065d.b
        /* JADX INFO: renamed from: c */
        public void mo149c() {
            this.f139a.requestPermission();
        }

        @Override // p004a3.C0065d.b
        /* JADX INFO: renamed from: d */
        public Uri mo150d() {
            return this.f139a.getLinkUri();
        }

        @Override // p004a3.C0065d.b
        public ClipDescription getDescription() {
            return this.f139a.getDescription();
        }
    }

    /* JADX INFO: renamed from: a3.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Object mo147a();

        /* JADX INFO: renamed from: b */
        Uri mo148b();

        /* JADX INFO: renamed from: c */
        void mo149c();

        /* JADX INFO: renamed from: d */
        Uri mo150d();

        ClipDescription getDescription();
    }

    public C0065d(b bVar) {
        this.f138a = bVar;
    }

    /* JADX INFO: renamed from: f */
    public static C0065d m141f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0065d(new a(obj));
    }

    /* JADX INFO: renamed from: a */
    public Uri m142a() {
        return this.f138a.mo148b();
    }

    /* JADX INFO: renamed from: b */
    public ClipDescription m143b() {
        return this.f138a.getDescription();
    }

    /* JADX INFO: renamed from: c */
    public Uri m144c() {
        return this.f138a.mo150d();
    }

    /* JADX INFO: renamed from: d */
    public void m145d() {
        this.f138a.mo149c();
    }

    /* JADX INFO: renamed from: e */
    public Object m146e() {
        return this.f138a.mo147a();
    }
}
