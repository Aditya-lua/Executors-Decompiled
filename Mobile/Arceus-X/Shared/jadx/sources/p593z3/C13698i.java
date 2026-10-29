package p593z3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0903f;
import p005a4.C0066a;

/* JADX INFO: renamed from: z3.i */
/* JADX INFO: loaded from: classes.dex */
public class C13698i {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<C0066a> f48082d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final int f48083a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C0903f f48084b;

    /* JADX INFO: renamed from: c */
    public volatile int f48085c = 0;

    public C13698i(@NonNull C0903f c0903f, int i10) {
        this.f48084b = c0903f;
        this.f48083a = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m50040a(@NonNull Canvas canvas, float f10, float f11, @NonNull Paint paint) {
        Typeface typefaceM4335g = this.f48084b.m4335g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM4335g);
        canvas.drawText(this.f48084b.m4331c(), this.f48083a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: b */
    public int m50041b(int i10) {
        return m50046g().m153h(i10);
    }

    /* JADX INFO: renamed from: c */
    public int m50042c() {
        return m50046g().m154i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: d */
    public int m50043d() {
        return this.f48085c & 3;
    }

    /* JADX INFO: renamed from: e */
    public int m50044e() {
        return m50046g().m156k();
    }

    /* JADX INFO: renamed from: f */
    public int m50045f() {
        return m50046g().m157l();
    }

    /* JADX INFO: renamed from: g */
    public final C0066a m50046g() {
        ThreadLocal<C0066a> threadLocal = f48082d;
        C0066a c0066a = threadLocal.get();
        if (c0066a == null) {
            c0066a = new C0066a();
            threadLocal.set(c0066a);
        }
        this.f48084b.m4332d().m164j(c0066a, this.f48083a);
        return c0066a;
    }

    /* JADX INFO: renamed from: h */
    public short m50047h() {
        return m50046g().m158m();
    }

    /* JADX INFO: renamed from: i */
    public int m50048i() {
        return m50046g().m159n();
    }

    /* JADX INFO: renamed from: j */
    public boolean m50049j() {
        return m50046g().m155j();
    }

    /* JADX INFO: renamed from: k */
    public boolean m50050k() {
        return (this.f48085c & 4) > 0;
    }

    /* JADX INFO: renamed from: l */
    public void m50051l(boolean z10) {
        int iM50043d = m50043d();
        if (z10) {
            this.f48085c = iM50043d | 4;
        } else {
            this.f48085c = iM50043d;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: m */
    public void m50052m(boolean z10) {
        int i10 = this.f48085c & 4;
        this.f48085c = z10 ? i10 | 2 : i10 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m50045f()));
        sb2.append(", codepoints:");
        int iM50042c = m50042c();
        for (int i10 = 0; i10 < iM50042c; i10++) {
            sb2.append(Integer.toHexString(m50041b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
