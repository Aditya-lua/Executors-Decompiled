package wg;

import android.content.Context;
import sg.j0;

/* JADX INFO: loaded from: classes2.dex */
public class d implements dk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34254a;
    public final int b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34255a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f34255a = iArr;
            try {
                iArr[ol.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34255a[ol.a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34255a[ol.a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(Context context) {
        this.f34254a = context.getResources().getColor(j0.f30787p);
        this.b = context.getResources().getColor(j0.f30781j);
    }

    @Override // dk.d
    public int a(ol.a aVar) {
        int i10 = a.f34255a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f34254a;
        }
        if (i10 != 2) {
            return -1;
        }
        return this.b;
    }
}
