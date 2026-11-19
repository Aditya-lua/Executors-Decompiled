package l6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p6.SourceFetchResult;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, d2 = {"Ll6/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lq6/d;", "interceptors", "Lkotlin/Pair;", "Ls6/c;", "Lxu/c;", "mappers", "Lr6/c;", "keyers", "Lkotlin/Function0;", "Lp6/j$a;", "lazyFetcherFactories", "Ln6/i$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Ly6/p;", "options", "j", "(Ljava/lang/Object;Ly6/p;)Ljava/lang/Object;", "Ll6/s;", "imageLoader", BuildConfig.FLAVOR, "startIndex", "Lp6/j;", "m", "(Ljava/lang/Object;Ly6/p;Ll6/s;I)Lkotlin/Pair;", "Lp6/o;", "result", "Ln6/i;", "l", "(Lp6/o;Ly6/p;Ll6/s;I)Lkotlin/Pair;", "Ll6/h$a;", "k", "()Ll6/h$a;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "i", "c", "h", "d", "e", "f", "Lzt/h;", "fetcherFactories", "decoderFactories", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<q6.d> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<s6.c<? extends Object, ? extends Object>, xu.c<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<r6.c<? extends Object>, xu.c<? extends Object>>> keyers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends Pair<? extends p6.j.a<? extends Object>, ? extends xu.c<? extends Object>>>>> lazyFetcherFactories;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends n6.i.a>>> lazyDecoderFactories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h fetcherFactories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h decoderFactories;

    public /* synthetic */ h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public static final List c(h hVar) {
        List<? extends Function0<? extends List<? extends n6.i.a>>> list = hVar.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            p001kotlin.collections.u.z(arrayList, list.get(i10).invoke());
        }
        hVar.lazyDecoderFactories = p001kotlin.collections.p.k();
        return arrayList;
    }

    public static final List d(h hVar) {
        List<? extends Function0<? extends List<? extends Pair<? extends p6.j.a<? extends Object>, ? extends xu.c<? extends Object>>>>> list = hVar.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            p001kotlin.collections.u.z(arrayList, list.get(i10).invoke());
        }
        hVar.lazyFetcherFactories = p001kotlin.collections.p.k();
        return arrayList;
    }

    @NotNull
    public final List<n6.i.a> e() {
        return (List) this.decoderFactories.getValue();
    }

    @NotNull
    public final List<Pair<p6.j.a<? extends Object>, xu.c<? extends Object>>> f() {
        return (List) this.fetcherFactories.getValue();
    }

    @NotNull
    public final List<q6.d> g() {
        return this.interceptors;
    }

    @NotNull
    public final List<Pair<r6.c<? extends Object>, xu.c<? extends Object>>> h() {
        return this.keyers;
    }

    @NotNull
    public final List<Pair<s6.c<? extends Object, ? extends Object>, xu.c<? extends Object>>> i() {
        return this.mappers;
    }

    @NotNull
    public final Object j(@NotNull Object data, @NotNull Options options) {
        List<Pair<s6.c<? extends Object, ? extends Object>, xu.c<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<s6.c<? extends Object, ? extends Object>, xu.c<? extends Object>> pair = list.get(i10);
            s6.c<? extends Object, ? extends Object> cVarA = pair.a();
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
    public final Pair<n6.i, Integer> l(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull s imageLoader, int startIndex) {
        int size = e().size();
        while (startIndex < size) {
            n6.i iVarA = e().get(startIndex).a(result, options, imageLoader);
            if (iVarA != null) {
                return zt.s.a(iVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @Nullable
    public final Pair<p6.j, Integer> m(@NotNull Object data, @NotNull Options options, @NotNull s imageLoader, int startIndex) {
        int size = f().size();
        while (startIndex < size) {
            Pair<p6.j.a<? extends Object>, xu.c<? extends Object>> pair = f().get(startIndex);
            p6.j.a<? extends Object> aVarA = pair.a();
            if (pair.b().b(data)) {
                Intrinsics.d(aVarA, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                p6.j jVarA = aVarA.a(data, options, imageLoader);
                if (jVarA != null) {
                    return zt.s.a(jVarA, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends q6.d> list, List<? extends Pair<? extends s6.c<? extends Object, ? extends Object>, ? extends xu.c<? extends Object>>> list2, List<? extends Pair<? extends r6.c<? extends Object>, ? extends xu.c<? extends Object>>> list3, List<? extends Function0<? extends List<? extends Pair<? extends p6.j.a<? extends Object>, ? extends xu.c<? extends Object>>>>> list4, List<? extends Function0<? extends List<? extends n6.i.a>>> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        this.fetcherFactories = zt.i.a(new Function0() { // from class: l6.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.d(this.f21894a);
            }
        });
        this.decoderFactories = zt.i.a(new Function0() { // from class: l6.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.c(this.f21895a);
            }
        });
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00002.\u0010\u0017\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R@\u0010-\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R<\u00100\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)RH\u00103\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)¨\u00067"}, d2 = {"Ll6/h$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ll6/h;", "registry", "(Ll6/h;)V", "Lq6/d;", "interceptor", "i", "(Lq6/d;)Ll6/h$a;", "T", "Ls6/c;", "mapper", "Lxu/c;", Payload.TYPE, "k", "(Ls6/c;Lxu/c;)Ll6/h$a;", "Lr6/c;", "keyer", "j", "(Lr6/c;Lxu/c;)Ll6/h$a;", "Lp6/j$a;", "factory", "h", "(Lp6/j$a;Lxu/c;)Ll6/h$a;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "Lkotlin/Pair;", "o", "(Lkotlin/jvm/functions/Function0;)Ll6/h$a;", "Ln6/i$a;", "g", "(Ln6/i$a;)Ll6/h$a;", "n", "p", "()Ll6/h;", BuildConfig.FLAVOR, "a", "Ljava/util/List;", "getInterceptors$coil_core_release", "()Ljava/util/List;", "interceptors", "b", "getMappers$coil_core_release", "mappers", "c", "getKeyers$coil_core_release", "keyers", "d", "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<q6.d> interceptors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<s6.c<? extends Object, ?>, xu.c<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Pair<r6.c<? extends Object>, xu.c<? extends Object>>> keyers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Function0<List<Pair<p6.j.a<? extends Object>, xu.c<? extends Object>>>>> lazyFetcherFactories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Function0<List<n6.i.a>>> lazyDecoderFactories;

        public a() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.lazyFetcherFactories = new ArrayList();
            this.lazyDecoderFactories = new ArrayList();
        }

        public static final List e(Pair pair) {
            return p001kotlin.collections.o.d(pair);
        }

        public static final List f(n6.i.a aVar) {
            return p001kotlin.collections.o.d(aVar);
        }

        public static final List l(n6.i.a aVar) {
            return p001kotlin.collections.o.d(aVar);
        }

        public static final List m(p6.j.a aVar, xu.c cVar) {
            return p001kotlin.collections.o.d(zt.s.a(aVar, cVar));
        }

        @NotNull
        public final a g(@NotNull final n6.i.a factory) {
            this.lazyDecoderFactories.add(new Function0() { // from class: l6.g
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.a.l(factory);
                }
            });
            return this;
        }

        @NotNull
        public final <T> a h(@NotNull final p6.j.a<T> factory, @NotNull final xu.c<T> type) {
            this.lazyFetcherFactories.add(new Function0() { // from class: l6.f
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.a.m(factory, type);
                }
            });
            return this;
        }

        @NotNull
        public final a i(@NotNull q6.d interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final <T> a j(@NotNull r6.c<T> keyer, @NotNull xu.c<T> type) {
            this.keyers.add(zt.s.a(keyer, type));
            return this;
        }

        @NotNull
        public final <T> a k(@NotNull s6.c<T, ?> mapper, @NotNull xu.c<T> type) {
            this.mappers.add(zt.s.a(mapper, type));
            return this;
        }

        @NotNull
        public final a n(@NotNull Function0<? extends List<? extends n6.i.a>> factory) {
            this.lazyDecoderFactories.add(factory);
            return this;
        }

        @NotNull
        public final a o(@NotNull Function0<? extends List<? extends Pair<? extends p6.j.a<? extends Object>, ? extends xu.c<? extends Object>>>> factory) {
            this.lazyFetcherFactories.add(factory);
            return this;
        }

        @NotNull
        public final h p() {
            return new h(f7.d.c(this.interceptors), f7.d.c(this.mappers), f7.d.c(this.keyers), f7.d.c(this.lazyFetcherFactories), f7.d.c(this.lazyDecoderFactories), null);
        }

        @NotNull
        public final List<Function0<List<n6.i.a>>> q() {
            return this.lazyDecoderFactories;
        }

        @NotNull
        public final List<Function0<List<Pair<p6.j.a<? extends Object>, xu.c<? extends Object>>>>> r() {
            return this.lazyFetcherFactories;
        }

        public a(@NotNull h hVar) {
            this.interceptors = CollectionsKt.O0(hVar.g());
            this.mappers = CollectionsKt.O0(hVar.i());
            this.keyers = CollectionsKt.O0(hVar.h());
            List<Pair<p6.j.a<? extends Object>, xu.c<? extends Object>>> listF = hVar.f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                arrayList.add(new Function0() { // from class: l6.d
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.e(pair);
                    }
                });
            }
            this.lazyFetcherFactories = arrayList;
            List<n6.i.a> listE = hVar.e();
            ArrayList arrayList2 = new ArrayList();
            for (final n6.i.a aVar : listE) {
                arrayList2.add(new Function0() { // from class: l6.e
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.f(aVar);
                    }
                });
            }
            this.lazyDecoderFactories = arrayList2;
        }
    }

    public h() {
        this(p001kotlin.collections.p.k(), p001kotlin.collections.p.k(), p001kotlin.collections.p.k(), p001kotlin.collections.p.k(), p001kotlin.collections.p.k());
    }
}
