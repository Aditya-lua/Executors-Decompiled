package ko;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import fn.j0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "Lfn/j0$c;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lfn/j0$c;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22473a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22473a = iArr;
        }
    }

    public static final j0.c b(IdConfig.b bVar) {
        int i10 = a.f22473a[bVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            return j0.c.Back;
        }
        return j0.c.Front;
    }
}
