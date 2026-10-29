package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import p140g0.C5886g0;
import p140g0.C5923p1;
import p140g0.C5945v;
import p140g0.C5953x;
import p296n0.AbstractC8762h1;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8789m0;
import p296n0.InterfaceC8794n0;
import p424s0.InterfaceC11152m;
import p589z.C13476a0;
import p589z.C13566l2;
import p589z.C13626t2;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config {

    public static final class DefaultProvider implements C5886g0.b {
        @Override // p140g0.C5886g0.b
        public C5886g0 getCameraXConfig() {
            return Camera2Config.m2032c();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.content.Context) A[MD:(android.content.Context):void (m)] call: z.t2.<init>(android.content.Context):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC8777j4 m2030a(Context context) {
        return new C13626t2(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC8789m0 m2031b(Context context, Object obj, Set set) throws C5923p1 {
        try {
            return new C13566l2(context, obj, set);
        } catch (C5953x e10) {
            throw new C5923p1(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C5886g0 m2032c() {
        InterfaceC8794n0.a aVar = new InterfaceC8794n0.a() { // from class: x.a
            @Override // p296n0.InterfaceC8794n0.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC8794n0 mo35287a(Context context, AbstractC8762h1 abstractC8762h1, C5945v c5945v, long j10, C5886g0 c5886g0, InterfaceC11152m interfaceC11152m) {
                return new C13476a0(context, abstractC8762h1, c5945v, j10, c5886g0, interfaceC11152m);
            }
        };
        InterfaceC8789m0.a aVar2 = new InterfaceC8789m0.a() { // from class: x.b
            @Override // p296n0.InterfaceC8789m0.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC8789m0 mo35279a(Context context, Object obj, Set set) {
                return Camera2Config.m2031b(context, obj, set);
            }
        };
        return new C5886g0.a().m26457c(aVar).m26459e(aVar2).m26463i(new InterfaceC8777j4.c() { // from class: x.c
            @Override // p296n0.InterfaceC8777j4.c
            /* JADX INFO: renamed from: a */
            public final InterfaceC8777j4 mo35230a(Context context) {
                return Camera2Config.m2030a(context);
            }
        }).m26458d(0).m26460f(true).m26455a();
    }
}
