package n7;

import android.graphics.Paint;
import f7.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26030a;
    public final m7.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<m7.b> f26031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.a f26032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.d f26033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.b f26034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f26035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f26036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26038j;

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

    public s(String str, m7.b bVar, List<m7.b> list, m7.a aVar, m7.d dVar, m7.b bVar2, a aVar2, b bVar3, float f10, boolean z10) {
        this.f26030a = str;
        this.b = bVar;
        this.f26031c = list;
        this.f26032d = aVar;
        this.f26033e = dVar;
        this.f26034f = bVar2;
        this.f26035g = aVar2;
        this.f26036h = bVar3;
        this.f26037i = f10;
        this.f26038j = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.t(h0Var, bVar, this);
    }

    public a b() {
        return this.f26035g;
    }

    public m7.a c() {
        return this.f26032d;
    }

    public m7.b d() {
        return this.b;
    }

    public b e() {
        return this.f26036h;
    }

    public List<m7.b> f() {
        return this.f26031c;
    }

    public float g() {
        return this.f26037i;
    }

    public String h() {
        return this.f26030a;
    }

    public m7.d i() {
        return this.f26033e;
    }

    public m7.b j() {
        return this.f26034f;
    }

    public boolean k() {
        return this.f26038j;
    }
}
