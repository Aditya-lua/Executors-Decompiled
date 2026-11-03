package tn;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitSet f32474a;

    /* JADX INFO: renamed from: tn.a$a, reason: collision with other inner class name */
    public static class C0583a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitSet f32475a;

        public a b() {
            return new a(this);
        }

        public C0583a c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f32475a.set(c10);
            return this;
        }

        public C0583a d(char c10, char c11) {
            while (c10 <= c11) {
                c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }

        public C0583a(BitSet bitSet) {
            this.f32475a = bitSet;
        }
    }

    public static C0583a b() {
        return new C0583a(new BitSet());
    }

    @Override // tn.c
    public boolean a(char c10) {
        return this.f32474a.get(c10);
    }

    public C0583a c() {
        return new C0583a((BitSet) this.f32474a.clone());
    }

    public a(C0583a c0583a) {
        this.f32474a = c0583a.f32475a;
    }
}
