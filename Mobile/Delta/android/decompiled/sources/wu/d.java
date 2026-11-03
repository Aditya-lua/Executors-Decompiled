package wu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vu.b0;
import vu.h0;
import vu.r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvu/l;", "Lvu/h0;", "path", "Lvu/k;", "g", "(Lvu/l;Lvu/h0;)Lvu/k;", "", "e", "(Lvu/l;Lvu/h0;)Z", "dir", "mustCreate", "", "c", "(Lvu/l;Lvu/h0;Z)V", Payload.SOURCE, "target", "b", "(Lvu/l;Lvu/h0;Lvu/h0;)V", "fileOrDirectory", "mustExist", "d", "followSymlinks", "Lkotlin/sequences/Sequence;", "f", "(Lvu/l;Lvu/h0;Z)Lkotlin/sequences/Sequence;", "Lgu/h;", "fileSystem", "Lkotlin/collections/i;", "stack", "postorder", "a", "(Lgu/h;Lvu/l;Lkotlin/collections/i;Lvu/h0;ZZLlt/b;)Ljava/lang/Object;", "h", "(Lvu/l;Lvu/h0;)Lvu/h0;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @nt.f(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {
        public Object A;
        public boolean B;
        public boolean C;
        public int D;
        public /* synthetic */ Object E;
        public int F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f34982t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f34983u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f34984v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f34985w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f34986x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f34987y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f34988z;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.E = obj;
            this.F |= Integer.MIN_VALUE;
            return d.a(null, null, null, null, false, false, this);
        }
    }

    @nt.f(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu/h;", "Lvu/h0;", "", "<anonymous>", "(Lgu/h;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.k implements Function2<gu.h<? super h0>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f34989u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f34990v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ vu.l f34991w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ h0 f34992x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vu.l lVar, h0 h0Var, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f34991w = lVar;
            this.f34992x = h0Var;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = new b(this.f34991w, this.f34992x, bVar);
            bVar2.f34990v = obj;
            return bVar2;
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            gu.h hVar = (gu.h) this.f34990v;
            Object objE = mt.c.e();
            int i10 = this.f34989u;
            if (i10 == 0) {
                gt.o.b(obj);
                vu.l lVar = this.f34991w;
                kotlin.collections.i iVar = new kotlin.collections.i();
                h0 h0Var = this.f34992x;
                this.f34990v = nt.l.a(hVar);
                this.f34989u = 1;
                if (d.a(hVar, lVar, iVar, h0Var, false, true, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gu.h<? super h0> hVar, lt.b<? super Unit> bVar) {
            return ((b) create(hVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu/h;", "Lvu/h0;", "", "<anonymous>", "(Lgu/h;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.k implements Function2<gu.h<? super h0>, lt.b<? super Unit>, Object> {
        public final /* synthetic */ vu.l A;
        public final /* synthetic */ boolean B;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f34993u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f34994v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f34995w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f34996x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f34997y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h0 f34998z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0 h0Var, vu.l lVar, boolean z10, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f34998z = h0Var;
            this.A = lVar;
            this.B = z10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = new c(this.f34998z, this.A, this.B, bVar);
            cVar.f34997y = obj;
            return cVar;
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Iterator<h0> it;
            kotlin.collections.i iVar;
            gu.h hVar = (gu.h) this.f34997y;
            Object objE = mt.c.e();
            int i10 = this.f34996x;
            if (i10 == 0) {
                gt.o.b(obj);
                kotlin.collections.i iVar2 = new kotlin.collections.i();
                iVar2.addLast(this.f34998z);
                it = this.A.list(this.f34998z).iterator();
                iVar = iVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f34994v;
                iVar = (kotlin.collections.i) this.f34993u;
                gt.o.b(obj);
            }
            Iterator<h0> it2 = it;
            while (it2.hasNext()) {
                h0 next = it2.next();
                vu.l lVar = this.A;
                boolean z10 = this.B;
                this.f34997y = hVar;
                this.f34993u = iVar;
                this.f34994v = it2;
                this.f34995w = nt.l.a(next);
                this.f34996x = 1;
                if (d.a(hVar, lVar, iVar, next, z10, false, this) == objE) {
                    return objE;
                }
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gu.h<? super h0> hVar, lt.b<? super Unit> bVar) {
            return ((c) create(hVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #2 {all -> 0x017e, blocks: (B:49:0x0121, B:51:0x0127), top: B:81:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [gu.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [gu.h, gu.h<? super vu.h0>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [gu.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0173 -> B:19:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull gu.h<? super vu.h0> r17, @org.jetbrains.annotations.NotNull vu.l r18, @org.jetbrains.annotations.NotNull kotlin.collections.i<vu.h0> r19, @org.jetbrains.annotations.NotNull vu.h0 r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull lt.b<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.d.a(gu.h, vu.l, kotlin.collections.i, vu.h0, boolean, boolean, lt.b):java.lang.Object");
    }

    public static final void b(@NotNull vu.l lVar, @NotNull h0 source, @NotNull h0 target) {
        Throwable th2;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        r0 r0VarSource = lVar.source(source);
        Throwable th3 = null;
        try {
            vu.f fVarB = b0.b(vu.l.sink$default(lVar, target, false, 2, null));
            try {
                lValueOf = Long.valueOf(fVarB.c3(r0VarSource));
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th6) {
                        gt.a.a(th5, th6);
                    }
                }
                th2 = th5;
                lValueOf = null;
            }
            if (th2 != null) {
                throw th2;
            }
            lValueOf.longValue();
            if (r0VarSource != null) {
                try {
                    r0VarSource.close();
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
            if (th3 != null) {
                throw th3;
            }
        } catch (Throwable th8) {
            if (r0VarSource != null) {
                try {
                    r0VarSource.close();
                } catch (Throwable th9) {
                    gt.a.a(th8, th9);
                }
            }
            th3 = th8;
        }
    }

    public static final void c(@NotNull vu.l lVar, @NotNull h0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        kotlin.collections.i iVar = new kotlin.collections.i();
        for (h0 h0VarJ = dir; h0VarJ != null && !lVar.exists(h0VarJ); h0VarJ = h0VarJ.j()) {
            iVar.addFirst(h0VarJ);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            vu.l.createDirectory$default(lVar, (h0) it.next(), false, 2, null);
        }
    }

    public static final void d(@NotNull vu.l lVar, @NotNull h0 fileOrDirectory, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = gu.i.b(new b(lVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            lVar.delete((h0) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean e(@NotNull vu.l lVar, @NotNull h0 path) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return lVar.metadataOrNull(path) != null;
    }

    @NotNull
    public static final Sequence<h0> f(@NotNull vu.l lVar, @NotNull h0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return gu.i.b(new c(dir, lVar, z10, null));
    }

    @NotNull
    public static final vu.k g(@NotNull vu.l lVar, @NotNull h0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        vu.k kVarMetadataOrNull = lVar.metadataOrNull(path);
        if (kVarMetadataOrNull != null) {
            return kVarMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Nullable
    public static final h0 h(@NotNull vu.l lVar, @NotNull h0 path) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        h0 symlinkTarget = lVar.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        h0 h0VarJ = path.j();
        Intrinsics.checkNotNull(h0VarJ);
        return h0VarJ.o(symlinkTarget);
    }
}
