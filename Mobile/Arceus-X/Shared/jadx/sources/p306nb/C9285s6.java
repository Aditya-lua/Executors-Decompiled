package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2012cd;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: nb.s6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9285s6 implements InterfaceC2012cd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9365x6 f33456b;

    public C9285s6(C9365x6 c9365x6, String str) {
        this.f33455a = str;
        Objects.requireNonNull(c9365x6);
        this.f33456b = c9365x6;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2012cd
    /* JADX INFO: renamed from: a */
    public final String mo9894a(String str) {
        Map map = (Map) this.f33456b.m37054p().get(this.f33455a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
