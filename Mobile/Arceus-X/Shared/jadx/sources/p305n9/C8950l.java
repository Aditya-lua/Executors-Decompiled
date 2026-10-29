package p305n9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p242k9.AbstractC7499i;
import p242k9.InterfaceC7504n;
import sb.C11264k;

/* JADX INFO: renamed from: n9.l */
/* JADX INFO: loaded from: classes.dex */
public class C8950l {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC8942i0 f32619a = new C8933f0();

    /* JADX INFO: renamed from: n9.l$a */
    public interface a<R extends InterfaceC7504n, T> {
        /* JADX INFO: renamed from: a */
        T mo8184a(@NonNull R r8);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <R extends InterfaceC7504n, T> Task<T> m36030a(@NonNull AbstractC7499i<R> abstractC7499i, @NonNull a<R, T> aVar) {
        InterfaceC8942i0 interfaceC8942i0 = f32619a;
        C11264k c11264k = new C11264k();
        abstractC7499i.mo9171c(new C8936g0(abstractC7499i, c11264k, aVar, interfaceC8942i0));
        return c11264k.m42326a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <R extends InterfaceC7504n> Task<Void> m36031b(@NonNull AbstractC7499i<R> abstractC7499i) {
        return m36030a(abstractC7499i, new C8939h0());
    }
}
