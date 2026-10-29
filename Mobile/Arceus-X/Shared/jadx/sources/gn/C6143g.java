package gn;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5690j0;
import p229jt.C7347n;
import p229jt.C7352s;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: gn.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lgn/g;", "Lgn/e;", "Lgn/j;", "idFrontAnalyzer", "Lgn/d;", "barcodePdf417Analyzer", "<init>", "(Lgn/j;Lgn/d;)V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Lgn/j;", "b", "Lgn/d;", "", "Lfn/j0$c;", "c", "Ljava/util/Map;", "analyzers", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6143g implements InterfaceC6141e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C6146j idFrontAnalyzer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6140d barcodePdf417Analyzer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC6141e, InterfaceC5690j0.c> analyzers;

    /* JADX INFO: renamed from: gn.g$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer", m39664f = "FrontOrBackAnalyzer.kt", m39665l = {27}, m39666m = "analyze-0E7RQCE")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f23488B;

        /* JADX INFO: renamed from: t */
        public Object f23489t;

        /* JADX INFO: renamed from: u */
        public Object f23490u;

        /* JADX INFO: renamed from: v */
        public Object f23491v;

        /* JADX INFO: renamed from: w */
        public Object f23492w;

        /* JADX INFO: renamed from: x */
        public Object f23493x;

        /* JADX INFO: renamed from: y */
        public Object f23494y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f23495z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23495z = obj;
            this.f23488B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo27125a = C6143g.this.mo27125a(null, null, this);
            return objMo27125a == C10047c.m38805e() ? objMo27125a : C7347n.m30459a(objMo27125a);
        }
    }

    public C6143g(@NotNull C6146j idFrontAnalyzer, @NotNull C6140d barcodePdf417Analyzer) {
        Intrinsics.checkNotNullParameter(idFrontAnalyzer, "idFrontAnalyzer");
        Intrinsics.checkNotNullParameter(barcodePdf417Analyzer, "barcodePdf417Analyzer");
        this.idFrontAnalyzer = idFrontAnalyzer;
        this.barcodePdf417Analyzer = barcodePdf417Analyzer;
        this.analyzers = C7690k0.m31798m(C7352s.m30477a(barcodePdf417Analyzer, InterfaceC5690j0.c.Back), C7352s.m30477a(idFrontAnalyzer, InterfaceC5690j0.c.Front));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gn.InterfaceC6141e
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo27125a(@org.jetbrains.annotations.NotNull p132fn.InterfaceC5719z r10, @org.jetbrains.annotations.Nullable android.graphics.Rect r11, @org.jetbrains.annotations.NotNull p315nt.InterfaceC9557b<? super p229jt.C7347n<? extends gn.AbstractC6137a>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof gn.C6143g.a
            if (r0 == 0) goto L13
            r0 = r12
            gn.g$a r0 = (gn.C6143g.a) r0
            int r1 = r0.f23488B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23488B = r1
            goto L18
        L13:
            gn.g$a r0 = new gn.g$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f23495z
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f23488B
            r3 = 1
            if (r2 == 0) goto L4f
            if (r2 != r3) goto L47
            java.lang.Object r10 = r0.f23494y
            fn.j0$c r10 = (p132fn.InterfaceC5690j0.c) r10
            java.lang.Object r11 = r0.f23493x
            gn.e r11 = (gn.InterfaceC6141e) r11
            java.lang.Object r11 = r0.f23492w
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r2 = r0.f23491v
            kotlin.jvm.internal.c0 r2 = (kotlin.jvm.internal.C7729c0) r2
            java.lang.Object r4 = r0.f23490u
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            java.lang.Object r5 = r0.f23489t
            fn.z r5 = (p132fn.InterfaceC5719z) r5
            p229jt.C7348o.m30470b(r12)
            jt.n r12 = (p229jt.C7347n) r12
            java.lang.Object r12 = r12.getValue()
            goto L9b
        L47:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4f:
            p229jt.C7348o.m30470b(r12)
            kotlin.jvm.internal.c0 r12 = new kotlin.jvm.internal.c0
            r12.<init>()
            java.util.Map<gn.e, fn.j0$c> r2 = r9.analyzers
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r8 = r12
            r12 = r11
            r11 = r2
            r2 = r8
        L65:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Lc5
            java.lang.Object r4 = r11.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            gn.e r5 = (gn.InterfaceC6141e) r5
            java.lang.Object r4 = r4.getValue()
            fn.j0$c r4 = (p132fn.InterfaceC5690j0.c) r4
            r0.f23489t = r10
            r0.f23490u = r12
            r0.f23491v = r2
            r0.f23492w = r11
            java.lang.Object r6 = pt.C10350l.m39676a(r5)
            r0.f23493x = r6
            r0.f23494y = r4
            r0.f23488B = r3
            java.lang.Object r5 = r5.mo27125a(r10, r12, r0)
            if (r5 != r1) goto L96
            return r1
        L96:
            r8 = r5
            r5 = r10
            r10 = r4
            r4 = r12
            r12 = r8
        L9b:
            boolean r6 = p229jt.C7347n.m30466h(r12)
            if (r6 == 0) goto Lb6
            r6 = r12
            gn.a r6 = (gn.AbstractC6137a) r6
            gn.a$b r7 = gn.AbstractC6137a.b.f23474a
            boolean r7 = kotlin.jvm.internal.Intrinsics.m31980c(r6, r7)
            if (r7 != 0) goto Lb6
            gn.a$c r11 = new gn.a$c
            r11.<init>(r10, r6)
            java.lang.Object r10 = p229jt.C7347n.m30460b(r11)
            return r10
        Lb6:
            java.lang.Throwable r10 = p229jt.C7347n.m30463e(r12)
            if (r10 == 0) goto Lc2
            T r12 = r2.f29425a
            if (r12 != 0) goto Lc2
            r2.f29425a = r10
        Lc2:
            r12 = r4
            r10 = r5
            goto L65
        Lc5:
            T r10 = r2.f29425a
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto Ld6
            jt.n$a r11 = p229jt.C7347n.INSTANCE
            java.lang.Object r10 = p229jt.C7348o.m30469a(r10)
            java.lang.Object r10 = p229jt.C7347n.m30460b(r10)
            return r10
        Ld6:
            jt.n$a r10 = p229jt.C7347n.INSTANCE
            gn.a$b r10 = gn.AbstractC6137a.b.f23474a
            java.lang.Object r10 = p229jt.C7347n.m30460b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.C6143g.mo27125a(fn.z, android.graphics.Rect, nt.b):java.lang.Object");
    }
}
