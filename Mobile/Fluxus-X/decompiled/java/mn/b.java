package mn;

import av.p0;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ln.Snapshot;
import ln.q;
import ln.r;
import ln.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import pu.n;
import pu.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u008d\u0001\u0010#\u001a\u00028\u0003\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u001c\"\u0004\b\u0003\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00012\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 22\u0010\u0013\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"\u0012\u0004\u0012\u00028\u00030\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u0004\u0018\u00010\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00100%2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'Ji\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u001c*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"2\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"H\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006,"}, d2 = {"Lmn/b;", "Lln/t;", BuildConfig.FLAVOR, "interceptors", "<init>", "(Ljava/util/List;)V", "Lav/p0;", "workflowScope", "Lln/t$c;", "session", BuildConfig.FLAVOR, "c", "(Lav/p0;Lln/t$c;)V", "P", "S", "props", "Lln/i;", "snapshot", "Lkotlin/Function2;", "proceed", "a", "(Ljava/lang/Object;Lln/i;Lkotlin/jvm/functions/Function2;Lln/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpu/n;Lln/t$c;)Ljava/lang/Object;", "O", "R", "renderProps", "renderState", "Lln/a;", "context", "Lln/t$b;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lln/a;Lpu/n;Lln/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lln/t$c;)Lln/i;", "inner", "g", "(Lln/t$b;Lln/t$b;)Lln/t$b;", "Ljava/util/List;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<t> interceptors;

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", "props", "Lln/i;", "snapshot", "a", "(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a<P, S> extends p001kotlin.jvm.internal.m implements Function2<P, Snapshot, S> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f23331i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function2<P, Snapshot, S> f23332j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f23333k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t tVar, Function2<? super P, ? super Snapshot, ? extends S> function2, t.c cVar) {
            super(2);
            this.f23331i = tVar;
            this.f23332j = function2;
            this.f23333k = cVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke(P p8, @Nullable Snapshot snapshot) {
            return (S) this.f23331i.a(p8, snapshot, this.f23332j, this.f23333k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    /* JADX INFO: renamed from: mn.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "S", "P", "old", "new", "state", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C0456b<P, S> extends p001kotlin.jvm.internal.m implements n<P, P, S, S> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f23334i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ n<P, P, S, S> f23335j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f23336k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0456b(t tVar, n<? super P, ? super P, ? super S, ? extends S> nVar, t.c cVar) {
            super(3);
            this.f23334i = tVar;
            this.f23335j = nVar;
            this.f23336k = cVar;
        }

        @Override // pu.n
        public final S invoke(P p8, P p10, S s8) {
            return (S) this.f23334i.d(p8, p10, s8, this.f23335j, this.f23336k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "props", "state", "Lln/t$b;", "outerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lln/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class c<O, P, R, S> extends p001kotlin.jvm.internal.m implements n<P, S, t.b<P, S, O>, R> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f23337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ln.a<P, S, O> f23338j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f23339k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f23340l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n<P, S, t.b<P, S, O>, R> f23341m;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", "O", "R", "p", "s", "Lln/t$b;", "innerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lln/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a extends p001kotlin.jvm.internal.m implements n<P, S, t.b<P, S, O>, R> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ b f23342i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f23343j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ n<P, S, t.b<P, S, O>, R> f23344k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, t.b<P, S, O> bVar2, n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar) {
                super(3);
                this.f23342i = bVar;
                this.f23343j = bVar2;
                this.f23344k = nVar;
            }

            @Override // pu.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R invoke(P p8, S s8, @Nullable t.b<P, S, O> bVar) {
                return this.f23344k.invoke(p8, s8, this.f23342i.g(this.f23343j, bVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(t tVar, ln.a<? extends P, S, ? super O> aVar, t.c cVar, b bVar, n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar) {
            super(3);
            this.f23337i = tVar;
            this.f23338j = aVar;
            this.f23339k = cVar;
            this.f23340l = bVar;
            this.f23341m = nVar;
        }

        @Override // pu.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(P p8, S s8, @Nullable t.b<P, S, O> bVar) {
            return (R) this.f23337i.b(p8, s8, this.f23338j, new a(this.f23340l, bVar, this.f23341m), this.f23339k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "state", "Lln/i;", "a", "(Ljava/lang/Object;)Lln/i;"}, k = 3, mv = {1, 6, 0})
    public static final class d<S> extends p001kotlin.jvm.internal.m implements Function1<S, Snapshot> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f23345i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function1<S, Snapshot> f23346j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t.c f23347k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t tVar, Function1<? super S, Snapshot> function1, t.c cVar) {
            super(1);
            this.f23345i = tVar;
            this.f23346j = function1;
            this.f23347k = cVar;
        }

        @Override // p001kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke(S s8) {
            return this.f23345i.e(s8, this.f23346j, this.f23347k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S, O] */
    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001JO\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00022$\u0010\u0006\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJÇ\u0001\u0010\u0013\u001a\u00028\u0005\"\u0004\b\u0003\u0010\t\"\u0004\b\u0004\u0010\n\"\u0004\b\u0005\u0010\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f2\u0006\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f2$\u0010\u0011\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u00042T\u0010\u0006\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u0004\u0012\u0004\u0012\u00028\u00050\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jh\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042.\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004\u0012\u0004\u0012\u00020\u00050\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00018\u0006¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"mn/b$e", "Lln/t$b;", "Lln/r;", "action", "Lkotlin/Function1;", BuildConfig.FLAVOR, "proceed", "a", "(Lln/r;Lkotlin/jvm/functions/Function1;)V", "CP", "CO", "CR", "Lln/q;", "child", "childProps", BuildConfig.FLAVOR, "key", "handler", "Lkotlin/Function4;", "b", "(Lln/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lpu/o;)Ljava/lang/Object;", "Leu/b;", BuildConfig.FLAVOR, "sideEffect", "Lkotlin/Function2;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lln/t$b;", "getOuter", "()Lln/t$b;", "getOuter$annotations", "()V", "outer", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class e<O, P, S> implements t.b<P, S, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final t.b<P, S, O> outer;
        public final /* synthetic */ t.b<P, S, O> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t.b<P, S, O> f23349c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", "O", "Lln/r;", "interceptedAction", BuildConfig.FLAVOR, "a", "(Lln/r;)V"}, k = 3, mv = {1, 6, 0})
        public static final class a extends p001kotlin.jvm.internal.m implements Function1<r<? super P, S, ? extends O>, Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f23350i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function1<r<? super P, S, ? extends O>, Unit> f23351j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(t.b<P, S, O> bVar, Function1<? super r<? super P, S, ? extends O>, Unit> function1) {
                super(1);
                this.f23350i = bVar;
                this.f23351j = function1;
            }

            public final void a(@NotNull r<? super P, S, ? extends O> interceptedAction) {
                Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
                this.f23350i.a(interceptedAction, this.f23351j);
            }

            @Override // p001kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                a((r) obj);
                return Unit.f21506a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [CO, CP, CR] */
        /* JADX INFO: renamed from: mn.b$e$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"CP", "CO", "CR", "P", "S", "O", "Lln/q;", "c", "p", BuildConfig.FLAVOR, "k", "Lkotlin/Function1;", "Lln/r;", "h", "a", "(Lln/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class C0457b<CO, CP, CR> extends p001kotlin.jvm.internal.m implements o<q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends r<? super P, S, ? extends O>>, CR> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f23352i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ o<q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends r<? super P, S, ? extends O>>, CR> f23353j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0457b(t.b<P, S, O> bVar, o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> oVar) {
                super(4);
                this.f23352i = bVar;
                this.f23353j = oVar;
            }

            @Override // pu.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CR e(@NotNull q<? super CP, ? extends CO, ? extends CR> c10, CP cp2, @NotNull String k10, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> h10) {
                Intrinsics.checkNotNullParameter(c10, "c");
                Intrinsics.checkNotNullParameter(k10, "k");
                Intrinsics.checkNotNullParameter(h10, "h");
                return (CR) this.f23352i.b(c10, cp2, k10, h10, this.f23353j);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", "O", BuildConfig.FLAVOR, "iKey", "Lkotlin/Function1;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "iSideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 6, 0})
        public static final class c extends p001kotlin.jvm.internal.m implements Function2<String, Function1<? super eu.b<? super Unit>, ? extends Object>, Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ t.b<P, S, O> f23354i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function2<String, Function1<? super eu.b<? super Unit>, ? extends Object>, Unit> f23355j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(t.b<P, S, O> bVar, Function2<? super String, ? super Function1<? super eu.b<? super Unit>, ? extends Object>, Unit> function2) {
                super(2);
                this.f23354i = bVar;
                this.f23355j = function2;
            }

            public final void a(@NotNull String iKey, @NotNull Function1<? super eu.b<? super Unit>, ? extends Object> iSideEffect) {
                Intrinsics.checkNotNullParameter(iKey, "iKey");
                Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
                this.f23354i.c(iKey, iSideEffect, this.f23355j);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super eu.b<? super Unit>, ? extends Object> function1) {
                a(str, function1);
                return Unit.f21506a;
            }
        }

        public e(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
            this.b = bVar;
            this.f23349c = bVar2;
            Intrinsics.checkNotNull(bVar);
            this.outer = bVar;
        }

        @Override // ln.t.b
        public void a(@NotNull r<? super P, S, ? extends O> action, @NotNull Function1<? super r<? super P, S, ? extends O>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.a(action, new a(this.f23349c, proceed));
        }

        @Override // ln.t.b
        public <CP, CO, CR> CR b(@NotNull q<? super CP, ? extends CO, ? extends CR> child, CP childProps, @NotNull String key, @NotNull Function1<? super CO, ? extends r<? super P, S, ? extends O>> handler, @NotNull o<? super q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> proceed) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            return (CR) this.outer.b(child, childProps, key, handler, new C0457b(this.f23349c, proceed));
        }

        @Override // ln.t.b
        public void c(@NotNull String key, @NotNull Function1<? super eu.b<? super Unit>, ? extends Object> sideEffect, @NotNull Function2<? super String, ? super Function1<? super eu.b<? super Unit>, ? extends Object>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.c(key, sideEffect, new c(this.f23349c, proceed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<? extends t> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    @Override // ln.t
    public <P, S> S a(P props, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new a(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(props, snapshot);
    }

    @Override // ln.t
    public <P, S, O, R> R b(P renderProps, S renderState, @NotNull ln.a<? extends P, S, ? super O> context, @NotNull n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> cVar = proceed;
            while (listIterator.hasPrevious()) {
                cVar = new c(listIterator.previous(), context, session, this, cVar);
            }
            proceed = cVar;
        }
        return proceed.invoke(renderProps, renderState, null);
    }

    @Override // ln.t
    public void c(@NotNull p0 workflowScope, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
        Intrinsics.checkNotNullParameter(session, "session");
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((t) it.next()).c(workflowScope, session);
        }
    }

    @Override // ln.t
    public <P, S> S d(P old, P p8, S state, @NotNull n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new C0456b(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(old, p8, state);
    }

    @Override // ln.t
    @Nullable
    public <S> Snapshot e(S state, @NotNull Function1<? super S, Snapshot> proceed, @NotNull t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new d(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(state);
    }

    public final <P, S, O> t.b<P, S, O> g(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
        if (bVar == null && bVar2 == null) {
            return null;
        }
        if (bVar == null) {
            return bVar2;
        }
        return bVar2 == null ? bVar : new e(bVar, bVar2);
    }
}
