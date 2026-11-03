package ss;

import androidx.annotation.NonNull;
import on.d0;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends d0 {

    public interface a {
        void a(@NonNull m mVar, @NonNull on.s sVar);

        void b(@NonNull m mVar, @NonNull on.s sVar);
    }

    public interface b {
        @NonNull
        m a(@NonNull g gVar, @NonNull r rVar);

        @NonNull
        <N extends on.s> b b(@NonNull Class<N> cls, c<? super N> cVar);
    }

    public interface c<N extends on.s> {
        void a(@NonNull m mVar, @NonNull N n10);
    }

    void a(@NonNull on.s sVar);

    void b(int i10, Object obj);

    @NonNull
    u builder();

    boolean d(@NonNull on.s sVar);

    void g(@NonNull on.s sVar);

    int length();

    @NonNull
    r n();

    <N extends on.s> void p(@NonNull N n10, int i10);

    void s(@NonNull on.s sVar);

    @NonNull
    g x();

    void y();

    void z();
}
