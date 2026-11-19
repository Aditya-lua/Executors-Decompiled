package p6;

import l6.h0;
import l6.s;
import n6.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.io.encoding.Base64;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lp6/g;", "Lp6/j;", "Ll6/h0;", "uri", "Ly6/p;", "options", "<init>", "(Ll6/h0;Ly6/p;)V", "Lp6/i;", "a", "(Leu/b;)Ljava/lang/Object;", "Ll6/h0;", "b", "Ly6/p;", "c", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp6/g$b;", "Lp6/j$a;", "Ll6/h0;", "<init>", "()V", "data", "Ly6/p;", "options", "Ll6/s;", "imageLoader", "Lp6/j;", "b", "(Ll6/h0;Ly6/p;Ll6/s;)Lp6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements j.a<h0> {
        @Override // p6.j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull h0 data, @NotNull Options options, @NotNull s imageLoader) {
            if (Intrinsics.c(data.getScheme(), "data")) {
                return new g(data, options);
            }
            return null;
        }
    }

    public g(@NotNull h0 h0Var, @NotNull Options options) {
        this.uri = h0Var;
        this.options = options;
    }

    @Override // p6.j
    @Nullable
    public Object a(@NotNull eu.b<? super i> bVar) {
        int iN0 = StringsKt.n0(this.uri.getData(), ";base64,", 0, false, 6, null);
        if (iN0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        int iM0 = StringsKt.m0(this.uri.getData(), ':', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.uri).toString());
        }
        String strSubstring = this.uri.getData().substring(iM0 + 1, iN0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bArrF = Base64.f(Base64.INSTANCE, this.uri.getData(), iN0 + 8, 0, 4, null);
        ew.e eVar = new ew.e();
        eVar.write(bArrF);
        return new SourceFetchResult(t.c(eVar, this.options.getFileSystem(), null, 4, null), strSubstring, n6.f.MEMORY);
    }
}
