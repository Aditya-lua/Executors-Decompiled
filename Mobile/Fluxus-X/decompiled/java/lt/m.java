package lt;

import androidx.annotation.NonNull;
import eo.d0;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends d0 {

    public interface a {
        void a(@NonNull m mVar, @NonNull eo.s sVar);

        void b(@NonNull m mVar, @NonNull eo.s sVar);
    }

    public interface b {
        @NonNull
        m a(@NonNull g gVar, @NonNull r rVar);

        @NonNull
        <N extends eo.s> b b(@NonNull Class<N> cls, c<? super N> cVar);
    }

    public interface c<N extends eo.s> {
        void a(@NonNull m mVar, @NonNull N n10);
    }

    void E(@NonNull eo.s sVar);

    @NonNull
    u builder();

    void c(int i10, Object obj);

    boolean d(@NonNull eo.s sVar);

    <N extends eo.s> void i(@NonNull N n10, int i10);

    @NonNull
    r k();

    int length();

    void n(@NonNull eo.s sVar);

    void s(@NonNull eo.s sVar);

    @NonNull
    g u();

    void v();

    void y();
}
