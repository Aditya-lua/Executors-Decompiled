package gn;

import fn.j0;
import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lgn/g;", "Lgn/e;", "Lgn/j;", "idFrontAnalyzer", "Lgn/d;", "barcodePdf417Analyzer", "<init>", "(Lgn/j;Lgn/d;)V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Lgn/j;", "b", "Lgn/d;", "", "Lfn/j0$c;", "c", "Ljava/util/Map;", "analyzers", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j idFrontAnalyzer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d barcodePdf417Analyzer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<e, j0.c> analyzers;

    @pt.f(c = "com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer", f = "FrontOrBackAnalyzer.kt", l = {27}, m = "analyze-0E7RQCE")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f18263t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f18264u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f18265v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f18266w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f18267x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f18268y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f18269z;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18269z = obj;
            this.B |= Integer.MIN_VALUE;
            Object objA = g.this.a(null, null, this);
            return objA == ot.c.e() ? objA : jt.n.a(objA);
        }
    }

    public g(@NotNull j idFrontAnalyzer, @NotNull d barcodePdf417Analyzer) {
        Intrinsics.checkNotNullParameter(idFrontAnalyzer, "idFrontAnalyzer");
        Intrinsics.checkNotNullParameter(barcodePdf417Analyzer, "barcodePdf417Analyzer");
        this.idFrontAnalyzer = idFrontAnalyzer;
        this.barcodePdf417Analyzer = barcodePdf417Analyzer;
        this.analyzers = k0.m(s.a(barcodePdf417Analyzer, j0.c.Back), s.a(idFrontAnalyzer, j0.c.Front));
    }

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
    @Override // gn.e
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull fn.z r10, @org.jetbrains.annotations.Nullable android.graphics.Rect r11, @org.jetbrains.annotations.NotNull nt.b<? super jt.n<? extends gn.a>> r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.g.a(fn.z, android.graphics.Rect, nt.b):java.lang.Object");
    }
}
