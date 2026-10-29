package k6;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o6.SourceFetchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, d2 = {"Lk6/h;", "", "", "Lp6/d;", "interceptors", "Lkotlin/Pair;", "Lr6/c;", "Lhu/c;", "mappers", "Lq6/c;", "keyers", "Lkotlin/Function0;", "Lo6/j$a;", "lazyFetcherFactories", "Lm6/i$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lx6/p;", "options", "j", "(Ljava/lang/Object;Lx6/p;)Ljava/lang/Object;", "Lk6/s;", "imageLoader", "", "startIndex", "Lo6/j;", "m", "(Ljava/lang/Object;Lx6/p;Lk6/s;I)Lkotlin/Pair;", "Lo6/o;", "result", "Lm6/i;", "l", "(Lo6/o;Lx6/p;Lk6/s;I)Lkotlin/Pair;", "Lk6/h$a;", "k", "()Lk6/h$a;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "i", "c", "h", "d", "e", "f", "Ljt/h;", "fetcherFactories", "decoderFactories", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<p6.d> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<r6.c<? extends Object, ? extends Object>, hu.c<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<q6.c<? extends Object>, hu.c<? extends Object>>> keyers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends Pair<? extends o6.j.a<? extends Object>, ? extends hu.c<? extends Object>>>>> lazyFetcherFactories;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends m6.i.a>>> lazyDecoderFactories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h fetcherFactories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h decoderFactories;

    public /* synthetic */ h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public static final List c(h hVar) {
        List<? extends Function0<? extends List<? extends m6.i.a>>> list = hVar.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            kotlin.collections.u.z(arrayList, list.get(i10).invoke());
        }
        hVar.lazyDecoderFactories = kotlin.collections.p.k();
        return arrayList;
    }

    public static final List d(h hVar) {
        List<? extends Function0<? extends List<? extends Pair<? extends o6.j.a<? extends Object>, ? extends hu.c<? extends Object>>>>> list = hVar.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            kotlin.collections.u.z(arrayList, list.get(i10).invoke());
        }
        hVar.lazyFetcherFactories = kotlin.collections.p.k();
        return arrayList;
    }

    @NotNull
    public final List<m6.i.a> e() {
        return (List) this.decoderFactories.getValue();
    }

    @NotNull
    public final List<Pair<o6.j.a<? extends Object>, hu.c<? extends Object>>> f() {
        return (List) this.fetcherFactories.getValue();
    }

    @NotNull
    public final List<p6.d> g() {
        return this.interceptors;
    }

    @NotNull
    public final List<Pair<q6.c<? extends Object>, hu.c<? extends Object>>> h() {
        return this.keyers;
    }

    @NotNull
    public final List<Pair<r6.c<? extends Object, ? extends Object>, hu.c<? extends Object>>> i() {
        return this.mappers;
    }

    @NotNull
    public final Object j(@NotNull Object data, @NotNull Options options) {
        List<Pair<r6.c<? extends Object, ? extends Object>, hu.c<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<r6.c<? extends Object, ? extends Object>, hu.c<? extends Object>> pair = list.get(i10);
            r6.c<? extends Object, ? extends Object> cVarA = pair.a();
            if (pair.b().b(data)) {
                Intrinsics.d(cVarA, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objA = cVarA.a(data, options);
                if (objA != null) {
                    data = objA;
                }
            }
        }
        return data;
    }

    @NotNull
    public final a k() {
        return new a(this);
    }

    @Nullable
    public final Pair<m6.i, Integer> l(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull s imageLoader, int startIndex) {
        int size = e().size();
        while (startIndex < size) {
            m6.i iVarA = e().get(startIndex).a(result, options, imageLoader);
            if (iVarA != null) {
                return jt.s.a(iVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @Nullable
    public final Pair<o6.j, Integer> m(@NotNull Object data, @NotNull Options options, @NotNull s imageLoader, int startIndex) {
        int size = f().size();
        while (startIndex < size) {
            Pair<o6.j.a<? extends Object>, hu.c<? extends Object>> pair = f().get(startIndex);
            o6.j.a<? extends Object> aVarA = pair.a();
            if (pair.b().b(data)) {
                Intrinsics.d(aVarA, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                o6.j jVarA = aVarA.a(data, options, imageLoader);
                if (jVarA != null) {
                    return jt.s.a(jVarA, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends p6.d> list, List<? extends Pair<? extends r6.c<? extends Object, ? extends Object>, ? extends hu.c<? extends Object>>> list2, List<? extends Pair<? extends q6.c<? extends Object>, ? extends hu.c<? extends Object>>> list3, List<? extends Function0<? extends List<? extends Pair<? extends o6.j.a<? extends Object>, ? extends hu.c<? extends Object>>>>> list4, List<? extends Function0<? extends List<? extends m6.i.a>>> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        this.fetcherFactories = jt.i.b(new Function0() { // from class: k6.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.d(this.f22177a);
            }
        });
        this.decoderFactories = jt.i.b(new Function0() { // from class: k6.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.c(this.f22178a);
            }
        });
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00002.\u0010\u0017\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R@\u0010-\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R<\u00100\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)RH\u00103\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)¨\u00067"}, d2 = {"Lk6/h$a;", "", "<init>", "()V", "Lk6/h;", "registry", "(Lk6/h;)V", "Lp6/d;", "interceptor", "i", "(Lp6/d;)Lk6/h$a;", "T", "Lr6/c;", "mapper", "Lhu/c;", Payload.TYPE, "k", "(Lr6/c;Lhu/c;)Lk6/h$a;", "Lq6/c;", "keyer", "j", "(Lq6/c;Lhu/c;)Lk6/h$a;", "Lo6/j$a;", "factory", "h", "(Lo6/j$a;Lhu/c;)Lk6/h$a;", "Lkotlin/Function0;", "", "Lkotlin/Pair;", "o", "(Lkotlin/jvm/functions/Function0;)Lk6/h$a;", "Lm6/i$a;", "g", "(Lm6/i$a;)Lk6/h$a;", "n", "p", "()Lk6/h;", "", "a", "Ljava/util/List;", "getInterceptors$coil_core_release", "()Ljava/util/List;", "interceptors", "b", "getMappers$coil_core_release", "mappers", "c", "getKeyers$coil_core_release", "keyers", "d", "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<p6.d> interceptors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<r6.c<? extends Object, ?>, hu.c<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Pair<q6.c<? extends Object>, hu.c<? extends Object>>> keyers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Function0<List<Pair<o6.j.a<? extends Object>, hu.c<? extends Object>>>>> lazyFetcherFactories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Function0<List<m6.i.a>>> lazyDecoderFactories;

        public a() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.lazyFetcherFactories = new ArrayList();
            this.lazyDecoderFactories = new ArrayList();
        }

        public static final List e(Pair pair) {
            return kotlin.collections.o.d(pair);
        }

        public static final List f(m6.i.a aVar) {
            return kotlin.collections.o.d(aVar);
        }

        public static final List l(m6.i.a aVar) {
            return kotlin.collections.o.d(aVar);
        }

        public static final List m(o6.j.a aVar, hu.c cVar) {
            return kotlin.collections.o.d(jt.s.a(aVar, cVar));
        }

        @NotNull
        public final a g(@NotNull final m6.i.a factory) {
            this.lazyDecoderFactories.add(new Function0() { // from class: k6.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.a.l(factory);
                }
            });
            return this;
        }

        @NotNull
        public final <T> a h(@NotNull final o6.j.a<T> factory, @NotNull final hu.c<T> type) {
            this.lazyFetcherFactories.add(new Function0() { // from class: k6.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.a.m(factory, type);
                }
            });
            return this;
        }

        @NotNull
        public final a i(@NotNull p6.d interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final <T> a j(@NotNull q6.c<T> keyer, @NotNull hu.c<T> type) {
            this.keyers.add(jt.s.a(keyer, type));
            return this;
        }

        @NotNull
        public final <T> a k(@NotNull r6.c<T, ?> mapper, @NotNull hu.c<T> type) {
            this.mappers.add(jt.s.a(mapper, type));
            return this;
        }

        @NotNull
        public final a n(@NotNull Function0<? extends List<? extends m6.i.a>> factory) {
            this.lazyDecoderFactories.add(factory);
            return this;
        }

        @NotNull
        public final a o(@NotNull Function0<? extends List<? extends Pair<? extends o6.j.a<? extends Object>, ? extends hu.c<? extends Object>>>> factory) {
            this.lazyFetcherFactories.add(factory);
            return this;
        }

        @NotNull
        public final h p() {
            return new h(e7.d.c(this.interceptors), e7.d.c(this.mappers), e7.d.c(this.keyers), e7.d.c(this.lazyFetcherFactories), e7.d.c(this.lazyDecoderFactories), null);
        }

        @NotNull
        public final List<Function0<List<m6.i.a>>> q() {
            return this.lazyDecoderFactories;
        }

        @NotNull
        public final List<Function0<List<Pair<o6.j.a<? extends Object>, hu.c<? extends Object>>>>> r() {
            return this.lazyFetcherFactories;
        }

        public a(@NotNull h hVar) {
            this.interceptors = CollectionsKt.O0(hVar.g());
            this.mappers = CollectionsKt.O0(hVar.i());
            this.keyers = CollectionsKt.O0(hVar.h());
            List<Pair<o6.j.a<? extends Object>, hu.c<? extends Object>>> listF = hVar.f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                arrayList.add(new Function0() { // from class: k6.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.e(pair);
                    }
                });
            }
            this.lazyFetcherFactories = arrayList;
            List<m6.i.a> listE = hVar.e();
            ArrayList arrayList2 = new ArrayList();
            for (final m6.i.a aVar : listE) {
                arrayList2.add(new Function0() { // from class: k6.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.f(aVar);
                    }
                });
            }
            this.lazyDecoderFactories = arrayList2;
        }
    }

    public h() {
        this(kotlin.collections.p.k(), kotlin.collections.p.k(), kotlin.collections.p.k(), kotlin.collections.p.k(), kotlin.collections.p.k());
    }
}
