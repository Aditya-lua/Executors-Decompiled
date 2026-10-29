package p323o6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p252io.encoding.Base64;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.C7466h0;
import p239k6.InterfaceC7479s;
import p287m6.C8446t;
import p287m6.EnumC8432f;
import p315nt.InterfaceC9557b;
import p537x6.Options;
import p560xu.C12924e;

/* JADX INFO: renamed from: o6.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lo6/g;", "Lo6/j;", "Lk6/h0;", "uri", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "Lk6/h0;", "b", "Lx6/p;", "c", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9699g implements InterfaceC9702j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7466h0 uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: o6.g$b */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lo6/g$b;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC9702j.a<C7466h0> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j; */
        @Override // p323o6.InterfaceC9702j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9702j mo38311a(@NotNull C7466h0 data, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            if (Intrinsics.m31980c(data.getScheme(), "data")) {
                return new C9699g(data, options);
            }
            return null;
        }
    }

    public C9699g(@NotNull C7466h0 c7466h0, @NotNull Options options) {
        this.uri = c7466h0;
        this.options = options;
    }

    @Override // p323o6.InterfaceC9702j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo38310a(@NotNull InterfaceC9557b<? super InterfaceC9701i> interfaceC9557b) {
        int iN0 = StringsKt.m32178n0(this.uri.getData(), ";base64,", 0, false, 6, null);
        if (iN0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        int iM0 = StringsKt.m32176m0(this.uri.getData(), ':', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        String strSubstring = this.uri.getData().substring(iM0 + 1, iN0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bArrM31966f = Base64.m31966f(Base64.INSTANCE, this.uri.getData(), iN0 + 8, 0, 4, null);
        C12924e c12924e = new C12924e();
        c12924e.write(bArrM31966f);
        return new SourceFetchResult(C8446t.m34219c(c12924e, this.options.getFileSystem(), null, 4, null), strSubstring, EnumC8432f.MEMORY);
    }
}
