package p303n7;

import p121f7.C5451h0;
import p121f7.C5452i;
import p121f7.EnumC5453i0;
import p162h7.C6305l;
import p162h7.InterfaceC6296c;
import p324o7.AbstractC9709b;
import p431s7.C11189e;

/* JADX INFO: renamed from: n7.j */
/* JADX INFO: loaded from: classes3.dex */
public class C8904j implements InterfaceC8897c {

    /* JADX INFO: renamed from: a */
    public final String f32473a;

    /* JADX INFO: renamed from: b */
    public final a f32474b;

    /* JADX INFO: renamed from: c */
    public final boolean f32475c;

    /* JADX INFO: renamed from: n7.j$a */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* JADX INFO: renamed from: b */
        public static a m35883b(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public C8904j(String str, a aVar, boolean z10) {
        this.f32473a = str;
        this.f32474b = aVar;
        this.f32475c = z10;
    }

    @Override // p303n7.InterfaceC8897c
    /* JADX INFO: renamed from: a */
    public InterfaceC6296c mo34242a(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b) {
        if (c5451h0.m25005h0(EnumC5453i0.MergePathsApi19)) {
            return new C6305l(this);
        }
        C11189e.m42153c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public a m35879b() {
        return this.f32474b;
    }

    /* JADX INFO: renamed from: c */
    public String m35880c() {
        return this.f32473a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m35881d() {
        return this.f32475c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f32474b + '}';
    }
}
