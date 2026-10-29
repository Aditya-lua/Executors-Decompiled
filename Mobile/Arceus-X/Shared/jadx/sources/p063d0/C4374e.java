package p063d0;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;
import p036c0.C1500e;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public class C4374e {

    /* JADX INFO: renamed from: a */
    public final String f18227a;

    public C4374e(String str) {
        this.f18227a = str;
    }

    /* JADX INFO: renamed from: a */
    public List<Size> m22029a(int i10) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) C1500e.m7653b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.m2064g(this.f18227a, i10);
    }
}
