package hg;

import com.google.firebase.messaging.i0;
import wf.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final b b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg.a f18253a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hg.a f18254a = null;

        public b a() {
            return new b(this.f18254a);
        }

        public a b(hg.a aVar) {
            this.f18254a = aVar;
            return this;
        }
    }

    public b(hg.a aVar) {
        this.f18253a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public hg.a a() {
        return this.f18253a;
    }

    public byte[] c() {
        return i0.a(this);
    }
}
