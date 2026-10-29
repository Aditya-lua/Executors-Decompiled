package zm;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p581ym.AbstractC13225r;
import p581ym.InterfaceC13205a;
import p581ym.InterfaceC13224q;
import p581ym.InterfaceC13227t;
import p581ym.Snapshot;
import p615zt.InterfaceC14057n;
import p615zt.InterfaceC14058o;

/* JADX INFO: renamed from: zm.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u008d\u0001\u0010#\u001a\u00028\u0003\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u001c\"\u0004\b\u0003\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00012\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 22\u0010\u0013\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"\u0012\u0004\u0012\u00028\u00030\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u0004\u0018\u00010\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00100%2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'Ji\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u001c*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"2\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"H\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+¨\u0006,"}, m31665d2 = {"Lzm/b;", "Lym/t;", "", "interceptors", "<init>", "(Ljava/util/List;)V", "Lku/p0;", "workflowScope", "Lym/t$c;", "session", "", "c", "(Lku/p0;Lym/t$c;)V", "P", "S", "props", "Lym/i;", "snapshot", "Lkotlin/Function2;", "proceed", "d", "(Ljava/lang/Object;Lym/i;Lkotlin/jvm/functions/Function2;Lym/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;Lym/t$c;)Ljava/lang/Object;", "O", "R", "renderProps", "renderState", "Lym/a;", "context", "Lym/t$b;", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lym/a;Lzt/n;Lym/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "a", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lym/t$c;)Lym/i;", "inner", "g", "(Lym/t$b;Lym/t$b;)Lym/t$b;", "Ljava/util/List;", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13842b implements InterfaceC13227t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC13227t> interceptors;

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    /* JADX INFO: renamed from: zm.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"P", "S", "props", "Lym/i;", "snapshot", "a", "(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a<P, S> extends AbstractC7746m implements Function2<P, Snapshot, S> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC13227t f48470i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Function2<P, Snapshot, S> f48471j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC13227t.c f48472k;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super P, ? super ym.i, ? extends S> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC13227t interfaceC13227t, Function2<? super P, ? super Snapshot, ? extends S> function2, InterfaceC13227t.c cVar) {
            super(2);
            this.f48470i = interfaceC13227t;
            this.f48471j = function2;
            this.f48472k = cVar;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke(P p8, @Nullable Snapshot snapshot) {
            return (S) this.f48470i.mo48864d(p8, snapshot, this.f48471j, this.f48472k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    /* JADX INFO: renamed from: zm.b$b */
    @Metadata(m31664d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"<anonymous>", "S", "P", "old", "new", "state", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class b<P, S> extends AbstractC7746m implements InterfaceC14057n<P, P, S, S> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC13227t f48473i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC14057n<P, P, S, S> f48474j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC13227t.c f48475k;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: zt.n<? super P, ? super P, ? super S, ? extends S> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC13227t interfaceC13227t, InterfaceC14057n<? super P, ? super P, ? super S, ? extends S> interfaceC14057n, InterfaceC13227t.c cVar) {
            super(3);
            this.f48473i = interfaceC13227t;
            this.f48474j = interfaceC14057n;
            this.f48475k = cVar;
        }

        @Override // p615zt.InterfaceC14057n
        public final S invoke(P p8, P p10, S s8) {
            return (S) this.f48473i.mo48862b(p8, p10, s8, this.f48474j, this.f48475k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    /* JADX INFO: renamed from: zm.b$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"P", "S", "O", "R", "props", "state", "Lym/t$b;", "outerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class c<O, P, R, S> extends AbstractC7746m implements InterfaceC14057n<P, S, InterfaceC13227t.b<P, S, O>, R> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC13227t f48476i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC13205a<P, S, O> f48477j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC13227t.c f48478k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C13842b f48479l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC14057n<P, S, InterfaceC13227t.b<P, S, O>, R> f48480m;

        /* JADX INFO: renamed from: zm.b$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"P", "S", "O", "R", "p", "s", "Lym/t$b;", "innerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class a extends AbstractC7746m implements InterfaceC14057n<P, S, InterfaceC13227t.b<P, S, O>, R> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ C13842b f48481i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ InterfaceC13227t.b<P, S, O> f48482j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ InterfaceC14057n<P, S, InterfaceC13227t.b<P, S, O>, R> f48483k;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.n<? super P, ? super S, ? super ym.t$b<P, S, O>, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C13842b c13842b, InterfaceC13227t.b<P, S, O> bVar, InterfaceC14057n<? super P, ? super S, ? super InterfaceC13227t.b<P, S, O>, ? extends R> interfaceC14057n) {
                super(3);
                this.f48481i = c13842b;
                this.f48482j = bVar;
                this.f48483k = interfaceC14057n;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14057n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R invoke(P p8, S s8, @Nullable InterfaceC13227t.b<P, S, O> bVar) {
                return this.f48483k.invoke(p8, s8, this.f48481i.m50349g(this.f48482j, bVar));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.a<? extends P, S, ? super O> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: zt.n<? super P, ? super S, ? super ym.t$b<P, S, O>, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC13227t interfaceC13227t, InterfaceC13205a<? extends P, S, ? super O> interfaceC13205a, InterfaceC13227t.c cVar, C13842b c13842b, InterfaceC14057n<? super P, ? super S, ? super InterfaceC13227t.b<P, S, O>, ? extends R> interfaceC14057n) {
            super(3);
            this.f48476i = interfaceC13227t;
            this.f48477j = interfaceC13205a;
            this.f48478k = cVar;
            this.f48479l = c13842b;
            this.f48480m = interfaceC14057n;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(P p8, S s8, @Nullable InterfaceC13227t.b<P, S, O> bVar) {
            return (R) this.f48476i.mo48865e(p8, s8, this.f48477j, new a(this.f48479l, bVar, this.f48480m), this.f48478k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: zm.b$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"S", "state", "Lym/i;", "a", "(Ljava/lang/Object;)Lym/i;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class d<S> extends AbstractC7746m implements Function1<S, Snapshot> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC13227t f48484i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Function1<S, Snapshot> f48485j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC13227t.c f48486k;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super S, ym.i> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC13227t interfaceC13227t, Function1<? super S, Snapshot> function1, InterfaceC13227t.c cVar) {
            super(1);
            this.f48484i = interfaceC13227t;
            this.f48485j = function1;
            this.f48486k = cVar;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke(S s8) {
            return this.f48484i.mo48861a(s8, this.f48485j, this.f48486k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S, O] */
    /* JADX INFO: renamed from: zm.b$e */
    @Metadata(m31664d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001JO\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00022$\u0010\u0006\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJÇ\u0001\u0010\u0013\u001a\u00028\u0005\"\u0004\b\u0003\u0010\t\"\u0004\b\u0004\u0010\n\"\u0004\b\u0005\u0010\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f2\u0006\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f2$\u0010\u0011\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u00042T\u0010\u0006\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u0004\u0012\u0004\u0012\u00028\u00050\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jh\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042.\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004\u0012\u0004\u0012\u00020\u00050\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00018\u0006¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m31665d2 = {"zm/b$e", "Lym/t$b;", "Lym/r;", "action", "Lkotlin/Function1;", "", "proceed", "b", "(Lym/r;Lkotlin/jvm/functions/Function1;)V", "CP", "CO", "CR", "Lym/q;", "child", "childProps", "", "key", "handler", "Lkotlin/Function4;", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lzt/o;)Ljava/lang/Object;", "Lnt/b;", "", "sideEffect", "Lkotlin/Function2;", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lym/t$b;", "getOuter", "()Lym/t$b;", "getOuter$annotations", "()V", "outer", "wf1-workflow-runtime"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class e<O, P, S> implements InterfaceC13227t.b<P, S, O> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC13227t.b<P, S, O> outer;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC13227t.b<P, S, O> f48488b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC13227t.b<P, S, O> f48489c;

        /* JADX INFO: renamed from: zm.b$e$a */
        @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"P", "S", "O", "Lym/r;", "interceptedAction", "", "a", "(Lym/r;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class a extends AbstractC7746m implements Function1<AbstractC13225r<? super P, S, ? extends O>, Unit> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC13227t.b<P, S, O> f48490i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ Function1<AbstractC13225r<? super P, S, ? extends O>, Unit> f48491j;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super ym.r<? super P, S, ? extends O>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC13227t.b<P, S, O> bVar, Function1<? super AbstractC13225r<? super P, S, ? extends O>, Unit> function1) {
                super(1);
                this.f48490i = bVar;
                this.f48491j = function1;
            }

            /* JADX INFO: renamed from: a */
            public final void m50354a(@NotNull AbstractC13225r<? super P, S, ? extends O> interceptedAction) {
                Intrinsics.checkNotNullParameter(interceptedAction, "interceptedAction");
                this.f48490i.mo48919b(interceptedAction, this.f48491j);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                m50354a((AbstractC13225r) obj);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [CO, CP, CR] */
        /* JADX INFO: renamed from: zm.b$e$b */
        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m31665d2 = {"CP", "CO", "CR", "P", "S", "O", "Lym/q;", "c", "p", "", "k", "Lkotlin/Function1;", "Lym/r;", "h", "a", "(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class b<CO, CP, CR> extends AbstractC7746m implements InterfaceC14058o<InterfaceC13224q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>>, CR> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC13227t.b<P, S, O> f48492i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ InterfaceC14058o<InterfaceC13224q<? super CP, ? extends CO, ? extends CR>, CP, String, Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>>, CR> f48493j;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: zt.o<? super ym.q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super java.lang.String, ? super kotlin.jvm.functions.Function1<? super CO, ? extends ym.r<? super P, S, ? extends O>>, ? extends CR> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC13227t.b<P, S, O> bVar, InterfaceC14058o<? super InterfaceC13224q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>>, ? extends CR> interfaceC14058o) {
                super(4);
                this.f48492i = bVar;
                this.f48493j = interfaceC14058o;
            }

            /* JADX DEBUG: Method merged with bridge method: e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14058o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CR mo1397e(@NotNull InterfaceC13224q<? super CP, ? extends CO, ? extends CR> c10, CP cp2, @NotNull String k10, @NotNull Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>> h10) {
                Intrinsics.checkNotNullParameter(c10, "c");
                Intrinsics.checkNotNullParameter(k10, "k");
                Intrinsics.checkNotNullParameter(h10, "h");
                return (CR) this.f48492i.mo48918a(c10, cp2, k10, h10, this.f48493j);
            }
        }

        /* JADX INFO: renamed from: zm.b$e$c */
        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, m31665d2 = {"P", "S", "O", "", "iKey", "Lkotlin/Function1;", "Lnt/b;", "", "", "iSideEffect", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class c extends AbstractC7746m implements Function2<String, Function1<? super InterfaceC9557b<? super Unit>, ? extends Object>, Unit> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC13227t.b<P, S, O> f48494i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ Function2<String, Function1<? super InterfaceC9557b<? super Unit>, ? extends Object>, Unit> f48495j;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super kotlin.jvm.functions.Function1<? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC13227t.b<P, S, O> bVar, Function2<? super String, ? super Function1<? super InterfaceC9557b<? super Unit>, ? extends Object>, Unit> function2) {
                super(2);
                this.f48494i = bVar;
                this.f48495j = function2;
            }

            /* JADX INFO: renamed from: a */
            public final void m50356a(@NotNull String iKey, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> iSideEffect) {
                Intrinsics.checkNotNullParameter(iKey, "iKey");
                Intrinsics.checkNotNullParameter(iSideEffect, "iSideEffect");
                this.f48494i.mo48920c(iKey, iSideEffect, this.f48495j);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1) {
                m50356a(str, function1);
                return Unit.f29331a;
            }
        }

        public e(InterfaceC13227t.b<P, S, O> bVar, InterfaceC13227t.b<P, S, O> bVar2) {
            this.f48488b = bVar;
            this.f48489c = bVar2;
            Intrinsics.checkNotNull(bVar);
            this.outer = bVar;
        }

        @Override // p581ym.InterfaceC13227t.b
        /* JADX INFO: renamed from: a */
        public <CP, CO, CR> CR mo48918a(@NotNull InterfaceC13224q<? super CP, ? extends CO, ? extends CR> child, CP childProps, @NotNull String key, @NotNull Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>> handler, @NotNull InterfaceC14058o<? super InterfaceC13224q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super Function1<? super CO, ? extends AbstractC13225r<? super P, S, ? extends O>>, ? extends CR> proceed) {
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            return (CR) this.outer.mo48918a(child, childProps, key, handler, new b(this.f48489c, proceed));
        }

        @Override // p581ym.InterfaceC13227t.b
        /* JADX INFO: renamed from: b */
        public void mo48919b(@NotNull AbstractC13225r<? super P, S, ? extends O> action, @NotNull Function1<? super AbstractC13225r<? super P, S, ? extends O>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.mo48919b(action, new a(this.f48489c, proceed));
        }

        @Override // p581ym.InterfaceC13227t.b
        /* JADX INFO: renamed from: c */
        public void mo48920c(@NotNull String key, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> sideEffect, @NotNull Function2<? super String, ? super Function1<? super InterfaceC9557b<? super Unit>, ? extends Object>, Unit> proceed) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
            Intrinsics.checkNotNullParameter(proceed, "proceed");
            this.outer.mo48920c(key, sideEffect, new c(this.f48489c, proceed));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends ym.t> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13842b(@NotNull List<? extends InterfaceC13227t> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    @Override // p581ym.InterfaceC13227t
    @Nullable
    /* JADX INFO: renamed from: a */
    public <S> Snapshot mo48861a(S state, @NotNull Function1<? super S, Snapshot> proceed, @NotNull InterfaceC13227t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<InterfaceC13227t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<InterfaceC13227t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new d(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(state);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: b */
    public <P, S> S mo48862b(P old, P p8, S state, @NotNull InterfaceC14057n<? super P, ? super P, ? super S, ? extends S> proceed, @NotNull InterfaceC13227t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<InterfaceC13227t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<InterfaceC13227t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new b(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(old, p8, state);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: c */
    public void mo48863c(@NotNull InterfaceC7906p0 workflowScope, @NotNull InterfaceC13227t.c session) {
        Intrinsics.checkNotNullParameter(workflowScope, "workflowScope");
        Intrinsics.checkNotNullParameter(session, "session");
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((InterfaceC13227t) it.next()).mo48863c(workflowScope, session);
        }
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: d */
    public <P, S> S mo48864d(P props, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> proceed, @NotNull InterfaceC13227t.c session) {
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<InterfaceC13227t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<InterfaceC13227t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new a(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(props, snapshot);
    }

    @Override // p581ym.InterfaceC13227t
    /* JADX INFO: renamed from: e */
    public <P, S, O, R> R mo48865e(P renderProps, S renderState, @NotNull InterfaceC13205a<? extends P, S, ? super O> context, @NotNull InterfaceC14057n<? super P, ? super S, ? super InterfaceC13227t.b<P, S, O>, ? extends R> proceed, @NotNull InterfaceC13227t.c session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        Intrinsics.checkNotNullParameter(session, "session");
        List<InterfaceC13227t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<InterfaceC13227t> listIterator = list.listIterator(list.size());
            InterfaceC14057n<? super P, ? super S, ? super InterfaceC13227t.b<P, S, O>, ? extends R> cVar = proceed;
            while (listIterator.hasPrevious()) {
                cVar = new c(listIterator.previous(), context, session, this, cVar);
            }
            proceed = cVar;
        }
        return proceed.invoke(renderProps, renderState, null);
    }

    /* JADX INFO: renamed from: g */
    public final <P, S, O> InterfaceC13227t.b<P, S, O> m50349g(InterfaceC13227t.b<P, S, O> bVar, InterfaceC13227t.b<P, S, O> bVar2) {
        if (bVar == null && bVar2 == null) {
            return null;
        }
        if (bVar == null) {
            return bVar2;
        }
        return bVar2 == null ? bVar : new e(bVar, bVar2);
    }
}
