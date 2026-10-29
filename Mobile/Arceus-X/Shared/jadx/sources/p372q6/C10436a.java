package p372q6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4863i0;
import p239k6.C7466h0;
import p537x6.Options;

/* JADX INFO: renamed from: q6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lq6/a;", "Lq6/c;", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "", "b", "(Lk6/h0;Lx6/p;)Ljava/lang/String;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10436a implements InterfaceC10438c<C7466h0> {
    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;)Ljava/lang/String; */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r3v0, 58, (wrap int:INVOKE) */
    @Override // p372q6.InterfaceC10438c
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo40186a(@NotNull C7466h0 data, @NotNull Options options) {
        if (!Intrinsics.m31980c(data.getScheme(), "android.resource")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append(':');
        sb2.append(C4863i0.m23458d(options.getContext().getResources().getConfiguration()));
        return sb2.toString();
    }
}
