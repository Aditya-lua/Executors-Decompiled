package z3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<a4.a> f37838d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37839a;

    @NonNull
    public final androidx.emoji2.text.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f37840c = 0;

    public i(@NonNull androidx.emoji2.text.f fVar, int i10) {
        this.b = fVar;
        this.f37839a = i10;
    }

    public void a(@NonNull Canvas canvas, float f10, float f11, @NonNull Paint paint) {
        Typeface typefaceG = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.b.c(), this.f37839a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f37840c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final a4.a g() {
        ThreadLocal<a4.a> threadLocal = f37838d;
        a4.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a4.a();
            threadLocal.set(aVar);
        }
        this.b.d().j(aVar, this.f37839a);
        return aVar;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f37840c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f37840c = iD | 4;
        } else {
            this.f37840c = iD;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z10) {
        int i10 = this.f37840c & 4;
        this.f37840c = z10 ? i10 | 2 : i10 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
