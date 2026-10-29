package ad;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import p101ed.AbstractC5053f;
import p101ed.C5051d;

/* JADX INFO: renamed from: ad.m */
/* JADX INFO: loaded from: classes2.dex */
public class C0141m {

    /* JADX INFO: renamed from: c */
    public float f497c;

    /* JADX INFO: renamed from: d */
    public float f498d;

    /* JADX INFO: renamed from: g */
    public C5051d f501g;

    /* JADX INFO: renamed from: a */
    public final TextPaint f495a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final AbstractC5053f f496b = new a();

    /* JADX INFO: renamed from: e */
    public boolean f499e = true;

    /* JADX INFO: renamed from: f */
    public WeakReference<b> f500f = new WeakReference<>(null);

    /* JADX INFO: renamed from: ad.m$a */
    public class a extends AbstractC5053f {
        public a() {
        }

        @Override // p101ed.AbstractC5053f
        /* JADX INFO: renamed from: a */
        public void mo425a(int i10) {
            C0141m.this.f499e = true;
            b bVar = (b) C0141m.this.f500f.get();
            if (bVar != null) {
                bVar.mo427a();
            }
        }

        @Override // p101ed.AbstractC5053f
        /* JADX INFO: renamed from: b */
        public void mo426b(@NonNull Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            C0141m.this.f499e = true;
            b bVar = (b) C0141m.this.f500f.get();
            if (bVar != null) {
                bVar.mo427a();
            }
        }
    }

    /* JADX INFO: renamed from: ad.m$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo427a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C0141m(b bVar) {
        m421i(bVar);
    }

    /* JADX INFO: renamed from: c */
    public final float m415c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f495a.getFontMetrics().ascent);
    }

    /* JADX INFO: renamed from: d */
    public final float m416d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f495a.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: e */
    public C5051d m417e() {
        return this.f501g;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public TextPaint m418f() {
        return this.f495a;
    }

    /* JADX INFO: renamed from: g */
    public float m419g(String str) {
        if (!this.f499e) {
            return this.f497c;
        }
        m420h(str);
        return this.f497c;
    }

    /* JADX INFO: renamed from: h */
    public final void m420h(String str) {
        this.f497c = m416d(str);
        this.f498d = m415c(str);
        this.f499e = false;
    }

    /* JADX INFO: renamed from: i */
    public void m421i(b bVar) {
        this.f500f = new WeakReference<>(bVar);
    }

    /* JADX INFO: renamed from: j */
    public void m422j(C5051d c5051d, Context context) {
        if (this.f501g != c5051d) {
            this.f501g = c5051d;
            if (c5051d != null) {
                c5051d.m23758o(context, this.f495a, this.f496b);
                b bVar = this.f500f.get();
                if (bVar != null) {
                    this.f495a.drawableState = bVar.getState();
                }
                c5051d.m23757n(context, this.f495a, this.f496b);
                this.f499e = true;
            }
            b bVar2 = this.f500f.get();
            if (bVar2 != null) {
                bVar2.mo427a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m423k(boolean z10) {
        this.f499e = z10;
    }

    /* JADX INFO: renamed from: l */
    public void m424l(Context context) {
        this.f501g.m23757n(context, this.f495a, this.f496b);
    }
}
