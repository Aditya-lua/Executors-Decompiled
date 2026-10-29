package p353p6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: p6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0080@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lp6/a$b;", "result", "Lx6/g;", "request", "Lx6/p;", "options", "Lk6/j;", "eventListener", "Le7/u;", "logger", "a", "(Lp6/a$b;Lx6/g;Lx6/p;Lk6/j;Le7/u;Lnt/b;)Ljava/lang/Object;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10166b {

    /* JADX INFO: renamed from: p6.b$a */
    @InterfaceC10344f(m39663c = "coil3.intercept.EngineInterceptorKt", m39664f = "EngineInterceptor.kt", m39665l = {259}, m39666m = "transform")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f36707A;

        /* JADX INFO: renamed from: B */
        public Object f36708B;

        /* JADX INFO: renamed from: C */
        public Object f36709C;

        /* JADX INFO: renamed from: D */
        public Object f36710D;

        /* JADX INFO: renamed from: E */
        public Object f36711E;

        /* JADX INFO: renamed from: F */
        public Object f36712F;

        /* JADX INFO: renamed from: G */
        public int f36713G;

        /* JADX INFO: renamed from: H */
        public int f36714H;

        /* JADX INFO: renamed from: I */
        public int f36715I;

        /* JADX INFO: renamed from: J */
        public int f36716J;

        /* JADX INFO: renamed from: K */
        public /* synthetic */ Object f36717K;

        /* JADX INFO: renamed from: L */
        public int f36718L;

        /* JADX INFO: renamed from: t */
        public Object f36719t;

        /* JADX INFO: renamed from: u */
        public Object f36720u;

        /* JADX INFO: renamed from: v */
        public Object f36721v;

        /* JADX INFO: renamed from: w */
        public Object f36722w;

        /* JADX INFO: renamed from: x */
        public Object f36723x;

        /* JADX INFO: renamed from: y */
        public Object f36724y;

        /* JADX INFO: renamed from: z */
        public Object f36725z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36717K = obj;
            this.f36718L |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C10166b.m39173a(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0153 -> B:32:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m39173a(@org.jetbrains.annotations.NotNull p353p6.C10165a.ExecuteResult r23, @org.jetbrains.annotations.NotNull p537x6.ImageRequest r24, @org.jetbrains.annotations.NotNull p537x6.Options r25, @org.jetbrains.annotations.NotNull p239k6.AbstractC7469j r26, @org.jetbrains.annotations.Nullable p096e7.InterfaceC4875u r27, @org.jetbrains.annotations.NotNull p315nt.InterfaceC9557b<? super p353p6.C10165a.ExecuteResult> r28) {
        /*
            r0 = r27
            r1 = r28
            boolean r2 = r1 instanceof p353p6.C10166b.a
            if (r2 == 0) goto L17
            r2 = r1
            p6.b$a r2 = (p353p6.C10166b.a) r2
            int r3 = r2.f36718L
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f36718L = r3
            goto L1c
        L17:
            p6.b$a r2 = new p6.b$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f36717K
            java.lang.Object r3 = p344ot.C10047c.m38805e()
            int r4 = r2.f36718L
            r7 = 1
            if (r4 == 0) goto L7d
            if (r4 != r7) goto L75
            int r0 = r2.f36715I
            int r4 = r2.f36714H
            int r8 = r2.f36713G
            java.lang.Object r9 = r2.f36712F
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.Object r9 = r2.f36711E
            c7.c r9 = (p043c7.AbstractC1553c) r9
            java.lang.Object r9 = r2.f36710D
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.Object r9 = r2.f36709C
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.Object r10 = r2.f36708B
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.f36707A
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r12 = r2.f36725z
            k6.n r12 = (p239k6.InterfaceC7474n) r12
            java.lang.Object r13 = r2.f36724y
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.f36723x
            e7.u r14 = (p096e7.InterfaceC4875u) r14
            java.lang.Object r15 = r2.f36722w
            k6.j r15 = (p239k6.AbstractC7469j) r15
            java.lang.Object r7 = r2.f36721v
            x6.p r7 = (p537x6.Options) r7
            java.lang.Object r6 = r2.f36720u
            x6.g r6 = (p537x6.ImageRequest) r6
            java.lang.Object r5 = r2.f36719t
            p6.a$b r5 = (p353p6.C10165a.ExecuteResult) r5
            p229jt.C7348o.m30470b(r1)
            r16 = r5
            r5 = r7
            r7 = r6
            r6 = r12
            r12 = r10
            r10 = r8
            r8 = r15
            r15 = r13
            r13 = r11
            r11 = r9
            r9 = r0
            r0 = 1
            goto L158
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L7d:
            p229jt.C7348o.m30470b(r1)
            java.util.List r1 = p537x6.C12748i.m47580h(r24)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L8b
            return r23
        L8b:
            k6.n r4 = r23.getImage()
            boolean r5 = r4 instanceof p239k6.BitmapImage
            if (r5 != 0) goto Ld4
            boolean r5 = p537x6.C12748i.m47577e(r24)
            if (r5 != 0) goto Ld4
            if (r0 == 0) goto Ld3
            e7.u$a r1 = p096e7.InterfaceC4875u.a.Info
            e7.u$a r2 = r0.m23484a()
            int r2 = r2.compareTo(r1)
            if (r2 > 0) goto Ld3
            k6.n r2 = r23.getImage()
            java.lang.Class r2 = r2.getClass()
            hu.c r2 = kotlin.jvm.internal.C7731d0.m32002b(r2)
            java.lang.String r2 = r2.mo28427g()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "allowConversionToBitmap=false, skipping transformations for type "
            r3.append(r4)
            r3.append(r2)
            r2 = 46
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "EngineInterceptor"
            r4 = 0
            r0.m23485b(r3, r1, r2, r4)
        Ld3:
            return r23
        Ld4:
            r5 = r25
            android.graphics.Bitmap r6 = p353p6.C10167c.m39174a(r4, r5, r1, r0)
            r7 = r24
            r8 = r26
            r8.m31047p(r7, r6)
            r9 = r1
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r12 = r1
            r15 = r12
            r14 = r4
            r11 = r6
            r13 = r11
            r4 = 0
            r10 = 0
            r1 = r0
            r0 = r23
        Lf2:
            if (r4 >= r9) goto L169
            java.lang.Object r16 = r12.get(r4)
            r23 = r1
            r1 = r16
            c7.c r1 = (p043c7.AbstractC1553c) r1
            r24 = r11
            y6.g r11 = r5.getSize()
            r2.f36719t = r0
            r2.f36720u = r7
            r2.f36721v = r5
            r2.f36722w = r8
            r16 = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r23)
            r2.f36723x = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r15)
            r2.f36724y = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r14)
            r2.f36725z = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r13)
            r2.f36707A = r0
            r2.f36708B = r12
            java.lang.Object r0 = pt.C10350l.m39676a(r24)
            r2.f36709C = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r6)
            r2.f36710D = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r1)
            r2.f36711E = r0
            java.lang.Object r0 = pt.C10350l.m39676a(r6)
            r2.f36712F = r0
            r2.f36713G = r10
            r2.f36714H = r4
            r2.f36715I = r9
            r0 = 0
            r2.f36716J = r0
            r0 = 1
            r2.f36718L = r0
            java.lang.Object r1 = r1.mo8145b(r6, r11, r2)
            if (r1 != r3) goto L153
            return r3
        L153:
            r11 = r24
            r6 = r14
            r14 = r23
        L158:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            kotlin.coroutines.CoroutineContext r17 = r2.getContext()
            p256ku.C7865g2.m32652f(r17)
            int r4 = r4 + r0
            r0 = r6
            r6 = r1
            r1 = r14
            r14 = r0
            r0 = r16
            goto Lf2
        L169:
            r16 = r0
            r0 = 1
            r8.m31046o(r7, r6)
            r1 = 0
            r4 = 0
            k6.a r17 = p239k6.C7482v.m31089d(r6, r1, r0, r4)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            p6.a$b r0 = p353p6.C10165a.ExecuteResult.m39167b(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p353p6.C10166b.m39173a(p6.a$b, x6.g, x6.p, k6.j, e7.u, nt.b):java.lang.Object");
    }
}
