package ae;

import androidx.annotation.NonNull;
import be.InterfaceC1366u0;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ae.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0180o0 implements InterfaceC0152b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1366u0 f572a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1366u0 f573b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1366u0 f574c;

    public C0180o0(InterfaceC1366u0 interfaceC1366u0, InterfaceC1366u0 interfaceC1366u1, InterfaceC1366u0 interfaceC1366u2) {
        this.f572a = interfaceC1366u0;
        this.f573b = interfaceC1366u1;
        this.f574c = interfaceC1366u2;
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: a */
    public final Task<Integer> mo483a(@NonNull C0157d c0157d) {
        return m532g().mo483a(c0157d);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: b */
    public final void mo484b(@NonNull InterfaceC0161f interfaceC0161f) {
        m532g().mo484b(interfaceC0161f);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: c */
    public final void mo485c(@NonNull InterfaceC0161f interfaceC0161f) {
        m532g().mo485c(interfaceC0161f);
    }

    @Override // ae.InterfaceC0152b
    @NonNull
    /* JADX INFO: renamed from: d */
    public final Task<Void> mo486d(List<String> list) {
        return m532g().mo486d(list);
    }

    @Override // ae.InterfaceC0152b
    @NonNull
    /* JADX INFO: renamed from: e */
    public final Set<String> mo487e() {
        return m532g().mo487e();
    }

    @Override // ae.InterfaceC0152b
    @NonNull
    /* JADX INFO: renamed from: f */
    public final Task<Void> mo488f(List<String> list) {
        return m532g().mo488f(list);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0152b m532g() {
        return this.f574c.zza() != null ? (InterfaceC0152b) this.f573b.zza() : (InterfaceC0152b) this.f572a.zza();
    }
}
