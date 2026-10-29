package p516wg;

import android.content.Context;
import dk.InterfaceC4635d;
import p337ol.EnumC9799a;
import sg.C11326j0;

/* JADX INFO: renamed from: wg.d */
/* JADX INFO: loaded from: classes2.dex */
public class C12422d implements InterfaceC4635d {

    /* JADX INFO: renamed from: a */
    public final int f44415a;

    /* JADX INFO: renamed from: b */
    public final int f44416b;

    /* JADX INFO: renamed from: wg.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44417a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f44417a = iArr;
            try {
                iArr[EnumC9799a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44417a[EnumC9799a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44417a[EnumC9799a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C12422d(Context context) {
        this.f44415a = context.getResources().getColor(C11326j0.f39725p);
        this.f44416b = context.getResources().getColor(C11326j0.f39719j);
    }

    @Override // dk.InterfaceC4635d
    /* JADX INFO: renamed from: a */
    public int mo22857a(EnumC9799a enumC9799a) {
        int i10 = a.f44417a[enumC9799a.ordinal()];
        if (i10 == 1) {
            return this.f44415a;
        }
        if (i10 != 2) {
            return -1;
        }
        return this.f44416b;
    }
}
