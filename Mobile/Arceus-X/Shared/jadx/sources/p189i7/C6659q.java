package p189i7;

import java.util.Collections;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.q */
/* JADX INFO: loaded from: classes3.dex */
public class C6659q<K, A> extends AbstractC6643a<K, A> {

    /* JADX INFO: renamed from: i */
    public final A f25690i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6659q(C11552c<A> c11552c) {
        this(c11552c, null);
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: c */
    public float mo28663c() {
        return 1.0f;
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: h */
    public A mo28668h() {
        C11552c<A> c11552c = this.f25627e;
        A a10 = this.f25690i;
        return c11552c.m43195b(0.0f, 0.0f, a10, a10, m28666f(), m28666f(), m28666f());
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: i */
    public A mo28669i(C11550a<K> c11550a, float f10) {
        return mo28668h();
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: l */
    public void mo28672l() {
        if (this.f25627e != null) {
            super.mo28672l();
        }
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: n */
    public void mo28674n(float f10) {
        this.f25626d = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6659q(C11552c<A> c11552c, A a10) {
        super(Collections.EMPTY_LIST);
        m28675o(c11552c);
        this.f25690i = a10;
    }
}
