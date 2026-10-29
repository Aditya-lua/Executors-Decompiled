package com.withpersona.sdk2.camera;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lnu/p0;", "Lcom/withpersona/sdk2/camera/d;", "Lnu/h;", "a", "(Lnu/p0;)Lnu/h;", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3401a {

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.a$a */
    @Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/camera/d;", "state", "", "<anonymous>", "(Lnu/i;Lcom/withpersona/sdk2/camera/d;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1", m39664f = "CameraController.kt", m39665l = {100}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements InterfaceC14057n<InterfaceC9577i<? super InterfaceC3404d>, InterfaceC3404d, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12902t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12903u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f12904v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(3, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f12903u;
            InterfaceC3404d interfaceC3404d = (InterfaceC3404d) this.f12904v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12902t;
            boolean z10 = true;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f12903u = C10350l.m39676a(interfaceC9577i);
                this.f12904v = interfaceC3404d;
                this.f12902t = 1;
                if (interfaceC9577i.emit(interfaceC3404d, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            if ((interfaceC3404d instanceof InterfaceC3404d.Closed) && !((InterfaceC3404d.Closed) interfaceC3404d).getIsClosedDueToBadCameraConfiguration()) {
                z10 = false;
            }
            return C10340b.m39658a(z10);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super InterfaceC3404d> interfaceC9577i, InterfaceC3404d interfaceC3404d, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            a aVar = new a(interfaceC9557b);
            aVar.f12903u = interfaceC9577i;
            aVar.f12904v = interfaceC3404d;
            return aVar.invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9575h<InterfaceC3404d> m16191a(@NotNull InterfaceC9592p0<? extends InterfaceC3404d> interfaceC9592p0) {
        Intrinsics.checkNotNullParameter(interfaceC9592p0, "<this>");
        return C9579j.m37783T(interfaceC9592p0, new a(null));
    }
}
