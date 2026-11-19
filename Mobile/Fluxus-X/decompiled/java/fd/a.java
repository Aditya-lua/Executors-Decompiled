package fd;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f15902a;
    public final InterfaceC0294a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15903c;

    /* JADX INFO: renamed from: fd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0294a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0294a interfaceC0294a, Typeface typeface) {
        this.f15902a = typeface;
        this.b = interfaceC0294a;
    }

    @Override // fd.f
    public void a(int i10) {
        d(this.f15902a);
    }

    @Override // fd.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f15903c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f15903c) {
            return;
        }
        this.b.a(typeface);
    }
}
