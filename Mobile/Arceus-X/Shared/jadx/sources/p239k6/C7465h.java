package p239k6;

import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4852d;
import p229jt.C7342i;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;
import p287m6.InterfaceC8435i;
import p323o6.InterfaceC9702j;
import p323o6.SourceFetchResult;
import p353p6.InterfaceC10168d;
import p372q6.InterfaceC10438c;
import p403r6.InterfaceC10788c;
import p537x6.Options;

/* JADX INFO: renamed from: k6.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, m31665d2 = {"Lk6/h;", "", "", "Lp6/d;", "interceptors", "Lkotlin/Pair;", "Lr6/c;", "Lhu/c;", "mappers", "Lq6/c;", "keyers", "Lkotlin/Function0;", "Lo6/j$a;", "lazyFetcherFactories", "Lm6/i$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lx6/p;", "options", "j", "(Ljava/lang/Object;Lx6/p;)Ljava/lang/Object;", "Lk6/s;", "imageLoader", "", "startIndex", "Lo6/j;", "m", "(Ljava/lang/Object;Lx6/p;Lk6/s;I)Lkotlin/Pair;", "Lo6/o;", "result", "Lm6/i;", "l", "(Lo6/o;Lx6/p;Lk6/s;I)Lkotlin/Pair;", "Lk6/h$a;", "k", "()Lk6/h$a;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "i", "c", "h", "d", "e", "f", "Ljt/h;", "fetcherFactories", "decoderFactories", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7465h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC10168d> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<InterfaceC10788c<? extends Object, ? extends Object>, InterfaceC6567c<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<InterfaceC10438c<? extends Object>, InterfaceC6567c<? extends Object>>> keyers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends Pair<? extends InterfaceC9702j.a<? extends Object>, ? extends InterfaceC6567c<? extends Object>>>>> lazyFetcherFactories;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<? extends Function0<? extends List<? extends InterfaceC8435i.a>>> lazyDecoderFactories;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h fetcherFactories;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h decoderFactories;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.List), (r2v0 java.util.List), (r3v0 java.util.List), (r4v0 java.util.List), (r5v0 java.util.List) A[MD:(java.util.List<? extends p6.d>, java.util.List<? extends kotlin.Pair<? extends r6.c<? extends java.lang.Object, ? extends java.lang.Object>, ? extends hu.c<? extends java.lang.Object>>>, java.util.List<? extends kotlin.Pair<? extends q6.c<? extends java.lang.Object>, ? extends hu.c<? extends java.lang.Object>>>, java.util.List<? extends kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.Pair<? extends o6.j$a<? extends java.lang.Object>, ? extends hu.c<? extends java.lang.Object>>>>>, java.util.List<? extends kotlin.jvm.functions.Function0<? extends java.util.List<? extends m6.i$a>>>):void (m)] (LINE:1) call: k6.h.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C7465h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX INFO: renamed from: c */
    public static final List m30987c(C7465h c7465h) {
        List<? extends Function0<? extends List<? extends InterfaceC8435i.a>>> list = c7465h.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C7708u.m31931z(arrayList, list.get(i10).invoke());
        }
        c7465h.lazyDecoderFactories = C7699p.m31892k();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static final List m30988d(C7465h c7465h) {
        List<? extends Function0<? extends List<? extends Pair<? extends InterfaceC9702j.a<? extends Object>, ? extends InterfaceC6567c<? extends Object>>>>> list = c7465h.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C7708u.m31931z(arrayList, list.get(i10).invoke());
        }
        c7465h.lazyFetcherFactories = C7699p.m31892k();
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<InterfaceC8435i.a> m30989e() {
        return (List) this.decoderFactories.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<Pair<InterfaceC9702j.a<? extends Object>, InterfaceC6567c<? extends Object>>> m30990f() {
        return (List) this.fetcherFactories.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<InterfaceC10168d> m30991g() {
        return this.interceptors;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<Pair<InterfaceC10438c<? extends Object>, InterfaceC6567c<? extends Object>>> m30992h() {
        return this.keyers;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<Pair<InterfaceC10788c<? extends Object, ? extends Object>, InterfaceC6567c<? extends Object>>> m30993i() {
        return this.mappers;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Object m30994j(@NotNull Object data, @NotNull Options options) {
        List<Pair<InterfaceC10788c<? extends Object, ? extends Object>, InterfaceC6567c<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<InterfaceC10788c<? extends Object, ? extends Object>, InterfaceC6567c<? extends Object>> pair = list.get(i10);
            InterfaceC10788c<? extends Object, ? extends Object> interfaceC10788cM31671a = pair.m31671a();
            if (pair.m31672b().mo28425b(data)) {
                Intrinsics.m31981d(interfaceC10788cM31671a, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objMo41117a = interfaceC10788cM31671a.mo41117a(data, options);
                if (objMo41117a != null) {
                    data = objMo41117a;
                }
            }
        }
        return data;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final a m30995k() {
        return new a(this);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Pair<InterfaceC8435i, Integer> m30996l(@NotNull SourceFetchResult result, @NotNull Options options, @NotNull InterfaceC7479s imageLoader, int startIndex) {
        int size = m30989e().size();
        while (startIndex < size) {
            InterfaceC8435i interfaceC8435iMo21787a = m30989e().get(startIndex).mo21787a(result, options, imageLoader);
            if (interfaceC8435iMo21787a != null) {
                return C7352s.m30477a(interfaceC8435iMo21787a, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Pair<InterfaceC9702j, Integer> m30997m(@NotNull Object data, @NotNull Options options, @NotNull InterfaceC7479s imageLoader, int startIndex) {
        int size = m30990f().size();
        while (startIndex < size) {
            Pair<InterfaceC9702j.a<? extends Object>, InterfaceC6567c<? extends Object>> pair = m30990f().get(startIndex);
            InterfaceC9702j.a<? extends Object> aVarM31671a = pair.m31671a();
            if (pair.m31672b().mo28425b(data)) {
                Intrinsics.m31981d(aVarM31671a, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC9702j interfaceC9702jMo38311a = aVarM31671a.mo38311a(data, options, imageLoader);
                if (interfaceC9702jMo38311a != null) {
                    return C7352s.m30477a(interfaceC9702jMo38311a, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends p6.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends kotlin.Pair<? extends r6.c<? extends java.lang.Object, ? extends java.lang.Object>, ? extends hu.c<? extends java.lang.Object>>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.Pair<? extends q6.c<? extends java.lang.Object>, ? extends hu.c<? extends java.lang.Object>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7465h(List<? extends InterfaceC10168d> list, List<? extends Pair<? extends InterfaceC10788c<? extends Object, ? extends Object>, ? extends InterfaceC6567c<? extends Object>>> list2, List<? extends Pair<? extends InterfaceC10438c<? extends Object>, ? extends InterfaceC6567c<? extends Object>>> list3, List<? extends Function0<? extends List<? extends Pair<? extends InterfaceC9702j.a<? extends Object>, ? extends InterfaceC6567c<? extends Object>>>>> list4, List<? extends Function0<? extends List<? extends InterfaceC8435i.a>>> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        this.fetcherFactories = C7342i.m30456b(new Function0() { // from class: k6.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7465h.m30988d(this.f28732a);
            }
        });
        this.decoderFactories = C7342i.m30456b(new Function0() { // from class: k6.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7465h.m30987c(this.f28733a);
            }
        });
    }

    /* JADX INFO: renamed from: k6.h$a */
    @Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00002.\u0010\u0017\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R@\u0010-\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R<\u00100\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)RH\u00103\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)¨\u00067"}, m31665d2 = {"Lk6/h$a;", "", "<init>", "()V", "Lk6/h;", "registry", "(Lk6/h;)V", "Lp6/d;", "interceptor", "i", "(Lp6/d;)Lk6/h$a;", "T", "Lr6/c;", "mapper", "Lhu/c;", Payload.TYPE, "k", "(Lr6/c;Lhu/c;)Lk6/h$a;", "Lq6/c;", "keyer", "j", "(Lq6/c;Lhu/c;)Lk6/h$a;", "Lo6/j$a;", "factory", "h", "(Lo6/j$a;Lhu/c;)Lk6/h$a;", "Lkotlin/Function0;", "", "Lkotlin/Pair;", "o", "(Lkotlin/jvm/functions/Function0;)Lk6/h$a;", "Lm6/i$a;", "g", "(Lm6/i$a;)Lk6/h$a;", "n", "p", "()Lk6/h;", "", "a", "Ljava/util/List;", "getInterceptors$coil_core_release", "()Ljava/util/List;", "interceptors", "b", "getMappers$coil_core_release", "mappers", "c", "getKeyers$coil_core_release", "keyers", "d", "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<InterfaceC10168d> interceptors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<InterfaceC10788c<? extends Object, ?>, InterfaceC6567c<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<InterfaceC10438c<? extends Object>, InterfaceC6567c<? extends Object>>> keyers;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<Function0<List<Pair<InterfaceC9702j.a<? extends Object>, InterfaceC6567c<? extends Object>>>>> lazyFetcherFactories;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final List<Function0<List<InterfaceC8435i.a>>> lazyDecoderFactories;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.lazyFetcherFactories = new ArrayList();
            this.lazyDecoderFactories = new ArrayList();
        }

        /* JADX INFO: renamed from: e */
        public static final List m31002e(Pair pair) {
            return C7697o.m31878d(pair);
        }

        /* JADX INFO: renamed from: f */
        public static final List m31003f(InterfaceC8435i.a aVar) {
            return C7697o.m31878d(aVar);
        }

        /* JADX INFO: renamed from: l */
        public static final List m31004l(InterfaceC8435i.a aVar) {
            return C7697o.m31878d(aVar);
        }

        /* JADX INFO: renamed from: m */
        public static final List m31005m(InterfaceC9702j.a aVar, InterfaceC6567c interfaceC6567c) {
            return C7697o.m31878d(C7352s.m30477a(aVar, interfaceC6567c));
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m31006g(@NotNull final InterfaceC8435i.a factory) {
            this.lazyDecoderFactories.add(new Function0() { // from class: k6.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7465h.a.m31004l(factory);
                }
            });
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final <T> a m31007h(@NotNull final InterfaceC9702j.a<T> factory, @NotNull final InterfaceC6567c<T> type) {
            this.lazyFetcherFactories.add(new Function0() { // from class: k6.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7465h.a.m31005m(factory, type);
                }
            });
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final a m31008i(@NotNull InterfaceC10168d interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final <T> a m31009j(@NotNull InterfaceC10438c<T> keyer, @NotNull InterfaceC6567c<T> type) {
            this.keyers.add(C7352s.m30477a(keyer, type));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final <T> a m31010k(@NotNull InterfaceC10788c<T, ?> mapper, @NotNull InterfaceC6567c<T> type) {
            this.mappers.add(C7352s.m30477a(mapper, type));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final a m31011n(@NotNull Function0<? extends List<? extends InterfaceC8435i.a>> factory) {
            this.lazyDecoderFactories.add(factory);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final a m31012o(@NotNull Function0<? extends List<? extends Pair<? extends InterfaceC9702j.a<? extends Object>, ? extends InterfaceC6567c<? extends Object>>>> factory) {
            this.lazyFetcherFactories.add(factory);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final C7465h m31013p() {
            return new C7465h(C4852d.m23423c(this.interceptors), C4852d.m23423c(this.mappers), C4852d.m23423c(this.keyers), C4852d.m23423c(this.lazyFetcherFactories), C4852d.m23423c(this.lazyDecoderFactories), null);
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final List<Function0<List<InterfaceC8435i.a>>> m31014q() {
            return this.lazyDecoderFactories;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final List<Function0<List<Pair<InterfaceC9702j.a<? extends Object>, InterfaceC6567c<? extends Object>>>>> m31015r() {
            return this.lazyFetcherFactories;
        }

        public a(@NotNull C7465h c7465h) {
            this.interceptors = CollectionsKt.m31689O0(c7465h.m30991g());
            this.mappers = CollectionsKt.m31689O0(c7465h.m30993i());
            this.keyers = CollectionsKt.m31689O0(c7465h.m30992h());
            List<Pair<InterfaceC9702j.a<? extends Object>, InterfaceC6567c<? extends Object>>> listM30990f = c7465h.m30990f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM30990f.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                arrayList.add(new Function0() { // from class: k6.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C7465h.a.m31002e(pair);
                    }
                });
            }
            this.lazyFetcherFactories = arrayList;
            List<InterfaceC8435i.a> listM30989e = c7465h.m30989e();
            ArrayList arrayList2 = new ArrayList();
            for (final InterfaceC8435i.a aVar : listM30989e) {
                arrayList2.add(new Function0() { // from class: k6.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C7465h.a.m31003f(aVar);
                    }
                });
            }
            this.lazyDecoderFactories = arrayList2;
        }
    }

    public C7465h() {
        this(C7699p.m31892k(), C7699p.m31892k(), C7699p.m31892k(), C7699p.m31892k(), C7699p.m31892k());
    }
}
