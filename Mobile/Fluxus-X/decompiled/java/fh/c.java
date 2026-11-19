package fh;

import android.content.Context;
import bh.j0;
import lk.d;

/* JADX INFO: loaded from: classes2.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16119a;
    public final int b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16120a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f16120a = iArr;
            try {
                iArr[cm.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16120a[cm.a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16120a[cm.a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(Context context) {
        this.f16119a = context.getResources().getColor(j0.f4091n);
        this.b = context.getResources().getColor(j0.f4086i);
    }

    @Override // lk.d
    public int a(cm.a aVar) {
        int i10 = a.f16120a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f16119a;
        }
        if (i10 != 2) {
            return -1;
        }
        return this.b;
    }
}
