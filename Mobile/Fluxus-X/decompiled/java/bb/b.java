package bb;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l9.g implements f9.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.g f3847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f3848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a f3849m;

    static {
        l9.a.g gVar = new l9.a.g();
        f3847k = gVar;
        u uVar = new u();
        f3848l = uVar;
        f3849m = new l9.a("Blockstore.API", uVar, gVar);
    }

    public b(@NonNull Context context) {
        super(context, (l9.a<l9.a.d.c>) f3849m, l9.a.d.Oo, l9.g.a.f22012c);
    }

    @Override // f9.b
    public final Task<Boolean> a(final f9.c cVar) {
        o9.s.m(cVar, "DeleteBytesRequest cannot be null");
        return D(m9.u.c().d(c.f3855g).b(new m9.q() { // from class: bb.q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).t2(new x(this.f3862a, (tb.k) obj2), cVar);
            }
        }).c(false).e(1669).a());
    }

    @Override // f9.b
    public final Task<Integer> n(final f9.f fVar) {
        return D(m9.u.c().d(c.f3852d, c.f3854f).b(new m9.q() { // from class: bb.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).w2(new v(this.f3863a, (tb.k) obj2), fVar);
            }
        }).e(1645).c(false).a());
    }

    @Override // f9.b
    public final Task<Boolean> r() {
        return z(m9.u.c().d(c.f3853e).b(new m9.q() { // from class: bb.s
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).u2(new y(this.f3864a, (tb.k) obj2));
            }
        }).c(false).e(1651).a());
    }

    @Override // f9.b
    public final Task<f9.e> t(final f9.d dVar) {
        o9.s.m(dVar, "RetrieveBytesRequest cannot be null");
        return z(m9.u.c().d(c.f3856h).b(new m9.q() { // from class: bb.t
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).getService()).v2(new w(this.f3865a, (tb.k) obj2), dVar);
            }
        }).c(false).e(1668).a());
    }
}
