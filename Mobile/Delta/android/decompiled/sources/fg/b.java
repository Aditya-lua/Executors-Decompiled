package fg;

import com.google.firebase.messaging.i0;
import uf.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final b b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.a f17267a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fg.a f17268a = null;

        public b a() {
            return new b(this.f17268a);
        }

        public a b(fg.a aVar) {
            this.f17268a = aVar;
            return this;
        }
    }

    public b(fg.a aVar) {
        this.f17267a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public fg.a a() {
        return this.f17267a;
    }

    public byte[] c() {
        return i0.a(this);
    }
}
