package p323o6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4866l;
import p096e7.C4878x;
import p239k6.C7466h0;
import p239k6.InterfaceC7479s;
import p287m6.C8446t;
import p287m6.EnumC8432f;
import p315nt.InterfaceC9557b;
import p537x6.Options;
import p560xu.C12919b0;
import p560xu.C12931h0;

/* JADX INFO: renamed from: o6.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lo6/m;", "Lo6/j;", "Lk6/h0;", "uri", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "Lk6/h0;", "b", "Lx6/p;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9705m implements InterfaceC9702j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7466h0 uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: o6.m$a */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lo6/m$a;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "", "c", "(Lk6/h0;)Z", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9702j.a<C7466h0> {
        /* JADX INFO: renamed from: c */
        private final boolean m38328c(C7466h0 data) {
            return Intrinsics.m31980c(data.getScheme(), "jar:file");
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j; */
        @Override // p323o6.InterfaceC9702j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9702j mo38311a(@NotNull C7466h0 data, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            if (m38328c(data)) {
                return new C9705m(data, options);
            }
            return null;
        }
    }

    public C9705m(@NotNull C7466h0 c7466h0, @NotNull Options options) {
        this.uri = c7466h0;
        this.options = options;
    }

    @Override // p323o6.InterfaceC9702j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo38310a(@NotNull InterfaceC9557b<? super InterfaceC9701i> interfaceC9557b) {
        String path = this.uri.getPath();
        if (path == null) {
            path = "";
        }
        String str = path;
        int iM0 = StringsKt.m32176m0(str, '!', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + this.uri).toString());
        }
        C12931h0.Companion companion = C12931h0.INSTANCE;
        String strSubstring = str.substring(0, iM0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        C12931h0 c12931h0M48135e = C12931h0.Companion.m48135e(companion, strSubstring, false, 1, null);
        String strSubstring2 = str.substring(iM0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        C12931h0 c12931h0M48135e2 = C12931h0.Companion.m48135e(companion, strSubstring2, false, 1, null);
        return new SourceFetchResult(C8446t.m34220d(c12931h0M48135e2, C12919b0.m47962d(this.options.getFileSystem(), c12931h0M48135e), null, null, null, 28, null), C4878x.f19580a.m23500a(C4866l.m23472d(c12931h0M48135e2)), EnumC8432f.DISK);
    }
}
