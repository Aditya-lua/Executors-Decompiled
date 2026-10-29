package us;

import androidx.annotation.NonNull;
import p388qn.AbstractC10623s;
import p388qn.InterfaceC10608d0;

/* JADX INFO: renamed from: us.m */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC11947m extends InterfaceC10608d0 {

    /* JADX INFO: renamed from: us.m$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo44556a(@NonNull InterfaceC11947m interfaceC11947m, @NonNull AbstractC10623s abstractC10623s);

        /* JADX INFO: renamed from: b */
        void mo44557b(@NonNull InterfaceC11947m interfaceC11947m, @NonNull AbstractC10623s abstractC10623s);
    }

    /* JADX INFO: renamed from: us.m$b */
    public interface b {
        @NonNull
        /* JADX INFO: renamed from: a */
        <N extends AbstractC10623s> b mo44598a(@NonNull Class<N> cls, c<? super N> cVar);

        @NonNull
        /* JADX INFO: renamed from: b */
        InterfaceC11947m mo44599b(@NonNull C11941g c11941g, @NonNull InterfaceC11952r interfaceC11952r);
    }

    /* JADX INFO: renamed from: us.m$c */
    public interface c<N extends AbstractC10623s> {
        /* JADX INFO: renamed from: a */
        void mo44600a(@NonNull InterfaceC11947m interfaceC11947m, @NonNull N n10);
    }

    /* JADX INFO: renamed from: B */
    void mo44588B();

    /* JADX INFO: renamed from: D */
    void mo44589D(@NonNull AbstractC10623s abstractC10623s);

    @NonNull
    C11955u builder();

    /* JADX INFO: renamed from: c */
    boolean mo44590c(@NonNull AbstractC10623s abstractC10623s);

    /* JADX INFO: renamed from: d */
    void mo44591d(int i10, Object obj);

    /* JADX INFO: renamed from: h */
    void mo44592h(@NonNull AbstractC10623s abstractC10623s);

    /* JADX INFO: renamed from: k */
    <N extends AbstractC10623s> void mo44593k(@NonNull N n10, int i10);

    int length();

    @NonNull
    /* JADX INFO: renamed from: o */
    InterfaceC11952r mo44594o();

    /* JADX INFO: renamed from: t */
    void mo44595t(@NonNull AbstractC10623s abstractC10623s);

    @NonNull
    /* JADX INFO: renamed from: w */
    C11941g mo44596w();

    /* JADX INFO: renamed from: x */
    void mo44597x();
}
