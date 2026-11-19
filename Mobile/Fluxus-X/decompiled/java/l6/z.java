package l6;

import av.m0;
import av.p0;
import av.q0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf7/u;", "logger", "Lav/p0;", "c", "(Lf7/u;)Lav/p0;", "Ll6/h$a;", "Ll6/w$a;", "options", "f", "(Ll6/h$a;Ll6/w$a;)Ll6/h$a;", "e", "(Ll6/h$a;)Ll6/h$a;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"l6/z$a", "Lkotlin/coroutines/a;", "Lav/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "exception", BuildConfig.FLAVOR, "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends p001kotlin.coroutines.a implements m0 {
        public final /* synthetic */ f7.u b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0.Companion companion, f7.u uVar) {
            super(companion);
            this.b = uVar;
        }

        @Override // av.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            f7.u uVar = this.b;
            if (uVar != null) {
                f7.v.a(uVar, "RealImageLoader", exception);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return cu.a.a(Integer.valueOf(((f7.j) t10).priority()), Integer.valueOf(((f7.j) t8).priority()));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return cu.a.a(Integer.valueOf(((f7.g) t10).priority()), Integer.valueOf(((f7.g) t8).priority()));
        }
    }

    public static final p0 c(f7.u uVar) {
        return q0.a(z2.b(null, 1, null).plus(new a(m0.INSTANCE, uVar)));
    }

    @NotNull
    public static final h.a e(@NotNull h.a aVar) {
        return aVar.k(new s6.f(), p001kotlin.jvm.internal.d0.b(String.class)).k(new s6.d(), p001kotlin.jvm.internal.d0.b(ew.b0.class)).j(new r6.b(), p001kotlin.jvm.internal.d0.b(h0.class)).j(new r6.d(), p001kotlin.jvm.internal.d0.b(h0.class)).h(new p6.k.a(), p001kotlin.jvm.internal.d0.b(h0.class)).h(new p6.c.a(), p001kotlin.jvm.internal.d0.b(byte[].class)).h(new p6.g.b(), p001kotlin.jvm.internal.d0.b(h0.class));
    }

    @NotNull
    public static final h.a f(@NotNull h.a aVar, @NotNull w.Options options) {
        if (t.a(options)) {
            aVar.o(new Function0() { // from class: l6.x
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.g();
                }
            });
            aVar.n(new Function0() { // from class: l6.y
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.h();
                }
            });
        }
        return aVar;
    }

    public static final List g() {
        xu.c cVarType;
        List listF0 = CollectionsKt.F0(f7.c0.f15639a.f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listF0.size();
        for (int i10 = 0; i10 < size; i10++) {
            f7.j jVar = (f7.j) listF0.get(i10);
            Intrinsics.d(jVar, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            p6.j.a aVarA = jVar.a();
            Pair pairA = null;
            if (aVarA != null && (cVarType = jVar.type()) != null) {
                pairA = zt.s.a(aVarA, cVarType);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return arrayList;
    }

    public static final List h() {
        List listF0 = CollectionsKt.F0(f7.c0.f15639a.e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = listF0.size();
        for (int i10 = 0; i10 < size; i10++) {
            n6.i.a aVarA = ((f7.g) listF0.get(i10)).a();
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }
}
