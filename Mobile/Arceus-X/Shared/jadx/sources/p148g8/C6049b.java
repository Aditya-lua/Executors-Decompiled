package p148g8;

/* JADX INFO: renamed from: g8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6049b {
    /* JADX INFO: renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m26868a(int i10, TInput tinput, InterfaceC6048a<TInput, TResult, TException> interfaceC6048a, InterfaceC6050c<TInput, TResult> interfaceC6050c) {
        TResult tresultApply;
        if (i10 < 1) {
            return interfaceC6048a.apply(tinput);
        }
        do {
            tresultApply = interfaceC6048a.apply(tinput);
            tinput = interfaceC6050c.mo26869a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresultApply;
    }
}
