package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p201iu.AbstractC6980h;
import p201iu.C6981i;
import p315nt.InterfaceC9557b;
import pt.AbstractC10349k;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: kotlin.collections.s0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"", "size", "step", "", "a", "(II)V", "T", "", "iterator", "", "partialWindows", "reuseBuffer", "", "b", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7706s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.s0$a */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Liu/h;", "", "", "<anonymous>", "(Liu/h;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m39664f = "SlidingWindow.kt", m39665l = {34, 40, 49, 55, 58}, m39666m = "invokeSuspend", m39667v = 2)
    public static final class a<T> extends AbstractC10349k implements Function2<AbstractC6980h<? super List<? extends T>>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public int f29371A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f29372B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f29373C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ int f29374D;

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ Iterator<T> f29375E;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f29376F;

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ boolean f29377G;

        /* JADX INFO: renamed from: u */
        public Object f29378u;

        /* JADX INFO: renamed from: v */
        public Object f29379v;

        /* JADX INFO: renamed from: w */
        public Object f29380w;

        /* JADX INFO: renamed from: x */
        public int f29381x;

        /* JADX INFO: renamed from: y */
        public int f29382y;

        /* JADX INFO: renamed from: z */
        public int f29383z;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Iterator<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29373C = i10;
            this.f29374D = i11;
            this.f29375E = it;
            this.f29376F = z10;
            this.f29377G = z11;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f29373C, this.f29374D, this.f29375E, this.f29376F, this.f29377G, interfaceC9557b);
            aVar.f29372B = obj;
            return aVar;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x0102 */
        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:66:0x015a  */
        /* JADX WARN: Code duplicated, block: B:68:0x015e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0160  */
        /* JADX WARN: Code duplicated, block: B:74:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0186  */
        /* JADX WARN: Code duplicated, block: B:88:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x008e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x008b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x007f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:17:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0143 -> B:60:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0177 -> B:73:0x017a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x007f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f29372B
                iu.h r0 = (p201iu.AbstractC6980h) r0
                java.lang.Object r1 = p344ot.C10047c.m38805e()
                int r2 = r13.f29371A
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L61
                if (r2 == r7) goto L50
                if (r2 == r6) goto L47
                if (r2 == r5) goto L36
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
                java.lang.Object r0 = r13.f29378u
                kotlin.collections.o0 r0 = (kotlin.collections.C7698o0) r0
                goto L4b
            L21:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L29:
                int r2 = r13.f29382y
                int r5 = r13.f29381x
                java.lang.Object r6 = r13.f29378u
                kotlin.collections.o0 r6 = (kotlin.collections.C7698o0) r6
                p229jt.C7348o.m30470b(r14)
                goto L17a
            L36:
                int r2 = r13.f29382y
                int r6 = r13.f29381x
                java.lang.Object r7 = r13.f29379v
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r9 = r13.f29378u
                kotlin.collections.o0 r9 = (kotlin.collections.C7698o0) r9
                p229jt.C7348o.m30470b(r14)
                goto L146
            L47:
                java.lang.Object r0 = r13.f29378u
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L4b:
                p229jt.C7348o.m30470b(r14)
                goto L1a3
            L50:
                int r2 = r13.f29382y
                int r3 = r13.f29381x
                java.lang.Object r4 = r13.f29379v
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r13.f29378u
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                p229jt.C7348o.m30470b(r14)
            L5f:
                r14 = r2
                goto Lb5
            L61:
                p229jt.C7348o.m30470b(r14)
                int r14 = r13.f29373C
                r2 = 1024(0x400, float:1.435E-42)
                int r14 = kotlin.ranges.C7764d.m32081f(r14, r2)
                int r2 = r13.f29374D
                int r9 = r13.f29373C
                int r2 = r2 - r9
                if (r2 < 0) goto Lf9
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r14)
                java.util.Iterator<T> r4 = r13.f29375E
                r5 = 0
                r12 = r3
                r3 = r14
                r14 = r5
                r5 = r12
            L7f:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto Lc7
                java.lang.Object r9 = r4.next()
                if (r14 <= 0) goto L8e
                int r14 = r14 + (-1)
                goto L7f
            L8e:
                r5.add(r9)
                int r10 = r5.size()
                int r11 = r13.f29373C
                if (r10 != r11) goto L7f
                r13.f29372B = r0
                r13.f29378u = r5
                r13.f29379v = r4
                java.lang.Object r9 = pt.C10350l.m39676a(r9)
                r13.f29380w = r9
                r13.f29381x = r3
                r13.f29382y = r2
                r13.f29383z = r14
                r13.f29371A = r7
                java.lang.Object r14 = r0.mo29366a(r5, r13)
                if (r14 != r1) goto L5f
                goto L1a2
            Lb5:
                boolean r2 = r13.f29376F
                if (r2 == 0) goto Lbd
                r5.clear()
                goto Lc5
            Lbd:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r5 = r13.f29373C
                r2.<init>(r5)
                r5 = r2
            Lc5:
                r2 = r14
                goto L7f
            Lc7:
                boolean r4 = r5.isEmpty()
                if (r4 != 0) goto L1a3
                boolean r4 = r13.f29377G
                if (r4 != 0) goto Ld9
                int r4 = r5.size()
                int r7 = r13.f29373C
                if (r4 != r7) goto L1a3
            Ld9:
                java.lang.Object r4 = pt.C10350l.m39676a(r0)
                r13.f29372B = r4
                java.lang.Object r4 = pt.C10350l.m39676a(r5)
                r13.f29378u = r4
                r13.f29379v = r8
                r13.f29380w = r8
                r13.f29381x = r3
                r13.f29382y = r2
                r13.f29383z = r14
                r13.f29371A = r6
                java.lang.Object r14 = r0.mo29366a(r5, r13)
                if (r14 != r1) goto L1a3
                goto L1a2
            Lf9:
                kotlin.collections.o0 r6 = new kotlin.collections.o0
                r6.<init>(r14)
                java.util.Iterator<T> r7 = r13.f29375E
                r9 = r6
                r6 = r14
            L102:
                boolean r14 = r7.hasNext()
                if (r14 == 0) goto L14c
                java.lang.Object r14 = r7.next()
                r9.m31883g(r14)
                boolean r10 = r9.m31885k()
                if (r10 == 0) goto L102
                int r10 = r9.size()
                int r11 = r13.f29373C
                if (r10 >= r11) goto L122
                kotlin.collections.o0 r9 = r9.m31884i(r11)
                goto L102
            L122:
                boolean r10 = r13.f29376F
                if (r10 == 0) goto L128
                r10 = r9
                goto L12d
            L128:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>(r9)
            L12d:
                r13.f29372B = r0
                r13.f29378u = r9
                r13.f29379v = r7
                java.lang.Object r14 = pt.C10350l.m39676a(r14)
                r13.f29380w = r14
                r13.f29381x = r6
                r13.f29382y = r2
                r13.f29371A = r5
                java.lang.Object r14 = r0.mo29366a(r10, r13)
                if (r14 != r1) goto L146
                goto L1a2
            L146:
                int r14 = r13.f29374D
                r9.m31886l(r14)
                goto L102
            L14c:
                boolean r14 = r13.f29377G
                if (r14 == 0) goto L1a3
                r5 = r6
                r6 = r9
            L152:
                int r14 = r6.size()
                int r7 = r13.f29374D
                if (r14 <= r7) goto L180
                boolean r14 = r13.f29376F
                if (r14 == 0) goto L160
                r14 = r6
                goto L165
            L160:
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>(r6)
            L165:
                r13.f29372B = r0
                r13.f29378u = r6
                r13.f29379v = r8
                r13.f29380w = r8
                r13.f29381x = r5
                r13.f29382y = r2
                r13.f29371A = r4
                java.lang.Object r14 = r0.mo29366a(r14, r13)
                if (r14 != r1) goto L17a
                goto L1a2
            L17a:
                int r14 = r13.f29374D
                r6.m31886l(r14)
                goto L152
            L180:
                boolean r14 = r6.isEmpty()
                if (r14 != 0) goto L1a3
                java.lang.Object r14 = pt.C10350l.m39676a(r0)
                r13.f29372B = r14
                java.lang.Object r14 = pt.C10350l.m39676a(r6)
                r13.f29378u = r14
                r13.f29379v = r8
                r13.f29380w = r8
                r13.f29381x = r5
                r13.f29382y = r2
                r13.f29371A = r3
                java.lang.Object r14 = r0.mo29366a(r6, r13)
                if (r14 != r1) goto L1a3
            L1a2:
                return r1
            L1a3:
                kotlin.Unit r14 = kotlin.Unit.f29331a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C7706s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6980h<? super List<? extends T>> abstractC6980h, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(abstractC6980h, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m31915a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> Iterator<List<T>> m31916b(@NotNull Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? C7712y.f29385a : C6981i.m29372a(new a(i10, i11, iterator, z11, z10, null));
    }
}
