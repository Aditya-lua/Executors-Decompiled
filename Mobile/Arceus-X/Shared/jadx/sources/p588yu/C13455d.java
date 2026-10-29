package p588yu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7685i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.AbstractC6980h;
import p201iu.C6981i;
import p229jt.C7328a;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p560xu.AbstractC12938l;
import p560xu.C12919b0;
import p560xu.C12931h0;
import p560xu.C12936k;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12951r0;
import pt.AbstractC10342d;
import pt.AbstractC10349k;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: yu.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Lxu/l;", "Lxu/h0;", "path", "Lxu/k;", "g", "(Lxu/l;Lxu/h0;)Lxu/k;", "", "e", "(Lxu/l;Lxu/h0;)Z", "dir", "mustCreate", "", "c", "(Lxu/l;Lxu/h0;Z)V", Payload.SOURCE, "target", "b", "(Lxu/l;Lxu/h0;Lxu/h0;)V", "fileOrDirectory", "mustExist", "d", "followSymlinks", "Lkotlin/sequences/Sequence;", "f", "(Lxu/l;Lxu/h0;Z)Lkotlin/sequences/Sequence;", "Liu/h;", "fileSystem", "Lkotlin/collections/i;", "stack", "postorder", "a", "(Liu/h;Lxu/l;Lkotlin/collections/i;Lxu/h0;ZZLnt/b;)Ljava/lang/Object;", "h", "(Lxu/l;Lxu/h0;)Lxu/h0;", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13455d {

    /* JADX INFO: renamed from: yu.d$a */
    @InterfaceC10344f(m39663c = "okio.internal.-FileSystem", m39664f = "FileSystem.kt", m39665l = {116, 135, 145}, m39666m = "collectRecursively", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f47099A;

        /* JADX INFO: renamed from: B */
        public boolean f47100B;

        /* JADX INFO: renamed from: C */
        public boolean f47101C;

        /* JADX INFO: renamed from: D */
        public int f47102D;

        /* JADX INFO: renamed from: E */
        public /* synthetic */ Object f47103E;

        /* JADX INFO: renamed from: F */
        public int f47104F;

        /* JADX INFO: renamed from: t */
        public Object f47105t;

        /* JADX INFO: renamed from: u */
        public Object f47106u;

        /* JADX INFO: renamed from: v */
        public Object f47107v;

        /* JADX INFO: renamed from: w */
        public Object f47108w;

        /* JADX INFO: renamed from: x */
        public Object f47109x;

        /* JADX INFO: renamed from: y */
        public Object f47110y;

        /* JADX INFO: renamed from: z */
        public Object f47111z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47103E = obj;
            this.f47104F |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13455d.m49067a(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: yu.d$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Liu/h;", "Lxu/h0;", "", "<anonymous>", "(Liu/h;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m39664f = "FileSystem.kt", m39665l = {75}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10349k implements Function2<AbstractC6980h<? super C12931h0>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: u */
        public int f47112u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f47113v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC12938l f47114w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C12931h0 f47115x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC12938l abstractC12938l, C12931h0 c12931h0, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f47114w = abstractC12938l;
            this.f47115x = c12931h0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f47114w, this.f47115x, interfaceC9557b);
            bVar.f47113v = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            AbstractC6980h abstractC6980h = (AbstractC6980h) this.f47113v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f47112u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AbstractC12938l abstractC12938l = this.f47114w;
                C7685i c7685i = new C7685i();
                C12931h0 c12931h0 = this.f47115x;
                this.f47113v = C10350l.m39676a(abstractC6980h);
                this.f47112u = 1;
                if (C13455d.m49067a(abstractC6980h, abstractC12938l, c7685i, c12931h0, false, true, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6980h<? super C12931h0> abstractC6980h, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(abstractC6980h, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: yu.d$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Liu/h;", "Lxu/h0;", "", "<anonymous>", "(Liu/h;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "okio.internal.-FileSystem$commonListRecursively$1", m39664f = "FileSystem.kt", m39665l = {96}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10349k implements Function2<AbstractC6980h<? super C12931h0>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ AbstractC12938l f47116A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ boolean f47117B;

        /* JADX INFO: renamed from: u */
        public Object f47118u;

        /* JADX INFO: renamed from: v */
        public Object f47119v;

        /* JADX INFO: renamed from: w */
        public Object f47120w;

        /* JADX INFO: renamed from: x */
        public int f47121x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f47122y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ C12931h0 f47123z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12931h0 c12931h0, AbstractC12938l abstractC12938l, boolean z10, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f47123z = c12931h0;
            this.f47116A = abstractC12938l;
            this.f47117B = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = new c(this.f47123z, this.f47116A, this.f47117B, interfaceC9557b);
            cVar.f47122y = obj;
            return cVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Iterator<C12931h0> it;
            C7685i c7685i;
            AbstractC6980h abstractC6980h = (AbstractC6980h) this.f47122y;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f47121x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C7685i c7685i2 = new C7685i();
                c7685i2.addLast(this.f47123z);
                it = this.f47116A.list(this.f47123z).iterator();
                c7685i = c7685i2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f47119v;
                c7685i = (C7685i) this.f47118u;
                C7348o.m30470b(obj);
            }
            Iterator<C12931h0> it2 = it;
            while (it2.hasNext()) {
                C12931h0 next = it2.next();
                AbstractC12938l abstractC12938l = this.f47116A;
                boolean z10 = this.f47117B;
                this.f47122y = abstractC6980h;
                this.f47118u = c7685i;
                this.f47119v = it2;
                this.f47120w = C10350l.m39676a(next);
                this.f47121x = 1;
                if (C13455d.m49067a(abstractC6980h, abstractC12938l, c7685i, next, z10, false, this) == objM38805e) {
                    return objM38805e;
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6980h<? super C12931h0> abstractC6980h, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(abstractC6980h, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0112 */
    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #2 {all -> 0x017e, blocks: (B:49:0x0121, B:51:0x0127), top: B:81:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [iu.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [iu.h, iu.h<? super xu.h0>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [iu.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0173 -> B:19:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m49067a(@org.jetbrains.annotations.NotNull p201iu.AbstractC6980h<? super p560xu.C12931h0> r17, @org.jetbrains.annotations.NotNull p560xu.AbstractC12938l r18, @org.jetbrains.annotations.NotNull kotlin.collections.C7685i<p560xu.C12931h0> r19, @org.jetbrains.annotations.NotNull p560xu.C12931h0 r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull p315nt.InterfaceC9557b<? super kotlin.Unit> r23) {
        /*
            r0 = r17
            r1 = r20
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof p588yu.C13455d.a
            if (r4 == 0) goto L1b
            r4 = r3
            yu.d$a r4 = (p588yu.C13455d.a) r4
            int r5 = r4.f47104F
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f47104F = r5
            goto L20
        L1b:
            yu.d$a r4 = new yu.d$a
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.f47103E
            java.lang.Object r5 = p344ot.C10047c.m38805e()
            int r6 = r4.f47104F
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto Laa
            if (r6 == r9) goto L8c
            if (r6 == r8) goto L54
            if (r6 != r7) goto L4c
            java.lang.Object r0 = r4.f47109x
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r4.f47108w
            xu.h0 r0 = (p560xu.C12931h0) r0
            java.lang.Object r0 = r4.f47107v
            kotlin.collections.i r0 = (kotlin.collections.C7685i) r0
            java.lang.Object r0 = r4.f47106u
            xu.l r0 = (p560xu.AbstractC12938l) r0
            java.lang.Object r0 = r4.f47105t
            iu.h r0 = (p201iu.AbstractC6980h) r0
            p229jt.C7348o.m30470b(r3)
            goto L1ce
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L54:
            int r0 = r4.f47102D
            boolean r1 = r4.f47101C
            boolean r2 = r4.f47100B
            java.lang.Object r6 = r4.f47099A
            xu.h0 r6 = (p560xu.C12931h0) r6
            java.lang.Object r6 = r4.f47111z
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r9 = r4.f47110y
            xu.h0 r9 = (p560xu.C12931h0) r9
            java.lang.Object r10 = r4.f47109x
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r4.f47108w
            xu.h0 r11 = (p560xu.C12931h0) r11
            java.lang.Object r12 = r4.f47107v
            kotlin.collections.i r12 = (kotlin.collections.C7685i) r12
            java.lang.Object r13 = r4.f47106u
            xu.l r13 = (p560xu.AbstractC12938l) r13
            java.lang.Object r14 = r4.f47105t
            iu.h r14 = (p201iu.AbstractC6980h) r14
            p229jt.C7348o.m30470b(r3)     // Catch: java.lang.Throwable -> L89
            r3 = r11
            r11 = r0
            r0 = r2
            r2 = r1
            r1 = r12
            r12 = r9
            r9 = r13
            r13 = r3
            r3 = r10
        L86:
            r10 = r14
            goto L121
        L89:
            r0 = move-exception
            goto L191
        L8c:
            boolean r0 = r4.f47101C
            boolean r1 = r4.f47100B
            java.lang.Object r2 = r4.f47108w
            xu.h0 r2 = (p560xu.C12931h0) r2
            java.lang.Object r6 = r4.f47107v
            kotlin.collections.i r6 = (kotlin.collections.C7685i) r6
            java.lang.Object r9 = r4.f47106u
            xu.l r9 = (p560xu.AbstractC12938l) r9
            java.lang.Object r10 = r4.f47105t
            iu.h r10 = (p201iu.AbstractC6980h) r10
            p229jt.C7348o.m30470b(r3)
            r16 = r2
            r2 = r0
            r0 = r1
            r1 = r16
            goto Ld5
        Laa:
            p229jt.C7348o.m30470b(r3)
            if (r2 != 0) goto Lcb
            r4.f47105t = r0
            r3 = r18
            r4.f47106u = r3
            r6 = r19
            r4.f47107v = r6
            r4.f47108w = r1
            r10 = r21
            r4.f47100B = r10
            r4.f47101C = r2
            r4.f47104F = r9
            java.lang.Object r9 = r0.mo29366a(r1, r4)
            if (r9 != r5) goto Ld1
            goto L1cd
        Lcb:
            r3 = r18
            r6 = r19
            r10 = r21
        Ld1:
            r9 = r10
            r10 = r0
            r0 = r9
            r9 = r3
        Ld5:
            java.util.List r3 = r9.listOrNull(r1)
            if (r3 != 0) goto Ldf
            java.util.List r3 = kotlin.collections.C7699p.m31892k()
        Ldf:
            r11 = r3
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L19a
            r11 = 0
            r12 = r1
        Lea:
            if (r0 == 0) goto L10a
            boolean r13 = r6.contains(r12)
            if (r13 != 0) goto Lf3
            goto L10a
        Lf3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "symlink cycle at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L10a:
            xu.h0 r13 = m49074h(r9, r12)
            if (r13 != 0) goto L195
            if (r0 != 0) goto L114
            if (r11 != 0) goto L19a
        L114:
            r6.addLast(r12)
            java.util.Iterator r13 = r3.iterator()     // Catch: java.lang.Throwable -> L18f
            r16 = r13
            r13 = r1
            r1 = r6
            r6 = r16
        L121:
            boolean r14 = r6.hasNext()     // Catch: java.lang.Throwable -> L17e
            if (r14 == 0) goto L181
            java.lang.Object r14 = r6.next()     // Catch: java.lang.Throwable -> L17e
            xu.h0 r14 = (p560xu.C12931h0) r14     // Catch: java.lang.Throwable -> L17e
            r4.f47105t = r10     // Catch: java.lang.Throwable -> L17e
            r4.f47106u = r9     // Catch: java.lang.Throwable -> L17e
            r4.f47107v = r1     // Catch: java.lang.Throwable -> L17e
            r4.f47108w = r13     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r15 = pt.C10350l.m39676a(r3)     // Catch: java.lang.Throwable -> L17e
            r4.f47109x = r15     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r15 = pt.C10350l.m39676a(r12)     // Catch: java.lang.Throwable -> L17e
            r4.f47110y = r15     // Catch: java.lang.Throwable -> L17e
            r4.f47111z = r6     // Catch: java.lang.Throwable -> L17e
            java.lang.Object r15 = pt.C10350l.m39676a(r14)     // Catch: java.lang.Throwable -> L17e
            r4.f47099A = r15     // Catch: java.lang.Throwable -> L17e
            r4.f47100B = r0     // Catch: java.lang.Throwable -> L17e
            r4.f47101C = r2     // Catch: java.lang.Throwable -> L17e
            r4.f47102D = r11     // Catch: java.lang.Throwable -> L17e
            r4.f47104F = r8     // Catch: java.lang.Throwable -> L17e
            r21 = r0
            r19 = r1
            r22 = r2
            r23 = r4
            r18 = r9
            r17 = r10
            r20 = r14
            java.lang.Object r0 = m49067a(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L179
            r14 = r17
            r10 = r18
            r9 = r19
            r2 = r21
            r1 = r22
            r4 = r23
            if (r0 != r5) goto L173
            goto L1cd
        L173:
            r0 = r2
            r2 = r1
            r1 = r9
            r9 = r10
            goto L86
        L179:
            r0 = move-exception
            r9 = r19
        L17c:
            r12 = r9
            goto L191
        L17e:
            r0 = move-exception
            r9 = r1
            goto L17c
        L181:
            r14 = r10
            r10 = r9
            r9 = r1
            r1 = r2
            r2 = r0
            r9.removeLast()
            r6 = r9
            r9 = r10
            r10 = r14
            r2 = r1
            r1 = r13
            goto L19a
        L18f:
            r0 = move-exception
            r12 = r6
        L191:
            r12.removeLast()
            throw r0
        L195:
            int r11 = r11 + 1
            r12 = r13
            goto Lea
        L19a:
            if (r2 == 0) goto L1d1
            java.lang.Object r8 = pt.C10350l.m39676a(r10)
            r4.f47105t = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r9)
            r4.f47106u = r8
            java.lang.Object r6 = pt.C10350l.m39676a(r6)
            r4.f47107v = r6
            java.lang.Object r6 = pt.C10350l.m39676a(r1)
            r4.f47108w = r6
            java.lang.Object r3 = pt.C10350l.m39676a(r3)
            r4.f47109x = r3
            r3 = 0
            r4.f47110y = r3
            r4.f47111z = r3
            r4.f47099A = r3
            r4.f47100B = r0
            r4.f47101C = r2
            r4.f47104F = r7
            java.lang.Object r0 = r10.mo29366a(r1, r4)
            if (r0 != r5) goto L1ce
        L1cd:
            return r5
        L1ce:
            kotlin.Unit r0 = kotlin.Unit.f29331a
            return r0
        L1d1:
            kotlin.Unit r0 = kotlin.Unit.f29331a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p588yu.C13455d.m49067a(iu.h, xu.l, kotlin.collections.i, xu.h0, boolean, boolean, nt.b):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final void m49068b(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 source, @NotNull C12931h0 target) {
        Throwable th2;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        InterfaceC12951r0 interfaceC12951r0Source = abstractC12938l.source(source);
        Throwable th3 = null;
        try {
            InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(AbstractC12938l.sink$default(abstractC12938l, target, false, 2, null));
            try {
                lValueOf = Long.valueOf(interfaceC12926fM47960b.mo48028g2(interfaceC12951r0Source));
                if (interfaceC12926fM47960b != null) {
                    try {
                        interfaceC12926fM47960b.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (interfaceC12926fM47960b != null) {
                    try {
                        interfaceC12926fM47960b.close();
                    } catch (Throwable th6) {
                        C7328a.m30429a(th5, th6);
                    }
                }
                th2 = th5;
                lValueOf = null;
            }
            if (th2 != null) {
                throw th2;
            }
            lValueOf.longValue();
            if (interfaceC12951r0Source != null) {
                try {
                    interfaceC12951r0Source.close();
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            if (th3 != null) {
                throw th3;
            }
        } catch (Throwable th8) {
            if (interfaceC12951r0Source != null) {
                try {
                    interfaceC12951r0Source.close();
                } catch (Throwable th9) {
                    C7328a.m30429a(th8, th9);
                }
            }
            th3 = th8;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m49069c(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        C7685i c7685i = new C7685i();
        for (C12931h0 c12931h0M48127j = dir; c12931h0M48127j != null && !abstractC12938l.exists(c12931h0M48127j); c12931h0M48127j = c12931h0M48127j.m48127j()) {
            c7685i.addFirst(c12931h0M48127j);
        }
        if (z10 && c7685i.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c7685i.iterator();
        while (it.hasNext()) {
            AbstractC12938l.createDirectory$default(abstractC12938l, (C12931h0) it.next(), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m49070d(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 fileOrDirectory, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = C6981i.m29373b(new b(abstractC12938l, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            abstractC12938l.delete((C12931h0) it.next(), z10 && !it.hasNext());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m49071e(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return abstractC12938l.metadataOrNull(path) != null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Sequence<C12931h0> m49072f(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return C6981i.m29373b(new c(dir, abstractC12938l, z10, null));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C12936k m49073g(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C12936k c12936kMetadataOrNull = abstractC12938l.metadataOrNull(path);
        if (c12936kMetadataOrNull != null) {
            return c12936kMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final C12931h0 m49074h(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(abstractC12938l, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C12931h0 symlinkTarget = abstractC12938l.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        C12931h0 c12931h0M48127j = path.m48127j();
        Intrinsics.checkNotNull(c12931h0M48127j);
        return c12931h0M48127j.m48130o(symlinkTarget);
    }
}
