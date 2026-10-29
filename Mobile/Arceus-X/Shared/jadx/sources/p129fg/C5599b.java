package p129fg;

import com.google.firebase.messaging.AbstractC3001i0;
import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: fg.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5599b {

    /* JADX INFO: renamed from: b */
    public static final C5599b f21467b = new a().m25326a();

    /* JADX INFO: renamed from: a */
    public final C5598a f21468a;

    /* JADX INFO: renamed from: fg.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C5598a f21469a = null;

        /* JADX INFO: renamed from: a */
        public C5599b m25326a() {
            return new C5599b(this.f21469a);
        }

        /* JADX INFO: renamed from: b */
        public a m25327b(C5598a c5598a) {
            this.f21469a = c5598a;
            return this;
        }
    }

    public C5599b(C5598a c5598a) {
        this.f21468a = c5598a;
    }

    /* JADX INFO: renamed from: b */
    public static a m25323b() {
        return new a();
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: a */
    public C5598a m25324a() {
        return this.f21468a;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m25325c() {
        return AbstractC3001i0.m14600a(this);
    }
}
