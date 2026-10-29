package p303n7;

import android.graphics.Paint;
import java.util.List;
import p121f7.C5451h0;
import p121f7.C5452i;
import p162h7.C6313t;
import p162h7.InterfaceC6296c;
import p288m7.C8453a;
import p288m7.C8454b;
import p288m7.C8456d;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: n7.s */
/* JADX INFO: loaded from: classes3.dex */
public class C8913s implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32525a;

    /* JADX INFO: renamed from: b */
    public final C8454b f32526b;

    /* JADX INFO: renamed from: c */
    public final List<C8454b> f32527c;

    /* JADX INFO: renamed from: d */
    public final C8453a f32528d;

    /* JADX INFO: renamed from: e */
    public final C8456d f32529e;

    /* JADX INFO: renamed from: f */
    public final C8454b f32530f;

    /* JADX INFO: renamed from: g */
    public final a f32531g;

    /* JADX INFO: renamed from: h */
    public final b f32532h;

    /* JADX INFO: renamed from: i */
    public final float f32533i;

    /* JADX INFO: renamed from: j */
    public final boolean f32534j;

    /* JADX INFO: renamed from: n7.s$a */
    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        /* JADX INFO: renamed from: b */
        public Paint.Cap m35937b() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: renamed from: n7.s$b */
    public enum b {
        MITER,
        ROUND,
        BEVEL;

        /* JADX INFO: renamed from: b */
        public Paint.Join m35939b() {
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

    public C8913s(String str, C8454b c8454b, List<C8454b> list, C8453a c8453a, C8456d c8456d, C8454b c8454b2, a aVar, b bVar, float f10, boolean z10) {
        this.f32525a = str;
        this.f32526b = c8454b;
        this.f32527c = list;
        this.f32528d = c8453a;
        this.f32529e = c8456d;
        this.f32530f = c8454b2;
        this.f32531g = aVar;
        this.f32532h = bVar;
        this.f32533i = f10;
        this.f32534j = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        return new C6313t(c5451h0, abstractC9709b, this);
    }

    /* JADX INFO: renamed from: b */
    public a m35926b() {
        return this.f32531g;
    }

    /* JADX INFO: renamed from: c */
    public C8453a m35927c() {
        return this.f32528d;
    }

    /* JADX INFO: renamed from: d */
    public C8454b m35928d() {
        return this.f32526b;
    }

    /* JADX INFO: renamed from: e */
    public b m35929e() {
        return this.f32532h;
    }

    /* JADX INFO: renamed from: f */
    public List<C8454b> m35930f() {
        return this.f32527c;
    }

    /* JADX INFO: renamed from: g */
    public float m35931g() {
        return this.f32533i;
    }

    /* JADX INFO: renamed from: h */
    public String m35932h() {
        return this.f32525a;
    }

    /* JADX INFO: renamed from: i */
    public C8456d m35933i() {
        return this.f32529e;
    }

    /* JADX INFO: renamed from: j */
    public C8454b m35934j() {
        return this.f32530f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m35935k() {
        return this.f32534j;
    }
}
