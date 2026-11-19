package id;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final id.c f19427m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f19428a;
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f19429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f19430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public id.c f19431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public id.c f19432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public id.c f19433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public id.c f19434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f19435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f19436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f19437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f19438l;

    public interface c {
        @NonNull
        id.c a(@NonNull id.c cVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    @NonNull
    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new id.a(i12));
    }

    @NonNull
    public static b d(Context context, int i10, int i11, @NonNull id.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(jc.k.f20546i5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(jc.k.f20555j5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(jc.k.f20582m5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(jc.k.f20591n5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(jc.k.f20573l5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(jc.k.f20564k5, i12);
            id.c cVarM = m(typedArrayObtainStyledAttributes, jc.k.f20600o5, cVar);
            id.c cVarM2 = m(typedArrayObtainStyledAttributes, jc.k.f20627r5, cVarM);
            id.c cVarM3 = m(typedArrayObtainStyledAttributes, jc.k.f20636s5, cVarM);
            id.c cVarM4 = m(typedArrayObtainStyledAttributes, jc.k.f20618q5, cVarM);
            return new b().y(i13, cVarM2).C(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, jc.k.f20609p5, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new id.a(i12));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, @NonNull id.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jc.k.f20518f4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(jc.k.f20527g4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(jc.k.f20536h4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    @NonNull
    public static id.c m(TypedArray typedArray, int i10, @NonNull id.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new id.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    @NonNull
    public f h() {
        return this.f19437k;
    }

    @NonNull
    public d i() {
        return this.f19430d;
    }

    @NonNull
    public id.c j() {
        return this.f19434h;
    }

    @NonNull
    public d k() {
        return this.f19429c;
    }

    @NonNull
    public id.c l() {
        return this.f19433g;
    }

    @NonNull
    public f n() {
        return this.f19438l;
    }

    @NonNull
    public f o() {
        return this.f19436j;
    }

    @NonNull
    public f p() {
        return this.f19435i;
    }

    @NonNull
    public d q() {
        return this.f19428a;
    }

    @NonNull
    public id.c r() {
        return this.f19431e;
    }

    @NonNull
    public d s() {
        return this.b;
    }

    @NonNull
    public id.c t() {
        return this.f19432f;
    }

    public boolean u(@NonNull RectF rectF) {
        boolean z10 = this.f19438l.getClass().equals(f.class) && this.f19436j.getClass().equals(f.class) && this.f19435i.getClass().equals(f.class) && this.f19437k.getClass().equals(f.class);
        float fA = this.f19431e.a(rectF);
        return z10 && ((this.f19432f.a(rectF) > fA ? 1 : (this.f19432f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19434h.a(rectF) > fA ? 1 : (this.f19434h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19433g.a(rectF) > fA ? 1 : (this.f19433g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof j) && (this.f19428a instanceof j) && (this.f19429c instanceof j) && (this.f19430d instanceof j));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public k w(float f10) {
        return v().o(f10).m();
    }

    @NonNull
    public k x(@NonNull id.c cVar) {
        return v().p(cVar).m();
    }

    @NonNull
    public k y(@NonNull c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(@NonNull b bVar) {
        this.f19428a = bVar.f19439a;
        this.b = bVar.b;
        this.f19429c = bVar.f19440c;
        this.f19430d = bVar.f19441d;
        this.f19431e = bVar.f19442e;
        this.f19432f = bVar.f19443f;
        this.f19433g = bVar.f19444g;
        this.f19434h = bVar.f19445h;
        this.f19435i = bVar.f19446i;
        this.f19436j = bVar.f19447j;
        this.f19437k = bVar.f19448k;
        this.f19438l = bVar.f19449l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public d f19439a;

        @NonNull
        public d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public d f19440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public d f19441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public id.c f19442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public id.c f19443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public id.c f19444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public id.c f19445h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public f f19446i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public f f19447j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public f f19448k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public f f19449l;

        public b() {
            this.f19439a = h.b();
            this.b = h.b();
            this.f19440c = h.b();
            this.f19441d = h.b();
            this.f19442e = new id.a(0.0f);
            this.f19443f = new id.a(0.0f);
            this.f19444g = new id.a(0.0f);
            this.f19445h = new id.a(0.0f);
            this.f19446i = h.c();
            this.f19447j = h.c();
            this.f19448k = h.c();
            this.f19449l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f19426a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f19377a;
            }
            return -1.0f;
        }

        @NonNull
        public b A(float f10) {
            this.f19442e = new id.a(f10);
            return this;
        }

        @NonNull
        public b B(@NonNull id.c cVar) {
            this.f19442e = cVar;
            return this;
        }

        @NonNull
        public b C(int i10, @NonNull id.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        @NonNull
        public b D(@NonNull d dVar) {
            this.b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        @NonNull
        public b E(float f10) {
            this.f19443f = new id.a(f10);
            return this;
        }

        @NonNull
        public b F(@NonNull id.c cVar) {
            this.f19443f = cVar;
            return this;
        }

        @NonNull
        public k m() {
            return new k(this);
        }

        @NonNull
        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        @NonNull
        public b p(@NonNull id.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        @NonNull
        public b q(int i10, @NonNull id.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        @NonNull
        public b r(@NonNull d dVar) {
            this.f19441d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        @NonNull
        public b s(float f10) {
            this.f19445h = new id.a(f10);
            return this;
        }

        @NonNull
        public b t(@NonNull id.c cVar) {
            this.f19445h = cVar;
            return this;
        }

        @NonNull
        public b u(int i10, @NonNull id.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        @NonNull
        public b v(@NonNull d dVar) {
            this.f19440c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        @NonNull
        public b w(float f10) {
            this.f19444g = new id.a(f10);
            return this;
        }

        @NonNull
        public b x(@NonNull id.c cVar) {
            this.f19444g = cVar;
            return this;
        }

        @NonNull
        public b y(int i10, @NonNull id.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        @NonNull
        public b z(@NonNull d dVar) {
            this.f19439a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(@NonNull k kVar) {
            this.f19439a = h.b();
            this.b = h.b();
            this.f19440c = h.b();
            this.f19441d = h.b();
            this.f19442e = new id.a(0.0f);
            this.f19443f = new id.a(0.0f);
            this.f19444g = new id.a(0.0f);
            this.f19445h = new id.a(0.0f);
            this.f19446i = h.c();
            this.f19447j = h.c();
            this.f19448k = h.c();
            this.f19449l = h.c();
            this.f19439a = kVar.f19428a;
            this.b = kVar.b;
            this.f19440c = kVar.f19429c;
            this.f19441d = kVar.f19430d;
            this.f19442e = kVar.f19431e;
            this.f19443f = kVar.f19432f;
            this.f19444g = kVar.f19433g;
            this.f19445h = kVar.f19434h;
            this.f19446i = kVar.f19435i;
            this.f19447j = kVar.f19436j;
            this.f19448k = kVar.f19437k;
            this.f19449l = kVar.f19438l;
        }
    }

    public k() {
        this.f19428a = h.b();
        this.b = h.b();
        this.f19429c = h.b();
        this.f19430d = h.b();
        this.f19431e = new id.a(0.0f);
        this.f19432f = new id.a(0.0f);
        this.f19433g = new id.a(0.0f);
        this.f19434h = new id.a(0.0f);
        this.f19435i = h.c();
        this.f19436j = h.c();
        this.f19437k = h.c();
        this.f19438l = h.c();
    }
}
