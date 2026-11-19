package sn;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldv/p0;", "Lsn/y;", "Ldv/h;", "a", "(Ldv/p0;)Ldv/h;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldv/i;", "Lsn/y;", "state", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;Lsn/y;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", f = "CameraController.kt", l = {MlKitException.MODEL_INCOMPATIBLE_WITH_TFLITE}, m = "invokeSuspend")
    public static final class a extends gu.m implements pu.n<dv.i<? super y>, y, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31635t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31636u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31637v;

        public a(eu.b<? super a> bVar) {
            super(3, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f31636u;
            y yVar = (y) this.f31637v;
            Object objE = fu.c.e();
            int i10 = this.f31635t;
            boolean z10 = true;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f31636u = gu.l.a(iVar);
                this.f31637v = yVar;
                this.f31635t = 1;
                if (iVar.emit(yVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            if ((yVar instanceof y.Closed) && !((y.Closed) yVar).getIsClosedDueToBadCameraConfiguration()) {
                z10 = false;
            }
            return gu.b.a(z10);
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super y> iVar, y yVar, eu.b<? super Boolean> bVar) {
            a aVar = new a(bVar);
            aVar.f31636u = iVar;
            aVar.f31637v = yVar;
            return aVar.invokeSuspend(Unit.f21506a);
        }
    }

    @NotNull
    public static final dv.h<y> a(@NotNull dv.p0<? extends y> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return dv.j.U(p0Var, new a(null));
    }
}
