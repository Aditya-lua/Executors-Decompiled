package eg;

import com.google.firebase.messaging.i0;
import tf.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final b b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eg.a f15513a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public eg.a f15514a = null;

        public b a() {
            return new b(this.f15514a);
        }

        public a b(eg.a aVar) {
            this.f15514a = aVar;
            return this;
        }
    }

    public b(eg.a aVar) {
        this.f15513a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public eg.a a() {
        return this.f15513a;
    }

    public byte[] c() {
        return i0.a(this);
    }
}
