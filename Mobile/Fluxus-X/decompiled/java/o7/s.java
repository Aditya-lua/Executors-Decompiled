package o7;

import android.graphics.Paint;
import g7.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26905a;
    public final n7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n7.b> f26906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.a f26907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.d f26908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.b f26909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f26910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f26911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26913j;

    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum b {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return Paint.Join.MITER;
            }
            if (iOrdinal == 1) {
                return Paint.Join.ROUND;
            }
            if (iOrdinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public s(String str, n7.b bVar, List<n7.b> list, n7.a aVar, n7.d dVar, n7.b bVar2, a aVar2, b bVar3, float f10, boolean z10) {
        this.f26905a = str;
        this.b = bVar;
        this.f26906c = list;
        this.f26907d = aVar;
        this.f26908e = dVar;
        this.f26909f = bVar2;
        this.f26910g = aVar2;
        this.f26911h = bVar3;
        this.f26912i = f10;
        this.f26913j = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.t(h0Var, bVar, this);
    }

    public a b() {
        return this.f26910g;
    }

    public n7.a c() {
        return this.f26907d;
    }

    public n7.b d() {
        return this.b;
    }

    public b e() {
        return this.f26911h;
    }

    public List<n7.b> f() {
        return this.f26906c;
    }

    public float g() {
        return this.f26912i;
    }

    public String h() {
        return this.f26905a;
    }

    public n7.d i() {
        return this.f26908e;
    }

    public n7.b j() {
        return this.f26909f;
    }

    public boolean k() {
        return this.f26913j;
    }
}
