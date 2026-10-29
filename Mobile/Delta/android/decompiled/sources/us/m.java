package us;

import androidx.annotation.NonNull;
import qn.d0;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends d0 {

    public interface a {
        void a(@NonNull m mVar, @NonNull qn.s sVar);

        void b(@NonNull m mVar, @NonNull qn.s sVar);
    }

    public interface b {
        @NonNull
        <N extends qn.s> b a(@NonNull Class<N> cls, c<? super N> cVar);

        @NonNull
        m b(@NonNull g gVar, @NonNull r rVar);
    }

    public interface c<N extends qn.s> {
        void a(@NonNull m mVar, @NonNull N n10);
    }

    void B();

    void D(@NonNull qn.s sVar);

    @NonNull
    u builder();

    boolean c(@NonNull qn.s sVar);

    void d(int i10, Object obj);

    void h(@NonNull qn.s sVar);

    <N extends qn.s> void k(@NonNull N n10, int i10);

    int length();

    @NonNull
    r o();

    void t(@NonNull qn.s sVar);

    @NonNull
    g w();

    void x();
}
