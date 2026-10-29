package zc;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f37433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f37434d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dd.d f37437g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f37432a = new TextPaint(1);
    public final dd.f b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37435e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<b> f37436f = new WeakReference<>(null);

    public class a extends dd.f {
        public a() {
        }

        @Override // dd.f
        public void a(int i10) {
            m.this.f37435e = true;
            b bVar = (b) m.this.f37436f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // dd.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            m.this.f37435e = true;
            b bVar = (b) m.this.f37436f.get();
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
        return Math.abs(this.f37432a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f37432a.measureText(charSequence, 0, charSequence.length());
    }

    public dd.d e() {
        return this.f37437g;
    }

    @NonNull
    public TextPaint f() {
        return this.f37432a;
    }

    public float g(String str) {
        if (!this.f37435e) {
            return this.f37433c;
        }
        h(str);
        return this.f37433c;
    }

    public final void h(String str) {
        this.f37433c = d(str);
        this.f37434d = c(str);
        this.f37435e = false;
    }

    public void i(b bVar) {
        this.f37436f = new WeakReference<>(bVar);
    }

    public void j(dd.d dVar, Context context) {
        if (this.f37437g != dVar) {
            this.f37437g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f37432a, this.b);
                b bVar = this.f37436f.get();
                if (bVar != null) {
                    this.f37432a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f37432a, this.b);
                this.f37435e = true;
            }
            b bVar2 = this.f37436f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z10) {
        this.f37435e = z10;
    }

    public void l(Context context) {
        this.f37437g.n(context, this.f37432a, this.b);
    }
}
