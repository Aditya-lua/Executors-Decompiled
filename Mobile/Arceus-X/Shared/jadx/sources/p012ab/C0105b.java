package p012ab;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.Task;
import p098e9.InterfaceC4888b;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import p305n9.C8953m;
import sb.C11264k;

/* JADX INFO: renamed from: ab.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0105b extends AbstractC7495e implements InterfaceC4888b {

    /* JADX INFO: renamed from: k */
    public static final C7491a.g f361k;

    /* JADX INFO: renamed from: l */
    public static final C7491a.a f362l;

    /* JADX INFO: renamed from: m */
    public static final C7491a f363m;

    static {
        C7491a.g gVar = new C7491a.g();
        f361k = gVar;
        C0124u c0124u = new C0124u();
        f362l = c0124u;
        f363m = new C7491a("Blockstore.API", c0124u, gVar);
    }

    public C0105b(@NonNull Context context) {
        super(context, (C7491a<C7491a.d.c>) f363m, C7491a.d.f28847Jo, AbstractC7495e.a.f28860c);
    }

    @Override // p098e9.InterfaceC4888b
    /* JADX INFO: renamed from: e */
    public final Task<RetrieveBytesResponse> mo303e(final RetrieveBytesRequest retrieveBytesRequest) {
        C8953m.m36048m(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        return m31151z(AbstractC8078u.m33280c().m33288d(C0106c.f371h).m33286b(new InterfaceC8066q() { // from class: ab.t
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C0111h) ((C0110g) obj).getService()).m317v2(new BinderC0126w(this.f382a, (C11264k) obj2), retrieveBytesRequest);
            }
        }).m33287c(false).m33289e(1668).m33285a());
    }

    @Override // p098e9.InterfaceC4888b
    /* JADX INFO: renamed from: h */
    public final Task<Integer> mo304h(final StoreBytesData storeBytesData) {
        return m31136D(AbstractC8078u.m33280c().m33288d(C0106c.f367d, C0106c.f369f).m33286b(new InterfaceC8066q() { // from class: ab.r
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C0111h) ((C0110g) obj).getService()).m318w2(new BinderC0125v(this.f379a, (C11264k) obj2), storeBytesData);
            }
        }).m33289e(1645).m33287c(false).m33285a());
    }

    @Override // p098e9.InterfaceC4888b
    /* JADX INFO: renamed from: i */
    public final Task<Boolean> mo305i(final DeleteBytesRequest deleteBytesRequest) {
        C8953m.m36048m(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        return m31136D(AbstractC8078u.m33280c().m33288d(C0106c.f370g).m33286b(new InterfaceC8066q() { // from class: ab.q
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C0111h) ((C0110g) obj).getService()).m315t2(new BinderC0127x(this.f377a, (C11264k) obj2), deleteBytesRequest);
            }
        }).m33287c(false).m33289e(1669).m33285a());
    }

    @Override // p098e9.InterfaceC4888b
    /* JADX INFO: renamed from: p */
    public final Task<Boolean> mo306p() {
        return m31151z(AbstractC8078u.m33280c().m33288d(C0106c.f368e).m33286b(new InterfaceC8066q() { // from class: ab.s
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C0111h) ((C0110g) obj).getService()).m316u2(new BinderC0128y(this.f381a, (C11264k) obj2));
            }
        }).m33287c(false).m33289e(1651).m33285a());
    }
}
