package p296n0;

import java.util.Collection;
import ne.InterfaceFutureC9440x;
import p140g0.AbstractC5952w2;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5909m;
import p140g0.InterfaceC5937t;

/* JADX INFO: renamed from: n0.p0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8804p0 extends InterfaceC5905l, AbstractC5952w2.c {

    /* JADX INFO: renamed from: n0.p0$a */
    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* JADX INFO: renamed from: a */
        public final boolean f32030a;

        a(boolean z10) {
            this.f32030a = z10;
        }

        /* JADX INFO: renamed from: b */
        public boolean m35369b() {
            return this.f32030a;
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceFutureC9440x<Void> mo6692a();

    /* JADX INFO: renamed from: b */
    InterfaceC8722a3<a> mo6693b();

    @Override // p140g0.InterfaceC5905l
    /* JADX INFO: renamed from: c */
    default InterfaceC5909m mo22073c() {
        return mo6694e();
    }

    @Override // p140g0.InterfaceC5905l
    /* JADX INFO: renamed from: d */
    default InterfaceC5937t mo22074d() {
        return mo6698k();
    }

    /* JADX INFO: renamed from: e */
    InterfaceC8784l0 mo6694e();

    /* JADX INFO: renamed from: f */
    default InterfaceC8761h0 mo35082f() {
        return C8779k0.m35231a();
    }

    /* JADX INFO: renamed from: h */
    default void mo35083h(boolean z10) {
    }

    /* JADX INFO: renamed from: i */
    void mo6696i(Collection<AbstractC5952w2> collection);

    /* JADX INFO: renamed from: j */
    void mo6697j(Collection<AbstractC5952w2> collection);

    /* JADX INFO: renamed from: k */
    InterfaceC8799o0 mo6698k();

    /* JADX INFO: renamed from: l */
    default boolean mo35084l() {
        return mo22074d().mo26583i() == 0;
    }

    /* JADX INFO: renamed from: o */
    default void mo35085o(InterfaceC8761h0 interfaceC8761h0) {
    }

    /* JADX INFO: renamed from: p */
    default void mo35367p() {
    }

    /* JADX INFO: renamed from: q */
    default boolean mo6701q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    default void mo35086r(boolean z10) {
    }
}
