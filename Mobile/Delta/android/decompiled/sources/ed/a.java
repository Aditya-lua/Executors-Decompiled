package ed;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f16046a;
    public final InterfaceC0296a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16047c;

    /* JADX INFO: renamed from: ed.a$a, reason: collision with other inner class name */
    public interface InterfaceC0296a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0296a interfaceC0296a, Typeface typeface) {
        this.f16046a = typeface;
        this.b = interfaceC0296a;
    }

    @Override // ed.f
    public void a(int i10) {
        d(this.f16046a);
    }

    @Override // ed.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f16047c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f16047c) {
            return;
        }
        this.b.a(typeface);
    }
}
