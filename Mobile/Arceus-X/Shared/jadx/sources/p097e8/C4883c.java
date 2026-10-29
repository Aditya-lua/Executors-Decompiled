package p097e8;

import p466uf.InterfaceC11847c;
import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: e8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4883c {

    /* JADX INFO: renamed from: c */
    public static final C4883c f19594c = new a().m23522a();

    /* JADX INFO: renamed from: a */
    public final long f19595a;

    /* JADX INFO: renamed from: b */
    public final b f19596b;

    /* JADX INFO: renamed from: e8.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f19597a = 0;

        /* JADX INFO: renamed from: b */
        public b f19598b = b.REASON_UNKNOWN;

        /* JADX INFO: renamed from: a */
        public C4883c m23522a() {
            return new C4883c(this.f19597a, this.f19598b);
        }

        /* JADX INFO: renamed from: b */
        public a m23523b(long j10) {
            this.f19597a = j10;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m23524c(b bVar) {
            this.f19598b = bVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: e8.c$b */
    public enum b implements InterfaceC11847c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a */
        public final int f19607a;

        b(int i10) {
            this.f19607a = i10;
        }

        @Override // p466uf.InterfaceC11847c
        public int getNumber() {
            return this.f19607a;
        }
    }

    public C4883c(long j10, b bVar) {
        this.f19595a = j10;
        this.f19596b = bVar;
    }

    /* JADX INFO: renamed from: c */
    public static a m23519c() {
        return new a();
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: a */
    public long m23520a() {
        return this.f19595a;
    }

    @InterfaceC11848d(tag = 3)
    /* JADX INFO: renamed from: b */
    public b m23521b() {
        return this.f19596b;
    }
}
