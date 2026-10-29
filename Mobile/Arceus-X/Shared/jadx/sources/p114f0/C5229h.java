package p114f0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import java.util.List;
import p140g0.InterfaceC5937t;
import p296n0.C8742e;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8812q3;
import p533x2.C12637g;
import p589z.C13582n2;
import p589z.C13666z0;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5229h {

    /* JADX INFO: renamed from: a */
    public C13666z0 f20279a;

    /* JADX INFO: renamed from: b */
    public C13582n2 f20280b;

    /* JADX INFO: renamed from: c */
    public List<Pair<CameraCharacteristics.Key, Object>> f20281c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5229h(C13666z0 c13666z0) {
        this.f20279a = c13666z0;
    }

    /* JADX INFO: renamed from: a */
    public static C5229h m24208a(InterfaceC5937t interfaceC5937t) {
        InterfaceC8812q3 interfaceC8812q3M35069E;
        if (interfaceC5937t instanceof C13582n2) {
            return ((C13582n2) interfaceC5937t).m49534B();
        }
        InterfaceC8799o0 interfaceC8799o0Mo35053q = ((InterfaceC8799o0) interfaceC5937t).mo35053q();
        C12637g.m47070b(interfaceC8799o0Mo35053q instanceof C13666z0, "CameraInfo doesn't contain Camera2 implementation.");
        C5229h c5229hM49815B = ((C13666z0) interfaceC8799o0Mo35053q).m49815B();
        return (!(interfaceC5937t instanceof C8742e) || (interfaceC8812q3M35069E = ((C8742e) interfaceC5937t).m35069E()) == null) ? c5229hM49815B : new C5229h(c5229hM49815B.f20279a, interfaceC8812q3M35069E.m35382h());
    }

    /* JADX INFO: renamed from: b */
    public <T> T m24209b(CameraCharacteristics.Key<T> key) {
        List<Pair<CameraCharacteristics.Key, Object>> list = this.f20281c;
        if (list != null) {
            for (Pair<CameraCharacteristics.Key, Object> pair : list) {
                if (((CameraCharacteristics.Key) pair.first).equals(key)) {
                    return (T) pair.second;
                }
            }
        }
        return (T) this.f20279a.m49816C().m9a(key);
    }

    /* JADX INFO: renamed from: c */
    public String m24210c() {
        return this.f20279a.mo6750e();
    }

    public C5229h(C13666z0 c13666z0, List<Pair<CameraCharacteristics.Key, Object>> list) {
        this.f20279a = c13666z0;
        this.f20281c = list;
    }
}
