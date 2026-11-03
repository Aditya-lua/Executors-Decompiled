package vg;

import android.content.Context;
import rg.j0;

/* JADX INFO: loaded from: classes2.dex */
public class d implements bk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33513a;
    public final int b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33514a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33514a = iArr;
            try {
                iArr[ml.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33514a[ml.a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33514a[ml.a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(Context context) {
        this.f33513a = context.getResources().getColor(j0.f30390p);
        this.b = context.getResources().getColor(j0.f30384j);
    }

    @Override // bk.d
    public int a(ml.a aVar) {
        int i10 = a.f33514a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f33513a;
        }
        if (i10 != 2) {
            return -1;
        }
        return this.b;
    }
}
