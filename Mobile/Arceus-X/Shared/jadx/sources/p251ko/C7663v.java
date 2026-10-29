package p251ko;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import p132fn.InterfaceC5690j0;

/* JADX INFO: renamed from: ko.v */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "Lfn/j0$c;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lfn/j0$c;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7663v {

    /* JADX INFO: renamed from: ko.v$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29318a;

        static {
            int[] iArr = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.EnumC3514b.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29318a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5690j0.c m31654b(IdConfig.EnumC3514b enumC3514b) {
        int i10 = a.f29318a[enumC3514b.ordinal()];
        if (i10 != 1 && i10 != 2) {
            return InterfaceC5690j0.c.Back;
        }
        return InterfaceC5690j0.c.Front;
    }
}
