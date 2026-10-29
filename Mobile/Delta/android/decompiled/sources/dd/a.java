package dd;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f14550a;
    public final InterfaceC0269a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14551c;

    /* JADX INFO: renamed from: dd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0269a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0269a interfaceC0269a, Typeface typeface) {
        this.f14550a = typeface;
        this.b = interfaceC0269a;
    }

    @Override // dd.f
    public void a(int i10) {
        d(this.f14550a);
    }

    @Override // dd.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f14551c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f14551c) {
            return;
        }
        this.b.a(typeface);
    }
}
