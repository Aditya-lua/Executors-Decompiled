package va;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8027d;
import p305n9.C8953m;
import sb.C11264k;

/* JADX INFO: renamed from: va.b */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public abstract class AbstractC12113b extends AbstractC8078u implements InterfaceC8027d {

    /* JADX INFO: renamed from: d */
    public C11264k f42731d;

    public AbstractC12113b() {
        super(null, false, 28902);
    }

    @Override // p268l9.InterfaceC8027d
    /* JADX INFO: renamed from: b */
    public final void mo9182b(Status status) {
        C8953m.m36037b(!status.m9163A3(), "Failed result must not be success.");
        String strM9167y3 = status.m9167y3();
        if (strM9167y3 == null) {
            strM9167y3 = "";
        }
        this.f42731d.m42327b(C12117d.m44957a(status, strM9167y3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268l9.AbstractC8078u
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33170d(C7491a.b bVar, C11264k c11264k) {
        C12112a0 c12112a0 = (C12112a0) ((C12120e0) bVar).getService();
        this.f42731d = c11264k;
        mo44952h(c12112a0);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo44952h(C12112a0 c12112a0);

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
    @Override // p268l9.InterfaceC8027d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void mo9181a(Status status) {
        if (status.m9163A3()) {
            this.f42731d.m42328c(null);
        } else {
            this.f42731d.m42327b(C12117d.m44957a(status, "User Action indexing error, please try again."));
        }
    }
}
