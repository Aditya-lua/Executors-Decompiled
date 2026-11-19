package tc;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f32327a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f32327a.a(cd.a.c(eVar.f32330a, eVar2.f32330a, f10), cd.a.c(eVar.b, eVar2.b, f10), cd.a.c(eVar.f32331c, eVar2.f32331c, f10));
            return this.f32327a;
        }
    }

    public static class c extends Property<d, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f32328a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: tc.d$d, reason: collision with other inner class name */
    public static class C0645d extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f32329a = new C0645d("circularRevealScrimColor");

        public C0645d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, @NonNull Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f32330a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f32331c;

        public void a(float f10, float f11, float f12) {
            this.f32330a = f10;
            this.b = f11;
            this.f32331c = f12;
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f32330a = f10;
            this.b = f11;
            this.f32331c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
