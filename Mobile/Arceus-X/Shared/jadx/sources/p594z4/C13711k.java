package p594z4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p119f5.InterfaceC5359b;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.AbstractC12682u;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"R", "Lx4/u;", "db", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Lf5/b;", "block", "Lnu/h;", "a", "(Lx4/u;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lnu/h;", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13711k {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: z4.k$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<R> implements InterfaceC9575h<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f48131a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC12682u f48132b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f48133c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function1 f48134d;

        /* JADX INFO: renamed from: z4.k$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        public static final class C14292a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f48135a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC12682u f48136b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f48137c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Function1 f48138d;

            /* JADX INFO: renamed from: z4.k$a$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", m39664f = "FlowBuilder.kt", m39665l = {220, 219}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14293a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f48139t;

                /* JADX INFO: renamed from: u */
                public int f48140u;

                /* JADX INFO: renamed from: v */
                public Object f48141v;

                public C14293a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f48139t = obj;
                    this.f48140u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C14292a.this.emit(null, this);
                }
            }

            public C14292a(InterfaceC9577i interfaceC9577i, AbstractC12682u abstractC12682u, boolean z10, Function1 function1) {
                this.f48135a = interfaceC9577i;
                this.f48136b = abstractC12682u;
                this.f48137c = z10;
                this.f48138d = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            @Override // nu.InterfaceC9577i
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull InterfaceC9557b interfaceC9557b) {
                C14293a c14293a;
                InterfaceC9577i interfaceC9577i;
                if (interfaceC9557b instanceof C14293a) {
                    c14293a = (C14293a) interfaceC9557b;
                    int i10 = c14293a.f48140u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14293a.f48140u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14293a = new C14293a(interfaceC9557b);
                    }
                } else {
                    c14293a = new C14293a(interfaceC9557b);
                }
                Object obj2 = c14293a.f48139t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14293a.f48140u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        InterfaceC9577i interfaceC9577i2 = (InterfaceC9577i) c14293a.f48141v;
                        C7348o.m30470b(obj2);
                        interfaceC9577i = interfaceC9577i2;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj2);
                InterfaceC9577i interfaceC9577i3 = this.f48135a;
                AbstractC12682u abstractC12682u = this.f48136b;
                boolean z10 = this.f48137c;
                Function1 function1 = this.f48138d;
                c14293a.f48141v = interfaceC9577i3;
                c14293a.f48140u = 1;
                Object objM8067e = C1525a.m8067e(abstractC12682u, true, z10, function1, c14293a);
                if (objM8067e != objM38805e) {
                    obj2 = objM8067e;
                    interfaceC9577i = interfaceC9577i3;
                }
                return objM38805e;
                c14293a.f48141v = null;
                c14293a.f48140u = 2;
            }
        }

        public a(InterfaceC9575h interfaceC9575h, AbstractC12682u abstractC12682u, boolean z10, Function1 function1) {
            this.f48131a = interfaceC9575h;
            this.f48132b = abstractC12682u;
            this.f48133c = z10;
            this.f48134d = function1;
        }

        @Override // nu.InterfaceC9575h
        @Nullable
        public Object collect(@NotNull InterfaceC9577i interfaceC9577i, @NotNull InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f48131a.collect(new C14292a(interfaceC9577i, this.f48132b, this.f48133c, this.f48134d), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <R> InterfaceC9575h<R> m50083a(@NotNull AbstractC12682u db2, boolean z10, @NotNull String[] tableNames, @NotNull Function1<? super InterfaceC5359b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(C9579j.m37794k(db2.m47279t().m6113j((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z10, block);
    }
}
