package dv;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Ldv/i;", "Lcv/x;", "channel", BuildConfig.FLAVOR, "b", "(Ldv/i;Lcv/x;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "consume", "c", "(Ldv/i;Lcv/x;ZLeu/b;)Ljava/lang/Object;", "Ldv/h;", "e", "(Lcv/x;)Ldv/h;", "Lav/p0;", "scope", "d", "(Ldv/h;Lav/p0;)Lcv/x;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {Barcode.FORMAT_EAN_13, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12774t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12775u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12776v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f12777w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12778x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f12779y;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12778x = obj;
            this.f12779y |= Integer.MIN_VALUE;
            return l.c(null, null, false, this);
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull i<? super T> iVar, @NotNull cv.x<? extends T> xVar, @NotNull eu.b<? super Unit> bVar) {
        Object objC = c(iVar, xVar, true, bVar);
        return objC == fu.c.e() ? objC : Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(i<? super T> iVar, cv.x<? extends T> xVar, boolean z10, eu.b<? super Unit> bVar) {
        a aVar;
        cv.i<? extends T> it;
        cv.i<? extends T> iVar2;
        i<? super T> iVar3;
        Object objA;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f12779y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f12779y = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f12778x;
        Object objE = fu.c.e();
        int i11 = aVar.f12779y;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                j.r(iVar);
                it = xVar.iterator();
                aVar.f12774t = iVar;
                aVar.f12775u = xVar;
                aVar.f12776v = it;
                aVar.f12777w = z10;
                aVar.f12779y = 1;
                objA = it.a(aVar);
                if (objA == objE) {
                    iVar3 = iVar;
                    iVar2 = it;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z10) {
                            cv.n.a(xVar, null);
                        }
                        return Unit.f21506a;
                    }
                    T next = iVar2.next();
                    aVar.f12774t = iVar3;
                    aVar.f12775u = xVar;
                    aVar.f12776v = iVar2;
                    aVar.f12777w = z10;
                    aVar.f12779y = 2;
                }
                return objE;
            }
            if (i11 == 1) {
                z10 = aVar.f12777w;
                iVar2 = (cv.i) aVar.f12776v;
                xVar = (cv.x) aVar.f12775u;
                iVar3 = (i) aVar.f12774t;
                zt.o.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z10) {
                        cv.n.a(xVar, null);
                    }
                    return Unit.f21506a;
                }
                T next2 = iVar2.next();
                aVar.f12774t = iVar3;
                aVar.f12775u = xVar;
                aVar.f12776v = iVar2;
                aVar.f12777w = z10;
                aVar.f12779y = 2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = aVar.f12777w;
                iVar2 = (cv.i) aVar.f12776v;
                xVar = (cv.x) aVar.f12775u;
                iVar3 = (i) aVar.f12774t;
                zt.o.b(obj);
            }
            it = iVar2;
            iVar = iVar3;
            aVar.f12774t = iVar;
            aVar.f12775u = xVar;
            aVar.f12776v = it;
            aVar.f12777w = z10;
            aVar.f12779y = 1;
            objA = it.a(aVar);
            if (objA == objE) {
                iVar3 = iVar;
                iVar2 = it;
                obj = objA;
                if (!((Boolean) obj).booleanValue()) {
                    if (z10) {
                        cv.n.a(xVar, null);
                    }
                    return Unit.f21506a;
                }
                T next3 = iVar2.next();
                aVar.f12774t = iVar3;
                aVar.f12775u = xVar;
                aVar.f12776v = iVar2;
                aVar.f12777w = z10;
                aVar.f12779y = 2;
            }
            return objE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z10) {
                    cv.n.a(xVar, th2);
                }
                throw th3;
            }
        }
    }

    @NotNull
    public static final <T> cv.x<T> d(@NotNull h<? extends T> hVar, @NotNull av.p0 p0Var) {
        return kotlin.f.b(hVar).m(p0Var);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull cv.x<? extends T> xVar) {
        return new e(xVar, false, null, 0, null, 28, null);
    }
}
