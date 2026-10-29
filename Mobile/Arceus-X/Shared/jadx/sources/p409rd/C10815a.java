package p409rd;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p358pd.AbstractC10200e;
import p358pd.C10196a;
import p358pd.C10199d;
import p358pd.InterfaceC10197b;
import sb.C11268m;

/* JADX INFO: renamed from: rd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10815a implements InterfaceC10197b {

    /* JADX INFO: renamed from: a */
    public C10196a f38525a;

    /* JADX INFO: renamed from: b */
    public AbstractC10200e f38526b;

    @Override // p358pd.InterfaceC10197b
    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<AbstractC10200e> mo39272a(@NonNull C10199d c10199d) {
        C10196a c10196a = this.f38525a;
        if (c10196a != null) {
            return C11268m.m42335e(c10196a);
        }
        AbstractC10200e abstractC10200e = this.f38526b;
        return abstractC10200e != null ? C11268m.m42336f(abstractC10200e) : C11268m.m42335e(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    /* JADX INFO: renamed from: b */
    public void m41183b(@NonNull AbstractC10200e abstractC10200e) {
        this.f38525a = null;
        this.f38526b = abstractC10200e;
    }
}
