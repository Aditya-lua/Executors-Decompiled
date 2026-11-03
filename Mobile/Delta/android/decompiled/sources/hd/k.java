package hd;

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
    public static final hd.c f19330m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f19331a;
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f19332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f19333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hd.c f19334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd.c f19335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hd.c f19336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hd.c f19337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f19338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f19339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f19340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f19341l;

    public interface c {
        @NonNull
        hd.c a(@NonNull hd.c cVar);
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
        return d(context, i10, i11, new hd.a(i12));
    }

    @NonNull
    public static b d(Context context, int i10, int i11, @NonNull hd.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ic.k.f20858i5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(ic.k.f20867j5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(ic.k.f20894m5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(ic.k.f20903n5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(ic.k.f20885l5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(ic.k.f20876k5, i12);
            hd.c cVarM = m(typedArrayObtainStyledAttributes, ic.k.f20912o5, cVar);
            hd.c cVarM2 = m(typedArrayObtainStyledAttributes, ic.k.f20939r5, cVarM);
            hd.c cVarM3 = m(typedArrayObtainStyledAttributes, ic.k.f20948s5, cVarM);
            hd.c cVarM4 = m(typedArrayObtainStyledAttributes, ic.k.f20930q5, cVarM);
            return new b().y(i13, cVarM2).C(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, ic.k.f20921p5, cVarM));
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
        return g(context, attributeSet, i10, i11, new hd.a(i12));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, @NonNull hd.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.f20830f4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ic.k.f20839g4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ic.k.f20848h4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    @NonNull
    public static hd.c m(TypedArray typedArray, int i10, @NonNull hd.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new hd.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    @NonNull
    public f h() {
        return this.f19340k;
    }

    @NonNull
    public d i() {
        return this.f19333d;
    }

    @NonNull
    public hd.c j() {
        return this.f19337h;
    }

    @NonNull
    public d k() {
        return this.f19332c;
    }

    @NonNull
    public hd.c l() {
        return this.f19336g;
    }

    @NonNull
    public f n() {
        return this.f19341l;
    }

    @NonNull
    public f o() {
        return this.f19339j;
    }

    @NonNull
    public f p() {
        return this.f19338i;
    }

    @NonNull
    public d q() {
        return this.f19331a;
    }

    @NonNull
    public hd.c r() {
        return this.f19334e;
    }

    @NonNull
    public d s() {
        return this.b;
    }

    @NonNull
    public hd.c t() {
        return this.f19335f;
    }

    public boolean u(@NonNull RectF rectF) {
        boolean z10 = this.f19341l.getClass().equals(f.class) && this.f19339j.getClass().equals(f.class) && this.f19338i.getClass().equals(f.class) && this.f19340k.getClass().equals(f.class);
        float fA = this.f19334e.a(rectF);
        return z10 && ((this.f19335f.a(rectF) > fA ? 1 : (this.f19335f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19337h.a(rectF) > fA ? 1 : (this.f19337h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19336g.a(rectF) > fA ? 1 : (this.f19336g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof j) && (this.f19331a instanceof j) && (this.f19332c instanceof j) && (this.f19333d instanceof j));
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
    public k x(@NonNull hd.c cVar) {
        return v().p(cVar).m();
    }

    @NonNull
    public k y(@NonNull c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(@NonNull b bVar) {
        this.f19331a = bVar.f19342a;
        this.b = bVar.b;
        this.f19332c = bVar.f19343c;
        this.f19333d = bVar.f19344d;
        this.f19334e = bVar.f19345e;
        this.f19335f = bVar.f19346f;
        this.f19336g = bVar.f19347g;
        this.f19337h = bVar.f19348h;
        this.f19338i = bVar.f19349i;
        this.f19339j = bVar.f19350j;
        this.f19340k = bVar.f19351k;
        this.f19341l = bVar.f19352l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public d f19342a;

        @NonNull
        public d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public d f19343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public d f19344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public hd.c f19345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public hd.c f19346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public hd.c f19347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public hd.c f19348h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public f f19349i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public f f19350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public f f19351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public f f19352l;

        public b() {
            this.f19342a = h.b();
            this.b = h.b();
            this.f19343c = h.b();
            this.f19344d = h.b();
            this.f19345e = new hd.a(0.0f);
            this.f19346f = new hd.a(0.0f);
            this.f19347g = new hd.a(0.0f);
            this.f19348h = new hd.a(0.0f);
            this.f19349i = h.c();
            this.f19350j = h.c();
            this.f19351k = h.c();
            this.f19352l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f19329a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f19280a;
            }
            return -1.0f;
        }

        @NonNull
        public b A(float f10) {
            this.f19345e = new hd.a(f10);
            return this;
        }

        @NonNull
        public b B(@NonNull hd.c cVar) {
            this.f19345e = cVar;
            return this;
        }

        @NonNull
        public b C(int i10, @NonNull hd.c cVar) {
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
            this.f19346f = new hd.a(f10);
            return this;
        }

        @NonNull
        public b F(@NonNull hd.c cVar) {
            this.f19346f = cVar;
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
        public b p(@NonNull hd.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        @NonNull
        public b q(int i10, @NonNull hd.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        @NonNull
        public b r(@NonNull d dVar) {
            this.f19344d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        @NonNull
        public b s(float f10) {
            this.f19348h = new hd.a(f10);
            return this;
        }

        @NonNull
        public b t(@NonNull hd.c cVar) {
            this.f19348h = cVar;
            return this;
        }

        @NonNull
        public b u(int i10, @NonNull hd.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        @NonNull
        public b v(@NonNull d dVar) {
            this.f19343c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        @NonNull
        public b w(float f10) {
            this.f19347g = new hd.a(f10);
            return this;
        }

        @NonNull
        public b x(@NonNull hd.c cVar) {
            this.f19347g = cVar;
            return this;
        }

        @NonNull
        public b y(int i10, @NonNull hd.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        @NonNull
        public b z(@NonNull d dVar) {
            this.f19342a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(@NonNull k kVar) {
            this.f19342a = h.b();
            this.b = h.b();
            this.f19343c = h.b();
            this.f19344d = h.b();
            this.f19345e = new hd.a(0.0f);
            this.f19346f = new hd.a(0.0f);
            this.f19347g = new hd.a(0.0f);
            this.f19348h = new hd.a(0.0f);
            this.f19349i = h.c();
            this.f19350j = h.c();
            this.f19351k = h.c();
            this.f19352l = h.c();
            this.f19342a = kVar.f19331a;
            this.b = kVar.b;
            this.f19343c = kVar.f19332c;
            this.f19344d = kVar.f19333d;
            this.f19345e = kVar.f19334e;
            this.f19346f = kVar.f19335f;
            this.f19347g = kVar.f19336g;
            this.f19348h = kVar.f19337h;
            this.f19349i = kVar.f19338i;
            this.f19350j = kVar.f19339j;
            this.f19351k = kVar.f19340k;
            this.f19352l = kVar.f19341l;
        }
    }

    public k() {
        this.f19331a = h.b();
        this.b = h.b();
        this.f19332c = h.b();
        this.f19333d = h.b();
        this.f19334e = new hd.a(0.0f);
        this.f19335f = new hd.a(0.0f);
        this.f19336g = new hd.a(0.0f);
        this.f19337h = new hd.a(0.0f);
        this.f19338i = h.c();
        this.f19339j = h.c();
        this.f19340k = h.c();
        this.f19341l = h.c();
    }
}
