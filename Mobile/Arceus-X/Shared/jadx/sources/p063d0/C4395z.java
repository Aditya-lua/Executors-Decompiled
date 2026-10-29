package p063d0;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import p036c0.C1500e;
import p296n0.AbstractC8830u1;
import p296n0.C8785l1;
import p561y.C12964a;

/* JADX INFO: renamed from: d0.z */
/* JADX INFO: loaded from: classes.dex */
public class C4395z {

    /* JADX INFO: renamed from: a */
    public final boolean f18257a;

    public C4395z() {
        this.f18257a = C1500e.m7653b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    /* JADX INFO: renamed from: a */
    public C8785l1 m22067a(C8785l1 c8785l1) {
        C8785l1.a aVar = new C8785l1.a();
        aVar.m35273v(c8785l1.m35248k());
        Iterator<AbstractC8830u1> it = c8785l1.m35246i().iterator();
        while (it.hasNext()) {
            aVar.m35259f(it.next());
        }
        aVar.m35258e(c8785l1.m35244g());
        C12964a.a aVar2 = new C12964a.a();
        aVar2.m48221f(CaptureRequest.FLASH_MODE, 0);
        aVar.m35258e(aVar2.m48218b());
        return aVar.m35261h();
    }

    /* JADX INFO: renamed from: b */
    public boolean m22068b(List<CaptureRequest> list, boolean z10) {
        if (!this.f18257a || !z10) {
            return false;
        }
        Iterator<CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
