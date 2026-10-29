package ae;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: ae.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0200y0 implements InterfaceC0168i0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0159e f599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f601c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0151a1 f602d;

    public C0200y0(C0151a1 c0151a1, AbstractC0159e abstractC0159e, Intent intent, Context context) {
        this.f602d = c0151a1;
        this.f599a = abstractC0159e;
        this.f600b = intent;
        this.f601c = context;
    }

    @Override // ae.InterfaceC0168i0
    /* JADX INFO: renamed from: a */
    public final void mo524a(int i10) {
        C0151a1 c0151a1 = this.f602d;
        c0151a1.f520g.post(new RunnableC0202z0(c0151a1, this.f599a, 6, i10));
    }

    @Override // ae.InterfaceC0168i0
    public final void zza() {
        C0151a1 c0151a1 = this.f602d;
        c0151a1.f520g.post(new RunnableC0202z0(c0151a1, this.f599a, 5, 0));
    }

    @Override // ae.InterfaceC0168i0
    public final void zzc() {
        if (this.f600b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f602d.f5393a.m7208b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f600b.putExtra("triggered_from_app_after_verification", true);
            this.f601c.sendBroadcast(this.f600b);
        }
    }
}
