package bd;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3947d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fd.d f3950g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f3945a = new TextPaint(1);
    public final fd.f b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3948e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<b> f3949f = new WeakReference<>(null);

    public class a extends fd.f {
        public a() {
        }

        @Override // fd.f
        public void a(int i10) {
            m.this.f3948e = true;
            b bVar = (b) m.this.f3949f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // fd.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            m.this.f3948e = true;
            b bVar = (b) m.this.f3949f.get();
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
        return Math.abs(this.f3945a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f3945a.measureText(charSequence, 0, charSequence.length());
    }

    public fd.d e() {
        return this.f3950g;
    }

    @NonNull
    public TextPaint f() {
        return this.f3945a;
    }

    public float g(String str) {
        if (!this.f3948e) {
            return this.f3946c;
        }
        h(str);
        return this.f3946c;
    }

    public final void h(String str) {
        this.f3946c = d(str);
        this.f3947d = c(str);
        this.f3948e = false;
    }

    public void i(b bVar) {
        this.f3949f = new WeakReference<>(bVar);
    }

    public void j(fd.d dVar, Context context) {
        if (this.f3950g != dVar) {
            this.f3950g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f3945a, this.b);
                b bVar = this.f3949f.get();
                if (bVar != null) {
                    this.f3945a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f3945a, this.b);
                this.f3948e = true;
            }
            b bVar2 = this.f3949f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z10) {
        this.f3948e = z10;
    }

    public void l(Context context) {
        this.f3950g.n(context, this.f3945a, this.b);
    }
}
