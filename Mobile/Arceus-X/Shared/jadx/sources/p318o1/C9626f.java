package p318o1;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;
import p115f1.C5306x;
import p296n0.C8782k3;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8758g3;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8855z1;

/* JADX INFO: renamed from: o1.f */
/* JADX INFO: loaded from: classes.dex */
public class C9626f implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: f */
    public static final Map<Integer, C5306x> f34913f;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8855z1 f34914c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8799o0 f34915d;

    /* JADX INFO: renamed from: e */
    public final C8782k3 f34916e;

    static {
        HashMap map = new HashMap();
        f34913f = map;
        map.put(1, C5306x.f20634f);
        map.put(8, C5306x.f20632d);
        map.put(6, C5306x.f20631c);
        map.put(5, C5306x.f20630b);
        map.put(4, C5306x.f20629a);
        map.put(0, C5306x.f20633e);
    }

    public C9626f(InterfaceC8855z1 interfaceC8855z1, InterfaceC8799o0 interfaceC8799o0, C8782k3 c8782k3) {
        this.f34914c = interfaceC8855z1;
        this.f34915d = interfaceC8799o0;
        this.f34916e = c8782k3;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m37988d(InterfaceC8758g3 interfaceC8758g3) {
        return (interfaceC8758g3 instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) interfaceC8758g3).mo2104f();
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return this.f34914c.mo27503a(i10) && m37989c(i10);
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        if (mo27503a(i10)) {
            return this.f34914c.mo27504b(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37989c(int i10) {
        C5306x c5306x = f34913f.get(Integer.valueOf(i10));
        if (c5306x == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f34916e.m35235c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.mo2288c(this.f34915d, c5306x) && !m37988d(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }
}
