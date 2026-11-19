package jo;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitSet f20823a;

    /* JADX INFO: renamed from: jo.a$a, reason: collision with other inner class name */
    public static class C0388a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitSet f20824a;

        public a b() {
            return new a(this);
        }

        public C0388a c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f20824a.set(c10);
            return this;
        }

        public C0388a d(char c10, char c11) {
            while (c10 <= c11) {
                c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }

        public C0388a(BitSet bitSet) {
            this.f20824a = bitSet;
        }
    }

    public static C0388a b() {
        return new C0388a(new BitSet());
    }

    @Override // jo.c
    public boolean a(char c10) {
        return this.f20823a.get(c10);
    }

    public C0388a c() {
        return new C0388a((BitSet) this.f20823a.clone());
    }

    public a(C0388a c0388a) {
        this.f20823a = c0388a.f20824a;
    }
}
