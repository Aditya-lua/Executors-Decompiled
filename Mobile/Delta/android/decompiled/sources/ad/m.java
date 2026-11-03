package ad;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f390d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ed.d f393g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f388a = new TextPaint(1);
    public final ed.f b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f391e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<b> f392f = new WeakReference<>(null);

    public class a extends ed.f {
        public a() {
        }

        @Override // ed.f
        public void a(int i10) {
            m.this.f391e = true;
            b bVar = (b) m.this.f392f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // ed.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            m.this.f391e = true;
            b bVar = (b) m.this.f392f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public m(b bVar) {
        i(bVar);
    }

    public final float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f388a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f388a.measureText(charSequence, 0, charSequence.length());
    }

    public ed.d e() {
        return this.f393g;
    }

    @NonNull
    public TextPaint f() {
        return this.f388a;
    }

    public float g(String str) {
        if (!this.f391e) {
            return this.f389c;
        }
        h(str);
        return this.f389c;
    }

    public final void h(String str) {
        this.f389c = d(str);
        this.f390d = c(str);
        this.f391e = false;
    }

    public void i(b bVar) {
        this.f392f = new WeakReference<>(bVar);
    }

    public void j(ed.d dVar, Context context) {
        if (this.f393g != dVar) {
            this.f393g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f388a, this.b);
                b bVar = this.f392f.get();
                if (bVar != null) {
                    this.f388a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f388a, this.b);
                this.f391e = true;
            }
            b bVar2 = this.f392f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z10) {
        this.f391e = z10;
    }

    public void l(Context context) {
        this.f393g.n(context, this.f388a, this.b);
    }
}
