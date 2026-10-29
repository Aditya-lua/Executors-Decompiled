package vn;

import java.util.BitSet;

/* JADX INFO: renamed from: vn.a */
/* JADX INFO: loaded from: classes3.dex */
public class C12233a implements InterfaceC12235c {

    /* JADX INFO: renamed from: a */
    public final BitSet f43165a;

    /* JADX INFO: renamed from: vn.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final BitSet f43166a;

        /* JADX INFO: renamed from: b */
        public C12233a m45374b() {
            return new C12233a(this);
        }

        /* JADX INFO: renamed from: c */
        public a m45375c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f43166a.set(c10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m45376d(char c10, char c11) {
            while (c10 <= c11) {
                m45375c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(BitSet bitSet) {
            this.f43166a = bitSet;
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m45370b() {
        return new a(new BitSet());
    }

    @Override // vn.InterfaceC12235c
    /* JADX INFO: renamed from: a */
    public boolean mo45371a(char c10) {
        return this.f43165a.get(c10);
    }

    /* JADX INFO: renamed from: c */
    public a m45372c() {
        return new a((BitSet) this.f43165a.clone());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12233a(a aVar) {
        this.f43165a = aVar.f43166a;
    }
}
