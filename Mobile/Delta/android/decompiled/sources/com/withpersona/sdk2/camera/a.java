package com.withpersona.sdk2.camera;

import gt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import lu.p0;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import xt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llu/p0;", "Lcom/withpersona/sdk2/camera/d;", "Llu/h;", "a", "(Llu/p0;)Llu/h;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.a$a, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", f = "CameraController.kt", l = {100}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/camera/d;", "state", "", "<anonymous>", "(Llu/i;Lcom/withpersona/sdk2/camera/d;)Z"}, k = 3, mv = {2, 2, 0})
    public static final class C0163a extends m implements n<i<? super d>, d, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9998t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9999u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10000v;

        public C0163a(lt.b<? super C0163a> bVar) {
            super(3, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f9999u;
            d dVar = (d) this.f10000v;
            Object objE = mt.c.e();
            int i10 = this.f9998t;
            boolean z10 = true;
            if (i10 == 0) {
                o.b(obj);
                this.f9999u = l.a(iVar);
                this.f10000v = dVar;
                this.f9998t = 1;
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
            return nt.b.a(z10);
        }

        @Override // xt.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d> iVar, d dVar, lt.b<? super Boolean> bVar) {
            C0163a c0163a = new C0163a(bVar);
            c0163a.f9999u = iVar;
            c0163a.f10000v = dVar;
            return c0163a.invokeSuspend(Unit.f22938a);
        }
    }

    @NotNull
    public static final lu.h<d> a(@NotNull p0<? extends d> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return j.T(p0Var, new C0163a(null));
    }
}
