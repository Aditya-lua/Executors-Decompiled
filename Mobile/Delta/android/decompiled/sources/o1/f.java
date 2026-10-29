package o1;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import f1.x;
import java.util.HashMap;
import java.util.Map;
import n0.a2;
import n0.g3;
import n0.k3;
import n0.o0;
import n0.z1;

/* JADX INFO: loaded from: classes.dex */
public class f implements z1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<Integer, x> f26994f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f26995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f26996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3 f26997e;

    static {
        HashMap map = new HashMap();
        f26994f = map;
        map.put(1, x.f16054f);
        map.put(8, x.f16052d);
        map.put(6, x.f16051c);
        map.put(5, x.b);
        map.put(4, x.f16050a);
        map.put(0, x.f16053e);
    }

    public f(z1 z1Var, o0 o0Var, k3 k3Var) {
        this.f26995c = z1Var;
        this.f26996d = o0Var;
        this.f26997e = k3Var;
    }

    public static boolean d(g3 g3Var) {
        return (g3Var instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) g3Var).f();
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f26995c.a(i10) && c(i10);
    }

    @Override // n0.z1
    public a2 b(int i10) {
        if (a(i10)) {
            return this.f26995c.b(i10);
        }
        return null;
    }

    public final boolean c(int i10) {
        x xVar = f26994f.get(Integer.valueOf(i10));
        if (xVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f26997e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.c(this.f26996d, xVar) && !d(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }
}
