package a3;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99a;

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f100a;

        public a(Object obj) {
            this.f100a = (InputContentInfo) obj;
        }

        @Override // a3.d.b
        public Object a() {
            return this.f100a;
        }

        @Override // a3.d.b
        public Uri b() {
            return this.f100a.getContentUri();
        }

        @Override // a3.d.b
        public void c() {
            this.f100a.requestPermission();
        }

        @Override // a3.d.b
        public Uri d() {
            return this.f100a.getLinkUri();
        }

        @Override // a3.d.b
        public ClipDescription getDescription() {
            return this.f100a.getDescription();
        }
    }

    public interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public d(b bVar) {
        this.f99a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f99a.b();
    }

    public ClipDescription b() {
        return this.f99a.getDescription();
    }

    public Uri c() {
        return this.f99a.d();
    }

    public void d() {
        this.f99a.c();
    }

    public Object e() {
        return this.f99a.a();
    }
}
