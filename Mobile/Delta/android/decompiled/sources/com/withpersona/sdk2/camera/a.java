package com.withpersona.sdk2.camera;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu.i;
import nu.j;
import nu.p0;
import org.jetbrains.annotations.NotNull;
import pt.l;
import pt.m;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnu/p0;", "Lcom/withpersona/sdk2/camera/d;", "Lnu/h;", "a", "(Lnu/p0;)Lnu/h;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/camera/d;", "state", "", "<anonymous>", "(Lnu/i;Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", f = "CameraController.kt", l = {100}, m = "invokeSuspend")
    public static final class C0160a extends m implements n<i<? super d>, d, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9917t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9918u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9919v;

        public C0160a(nt.b<? super C0160a> bVar) {
            super(3, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f9918u;
            d dVar = (d) this.f9919v;
            Object objE = ot.c.e();
            int i10 = this.f9917t;
            boolean z10 = true;
            if (i10 == 0) {
                o.b(obj);
                this.f9918u = l.a(iVar);
                this.f9919v = dVar;
                this.f9917t = 1;
                if (iVar.emit(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            if ((dVar instanceof d.Closed) && !((d.Closed) dVar).getIsClosedDueToBadCameraConfiguration()) {
                z10 = false;
            }
            return pt.b.a(z10);
        }

        @Override // zt.n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d> iVar, d dVar, nt.b<? super Boolean> bVar) {
            C0160a c0160a = new C0160a(bVar);
            c0160a.f9918u = iVar;
            c0160a.f9919v = dVar;
            return c0160a.invokeSuspend(Unit.f22483a);
        }
    }

    @NotNull
    public static final nu.h<d> a(@NotNull p0<? extends d> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return j.T(p0Var, new C0160a(null));
    }
}
