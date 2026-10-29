package rc;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f29851a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f29851a.a(ad.a.c(eVar.f29854a, eVar2.f29854a, f10), ad.a.c(eVar.b, eVar2.b, f10), ad.a.c(eVar.f29855c, eVar2.f29855c, f10));
            return this.f29851a;
        }
    }

    public static class c extends Property<d, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f29852a = new c("circularReveal");

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

    /* JADX INFO: renamed from: rc.d$d, reason: collision with other inner class name */
    public static class C0533d extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f29853a = new C0533d("circularRevealScrimColor");

        public C0533d(String str) {
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
        public float f29854a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f29855c;

        public void a(float f10, float f11, float f12) {
            this.f29854a = f10;
            this.b = f11;
            this.f29855c = f12;
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f29854a = f10;
            this.b = f11;
            this.f29855c = f12;
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
