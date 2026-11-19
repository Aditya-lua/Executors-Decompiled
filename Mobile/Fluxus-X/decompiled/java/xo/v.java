package xo;

import p001kotlin.Metadata;
import sn.w0;
import vo.IdConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvo/d3$e;", "Lsn/w0$c;", "b", "(Lvo/d3$e;)Lsn/w0$c;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36932a;

        static {
            int[] iArr = new int[IdConfig.e.values().length];
            try {
                iArr[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.e.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36932a = iArr;
        }
    }

    public static final w0.c b(IdConfig.e eVar) {
        int i10 = a.f36932a[eVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            return w0.c.Back;
        }
        return w0.c.Front;
    }
}
