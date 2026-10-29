package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import g0.g0;
import g0.p1;
import g0.v;
import g0.x;
import java.util.Set;
import n0.h1;
import n0.j4;
import n0.m0;
import n0.n0;
import s0.m;
import z.a0;
import z.l2;
import z.t2;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config {

    public static final class DefaultProvider implements g0.b {
        @Override // g0.g0.b
        public g0 getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ j4 a(Context context) {
        return new t2(context);
    }

    public static /* synthetic */ m0 b(Context context, Object obj, Set set) throws p1 {
        try {
            return new l2(context, obj, set);
        } catch (x e10) {
            throw new p1(e10);
        }
    }

    public static g0 c() {
        n0.a aVar = new n0.a() { // from class: x.a
            @Override // n0.n0.a
            public final n0 a(Context context, h1 h1Var, v vVar, long j10, g0 g0Var, m mVar) {
                return new a0(context, h1Var, vVar, j10, g0Var, mVar);
            }
        };
        m0.a aVar2 = new m0.a() { // from class: x.b
            @Override // n0.m0.a
            public final m0 a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new g0.a().c(aVar).e(aVar2).i(new j4.c() { // from class: x.c
            @Override // n0.j4.c
            public final j4 a(Context context) {
                return Camera2Config.a(context);
            }
        }).d(0).f(true).a();
    }
}
