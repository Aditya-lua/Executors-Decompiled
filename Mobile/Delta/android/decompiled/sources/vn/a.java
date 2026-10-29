package vn;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitSet f33338a;

    /* JADX INFO: renamed from: vn.a$a, reason: collision with other inner class name */
    public static class C0604a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitSet f33339a;

        public a b() {
            return new a(this);
        }

        public C0604a c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f33339a.set(c10);
            return this;
        }

        public C0604a d(char c10, char c11) {
            while (c10 <= c11) {
                c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }

        public C0604a(BitSet bitSet) {
            this.f33339a = bitSet;
        }
    }

    public static C0604a b() {
        return new C0604a(new BitSet());
    }

    @Override // vn.c
    public boolean a(char c10) {
        return this.f33338a.get(c10);
    }

    public C0604a c() {
        return new C0604a((BitSet) this.f33338a.clone());
    }

    public a(C0604a c0604a) {
        this.f33338a = c0604a.f33339a;
    }
}
